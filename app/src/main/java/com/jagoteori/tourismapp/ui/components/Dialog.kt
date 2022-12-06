package com.jagoteori.tourismapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jagoteori.tourismapp.ui.theme.BlueColor
import com.jagoteori.tourismapp.ui.theme.WhiteColor
import com.jagoteori.tourismapp.ui.theme.poppinsFamily

@Composable
fun DialogScreen(modifier: Modifier, dialogState: Boolean, onDismissRequest: () -> Unit) {
    if (dialogState) {
        Dialog(
            onDismissRequest = onDismissRequest,
            content = {
                Card(
                    elevation = 8.dp,
                    modifier = modifier
                        .width(300.dp)
                        .height(150.dp),

                    shape = RoundedCornerShape(18.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = modifier.fillMaxSize(),
                    ) {
                        Text(
                            text = "Coming Soon..!!",
                            fontSize = 22.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = poppinsFamily,
                            modifier = modifier
                                .weight(1f)
                                .wrapContentSize(Alignment.Center)
                        )
                        Spacer(modifier = modifier.height(12.dp))
                        Button(
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = BlueColor,
                                contentColor = WhiteColor
                            ),
                            elevation = ButtonDefaults.elevation(
                                defaultElevation = 0.dp,
                                pressedElevation = 0.dp,
                                disabledElevation = 0.dp
                            ),
                            modifier = modifier
                                .width(120.dp)
                                .height(45.dp), onClick = onDismissRequest
                        ) {
                            Text(
                                text = "Close", color = WhiteColor,
                                fontWeight = FontWeight.Medium,
                                fontFamily = poppinsFamily,
                                fontSize = 14.sp,
                            )
                        }
                        Spacer(modifier = modifier.height(12.dp))
                    }
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        )
    }
}