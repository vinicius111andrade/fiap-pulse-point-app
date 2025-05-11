package com.vdemelo.pulsepoint.ui.onboarding.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vdemelo.pulsepoint.ui.nav.NavRoutes

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Login", fontSize = 24.sp)
        TextField(
            modifier = Modifier.padding(vertical = 16.dp),
            value = "",
            onValueChange = {},
            label = { Text("Email") },
        )
        TextField(
            modifier = Modifier.padding(vertical = 16.dp),
            value = "",
            onValueChange = {},
            label = { Text("Senha") }
        )
        Button(
            onClick = { navController.navigate(NavRoutes.HOME) },
            modifier = Modifier
                .wrapContentSize()
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 32.dp)
        ) {
            Text(text = "Entrar", textAlign = TextAlign.Center)
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
