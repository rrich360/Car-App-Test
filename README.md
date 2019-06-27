# Car-App-Test


This is a test to examine comprehension skills in building an application based upon employers’ instructions for design and purpose. In the following steps you will see the output for each scenario : 




/**
 Step 1:

* Create two(2) or more car implementations and add those
* cars to the car lot.  After building out the lot, print the inventory
* of the lot utilizing Java 8 streams to include all relevant attributes 
* of the vehicles (make/model/year).  At least 1 of the new cars must 
* be model year 2016 or later.
 */



Output for two(2) or more car implementations in the car lot : 


![1 0](https://user-images.githubusercontent.com/20470279/60304460-89f70980-9907-11e9-97cd-77ab18bace2a.JPG)



This output displays the Inventory method being run from the main method in the CarTest class : 





![1 1](https://user-images.githubusercontent.com/20470279/60304464-8c596380-9907-11e9-8a7d-5b43f110a91e.JPG)






Output for the inventory of the lot utilizing Stream API to include attributes of each car (make/model/year) : 




![1 2](https://user-images.githubusercontent.com/20470279/60304562-cb87b480-9907-11e9-828a-1db03cafcc66.JPG)



		
		

/**
Step 2:
 * 
 * Create a filter predicate to only print out new cars and print those cars
*/
		


Output for filtering through inventory stream displaying only cars manufactured 2016 or newer :


This code displays the method for the filter predicate to be invoked : 		


![2 0](https://user-images.githubusercontent.com/20470279/60304688-24efe380-9908-11e9-9473-1e67ffcfa68e.JPG)


This code shows the filter method being called from inside of the main method of CarTest Class :


![2 1-from-the-main()](https://user-images.githubusercontent.com/20470279/60304692-27ead400-9908-11e9-85b3-6b9d325cf32f.JPG)


This is the actual result of the filter method created :


![2 2](https://user-images.githubusercontent.com/20470279/60304707-2e794b80-9908-11e9-9561-3d4f87f9d608.JPG)









/**
 Step 3:
	           
* - Create Engine / Headlights / Stereo components.
* - Modify the vehicle creation to pass in instances of each component for each car.      
	
* - Finish building out the turn-on/turn-off function to send a command to each      component and print out a message indicating each component has turned on or off 
         	 		e.x. "Engine has started".
* - Make sure to add error and exception handling if attempting to start a vehicle that's already started or stop one that's already stopped.
	 
* - Invoke the turn on and turn off method for each car in the lot, printing all
  status to the console.
* @param String
*/		


Output for list of modified cars with instances of each component passed into each car including a Boolean method to start or turn off the car (The boolean method to start each vehicle is circled in red): 

![3 0-Turn-onTurn-off](https://user-images.githubusercontent.com/20470279/60304972-09390d00-9909-11e9-9178-079e33b69c2e.JPG)


The following picture is the result :

![3 1](https://user-images.githubusercontent.com/20470279/60304978-0b9b6700-9909-11e9-94db-65bfe9a39c64.JPG)


Output for the turn/turn-off function to send a command to each component. I used the If-conditional statement for each component with enums included:

-	PICTURE 3.2
-	PICTURE 3.3
-	PICTURE 3.4
-	PICTURE 3.5
-	PICTURE 3.6
-	PICTURE 3.7




Output for handling errors and exceptions if attempting to start a vehicle that has already started or turn-off a vehicle that’s already stopped : 


-	PICTURE  3.8
-	PICTURE 3.9
-	PICTURE 4.0




Output for invoking the turn on and turn off method for each car in the lot : 

-	PICTURE 4.1
-	PICTURE 4.2
-	PICTURE 4.3
