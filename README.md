# Ports

Map any port in your local machine to port container's default exposed port of 8080.

# URLs

The application will run from the root (no context path) 

# VARIABLES

## Usage

*docker build -t bootcamp5 --build-arg ARTIFACT_NAME=bootcamp-demo.jar --build-arg CR=myapp .*

**ARTIFACT_NAME** : Sets the name of the .jar file that will be generated. .jar extension is required. 

**CR** : Context Root : Sets the application context root (not functional)

# Docker Repository

https://hub.docker.com/repository/docker/vhernan61/bootcamp