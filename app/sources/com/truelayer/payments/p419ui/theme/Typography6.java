package com.truelayer.payments.p419ui.theme;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Typography.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"LinkStyleDefault", "Landroidx/compose/ui/text/SpanStyle;", "getLinkStyleDefault", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/SpanStyle;", "TypographyDefaults", "Landroidx/compose/material3/Typography;", "getTypographyDefaults", "()Landroidx/compose/material3/Typography;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.theme.TypographyKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Typography6 {
    private static final Typography TypographyDefaults = new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);

    public static final Typography getTypographyDefaults() {
        return TypographyDefaults;
    }

    @JvmName
    public static final SpanStyle getLinkStyleDefault(Composer composer, int i) {
        composer.startReplaceableGroup(-145382407);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-145382407, i, -1, "com.truelayer.payments.ui.theme.<get-LinkStyleDefault> (Typography.kt:16)");
        }
        SpanStyle spanStyle = new SpanStyle(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getNone(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61438, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spanStyle;
    }
}
