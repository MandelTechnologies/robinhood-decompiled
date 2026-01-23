package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ColorScheme.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aø\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aø\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a\u001e\u0010.\u001a\u00020\u0000*\u00020%2\u0006\u0010+\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u001a\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a&\u00105\u001a\u00020\u0000*\u00020%2\u0006\u0010+\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001e\u00108\u001a\u00020\u0000*\u00020%2\u0006\u00102\u001a\u000201H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u0010;\u001a\u00020\u0000*\u00020%2\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<\" \u0010>\u001a\b\u0012\u0004\u0012\u00020%0=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0=8\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010A\"\u0018\u0010:\u001a\u00020\u0000*\u0002098AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, m3636d2 = {"Landroidx/compose/ui/graphics/Color;", InstantRetirementSplashScreen.PrimaryButtonTag, "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", InstantRetirementSplashScreen.SecondaryButtonTag, "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "darkColorScheme-C-Xl9yA", "darkColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalTonalElevationEnabled", "getLocalTonalElevationEnabled", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material3.ColorSchemeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ColorScheme2 {
    private static final CompositionLocal6<ColorScheme> LocalColorScheme = CompositionLocal3.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorScheme2.m5783lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final CompositionLocal6<Boolean> LocalTonalElevationEnabled = CompositionLocal3.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    /* compiled from: ColorScheme.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.material3.ColorSchemeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m5783lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long jM6157getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m6157getPrimary0d7_KjU() : j;
        long jM6147getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m6147getOnPrimary0d7_KjU() : j2;
        long jM6158getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m6158getPrimaryContainer0d7_KjU() : j3;
        long jM6148getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m6148getOnPrimaryContainer0d7_KjU() : j4;
        long jM6142getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m6142getInversePrimary0d7_KjU() : j5;
        long jM6160getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m6160getSecondary0d7_KjU() : j6;
        long jM6149getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m6149getOnSecondary0d7_KjU() : j7;
        long jM6161getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m6161getSecondaryContainer0d7_KjU() : j8;
        long j37 = jM6157getPrimary0d7_KjU;
        long jM6150getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m6150getOnSecondaryContainer0d7_KjU() : j9;
        long jM6171getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m6171getTertiary0d7_KjU() : j10;
        long jM6153getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m6153getOnTertiary0d7_KjU() : j11;
        long jM6172getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m6172getTertiaryContainer0d7_KjU() : j12;
        long jM6154getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m6154getOnTertiaryContainer0d7_KjU() : j13;
        long jM6138getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m6138getBackground0d7_KjU() : j14;
        long jM6144getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m6144getOnBackground0d7_KjU() : j15;
        long jM6162getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m6162getSurface0d7_KjU() : j16;
        long jM6151getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m6151getOnSurface0d7_KjU() : j17;
        long jM6170getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m6170getSurfaceVariant0d7_KjU() : j18;
        long jM6152getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m6152getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long jM6143getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m6143getInverseSurface0d7_KjU() : j21;
        long jM6141getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m6141getInverseOnSurface0d7_KjU() : j22;
        long jM6139getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m6139getError0d7_KjU() : j23;
        long jM6145getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m6145getOnError0d7_KjU() : j24;
        long jM6140getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m6140getErrorContainer0d7_KjU() : j25;
        long jM6146getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m6146getOnErrorContainer0d7_KjU() : j26;
        long jM6155getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m6155getOutline0d7_KjU() : j27;
        long jM6156getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m6156getOutlineVariant0d7_KjU() : j28;
        long jM6159getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m6159getScrim0d7_KjU() : j29;
        long jM6163getSurfaceBright0d7_KjU = (i & 536870912) != 0 ? ColorLightTokens.INSTANCE.m6163getSurfaceBright0d7_KjU() : j30;
        long jM6164getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m6164getSurfaceContainer0d7_KjU() : j31;
        long jM6165getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m6165getSurfaceContainerHigh0d7_KjU() : j32;
        long jM6166getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m6166getSurfaceContainerHighest0d7_KjU() : j33;
        long jM6167getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m6167getSurfaceContainerLow0d7_KjU() : j34;
        long jM6168getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m6168getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorLightTokens.INSTANCE.m6169getSurfaceDim0d7_KjU();
        }
        return m5782lightColorSchemeCXl9yA(j37, jM6147getOnPrimary0d7_KjU, jM6158getPrimaryContainer0d7_KjU, jM6148getOnPrimaryContainer0d7_KjU, jM6142getInversePrimary0d7_KjU, jM6160getSecondary0d7_KjU, jM6149getOnSecondary0d7_KjU, jM6161getSecondaryContainer0d7_KjU, jM6150getOnSecondaryContainer0d7_KjU, jM6171getTertiary0d7_KjU, jM6153getOnTertiary0d7_KjU, jM6172getTertiaryContainer0d7_KjU, jM6154getOnTertiaryContainer0d7_KjU, jM6138getBackground0d7_KjU, jM6144getOnBackground0d7_KjU, jM6162getSurface0d7_KjU, jM6151getOnSurface0d7_KjU, jM6170getSurfaceVariant0d7_KjU, jM6152getOnSurfaceVariant0d7_KjU, j38, jM6143getInverseSurface0d7_KjU, jM6141getInverseOnSurface0d7_KjU, jM6139getError0d7_KjU, jM6145getOnError0d7_KjU, jM6140getErrorContainer0d7_KjU, jM6146getOnErrorContainer0d7_KjU, jM6155getOutline0d7_KjU, jM6156getOutlineVariant0d7_KjU, jM6159getScrim0d7_KjU, jM6163getSurfaceBright0d7_KjU, jM6164getSurfaceContainer0d7_KjU, jM6165getSurfaceContainerHigh0d7_KjU, jM6166getSurfaceContainerHighest0d7_KjU, jM6167getSurfaceContainerLow0d7_KjU, jM6168getSurfaceContainerLowest0d7_KjU, j36);
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m5782lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m5781darkColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long jM6122getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m6122getPrimary0d7_KjU() : j;
        long jM6112getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m6112getOnPrimary0d7_KjU() : j2;
        long jM6123getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m6123getPrimaryContainer0d7_KjU() : j3;
        long jM6113getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m6113getOnPrimaryContainer0d7_KjU() : j4;
        long jM6107getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m6107getInversePrimary0d7_KjU() : j5;
        long jM6125getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m6125getSecondary0d7_KjU() : j6;
        long jM6114getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m6114getOnSecondary0d7_KjU() : j7;
        long jM6126getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m6126getSecondaryContainer0d7_KjU() : j8;
        long j37 = jM6122getPrimary0d7_KjU;
        long jM6115getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m6115getOnSecondaryContainer0d7_KjU() : j9;
        long jM6136getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m6136getTertiary0d7_KjU() : j10;
        long jM6118getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m6118getOnTertiary0d7_KjU() : j11;
        long jM6137getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m6137getTertiaryContainer0d7_KjU() : j12;
        long jM6119getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m6119getOnTertiaryContainer0d7_KjU() : j13;
        long jM6103getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m6103getBackground0d7_KjU() : j14;
        long jM6109getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m6109getOnBackground0d7_KjU() : j15;
        long jM6127getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m6127getSurface0d7_KjU() : j16;
        long jM6116getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m6116getOnSurface0d7_KjU() : j17;
        long jM6135getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m6135getSurfaceVariant0d7_KjU() : j18;
        long jM6117getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m6117getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long jM6108getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m6108getInverseSurface0d7_KjU() : j21;
        long jM6106getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m6106getInverseOnSurface0d7_KjU() : j22;
        long jM6104getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m6104getError0d7_KjU() : j23;
        long jM6110getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m6110getOnError0d7_KjU() : j24;
        long jM6105getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m6105getErrorContainer0d7_KjU() : j25;
        long jM6111getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m6111getOnErrorContainer0d7_KjU() : j26;
        long jM6120getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m6120getOutline0d7_KjU() : j27;
        long jM6121getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m6121getOutlineVariant0d7_KjU() : j28;
        long jM6124getScrim0d7_KjU = (i & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m6124getScrim0d7_KjU() : j29;
        long jM6128getSurfaceBright0d7_KjU = (i & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m6128getSurfaceBright0d7_KjU() : j30;
        long jM6129getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m6129getSurfaceContainer0d7_KjU() : j31;
        long jM6130getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m6130getSurfaceContainerHigh0d7_KjU() : j32;
        long jM6131getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m6131getSurfaceContainerHighest0d7_KjU() : j33;
        long jM6132getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m6132getSurfaceContainerLow0d7_KjU() : j34;
        long jM6133getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m6133getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorDarkTokens.INSTANCE.m6134getSurfaceDim0d7_KjU();
        }
        return m5780darkColorSchemeCXl9yA(j37, jM6112getOnPrimary0d7_KjU, jM6123getPrimaryContainer0d7_KjU, jM6113getOnPrimaryContainer0d7_KjU, jM6107getInversePrimary0d7_KjU, jM6125getSecondary0d7_KjU, jM6114getOnSecondary0d7_KjU, jM6126getSecondaryContainer0d7_KjU, jM6115getOnSecondaryContainer0d7_KjU, jM6136getTertiary0d7_KjU, jM6118getOnTertiary0d7_KjU, jM6137getTertiaryContainer0d7_KjU, jM6119getOnTertiaryContainer0d7_KjU, jM6103getBackground0d7_KjU, jM6109getOnBackground0d7_KjU, jM6127getSurface0d7_KjU, jM6116getOnSurface0d7_KjU, jM6135getSurfaceVariant0d7_KjU, jM6117getOnSurfaceVariant0d7_KjU, j38, jM6108getInverseSurface0d7_KjU, jM6106getInverseOnSurface0d7_KjU, jM6104getError0d7_KjU, jM6110getOnError0d7_KjU, jM6105getErrorContainer0d7_KjU, jM6111getOnErrorContainer0d7_KjU, jM6120getOutline0d7_KjU, jM6121getOutlineVariant0d7_KjU, jM6124getScrim0d7_KjU, jM6128getSurfaceBright0d7_KjU, jM6129getSurfaceContainer0d7_KjU, jM6130getSurfaceContainerHigh0d7_KjU, jM6131getSurfaceContainerHighest0d7_KjU, jM6132getSurfaceContainerLow0d7_KjU, jM6133getSurfaceContainerLowest0d7_KjU, j36);
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m5780darkColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m5778contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        if (Color.m6707equalsimpl0(j, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.m6707equalsimpl0(j, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!Color.m6707equalsimpl0(j, colorScheme.getSurfaceBright()) && !Color.m6707equalsimpl0(j, colorScheme.getSurfaceContainer()) && !Color.m6707equalsimpl0(j, colorScheme.getSurfaceContainerHigh()) && !Color.m6707equalsimpl0(j, colorScheme.getSurfaceContainerHighest()) && !Color.m6707equalsimpl0(j, colorScheme.getSurfaceContainerLow()) && !Color.m6707equalsimpl0(j, colorScheme.getSurfaceContainerLowest())) {
            return Color.INSTANCE.m6726getUnspecified0d7_KjU();
        }
        return colorScheme.getOnSurface();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m5779contentColorForek8zF_U(long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM5778contentColorFor4WTKRHQ = m5778contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (jM5778contentColorFor4WTKRHQ == 16) {
            jM5778contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColor3.getLocalContentColor())).getValue();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5778contentColorFor4WTKRHQ;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m5777applyTonalElevationRFCenO8(ColorScheme colorScheme, long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m6707equalsimpl0(j, colorScheme.getSurface()) && zBooleanValue) {
            j = m5784surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return Color.INSTANCE.m6726getUnspecified0d7_KjU();
        }
    }

    public static final CompositionLocal6<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    @JvmName
    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m5784surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        if (C2002Dp.m7997equalsimpl0(f, C2002Dp.m7995constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
