

	    var speed=25;
	 	var backgroundClor="#50b7c8";//"#00ccff"
	    var circleColor="#FFFFFF";//"#FFFFFF"
	    var textColor="#FFFFFF";
	    var starting_value=1;
	 
	   function drawCircle(Percentage,canvasId)
	   {
	     var c=document.getElementById(canvasId);
		 var ctx=c.getContext("2d");
		 ctx.lineWidth=10;
		 ctx.strokeStyle=circleColor;
		 ctx.lineCap='round';
		 var val1=starting_value;
		 var val2=Percentage;
		 function loadCircle()
	    {
	         

	         val1=val1+1;
	         ctx.fillStyle=backgroundClor;
	         ctx.fillRect(0,0,140,140);
	         ctx.beginPath();
	         ctx.arc(70,70,60,degToRed(270),degToRed((360/100)*val1-90));
	         ctx.stroke();
	         ctx.font="20px Arial";
	         ctx.fillStyle=textColor;
	         ctx.fillText(Percentage+"%",52,80);

	         if(val1==val2)
	         {
	         	clearInterval(rifat);
	         }       
	    }
	    var rifat;
	    rifat=setInterval(function(){loadCircle();},25);
		  
	         
	   }
	  
	    function degToRed(val)
	    {  
	    	var num=Math.PI/180;
	    	return num*val;
	    }

	  

	// Running the function 

	/*drawCircle(80,"rifat");
	drawCircle(60,"rifat2");
	drawCircle(90,"rifat3");
	drawCircle(75,"rifat4");
	drawCircle(95,"rifat5");
	drawCircle(70,"rifat6");
*/
