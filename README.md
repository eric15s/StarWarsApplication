# StarWarsApplication
This is a project used to practice inheritance and Object Oriented Programming in Java. It is a type of Star Wars directory with certain ships and vehicles that I put in myself.

What my program is a type of catalog that holds certain Star Wars vehicles. To store each vehicle it uses a LinkedList,
there are a total of 3 LinkedList in this program, one that holds Groundfighters, another for Starfighters and another
for vehicles in general. In each method there are already vehicles present in the LinkedList as a way to show
information already in the catalog. There is a class that checks if the vehicle is from the light side or not and there is
another method that checks if it is a Hero Ship or not. It is considered a Hero ship if is used by the main characters
in Star Wars. The LinkedList includes the name and the era of the vehicle, Age of the Republic, Rebellion or Resistance.
In the LinkedList for the ground vehicles also includes what type of ground vehicle it is, for example speeder or
walker. All methods have a sorting and binary search algorithm.

I have 6 classes in this program. My first class is the AbstractVehicles class that is an Abstract class that holds the
 name and era and includes getters and setters. Along with a boolean method that will be used in the concrete class
Vehicles. The next class is Vehicles that extends AbstractVehicles and implements my interface LightSide, it is the
class that holds the parameters name and era in a LinkedList. As well as an isHero method from the AbstractVehicles class and the
lightSide interface method, along with the sort and binary search algorithm. My next class is the LightSide interface
that returns boolean when checking if the vehicle is from the LightSide or not. My next class is the concrete
Groundfighter class that holds certain vehicles in a LinkedList that are ground fighters, which includes the isHero,
lightSide, binary and sort algorithms. The Groundfighter class adds the parameter of type for the type of ground vehicle.
My next class is the Starfighter class that hold certain vehicles in a different list that are air vehicles, which
includes the same methods and takes in the parameters as the Vehicles class. Then I have my UnitTests class that
test certain functions in each class.

I have made 3 different LinkedList, one for Vehicles, one for Groundfighter and one for Starfighter. I have 4 unit
tests, 2 for the Vehicles class, one for the parametrized that checks if the vehicle was added correctly
 and one for the default constructor that checks invalid input for the lightSide method. Then a test for the
Groundfighter class that checks the lightSide method. Then one for the Starfighter class tests the isHero method response
to if the Hero vehicle was found or not.
