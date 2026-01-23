package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FraudVerifyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.FraudVerifyFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FraudVerifyFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ FraudVerifyFragment this$0;

    FraudVerifyFragment2(EventLogger eventLogger, FraudVerifyFragment fraudVerifyFragment) {
        this.$eventLogger = eventLogger;
        this.this$0 = fraudVerifyFragment;
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
            ComposerKt.traceEventStart(1620381064, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.FraudVerifyFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (FraudVerifyFragment.kt:48)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final FraudVerifyFragment fraudVerifyFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.FraudVerifyFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FraudVerifyFragment2.invoke$lambda$1$lambda$0(eventLogger, fraudVerifyFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, FraudVerifyFragment fraudVerifyFragment) {
        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
        fraudVerifyFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }
}
