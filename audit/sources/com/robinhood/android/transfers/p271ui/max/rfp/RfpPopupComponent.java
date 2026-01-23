package com.robinhood.android.transfers.p271ui.max.rfp;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RfpPopupComponent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.rfp.ComposableSingletons$RfpPopupComponentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RfpPopupComponent {
    public static final RfpPopupComponent INSTANCE = new RfpPopupComponent();

    /* renamed from: lambda$-927543409, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9292lambda$927543409 = ComposableLambda3.composableLambdaInstance(-927543409, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rfp.ComposableSingletons$RfpPopupComponentKt$lambda$-927543409$1
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
                ComposerKt.traceEventStart(-927543409, i, -1, "com.robinhood.android.transfers.ui.max.rfp.ComposableSingletons$RfpPopupComponentKt.lambda$-927543409.<anonymous> (RfpPopupComponent.kt:140)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-927543409$feature_transfers_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19916getLambda$927543409$feature_transfers_externalRelease() {
        return f9292lambda$927543409;
    }
}
