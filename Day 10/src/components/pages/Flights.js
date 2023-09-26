import React from 'react';
import './Flights.css';
const Flights = () => {
  // Sample flight list data (replace this with actual flight data)
  const flightList = [
    {
      id: 1,
      flightNumber: 'FL123',
      departureAirport: 'JFK',
      destinationAirport: 'LAX',
      departureTime: '10:00 AM',
      arrivalTime: '2:00 PM',
      price: '$300',
      image: 'https://images.pexels.com/photos/14449966/pexels-photo-14449966.png?auto=compress&cs=tinysrgb&w=800', // Replace with actual image URL
    },
    {
      id: 2,
      flightNumber: 'FL456',
      departureAirport: 'SFO',
      destinationAirport: 'ORD',
      departureTime: '11:30 AM',
      arrivalTime: '3:30 PM',
      price: '$350',
      image: 'https://images.pexels.com/photos/18353253/pexels-photo-18353253/free-photo-of-vietjet-airplane-on-sky.jpeg?auto=compress&cs=tinysrgb&w=800', // Replace with actual image URL
    },
    {
      id: 3,
      flightNumber: 'FL789',
      departureAirport: 'ATL',
      destinationAirport: 'MIA',
      departureTime: '9:15 AM',
      arrivalTime: '12:45 PM',
      price: '$250',
      image: 'https://images.pexels.com/photos/358220/pexels-photo-358220.jpeg?cs=srgb&dl=pexels-pixabay-358220.jpg&fm=jpg', // Replace with actual image URL
    },
    {
      id: 4,
      flightNumber: 'FL987',
      departureAirport: 'LHR',
      destinationAirport: 'JFK',
      departureTime: '8:00 AM',
      arrivalTime: '12:30 PM',
      price: '$500',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpOF51hfMjXQzKjyxTP3JI0q9iFc8WUBredI9zAg0DC04RR7QkKqJ2TIDHXJ56r-5oz6U&usqp=CAU', // Replace with actual image URL
    },
    {
      id: 5,
      flightNumber: 'FL654',
      departureAirport: 'CDG',
      destinationAirport: 'LAX',
      departureTime: '1:00 PM',
      arrivalTime: '6:30 PM',
      price: '$450',
      image: 'https://media.istockphoto.com/id/458638159/photo/british-airways-airlines-plane-taking-off.jpg?s=612x612&w=0&k=20&c=sAs9IobHbSYWMeCOeC3vkKP377PwNu6VPV5M83h6F_I=', // Replace with actual image URL
    },
    {
      id: 6,
      flightNumber: 'FL101',
      departureAirport: 'JFK',
      destinationAirport: 'SFO',
      departureTime: '7:45 AM',
      arrivalTime: '11:15 AM',
      price: '$320',
      image: 'https://images.pexels.com/photos/321159/pexels-photo-321159.jpeg?cs=srgb&dl=pexels-quintin-gellar-321159.jpg&fm=jpg', // Replace with actual image URL
    },
   
    // Add 10 more flight objects as needed
  ];

  return (
    <div className="flights">
      <h2>Flight List</h2>
      <table>
        <thead>
          <tr>
            <th>Flight Number</th>
            <th>Departure</th>
            <th>Destination</th>
            <th>Departure Time</th>
            <th>Arrival Time</th>
            <th>Price</th>
            <th>Image</th>
          </tr>
        </thead>
        <tbody>
          {flightList.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.flightNumber}</td>
              <td>{flight.departureAirport}</td>
              <td>{flight.destinationAirport}</td>
              <td>{flight.departureTime}</td>
              <td>{flight.arrivalTime}</td>
              <td>{flight.price}</td>
              <td>
                <img
                  src={flight.image}
                  alt={`Flight ${flight.flightNumber}`}
                  width="100"
                  height="100"
                />
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Flights;
