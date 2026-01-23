package com.robinhood.android.acatsin.availabledestinations;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAvailableDestinationsContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAvailableDestinationsContract {
    public static final int $stable = 0;
    public static final AcatsInAvailableDestinationsContract INSTANCE = new AcatsInAvailableDestinationsContract();

    /* compiled from: AcatsInAvailableDestinationsContract.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", "", "onRhsAccountSelected", "", "account", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "onDeeplinkSelected", "deeplink", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDeeplinkSelected(String deeplink);

        void onRhsAccountSelected(AvailableAccount account);
    }

    private AcatsInAvailableDestinationsContract() {
    }

    /* compiled from: AcatsInAvailableDestinationsContract.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "isAcatsRetry", "", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Z)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final boolean isAcatsRetry;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInAvailableDestinationsContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(AcatsInScreenContext.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                z = key.isAcatsRetry;
            }
            return key.copy(acatsInScreenContext, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final Key copy(AcatsInScreenContext screenContext, boolean isAcatsRetry) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Key(screenContext, isAcatsRetry);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && this.isAcatsRetry == key.isAcatsRetry;
        }

        public int hashCode() {
            return (this.screenContext.hashCode() * 31) + Boolean.hashCode(this.isAcatsRetry);
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", isAcatsRetry=" + this.isAcatsRetry + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.screenContext.writeToParcel(dest, flags);
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
        }

        public Key(AcatsInScreenContext screenContext, boolean z) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.screenContext = screenContext;
            this.isAcatsRetry = z;
        }

        public /* synthetic */ Key(AcatsInScreenContext acatsInScreenContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(acatsInScreenContext, (i & 2) != 0 ? false : z);
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }
    }
}
