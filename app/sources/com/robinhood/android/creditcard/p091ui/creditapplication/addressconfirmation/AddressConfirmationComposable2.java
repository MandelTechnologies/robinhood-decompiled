package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressConfirmation$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AddressConfirmationComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ Function1<AddressType, Unit> $onContinue;
    final /* synthetic */ SnapshotState<AddressType> $selectedAddress;

    /* JADX WARN: Multi-variable type inference failed */
    AddressConfirmationComposable2(SnapshotState<AddressType> snapshotState, EventLogger eventLogger, Function1<? super AddressType, Unit> function1, boolean z, Function0<Unit> function0) {
        this.$selectedAddress = snapshotState;
        this.$eventLogger = eventLogger;
        this.$onContinue = function1;
        this.$isLoading = z;
        this.$onClose = function0;
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
            ComposerKt.traceEventStart(854875225, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmation.<anonymous>.<anonymous>.<anonymous> (AddressConfirmationComposable.kt:75)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
        boolean z = this.$selectedAddress.getValue() != null;
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
        final EventLogger eventLogger = this.$eventLogger;
        final Function1<AddressType, Unit> function1 = this.$onContinue;
        final SnapshotState<AddressType> snapshotState = this.$selectedAddress;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressConfirmation$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressConfirmationComposable2.invoke$lambda$1$lambda$0(eventLogger, function1, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        boolean z2 = this.$isLoading;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onClose);
        final EventLogger eventLogger2 = this.$eventLogger;
        final Function0<Unit> function02 = this.$onClose;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressConfirmation$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressConfirmationComposable2.invoke$lambda$3$lambda$2(eventLogger2, function02);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, function0, strStringResource, z2, null, z, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 57918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function1 function1, SnapshotState snapshotState) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        Object value = snapshotState.getValue();
        Intrinsics.checkNotNull(value);
        function1.invoke(value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
