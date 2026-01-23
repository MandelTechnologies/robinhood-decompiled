package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ShipmentOptionsComposableKt$ShipmentOptions$3$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $checked;
    final /* synthetic */ String $entryPointSource;
    final /* synthetic */ EventLogger $eventLogger;

    ShipmentOptionsComposableKt$ShipmentOptions$3$1$1(SnapshotState<Boolean> snapshotState, String str, EventLogger eventLogger) {
        this.$checked = snapshotState;
        this.$entryPointSource = str;
        this.$eventLogger = eventLogger;
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
            ComposerKt.traceEventStart(1070828044, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous>.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:112)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, ShipmentOptionsComposableKt.SHIPMENT_OPTIONS_SIGNATURE_TEST_TAG);
        BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_delivery_signature, composer, 0), null, false, this.$checked.getValue().booleanValue(), null, null, false, false, false, 493, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$entryPointSource) | composer.changedInstance(this.$eventLogger);
        final String str = this.$entryPointSource;
        final EventLogger eventLogger = this.$eventLogger;
        final SnapshotState<Boolean> snapshotState = this.$checked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShipmentOptionsComposableKt$ShipmentOptions$3$1$1.invoke$lambda$2$lambda$1(str, eventLogger, snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoToggleRow3.BentoToggleRow(bentoToggleRowState, (Function1) objRememberedValue, modifierTestTag, composer, BentoToggleRowState.$stable | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(String str, EventLogger eventLogger, SnapshotState snapshotState, boolean z) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, z ? UserInteractionEventData.Action.TOGGLE_ON : UserInteractionEventData.Action.TOGGLE_OFF, loggingUtils.getCcScreen(), new Component(Component.ComponentType.TOGGLE, null, null, 6, null), null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
        snapshotState.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
