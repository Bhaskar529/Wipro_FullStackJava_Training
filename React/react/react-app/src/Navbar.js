import { Link } from "react-router-dom";

const Navbar = () => {
	return (
  	<nav>
    	<ul>
      	<li>
        	<Link to="/">Home</Link>
      	</li>
      	<li>
        	<Link to="/about">About Pieces</Link>
      	</li>
       	<li>
        	<Link to="/snippet">Code Snippet</Link>
      	</li>
 
       	</ul>
  	</nav>
	);
  }
 
 export default Navbar;
