package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ShipmentOptionsComposableKt$ShipmentOptions$4$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onEditAddress;

    ShipmentOptionsComposableKt$ShipmentOptions$4$1$1$1(EventLogger eventLogger, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$onEditAddress = function0;
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
            ComposerKt.traceEventStart(-984568539, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:194)");
        }
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, ShipmentOptionsComposableKt.SHIPMENT_OPTIONS_CHANGE_ADDRESS_TEST_TAG);
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onEditAddress);
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onEditAddress;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$4$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShipmentOptionsComposableKt$ShipmentOptions$4$1$1$1.invoke$lambda$1$lambda$0(eventLogger, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierTestTag, false, null, jM6725getTransparent0d7_KjU, 0L, 0.0f, 0.0f, null, null, ComposableSingletons$ShipmentOptionsComposableKt.INSTANCE.getLambda$2046368560$feature_credit_card_externalDebug(), composer, 24624, 6, 1004);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logEdit$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
