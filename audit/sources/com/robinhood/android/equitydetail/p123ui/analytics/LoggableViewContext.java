package com.robinhood.android.equitydetail.p123ui.analytics;

import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionViewState2;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: LoggableViewContext.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "", "<init>", "()V", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "Graph", "EtpComposition", "ShareholderExperience", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$EtpComposition;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$Graph;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$ShareholderExperience;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class LoggableViewContext {
    public static final int $stable = 0;

    public /* synthetic */ LoggableViewContext(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Context buildContext(Context context);

    private LoggableViewContext() {
    }

    /* compiled from: LoggableViewContext.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0016\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\u0012\u001a\u00020\u0000J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$Graph;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "selection", "Lcom/robinhood/models/ui/GraphSelection;", "type", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "<init>", "(Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;)V", "showCandlesticks", "", "(Lcom/robinhood/models/ui/GraphSelection;Z)V", "getSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "getType", "()Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "getAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "outgoing", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Graph extends LoggableViewContext {
        public static final int $stable = 0;
        private final GraphSelection selection;
        private final GraphContext.GraphType type;

        public static /* synthetic */ Graph copy$default(Graph graph, GraphSelection graphSelection, GraphContext.GraphType graphType, int i, Object obj) {
            if ((i & 1) != 0) {
                graphSelection = graph.selection;
            }
            if ((i & 2) != 0) {
                graphType = graph.type;
            }
            return graph.copy(graphSelection, graphType);
        }

        /* renamed from: component1, reason: from getter */
        public final GraphSelection getSelection() {
            return this.selection;
        }

        /* renamed from: component2, reason: from getter */
        public final GraphContext.GraphType getType() {
            return this.type;
        }

        public final Graph copy(GraphSelection selection, GraphContext.GraphType type2) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Graph(selection, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Graph)) {
                return false;
            }
            Graph graph = (Graph) other;
            return this.selection == graph.selection && this.type == graph.type;
        }

        public int hashCode() {
            return (this.selection.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Graph(selection=" + this.selection + ", type=" + this.type + ")";
        }

        public final GraphSelection getSelection() {
            return this.selection;
        }

        public final GraphContext.GraphType getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graph(GraphSelection selection, GraphContext.GraphType type2) {
            super(null);
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.selection = selection;
            this.type = type2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Graph(GraphSelection selection, boolean z) {
            this(selection, z ? GraphContext.GraphType.CANDLESTICK : GraphContext.GraphType.LINE);
            Intrinsics.checkNotNullParameter(selection, "selection");
        }

        public final UserInteractionEventData.Action getAction(Graph outgoing) {
            Intrinsics.checkNotNullParameter(outgoing, "outgoing");
            if (outgoing.type != this.type) {
                return UserInteractionEventData.Action.TOGGLE_GRAPH_LINE_CANDLESTICKS;
            }
            if (outgoing.selection != this.selection) {
                return UserInteractionEventData.Action.CHANGE_GRAPH_INTERVAL;
            }
            return null;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext
        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GraphContext(this.type, LoggableViewContext2.toSpanContextInterval(this.selection), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -67108865, -1, -1, -1, -1, 16383, null);
        }
    }

    /* compiled from: LoggableViewContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$EtpComposition;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "dataType", "j$/time/Instant", "transitionTime", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;Lj$/time/Instant;)V", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "buildContext", "(Lcom/robinhood/rosetta/eventlogging/Context;)Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "component2", "()Lj$/time/Instant;", "copy", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;Lj$/time/Instant;)Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$EtpComposition;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "getDataType", "Lj$/time/Instant;", "getTransitionTime", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EtpComposition extends LoggableViewContext {
        public static final int $stable = 8;
        private final EtpCompositionViewState2 dataType;
        private final Instant transitionTime;

        /* compiled from: LoggableViewContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EtpCompositionViewState2.values().length];
                try {
                    iArr[EtpCompositionViewState2.SECTORS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EtpCompositionViewState2.HOLDINGS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ EtpComposition copy$default(EtpComposition etpComposition, EtpCompositionViewState2 etpCompositionViewState2, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                etpCompositionViewState2 = etpComposition.dataType;
            }
            if ((i & 2) != 0) {
                instant = etpComposition.transitionTime;
            }
            return etpComposition.copy(etpCompositionViewState2, instant);
        }

        /* renamed from: component1, reason: from getter */
        public final EtpCompositionViewState2 getDataType() {
            return this.dataType;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTransitionTime() {
            return this.transitionTime;
        }

        public final EtpComposition copy(EtpCompositionViewState2 dataType, Instant transitionTime) {
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            Intrinsics.checkNotNullParameter(transitionTime, "transitionTime");
            return new EtpComposition(dataType, transitionTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EtpComposition)) {
                return false;
            }
            EtpComposition etpComposition = (EtpComposition) other;
            return this.dataType == etpComposition.dataType && Intrinsics.areEqual(this.transitionTime, etpComposition.transitionTime);
        }

        public int hashCode() {
            return (this.dataType.hashCode() * 31) + this.transitionTime.hashCode();
        }

        public String toString() {
            return "EtpComposition(dataType=" + this.dataType + ", transitionTime=" + this.transitionTime + ")";
        }

        public final EtpCompositionViewState2 getDataType() {
            return this.dataType;
        }

        public /* synthetic */ EtpComposition(EtpCompositionViewState2 etpCompositionViewState2, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(etpCompositionViewState2, (i & 2) != 0 ? Instant.now() : instant);
        }

        public final Instant getTransitionTime() {
            return this.transitionTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EtpComposition(EtpCompositionViewState2 dataType, Instant transitionTime) {
            super(null);
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            Intrinsics.checkNotNullParameter(transitionTime, "transitionTime");
            this.dataType = dataType;
            this.transitionTime = transitionTime;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext
        public Context buildContext(Context context) {
            EtpCompositionContext.CompositionType compositionType;
            Intrinsics.checkNotNullParameter(context, "context");
            int i = WhenMappings.$EnumSwitchMapping$0[this.dataType.ordinal()];
            if (i == 1) {
                compositionType = EtpCompositionContext.CompositionType.SECTORS;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                compositionType = EtpCompositionContext.CompositionType.HOLDINGS;
            }
            return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EtpCompositionContext(compositionType, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -134217729, -1, -1, -1, -1, 16383, null);
        }
    }

    /* compiled from: LoggableViewContext.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$ShareholderExperience;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "eventSlug", "", "isShareholder", "", "buttonText", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getEventSlug", "()Ljava/lang/String;", "()Z", "getButtonText", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderExperience extends LoggableViewContext {
        public static final int $stable = 0;
        private final String buttonText;
        private final String eventSlug;
        private final boolean isShareholder;

        public static /* synthetic */ ShareholderExperience copy$default(ShareholderExperience shareholderExperience, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareholderExperience.eventSlug;
            }
            if ((i & 2) != 0) {
                z = shareholderExperience.isShareholder;
            }
            if ((i & 4) != 0) {
                str2 = shareholderExperience.buttonText;
            }
            return shareholderExperience.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventSlug() {
            return this.eventSlug;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsShareholder() {
            return this.isShareholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        public final ShareholderExperience copy(String eventSlug, boolean isShareholder, String buttonText) {
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            return new ShareholderExperience(eventSlug, isShareholder, buttonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareholderExperience)) {
                return false;
            }
            ShareholderExperience shareholderExperience = (ShareholderExperience) other;
            return Intrinsics.areEqual(this.eventSlug, shareholderExperience.eventSlug) && this.isShareholder == shareholderExperience.isShareholder && Intrinsics.areEqual(this.buttonText, shareholderExperience.buttonText);
        }

        public int hashCode() {
            return (((this.eventSlug.hashCode() * 31) + Boolean.hashCode(this.isShareholder)) * 31) + this.buttonText.hashCode();
        }

        public String toString() {
            return "ShareholderExperience(eventSlug=" + this.eventSlug + ", isShareholder=" + this.isShareholder + ", buttonText=" + this.buttonText + ")";
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final boolean isShareholder() {
            return this.isShareholder;
        }

        public /* synthetic */ ShareholderExperience(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? "" : str2);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareholderExperience(String eventSlug, boolean z, String buttonText) {
            super(null);
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.eventSlug = eventSlug;
            this.isShareholder = z;
            this.buttonText = buttonText;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext
        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Context.copy$default(context, 0, 0, 0, this.buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED, Booleans2.toProtobuf(Boolean.valueOf(this.isShareholder)), ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED, ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1025, -1, -1, -1, 16383, null);
        }
    }
}
