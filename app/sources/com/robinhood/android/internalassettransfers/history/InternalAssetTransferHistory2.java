package com.robinhood.android.internalassettransfers.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferHistory.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.history.ComposableSingletons$InternalAssetTransferHistoryKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistory2 {
    public static final InternalAssetTransferHistory2 INSTANCE = new InternalAssetTransferHistory2();

    /* renamed from: lambda$-932007773, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9049lambda$932007773 = ComposableLambda3.composableLambdaInstance(-932007773, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.ComposableSingletons$InternalAssetTransferHistoryKt$lambda$-932007773$1
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
                ComposerKt.traceEventStart(-932007773, i, -1, "com.robinhood.android.internalassettransfers.history.ComposableSingletons$InternalAssetTransferHistoryKt.lambda$-932007773.<anonymous> (InternalAssetTransferHistory.kt:193)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-932007773$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2090xe3e51cdf() {
        return f9049lambda$932007773;
    }
}
