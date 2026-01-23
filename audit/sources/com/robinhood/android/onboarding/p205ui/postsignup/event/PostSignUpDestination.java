package com.robinhood.android.onboarding.p205ui.postsignup.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.util.Money;
import com.robinhood.rhc.upsells.Upsell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpDestination.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0010\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "Landroid/os/Parcelable;", "analyticsString", "", "<init>", "(Ljava/lang/String;)V", "getAnalyticsString", "()Ljava/lang/String;", "toString", "PreFundSplash", "PreFundDetails", "CreateIavRelationship", "CreateUkQueuedDeposit", "DepositQueuedMessage", "Referral", "DocUpload", "VerifyIdentity", "PostFundingUpsell", "Thanks", "Watchlist", "RhyTab", "RecurringAutomaticDeposit", "HelmDrivenSubFlow", "FirstDeposit", "NativeFundingUpsell", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$CreateIavRelationship;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$CreateUkQueuedDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$DepositQueuedMessage;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$DocUpload;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$FirstDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$HelmDrivenSubFlow;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$NativeFundingUpsell;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PostFundingUpsell;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PreFundDetails;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PreFundSplash;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$RecurringAutomaticDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Referral;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$RhyTab;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Thanks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$VerifyIdentity;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Watchlist;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PostSignUpDestination implements Parcelable {
    public static final int $stable = 0;
    private final String analyticsString;

    public /* synthetic */ PostSignUpDestination(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private PostSignUpDestination(String str) {
        this.analyticsString = str;
    }

    public final String getAnalyticsString() {
        return this.analyticsString;
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PreFundSplash;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "showTransition", "", "<init>", "(Z)V", "getShowTransition", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PreFundSplash extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreFundSplash> CREATOR = new Creator();
        private final boolean showTransition;

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PreFundSplash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFundSplash createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreFundSplash(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFundSplash[] newArray(int i) {
                return new PreFundSplash[i];
            }
        }

        public static /* synthetic */ PreFundSplash copy$default(PreFundSplash preFundSplash, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = preFundSplash.showTransition;
            }
            return preFundSplash.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTransition() {
            return this.showTransition;
        }

        public final PreFundSplash copy(boolean showTransition) {
            return new PreFundSplash(showTransition);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreFundSplash) && this.showTransition == ((PreFundSplash) other).showTransition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showTransition);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination
        public String toString() {
            return "PreFundSplash(showTransition=" + this.showTransition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showTransition ? 1 : 0);
        }

        public PreFundSplash(boolean z) {
            super("splash", null);
            this.showTransition = z;
        }

        public final boolean getShowTransition() {
            return this.showTransition;
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PreFundDetails;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PreFundDetails extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final PreFundDetails INSTANCE = new PreFundDetails();
        public static final Parcelable.Creator<PreFundDetails> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PreFundDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFundDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreFundDetails.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFundDetails[] newArray(int i) {
                return new PreFundDetails[i];
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

        private PreFundDetails() {
            super("fund_account", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$CreateIavRelationship;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CreateIavRelationship extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final CreateIavRelationship INSTANCE = new CreateIavRelationship();
        public static final Parcelable.Creator<CreateIavRelationship> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateIavRelationship> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateIavRelationship createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateIavRelationship.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateIavRelationship[] newArray(int i) {
                return new CreateIavRelationship[i];
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

        private CreateIavRelationship() {
            super("create_iav_relationship", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$CreateUkQueuedDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CreateUkQueuedDeposit extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final CreateUkQueuedDeposit INSTANCE = new CreateUkQueuedDeposit();
        public static final Parcelable.Creator<CreateUkQueuedDeposit> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateUkQueuedDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateUkQueuedDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateUkQueuedDeposit.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateUkQueuedDeposit[] newArray(int i) {
                return new CreateUkQueuedDeposit[i];
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

        private CreateUkQueuedDeposit() {
            super("create_uk_queued_deposit", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$DepositQueuedMessage;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DepositQueuedMessage extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final DepositQueuedMessage INSTANCE = new DepositQueuedMessage();
        public static final Parcelable.Creator<DepositQueuedMessage> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DepositQueuedMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositQueuedMessage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DepositQueuedMessage.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositQueuedMessage[] newArray(int i) {
                return new DepositQueuedMessage[i];
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

        private DepositQueuedMessage() {
            super("deposit_queued_message", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Referral;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Referral extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final Referral INSTANCE = new Referral();
        public static final Parcelable.Creator<Referral> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Referral> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Referral createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Referral.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Referral[] newArray(int i) {
                return new Referral[i];
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

        private Referral() {
            super(Upsell.Single.Referral.f5956ID, null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$DocUpload;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "requests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Ljava/util/List;)V", "getRequests", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocUpload extends PostSignUpDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DocUpload> CREATOR = new Creator();
        private final List<DocumentRequest> requests;

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DocUpload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocUpload createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(DocUpload.class.getClassLoader()));
                }
                return new DocUpload(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocUpload[] newArray(int i) {
                return new DocUpload[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DocUpload() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocUpload copy$default(DocUpload docUpload, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = docUpload.requests;
            }
            return docUpload.copy(list);
        }

        public final List<DocumentRequest> component1() {
            return this.requests;
        }

        public final DocUpload copy(List<DocumentRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return new DocUpload(requests);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocUpload) && Intrinsics.areEqual(this.requests, ((DocUpload) other).requests);
        }

        public int hashCode() {
            return this.requests.hashCode();
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination
        public String toString() {
            return "DocUpload(requests=" + this.requests + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<DocumentRequest> list = this.requests;
            dest.writeInt(list.size());
            Iterator<DocumentRequest> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public /* synthetic */ DocUpload(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<DocumentRequest> getRequests() {
            return this.requests;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocUpload(List<DocumentRequest> requests) {
            super("doc_upload", null);
            Intrinsics.checkNotNullParameter(requests, "requests");
            this.requests = requests;
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$VerifyIdentity;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerifyIdentity extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final VerifyIdentity INSTANCE = new VerifyIdentity();
        public static final Parcelable.Creator<VerifyIdentity> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifyIdentity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyIdentity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VerifyIdentity.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyIdentity[] newArray(int i) {
                return new VerifyIdentity[i];
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

        private VerifyIdentity() {
            super("verify_identity", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$PostFundingUpsell;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PostFundingUpsell extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final PostFundingUpsell INSTANCE = new PostFundingUpsell();
        public static final Parcelable.Creator<PostFundingUpsell> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PostFundingUpsell> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostFundingUpsell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PostFundingUpsell.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostFundingUpsell[] newArray(int i) {
                return new PostFundingUpsell[i];
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

        private PostFundingUpsell() {
            super("post_funding_upsell", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Thanks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "showTransition", "", "<init>", "(Z)V", "getShowTransition", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Thanks extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Thanks> CREATOR = new Creator();
        private final boolean showTransition;

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Thanks> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Thanks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Thanks(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Thanks[] newArray(int i) {
                return new Thanks[i];
            }
        }

        public static /* synthetic */ Thanks copy$default(Thanks thanks, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = thanks.showTransition;
            }
            return thanks.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTransition() {
            return this.showTransition;
        }

        public final Thanks copy(boolean showTransition) {
            return new Thanks(showTransition);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Thanks) && this.showTransition == ((Thanks) other).showTransition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showTransition);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination
        public String toString() {
            return "Thanks(showTransition=" + this.showTransition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showTransition ? 1 : 0);
        }

        public Thanks(boolean z) {
            super("thanks", null);
            this.showTransition = z;
        }

        public final boolean getShowTransition() {
            return this.showTransition;
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$Watchlist;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Watchlist extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final Watchlist INSTANCE = new Watchlist();
        public static final Parcelable.Creator<Watchlist> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Watchlist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Watchlist createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Watchlist.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Watchlist[] newArray(int i) {
                return new Watchlist[i];
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

        private Watchlist() {
            super(PortfolioBuyingPower5.IntentKeyEntryPoint, null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$RhyTab;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyTab extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final RhyTab INSTANCE = new RhyTab();
        public static final Parcelable.Creator<RhyTab> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhyTab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RhyTab.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyTab[] newArray(int i) {
                return new RhyTab[i];
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

        private RhyTab() {
            super("rhy_tab", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$RecurringAutomaticDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "recommendedAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getRecommendedAmount", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecurringAutomaticDeposit extends PostSignUpDestination {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RecurringAutomaticDeposit> CREATOR = new Creator();
        private final Money recommendedAmount;

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecurringAutomaticDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringAutomaticDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringAutomaticDeposit((Money) parcel.readParcelable(RecurringAutomaticDeposit.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringAutomaticDeposit[] newArray(int i) {
                return new RecurringAutomaticDeposit[i];
            }
        }

        public static /* synthetic */ RecurringAutomaticDeposit copy$default(RecurringAutomaticDeposit recurringAutomaticDeposit, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = recurringAutomaticDeposit.recommendedAmount;
            }
            return recurringAutomaticDeposit.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final RecurringAutomaticDeposit copy(Money recommendedAmount) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            return new RecurringAutomaticDeposit(recommendedAmount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecurringAutomaticDeposit) && Intrinsics.areEqual(this.recommendedAmount, ((RecurringAutomaticDeposit) other).recommendedAmount);
        }

        public int hashCode() {
            return this.recommendedAmount.hashCode();
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination
        public String toString() {
            return "RecurringAutomaticDeposit(recommendedAmount=" + this.recommendedAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.recommendedAmount, flags);
        }

        public final Money getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringAutomaticDeposit(Money recommendedAmount) {
            super("recurring_automatic_deposit", null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            this.recommendedAmount = recommendedAmount;
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$HelmDrivenSubFlow;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HelmDrivenSubFlow extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final HelmDrivenSubFlow INSTANCE = new HelmDrivenSubFlow();
        public static final Parcelable.Creator<HelmDrivenSubFlow> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HelmDrivenSubFlow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelmDrivenSubFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelmDrivenSubFlow.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelmDrivenSubFlow[] newArray(int i) {
                return new HelmDrivenSubFlow[i];
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

        private HelmDrivenSubFlow() {
            super("helm_driven_sub_flow", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$FirstDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FirstDeposit extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final FirstDeposit INSTANCE = new FirstDeposit();
        public static final Parcelable.Creator<FirstDeposit> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FirstDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FirstDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FirstDeposit.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FirstDeposit[] newArray(int i) {
                return new FirstDeposit[i];
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

        private FirstDeposit() {
            super("first_deposit", null);
        }
    }

    /* compiled from: PostSignUpDestination.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination$NativeFundingUpsell;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NativeFundingUpsell extends PostSignUpDestination {
        public static final int $stable = 0;
        public static final NativeFundingUpsell INSTANCE = new NativeFundingUpsell();
        public static final Parcelable.Creator<NativeFundingUpsell> CREATOR = new Creator();

        /* compiled from: PostSignUpDestination.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<NativeFundingUpsell> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeFundingUpsell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NativeFundingUpsell.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeFundingUpsell[] newArray(int i) {
                return new NativeFundingUpsell[i];
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

        private NativeFundingUpsell() {
            super("native_funding_upsell", null);
        }
    }

    public String toString() {
        return this.analyticsString;
    }
}
