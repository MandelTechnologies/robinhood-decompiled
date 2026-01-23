package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EditBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.EditBottomSheet$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class EditBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ EditBottomSheet this$0;

    EditBottomSheet2(EventLogger eventLogger, EditBottomSheet editBottomSheet) {
        this.$eventLogger = eventLogger;
        this.this$0 = editBottomSheet;
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
            ComposerKt.traceEventStart(916564335, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.EditBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditBottomSheet.kt:79)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_edit_identity_settings_cta, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger = this.$eventLogger;
        final EditBottomSheet editBottomSheet = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.EditBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditBottomSheet2.invoke$lambda$1$lambda$0(eventLogger, editBottomSheet);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger2 = this.$eventLogger;
        final EditBottomSheet editBottomSheet2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.EditBottomSheet$ComposeContent$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditBottomSheet2.invoke$lambda$3$lambda$2(eventLogger2, editBottomSheet2);
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
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, EditBottomSheet editBottomSheet) {
        loggingUtils.logContinue(eventLogger, loggingUtils.getBOTTOM_SHEET());
        editBottomSheet.getCallbacks().onOpenSettings();
        editBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, EditBottomSheet editBottomSheet) {
        loggingUtils.logDismiss(eventLogger, loggingUtils.getBOTTOM_SHEET());
        editBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
