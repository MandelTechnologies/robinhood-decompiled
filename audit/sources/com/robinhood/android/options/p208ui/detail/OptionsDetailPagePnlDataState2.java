package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionsDetailPagePnlDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/PnlDataState;", "", "<init>", "()V", "requireClearingData", "", "showAsterisk", "FetchWithClearingData", "FetchLegacy", "Lcom/robinhood/android/options/ui/detail/PnlDataState$FetchLegacy;", "Lcom/robinhood/android/options/ui/detail/PnlDataState$FetchWithClearingData;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.PnlDataState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsDetailPagePnlDataState2 {
    public static final int $stable = 0;

    public /* synthetic */ OptionsDetailPagePnlDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsDetailPagePnlDataState2() {
    }

    /* compiled from: OptionsDetailPagePnlDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/PnlDataState$FetchWithClearingData;", "Lcom/robinhood/android/options/ui/detail/PnlDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.PnlDataState$FetchWithClearingData */
    public static final /* data */ class FetchWithClearingData extends OptionsDetailPagePnlDataState2 {
        public static final int $stable = 0;
        public static final FetchWithClearingData INSTANCE = new FetchWithClearingData();

        public boolean equals(Object other) {
            return this == other || (other instanceof FetchWithClearingData);
        }

        public int hashCode() {
            return 19535441;
        }

        public String toString() {
            return "FetchWithClearingData";
        }

        private FetchWithClearingData() {
            super(null);
        }
    }

    /* compiled from: OptionsDetailPagePnlDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/PnlDataState$FetchLegacy;", "Lcom/robinhood/android/options/ui/detail/PnlDataState;", "showAsterisk", "", "<init>", "(Z)V", "getShowAsterisk", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.PnlDataState$FetchLegacy, reason: from toString */
    public static final /* data */ class FetchLegacy extends OptionsDetailPagePnlDataState2 {
        public static final int $stable = 0;
        private final boolean showAsterisk;

        public static /* synthetic */ FetchLegacy copy$default(FetchLegacy fetchLegacy, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fetchLegacy.showAsterisk;
            }
            return fetchLegacy.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowAsterisk() {
            return this.showAsterisk;
        }

        public final FetchLegacy copy(boolean showAsterisk) {
            return new FetchLegacy(showAsterisk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchLegacy) && this.showAsterisk == ((FetchLegacy) other).showAsterisk;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showAsterisk);
        }

        public String toString() {
            return "FetchLegacy(showAsterisk=" + this.showAsterisk + ")";
        }

        public FetchLegacy(boolean z) {
            super(null);
            this.showAsterisk = z;
        }

        public final boolean getShowAsterisk() {
            return this.showAsterisk;
        }
    }

    public final boolean requireClearingData() {
        return this instanceof FetchWithClearingData;
    }

    public final boolean showAsterisk() {
        return (this instanceof FetchLegacy) && ((FetchLegacy) this).getShowAsterisk();
    }
}
