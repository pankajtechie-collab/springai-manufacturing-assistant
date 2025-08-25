# 🧠 Spring AI + Ollama | Manufacturing Support Chatbot

A modular Spring Boot application that integrates [Spring AI](https://docs.spring.io/spring-ai/reference/) with [Ollama](https://ollama.com) to run local LLMs like LLaMA 2. This project simulates a real-world manufacturing support assistant — answering technician queries with safety-first, step-by-step guidance.

---

## 🚀 Features

- 🧠 Local LLM integration via Ollama (no cloud quota)
- 🔌 Spring AI `ChatClient` abstraction
- 🗣️ REST endpoint: `/chat?prompt=...`
- 🧱 Modular architecture: config, service, controller
- 📝 System prompt externalized for tone control
- 🧪 Built for local development and rapid prototyping

---

## 🏭 Real-World Use Case

> A factory technician needs help troubleshooting a hydraulic press. Instead of flipping through manuals, they query a local chatbot that responds with clear, safety-aware instructions — powered by LLaMA 2 running on Ollama.

---

## ⚙️ Setup Instructions

### 1. Install Ollama

```bash
winget install --id Ollama.Ollama
ollama serve
ollama pull llama2
```

### 2. Clone the Repo

```bash
git clone https://github.com/pankajtechie-collab/springai-manufacturing-assistant.git
cd springai-manufacturing-assistant
```

### 3. Run the App

```bash
mvn spring-boot:run
```

### 4. Test the Endpoint

```bash
curl "http://localhost:8080/api/manufacturing-chatbot/ask-problem?prompt=How do I reset the hydraulic press?"
```

---

## 💡 Why This Matters

### This setup is ideal for:
1. 🏭 Industrial support bots
2. 🧠 Local LLM experimentation
3. 🧪 Backend-driven AI microservices
4. 🔒 Quota-free development with full control

---

## 🙌 Built By

Built by Pankaj Vasnani. 

Back End Engineer | Freelance IT Project Manager | Laravel | MySQL | Spring Boot | Golang | PostgreSQL | Angularjs | Nextjs

Powered by Spring Boot, Spring AI, and Ollama

[Github](https://github.com/pankajtechie-collab?tab=repositories) | [Linkedin](https://www.linkedin.com/in/pankaj-ramesh-vasnani/)

---

## 📬 Feedback & Contributions

Open issues, submit PRs, or fork the repo to build your own AI-powered backend. If you're building something cool with Spring AI or Ollama, I’d love to hear about it.