package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "countryCodes", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "showCallingCode", "", "<init>", "(Ljava/util/List;Z)V", "getCountryCodes", "()Ljava/util/List;", "getShowCallingCode", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class SelectCountryCodeFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<SelectCountryCodeFragmentKey> CREATOR = new Creator();
    private final List<CountryCode> countryCodes;
    private final boolean showCallingCode;

    /* compiled from: SelectCountryCodeFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "", "onCountryCodeSelected", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public interface Callbacks {
        void onCountryCodeSelected(CountryCode countryCode);
    }

    /* compiled from: SelectCountryCodeFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<SelectCountryCodeFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectCountryCodeFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new SelectCountryCodeFragmentKey(arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectCountryCodeFragmentKey[] newArray(int i) {
            return new SelectCountryCodeFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectCountryCodeFragmentKey copy$default(SelectCountryCodeFragmentKey selectCountryCodeFragmentKey, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectCountryCodeFragmentKey.countryCodes;
        }
        if ((i & 2) != 0) {
            z = selectCountryCodeFragmentKey.showCallingCode;
        }
        return selectCountryCodeFragmentKey.copy(list, z);
    }

    public final List<CountryCode> component1() {
        return this.countryCodes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowCallingCode() {
        return this.showCallingCode;
    }

    public final SelectCountryCodeFragmentKey copy(List<? extends CountryCode> countryCodes, boolean showCallingCode) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        return new SelectCountryCodeFragmentKey(countryCodes, showCallingCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCountryCodeFragmentKey)) {
            return false;
        }
        SelectCountryCodeFragmentKey selectCountryCodeFragmentKey = (SelectCountryCodeFragmentKey) other;
        return Intrinsics.areEqual(this.countryCodes, selectCountryCodeFragmentKey.countryCodes) && this.showCallingCode == selectCountryCodeFragmentKey.showCallingCode;
    }

    public int hashCode() {
        return (this.countryCodes.hashCode() * 31) + Boolean.hashCode(this.showCallingCode);
    }

    public String toString() {
        return "SelectCountryCodeFragmentKey(countryCodes=" + this.countryCodes + ", showCallingCode=" + this.showCallingCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CountryCode> list = this.countryCodes;
        dest.writeInt(list.size());
        Iterator<CountryCode> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeInt(this.showCallingCode ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectCountryCodeFragmentKey(List<? extends CountryCode> countryCodes, boolean z) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.countryCodes = countryCodes;
        this.showCallingCode = z;
    }

    public /* synthetic */ SelectCountryCodeFragmentKey(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }

    public final List<CountryCode> getCountryCodes() {
        return this.countryCodes;
    }

    public final boolean getShowCallingCode() {
        return this.showCallingCode;
    }
}
