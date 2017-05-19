# OOP with Encapsulation Exercises

## Class Activity - Deck of Cards

We will be working on building a program together that allows us to model and simulate the behaviors for a deck of cards.

## Individual Exercises

The following are descriptions of several everyday items that you need to implement as classes. The minimal set of attributes and methods are outlined, but you should feel free to add additional ones.

## Homework Assignment

### Data Members

| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| TotalMarks | int | X | X | The total number of correct marks received on the assignment. |
| PossibleMarks | int | X | | The number of possible marks on the assignment. |
| SubmitterName | string | X | X | The submitters name for the assignment. |
| LetterGrade *(derived)* | string | X | | The letter grade for the assignment. |


**Notes**
- `LetterGrade` is a derived attribute that is calculated using totalMarks and possibleMarks. 
    - For 90% or greater return "A" 
    - 80-89% return "B" 
    - 70-79% return "C" 
    - 60-69% return "D" 
    - otherwise return "F"

### Constructor

The `HomeworkAssignment` class has a single constructor. It accepts a single argument `possibleMarks`. 

`public HomeworkAssignment(int possibleMarks)`

## Fruit Tree

### Data Members

| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| TypeOfFruit | string | X | | The type of fruit on the tree. |
| PiecesOfFruitLeft | int | X | | The number of remaining fruit pieces on the tree. |    
    
### Methods

    public bool pickFruit(int numberOfPiecesToRemove)
    
**Notes**
- `pickFruit()` is a method 
    - returns `true` if more fruit was picked or `false` if no fruit was left to be picked.
    - When picking fruit, update the number of remaining pieces by how many were removed

### Constructor

The `FruitTree` class has a single constructor. It accepts two arguments `typeOfFruit` and `startingPiecesOfFruit`. 

`public FruitTree(string typeOfFruit, int startingPiecesOfFruit)`


## Employee

### Data Members

| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| EmployeeId | int | X | | The employee id.  |
| FirstName | string | X |  | The employee's first name. |
| LastName | string | X | X | The employee's last name. |
| FullName *(derived)* | string | X | | The employee's full name. |
| Department | string | X | X | The employee's department. |
| AnnualSalary | double | X | | The employee's annual salary. |
    
**Notes**
- `FullName` is a derived attribute that returns `LastName, FirstName`.

    
### Methods

    public void raiseSalary(double percent)

**Notes**
- `raiseSalary(double percent)` increases the current annual salary by the percentage provided
    
### Constructor

The `Employee` class has a single constructor. It accepts four arguments.

`public Employee(int employeeId, string firstName, string lastName, double salary)`     

## Airplane

### Data Members

| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| PlaneNumber | string | X | | The six-character plane number.  |
| BookedFirstClassSeats | int | X |  | The number of already booked first class seats |
| AvailableFirstClassSeats *(derived)* | int | X | | The number of available first class seats. |
| TotalFirstClassSeats | int | X | | The total number of first class seats. |
| BookedCoachSeats | int | X |  | The number of already booked first class seats |
| AvailableCoachSeats *(derived)* | int | X | | The number of available first class seats. |
| TotalCoachSeats | int | X |  | The total number of first class seats. |

**Notes**
- `AvailableFirstClassSeats` is a derived attribute calculated by subtracting `BookedFirstClassSeats` from `TotalFirstClassSeats`
- `AvailableCoachSeats` is a derived attribute calculated by subtracting `BookedCoachSeats` from `TotalCoachSeats`


### Constructors
    
The `Airplane` class has a single constructor. It accepts three arguments.

    Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats)

- `planeNumber` is the six-character plane number
- `totalFirstClassSeats` is the initial number of total first class seats.
- `totalCoachSeats` is the initial number of total coach seats.
    

### Methods

    bool reserveSeats(bool forFirstClass, int totalNumberOfSeats)


**Notes**
- `reserveSeats()` is a method
    - if firstClass is true, reserve the value for `totalNumberOfSeats` for first class
    - if firstClass is true, reserve the value for `totalNumberOfSeats` for coach
    - return `true` if the reservation can be made, `false` if it caannot




## Television        
    
### Data Members
    
| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| IsOn | bool | X | | Whether or not the TV is turned on.  |
| CurrentChannel | int | X |  | The value for the current channel. Channel levels go between 3 and 18. |
| CurrentVolume | int | X | | The current volume level. |


### Constructors
    
The `Television` class does not need a constructor. It can use the **default constructor**.

A new TV is off by default. The channel is set to 3 and the volume level to 2.

### Methods
    
    void turnOff()
    void turnOn()
    void changeChannel(int newChannel)
    void channelUp()
    void channelDown()
    void caiseVolume()
    void lowerVolume()    


**Notes**
- `turnOff()` turns off the tv
- `turnOn()` besides turning the tv on, also resets the channel to 3 and the volume level to 2
- `changeChannel(int newChannel)` changes the current channel (only if it is on) to the value of `newChannel` as long as it is between 3 and 18
- `channelUp()` increases the current channel by 1 (only if it is on). If the value goes past 18, then the current channel should be set to 3.
- `channelDown()` decreases the current channel by 1 (only if it is on). If the value goes below 3, then the current channel should be set to 18.
- `raiseVolume()` inceases the volume by 1 (only if it is on). The limit is 10
- `lowerVolume()` decreases the volume by 1 (only if it is on). The limit is 0


    
## Elevator

### Data Members

| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| CurrentFloor | int | X | | The current floor that the elevator is on.  |
| NumberOfFloors | int | X |  | The number of floors available to the elevator. |
| DoorOpen | int | X | | Whether the elevator door is open or not. |




### Constructor

The `Elevator` class has a single constructor that takes one argument. New elevators start on floor 1.

    Elevator(int totalNumberOffloors)

- `totalNumberOfFloors` indicates how many floors are available to the elevator

### Methods
    
    void openDoor()
    void closeDoor()
    void goUp(int desiredFloor)
    void goDown(int desiredFloor)        
    
**Notes**
- `openDoor()` opens the elevator door.
- `closeDoor()` closes the elevator door.
- `goUp(int desiredFloor)` sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
- `goDown(int desiredFloor)` sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
