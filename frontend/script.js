const form = document.querySelector("form");

form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const nome = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const senha = document.getElementById("password").value;
  const messageElement = document.getElementById("message");

  const usuario = { nome, email, senha };

  try {
    const response = await fetch("http://localhost:8080/usuarios", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(usuario),
    });
    const data = await response.json();
    messageElement.textContent = "Usuário cadastrado com sucesso!";
  } catch (error) {
    console.error("Erro ao cadastrar usuário:", error);
  }

  fetchUsers();
});

async function fetchUsers() {
  try {
    const response = await fetch("http://localhost:8080/usuarios");
    const users = await response.json();
    const userListElement = document.getElementById("userList");
    userListElement.innerHTML = "";
    users.forEach((user) => {
      const li = document.createElement("li");
      li.textContent = `${user.nome} - ${user.email}`;
      userListElement.appendChild(li);
    });
  } catch (error) {
    console.error("Erro ao buscar usuários:", error);
  }
}
