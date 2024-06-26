����   = h
      java/lang/Object <init> ()V	  	 
   Pedido mesa LMesa;  java/util/ArrayList
  	     itens Ljava/util/List;  PedidoEmEspera
  	     estado LEstadoPedido;       java/util/List add (Ljava/lang/Object;)Z  " # $ stream ()Ljava/util/stream/Stream;   & ' ( applyAsDouble '()Ljava/util/function/ToDoubleFunction; * + , - . java/util/stream/Stream mapToDouble F(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream; 0 1 2 3 4 java/util/stream/DoubleStream sum ()D 6 7 8 9 : EstadoPedido 	getEstado ()Ljava/lang/String; 6 < = > proximoEstado (LPedido;)V 	Signature  Ljava/util/List<LItemCardapio;>; 	(LMesa;)V Code LineNumberTable adicionarItem (LItemCardapio;)V calcularTotal 	setEstado (LEstadoPedido;)V getMesa ()LMesa; getItens ()Ljava/util/List; "()Ljava/util/List<LItemCardapio;>; 
SourceFile Pedido.java BootstrapMethods R
 S T U V W "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; Y (Ljava/lang/Object;)D [
 \ ] ^ _ 4 ItemCardapio getPreco a (LItemCardapio;)D InnerClasses d %java/lang/invoke/MethodHandles$Lookup f java/lang/invoke/MethodHandles Lookup !               ?    @         A  B   H      *� *+� *� Y� � *� Y� � �    C       	  
 	       D E  B   (     *� +�  W�    C   
        F 4  B   1     *� � ! � %  � ) � / �    C         G H  B   "     *+� �    C   
        9 :  B   "     
*� � 5 �    C         =   B   '     *� *� ; �    C   
      
 !  I J  B        *� �    C       $  K L  B        *� �    C       ( ?    M  N    O P     Q  X Z ` b   
  c e g 