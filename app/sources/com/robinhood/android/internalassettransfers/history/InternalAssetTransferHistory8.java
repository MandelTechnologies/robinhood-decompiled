package com.robinhood.android.internalassettransfers.history;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferDetailsStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: InternalAssetTransferHistory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.history.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferHistory8 implements PreviewParameterProvider<InternalAssetTransferHistoryViewState> {
    private final Sequence<InternalAssetTransferHistoryViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public InternalAssetTransferHistory8() {
        InternalAssetTransferHistoryViewState.Error error = new InternalAssetTransferHistoryViewState.Error(new IOException());
        UiAssetTransferDetailsStatus.Pending pending = UiAssetTransferDetailsStatus.Pending.INSTANCE;
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.values = SequencesKt.sequenceOf(InternalAssetTransferHistoryViewState.Loading.INSTANCE, error, new InternalAssetTransferHistoryViewState.Loaded(pending, brokerageAccountType, brokerageAccountType2, "2024-12-31", null, false, false, companion.invoke("My account"), companion.invoke("Our account"), null));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<InternalAssetTransferHistoryViewState> getValues() {
        return this.values;
    }
}
