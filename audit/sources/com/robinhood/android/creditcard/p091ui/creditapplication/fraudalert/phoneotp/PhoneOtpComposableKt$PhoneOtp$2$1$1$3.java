package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneOtpComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PhoneOtpComposableKt$PhoneOtp$2$1$1$3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onGetHelp;

    PhoneOtpComposableKt$PhoneOtp$2$1$1$3(EventLogger eventLogger, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$onGetHelp = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1136662669, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneOtpComposable.kt:102)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_otp_help_prompt, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_get_help, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onGetHelp);
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onGetHelp;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpComposableKt$PhoneOtp$2$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneOtpComposableKt$PhoneOtp$2$1$1$3.invoke$lambda$1$lambda$0(eventLogger, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, bentoTheme.getTypography(composer, i2).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer, 0, 40);
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
}
