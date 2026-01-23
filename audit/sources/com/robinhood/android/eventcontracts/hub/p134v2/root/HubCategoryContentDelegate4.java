package com.robinhood.android.eventcontracts.hub.p134v2.root;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: HubCategoryContentDelegate.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentPlugin;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentDelegate;", "<init>", "()V", "nodeIdFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljava/util/UUID;", "streamNodeId", "Lkotlinx/coroutines/flow/Flow;", "updateNodeId", "", "nodeId", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentPlugin, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubCategoryContentDelegate4 implements HubCategoryContentDelegate {
    public static final int $stable = 8;
    private final SharedFlow2<UUID> nodeIdFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate
    public Flow<UUID> streamNodeId() {
        return FlowKt.distinctUntilChanged(FlowKt.asSharedFlow(this.nodeIdFlow));
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate
    public void updateNodeId(UUID nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        this.nodeIdFlow.tryEmit(nodeId);
    }
}
