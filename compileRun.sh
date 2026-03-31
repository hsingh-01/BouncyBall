#!/bin/bash
javac -d build Main/*.java Listener/*.java Class/*.java 
java -cp build Main.GrapplePlatformer 
