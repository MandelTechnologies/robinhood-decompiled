package com.robinhood.android.advisory.projection.slider;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.slider.ComposableSingletons$AdvisoryAmountSliderKt$lambda$-924641475$1, reason: invalid class name */
/* loaded from: classes7.dex */
final class ComposableSingletons$AdvisoryAmountSliderKt$lambda$924641475$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AdvisoryAmountSliderKt$lambda$924641475$1 INSTANCE = new ComposableSingletons$AdvisoryAmountSliderKt$lambda$924641475$1();

    ComposableSingletons$AdvisoryAmountSliderKt$lambda$924641475$1() {
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
            ComposerKt.traceEventStart(-924641475, i, -1, "com.robinhood.android.advisory.projection.slider.ComposableSingletons$AdvisoryAmountSliderKt.lambda$-924641475.<anonymous> (AdvisoryAmountSlider.kt:313)");
        }
        Currency currency = Currencies.USD;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Money(currency, new BigDecimal(0)), new Money(currency, new BigDecimal(1000)), new Money(currency, new BigDecimal(2000)), new Money(currency, new BigDecimal(3000)), new Money(currency, new BigDecimal(4000)), new Money(currency, new BigDecimal(OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS)));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.slider.ComposableSingletons$AdvisoryAmountSliderKt$lambda$-924641475$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$AdvisoryAmountSliderKt$lambda$924641475$1.invoke$lambda$1$lambda$0((Money) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AdvisoryAmountSliderKt.m11233AdvisoryAmountSliderTN_CM5M(immutableList3PersistentListOf, null, 0.0f, null, (Function1) objRememberedValue, composer, 24576, 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Money it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
