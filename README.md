mesos-pinspider
===============

A framework called "pinspider" on Apache mesos, to get basic user information
from a pinterest page of a user.

Getting Started
---------------

- Download mesos v0.21.0 and start the master and the slave on localhost.
- Java Pinspider Framework
```
$ git clone https://github.com/GITHUB_USERNAME/mesos-pinspider.git
$ cd pinspider
$ mvn clean compile assembly:single
$ java -cp pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar com.geekz.anon.PinDriver 127.0.0.1:5050 
<or>
$java -cp pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar com.geekz.anon.PinDriver 127.0.0.1:5050 10 http://www.pinterest.com/SwathiMystery
```
- [Web UI Mesos](http://127.0.0.1:5050/#/frameworks) and click on "Pinspider Framework"

Sample output:
```
{
  "bio": "Breaking technology news, analysis, and opinions from TechCrunch. Your number guide for all things tech.",
  "website": "http://techcrunch.com/",
  "boardsCount": "19",
  "facebook": "",
  "twitter": "http://twitter.com/TechCrunch",
  "followersCount": "56,312",
  "followingCount": "0",
  "noOfLikes": "102",
  "location": "San Francisco, CA",
  "name": "TechCrunch",
  "pinsCount": "751"
}
```
