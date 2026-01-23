package com.robinhood.shared.crypto.transfer.send.address.manage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddAddressNavDestinations.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/AddSavedAddressEntryDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "KEY_SCANNED_ADDRESS", "", "getKEY_SCANNED_ADDRESS$annotations", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.AddSavedAddressEntryDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddAddressNavDestinations2 extends ComposableDestination {
    public static final String KEY_SCANNED_ADDRESS = "scannedAddress";
    public static final CryptoAddAddressNavDestinations2 INSTANCE = new CryptoAddAddressNavDestinations2();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<CryptoAddAddressNavDestinations2> CREATOR = new Creator();

    /* compiled from: CryptoAddAddressNavDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.AddSavedAddressEntryDest$Creator */
    public static final class Creator implements Parcelable.Creator<CryptoAddAddressNavDestinations2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddAddressNavDestinations2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoAddAddressNavDestinations2.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddAddressNavDestinations2[] newArray(int i) {
            return new CryptoAddAddressNavDestinations2[i];
        }
    }

    public static /* synthetic */ void getKEY_SCANNED_ADDRESS$annotations() {
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoAddAddressNavDestinations2() {
        super("add_saved_address_entry", null, null, 6, null);
    }
}
