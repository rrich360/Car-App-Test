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



This is the lambda syntax I used for streaming the output for two(2) or more car implementations in the car lot 
list : 


![1 0](https://user-images.githubusercontent.com/20470279/60304460-89f70980-9907-11e9-97cd-77ab18bace2a.JPG)



In the picture below you see the variable argument constructor(varargs) I used to create the Inventory list called "assemblyline". The list of cars in the main method of the CarTest class prints out using the Stream code from the showInventory() in the Inventory class : 





![1 1](https://user-images.githubusercontent.com/20470279/60304464-8c596380-9907-11e9-8a7d-5b43f110a91e.JPG)






The following picture is the output of the inventory list after calling the showInventory() from the main method in CarTest. "Inventory.showInventory(assemblyLine)" prints the list with the attributes of each car (make/model/year) : 




![1 2](https://user-images.githubusercontent.com/20470279/60304562-cb87b480-9907-11e9-828a-1db03cafcc66.JPG)



		
		

/**
Step 2:
 * 
 * Create a filter predicate to only print out new cars and print those cars
*/
		


Now, I used a predicate to traverse through the inventory list and filter only cars manufactured from 2016 or newer.
The code you see below is what I used to successfully invoke the predicate method with the Stream API : 		


![2 0](https://user-images.githubusercontent.com/20470279/60304688-24efe380-9908-11e9-9473-1e67ffcfa68e.JPG)


This picture shows the filter method being called from inside of the main method of CarTest Class :


![2 1-from-the-main()](https://user-images.githubusercontent.com/20470279/60304692-27ead400-9908-11e9-85b3-6b9d325cf32f.JPG)


This is the actual output after invoking the predicate method to filter through the Inventory list and print cars with the year of 2016
or newer :


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





The following is the code to create the command signals for each component and car in the lot :

![3 2 2-Enums](https://user-images.githubusercontent.com/20470279/60424697-e46dbf80-9bbe-11e9-9f8a-d76e543074d4.JPG)








The following example is the Enums being called from the main method inside of the CarTest Class:

![3 3-EnumFromMain()](https://user-images.githubusercontent.com/20470279/60305112-8e242680-9909-11e9-8752-fa856b6ea414.JPG)







The following is the prompt for the user to enter a command for the engine component of the vehicle : 

![3 4](https://user-images.githubusercontent.com/20470279/60305119-941a0780-9909-11e9-91df-c08e5dd285fe.JPG)








The following is the prompt for the user to enter a command for the headlights component of the vehicle :

![3 6 1](https://user-images.githubusercontent.com/20470279/60425505-a7a2c800-9bc0-11e9-8f43-282fa5e34747.JPG)








The following is the prompt for the user to enter a command for the Stereo component of the vehicle :

![3 6](https://user-images.githubusercontent.com/20470279/60305127-9a0fe880-9909-11e9-9453-f00182ba988b.JPG)






The following is the result of all commands input from the user : 

![3 7 1](https://user-images.githubusercontent.com/20470279/60424829-2991f180-9bbf-11e9-8f97-07a0e6f170be.JPG)





Output for handling errors and exceptions if attempting to start a vehicle that has already started or turn-off a vehicle that’s already stopped : 

![3 8](https://user-images.githubusercontent.com/20470279/60305446-8e70f180-990a-11e9-9947-90de0b99cefb.JPG)


![3 9_LI](https://user-images.githubusercontent.com/20470279/60305449-8fa21e80-990a-11e9-8a3f-4638c1900ea5.jpg)


![4 0](https://user-images.githubusercontent.com/20470279/60305453-916be200-990a-11e9-8513-b349edb7a3fd.JPG)



Output for invoking the turn on and turn off method for each car in the lot : 


![4 1](https://user-images.githubusercontent.com/20470279/60305559-ef98c500-990a-11e9-9809-40288ca18481.JPG)



![4 2-AllCars](https://user-images.githubusercontent.com/20470279/60305562-f1628880-990a-11e9-8dcc-c4dc311cd0cb.JPG)



![4 3](https://user-images.githubusercontent.com/20470279/60305566-f293b580-990a-11e9-8a65-cea6767121e3.JPG)

