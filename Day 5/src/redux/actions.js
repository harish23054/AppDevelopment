
export const bookFlight = (flightNumber) => {
    return {
      type: 'BOOK_FLIGHT',
      payload: {
        flightNumber,
      },
    };
  };
  