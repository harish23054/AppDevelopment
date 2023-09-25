import React from 'react';
import './FAQ.css';
const FAQ = () => {
  const faqData = [
    {
      question: '1- WHY AN FAQ RESOURCE?',
      answer: 'Firstly, FAQ pages can bring new visitors to your website via organic search and drive them quickly to related pages',
    },
    {
      question: '2- How can I contact customer support?',
      answer: 'You can contact our customer support team by emailing harish@gmail.com.',
    },
    {
      question: '3- Do you offer refunds?',
      answer: 'Yes, we offer refunds within 30 days of purchase. Please visit our Refund Policy page for more details.',
    },
    {
      question: '4- IS THERE ANY LIMITATION ON THE AMOUNT OF ONLINE BOOKING?',
      answer: 'No, there is no limit. The Ticket that you can buy is depending on the available ticket of the online purchase.',
    },
   
    
    // Add more FAQ data here
  ];

  return (
    <div className="faq-container">
      <h1>Frequently Asked Questions</h1>
      <ul>
        {faqData.map((faq, index) => (
          <li key={index}>
            <h2>{faq.question}</h2>
            <p>{faq.answer}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default FAQ;