package com.robinhood.android.retirementhistory;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.retirementhistory.RetirementHistoryItemViewState;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: RetirementHistoryItemDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "<init>", "()V", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirementhistory.RetirementHistoryItemViewStateParameterProvider, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementHistoryItemDetailScreen8 extends CollectionPreviewParameterProvider<RetirementHistoryItemViewState> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public RetirementHistoryItemDetailScreen8() {
        super(CollectionsKt.listOf((Object[]) new RetirementHistoryItemViewState[]{RetirementHistoryItemViewState.Loading.INSTANCE, new RetirementHistoryItemViewState.Loaded("IRA History Detail", "Some detailed information about this retirement history item", CollectionsKt.listOf((Object[]) new DataRowStacked[]{new DataRowStacked("Label One", null, null, "First value", null, null, 54, null), new DataRowStacked("Label Two", null, null, "Second value", null, null, 54, null), new DataRowStacked("Label Three", null, null, "Third value", null, null, 54, null)}), CollectionsKt.emptyList())}));
    }
}
