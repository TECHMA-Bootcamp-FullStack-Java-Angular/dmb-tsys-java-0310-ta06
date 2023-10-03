export const lessons = [
  {
    numLessons: 2,
    issue: 'Java SE',
    day: 8,
    msg: 'Si no vas hasta el final ¿por qué empezar? ',
    myProgress: '🥚>🐣',

    exercise: [
      {
        numExercise: 1,
        title: '',
        description:`<p>Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. </p>
        <p>Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área.</p><p> Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla.</p>
        
        Aquí te mostramos que necesita cada figura:
        
        + Circulo: (radior2)*PI
        - (base * altura) / 2`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_01/Main_EJ01.java',
        urlPG: '',
      },
      {
        numExercise: 2,
        title: '',
        description: `<p>Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
        nosotros le pasaremos por teclado.</p> <p class="mt-0">Crea un método donde pasamos como parámetros entre
        que números queremos que los genere, podemos pedirlas por teclado antes de generar los
        números.</p> <p> Este método devolverá un número entero aleatorio.</p><p>Muestra estos números por
        pantalla.<p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_02/Main_EJ02.java',
        urlPG: ''
      },
      {
        numExercise: 3,
        title: '',
        description: `<p>Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
        nosotros le pasaremos por teclado.</p><p> Crea un método donde pasamos como parámetros entre
        que números queremos que los genere, podemos pedirlas por teclado antes de generar los
        números. </p><p>Este método devolverá un número entero aleatorio. Muestra estos números por
        pantalla.<p>
        
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_03/Main_EJ03.java',
        urlPG: ''
      },
      {
        numExercise: 4,
        title: '',
        description: `Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
        realizara mediante un método al que le pasamos el número como parámetro.<p> Para calcular
        el factorial, se multiplica los números anteriores hasta llegar a uno.</p><p> Por ejemplo, si
        introducimos un 5, realizara esta operación 5*4*3*2*1=120.</p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_04/Main_EJ04.java',
        urlPG: ''
      },
      {
        numExercise: 5,
        title: '',
        description:`Crea una aplicación que nos convierta un número en base decimal a binario.<p> Esto lo
        realizara un método al que le pasaremos el numero como parámetro, devolverá un String
        con el numero convertido a binario.</p><p> Para convertir un numero decimal a binario, debemos
        dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que
        no se pueda dividir mas, el resto que obtengamos de cada división formara el numero
        binario, de abajo a arriba.</p>`, 
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_05/Main_EJ05.java',
        urlPG: ''
      },
      {
        numExercise: 6,
        title: '',
        description: `Crea una aplicación que nos cuente el número de cifras de un número entero positivo
        (hay que controlarlo) pedido por teclado.<p> Crea un método que realice esta acción, pasando
        el número por parámetro, devolverá el número de cifras.</p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_06/Main_EJ06.java',
        urlPG: ''
      },
      {
        numExercise: 7,
        title: '',
        description: `Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
        moneda, estas pueden ser a dolares, yenes o libras. <p>El método tendrá como parámetros, la
        cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
        mostrara un mensaje indicando el cambio (void)</p>.
        
        El cambio de divisas son:
        
        <li> 0,86 Libras es un1€ </li>
        <li> 1.28611 Dolares es un 1€ </li>
        <li> 129.852 Yenes es un 1€ </li>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_07/Main_EJ07.java',
        urlPG: ''
      },
      {
        numExercise: 8,
        title: '',
        description: `Crea un array de 10 posiciones de números con valores pedidos por teclado. <p> Muestra por
        consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
        otro para mostrar.</p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_08/Main_EJ08.java',
        urlPG: ''
      },
      {
        numExercise: 9,
        title: '',
        description:`Crea un array de números donde le indicamos por teclado el tamaño del array,
        rellenaremos el array con números aleatorios entre 0 y 9.<p>Al final muestra por pantalla el
        valor de cada posición y la suma de todos los valores.</p>
        
        Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
        números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
        array.`, 
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_09/Main_EJ09.java',
        urlPG: ''
      },
      {
        numExercise: 10,
        title: '',
        description: `Crea un array de números de un tamaño pasado por teclado, el array contendrá
        números aleatorios primos entre los números deseados, por último nos indicar cual es el
        mayor de todos.
        
        <p>Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
        métodos que necesites.</p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_10/Main_EJ10.java',
        urlPG: ''
      },
      {
        numExercise: 11,
        title: '',
        description: `Crea dos arrays de números con la dimensión pasada por teclado.
        Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
        reasigna los valores del segundo array con valores aleatorios.
        
        <p>Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
        con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.</p>
        
        Por último, muestra el contenido de cada array.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_11/Main_EJ11.java',
        urlPG: ''
      },
      {
        numExercise: 12,
        title: '',
        description: `Crea un array de números de un tamaño pasado por teclado, el array contendrá
        números aleatorios entre 1 y 300 y mostrará aquellos números que acaben en un dígito que
        nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
        estos deben guardarse en un nuevo array.
        
        <p>Por ejemplo, en un array de 10 posiciones le indicamos mostrar los números acabados en 5,
        podría salir 155, 25, etc.</p>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_12/Main_EJ12.java',
        urlPG: ''
      },
    ]
  },
]


 
