#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <locale.h>

#define e 2.718281828459045235360287
#define PI 3.14159265359

//DECLARAÇÃO
 double fatorial(int a);
 double stirling(int b);
 short primo(int p);
 void golbach(int p);
 int feliz(long int n);



 double stirling(int b){ //FUNÇÃO
 double fato,aux,aux2;

     aux=2*PI*b;
     aux2=b/e;
    fato=(sqrt(aux)*(pow(aux2,b)));

 return(fato);
}


 double fatorial(int a){//FUNÇÃO
 int i; double fat=1.0;

  for(i=1;i<=a;i++){
    fat=fat*i;
  }

 return(fat);

}

short primo(int p){//FUNÇÃO

    int i;

    if(p==2)return(1);
    if(p%2==0)return(0);

    for(i=3;i<p;i=i+2){
        if(p%i==0)return(0);
    }
    return(1);
}


void Golbach(int P){//FUNÇÃO
int p1, lim = P/2;

for (p1=2; p1 <= P; p1++)
    if ( primo(p1) && (P-p1) !=1 &&primo(P-p1) )
       printf("(%i,%i)\n\n", p1, P-p1);


return;
}


int feliz(long int n){//FUNÇÃO

    long int soma=0,aux;


  while(n/10!=0){
      aux=n;
      soma=0;
    while(aux!=0){
      soma=soma+((aux%10)*(aux%10));
      aux=aux/10;
      n=soma;
  }

}

 if(n==1)return(1); // É FELIZ
 else return(0); // NÃO É FELIZ
 }




int main(void){ //MAIN
    setlocale(LC_ALL,"portuguese");
    int k,p,i,x,a,b,j,l=10;
    float erro,errof;

    printf("TPP-03-Funções   Gabriel Cecon Carlsen\n\n");

    while(x!=0){
    printf("\n");
    printf("        MENU DE FUNÇÕES       *Pressione 0 para sair\n\n");
    printf("1. Stirling\n");
    printf("2. Conjectura de Golbach [Quaisquer N (4<=N<=1000)]\n");
    printf("3. Conjectura de Golbach [Quaisquer N PAR (4<=N<=1000)]\n");
    printf("4. Números felizes\n");
    printf("5. Primos gêmeos\n\n");
    printf("Escolha uma função a ser computada: ");
    scanf("%i",&x);



    switch(x){

        case 0: break;

        case 1: printf("\n\n");

                for(k=1;k<=30;k++){
                 erro=(stirling(k)*100)/fatorial(k);
                 errof=100-erro; //erro final
                  if(errof<0)errof=0;

                   printf("N:%i  Fatorial:%.2lf  Stirling:%.1lf  Erro:%.2f%%\n\n",k,fatorial(k),stirling(k),errof);
                 };break;


        case 2: printf("\n\n");
                printf("Todos os pares de primos cuja SOMA seja igual a [n]\n");
                printf("n QUALQUER, no intervalo [4<=n<=1000]\n\n");

              for (p=4; p <=1000 ; p++){
              printf("    #[%i]#\n\n", p);
              Golbach(p);
              };break;


        case 3: printf("\n\n");
                printf("Todos os pares de primos cuja SOMA seja igual a [n]\n");
                printf("n PAR, no intervalo [4<=n<=1000]\n\n");

            for (p=4;p <=1000; p=p+2){
                 printf("    #[%i]#\n\n", p);
                 Golbach(p);
               };break;


        case 4: printf("\n\n");
                printf("Todos os números felizes no intervalo [4,1000]\n\n");
                for(i=4;i<=1000;i++){
                    if(feliz(i))printf("%i\n",i);
               };break;

        case 5:  printf("\n\n");
                 printf("Introduza um intervalo[a,b]: ");
                scanf("%i%i",&a,&b);

            for(i=a;i<=b;i++){
               if(i==0 || i==1 || i==2)continue;
                if(primo(i)){
                 j=i+2;
                  if(primo(j)){
                   if(j>b)break;
                printf("(%i %i)\n",i,j);
            }
        }

   };break;


     default: printf("\nERRO FUNÇÃO INEXISTENTE !!!\n");
}


    }



  printf("\n\n(FIM DO PROGRAMA)\n");
  printf("\n\n\n");
  system("Pause");
  return(0);
}
