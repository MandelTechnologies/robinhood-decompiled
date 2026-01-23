package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.p355ui.identi.UiAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseAddressResult.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressResult;", "Landroid/os/Parcelable;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;Lcom/robinhood/models/ui/identi/UiAddress;)V", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getAddress", "()Lcom/robinhood/models/ui/identi/UiAddress;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ChooseAddressResult implements Parcelable {
    public static final String EXTRA_ADDRESS_RESULT = "rhChooseAddressResult";
    private final UiAddress address;
    private final ChooseAddressSource source;
    public static final Parcelable.Creator<ChooseAddressResult> CREATOR = new Creator();

    /* compiled from: ChooseAddressResult.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChooseAddressResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseAddressResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooseAddressResult(ChooseAddressSource.valueOf(parcel.readString()), (UiAddress) parcel.readParcelable(ChooseAddressResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseAddressResult[] newArray(int i) {
            return new ChooseAddressResult[i];
        }
    }

    public static /* synthetic */ ChooseAddressResult copy$default(ChooseAddressResult chooseAddressResult, ChooseAddressSource chooseAddressSource, UiAddress uiAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            chooseAddressSource = chooseAddressResult.source;
        }
        if ((i & 2) != 0) {
            uiAddress = chooseAddressResult.address;
        }
        return chooseAddressResult.copy(chooseAddressSource, uiAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final ChooseAddressSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAddress getAddress() {
        return this.address;
    }

    public final ChooseAddressResult copy(ChooseAddressSource source, UiAddress address) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ChooseAddressResult(source, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseAddressResult)) {
            return false;
        }
        ChooseAddressResult chooseAddressResult = (ChooseAddressResult) other;
        return this.source == chooseAddressResult.source && Intrinsics.areEqual(this.address, chooseAddressResult.address);
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.address.hashCode();
    }

    public String toString() {
        return "ChooseAddressResult(source=" + this.source + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source.name());
        dest.writeParcelable(this.address, flags);
    }

    public ChooseAddressResult(ChooseAddressSource source, UiAddress address) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(address, "address");
        this.source = source;
        this.address = address;
    }

    public final ChooseAddressSource getSource() {
        return this.source;
    }

    public final UiAddress getAddress() {
        return this.address;
    }
}
