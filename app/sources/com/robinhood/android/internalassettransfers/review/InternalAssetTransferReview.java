package com.robinhood.android.internalassettransfers.review;

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

/* compiled from: InternalAssetTransferReview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.review.ComposableSingletons$InternalAssetTransferReviewKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferReview {
    public static final InternalAssetTransferReview INSTANCE = new InternalAssetTransferReview();
    private static Function2<Composer, Integer, Unit> lambda$509976733 = ComposableLambda3.composableLambdaInstance(509976733, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.ComposableSingletons$InternalAssetTransferReviewKt$lambda$509976733$1
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
                ComposerKt.traceEventStart(509976733, i, -1, "com.robinhood.android.internalassettransfers.review.ComposableSingletons$InternalAssetTransferReviewKt.lambda$509976733.<anonymous> (InternalAssetTransferReview.kt:86)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1522952418 = ComposableLambda3.composableLambdaInstance(1522952418, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.ComposableSingletons$InternalAssetTransferReviewKt$lambda$1522952418$1
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
                ComposerKt.traceEventStart(1522952418, i, -1, "com.robinhood.android.internalassettransfers.review.ComposableSingletons$InternalAssetTransferReviewKt.lambda$1522952418.<anonymous> (InternalAssetTransferReview.kt:94)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(1.0f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1522952418$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2107x2559e7bd() {
        return lambda$1522952418;
    }

    /* renamed from: getLambda$509976733$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2108x284fe257() {
        return lambda$509976733;
    }
}
