package com.robinhood.shared.crypto.contracts.pulse;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPulseIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "destinationOverride", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;)V", "getDestinationOverride", "()Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Destination", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoPulseIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoPulseIntentKey> CREATOR = new Creator();
    private final Destination destinationOverride;

    /* compiled from: CryptoPulseIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoPulseIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoPulseIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoPulseIntentKey((Destination) parcel.readParcelable(CryptoPulseIntentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoPulseIntentKey[] newArray(int i) {
            return new CryptoPulseIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoPulseIntentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoPulseIntentKey copy$default(CryptoPulseIntentKey cryptoPulseIntentKey, Destination destination, int i, Object obj) {
        if ((i & 1) != 0) {
            destination = cryptoPulseIntentKey.destinationOverride;
        }
        return cryptoPulseIntentKey.copy(destination);
    }

    /* renamed from: component1, reason: from getter */
    public final Destination getDestinationOverride() {
        return this.destinationOverride;
    }

    public final CryptoPulseIntentKey copy(Destination destinationOverride) {
        return new CryptoPulseIntentKey(destinationOverride);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoPulseIntentKey) && Intrinsics.areEqual(this.destinationOverride, ((CryptoPulseIntentKey) other).destinationOverride);
    }

    public int hashCode() {
        Destination destination = this.destinationOverride;
        if (destination == null) {
            return 0;
        }
        return destination.hashCode();
    }

    public String toString() {
        return "CryptoPulseIntentKey(destinationOverride=" + this.destinationOverride + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.destinationOverride, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoPulseIntentKey(Destination destination) {
        this.destinationOverride = destination;
    }

    public /* synthetic */ CryptoPulseIntentKey(Destination destination, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : destination);
    }

    public final Destination getDestinationOverride() {
        return this.destinationOverride;
    }

    /* compiled from: CryptoPulseIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;", "Landroid/os/Parcelable;", "<init>", "()V", "Feed", "ShowDigestFragment", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination$Feed;", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination$ShowDigestFragment;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Destination implements Parcelable {
        public /* synthetic */ Destination(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Destination() {
        }

        /* compiled from: CryptoPulseIntentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination$Feed;", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Feed extends Destination {
            public static final Feed INSTANCE = new Feed();
            public static final Parcelable.Creator<Feed> CREATOR = new Creator();

            /* compiled from: CryptoPulseIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Feed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Feed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Feed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Feed[] newArray(int i) {
                    return new Feed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Feed);
            }

            public int hashCode() {
                return 344824774;
            }

            public String toString() {
                return "Feed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Feed() {
                super(null);
            }
        }

        /* compiled from: CryptoPulseIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination$ShowDigestFragment;", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey$Destination;", "fragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "(Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowDigestFragment extends Destination {
            public static final Parcelable.Creator<ShowDigestFragment> CREATOR = new Creator();
            private final AssetDigestFragmentKey fragmentKey;

            /* compiled from: CryptoPulseIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowDigestFragment> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowDigestFragment createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowDigestFragment((AssetDigestFragmentKey) parcel.readParcelable(ShowDigestFragment.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowDigestFragment[] newArray(int i) {
                    return new ShowDigestFragment[i];
                }
            }

            public static /* synthetic */ ShowDigestFragment copy$default(ShowDigestFragment showDigestFragment, AssetDigestFragmentKey assetDigestFragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    assetDigestFragmentKey = showDigestFragment.fragmentKey;
                }
                return showDigestFragment.copy(assetDigestFragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final AssetDigestFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final ShowDigestFragment copy(AssetDigestFragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new ShowDigestFragment(fragmentKey);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowDigestFragment) && Intrinsics.areEqual(this.fragmentKey, ((ShowDigestFragment) other).fragmentKey);
            }

            public int hashCode() {
                return this.fragmentKey.hashCode();
            }

            public String toString() {
                return "ShowDigestFragment(fragmentKey=" + this.fragmentKey + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.fragmentKey, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowDigestFragment(AssetDigestFragmentKey fragmentKey) {
                super(null);
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
            }

            public final AssetDigestFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }
        }
    }
}
