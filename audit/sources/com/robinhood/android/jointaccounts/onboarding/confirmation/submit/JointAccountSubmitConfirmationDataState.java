package com.robinhood.android.jointaccounts.onboarding.confirmation.submit;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCta;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondarySubmittedViewModel;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JointAccountSubmitConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JI\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;", "", "source", "", "enoughTimeHasElapsedToShowLoadingText", "", "viewModel", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel;", "attempts", "", "creationState", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "initializationError", "", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel;ILcom/robinhood/android/lib/account/creation/AccountCreationState;Ljava/lang/Throwable;)V", "getSource", "()Ljava/lang/String;", "getEnoughTimeHasElapsedToShowLoadingText", "()Z", "getViewModel", "()Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel;", "getAttempts", "()I", "getCreationState", "()Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "getInitializationError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountSubmitConfirmationDataState {
    private final int attempts;
    private final AccountCreationState creationState;
    private final boolean enoughTimeHasElapsedToShowLoadingText;
    private final Throwable initializationError;
    private final String source;
    private final ApiConfirmSecondarySubmittedViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ JointAccountSubmitConfirmationDataState copy$default(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, String str, boolean z, ApiConfirmSecondarySubmittedViewModel apiConfirmSecondarySubmittedViewModel, int i, AccountCreationState accountCreationState, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jointAccountSubmitConfirmationDataState.source;
        }
        if ((i2 & 2) != 0) {
            z = jointAccountSubmitConfirmationDataState.enoughTimeHasElapsedToShowLoadingText;
        }
        if ((i2 & 4) != 0) {
            apiConfirmSecondarySubmittedViewModel = jointAccountSubmitConfirmationDataState.viewModel;
        }
        if ((i2 & 8) != 0) {
            i = jointAccountSubmitConfirmationDataState.attempts;
        }
        if ((i2 & 16) != 0) {
            accountCreationState = jointAccountSubmitConfirmationDataState.creationState;
        }
        if ((i2 & 32) != 0) {
            th = jointAccountSubmitConfirmationDataState.initializationError;
        }
        AccountCreationState accountCreationState2 = accountCreationState;
        Throwable th2 = th;
        return jointAccountSubmitConfirmationDataState.copy(str, z, apiConfirmSecondarySubmittedViewModel, i, accountCreationState2, th2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnoughTimeHasElapsedToShowLoadingText() {
        return this.enoughTimeHasElapsedToShowLoadingText;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiConfirmSecondarySubmittedViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountCreationState getCreationState() {
        return this.creationState;
    }

    /* renamed from: component6, reason: from getter */
    public final Throwable getInitializationError() {
        return this.initializationError;
    }

    public final JointAccountSubmitConfirmationDataState copy(String source, boolean enoughTimeHasElapsedToShowLoadingText, ApiConfirmSecondarySubmittedViewModel viewModel, int attempts, AccountCreationState creationState, Throwable initializationError) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(creationState, "creationState");
        return new JointAccountSubmitConfirmationDataState(source, enoughTimeHasElapsedToShowLoadingText, viewModel, attempts, creationState, initializationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountSubmitConfirmationDataState)) {
            return false;
        }
        JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState = (JointAccountSubmitConfirmationDataState) other;
        return Intrinsics.areEqual(this.source, jointAccountSubmitConfirmationDataState.source) && this.enoughTimeHasElapsedToShowLoadingText == jointAccountSubmitConfirmationDataState.enoughTimeHasElapsedToShowLoadingText && Intrinsics.areEqual(this.viewModel, jointAccountSubmitConfirmationDataState.viewModel) && this.attempts == jointAccountSubmitConfirmationDataState.attempts && Intrinsics.areEqual(this.creationState, jointAccountSubmitConfirmationDataState.creationState) && Intrinsics.areEqual(this.initializationError, jointAccountSubmitConfirmationDataState.initializationError);
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + Boolean.hashCode(this.enoughTimeHasElapsedToShowLoadingText)) * 31;
        ApiConfirmSecondarySubmittedViewModel apiConfirmSecondarySubmittedViewModel = this.viewModel;
        int iHashCode2 = (((((iHashCode + (apiConfirmSecondarySubmittedViewModel == null ? 0 : apiConfirmSecondarySubmittedViewModel.hashCode())) * 31) + Integer.hashCode(this.attempts)) * 31) + this.creationState.hashCode()) * 31;
        Throwable th = this.initializationError;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "JointAccountSubmitConfirmationDataState(source=" + this.source + ", enoughTimeHasElapsedToShowLoadingText=" + this.enoughTimeHasElapsedToShowLoadingText + ", viewModel=" + this.viewModel + ", attempts=" + this.attempts + ", creationState=" + this.creationState + ", initializationError=" + this.initializationError + ")";
    }

    public JointAccountSubmitConfirmationDataState(String source, boolean z, ApiConfirmSecondarySubmittedViewModel apiConfirmSecondarySubmittedViewModel, int i, AccountCreationState creationState, Throwable th) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(creationState, "creationState");
        this.source = source;
        this.enoughTimeHasElapsedToShowLoadingText = z;
        this.viewModel = apiConfirmSecondarySubmittedViewModel;
        this.attempts = i;
        this.creationState = creationState;
        this.initializationError = th;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getEnoughTimeHasElapsedToShowLoadingText() {
        return this.enoughTimeHasElapsedToShowLoadingText;
    }

    public final ApiConfirmSecondarySubmittedViewModel getViewModel() {
        return this.viewModel;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public /* synthetic */ JointAccountSubmitConfirmationDataState(String str, boolean z, ApiConfirmSecondarySubmittedViewModel apiConfirmSecondarySubmittedViewModel, int i, AccountCreationState accountCreationState, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : apiConfirmSecondarySubmittedViewModel, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? AccountCreationState.Polling.INSTANCE : accountCreationState, (i2 & 32) != 0 ? null : th);
    }

    public final AccountCreationState getCreationState() {
        return this.creationState;
    }

    public final Throwable getInitializationError() {
        return this.initializationError;
    }

    /* compiled from: JointAccountSubmitConfirmationDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002J\f\u0010\u0006\u001a\u00020\u0007*\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "<init>", "()V", "toUiModel", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel$AccountCreationCtaWithDeeplink;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondarySubmittedViewModel$AccountCreationCta;", "reduce", "dataState", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<JointAccountSubmitConfirmationDataState, JointAccountCreatedViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final JointAccountCta toUiModel(ApiConfirmSecondarySubmittedViewModel.AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink) {
            return new JointAccountCta(accountCreationCtaWithDeeplink.getTitle(), accountCreationCtaWithDeeplink.getLogging_identifier(), accountCreationCtaWithDeeplink.getDeeplink());
        }

        private final JointAccountCta toUiModel(ApiConfirmSecondarySubmittedViewModel.AccountCreationCta accountCreationCta) {
            return new JointAccountCta(accountCreationCta.getTitle(), accountCreationCta.getLogging_identifier(), null, 4, null);
        }

        @Override // com.robinhood.android.udf.StateProvider
        public JointAccountCreatedViewState reduce(JointAccountSubmitConfirmationDataState dataState) {
            ApiConfirmSecondarySubmittedViewModel.AccountCreationErrorMessage timeout_error_message;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ApiConfirmSecondarySubmittedViewModel viewModel = dataState.getViewModel();
            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_CELEBRATION, null, "account-created", null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, dataState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
            if (viewModel == null) {
                return dataState.getInitializationError() != null ? new JointAccountCreatedViewState.InitializationError(userInteractionEventDescriptor) : new JointAccountCreatedViewState.Loading(null, null, userInteractionEventDescriptor, 3, null);
            }
            AccountCreationState creationState = dataState.getCreationState();
            if (creationState instanceof AccountCreationState.Fetched) {
                return new JointAccountCreatedViewState.Success(viewModel.getSuccess_view_model().getTitle_text(), viewModel.getSuccess_view_model().getBody_text(), toUiModel(viewModel.getSuccess_view_model().getContinue_cta_v2()), new InvitationState.Complete(((AccountCreationState.Fetched) creationState).getAccountNumber()), userInteractionEventDescriptor);
            }
            if (creationState instanceof AccountCreationState.Polling) {
                String title_text = viewModel.getLoading_view_model().getTitle_text();
                if (!dataState.getEnoughTimeHasElapsedToShowLoadingText()) {
                    title_text = null;
                }
                return new JointAccountCreatedViewState.Loading(title_text, dataState.getEnoughTimeHasElapsedToShowLoadingText() ? viewModel.getLoading_view_model().getBody_text() : null, userInteractionEventDescriptor);
            }
            if (creationState instanceof AccountCreationState.Failed) {
                return new JointAccountCreatedViewState.LoadAccountError(viewModel.getError_view_model().getDefault_error_message().getTitle(), viewModel.getError_view_model().getDefault_error_message().getSubtitle(), toUiModel(viewModel.getError_view_model().getRefresh_cta()), toUiModel(viewModel.getError_view_model().getContact_support_cta()), userInteractionEventDescriptor);
            }
            if (!(creationState instanceof AccountCreationState.Absent)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = dataState.getAttempts() > 1;
            if (z) {
                timeout_error_message = viewModel.getError_view_model().getMulti_timeout_error_message();
            } else {
                timeout_error_message = viewModel.getError_view_model().getTimeout_error_message();
            }
            return new JointAccountCreatedViewState.LoadAccountError(timeout_error_message.getTitle(), timeout_error_message.getSubtitle(), toUiModel(viewModel.getError_view_model().getRefresh_cta()), z ? toUiModel(viewModel.getError_view_model().getContact_support_cta()) : null, userInteractionEventDescriptor);
        }
    }
}
