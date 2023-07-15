//package com.dyp.javaTraining.ShoppingCart;
import java.util.Scanner;
class Clothing
{
	Scanner sc=new Scanner(System.in);
	public void displayname(){
		System.out.println("1)Men's Wear\n2)Women's Wear\n3)Kid's Wear");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			Men();
			break;
		}
		case 2:{
			Women();
			break;
		}
		case 3 :{
			Kids();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}

	}

	public void Men(){
		System.out.println("Select Category and enter choice");
		System.out.println("1)Tshirts\n2)Shirts3)Trousers");
		int a=sc.nextInt();
		switch(a){
		case 1 :{
			Tshirts();
			break;
		}
		case 2:{
			Shirts();
			break;
		}
		case 3 :{
			Trousers();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}

	}


	public  void Tshirts(){
		System.out.println("1)Lee\n2)Allen Solly\n3)Puma\n4)Levis\n5)Jack and Jones");
		int Brandchoice=sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			Lee();
			break;
		}
		case 2:{
			Allen();
			break;
		}
		case 3 :{
			Puma();
			break;
		}
		case 4 :{
			Levis();
			break;
		}
		case 5:{
			JackJones();
			break;
		}
		default:
			System.out.println("please enter valid choice");
			break;
		}


	}
	public void Lee(){
		System.out.println("Tshirt 1");
		System.out.println("Tshirt 2");
		System.out.println("Tshirt 3");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}



	}
	public void Allen(){
		System.out.println("Tshirt 1");
		System.out.println("Tshirt 2");
		System.out.println("Tshirt 3");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}

	}
	public void Puma(){
		System.out.println("Tshirt 1");
		System.out.println("Tshirt 2");
		System.out.println("Tshirt 3");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}



	}
	public  void Levis(){ System.out.println("Tshirt 1");
	System.out.println("Tshirt 2");
	System.out.println("Tshirt 3");
	System.out.println("Enter your choice");
	int Tshirtchoice=sc.nextInt();
	System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
	int value=sc.nextInt();
	if(value==1){
		System.out.println("Thank you for purchasing! Have a good day!");
	}
	else if(value==2){
		System.out.println("Continue Shopping");
		Men();
	}
	else{
		System.out.println("");
	}


	}
	public  void JackJones(){ System.out.println("Tshirt 1");
	System.out.println("Tshirt 2");
	System.out.println("Tshirt 3");
	System.out.println("Enter your choice");
	int Tshirtchoice=sc.nextInt();
	System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
	int value=sc.nextInt();
	if(value==1){
		System.out.println("Thank you for purchasing! Have a good day!");
	}
	else if(value==2){
		System.out.println("Continue Shopping");
		Men();
	}
	else{
		System.out.println("");
	}

	}

	public void Shirts(){
		System.out.println("1)Peter England\n2)Accox\n3)Diverse");
		int Brandchoice=sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			Peter();
			break;
		}
		case 2:{
			Accox();
			break;
		}
		case 3 :{
			Diverse();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}

	}
	public void Peter(){
		System.out.println("shirt 1");
		System.out.println("shirt 2");
		System.out.println("shirt 3");
		System.out.println("Enter your choice");
		int shirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}

	}


	public void Accox(){

		System.out.println("shirt 1");
		System.out.println("shirt 2");
		System.out.println("shirt 3");
		System.out.println("Enter your choice");
		int shirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}



	}
	public void Diverse(){

		System.out.println("shirt 1");
		System.out.println("shirt 2");
		System.out.println("shirt 3");
		System.out.println("Enter your choice");
		int shirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}

	}


	public void Trousers(){
		System.out.println("1)Peter England\n2)Raymond\n3)AllenSolly");
		int B=sc.nextInt();
		switch(B){
		case 1 :{
			PEngland();
			break;
		}
		case 2:{
			Raymond();
			break;
		}
		case 3 :{
			AllenSolly();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}


	}



	public void PEngland(){

		System.out.println("Trouser 1");
		System.out.println("Troser 2");
		System.out.println("Trouser 3");
		System.out.println("Enter your choice");
		int Trouserchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}

	}
	public void Raymond(){
		System.out.println("Trouser 1");
		System.out.println("Troser 2");
		System.out.println("Trouser 3");
		System.out.println("Enter your choice");
		int Trouserchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}


	}

	public void AllenSolly(){

		System.out.println("Trouser 1");
		System.out.println("Troser 2");
		System.out.println("Trouser 3");
		System.out.println("Enter your choice");
		int Trouserchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Men();
		}
		else{
			System.out.println("");
		}    }

	public void Women(){
		System.out.println("Select Category and enter choice");
		System.out.println("1)Saree\n2)Kurtis");
		int a=sc.nextInt();
		switch(a){
		case 1 :{
			Saree();
			break;
		}
		case 2:{
			Kurtis();
			break;
		}
		default:
			System.out.println("please enter valid choice");
			break;
		}

	}
	public void Saree(){
		System.out.println("1)sabyasachi\n2)FabIndia");
		int Brandchoice=sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			sabyasachi();
			break;
		}

		case 2:{
			FabIndia();
			break;
		}
		default:
			System.out.println("please enter valid choice");
			break;
		}

	}
	public  void  sabyasachi(){
		System.out.println("Saree 1");
		System.out.println("Saree 2");
		System.out.println("Saree 3");
		System.out.println("Enter your choice");
		int Sareechoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Women();
		}
		else{
			System.out.println("");
		}    
	}
	public void FabIndia(){
		System.out.println("Saree 1");
		System.out.println("Saree 2");
		System.out.println("Saree 3");
		System.out.println("Enter your choice");
		int Sareechoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Women();
		}
		else{
			System.out.println("");
		}   
	}



	public void Kurtis(){
		System.out.println("1)Aurelia\n2)libas");
		int Brandchoice=sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			Aurelia();
			break;
		}
		case 2:{
			libas();
			break;
		}
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	public void  Aurelia(){
		System.out.println("Kurti 1");
		System.out.println("Kurti 2");
		System.out.println("Kurti 3");
		System.out.println("Enter your choice");
		int Sareechoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Women();
		}
		else{
			System.out.println("");
		}   
	}
	public void libas(){
		System.out.println("Kurti 1");
		System.out.println("Kurti 2");
		System.out.println("Kurti 3");
		System.out.println("Enter your choice");
		int Sareechoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Women();
		}
		else{
			System.out.println("");
		}    }


	public void Kids(){System.out.println("Select Category and enter choice");
	System.out.println("1)tshirtspants\n2)Frocks");
	int a=sc.nextInt();
	switch(a){
	case 1 :{
		tshirtspants();
		break;
	}

	default:
		System.out.println("please enter valid choice");
		break;
	}

	}
	public void tshirtspants(){
		System.out.println("1)Indistar\n2)Jingo");
		int Brandchoice=sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			Indistar();
			break;
		}

		case 2:{
			Jingo();
			break;
		}
		default:
			System.out.println("please enter valid choice");
			break;
		}

	}
	public  void Indistar(){
		System.out.println("Cloth 1");
		System.out.println("Cloth 2");
		System.out.println("Cloth 3");
		System.out.println("Enter your choice");
		int Clothchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Kids();
		}
		else{
			System.out.println("");
		}
	}

	public void Jingo(){
		System.out.println("Cloth 1");
		System.out.println("Cloth 2");
		System.out.println("Cloth 3");
		System.out.println("Enter your choice");
		int Clothchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			Kids();
		}
		else{
			System.out.println("");
		}  
	}

}

