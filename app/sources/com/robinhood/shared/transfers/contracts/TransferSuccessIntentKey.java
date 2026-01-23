package com.robinhood.shared.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferSuccessKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/transfers/contracts/TransferSuccessIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TransferSuccessIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<TransferSuccessIntentKey> CREATOR = new Creator();
    private final MAXTransferContext.EntryPoint entryPoint;
    private final PostTransferFlow postTransferFlow;

    /* compiled from: TransferSuccessKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferSuccessIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferSuccessIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferSuccessIntentKey((PostTransferFlow) parcel.readParcelable(TransferSuccessIntentKey.class.getClassLoader()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferSuccessIntentKey[] newArray(int i) {
            return new TransferSuccessIntentKey[i];
        }
    }

    public static /* synthetic */ TransferSuccessIntentKey copy$default(TransferSuccessIntentKey transferSuccessIntentKey, PostTransferFlow postTransferFlow, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            postTransferFlow = transferSuccessIntentKey.postTransferFlow;
        }
        if ((i & 2) != 0) {
            entryPoint = transferSuccessIntentKey.entryPoint;
        }
        return transferSuccessIntentKey.copy(postTransferFlow, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final PostTransferFlow getPostTransferFlow() {
        return this.postTransferFlow;
    }

    /* renamed from: component2, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final TransferSuccessIntentKey copy(PostTransferFlow postTransferFlow, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new TransferSuccessIntentKey(postTransferFlow, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferSuccessIntentKey)) {
            return false;
        }
        TransferSuccessIntentKey transferSuccessIntentKey = (TransferSuccessIntentKey) other;
        return Intrinsics.areEqual(this.postTransferFlow, transferSuccessIntentKey.postTransferFlow) && this.entryPoint == transferSuccessIntentKey.entryPoint;
    }

    public int hashCode() {
        return (this.postTransferFlow.hashCode() * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "TransferSuccessIntentKey(postTransferFlow=" + this.postTransferFlow + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.postTransferFlow, flags);
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public TransferSuccessIntentKey(PostTransferFlow postTransferFlow, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.postTransferFlow = postTransferFlow;
        this.entryPoint = entryPoint;
    }

    public final PostTransferFlow getPostTransferFlow() {
        return this.postTransferFlow;
    }

    public /* synthetic */ TransferSuccessIntentKey(PostTransferFlow postTransferFlow, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(postTransferFlow, (i & 2) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
