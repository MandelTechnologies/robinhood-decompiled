package com.robinhood.android.advisory.returns;

import com.robinhood.models.advisory.p304db.returns.ReturnsHubResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReturnsHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState$Loaded;", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState$Loading;", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ReturnsHubViewState {

    /* compiled from: ReturnsHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsHubViewState$Loading;", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ReturnsHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -626081572;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ReturnsHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsHubViewState$Loaded;", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;", "returnsHubData", "Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "isBenchmarkInfoTooltipVisible", "", "<init>", "(Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;Z)V", "getReturnsHubData", "()Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ReturnsHubViewState {
        public static final int $stable = 8;
        private final boolean isBenchmarkInfoTooltipVisible;
        private final ReturnsHubResponse returnsHubData;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ReturnsHubResponse returnsHubResponse, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                returnsHubResponse = loaded.returnsHubData;
            }
            if ((i & 2) != 0) {
                z = loaded.isBenchmarkInfoTooltipVisible;
            }
            return loaded.copy(returnsHubResponse, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ReturnsHubResponse getReturnsHubData() {
            return this.returnsHubData;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBenchmarkInfoTooltipVisible() {
            return this.isBenchmarkInfoTooltipVisible;
        }

        public final Loaded copy(ReturnsHubResponse returnsHubData, boolean isBenchmarkInfoTooltipVisible) {
            Intrinsics.checkNotNullParameter(returnsHubData, "returnsHubData");
            return new Loaded(returnsHubData, isBenchmarkInfoTooltipVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.returnsHubData, loaded.returnsHubData) && this.isBenchmarkInfoTooltipVisible == loaded.isBenchmarkInfoTooltipVisible;
        }

        public int hashCode() {
            return (this.returnsHubData.hashCode() * 31) + Boolean.hashCode(this.isBenchmarkInfoTooltipVisible);
        }

        public String toString() {
            return "Loaded(returnsHubData=" + this.returnsHubData + ", isBenchmarkInfoTooltipVisible=" + this.isBenchmarkInfoTooltipVisible + ")";
        }

        public Loaded(ReturnsHubResponse returnsHubData, boolean z) {
            Intrinsics.checkNotNullParameter(returnsHubData, "returnsHubData");
            this.returnsHubData = returnsHubData;
            this.isBenchmarkInfoTooltipVisible = z;
        }

        public /* synthetic */ Loaded(ReturnsHubResponse returnsHubResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(returnsHubResponse, (i & 2) != 0 ? true : z);
        }

        public final ReturnsHubResponse getReturnsHubData() {
            return this.returnsHubData;
        }

        public final boolean isBenchmarkInfoTooltipVisible() {
            return this.isBenchmarkInfoTooltipVisible;
        }
    }
}
