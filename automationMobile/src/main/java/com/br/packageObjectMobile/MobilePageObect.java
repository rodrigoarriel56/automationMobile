package com.br.packageObjectMobile;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.base.BaseScreen;
import suporte.FaceIdTest;
import suporte.Utils;


public class MobilePageObect extends BaseScreen {
	
	@SuppressWarnings("rawtypes")
	AppiumDriver driver;
	
	FaceIdTest faceid = new FaceIdTest();
	
	public MobilePageObect (AppiumDriver<MobileElement> driver) throws Exception {
		super(driver);

	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.TextView[@text='Abrir minha conta Midway']")
	public MobileElement btnAbrirMinhaContaMidway;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public MobileElement btnPermitir;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Entrar']")
	public MobileElement btnEntrar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CPF']")
	public MobileElement inputLabelCPF;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nome Completo']")
	public MobileElement inputLabelNomeCompleto;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextCpf;

	@AndroidFindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
	public MobileElement inputTextNomeCompleto;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continuar']")
	public MobileElement btnContinuar;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[1]")
	public MobileElement inputTexComoQuerSerChamado;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[2]")
	public MobileElement inputTexCelular;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[3]")
	public MobileElement inputTexEmail;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup//android.widget.EditText)[4]")
	public MobileElement inputTexDataNascimento;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]")
	public MobileElement touchId;
	
	//android.view.ViewGroup[2]

	public void clicarBotaoMinhaConta() throws InterruptedException {
		Thread.sleep(10000);
		btnAbrirMinhaContaMidway.click();
		Thread.sleep(1000);
		btnPermitir.click();
		Thread.sleep(1000); 

	}
	
	/* Metodo de clicar no botão Entrar da pagina inicial do App da Midway **/
	public void clicarBotaoEntrar() throws InterruptedException {
		Thread.sleep(1000);
		btnEntrar.click();
	}
	
	/* Metodo de preenchimento do campo CPF **/
	public void escreverCpf(String CPF) throws InterruptedException {

		Thread.sleep(1000);  
		inputTextCpf.sendKeys(CPF); 

	}

	public void clicarContinuar() throws InterruptedException {
		btnContinuar.click();
		Thread.sleep(1000);
	}

	public void escreverNome(String NomeCompleto) throws InterruptedException {
		Thread.sleep(1000);
		inputTextNomeCompleto.sendKeys(NomeCompleto);
		btnContinuar.click();
		Thread.sleep(1000);

	}

	public void escreverComoQuerSerChamado(String ComoQuerSerChamado) throws InterruptedException {

		inputTexComoQuerSerChamado.sendKeys(ComoQuerSerChamado);

	}

	public void escreverCelular(String Celular) throws InterruptedException {

		inputTexCelular.sendKeys(Celular);

	}

	public void escreverEmail(String Email) throws InterruptedException {

		inputTexEmail.sendKeys(Email);
	
	}

	public void escreverDataNascimento(String DataNascimento) throws Exception {

		inputTexDataNascimento.sendKeys(DataNascimento);
		Utils.swipeVerticalParaBaixo(); 
		btnContinuar.click(); 
	} 

	public void swipeScreenFaceId() throws Exception {
		
		Utils.swipeBiometriaFacial();
		btnPermitir.click();
		Thread.sleep(2000);
		btnContinuar.click(); 
		Thread.sleep(1000);
		touchId.click(); //botão da camera
		Thread.sleep(5000);
		btnContinuar.click(); 
		Thread.sleep(1000);
	}
	
	//Colocar a chamada da API de biomegtria
	
	public void senhaUsuario() throws Exception {
		
		
		

	}
}