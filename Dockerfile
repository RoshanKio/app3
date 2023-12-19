# Use the official Tomcat base image
FROM tomcat:latest

# Copy your war file into the webapps directory of Tomcat
COPY app2.war /usr/local/tomcat/webapps/

# Optionally, you can expose the default Tomcat port
EXPOSE 8080

# Start Tomcat, when the container starts
CMD ["catalina.sh", "run"]