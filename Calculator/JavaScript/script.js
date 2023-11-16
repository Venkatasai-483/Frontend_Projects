let value1='';
let value2='';
let value3='';
let main_bar1_value=document.getElementById('main-bar1-value')
let main_bar2_value=document.getElementById('main-bar2-value');
let main_bar3_value=document.getElementById('main-bar3-value');
let output=document.getElementById('output');

function symbolProperties(){
    main_bar2_value.style.fontSize='2.3vw';
    main_bar2_value.style.fontWeight='bold';
    main_bar2_value.style.color='blue';
}
function value1Properties(){
    main_bar1_value.style.fontSize='1.6vw';
    main_bar1_value.style.fontWeight='bold';
    main_bar1_value.style.color='green';
}
function value3Properties(){
    main_bar3_value.style.fontSize='1.6vw';
    main_bar3_value.style.fontWeight='bold';
    main_bar3_value.style.color='green';
}
function outputProperties(){
    output.style.color='white';
    output.style.fontSize='1.8vw';
    output.style.textAlign='center';
    output.style.backgroundColor='green';
    output.style.border='2px inset whitesmoke';
}
/* ------------------------------------------------ Clickable Events on number ------------------------------------------------------------ */ 
document.getElementById('one').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='1';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='1';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('two').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='2';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='2';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('three').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='3';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='3';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('four').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='4';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='4';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('five').addEventListener('click',function(){ 
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='5';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='5';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('six').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='6';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='6';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('seven').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='7';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='7';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('eight').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='8';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='8';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('nine').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='9';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='9';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})
document.getElementById('zero').addEventListener('click',function(){
    if(main_bar2_value.innerHTML=='......Enter Symbol......'){
        value1+='0';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value3+='0';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
})

/* ------------------------------------------------ Clickable Events on symbols ------------------------------------------------------------ */ 
document.getElementById('plus').addEventListener('click',function(){
    value2+='+';
    main_bar2_value.innerHTML=value2;
    symbolProperties();
    
})
document.getElementById('minus').addEventListener('click',function(){
    if(main_bar2_value.innerHTML!='......Enter Symbol......'){
        value3+='-';
        main_bar3_value.innerHTML=value3;
        value3Properties();
    }
    else if(main_bar1_value.innerHTML=='......Enter Value1......'){
        value1+='-';
        main_bar1_value.innerHTML=value1;
        value1Properties();
    }
    else{
        value2+='-';
        main_bar2_value.innerHTML=value2;
        symbolProperties();
    }

})
document.getElementById('mult').addEventListener('click',function(){
    value2+='*';
    main_bar2_value.innerHTML=value2;
    symbolProperties();

})
document.getElementById('divison').addEventListener('click',function(){
    value2+='/';
    main_bar2_value.innerHTML=value2;
    symbolProperties();

})
document.getElementById('expo').addEventListener('click',function(){
    value2+='**';
    main_bar2_value.innerHTML=value2;
    symbolProperties();
})

/* ---------------------------------------- Clickable equalto event(performing calculation) ---------------------------------------- */ 
document.getElementById('equalto').addEventListener('click',function(){
    value1=+value1;
    value3=+value3;
    switch(value2){
        case '+':{
            output.innerHTML=`${value1+value3}`;
            outputProperties();
            break;
        }
        case '-':{
            output.innerHTML=`${value1-value3}`;
            outputProperties();
            break;
        }
        case '*':{
            output.innerHTML=`${value1*value3}`;
            outputProperties();
            break;
        }
        case '/':{
            output.innerHTML=`${value1/value3}`;
            outputProperties();
            break;
        }
        case '**':{
            output.innerHTML=`${value1**value3}`;
            outputProperties();
            break;
        }
        default:{
            output.innerHTML=`No values found`;
            outputProperties();
        }
    }
})