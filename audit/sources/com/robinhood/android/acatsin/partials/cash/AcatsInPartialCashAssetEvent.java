package com.robinhood.android.acatsin.partials.cash;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialCashAssetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent;", "", "<init>", "()V", "ShowMarginDisabledBottomSheetEvent", "PopulateEditingAssetInfoEvent", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent$PopulateEditingAssetInfoEvent;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent$ShowMarginDisabledBottomSheetEvent;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInPartialCashAssetEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInPartialCashAssetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AcatsInPartialCashAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent$ShowMarginDisabledBottomSheetEvent;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent;", "state", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "<init>", "(Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;)V", "getState", "()Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowMarginDisabledBottomSheetEvent extends AcatsInPartialCashAssetEvent {
        public static final int $stable = 8;
        private final AcatsInPartialCashAssetViewState state;

        public static /* synthetic */ ShowMarginDisabledBottomSheetEvent copy$default(ShowMarginDisabledBottomSheetEvent showMarginDisabledBottomSheetEvent, AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInPartialCashAssetViewState = showMarginDisabledBottomSheetEvent.state;
            }
            return showMarginDisabledBottomSheetEvent.copy(acatsInPartialCashAssetViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInPartialCashAssetViewState getState() {
            return this.state;
        }

        public final ShowMarginDisabledBottomSheetEvent copy(AcatsInPartialCashAssetViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new ShowMarginDisabledBottomSheetEvent(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowMarginDisabledBottomSheetEvent) && Intrinsics.areEqual(this.state, ((ShowMarginDisabledBottomSheetEvent) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "ShowMarginDisabledBottomSheetEvent(state=" + this.state + ")";
        }

        public final AcatsInPartialCashAssetViewState getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowMarginDisabledBottomSheetEvent(AcatsInPartialCashAssetViewState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }
    }

    private AcatsInPartialCashAssetEvent() {
    }

    /* compiled from: AcatsInPartialCashAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent$PopulateEditingAssetInfoEvent;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent;", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;)V", "getCashAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PopulateEditingAssetInfoEvent extends AcatsInPartialCashAssetEvent {
        public static final int $stable = 8;
        private final UiAcatsAsset.CashAsset cashAsset;

        public static /* synthetic */ PopulateEditingAssetInfoEvent copy$default(PopulateEditingAssetInfoEvent populateEditingAssetInfoEvent, UiAcatsAsset.CashAsset cashAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                cashAsset = populateEditingAssetInfoEvent.cashAsset;
            }
            return populateEditingAssetInfoEvent.copy(cashAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAcatsAsset.CashAsset getCashAsset() {
            return this.cashAsset;
        }

        public final PopulateEditingAssetInfoEvent copy(UiAcatsAsset.CashAsset cashAsset) {
            Intrinsics.checkNotNullParameter(cashAsset, "cashAsset");
            return new PopulateEditingAssetInfoEvent(cashAsset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PopulateEditingAssetInfoEvent) && Intrinsics.areEqual(this.cashAsset, ((PopulateEditingAssetInfoEvent) other).cashAsset);
        }

        public int hashCode() {
            return this.cashAsset.hashCode();
        }

        public String toString() {
            return "PopulateEditingAssetInfoEvent(cashAsset=" + this.cashAsset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopulateEditingAssetInfoEvent(UiAcatsAsset.CashAsset cashAsset) {
            super(null);
            Intrinsics.checkNotNullParameter(cashAsset, "cashAsset");
            this.cashAsset = cashAsset;
        }

        public final UiAcatsAsset.CashAsset getCashAsset() {
            return this.cashAsset;
        }
    }
}
