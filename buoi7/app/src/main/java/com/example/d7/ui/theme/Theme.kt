
package com.example.d7.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Màu xanh ngọc
private val TealPrimary = Color(0xFF0F766E)
private val TealSecondary = Color(0xFF14B8A6)
private val TealTertiary = Color(0xFF99F6E4)

// Giao diện sáng
private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = Color.White,

    secondary = TealSecondary,
    onSecondary = Color.White,

    tertiary = TealTertiary,
    onTertiary = Color(0xFF134E4A),

    background = Color(0xFFF0FDFA),
    onBackground = Color(0xFF1F2937),

    surface = Color.White,
    onSurface = Color(0xFF1F2937)
)

// Giao diện tối
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF5EEAD4),
    onPrimary = Color(0xFF134E4A),

    secondary = Color(0xFF2DD4BF),
    onSecondary = Color(0xFF134E4A),

    tertiary = Color(0xFF99F6E4),
    onTertiary = Color(0xFF134E4A),

    background = Color(0xFF0B1716),
    onBackground = Color(0xFFE5F5F2),

    surface = Color(0xFF132523),
    onSurface = Color(0xFFE5F5F2)
)

@Composable
fun D7Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    // Tắt dynamic color để giữ màu xanh ngọc đã chọn
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
