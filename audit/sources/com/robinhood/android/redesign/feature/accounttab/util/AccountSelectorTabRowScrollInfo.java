package com.robinhood.android.redesign.feature.accounttab.util;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccountSelectorTabRowScrollInfo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo;", "", "<init>", "()V", "StaticPosition", "PrecisePosition", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo$PrecisePosition;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo$StaticPosition;", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class AccountSelectorTabRowScrollInfo {
    public static final int $stable = 0;

    public /* synthetic */ AccountSelectorTabRowScrollInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AccountSelectorTabRowScrollInfo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo$StaticPosition;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StaticPosition extends AccountSelectorTabRowScrollInfo {
        public static final int $stable = 0;
        private final int index;

        public static /* synthetic */ StaticPosition copy$default(StaticPosition staticPosition, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = staticPosition.index;
            }
            return staticPosition.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final StaticPosition copy(int index) {
            return new StaticPosition(index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StaticPosition) && this.index == ((StaticPosition) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return "StaticPosition(index=" + this.index + ")";
        }

        public StaticPosition(int i) {
            super(null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    private AccountSelectorTabRowScrollInfo() {
    }

    /* compiled from: AccountSelectorTabRowScrollInfo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo$PrecisePosition;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "offset", "<init>", "(II)V", "getIndex", "()I", "getOffset", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PrecisePosition extends AccountSelectorTabRowScrollInfo {
        public static final int $stable = 0;
        private final int index;
        private final int offset;

        public static /* synthetic */ PrecisePosition copy$default(PrecisePosition precisePosition, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = precisePosition.index;
            }
            if ((i3 & 2) != 0) {
                i2 = precisePosition.offset;
            }
            return precisePosition.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public final PrecisePosition copy(int index, int offset) {
            return new PrecisePosition(index, offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrecisePosition)) {
                return false;
            }
            PrecisePosition precisePosition = (PrecisePosition) other;
            return this.index == precisePosition.index && this.offset == precisePosition.offset;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + Integer.hashCode(this.offset);
        }

        public String toString() {
            return "PrecisePosition(index=" + this.index + ", offset=" + this.offset + ")";
        }

        public PrecisePosition(int i, int i2) {
            super(null);
            this.index = i;
            this.offset = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getOffset() {
            return this.offset;
        }
    }
}
