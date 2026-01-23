package com.robinhood.android.mcw.currencyconverter;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterViewState;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CurrencyConverterComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3$1$4, reason: use source file name */
/* loaded from: classes8.dex */
final class CurrencyConverterComposable5 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ CurrencyConverterDuxo $duxo;
    final /* synthetic */ BentoNumpad4 $this_BentoNumpadScreenLayout;
    final /* synthetic */ CurrencyConverterViewState.Loaded $viewState;

    CurrencyConverterComposable5(BentoNumpad4 bentoNumpad4, CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo) {
        this.$this_BentoNumpadScreenLayout = bentoNumpad4;
        this.$viewState = loaded;
        this.$duxo = currencyConverterDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-306559780, i, -1, "com.robinhood.android.mcw.currencyconverter.MainContent.<anonymous>.<anonymous>.<anonymous> (CurrencyConverterComposable.kt:414)");
        }
        BentoNumpad4 bentoNumpad4 = this.$this_BentoNumpadScreenLayout;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$duxo);
        final CurrencyConverterViewState.Loaded loaded = this.$viewState;
        final CurrencyConverterDuxo currencyConverterDuxo = this.$duxo;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CurrencyConverterComposable5.invoke$lambda$1$lambda$0(loaded, currencyConverterDuxo, (KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        bentoNumpad4.BentoNumpadOnly(null, (Function1) objRememberedValue, false, false, false, null, composer, BentoNumpad4.$stable << 18, 61);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (loaded.getUserInteractionEnabled()) {
            currencyConverterDuxo.onKeyEvent(keyEvent, loaded.getTargetAmount());
        }
        return Unit.INSTANCE;
    }
}
