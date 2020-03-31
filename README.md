# CDK Test Application

## Useful commands

* `mvn package`     compile and run tests
* `cdk ls`          list all stacks in the app
* `cdk synth`       emits the synthesized CloudFormation template
* `cdk deploy`      deploy this stack to your default AWS account/region
* `cdk diff`        compare deployed stack with current state
* `cdk docs`        open CDK documentation

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Links

[CDK workshop]( https://cdkworkshop.com/ )

[CDK reference]( https://docs.aws.amazon.com/cdk/api/latest/ )

[CDK Samples](
https://github.com/aws-samples/aws-cdk-examples
)

## Log

### Install AWS CLI

[Install the AWS CLI](https://docs.aws.amazon.com/cli/latest/userguide/install-cliv2.html )

```bash
$ aws --version
aws-cli/2.0.5 Python/3.7.5 Windows/10 botocore/2.0.0dev9
```

### Install Node

```bash
$ node --version
v12.16.1
```

### Install CDK

```bash
$ npm install -g aws-cdk
$ cdk --version
1.31.0 (build 8f3ac79)
```

### Install Maven

[Download Maven]( https://maven.apache.org/download.cgi )

* Unzip apache-maven-3.6.3-bin.zip

  A directory called "apache-maven-3.x.y" will be created.

* Add the bin directory to your PATH, e.g.:

  Unix-based operating systems (Linux, Solaris and Mac OS X): `export PATH=/usr/local/apache-maven-3.x.y/bin:$PATH`  
  Windows:  
    `set PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%`
* Make sure JAVA_HOME is set to the location of your JDK 
* Run "mvn --version" to verify that it is correctly installed.  
  [Complete documentation]( https://maven.apache.org/download.html#Installation )
  
### Initialize the CDK application

```bash
mkdir testinfra && cd testinfra
cdk init app --language java
```

The `cdk.json` file tells the CDK Toolkit how to execute your app.

Import into IntelliJ 

Build application

```bash
cdk synth
```