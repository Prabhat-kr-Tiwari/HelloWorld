package com.prabhat.helloworld

import java.lang.IllegalArgumentException

fun main(){
    //var myname="Prabhaat"
    // val cannot be reassigned so cannot udate it during the run time
    //immutable variable
    val myname="Prabhaat"
    //myname="sonu"
    val age=9
    //size of short is 16 bits
    val myshort:Short=9
    //size of long is 64 bits
    val mylong:Long=987652446524699999
    val succes=true
    val letterchar='A'
    val digitchar='$'

    val mystr="Hello string"
    var firstCharInString=mystr[0]
    var lastCharInString=mystr[mystr.length-1]
    println(firstCharInString)
    println(lastCharInString)

    val myfloat=9F
    print ("Hello  "+myname)
    println()

    //Arithmetic operator(+,-,*,/,%)
    var result =5+3
    //result=result/2//result/=2
    //result*=2
   // result+=2
    //result-=2
   // result=15%2
    val a=5.0
    var b=3
    //result=(a/b).toInt()
   var resultDouble:Double
   resultDouble=a/b
    println(resultDouble)
    //comparison operator
    val isEqual=5==5
    println("is equal is  $isEqual")
    val isNotEual=5!=5
    //string interpolation
    println(" is not equal is$isNotEual")
    println(" is 5 greater than 3 is ${5>3}")
    println(" is 5 lowereual  3 is ${5>3}")
    val x="hello"
    val y="world"
    val z="$x$y"
    print(z)
    println("is 5 greaterequal3${5>=3}")
    //Assignment operator
    //(+=,-=,*=,/=,%=)
    var mynum=9
    //mynum+=3
    mynum-=3
    println(mynum)
    mynum*=3
    println(mynum)
    mynum/=3
    println(mynum)
    mynum%=3
    println(mynum)
    //increment and decrement operator
    //(++,--)
    mynum++
    println("mynum is$mynum")//1
    print("mynum is${mynum++}")//2
    println("mynum is${++mynum}")//3
    println("mynum is${--mynum}")
    //if else statement
    var heightperson1=170
    var heightperson2=170
    if(heightperson1>heightperson2)
    {
        println("use raw force")

    }
    else if(heightperson1==heightperson2)
    {
        println("use your power technique")

    }
    else
    {
        println("use technique")
    }
    val agee=31
    if(agee>=21)
    {
        println("now you may drink in us")
    }
    else if(agee>=18)
    {
        println("now yoe may vote")
    }
    else if(agee>=16)
    {
        println(" you may drive now")
    }else
    {
        println("you're too young")
    }

    when(age){
        !in 21..150->println("now you may drink in us")
        in 18..20->println("now yoe may vote")
        16,17->println(" you may drive now")
        else->println("you're too young")

    }




    var name ="Denis"
    if(name=="Denis")
    {
        print("welcome denis")
    }
    else
    {
        println("who are you")
    }
    val isRainy=true
    if(isRainy)
        println("It s raining")
    var season=5
    when(season){
        1 -> println("spring")
        2-> println("summer")
        3-> {
            println("fall")
            println("Autumn")
        }
        4-> println("Winter")
        else-> println("invalid season")

    }
    var month=3
    when(month){
        in 3..5-> println("spring")
        in 6..8-> println("summer")
        in 9..11-> println("fall")
        //in 12 downTo 2 -> println()
        12,1,2-> println("winter")
        else-> println("invalid season")

    }

    var o:Any=14.89
    when(o){
        is Int-> println("$o is an integer")
        is Double-> println("$o is an double")
        is String-> println("$o is an string")
        else-> println("$o is non of the above")
    }
    var xk=1
    while(xk<=10){
        println("$xk")
        xk++
    }
    println("while loop is done")
    var xi=100
    while(xi>=0) {
        println("$xi")
        xi -= 2
    }
    xk=1
    do{
        print("$xk")
        xk++


    }while (xk<100)
    println("\n do while loop is done")
    var xkz:Int
    xkz=15
    do{
        print("$xkz")
        xkz++


    }while (xkz<10)
    println("\n do while loop is done")
    var felttemp="cold"
    var roomtemp=10
    while(felttemp=="cold"){
        roomtemp++
        if(roomtemp>=20){
            felttemp="comfy"
            println("Its comfy now")
        }

    }
    for (num in 1..10 ){
        print("$num")
    }
    for (i in 1 until 10 ){
        print("$i ")
    }
    println("\n")
    for (i in 10 downTo 1 ){
        print("$i ")
    }

    println("\n")
    for (i in 10 downTo 1 step 2 ){//for(i in 10.downTo(1).step(2)
        print("$i ")
    }
    myFunction()
    var results=addup(5,6)
    println("result is+$results")
    var result2=avg(9.0,8.7)
    println("$result2")

    var name3 :String="sonu"
    //name="mukhiya"
    //name=null       //error
    var nullablename : String?="FSG"
    //nullablename=null

    var len=name3.length
    var len2=nullablename?.length
   // println("$len2")
    //println(nullablename?.toLowerCase())
    //println(nullablename?.toUpperCase())
    //execute only if not null
    //nullablename?.let { println(it.length)}


    //var len2=nullablename.length
    if(nullablename!=null){
        var len2=nullablename.length
        //println("$len2")
    }else{
        null
    }
    //
    //println("$len")
    //assigning a nullable value to non null variable
    // ?: Elvis operator
    val name4=nullablename?:"Guest"
    println("name is $name4")
    println("new"+nullablename!!.toLowerCase())
    //classses and objects
    var hk:person =person("sonu","tiwari")
    //var john   =person()
    var helloi=person("shivam","tiwari")
    //
    var mobiledescription=MobilePhone("Android","Samsung",
            "Galaxys20")
    //mobiledescription.
    mobiledescription.showbattery()
    myFunction(9)
    //hk.statehobby()
    hk.hobby="skateboard"
    hk.statehobby()
    var john=person("john ","tiwari",9)
    john.age=90
    println("john  is ${john.age} years old")
    john.hobby="play video games"
    john.statehobby()


    //for class car
    var mycar=Car()
    mycar.owner
    println("brand is: ${mycar.mybrand}")
    mycar.maxspedd=2020
    println("Maxspeed is: ${mycar.maxspedd}")
    //mycar.myModel="M54"
    println("Model is ${mycar.myModel}")

    //for data class
    val user1=User(1,"Denis")
    //val nameg=user1.nameg
    //println(nameg)
   // user1.nameg="Michael"
    val user2=User(1,"Michael")
    println(user1.equals(user2))
    val updateduser=user1.copy(nameg = "prabu")
    println(user1)
    println(updateduser)
    println(updateduser.component1())//print 1
    println(updateduser.component2())

    val(id,nameg)=updateduser
    //println("id=$id","nameg=$nameg")
    var hy=Test(-1)
    println("The value of test ${hy.value}")



    //for class car1
    var audiA3=Car1(200.0,"A3","Audi")
    var teslasS=ElectricCar(250.0,"S-model","tesla",86.0)
    //every superclass
    teslasS.extendRange(200.0)

    teslasS.drive()
    teslasS.chargerType="Type2"


    //polymorphism
    audiA3.drive(200.0)
    teslasS.drive(200.0)
    teslasS.brake()
    audiA3.brake()





}
interface Drivable{
    val maxSpeed:Double
    fun drive():String
    fun  brake(){
        println("The drivable is making")

    }
}
//super,parent,base class
open class vehicle{
    //properties
    //method

}
//sub class,child class or derived class  of vehicle
/*open class Car1:vehicle(){

}*/
open class Car1(override val maxSpeed:Double,val name :String,val brand:String):Drivable{

