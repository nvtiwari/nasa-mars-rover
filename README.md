## Nasa-mars-rover-photos:
This is a fully-functional NASA-Rover Photo Print Application to display daily images from NASA MARS Curiosity rover. This application gets images for the last 10 days with the limitation of MAX-3 Images per day. The output of application is a JSON format where the application prints URL of mars images from last 10 days with image size limit of 3 per days.

## Audience:
This project is targeted at people with or without Maven experience.

## Nasa.rover.module and Maven as project object model::
To build this project please follow the below steps:
1. Download and unpack the latest version of Maven from Apache Maven Home Page: https://maven.apache.org/download.cgi
2. Follow installation instructions available on https://maven.apache.org/install.html and include the mvn command in your system path.
3. Check and assert sure you have the latest version of Java 1.8 JDK (NOT JRE please).
4. Run mvn clean install to compile your project and store jar file in the target directory.
5. Use your preferred IDE i.e. Eclipse or IntelliJ for code navigation and execution.


## Common Maven Commands: 
* mvn compile: It will compile the code of the application along with tests.
* mvn test: it will test application code and will tell if there are any errors.
* mvn install: it will execute tests and install the library in the local maven repository sitting under the .m2 folder.

## Compile/Run the Project:
```
mvn install 
// Program Main class i.e. RoverPhotoApplication sits under the package gov.nasa.rover.modules.photo.main
Download source-code in eclipse workspace and Run As -> Java Application to get the desired output.
```

## Sample Application Output:
Following is the current sample output JSON that gets the navigation camera images from the curiosity rover from the last 10 days and limit the number of
images to 3 per day. If there are no images for a particular day the result for that day is empty. 
```
{"2021-01-10":[],"2021-01-09":[],"2021-01-08":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386551EDR_F0842352NCAM00354M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386519EDR_F0842352NCAM00354M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386487EDR_F0842352NCAM00354M_.JPG"],"2021-01-07":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663302560EDR_F0842120NCAM00320M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663301923EDR_F0842120NCAM00207M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663292297EDR_F0842120NCAM00207M_.JPG"],"2021-01-06":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NLB_663193930EDR_F0842120NCAM00207M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NLB_663193532EDR_F0842120NCAM00207M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NRB_663197909EDR_F0842120NCAM00560M_.JPG"],"2021-01-05":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663124653EDR_F0842120NCAM00565M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663124542EDR_F0842120NCAM00320M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663123796EDR_F0842120NCAM00207M_.JPG"],"2021-01-04":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017128EDR_F0842120NCAM00354M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017088EDR_F0842120NCAM00354M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017049EDR_F0842120NCAM00354M_.JPG"],"2021-01-03":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NLB_662922152EDR_F0842044NCAM00320M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NRB_662944847EDR_F0842044NCAM00543M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NRB_662944814EDR_F0842044NCAM00543M_.JPG"],"2021-01-02":["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662860359EDR_F0842044NCAM00320M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662859993EDR_F0842044NCAM00207M_.JPG","https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662859321EDR_F0842044NCAM00207M_.JPG"],"2021-01-01":[]}
```
NOTE: You need to pretty print/lint the current application output using https://jsonlint.com/
In subsequent commits this application will be enhanced to pretty print output, if requetesed.
```
{
	"2021-01-10": [],
	"2021-01-09": [],
	"2021-01-08": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386551EDR_F0842352NCAM00354M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386519EDR_F0842352NCAM00354M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386487EDR_F0842352NCAM00354M_.JPG"],
	"2021-01-07": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663302560EDR_F0842120NCAM00320M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663301923EDR_F0842120NCAM00207M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02994/opgs/edr/ncam/NLB_663292297EDR_F0842120NCAM00207M_.JPG"],
	"2021-01-06": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NLB_663193930EDR_F0842120NCAM00207M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NLB_663193532EDR_F0842120NCAM00207M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02993/opgs/edr/ncam/NRB_663197909EDR_F0842120NCAM00560M_.JPG"],
	"2021-01-05": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663124653EDR_F0842120NCAM00565M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663124542EDR_F0842120NCAM00320M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02992/opgs/edr/ncam/NLB_663123796EDR_F0842120NCAM00207M_.JPG"],
	"2021-01-04": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017128EDR_F0842120NCAM00354M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017088EDR_F0842120NCAM00354M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02991/opgs/edr/ncam/NLB_663017049EDR_F0842120NCAM00354M_.JPG"],
	"2021-01-03": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NLB_662922152EDR_F0842044NCAM00320M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NRB_662944847EDR_F0842044NCAM00543M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02990/opgs/edr/ncam/NRB_662944814EDR_F0842044NCAM00543M_.JPG"],
	"2021-01-02": ["https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662860359EDR_F0842044NCAM00320M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662859993EDR_F0842044NCAM00207M_.JPG", "https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02989/opgs/edr/ncam/NLB_662859321EDR_F0842044NCAM00207M_.JPG"],
	"2021-01-01": []
}

```

## Issue/Suggestion/Feedback?
Please shoot an email or raise an issue-tracker. Great suggestions with a virtual coffee is highly appreciated. :)

## Fun - Sample Program O/P Image from Jan 8, 2021:
![Latest Image from January 8, 2020](https://mars.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/02995/opgs/edr/ncam/NLB_663386551EDR_F0842352NCAM00354M_.JPG)
