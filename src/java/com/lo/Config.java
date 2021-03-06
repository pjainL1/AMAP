package com.lo;

import java.util.HashSet;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jduchesne
 */
public class Config extends AbstractConfig {
    private static final com.spinn3r.log5j.Logger LOGGER = com.spinn3r.log5j.Logger.getLogger();

    private static Config instance = new Config(null);

    public static Config getInstance() {
        return instance;
    }

    public static final String KEY_HAS_BUTTONMORE = "hasButtonMore";
    private static final String KEY_GOOGLE = "google.maps.client";
    private static final String SIGNATURE_GOOGLE = "google.maps.signature";
    private Map<String, Set<String>> columns;
    private Map<String, String> displayNames;
    private String amapBaseUrl;
    private String kmsBaseUrl;
    private String spectrumBaseUrl;
    private String spectrumUsername;
    private String spectrumPassword;
    private Boolean isLoadFile;
    private String amap_env;
    private Map<String, Boolean> hasButtonMore;
    private String googleKey;
    private String googleSignature;
    private static final String LEGEND_URL = "%s/app/tools.legend.server./GetLegendImage?layerID=%s&mapInstanceKey=%s";
    private static final Integer[] driveDistances = new Integer[]{0, 2, 5, 10, 15, 25, 30, 50};
    private String mipool;
    private PropertyResourceBundle prb;

    private Config(String path) {
        super(path);
    }

    @Override
    protected void init(PropertyResourceBundle prb, Context context) {
        try {
            this.prb = prb;
            try {
                amapBaseUrl = (String) context.lookup("amap/baseURL");
            } catch (Exception e) {
                Logger.getLogger(Config.class.getName())
                    .log(Level.WARNING, "amap/baseURL is not configured.");
            }
            kmsBaseUrl = (String) context.lookup("kms/url");
            spectrumBaseUrl = (String) context.lookup("spectrum/url");
            spectrumUsername = (String) context.lookup("spectrum/username");
            spectrumPassword = (String) context.lookup("spectrum/password");
            mipool = (String) context.lookup("mipool");
            isLoadFile = (Boolean) context.lookup("loadFile");
            try {
                amap_env = (String) context.lookup("amap_env");
            } catch (Exception ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(Config.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        googleKey = getContextString(context, KEY_GOOGLE);
        googleSignature = getContextString(context, SIGNATURE_GOOGLE);
    }

    
    
    public static String getBaseUrl(HttpServletRequest req) {
        String baseUrl = com.lo.Config.getInstance().getAmapBaseUrl();
        if (baseUrl != null && !baseUrl.isEmpty()) {
            return baseUrl;
        }

        String constructedUrl = req.getScheme()+"://"+req.getHeader("HOST")+req.getContextPath()+"/"; 
        LOGGER.info(String.format("A-Map base URL not set in context configuration. Using auto-constructed URL: %s", constructedUrl));
        
        return constructedUrl;
    }

    /**
     *
     * @param Key
     * @return
     */
    public String getString(String Key) {
        return prb.getString(Key);
    }

    public String getDisplayName(String tableName) {
        return displayNames.get(tableName.toLowerCase());
    }

    public boolean hasButtonMore(String table) {
        table = table.toLowerCase();
        return hasButtonMore.containsKey(table) && hasButtonMore.get(table);
    }

    public boolean tableExists(String table) {
        return columns.containsKey(table.toLowerCase());
    }

    public boolean isColumnExcluded(String table, String column) {
        return columns.get(table.toLowerCase()).contains(column.toLowerCase());
    }

    public String getKmsUrl() {
        return kmsBaseUrl;
    }

    public String getLegendUrl(String layerId, String mapInstanceKey) {
        return String.format(LEGEND_URL, getKmsUrl(), layerId, mapInstanceKey);
    }

    public Set<String> getColumns(String tableName) {
        Set<String> result = columns.get(tableName.toLowerCase());
        return (result == null) ? new HashSet<String>() : result;
    }

    public String getGoogleKey() {
        return this.googleKey;
    }

    public String getGoogleSignature() {
        return this.googleSignature;
    }

    public String getSpectrumBaseUrl() {
        return spectrumBaseUrl;
    }

    public String getSpectrumUsername() {
        return spectrumUsername;
    }

    public String getSpectrumPassword() {
        return spectrumPassword;
    }

    public Integer[] getDriveDistances() {
        return driveDistances;
    }

    public String getMipool() {
        return mipool;
    }

    public Boolean isLoadFile() {
        return isLoadFile;
    }

    public String getAmap_env() {
        return amap_env;
    }

    public void setAmap_env(String amap_env) {
        this.amap_env = amap_env;
    }

    public String getAmapBaseUrl() {
        return amapBaseUrl;
    }
}
