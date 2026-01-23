package com.truelayer.payments.p419ui.screens.confirmation.singlepayment;

import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentDetailsView.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$PaymentDetailsViewKt {
    public static final ComposableSingletons$PaymentDetailsViewKt INSTANCE = new ComposableSingletons$PaymentDetailsViewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9592lambda1 = ComposableLambda3.composableLambdaInstance(-519420049, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.ComposableSingletons$PaymentDetailsViewKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519420049, i, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.ComposableSingletons$PaymentDetailsViewKt.lambda-1.<anonymous> (PaymentDetailsView.kt:112)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.heading_how_does_this_work, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27102getLambda1$payments_ui_release() {
        return f9592lambda1;
    }
}
