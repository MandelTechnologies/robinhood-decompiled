package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsViewState;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FinalTermsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTermsBottomButton$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $agreeButton;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onContinue;
    final /* synthetic */ Function0<Unit> $onScreenTransition;
    final /* synthetic */ int $screen;
    final /* synthetic */ FinalTermsViewState.Screen $secondScreen;

    /* JADX WARN: Multi-variable type inference failed */
    FinalTermsComposable6(int i, EventLogger eventLogger, Function0<Unit> function0, FinalTermsViewState.Screen screen, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function2) {
        this.$screen = i;
        this.$eventLogger = eventLogger;
        this.$onScreenTransition = function0;
        this.$secondScreen = screen;
        this.$onContinue = function02;
        this.$agreeButton = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logAccept$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logAccept$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-117976075, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsBottomButton.<anonymous>.<anonymous> (FinalTermsComposable.kt:461)");
        }
        if (this.$screen == 1) {
            composer.startReplaceGroup(-1341941590);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onScreenTransition);
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$onScreenTransition;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTermsBottomButton$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsComposable6.invoke$lambda$1$lambda$0(eventLogger, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
            composer.endReplaceGroup();
        } else {
            FinalTermsViewState.Screen screen = this.$secondScreen;
            if (screen == FinalTermsViewState.Screen.FREE_GOLD) {
                composer.startReplaceGroup(-1341579820);
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                final EventLogger eventLogger2 = this.$eventLogger;
                final Function0<Unit> function02 = this.$onContinue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTermsBottomButton$2$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsComposable6.invoke$lambda$3$lambda$2(eventLogger2, function02);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource2, false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
                composer.endReplaceGroup();
            } else if (screen == FinalTermsViewState.Screen.BONUS_POINTS) {
                composer.startReplaceGroup(-1341224684);
                String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                final EventLogger eventLogger3 = this.$eventLogger;
                final Function0<Unit> function03 = this.$onContinue;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTermsBottomButton$2$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsComposable6.invoke$lambda$5$lambda$4(eventLogger3, function03);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue3, strStringResource3, false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1705823742);
                this.$agreeButton.invoke(composer, 0);
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
