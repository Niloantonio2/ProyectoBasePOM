package co.com.templay.pom.stepdefinitions;

import co.com.templay.pom.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Dado("que el usuario navega a la pagina de inicio de sesion")
    public void queElUsuarioNavegaALaPaginaDeInicioDeSesion() throws InterruptedException {
    Thread.sleep(5000);

    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales(io.cucumber.datatable.DataTable dataTable) {
        loginSteps.inicioDeSesion(dataTable.row(0).get(0),dataTable.row(0).get(1));


    }
    @Entonces("deberia ver la pagina principal")
    public void deberiaVerLaPaginaPrincipal() {

    }

}
