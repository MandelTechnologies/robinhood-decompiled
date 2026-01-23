package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AuthorizedUserBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.AuthorizedUserBottomSheet$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AuthorizedUserBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ AuthorizedUserBottomSheet this$0;

    AuthorizedUserBottomSheet2(EventLogger eventLogger, AuthorizedUserBottomSheet authorizedUserBottomSheet) {
        this.$eventLogger = eventLogger;
        this.this$0 = authorizedUserBottomSheet;
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
            ComposerKt.traceEventStart(-1609473420, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.AuthorizedUserBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AuthorizedUserBottomSheet.kt:91)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_auth_user_cancel_continue, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_auth_user_cancel_never_mind, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final AuthorizedUserBottomSheet authorizedUserBottomSheet = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.AuthorizedUserBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizedUserBottomSheet2.invoke$lambda$1$lambda$0(eventLogger, authorizedUserBottomSheet);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger2 = this.$eventLogger;
        final AuthorizedUserBottomSheet authorizedUserBottomSheet2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.AuthorizedUserBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizedUserBottomSheet2.invoke$lambda$3$lambda$2(eventLogger2, authorizedUserBottomSheet2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 6, 0, 59198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, AuthorizedUserBottomSheet authorizedUserBottomSheet) {
        loggingUtils.logContinue(eventLogger, AuthorizedUserBottomSheet3.ALERT_SHEET);
        authorizedUserBottomSheet.getCallbacks().onCancelAuthorizedUser();
        authorizedUserBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, AuthorizedUserBottomSheet authorizedUserBottomSheet) {
        loggingUtils.logDismiss(eventLogger, AuthorizedUserBottomSheet3.ALERT_SHEET);
        authorizedUserBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
