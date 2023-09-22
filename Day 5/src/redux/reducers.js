
const initialState = {
    flights: [
      { flightNumber: 'FL123', departure: 'New York', destination: 'Los Angeles', date: '2023-10-10' },
      { flightNumber: 'FL456', departure: 'Chicago', destination: 'Miami', date: '2023-10-12' },
      { flightNumber: 'FL789', departure: 'San Francisco', destination: 'Seattle', date: '2023-10-15' },
    ],
  };
  
  function flightsReducer(state = initialState, action) {
    switch (action.type) {
      case 'BOOK_FLIGHT':
        const { flightNumber } = action.payload;
        return {
          ...state,
          flights: state.flights.map(flight => {
            if (flight.flightNumber === flightNumber && flight.seatsAvailable > 0) {
              return { ...flight, seatsAvailable: flight.seatsAvailable - 1 };
            }
            return flight;
          }),
        };
      default:
        return state;
    }
  }
  
  export default flightsReducer;
  