package com.robinhood.android.investFlow.search.item;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: DiscoveryItems.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;", "", "onItemClicked", "", "assetId", "Ljava/util/UUID;", "isItemChecked", "", "listId", "onItemDoubleClicked", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface DiscoveryItems {
    void onItemClicked(UUID assetId, boolean isItemChecked, UUID listId);

    void onItemDoubleClicked(UUID assetId, UUID listId);

    /* compiled from: DiscoveryItems.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void onItemClicked$default(DiscoveryItems discoveryItems, UUID uuid, boolean z, UUID uuid2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemClicked");
            }
            if ((i & 4) != 0) {
                uuid2 = null;
            }
            discoveryItems.onItemClicked(uuid, z, uuid2);
        }
    }
}
