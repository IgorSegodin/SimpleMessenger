Docker commands:

# Build registry container
docker build -t service-registry -f backend/service-registry/Dockerfile ./backend/service-registry

# Start service-registry container
docker run -d -p 50301:50301 service-registry

# List running containers
docker container ls

# Stop running container
docker stop <id>

# Detailed log for commands execution
docker events &

# Stop all containers with image name
docker stop $(docker ps -a -q --filter ancestor=<image-name>)

# Delete containers
docker rm $(docker ps -q -f status=exited)

# Delete image
docker rmi <image-id>