class Electronics{
	Scanner sc =new Scanner(System.in);
	void display1(){
		
		System.out.println("1)Laptops\n2)Smart Phones\n3)Television");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			laptops();
			break;
		}
		case 2:{
			smartPhones();
			break;
		}
		case 3 :{
			television();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}

	}  public void laptops() {
		System.out.println("1)Asus\n2)HP\n3)Lenovo\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			asus();
			break;
		}
		case 2:{
			hp();
			break;
		}
		case 3 :{
		  lenovo();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void asus() {
		
		System.out.println("1.ASUS VivoBook 16X");
		System.out.println("2.ASUS ROG Strix G17");
		System.out.println("3.ASUS Vivobook 14");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			laptops();
		}
		else{
			System.out.println("");
		}
		
		
	}
	void hp() {

		System.out.println("1.HP 14s");
		System.out.println("2.HP 15s");
		System.out.println("3.HP Elitebook Laptop");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			laptops();
		}
		else{
			System.out.println("");
		}
		
		
	}
	void lenovo() {

		System.out.println("1.Lenovo Ideapad slim 3");
		System.out.println("2.Lenovo Ideapad Gaming");
		System.out.println("3.Lenovo Yoga slim 7");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			laptops();
		}
		else{
			System.out.println("");
		}
		
		
		
	}
	public void smartPhones() {
		System.out.println("1)Redmi\n2)Samsung\n3)OnePlus\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			redmi();
			break;
		}
		case 2:{
			samsung();
			break;
		}
		case 3 :{
		  onePlus();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void redmi() {
		System.out.println("1.Redmi note 8");
		System.out.println("2.Redmi note 9 pro");
		System.out.println("3.Redmi note 10");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			smartPhones();
		}
		else{
			System.out.println("");
		}
	}
	void samsung() {
		System.out.println("1.samsung Galaxy M32");
		System.out.println("2.samsung Galaxy M13");
		System.out.println("3.samsung Galaxy M53");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			smartPhones();
		}
		else{
			System.out.println("");
		}
	}
	void onePlus() {
		System.out.println("1.Oneplus 5");
		System.out.println("2.Oneplus 10T");
		System.out.println("3.Oneplus Nord 2T");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			smartPhones();
		}
		else{
			System.out.println("");
		}
	}
	public void television() {
		System.out.println("1)Onida\n2)MI\n3)Sony\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			onida();
			break;
		}
		case 2:{
			mi();
			break;
		}
		case 3 :{
		  sony();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void onida() {
		System.out.println("1.Onida 80cm");
		System.out.println("2.Onida 138cm");
		System.out.println("3.Onida 107cm");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			television();
		}
		else{
			System.out.println("");
		}
	}
	void mi() {
		System.out.println("1.mi 80cm");
		System.out.println("2.mi 108cm");
		System.out.println("3.mi 125.7cm");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			television();
		}
		else{
			System.out.println("");
		}
	}
	void sony(){
		System.out.println("1.Sony Bravia 164cm");
		System.out.println("2.Sony Bravia 126cm");
		System.out.println("3.Sony Bravia 108cm");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			television();
		}
		else{
			System.out.println("");
		}
	}

}
class Cosmetics{
	Scanner sc =new Scanner(System.in);
	void display2(){
		
		System.out.println("1)Compact Powder\n2)Lipstick\n3)Kajal");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			compactPowder();
			break;
		}
		case 2:{
			lipstick();
			break;
		}
		case 3 :{
			kajal();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}

	}  public void compactPowder() {
		System.out.println("1)Lakme\n2)twofaced\n3)Maybelline\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			lakme();
			break;
		}
		case 2:{
			twoFaced();
			break;
		}
		case 3 :{
		  maybelline();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void lakme() {
		
		System.out.println("1.Lakme Radiance Complexion ");
		System.out.println("2.Natural Pearl");
		System.out.println("3.Intense Whitening");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			compactPowder();
		}
		else{
			System.out.println("");
		}
		
		
	}
	void twoFaced() {

		System.out.println("1.Ultime Pro Xpert cover ");
		System.out.println("2.Ultime pro mineral loose powder");
		System.out.println("3.Ultime pro sundefense cc powder");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			compactPowder();
		}
		else{
			System.out.println("");
		}
		
	}
	void maybelline() {

		System.out.println("1.Fit me copact powder");
		System.out.println("2.face studio master");
		System.out.println("3.Matte Porelesspowder");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			compactPowder();
		}
		else{
			System.out.println("");
		}
		
		
		
	}
	public void lipstick() {
		System.out.println("1)Lakme1\n2)Maybelline1\n3)Insight\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			lakme1();
			break;
		}
		case 2:{
			maybelline1();
			break;
		}
		case 3 :{
		  insight();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void lakme1() {
		System.out.println("1.Lakme red velvet");
		System.out.println("2.Lakme Berry Base");
		System.out.println("3.Lakme Blush pink");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			lipstick();
		}
		else{
			System.out.println("");
		}
	}
	void maybelline1() {
		
		System.out.println("1.Maybelline Sensational Liquid Matte");
		System.out.println("2.Superstay creyon lipstick");
		System.out.println("3.Color sensational creamy lipstick");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			lipstick();
		}
		else{
			System.out.println("");
		}
	}
	void insight() {
		System.out.println("1.Insight non transfer lip color");
		System.out.println("2.Cosmetic matte lipstick");
		System.out.println("3.insight ultra smooth lipstick");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			lipstick();
		}
		else{
			System.out.println("");
		}
	}
	public void kajal() {
		System.out.println("1)Himalaya\n2)Lakme\n3)Mybelline\n");
		int Brandchoice= sc.nextInt();
		switch(Brandchoice){
		case 1 :{
			himalaya();
			break;
		}
		case 2:{
			lakme2();
			break;
		}
		case 3 :{
			maybelline2();
			break;
		}
		
		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void himalaya() {
		System.out.println("1.Herbal eye definer");
		System.out.println("2.Pure expression kajal black");
		System.out.println("3.Pro intense kajal");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			kajal();
		}
		else{
			System.out.println("");
		}
	}
	void lakme2() {
		System.out.println("1.Eyeconic kajal");
		System.out.println("2.Insta cool kajal");
		System.out.println("3.Deep black new iconic kajal");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			kajal();
		}
		else{
			System.out.println("");
		}
	}
	void maybelline2(){
		System.out.println("1.Maybelline super black kajal");
		System.out.println("2.Colossal kajal");
		System.out.println("3.Colossal kajal pencil");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			kajal();
		}
		else{
			System.out.println("");
		}
	}

}


