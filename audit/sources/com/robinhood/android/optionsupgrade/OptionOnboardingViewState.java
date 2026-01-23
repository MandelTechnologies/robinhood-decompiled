package com.robinhood.android.optionsupgrade;

import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0015HÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00105J¶\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u001b2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingViewState;", "", "accountNumber", "", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "screenRequests", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenArgsInBackstack", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "currentScreen", "screenArgsRemaining", "sessionId", "Ljava/util/UUID;", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "ongoingEndpointRequestStartedAt", "", "i18nOptionsOnboardingContent", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "onboardingExperimentsAssignment", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/optionsupgrade/OptionUpgradeExperimentType;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "inOptionsPostEnableExperiment", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/lang/Long;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/Boolean;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingSource", "getScreenRequests", "()Lkotlinx/collections/immutable/ImmutableList;", "getScreenArgsInBackstack", "getCurrentScreen", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgsRemaining", "getSessionId", "()Ljava/util/UUID;", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "getOngoingEndpointRequestStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getI18nOptionsOnboardingContent", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getOnboardingExperimentsAssignment", "()Lkotlinx/collections/immutable/ImmutableMap;", "getInOptionsPostEnableExperiment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "optionOnboardingContext", "Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "getOptionOnboardingContext", "()Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;Ljava/lang/Long;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/Boolean;)Lcom/robinhood/android/optionsupgrade/OptionOnboardingViewState;", "equals", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ScreenArgs currentScreen;
    private final UkOptionsOnboardingContent i18nOptionsOnboardingContent;
    private final Boolean inOptionsPostEnableExperiment;
    private final CountryCode.Supported locality;
    private final String loggingSource;
    private final ImmutableMap<OptionUpgradeExperimentType, OptionOnboardingExperimentState> onboardingExperimentsAssignment;
    private final OptionOnboardingProgress onboardingProgress;
    private final Long ongoingEndpointRequestStartedAt;
    private final OptionOnboardingContext optionOnboardingContext;
    private final ImmutableList<ScreenArgs> screenArgsInBackstack;
    private final ImmutableList<ScreenArgs> screenArgsRemaining;
    private final ImmutableList<ScreenRequest> screenRequests;
    private final UUID sessionId;

    public static /* synthetic */ OptionOnboardingViewState copy$default(OptionOnboardingViewState optionOnboardingViewState, String str, String str2, ImmutableList immutableList, ImmutableList immutableList2, ScreenArgs screenArgs, ImmutableList immutableList3, UUID uuid, OptionOnboardingProgress optionOnboardingProgress, Long l, UkOptionsOnboardingContent ukOptionsOnboardingContent, CountryCode.Supported supported, ImmutableMap immutableMap, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOnboardingViewState.accountNumber;
        }
        return optionOnboardingViewState.copy(str, (i & 2) != 0 ? optionOnboardingViewState.loggingSource : str2, (i & 4) != 0 ? optionOnboardingViewState.screenRequests : immutableList, (i & 8) != 0 ? optionOnboardingViewState.screenArgsInBackstack : immutableList2, (i & 16) != 0 ? optionOnboardingViewState.currentScreen : screenArgs, (i & 32) != 0 ? optionOnboardingViewState.screenArgsRemaining : immutableList3, (i & 64) != 0 ? optionOnboardingViewState.sessionId : uuid, (i & 128) != 0 ? optionOnboardingViewState.onboardingProgress : optionOnboardingProgress, (i & 256) != 0 ? optionOnboardingViewState.ongoingEndpointRequestStartedAt : l, (i & 512) != 0 ? optionOnboardingViewState.i18nOptionsOnboardingContent : ukOptionsOnboardingContent, (i & 1024) != 0 ? optionOnboardingViewState.locality : supported, (i & 2048) != 0 ? optionOnboardingViewState.onboardingExperimentsAssignment : immutableMap, (i & 4096) != 0 ? optionOnboardingViewState.inOptionsPostEnableExperiment : bool);
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

    public final ImmutableMap<OptionUpgradeExperimentType, OptionOnboardingExperimentState> component12() {
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

    public final ImmutableList<ScreenRequest> component3() {
        return this.screenRequests;
    }

    public final ImmutableList<ScreenArgs> component4() {
        return this.screenArgsInBackstack;
    }

    /* renamed from: component5, reason: from getter */
    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final ImmutableList<ScreenArgs> component6() {
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

    public final OptionOnboardingViewState copy(String accountNumber, String loggingSource, ImmutableList<? extends ScreenRequest> screenRequests, ImmutableList<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, ImmutableList<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress, Long ongoingEndpointRequestStartedAt, UkOptionsOnboardingContent i18nOptionsOnboardingContent, CountryCode.Supported locality, ImmutableMap<OptionUpgradeExperimentType, ? extends OptionOnboardingExperimentState> onboardingExperimentsAssignment, Boolean inOptionsPostEnableExperiment) {
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(screenRequests, "screenRequests");
        Intrinsics.checkNotNullParameter(screenArgsInBackstack, "screenArgsInBackstack");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(screenArgsRemaining, "screenArgsRemaining");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(onboardingExperimentsAssignment, "onboardingExperimentsAssignment");
        return new OptionOnboardingViewState(accountNumber, loggingSource, screenRequests, screenArgsInBackstack, currentScreen, screenArgsRemaining, sessionId, onboardingProgress, ongoingEndpointRequestStartedAt, i18nOptionsOnboardingContent, locality, onboardingExperimentsAssignment, inOptionsPostEnableExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingViewState)) {
            return false;
        }
        OptionOnboardingViewState optionOnboardingViewState = (OptionOnboardingViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionOnboardingViewState.accountNumber) && Intrinsics.areEqual(this.loggingSource, optionOnboardingViewState.loggingSource) && Intrinsics.areEqual(this.screenRequests, optionOnboardingViewState.screenRequests) && Intrinsics.areEqual(this.screenArgsInBackstack, optionOnboardingViewState.screenArgsInBackstack) && Intrinsics.areEqual(this.currentScreen, optionOnboardingViewState.currentScreen) && Intrinsics.areEqual(this.screenArgsRemaining, optionOnboardingViewState.screenArgsRemaining) && Intrinsics.areEqual(this.sessionId, optionOnboardingViewState.sessionId) && this.onboardingProgress == optionOnboardingViewState.onboardingProgress && Intrinsics.areEqual(this.ongoingEndpointRequestStartedAt, optionOnboardingViewState.ongoingEndpointRequestStartedAt) && Intrinsics.areEqual(this.i18nOptionsOnboardingContent, optionOnboardingViewState.i18nOptionsOnboardingContent) && Intrinsics.areEqual(this.locality, optionOnboardingViewState.locality) && Intrinsics.areEqual(this.onboardingExperimentsAssignment, optionOnboardingViewState.onboardingExperimentsAssignment) && Intrinsics.areEqual(this.inOptionsPostEnableExperiment, optionOnboardingViewState.inOptionsPostEnableExperiment);
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
        return "OptionOnboardingViewState(accountNumber=" + this.accountNumber + ", loggingSource=" + this.loggingSource + ", screenRequests=" + this.screenRequests + ", screenArgsInBackstack=" + this.screenArgsInBackstack + ", currentScreen=" + this.currentScreen + ", screenArgsRemaining=" + this.screenArgsRemaining + ", sessionId=" + this.sessionId + ", onboardingProgress=" + this.onboardingProgress + ", ongoingEndpointRequestStartedAt=" + this.ongoingEndpointRequestStartedAt + ", i18nOptionsOnboardingContent=" + this.i18nOptionsOnboardingContent + ", locality=" + this.locality + ", onboardingExperimentsAssignment=" + this.onboardingExperimentsAssignment + ", inOptionsPostEnableExperiment=" + this.inOptionsPostEnableExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionOnboardingViewState(String str, String loggingSource, ImmutableList<? extends ScreenRequest> screenRequests, ImmutableList<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, ImmutableList<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress, Long l, UkOptionsOnboardingContent ukOptionsOnboardingContent, CountryCode.Supported locality, ImmutableMap<OptionUpgradeExperimentType, ? extends OptionOnboardingExperimentState> onboardingExperimentsAssignment, Boolean bool) {
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
        String str2 = str;
        str2 = str2 == null ? "" : str2;
        String string2 = sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.optionOnboardingContext = new OptionOnboardingContext(str2, loggingSource, string2, null, 8, null);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final ImmutableList<ScreenRequest> getScreenRequests() {
        return this.screenRequests;
    }

    public final ImmutableList<ScreenArgs> getScreenArgsInBackstack() {
        return this.screenArgsInBackstack;
    }

    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final ImmutableList<ScreenArgs> getScreenArgsRemaining() {
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

    public final ImmutableMap<OptionUpgradeExperimentType, OptionOnboardingExperimentState> getOnboardingExperimentsAssignment() {
        return this.onboardingExperimentsAssignment;
    }

    public final Boolean getInOptionsPostEnableExperiment() {
        return this.inOptionsPostEnableExperiment;
    }

    public final OptionOnboardingContext getOptionOnboardingContext() {
        return this.optionOnboardingContext;
    }
}
