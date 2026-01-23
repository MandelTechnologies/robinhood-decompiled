package com.robinhood.android.acats.plaid.transfer.unsupported;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetType;
import com.robinhood.models.serverdriven.experimental.api.Money;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInPlaidUnsupportedAssetsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDataState;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsViewState;", "<init>", "()V", "reduce", "dataState", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsStateProvider implements StateProvider<AcatsInPlaidUnsupportedAssetsDataState, AcatsInPlaidUnsupportedAssetsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInPlaidUnsupportedAssetsViewState reduce(AcatsInPlaidUnsupportedAssetsDataState dataState) {
        List listEmptyList;
        List listEmptyList2;
        List listEmptyList3;
        List listEmptyList4;
        List listEmptyList5;
        List listEmptyList6;
        List<EquityAsset> equityAssets;
        List<EquityAsset> equityAssets2;
        List<OptionAsset> optionAssets;
        List<EquityAsset> equityAssets3;
        List<EquityAsset> equityAssets4;
        List<EquityAsset> equityAssets5;
        Money margin;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PlaidBrokerAssets plaidBrokerAssets = dataState.getPlaidBrokerAssets();
        Money money = (plaidBrokerAssets == null || (margin = plaidBrokerAssets.getMargin()) == null || dataState.isMarginInvestingEnabled()) ? null : margin;
        PlaidBrokerAssets plaidBrokerAssets2 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets2 == null || (equityAssets5 = plaidBrokerAssets2.getEquityAssets()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : equityAssets5) {
                EquityAsset equityAsset = (EquityAsset) obj;
                if (equityAsset.getAssetType() == AcatsInBrokerAssetType.EQUITY && !equityAsset.isSupported()) {
                    listEmptyList.add(obj);
                }
            }
        }
        List list = listEmptyList;
        PlaidBrokerAssets plaidBrokerAssets3 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets3 == null || (equityAssets4 = plaidBrokerAssets3.getEquityAssets()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = new ArrayList();
            for (Object obj2 : equityAssets4) {
                EquityAsset equityAsset2 = (EquityAsset) obj2;
                if (equityAsset2.getAssetType() == AcatsInBrokerAssetType.FRACTIONAL_SHARES && !equityAsset2.isSupported()) {
                    listEmptyList2.add(obj2);
                }
            }
        }
        List list2 = listEmptyList2;
        PlaidBrokerAssets plaidBrokerAssets4 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets4 == null || (equityAssets3 = plaidBrokerAssets4.getEquityAssets()) == null) {
            listEmptyList3 = CollectionsKt.emptyList();
        } else {
            listEmptyList3 = new ArrayList();
            for (Object obj3 : equityAssets3) {
                EquityAsset equityAsset3 = (EquityAsset) obj3;
                if (equityAsset3.getAssetType() == AcatsInBrokerAssetType.MUTUAL_FUND && !equityAsset3.isSupported()) {
                    listEmptyList3.add(obj3);
                }
            }
        }
        List list3 = listEmptyList3;
        PlaidBrokerAssets plaidBrokerAssets5 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets5 == null || (optionAssets = plaidBrokerAssets5.getOptionAssets()) == null) {
            listEmptyList4 = CollectionsKt.emptyList();
        } else {
            listEmptyList4 = new ArrayList();
            for (Object obj4 : optionAssets) {
                OptionAsset optionAsset = (OptionAsset) obj4;
                if (!dataState.isOptionsInvestingEnabled() || !optionAsset.isSupported()) {
                    listEmptyList4.add(obj4);
                }
            }
        }
        List list4 = listEmptyList4;
        PlaidBrokerAssets plaidBrokerAssets6 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets6 == null || (equityAssets2 = plaidBrokerAssets6.getEquityAssets()) == null) {
            listEmptyList5 = CollectionsKt.emptyList();
        } else {
            listEmptyList5 = new ArrayList();
            for (Object obj5 : equityAssets2) {
                EquityAsset equityAsset4 = (EquityAsset) obj5;
                if (equityAsset4.getAssetType() == AcatsInBrokerAssetType.BOND && !equityAsset4.isSupported()) {
                    listEmptyList5.add(obj5);
                }
            }
        }
        List list5 = listEmptyList5;
        PlaidBrokerAssets plaidBrokerAssets7 = dataState.getPlaidBrokerAssets();
        if (plaidBrokerAssets7 == null || (equityAssets = plaidBrokerAssets7.getEquityAssets()) == null) {
            listEmptyList6 = CollectionsKt.emptyList();
            if (listEmptyList6 == null) {
                listEmptyList6 = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList6 = new ArrayList();
            for (Object obj6 : equityAssets) {
                EquityAsset equityAsset5 = (EquityAsset) obj6;
                if (equityAsset5.getAssetType() == AcatsInBrokerAssetType.UNKNOWN && !equityAsset5.isSupported()) {
                    listEmptyList6.add(obj6);
                }
            }
        }
        return new AcatsInPlaidUnsupportedAssetsViewState(money, list, list2, list3, list4, list5, listEmptyList6);
    }
}
