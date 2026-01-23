package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsDataState2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiIacInfoBanner;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanner;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SourceOfFundsStateProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsViewState;", "<init>", "()V", "reduce", "dataState", "getAccountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferBanners", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "getAccountRows$feature_p2p_externalDebug", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SourceOfFundsStateProvider implements StateProvider<SourceOfFundsDataState, SourceOfFundsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SourceOfFundsViewState reduce(SourceOfFundsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new SourceOfFundsViewState(!dataState.getTransferAccounts().isEmpty(), Intrinsics.areEqual(dataState.getHasActiveDebitCard(), Boolean.FALSE) && !dataState.getTransferAccounts().isEmpty(), getAccountRows$feature_p2p_externalDebug(dataState.getTransferAccounts(), dataState.getTransferBanners()), dataState.getSelectionEvent(), dataState.getSelectedAccountId());
    }

    public final ImmutableList<SourceOfFundsDataState2> getAccountRows$feature_p2p_externalDebug(List<TransferAccount> transferAccounts, ApiTransferBanners transferBanners) {
        List<ApiTransferBanner> source_banners;
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        if (transferAccounts.isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                arrayList.add(SourceOfFundsDataState2.Placeholder.INSTANCE);
            }
            return extensions2.toImmutableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : transferAccounts) {
            if (TransferAccounts3.isValidP2PSourceOfFunds((TransferAccount) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList<SourceOfFundsDataState2.Account> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new SourceOfFundsDataState2.Account((TransferAccount) it.next()));
        }
        if (transferBanners == null || (source_banners = transferBanners.getSource_banners()) == null) {
            return extensions2.toImmutableList(arrayList3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : source_banners) {
            String account_id = ((ApiTransferBanner) obj2).getAccount_id();
            Object arrayList4 = linkedHashMap.get(account_id);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(account_id, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        for (SourceOfFundsDataState2.Account account : arrayList3) {
            List listEmptyList = (List) linkedHashMap.get(account.getAccount().getAccountId());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList6.add(new SourceOfFundsDataState2.Banner(ApiIacInfoBanner.toDbModel$default(((ApiTransferBanner) it2.next()).getBanner(), null, null, null, 4, null)));
            }
            CollectionsKt.addAll(arrayList5, CollectionsKt.plus((Collection) CollectionsKt.listOf(account), (Iterable) arrayList6));
        }
        return extensions2.toImmutableList(arrayList5);
    }
}
