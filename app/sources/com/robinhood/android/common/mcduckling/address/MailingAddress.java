package com.robinhood.android.common.mcduckling.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p355ui.identi.UsAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: MailingAddress.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "Landroid/os/Parcelable;", "fullName", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UsAddress;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/identi/UsAddress;)V", "getFullName", "()Ljava/lang/String;", "getAddress", "()Lcom/robinhood/models/ui/identi/UsAddress;", "format", "includeName", "", "appendLine2ToLine1", "formatPrimary", "formatSecondary", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class MailingAddress implements Parcelable {
    public static final Parcelable.Creator<MailingAddress> CREATOR = new Creator();
    private final UsAddress address;
    private final String fullName;

    /* compiled from: MailingAddress.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MailingAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MailingAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MailingAddress(parcel.readString(), (UsAddress) parcel.readParcelable(MailingAddress.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MailingAddress[] newArray(int i) {
            return new MailingAddress[i];
        }
    }

    public static /* synthetic */ MailingAddress copy$default(MailingAddress mailingAddress, String str, UsAddress usAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mailingAddress.fullName;
        }
        if ((i & 2) != 0) {
            usAddress = mailingAddress.address;
        }
        return mailingAddress.copy(str, usAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component2, reason: from getter */
    public final UsAddress getAddress() {
        return this.address;
    }

    public final MailingAddress copy(String fullName, UsAddress address) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(address, "address");
        return new MailingAddress(fullName, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MailingAddress)) {
            return false;
        }
        MailingAddress mailingAddress = (MailingAddress) other;
        return Intrinsics.areEqual(this.fullName, mailingAddress.fullName) && Intrinsics.areEqual(this.address, mailingAddress.address);
    }

    public int hashCode() {
        return (this.fullName.hashCode() * 31) + this.address.hashCode();
    }

    public String toString() {
        return "MailingAddress(fullName=" + this.fullName + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fullName);
        dest.writeParcelable(this.address, flags);
    }

    public MailingAddress(String fullName, UsAddress address) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(address, "address");
        this.fullName = fullName;
        this.address = address;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final UsAddress getAddress() {
        return this.address;
    }

    public static /* synthetic */ String format$default(MailingAddress mailingAddress, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return mailingAddress.format(z, z2);
    }

    public final String format(boolean includeName, boolean appendLine2ToLine1) {
        StringBuilder sb = new StringBuilder();
        if (includeName) {
            sb.append(this.fullName);
            sb.append('\n');
        }
        UsAddress usAddress = this.address;
        sb.append(usAddress.getLine1());
        String line2 = usAddress.getLine2();
        if (line2 != null && !StringsKt.isBlank(line2)) {
            if (appendLine2ToLine1) {
                sb.append(", ");
            } else {
                sb.append('\n');
            }
            sb.append(usAddress.getLine2());
            sb.append('\n');
        } else {
            sb.append('\n');
        }
        sb.append(usAddress.getCity());
        sb.append(", ");
        sb.append(usAddress.getState());
        sb.append(' ');
        sb.append(usAddress.getPostalCode());
        return sb.toString();
    }

    public final String formatPrimary() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.address.getLine1());
        String line2 = this.address.getLine2();
        if (line2 != null && !StringsKt.isBlank(line2)) {
            sb.append('\n');
            sb.append(this.address.getLine2());
        }
        return sb.toString();
    }

    public final String formatSecondary() {
        UsAddress usAddress = this.address;
        return usAddress.getCity() + ", " + usAddress.getState() + PlaceholderUtils.XXShortPlaceholderText + usAddress.getPostalCode();
    }
}
