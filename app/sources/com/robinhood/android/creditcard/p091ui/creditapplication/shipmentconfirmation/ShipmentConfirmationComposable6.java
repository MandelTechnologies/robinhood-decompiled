package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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

/* compiled from: ShipmentConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt$ShipmentConfirmation$1$1$2$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class ShipmentConfirmationComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onContinue;

    ShipmentConfirmationComposable6(EventLogger eventLogger, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$onContinue = function0;
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
            ComposerKt.traceEventStart(955018356, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShipmentConfirmationComposable.kt:133)");
        }
        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onContinue;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt$ShipmentConfirmation$1$1$2$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShipmentConfirmationComposable6.invoke$lambda$1$lambda$0(eventLogger, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierNavigationBarsPadding, null, null, false, null, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_confirmation_cta, composer, 0), false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
