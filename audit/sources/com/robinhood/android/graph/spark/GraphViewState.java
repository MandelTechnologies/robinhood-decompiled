package com.robinhood.android.graph.spark;

import com.robinhood.models.p355ui.DataPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphViewState;", "", "highlightSession", "Lcom/robinhood/models/ui/DataPoint$Session;", "mainGraphData", "Lcom/robinhood/android/graph/spark/GraphData;", "underlyingGraphData", "scrubLinePosition", "", "showLivePulse", "", "<init>", "(Lcom/robinhood/models/ui/DataPoint$Session;Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/android/graph/spark/GraphData;Ljava/lang/Float;Z)V", "getHighlightSession", "()Lcom/robinhood/models/ui/DataPoint$Session;", "getMainGraphData", "()Lcom/robinhood/android/graph/spark/GraphData;", "getUnderlyingGraphData", "getScrubLinePosition", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getShowLivePulse", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/models/ui/DataPoint$Session;Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/android/graph/spark/GraphData;Ljava/lang/Float;Z)Lcom/robinhood/android/graph/spark/GraphViewState;", "equals", "other", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GraphViewState {
    public static final int $stable = 8;
    private final DataPoint.Session highlightSession;
    private final GraphData mainGraphData;
    private final Float scrubLinePosition;
    private final boolean showLivePulse;
    private final GraphData underlyingGraphData;

    public GraphViewState() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ GraphViewState copy$default(GraphViewState graphViewState, DataPoint.Session session, GraphData graphData, GraphData graphData2, Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            session = graphViewState.highlightSession;
        }
        if ((i & 2) != 0) {
            graphData = graphViewState.mainGraphData;
        }
        if ((i & 4) != 0) {
            graphData2 = graphViewState.underlyingGraphData;
        }
        if ((i & 8) != 0) {
            f = graphViewState.scrubLinePosition;
        }
        if ((i & 16) != 0) {
            z = graphViewState.showLivePulse;
        }
        boolean z2 = z;
        GraphData graphData3 = graphData2;
        return graphViewState.copy(session, graphData, graphData3, f, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final DataPoint.Session getHighlightSession() {
        return this.highlightSession;
    }

    /* renamed from: component2, reason: from getter */
    public final GraphData getMainGraphData() {
        return this.mainGraphData;
    }

    /* renamed from: component3, reason: from getter */
    public final GraphData getUnderlyingGraphData() {
        return this.underlyingGraphData;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getScrubLinePosition() {
        return this.scrubLinePosition;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLivePulse() {
        return this.showLivePulse;
    }

    public final GraphViewState copy(DataPoint.Session highlightSession, GraphData mainGraphData, GraphData underlyingGraphData, Float scrubLinePosition, boolean showLivePulse) {
        return new GraphViewState(highlightSession, mainGraphData, underlyingGraphData, scrubLinePosition, showLivePulse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphViewState)) {
            return false;
        }
        GraphViewState graphViewState = (GraphViewState) other;
        return this.highlightSession == graphViewState.highlightSession && Intrinsics.areEqual(this.mainGraphData, graphViewState.mainGraphData) && Intrinsics.areEqual(this.underlyingGraphData, graphViewState.underlyingGraphData) && Intrinsics.areEqual((Object) this.scrubLinePosition, (Object) graphViewState.scrubLinePosition) && this.showLivePulse == graphViewState.showLivePulse;
    }

    public int hashCode() {
        DataPoint.Session session = this.highlightSession;
        int iHashCode = (session == null ? 0 : session.hashCode()) * 31;
        GraphData graphData = this.mainGraphData;
        int iHashCode2 = (iHashCode + (graphData == null ? 0 : graphData.hashCode())) * 31;
        GraphData graphData2 = this.underlyingGraphData;
        int iHashCode3 = (iHashCode2 + (graphData2 == null ? 0 : graphData2.hashCode())) * 31;
        Float f = this.scrubLinePosition;
        return ((iHashCode3 + (f != null ? f.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLivePulse);
    }

    public String toString() {
        return "GraphViewState(highlightSession=" + this.highlightSession + ", mainGraphData=" + this.mainGraphData + ", underlyingGraphData=" + this.underlyingGraphData + ", scrubLinePosition=" + this.scrubLinePosition + ", showLivePulse=" + this.showLivePulse + ")";
    }

    public GraphViewState(DataPoint.Session session, GraphData graphData, GraphData graphData2, Float f, boolean z) {
        this.highlightSession = session;
        this.mainGraphData = graphData;
        this.underlyingGraphData = graphData2;
        this.scrubLinePosition = f;
        this.showLivePulse = z;
    }

    public /* synthetic */ GraphViewState(DataPoint.Session session, GraphData graphData, GraphData graphData2, Float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : session, (i & 2) != 0 ? null : graphData, (i & 4) != 0 ? null : graphData2, (i & 8) != 0 ? null : f, (i & 16) != 0 ? false : z);
    }

    public final DataPoint.Session getHighlightSession() {
        return this.highlightSession;
    }

    public final GraphData getMainGraphData() {
        return this.mainGraphData;
    }

    public final GraphData getUnderlyingGraphData() {
        return this.underlyingGraphData;
    }

    public final Float getScrubLinePosition() {
        return this.scrubLinePosition;
    }

    public final boolean getShowLivePulse() {
        return this.showLivePulse;
    }
}
