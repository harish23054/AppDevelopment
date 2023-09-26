import React, { useState } from 'react';
import './Contact.css';
const Contact = () => {
  const [formData, setFormData] = useState({
    name: 'aaaa', // Constant name
    email: 'abab@gmail.com', // Constant email
    message: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // You can add code here to send the form data to your backend or perform other actions.
    console.log('Form submitted:', formData);
    // Reset the form fields
    setFormData({
      name: 'John Doe', // Reset to the constant name
      email: 'johndoe@example.com', // Reset to the constant email
      message: '',
    });
  };

  return (
    <div className="contact">
      <h2>Contact Us</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="name">Name:</label>
          <input
            type="text"
            id="name"
            name="name"
            value={formData.name}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="message">Message:</label>
          <textarea
            id="message"
            name="message"
            value={formData.message}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default Contact;
