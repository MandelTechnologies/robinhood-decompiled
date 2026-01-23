package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneOtpGetHelpBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneOtpGetHelpBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $loading$delegate;
    final /* synthetic */ PhoneOtpGetHelpBottomSheet this$0;

    PhoneOtpGetHelpBottomSheet2(EventLogger eventLogger, SnapshotState<Boolean> snapshotState, PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet) {
        this.$eventLogger = eventLogger;
        this.$loading$delegate = snapshotState;
        this.this$0 = phoneOtpGetHelpBottomSheet;
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
            ComposerKt.traceEventStart(-1615850238, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpGetHelpBottomSheet.kt:70)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_otp_help_cta, composer, 0);
        boolean zComposeContent$lambda$2 = PhoneOtpGetHelpBottomSheet.ComposeContent$lambda$2(this.$loading$delegate);
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$loading$delegate) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet = this.this$0;
        final SnapshotState<Boolean> snapshotState = this.$loading$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneOtpGetHelpBottomSheet2.invoke$lambda$2$lambda$1(eventLogger, phoneOtpGetHelpBottomSheet, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger2 = this.$eventLogger;
        final PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneOtpGetHelpBottomSheet2.invoke$lambda$4$lambda$3(eventLogger2, phoneOtpGetHelpBottomSheet2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, zComposeContent$lambda$2, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 58943);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, final PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet, SnapshotState snapshotState) {
        loggingUtils.logContinue(eventLogger, loggingUtils.getBOTTOM_SHEET());
        PhoneOtpGetHelpBottomSheet.ComposeContent$lambda$3(snapshotState, true);
        ((PhoneOtpGetHelpBottomSheet.Args) PhoneOtpGetHelpBottomSheet.INSTANCE.getArgs((Fragment) phoneOtpGetHelpBottomSheet)).getOnLandline().invoke(new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpGetHelpBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneOtpGetHelpBottomSheet2.invoke$lambda$2$lambda$1$lambda$0(phoneOtpGetHelpBottomSheet);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet) {
        phoneOtpGetHelpBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, PhoneOtpGetHelpBottomSheet phoneOtpGetHelpBottomSheet) {
        loggingUtils.logDismiss(eventLogger, loggingUtils.getBOTTOM_SHEET());
        phoneOtpGetHelpBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
