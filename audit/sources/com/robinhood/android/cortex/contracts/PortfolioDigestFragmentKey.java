package com.robinhood.android.cortex.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "WithDigest", "WithId", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey$WithDigest;", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey$WithId;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface PortfolioDigestFragmentKey extends FragmentKey {

    /* compiled from: PortfolioDigestFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey$WithDigest;", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "source", "", "skipSplashIfOnboarding", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;Ljava/lang/String;Z)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "getSource", "()Ljava/lang/String;", "getSkipSplashIfOnboarding", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithDigest implements PortfolioDigestFragmentKey {
        public static final Parcelable.Creator<WithDigest> CREATOR = new Creator();
        private final PortfolioDigest digest;
        private final boolean skipSplashIfOnboarding;
        private final String source;

        /* compiled from: PortfolioDigestFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithDigest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithDigest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithDigest((PortfolioDigest) parcel.readParcelable(WithDigest.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithDigest[] newArray(int i) {
                return new WithDigest[i];
            }
        }

        public static /* synthetic */ WithDigest copy$default(WithDigest withDigest, PortfolioDigest portfolioDigest, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                portfolioDigest = withDigest.digest;
            }
            if ((i & 2) != 0) {
                str = withDigest.source;
            }
            if ((i & 4) != 0) {
                z = withDigest.skipSplashIfOnboarding;
            }
            return withDigest.copy(portfolioDigest, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest getDigest() {
            return this.digest;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipSplashIfOnboarding() {
            return this.skipSplashIfOnboarding;
        }

        public final WithDigest copy(PortfolioDigest digest, String source, boolean skipSplashIfOnboarding) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new WithDigest(digest, source, skipSplashIfOnboarding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithDigest)) {
                return false;
            }
            WithDigest withDigest = (WithDigest) other;
            return Intrinsics.areEqual(this.digest, withDigest.digest) && Intrinsics.areEqual(this.source, withDigest.source) && this.skipSplashIfOnboarding == withDigest.skipSplashIfOnboarding;
        }

        public int hashCode() {
            int iHashCode = this.digest.hashCode() * 31;
            String str = this.source;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.skipSplashIfOnboarding);
        }

        public String toString() {
            return "WithDigest(digest=" + this.digest + ", source=" + this.source + ", skipSplashIfOnboarding=" + this.skipSplashIfOnboarding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
            dest.writeInt(this.skipSplashIfOnboarding ? 1 : 0);
        }

        public WithDigest(PortfolioDigest digest, String str, boolean z) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
            this.skipSplashIfOnboarding = z;
        }

        public /* synthetic */ WithDigest(PortfolioDigest portfolioDigest, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(portfolioDigest, str, (i & 4) != 0 ? false : z);
        }

        public final PortfolioDigest getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getSkipSplashIfOnboarding() {
            return this.skipSplashIfOnboarding;
        }
    }

    /* compiled from: PortfolioDigestFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey$WithId;", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;", "accountNumber", "", "source", "skipSplashIfOnboarding", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "getSkipSplashIfOnboarding", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithId implements PortfolioDigestFragmentKey {
        public static final Parcelable.Creator<WithId> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean skipSplashIfOnboarding;
        private final String source;

        /* compiled from: PortfolioDigestFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithId(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithId[] newArray(int i) {
                return new WithId[i];
            }
        }

        public static /* synthetic */ WithId copy$default(WithId withId, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withId.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = withId.source;
            }
            if ((i & 4) != 0) {
                z = withId.skipSplashIfOnboarding;
            }
            return withId.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipSplashIfOnboarding() {
            return this.skipSplashIfOnboarding;
        }

        public final WithId copy(String accountNumber, String source, boolean skipSplashIfOnboarding) {
            return new WithId(accountNumber, source, skipSplashIfOnboarding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithId)) {
                return false;
            }
            WithId withId = (WithId) other;
            return Intrinsics.areEqual(this.accountNumber, withId.accountNumber) && Intrinsics.areEqual(this.source, withId.source) && this.skipSplashIfOnboarding == withId.skipSplashIfOnboarding;
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.skipSplashIfOnboarding);
        }

        public String toString() {
            return "WithId(accountNumber=" + this.accountNumber + ", source=" + this.source + ", skipSplashIfOnboarding=" + this.skipSplashIfOnboarding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.source);
            dest.writeInt(this.skipSplashIfOnboarding ? 1 : 0);
        }

        public WithId(String str, String str2, boolean z) {
            this.accountNumber = str;
            this.source = str2;
            this.skipSplashIfOnboarding = z;
        }

        public /* synthetic */ WithId(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getSkipSplashIfOnboarding() {
            return this.skipSplashIfOnboarding;
        }
    }
}
