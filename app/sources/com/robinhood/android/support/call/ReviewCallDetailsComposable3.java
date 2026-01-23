package com.robinhood.android.support.call;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.support.call.ReviewCallDetailsViewState;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: ReviewCallDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsViewStateParameterProvider, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewCallDetailsComposable3 extends CollectionPreviewParameterProvider<ReviewCallDetailsViewState> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ReviewCallDetailsComposable3() {
        super(CollectionsKt.listOf((Object[]) new ReviewCallDetailsViewState[]{ReviewCallDetailsViewState.Loading.INSTANCE, new ReviewCallDetailsViewState.Loaded("title", new RichText(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, CollectionsKt.emptyList()), new RichText("description", CollectionsKt.emptyList()), "111-222-3333", true, false, true, true), new ReviewCallDetailsViewState.Failed(null, 1, null)}));
    }
}
