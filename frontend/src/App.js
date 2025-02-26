import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/employees')
      .then(response => setEmployees(response.data))
      .catch(error => console.error('Error fetching employees', error));
  }, []);

  return (
    <div className="App">
      <h1>Employee List</h1>
      <ul>
        {employees.map(employee => (
          <li key={employee.id}>{employee.name} - {employee.role}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
