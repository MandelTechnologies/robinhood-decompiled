package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.view.OnBackPressedDispatcher;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositBrokerageExperimentPage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$1$1, reason: use source file name */
/* loaded from: classes27.dex */
final class DirectDepositBrokerageExperimentPage5 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
    final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;

    DirectDepositBrokerageExperimentPage5(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.$onBackPressedDispatcher = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
        invoke(bentoAppBarScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
        onBackPressedDispatcher.onBackPressed();
        return Unit.INSTANCE;
    }

    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-859442575, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentPage.kt:45)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
        final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositBrokerageExperimentPage5.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
