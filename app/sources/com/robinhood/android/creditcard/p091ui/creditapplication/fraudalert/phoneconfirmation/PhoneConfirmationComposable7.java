package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;

/* compiled from: PhoneConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneConfirmationComposable7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ String $last4Digits;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ Function1<String, Unit> $onContinue;
    final /* synthetic */ Function0<Unit> $onGetHelp;
    final /* synthetic */ SnapshotState<String> $phoneNumber$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    PhoneConfirmationComposable7(EventLogger eventLogger, Function0<Unit> function0, Function1<? super String, Unit> function1, SnapshotState<String> snapshotState, boolean z, String str, Function0<Unit> function02) {
        this.$eventLogger = eventLogger;
        this.$onGetHelp = function0;
        this.$onContinue = function1;
        this.$phoneNumber$delegate = snapshotState;
        this.$isLoading = z;
        this.$last4Digits = str;
        this.$onClose = function02;
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
            ComposerKt.traceEventStart(178643687, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmation.<anonymous>.<anonymous>.<anonymous> (PhoneConfirmationComposable.kt:53)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_help_prompt, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_get_help, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onGetHelp);
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onGetHelp;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneConfirmationComposable7.invoke$lambda$1$lambda$0(eventLogger, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changed(this.$phoneNumber$delegate);
        final EventLogger eventLogger2 = this.$eventLogger;
        final Function1<String, Unit> function1 = this.$onContinue;
        final SnapshotState<String> snapshotState = this.$phoneNumber$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneConfirmationComposable7.invoke$lambda$3$lambda$2(eventLogger2, function1, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function03 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_cta, composer, 0);
        boolean z = this.$isLoading;
        boolean z2 = PhoneConfirmationComposable6.PhoneConfirmation$lambda$2(this.$phoneNumber$delegate).length() == 10 && Intrinsics.areEqual(StringsKt.slice(PhoneConfirmationComposable6.PhoneConfirmation$lambda$2(this.$phoneNumber$delegate), new PrimitiveRanges2(6, 9)), this.$last4Digits);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onClose);
        final EventLogger eventLogger3 = this.$eventLogger;
        final Function0<Unit> function04 = this.$onClose;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationComposableKt$PhoneConfirmation$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneConfirmationComposable7.invoke$lambda$5$lambda$4(eventLogger3, function04);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, strStringResource, strStringResource2, false, function02, null, function03, strStringResource3, z, null, z2, (Function0) objRememberedValue3, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0), false, null, false, composer, 0, 0, 57897);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingUtils.getCcScreen(), new Component(Component.ComponentType.HELP_BUTTON, null, null, 6, null), null, null, false, 57, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function1 function1, SnapshotState snapshotState) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        function1.invoke(PhoneConfirmationComposable6.PhoneConfirmation$lambda$2(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
