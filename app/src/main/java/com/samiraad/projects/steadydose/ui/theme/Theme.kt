package com.samiraad.projects.steadydose.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
    primary = PrimaryLight, onPrimary = OnPrimaryLight,
    primaryContainer = PrimaryContainerLight, secondary = SecondaryLight,
    tertiary = TertiaryLight, background = BackgroundLight, surface = BackgroundLight,
    surfaceVariant = SurfaceVariantLight, error = ErrorLight
)

private val DarkColors = darkColorScheme(
    primary = PrimaryDark, onPrimary = OnPrimaryDark,
    primaryContainer = PrimaryContainerDark, secondary = SecondaryDark,
    tertiary = TertiaryDark, background = BackgroundDark, surface = BackgroundDark,
    surfaceVariant = SurfaceVariantDark, error = ErrorDark
)

val LocalAdherenceColors = compositionLocalOf { AdherenceColorsLight }


@Composable
fun SteadyDoseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S ->
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        darkTheme -> DarkColors
        else -> LightColors
    }
    val adherenceColors = if (darkTheme) AdherenceColorsDark else AdherenceColorsLight

    CompositionLocalProvider(LocalAdherenceColors provides adherenceColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = MediTrackTypography,
            content = content
        )
    }
}