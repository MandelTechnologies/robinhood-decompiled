package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MandateDetailsView.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$MandateDetailsViewKt {
    public static final ComposableSingletons$MandateDetailsViewKt INSTANCE = new ComposableSingletons$MandateDetailsViewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9588lambda1 = ComposableLambda3.composableLambdaInstance(-8116752, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateDetailsViewKt$lambda-1$1
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
                ComposerKt.traceEventStart(-8116752, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateDetailsViewKt.lambda-1.<anonymous> (MandateDetailsView.kt:143)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.payment_details, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9589lambda2 = ComposableLambda3.composableLambdaInstance(-1966781677, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateDetailsViewKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1966781677, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateDetailsViewKt.lambda-2.<anonymous> (MandateDetailsView.kt:166)");
                }
                MandateDetailsViewKt.m27100MandateDetailsView1yyLQnY(MandateHelpers2.INSTANCE.getConfirmationViewData(), null, 0.0f, 0.0f, null, null, composer, 8, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27097getLambda1$payments_ui_release() {
        return f9588lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27098getLambda2$payments_ui_release() {
        return f9589lambda2;
    }
}
