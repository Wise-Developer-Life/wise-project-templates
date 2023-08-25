# WhyTalk-Sprint-Boot-Template
Write Project Description Here

### Usage
1. Clone this repository
2. Change your project name in settings.gradle and application.yaml 
3. refactor application folder and class
4. Customize your dependency
5. Set up application.yaml & docker-compose.yaml


### Spotless
1. Check coding style
	```shell
	./gradlew spotlessCheck
	```
2. Apply coding style
	```shell
	./gradlew spotlessApply
	```
 
### Swagger
1. Generate swagger.json in build/docs
	```shell
	./gradlew clean generateOpenApiDocs
	```
