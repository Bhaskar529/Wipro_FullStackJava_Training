import { useState } from "react";

// accessing the change function from the prop.
function Child({ onChangeC }) {
   const [value, setValue] = useState("");
   function handleChange(event) {
  	let value = event.target.value;
  	setValue(value);
  	onChangeC(value);
   }
   return (
  	<div>
     	<input
        	placeholder = "Enter some text"
        	value = {value}
        	onChange = {handleChange}
     	/>
  	</div>
   );
}
export default Child;
