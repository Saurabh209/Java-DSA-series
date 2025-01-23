const ststus = false;

const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    if(ststus == true){
        resolve('success');
    }else{
        reject('failure');
    }
    
  }, 1500);
});

promise.then((data)=>{
    console.log(data);
}).catch((error)=>{
    console.log(error);
});