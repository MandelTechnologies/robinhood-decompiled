package com.robinhood.android.eventcontracts.hub.p134v2.root;

import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: HubCategoryContentDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentDelegate;", "", "streamNodeId", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "updateNodeId", "", "nodeId", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface HubCategoryContentDelegate {
    Flow<UUID> streamNodeId();

    void updateNodeId(UUID nodeId);
}
