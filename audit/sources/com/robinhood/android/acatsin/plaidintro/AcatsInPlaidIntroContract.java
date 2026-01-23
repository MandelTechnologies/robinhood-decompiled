package com.robinhood.android.acatsin.plaidintro;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPlaidIntroContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPlaidIntroContract {
    public static final int $stable = 0;
    public static final AcatsInPlaidIntroContract INSTANCE = new AcatsInPlaidIntroContract();

    /* compiled from: AcatsInPlaidIntroContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Callbacks;", "", "onAccountInfoMethodSelected", "", "isPlaid", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountInfoMethodSelected(boolean isPlaid);
    }

    private AcatsInPlaidIntroContract() {
    }

    /* compiled from: AcatsInPlaidIntroContract.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = AcatsInScreenContext.$stable;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInPlaidIntroContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            return key.copy(acatsInScreenContext);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Key copy(AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Key(screenContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Key) && Intrinsics.areEqual(this.screenContext, ((Key) other).screenContext);
        }

        public int hashCode() {
            return this.screenContext.hashCode();
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
        }

        public Key(AcatsInScreenContext screenContext) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.screenContext = screenContext;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }
    }
}
