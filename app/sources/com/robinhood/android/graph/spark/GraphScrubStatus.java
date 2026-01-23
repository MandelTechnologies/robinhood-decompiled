package com.robinhood.android.graph.spark;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GraphScrubStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphScrubStatus;", "", "<init>", "()V", "NotScrubbing", "Scrubbing", "Lcom/robinhood/android/graph/spark/GraphScrubStatus$NotScrubbing;", "Lcom/robinhood/android/graph/spark/GraphScrubStatus$Scrubbing;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GraphScrubStatus {
    public static final int $stable = 0;

    public /* synthetic */ GraphScrubStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GraphScrubStatus() {
    }

    /* compiled from: GraphScrubStatus.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphScrubStatus$NotScrubbing;", "Lcom/robinhood/android/graph/spark/GraphScrubStatus;", "<init>", "()V", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NotScrubbing extends GraphScrubStatus {
        public static final int $stable = 0;
        public static final NotScrubbing INSTANCE = new NotScrubbing();

        private NotScrubbing() {
            super(null);
        }
    }

    /* compiled from: GraphScrubStatus.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphScrubStatus$Scrubbing;", "Lcom/robinhood/android/graph/spark/GraphScrubStatus;", "xPosition", "", "<init>", "(F)V", "getXPosition", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Scrubbing extends GraphScrubStatus {
        public static final int $stable = 0;
        private final float xPosition;

        public static /* synthetic */ Scrubbing copy$default(Scrubbing scrubbing, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = scrubbing.xPosition;
            }
            return scrubbing.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getXPosition() {
            return this.xPosition;
        }

        public final Scrubbing copy(float xPosition) {
            return new Scrubbing(xPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Scrubbing) && Float.compare(this.xPosition, ((Scrubbing) other).xPosition) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.xPosition);
        }

        public String toString() {
            return "Scrubbing(xPosition=" + this.xPosition + ")";
        }

        public Scrubbing(float f) {
            super(null);
            this.xPosition = f;
        }

        public final float getXPosition() {
            return this.xPosition;
        }
    }
}
