import React from 'react';
import './Homepage.css';
import { connect } from 'react-redux';
import { bookFlight } from './actions';

function HomePage() {
  const flights = [
    { flightNumber: 'FL123', departure: 'New York', destination: 'Los Angeles', date: '2023-10-10' },
    { flightNumber: 'FL456', departure: 'Chicago', destination: 'Miami', date: '2023-10-12' },
    { flightNumber: 'FL789', departure: 'San Francisco', destination: 'Seattle', date: '2023-10-15' },
  ];
  
  function bookFlight(flightNumber) {
   
    const flight = flights.find(flight => flight.flightNumber === flightNumber);
    if (flight && flight.seatsAvailable > 0) {
      flight.seatsAvailable--;
      alert(`You have booked a seat on Flight ${flight.flightNumber}`);
    } else {
      alert('No seats available for this flight.');
    }
  
    <div className="flight-list">
      {flights.map((flight) => (
        <div key={flight.flightNumber}>
          <p>Flight {flight.flightNumber}</p>
          <p>Departure: {flight.departure}</p>
          <p>Destination: {flight.destination}</p>
          <p>Date: {flight.date}</p>
          <button onClick={() => bookFlight(flight.flightNumber)}>Book</button>
        </div>
      ))}
    </div>

  }

  return (
    <div>
      <nav>
        <ul>
          <li><a href="/">Home</a></li>
          <li><a href="/">Flights</a></li>
          <li><a href="/">Profile</a></li>
          <li><a href="/">Logout</a></li>
        </ul>
      </nav>

      {/* Dashboard */}
      <div className='container'>
        <h1>Welcome to Flight Booking</h1>
        <div className="flight-list">
          {flights.map(flight => (
            <div key={flight.flightNumber}>
              <p>Flight {flight.flightNumber}</p>
              <p>Departure: {flight.departure}</p>
              <p>Destination: {flight.destination}</p>
              <p>Date: {flight.date}</p>
              <button onClick={() => bookFlight(flight.flightNumber)}>Book</button>
            </div>
          ))}
        </div>
      </div>
      <footer className="footer">
        <p>&copy; 2023 Flight Booking</p>
      </footer>
    </div>
  );
}

export default HomePage;
