package com.samiraad.projects.steadydose.ui.theme

import androidx.compose.ui.graphics.Color

val PrimaryLight = Color(0xFF006C7A)
val OnPrimaryLight = Color(0xFFFFFFFF)
val PrimaryContainerLight = Color(0xFFA6EEFF)
val SecondaryLight = Color(0xFF4A6267)
val TertiaryLight = Color(0xFF9C4146)
val BackgroundLight = Color(0xFFFAFDFD)
val SurfaceVariantLight = Color(0xFFDBE4E6)
val ErrorLight = Color(0xFFBA1A1A)

val PrimaryDark = Color(0xFF5DD5E8)
val OnPrimaryDark = Color(0xFF00363D)
val PrimaryContainerDark = Color(0xFF004F5A)
val SecondaryDark = Color(0xFFB1CBD0)
val TertiaryDark = Color(0xFFFFB4A9)
val BackgroundDark = Color(0xFF191C1D)
val SurfaceVariantDark = Color(0xFF3F4748)
val ErrorDark = Color(0xFFFFB4AB)

// Semantic adherence colors — not part of the M3 role set, exposed separately
data class AdherenceColors(val taken: Color, val delayed: Color, val missed: Color)
val AdherenceColorsLight = AdherenceColors(Color(0xFF2E7D32), Color(0xFFB8860B), Color(0xFFC62828))
val AdherenceColorsDark = AdherenceColors(Color(0xFF81C995), Color(0xFFFFD54F), Color(0xFFFFB4AB))