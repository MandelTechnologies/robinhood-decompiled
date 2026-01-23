package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceSheetDest;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceSheetDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestArticleSourceSheetDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations3 extends SheetDestinationWithArgs<Args> {
    public static final PortfolioDigestDestinations3 INSTANCE = new PortfolioDigestDestinations3();
    public static final int $stable = SheetDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations3> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestArticleSourceSheetDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations3.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations3[] newArray(int i) {
            return new PortfolioDigestDestinations3[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations3() {
        super("portfolio_digest_article_source_sheet", Args.class);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceSheetDest$Args;", "Landroid/os/Parcelable;", "articleSource", "Lcom/robinhood/android/cortex/models/ArticleSource;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "accountNumber", "", "digestId", "source", "<init>", "(Lcom/robinhood/android/cortex/models/ArticleSource;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleSource", "()Lcom/robinhood/android/cortex/models/ArticleSource;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getAccountNumber", "()Ljava/lang/String;", "getDigestId", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestArticleSourceSheetDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final ArticleSource articleSource;
        private final String digestId;
        private final String source;
        private final Screen.Name sourceScreen;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestArticleSourceSheetDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ArticleSource) parcel.readParcelable(Args.class.getClassLoader()), Screen.Name.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ArticleSource articleSource, Screen.Name name, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                articleSource = args.articleSource;
            }
            if ((i & 2) != 0) {
                name = args.sourceScreen;
            }
            if ((i & 4) != 0) {
                str = args.accountNumber;
            }
            if ((i & 8) != 0) {
                str2 = args.digestId;
            }
            if ((i & 16) != 0) {
                str3 = args.source;
            }
            String str4 = str3;
            String str5 = str;
            return args.copy(articleSource, name, str5, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final ArticleSource getArticleSource() {
            return this.articleSource;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen.Name getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDigestId() {
            return this.digestId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(ArticleSource articleSource, Screen.Name sourceScreen, String accountNumber, String digestId, String source) {
            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(digestId, "digestId");
            return new Args(articleSource, sourceScreen, accountNumber, digestId, source);
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
            return Intrinsics.areEqual(this.articleSource, args.articleSource) && this.sourceScreen == args.sourceScreen && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.digestId, args.digestId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((((((this.articleSource.hashCode() * 31) + this.sourceScreen.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.digestId.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(articleSource=" + this.articleSource + ", sourceScreen=" + this.sourceScreen + ", accountNumber=" + this.accountNumber + ", digestId=" + this.digestId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.articleSource, flags);
            dest.writeString(this.sourceScreen.name());
            dest.writeString(this.accountNumber);
            dest.writeString(this.digestId);
            dest.writeString(this.source);
        }

        public Args(ArticleSource articleSource, Screen.Name sourceScreen, String accountNumber, String digestId, String str) {
            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(digestId, "digestId");
            this.articleSource = articleSource;
            this.sourceScreen = sourceScreen;
            this.accountNumber = accountNumber;
            this.digestId = digestId;
            this.source = str;
        }

        public final ArticleSource getArticleSource() {
            return this.articleSource;
        }

        public final Screen.Name getSourceScreen() {
            return this.sourceScreen;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getDigestId() {
            return this.digestId;
        }

        public final String getSource() {
            return this.source;
        }
    }
}
