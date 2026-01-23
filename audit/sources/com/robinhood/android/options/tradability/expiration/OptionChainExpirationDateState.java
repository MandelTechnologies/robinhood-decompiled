package com.robinhood.android.options.tradability.expiration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionChainExpirationDateState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u001a\u0010#\u001a\u00020\"2\b\u0010\f\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001aR\u001d\u0010)\u001a\u00020\u001d8\u0006¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001f¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Landroid/os/Parcelable;", "j$/time/LocalDate", "expirationDate", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)V", "", "settleOnOpenRank", "(Lcom/robinhood/models/ui/UiOptionChain;)I", "other", "compareTo", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/models/ui/UiOptionChain;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getExpirationDate", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "key", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "lib-options-tradability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainExpirationDateState implements Comparable<OptionChainExpirationDateState>, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionChainExpirationDateState> CREATOR = new Creator();
    private final LocalDate expirationDate;
    private final String key;
    private final UiOptionChain uiOptionChain;

    /* compiled from: OptionChainExpirationDateState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionChainExpirationDateState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainExpirationDateState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionChainExpirationDateState((LocalDate) parcel.readSerializable(), (UiOptionChain) parcel.readParcelable(OptionChainExpirationDateState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainExpirationDateState[] newArray(int i) {
            return new OptionChainExpirationDateState[i];
        }
    }

    public static /* synthetic */ OptionChainExpirationDateState copy$default(OptionChainExpirationDateState optionChainExpirationDateState, LocalDate localDate, UiOptionChain uiOptionChain, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = optionChainExpirationDateState.expirationDate;
        }
        if ((i & 2) != 0) {
            uiOptionChain = optionChainExpirationDateState.uiOptionChain;
        }
        return optionChainExpirationDateState.copy(localDate, uiOptionChain);
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component2, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final OptionChainExpirationDateState copy(LocalDate expirationDate, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        return new OptionChainExpirationDateState(expirationDate, uiOptionChain);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainExpirationDateState)) {
            return false;
        }
        OptionChainExpirationDateState optionChainExpirationDateState = (OptionChainExpirationDateState) other;
        return Intrinsics.areEqual(this.expirationDate, optionChainExpirationDateState.expirationDate) && Intrinsics.areEqual(this.uiOptionChain, optionChainExpirationDateState.uiOptionChain);
    }

    public int hashCode() {
        return (this.expirationDate.hashCode() * 31) + this.uiOptionChain.hashCode();
    }

    public String toString() {
        return "OptionChainExpirationDateState(expirationDate=" + this.expirationDate + ", uiOptionChain=" + this.uiOptionChain + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.expirationDate);
        dest.writeParcelable(this.uiOptionChain, flags);
    }

    public OptionChainExpirationDateState(LocalDate expirationDate, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.expirationDate = expirationDate;
        this.uiOptionChain = uiOptionChain;
        this.key = uiOptionChain.getOptionChain().getId() + "_" + expirationDate;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    @Override // java.lang.Comparable
    public int compareTo(OptionChainExpirationDateState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompareTo = this.expirationDate.compareTo((ChronoLocalDate) other.expirationDate);
        return iCompareTo != 0 ? iCompareTo : Intrinsics.compare(settleOnOpenRank(this.uiOptionChain), settleOnOpenRank(other.uiOptionChain));
    }

    public final String getKey() {
        return this.key;
    }

    private final int settleOnOpenRank(UiOptionChain uiOptionChain) {
        return !uiOptionChain.getOptionChain().getSettleOnOpen() ? 1 : 0;
    }
}
