package com.robinhood.shared.crypto.p375ui.trade.review;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.shared.crypto.p375ui.trade.review.CryptoReviewState;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CryptoReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/review/ReviewScreenPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/crypto/ui/trade/review/ReviewScreenPreview;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.review.ReviewScreenPreviewParameterProvider, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoReviewComposable4 implements PreviewParameterProvider<ReviewScreenPreview> {
    private final Sequence<ReviewScreenPreview> values = SequencesKt.sequenceOf(new ReviewScreenPreview(CryptoReviewState.TitleContentDisplay.NORMAL), new ReviewScreenPreview(CryptoReviewState.TitleContentDisplay.LARGE_CENTERED));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<ReviewScreenPreview> getValues() {
        return this.values;
    }
}
