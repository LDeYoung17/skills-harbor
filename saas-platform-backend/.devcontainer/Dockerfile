FROM mcr.microsoft.com/devcontainer/java:17

# Install PostgreSQL client
RUN apt-get update && apt-get install -y postgresql-client && apt-get clean

# Set working directory
WORKDIR /workspace