package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcHubNavTreeStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/event/HubPartialNavTree;", "", "node", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "children", "", "<init>", "(Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;Ljava/util/List;)V", "getNode", "()Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "getChildren", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HubPartialNavTree {
    private final List<EcHubNavNode> children;
    private final EcHubNavNode node;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HubPartialNavTree copy$default(HubPartialNavTree hubPartialNavTree, EcHubNavNode ecHubNavNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            ecHubNavNode = hubPartialNavTree.node;
        }
        if ((i & 2) != 0) {
            list = hubPartialNavTree.children;
        }
        return hubPartialNavTree.copy(ecHubNavNode, list);
    }

    /* renamed from: component1, reason: from getter */
    public final EcHubNavNode getNode() {
        return this.node;
    }

    public final List<EcHubNavNode> component2() {
        return this.children;
    }

    public final HubPartialNavTree copy(EcHubNavNode node, List<EcHubNavNode> children) {
        Intrinsics.checkNotNullParameter(node, "node");
        return new HubPartialNavTree(node, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubPartialNavTree)) {
            return false;
        }
        HubPartialNavTree hubPartialNavTree = (HubPartialNavTree) other;
        return Intrinsics.areEqual(this.node, hubPartialNavTree.node) && Intrinsics.areEqual(this.children, hubPartialNavTree.children);
    }

    public int hashCode() {
        int iHashCode = this.node.hashCode() * 31;
        List<EcHubNavNode> list = this.children;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "HubPartialNavTree(node=" + this.node + ", children=" + this.children + ")";
    }

    public HubPartialNavTree(EcHubNavNode node, List<EcHubNavNode> list) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
        this.children = list;
    }

    public final EcHubNavNode getNode() {
        return this.node;
    }

    public final List<EcHubNavNode> getChildren() {
        return this.children;
    }
}
