from utilitarios import (
    cadastrar_categoria,
    cadastrar_transacao,
    saldo_total,
)

# CATEGORIAS
categoria_receitas = cadastrar_categoria("Receitas")
categoria_contas = cadastrar_categoria("Contas Fixas")
categoria_viagens = cadastrar_categoria("Viagens")
categoria_lazer = cadastrar_categoria("Lazer")


# TRANSAÇÕES
cadastrar_transacao(
    descricao= "Salário Jan/2024",
    valor= 1000.0,
    categoria= categoria_receitas
)

cadastrar_transacao(
    descricao= "Mesada",
    valor= 50.0,
    categoria= categoria_receitas
)

cadastrar_transacao(
    descricao= "Ingresso Show",
    valor= -150.0,
    categoria= categoria_lazer
)

cadastrar_transacao(
    descricao= "Conta de Luz",
    valor= -100.0,
    categoria= categoria_contas
)

cadastrar_transacao(
    descricao= "Disney",
    valor= -400.0,
    categoria= categoria_viagens
)

# SALDO TOTAL
total = saldo_total()
print(f"Saldo Total: {total}")


