package com.robinhood.android.transfers.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDeposit.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/UkQueuedDeposit;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "exitDeeplink", "Landroid/net/Uri;", "isFromRhfOnboarding", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "<init>", "(Landroid/net/Uri;ZLcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;)V", "getExitDeeplink", "()Landroid/net/Uri;", "()Z", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class UkQueuedDeposit implements IntentKey, Parcelable {
    public static final Parcelable.Creator<UkQueuedDeposit> CREATOR = new Creator();
    private final QueuedDepositContext.EntryPoint entryPoint;
    private final Uri exitDeeplink;
    private final boolean isFromRhfOnboarding;

    /* compiled from: UkQueuedDeposit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<UkQueuedDeposit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UkQueuedDeposit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UkQueuedDeposit((Uri) parcel.readParcelable(UkQueuedDeposit.class.getClassLoader()), parcel.readInt() != 0, QueuedDepositContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UkQueuedDeposit[] newArray(int i) {
            return new UkQueuedDeposit[i];
        }
    }

    public UkQueuedDeposit() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ UkQueuedDeposit copy$default(UkQueuedDeposit ukQueuedDeposit, Uri uri, boolean z, QueuedDepositContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = ukQueuedDeposit.exitDeeplink;
        }
        if ((i & 2) != 0) {
            z = ukQueuedDeposit.isFromRhfOnboarding;
        }
        if ((i & 4) != 0) {
            entryPoint = ukQueuedDeposit.entryPoint;
        }
        return ukQueuedDeposit.copy(uri, z, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getExitDeeplink() {
        return this.exitDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: component3, reason: from getter */
    public final QueuedDepositContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final UkQueuedDeposit copy(Uri exitDeeplink, boolean isFromRhfOnboarding, QueuedDepositContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new UkQueuedDeposit(exitDeeplink, isFromRhfOnboarding, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkQueuedDeposit)) {
            return false;
        }
        UkQueuedDeposit ukQueuedDeposit = (UkQueuedDeposit) other;
        return Intrinsics.areEqual(this.exitDeeplink, ukQueuedDeposit.exitDeeplink) && this.isFromRhfOnboarding == ukQueuedDeposit.isFromRhfOnboarding && this.entryPoint == ukQueuedDeposit.entryPoint;
    }

    public int hashCode() {
        Uri uri = this.exitDeeplink;
        return ((((uri == null ? 0 : uri.hashCode()) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "UkQueuedDeposit(exitDeeplink=" + this.exitDeeplink + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.exitDeeplink, flags);
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public UkQueuedDeposit(Uri uri, boolean z, QueuedDepositContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.exitDeeplink = uri;
        this.isFromRhfOnboarding = z;
        this.entryPoint = entryPoint;
    }

    public final Uri getExitDeeplink() {
        return this.exitDeeplink;
    }

    public final boolean isFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    public /* synthetic */ UkQueuedDeposit(Uri uri, boolean z, QueuedDepositContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? false : z, (i & 4) != 0 ? QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final QueuedDepositContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