    open var range:Double=0.0
    fun extendRange(amount:Double){
        if(amount>0){
            range+=amount
        }

    }
    //override fun drive(): String=return "driving the interface drive"

    override fun drive(): String {
        TODO("Not yet implemented")
        return "driving the interface drive"
    }

    open fun drive(distance:Double){
        println("Drive for $distance km")

    }

}
//sub class child class or derived class of  car
class ElectricCar(maxSpeed: Double,name:String,brand:String,batterylife:Double):Car1(maxSpeed,name,brand){

    var chargerType="type1"
    override var range =batterylife*6
    override fun drive(distance: Double) {
        println("Drive for $distance km on electricity")
    }
    override fun drive():String{
        return "Drive for $range km on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }




}
data class Test(private val _value: Int) {
    val value: Int
        get() = if (_value < 0) 0 else _value
}
data class User(val id:Long,val nameg:String)
class Car(){
    lateinit var owner:String
    val mybrand :String="BMW"
    get() {return field.toLowerCase()}
    //custom getter method

    var maxspedd :Int=240
    //get()=field
    set(value) {field=if(value>0) value else throw IllegalArgumentException("MAx value cannot be negative")}

    var myModel:String="M5"
        private set
    init{
        this.myModel="M3"
        this.owner="tiwar"
    }
}
//this is a parameter
fun myFunction(a:Int){
    //a is a  variable
    var a=4
    println("a is $a")

}
fun myFunction(){
    print("Called from myFunction")

}
fun addup(a:Int ,b:Int) : Int{
    return a+b
}
//Method -> is a function within a class
fun avg(a:Double,b:Double):Double{
    return (a+b)/2
}
class person /*constructor*/(firstname: String,lastname:String){
    //member variable properties
    var age:Int?=null
    var hobby="Watch netflix"
    var firstname:String?=null

    init {
        this.firstname=firstname
        println("Initialize a new person object with"
                +"firstname=$firstname"+
                "lastname=$lastname")
        //println("Person created")
    }
    //Member secondary Constructor
    constructor(firstname: String,lastname: String,age:Int):
            this(firstname,lastname){
                this.age=age
        println("Initialize a new person object with"
                +"firstname=$firstname"+
                "lastname=$lastname")
            }


    //member function -methods
    fun statehobby(){
        println("${firstname}my hobby is $hobby")

    }
}
class MobilePhone constructor(osName :String,brand
:String,model:String){
    var model:String
    var battery="45%"
    init {
        this.model=model
        println("Initialize a new phone"+" osname=$osName"+
        " brand=$brand"+" model=$model")
    }
    fun showbattery(){
        println("${model} has $battery battery left ")
    }
    fun chargeBattery(){
        println("The has 10% battery and it is charge by 15%"
        )

    }

}



