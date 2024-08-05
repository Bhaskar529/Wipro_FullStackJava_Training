import { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';


function UserProfile(props) {

  const [user, setUser] = useState(null);

  const {userId} = useParams();



  useEffect(() => {

	axios.get(`https://jsonplaceholder.typicode.com/users/${userId}`)

  	.then(response => {

    	setUser(response.data);

  	});

  }, [userId]);



  return user ? (

	<div>{user.name}</div>

  ) : (

	<div>Loading...</div>

  );

}

export default UserProfile;

