import React from 'react';

const PrivacyPolicy = () => {
  return (
    <div className="privacy-policy">
      <h2>Privacy Policy</h2>

      <p>
        This Privacy Policy outlines how [Your Company Name] ("we," "our," or "us") collects, uses, shares, and protects
        the personal information you provide when using our flight ticket booking services.
      </p>

      <h3>Information We Collect</h3>

      <p>
        We may collect the following types of personal information when you use our services:
      </p>

      <ul>
        <li>Contact information (e.g., name, email address, phone number).</li>
        <li>Travel preferences (e.g., seat preferences, meal preferences).</li>
        <li>Payment information (e.g., credit card details).</li>
        <li>Booking and reservation details (e.g., flight information, dates of travel).</li>
      </ul>

      {/* Include more sections about how data is used, shared, and protected */}
      
      <h3>Security</h3>

      <p>
        We take the security of your personal information seriously and employ industry-standard security measures to
        protect it. However, no method of transmission over the internet or electronic storage is completely secure, so
        we cannot guarantee the absolute security of your data.
      </p>

      <h3>Changes to this Privacy Policy</h3>

      <p>
        We may update this Privacy Policy from time to time to reflect changes in our practices or for other
        operational, legal, or regulatory reasons. Any updates will be posted on this page, and the effective date will
        be indicated at the top of the page.
      </p>

      {/* Include contact information for inquiries about the privacy policy */}
      
    </div>
  );
};

export default PrivacyPolicy;