class Grocery
{
	Scanner sc =new Scanner(System.in);
	void display3() {
		System.out.println("1)Foodgrains and oils\n2)Dairy \n3)Snack foods");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			foodGrains();
			break;
		}
		case 2:{
			dairy();
			break;
		}
		case 3 :{
			snackFoods();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}
		
	}
	
	void foodGrains() {
		System.out.println("1)sugar\n2)wheat\n3)Rice\n4)oil\n5)salt");
		int Brandchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display3();
		}
		else{
			System.out.println("");
		}
		
	}
	void dairy() {
		System.out.println("1)milk\n2)paneer\n3)butter\n4)cheese\n5)cow ghee");
		int Brandchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display3();
		}
		else{
			System.out.println("");
		}
	}
	void snackFoods() {
		System.out.println("1)Dark fantasy biscuit\n2)Britannia Bourbon\n3)Choco wafer rolls\n4)Kurkure masala munch\n5)popcorn");
		int Brandchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display3();
		}
		else{
			System.out.println("");
		}
	}
 }
class Furniture{
	Scanner sc = new Scanner(System.in);
	void display4() {
		System.out.println("1)Table\n2)Chairs \n3)Beds");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			tables();
			break;
		}
		case 2:{
			chairs();
			break;
		}
		case 3 :{
			beds();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void tables() {

		System.out.println("1)Furnico\n2)Deckup\n3)Hermoti");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			furnico1();
			break;
		}
		case 2:{
			deckup1();
			break;
		}
		case 3 :{
			hermoti1();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void furnico1() {
		System.out.println("1.Dining table");
		System.out.println("2.coffee table");
		System.out.println("3.study table");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void deckup1() {
		System.out.println("1.Dining table");
		System.out.println("2.coffee table");
		System.out.println("3.study table");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void hermoti1() {
		System.out.println("1.Dining table");
		System.out.println("2.coffee table");
		System.out.println("3.study table");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void chairs() {
		System.out.println("1)Furnico\n2)Deckup\n3)Hermoti");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			furnico2();
			break;
		}
		case 2:{
			deckup2();
			break;
		}
		case 3 :{
			hermoti2();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void furnico2() {
		System.out.println("1.Armchair");
		System.out.println("2.Office chair");
		System.out.println("3.Study table and chair");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void deckup2() {
		System.out.println("1.Armchair");
		System.out.println("2.Office chair");
		System.out.println("3.Study table and chair");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void hermoti2() {
		System.out.println("1.Armchair");
		System.out.println("2.Office chair");
		System.out.println("3.Study table and chair");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void beds() {
		System.out.println("1)Furnico\n2)Deckup\n3)Hermoti");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1 :{
			furnico3();
			break;
		}
		case 2:{
			deckup3();
			break;
		}
		case 3 :{
			hermoti3();
			break;
		}

		default:
			System.out.println("please enter valid choice");
			break;
		}
	}
	void furnico3() {
		System.out.println("1.Platform bed");
		System.out.println("2.Bunk bed");
		System.out.println("3.Adjustable bed");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void deckup3() {
		System.out.println("1.Platform bed");
		System.out.println("2.Bunk bed");
		System.out.println("3.Adjustable bed");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}
	}
	void hermoti3() {
		System.out.println("1.Platform bed");
		System.out.println("2.Bunk bed");
		System.out.println("3.Adjustable bed");
		System.out.println("Enter your choice");
		int Tshirtchoice=sc.nextInt();
		System.out.println("Do you want to 1)Purhase\n2)continue3)exit");
		int value=sc.nextInt();
		if(value==1){
			System.out.println("Thank you for purchasing! Have a good day!");
		}
		else if(value==2){
			System.out.println("Continue Shopping");
			display4();
		}
		else{
			System.out.println("");
		}	}
	
}
public class Shoppingcart1
{    /********** Home page **********/
	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome To Shopping Center ");
		System.out.println();
		System.out.println("***************");
		System.out.println("Press 1 for Clothing");
		System.out.println("Press 2 for Furniture");
		System.out.println("Press 3 for Electronics");		
		System.out.println("Press 4 for Cosmetics");
		System.out.println("Press 5 for Grocery");
		System.out.println();
		int m=sc.nextInt();

		Clothing c=new Clothing();
		Electronics e=new Electronics();
		Cosmetics cm=new Cosmetics();
		Grocery g=new Grocery();
		Furniture f=new Furniture();
		if (m==1) {
			c.displayname();
		}
		else if(m==3) {
			e.display1();
		}
		else if(m==4) {
			cm.display2();
		}
		else if(m==5) {
			g.display3();
		}
		else if(m==2) {
			f.display4();
		}
	}
}

