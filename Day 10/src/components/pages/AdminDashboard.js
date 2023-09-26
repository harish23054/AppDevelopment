import React, { useState, useEffect } from 'react';

function AdminDashboard() {
  const [bookedFlights, setBookedFlights] = useState([]);
  const [isAdmin, setIsAdmin] = useState(false);
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  useEffect(() => {
    fetch('/api/booked-flights')
      .then(response => response.json())
      .then(data => setBookedFlights(data));
  }, []);

  const handleLogin = () => {
   
    const adminUsername = 'harish';
    const adminPassword = '12345';

    if (username === adminUsername && password === adminPassword) {
      setIsAdmin(true);
      setError('');
    } else {
      setError('Invalid username or password');
    }
  };


  if (!isAdmin) {
    return (
      <div>
        <h1>Admin Login</h1>
        <form onSubmit={e => {
          e.preventDefault();
          handleLogin();
        }}>
          <div>
            <label>Username:</label>
            <input type="text" value={username} onChange={e => setUsername(e.target.value)} />
          </div>
          <div>
            <label>Password:</label>
            <input type="password" value={password} onChange={e => setPassword(e.target.value)} />
          </div>
          <button type="submit">Login</button>
        </form>
        <p style={{ color: 'red' }}>{error}</p>
      </div>
    );
  }

  return (
    <div>
      <h1>Admin Dashboard</h1>
      <table>
      <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Customer Name</th>
          <th>Flight Number</th>
        </tr>
      </thead>
      <tbody>
        {bookedFlights.map(flight => (
          <tr key={flight.id}>
            <td>{flight.id}</td>
            <td>{flight.customerName}</td>
            <td>{flight.flightNumber}</td>
          </tr>
        ))}
      </tbody>
    </table>
      </table>
    </div>
  );
}

export default AdminDashboard;
