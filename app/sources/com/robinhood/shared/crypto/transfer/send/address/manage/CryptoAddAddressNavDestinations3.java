package com.robinhood.shared.crypto.transfer.send.address.manage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddAddressNavDestinations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/AddSavedAddressRootDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.AddSavedAddressRootDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddAddressNavDestinations3 extends ComposableDestination {
    public static final CryptoAddAddressNavDestinations3 INSTANCE = new CryptoAddAddressNavDestinations3();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<CryptoAddAddressNavDestinations3> CREATOR = new Creator();

    /* compiled from: CryptoAddAddressNavDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.AddSavedAddressRootDest$Creator */
    public static final class Creator implements Parcelable.Creator<CryptoAddAddressNavDestinations3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddAddressNavDestinations3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoAddAddressNavDestinations3.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAddAddressNavDestinations3[] newArray(int i) {
            return new CryptoAddAddressNavDestinations3[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoAddAddressNavDestinations3() {
        super("add_saved_address_root", null, null, 6, null);
    }
}
