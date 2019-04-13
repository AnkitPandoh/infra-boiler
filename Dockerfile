FROM alpine:latest
RUN apk update && apk add maven:latest && apk add nodejs
