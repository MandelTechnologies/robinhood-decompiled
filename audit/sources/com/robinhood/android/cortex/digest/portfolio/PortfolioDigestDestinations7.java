package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations7;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0005\n\u000b\f\r\u000eB)\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "argumentClass", "Ljava/lang/Class;", "defaultArgument", "Lkotlin/Function0;", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)V", "Detail", "Splash", "SplashWithNeedsOnboarding", "SplashWithNeedsGold", "Agreement", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Agreement;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Detail;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Splash;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$SplashWithNeedsGold;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$SplashWithNeedsOnboarding;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class PortfolioDigestDestinations7<T extends Parcelable> extends ComposableDestinationWithArgs<T> {
    public static final int $stable = ComposableDestinationWithArgs.$stable;

    public /* synthetic */ PortfolioDigestDestinations7(Class cls, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, function0);
    }

    public /* synthetic */ PortfolioDigestDestinations7(Class cls, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? null : function0, null);
    }

    private PortfolioDigestDestinations7(Class<T> cls, Function0<? extends T> function0) {
        super("cortex_portfolio_digest", cls, function0, null, null, 24, null);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Detail;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "source", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$HasOnboarded;", "getSource", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Detail */
    public static final class Detail extends PortfolioDigestDestinations7<PortfolioDigestDestinations4.Args> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Detail> CREATOR = new Creator();
        private final PortfolioDigest.HasOnboarded digest;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Detail$Creator */
        public static final class Creator implements Parcelable.Creator<Detail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Detail((PortfolioDigest.HasOnboarded) parcel.readParcelable(Detail.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail[] newArray(int i) {
                return new Detail[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
        }

        public final PortfolioDigest.HasOnboarded getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Detail(final PortfolioDigest.HasOnboarded digest, final String str) {
            super(PortfolioDigestDestinations4.Args.class, new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Detail$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDestinations7.Detail._init_$lambda$0(digest, str);
                }
            }, null);
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PortfolioDigestDestinations4.Args _init_$lambda$0(PortfolioDigest.HasOnboarded hasOnboarded, String str) {
            return new PortfolioDigestDestinations4.Args(hasOnboarded, str);
        }
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Splash;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "accountNumber", "", "skipSplashIfOnboarding", "", "source", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSkipSplashIfOnboarding", "()Z", "getSource", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Splash */
    public static final class Splash extends PortfolioDigestDestinations7<PortfolioDigestDestinations9.Args> {
        public static final int $stable = ComposableDestinationWithArgs.$stable;
        public static final Parcelable.Creator<Splash> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean skipSplashIfOnboarding;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Splash$Creator */
        public static final class Creator implements Parcelable.Creator<Splash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Splash(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Splash[] newArray(int i) {
                return new Splash[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.skipSplashIfOnboarding ? 1 : 0);
            dest.writeString(this.source);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getSkipSplashIfOnboarding() {
            return this.skipSplashIfOnboarding;
        }

        public final String getSource() {
            return this.source;
        }

        public Splash(final String str, final boolean z, final String str2) {
            super(PortfolioDigestDestinations9.Args.class, new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Splash$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDestinations7.Splash._init_$lambda$0(str, str2, z);
                }
            }, null);
            this.accountNumber = str;
            this.skipSplashIfOnboarding = z;
            this.source = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PortfolioDigestDestinations9.Args _init_$lambda$0(String str, String str2, boolean z) {
            return new PortfolioDigestDestinations9.Args.AccountNumber(str, str2, z);
        }
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$SplashWithNeedsOnboarding;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "source", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "getSource", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsOnboarding */
    public static final class SplashWithNeedsOnboarding extends PortfolioDigestDestinations7<PortfolioDigestDestinations9.Args> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashWithNeedsOnboarding> CREATOR = new Creator();
        private final PortfolioDigest.NeedsOnboarding digest;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsOnboarding$Creator */
        public static final class Creator implements Parcelable.Creator<SplashWithNeedsOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashWithNeedsOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplashWithNeedsOnboarding((PortfolioDigest.NeedsOnboarding) parcel.readParcelable(SplashWithNeedsOnboarding.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashWithNeedsOnboarding[] newArray(int i) {
                return new SplashWithNeedsOnboarding[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
        }

        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashWithNeedsOnboarding(final PortfolioDigest.NeedsOnboarding digest, final String str) {
            super(PortfolioDigestDestinations9.Args.class, new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsOnboarding$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDestinations7.SplashWithNeedsOnboarding._init_$lambda$0(str, digest);
                }
            }, null);
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PortfolioDigestDestinations9.Args _init_$lambda$0(String str, PortfolioDigest.NeedsOnboarding needsOnboarding) {
            return new PortfolioDigestDestinations9.Args.NeedsOnboarding(str, needsOnboarding);
        }
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$SplashWithNeedsGold;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "source", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsGold;", "getSource", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsGold */
    public static final class SplashWithNeedsGold extends PortfolioDigestDestinations7<PortfolioDigestDestinations9.Args> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashWithNeedsGold> CREATOR = new Creator();
        private final PortfolioDigest.NeedsGold digest;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsGold$Creator */
        public static final class Creator implements Parcelable.Creator<SplashWithNeedsGold> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashWithNeedsGold createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplashWithNeedsGold((PortfolioDigest.NeedsGold) parcel.readParcelable(SplashWithNeedsGold.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashWithNeedsGold[] newArray(int i) {
                return new SplashWithNeedsGold[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
        }

        public final PortfolioDigest.NeedsGold getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashWithNeedsGold(final PortfolioDigest.NeedsGold digest, final String str) {
            super(PortfolioDigestDestinations9.Args.class, new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$SplashWithNeedsGold$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDestinations7.SplashWithNeedsGold._init_$lambda$0(str, digest);
                }
            }, null);
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PortfolioDigestDestinations9.Args _init_$lambda$0(String str, PortfolioDigest.NeedsGold needsGold) {
            return new PortfolioDigestDestinations9.Args.NeedsGold(str, needsGold);
        }
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest$Agreement;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestInitialDest;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestAgreementDest$Args;", "digest", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "source", "", "<init>", "(Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;Ljava/lang/String;)V", "getDigest", "()Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest$NeedsOnboarding;", "getSource", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Agreement */
    public static final class Agreement extends PortfolioDigestDestinations7<PortfolioDigestDestinations.Args> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Agreement> CREATOR = new Creator();
        private final PortfolioDigest.NeedsOnboarding digest;
        private final String source;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Agreement$Creator */
        public static final class Creator implements Parcelable.Creator<Agreement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Agreement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Agreement((PortfolioDigest.NeedsOnboarding) parcel.readParcelable(Agreement.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Agreement[] newArray(int i) {
                return new Agreement[i];
            }
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.digest, flags);
            dest.writeString(this.source);
        }

        public final PortfolioDigest.NeedsOnboarding getDigest() {
            return this.digest;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Agreement(final PortfolioDigest.NeedsOnboarding digest, final String str) {
            super(PortfolioDigestDestinations.Args.class, new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestInitialDest$Agreement$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDestinations7.Agreement._init_$lambda$0(digest, str);
                }
            }, null);
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.digest = digest;
            this.source = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PortfolioDigestDestinations.Args _init_$lambda$0(PortfolioDigest.NeedsOnboarding needsOnboarding, String str) {
            return new PortfolioDigestDestinations.Args(needsOnboarding, str);
        }
    }
}
