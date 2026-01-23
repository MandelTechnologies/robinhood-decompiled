package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ShipmentConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ComposableSingletons$ShipmentConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ShipmentConfirmationComposable {
    public static final ShipmentConfirmationComposable INSTANCE = new ShipmentConfirmationComposable();

    /* renamed from: lambda$-69596888, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8797lambda$69596888 = ComposableLambda3.composableLambdaInstance(-69596888, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ComposableSingletons$ShipmentConfirmationComposableKt$lambda$-69596888$1
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
                ComposerKt.traceEventStart(-69596888, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ComposableSingletons$ShipmentConfirmationComposableKt.lambda$-69596888.<anonymous> (ShipmentConfirmationComposable.kt:73)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1734976779, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8796lambda$1734976779 = ComposableLambda3.composableLambdaInstance(-1734976779, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ComposableSingletons$ShipmentConfirmationComposableKt$lambda$-1734976779$1
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
                ComposerKt.traceEventStart(-1734976779, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ComposableSingletons$ShipmentConfirmationComposableKt.lambda$-1734976779.<anonymous> (ShipmentConfirmationComposable.kt:73)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ShipmentConfirmationComposable.INSTANCE.m12808getLambda$69596888$feature_credit_card_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1734976779$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12807getLambda$1734976779$feature_credit_card_externalDebug() {
        return f8796lambda$1734976779;
    }

    /* renamed from: getLambda$-69596888$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12808getLambda$69596888$feature_credit_card_externalDebug() {
        return f8797lambda$69596888;
    }
}
