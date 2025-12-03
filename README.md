# Atividade usando o Padrão Facade

Este projeto implementa o padrão **Facade** para simplificar o fluxo de processamento de pedidos em uma loja virtual.  
No modelo tradicional, o pedido teria que chamar diretamente três serviços diferentes: estoque, pagamento e remessa.

Com a fachada (`PedidoFacade`), o cliente do sistema precisa apenas chamar **um único método**, e toda a orquestração acontece internamente.

---

## Arquitetura da Solução

### Serviços internos (sub-sistemas)
- **EstoqueService** – verifica se os itens do pedido estão disponíveis.
- **PagamentoService** – simula aprovação/recusa do pagamento.
- **RemessaService** – gera o envio do pedido e altera o status.

### Fachada
- **PedidoFacade**
  - Recebe um pedido
  - Verifica estoque
  - Processa pagamento
  - Gera a remessa
  - Retorna o status final
  - *Esconde totalmente a complexidade do fluxo*

### Classe Main de teste
Demonstra como o cliente só precisa instanciar o `Pedido` e chamar:

```java
facade.processarPedido(pedido);
