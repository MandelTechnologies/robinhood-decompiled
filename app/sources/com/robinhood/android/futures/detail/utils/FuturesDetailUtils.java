package com.robinhood.android.futures.detail.utils;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"mapRelatedContractsToDisplayedContracts", "", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "relatedContracts", "initialContractId", "Ljava/util/UUID;", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.utils.FuturesDetailUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailUtils {
    public static final List<FuturesContract> mapRelatedContractsToDisplayedContracts(List<FuturesContract> relatedContracts, UUID initialContractId) {
        Intrinsics.checkNotNullParameter(relatedContracts, "relatedContracts");
        Intrinsics.checkNotNullParameter(initialContractId, "initialContractId");
        ArrayList arrayList = new ArrayList();
        for (Object obj : relatedContracts) {
            FuturesContract futuresContract = (FuturesContract) obj;
            if (futuresContract.getShouldShowInContractSwitcher() || Intrinsics.areEqual(futuresContract.getId(), initialContractId)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.futures.detail.utils.FuturesDetailUtilsKt$mapRelatedContractsToDisplayedContracts$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((FuturesContract) t).getExpiration(), ((FuturesContract) t2).getExpiration());
            }
        });
    }
}
