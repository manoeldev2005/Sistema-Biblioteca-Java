����   @ a  "com/java/sistema/biblioteca/Livros  java/lang/Object numLivro I nome Ljava/lang/String; autor editora pratileiras )Lcom/java/sistema/biblioteca/Pratileiras; leia Ljava/util/Scanner; <init> c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/java/sistema/biblioteca/Pratileiras;)V Code
     ()V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	  !  	  #  	  %  	  ' 	 	  ) 
 	  +   LineNumberTable LocalVariableTable this $Lcom/java/sistema/biblioteca/Livros; getNumLivro ()I setNumLivro (I)V getNome ()Ljava/lang/String; setNome (Ljava/lang/String;)V getAutor setAutor 
getEditora 
setEditora toString > java/lang/StringBuilder @ 
Número Livro: 
 = B  7
  D 0 1
 = F G H append (I)Ljava/lang/StringBuilder; J 
Nome do livro: 
 = L G M -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  O 4 5 Q 
Autor: 
  S 8 5 U 

Editora: 
  W : 5 Y 

Localização do Livro: 
 = [ G \ -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 = ^ < 5 
SourceFile Livros.java !                 	     
                
        �     .*� *� Y� � �  *� "*,� $*-� &*� (*� *�    ,   "             !  '  -  -   >    . . /     .      .      . 	     . 
     .     0 1     /     *� "�    ,        -        . /    2 3     >     *� "�    ,   
       -        . /          4 5     /     *� $�    ,        -        . /    6 7     >     *+� $�    ,   
    "  # -        . /          8 5     /     *� &�    ,       & -        . /    9 7     >     *+� &�    ,   
    *  + -        . /      	    : 5     /     *� (�    ,       . -        . /    ; 7     >     *+� (�    ,   
    2  3 -        . /      
    < 5     �     D� =Y?� A*� C� EI� K*� N� KP� K*� R� KT� K*� V� KX� K*� *� Z� ]�    ,       7  8  9 ( : 4 ; @ 7 -       D . /    _    `