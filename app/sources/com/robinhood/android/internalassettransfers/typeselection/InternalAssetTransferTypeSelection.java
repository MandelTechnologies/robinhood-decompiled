package com.robinhood.android.internalassettransfers.typeselection;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferTypeSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.typeselection.ComposableSingletons$InternalAssetTransferTypeSelectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferTypeSelection {
    public static final InternalAssetTransferTypeSelection INSTANCE = new InternalAssetTransferTypeSelection();
    private static Function2<Composer, Integer, Unit> lambda$1432683619 = ComposableLambda3.composableLambdaInstance(1432683619, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.typeselection.ComposableSingletons$InternalAssetTransferTypeSelectionKt$lambda$1432683619$1
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
                ComposerKt.traceEventStart(1432683619, i, -1, "com.robinhood.android.internalassettransfers.typeselection.ComposableSingletons$InternalAssetTransferTypeSelectionKt.lambda$1432683619.<anonymous> (InternalAssetTransferTypeSelection.kt:213)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1433222168, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9056lambda$1433222168 = ComposableLambda3.composableLambdaInstance(-1433222168, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.typeselection.ComposableSingletons$InternalAssetTransferTypeSelectionKt$lambda$-1433222168$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1433222168, i, -1, "com.robinhood.android.internalassettransfers.typeselection.ComposableSingletons$InternalAssetTransferTypeSelectionKt.lambda$-1433222168.<anonymous> (InternalAssetTransferTypeSelection.kt:220)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.4f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1433222168$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2110x3ba238a3() {
        return f9056lambda$1433222168;
    }

    /* renamed from: getLambda$1432683619$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2111x8ffab097() {
        return lambda$1432683619;
    }
}
