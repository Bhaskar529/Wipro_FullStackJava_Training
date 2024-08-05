import { useState, useEffect } from 'react';
import axios from 'axios';

const PersonsList = () => {
const [persons, setPersons] =  useState([]);
 useEffect( async ()=> {
	await axios.get(`https://jsonplaceholder.typicode.com/users`)
  	.then(res => {   	 
    	setPersons(res.data);
  	})
  },[]);

  return (
	<div>
  	<ul>
    	{persons.map((p) => (
      	<li key={Math.random().toString()}>
        	{p.id} {p.name}
      	</li>   	 
    	))}
  	</ul>
	</div>
  );
  }
export default PersonsList;
