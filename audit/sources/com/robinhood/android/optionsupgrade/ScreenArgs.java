package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.ApprovedTradesResponseMetadataDto;
import options_product.service.FailureResponseMetadataDto;
import options_product.service.JAPendingApplicationResponseMetadataDto;
import options_product.service.SplashL0ResponseMetadataDto;
import options_product.service.SplashL2ResponseMetadataDto;
import options_product.service.SuccessResponseMetadataDto;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:&\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:B;\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u0082\u0001&;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "disableBackwardNavigation", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Z)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getDisableBackwardNavigation", "Start", "SplashL0", "SplashL2", "SplashRetirement", "QuestionOptionExperience", "QuestionUnderstandSpread", "QuestionInvestmentAdvice", "QuestionFinancialRegulator", "Suitability", "InvestmentProfile", "Disclosure", "ApprovedTrades", "Success", "Failure", "EducationSpread", "EducationL3Strategies", "ReadyL3Upgrade", "UpsellAlert", "UpsellTradeOnExpiration", "UpsellAllSet", "End", "UkSplashL0", "UkEducationBenefits", "UkEducationRisks", "UkInvestorProfile", "UkReviewInvestorProfile", "UkExperienceTestQuestionnaire", "UkKnowledgeTestQuestionnaire", "UkProfessionalTrader", "UkSplashL2", "UkEducationBenefitsL2", "RhsgSplash", "RhsgCustomerAccountReviewQuestionnaire", "RhsgProfessionalTrader", "RhsgL2ApprovedTrades", "RhsgL3ApprovedTrades", "JointAccountPendingApplication", "KnowledgeCheckNeeded", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Disclosure;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationL3Strategies;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$End;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Failure;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$InvestmentProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$JointAccountPendingApplication;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$KnowledgeCheckNeeded;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionFinancialRegulator;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionInvestmentAdvice;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionOptionExperience;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionUnderstandSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$ReadyL3Upgrade;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgCustomerAccountReviewQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgL2ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgL3ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgSplash;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashRetirement;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Success;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Suitability;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefits;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefitsL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationRisks;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkExperienceTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkKnowledgeTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkReviewInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkSplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAlert;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAllSet;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellTradeOnExpiration;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class ScreenArgs implements Parcelable {
    public static final int $stable = 8;
    private final boolean disableBackwardNavigation;
    private final boolean isCheckpoint;
    private final OptionOnboardingProgress onboardingProgress;
    private final UUID screenId;
    private final boolean shouldClearBackstack;
    private final boolean shouldLiveInBackstack;

    public /* synthetic */ ScreenArgs(boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, optionOnboardingProgress, uuid, z4);
    }

    private ScreenArgs(boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, boolean z4) {
        this.isCheckpoint = z;
        this.shouldLiveInBackstack = z2;
        this.shouldClearBackstack = z3;
        this.onboardingProgress = optionOnboardingProgress;
        this.screenId = uuid;
        this.disableBackwardNavigation = z4;
    }

    public /* synthetic */ ScreenArgs(boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, optionOnboardingProgress, uuid, (i & 32) != 0 ? false : z4, null);
    }

    /* renamed from: isCheckpoint, reason: from getter */
    public boolean getIsCheckpoint() {
        return this.isCheckpoint;
    }

    public boolean getShouldLiveInBackstack() {
        return this.shouldLiveInBackstack;
    }

    public boolean getShouldClearBackstack() {
        return this.shouldClearBackstack;
    }

    public OptionOnboardingProgress getOnboardingProgress() {
        return this.onboardingProgress;
    }

    public UUID getScreenId() {
        return this.screenId;
    }

    public boolean getDisableBackwardNavigation() {
        return this.disableBackwardNavigation;
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Start extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Start> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Start> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Start(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start[] newArray(int i) {
                return new Start[i];
            }
        }

        public static /* synthetic */ Start copy$default(Start start, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = start.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = start.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = start.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = start.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = start.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return start.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Start copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Start(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Start)) {
                return false;
            }
            Start start = (Start) other;
            return this.isCheckpoint == start.isCheckpoint && this.shouldLiveInBackstack == start.shouldLiveInBackstack && this.shouldClearBackstack == start.shouldClearBackstack && this.onboardingProgress == start.onboardingProgress && Intrinsics.areEqual(this.screenId, start.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Start(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\r\u0010\u001e\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "accountTypeInCopy", "Loptions_product/service/SplashL0ResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SplashL0AccountTypeInCopy;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Loptions_product/service/SplashL0ResponseMetadataDto$AccountTypeInCopyDto;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountTypeInCopy", "()Loptions_product/service/SplashL0ResponseMetadataDto$AccountTypeInCopyDto;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashL0 extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashL0> CREATOR = new Creator();
        private final String accountNumber;
        private final SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashL0> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL0 createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto = (SplashL0ResponseMetadataDto.AccountTypeInCopyDto) parcel.readParcelable(SplashL0.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new SplashL0(string2, accountTypeInCopyDto, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL0[] newArray(int i) {
                return new SplashL0[i];
            }
        }

        public static /* synthetic */ SplashL0 copy$default(SplashL0 splashL0, String str, SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = splashL0.accountNumber;
            }
            if ((i & 2) != 0) {
                accountTypeInCopyDto = splashL0.accountTypeInCopy;
            }
            if ((i & 4) != 0) {
                z = splashL0.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z2 = splashL0.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z3 = splashL0.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = splashL0.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = splashL0.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z3;
            boolean z5 = z;
            return splashL0.copy(str, accountTypeInCopyDto, z5, z2, z4, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final SplashL0ResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashL0 copy(String accountNumber, SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashL0(accountNumber, accountTypeInCopy, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplashL0)) {
                return false;
            }
            SplashL0 splashL0 = (SplashL0) other;
            return Intrinsics.areEqual(this.accountNumber, splashL0.accountNumber) && this.accountTypeInCopy == splashL0.accountTypeInCopy && this.isCheckpoint == splashL0.isCheckpoint && this.shouldLiveInBackstack == splashL0.shouldLiveInBackstack && this.shouldClearBackstack == splashL0.shouldClearBackstack && this.onboardingProgress == splashL0.onboardingProgress && Intrinsics.areEqual(this.screenId, splashL0.screenId);
        }

        public int hashCode() {
            return (((((((((((this.accountNumber.hashCode() * 31) + this.accountTypeInCopy.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "SplashL0(accountNumber=" + this.accountNumber + ", accountTypeInCopy=" + this.accountTypeInCopy + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.accountTypeInCopy, flags);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SplashL0ResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashL0(String accountNumber, SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.accountTypeInCopy = accountTypeInCopy;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\r\u0010\u001e\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "accountTypeInCopy", "Loptions_product/service/SplashL2ResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SplashL2AccountTypeInCopy;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Loptions_product/service/SplashL2ResponseMetadataDto$AccountTypeInCopyDto;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountTypeInCopy", "()Loptions_product/service/SplashL2ResponseMetadataDto$AccountTypeInCopyDto;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashL2 extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashL2> CREATOR = new Creator();
        private final String accountNumber;
        private final SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL2 createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto = (SplashL2ResponseMetadataDto.AccountTypeInCopyDto) parcel.readParcelable(SplashL2.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new SplashL2(string2, accountTypeInCopyDto, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL2[] newArray(int i) {
                return new SplashL2[i];
            }
        }

        public static /* synthetic */ SplashL2 copy$default(SplashL2 splashL2, String str, SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = splashL2.accountNumber;
            }
            if ((i & 2) != 0) {
                accountTypeInCopyDto = splashL2.accountTypeInCopy;
            }
            if ((i & 4) != 0) {
                z = splashL2.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z2 = splashL2.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z3 = splashL2.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = splashL2.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = splashL2.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z3;
            boolean z5 = z;
            return splashL2.copy(str, accountTypeInCopyDto, z5, z2, z4, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final SplashL2ResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashL2 copy(String accountNumber, SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashL2(accountNumber, accountTypeInCopy, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplashL2)) {
                return false;
            }
            SplashL2 splashL2 = (SplashL2) other;
            return Intrinsics.areEqual(this.accountNumber, splashL2.accountNumber) && this.accountTypeInCopy == splashL2.accountTypeInCopy && this.isCheckpoint == splashL2.isCheckpoint && this.shouldLiveInBackstack == splashL2.shouldLiveInBackstack && this.shouldClearBackstack == splashL2.shouldClearBackstack && this.onboardingProgress == splashL2.onboardingProgress && Intrinsics.areEqual(this.screenId, splashL2.screenId);
        }

        public int hashCode() {
            return (((((((((((this.accountNumber.hashCode() * 31) + this.accountTypeInCopy.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "SplashL2(accountNumber=" + this.accountNumber + ", accountTypeInCopy=" + this.accountTypeInCopy + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.accountTypeInCopy, flags);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SplashL2ResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashL2(String accountNumber, SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.accountTypeInCopy = accountTypeInCopy;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashRetirement;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashRetirement extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashRetirement> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashRetirement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashRetirement createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new SplashRetirement(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashRetirement[] newArray(int i) {
                return new SplashRetirement[i];
            }
        }

        public static /* synthetic */ SplashRetirement copy$default(SplashRetirement splashRetirement, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = splashRetirement.accountNumber;
            }
            if ((i & 2) != 0) {
                z = splashRetirement.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = splashRetirement.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = splashRetirement.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = splashRetirement.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = splashRetirement.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return splashRetirement.copy(str, z, z2, z3, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashRetirement copy(String accountNumber, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashRetirement(accountNumber, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplashRetirement)) {
                return false;
            }
            SplashRetirement splashRetirement = (SplashRetirement) other;
            return Intrinsics.areEqual(this.accountNumber, splashRetirement.accountNumber) && this.isCheckpoint == splashRetirement.isCheckpoint && this.shouldLiveInBackstack == splashRetirement.shouldLiveInBackstack && this.shouldClearBackstack == splashRetirement.shouldClearBackstack && this.onboardingProgress == splashRetirement.onboardingProgress && Intrinsics.areEqual(this.screenId, splashRetirement.screenId);
        }

        public int hashCode() {
            return (((((((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "SplashRetirement(accountNumber=" + this.accountNumber + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashRetirement(String accountNumber, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionOptionExperience;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionOptionExperience extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionOptionExperience> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionOptionExperience> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionOptionExperience createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new QuestionOptionExperience(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionOptionExperience[] newArray(int i) {
                return new QuestionOptionExperience[i];
            }
        }

        public static /* synthetic */ QuestionOptionExperience copy$default(QuestionOptionExperience questionOptionExperience, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionOptionExperience.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = questionOptionExperience.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = questionOptionExperience.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = questionOptionExperience.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = questionOptionExperience.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return questionOptionExperience.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionOptionExperience copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionOptionExperience(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionOptionExperience)) {
                return false;
            }
            QuestionOptionExperience questionOptionExperience = (QuestionOptionExperience) other;
            return this.isCheckpoint == questionOptionExperience.isCheckpoint && this.shouldLiveInBackstack == questionOptionExperience.shouldLiveInBackstack && this.shouldClearBackstack == questionOptionExperience.shouldClearBackstack && this.onboardingProgress == questionOptionExperience.onboardingProgress && Intrinsics.areEqual(this.screenId, questionOptionExperience.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionOptionExperience(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionOptionExperience(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionUnderstandSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionUnderstandSpread extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionUnderstandSpread> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionUnderstandSpread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionUnderstandSpread createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new QuestionUnderstandSpread(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionUnderstandSpread[] newArray(int i) {
                return new QuestionUnderstandSpread[i];
            }
        }

        public static /* synthetic */ QuestionUnderstandSpread copy$default(QuestionUnderstandSpread questionUnderstandSpread, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionUnderstandSpread.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = questionUnderstandSpread.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = questionUnderstandSpread.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = questionUnderstandSpread.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = questionUnderstandSpread.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return questionUnderstandSpread.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionUnderstandSpread copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionUnderstandSpread(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionUnderstandSpread)) {
                return false;
            }
            QuestionUnderstandSpread questionUnderstandSpread = (QuestionUnderstandSpread) other;
            return this.isCheckpoint == questionUnderstandSpread.isCheckpoint && this.shouldLiveInBackstack == questionUnderstandSpread.shouldLiveInBackstack && this.shouldClearBackstack == questionUnderstandSpread.shouldClearBackstack && this.onboardingProgress == questionUnderstandSpread.onboardingProgress && Intrinsics.areEqual(this.screenId, questionUnderstandSpread.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionUnderstandSpread(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionUnderstandSpread(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionInvestmentAdvice;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionInvestmentAdvice extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionInvestmentAdvice> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionInvestmentAdvice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionInvestmentAdvice createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new QuestionInvestmentAdvice(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionInvestmentAdvice[] newArray(int i) {
                return new QuestionInvestmentAdvice[i];
            }
        }

        public static /* synthetic */ QuestionInvestmentAdvice copy$default(QuestionInvestmentAdvice questionInvestmentAdvice, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionInvestmentAdvice.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = questionInvestmentAdvice.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = questionInvestmentAdvice.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = questionInvestmentAdvice.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = questionInvestmentAdvice.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return questionInvestmentAdvice.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionInvestmentAdvice copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionInvestmentAdvice(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionInvestmentAdvice)) {
                return false;
            }
            QuestionInvestmentAdvice questionInvestmentAdvice = (QuestionInvestmentAdvice) other;
            return this.isCheckpoint == questionInvestmentAdvice.isCheckpoint && this.shouldLiveInBackstack == questionInvestmentAdvice.shouldLiveInBackstack && this.shouldClearBackstack == questionInvestmentAdvice.shouldClearBackstack && this.onboardingProgress == questionInvestmentAdvice.onboardingProgress && Intrinsics.areEqual(this.screenId, questionInvestmentAdvice.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionInvestmentAdvice(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionInvestmentAdvice(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$QuestionFinancialRegulator;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionFinancialRegulator extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionFinancialRegulator> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionFinancialRegulator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionFinancialRegulator createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new QuestionFinancialRegulator(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionFinancialRegulator[] newArray(int i) {
                return new QuestionFinancialRegulator[i];
            }
        }

        public static /* synthetic */ QuestionFinancialRegulator copy$default(QuestionFinancialRegulator questionFinancialRegulator, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionFinancialRegulator.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = questionFinancialRegulator.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = questionFinancialRegulator.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = questionFinancialRegulator.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = questionFinancialRegulator.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return questionFinancialRegulator.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionFinancialRegulator copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionFinancialRegulator(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionFinancialRegulator)) {
                return false;
            }
            QuestionFinancialRegulator questionFinancialRegulator = (QuestionFinancialRegulator) other;
            return this.isCheckpoint == questionFinancialRegulator.isCheckpoint && this.shouldLiveInBackstack == questionFinancialRegulator.shouldLiveInBackstack && this.shouldClearBackstack == questionFinancialRegulator.shouldClearBackstack && this.onboardingProgress == questionFinancialRegulator.onboardingProgress && Intrinsics.areEqual(this.screenId, questionFinancialRegulator.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionFinancialRegulator(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionFinancialRegulator(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$Suitability;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "context", "", "accountNumber", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Suitability extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Suitability> CREATOR = new Creator();
        private final String accountNumber;
        private final String context;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Suitability> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Suitability(string2, string3, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability[] newArray(int i) {
                return new Suitability[i];
            }
        }

        public static /* synthetic */ Suitability copy$default(Suitability suitability, String str, String str2, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suitability.context;
            }
            if ((i & 2) != 0) {
                str2 = suitability.accountNumber;
            }
            if ((i & 4) != 0) {
                z = suitability.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z2 = suitability.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z3 = suitability.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = suitability.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = suitability.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z3;
            boolean z5 = z;
            return suitability.copy(str, str2, z5, z2, z4, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Suitability copy(String context, String accountNumber, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Suitability(context, accountNumber, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suitability)) {
                return false;
            }
            Suitability suitability = (Suitability) other;
            return Intrinsics.areEqual(this.context, suitability.context) && Intrinsics.areEqual(this.accountNumber, suitability.accountNumber) && this.isCheckpoint == suitability.isCheckpoint && this.shouldLiveInBackstack == suitability.shouldLiveInBackstack && this.shouldClearBackstack == suitability.shouldClearBackstack && this.onboardingProgress == suitability.onboardingProgress && Intrinsics.areEqual(this.screenId, suitability.screenId);
        }

        public int hashCode() {
            return (((((((((((this.context.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Suitability(context=" + this.context + ", accountNumber=" + this.accountNumber + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.context);
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getContext() {
            return this.context;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Suitability(String context, String accountNumber, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.context = context;
            this.accountNumber = accountNumber;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$InvestmentProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "context", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getContext", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvestmentProfile extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestmentProfile> CREATOR = new Creator();
        private final String accountNumber;
        private final String context;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InvestmentProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentProfile createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new InvestmentProfile(string2, string3, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentProfile[] newArray(int i) {
                return new InvestmentProfile[i];
            }
        }

        public static /* synthetic */ InvestmentProfile copy$default(InvestmentProfile investmentProfile, String str, String str2, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investmentProfile.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = investmentProfile.context;
            }
            if ((i & 4) != 0) {
                z = investmentProfile.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z2 = investmentProfile.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z3 = investmentProfile.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = investmentProfile.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = investmentProfile.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z3;
            boolean z5 = z;
            return investmentProfile.copy(str, str2, z5, z2, z4, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final InvestmentProfile copy(String accountNumber, String context, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new InvestmentProfile(accountNumber, context, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvestmentProfile)) {
                return false;
            }
            InvestmentProfile investmentProfile = (InvestmentProfile) other;
            return Intrinsics.areEqual(this.accountNumber, investmentProfile.accountNumber) && Intrinsics.areEqual(this.context, investmentProfile.context) && this.isCheckpoint == investmentProfile.isCheckpoint && this.shouldLiveInBackstack == investmentProfile.shouldLiveInBackstack && this.shouldClearBackstack == investmentProfile.shouldClearBackstack && this.onboardingProgress == investmentProfile.onboardingProgress && Intrinsics.areEqual(this.screenId, investmentProfile.screenId);
        }

        public int hashCode() {
            return (((((((((((this.accountNumber.hashCode() * 31) + this.context.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "InvestmentProfile(accountNumber=" + this.accountNumber + ", context=" + this.context + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.context);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getContext() {
            return this.context;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvestmentProfile(String accountNumber, String context, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.context = context;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$Disclosure;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "title", "", "type", "agreementContext", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getTitle", "()Ljava/lang/String;", "getType", "getAgreementContext", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disclosure extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Disclosure> CREATOR = new Creator();
        private final String agreementContext;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final String title;
        private final String type;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Disclosure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Disclosure(string2, string3, string4, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure[] newArray(int i) {
                return new Disclosure[i];
            }
        }

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, String str2, String str3, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclosure.title;
            }
            if ((i & 2) != 0) {
                str2 = disclosure.type;
            }
            if ((i & 4) != 0) {
                str3 = disclosure.agreementContext;
            }
            if ((i & 8) != 0) {
                z = disclosure.isCheckpoint;
            }
            if ((i & 16) != 0) {
                z2 = disclosure.shouldLiveInBackstack;
            }
            if ((i & 32) != 0) {
                z3 = disclosure.shouldClearBackstack;
            }
            if ((i & 64) != 0) {
                optionOnboardingProgress = disclosure.onboardingProgress;
            }
            if ((i & 128) != 0) {
                uuid = disclosure.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z2;
            boolean z5 = z3;
            return disclosure.copy(str, str2, str3, z, z4, z5, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementContext() {
            return this.agreementContext;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component8, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Disclosure copy(String title, String type2, String agreementContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(agreementContext, "agreementContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Disclosure(title, type2, agreementContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclosure)) {
                return false;
            }
            Disclosure disclosure = (Disclosure) other;
            return Intrinsics.areEqual(this.title, disclosure.title) && Intrinsics.areEqual(this.type, disclosure.type) && Intrinsics.areEqual(this.agreementContext, disclosure.agreementContext) && this.isCheckpoint == disclosure.isCheckpoint && this.shouldLiveInBackstack == disclosure.shouldLiveInBackstack && this.shouldClearBackstack == disclosure.shouldClearBackstack && this.onboardingProgress == disclosure.onboardingProgress && Intrinsics.areEqual(this.screenId, disclosure.screenId);
        }

        public int hashCode() {
            return (((((((((((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.agreementContext.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Disclosure(title=" + this.title + ", type=" + this.type + ", agreementContext=" + this.agreementContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.type);
            dest.writeString(this.agreementContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public final String getAgreementContext() {
            return this.agreementContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosure(String title, String type2, String agreementContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(agreementContext, "agreementContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.title = title;
            this.type = type2;
            this.agreementContext = agreementContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\r\u0010$\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\r\u0010%\u001a\u00060\tj\u0002`\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003J\t\u0010+\u001a\u00020\u0013HÆ\u0003Jk\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "accountTypeInCopy", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/ApprovedTradesAccountTypeInCopy;", "optionLevel", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "Lcom/robinhood/android/optionsupgrade/ApprovedTradesOptionLevel;", "isFromSdp", "", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;ZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountTypeInCopy", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "getOptionLevel", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApprovedTrades extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ApprovedTrades> CREATOR = new Creator();
        private final String accountNumber;
        private final ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy;
        private final boolean isCheckpoint;
        private final boolean isFromSdp;
        private final OptionOnboardingProgress onboardingProgress;
        private final ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApprovedTrades createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto = (ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto) parcel.readParcelable(ApprovedTrades.class.getClassLoader());
                ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevelDto = (ApprovedTradesResponseMetadataDto.OptionLevelDto) parcel.readParcelable(ApprovedTrades.class.getClassLoader());
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new ApprovedTrades(string2, accountTypeInCopyDto, optionLevelDto, z4, z5, z2, z3, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApprovedTrades[] newArray(int i) {
                return new ApprovedTrades[i];
            }
        }

        public static /* synthetic */ ApprovedTrades copy$default(ApprovedTrades approvedTrades, String str, ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto, ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevelDto, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approvedTrades.accountNumber;
            }
            if ((i & 2) != 0) {
                accountTypeInCopyDto = approvedTrades.accountTypeInCopy;
            }
            if ((i & 4) != 0) {
                optionLevelDto = approvedTrades.optionLevel;
            }
            if ((i & 8) != 0) {
                z = approvedTrades.isFromSdp;
            }
            if ((i & 16) != 0) {
                z2 = approvedTrades.isCheckpoint;
            }
            if ((i & 32) != 0) {
                z3 = approvedTrades.shouldLiveInBackstack;
            }
            if ((i & 64) != 0) {
                z4 = approvedTrades.shouldClearBackstack;
            }
            if ((i & 128) != 0) {
                optionOnboardingProgress = approvedTrades.onboardingProgress;
            }
            if ((i & 256) != 0) {
                uuid = approvedTrades.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z5 = z3;
            boolean z6 = z4;
            boolean z7 = z2;
            ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevelDto2 = optionLevelDto;
            return approvedTrades.copy(str, accountTypeInCopyDto, optionLevelDto2, z, z7, z5, z6, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        /* renamed from: component3, reason: from getter */
        public final ApprovedTradesResponseMetadataDto.OptionLevelDto getOptionLevel() {
            return this.optionLevel;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFromSdp() {
            return this.isFromSdp;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component9, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final ApprovedTrades copy(String accountNumber, ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel, boolean isFromSdp, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new ApprovedTrades(accountNumber, accountTypeInCopy, optionLevel, isFromSdp, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApprovedTrades)) {
                return false;
            }
            ApprovedTrades approvedTrades = (ApprovedTrades) other;
            return Intrinsics.areEqual(this.accountNumber, approvedTrades.accountNumber) && this.accountTypeInCopy == approvedTrades.accountTypeInCopy && this.optionLevel == approvedTrades.optionLevel && this.isFromSdp == approvedTrades.isFromSdp && this.isCheckpoint == approvedTrades.isCheckpoint && this.shouldLiveInBackstack == approvedTrades.shouldLiveInBackstack && this.shouldClearBackstack == approvedTrades.shouldClearBackstack && this.onboardingProgress == approvedTrades.onboardingProgress && Intrinsics.areEqual(this.screenId, approvedTrades.screenId);
        }

        public int hashCode() {
            return (((((((((((((((this.accountNumber.hashCode() * 31) + this.accountTypeInCopy.hashCode()) * 31) + this.optionLevel.hashCode()) * 31) + Boolean.hashCode(this.isFromSdp)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "ApprovedTrades(accountNumber=" + this.accountNumber + ", accountTypeInCopy=" + this.accountTypeInCopy + ", optionLevel=" + this.optionLevel + ", isFromSdp=" + this.isFromSdp + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.accountTypeInCopy, flags);
            dest.writeParcelable(this.optionLevel, flags);
            dest.writeInt(this.isFromSdp ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        public final ApprovedTradesResponseMetadataDto.OptionLevelDto getOptionLevel() {
            return this.optionLevel;
        }

        public final boolean isFromSdp() {
            return this.isFromSdp;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApprovedTrades(String accountNumber, ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z2, z3, z4, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.accountTypeInCopy = accountTypeInCopy;
            this.optionLevel = optionLevel;
            this.isFromSdp = z;
            this.isCheckpoint = z2;
            this.shouldLiveInBackstack = z3;
            this.shouldClearBackstack = z4;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\r\u0010#\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\r\u0010$\u001a\u00060\tj\u0002`\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0012HÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0004HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$Success;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "accountTypeInCopy", "Loptions_product/service/SuccessResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SuccessAccountTypeInCopy;", "upgradeFlow", "Loptions_product/service/SuccessResponseMetadataDto$UpgradeFlowDto;", "Lcom/robinhood/android/optionsupgrade/SuccessUpgradeFlow;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Loptions_product/service/SuccessResponseMetadataDto$AccountTypeInCopyDto;Loptions_product/service/SuccessResponseMetadataDto$UpgradeFlowDto;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountTypeInCopy", "()Loptions_product/service/SuccessResponseMetadataDto$AccountTypeInCopyDto;", "getUpgradeFlow", "()Loptions_product/service/SuccessResponseMetadataDto$UpgradeFlowDto;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String accountNumber;
        private final SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy;
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final SuccessResponseMetadataDto.UpgradeFlowDto upgradeFlow;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto = (SuccessResponseMetadataDto.AccountTypeInCopyDto) parcel.readParcelable(Success.class.getClassLoader());
                SuccessResponseMetadataDto.UpgradeFlowDto upgradeFlowDto = (SuccessResponseMetadataDto.UpgradeFlowDto) parcel.readParcelable(Success.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Success(string2, accountTypeInCopyDto, upgradeFlowDto, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public static /* synthetic */ Success copy$default(Success success, String str, SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto, SuccessResponseMetadataDto.UpgradeFlowDto upgradeFlowDto, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.accountNumber;
            }
            if ((i & 2) != 0) {
                accountTypeInCopyDto = success.accountTypeInCopy;
            }
            if ((i & 4) != 0) {
                upgradeFlowDto = success.upgradeFlow;
            }
            if ((i & 8) != 0) {
                z = success.isCheckpoint;
            }
            if ((i & 16) != 0) {
                z2 = success.shouldLiveInBackstack;
            }
            if ((i & 32) != 0) {
                z3 = success.shouldClearBackstack;
            }
            if ((i & 64) != 0) {
                optionOnboardingProgress = success.onboardingProgress;
            }
            if ((i & 128) != 0) {
                uuid = success.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z2;
            boolean z5 = z3;
            return success.copy(str, accountTypeInCopyDto, upgradeFlowDto, z, z4, z5, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final SuccessResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        /* renamed from: component3, reason: from getter */
        public final SuccessResponseMetadataDto.UpgradeFlowDto getUpgradeFlow() {
            return this.upgradeFlow;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component8, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Success copy(String accountNumber, SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, SuccessResponseMetadataDto.UpgradeFlowDto upgradeFlow, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(upgradeFlow, "upgradeFlow");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Success(accountNumber, accountTypeInCopy, upgradeFlow, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.accountNumber, success.accountNumber) && this.accountTypeInCopy == success.accountTypeInCopy && this.upgradeFlow == success.upgradeFlow && this.isCheckpoint == success.isCheckpoint && this.shouldLiveInBackstack == success.shouldLiveInBackstack && this.shouldClearBackstack == success.shouldClearBackstack && this.onboardingProgress == success.onboardingProgress && Intrinsics.areEqual(this.screenId, success.screenId);
        }

        public int hashCode() {
            return (((((((((((((this.accountNumber.hashCode() * 31) + this.accountTypeInCopy.hashCode()) * 31) + this.upgradeFlow.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Success(accountNumber=" + this.accountNumber + ", accountTypeInCopy=" + this.accountTypeInCopy + ", upgradeFlow=" + this.upgradeFlow + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.accountTypeInCopy, flags);
            dest.writeParcelable(this.upgradeFlow, flags);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SuccessResponseMetadataDto.AccountTypeInCopyDto getAccountTypeInCopy() {
            return this.accountTypeInCopy;
        }

        public final SuccessResponseMetadataDto.UpgradeFlowDto getUpgradeFlow() {
            return this.upgradeFlow;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String accountNumber, SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, SuccessResponseMetadataDto.UpgradeFlowDto upgradeFlow, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
            Intrinsics.checkNotNullParameter(upgradeFlow, "upgradeFlow");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.accountTypeInCopy = accountTypeInCopy;
            this.upgradeFlow = upgradeFlow;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010!\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003Jm\u0010*\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$Failure;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "failureType", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "Lcom/robinhood/android/optionsupgrade/FailureType;", "messageOverride", "", "primaryCtaDeeplinkAction", "primaryCtaMessageOverride", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getFailureType", "()Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "getMessageOverride", "()Ljava/lang/String;", "getPrimaryCtaDeeplinkAction", "getPrimaryCtaMessageOverride", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final FailureResponseMetadataDto.FailureTypeDto failureType;
        private final boolean isCheckpoint;
        private final String messageOverride;
        private final OptionOnboardingProgress onboardingProgress;
        private final String primaryCtaDeeplinkAction;
        private final String primaryCtaMessageOverride;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                FailureResponseMetadataDto.FailureTypeDto failureTypeDto = (FailureResponseMetadataDto.FailureTypeDto) parcel.readParcelable(Failure.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Failure(failureTypeDto, string2, string3, string4, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        public static /* synthetic */ Failure copy$default(Failure failure, FailureResponseMetadataDto.FailureTypeDto failureTypeDto, String str, String str2, String str3, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                failureTypeDto = failure.failureType;
            }
            if ((i & 2) != 0) {
                str = failure.messageOverride;
            }
            if ((i & 4) != 0) {
                str2 = failure.primaryCtaDeeplinkAction;
            }
            if ((i & 8) != 0) {
                str3 = failure.primaryCtaMessageOverride;
            }
            if ((i & 16) != 0) {
                z = failure.isCheckpoint;
            }
            if ((i & 32) != 0) {
                z2 = failure.shouldLiveInBackstack;
            }
            if ((i & 64) != 0) {
                z3 = failure.shouldClearBackstack;
            }
            if ((i & 128) != 0) {
                optionOnboardingProgress = failure.onboardingProgress;
            }
            if ((i & 256) != 0) {
                uuid = failure.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z4 = z2;
            boolean z5 = z3;
            boolean z6 = z;
            String str4 = str2;
            return failure.copy(failureTypeDto, str, str4, str3, z6, z4, z5, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final FailureResponseMetadataDto.FailureTypeDto getFailureType() {
            return this.failureType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessageOverride() {
            return this.messageOverride;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryCtaDeeplinkAction() {
            return this.primaryCtaDeeplinkAction;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimaryCtaMessageOverride() {
            return this.primaryCtaMessageOverride;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component9, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Failure copy(FailureResponseMetadataDto.FailureTypeDto failureType, String messageOverride, String primaryCtaDeeplinkAction, String primaryCtaMessageOverride, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(failureType, "failureType");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Failure(failureType, messageOverride, primaryCtaDeeplinkAction, primaryCtaMessageOverride, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.failureType == failure.failureType && Intrinsics.areEqual(this.messageOverride, failure.messageOverride) && Intrinsics.areEqual(this.primaryCtaDeeplinkAction, failure.primaryCtaDeeplinkAction) && Intrinsics.areEqual(this.primaryCtaMessageOverride, failure.primaryCtaMessageOverride) && this.isCheckpoint == failure.isCheckpoint && this.shouldLiveInBackstack == failure.shouldLiveInBackstack && this.shouldClearBackstack == failure.shouldClearBackstack && this.onboardingProgress == failure.onboardingProgress && Intrinsics.areEqual(this.screenId, failure.screenId);
        }

        public int hashCode() {
            int iHashCode = this.failureType.hashCode() * 31;
            String str = this.messageOverride;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.primaryCtaDeeplinkAction;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.primaryCtaMessageOverride;
            return ((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Failure(failureType=" + this.failureType + ", messageOverride=" + this.messageOverride + ", primaryCtaDeeplinkAction=" + this.primaryCtaDeeplinkAction + ", primaryCtaMessageOverride=" + this.primaryCtaMessageOverride + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.failureType, flags);
            dest.writeString(this.messageOverride);
            dest.writeString(this.primaryCtaDeeplinkAction);
            dest.writeString(this.primaryCtaMessageOverride);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final FailureResponseMetadataDto.FailureTypeDto getFailureType() {
            return this.failureType;
        }

        public final String getMessageOverride() {
            return this.messageOverride;
        }

        public final String getPrimaryCtaDeeplinkAction() {
            return this.primaryCtaDeeplinkAction;
        }

        public final String getPrimaryCtaMessageOverride() {
            return this.primaryCtaMessageOverride;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(FailureResponseMetadataDto.FailureTypeDto failureType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(failureType, "failureType");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.failureType = failureType;
            this.messageOverride = str;
            this.primaryCtaDeeplinkAction = str2;
            this.primaryCtaMessageOverride = str3;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationSpread extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EducationSpread> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EducationSpread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationSpread createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new EducationSpread(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationSpread[] newArray(int i) {
                return new EducationSpread[i];
            }
        }

        public static /* synthetic */ EducationSpread copy$default(EducationSpread educationSpread, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = educationSpread.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = educationSpread.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = educationSpread.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = educationSpread.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = educationSpread.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return educationSpread.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final EducationSpread copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new EducationSpread(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationSpread)) {
                return false;
            }
            EducationSpread educationSpread = (EducationSpread) other;
            return this.isCheckpoint == educationSpread.isCheckpoint && this.shouldLiveInBackstack == educationSpread.shouldLiveInBackstack && this.shouldClearBackstack == educationSpread.shouldClearBackstack && this.onboardingProgress == educationSpread.onboardingProgress && Intrinsics.areEqual(this.screenId, educationSpread.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "EducationSpread(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationSpread(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationL3Strategies;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationL3Strategies extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EducationL3Strategies> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EducationL3Strategies> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationL3Strategies createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new EducationL3Strategies(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationL3Strategies[] newArray(int i) {
                return new EducationL3Strategies[i];
            }
        }

        public static /* synthetic */ EducationL3Strategies copy$default(EducationL3Strategies educationL3Strategies, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = educationL3Strategies.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = educationL3Strategies.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = educationL3Strategies.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = educationL3Strategies.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = educationL3Strategies.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return educationL3Strategies.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final EducationL3Strategies copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new EducationL3Strategies(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationL3Strategies)) {
                return false;
            }
            EducationL3Strategies educationL3Strategies = (EducationL3Strategies) other;
            return this.isCheckpoint == educationL3Strategies.isCheckpoint && this.shouldLiveInBackstack == educationL3Strategies.shouldLiveInBackstack && this.shouldClearBackstack == educationL3Strategies.shouldClearBackstack && this.onboardingProgress == educationL3Strategies.onboardingProgress && Intrinsics.areEqual(this.screenId, educationL3Strategies.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "EducationL3Strategies(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationL3Strategies(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$ReadyL3Upgrade;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReadyL3Upgrade extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ReadyL3Upgrade> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReadyL3Upgrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadyL3Upgrade createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new ReadyL3Upgrade(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadyL3Upgrade[] newArray(int i) {
                return new ReadyL3Upgrade[i];
            }
        }

        public static /* synthetic */ ReadyL3Upgrade copy$default(ReadyL3Upgrade readyL3Upgrade, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = readyL3Upgrade.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = readyL3Upgrade.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = readyL3Upgrade.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = readyL3Upgrade.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = readyL3Upgrade.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return readyL3Upgrade.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final ReadyL3Upgrade copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new ReadyL3Upgrade(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadyL3Upgrade)) {
                return false;
            }
            ReadyL3Upgrade readyL3Upgrade = (ReadyL3Upgrade) other;
            return this.isCheckpoint == readyL3Upgrade.isCheckpoint && this.shouldLiveInBackstack == readyL3Upgrade.shouldLiveInBackstack && this.shouldClearBackstack == readyL3Upgrade.shouldClearBackstack && this.onboardingProgress == readyL3Upgrade.onboardingProgress && Intrinsics.areEqual(this.screenId, readyL3Upgrade.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "ReadyL3Upgrade(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyL3Upgrade(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAlert;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "isPostEnablementMember", "", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;ZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getStyle", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellAlert extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellAlert> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final boolean isPostEnablementMember;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final OptionOnboardingStyles style;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAlert createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionOnboardingStyles optionOnboardingStylesValueOf = OptionOnboardingStyles.valueOf(parcel.readString());
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new UpsellAlert(optionOnboardingStylesValueOf, z4, z5, z2, z3, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAlert[] newArray(int i) {
                return new UpsellAlert[i];
            }
        }

        public static /* synthetic */ UpsellAlert copy$default(UpsellAlert upsellAlert, OptionOnboardingStyles optionOnboardingStyles, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                optionOnboardingStyles = upsellAlert.style;
            }
            if ((i & 2) != 0) {
                z = upsellAlert.isPostEnablementMember;
            }
            if ((i & 4) != 0) {
                z2 = upsellAlert.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z3 = upsellAlert.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z4 = upsellAlert.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = upsellAlert.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = upsellAlert.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z5 = z4;
            boolean z6 = z2;
            return upsellAlert.copy(optionOnboardingStyles, z, z6, z3, z5, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UpsellAlert copy(OptionOnboardingStyles style, boolean isPostEnablementMember, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellAlert(style, isPostEnablementMember, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpsellAlert)) {
                return false;
            }
            UpsellAlert upsellAlert = (UpsellAlert) other;
            return this.style == upsellAlert.style && this.isPostEnablementMember == upsellAlert.isPostEnablementMember && this.isCheckpoint == upsellAlert.isCheckpoint && this.shouldLiveInBackstack == upsellAlert.shouldLiveInBackstack && this.shouldClearBackstack == upsellAlert.shouldClearBackstack && this.onboardingProgress == upsellAlert.onboardingProgress && Intrinsics.areEqual(this.screenId, upsellAlert.screenId);
        }

        public int hashCode() {
            return (((((((((((this.style.hashCode() * 31) + Boolean.hashCode(this.isPostEnablementMember)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellAlert(style=" + this.style + ", isPostEnablementMember=" + this.isPostEnablementMember + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.style.name());
            dest.writeInt(this.isPostEnablementMember ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        public final boolean isPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellAlert(OptionOnboardingStyles style, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z2, z3, z4, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.style = style;
            this.isPostEnablementMember = z;
            this.isCheckpoint = z2;
            this.shouldLiveInBackstack = z3;
            this.shouldClearBackstack = z4;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellTradeOnExpiration;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "accountNumber", "", "isPostEnablementMember", "", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;Ljava/lang/String;ZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getStyle", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellTradeOnExpiration extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellTradeOnExpiration> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isCheckpoint;
        private final boolean isPostEnablementMember;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final OptionOnboardingStyles style;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellTradeOnExpiration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellTradeOnExpiration createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionOnboardingStyles optionOnboardingStylesValueOf = OptionOnboardingStyles.valueOf(parcel.readString());
                String string2 = parcel.readString();
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new UpsellTradeOnExpiration(optionOnboardingStylesValueOf, string2, z4, z5, z2, z3, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellTradeOnExpiration[] newArray(int i) {
                return new UpsellTradeOnExpiration[i];
            }
        }

        public static /* synthetic */ UpsellTradeOnExpiration copy$default(UpsellTradeOnExpiration upsellTradeOnExpiration, OptionOnboardingStyles optionOnboardingStyles, String str, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                optionOnboardingStyles = upsellTradeOnExpiration.style;
            }
            if ((i & 2) != 0) {
                str = upsellTradeOnExpiration.accountNumber;
            }
            if ((i & 4) != 0) {
                z = upsellTradeOnExpiration.isPostEnablementMember;
            }
            if ((i & 8) != 0) {
                z2 = upsellTradeOnExpiration.isCheckpoint;
            }
            if ((i & 16) != 0) {
                z3 = upsellTradeOnExpiration.shouldLiveInBackstack;
            }
            if ((i & 32) != 0) {
                z4 = upsellTradeOnExpiration.shouldClearBackstack;
            }
            if ((i & 64) != 0) {
                optionOnboardingProgress = upsellTradeOnExpiration.onboardingProgress;
            }
            if ((i & 128) != 0) {
                uuid = upsellTradeOnExpiration.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z5 = z3;
            boolean z6 = z4;
            return upsellTradeOnExpiration.copy(optionOnboardingStyles, str, z, z2, z5, z6, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component8, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UpsellTradeOnExpiration copy(OptionOnboardingStyles style, String accountNumber, boolean isPostEnablementMember, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellTradeOnExpiration(style, accountNumber, isPostEnablementMember, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpsellTradeOnExpiration)) {
                return false;
            }
            UpsellTradeOnExpiration upsellTradeOnExpiration = (UpsellTradeOnExpiration) other;
            return this.style == upsellTradeOnExpiration.style && Intrinsics.areEqual(this.accountNumber, upsellTradeOnExpiration.accountNumber) && this.isPostEnablementMember == upsellTradeOnExpiration.isPostEnablementMember && this.isCheckpoint == upsellTradeOnExpiration.isCheckpoint && this.shouldLiveInBackstack == upsellTradeOnExpiration.shouldLiveInBackstack && this.shouldClearBackstack == upsellTradeOnExpiration.shouldClearBackstack && this.onboardingProgress == upsellTradeOnExpiration.onboardingProgress && Intrinsics.areEqual(this.screenId, upsellTradeOnExpiration.screenId);
        }

        public int hashCode() {
            return (((((((((((((this.style.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isPostEnablementMember)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellTradeOnExpiration(style=" + this.style + ", accountNumber=" + this.accountNumber + ", isPostEnablementMember=" + this.isPostEnablementMember + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.style.name());
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isPostEnablementMember ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellTradeOnExpiration(OptionOnboardingStyles style, String accountNumber, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z2, z3, z4, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.style = style;
            this.accountNumber = accountNumber;
            this.isPostEnablementMember = z;
            this.isCheckpoint = z2;
            this.shouldLiveInBackstack = z3;
            this.shouldClearBackstack = z4;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003J\t\u0010+\u001a\u00020\u0012HÆ\u0003Jo\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0014\u0010\f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAllSet;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "accountNumber", "", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "sdp", "Lcom/robinhood/android/optionsupgrade/SdpInfo;", "isPostEnablementMember", "", "isFromSdp", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;Lcom/robinhood/android/optionsupgrade/SdpInfo;ZZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getStyle", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "getSdp", "()Lcom/robinhood/android/optionsupgrade/SdpInfo;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellAllSet extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellAllSet> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isCheckpoint;
        private final boolean isFromSdp;
        private final boolean isPostEnablementMember;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final SdpInfo sdp;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final OptionOnboardingStyles style;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellAllSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAllSet createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                OptionOnboardingStyles optionOnboardingStylesValueOf = OptionOnboardingStyles.valueOf(parcel.readString());
                SdpInfo sdpInfoCreateFromParcel = parcel.readInt() == 0 ? null : SdpInfo.CREATOR.createFromParcel(parcel);
                boolean z5 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new UpsellAllSet(string2, optionOnboardingStylesValueOf, sdpInfoCreateFromParcel, z5, z6, z2, z3, z4, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAllSet[] newArray(int i) {
                return new UpsellAllSet[i];
            }
        }

        public static /* synthetic */ UpsellAllSet copy$default(UpsellAllSet upsellAllSet, String str, OptionOnboardingStyles optionOnboardingStyles, SdpInfo sdpInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upsellAllSet.accountNumber;
            }
            if ((i & 2) != 0) {
                optionOnboardingStyles = upsellAllSet.style;
            }
            if ((i & 4) != 0) {
                sdpInfo = upsellAllSet.sdp;
            }
            if ((i & 8) != 0) {
                z = upsellAllSet.isPostEnablementMember;
            }
            if ((i & 16) != 0) {
                z2 = upsellAllSet.isFromSdp;
            }
            if ((i & 32) != 0) {
                z3 = upsellAllSet.isCheckpoint;
            }
            if ((i & 64) != 0) {
                z4 = upsellAllSet.shouldLiveInBackstack;
            }
            if ((i & 128) != 0) {
                z5 = upsellAllSet.shouldClearBackstack;
            }
            if ((i & 256) != 0) {
                optionOnboardingProgress = upsellAllSet.onboardingProgress;
            }
            if ((i & 512) != 0) {
                uuid = upsellAllSet.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z6 = z4;
            boolean z7 = z5;
            boolean z8 = z2;
            boolean z9 = z3;
            return upsellAllSet.copy(str, optionOnboardingStyles, sdpInfo, z, z8, z9, z6, z7, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final SdpInfo getSdp() {
            return this.sdp;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFromSdp() {
            return this.isFromSdp;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component9, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        public final UpsellAllSet copy(String accountNumber, OptionOnboardingStyles style, SdpInfo sdp, boolean isPostEnablementMember, boolean isFromSdp, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellAllSet(accountNumber, style, sdp, isPostEnablementMember, isFromSdp, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpsellAllSet)) {
                return false;
            }
            UpsellAllSet upsellAllSet = (UpsellAllSet) other;
            return Intrinsics.areEqual(this.accountNumber, upsellAllSet.accountNumber) && this.style == upsellAllSet.style && Intrinsics.areEqual(this.sdp, upsellAllSet.sdp) && this.isPostEnablementMember == upsellAllSet.isPostEnablementMember && this.isFromSdp == upsellAllSet.isFromSdp && this.isCheckpoint == upsellAllSet.isCheckpoint && this.shouldLiveInBackstack == upsellAllSet.shouldLiveInBackstack && this.shouldClearBackstack == upsellAllSet.shouldClearBackstack && this.onboardingProgress == upsellAllSet.onboardingProgress && Intrinsics.areEqual(this.screenId, upsellAllSet.screenId);
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.style.hashCode()) * 31;
            SdpInfo sdpInfo = this.sdp;
            return ((((((((((((((iHashCode + (sdpInfo == null ? 0 : sdpInfo.hashCode())) * 31) + Boolean.hashCode(this.isPostEnablementMember)) * 31) + Boolean.hashCode(this.isFromSdp)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellAllSet(accountNumber=" + this.accountNumber + ", style=" + this.style + ", sdp=" + this.sdp + ", isPostEnablementMember=" + this.isPostEnablementMember + ", isFromSdp=" + this.isFromSdp + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.style.name());
            SdpInfo sdpInfo = this.sdp;
            if (sdpInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                sdpInfo.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isPostEnablementMember ? 1 : 0);
            dest.writeInt(this.isFromSdp ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public /* synthetic */ UpsellAllSet(String str, OptionOnboardingStyles optionOnboardingStyles, SdpInfo sdpInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, optionOnboardingStyles, (i & 4) != 0 ? null : sdpInfo, z, z2, z3, z4, z5, optionOnboardingProgress, uuid);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionOnboardingStyles getStyle() {
            return this.style;
        }

        public final SdpInfo getSdp() {
            return this.sdp;
        }

        public final boolean isPostEnablementMember() {
            return this.isPostEnablementMember;
        }

        public final boolean isFromSdp() {
            return this.isFromSdp;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellAllSet(String accountNumber, OptionOnboardingStyles style, SdpInfo sdpInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z3, z5, z4, onboardingProgress, screenId, z, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.accountNumber = accountNumber;
            this.style = style;
            this.sdp = sdpInfo;
            this.isPostEnablementMember = z;
            this.isFromSdp = z2;
            this.isCheckpoint = z3;
            this.shouldLiveInBackstack = z4;
            this.shouldClearBackstack = z5;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$End;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "postFlowDeeplink", "", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Ljava/lang/String;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getPostFlowDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class End extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<End> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String postFlowDeeplink;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<End> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new End(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End[] newArray(int i) {
                return new End[i];
            }
        }

        public static /* synthetic */ End copy$default(End end, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = end.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = end.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = end.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = end.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = end.screenId;
            }
            if ((i & 32) != 0) {
                str = end.postFlowDeeplink;
            }
            UUID uuid2 = uuid;
            String str2 = str;
            return end.copy(z, z2, z3, optionOnboardingProgress, uuid2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPostFlowDeeplink() {
            return this.postFlowDeeplink;
        }

        public final End copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, String postFlowDeeplink) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            Intrinsics.checkNotNullParameter(postFlowDeeplink, "postFlowDeeplink");
            return new End(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, postFlowDeeplink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof End)) {
                return false;
            }
            End end = (End) other;
            return this.isCheckpoint == end.isCheckpoint && this.shouldLiveInBackstack == end.shouldLiveInBackstack && this.shouldClearBackstack == end.shouldClearBackstack && this.onboardingProgress == end.onboardingProgress && Intrinsics.areEqual(this.screenId, end.screenId) && Intrinsics.areEqual(this.postFlowDeeplink, end.postFlowDeeplink);
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31) + this.postFlowDeeplink.hashCode();
        }

        public String toString() {
            return "End(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", postFlowDeeplink=" + this.postFlowDeeplink + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            dest.writeString(this.postFlowDeeplink);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final String getPostFlowDeeplink() {
            return this.postFlowDeeplink;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public End(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, String postFlowDeeplink) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            Intrinsics.checkNotNullParameter(postFlowDeeplink, "postFlowDeeplink");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.postFlowDeeplink = postFlowDeeplink;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkSplashL0 extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkSplashL0> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkSplashL0> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL0 createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkSplashL0(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL0[] newArray(int i) {
                return new UkSplashL0[i];
            }
        }

        public static /* synthetic */ UkSplashL0 copy$default(UkSplashL0 ukSplashL0, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ukSplashL0.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = ukSplashL0.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = ukSplashL0.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = ukSplashL0.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = ukSplashL0.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return ukSplashL0.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkSplashL0 copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkSplashL0(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkSplashL0)) {
                return false;
            }
            UkSplashL0 ukSplashL0 = (UkSplashL0) other;
            return this.isCheckpoint == ukSplashL0.isCheckpoint && this.shouldLiveInBackstack == ukSplashL0.shouldLiveInBackstack && this.shouldClearBackstack == ukSplashL0.shouldClearBackstack && this.onboardingProgress == ukSplashL0.onboardingProgress && Intrinsics.areEqual(this.screenId, ukSplashL0.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkSplashL0(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkSplashL0(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefits;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "microgramPageId", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getMicrogramPageId", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationBenefits extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationBenefits> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final String microgramPageId;
        private final OptionOnboardingProgress onboardingProgress;
        private final ProgressBarData progressBarData;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationBenefits> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefits createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkEducationBenefits(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefits[] newArray(int i) {
                return new UkEducationBenefits[i];
            }
        }

        public static /* synthetic */ UkEducationBenefits copy$default(UkEducationBenefits ukEducationBenefits, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukEducationBenefits.microgramPageId;
            }
            if ((i & 2) != 0) {
                z = ukEducationBenefits.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukEducationBenefits.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukEducationBenefits.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukEducationBenefits.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukEducationBenefits.screenId;
            }
            if ((i & 64) != 0) {
                progressBarData = ukEducationBenefits.progressBarData;
            }
            UUID uuid2 = uuid;
            ProgressBarData progressBarData2 = progressBarData;
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            boolean z4 = z2;
            return ukEducationBenefits.copy(str, z, z4, z3, optionOnboardingProgress2, uuid2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component7, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final UkEducationBenefits copy(String microgramPageId, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationBenefits(microgramPageId, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, progressBarData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkEducationBenefits)) {
                return false;
            }
            UkEducationBenefits ukEducationBenefits = (UkEducationBenefits) other;
            return Intrinsics.areEqual(this.microgramPageId, ukEducationBenefits.microgramPageId) && this.isCheckpoint == ukEducationBenefits.isCheckpoint && this.shouldLiveInBackstack == ukEducationBenefits.shouldLiveInBackstack && this.shouldClearBackstack == ukEducationBenefits.shouldClearBackstack && this.onboardingProgress == ukEducationBenefits.onboardingProgress && Intrinsics.areEqual(this.screenId, ukEducationBenefits.screenId) && Intrinsics.areEqual(this.progressBarData, ukEducationBenefits.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.microgramPageId.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "UkEducationBenefits(microgramPageId=" + this.microgramPageId + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.microgramPageId);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationBenefits(String microgramPageId, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.microgramPageId = microgramPageId;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.progressBarData = progressBarData;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationRisks;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "microgramPageId", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getMicrogramPageId", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationRisks extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationRisks> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final String microgramPageId;
        private final OptionOnboardingProgress onboardingProgress;
        private final ProgressBarData progressBarData;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationRisks> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationRisks createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkEducationRisks(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationRisks[] newArray(int i) {
                return new UkEducationRisks[i];
            }
        }

        public static /* synthetic */ UkEducationRisks copy$default(UkEducationRisks ukEducationRisks, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukEducationRisks.microgramPageId;
            }
            if ((i & 2) != 0) {
                z = ukEducationRisks.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukEducationRisks.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukEducationRisks.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukEducationRisks.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukEducationRisks.screenId;
            }
            if ((i & 64) != 0) {
                progressBarData = ukEducationRisks.progressBarData;
            }
            UUID uuid2 = uuid;
            ProgressBarData progressBarData2 = progressBarData;
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            boolean z4 = z2;
            return ukEducationRisks.copy(str, z, z4, z3, optionOnboardingProgress2, uuid2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component7, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final UkEducationRisks copy(String microgramPageId, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationRisks(microgramPageId, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, progressBarData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkEducationRisks)) {
                return false;
            }
            UkEducationRisks ukEducationRisks = (UkEducationRisks) other;
            return Intrinsics.areEqual(this.microgramPageId, ukEducationRisks.microgramPageId) && this.isCheckpoint == ukEducationRisks.isCheckpoint && this.shouldLiveInBackstack == ukEducationRisks.shouldLiveInBackstack && this.shouldClearBackstack == ukEducationRisks.shouldClearBackstack && this.onboardingProgress == ukEducationRisks.onboardingProgress && Intrinsics.areEqual(this.screenId, ukEducationRisks.screenId) && Intrinsics.areEqual(this.progressBarData, ukEducationRisks.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.microgramPageId.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "UkEducationRisks(microgramPageId=" + this.microgramPageId + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.microgramPageId);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationRisks(String microgramPageId, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.microgramPageId = microgramPageId;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.progressBarData = progressBarData;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "productContext", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getProductContext", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkInvestorProfile extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkInvestorProfile> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String productContext;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkInvestorProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkInvestorProfile createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkInvestorProfile(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkInvestorProfile[] newArray(int i) {
                return new UkInvestorProfile[i];
            }
        }

        public static /* synthetic */ UkInvestorProfile copy$default(UkInvestorProfile ukInvestorProfile, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukInvestorProfile.productContext;
            }
            if ((i & 2) != 0) {
                z = ukInvestorProfile.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukInvestorProfile.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukInvestorProfile.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukInvestorProfile.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukInvestorProfile.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return ukInvestorProfile.copy(str, z, z2, z3, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkInvestorProfile copy(String productContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkInvestorProfile(productContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkInvestorProfile)) {
                return false;
            }
            UkInvestorProfile ukInvestorProfile = (UkInvestorProfile) other;
            return Intrinsics.areEqual(this.productContext, ukInvestorProfile.productContext) && this.isCheckpoint == ukInvestorProfile.isCheckpoint && this.shouldLiveInBackstack == ukInvestorProfile.shouldLiveInBackstack && this.shouldClearBackstack == ukInvestorProfile.shouldClearBackstack && this.onboardingProgress == ukInvestorProfile.onboardingProgress && Intrinsics.areEqual(this.screenId, ukInvestorProfile.screenId);
        }

        public int hashCode() {
            return (((((((((this.productContext.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkInvestorProfile(productContext=" + this.productContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getProductContext() {
            return this.productContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkInvestorProfile(String productContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.productContext = productContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkReviewInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "productContext", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getProductContext", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkReviewInvestorProfile extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkReviewInvestorProfile> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String productContext;
        private final ProgressBarData progressBarData;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkReviewInvestorProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkReviewInvestorProfile createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkReviewInvestorProfile(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkReviewInvestorProfile[] newArray(int i) {
                return new UkReviewInvestorProfile[i];
            }
        }

        public static /* synthetic */ UkReviewInvestorProfile copy$default(UkReviewInvestorProfile ukReviewInvestorProfile, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukReviewInvestorProfile.productContext;
            }
            if ((i & 2) != 0) {
                z = ukReviewInvestorProfile.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukReviewInvestorProfile.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukReviewInvestorProfile.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukReviewInvestorProfile.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukReviewInvestorProfile.screenId;
            }
            if ((i & 64) != 0) {
                progressBarData = ukReviewInvestorProfile.progressBarData;
            }
            UUID uuid2 = uuid;
            ProgressBarData progressBarData2 = progressBarData;
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            boolean z4 = z2;
            return ukReviewInvestorProfile.copy(str, z, z4, z3, optionOnboardingProgress2, uuid2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component7, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final UkReviewInvestorProfile copy(String productContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkReviewInvestorProfile(productContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, progressBarData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkReviewInvestorProfile)) {
                return false;
            }
            UkReviewInvestorProfile ukReviewInvestorProfile = (UkReviewInvestorProfile) other;
            return Intrinsics.areEqual(this.productContext, ukReviewInvestorProfile.productContext) && this.isCheckpoint == ukReviewInvestorProfile.isCheckpoint && this.shouldLiveInBackstack == ukReviewInvestorProfile.shouldLiveInBackstack && this.shouldClearBackstack == ukReviewInvestorProfile.shouldClearBackstack && this.onboardingProgress == ukReviewInvestorProfile.onboardingProgress && Intrinsics.areEqual(this.screenId, ukReviewInvestorProfile.screenId) && Intrinsics.areEqual(this.progressBarData, ukReviewInvestorProfile.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.productContext.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "UkReviewInvestorProfile(productContext=" + this.productContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public final String getProductContext() {
            return this.productContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkReviewInvestorProfile(String productContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.productContext = productContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.progressBarData = progressBarData;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkExperienceTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "productContext", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getProductContext", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkExperienceTestQuestionnaire extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkExperienceTestQuestionnaire> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String productContext;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkExperienceTestQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkExperienceTestQuestionnaire createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkExperienceTestQuestionnaire(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkExperienceTestQuestionnaire[] newArray(int i) {
                return new UkExperienceTestQuestionnaire[i];
            }
        }

        public static /* synthetic */ UkExperienceTestQuestionnaire copy$default(UkExperienceTestQuestionnaire ukExperienceTestQuestionnaire, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukExperienceTestQuestionnaire.productContext;
            }
            if ((i & 2) != 0) {
                z = ukExperienceTestQuestionnaire.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukExperienceTestQuestionnaire.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukExperienceTestQuestionnaire.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukExperienceTestQuestionnaire.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukExperienceTestQuestionnaire.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return ukExperienceTestQuestionnaire.copy(str, z, z2, z3, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkExperienceTestQuestionnaire copy(String productContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkExperienceTestQuestionnaire(productContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkExperienceTestQuestionnaire)) {
                return false;
            }
            UkExperienceTestQuestionnaire ukExperienceTestQuestionnaire = (UkExperienceTestQuestionnaire) other;
            return Intrinsics.areEqual(this.productContext, ukExperienceTestQuestionnaire.productContext) && this.isCheckpoint == ukExperienceTestQuestionnaire.isCheckpoint && this.shouldLiveInBackstack == ukExperienceTestQuestionnaire.shouldLiveInBackstack && this.shouldClearBackstack == ukExperienceTestQuestionnaire.shouldClearBackstack && this.onboardingProgress == ukExperienceTestQuestionnaire.onboardingProgress && Intrinsics.areEqual(this.screenId, ukExperienceTestQuestionnaire.screenId);
        }

        public int hashCode() {
            return (((((((((this.productContext.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkExperienceTestQuestionnaire(productContext=" + this.productContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getProductContext() {
            return this.productContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkExperienceTestQuestionnaire(String productContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.productContext = productContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkKnowledgeTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "productContext", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getProductContext", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkKnowledgeTestQuestionnaire extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkKnowledgeTestQuestionnaire> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String productContext;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkKnowledgeTestQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkKnowledgeTestQuestionnaire createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkKnowledgeTestQuestionnaire(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkKnowledgeTestQuestionnaire[] newArray(int i) {
                return new UkKnowledgeTestQuestionnaire[i];
            }
        }

        public static /* synthetic */ UkKnowledgeTestQuestionnaire copy$default(UkKnowledgeTestQuestionnaire ukKnowledgeTestQuestionnaire, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukKnowledgeTestQuestionnaire.productContext;
            }
            if ((i & 2) != 0) {
                z = ukKnowledgeTestQuestionnaire.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukKnowledgeTestQuestionnaire.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukKnowledgeTestQuestionnaire.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukKnowledgeTestQuestionnaire.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukKnowledgeTestQuestionnaire.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return ukKnowledgeTestQuestionnaire.copy(str, z, z2, z3, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkKnowledgeTestQuestionnaire copy(String productContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkKnowledgeTestQuestionnaire(productContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkKnowledgeTestQuestionnaire)) {
                return false;
            }
            UkKnowledgeTestQuestionnaire ukKnowledgeTestQuestionnaire = (UkKnowledgeTestQuestionnaire) other;
            return Intrinsics.areEqual(this.productContext, ukKnowledgeTestQuestionnaire.productContext) && this.isCheckpoint == ukKnowledgeTestQuestionnaire.isCheckpoint && this.shouldLiveInBackstack == ukKnowledgeTestQuestionnaire.shouldLiveInBackstack && this.shouldClearBackstack == ukKnowledgeTestQuestionnaire.shouldClearBackstack && this.onboardingProgress == ukKnowledgeTestQuestionnaire.onboardingProgress && Intrinsics.areEqual(this.screenId, ukKnowledgeTestQuestionnaire.screenId);
        }

        public int hashCode() {
            return (((((((((this.productContext.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkKnowledgeTestQuestionnaire(productContext=" + this.productContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getProductContext() {
            return this.productContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkKnowledgeTestQuestionnaire(String productContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.productContext = productContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkProfessionalTrader extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkProfessionalTrader> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final ProgressBarData progressBarData;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkProfessionalTrader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkProfessionalTrader createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkProfessionalTrader(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkProfessionalTrader[] newArray(int i) {
                return new UkProfessionalTrader[i];
            }
        }

        public static /* synthetic */ UkProfessionalTrader copy$default(UkProfessionalTrader ukProfessionalTrader, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ukProfessionalTrader.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = ukProfessionalTrader.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = ukProfessionalTrader.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = ukProfessionalTrader.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = ukProfessionalTrader.screenId;
            }
            if ((i & 32) != 0) {
                progressBarData = ukProfessionalTrader.progressBarData;
            }
            UUID uuid2 = uuid;
            ProgressBarData progressBarData2 = progressBarData;
            return ukProfessionalTrader.copy(z, z2, z3, optionOnboardingProgress, uuid2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component6, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final UkProfessionalTrader copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkProfessionalTrader(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, progressBarData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkProfessionalTrader)) {
                return false;
            }
            UkProfessionalTrader ukProfessionalTrader = (UkProfessionalTrader) other;
            return this.isCheckpoint == ukProfessionalTrader.isCheckpoint && this.shouldLiveInBackstack == ukProfessionalTrader.shouldLiveInBackstack && this.shouldClearBackstack == ukProfessionalTrader.shouldClearBackstack && this.onboardingProgress == ukProfessionalTrader.onboardingProgress && Intrinsics.areEqual(this.screenId, ukProfessionalTrader.screenId) && Intrinsics.areEqual(this.progressBarData, ukProfessionalTrader.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "UkProfessionalTrader(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkProfessionalTrader(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.progressBarData = progressBarData;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkSplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkSplashL2 extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkSplashL2> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkSplashL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL2 createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkSplashL2(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL2[] newArray(int i) {
                return new UkSplashL2[i];
            }
        }

        public static /* synthetic */ UkSplashL2 copy$default(UkSplashL2 ukSplashL2, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ukSplashL2.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = ukSplashL2.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = ukSplashL2.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = ukSplashL2.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = ukSplashL2.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return ukSplashL2.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkSplashL2 copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkSplashL2(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkSplashL2)) {
                return false;
            }
            UkSplashL2 ukSplashL2 = (UkSplashL2) other;
            return this.isCheckpoint == ukSplashL2.isCheckpoint && this.shouldLiveInBackstack == ukSplashL2.shouldLiveInBackstack && this.shouldClearBackstack == ukSplashL2.shouldClearBackstack && this.onboardingProgress == ukSplashL2.onboardingProgress && Intrinsics.areEqual(this.screenId, ukSplashL2.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkSplashL2(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkSplashL2(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefitsL2;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "microgramPageId", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getMicrogramPageId", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationBenefitsL2 extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationBenefitsL2> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final String microgramPageId;
        private final OptionOnboardingProgress onboardingProgress;
        private final ProgressBarData progressBarData;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationBenefitsL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefitsL2 createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new UkEducationBenefitsL2(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefitsL2[] newArray(int i) {
                return new UkEducationBenefitsL2[i];
            }
        }

        public static /* synthetic */ UkEducationBenefitsL2 copy$default(UkEducationBenefitsL2 ukEducationBenefitsL2, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ukEducationBenefitsL2.microgramPageId;
            }
            if ((i & 2) != 0) {
                z = ukEducationBenefitsL2.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = ukEducationBenefitsL2.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = ukEducationBenefitsL2.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = ukEducationBenefitsL2.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = ukEducationBenefitsL2.screenId;
            }
            if ((i & 64) != 0) {
                progressBarData = ukEducationBenefitsL2.progressBarData;
            }
            UUID uuid2 = uuid;
            ProgressBarData progressBarData2 = progressBarData;
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            boolean z4 = z2;
            return ukEducationBenefitsL2.copy(str, z, z4, z3, optionOnboardingProgress2, uuid2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component7, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final UkEducationBenefitsL2 copy(String microgramPageId, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationBenefitsL2(microgramPageId, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId, progressBarData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkEducationBenefitsL2)) {
                return false;
            }
            UkEducationBenefitsL2 ukEducationBenefitsL2 = (UkEducationBenefitsL2) other;
            return Intrinsics.areEqual(this.microgramPageId, ukEducationBenefitsL2.microgramPageId) && this.isCheckpoint == ukEducationBenefitsL2.isCheckpoint && this.shouldLiveInBackstack == ukEducationBenefitsL2.shouldLiveInBackstack && this.shouldClearBackstack == ukEducationBenefitsL2.shouldClearBackstack && this.onboardingProgress == ukEducationBenefitsL2.onboardingProgress && Intrinsics.areEqual(this.screenId, ukEducationBenefitsL2.screenId) && Intrinsics.areEqual(this.progressBarData, ukEducationBenefitsL2.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.microgramPageId.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "UkEducationBenefitsL2(microgramPageId=" + this.microgramPageId + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.microgramPageId);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public final String getMicrogramPageId() {
            return this.microgramPageId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationBenefitsL2(String microgramPageId, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId, ProgressBarData progressBarData) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(microgramPageId, "microgramPageId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.microgramPageId = microgramPageId;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
            this.progressBarData = progressBarData;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgSplash;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "showGstDisclosure", "", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getShowGstDisclosure", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgSplash extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgSplash> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final boolean showGstDisclosure;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgSplash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgSplash createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new RhsgSplash(z4, z5, z2, z3, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgSplash[] newArray(int i) {
                return new RhsgSplash[i];
            }
        }

        public static /* synthetic */ RhsgSplash copy$default(RhsgSplash rhsgSplash, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhsgSplash.showGstDisclosure;
            }
            if ((i & 2) != 0) {
                z2 = rhsgSplash.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z3 = rhsgSplash.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z4 = rhsgSplash.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = rhsgSplash.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = rhsgSplash.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return rhsgSplash.copy(z, z2, z3, z4, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowGstDisclosure() {
            return this.showGstDisclosure;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgSplash copy(boolean showGstDisclosure, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgSplash(showGstDisclosure, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhsgSplash)) {
                return false;
            }
            RhsgSplash rhsgSplash = (RhsgSplash) other;
            return this.showGstDisclosure == rhsgSplash.showGstDisclosure && this.isCheckpoint == rhsgSplash.isCheckpoint && this.shouldLiveInBackstack == rhsgSplash.shouldLiveInBackstack && this.shouldClearBackstack == rhsgSplash.shouldClearBackstack && this.onboardingProgress == rhsgSplash.onboardingProgress && Intrinsics.areEqual(this.screenId, rhsgSplash.screenId);
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.showGstDisclosure) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgSplash(showGstDisclosure=" + this.showGstDisclosure + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showGstDisclosure ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final boolean getShowGstDisclosure() {
            return this.showGstDisclosure;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgSplash(boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z2, z3, z4, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.showGstDisclosure = z;
            this.isCheckpoint = z2;
            this.shouldLiveInBackstack = z3;
            this.shouldClearBackstack = z4;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgCustomerAccountReviewQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "productContext", "", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getProductContext", "()Ljava/lang/String;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgCustomerAccountReviewQuestionnaire extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgCustomerAccountReviewQuestionnaire> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final String productContext;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgCustomerAccountReviewQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgCustomerAccountReviewQuestionnaire createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new RhsgCustomerAccountReviewQuestionnaire(string2, z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgCustomerAccountReviewQuestionnaire[] newArray(int i) {
                return new RhsgCustomerAccountReviewQuestionnaire[i];
            }
        }

        public static /* synthetic */ RhsgCustomerAccountReviewQuestionnaire copy$default(RhsgCustomerAccountReviewQuestionnaire rhsgCustomerAccountReviewQuestionnaire, String str, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rhsgCustomerAccountReviewQuestionnaire.productContext;
            }
            if ((i & 2) != 0) {
                z = rhsgCustomerAccountReviewQuestionnaire.isCheckpoint;
            }
            if ((i & 4) != 0) {
                z2 = rhsgCustomerAccountReviewQuestionnaire.shouldLiveInBackstack;
            }
            if ((i & 8) != 0) {
                z3 = rhsgCustomerAccountReviewQuestionnaire.shouldClearBackstack;
            }
            if ((i & 16) != 0) {
                optionOnboardingProgress = rhsgCustomerAccountReviewQuestionnaire.onboardingProgress;
            }
            if ((i & 32) != 0) {
                uuid = rhsgCustomerAccountReviewQuestionnaire.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            return rhsgCustomerAccountReviewQuestionnaire.copy(str, z, z2, z3, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgCustomerAccountReviewQuestionnaire copy(String productContext, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgCustomerAccountReviewQuestionnaire(productContext, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhsgCustomerAccountReviewQuestionnaire)) {
                return false;
            }
            RhsgCustomerAccountReviewQuestionnaire rhsgCustomerAccountReviewQuestionnaire = (RhsgCustomerAccountReviewQuestionnaire) other;
            return Intrinsics.areEqual(this.productContext, rhsgCustomerAccountReviewQuestionnaire.productContext) && this.isCheckpoint == rhsgCustomerAccountReviewQuestionnaire.isCheckpoint && this.shouldLiveInBackstack == rhsgCustomerAccountReviewQuestionnaire.shouldLiveInBackstack && this.shouldClearBackstack == rhsgCustomerAccountReviewQuestionnaire.shouldClearBackstack && this.onboardingProgress == rhsgCustomerAccountReviewQuestionnaire.onboardingProgress && Intrinsics.areEqual(this.screenId, rhsgCustomerAccountReviewQuestionnaire.screenId);
        }

        public int hashCode() {
            return (((((((((this.productContext.hashCode() * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgCustomerAccountReviewQuestionnaire(productContext=" + this.productContext + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final String getProductContext() {
            return this.productContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgCustomerAccountReviewQuestionnaire(String productContext, boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.productContext = productContext;
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgProfessionalTrader extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgProfessionalTrader> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgProfessionalTrader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgProfessionalTrader createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new RhsgProfessionalTrader(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgProfessionalTrader[] newArray(int i) {
                return new RhsgProfessionalTrader[i];
            }
        }

        public static /* synthetic */ RhsgProfessionalTrader copy$default(RhsgProfessionalTrader rhsgProfessionalTrader, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhsgProfessionalTrader.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = rhsgProfessionalTrader.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = rhsgProfessionalTrader.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = rhsgProfessionalTrader.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = rhsgProfessionalTrader.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return rhsgProfessionalTrader.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgProfessionalTrader copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgProfessionalTrader(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhsgProfessionalTrader)) {
                return false;
            }
            RhsgProfessionalTrader rhsgProfessionalTrader = (RhsgProfessionalTrader) other;
            return this.isCheckpoint == rhsgProfessionalTrader.isCheckpoint && this.shouldLiveInBackstack == rhsgProfessionalTrader.shouldLiveInBackstack && this.shouldClearBackstack == rhsgProfessionalTrader.shouldClearBackstack && this.onboardingProgress == rhsgProfessionalTrader.onboardingProgress && Intrinsics.areEqual(this.screenId, rhsgProfessionalTrader.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgProfessionalTrader(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgProfessionalTrader(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgL2ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgL2ApprovedTrades extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgL2ApprovedTrades> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgL2ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL2ApprovedTrades createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new RhsgL2ApprovedTrades(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL2ApprovedTrades[] newArray(int i) {
                return new RhsgL2ApprovedTrades[i];
            }
        }

        public static /* synthetic */ RhsgL2ApprovedTrades copy$default(RhsgL2ApprovedTrades rhsgL2ApprovedTrades, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhsgL2ApprovedTrades.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = rhsgL2ApprovedTrades.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = rhsgL2ApprovedTrades.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = rhsgL2ApprovedTrades.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = rhsgL2ApprovedTrades.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return rhsgL2ApprovedTrades.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgL2ApprovedTrades copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgL2ApprovedTrades(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhsgL2ApprovedTrades)) {
                return false;
            }
            RhsgL2ApprovedTrades rhsgL2ApprovedTrades = (RhsgL2ApprovedTrades) other;
            return this.isCheckpoint == rhsgL2ApprovedTrades.isCheckpoint && this.shouldLiveInBackstack == rhsgL2ApprovedTrades.shouldLiveInBackstack && this.shouldClearBackstack == rhsgL2ApprovedTrades.shouldClearBackstack && this.onboardingProgress == rhsgL2ApprovedTrades.onboardingProgress && Intrinsics.areEqual(this.screenId, rhsgL2ApprovedTrades.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgL2ApprovedTrades(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgL2ApprovedTrades(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgL3ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "isCheckpoint", "", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgL3ApprovedTrades extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgL3ApprovedTrades> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgL3ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL3ApprovedTrades createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new RhsgL3ApprovedTrades(z3, z4, z2, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL3ApprovedTrades[] newArray(int i) {
                return new RhsgL3ApprovedTrades[i];
            }
        }

        public static /* synthetic */ RhsgL3ApprovedTrades copy$default(RhsgL3ApprovedTrades rhsgL3ApprovedTrades, boolean z, boolean z2, boolean z3, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhsgL3ApprovedTrades.isCheckpoint;
            }
            if ((i & 2) != 0) {
                z2 = rhsgL3ApprovedTrades.shouldLiveInBackstack;
            }
            if ((i & 4) != 0) {
                z3 = rhsgL3ApprovedTrades.shouldClearBackstack;
            }
            if ((i & 8) != 0) {
                optionOnboardingProgress = rhsgL3ApprovedTrades.onboardingProgress;
            }
            if ((i & 16) != 0) {
                uuid = rhsgL3ApprovedTrades.screenId;
            }
            UUID uuid2 = uuid;
            boolean z4 = z3;
            return rhsgL3ApprovedTrades.copy(z, z2, z4, optionOnboardingProgress, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgL3ApprovedTrades copy(boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgL3ApprovedTrades(isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhsgL3ApprovedTrades)) {
                return false;
            }
            RhsgL3ApprovedTrades rhsgL3ApprovedTrades = (RhsgL3ApprovedTrades) other;
            return this.isCheckpoint == rhsgL3ApprovedTrades.isCheckpoint && this.shouldLiveInBackstack == rhsgL3ApprovedTrades.shouldLiveInBackstack && this.shouldClearBackstack == rhsgL3ApprovedTrades.shouldClearBackstack && this.onboardingProgress == rhsgL3ApprovedTrades.onboardingProgress && Intrinsics.areEqual(this.screenId, rhsgL3ApprovedTrades.screenId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isCheckpoint) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgL3ApprovedTrades(isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgL3ApprovedTrades(boolean z, boolean z2, boolean z3, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z, z2, z3, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isCheckpoint = z;
            this.shouldLiveInBackstack = z2;
            this.shouldClearBackstack = z3;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u001a\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JS\u0010!\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$JointAccountPendingApplication;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "upgradeTypeInCopy", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/JAPendingApplicationUpgradeTypeInCopy;", "isFromAcatsJointAccount", "", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;ZZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "getUpgradeTypeInCopy", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "()Z", "getShouldLiveInBackstack", "getShouldClearBackstack", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getScreenId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class JointAccountPendingApplication extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<JointAccountPendingApplication> CREATOR = new Creator();
        private final boolean isCheckpoint;
        private final boolean isFromAcatsJointAccount;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;
        private final JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopy;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<JointAccountPendingApplication> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JointAccountPendingApplication createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopyDto = (JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto) parcel.readParcelable(JointAccountPendingApplication.class.getClassLoader());
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new JointAccountPendingApplication(upgradeTypeInCopyDto, z4, z5, z2, z3, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JointAccountPendingApplication[] newArray(int i) {
                return new JointAccountPendingApplication[i];
            }
        }

        public static /* synthetic */ JointAccountPendingApplication copy$default(JointAccountPendingApplication jointAccountPendingApplication, JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopyDto, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress optionOnboardingProgress, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                upgradeTypeInCopyDto = jointAccountPendingApplication.upgradeTypeInCopy;
            }
            if ((i & 2) != 0) {
                z = jointAccountPendingApplication.isFromAcatsJointAccount;
            }
            if ((i & 4) != 0) {
                z2 = jointAccountPendingApplication.isCheckpoint;
            }
            if ((i & 8) != 0) {
                z3 = jointAccountPendingApplication.shouldLiveInBackstack;
            }
            if ((i & 16) != 0) {
                z4 = jointAccountPendingApplication.shouldClearBackstack;
            }
            if ((i & 32) != 0) {
                optionOnboardingProgress = jointAccountPendingApplication.onboardingProgress;
            }
            if ((i & 64) != 0) {
                uuid = jointAccountPendingApplication.screenId;
            }
            OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
            UUID uuid2 = uuid;
            boolean z5 = z4;
            boolean z6 = z2;
            return jointAccountPendingApplication.copy(upgradeTypeInCopyDto, z, z6, z3, z5, optionOnboardingProgress2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto getUpgradeTypeInCopy() {
            return this.upgradeTypeInCopy;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromAcatsJointAccount() {
            return this.isFromAcatsJointAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component7, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final JointAccountPendingApplication copy(JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopy, boolean isFromAcatsJointAccount, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(upgradeTypeInCopy, "upgradeTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new JointAccountPendingApplication(upgradeTypeInCopy, isFromAcatsJointAccount, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JointAccountPendingApplication)) {
                return false;
            }
            JointAccountPendingApplication jointAccountPendingApplication = (JointAccountPendingApplication) other;
            return this.upgradeTypeInCopy == jointAccountPendingApplication.upgradeTypeInCopy && this.isFromAcatsJointAccount == jointAccountPendingApplication.isFromAcatsJointAccount && this.isCheckpoint == jointAccountPendingApplication.isCheckpoint && this.shouldLiveInBackstack == jointAccountPendingApplication.shouldLiveInBackstack && this.shouldClearBackstack == jointAccountPendingApplication.shouldClearBackstack && this.onboardingProgress == jointAccountPendingApplication.onboardingProgress && Intrinsics.areEqual(this.screenId, jointAccountPendingApplication.screenId);
        }

        public int hashCode() {
            return (((((((((((this.upgradeTypeInCopy.hashCode() * 31) + Boolean.hashCode(this.isFromAcatsJointAccount)) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "JointAccountPendingApplication(upgradeTypeInCopy=" + this.upgradeTypeInCopy + ", isFromAcatsJointAccount=" + this.isFromAcatsJointAccount + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.upgradeTypeInCopy, flags);
            dest.writeInt(this.isFromAcatsJointAccount ? 1 : 0);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto getUpgradeTypeInCopy() {
            return this.upgradeTypeInCopy;
        }

        public final boolean isFromAcatsJointAccount() {
            return this.isFromAcatsJointAccount;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JointAccountPendingApplication(JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto upgradeTypeInCopy, boolean z, boolean z2, boolean z3, boolean z4, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z2, z3, z4, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(upgradeTypeInCopy, "upgradeTypeInCopy");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.upgradeTypeInCopy = upgradeTypeInCopy;
            this.isFromAcatsJointAccount = z;
            this.isCheckpoint = z2;
            this.shouldLiveInBackstack = z3;
            this.shouldClearBackstack = z4;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J \u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b6\u0010,J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u0010 J\u001a\u0010:\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b?\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bB\u0010&R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010\"R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b\f\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010,R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b\u000f\u0010\"R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bE\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bF\u0010\"R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u00101R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u00103¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenArgs$KnowledgeCheckNeeded;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Landroid/os/Parcelable;", "", "appointmentEnabled", "chatEnabled", "chatHidden", "j$/time/Instant", "chatStartTime", "chatEndTime", "isHalfDay", "isWeekend", "isHoliday", "", "disclosureContentfulId", "isCheckpoint", "shouldLiveInBackstack", "shouldClearBackstack", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "onboardingProgress", "Ljava/util/UUID;", "screenId", "<init>", "(ZZZLj$/time/Instant;Lj$/time/Instant;ZZZLjava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "()Lj$/time/Instant;", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "component14", "()Ljava/util/UUID;", "copy", "(ZZZLj$/time/Instant;Lj$/time/Instant;ZZZLjava/lang/String;ZZZLcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/util/UUID;)Lcom/robinhood/android/optionsupgrade/ScreenArgs$KnowledgeCheckNeeded;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAppointmentEnabled", "getChatEnabled", "getChatHidden", "Lj$/time/Instant;", "getChatStartTime", "getChatEndTime", "Ljava/lang/String;", "getDisclosureContentfulId", "getShouldLiveInBackstack", "getShouldClearBackstack", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getOnboardingProgress", "Ljava/util/UUID;", "getScreenId", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class KnowledgeCheckNeeded extends ScreenArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<KnowledgeCheckNeeded> CREATOR = new Creator();
        private final boolean appointmentEnabled;
        private final boolean chatEnabled;
        private final Instant chatEndTime;
        private final boolean chatHidden;
        private final Instant chatStartTime;
        private final String disclosureContentfulId;
        private final boolean isCheckpoint;
        private final boolean isHalfDay;
        private final boolean isHoliday;
        private final boolean isWeekend;
        private final OptionOnboardingProgress onboardingProgress;
        private final UUID screenId;
        private final boolean shouldClearBackstack;
        private final boolean shouldLiveInBackstack;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<KnowledgeCheckNeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KnowledgeCheckNeeded createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Instant instant;
                Instant instant2;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                String str;
                boolean z9;
                boolean z10;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z12 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                Instant instant3 = (Instant) parcel.readSerializable();
                Instant instant4 = (Instant) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    instant = instant3;
                    instant2 = instant4;
                    z5 = z4;
                } else {
                    z4 = z3;
                    instant = instant3;
                    instant2 = instant4;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z7 = z6;
                } else {
                    z7 = z6;
                    z6 = z;
                }
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = z7;
                    str = string2;
                    z9 = z8;
                } else {
                    z8 = z7;
                    str = string2;
                    z9 = z;
                }
                if (parcel.readInt() != 0) {
                    z10 = z8;
                } else {
                    z10 = z8;
                    z8 = z;
                }
                if (parcel.readInt() == 0) {
                    z10 = z;
                }
                return new KnowledgeCheckNeeded(z11, z12, z2, instant, instant2, z5, z4, z6, str, z9, z8, z10, OptionOnboardingProgress.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KnowledgeCheckNeeded[] newArray(int i) {
                return new KnowledgeCheckNeeded[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAppointmentEnabled() {
            return this.appointmentEnabled;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        /* renamed from: component13, reason: from getter */
        public final OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        /* renamed from: component14, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getChatEnabled() {
            return this.chatEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getChatHidden() {
            return this.chatHidden;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getChatStartTime() {
            return this.chatStartTime;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getChatEndTime() {
            return this.chatEndTime;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsHalfDay() {
            return this.isHalfDay;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsWeekend() {
            return this.isWeekend;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsHoliday() {
            return this.isHoliday;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDisclosureContentfulId() {
            return this.disclosureContentfulId;
        }

        public final KnowledgeCheckNeeded copy(boolean appointmentEnabled, boolean chatEnabled, boolean chatHidden, Instant chatStartTime, Instant chatEndTime, boolean isHalfDay, boolean isWeekend, boolean isHoliday, String disclosureContentfulId, boolean isCheckpoint, boolean shouldLiveInBackstack, boolean shouldClearBackstack, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            Intrinsics.checkNotNullParameter(disclosureContentfulId, "disclosureContentfulId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new KnowledgeCheckNeeded(appointmentEnabled, chatEnabled, chatHidden, chatStartTime, chatEndTime, isHalfDay, isWeekend, isHoliday, disclosureContentfulId, isCheckpoint, shouldLiveInBackstack, shouldClearBackstack, onboardingProgress, screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KnowledgeCheckNeeded)) {
                return false;
            }
            KnowledgeCheckNeeded knowledgeCheckNeeded = (KnowledgeCheckNeeded) other;
            return this.appointmentEnabled == knowledgeCheckNeeded.appointmentEnabled && this.chatEnabled == knowledgeCheckNeeded.chatEnabled && this.chatHidden == knowledgeCheckNeeded.chatHidden && Intrinsics.areEqual(this.chatStartTime, knowledgeCheckNeeded.chatStartTime) && Intrinsics.areEqual(this.chatEndTime, knowledgeCheckNeeded.chatEndTime) && this.isHalfDay == knowledgeCheckNeeded.isHalfDay && this.isWeekend == knowledgeCheckNeeded.isWeekend && this.isHoliday == knowledgeCheckNeeded.isHoliday && Intrinsics.areEqual(this.disclosureContentfulId, knowledgeCheckNeeded.disclosureContentfulId) && this.isCheckpoint == knowledgeCheckNeeded.isCheckpoint && this.shouldLiveInBackstack == knowledgeCheckNeeded.shouldLiveInBackstack && this.shouldClearBackstack == knowledgeCheckNeeded.shouldClearBackstack && this.onboardingProgress == knowledgeCheckNeeded.onboardingProgress && Intrinsics.areEqual(this.screenId, knowledgeCheckNeeded.screenId);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.appointmentEnabled) * 31) + Boolean.hashCode(this.chatEnabled)) * 31) + Boolean.hashCode(this.chatHidden)) * 31;
            Instant instant = this.chatStartTime;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.chatEndTime;
            return ((((((((((((((((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHalfDay)) * 31) + Boolean.hashCode(this.isWeekend)) * 31) + Boolean.hashCode(this.isHoliday)) * 31) + this.disclosureContentfulId.hashCode()) * 31) + Boolean.hashCode(this.isCheckpoint)) * 31) + Boolean.hashCode(this.shouldLiveInBackstack)) * 31) + Boolean.hashCode(this.shouldClearBackstack)) * 31) + this.onboardingProgress.hashCode()) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "KnowledgeCheckNeeded(appointmentEnabled=" + this.appointmentEnabled + ", chatEnabled=" + this.chatEnabled + ", chatHidden=" + this.chatHidden + ", chatStartTime=" + this.chatStartTime + ", chatEndTime=" + this.chatEndTime + ", isHalfDay=" + this.isHalfDay + ", isWeekend=" + this.isWeekend + ", isHoliday=" + this.isHoliday + ", disclosureContentfulId=" + this.disclosureContentfulId + ", isCheckpoint=" + this.isCheckpoint + ", shouldLiveInBackstack=" + this.shouldLiveInBackstack + ", shouldClearBackstack=" + this.shouldClearBackstack + ", onboardingProgress=" + this.onboardingProgress + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.appointmentEnabled ? 1 : 0);
            dest.writeInt(this.chatEnabled ? 1 : 0);
            dest.writeInt(this.chatHidden ? 1 : 0);
            dest.writeSerializable(this.chatStartTime);
            dest.writeSerializable(this.chatEndTime);
            dest.writeInt(this.isHalfDay ? 1 : 0);
            dest.writeInt(this.isWeekend ? 1 : 0);
            dest.writeInt(this.isHoliday ? 1 : 0);
            dest.writeString(this.disclosureContentfulId);
            dest.writeInt(this.isCheckpoint ? 1 : 0);
            dest.writeInt(this.shouldLiveInBackstack ? 1 : 0);
            dest.writeInt(this.shouldClearBackstack ? 1 : 0);
            dest.writeString(this.onboardingProgress.name());
            dest.writeSerializable(this.screenId);
        }

        public final boolean getAppointmentEnabled() {
            return this.appointmentEnabled;
        }

        public final boolean getChatEnabled() {
            return this.chatEnabled;
        }

        public final boolean getChatHidden() {
            return this.chatHidden;
        }

        public final Instant getChatStartTime() {
            return this.chatStartTime;
        }

        public final Instant getChatEndTime() {
            return this.chatEndTime;
        }

        public final boolean isHalfDay() {
            return this.isHalfDay;
        }

        public final boolean isWeekend() {
            return this.isWeekend;
        }

        public final boolean isHoliday() {
            return this.isHoliday;
        }

        public final String getDisclosureContentfulId() {
            return this.disclosureContentfulId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        /* renamed from: isCheckpoint */
        public boolean getIsCheckpoint() {
            return this.isCheckpoint;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldLiveInBackstack() {
            return this.shouldLiveInBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public boolean getShouldClearBackstack() {
            return this.shouldClearBackstack;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public OptionOnboardingProgress getOnboardingProgress() {
            return this.onboardingProgress;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenArgs
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnowledgeCheckNeeded(boolean z, boolean z2, boolean z3, Instant instant, Instant instant2, boolean z4, boolean z5, boolean z6, String disclosureContentfulId, boolean z7, boolean z8, boolean z9, OptionOnboardingProgress onboardingProgress, UUID screenId) {
            super(z7, z8, z9, onboardingProgress, screenId, false, 32, null);
            Intrinsics.checkNotNullParameter(disclosureContentfulId, "disclosureContentfulId");
            Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.appointmentEnabled = z;
            this.chatEnabled = z2;
            this.chatHidden = z3;
            this.chatStartTime = instant;
            this.chatEndTime = instant2;
            this.isHalfDay = z4;
            this.isWeekend = z5;
            this.isHoliday = z6;
            this.disclosureContentfulId = disclosureContentfulId;
            this.isCheckpoint = z7;
            this.shouldLiveInBackstack = z8;
            this.shouldClearBackstack = z9;
            this.onboardingProgress = onboardingProgress;
            this.screenId = screenId;
        }
    }
}
