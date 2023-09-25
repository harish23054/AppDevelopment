import React, { useState } from 'react';
import './Homepage.css'; 

import { Link } from 'react-router-dom'; 


function HomePage() {
  const [flights] = useState([
    { flightNumber: 'FL123', departure: 'New York', destination: 'Los Angeles', date: '2023-10-10' },
    { flightNumber: 'FL456', departure: 'Chicago', destination: 'Miami', date: '2023-10-12' },
    { flightNumber: 'FL789', departure: 'San Francisco', destination: 'Seattle', date: '2023-10-15' },
  ]);

  const [departure, setDeparture] = useState('');
  const [destination, setDestination] = useState('');
  const [date, setDate] = useState('');

  const filterFlights = () => {
    return flights.filter(flight => {
      return (
        flight.departure.toLowerCase().includes(departure.toLowerCase()) &&
        flight.destination.toLowerCase().includes(destination.toLowerCase()) &&
        (date === '' || flight.date === date)
      );
    });
  };

  const handleSubmit = e => {
    e.preventDefault();
    const filteredFlights = filterFlights();
    displayFlights(filteredFlights);
  };

  const displayFlights = filteredFlights => {
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = '';

    if (filteredFlights.length === 0) {
      resultsDiv.textContent = 'No flights match your criteria.';
    } else {
      filteredFlights.forEach(flight => {
        const flightInfo = document.createElement('div');
        flightInfo.textContent = `Flight Number: ${flight.flightNumber}, Departure: ${flight.departure}, Destination: ${flight.destination}, Date: ${flight.date}`;
        resultsDiv.appendChild(flightInfo);
      });
    }
  };

  return (
    
    <div className="dashboard-container">
    <ul>Book Your Dream Tickets here!!!</ul>
    
    <div className="sidebar">
    
    <ul>
    <li><Link to="/Home">Home</Link></li>
    <li><Link to="/Flights">Flights</Link></li>
    <li><Link to="/Profile">Profile</Link></li>
    <li><Link to="/Logout">Logout</Link></li>
    <li><Link to="/FAQ">FAQ</Link></li>
    <li><Link to="/Services">Services</Link></li>
    <li><Link to="/Contact">Contact</Link></li>
    <li><Link to="/Privacy">PrivacyPolicy</Link></li>
    </ul>
    </div>
   
    
    
    <div className="container">
    <form onSubmit={handleSubmit}>
          <label htmlFor="departure">Departure:</label>
          <input
            type="text"
            id="departure"
            name="departure"
            placeholder="Enter departure city"
            value={departure}
            onChange={e => setDeparture(e.target.value)}
          />
          <label htmlFor="destination">Destination:</label>
          <input
            type="text"
            id="destination"
            name="destination"
            placeholder="Enter destination city"
            value={destination}
            onChange={e => setDestination(e.target.value)}
          />
          <label htmlFor="date">Date:</label>
          <input
            type="date"
            id="date"
            name="date"
            value={date}
            onChange={e => setDate(e.target.value)}
          />
          <button type="submit">Search</button>
        </form>
        <div id="results">
          {/* Flight search results will be displayed here */}
        </div>
      </div>
    </div>
  );
}

export default HomePage;
