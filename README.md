# BukkitMobsAPI
A API de criação de mobs semi-completa com a capacidade de utilizar métodos fáceis e rápidos para iniciar um mob customizado, bom, tudo começa com a simples criação de um Objeto (Monstro) você deve criar uma classe extendida a EntityCreator que mais tarde será EntityAPI, enfim.

Antes de olhar os métodos você tem atualmente algumas opções
totalmente customizadas, são elas:

***- Nome do Mob.*** (**Valor em Metadata:** 0 (Nome do Mob sem espaços))

***- Dano do Mob.*** (**Valor em Metadata:** 1 ("damage"))

***- Vida do Mob.*** (**Valor em Metadata:** 2 ("health"))

**Método Específicado:**

![screenshot](https://imgur.com/fB9Eqax.png)

- No método específicado você deve específicar
o Mundo e as coordenadas X,Y,Z, é realmente muito
mais específico.

**Método Direto:**

![screenshot](https://imgur.com/b1mWHKs.png)

- No método direto você deve específicar
apenas a localização onde isto vai acontecer, algo
bem mais simples e fácil para alguns.

Como obter os dados do mob salvos na metadata?

- Por que salvar os dados do mob na metadata?
- Achei algo realmente necessário.

**Exemplo abaixo**
![screenshot](https://imgur.com/ua7rXuV.png)
