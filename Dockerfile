# Use the official Tomcat image from the Docker Hub
FROM tomcat:9.0

# Copy the WAR file to the webapps directory
COPY target/Maven_Jenkins_App-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

# Expose the port that Tomcat runs on
EXPOSE 8080

# Optional: Set environment variables (e.g., JAVA_OPTS)
ENV JAVA_OPTS="-Xms512m -Xmx1024m"

# Start Tomcat
CMD ["catalina.sh", "run"]
