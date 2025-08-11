# 📱 Fiscaliza+

O **Fiscaliza+** é um aplicativo voltado para cidadãos que desejam contribuir com a fiscalização de infrações de trânsito, permitindo o envio de imagens e informações diretamente para órgãos reguladores, como **DETRAN** e **SEMOB**.

## 🚀 Objetivo
Facilitar a denúncia de infrações de trânsito, garantindo que as informações sejam enviadas de forma rápida, segura e organizada para as autoridades competentes.

## 🛠 Funcionalidades

- **Cadastro e Login** via telefone e senha.
- **Seleção do Órgão Destinatário**: escolha para qual organização a denúncia será enviada.
- **Registro de Infração**:
  - Captura de foto com **data, hora e localização** embutidas.
  - Descrição opcional da ocorrência.
- **Gerenciamento de Infrações**:
  - Criar, visualizar, editar e excluir infrações antes do envio.
- **Envio Seguro** das informações via backend, por e-mail, para o órgão escolhido.
- **Perfil Administrador** com acesso total ao sistema.

## 🏗 Arquitetura

- **Frontend**: Aplicativo mobile (Android/iOS).
- **Backend**: API REST responsável pelo gerenciamento de usuários, infrações e integração com envio de e-mails.
- **Banco de Dados**: Armazenamento das informações de usuários e infrações.
- **Serviço de E-mail**: Envio das denúncias para os órgãos competentes.

## 📂 Estrutura Inicial do Projeto

