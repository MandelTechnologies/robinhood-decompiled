package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PrivacyPoliciesBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.PrivacyPoliciesBottomSheet$ComposeContent$1$1$1$4, reason: use source file name */
/* loaded from: classes2.dex */
final class PrivacyPoliciesBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ PrivacyPoliciesBottomSheet this$0;

    PrivacyPoliciesBottomSheet2(EventLogger eventLogger, PrivacyPoliciesBottomSheet privacyPoliciesBottomSheet) {
        this.$eventLogger = eventLogger;
        this.this$0 = privacyPoliciesBottomSheet;
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
            ComposerKt.traceEventStart(-69745686, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.PrivacyPoliciesBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacyPoliciesBottomSheet.kt:126)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final PrivacyPoliciesBottomSheet privacyPoliciesBottomSheet = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.PrivacyPoliciesBottomSheet$ComposeContent$1$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PrivacyPoliciesBottomSheet2.invoke$lambda$1$lambda$0(eventLogger, privacyPoliciesBottomSheet);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer, 384, 0, 8184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, PrivacyPoliciesBottomSheet privacyPoliciesBottomSheet) {
        loggingUtils.logDismiss(eventLogger, loggingUtils.getBOTTOM_SHEET());
        privacyPoliciesBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
