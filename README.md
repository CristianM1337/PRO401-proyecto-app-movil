# Evaluación Sumativa - Semana 3: Introducción a la Programación Java

Este repositorio contiene la resolución práctica de la actividad sumativa de la semana 3, enfocada en la compilación y ejecución de aplicaciones Java mediante línea de comandos (sin IDE), junto con el análisis de requerimientos para un caso de estudio logístico de e-commerce.

# 1. Descripción del Negocio

Diseño de una solución de software orientada a dispositivos móviles para una empresa distribuidora de alimentos. El núcleo del sistema (core) debe integrar un motor de cálculo dinámico para tarifas de despacho de última milla, condicionado por el subtotal del carrito de compras y la distancia geolocalizada del cliente.

# 2. Requerimientos Funcionales (RF)

Los siguientes requerimientos definen el comportamiento interno del sistema y sus reglas de negocio:

    RF01 - Autenticación de Usuarios: El sistema debe permitir el registro y acceso de usuarios clientes exclusivamente mediante el protocolo OAuth o validación de dominio utilizando cuentas de correo de Google (@gmail.com).

    RF02 - Restricción de Cobertura Logística: El motor de validación de direcciones debe denegar cualquier solicitud de despacho que supere un radio geográfico de 20 kilómetros desde el centro de distribución.

    RF03 - Cálculo Dinámico de Despacho: Al momento de procesar el checkout, el sistema calculará la tarifa de envío según la siguiente matriz de reglas:

        Tramo A: Si el subtotal de compra es >= $50.000, se habilita el servicio de despacho (costo $0).

        Tramo B: Si el subtotal de compra está entre $25.000 y $49.999, se aplicará un recargo de $150 por cada kilómetro de distancia.

        Tramo C: Si el subtotal de compra es < $25.000, se aplicará un recargo de $300 por cada kilómetro de distancia.

# 3. Requerimientos No Funcionales (RNF)

Los siguientes requerimientos definen los atributos de calidad de la arquitectura:

    RNF01 - Usabilidad y Plataforma: La interfaz de usuario debe estar diseñada de manera responsiva o desarrollada como aplicación nativa/híbrida, optimizando la experiencia UX/UI para su ejecución fluida en dispositivos móviles.

    RNF02 - Rendimiento: El cálculo del costo de envío en el carrito de compras debe ejecutarse con una latencia mínima (inferior a 2 segundos) para no afectar la tasa de conversión durante el proceso de pago.

    RNF03 - Seguridad de Datos: Toda la información personal y ubicación del usuario debe ser transmitida bajo protocolos seguros (HTTPS/TLS).

# 4. Historias de usuario

    Historia 1: Como cliente, quiero registrarme en la aplicación usando mi cuenta de Gmail para poder acceder a los servicios de compra de manera rápida y segura. Criterio de aceptación: El sistema valida el dominio @gmail.com e impide el registro con otros proveedores.

    Historia 2: Como cliente, quiero que el sistema calcule automáticamente el costo de mi envío en base a mi distancia y el monto de mi compra, para saber exactamente cuánto debo pagar. Criterio de aceptación: Si mi compra es de $30.000 y vivo a 10 km, el sistema agrega un cobro de envío de $1.500 al total.

# 5. Código Fuente y Compilación (Vehiculo.java)

El código fuente de la aplicación de consola se encuentra en el directorio `/src`. Este programa solicita y procesa las características técnicas de un vehículo, demostrando el uso de entrada estándar y variables de tipo primitivo (`String`, `double`, `int`).

# 6. Instrucciones de Ejecución

Para compilar y ejecutar el programa utilizando el JDK de JavaSE, ejecuta los siguientes comandos en tu terminal desde la ruta raíz del proyecto:

1. **Compilación:** Genera el *byte-code* (`.class`) interpretable por la JVM.
   cd src
   javac Vehiculo.java
2. **Ejecución:** Lanza la Máquina Virtual de Java.
   java Vehiculo