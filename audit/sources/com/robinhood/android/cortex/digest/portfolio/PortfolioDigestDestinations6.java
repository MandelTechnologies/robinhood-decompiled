package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "Result", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations6 extends SheetDestinationWithArgs<Args> {
    public static final PortfolioDigestDestinations6 INSTANCE = new PortfolioDigestDestinations6();
    public static final int $stable = SheetDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations6> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations6> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations6 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations6.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations6[] newArray(int i) {
            return new PortfolioDigestDestinations6[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations6() {
        super("portfolio_digest_feedback_sheet", Args.class);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Args;", "Landroid/os/Parcelable;", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedbackType", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "accountNumber", "", "digestId", "source", "<init>", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeedback", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "getFeedbackType", "()Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getAccountNumber", "()Ljava/lang/String;", "getDigestId", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String digestId;
        private final DigestFeedback feedback;
        private final DigestFeedbackType feedbackType;
        private final String source;
        private final Screen.Name sourceScreen;

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DigestFeedback) parcel.readParcelable(Args.class.getClassLoader()), DigestFeedbackType.valueOf(parcel.readString()), Screen.Name.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DigestFeedback digestFeedback, DigestFeedbackType digestFeedbackType, Screen.Name name, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                digestFeedback = args.feedback;
            }
            if ((i & 2) != 0) {
                digestFeedbackType = args.feedbackType;
            }
            if ((i & 4) != 0) {
                name = args.sourceScreen;
            }
            if ((i & 8) != 0) {
                str = args.accountNumber;
            }
            if ((i & 16) != 0) {
                str2 = args.digestId;
            }
            if ((i & 32) != 0) {
                str3 = args.source;
            }
            String str4 = str2;
            String str5 = str3;
            return args.copy(digestFeedback, digestFeedbackType, name, str, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final DigestFeedback getFeedback() {
            return this.feedback;
        }

        /* renamed from: component2, reason: from getter */
        public final DigestFeedbackType getFeedbackType() {
            return this.feedbackType;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen.Name getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDigestId() {
            return this.digestId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(DigestFeedback feedback, DigestFeedbackType feedbackType, Screen.Name sourceScreen, String accountNumber, String digestId, String source) {
            Intrinsics.checkNotNullParameter(feedback, "feedback");
            Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(digestId, "digestId");
            return new Args(feedback, feedbackType, sourceScreen, accountNumber, digestId, source);
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
            return Intrinsics.areEqual(this.feedback, args.feedback) && this.feedbackType == args.feedbackType && this.sourceScreen == args.sourceScreen && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.digestId, args.digestId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.feedback.hashCode() * 31) + this.feedbackType.hashCode()) * 31) + this.sourceScreen.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.digestId.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(feedback=" + this.feedback + ", feedbackType=" + this.feedbackType + ", sourceScreen=" + this.sourceScreen + ", accountNumber=" + this.accountNumber + ", digestId=" + this.digestId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.feedback, flags);
            dest.writeString(this.feedbackType.name());
            dest.writeString(this.sourceScreen.name());
            dest.writeString(this.accountNumber);
            dest.writeString(this.digestId);
            dest.writeString(this.source);
        }

        public Args(DigestFeedback feedback, DigestFeedbackType feedbackType, Screen.Name sourceScreen, String accountNumber, String digestId, String str) {
            Intrinsics.checkNotNullParameter(feedback, "feedback");
            Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(digestId, "digestId");
            this.feedback = feedback;
            this.feedbackType = feedbackType;
            this.sourceScreen = sourceScreen;
            this.accountNumber = accountNumber;
            this.digestId = digestId;
            this.source = str;
        }

        public final DigestFeedback getFeedback() {
            return this.feedback;
        }

        public final DigestFeedbackType getFeedbackType() {
            return this.feedbackType;
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

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result;", "Landroid/os/Parcelable;", "Success", "Error", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result$Success;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Result */
    public interface Result extends Parcelable {

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result$Success;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result;", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "<init>", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)V", "getFeedback", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Result$Success, reason: from toString */
        public static final /* data */ class Success implements Result {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            private final DigestFeedback feedback;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Result$Success$Creator */
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Success((DigestFeedback) parcel.readParcelable(Success.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            public static /* synthetic */ Success copy$default(Success success, DigestFeedback digestFeedback, int i, Object obj) {
                if ((i & 1) != 0) {
                    digestFeedback = success.feedback;
                }
                return success.copy(digestFeedback);
            }

            /* renamed from: component1, reason: from getter */
            public final DigestFeedback getFeedback() {
                return this.feedback;
            }

            public final Success copy(DigestFeedback feedback) {
                Intrinsics.checkNotNullParameter(feedback, "feedback");
                return new Success(feedback);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.feedback, ((Success) other).feedback);
            }

            public int hashCode() {
                return this.feedback.hashCode();
            }

            public String toString() {
                return "Success(feedback=" + this.feedback + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.feedback, flags);
            }

            public Success(DigestFeedback feedback) {
                Intrinsics.checkNotNullParameter(feedback, "feedback");
                this.feedback = feedback;
            }

            public final DigestFeedback getFeedback() {
                return this.feedback;
            }
        }

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Result$Error */
        public static final class Error implements Result {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();
            public static final Parcelable.Creator<Error> CREATOR = new Creator();

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestFeedbackSheetDest$Result$Error$Creator */
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Error.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Error() {
            }
        }
    }
}
