package com.robinhood.android.crypto.tab.p093ui.interest;

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
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeInterestSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt$lambda$1022222660$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeInterestSection3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoHomeInterestSection3 INSTANCE = new CryptoHomeInterestSection3();

    CryptoHomeInterestSection3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1022222660, i, -1, "com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt.lambda$1022222660.<anonymous> (CryptoHomeInterestSection.kt:357)");
        }
        composer.startReplaceGroup(-1191531235);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append("Earn interest daily on your buying power. Includes ");
        int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append("+0.5% APY boost");
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            builder.append(" until X Mar 2026.");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt$lambda$1022222660$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoHomeInterestSection4.PreEnrollmentComposable("Earn 1.87% APY", annotatedString, "Get started", null, (Function0) objRememberedValue, composer, 24966, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
