window.addEventListener("DOMContentLoaded", () => {
    const createChatButton = document.querySelector("#create-chat-button");
    const createChatForm = document.querySelector(".create-chat-form");
    const createChatSubmit = document.querySelector("#create-chat-submit");
    const createChatCancel = document.querySelector("#cancel-button");
    const chatListContainer = document.querySelector(".chat-list");
    const fileUploadContainer = document.querySelector(".file-upload-container");
    const fileUploadInput = document.querySelector("#file-upload");
    const fileUploadConfirm = document.querySelector(".file-upload-confirm");
    const chatMessagesContainer = document.querySelector(".chat-messages");
    const chatInput = document.querySelector(".chat-input input[type='text']");
    const chatInputButton = document.querySelector(".chat-input button");
    const logoutButton = document.querySelector("#logout-button");

    let chatList = [];
    let currentChatId = null;
    let fileSelected = false;

    // Show Create Chat Form
    createChatButton.addEventListener("click", () => {
        createChatForm.style.display = "block";
    });

    // Hide Create Chat Form and Submit New Chat
    createChatSubmit.addEventListener("click", () => {
        const chatName = document.querySelector("#chat-name").value;
        if (chatName) {
            chatList.push({ id: Date.now(), name: chatName });
            updateChatList();
            createChatForm.style.display = "none";
            fileUploadContainer.style.display = "block"; // Show file upload after creating chat
            chatMessagesContainer.innerHTML = ""; // Hide messages initially
        }
    });

    // Hide Create Chat Form
    createChatCancel.addEventListener("click", () => {
        createChatForm.style.display = "none";
    });

    // Handle Chat Selection
    chatListContainer.addEventListener("click", (e) => {
        const chatItem = e.target.closest(".chat-item");
        if (chatItem) {
            currentChatId = chatItem.dataset.id;
            if (fileSelected) {
                loadMessages();
                fileUploadContainer.style.display = "none"; // Hide file upload once a file is selected
            }
        }
    });

    // Handle File Upload
    fileUploadInput.addEventListener("change", () => {
        const file = fileUploadInput.files[0];
        fileSelected = file && file.type === "text/plain";
        if (fileSelected) {
            fileUploadContainer.style.display = "none"; // Hide file upload after selecting file
        }
    });

    // Send Message
    chatInputButton.addEventListener("click", () => {
        const message = chatInput.value.trim();
        if (message && currentChatId) {
            const messageElement = document.createElement("div");
            messageElement.textContent = message;
            messageElement.className = "message sent";
            chatMessagesContainer.appendChild(messageElement);
            chatInput.value = "";
            // Invoke a Tauri command to send message if needed
        }
    });

    // Logout Button
    logoutButton.addEventListener("click", () => {
        // Navigate back to login page
        window.location.href = "/login.html";
    });

    // Update Chat List
    function updateChatList() {
        chatListContainer.innerHTML = ""; // Clear existing list
        chatList.forEach(chat => {
            const chatItem = document.createElement("button");
            chatItem.textContent = chat.name;
            chatItem.className = "chat-item";
            chatItem.dataset.id = chat.id;
            chatListContainer.appendChild(chatItem);
        });
    }

    // Load Messages (Dummy Function)
    function loadMessages() {
        // Replace this with actual message loading logic
        const dummyMessages = [
            "Hello!",
            "How are you?",
            "This is a sample message."
        ];
        dummyMessages.forEach(msg => {
            const messageElement = document.createElement("div");
            messageElement.textContent = msg;
            messageElement.className = "message received";
            chatMessagesContainer.appendChild(messageElement);
        });
    }
});
