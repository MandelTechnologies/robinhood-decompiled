package com.robinhood.android.graph;

import com.robinhood.android.common.util.NumberUtils;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphLayoutViewModel.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0005H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\bH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0001\u0001\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/graph/GraphLayoutViewModel;", "", "<init>", "()V", "isStale", "", "()Z", "mostRecentPoint", "Ljava/math/BigDecimal;", "getMostRecentPoint", "()Ljava/math/BigDecimal;", "totalValue", "getTotalValue", "getDeltaValue", "startingValue", "isOneDaySpan", "getDeltaPercent", "getAfterHoursDeltaValue", "getAfterHoursDeltaPercent", "Asset", "Lcom/robinhood/android/graph/GraphLayoutViewModel$Asset;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GraphLayoutViewModel {
    public static final int $stable = 0;

    public /* synthetic */ GraphLayoutViewModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract BigDecimal getAfterHoursDeltaPercent();

    public abstract BigDecimal getAfterHoursDeltaValue();

    public abstract BigDecimal getDeltaPercent(BigDecimal startingValue, boolean isOneDaySpan);

    public abstract BigDecimal getDeltaValue(BigDecimal startingValue, boolean isOneDaySpan);

    public abstract BigDecimal getMostRecentPoint();

    public abstract BigDecimal getTotalValue();

    public abstract boolean isStale();

    private GraphLayoutViewModel() {
    }

    /* compiled from: GraphLayoutViewModel.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/graph/GraphLayoutViewModel$Asset;", "Lcom/robinhood/android/graph/GraphLayoutViewModel;", "isStale", "", "regularHoursPrice", "Ljava/math/BigDecimal;", "extendedHoursPrice", "<init>", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;)V", "()Z", "getRegularHoursPrice", "()Ljava/math/BigDecimal;", "getExtendedHoursPrice", "mostRecentPoint", "getMostRecentPoint", "totalValue", "getTotalValue", "getDeltaValue", "startingValue", "isOneDaySpan", "getDeltaPercent", "getAfterHoursDeltaValue", "getAfterHoursDeltaPercent", "getDeltaEndingValue", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Asset extends GraphLayoutViewModel {
        public static final int $stable = 8;
        private final BigDecimal extendedHoursPrice;
        private final boolean isStale;
        private final BigDecimal mostRecentPoint;
        private final BigDecimal regularHoursPrice;
        private final BigDecimal totalValue;

        public static /* synthetic */ Asset copy$default(Asset asset, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = asset.isStale;
            }
            if ((i & 2) != 0) {
                bigDecimal = asset.regularHoursPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = asset.extendedHoursPrice;
            }
            return asset.copy(z, bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getRegularHoursPrice() {
            return this.regularHoursPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getExtendedHoursPrice() {
            return this.extendedHoursPrice;
        }

        public final Asset copy(boolean isStale, BigDecimal regularHoursPrice, BigDecimal extendedHoursPrice) {
            Intrinsics.checkNotNullParameter(regularHoursPrice, "regularHoursPrice");
            return new Asset(isStale, regularHoursPrice, extendedHoursPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) other;
            return this.isStale == asset.isStale && Intrinsics.areEqual(this.regularHoursPrice, asset.regularHoursPrice) && Intrinsics.areEqual(this.extendedHoursPrice, asset.extendedHoursPrice);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isStale) * 31) + this.regularHoursPrice.hashCode()) * 31;
            BigDecimal bigDecimal = this.extendedHoursPrice;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public String toString() {
            return "Asset(isStale=" + this.isStale + ", regularHoursPrice=" + this.regularHoursPrice + ", extendedHoursPrice=" + this.extendedHoursPrice + ")";
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public boolean isStale() {
            return this.isStale;
        }

        public final BigDecimal getRegularHoursPrice() {
            return this.regularHoursPrice;
        }

        public final BigDecimal getExtendedHoursPrice() {
            return this.extendedHoursPrice;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Asset(boolean z, BigDecimal regularHoursPrice, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(regularHoursPrice, "regularHoursPrice");
            this.isStale = z;
            this.regularHoursPrice = regularHoursPrice;
            this.extendedHoursPrice = bigDecimal;
            this.mostRecentPoint = bigDecimal == null ? regularHoursPrice : bigDecimal;
            this.totalValue = bigDecimal != null ? bigDecimal : regularHoursPrice;
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getMostRecentPoint() {
            return this.mostRecentPoint;
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getTotalValue() {
            return this.totalValue;
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getDeltaValue(BigDecimal startingValue, boolean isOneDaySpan) {
            return NumberUtils.calculateDeltaValueFrom(getDeltaEndingValue(isOneDaySpan), startingValue);
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getDeltaPercent(BigDecimal startingValue, boolean isOneDaySpan) {
            return NumberUtils.calculateDeltaPercentFrom(getDeltaEndingValue(isOneDaySpan), startingValue);
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getAfterHoursDeltaValue() {
            BigDecimal bigDecimal = this.extendedHoursPrice;
            if (bigDecimal != null) {
                return NumberUtils.calculateDeltaValueFrom(bigDecimal, this.regularHoursPrice);
            }
            return null;
        }

        @Override // com.robinhood.android.graph.GraphLayoutViewModel
        public BigDecimal getAfterHoursDeltaPercent() {
            BigDecimal bigDecimal = this.extendedHoursPrice;
            if (bigDecimal != null) {
                return NumberUtils.calculateDeltaPercentFrom(bigDecimal, this.regularHoursPrice);
            }
            return null;
        }

        private final BigDecimal getDeltaEndingValue(boolean isOneDaySpan) {
            if (isOneDaySpan) {
                return this.regularHoursPrice;
            }
            return getMostRecentPoint();
        }
    }
}
