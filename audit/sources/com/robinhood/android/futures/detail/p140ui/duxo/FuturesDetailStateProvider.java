package com.robinhood.android.futures.detail.p140ui.duxo;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState2;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesDetailStateProvider implements StateProvider<FuturesDetailDataState, FuturesDetailViewState> {
    public static final int $stable = 0;
    public static final FuturesDetailStateProvider INSTANCE = new FuturesDetailStateProvider();

    private FuturesDetailStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesDetailViewState reduce(FuturesDetailDataState dataState) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        String displaySymbol;
        String displayName;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(FuturesDetailViewState2.IacBanner.INSTANCE);
        listCreateListBuilder.add(FuturesDetailViewState2.Chart.INSTANCE);
        FuturesDetailViewState.PositionData positionData = dataState.getPositionData();
        if (positionData != null) {
            listCreateListBuilder.add(new FuturesDetailViewState2.Position(positionData));
        }
        FuturesDetailViewState.HistorySectionData historySectionDataBuildPendingOrderHistorySectionData = dataState.buildPendingOrderHistorySectionData();
        if (historySectionDataBuildPendingOrderHistorySectionData != null) {
            listCreateListBuilder.add(new FuturesDetailViewState2.PendingHistory(historySectionDataBuildPendingOrderHistorySectionData));
        }
        listCreateListBuilder.add(new FuturesDetailViewState2.ContractSpec(dataState.getContractSpecsData()));
        listCreateListBuilder.add(new FuturesDetailViewState2.Stats(dataState.getStats()));
        FuturesDetailViewState.AboutData about = dataState.getAbout();
        if (about != null) {
            listCreateListBuilder.add(new FuturesDetailViewState2.About(about));
        }
        listCreateListBuilder.add(FuturesDetailViewState2.Spacer.INSTANCE);
        FuturesDetailViewState.HistorySectionData historySectionDataBuildSettledOrderHistorySectionData = dataState.buildSettledOrderHistorySectionData();
        if (historySectionDataBuildSettledOrderHistorySectionData != null) {
            listCreateListBuilder.add(new FuturesDetailViewState2.SettledHistory(historySectionDataBuildSettledOrderHistorySectionData));
        }
        listCreateListBuilder.add(new FuturesDetailViewState2.Disclosure(dataState.getLocale()));
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        UUID selectedContractId = dataState.getSelectedContractId();
        FuturesContract selectedContract = dataState.getSelectedContract();
        String rhsAccountNumber = dataState.getRhsAccountNumber();
        FuturesAccount futuresAccount = dataState.getFuturesAccount();
        UUID id = futuresAccount != null ? futuresAccount.getId() : null;
        StringResource contractSelectorDisplay = dataState.getContractSelectorDisplay();
        ImmutableList<FuturesDetailViewState.RelatedContract> relatedContractsData = dataState.getRelatedContractsData();
        boolean contractSelectorOpen = dataState.getContractSelectorOpen();
        boolean zIsInFuturesProductVsContractExperiment = dataState.isInFuturesProductVsContractExperiment();
        boolean zIsViewingProductOnly = dataState.isViewingProductOnly();
        FuturesProduct futuresProduct = dataState.getFuturesProduct();
        if (futuresProduct == null || (displayName = futuresProduct.getDisplayName()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(displayName)) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        FuturesProduct futuresProduct2 = dataState.getFuturesProduct();
        if (futuresProduct2 == null || (displaySymbol = futuresProduct2.getDisplaySymbol()) == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(displaySymbol)) == null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        return new FuturesDetailViewState(selectedContractId, selectedContract, rhsAccountNumber, id, contractSelectorDisplay, relatedContractsData, contractSelectorOpen, zIsInFuturesProductVsContractExperiment, zIsViewingProductOnly, stringResourceInvoke, stringResourceInvoke2, dataState.getTopBarData(), extensions2.toImmutableList(listBuild), dataState.getTradeBarData(), dataState.getFtuxProgressState(), Boolean.valueOf(dataState.getUserIsMiB()), dataState.getLoggingData());
    }
}
