package com.robinhood.android.advisory.onboarding.questionnaire;

import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioQuestionnaireIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState;", "", "entryPoint", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "applicationId", "Ljava/util/UUID;", "error", "Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;", "<init>", "(Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;)V", "getEntryPoint", "()Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Ljava/lang/String;", "getApplicationId", "()Ljava/util/UUID;", "getError", "()Lcom/robinhood/android/advisory/onboarding/questionnaire/ErrorDialogData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PortfolioQuestionnaireIntroDataState {
    private final UUID applicationId;
    private final BrokerageAccountType brokerageAccountType;
    private final AdvisoryOnboardingKey.EntryPoint entryPoint;
    private final ErrorDialogData error;
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PortfolioQuestionnaireIntroDataState copy$default(PortfolioQuestionnaireIntroDataState portfolioQuestionnaireIntroDataState, AdvisoryOnboardingKey.EntryPoint entryPoint, BrokerageAccountType brokerageAccountType, String str, UUID uuid, ErrorDialogData errorDialogData, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = portfolioQuestionnaireIntroDataState.entryPoint;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = portfolioQuestionnaireIntroDataState.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            str = portfolioQuestionnaireIntroDataState.source;
        }
        if ((i & 8) != 0) {
            uuid = portfolioQuestionnaireIntroDataState.applicationId;
        }
        if ((i & 16) != 0) {
            errorDialogData = portfolioQuestionnaireIntroDataState.error;
        }
        ErrorDialogData errorDialogData2 = errorDialogData;
        String str2 = str;
        return portfolioQuestionnaireIntroDataState.copy(entryPoint, brokerageAccountType, str2, uuid, errorDialogData2);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisoryOnboardingKey.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component5, reason: from getter */
    public final ErrorDialogData getError() {
        return this.error;
    }

    public final PortfolioQuestionnaireIntroDataState copy(AdvisoryOnboardingKey.EntryPoint entryPoint, BrokerageAccountType brokerageAccountType, String source, UUID applicationId, ErrorDialogData error) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        return new PortfolioQuestionnaireIntroDataState(entryPoint, brokerageAccountType, source, applicationId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioQuestionnaireIntroDataState)) {
            return false;
        }
        PortfolioQuestionnaireIntroDataState portfolioQuestionnaireIntroDataState = (PortfolioQuestionnaireIntroDataState) other;
        return Intrinsics.areEqual(this.entryPoint, portfolioQuestionnaireIntroDataState.entryPoint) && this.brokerageAccountType == portfolioQuestionnaireIntroDataState.brokerageAccountType && Intrinsics.areEqual(this.source, portfolioQuestionnaireIntroDataState.source) && Intrinsics.areEqual(this.applicationId, portfolioQuestionnaireIntroDataState.applicationId) && Intrinsics.areEqual(this.error, portfolioQuestionnaireIntroDataState.error);
    }

    public int hashCode() {
        int iHashCode = ((((this.entryPoint.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.source.hashCode()) * 31;
        UUID uuid = this.applicationId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        ErrorDialogData errorDialogData = this.error;
        return iHashCode2 + (errorDialogData != null ? errorDialogData.hashCode() : 0);
    }

    public String toString() {
        return "PortfolioQuestionnaireIntroDataState(entryPoint=" + this.entryPoint + ", brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ", applicationId=" + this.applicationId + ", error=" + this.error + ")";
    }

    public PortfolioQuestionnaireIntroDataState(AdvisoryOnboardingKey.EntryPoint entryPoint, BrokerageAccountType brokerageAccountType, String source, UUID uuid, ErrorDialogData errorDialogData) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.entryPoint = entryPoint;
        this.brokerageAccountType = brokerageAccountType;
        this.source = source;
        this.applicationId = uuid;
        this.error = errorDialogData;
    }

    public /* synthetic */ PortfolioQuestionnaireIntroDataState(AdvisoryOnboardingKey.EntryPoint entryPoint, BrokerageAccountType brokerageAccountType, String str, UUID uuid, ErrorDialogData errorDialogData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(entryPoint, brokerageAccountType, str, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : errorDialogData);
    }

    public final AdvisoryOnboardingKey.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final String getSource() {
        return this.source;
    }

    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final ErrorDialogData getError() {
        return this.error;
    }

    /* compiled from: PortfolioQuestionnaireIntroDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<PortfolioQuestionnaireIntroDataState, PortfolioQuestionnaireIntroViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public PortfolioQuestionnaireIntroViewState reduce(PortfolioQuestionnaireIntroDataState dataState) {
            StringResource stringResourceInvoke;
            StringResource stringResourceInvoke2;
            PortfolioQuestionnaireIntroViewState.Asset lottie;
            String str;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            BrokerageAccountType brokerageAccountType = dataState.getBrokerageAccountType();
            String source = dataState.getSource();
            UUID applicationId = dataState.getApplicationId();
            ErrorDialogData error = dataState.getError();
            boolean z = dataState.getApplicationId() == null;
            AdvisoryOnboardingKey.EntryPoint entryPoint = dataState.getEntryPoint();
            AdvisoryOnboardingKey.EntryPoint.ManuallySelectedAdvisory manuallySelectedAdvisory = AdvisoryOnboardingKey.EntryPoint.ManuallySelectedAdvisory.INSTANCE;
            boolean zAreEqual = Intrinsics.areEqual(entryPoint, manuallySelectedAdvisory);
            AdvisoryOnboardingKey.EntryPoint entryPoint2 = dataState.getEntryPoint();
            AdvisoryOnboardingKey.EntryPoint.RxRSunset rxRSunset = entryPoint2 instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset ? (AdvisoryOnboardingKey.EntryPoint.RxRSunset) entryPoint2 : null;
            String disclosure = rxRSunset != null ? rxRSunset.getDisclosure() : null;
            AdvisoryOnboardingKey.EntryPoint entryPoint3 = dataState.getEntryPoint();
            if (Intrinsics.areEqual(entryPoint3, manuallySelectedAdvisory) || Intrinsics.areEqual(entryPoint3, AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE)) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C8825R.string.portfolio_questionnaire_intro_title, new Object[0]);
            } else {
                if (!(entryPoint3 instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(((AdvisoryOnboardingKey.EntryPoint.RxRSunset) dataState.getEntryPoint()).getTitle());
            }
            StringResource stringResource = stringResourceInvoke;
            AdvisoryOnboardingKey.EntryPoint entryPoint4 = dataState.getEntryPoint();
            if (Intrinsics.areEqual(entryPoint4, manuallySelectedAdvisory)) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8825R.string.portfolio_questionnaire_intro_subtitle_manually_selected, PortfolioQuestionnaireIntroScreen3.getGoalStringResource(dataState.getBrokerageAccountType()));
            } else if (Intrinsics.areEqual(entryPoint4, AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE)) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8825R.string.portfolio_questionnaire_intro_subtitle_pre_selected, PortfolioQuestionnaireIntroScreen3.getGoalStringResource(dataState.getBrokerageAccountType()));
            } else {
                if (!(entryPoint4 instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(((AdvisoryOnboardingKey.EntryPoint.RxRSunset) dataState.getEntryPoint()).getSubtitle());
            }
            AdvisoryOnboardingKey.EntryPoint entryPoint5 = dataState.getEntryPoint();
            if (Intrinsics.areEqual(entryPoint5, manuallySelectedAdvisory)) {
                lottie = PortfolioQuestionnaireIntroViewState.Asset.Video.INSTANCE;
            } else if (Intrinsics.areEqual(entryPoint5, AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE)) {
                lottie = new PortfolioQuestionnaireIntroViewState.Asset.Lottie(PortfolioQuestionnaireIntroScreen3.LightModeLottie, PortfolioQuestionnaireIntroScreen3.DarkModeLottie, false, 4, null);
            } else {
                if (!(entryPoint5 instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                    throw new NoWhenBranchMatchedException();
                }
                lottie = new PortfolioQuestionnaireIntroViewState.Asset.Lottie(AdvisoryFirstDepositSubmitComposableKt.CelebrationLightModeLottie, AdvisoryFirstDepositSubmitComposableKt.CelebrationDarkModeLottie, true);
            }
            AdvisoryOnboardingKey.EntryPoint entryPoint6 = dataState.getEntryPoint();
            if (Intrinsics.areEqual(entryPoint6, manuallySelectedAdvisory)) {
                str = "selected_strategies";
            } else if (Intrinsics.areEqual(entryPoint6, AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE)) {
                str = "from_strategies_upsell";
            } else {
                if (!(entryPoint6 instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "rxr_sunset";
            }
            return new PortfolioQuestionnaireIntroViewState(brokerageAccountType, stringResource, stringResourceInvoke2, str, source, lottie, error, disclosure, applicationId, z, zAreEqual);
        }
    }
}
