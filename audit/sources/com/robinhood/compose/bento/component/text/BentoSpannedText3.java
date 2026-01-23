package com.robinhood.compose.bento.component.text;

import android.annotation.SuppressLint;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.text.SpannablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: BentoSpannedText.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/PreviewSpannedTextProvider;", "Lcom/robinhood/compose/bento/component/text/SpannedTextProvider;", "<init>", "()V", "SpannedText", "", "spanned", "Landroid/text/Spanned;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "SpannedText-gPmlwdY", "(Landroid/text/Spanned;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.PreviewSpannedTextProvider, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoSpannedText3 implements BentoSpannedText4 {
    public static final int $stable = 0;
    public static final BentoSpannedText3 INSTANCE = new BentoSpannedText3();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpannedText_gPmlwdY$lambda$3(BentoSpannedText3 bentoSpannedText3, Spanned spanned, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0 function0, int i4, Composer composer, int i5) {
        bentoSpannedText3.mo13684SpannedTextgPmlwdY(spanned, modifier, color, color2, i, num, i2, i3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1));
        return Unit.INSTANCE;
    }

    private BentoSpannedText3() {
    }

    @Override // com.robinhood.compose.bento.component.text.BentoSpannedText4
    @SuppressLint({"InlinedApi"})
    /* renamed from: SpannedText-gPmlwdY */
    public void mo13684SpannedTextgPmlwdY(final Spanned spanned, final Modifier modifier, final Color color, final Color color2, final int i, final Integer num, final int i2, final int i3, final Function0<Unit> function0, Composer composer, final int i4) {
        int i5;
        int i6;
        Composer composer2;
        Spanned spanned2 = spanned;
        Intrinsics.checkNotNullParameter(spanned2, "spanned");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1628380352);
        if ((i4 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(spanned2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(color) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(num) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 = i2;
            i5 |= composerStartRestartGroup.changed(i6) ? 1048576 : 524288;
        } else {
            i6 = i2;
        }
        if ((12582912 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628380352, i5, -1, "com.robinhood.compose.bento.component.text.PreviewSpannedTextProvider.SpannedText (BentoSpannedText.kt:143)");
            }
            if (i != C20690R.attr.textAppearanceRegularMedium) {
                throw new IllegalStateException("Only `textAppearanceRegularMedium` is supported");
            }
            if (i3 != 0) {
                throw new IllegalStateException("Auto-sizing text is not supported");
            }
            int i7 = 0;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append((CharSequence) spanned2);
            Object[] spans = spanned2.getSpans(0, spanned2.length(), Object.class);
            int length = spans.length;
            while (i7 < length) {
                Object obj = spans[i7];
                PrimitiveRanges2 spanRange = SpannablesKt.getSpanRange(spanned2, obj);
                if (spanRange == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), spanRange.getFirst(), spanRange.getLast());
                    } else if (style == 2) {
                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null), spanRange.getFirst(), spanRange.getLast());
                    }
                } else if (obj instanceof URLSpan) {
                    builder.addStyle(new SpanStyle(color2 != null ? color2.getValue() : Color.INSTANCE.m6726getUnspecified0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), spanRange.getFirst(), spanRange.getLast());
                    String url = ((URLSpan) obj).getURL();
                    Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                    builder.addStringAnnotation("URL", url, spanRange.getFirst(), spanRange.getLast());
                }
                i7++;
                spanned2 = spanned;
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), modifier, color, null, null, null, (num != null && num.intValue() == 1) ? TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()) : null, 0, false, i6, 0, null, null, null, composer2, (i5 & 1008) | ((i5 << 9) & 1879048192), 0, 15800);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.PreviewSpannedTextProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BentoSpannedText3.SpannedText_gPmlwdY$lambda$3(this.f$0, spanned, modifier, color, color2, i, num, i2, i3, function0, i4, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
