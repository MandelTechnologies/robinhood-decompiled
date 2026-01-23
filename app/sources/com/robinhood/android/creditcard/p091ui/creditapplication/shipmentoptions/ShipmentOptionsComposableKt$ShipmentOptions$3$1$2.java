package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ShipmentOptionsComposableKt$ShipmentOptions$3$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $checked;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Function2<ShipmentOption, Boolean, Unit> $onContinue;
    final /* synthetic */ SnapshotState<ShipmentOption> $selectedOption;

    /* JADX WARN: Multi-variable type inference failed */
    ShipmentOptionsComposableKt$ShipmentOptions$3$1$2(SnapshotState<ShipmentOption> snapshotState, EventLogger eventLogger, Function2<? super ShipmentOption, ? super Boolean, Unit> function2, boolean z, SnapshotState<Boolean> snapshotState2) {
        this.$selectedOption = snapshotState;
        this.$eventLogger = eventLogger;
        this.$onContinue = function2;
        this.$isLoading = z;
        this.$checked = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952045583, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous>.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:138)");
        }
        if (this.$selectedOption.getValue() != null) {
            composer.startReplaceGroup(1574409561);
            int i2 = C12201R.string.credit_app_shipment_options_cta;
            ShipmentOption value = this.$selectedOption.getValue();
            Intrinsics.checkNotNull(value);
            strStringResource = StringResources_androidKt.stringResource(i2, new Object[]{value.getCarrier()}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1574565212);
            strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.endReplaceGroup();
        }
        String str = strStringResource;
        boolean z = this.$selectedOption.getValue() != null;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
        final EventLogger eventLogger = this.$eventLogger;
        final Function2<ShipmentOption, Boolean, Unit> function2 = this.$onContinue;
        final SnapshotState<ShipmentOption> snapshotState = this.$selectedOption;
        final SnapshotState<Boolean> snapshotState2 = this.$checked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$3$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShipmentOptionsComposableKt$ShipmentOptions$3$1$2.invoke$lambda$1$lambda$0(eventLogger, function2, snapshotState, snapshotState2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, str, this.$isLoading, null, z, null, null, false, null, false, composer, 0, 0, 64062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        Object value = snapshotState.getValue();
        Intrinsics.checkNotNull(value);
        function2.invoke(value, snapshotState2.getValue());
        return Unit.INSTANCE;
    }
}
