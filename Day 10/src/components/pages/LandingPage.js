import React from 'react'
import { Link } from 'react-router-dom'

import '../../App.css'
import BackgroundImage from '../../assets/images/flg6.png'

export default function LandingPage() {
    return (
        <header style={HeaderStyle}>
  <div className="buttons text-center" style={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
    <Link to="/login">
      <button className="primary-button">log in</button>
    </Link>
    <Link to="/register">
    <button className="primary-button" id="reg_btn">
    <span>register</span>
    </button>
    <Link to="/admin">
      <button className="primary-button">AdminDashboard</button>
    </Link>
    </Link>
  </div>
</header>


    )
}

const HeaderStyle = {
    width: "100%",
    height: "100vh",
    background: `url(${BackgroundImage})`,
    backgroundPosition: "center",
    backgroundRepeat: "no-repeat",
    backgroundSize: "cover"
}