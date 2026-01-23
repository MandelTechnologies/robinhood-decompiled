package com.robinhood.android.transfers.p271ui.max.accounts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsAdapter;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanner;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapToRowsWithBanners.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001at\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¨\u0006\u0014"}, m3636d2 = {"mapToRowsWithBanners", "", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "transactingAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "banners", "", "", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanner;", "isEditing", "", "isExternal", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.MapToRowsWithBannersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MapToRowsWithBanners {
    public static final List<TransferAccountsAdapter.RowItem> mapToRowsWithBanners(List<TransferAccountsViewState.AccountTransferDisplayData> list, TransferAccount transferAccount, Map<String, ? extends List<ApiTransferBanner>> banners, boolean z, boolean z2, IraContributionType iraContributionType, boolean z3, MatchRateBreakdown matchRateBreakdown, RecipientType recipientType) {
        List listListOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(banners, "banners");
        List<TransferAccountsViewState.AccountTransferDisplayData> list2 = list;
        ArrayList<TransferAccountsAdapter.RowItem.Account> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new TransferAccountsAdapter.RowItem.Account(z, (TransferAccountsViewState.AccountTransferDisplayData) it.next(), transferAccount, iraContributionType, z3, false, recipientType, null, matchRateBreakdown, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (TransferAccountsAdapter.RowItem.Account account : arrayList) {
            List<ApiTransferBanner> list3 = banners.get(account.getAccountDisplayData().getAccount().getAccountId());
            if (list3 != null) {
                listListOf = new ArrayList();
                listListOf.add(account);
                List<ApiTransferBanner> list4 = list3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new TransferAccountsAdapter.RowItem.Banner((ApiTransferBanner) it2.next()));
                }
                listListOf.addAll(arrayList3);
            } else {
                listListOf = CollectionsKt.listOf(account);
            }
            CollectionsKt.addAll(arrayList2, listListOf);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        List listEmptyList = null;
        List<ApiTransferBanner> list5 = banners.get(null);
        if (list5 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list5) {
                if (((ApiTransferBanner) obj).getAccount_type().isExternal() == z2) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new TransferAccountsAdapter.RowItem.Banner((ApiTransferBanner) it3.next()));
            }
            listEmptyList = arrayList5;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) arrayList2, (Iterable) listEmptyList);
    }
}
