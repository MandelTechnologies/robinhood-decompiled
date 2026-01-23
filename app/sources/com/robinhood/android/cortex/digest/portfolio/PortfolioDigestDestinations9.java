package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations9 extends ComposableDestinationWithArgs<Args> {
    public static final PortfolioDigestDestinations9 INSTANCE = new PortfolioDigestDestinations9();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations9> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations9> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations9 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations9.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations9[] newArray(int i) {
            return new PortfolioDigestDestinations9[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations9() {
        super("portfolio_digest_splash", Args.class, null, null, null, 28, null);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "source", "getSource", "AccountNumber", "NeedsOnboarding", "NeedsGold", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$AccountNumber;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$NeedsGold;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$NeedsOnboarding;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args */
    public interface Args extends Parcelable {
        String getAccountNumber();

        String getSource();

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$AccountNumber;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "accountNumber", "", "source", "skipSplashIfOnboarding", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "getSkipSplashIfOnboarding", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$AccountNumber, reason: from toString */
        public static final /* data */ class AccountNumber implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<AccountNumber> CREATOR = new Creator();
            private final String accountNumber;
            private final boolean skipSplashIfOnboarding;
            private final String source;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$AccountNumber$Creator */
            public static final class Creator implements Parcelable.Creator<AccountNumber> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountNumber createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountNumber(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountNumber[] newArray(int i) {
                    return new AccountNumber[i];
                }
            }

            public static /* synthetic */ AccountNumber copy$default(AccountNumber accountNumber, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountNumber.accountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = accountNumber.source;
                }
                if ((i & 4) != 0) {
                    z = accountNumber.skipSplashIfOnboarding;
                }
                return accountNumber.copy(str, str2, z);
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

            public final AccountNumber copy(String accountNumber, String source, boolean skipSplashIfOnboarding) {
                return new AccountNumber(accountNumber, source, skipSplashIfOnboarding);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountNumber)) {
                    return false;
                }
                AccountNumber accountNumber = (AccountNumber) other;
                return Intrinsics.areEqual(this.accountNumber, accountNumber.accountNumber) && Intrinsics.areEqual(this.source, accountNumber.source) && this.skipSplashIfOnboarding == accountNumber.skipSplashIfOnboarding;
            }

            public int hashCode() {
                String str = this.accountNumber;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.source;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.skipSplashIfOnboarding);
            }

            public String toString() {
                return "AccountNumber(accountNumber=" + this.accountNumber + ", source=" + this.source + ", skipSplashIfOnboarding=" + this.skipSplashIfOnboarding + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeString(this.source);
                dest.writeInt(this.skipSplashIfOnboarding ? 1 : 0);
            }

            public AccountNumber(String str, String str2, boolean z) {
                this.accountNumber = str;
                this.source = str2;
                this.skipSplashIfOnboarding = z;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getSource() {
                return this.source;
            }

            public final boolean getSkipSplashIfOnboarding() {
                return this.skipSplashIfOnboarding;
            }
        }

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$NeedsOnboarding;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "source", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;)V", "getSource", "()Ljava/lang/String;", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "accountNumber", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$NeedsOnboarding, reason: from toString */
        public static final /* data */ class NeedsOnboarding implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<NeedsOnboarding> CREATOR = new Creator();
            private final PortfolioDigest.NeedsOnboarding digest;
            private final String source;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$NeedsOnboarding$Creator */
            public static final class Creator implements Parcelable.Creator<NeedsOnboarding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NeedsOnboarding createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NeedsOnboarding(parcel.readString(), (PortfolioDigest.NeedsOnboarding) parcel.readParcelable(NeedsOnboarding.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NeedsOnboarding[] newArray(int i) {
                    return new NeedsOnboarding[i];
                }
            }

            public static /* synthetic */ NeedsOnboarding copy$default(NeedsOnboarding needsOnboarding, String str, PortfolioDigest.NeedsOnboarding needsOnboarding2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = needsOnboarding.source;
                }
                if ((i & 2) != 0) {
                    needsOnboarding2 = needsOnboarding.digest;
                }
                return needsOnboarding.copy(str, needsOnboarding2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final PortfolioDigest.NeedsOnboarding getDigest() {
                return this.digest;
            }

            public final NeedsOnboarding copy(String source, PortfolioDigest.NeedsOnboarding digest) {
                Intrinsics.checkNotNullParameter(digest, "digest");
                return new NeedsOnboarding(source, digest);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NeedsOnboarding)) {
                    return false;
                }
                NeedsOnboarding needsOnboarding = (NeedsOnboarding) other;
                return Intrinsics.areEqual(this.source, needsOnboarding.source) && Intrinsics.areEqual(this.digest, needsOnboarding.digest);
            }

            public int hashCode() {
                String str = this.source;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.digest.hashCode();
            }

            public String toString() {
                return "NeedsOnboarding(source=" + this.source + ", digest=" + this.digest + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.source);
                dest.writeParcelable(this.digest, flags);
            }

            public NeedsOnboarding(String str, PortfolioDigest.NeedsOnboarding digest) {
                Intrinsics.checkNotNullParameter(digest, "digest");
                this.source = str;
                this.digest = digest;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getSource() {
                return this.source;
            }

            public final PortfolioDigest.NeedsOnboarding getDigest() {
                return this.digest;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getAccountNumber() {
                return this.digest.getAccountNumber();
            }
        }

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args$NeedsGold;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "source", "", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;)V", "getSource", "()Ljava/lang/String;", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "accountNumber", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$NeedsGold, reason: from toString */
        public static final /* data */ class NeedsGold implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<NeedsGold> CREATOR = new Creator();
            private final PortfolioDigest.NeedsGold digest;
            private final String source;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestSplashDest$Args$NeedsGold$Creator */
            public static final class Creator implements Parcelable.Creator<NeedsGold> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NeedsGold createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NeedsGold(parcel.readString(), (PortfolioDigest.NeedsGold) parcel.readParcelable(NeedsGold.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NeedsGold[] newArray(int i) {
                    return new NeedsGold[i];
                }
            }

            public static /* synthetic */ NeedsGold copy$default(NeedsGold needsGold, String str, PortfolioDigest.NeedsGold needsGold2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = needsGold.source;
                }
                if ((i & 2) != 0) {
                    needsGold2 = needsGold.digest;
                }
                return needsGold.copy(str, needsGold2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final PortfolioDigest.NeedsGold getDigest() {
                return this.digest;
            }

            public final NeedsGold copy(String source, PortfolioDigest.NeedsGold digest) {
                Intrinsics.checkNotNullParameter(digest, "digest");
                return new NeedsGold(source, digest);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NeedsGold)) {
                    return false;
                }
                NeedsGold needsGold = (NeedsGold) other;
                return Intrinsics.areEqual(this.source, needsGold.source) && Intrinsics.areEqual(this.digest, needsGold.digest);
            }

            public int hashCode() {
                String str = this.source;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.digest.hashCode();
            }

            public String toString() {
                return "NeedsGold(source=" + this.source + ", digest=" + this.digest + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.source);
                dest.writeParcelable(this.digest, flags);
            }

            public NeedsGold(String str, PortfolioDigest.NeedsGold digest) {
                Intrinsics.checkNotNullParameter(digest, "digest");
                this.source = str;
                this.digest = digest;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getSource() {
                return this.source;
            }

            public final PortfolioDigest.NeedsGold getDigest() {
                return this.digest;
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9.Args
            public String getAccountNumber() {
                return this.digest.getAccountNumber();
            }
        }
    }
}
