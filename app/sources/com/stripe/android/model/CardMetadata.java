package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardMetadata.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/stripe/android/model/CardMetadata;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/cards/Bin;", "bin", "", "Lcom/stripe/android/model/AccountRange;", "accountRanges", "<init>", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "Ljava/util/List;", "getAccountRanges", "()Ljava/util/List;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardMetadata implements StripeModel {
    public static final Parcelable.Creator<CardMetadata> CREATOR = new Creator();
    private final List<AccountRange> accountRanges;
    private final Bin bin;

    /* compiled from: CardMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CardMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Bin bin = (Bin) parcel.readParcelable(CardMetadata.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AccountRange.CREATOR.createFromParcel(parcel));
            }
            return new CardMetadata(bin, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata[] newArray(int i) {
            return new CardMetadata[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardMetadata)) {
            return false;
        }
        CardMetadata cardMetadata = (CardMetadata) other;
        return Intrinsics.areEqual(this.bin, cardMetadata.bin) && Intrinsics.areEqual(this.accountRanges, cardMetadata.accountRanges);
    }

    public int hashCode() {
        return (this.bin.hashCode() * 31) + this.accountRanges.hashCode();
    }

    public String toString() {
        return "CardMetadata(bin=" + this.bin + ", accountRanges=" + this.accountRanges + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.bin, flags);
        List<AccountRange> list = this.accountRanges;
        parcel.writeInt(list.size());
        Iterator<AccountRange> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public CardMetadata(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.bin = bin;
        this.accountRanges = accountRanges;
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }
}
