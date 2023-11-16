let randomValue=Math.floor(Math.random()*20)+1;
let count=20;
let gameCount=1;
let output=document.getElementById('output');
let highScore=0;

/* ------------------------------------------------- Check Event Function --------------------------------------------------------------- */
function Check(event)
{
    let inputValue=document.getElementById('Number').value;
    if(inputValue===''){
        output.innerHTML='Not a number dear🚫';
        output.style.color='red';
    }
    else{
        inputValue=+inputValue;
        if(inputValue===randomValue && count===20){
            if(count>=highScore){
                highScore=count;
            }
            document.querySelector('.question-mark').innerHTML=inputValue;
            document.querySelector('body').style.backgroundColor='green';
            document.querySelector('.main-div').style.backgroundColor='green';
            document.getElementById('score').innerHTML=`💯&nbsp; Score:&nbsp;&nbsp;${highScore}`;
            document.getElementById('high-score').innerHTML=`🥇&nbsp; Highscore:&nbsp;&nbsp;${highScore}`;
            output.innerHTML='Congratulations, you won my heart💘';
            output.style.color='navy';
        }
        if(event.type==='click'){
            count--;
            document.getElementById('score').innerHTML=`💯&nbsp; Score:&nbsp;&nbsp;${count}`;
        }

        if(inputValue===randomValue){
            if(count>=highScore){
                highScore=count;
            }
            document.querySelector('.question-mark').innerHTML=inputValue;
            document.querySelector('body').style.backgroundColor='green';
            document.querySelector('.main-div').style.backgroundColor='green';
            document.getElementById('high-score').innerHTML=`🥇&nbsp; Highscore:&nbsp;&nbsp;${highScore}`;
            output.innerHTML='Congratulations, you won my heart💘';
            output.style.color='navy';
        }
        else{
            if(inputValue>20 || inputValue<0){
                output.innerHTML='📈Your are out of my expectations...😶‍🌫️';
                output.style.color='red';
            }
            else if(inputValue<randomValue-3){
                output.innerHTML='📈Your are very far from me...🫤';
                output.style.color='red';
            }
            else if(inputValue+3>=randomValue && inputValue<randomValue){
                output.innerHTML='📉Your are very near to me...🙈';
                output.style.color='yellow';
            }
            else if(inputValue>randomValue+3){
                output.innerHTML='📈Your went too away from me...😖';
                output.style.color='red';
            }
            else if(inputValue<=randomValue+3){
                output.innerHTML='📈Your went away from me...😒';
                output.style.color='blue';
            }
        }
    }
}
/* ------------------------------------------------- Check Button Here --------------------------------------------------------------- */
document.getElementById('check').addEventListener('click',Check);


/* ------------------------------------------------- Again Button Here --------------------------------------------------------------- */
document.getElementById('again-btn').addEventListener('click',function(event){
    randomValue=Math.floor(Math.random()*20)+1;
    if(event.type==='click'){
        gameCount++;
        document.getElementById('output').innerHTML=`Game${gameCount}-: &nbsp;Start Guessing...🤔`;
    }
    document.querySelector('.question-mark').innerHTML='?';
    output.style.color='white';
    document.querySelector('body').style.backgroundColor='black';
    document.querySelector('.main-div').style.backgroundColor='black';
    document.getElementById('score').innerHTML=`💯&nbsp; Score:&nbsp;&nbsp;20`;
    document.getElementById('high-score').innerHTML=`🥇&nbsp; Highscore:&nbsp;&nbsp;${highScore}`;
    document.getElementById('Number').value='';
    count=20;
});
