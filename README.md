# Projeto Alert System 

## 📌 Descrição do Projeto

Este projeto implementa um sistema distribuído baseado em microsserviços contendo três serviços principais:

- weather-service – fornece dados de condições climáticas estáticas.

- alert-service – consome o weather-service e gera alertas.

- alert-store – persiste os alertas em um banco de dados PostgreSQL.

## O objetivo é demonstrar:

- Empacotamento de microsserviços Java Spring Boot com Docker
- Publicação no Docker Hub
- Orquestração usando Kubernetes (Minikube)
- Comunicação entre múltiplos serviços
- Persistência com PostgreSQL e PVC

## 📁 Organização do Repositório
```
/
├── alert-service/
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
│
├── alert-store/
│   ├── src/
│   ├── pom.xml
│   └──Dockerfile
│
├── weather-service/
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
│
├── k8s/
│   ├── alert-service.yaml  
│   ├── alert-store.yaml  
│   ├── weather-service.yaml  
│   └── postgres.yaml  
│
└── README.md  ← este arquivo
```

#### 📄 O diretório k8s/ contém todos os manifestos necessários para criação do cluster.
## ⚙️ Pré-requisitos

Antes de iniciar, instale:

- Docker
- Java	21
- Minikube	
- Kubectl

## 🚀 1. Subindo o cluster Kubernetes (Minikube)

### Start do cluster:
```
minikube start --driver=docker
```
### 🗂️ 2. Aplicar os manifestos Kubernetes
```
kubectl apply -f k8s/
```

Verificar:
```
kubectl get pods
```

### 🔌 3. Acessando os serviços sem Ingress (via Port-Forward)

#### Como a entrega não exige Ingress, utilizamos port-forward:

- Weather Service
```
kubectl port-forward deployment/weather-service 8080:8080
```

#### Acesse:
👉 http://localhost:8080/temperature

- Alert Store
```
kubectl port-forward deployment/alert-store 8090:8090
```

#### Acesse:
👉 http://localhost:8090/alerts

- Alert Service
```
kubectl port-forward deployment/alert-service 8081:8081
```

#### Acesse:
👉 http://localhost:8081/alerts


### 🧹 4. Remover recursos

```
kubectl delete -f k8s/
minikube stop
```
