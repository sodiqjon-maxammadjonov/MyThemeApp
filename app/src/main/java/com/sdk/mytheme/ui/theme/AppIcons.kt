package com.sdk.mytheme.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.sdk.mytheme.R

object AppIcons {

    // Theme Icons
    val Sun: @Composable () -> Painter = { painterResource(id = R.drawable.sun) }
    val Moon: @Composable () -> Painter = { painterResource(id = R.drawable.moon) }

    // Feature Icons
    val Brush: @Composable () -> Painter = { painterResource(id = R.drawable.ic_brush) }
    val Architecture: @Composable () -> Painter = { painterResource(id = R.drawable.ic_architecture) }
    val Palette: @Composable () -> Painter = { painterResource(id = R.drawable.ic_palette) }
    val Animation: @Composable () -> Painter = { painterResource(id = R.drawable.ic_animation) }
    val Speed: @Composable () -> Painter = { painterResource(id = R.drawable.ic_speed) }

    // Navigation Icons
//    val Home: @Composable () -> Painter = { painterResource(id = R.drawable.ic_home) }
//    val Profile: @Composable () -> Painter = { painterResource(id = R.drawable.ic_profile) }
//    val Settings: @Composable () -> Painter = { painterResource(id = R.drawable.ic_settings) }
//    val Search: @Composable () -> Painter = { painterResource(id = R.drawable.ic_search) }
//    val Notification: @Composable () -> Painter = { painterResource(id = R.drawable.ic_notification) }
//
//    // Action Icons
//    val Add: @Composable () -> Painter = { painterResource(id = R.drawable.ic_add) }
//    val Edit: @Composable () -> Painter = { painterResource(id = R.drawable.ic_edit) }
//    val Delete: @Composable () -> Painter = { painterResource(id = R.drawable.ic_delete) }
//    val Share: @Composable () -> Painter = { painterResource(id = R.drawable.ic_share) }
//    val Favorite: @Composable () -> Painter = { painterResource(id = R.drawable.ic_favorite) }
//
//    // Status Icons
//    val Success: @Composable () -> Painter = { painterResource(id = R.drawable.ic_success) }
//    val Warning: @Composable () -> Painter = { painterResource(id = R.drawable.ic_warning) }
//    val Error: @Composable () -> Painter = { painterResource(id = R.drawable.ic_error) }
//    val Info: @Composable () -> Painter = { painterResource(id = R.drawable.ic_info) }
}
