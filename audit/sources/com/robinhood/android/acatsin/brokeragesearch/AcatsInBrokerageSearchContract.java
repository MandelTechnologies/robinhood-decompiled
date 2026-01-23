package com.robinhood.android.acatsin.brokeragesearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInBrokerageSearchContract {
    public static final int $stable = 0;
    public static final AcatsInBrokerageSearchContract INSTANCE = new AcatsInBrokerageSearchContract();

    /* compiled from: AcatsInBrokerageSearchContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Callbacks;", "", "onBrokerageSelected", "", "brokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "onManualBrokerageEntrySelected", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBrokerageSelected(ApiBrokerage brokerage);

        void onManualBrokerageEntrySelected();
    }

    private AcatsInBrokerageSearchContract() {
    }

    /* compiled from: AcatsInBrokerageSearchContract.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "availableAccountsSkipped", "", "rhsAccountNumber", "", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;ZLjava/lang/String;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getAvailableAccountsSkipped", "()Z", "getRhsAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = AcatsInScreenContext.$stable;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final boolean availableAccountsSkipped;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInBrokerageSearchContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                z = key.availableAccountsSkipped;
            }
            if ((i & 4) != 0) {
                str = key.rhsAccountNumber;
            }
            return key.copy(acatsInScreenContext, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAvailableAccountsSkipped() {
            return this.availableAccountsSkipped;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final Key copy(AcatsInScreenContext screenContext, boolean availableAccountsSkipped, String rhsAccountNumber) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            return new Key(screenContext, availableAccountsSkipped, rhsAccountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && this.availableAccountsSkipped == key.availableAccountsSkipped && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber);
        }

        public int hashCode() {
            return (((this.screenContext.hashCode() * 31) + Boolean.hashCode(this.availableAccountsSkipped)) * 31) + this.rhsAccountNumber.hashCode();
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", availableAccountsSkipped=" + this.availableAccountsSkipped + ", rhsAccountNumber=" + this.rhsAccountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            dest.writeInt(this.availableAccountsSkipped ? 1 : 0);
            dest.writeString(this.rhsAccountNumber);
        }

        public Key(AcatsInScreenContext screenContext, boolean z, String rhsAccountNumber) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            this.screenContext = screenContext;
            this.availableAccountsSkipped = z;
            this.rhsAccountNumber = rhsAccountNumber;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final boolean getAvailableAccountsSkipped() {
            return this.availableAccountsSkipped;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }
    }
}
