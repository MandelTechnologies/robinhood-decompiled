package com.robinhood.android.acatsin.asset;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInReviewAssetsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsDataState;", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsViewState;", "<init>", "()V", "reduce", "dataState", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInReviewAssetsStateProvider implements StateProvider<AcatsInReviewAssetsDataState, AcatsInReviewAssetsViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInReviewAssetsViewState reduce(AcatsInReviewAssetsDataState dataState) {
        UiAcatsAsset.CashAsset next;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Iterator it = dataState.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (((UiAcatsAsset) next) instanceof UiAcatsAsset.CashAsset) {
                break;
            }
        }
        UiAcatsAsset.CashAsset cashAsset = next instanceof UiAcatsAsset.CashAsset ? next : null;
        List<UiAcatsAsset> assets = dataState.getAssets();
        ArrayList arrayList = new ArrayList();
        for (Object obj : assets) {
            if (obj instanceof UiAcatsAsset.EquityAsset) {
                arrayList.add(obj);
            }
        }
        List<UiAcatsAsset> assets2 = dataState.getAssets();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : assets2) {
            if (obj2 instanceof UiAcatsAsset.OptionAsset) {
                arrayList2.add(obj2);
            }
        }
        return new AcatsInReviewAssetsViewState(cashAsset, arrayList, arrayList2, dataState.getAssetFilterType(), dataState.getInAcatsRejectedImprovementsExperiment());
    }
}
