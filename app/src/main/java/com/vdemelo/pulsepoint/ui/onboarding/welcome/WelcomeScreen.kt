package com.vdemelo.pulsepoint.ui.onboarding.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vdemelo.pulsepoint.R
import com.vdemelo.pulsepoint.ui.nav.NavRoutes

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(64.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
        )
        Image(
            modifier = Modifier
                .size(160.dp)
                .padding(8.dp),
            painter = painterResource(id = R.drawable.placeholder),
            contentDescription = "placeholder"
        )

        Text(text = "Bem-vindo", textAlign = TextAlign.Center)

        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(
                onClick = { navController.navigate(NavRoutes.LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .padding(horizontal = 32.dp)
            ) {
                Text(text = "Entrar", textAlign = TextAlign.Center)
            }

            Button(
                onClick = { navController.navigate(NavRoutes.SIGNUP) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .padding(horizontal = 32.dp)
            ) {
                Text(text = "Cadastre-se", textAlign = TextAlign.Center)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun WelcomePreview() {
    WelcomeScreen()
}
