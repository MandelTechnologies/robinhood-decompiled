package com.robinhood.android.acatsin.assets;

import com.robinhood.android.acatsin.assets.AcatsInAssetListViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInAssetListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDataState;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListStateProvider, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInAssetListViewState3 implements StateProvider<AcatsInAssetListDataState, AcatsInAssetListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInAssetListViewState reduce(AcatsInAssetListDataState dataState) {
        List<AcatsListPageResponse.AcatsListPageRow> assets;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AcatsListPageResponse assetListPageResponse = dataState.getAssetListPageResponse();
        ApiAcatsTransfer.Asset.AssetType selectedAssetType = dataState.getSelectedAssetType();
        if (assetListPageResponse == null) {
            return AcatsInAssetListViewState.Loading.INSTANCE;
        }
        List<AcatsListPageResponse.AcatsListAssetType> types = assetListPageResponse.getTypes();
        if (selectedAssetType == null) {
            assets = assetListPageResponse.getAssets();
        } else {
            List<AcatsListPageResponse.AcatsListPageRow> assets2 = assetListPageResponse.getAssets();
            ArrayList arrayList = new ArrayList();
            for (Object obj : assets2) {
                if (((AcatsListPageResponse.AcatsListPageRow) obj).getType() == selectedAssetType) {
                    arrayList.add(obj);
                }
            }
            assets = arrayList;
        }
        return new AcatsInAssetListViewState.Loaded(assetListPageResponse.getTitle(), assetListPageResponse.getSubtitle(), types, assets, !types.isEmpty(), selectedAssetType);
    }
}
