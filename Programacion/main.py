print("A continuación te enseñaré información sobre zoológicos")

print("Si quieres salir del programa pulsa 0, si no 1")
menu = input()
print()
while menu == '1':
  print()
  print("1.Animales terrestres")
  print("2.Animales acuáticos")
  print("3.Aves")
  print("4.Dinosaurios")
  print("5.Zoológicos en Málaga")
  print("0. Salir")
  print("Pulsa la opción que quieras")
  print()
  opcion = input()
  print()
  if opcion == '1':
      print("Los animales terrestres son animales que viven predominante o totalmente en la tierra, a diferencia de los animales acuáticos, que viven predominante o totalmente en el agua o los anfibios, que dependen de la combinación de hábitats terrestres y acuáticos.")
      print()
      print("¿Quieres saber más? Pulsa 1 para leer más, pulsa 0 para salir.")
      print()
      seguir = input()
      print()
      if seguir=='1':
        print() 
        print("Podemos clasificar a los animales terrestres en función del tipo de hábitat. Así, dentro de los animales terrestres encontramos que algunos viven en la superficie de la tierra, otros llevan una vida de tipo arborícola, otros viven en las rocas, mientras que otros llevan una vida subterránea. Sin embargo, la mayoría de animales terrestres, como las aves, ciertos insectos y mamíferos voladores, se desplazan por el aire. Finalmente, existen los que habitan en cuevas o cavernas.")
        print()
      else:
        menu = 0
  elif opcion == '2':
    print()
    print("Se denominan animales acuáticos,los animales que viven en el agua durante toda o la mayor parte de su vida. El término se aplica tanto a los que viven en Aguas dulces como en agua salada y mares.")
    print()
    print("¿Quieres saber más? Pulsa 1 para leer más, pulsa 0 para salir.")
    print()
    seguir = input()
    print()
    if seguir=='1':
      print()
      print("Se refiere a un animal que puede desarrollarse bajo el agua, los mamíferos acuáticos son una de las especies más raras de los animales acuáticos. Hay tipos de animales terrestres y acuáticos, entre ellos pingüinos, unos de los más interesantes ya que son aves que no pueden volar por su cuerpo pesado y alas, las cuales son rígidas y no flexibles. Como los demás animales voladores, existen aves que igual están adaptadas a la vida del agua, una de esas aves es el pájaro bobo el cual encuentra su comida zambulléndose en el agua. Se deben distinguir entre los animales que pueden aprovechar la respiración del oxígeno disuelto en el agua y los que necesitan respirar el oxígeno del aire.1​ Los animales acuáticos están distribuidos por toda la escala zoológica siendo casi exclusivamente acuáticos, los de grupos inferiores (protozoos), así como los espongiarios, los pólipos y los equinodermos, gran número de gusanos, la mayor parte de los moluscos y todos los braquiados y tunicados. De los artrópodos que viven en el agua, se encuentran casi todos los crustáceos, raramente los arácnidos y los insectos acuáticos, los zancudos.")
      print()
    else:
      menu = 0     
  elif opcion == '3':
    print()
    print("Los animales aéreos son aquellos que tienen la capacidad de volar y desplazarse por el aire. Esto no significa que vivan en este elemento sino que, combinan varios medios y territorios para desarrollarse y subsistir, pudiendo dormir y buscar alimento en la tierra y en el agua y desplazándose por el aire, por ejemplo.")
    print()
    print("¿Quieres saber más? Pulsa 1 para leer más, pulsa 0 para salir.")
    print()
    seguir = input()
    print()
    if seguir=='1':
      print()
      print("El desarrollo de esta habilidad se debe a sus alas, que son unas extremidades o apéndices que salen de su cuerpo y las cuales, a través de su movimiento les permiten volar. Todos los animales voladores tienen alas, aunque no todas son iguales, pudiendo presentar diferentes formas y estructuras, según el tipo de animal aéreo del que estemos hablando.")
      print()
    else:
      menu = 0
  elif opcion == '4':
    print()
    print("Los dinosaurios, del superorden Dinosauria, del griego δεινός deinós ‘terrible’ y σαῦρος sauros ‘lagarto’, ‘lagartos terribles’, son un grupo de saurópsidos diápsidos arcosaurios que aparecieron durante el período Triásico con distribución cosmopolita. Aunque el origen exacto y su diversificación temprana es tema de activa investigación, el consenso científico actual sitúa su origen entre 245 y 231 millones de años atrás, entre el Triásico Medio al Superior.")
    print()
    print("¿Quieres saber más? Pulsa 1 para leer más, pulsa 0 para salir.")
    print()
    seguir = input()
    print()
    if seguir=='1':
      print()
      print("Fueron los vertebrados terrestres dominantes durante 135 millones de años, desde el inicio del Jurásico, hace unos 200 millones de años, a partir de la extinción masiva del Triásico-Jurásico, hasta el final del Cretácico, hace 66 millones de años, cuando la mayoría de los grupos de dinosaurios se extinguieron durante la extinción masiva del Cretácico-Paleógeno que puso fin a la Era Mesozoica. El registro fósil indica que las aves evolucionaron a partir de dinosaurios terópodos durante el período Jurásico y, en consecuencia, muchos taxónomos consideran que las aves forman un subgrupo dentro de los dinosaurios.Algunas aves sobrevivieron a este acontecimiento, y sus descendientes continúan el linaje de los dinosaurios hasta nuestros días.Por lo tanto, los dinosaurios se pueden dividir en dinosaurios aviares, las aves en un sentido estricto, y los dinosaurios no aviares, todos extintos, que son todos dinosaurios distintos de las aves.")
      print()
    else:
      menu = 0
  elif opcion == '5':
    print()
    print("Pulsa el zoológico del que quieras más información")
    print("1.Selwo Aventura")
    print("2.Selwo Marina")
    print("3.Biopac Fuengirola")
    print("4.Sea Life Benalmádena")
    print("5.Mariposario de Benalmádena")
    print("0.Salir")
    print()
    zoologico = input()
    print()
    if zoologico == '1':
      print()
      print("Selwo Aventura, en Estepona, propone disfrutar de la naturaleza salvaje viviendo una gran expedición por diferentes territorios que trasladan a África para conocer su fauna más emblemática como son  el león, la jirafa, el hipopótamo, la cebra, el guepardo, la suricata… Y a otros continentes como Europa y Asia para descubrir especies únicas como el lince ibérico, el elefante asiático o el panda rojo.  El parque cuenta con actividades de aventura como tirolina, puentes colgantes o tiro con arco y completos programas de interacción como la exclusiva Visita Vip Obama, que debe su nombre al recorrido que hizo la familia del presidente de Estados Unidos en su visita a Selwo Aventura  en 2010; y  Safari Serengueti, un  recorrido en camión  todoterreno por la Reserva de los Lagos  para estar muy cerca de especies representativas de la fauna africana.  Si se desea prolongar la estancia, las propuestas son el Hotel Selwo Lodge, las Aulas de la Naturaleza y los Campamentos Infantiles.")
      print()
    elif zoologico == '2':
      print()
      print("Selwo Marina es un parque de animales y ocio que permite a los visitantes conocer de cerca fauna de todo el mundo y disfrutar de gran variedad de experiencias. La Exhibición de delfines y leones marinos ha sido diseñada para disfrutar y aprender a respetar a este gran embajador del mundo marino. Además, hay Exhibiciones de aves exóticas y charlas didácticas sobre las diferentes zonas y especies del parque, como la Amazonía, los Trópicos o el Bosque de los Saimiris. Los visitantes también tienen la posibilidad de escoger entre un completo programa de interacciones con las especies más carismáticas, con la posibilidad de Conocer a los pingüinos muy de cerca y participar en su alimentación, disfrutar de un Encuentro con delfines o el Baño con leones marinos o incluso una Visita VIP por todo el parque. Además, tienen la oportunidad de tener un recuerdo fotográfico con las especies más representativas.")
      print()
    elif zoologico == '3':
      print()
      print("BIOPARC Fuengirola abandera un nuevo modelo de zoo basado en el respeto a la naturaleza y la preservación de sus especies, un modelo que ya se ha convertido en referente a nivel europeo. Hablar de BIOPARC Fuengirola es referirse a un concepto diferente de zoo. Un parque zoológico en el que los animales conviven en una recreación de su hábitat natural que favorece su desarrollo a todos los niveles. Visitarlo es adentrarse en un auténtico documental sobre los más profundos bosques tropicales. BIOPARC Fuengirola se caracteriza, entre otras cosas, por su diseño arquitectónico denominado zoo-inmersión, que sumerge al visitante en el entorno del animal. Todo el parque está pensado para envolver a quien pasea por él en una recreación del hábitat de donde proceden los animales. Hay una solución de continuidad entre el espacio físico que ocupa el público y el que ocupa el animal con el objetivo de transmitir parte de la magia que supone recorrer el bosque y descubrir a sus habitantes. En total, hoy conviven en el zoo 200 especies diferentes y más de 1400 individuos.")
      print()
    elif zoologico == '4':
      print()
      print("Sea Life Benalmádena es un acuario situado en la Costa del Sol, España. Está localizado en un edificio de Eduardo Oria en la entrada al Puerto Deportivo de Benalmádena, frente a la torre vigía de Torre Bermeja y junto al centro comercial Marina Shopping. Fue inaugurado en 1995 como centro conservacionista y proteccionista de tiburones y más de 5.000 criaturas procedentes del Mediterráneo, Atlántico y las zonas tropicales del Índico, Pacífico y Mar Rojo, y las más representativas especies del Amazonas. Se compone de 25 acuarios divididos en 9 salas. La marca Sea Life pertenece al grupo Merlin Entertainments, que gestiona más de veinte acuarios similares en Europa.")
      print()
    elif zoologico == '5':
      print()
      print("Estamos en plena Costa del Sol y a sólo 20 minutos de Málaga. En un espectacular templo tailandés podrás pasear entre más de 1.500 mariposas exóticas de todo el mundo que vuelan en libertad en un paraíso tropical entre cascadas y flores. Podrás observar como nacen, cómo se reproducen y disfrutar aprendiendo muchas cosas sobre estos maravillosos insectos.")
      print()
    else:
      menu = 0
  else:
    menu = 0
print("El programa ha finalizado")



