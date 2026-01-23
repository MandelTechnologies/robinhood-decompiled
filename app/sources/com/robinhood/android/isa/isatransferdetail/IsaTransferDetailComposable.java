package com.robinhood.android.isa.isatransferdetail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaTransferDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.isatransferdetail.ComposableSingletons$IsaTransferDetailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaTransferDetailComposable {
    public static final IsaTransferDetailComposable INSTANCE = new IsaTransferDetailComposable();
    private static Function2<Composer, Integer, Unit> lambda$1077094711 = ComposableLambda3.composableLambdaInstance(1077094711, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.ComposableSingletons$IsaTransferDetailComposableKt$lambda$1077094711$1
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
                ComposerKt.traceEventStart(1077094711, i, -1, "com.robinhood.android.isa.isatransferdetail.ComposableSingletons$IsaTransferDetailComposableKt.lambda$1077094711.<anonymous> (IsaTransferDetailComposable.kt:253)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1077094711$feature_isa_transfer_detail_externalDebug() {
        return lambda$1077094711;
    }
}
