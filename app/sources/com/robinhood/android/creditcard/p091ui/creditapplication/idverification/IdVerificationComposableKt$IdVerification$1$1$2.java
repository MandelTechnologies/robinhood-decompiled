package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import android.text.TextUtils;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: IdVerificationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class IdVerificationComposableKt$IdVerification$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ IdVerificationData $data;
    final /* synthetic */ SnapshotState<String> $dob$delegate;
    final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<String> $firstName$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ SnapshotState<String> $lastName$delegate;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ Function1<IdVerificationData, Unit> $onContinue;
    final /* synthetic */ SnapshotState<String> $ssn$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    IdVerificationComposableKt$IdVerification$1$1$2(IdVerificationData idVerificationData, EventLogger eventLogger, FocusManager focusManager, Function1<? super IdVerificationData, Unit> function1, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<String> snapshotState4, boolean z, Function0<Unit> function0, SnapshotState<Boolean> snapshotState5) {
        this.$data = idVerificationData;
        this.$eventLogger = eventLogger;
        this.$focusManager = focusManager;
        this.$onContinue = function1;
        this.$firstName$delegate = snapshotState;
        this.$lastName$delegate = snapshotState2;
        this.$dob$delegate = snapshotState3;
        this.$ssn$delegate = snapshotState4;
        this.$isLoading = z;
        this.$onClose = function0;
        this.$dobError$delegate = snapshotState5;
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
            ComposerKt.traceEventStart(1942033895, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous>.<anonymous>.<anonymous> (IdVerificationComposable.kt:89)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
        boolean z = !(this.$data.getFirstNameEditable() && StringsKt.isBlank(IdVerificationComposableKt.IdVerification$lambda$2(this.$firstName$delegate))) && !(this.$data.getLastNameEditable() && StringsKt.isBlank(IdVerificationComposableKt.IdVerification$lambda$6(this.$lastName$delegate))) && (!(this.$data.getDobEditable() && IdVerificationComposableKt.IdVerification$lambda$14(this.$dobError$delegate)) && (!this.$data.getSsnEditable() || (IdVerificationComposableKt.IdVerification$lambda$18(this.$ssn$delegate).length() == 9 && TextUtils.isDigitsOnly(IdVerificationComposableKt.IdVerification$lambda$18(this.$ssn$delegate)))));
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$focusManager) | composer.changed(this.$onContinue) | composer.changedInstance(this.$data) | composer.changed(this.$firstName$delegate) | composer.changed(this.$lastName$delegate) | composer.changed(this.$dob$delegate) | composer.changed(this.$ssn$delegate);
        final EventLogger eventLogger = this.$eventLogger;
        final FocusManager focusManager = this.$focusManager;
        final Function1<IdVerificationData, Unit> function1 = this.$onContinue;
        final IdVerificationData idVerificationData = this.$data;
        final SnapshotState<String> snapshotState = this.$firstName$delegate;
        final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
        final SnapshotState<String> snapshotState3 = this.$dob$delegate;
        final SnapshotState<String> snapshotState4 = this.$ssn$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function0 function0 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdVerificationComposableKt$IdVerification$1$1$2.invoke$lambda$1$lambda$0(eventLogger, focusManager, function1, idVerificationData, snapshotState, snapshotState2, snapshotState3, snapshotState4);
                }
            };
            composer.updateRememberedValue(function0);
            objRememberedValue = function0;
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        boolean z2 = this.$isLoading;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$focusManager) | composer.changed(this.$onClose);
        final EventLogger eventLogger2 = this.$eventLogger;
        final FocusManager focusManager2 = this.$focusManager;
        final Function0<Unit> function03 = this.$onClose;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdVerificationComposableKt$IdVerification$1$1$2.invoke$lambda$3$lambda$2(eventLogger2, focusManager2, function03);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource, z2, null, z, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 57919);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, FocusManager focusManager, Function1 function1, IdVerificationData idVerificationData, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function1.invoke(IdVerificationData.copy$default(idVerificationData, IdVerificationComposableKt.IdVerification$lambda$2(snapshotState), IdVerificationComposableKt.IdVerification$lambda$6(snapshotState2), IdVerificationComposableKt.IdVerification$lambda$10(snapshotState3), IdVerificationComposableKt.IdVerification$lambda$18(snapshotState4), false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, FocusManager focusManager, Function0 function0) {
        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
