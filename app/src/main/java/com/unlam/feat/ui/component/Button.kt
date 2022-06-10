package com.unlam.feat.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import com.unlam.feat.ui.theme.PurpleLight
import java.util.*

@Composable
fun FeatOutlinedButton(
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = PurpleLight,
    border: BorderStroke = BorderStroke(2.dp, contentColor),
    textContent: String,
    textColor: Color = contentColor,
    textAlign: TextAlign = TextAlign.Center,
    textWeight: FontWeight = FontWeight.Bold,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = {
            onClick()
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 5.dp)
            .height(50.dp),
        shape = shape,
        border = border,
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
        )
    ) {
        Text(
            text = textContent.uppercase(),
            color = textColor,
            textAlign = textAlign,
            fontWeight = textWeight,
            style = MaterialTheme.typography.h6.copy(
                color = textColor
            )
        )
    }
}