package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcHubNavTreeStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/store/event/PartialTree;", "", "isRoot", "", "treeParentId", "Ljava/util/UUID;", "nodes", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "<init>", "(ZLjava/util/UUID;Ljava/util/List;)V", "()Z", "getTreeParentId", "()Ljava/util/UUID;", "getNodes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PartialTree {
    private final boolean isRoot;
    private final List<EcHubNavNode> nodes;
    private final UUID treeParentId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartialTree copy$default(PartialTree partialTree, boolean z, UUID uuid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = partialTree.isRoot;
        }
        if ((i & 2) != 0) {
            uuid = partialTree.treeParentId;
        }
        if ((i & 4) != 0) {
            list = partialTree.nodes;
        }
        return partialTree.copy(z, uuid, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getTreeParentId() {
        return this.treeParentId;
    }

    public final List<EcHubNavNode> component3() {
        return this.nodes;
    }

    public final PartialTree copy(boolean isRoot, UUID treeParentId, List<EcHubNavNode> nodes) {
        Intrinsics.checkNotNullParameter(treeParentId, "treeParentId");
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        return new PartialTree(isRoot, treeParentId, nodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialTree)) {
            return false;
        }
        PartialTree partialTree = (PartialTree) other;
        return this.isRoot == partialTree.isRoot && Intrinsics.areEqual(this.treeParentId, partialTree.treeParentId) && Intrinsics.areEqual(this.nodes, partialTree.nodes);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isRoot) * 31) + this.treeParentId.hashCode()) * 31) + this.nodes.hashCode();
    }

    public String toString() {
        return "PartialTree(isRoot=" + this.isRoot + ", treeParentId=" + this.treeParentId + ", nodes=" + this.nodes + ")";
    }

    public PartialTree(boolean z, UUID treeParentId, List<EcHubNavNode> nodes) {
        Intrinsics.checkNotNullParameter(treeParentId, "treeParentId");
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.isRoot = z;
        this.treeParentId = treeParentId;
        this.nodes = nodes;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final UUID getTreeParentId() {
        return this.treeParentId;
    }

    public final List<EcHubNavNode> getNodes() {
        return this.nodes;
    }
}
