package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable

fun HomeScreen (modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Card(
            modifier = Modifier
                .align(
                    alignment = Alignment.TopEnd
                )
                .height(50.dp)
                .width(150.dp),
            shape = RoundedCornerShape
                (bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFF5722)
            )
        ) {}

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(1000.dp)
                .padding(20.dp)
                .padding(top = 200.dp)
        )
        {
            Column {
                Text(
                    text = stringResource(R.string.login),
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF5722)
                )

                Text(
                    text = stringResource(R.string.please_sign)
                )
            }

            Column (
                verticalArrangement = Arrangement.SpaceBetween
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(start = 15.dp, top = 15.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    label = {
                        Text(text = stringResource(R.string.email))
                    },
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.mail),
                            contentDescription = stringResource(id = R.string.email_icon),
                            modifier = Modifier.size(24.dp)
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(start = 15.dp, top = 15.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(text = stringResource(R.string.password))
                    },
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.lock),
                            contentDescription = stringResource(id = R.string.lock_icon),
                            modifier = Modifier.size(24.dp)
                        )
                    }
                )

                Button(onClick = {},
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(66.dp)
                        .width(120.dp)
                        .align(Alignment.End)
                        .padding(top = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF5722)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.sign_in),
                        fontSize = 16.sp
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
                Row (
                    modifier = Modifier
                        .padding(top = 45.dp)
                        .fillMaxWidth()
                        .height(30.dp),
                    horizontalArrangement = Arrangement.End
                )   {
                    Text(
                        text = stringResource(R.string.account)
                    )
                    Text(
                        text = stringResource(R.string.sign_up),
                        color = Color(0xFFFF5722),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 3.dp)
                    )

                }
            }
        }

        Card(
            modifier = Modifier
                .align(
                    alignment = Alignment.BottomStart
                )
                .height(50.dp)
                .width(150.dp),
            shape = RoundedCornerShape
                ( topEnd = 15.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFF5722)
            )
        ) {}
    }
}



@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}







