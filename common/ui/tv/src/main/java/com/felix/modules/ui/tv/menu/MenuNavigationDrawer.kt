package com.felix.modules.ui.tv.menu

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.Button
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.NavigationDrawer
import androidx.tv.material3.Text

data class MenuNavigation(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    @DrawableRes val iconDrawable: Int = -1,
    val iconUrl: String = "",
)

@OptIn(ExperimentalTvMaterial3Api::class)
@Preview
@Composable
fun MenuNavigationDrawer() {
    NavigationDrawer(drawerContent = {
        Column {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Home")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Phim")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Tv")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Setting")
            }
        }
    }) {

    }
}
