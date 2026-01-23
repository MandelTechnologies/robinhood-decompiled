package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneConfirmationGetHelpBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationGetHelpBottomSheet$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneConfirmationGetHelpBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ PhoneConfirmationGetHelpBottomSheet this$0;

    PhoneConfirmationGetHelpBottomSheet2(EventLogger eventLogger, PhoneConfirmationGetHelpBottomSheet phoneConfirmationGetHelpBottomSheet) {
        this.$eventLogger = eventLogger;
        this.this$0 = phoneConfirmationGetHelpBottomSheet;
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
            ComposerKt.traceEventStart(1339604914, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationGetHelpBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneConfirmationGetHelpBottomSheet.kt:65)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_help_cta, composer, 0);
        BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.POP_OUT_16, BentoButtons.Icon.Position.Trailing);
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final PhoneConfirmationGetHelpBottomSheet phoneConfirmationGetHelpBottomSheet = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationGetHelpBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneConfirmationGetHelpBottomSheet2.invoke$lambda$1$lambda$0(eventLogger, phoneConfirmationGetHelpBottomSheet);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger2 = this.$eventLogger;
        final PhoneConfirmationGetHelpBottomSheet phoneConfirmationGetHelpBottomSheet2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationGetHelpBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneConfirmationGetHelpBottomSheet2.invoke$lambda$3$lambda$2(eventLogger2, phoneConfirmationGetHelpBottomSheet2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, false, size16, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, BentoButtons.Icon.Size16.$stable << 27, 0, 58687);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, PhoneConfirmationGetHelpBottomSheet phoneConfirmationGetHelpBottomSheet) {
        String string2 = phoneConfirmationGetHelpBottomSheet.getString(C12201R.string.credit_app_fraud_alert_phone_help_link);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        loggingUtils.logLinkClick(eventLogger, string2, loggingUtils.getBOTTOM_SHEET());
        WebUtils.viewUrl$default(phoneConfirmationGetHelpBottomSheet.getContext(), phoneConfirmationGetHelpBottomSheet.getString(C12201R.string.credit_app_fraud_alert_phone_help_link), 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, PhoneConfirmationGetHelpBottomSheet phoneConfirmationGetHelpBottomSheet) {
        loggingUtils.logDismiss(eventLogger, loggingUtils.getBOTTOM_SHEET());
        phoneConfirmationGetHelpBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
