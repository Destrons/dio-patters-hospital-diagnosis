# 🏥 Projeto Hospitalar em Java com Design Patterns

Este é um projeto simples em Java que simula o fluxo de atendimento em um hospital utilizando **Design Patterns (Padrões de Projeto)** para estruturar as etapas de forma clara, escalável e reutilizável.

---

## 🚀 Funcionalidades

O sistema simula o processo de atendimento hospitalar com as seguintes etapas:

1. **Triagem**  
2. **Atendimento Médico**
3. **Diagnóstico**
4. **Resultado Final**

O sistema lida com **três doenças**:
- Gripe
- Sinusite
- Gastrite

---

## 🧠 Design Patterns Utilizados

| Etapa                     | Padrão de Projeto Utilizado |
|--------------------------|-----------------------------|
| Criação das doenças      | Factory Method              |
| Estratégia de diagnóstico| Strategy                    |
| Fluxo de atendimento     | Template Method             |
| Registro de resultados   | Singleton                   |

---

## 🗂️ Estrutura do Projeto

```bash
hospital/
│
├── Main.java
├── diseases/
│   ├── Disease.java         # Interface de doença
│   ├── Flu.java             # Gripe
│   ├── Sinusitis.java       # Sinusite
│   └── Gastritis.java       # Gastrite
│
├── diagnosis/
│   ├── DiagnosisStrategy.java    # Interface para estratégia de diagnóstico
│   └── SimpleDiagnosis.java     # Implementação simples
│
├── factory/
│   └── DiseaseFactory.java      # Fábrica de doenças
│
├── process/
│   ├── MedicalProcess.java      # Template Method do atendimento
│   └── StandardMedicalProcess.java
│
└── record/
    └── ResultRegistry.java      # Registro Singleton dos diagnósticos
