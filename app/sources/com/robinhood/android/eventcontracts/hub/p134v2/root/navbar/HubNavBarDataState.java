package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.store.event.HubPartialNavTree;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubNavBarDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;", "", "individualAccountNumber", "", "partialTree", "Lcom/robinhood/store/event/HubPartialNavTree;", "selectedNodeId", "Ljava/util/UUID;", "isInPredictionMarketTestingExperiment", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/store/event/HubPartialNavTree;Ljava/util/UUID;Z)V", "getIndividualAccountNumber", "()Ljava/lang/String;", "getPartialTree", "()Lcom/robinhood/store/event/HubPartialNavTree;", "getSelectedNodeId", "()Ljava/util/UUID;", "()Z", "entryNode", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "getEntryNode", "()Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "presentLayoutNodeId", "getPresentLayoutNodeId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HubNavBarDataState {
    public static final int $stable = 8;
    private final String individualAccountNumber;
    private final boolean isInPredictionMarketTestingExperiment;
    private final HubPartialNavTree partialTree;
    private final UUID selectedNodeId;

    public HubNavBarDataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ HubNavBarDataState copy$default(HubNavBarDataState hubNavBarDataState, String str, HubPartialNavTree hubPartialNavTree, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hubNavBarDataState.individualAccountNumber;
        }
        if ((i & 2) != 0) {
            hubPartialNavTree = hubNavBarDataState.partialTree;
        }
        if ((i & 4) != 0) {
            uuid = hubNavBarDataState.selectedNodeId;
        }
        if ((i & 8) != 0) {
            z = hubNavBarDataState.isInPredictionMarketTestingExperiment;
        }
        return hubNavBarDataState.copy(str, hubPartialNavTree, uuid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final HubPartialNavTree getPartialTree() {
        return this.partialTree;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getSelectedNodeId() {
        return this.selectedNodeId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInPredictionMarketTestingExperiment() {
        return this.isInPredictionMarketTestingExperiment;
    }

    public final HubNavBarDataState copy(String individualAccountNumber, HubPartialNavTree partialTree, UUID selectedNodeId, boolean isInPredictionMarketTestingExperiment) {
        return new HubNavBarDataState(individualAccountNumber, partialTree, selectedNodeId, isInPredictionMarketTestingExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubNavBarDataState)) {
            return false;
        }
        HubNavBarDataState hubNavBarDataState = (HubNavBarDataState) other;
        return Intrinsics.areEqual(this.individualAccountNumber, hubNavBarDataState.individualAccountNumber) && Intrinsics.areEqual(this.partialTree, hubNavBarDataState.partialTree) && Intrinsics.areEqual(this.selectedNodeId, hubNavBarDataState.selectedNodeId) && this.isInPredictionMarketTestingExperiment == hubNavBarDataState.isInPredictionMarketTestingExperiment;
    }

    public int hashCode() {
        String str = this.individualAccountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HubPartialNavTree hubPartialNavTree = this.partialTree;
        int iHashCode2 = (iHashCode + (hubPartialNavTree == null ? 0 : hubPartialNavTree.hashCode())) * 31;
        UUID uuid = this.selectedNodeId;
        return ((iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInPredictionMarketTestingExperiment);
    }

    public String toString() {
        return "HubNavBarDataState(individualAccountNumber=" + this.individualAccountNumber + ", partialTree=" + this.partialTree + ", selectedNodeId=" + this.selectedNodeId + ", isInPredictionMarketTestingExperiment=" + this.isInPredictionMarketTestingExperiment + ")";
    }

    public HubNavBarDataState(String str, HubPartialNavTree hubPartialNavTree, UUID uuid, boolean z) {
        this.individualAccountNumber = str;
        this.partialTree = hubPartialNavTree;
        this.selectedNodeId = uuid;
        this.isInPredictionMarketTestingExperiment = z;
    }

    public /* synthetic */ HubNavBarDataState(String str, HubPartialNavTree hubPartialNavTree, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hubPartialNavTree, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? false : z);
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final HubPartialNavTree getPartialTree() {
        return this.partialTree;
    }

    public final UUID getSelectedNodeId() {
        return this.selectedNodeId;
    }

    public final boolean isInPredictionMarketTestingExperiment() {
        return this.isInPredictionMarketTestingExperiment;
    }

    public final EcHubNavNode getEntryNode() {
        HubPartialNavTree hubPartialNavTree = this.partialTree;
        if (hubPartialNavTree != null) {
            return hubPartialNavTree.getNode();
        }
        return null;
    }

    public final UUID getPresentLayoutNodeId() {
        UUID defaultChildNodeId = this.selectedNodeId;
        if (defaultChildNodeId == null) {
            EcHubNavNode entryNode = getEntryNode();
            defaultChildNodeId = entryNode != null ? entryNode.getDefaultChildNodeId() : null;
            if (defaultChildNodeId == null) {
                EcHubNavNode entryNode2 = getEntryNode();
                if (entryNode2 != null) {
                    return entryNode2.getId();
                }
                return null;
            }
        }
        return defaultChildNodeId;
    }
}
