import React, { useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  const sendMessage = async () => {
    const response = await window.__TAURI__.invoke('get_message');
    setMessage(response);
  };

  return (
    <div>
      <h1>Hello from React</h1>
      <button onClick={sendMessage}>Get Message from Rust</button>
      <p>{message}</p>
    </div>
  );
}

export default App;
