package com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuantityNumPadSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.ComposableSingletons$QuantityNumPadSelectorKt$lambda$1768692751$1, reason: use source file name */
/* loaded from: classes3.dex */
final class QuantityNumPadSelector2 implements Function2<Composer, Integer, Unit> {
    public static final QuantityNumPadSelector2 INSTANCE = new QuantityNumPadSelector2();

    QuantityNumPadSelector2() {
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
            ComposerKt.traceEventStart(1768692751, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.ComposableSingletons$QuantityNumPadSelectorKt.lambda$1768692751.<anonymous> (QuantityNumPadSelector.kt:134)");
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(1L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("Test Account: $1,000.00 to buy * $999.00 to short");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.ComposableSingletons$QuantityNumPadSelectorKt$lambda$1768692751$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuantityNumPadSelector2.invoke$lambda$1$lambda$0((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.ComposableSingletons$QuantityNumPadSelectorKt$lambda$1768692751$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        QuantityNumPadSelector4.QuantityNumPadSelector(bigDecimalValueOf, stringResourceInvoke, false, function1, (Function0) objRememberedValue2, PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), null, null, composer, (StringResource.$stable << 3) | 28032, 192);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
