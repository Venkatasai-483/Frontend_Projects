document.getElementById('submit').addEventListener('click',function(){
    let userName=document.getElementById('userName');
    let email=document.getElementById('email');
    let password=document.getElementById('password');
    let telephone=document.getElementById('phoneNumber');

    const RegExp_UserName=/^[\w]{5,12}$/;
    const RegExp_Email=/^[\w]+@[a-zA-z]+\.com$/;
    const RegExp_Password=/(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$&-=/+~_])^[A-Za-z].{8,16}$/;
    const RegExp_PhoneNum=/^[6-9]\d{9}$/;
    
    if(RegExp_UserName.test(userName.value)){
        userName.style.borderColor='green';
    }
    else{
        userName.style.borderColor='orange';
        document.getElementById('userNameOutput').innerHTML='Username must be and contains 5-12 characters';
        document.getElementById('userNameOutput').style.color='orange';
    }

    if(RegExp_Email.test(email.value)){
        email.style.borderColor='green';
    }
    else{
        email.style.borderColor='orange';
        document.getElementById('emailOutput').innerHTML='Email must be a valid address, e.g. sailagisetty995@gmail.com';
        document.getElementById('emailOutput').style.color='orange';
    }

    if(RegExp_Password.test(password.value)){
        password.style.borderColor='green';
    }
    else{
        password.style.borderColor='orange';
        document.getElementById('passwordOutput').innerHTML='Password must alphanumeric, special symbols, and be 8-16 characters';
        document.getElementById('passwordOutput').style.color='orange';
    }

    if(RegExp_PhoneNum.test(telephone.value)){
        telephone.style.borderColor='green';
    }
    else{
        telephone.style.borderColor='orange';
        document.getElementById('telephoneOutput').innerHTML='Telephone must be a valid Indian telephone number(10 digits)';
        document.getElementById('telephoneOutput').style.color='orange';
    }
})