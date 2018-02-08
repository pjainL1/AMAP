# Centos based container with Java and Tomcat
FROM centos:centos7
MAINTAINER pjainL1

# Install prepare infrastructure
RUN yum -y update && \
 yum -y install wget && \
 yum -y install tar

# Prepare environment
ENV JAVA_HOME /opt/java
ENV CATALINA_HOME /opt/tomcat
ENV PATH $PATH:$JAVA_HOME/bin:$CATALINA_HOME/bin:$CATALINA_HOME/scripts

# Install Oracle Java8
ENV JAVA_VERSION 7u80
ENV JAVA_BUILD 7u80-b15
# ENV JAVA_DL_HASH 090f390dda5b47b9b721c7dfaa008135

#RUN wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" \
 #http://download.oracle.com/otn-pub/java/jdk/${JAVA_BUILD}/jdk-${JAVA_VERSION}-linux-x64.tar.gz && \
 #tar -xvf jdk-${JAVA_VERSION}-linux-x64.tar.gz && \
# rm jdk*.tar.gz && \
 #mv jdk* ${JAVA_HOME}
RUN yum install -y java-1.7.0-openjdk

# Install Tomcat
ENV TOMCAT_MAJOR 7
ENV TOMCAT_VERSION 7.0.82

RUN (wget -O /tmp/tomcat7.tar.gz http://archive.apache.org/dist/tomcat/tomcat-7/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
  cd /opt && \
  tar zxf /tmp/tomcat7.tar.gz && \
  mv /opt/apache-tomcat* /opt/tomcat && \
  rm /tmp/tomcat7.tar.gz)

RUN chmod +x ${CATALINA_HOME}/bin/*sh

# Create Tomcat admin user
ADD create_admin_user.sh $CATALINA_HOME/scripts/create_admin_user.sh
ADD tomcat.sh $CATALINA_HOME/scripts/tomcat.sh
RUN chmod +x $CATALINA_HOME/scripts/*.sh

# Create tomcat user
RUN groupadd -r tomcat && \
 useradd -g tomcat -d ${CATALINA_HOME} -s /sbin/nologin  -c "Tomcat user" tomcat && \
 chown -R tomcat:tomcat ${CATALINA_HOME}

WORKDIR /opt/tomcat

EXPOSE 8080
EXPOSE 8009

USER tomcat
#CMD ["tomcat.sh"]
CMD ["/bin/bash"]
