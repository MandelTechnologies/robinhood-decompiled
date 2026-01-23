package com.robinhood.android.advisory.portfolio.restrictstocks;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent;", "", "RestrictionError", "RestrictionSuccess", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent$RestrictionError;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent$RestrictionSuccess;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RestrictStocksEvent {

    /* compiled from: RestrictStocksEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent$RestrictionError;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent;", "isTryingToRestrict", "", "assetId", "", "assetName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getAssetId", "()Ljava/lang/String;", "getAssetName", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RestrictionError implements RestrictStocksEvent {
        public static final int $stable = 0;
        private final String assetId;
        private final String assetName;
        private final boolean isTryingToRestrict;

        public static /* synthetic */ RestrictionError copy$default(RestrictionError restrictionError, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = restrictionError.isTryingToRestrict;
            }
            if ((i & 2) != 0) {
                str = restrictionError.assetId;
            }
            if ((i & 4) != 0) {
                str2 = restrictionError.assetName;
            }
            return restrictionError.copy(z, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTryingToRestrict() {
            return this.isTryingToRestrict;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        public final RestrictionError copy(boolean isTryingToRestrict, String assetId, String assetName) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            return new RestrictionError(isTryingToRestrict, assetId, assetName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestrictionError)) {
                return false;
            }
            RestrictionError restrictionError = (RestrictionError) other;
            return this.isTryingToRestrict == restrictionError.isTryingToRestrict && Intrinsics.areEqual(this.assetId, restrictionError.assetId) && Intrinsics.areEqual(this.assetName, restrictionError.assetName);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isTryingToRestrict) * 31) + this.assetId.hashCode()) * 31) + this.assetName.hashCode();
        }

        public String toString() {
            return "RestrictionError(isTryingToRestrict=" + this.isTryingToRestrict + ", assetId=" + this.assetId + ", assetName=" + this.assetName + ")";
        }

        public RestrictionError(boolean z, String assetId, String assetName) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.isTryingToRestrict = z;
            this.assetId = assetId;
            this.assetName = assetName;
        }

        public final boolean isTryingToRestrict() {
            return this.isTryingToRestrict;
        }

        public final String getAssetId() {
            return this.assetId;
        }

        public final String getAssetName() {
            return this.assetName;
        }
    }

    /* compiled from: RestrictStocksEvent.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent$RestrictionSuccess;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksEvent;", "assetId", "", "assetName", "isInPortfolio", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAssetId", "()Ljava/lang/String;", "getAssetName", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RestrictionSuccess implements RestrictStocksEvent {
        public static final int $stable = 0;
        private final String assetId;
        private final String assetName;
        private final boolean isInPortfolio;

        public static /* synthetic */ RestrictionSuccess copy$default(RestrictionSuccess restrictionSuccess, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restrictionSuccess.assetId;
            }
            if ((i & 2) != 0) {
                str2 = restrictionSuccess.assetName;
            }
            if ((i & 4) != 0) {
                z = restrictionSuccess.isInPortfolio;
            }
            return restrictionSuccess.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsInPortfolio() {
            return this.isInPortfolio;
        }

        public final RestrictionSuccess copy(String assetId, String assetName, boolean isInPortfolio) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            return new RestrictionSuccess(assetId, assetName, isInPortfolio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestrictionSuccess)) {
                return false;
            }
            RestrictionSuccess restrictionSuccess = (RestrictionSuccess) other;
            return Intrinsics.areEqual(this.assetId, restrictionSuccess.assetId) && Intrinsics.areEqual(this.assetName, restrictionSuccess.assetName) && this.isInPortfolio == restrictionSuccess.isInPortfolio;
        }

        public int hashCode() {
            return (((this.assetId.hashCode() * 31) + this.assetName.hashCode()) * 31) + Boolean.hashCode(this.isInPortfolio);
        }

        public String toString() {
            return "RestrictionSuccess(assetId=" + this.assetId + ", assetName=" + this.assetName + ", isInPortfolio=" + this.isInPortfolio + ")";
        }

        public RestrictionSuccess(String assetId, String assetName, boolean z) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.assetId = assetId;
            this.assetName = assetName;
            this.isInPortfolio = z;
        }

        public final String getAssetId() {
            return this.assetId;
        }

        public final String getAssetName() {
            return this.assetName;
        }

        public final boolean isInPortfolio() {
            return this.isInPortfolio;
        }
    }
}
