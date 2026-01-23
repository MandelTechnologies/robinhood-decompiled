package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.ApprovedTradesRequestMetadataDto;
import options_product.service.DisclosureRequestMetadataDto;
import options_product.service.EducationL3StrategiesRequestMetadataDto;
import options_product.service.EducationSpreadRequestMetadataDto;
import options_product.service.EndRequestMetadataDto;
import options_product.service.ExperienceTestQuestionnaireRequestMetadataDto;
import options_product.service.FailureRequestMetadataDto;
import options_product.service.InvestmentProfileRequestMetadataDto;
import options_product.service.InvestorProfileV2RequestMetadataDto;
import options_product.service.JAPendingApplicationMetadataDto;
import options_product.service.KnowledgeTestQuestionnaireRequestMetadataDto;
import options_product.service.OnboardingScreenRequestDto;
import options_product.service.ProfessionalTraderRequestMetadataDto;
import options_product.service.QuestionFinancialRegulatorRequestMetadataDto;
import options_product.service.QuestionInvestmentAdviceRequestMetadataDto;
import options_product.service.QuestionOptionExperienceRequestMetadataDto;
import options_product.service.QuestionUnderstandSpreadRequestMetadataDto;
import options_product.service.RHSGCompleteCARQuestionnaireRequestMetadataDto;
import options_product.service.RHSGHomeRequestMetadataDto;
import options_product.service.RHSGL2ApprovedTradesRequestMetadataDto;
import options_product.service.RHSGL3ApprovedTradesRequestMetadataDto;
import options_product.service.ReadyL3UpgradeRequestMetadataDto;
import options_product.service.ReviewInvestorProfileV2RequestMetadataDto;
import options_product.service.SplashL0RequestMetadataDto;
import options_product.service.SplashL2RequestMetadataDto;
import options_product.service.SplashRetirementRequestMetadataDto;
import options_product.service.StartRequestMetadataDto;
import options_product.service.SuccessRequestMetadataDto;
import options_product.service.SuitabilityRequestMetadataDto;
import options_product.service.UKEducationHomeRequestMetadataDto;
import options_product.service.UKEducationProfessionalTraderRequestMetadataDto;
import options_product.service.UKEducationRisksRequestMetadataDto;
import options_product.service.UKEducationStrategyRequestMetadataDto;
import options_product.service.UKL3EducationHomeRequestMetadataDto;
import options_product.service.UKL3EducationSpreadBenefitsRequestMetadataDto;
import options_product.service.UpsellAlertRequestMetadataDto;
import options_product.service.UpsellAllSetRequestMetadataDto;
import options_product.service.UpsellTradeOnExpirationRequestMetadataDto;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:%\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001%/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRS¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "Landroid/os/Parcelable;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "Start", "SplashL0", "SplashL2", "SplashRetirement", "QuestionOptionExperience", "QuestionUnderstandSpread", "QuestionInvestmentAdvice", "QuestionFinancialRegulator", "Suitability", "InvestmentProfile", "Disclosure", "ApprovedTrades", "Success", "Failure", "EducationSpread", "EducationL3Strategies", "ReadyL3Upgrade", "UpsellAlert", "UpsellTradeOnExpiration", "UpsellAllSet", "End", "UkSplashL0", "UkEducationBenefits", "UkEducationRisks", "UkInvestorProfile", "UkReviewInvestorProfile", "UkExperienceTestQuestionnaire", "UkKnowledgeTestQuestionnaire", "UkProfessionalTrader", "UkSplashL2", "UkEducationBenefitsL2", "RhsgSplashL0", "RhsgCustomerAccountReviewQuestionnaire", "RhsgProfessionalTrader", "RhsgL2ApprovedTrades", "RhsgL3ApprovedTrades", "JointAccountPendingApplication", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Disclosure;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$EducationL3Strategies;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$EducationSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$End;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Failure;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$InvestmentProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$JointAccountPendingApplication;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionFinancialRegulator;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionInvestmentAdvice;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionOptionExperience;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionUnderstandSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$ReadyL3Upgrade;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgCustomerAccountReviewQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgL2ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgL3ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashRetirement;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Start;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Success;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Suitability;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationBenefits;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationBenefitsL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationRisks;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkExperienceTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkKnowledgeTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkReviewInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkSplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellAlert;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellAllSet;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellTradeOnExpiration;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class ScreenRequest implements Parcelable {
    public static final int $stable = 8;
    private final UUID screenId;

    public /* synthetic */ ScreenRequest(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid);
    }

    public abstract OnboardingScreenRequestDto toDto();

    private ScreenRequest(UUID uuid) {
        this.screenId = uuid;
    }

    public UUID getScreenId() {
        return this.screenId;
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$Start;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "hasShownOptionsAlertUpsell", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "getHasShownOptionsAlertUpsell", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Start extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Start> CREATOR = new Creator();
        private final boolean hasShownOptionsAlertUpsell;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Start> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Start(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start[] newArray(int i) {
                return new Start[i];
            }
        }

        public static /* synthetic */ Start copy$default(Start start, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = start.hasShownOptionsAlertUpsell;
            }
            if ((i & 2) != 0) {
                uuid = start.screenId;
            }
            return start.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasShownOptionsAlertUpsell() {
            return this.hasShownOptionsAlertUpsell;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Start copy(boolean hasShownOptionsAlertUpsell, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Start(hasShownOptionsAlertUpsell, screenId);
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
            return this.hasShownOptionsAlertUpsell == start.hasShownOptionsAlertUpsell && Intrinsics.areEqual(this.screenId, start.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasShownOptionsAlertUpsell) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Start(hasShownOptionsAlertUpsell=" + this.hasShownOptionsAlertUpsell + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasShownOptionsAlertUpsell ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean getHasShownOptionsAlertUpsell() {
            return this.hasShownOptionsAlertUpsell;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.hasShownOptionsAlertUpsell = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.Start(new StartRequestMetadataDto(this.hasShownOptionsAlertUpsell)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashL0 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashL0> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashL0> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL0 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplashL0((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL0[] newArray(int i) {
                return new SplashL0[i];
            }
        }

        public static /* synthetic */ SplashL0 copy$default(SplashL0 splashL0, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = splashL0.screenId;
            }
            return splashL0.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashL0 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashL0(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SplashL0) && Intrinsics.areEqual(this.screenId, ((SplashL0) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "SplashL0(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashL0(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.SplashL0(new SplashL0RequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashL2 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashL2> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplashL2((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashL2[] newArray(int i) {
                return new SplashL2[i];
            }
        }

        public static /* synthetic */ SplashL2 copy$default(SplashL2 splashL2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = splashL2.screenId;
            }
            return splashL2.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashL2 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashL2(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SplashL2) && Intrinsics.areEqual(this.screenId, ((SplashL2) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "SplashL2(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashL2(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.SplashL2(new SplashL2RequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$SplashRetirement;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SplashRetirement extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SplashRetirement> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SplashRetirement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashRetirement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplashRetirement((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplashRetirement[] newArray(int i) {
                return new SplashRetirement[i];
            }
        }

        public static /* synthetic */ SplashRetirement copy$default(SplashRetirement splashRetirement, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = splashRetirement.screenId;
            }
            return splashRetirement.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final SplashRetirement copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new SplashRetirement(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SplashRetirement) && Intrinsics.areEqual(this.screenId, ((SplashRetirement) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "SplashRetirement(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplashRetirement(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.SplashRetirement(new SplashRetirementRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionOptionExperience;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "optionExperienceLevel", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "Lcom/robinhood/android/optionsupgrade/OptionExperienceLevel;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;Ljava/util/UUID;)V", "getOptionExperienceLevel", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionOptionExperience extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionOptionExperience> CREATOR = new Creator();
        private final QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto optionExperienceLevel;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionOptionExperience> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionOptionExperience createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuestionOptionExperience((QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto) parcel.readParcelable(QuestionOptionExperience.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionOptionExperience[] newArray(int i) {
                return new QuestionOptionExperience[i];
            }
        }

        public static /* synthetic */ QuestionOptionExperience copy$default(QuestionOptionExperience questionOptionExperience, QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto optionExperienceLevelDto, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                optionExperienceLevelDto = questionOptionExperience.optionExperienceLevel;
            }
            if ((i & 2) != 0) {
                uuid = questionOptionExperience.screenId;
            }
            return questionOptionExperience.copy(optionExperienceLevelDto, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto getOptionExperienceLevel() {
            return this.optionExperienceLevel;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionOptionExperience copy(QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto optionExperienceLevel, UUID screenId) {
            Intrinsics.checkNotNullParameter(optionExperienceLevel, "optionExperienceLevel");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionOptionExperience(optionExperienceLevel, screenId);
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
            return this.optionExperienceLevel == questionOptionExperience.optionExperienceLevel && Intrinsics.areEqual(this.screenId, questionOptionExperience.screenId);
        }

        public int hashCode() {
            return (this.optionExperienceLevel.hashCode() * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionOptionExperience(optionExperienceLevel=" + this.optionExperienceLevel + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.optionExperienceLevel, flags);
            dest.writeSerializable(this.screenId);
        }

        public final QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto getOptionExperienceLevel() {
            return this.optionExperienceLevel;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionOptionExperience(QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto optionExperienceLevel, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(optionExperienceLevel, "optionExperienceLevel");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.optionExperienceLevel = optionExperienceLevel;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.QuestionOptionExperience(new QuestionOptionExperienceRequestMetadataDto(this.optionExperienceLevel)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionUnderstandSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "understandSpread", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "getUnderstandSpread", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionUnderstandSpread extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionUnderstandSpread> CREATOR = new Creator();
        private final UUID screenId;
        private final boolean understandSpread;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionUnderstandSpread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionUnderstandSpread createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuestionUnderstandSpread(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionUnderstandSpread[] newArray(int i) {
                return new QuestionUnderstandSpread[i];
            }
        }

        public static /* synthetic */ QuestionUnderstandSpread copy$default(QuestionUnderstandSpread questionUnderstandSpread, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionUnderstandSpread.understandSpread;
            }
            if ((i & 2) != 0) {
                uuid = questionUnderstandSpread.screenId;
            }
            return questionUnderstandSpread.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUnderstandSpread() {
            return this.understandSpread;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionUnderstandSpread copy(boolean understandSpread, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionUnderstandSpread(understandSpread, screenId);
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
            return this.understandSpread == questionUnderstandSpread.understandSpread && Intrinsics.areEqual(this.screenId, questionUnderstandSpread.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.understandSpread) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionUnderstandSpread(understandSpread=" + this.understandSpread + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.understandSpread ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean getUnderstandSpread() {
            return this.understandSpread;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionUnderstandSpread(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.understandSpread = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.QuestionUnderstandSpread(new QuestionUnderstandSpreadRequestMetadataDto(this.understandSpread)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionInvestmentAdvice;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "provideInvestmentAdvice", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "getProvideInvestmentAdvice", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionInvestmentAdvice extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionInvestmentAdvice> CREATOR = new Creator();
        private final boolean provideInvestmentAdvice;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionInvestmentAdvice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionInvestmentAdvice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuestionInvestmentAdvice(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionInvestmentAdvice[] newArray(int i) {
                return new QuestionInvestmentAdvice[i];
            }
        }

        public static /* synthetic */ QuestionInvestmentAdvice copy$default(QuestionInvestmentAdvice questionInvestmentAdvice, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionInvestmentAdvice.provideInvestmentAdvice;
            }
            if ((i & 2) != 0) {
                uuid = questionInvestmentAdvice.screenId;
            }
            return questionInvestmentAdvice.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getProvideInvestmentAdvice() {
            return this.provideInvestmentAdvice;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionInvestmentAdvice copy(boolean provideInvestmentAdvice, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionInvestmentAdvice(provideInvestmentAdvice, screenId);
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
            return this.provideInvestmentAdvice == questionInvestmentAdvice.provideInvestmentAdvice && Intrinsics.areEqual(this.screenId, questionInvestmentAdvice.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.provideInvestmentAdvice) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionInvestmentAdvice(provideInvestmentAdvice=" + this.provideInvestmentAdvice + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.provideInvestmentAdvice ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean getProvideInvestmentAdvice() {
            return this.provideInvestmentAdvice;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionInvestmentAdvice(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.provideInvestmentAdvice = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.QuestionInvestmentAdvice(new QuestionInvestmentAdviceRequestMetadataDto(this.provideInvestmentAdvice)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$QuestionFinancialRegulator;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "isFinancialRegulator", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionFinancialRegulator extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<QuestionFinancialRegulator> CREATOR = new Creator();
        private final boolean isFinancialRegulator;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionFinancialRegulator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionFinancialRegulator createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuestionFinancialRegulator(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionFinancialRegulator[] newArray(int i) {
                return new QuestionFinancialRegulator[i];
            }
        }

        public static /* synthetic */ QuestionFinancialRegulator copy$default(QuestionFinancialRegulator questionFinancialRegulator, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = questionFinancialRegulator.isFinancialRegulator;
            }
            if ((i & 2) != 0) {
                uuid = questionFinancialRegulator.screenId;
            }
            return questionFinancialRegulator.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFinancialRegulator() {
            return this.isFinancialRegulator;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final QuestionFinancialRegulator copy(boolean isFinancialRegulator, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new QuestionFinancialRegulator(isFinancialRegulator, screenId);
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
            return this.isFinancialRegulator == questionFinancialRegulator.isFinancialRegulator && Intrinsics.areEqual(this.screenId, questionFinancialRegulator.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isFinancialRegulator) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "QuestionFinancialRegulator(isFinancialRegulator=" + this.isFinancialRegulator + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isFinancialRegulator ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean isFinancialRegulator() {
            return this.isFinancialRegulator;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionFinancialRegulator(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isFinancialRegulator = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.QuestionFinancialRegulator(new QuestionFinancialRegulatorRequestMetadataDto(this.isFinancialRegulator)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$Suitability;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Suitability extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Suitability> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Suitability> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Suitability((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suitability[] newArray(int i) {
                return new Suitability[i];
            }
        }

        public static /* synthetic */ Suitability copy$default(Suitability suitability, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = suitability.screenId;
            }
            return suitability.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Suitability copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Suitability(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Suitability) && Intrinsics.areEqual(this.screenId, ((Suitability) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "Suitability(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Suitability(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.Suitability(new SuitabilityRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$InvestmentProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvestmentProfile extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestmentProfile> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InvestmentProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentProfile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestmentProfile((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentProfile[] newArray(int i) {
                return new InvestmentProfile[i];
            }
        }

        public static /* synthetic */ InvestmentProfile copy$default(InvestmentProfile investmentProfile, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = investmentProfile.screenId;
            }
            return investmentProfile.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final InvestmentProfile copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new InvestmentProfile(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvestmentProfile) && Intrinsics.areEqual(this.screenId, ((InvestmentProfile) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "InvestmentProfile(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvestmentProfile(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.InvestmentProfile(new InvestmentProfileRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$Disclosure;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disclosure extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Disclosure> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Disclosure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclosure((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure[] newArray(int i) {
                return new Disclosure[i];
            }
        }

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = disclosure.screenId;
            }
            return disclosure.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Disclosure copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Disclosure(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && Intrinsics.areEqual(this.screenId, ((Disclosure) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "Disclosure(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosure(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.Disclosure(new DisclosureRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApprovedTrades extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ApprovedTrades> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApprovedTrades createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApprovedTrades((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApprovedTrades[] newArray(int i) {
                return new ApprovedTrades[i];
            }
        }

        public static /* synthetic */ ApprovedTrades copy$default(ApprovedTrades approvedTrades, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = approvedTrades.screenId;
            }
            return approvedTrades.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final ApprovedTrades copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new ApprovedTrades(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApprovedTrades) && Intrinsics.areEqual(this.screenId, ((ApprovedTrades) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "ApprovedTrades(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApprovedTrades(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.ApprovedTrades(new ApprovedTradesRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$Success;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public static /* synthetic */ Success copy$default(Success success, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = success.screenId;
            }
            return success.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Success copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Success(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.screenId, ((Success) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "Success(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.Success(new SuccessRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$Failure;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "failureContext", "Loptions_product/service/FailureRequestMetadataDto$FailureContextDto;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/FailureRequestMetadataDto$FailureContextDto;Ljava/util/UUID;)V", "getFailureContext", "()Loptions_product/service/FailureRequestMetadataDto$FailureContextDto;", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final FailureRequestMetadataDto.FailureContextDto failureContext;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((FailureRequestMetadataDto.FailureContextDto) parcel.readParcelable(Failure.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        public static /* synthetic */ Failure copy$default(Failure failure, FailureRequestMetadataDto.FailureContextDto failureContextDto, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                failureContextDto = failure.failureContext;
            }
            if ((i & 2) != 0) {
                uuid = failure.screenId;
            }
            return failure.copy(failureContextDto, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final FailureRequestMetadataDto.FailureContextDto getFailureContext() {
            return this.failureContext;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final Failure copy(FailureRequestMetadataDto.FailureContextDto failureContext, UUID screenId) {
            Intrinsics.checkNotNullParameter(failureContext, "failureContext");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new Failure(failureContext, screenId);
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
            return this.failureContext == failure.failureContext && Intrinsics.areEqual(this.screenId, failure.screenId);
        }

        public int hashCode() {
            return (this.failureContext.hashCode() * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "Failure(failureContext=" + this.failureContext + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.failureContext, flags);
            dest.writeSerializable(this.screenId);
        }

        public final FailureRequestMetadataDto.FailureContextDto getFailureContext() {
            return this.failureContext;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(FailureRequestMetadataDto.FailureContextDto failureContext, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(failureContext, "failureContext");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.failureContext = failureContext;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.Failure(new FailureRequestMetadataDto(this.failureContext)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$EducationSpread;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationSpread extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EducationSpread> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EducationSpread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationSpread createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EducationSpread((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationSpread[] newArray(int i) {
                return new EducationSpread[i];
            }
        }

        public static /* synthetic */ EducationSpread copy$default(EducationSpread educationSpread, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = educationSpread.screenId;
            }
            return educationSpread.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final EducationSpread copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new EducationSpread(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EducationSpread) && Intrinsics.areEqual(this.screenId, ((EducationSpread) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "EducationSpread(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationSpread(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationSpread(new EducationSpreadRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$EducationL3Strategies;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationL3Strategies extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EducationL3Strategies> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EducationL3Strategies> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationL3Strategies createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EducationL3Strategies((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationL3Strategies[] newArray(int i) {
                return new EducationL3Strategies[i];
            }
        }

        public static /* synthetic */ EducationL3Strategies copy$default(EducationL3Strategies educationL3Strategies, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = educationL3Strategies.screenId;
            }
            return educationL3Strategies.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final EducationL3Strategies copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new EducationL3Strategies(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EducationL3Strategies) && Intrinsics.areEqual(this.screenId, ((EducationL3Strategies) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "EducationL3Strategies(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationL3Strategies(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationL3Strategies(new EducationL3StrategiesRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$ReadyL3Upgrade;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReadyL3Upgrade extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ReadyL3Upgrade> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReadyL3Upgrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadyL3Upgrade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReadyL3Upgrade((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadyL3Upgrade[] newArray(int i) {
                return new ReadyL3Upgrade[i];
            }
        }

        public static /* synthetic */ ReadyL3Upgrade copy$default(ReadyL3Upgrade readyL3Upgrade, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = readyL3Upgrade.screenId;
            }
            return readyL3Upgrade.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final ReadyL3Upgrade copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new ReadyL3Upgrade(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReadyL3Upgrade) && Intrinsics.areEqual(this.screenId, ((ReadyL3Upgrade) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "ReadyL3Upgrade(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyL3Upgrade(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.ReadyL3Upgrade(new ReadyL3UpgradeRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellAlert;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "action", "Loptions_product/service/UpsellAlertRequestMetadataDto$ActionDto;", "Lcom/robinhood/android/optionsupgrade/UpsellAlertAction;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/UpsellAlertRequestMetadataDto$ActionDto;Ljava/util/UUID;)V", "getAction", "()Loptions_product/service/UpsellAlertRequestMetadataDto$ActionDto;", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellAlert extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellAlert> CREATOR = new Creator();
        private final UpsellAlertRequestMetadataDto.ActionDto action;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAlert createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpsellAlert((UpsellAlertRequestMetadataDto.ActionDto) parcel.readParcelable(UpsellAlert.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAlert[] newArray(int i) {
                return new UpsellAlert[i];
            }
        }

        public static /* synthetic */ UpsellAlert copy$default(UpsellAlert upsellAlert, UpsellAlertRequestMetadataDto.ActionDto actionDto, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                actionDto = upsellAlert.action;
            }
            if ((i & 2) != 0) {
                uuid = upsellAlert.screenId;
            }
            return upsellAlert.copy(actionDto, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UpsellAlertRequestMetadataDto.ActionDto getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UpsellAlert copy(UpsellAlertRequestMetadataDto.ActionDto action, UUID screenId) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellAlert(action, screenId);
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
            return this.action == upsellAlert.action && Intrinsics.areEqual(this.screenId, upsellAlert.screenId);
        }

        public int hashCode() {
            return (this.action.hashCode() * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellAlert(action=" + this.action + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.action, flags);
            dest.writeSerializable(this.screenId);
        }

        public final UpsellAlertRequestMetadataDto.ActionDto getAction() {
            return this.action;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellAlert(UpsellAlertRequestMetadataDto.ActionDto action, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.action = action;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.UpsellAlert(new UpsellAlertRequestMetadataDto(this.action)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellTradeOnExpiration;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "action", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto$ActionDto;", "Lcom/robinhood/android/optionsupgrade/UpsellTradeOnExpirationAction;", "screenId", "Ljava/util/UUID;", "<init>", "(Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto$ActionDto;Ljava/util/UUID;)V", "getAction", "()Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto$ActionDto;", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellTradeOnExpiration extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellTradeOnExpiration> CREATOR = new Creator();
        private final UpsellTradeOnExpirationRequestMetadataDto.ActionDto action;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellTradeOnExpiration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellTradeOnExpiration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpsellTradeOnExpiration((UpsellTradeOnExpirationRequestMetadataDto.ActionDto) parcel.readParcelable(UpsellTradeOnExpiration.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellTradeOnExpiration[] newArray(int i) {
                return new UpsellTradeOnExpiration[i];
            }
        }

        public static /* synthetic */ UpsellTradeOnExpiration copy$default(UpsellTradeOnExpiration upsellTradeOnExpiration, UpsellTradeOnExpirationRequestMetadataDto.ActionDto actionDto, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                actionDto = upsellTradeOnExpiration.action;
            }
            if ((i & 2) != 0) {
                uuid = upsellTradeOnExpiration.screenId;
            }
            return upsellTradeOnExpiration.copy(actionDto, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UpsellTradeOnExpirationRequestMetadataDto.ActionDto getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UpsellTradeOnExpiration copy(UpsellTradeOnExpirationRequestMetadataDto.ActionDto action, UUID screenId) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellTradeOnExpiration(action, screenId);
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
            return this.action == upsellTradeOnExpiration.action && Intrinsics.areEqual(this.screenId, upsellTradeOnExpiration.screenId);
        }

        public int hashCode() {
            return (this.action.hashCode() * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellTradeOnExpiration(action=" + this.action + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.action, flags);
            dest.writeSerializable(this.screenId);
        }

        public final UpsellTradeOnExpirationRequestMetadataDto.ActionDto getAction() {
            return this.action;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellTradeOnExpiration(UpsellTradeOnExpirationRequestMetadataDto.ActionDto action, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.action = action;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.UpsellTradeOnExpiration(new UpsellTradeOnExpirationRequestMetadataDto(this.action)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UpsellAllSet;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellAllSet extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UpsellAllSet> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpsellAllSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAllSet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpsellAllSet((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpsellAllSet[] newArray(int i) {
                return new UpsellAllSet[i];
            }
        }

        public static /* synthetic */ UpsellAllSet copy$default(UpsellAllSet upsellAllSet, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = upsellAllSet.screenId;
            }
            return upsellAllSet.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UpsellAllSet copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UpsellAllSet(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpsellAllSet) && Intrinsics.areEqual(this.screenId, ((UpsellAllSet) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UpsellAllSet(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellAllSet(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.UpsellAllSet(new UpsellAllSetRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$End;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class End extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<End> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<End> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new End((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End[] newArray(int i) {
                return new End[i];
            }
        }

        public static /* synthetic */ End copy$default(End end, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = end.screenId;
            }
            return end.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final End copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new End(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof End) && Intrinsics.areEqual(this.screenId, ((End) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "End(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public End(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.End(new EndRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkSplashL0 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkSplashL0> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkSplashL0> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL0 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkSplashL0((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL0[] newArray(int i) {
                return new UkSplashL0[i];
            }
        }

        public static /* synthetic */ UkSplashL0 copy$default(UkSplashL0 ukSplashL0, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukSplashL0.screenId;
            }
            return ukSplashL0.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkSplashL0 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkSplashL0(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkSplashL0) && Intrinsics.areEqual(this.screenId, ((UkSplashL0) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkSplashL0(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkSplashL0(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationHome(new UKEducationHomeRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationBenefits;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationBenefits extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationBenefits> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationBenefits> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefits createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkEducationBenefits((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefits[] newArray(int i) {
                return new UkEducationBenefits[i];
            }
        }

        public static /* synthetic */ UkEducationBenefits copy$default(UkEducationBenefits ukEducationBenefits, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukEducationBenefits.screenId;
            }
            return ukEducationBenefits.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkEducationBenefits copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationBenefits(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkEducationBenefits) && Intrinsics.areEqual(this.screenId, ((UkEducationBenefits) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkEducationBenefits(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationBenefits(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationStrategy(new UKEducationStrategyRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationRisks;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationRisks extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationRisks> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationRisks> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationRisks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkEducationRisks((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationRisks[] newArray(int i) {
                return new UkEducationRisks[i];
            }
        }

        public static /* synthetic */ UkEducationRisks copy$default(UkEducationRisks ukEducationRisks, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukEducationRisks.screenId;
            }
            return ukEducationRisks.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkEducationRisks copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationRisks(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkEducationRisks) && Intrinsics.areEqual(this.screenId, ((UkEducationRisks) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkEducationRisks(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationRisks(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationRisks(new UKEducationRisksRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkInvestorProfile extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkInvestorProfile> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkInvestorProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkInvestorProfile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkInvestorProfile((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkInvestorProfile[] newArray(int i) {
                return new UkInvestorProfile[i];
            }
        }

        public static /* synthetic */ UkInvestorProfile copy$default(UkInvestorProfile ukInvestorProfile, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukInvestorProfile.screenId;
            }
            return ukInvestorProfile.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkInvestorProfile copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkInvestorProfile(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkInvestorProfile) && Intrinsics.areEqual(this.screenId, ((UkInvestorProfile) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkInvestorProfile(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkInvestorProfile(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.InvestorProfile(new InvestorProfileV2RequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkReviewInvestorProfile;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkReviewInvestorProfile extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkReviewInvestorProfile> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkReviewInvestorProfile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkReviewInvestorProfile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkReviewInvestorProfile((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkReviewInvestorProfile[] newArray(int i) {
                return new UkReviewInvestorProfile[i];
            }
        }

        public static /* synthetic */ UkReviewInvestorProfile copy$default(UkReviewInvestorProfile ukReviewInvestorProfile, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukReviewInvestorProfile.screenId;
            }
            return ukReviewInvestorProfile.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkReviewInvestorProfile copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkReviewInvestorProfile(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkReviewInvestorProfile) && Intrinsics.areEqual(this.screenId, ((UkReviewInvestorProfile) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkReviewInvestorProfile(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkReviewInvestorProfile(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.ReviewInvestorProfile(new ReviewInvestorProfileV2RequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkExperienceTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkExperienceTestQuestionnaire extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkExperienceTestQuestionnaire> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkExperienceTestQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkExperienceTestQuestionnaire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkExperienceTestQuestionnaire((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkExperienceTestQuestionnaire[] newArray(int i) {
                return new UkExperienceTestQuestionnaire[i];
            }
        }

        public static /* synthetic */ UkExperienceTestQuestionnaire copy$default(UkExperienceTestQuestionnaire ukExperienceTestQuestionnaire, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukExperienceTestQuestionnaire.screenId;
            }
            return ukExperienceTestQuestionnaire.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkExperienceTestQuestionnaire copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkExperienceTestQuestionnaire(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkExperienceTestQuestionnaire) && Intrinsics.areEqual(this.screenId, ((UkExperienceTestQuestionnaire) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkExperienceTestQuestionnaire(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkExperienceTestQuestionnaire(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.ExperienceTestQuestionnaire(new ExperienceTestQuestionnaireRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkKnowledgeTestQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkKnowledgeTestQuestionnaire extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkKnowledgeTestQuestionnaire> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkKnowledgeTestQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkKnowledgeTestQuestionnaire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkKnowledgeTestQuestionnaire((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkKnowledgeTestQuestionnaire[] newArray(int i) {
                return new UkKnowledgeTestQuestionnaire[i];
            }
        }

        public static /* synthetic */ UkKnowledgeTestQuestionnaire copy$default(UkKnowledgeTestQuestionnaire ukKnowledgeTestQuestionnaire, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukKnowledgeTestQuestionnaire.screenId;
            }
            return ukKnowledgeTestQuestionnaire.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkKnowledgeTestQuestionnaire copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkKnowledgeTestQuestionnaire(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkKnowledgeTestQuestionnaire) && Intrinsics.areEqual(this.screenId, ((UkKnowledgeTestQuestionnaire) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkKnowledgeTestQuestionnaire(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkKnowledgeTestQuestionnaire(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.KnowledgeTestQuestionnaire(new KnowledgeTestQuestionnaireRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "isProfessionalTrader", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkProfessionalTrader extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkProfessionalTrader> CREATOR = new Creator();
        private final boolean isProfessionalTrader;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkProfessionalTrader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkProfessionalTrader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkProfessionalTrader(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkProfessionalTrader[] newArray(int i) {
                return new UkProfessionalTrader[i];
            }
        }

        public static /* synthetic */ UkProfessionalTrader copy$default(UkProfessionalTrader ukProfessionalTrader, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ukProfessionalTrader.isProfessionalTrader;
            }
            if ((i & 2) != 0) {
                uuid = ukProfessionalTrader.screenId;
            }
            return ukProfessionalTrader.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsProfessionalTrader() {
            return this.isProfessionalTrader;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkProfessionalTrader copy(boolean isProfessionalTrader, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkProfessionalTrader(isProfessionalTrader, screenId);
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
            return this.isProfessionalTrader == ukProfessionalTrader.isProfessionalTrader && Intrinsics.areEqual(this.screenId, ukProfessionalTrader.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isProfessionalTrader) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "UkProfessionalTrader(isProfessionalTrader=" + this.isProfessionalTrader + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isProfessionalTrader ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean isProfessionalTrader() {
            return this.isProfessionalTrader;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkProfessionalTrader(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isProfessionalTrader = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.EducationProfessionalTrader(new UKEducationProfessionalTraderRequestMetadataDto(this.isProfessionalTrader)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkSplashL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkSplashL2 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkSplashL2> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkSplashL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkSplashL2((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkSplashL2[] newArray(int i) {
                return new UkSplashL2[i];
            }
        }

        public static /* synthetic */ UkSplashL2 copy$default(UkSplashL2 ukSplashL2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukSplashL2.screenId;
            }
            return ukSplashL2.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkSplashL2 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkSplashL2(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkSplashL2) && Intrinsics.areEqual(this.screenId, ((UkSplashL2) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkSplashL2(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkSplashL2(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.UkL3EducationHome(new UKL3EducationHomeRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$UkEducationBenefitsL2;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkEducationBenefitsL2 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UkEducationBenefitsL2> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UkEducationBenefitsL2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefitsL2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UkEducationBenefitsL2((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UkEducationBenefitsL2[] newArray(int i) {
                return new UkEducationBenefitsL2[i];
            }
        }

        public static /* synthetic */ UkEducationBenefitsL2 copy$default(UkEducationBenefitsL2 ukEducationBenefitsL2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ukEducationBenefitsL2.screenId;
            }
            return ukEducationBenefitsL2.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final UkEducationBenefitsL2 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new UkEducationBenefitsL2(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkEducationBenefitsL2) && Intrinsics.areEqual(this.screenId, ((UkEducationBenefitsL2) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "UkEducationBenefitsL2(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkEducationBenefitsL2(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.UkL3EducationSpreadBenefits(new UKL3EducationSpreadBenefitsRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgSplashL0;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgSplashL0 extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgSplashL0> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgSplashL0> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgSplashL0 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhsgSplashL0((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgSplashL0[] newArray(int i) {
                return new RhsgSplashL0[i];
            }
        }

        public static /* synthetic */ RhsgSplashL0 copy$default(RhsgSplashL0 rhsgSplashL0, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhsgSplashL0.screenId;
            }
            return rhsgSplashL0.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgSplashL0 copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgSplashL0(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhsgSplashL0) && Intrinsics.areEqual(this.screenId, ((RhsgSplashL0) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgSplashL0(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgSplashL0(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.RhsgHome(new RHSGHomeRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgCustomerAccountReviewQuestionnaire;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgCustomerAccountReviewQuestionnaire extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgCustomerAccountReviewQuestionnaire> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgCustomerAccountReviewQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgCustomerAccountReviewQuestionnaire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhsgCustomerAccountReviewQuestionnaire((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgCustomerAccountReviewQuestionnaire[] newArray(int i) {
                return new RhsgCustomerAccountReviewQuestionnaire[i];
            }
        }

        public static /* synthetic */ RhsgCustomerAccountReviewQuestionnaire copy$default(RhsgCustomerAccountReviewQuestionnaire rhsgCustomerAccountReviewQuestionnaire, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhsgCustomerAccountReviewQuestionnaire.screenId;
            }
            return rhsgCustomerAccountReviewQuestionnaire.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgCustomerAccountReviewQuestionnaire copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgCustomerAccountReviewQuestionnaire(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhsgCustomerAccountReviewQuestionnaire) && Intrinsics.areEqual(this.screenId, ((RhsgCustomerAccountReviewQuestionnaire) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgCustomerAccountReviewQuestionnaire(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgCustomerAccountReviewQuestionnaire(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.RhsgCompleteCarQuestionnaire(new RHSGCompleteCARQuestionnaireRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgProfessionalTrader;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "isProfessionalTrader", "", "screenId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "()Z", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgProfessionalTrader extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgProfessionalTrader> CREATOR = new Creator();
        private final boolean isProfessionalTrader;
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgProfessionalTrader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgProfessionalTrader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhsgProfessionalTrader(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgProfessionalTrader[] newArray(int i) {
                return new RhsgProfessionalTrader[i];
            }
        }

        public static /* synthetic */ RhsgProfessionalTrader copy$default(RhsgProfessionalTrader rhsgProfessionalTrader, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhsgProfessionalTrader.isProfessionalTrader;
            }
            if ((i & 2) != 0) {
                uuid = rhsgProfessionalTrader.screenId;
            }
            return rhsgProfessionalTrader.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsProfessionalTrader() {
            return this.isProfessionalTrader;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgProfessionalTrader copy(boolean isProfessionalTrader, UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgProfessionalTrader(isProfessionalTrader, screenId);
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
            return this.isProfessionalTrader == rhsgProfessionalTrader.isProfessionalTrader && Intrinsics.areEqual(this.screenId, rhsgProfessionalTrader.screenId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isProfessionalTrader) * 31) + this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgProfessionalTrader(isProfessionalTrader=" + this.isProfessionalTrader + ", screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isProfessionalTrader ? 1 : 0);
            dest.writeSerializable(this.screenId);
        }

        public final boolean isProfessionalTrader() {
            return this.isProfessionalTrader;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgProfessionalTrader(boolean z, UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.isProfessionalTrader = z;
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.ProfessionalTrader(new ProfessionalTraderRequestMetadataDto(this.isProfessionalTrader)));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgL2ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgL2ApprovedTrades extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgL2ApprovedTrades> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgL2ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL2ApprovedTrades createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhsgL2ApprovedTrades((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL2ApprovedTrades[] newArray(int i) {
                return new RhsgL2ApprovedTrades[i];
            }
        }

        public static /* synthetic */ RhsgL2ApprovedTrades copy$default(RhsgL2ApprovedTrades rhsgL2ApprovedTrades, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhsgL2ApprovedTrades.screenId;
            }
            return rhsgL2ApprovedTrades.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgL2ApprovedTrades copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgL2ApprovedTrades(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhsgL2ApprovedTrades) && Intrinsics.areEqual(this.screenId, ((RhsgL2ApprovedTrades) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgL2ApprovedTrades(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgL2ApprovedTrades(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.RhsgL2ApprovedTrades(new RHSGL2ApprovedTradesRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$RhsgL3ApprovedTrades;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhsgL3ApprovedTrades extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RhsgL3ApprovedTrades> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhsgL3ApprovedTrades> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL3ApprovedTrades createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhsgL3ApprovedTrades((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhsgL3ApprovedTrades[] newArray(int i) {
                return new RhsgL3ApprovedTrades[i];
            }
        }

        public static /* synthetic */ RhsgL3ApprovedTrades copy$default(RhsgL3ApprovedTrades rhsgL3ApprovedTrades, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhsgL3ApprovedTrades.screenId;
            }
            return rhsgL3ApprovedTrades.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final RhsgL3ApprovedTrades copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new RhsgL3ApprovedTrades(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhsgL3ApprovedTrades) && Intrinsics.areEqual(this.screenId, ((RhsgL3ApprovedTrades) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "RhsgL3ApprovedTrades(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhsgL3ApprovedTrades(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.RhsgL3ApprovedTrades(new RHSGL3ApprovedTradesRequestMetadataDto()));
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ScreenRequest$JointAccountPendingApplication;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getScreenId", "()Ljava/util/UUID;", "toDto", "Loptions_product/service/OnboardingScreenRequestDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class JointAccountPendingApplication extends ScreenRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<JointAccountPendingApplication> CREATOR = new Creator();
        private final UUID screenId;

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<JointAccountPendingApplication> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JointAccountPendingApplication createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointAccountPendingApplication((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JointAccountPendingApplication[] newArray(int i) {
                return new JointAccountPendingApplication[i];
            }
        }

        public static /* synthetic */ JointAccountPendingApplication copy$default(JointAccountPendingApplication jointAccountPendingApplication, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = jointAccountPendingApplication.screenId;
            }
            return jointAccountPendingApplication.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getScreenId() {
            return this.screenId;
        }

        public final JointAccountPendingApplication copy(UUID screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            return new JointAccountPendingApplication(screenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JointAccountPendingApplication) && Intrinsics.areEqual(this.screenId, ((JointAccountPendingApplication) other).screenId);
        }

        public int hashCode() {
            return this.screenId.hashCode();
        }

        public String toString() {
            return "JointAccountPendingApplication(screenId=" + this.screenId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screenId);
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public UUID getScreenId() {
            return this.screenId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JointAccountPendingApplication(UUID screenId) {
            super(screenId, null);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.screenId = screenId;
        }

        @Override // com.robinhood.android.optionsupgrade.ScreenRequest
        public OnboardingScreenRequestDto toDto() {
            return new OnboardingScreenRequestDto(new OnboardingScreenRequestDto.RequestMetadataDto.JaPendingApplication(new JAPendingApplicationMetadataDto()));
        }
    }
}
