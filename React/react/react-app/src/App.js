// function App() {
//   return (
//     <div>
//       <h2>Welcome to my first react application</h2>
//       <h5>Thankyou for visiting my site</h5>
//     </div>
//     );
// }

// export default App;

// import React from react;
// //class component
// class App extends React.Component{
//   render(){
// 	return (
//   	<div>
//     	<h4>Welcome to my page</h4>
//   	</div>
// 	);
//   }
// }

// export default App;
//Functional Component
// const App =  () => {
//   return (
// 	<div>
//   	<h3>Welcome To My First React Application</h3>
//   	<h5>ThanQ For Visiting My Site!</h5>
// 	</div>
//   );
// }

// export default App;
// import React from 'react';

// class App extends React.Component {
// 	render() {
//   	return (
//     	<ChildComponent name="First Child" />
//   	);
// 	}
//   }

// const App = () =>{
//   return (
// 	<ChildComponent fname="Ravi" lname="kumar"/>
//   );
// }

// const ChildComponent = (props) => {
//   return <p>{props.name}</p>;
//   };


// class ChildComponent extends React.Component{
//   render(){
// 	return <p>{this.props.name}</p>
//   }
// }

  // export default App;
  // const ChildComponent = (props) => {
//   return <p>Mr.{props.fname} {props.lname}</p>;
//   };

// const ChildComponent = ( {fname, lname }) => {
//   return <p> Mr.{fname} {lname}</p>;
//   };


  // const App = ()=>{
  //   // const greeting = () =>{
  //   //   alert("Welcome to React");
  //   // }
  //   return(
  //       <>
  //         {/* <button  onClick = {greeting}>Click me</button> */}
  //         <button onClick={() =>{alert("Welcome to React");}}>click me</button>
  //         {/* <button onClick={alert("Welcome to React"))}>click me</button> */}
  //       </>
  //   );
  //   }
   
  //   export default App;
  
  // —----------------------------------------------------------------------------------------
//  import { useState } from "react";
//   const App = () => {
// 	const [counter,setCounter] = useState(0);

// 	// const handleCounter = () => {
// 	//   setCounter(counter+1);
// 	// }

// 	return (
//   	<div>
//     	{/* <button  onClick={handleCounter} >Click Me</button> */}
//     	<button  onClick={() => { setCounter(counter+1);}} >Click Me</button>
//     	<h4>{counter}</h4>
//   	</div>
// 	);
//   }

//   export default App;

// —---------------------------------------------------------
// import { useState } from "react";
//   const App = () =>{
// 	const [counter,setCounter] = useState(0);

    
// 	return (
 	 
//   	<div>  
   	 
//     	<ChildComponent onChangeC={ () => setCounter(counter+1)} />
//     	<h4>{counter}</h4>
//   	</div>
// 	);
//   }

//   const ChildComponent = ({onChangeC}) =>{
// 	return (
//   	<div>
//     	<button onClick={()=>onChangeC()}>Click Me </button>
//    	</div>
// 	)

//   }
 
//   export default App;

// import { useState } from "react";
// import Child from "./Child";

// export default function App() {
//    let [state, setState] = useState("Initial");

//   //  function handleState(newValue) {
//   // 	setState(newValue);
//   //  }

//    return (
//   	<div>
//      	<h2>      	 
//         	Handling the <i> parent state from child component </i> in ReactJS.
//      	</h2>
//      	<div>
//         	The input value in child state accessing from parent state is {state}.
//      	</div>
//      	<br></br>
//      	{/* pass handleState function as a prop of child component */}
//      	{/* <Child change = {handleState} /> */}
//      	<Child onChangeC={ (newValue)=>{setState(newValue)}  }/>
//   	</div>
//    );
// }

// import React, { useState, useEffect } from 'react';
// import axios from 'axios';
// function App() {
//   const [count, setCount] = useState(0);

//   const fetchData = async () => {
// 	try {
//   	const response = await axios.get("https://api.github.com/users/mapbox");
//   	console.log(response.data);
//   	console.log(response.status);
//   	console.log(response.statusText);
//   	console.log(response.headers);
//   	console.log(response.config);
// 	} catch (error) {
//   	// Handle error
//   	console.error(error);
// 	}
//   };

//  // Similar to componentDidMount and componentDidUpdate:   
//  useEffect(() => {    
//   // Update the document title using the browser API    
//   // document.title = `You clicked ${count} times`;
 
//   fetchData();
//   },[count]);
 
//   return (
// 	<div>
//   	<p>You clicked {count} times</p>
//   	<button onClick={() => setCount(count + 1)}>Click me </button>
// 	</div>
//   );
// }
// export default App;

// import PersonsList from './PersonsList';
// const App = () => {
//    return(
// 	<PersonsList/>
//   );
// }

// export default App;

// import Goal from "./Goal";
// const App = () => {
//   return(
// 	<Goal isGoal={false}/>
//   );
//  }
// export default App;

// import { Route, Routes } from 'react-router-dom';
// import Home from './Home';
// import About from './About';
// import Snippet from './Snippet';

//  function App() {
//  return (
// 	<div>
//    	<Routes>
//      	<Route path='/' element={<Home/>} />
//      	<Route path='/about' element={<About/>} />
//      	<Route path='/snippet' element={<Snippet/>} />
//    	</Routes>
//  	</div>
//    );
//  }

//  export default App;

// —---------------App.js—--------------------
import { Route, Routes } from 'react-router-dom';
import UserProfile from "./UserProfile";

function App() {

  return (

	<div>
  	<Routes>
    	<Route path="/user/:userId" element={<UserProfile/>} />
  	</Routes>
	</div>

  );

}

export default App;
