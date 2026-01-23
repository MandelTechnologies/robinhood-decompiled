package com.robinhood.android.internalassettransfers.history;

import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryViewState;
import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferDetailsStatus;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: InternalAssetTransferHistoryStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistoryStateProvider implements StateProvider<InternalAssetTransferHistoryDataState, InternalAssetTransferHistoryViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternalAssetTransferHistoryViewState reduce(InternalAssetTransferHistoryDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAssetTransferRecord() != null) {
            UiAssetTransferDetailsStatus state = dataState.getAssetTransferRecord().getState();
            BrokerageAccountType sourceBrokerageAccountType = dataState.getAssetTransferRecord().getSourceBrokerageAccountType();
            BrokerageAccountType sinkBrokerageAccountType = dataState.getAssetTransferRecord().getSinkBrokerageAccountType();
            InstantFormatter instantFormatter = InstantFormatter.DATE_IN_SYSTEM_ZONE;
            String str = instantFormatter.format(dataState.getAssetTransferRecord().getCreated());
            Instant completed = dataState.getAssetTransferRecord().getCompleted();
            String str2 = completed != null ? instantFormatter.format(completed) : null;
            boolean showDialog = dataState.getShowDialog();
            boolean viewAssetListLoading = dataState.getViewAssetListLoading();
            StringResource sourceAccountName = InternalAssetTransferHistoryStateProvider2.getSourceAccountName(dataState.getSourceAccount(), dataState.getAssetTransferRecord().isSourceOwner(), dataState.getAssetTransferRecord().getSourceBrokerageAccountType(), dataState.getAssetTransferRecord().getSourceManagementType(), dataState.getJointUsers(), dataState.getCurrentUserId());
            StringResource sinkAccountName = InternalAssetTransferHistoryStateProvider2.getSinkAccountName(dataState.getSinkAccount(), dataState.getAssetTransferRecord().isSinkOwner(), dataState.getAssetTransferRecord().getSinkBrokerageAccountType(), dataState.getAssetTransferRecord().getSinkManagementType(), dataState.getJointUsers(), dataState.getCurrentUserId());
            BigDecimal acatsMatchMovementAmount = dataState.getAssetTransferRecord().getAcatsMatchMovementAmount();
            if (acatsMatchMovementAmount.compareTo(BigDecimal.ZERO) <= 0) {
                acatsMatchMovementAmount = null;
            }
            return new InternalAssetTransferHistoryViewState.Loaded(state, sourceBrokerageAccountType, sinkBrokerageAccountType, str, str2, showDialog, viewAssetListLoading, sourceAccountName, sinkAccountName, Money3.format$default(acatsMatchMovementAmount != null ? Money3.toMoney$default(acatsMatchMovementAmount, null, 1, null) : null, null, 1, null));
        }
        if (dataState.getNetworkError() != null) {
            return new InternalAssetTransferHistoryViewState.Error(dataState.getNetworkError());
        }
        return InternalAssetTransferHistoryViewState.Loading.INSTANCE;
    }
}
