<h1> Design-pattern <h1>

<img src="imgs/design pattern.bmp" alt ="graph"/>

<p> we will talk about some batterns in this read me</p>
<h2> firest Creational pattern</h2>
<ul>
  <li>Singelton</li>
  <li>Prototype</li>
  <li>Builder</li>
  <li>Factory Method</li>
  <li>Abstract Method</li>
</ul>

<h3>Singelton</h3>
<p> suppose we wont several object share the same memory (values and variables...) so sigelton will be answer  </p>
<p> graph show you the proplem we wont avoid </p>
<img src="imgs/creational proplem.bmp" alt ="graph"/>

<p> Steps  </p>
<ul>
  <li>Make Constractor Private So No One Can Create New Object</li>
  <li>Then Generate Variable Of Your Class Call It For examble :sigelton</li>
  <li>Generate GetInstance Method Which Return Instance Of Your Object Witch Is sigelton </li>
  <li>Once Take More Than One Object From GetInstance It Became Shared Between All Other Objects</li>
  <li>Blease Review Our <a href="Code\creational pattern.java"> Creational Pattern Code</a> For Better UnderStanding</li>
</ul>

<img src="imgs/Singelton patern/Singelton.bmp" alt ="graph"/>
