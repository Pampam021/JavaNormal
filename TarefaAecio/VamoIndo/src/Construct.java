public class Construct {
        private float val1=0;
        private float val2=0;
        //construtor abaixo
    
        public Construct(float pesoO, float altura) {
            this.val1 = pesoO;
            this.val2 = altura;
        }
        public void retorno(){
            if (this.val1/((this.val2*this.val2)/10000) <18.5){
                System.out.println("abaixo do peso, seu palito de dente, seu cosplay de gaspar");
            }else if (this.val1/((this.val2*this.val2)/10000) >=18.5 && (this.val1/((this.val2*this.val2)/10000)) < 25){
                System.out.println("no peso ideal, atrás do shape?");   
            }else if (this.val1/((this.val2*this.val2)/10000) >=25 && (this.val1/((this.val2*this.val2)/10000)) < 30){
                System.out.println("sobrepeso\nmais do q deve, segura a onda aí");
            }else if (this.val1/((this.val2*this.val2)/10000) >=30 && (this.val1/((this.val2*this.val2)/10000)) < 35){
                System.out.println("obeso lvl 1\ntá comendo dmais, para com isso aí senão tu vai ficar redondo igual o bicho da michelin");
            }else if (this.val1/((this.val2*this.val2)/10000) >=35 && (this.val1/((this.val2*this.val2)/10000)) < 40){
                System.out.println("obeso lvl 2\neu até ia ficar com pena, mas isso dá é dó em");
            }else if (this.val1/((this.val2*this.val2)/10000) >=40){
                System.out.println("peso planeta\nCORRE Q @THAIS.PLODINDO");
            }
        }
        public void natacao(){
            if (this.val1 <5){
                System.out.println("suma daqui minoria");
            }else if (this.val1 >=5 && this.val1<8){
                System.out.println("infantil A");
            }else if (this.val1 >=8 && this.val1<11){
                System.out.println("infantil B");
            }else if (this.val1 >=11 && this.val1<14){
                System.out.println("juvenil A usuário de fortnite");
            }else if (this.val1 >=14 && this.val1<18){
                System.out.println("juvenil Baborrescente");
            }else if (this.val1 >=18){
                System.out.println("Sênior ou sensei, sla, some daqui também");
            }
        }
        public void Lucro(){
            float oi =this.val1;
            if (oi <10){
                this.val2 = this.val1+(this.val1 /100 * 70);
                System.out.println("Lucro esperado de 70%\n valor de venda deve ser no mínimo de "+this.val2);
            }else if (oi >=10 && oi<30){
                this.val2 = this.val1+(this.val1 /100 * 50);
                System.out.println("Lucro esperado de 50%\n valor de venda deve ser no mínimo de "+this.val2);
            }else if (oi >=30 && oi<50){
                this.val2 = this.val1+(this.val1 /100 * 40);
                System.out.println("Lucro esperado de 40%\n valor de venda deve ser no mínimo de "+this.val2);
            }else if (oi >=50){
                this.val2 = this.val1+(this.val1 /100 * 30);
                System.out.println("Lucro esperado de 30%\n valor de venda deve ser no mínimo de "+this.val2);
            }
            }
        
        public float getVal1() {
            return val1;
        }
    
        public void setVal1(float pesoO) {
            this.val1 = pesoO;
        }
    
        public float getVal2() {
            return val2;
        }
    
        public void setVal2(float altura) {
            this.val2 = altura;
        }
    }
    

