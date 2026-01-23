package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.matcha.p177ui.history.detail.incentive.MatchaIncentiveDetailViewState;
import com.robinhood.android.models.matcha.api.MatchaIncentiveType;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: MatchaIncentiveDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailPreviewProvider, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaIncentiveDetailComposable2 implements PreviewParameterProvider<MatchaIncentiveDetailViewState> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<MatchaIncentiveDetailViewState> getValues() {
        return SequencesKt.sequenceOf(new MatchaIncentiveDetailViewState.Loading(null, 1, null), new MatchaIncentiveDetailViewState.Loaded(MatchaIncentiveType.INVITED_USER, "John Doe", "December 23, 2024", "+$10.00", 1, 3, false));
    }
}
