package com.robinhood.viewmode;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewModeSelectionType.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType;", "Landroid/os/Parcelable;", "<init>", "()V", "HoldingsAndCrypto", "PositionsV2", "AllCuratedLists", "CuratedList", "OptionsWatchlist", "FuturesCuratedRhList", "Lcom/robinhood/viewmode/ViewModeSelectionType$AllCuratedLists;", "Lcom/robinhood/viewmode/ViewModeSelectionType$CuratedList;", "Lcom/robinhood/viewmode/ViewModeSelectionType$FuturesCuratedRhList;", "Lcom/robinhood/viewmode/ViewModeSelectionType$HoldingsAndCrypto;", "Lcom/robinhood/viewmode/ViewModeSelectionType$OptionsWatchlist;", "Lcom/robinhood/viewmode/ViewModeSelectionType$PositionsV2;", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewModeSelectionType implements Parcelable {
    public /* synthetic */ ViewModeSelectionType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ViewModeSelectionType() {
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$HoldingsAndCrypto;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HoldingsAndCrypto extends ViewModeSelectionType {
        public static final HoldingsAndCrypto INSTANCE = new HoldingsAndCrypto();
        public static final Parcelable.Creator<HoldingsAndCrypto> CREATOR = new Creator();

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HoldingsAndCrypto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HoldingsAndCrypto createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HoldingsAndCrypto.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HoldingsAndCrypto[] newArray(int i) {
                return new HoldingsAndCrypto[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private HoldingsAndCrypto() {
            super(null);
        }
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$PositionsV2;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "activeDisplayType", "", "<init>", "(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Ljava/lang/String;)V", "getInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getActiveDisplayType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PositionsV2 extends ViewModeSelectionType {
        public static final Parcelable.Creator<PositionsV2> CREATOR = new Creator();
        private final String activeDisplayType;
        private final PositionInstrumentType instrumentType;

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PositionsV2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionsV2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PositionsV2(PositionInstrumentType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionsV2[] newArray(int i) {
                return new PositionsV2[i];
            }
        }

        public static /* synthetic */ PositionsV2 copy$default(PositionsV2 positionsV2, PositionInstrumentType positionInstrumentType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                positionInstrumentType = positionsV2.instrumentType;
            }
            if ((i & 2) != 0) {
                str = positionsV2.activeDisplayType;
            }
            return positionsV2.copy(positionInstrumentType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getActiveDisplayType() {
            return this.activeDisplayType;
        }

        public final PositionsV2 copy(PositionInstrumentType instrumentType, String activeDisplayType) {
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new PositionsV2(instrumentType, activeDisplayType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionsV2)) {
                return false;
            }
            PositionsV2 positionsV2 = (PositionsV2) other;
            return this.instrumentType == positionsV2.instrumentType && Intrinsics.areEqual(this.activeDisplayType, positionsV2.activeDisplayType);
        }

        public int hashCode() {
            int iHashCode = this.instrumentType.hashCode() * 31;
            String str = this.activeDisplayType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PositionsV2(instrumentType=" + this.instrumentType + ", activeDisplayType=" + this.activeDisplayType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentType.name());
            dest.writeString(this.activeDisplayType);
        }

        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final String getActiveDisplayType() {
            return this.activeDisplayType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PositionsV2(PositionInstrumentType instrumentType, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentType = instrumentType;
            this.activeDisplayType = str;
        }
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$AllCuratedLists;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AllCuratedLists extends ViewModeSelectionType {
        public static final AllCuratedLists INSTANCE = new AllCuratedLists();
        public static final Parcelable.Creator<AllCuratedLists> CREATOR = new Creator();

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AllCuratedLists> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllCuratedLists createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllCuratedLists.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllCuratedLists[] newArray(int i) {
                return new AllCuratedLists[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AllCuratedLists() {
            super(null);
        }
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$CuratedList;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CuratedList extends ViewModeSelectionType {
        public static final CuratedList INSTANCE = new CuratedList();
        public static final Parcelable.Creator<CuratedList> CREATOR = new Creator();

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CuratedList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CuratedList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CuratedList.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CuratedList[] newArray(int i) {
                return new CuratedList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CuratedList() {
            super(null);
        }
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$OptionsWatchlist;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsWatchlist extends ViewModeSelectionType {
        public static final OptionsWatchlist INSTANCE = new OptionsWatchlist();
        public static final Parcelable.Creator<OptionsWatchlist> CREATOR = new Creator();

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionsWatchlist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsWatchlist createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptionsWatchlist.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsWatchlist[] newArray(int i) {
                return new OptionsWatchlist[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private OptionsWatchlist() {
            super(null);
        }
    }

    /* compiled from: ViewModeSelectionType.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionType$FuturesCuratedRhList;", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FuturesCuratedRhList extends ViewModeSelectionType {
        public static final FuturesCuratedRhList INSTANCE = new FuturesCuratedRhList();
        public static final Parcelable.Creator<FuturesCuratedRhList> CREATOR = new Creator();

        /* compiled from: ViewModeSelectionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FuturesCuratedRhList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FuturesCuratedRhList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FuturesCuratedRhList.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FuturesCuratedRhList[] newArray(int i) {
                return new FuturesCuratedRhList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FuturesCuratedRhList);
        }

        public int hashCode() {
            return -1542253033;
        }

        public String toString() {
            return "FuturesCuratedRhList";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private FuturesCuratedRhList() {
            super(null);
        }
    }
}
