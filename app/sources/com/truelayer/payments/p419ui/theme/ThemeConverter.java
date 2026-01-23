package com.truelayer.payments.p419ui.theme;

import android.content.res.Resources;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThemeConverter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/ThemeConverter;", "", "()V", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ThemeConverter {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ThemeConverter.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006j\u0002`\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u001f\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000fJ(\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J<\u0010\u0015\u001a\u00020\u00162\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\u00182\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002JD\u0010\u001a\u001a\u00020\u001b2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0006j\u0002`\u001d2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/ThemeConverter$Companion;", "", "()V", "convert", "Lcom/truelayer/payments/ui/theme/TrueLayerTheme;", "themeMap", "Ljava/util/HashMap;", "", "Lcom/truelayer/payments/ui/theme/TrueLayerThemeMap;", "resources", "Landroid/content/res/Resources;", "packageName", "hexToColor", "Landroidx/compose/ui/graphics/Color;", "hex", "hexToColor-ijrfgN4", "mapToColors", "Landroidx/compose/material3/ColorScheme;", "colorMap", "Lcom/truelayer/payments/ui/theme/TrueLayerColorMap;", "defaults", "mapToTextStyle", "Landroidx/compose/ui/text/TextStyle;", "fontMap", "Lcom/truelayer/payments/ui/theme/TrueLayerTextStyleMap;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "mapToTypography", "Landroidx/compose/material3/Typography;", "typographyMap", "Lcom/truelayer/payments/ui/theme/TrueLayerTypographyMap;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TrueLayerTheme convert(HashMap<String, HashMap<String, Object>> themeMap, Resources resources, String packageName) {
            ColorScheme lightColorDefaults;
            ColorScheme darkColorDefaults;
            Typography typographyDefaults;
            Intrinsics.checkNotNullParameter(themeMap, "themeMap");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            HashMap<String, Object> map = themeMap.get("lightColors");
            if (map != null) {
                Collection<Object> collectionValues = map.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (!(obj instanceof String)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    map = null;
                }
                if (map == null || (lightColorDefaults = ThemeConverter.INSTANCE.mapToColors(map, Color7.getLightColorDefaults())) == null) {
                    lightColorDefaults = Color7.getLightColorDefaults();
                }
            }
            ColorScheme colorScheme = lightColorDefaults;
            HashMap<String, Object> map2 = themeMap.get("darkColors");
            if (map2 != null) {
                Collection<Object> collectionValues2 = map2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues2) {
                    if (!(obj2 instanceof String)) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    map2 = null;
                }
                if (map2 == null || (darkColorDefaults = ThemeConverter.INSTANCE.mapToColors(map2, Color7.getDarkColorDefaults())) == null) {
                    darkColorDefaults = Color7.getDarkColorDefaults();
                }
            }
            ColorScheme colorScheme2 = darkColorDefaults;
            HashMap<String, Object> map3 = themeMap.get("typography");
            if (map3 != null) {
                Collection<Object> collectionValues3 = map3.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues3, "<get-values>(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : collectionValues3) {
                    if (!(obj3 instanceof HashMap)) {
                        arrayList3.add(obj3);
                    }
                }
                HashMap<String, Object> map4 = arrayList3.isEmpty() ? map3 : null;
                if (map4 == null || (typographyDefaults = ThemeConverter.INSTANCE.mapToTypography(map4, Typography6.getTypographyDefaults(), resources, packageName)) == null) {
                    typographyDefaults = Typography6.getTypographyDefaults();
                }
            }
            return new TrueLayerTheme(colorScheme, colorScheme2, typographyDefaults, Shape2.getShapeDefaults(), false, 16, null);
        }

        private final ColorScheme mapToColors(HashMap<String, String> colorMap, ColorScheme defaults) {
            Color colorM27181hexToColorijrfgN4;
            Color colorM27181hexToColorijrfgN42;
            Color colorM27181hexToColorijrfgN43;
            Color colorM27181hexToColorijrfgN44;
            Color colorM27181hexToColorijrfgN45;
            Color colorM27181hexToColorijrfgN46;
            String str = colorMap.get(InstantRetirementSplashScreen.PrimaryButtonTag);
            long jM5760getPrimary0d7_KjU = (str == null || (colorM27181hexToColorijrfgN46 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str)) == null) ? defaults.getPrimary() : colorM27181hexToColorijrfgN46.getValue();
            long jM5750getOnPrimary0d7_KjU = defaults.getOnPrimary();
            long jM5761getPrimaryContainer0d7_KjU = defaults.getPrimaryContainer();
            long jM5751getOnPrimaryContainer0d7_KjU = defaults.getOnPrimaryContainer();
            long jM5763getSecondary0d7_KjU = defaults.getSecondary();
            long jM5752getOnSecondary0d7_KjU = defaults.getOnSecondary();
            long jM5764getSecondaryContainer0d7_KjU = defaults.getSecondaryContainer();
            long jM5753getOnSecondaryContainer0d7_KjU = defaults.getOnSecondaryContainer();
            long jM5775getTertiary0d7_KjU = defaults.getTertiary();
            long jM5756getOnTertiary0d7_KjU = defaults.getOnTertiary();
            long jM5776getTertiaryContainer0d7_KjU = defaults.getTertiaryContainer();
            long jM5757getOnTertiaryContainer0d7_KjU = defaults.getOnTertiaryContainer();
            String str2 = colorMap.get("background");
            long jM5741getBackground0d7_KjU = (str2 == null || (colorM27181hexToColorijrfgN45 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str2)) == null) ? defaults.getBackground() : colorM27181hexToColorijrfgN45.getValue();
            String str3 = colorMap.get("onBackground");
            long jM5747getOnBackground0d7_KjU = (str3 == null || (colorM27181hexToColorijrfgN44 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str3)) == null) ? defaults.getOnBackground() : colorM27181hexToColorijrfgN44.getValue();
            String str4 = colorMap.get("surface");
            long jM5765getSurface0d7_KjU = (str4 == null || (colorM27181hexToColorijrfgN43 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str4)) == null) ? defaults.getSurface() : colorM27181hexToColorijrfgN43.getValue();
            String str5 = colorMap.get("onSurface");
            long jM5754getOnSurface0d7_KjU = (str5 == null || (colorM27181hexToColorijrfgN42 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str5)) == null) ? defaults.getOnSurface() : colorM27181hexToColorijrfgN42.getValue();
            long jM5774getSurfaceVariant0d7_KjU = defaults.getSurfaceVariant();
            long jM5755getOnSurfaceVariant0d7_KjU = defaults.getOnSurfaceVariant();
            long jM5773getSurfaceTint0d7_KjU = defaults.getSurfaceTint();
            String str6 = colorMap.get("error");
            return new ColorScheme(jM5760getPrimary0d7_KjU, jM5750getOnPrimary0d7_KjU, jM5761getPrimaryContainer0d7_KjU, jM5751getOnPrimaryContainer0d7_KjU, defaults.getInversePrimary(), jM5763getSecondary0d7_KjU, jM5752getOnSecondary0d7_KjU, jM5764getSecondaryContainer0d7_KjU, jM5753getOnSecondaryContainer0d7_KjU, jM5775getTertiary0d7_KjU, jM5756getOnTertiary0d7_KjU, jM5776getTertiaryContainer0d7_KjU, jM5757getOnTertiaryContainer0d7_KjU, jM5741getBackground0d7_KjU, jM5747getOnBackground0d7_KjU, jM5765getSurface0d7_KjU, jM5754getOnSurface0d7_KjU, jM5774getSurfaceVariant0d7_KjU, jM5755getOnSurfaceVariant0d7_KjU, jM5773getSurfaceTint0d7_KjU, defaults.getInverseSurface(), defaults.getInverseOnSurface(), (str6 == null || (colorM27181hexToColorijrfgN4 = ThemeConverter.INSTANCE.m27181hexToColorijrfgN4(str6)) == null) ? defaults.getError() : colorM27181hexToColorijrfgN4.getValue(), defaults.getOnError(), defaults.getErrorContainer(), defaults.getOnErrorContainer(), defaults.getOutline(), defaults.getOutlineVariant(), defaults.getScrim(), null);
        }

        /* renamed from: hexToColor-ijrfgN4, reason: not valid java name */
        private final Color m27181hexToColorijrfgN4(String hex) {
            try {
                return Color.m6701boximpl(Color2.Color(android.graphics.Color.parseColor(hex)));
            } catch (Exception unused) {
                return null;
            }
        }

        private final Typography mapToTypography(HashMap<String, HashMap<String, String>> typographyMap, Typography defaults, Resources resources, String packageName) {
            return new Typography(defaults.getDisplayLarge(), defaults.getDisplayMedium(), defaults.getDisplaySmall(), defaults.getHeadlineLarge(), defaults.getHeadlineMedium(), mapToTextStyle(typographyMap.get("headlineSmall"), defaults.getHeadlineSmall(), resources, packageName), mapToTextStyle(typographyMap.get("titleLarge"), defaults.getTitleLarge(), resources, packageName), mapToTextStyle(typographyMap.get("titleMedium"), defaults.getTitleMedium(), resources, packageName), defaults.getTitleSmall(), mapToTextStyle(typographyMap.get("bodyLarge"), defaults.getBodyLarge(), resources, packageName), mapToTextStyle(typographyMap.get("bodyMedium"), defaults.getBodyMedium(), resources, packageName), mapToTextStyle(typographyMap.get("bodySmall"), defaults.getBodySmall(), resources, packageName), mapToTextStyle(typographyMap.get("labelLarge"), defaults.getLabelLarge(), resources, packageName), defaults.getLabelMedium(), defaults.getLabelSmall());
        }

        private final TextStyle mapToTextStyle(HashMap<String, String> fontMap, TextStyle textStyle, Resources resources, String packageName) {
            if (fontMap != null) {
                try {
                    int identifier = resources.getIdentifier(fontMap.get("font"), "font", packageName);
                    if (identifier != 0) {
                        return new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(identifier, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777183, (DefaultConstructorMarker) null);
                    }
                } catch (Exception unused) {
                    return textStyle;
                }
            }
            return textStyle;
        }
    }
}
