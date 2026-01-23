package com.robinhood.android.optionsupgrade;

import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00105J¶\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u001b2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;", "", "accountNumber", "", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "screenRequests", "", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenArgsInBackstack", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "currentScreen", "screenArgsRemaining", "sessionId", "Ljava/util/UUID;", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "ongoingEndpointRequestStartedAt", "", "i18nOptionsOnboardingContent", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "onboardingExperimentsAssignment", "", "Lcom/robinhood/android/optionsupgrade/OptionUpgradeExperimentType;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "inOptionsPostEnableExperiment", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Ljava/util/List;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/lang/Long;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/util/Map;Ljava/lang/Boolean;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingSource", "getScreenRequests", "()Ljava/util/List;", "getScreenArgsInBackstack", "getCurrentScreen", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgsRemaining", "getSessionId", "()Ljava/util/UUID;", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getOngoingEndpointRequestStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getI18nOptionsOnboardingContent", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getOnboardingExperimentsAssignment", "()Ljava/util/Map;", "getInOptionsPostEnableExperiment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Ljava/util/List;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/lang/Long;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;", "equals", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ScreenArgs currentScreen;
    private final UkOptionsOnboardingContent i18nOptionsOnboardingContent;
    private final Boolean inOptionsPostEnableExperiment;
    private final CountryCode.Supported locality;
    private final String loggingSource;
    private final Map<OptionUpgradeExperimentType, OptionOnboardingExperimentState> onboardingExperimentsAssignment;
    private final OptionOnboardingProgress onboardingProgress;
    private final Long ongoingEndpointRequestStartedAt;
    private final List<ScreenArgs> screenArgsInBackstack;
    private final List<ScreenArgs> screenArgsRemaining;
    private final List<ScreenRequest> screenRequests;
    private final UUID sessionId;

    public static /* synthetic */ OptionOnboardingDataState copy$default(OptionOnboardingDataState optionOnboardingDataState, String str, String str2, List list, List list2, ScreenArgs screenArgs, List list3, UUID uuid, OptionOnboardingProgress optionOnboardingProgress, Long l, UkOptionsOnboardingContent ukOptionsOnboardingContent, CountryCode.Supported supported, Map map, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOnboardingDataState.accountNumber;
        }
        return optionOnboardingDataState.copy(str, (i & 2) != 0 ? optionOnboardingDataState.loggingSource : str2, (i & 4) != 0 ? optionOnboardingDataState.screenRequests : list, (i & 8) != 0 ? optionOnboardingDataState.screenArgsInBackstack : list2, (i & 16) != 0 ? optionOnboardingDataState.currentScreen : screenArgs, (i & 32) != 0 ? optionOnboardingDataState.screenArgsRemaining : list3, (i & 64) != 0 ? optionOnboardingDataState.sessionId : uuid, (i & 128) != 0 ? optionOnboardingDataState.onboardingProgress : optionOnboardingProgress, (i & 256) != 0 ? optionOnboardingDataState.ongoingEndpointRequestStartedAt : l, (i & 512) != 0 ? optionOnboardingDataState.i18nOptionsOnboardingContent : ukOptionsOnboardingContent, (i & 1024) != 0 ? optionOnboardingDataState.locality : supported, (i & 2048) != 0 ? optionOnboardingDataState.onboardingExperimentsAssignment : map, (i & 4096) != 0 ? optionOnboardingDataState.inOptionsPostEnableExperiment : bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final UkOptionsOnboardingContent getI18nOptionsOnboardingContent() {
        return this.i18nOptionsOnboardingContent;
    }

    /* renamed from: component11, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final Map<OptionUpgradeExperimentType, OptionOnboardingExperimentState> component12() {
        return this.onboardingExperimentsAssignment;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getInOptionsPostEnableExperiment() {
        return this.inOptionsPostEnableExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final List<ScreenRequest> component3() {
        return this.screenRequests;
    }

    public final List<ScreenArgs> component4() {
        return this.screenArgsInBackstack;
    }

    /* renamed from: component5, reason: from getter */
    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final List<ScreenArgs> component6() {
        return this.screenArgsRemaining;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionOnboardingProgress getOnboardingProgress() {
        return this.onboardingProgress;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getOngoingEndpointRequestStartedAt() {
        return this.ongoingEndpointRequestStartedAt;
    }

    public final OptionOnboardingDataState copy(String accountNumber, String loggingSource, List<? extends ScreenRequest> screenRequests, List<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, List<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress, Long ongoingEndpointRequestStartedAt, UkOptionsOnboardingContent i18nOptionsOnboardingContent, CountryCode.Supported locality, Map<OptionUpgradeExperimentType, ? extends OptionOnboardingExperimentState> onboardingExperimentsAssignment, Boolean inOptionsPostEnableExperiment) {
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(screenRequests, "screenRequests");
        Intrinsics.checkNotNullParameter(screenArgsInBackstack, "screenArgsInBackstack");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(screenArgsRemaining, "screenArgsRemaining");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(onboardingExperimentsAssignment, "onboardingExperimentsAssignment");
        return new OptionOnboardingDataState(accountNumber, loggingSource, screenRequests, screenArgsInBackstack, currentScreen, screenArgsRemaining, sessionId, onboardingProgress, ongoingEndpointRequestStartedAt, i18nOptionsOnboardingContent, locality, onboardingExperimentsAssignment, inOptionsPostEnableExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingDataState)) {
            return false;
        }
        OptionOnboardingDataState optionOnboardingDataState = (OptionOnboardingDataState) other;
        return Intrinsics.areEqual(this.accountNumber, optionOnboardingDataState.accountNumber) && Intrinsics.areEqual(this.loggingSource, optionOnboardingDataState.loggingSource) && Intrinsics.areEqual(this.screenRequests, optionOnboardingDataState.screenRequests) && Intrinsics.areEqual(this.screenArgsInBackstack, optionOnboardingDataState.screenArgsInBackstack) && Intrinsics.areEqual(this.currentScreen, optionOnboardingDataState.currentScreen) && Intrinsics.areEqual(this.screenArgsRemaining, optionOnboardingDataState.screenArgsRemaining) && Intrinsics.areEqual(this.sessionId, optionOnboardingDataState.sessionId) && this.onboardingProgress == optionOnboardingDataState.onboardingProgress && Intrinsics.areEqual(this.ongoingEndpointRequestStartedAt, optionOnboardingDataState.ongoingEndpointRequestStartedAt) && Intrinsics.areEqual(this.i18nOptionsOnboardingContent, optionOnboardingDataState.i18nOptionsOnboardingContent) && Intrinsics.areEqual(this.locality, optionOnboardingDataState.locality) && Intrinsics.areEqual(this.onboardingExperimentsAssignment, optionOnboardingDataState.onboardingExperimentsAssignment) && Intrinsics.areEqual(this.inOptionsPostEnableExperiment, optionOnboardingDataState.inOptionsPostEnableExperiment);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.loggingSource.hashCode()) * 31) + this.screenRequests.hashCode()) * 31) + this.screenArgsInBackstack.hashCode()) * 31) + this.currentScreen.hashCode()) * 31) + this.screenArgsRemaining.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.onboardingProgress.hashCode()) * 31;
        Long l = this.ongoingEndpointRequestStartedAt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        UkOptionsOnboardingContent ukOptionsOnboardingContent = this.i18nOptionsOnboardingContent;
        int iHashCode3 = (((((iHashCode2 + (ukOptionsOnboardingContent == null ? 0 : ukOptionsOnboardingContent.hashCode())) * 31) + this.locality.hashCode()) * 31) + this.onboardingExperimentsAssignment.hashCode()) * 31;
        Boolean bool = this.inOptionsPostEnableExperiment;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "OptionOnboardingDataState(accountNumber=" + this.accountNumber + ", loggingSource=" + this.loggingSource + ", screenRequests=" + this.screenRequests + ", screenArgsInBackstack=" + this.screenArgsInBackstack + ", currentScreen=" + this.currentScreen + ", screenArgsRemaining=" + this.screenArgsRemaining + ", sessionId=" + this.sessionId + ", onboardingProgress=" + this.onboardingProgress + ", ongoingEndpointRequestStartedAt=" + this.ongoingEndpointRequestStartedAt + ", i18nOptionsOnboardingContent=" + this.i18nOptionsOnboardingContent + ", locality=" + this.locality + ", onboardingExperimentsAssignment=" + this.onboardingExperimentsAssignment + ", inOptionsPostEnableExperiment=" + this.inOptionsPostEnableExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionOnboardingDataState(String str, String loggingSource, List<? extends ScreenRequest> screenRequests, List<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, List<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress, Long l, UkOptionsOnboardingContent ukOptionsOnboardingContent, CountryCode.Supported locality, Map<OptionUpgradeExperimentType, ? extends OptionOnboardingExperimentState> onboardingExperimentsAssignment, Boolean bool) {
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(screenRequests, "screenRequests");
        Intrinsics.checkNotNullParameter(screenArgsInBackstack, "screenArgsInBackstack");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(screenArgsRemaining, "screenArgsRemaining");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(onboardingExperimentsAssignment, "onboardingExperimentsAssignment");
        this.accountNumber = str;
        this.loggingSource = loggingSource;
        this.screenRequests = screenRequests;
        this.screenArgsInBackstack = screenArgsInBackstack;
        this.currentScreen = currentScreen;
        this.screenArgsRemaining = screenArgsRemaining;
        this.sessionId = sessionId;
        this.onboardingProgress = onboardingProgress;
        this.ongoingEndpointRequestStartedAt = l;
        this.i18nOptionsOnboardingContent = ukOptionsOnboardingContent;
        this.locality = locality;
        this.onboardingExperimentsAssignment = onboardingExperimentsAssignment;
        this.inOptionsPostEnableExperiment = bool;
    }

    public /* synthetic */ OptionOnboardingDataState(String str, String str2, List list, List list2, ScreenArgs screenArgs, List list3, UUID uuid, OptionOnboardingProgress optionOnboardingProgress, Long l, UkOptionsOnboardingContent ukOptionsOnboardingContent, CountryCode.Supported supported, Map map, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, list, list2, screenArgs, list3, uuid, optionOnboardingProgress, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : ukOptionsOnboardingContent, supported, map, (i & 4096) != 0 ? null : bool);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final List<ScreenRequest> getScreenRequests() {
        return this.screenRequests;
    }

    public final List<ScreenArgs> getScreenArgsInBackstack() {
        return this.screenArgsInBackstack;
    }

    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final List<ScreenArgs> getScreenArgsRemaining() {
        return this.screenArgsRemaining;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final OptionOnboardingProgress getOnboardingProgress() {
        return this.onboardingProgress;
    }

    public final Long getOngoingEndpointRequestStartedAt() {
        return this.ongoingEndpointRequestStartedAt;
    }

    public final UkOptionsOnboardingContent getI18nOptionsOnboardingContent() {
        return this.i18nOptionsOnboardingContent;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final Map<OptionUpgradeExperimentType, OptionOnboardingExperimentState> getOnboardingExperimentsAssignment() {
        return this.onboardingExperimentsAssignment;
    }

    public final Boolean getInOptionsPostEnableExperiment() {
        return this.inOptionsPostEnableExperiment;
    }
}
