--------------------------------------------------------
--  DDL for Table UNIVERSE
--------------------------------------------------------

  CREATE TABLE "UNIVERSE" 
   (	"ID" NUMBER, 
	"COLLECTOR_KEY" NUMBER(*,0), 
	"SPONSOR_KEY" NUMBER(*,0), 
	"SPONSOR_LOCATION" NUMBER(*,0), 
	"TRANSACTION_DATE" DATE, 
	"SPEND" NUMBER(10,2), 
	"COUNT" NUMBER(*,0), 
	"DISTANCE" NUMBER(7,3), 
	"ACTUAL_DISTANCE" NUMBER, 
	"LONGITUDE" NUMBER(15,10), 
	"LATITUDE" NUMBER(15,10), 
	"GEOM" "MDSYS"."SDO_GEOMETRY" , 
	"DA" CHAR(8 CHAR), 
	"FSA" CHAR(3 CHAR), 
	"ISNEW" NUMBER(*,0), 
	"UNIT" NUMBER DEFAULT 1
   );
  CREATE INDEX "UNIVERSE_COORDS_I" ON "UNIVERSE" ("LONGITUDE", "LATITUDE") ;

  CREATE INDEX "UNIVERSE_INFOTOOL_IDX" ON "UNIVERSE" ("FSA", "SPONSOR_KEY", "TRANSACTION_DATE");
  CREATE INDEX "UNIVERSE_LOC_IDX" ON "UNIVERSE" ("SPONSOR_LOCATION");
  CREATE INDEX "UNIVERSE_SUBSELECT_IDX" ON "UNIVERSE" ("SPONSOR_LOCATION", "SPONSOR_KEY", "TRANSACTION_DATE") ;
  CREATE INDEX "UNIVERSE_INFO_IDX" ON "UNIVERSE" ("LONGITUDE", "LATITUDE", "SPONSOR_KEY", "TRANSACTION_DATE", "SPONSOR_LOCATION", "COLLECTOR_KEY", "DISTANCE", "ACTUAL_DISTANCE", "SPEND");
  --CREATE INDEX "UNIVERSE_GEOM_IDX" ON "UNIVERSE" ("GEOM") INDEXTYPE IS "MDSYS"."SPATIAL_INDEX" ;
  -- in timber_spatial.txt
  ALTER TABLE "UNIVERSE" MODIFY ("ISNEW" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("FSA" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("DA" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("LATITUDE" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("LONGITUDE" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("COUNT" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("TRANSACTION_DATE" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("SPONSOR_LOCATION" NOT NULL ENABLE);
  ALTER TABLE "UNIVERSE" MODIFY ("COLLECTOR_KEY" NOT NULL ENABLE);

--------------------------------------------------------
--  DDL for Table TXN
--------------------------------------------------------

  CREATE TABLE "TXN" 
   (	"COLLECTOR_KEY" NUMBER(*,0), 
	"SPONSOR_KEY" NUMBER(*,0), 
	"SPONSOR_LOCATION" NUMBER(*,0), 
	"TRANSACTION_DATE" DATE, 
	"SPEND" NUMBER(10,2), 
	"DISTANCE" NUMBER(7,3), 
	"EXTRACT_TIME" DATE, 
	"NEW" NUMBER(*,0) DEFAULT 1, 
	"COUNT" NUMBER(*,0), 
	"UNIT" NUMBER DEFAULT 1
   );
  CREATE INDEX "TXN_SEARCH_IDX" ON "TXN" ("NEW", "TRANSACTION_DATE");
  CREATE UNIQUE INDEX "TXN_UK1" ON "TXN" ("COLLECTOR_KEY", "SPONSOR_KEY", "SPONSOR_LOCATION", "TRANSACTION_DATE", "EXTRACT_TIME");
  ALTER TABLE "TXN" MODIFY ("EXTRACT_TIME" NOT NULL ENABLE);
  ALTER TABLE "TXN" MODIFY ("TRANSACTION_DATE" NOT NULL ENABLE);
  ALTER TABLE "TXN" MODIFY ("SPONSOR_LOCATION" NOT NULL ENABLE);
  ALTER TABLE "TXN" MODIFY ("SPONSOR_KEY" NOT NULL ENABLE);
  ALTER TABLE "TXN" MODIFY ("COLLECTOR_KEY" NOT NULL ENABLE);
  ALTER TABLE "TXN" ADD CONSTRAINT "TXN_UK1" UNIQUE ("COLLECTOR_KEY", "SPONSOR_KEY", "SPONSOR_LOCATION", "TRANSACTION_DATE", "EXTRACT_TIME");
  ALTER TABLE "TXN" MODIFY ("COUNT" NOT NULL ENABLE);
  ALTER TABLE "TXN" MODIFY ("NEW" NOT NULL ENABLE);

--------------------------------------------------------
--  DDL for Table PROPERTIES
--------------------------------------------------------

  CREATE TABLE "PROPERTIES" 
   (	"NAME" VARCHAR2(64 CHAR), 
	"VALUE" VARCHAR2(1024 CHAR)
   );
  CREATE UNIQUE INDEX "PROPERTIES_PK" ON "PROPERTIES" ("NAME");
  ALTER TABLE "PROPERTIES" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "PROPERTIES" ADD CONSTRAINT "PROPERTIES_PK" PRIMARY KEY ("NAME");

--------------------------------------------------------
--  DDL for Table NWATCH
--------------------------------------------------------

  CREATE TABLE "NWATCH" 
   (	"DA" CHAR(8 CHAR), 
	"SPONSOR_KEY" NUMBER(*,0), 
	"SPONSOR_LOCATION" NUMBER(*,0), 
	"TRANSACTION_DATE" DATE, 
	"TOTAL_SPEND" NUMBER, 
	"TRANSACTION_COUNT" NUMBER, 
	"ISNEW" NUMBER(*,0), 
	"TOTAL_UNIT" NUMBER
   );
  CREATE INDEX "NWATCH_IDX" ON "NWATCH" ("SPONSOR_KEY", "SPONSOR_LOCATION", "TRANSACTION_DATE");
  ALTER TABLE "NWATCH" MODIFY ("TRANSACTION_DATE" NOT NULL ENABLE);
  ALTER TABLE "NWATCH" MODIFY ("SPONSOR_LOCATION" NOT NULL ENABLE);
  ALTER TABLE "NWATCH" MODIFY ("DA" NOT NULL ENABLE);

--------------------------------------------------------
--  DDL for Table HOTSPOT_SPONSOR
--------------------------------------------------------
CREATE TABLE HOTSPOT_SPONSOR
(
  SPONSOR_KEY NUMBER(*, 0) NOT NULL 
, TRANSACTION_DATE DATE NOT NULL 
, LONGITUDE NUMBER NOT NULL 
, LATITUDE NUMBER NOT NULL 
, SUM NUMBER 
, COLLECTOR_KEY NUMBER(10, 0) NOT NULL 
, UNIT_SUM NUMBER 
, TRANSACTION_COUNT NUMBER 
, CONSTRAINT HOTSPOT_SPONSOR_PKI PRIMARY KEY 
  (SPONSOR_KEY , LONGITUDE , LATITUDE , TRANSACTION_DATE , COLLECTOR_KEY )
) ORGANIZATION INDEX;

CREATE TABLE HOTSPOT_LOCATION (	
  "SPONSOR_LOCATION" NUMBER(*,0) NOT NULL ENABLE, 
	"TRANSACTION_DATE" DATE NOT NULL ENABLE, 
	"LONGITUDE" NUMBER NOT NULL ENABLE, 
	"LATITUDE" NUMBER NOT NULL ENABLE, 
	"SUM" NUMBER, 
	"COLLECTOR_KEY" NUMBER(10,0) NOT NULL ENABLE, 
	"SPONSOR_KEY" NUMBER(*,0) NOT NULL ENABLE, 
	"UNIT_SUM" NUMBER, 
	"TRANSACTION_COUNT" NUMBER, 
	 CONSTRAINT "HOTSPOT_LOCATION_PKI" PRIMARY KEY ("SPONSOR_KEY", "SPONSOR_LOCATION", "LONGITUDE", "LATITUDE", "TRANSACTION_DATE", "COLLECTOR_KEY")
)
ORGANIZATION INDEX;

