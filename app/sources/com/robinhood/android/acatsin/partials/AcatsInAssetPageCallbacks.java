package com.robinhood.android.acatsin.partials;

import kotlin.Metadata;

/* compiled from: AcatsInAssetPageCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "", "onAssetEntered", "", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAssetUpdated", "onAssetRemoved", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsInAssetPageCallbacks {
    void onAssetEntered(UiAcatsAsset asset);

    void onAssetRemoved(UiAcatsAsset asset);

    void onAssetUpdated(UiAcatsAsset asset);
}
