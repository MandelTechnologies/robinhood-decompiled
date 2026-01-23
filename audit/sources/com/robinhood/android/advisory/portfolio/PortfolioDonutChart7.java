package com.robinhood.android.advisory.portfolio;

import androidx.compose.p011ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/UserInputSource;", "", "Tap", "Drag", "DragRelease", "Lcom/robinhood/android/advisory/portfolio/UserInputSource$Drag;", "Lcom/robinhood/android/advisory/portfolio/UserInputSource$DragRelease;", "Lcom/robinhood/android/advisory/portfolio/UserInputSource$Tap;", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.UserInputSource, reason: use source file name */
/* loaded from: classes7.dex */
public interface PortfolioDonutChart7 {

    /* compiled from: PortfolioDonutChart.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/UserInputSource$Tap;", "Lcom/robinhood/android/advisory/portfolio/UserInputSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.UserInputSource$Tap */
    public static final /* data */ class Tap implements PortfolioDonutChart7 {
        public static final int $stable = 0;
        public static final Tap INSTANCE = new Tap();

        public boolean equals(Object other) {
            return this == other || (other instanceof Tap);
        }

        public int hashCode() {
            return -2088421272;
        }

        public String toString() {
            return "Tap";
        }

        private Tap() {
        }
    }

    /* compiled from: PortfolioDonutChart.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/UserInputSource$Drag;", "Lcom/robinhood/android/advisory/portfolio/UserInputSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.UserInputSource$Drag */
    public static final /* data */ class Drag implements PortfolioDonutChart7 {
        public static final int $stable = 0;
        public static final Drag INSTANCE = new Drag();

        public boolean equals(Object other) {
            return this == other || (other instanceof Drag);
        }

        public int hashCode() {
            return -317010673;
        }

        public String toString() {
            return "Drag";
        }

        private Drag() {
        }
    }

    /* compiled from: PortfolioDonutChart.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/UserInputSource$DragRelease;", "Lcom/robinhood/android/advisory/portfolio/UserInputSource;", "lastOffset", "Landroidx/compose/ui/geometry/Offset;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLastOffset-F1C5BW0", "()J", "J", "component1", "component1-F1C5BW0", "copy", "copy-k-4lQ0M", "(J)Lcom/robinhood/android/advisory/portfolio/UserInputSource$DragRelease;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.portfolio.UserInputSource$DragRelease, reason: from toString */
    public static final /* data */ class DragRelease implements PortfolioDonutChart7 {
        public static final int $stable = 0;
        private final long lastOffset;

        public /* synthetic */ DragRelease(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-k-4lQ0M$default, reason: not valid java name */
        public static /* synthetic */ DragRelease m11152copyk4lQ0M$default(DragRelease dragRelease, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dragRelease.lastOffset;
            }
            return dragRelease.m11154copyk4lQ0M(j);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
        public final long getLastOffset() {
            return this.lastOffset;
        }

        /* renamed from: copy-k-4lQ0M, reason: not valid java name */
        public final DragRelease m11154copyk4lQ0M(long lastOffset) {
            return new DragRelease(lastOffset, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DragRelease) && Offset.m6540equalsimpl0(this.lastOffset, ((DragRelease) other).lastOffset);
        }

        public int hashCode() {
            return Offset.m6545hashCodeimpl(this.lastOffset);
        }

        public String toString() {
            return "DragRelease(lastOffset=" + Offset.m6549toStringimpl(this.lastOffset) + ")";
        }

        private DragRelease(long j) {
            this.lastOffset = j;
        }

        /* renamed from: getLastOffset-F1C5BW0, reason: not valid java name */
        public final long m11155getLastOffsetF1C5BW0() {
            return this.lastOffset;
        }
    }
}
