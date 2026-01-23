package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLossHarvestingKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "source", "", "startDestination", "Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingStartDestination;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingStartDestination;)V", "getSource", "()Ljava/lang/String;", "getStartDestination", "()Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingStartDestination;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxLossHarvestingKey implements TabFragmentKey {
    public static final Parcelable.Creator<TaxLossHarvestingKey> CREATOR = new Creator();
    private final String source;
    private final TaxLossHarvestingKey2 startDestination;

    /* compiled from: TaxLossHarvestingKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TaxLossHarvestingKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLossHarvestingKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxLossHarvestingKey(parcel.readString(), TaxLossHarvestingKey2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLossHarvestingKey[] newArray(int i) {
            return new TaxLossHarvestingKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxLossHarvestingKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TaxLossHarvestingKey copy$default(TaxLossHarvestingKey taxLossHarvestingKey, String str, TaxLossHarvestingKey2 taxLossHarvestingKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestingKey.source;
        }
        if ((i & 2) != 0) {
            taxLossHarvestingKey2 = taxLossHarvestingKey.startDestination;
        }
        return taxLossHarvestingKey.copy(str, taxLossHarvestingKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxLossHarvestingKey2 getStartDestination() {
        return this.startDestination;
    }

    public final TaxLossHarvestingKey copy(String source, TaxLossHarvestingKey2 startDestination) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        return new TaxLossHarvestingKey(source, startDestination);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestingKey)) {
            return false;
        }
        TaxLossHarvestingKey taxLossHarvestingKey = (TaxLossHarvestingKey) other;
        return Intrinsics.areEqual(this.source, taxLossHarvestingKey.source) && this.startDestination == taxLossHarvestingKey.startDestination;
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.startDestination.hashCode();
    }

    public String toString() {
        return "TaxLossHarvestingKey(source=" + this.source + ", startDestination=" + this.startDestination + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.startDestination.name());
    }

    public TaxLossHarvestingKey(String source, TaxLossHarvestingKey2 startDestination) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.source = source;
        this.startDestination = startDestination;
    }

    public /* synthetic */ TaxLossHarvestingKey(String str, TaxLossHarvestingKey2 taxLossHarvestingKey2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLossHarvestingKey2.DASHBOARD : taxLossHarvestingKey2);
    }

    public final String getSource() {
        return this.source;
    }

    public final TaxLossHarvestingKey2 getStartDestination() {
        return this.startDestination;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
