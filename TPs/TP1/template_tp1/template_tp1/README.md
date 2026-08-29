# Paquete de latex para AED2

Aquí se encuentran los paquetes de latex utilizados por la cátedra de
*Algoritmos y Estructuras de Datos (Licenciatura en Cs. de la Computacion) / Algoritmos y Estructuras de Datos 2 (Licenciatura en Cs. de Datos)* para presentar contenidos. Entre ellos se
encuentran macros para describir tads y módulos de diseño.

## Instalación

### LINUX

Para instalar los paquetes, copiar la carpeta "texmf" de este directorio al home y luego ejecutar (desde el path del home)

    $ sudo texhash texmf/

### WINDOWS (MiKTeX 2.9)

- Copiar todas las carpetas `texmf\tex\latex\AED*` de este directorio al directorio `tex\latex\` de la carpeta de instalación del MiKTeX. Por ejemplo: `C:\Program Files\MikTex 2.9\tex\latex\`
- Abrir las utilidad "Settings (Admin)" que se instala con MikTex
- En la pestaña "General", pulsar "Refresh FNDB" y a continuación "Update Formats"
- SI IGUAL NO COMPILA: Chequear tener instalado el paquete "xargs" de MikTex. En la instalación default, Miktex detecta al compilar un .tex si un paquete falta y pregunta si lo queremos instalar. Si no, lo instalamos a mano desde el Package Manager de Miktex.

### MAC OS X


1. Situado en `Paquetes-Latex`, Copiar texmf a `~/Library/texmf` [1]

        $ cp -a texmf/ ~/Library/texmf/


2. Ejecutar "texhash"

        $ texhash



[1] El path es posible encontrarlo usando `kpsewhich -var-value TEXMFHOME`
Por ejemplo, al usar TexLive 2013 suele estar definido en:
`/usr/local/texlive/2013basic/texmf.cnf` , TEXMFHOME = ~/Library/texmf


## Ejemplo de TADs y el uso de las macros

En el directorio `ejemplos` se encuentra un archivo `main.tex`. 
Este tex presenta un ejemplo de cómo escribir un TAD con sus 
procesos y observadores y definir preds y aux utilizando las 
macros de latex provistas por la cátedra.


## Alternativas

En caso de no poder (o no querer) instalar los paquetes en un entorno local de LaTeX, las macros pueden ser usadas en un entorno web como [overleaf](https://www.overleaf.com).

Para ello, hacer click en ```Nuevo proyecto``` y ```Subir proyecto```. Seleccionar el archivo ```overleaf.zip``` ubicado en este directorio. 