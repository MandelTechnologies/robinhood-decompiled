package com.robinhood.android.acatsin.partials.equity;

import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialEquityAssetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent;", "", "<init>", "()V", "PopulateEditUi", "ShowBorrowingFeeBottomSheet", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent$PopulateEditUi;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent$ShowBorrowingFeeBottomSheet;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInPartialEquityAssetEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInPartialEquityAssetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AcatsInPartialEquityAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent$PopulateEditUi;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent;", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;)V", "getAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PopulateEditUi extends AcatsInPartialEquityAssetEvent {
        public static final int $stable = 8;
        private final UiAcatsAsset.EquityAsset asset;

        public static /* synthetic */ PopulateEditUi copy$default(PopulateEditUi populateEditUi, UiAcatsAsset.EquityAsset equityAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                equityAsset = populateEditUi.asset;
            }
            return populateEditUi.copy(equityAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAcatsAsset.EquityAsset getAsset() {
            return this.asset;
        }

        public final PopulateEditUi copy(UiAcatsAsset.EquityAsset asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            return new PopulateEditUi(asset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PopulateEditUi) && Intrinsics.areEqual(this.asset, ((PopulateEditUi) other).asset);
        }

        public int hashCode() {
            return this.asset.hashCode();
        }

        public String toString() {
            return "PopulateEditUi(asset=" + this.asset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopulateEditUi(UiAcatsAsset.EquityAsset asset) {
            super(null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final UiAcatsAsset.EquityAsset getAsset() {
            return this.asset;
        }
    }

    private AcatsInPartialEquityAssetEvent() {
    }

    /* compiled from: AcatsInPartialEquityAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent$ShowBorrowingFeeBottomSheet;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent;", "feeData", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "<init>", "(Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;)V", "getFeeData", "()Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowBorrowingFeeBottomSheet extends AcatsInPartialEquityAssetEvent {
        public static final int $stable = 8;
        private final UiShortPositionFeeData feeData;

        public static /* synthetic */ ShowBorrowingFeeBottomSheet copy$default(ShowBorrowingFeeBottomSheet showBorrowingFeeBottomSheet, UiShortPositionFeeData uiShortPositionFeeData, int i, Object obj) {
            if ((i & 1) != 0) {
                uiShortPositionFeeData = showBorrowingFeeBottomSheet.feeData;
            }
            return showBorrowingFeeBottomSheet.copy(uiShortPositionFeeData);
        }

        /* renamed from: component1, reason: from getter */
        public final UiShortPositionFeeData getFeeData() {
            return this.feeData;
        }

        public final ShowBorrowingFeeBottomSheet copy(UiShortPositionFeeData feeData) {
            Intrinsics.checkNotNullParameter(feeData, "feeData");
            return new ShowBorrowingFeeBottomSheet(feeData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowBorrowingFeeBottomSheet) && Intrinsics.areEqual(this.feeData, ((ShowBorrowingFeeBottomSheet) other).feeData);
        }

        public int hashCode() {
            return this.feeData.hashCode();
        }

        public String toString() {
            return "ShowBorrowingFeeBottomSheet(feeData=" + this.feeData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBorrowingFeeBottomSheet(UiShortPositionFeeData feeData) {
            super(null);
            Intrinsics.checkNotNullParameter(feeData, "feeData");
            this.feeData = feeData;
        }

        public final UiShortPositionFeeData getFeeData() {
            return this.feeData;
        }
    }
}
