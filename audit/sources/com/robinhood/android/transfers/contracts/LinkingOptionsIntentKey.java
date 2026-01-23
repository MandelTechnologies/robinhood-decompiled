package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingOptionsIntentKey.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/LinkingOptionsIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "isFromTransfers", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;Z)V", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LinkingOptionsIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<LinkingOptionsIntentKey> CREATOR = new Creator();
    private final PaymentLinkingContext.EntryPoint entryPoint;
    private final boolean isFromTransfers;

    /* compiled from: LinkingOptionsIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<LinkingOptionsIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkingOptionsIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkingOptionsIntentKey[] newArray(int i) {
            return new LinkingOptionsIntentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entryPoint.name());
        dest.writeInt(this.isFromTransfers ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint entryPoint, boolean z) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entryPoint = entryPoint;
        this.isFromTransfers = z;
    }

    public /* synthetic */ LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint entryPoint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(entryPoint, (i & 2) != 0 ? false : z);
    }

    public final PaymentLinkingContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: isFromTransfers, reason: from getter */
    public final boolean getIsFromTransfers() {
        return this.isFromTransfers;
    }
}
