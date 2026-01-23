package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalTransferAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDataState;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternalTransferAccountSelectionStateProvider implements StateProvider<InternalTransferAccountSelectionDataState, InternalTransferAccountSelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternalTransferAccountSelectionViewState reduce(InternalTransferAccountSelectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<TransferAccount> accounts2 = dataState.getAccounts();
        if (accounts2 == null) {
            return InternalTransferAccountSelectionViewState.Loading.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : accounts2) {
            if (!((TransferAccount) obj).isExternal()) {
                arrayList.add(obj);
            }
        }
        List<TransferAccount> listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionStateProvider$reduce$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                ApiTransferAccount.TransferAccountType type2 = ((TransferAccount) t).getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                return ComparisonsKt.compareValues(Boolean.valueOf(type2 != transferAccountType), Boolean.valueOf(((TransferAccount) t2).getType() != transferAccountType));
            }
        });
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (TransferAccount transferAccount : listSortedWith) {
            arrayList2.add(new InternalTransferAccountSelectionViewState.Row(transferAccount.getAccountId(), transferAccount.getAccountName(), InternalTransferAccountSelectionStateProvider2.getIconAsset(transferAccount.getType())));
        }
        return new InternalTransferAccountSelectionViewState.Loaded(arrayList2);
    }
}
