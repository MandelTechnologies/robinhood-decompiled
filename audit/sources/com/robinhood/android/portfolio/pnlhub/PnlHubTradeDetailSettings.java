package com.robinhood.android.portfolio.pnlhub;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "Landroid/os/Parcelable;", "currentSortKey", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;", "direction", "Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "groupBySymbol", "", "showBanner", "<init>", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;ZZ)V", "getCurrentSortKey", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "getGroupBySymbol", "()Z", "getShowBanner", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlHubTradeDetailSettings implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PnlHubTradeDetailSettings> CREATOR = new Creator();
    private final PnlHubDataState4 currentSortKey;
    private final PositionsSortOptionsContext.SortDirection direction;
    private final boolean groupBySymbol;
    private final boolean showBanner;

    /* compiled from: PnlHubDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PnlHubTradeDetailSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlHubTradeDetailSettings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PnlHubTradeDetailSettings(PnlHubDataState4.valueOf(parcel.readString()), PositionsSortOptionsContext.SortDirection.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlHubTradeDetailSettings[] newArray(int i) {
            return new PnlHubTradeDetailSettings[i];
        }
    }

    public static /* synthetic */ PnlHubTradeDetailSettings copy$default(PnlHubTradeDetailSettings pnlHubTradeDetailSettings, PnlHubDataState4 pnlHubDataState4, PositionsSortOptionsContext.SortDirection sortDirection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            pnlHubDataState4 = pnlHubTradeDetailSettings.currentSortKey;
        }
        if ((i & 2) != 0) {
            sortDirection = pnlHubTradeDetailSettings.direction;
        }
        if ((i & 4) != 0) {
            z = pnlHubTradeDetailSettings.groupBySymbol;
        }
        if ((i & 8) != 0) {
            z2 = pnlHubTradeDetailSettings.showBanner;
        }
        return pnlHubTradeDetailSettings.copy(pnlHubDataState4, sortDirection, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final PnlHubDataState4 getCurrentSortKey() {
        return this.currentSortKey;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionsSortOptionsContext.SortDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getGroupBySymbol() {
        return this.groupBySymbol;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowBanner() {
        return this.showBanner;
    }

    public final PnlHubTradeDetailSettings copy(PnlHubDataState4 currentSortKey, PositionsSortOptionsContext.SortDirection direction, boolean groupBySymbol, boolean showBanner) {
        Intrinsics.checkNotNullParameter(currentSortKey, "currentSortKey");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new PnlHubTradeDetailSettings(currentSortKey, direction, groupBySymbol, showBanner);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubTradeDetailSettings)) {
            return false;
        }
        PnlHubTradeDetailSettings pnlHubTradeDetailSettings = (PnlHubTradeDetailSettings) other;
        return this.currentSortKey == pnlHubTradeDetailSettings.currentSortKey && this.direction == pnlHubTradeDetailSettings.direction && this.groupBySymbol == pnlHubTradeDetailSettings.groupBySymbol && this.showBanner == pnlHubTradeDetailSettings.showBanner;
    }

    public int hashCode() {
        return (((((this.currentSortKey.hashCode() * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.groupBySymbol)) * 31) + Boolean.hashCode(this.showBanner);
    }

    public String toString() {
        return "PnlHubTradeDetailSettings(currentSortKey=" + this.currentSortKey + ", direction=" + this.direction + ", groupBySymbol=" + this.groupBySymbol + ", showBanner=" + this.showBanner + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currentSortKey.name());
        dest.writeString(this.direction.name());
        dest.writeInt(this.groupBySymbol ? 1 : 0);
        dest.writeInt(this.showBanner ? 1 : 0);
    }

    public PnlHubTradeDetailSettings(PnlHubDataState4 currentSortKey, PositionsSortOptionsContext.SortDirection direction, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(currentSortKey, "currentSortKey");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.currentSortKey = currentSortKey;
        this.direction = direction;
        this.groupBySymbol = z;
        this.showBanner = z2;
    }

    public final PnlHubDataState4 getCurrentSortKey() {
        return this.currentSortKey;
    }

    public final PositionsSortOptionsContext.SortDirection getDirection() {
        return this.direction;
    }

    public final boolean getGroupBySymbol() {
        return this.groupBySymbol;
    }

    public final boolean getShowBanner() {
        return this.showBanner;
    }
}
