// const person = {
//     name:'saurabh',
//     greet:function(){
//         console.log('Hello, '+this.name);
//     }
// }

// const anotherPerson = {
//     name:'Kumar',
//     greet:person.greet
// }

// anotherPerson.greet(); // Hello, Kumar

function myFun(){
    console.log(this);
}

myFun(); // Window object