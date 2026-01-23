package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDetailDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations4 extends ComposableDestinationWithArgs<Args> {
    public static final PortfolioDigestDestinations4 INSTANCE = new PortfolioDigestDestinations4();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations4> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDetailDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations4.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations4[] newArray(int i) {
            return new PortfolioDigestDestinations4[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations4() {
        super("portfolio_digest_detail", Args.class, null, null, null, 28, null);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "Landroid/os/Parcelable;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "source", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDetailDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final PortfolioDigest.HasOnboarded digest;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDetailDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((PortfolioDigest.HasOnboarded) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PortfolioDigest.HasOnboarded hasOnboarded, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hasOnboarded = args.digest;
            }
            if ((i & 2) != 0) {
                str = args.source;
            }
            return args.copy(hasOnboarded, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(PortfolioDigest.HasOnboarded digest, String source) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new Args(digest, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.digest, args.digest) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = this.digest.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(digest=" + this.digest + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
        }

        public Args(PortfolioDigest.HasOnboarded digest, String str) {
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
        }

        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }
    }
}
