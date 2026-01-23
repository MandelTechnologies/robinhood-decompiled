package com.robinhood.android.jointaccounts.onboarding.outro.secondary;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaWithDeeplinkDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModelDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationLoadingViewModelDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationSuccessViewModelDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchSecondaryPostAgreementsResponseDto;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCta;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JointAccountOnboardingSecondaryOutroDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;", "", "response", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "attempts", "", "creationState", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "initializationError", "", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;ILcom/robinhood/android/lib/account/creation/AccountCreationState;Ljava/lang/Throwable;)V", "getResponse", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "getAttempts", "()I", "getCreationState", "()Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "getInitializationError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountOnboardingSecondaryOutroDataState {
    private final int attempts;
    private final AccountCreationState creationState;
    private final Throwable initializationError;
    private final FetchSecondaryPostAgreementsResponseDto response;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public JointAccountOnboardingSecondaryOutroDataState() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ JointAccountOnboardingSecondaryOutroDataState copy$default(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto, int i, AccountCreationState accountCreationState, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fetchSecondaryPostAgreementsResponseDto = jointAccountOnboardingSecondaryOutroDataState.response;
        }
        if ((i2 & 2) != 0) {
            i = jointAccountOnboardingSecondaryOutroDataState.attempts;
        }
        if ((i2 & 4) != 0) {
            accountCreationState = jointAccountOnboardingSecondaryOutroDataState.creationState;
        }
        if ((i2 & 8) != 0) {
            th = jointAccountOnboardingSecondaryOutroDataState.initializationError;
        }
        return jointAccountOnboardingSecondaryOutroDataState.copy(fetchSecondaryPostAgreementsResponseDto, i, accountCreationState, th);
    }

    /* renamed from: component1, reason: from getter */
    public final FetchSecondaryPostAgreementsResponseDto getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountCreationState getCreationState() {
        return this.creationState;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getInitializationError() {
        return this.initializationError;
    }

    public final JointAccountOnboardingSecondaryOutroDataState copy(FetchSecondaryPostAgreementsResponseDto response, int attempts, AccountCreationState creationState, Throwable initializationError) {
        Intrinsics.checkNotNullParameter(creationState, "creationState");
        return new JointAccountOnboardingSecondaryOutroDataState(response, attempts, creationState, initializationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountOnboardingSecondaryOutroDataState)) {
            return false;
        }
        JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState = (JointAccountOnboardingSecondaryOutroDataState) other;
        return Intrinsics.areEqual(this.response, jointAccountOnboardingSecondaryOutroDataState.response) && this.attempts == jointAccountOnboardingSecondaryOutroDataState.attempts && Intrinsics.areEqual(this.creationState, jointAccountOnboardingSecondaryOutroDataState.creationState) && Intrinsics.areEqual(this.initializationError, jointAccountOnboardingSecondaryOutroDataState.initializationError);
    }

    public int hashCode() {
        FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto = this.response;
        int iHashCode = (((((fetchSecondaryPostAgreementsResponseDto == null ? 0 : fetchSecondaryPostAgreementsResponseDto.hashCode()) * 31) + Integer.hashCode(this.attempts)) * 31) + this.creationState.hashCode()) * 31;
        Throwable th = this.initializationError;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "JointAccountOnboardingSecondaryOutroDataState(response=" + this.response + ", attempts=" + this.attempts + ", creationState=" + this.creationState + ", initializationError=" + this.initializationError + ")";
    }

    public JointAccountOnboardingSecondaryOutroDataState(FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto, int i, AccountCreationState creationState, Throwable th) {
        Intrinsics.checkNotNullParameter(creationState, "creationState");
        this.response = fetchSecondaryPostAgreementsResponseDto;
        this.attempts = i;
        this.creationState = creationState;
        this.initializationError = th;
    }

    public final FetchSecondaryPostAgreementsResponseDto getResponse() {
        return this.response;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public /* synthetic */ JointAccountOnboardingSecondaryOutroDataState(FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto, int i, AccountCreationState accountCreationState, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : fetchSecondaryPostAgreementsResponseDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AccountCreationState.Polling.INSTANCE : accountCreationState, (i2 & 8) != 0 ? null : th);
    }

    public final AccountCreationState getCreationState() {
        return this.creationState;
    }

    public final Throwable getInitializationError() {
        return this.initializationError;
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDataState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002J\f\u0010\u0006\u001a\u00020\u0007*\u00020\tH\u0002J\u001c\u0010\u0006\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "<init>", "()V", "toUiModel", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Success;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "invitationState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "reduce", "dataState", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<JointAccountOnboardingSecondaryOutroDataState, JointAccountCreatedViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final JointAccountCta toUiModel(AccountCreationCtaDto accountCreationCtaDto) {
            return new JointAccountCta(accountCreationCtaDto.getTitle(), accountCreationCtaDto.getLogging_identifier(), null, 4, null);
        }

        private final JointAccountCta toUiModel(AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto) {
            return new JointAccountCta(accountCreationCtaWithDeeplinkDto.getTitle(), accountCreationCtaWithDeeplinkDto.getLogging_identifier(), accountCreationCtaWithDeeplinkDto.getDeeplink());
        }

        private final JointAccountCreatedViewState.Success toUiModel(AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto, InvitationState invitationState, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            String title_text = accountCreationSuccessViewModelDto.getTitle_text();
            String body_text = accountCreationSuccessViewModelDto.getBody_text();
            AccountCreationCtaWithDeeplinkDto continue_cta_v2 = accountCreationSuccessViewModelDto.getContinue_cta_v2();
            if (continue_cta_v2 == null) {
                continue_cta_v2 = new AccountCreationCtaWithDeeplinkDto(null, null, null, 7, null);
            }
            return new JointAccountCreatedViewState.Success(title_text, body_text, toUiModel(continue_cta_v2), invitationState, userInteractionEventDescriptor);
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public JointAccountCreatedViewState reduce(JointAccountOnboardingSecondaryOutroDataState dataState) {
            AccountCreationErrorViewModelDto.AccountCreationErrorMessageDto timeout_error_message;
            AccountCreationCtaDto accountCreationCtaDto;
            AccountCreationCtaDto contact_support_cta;
            AccountCreationCtaDto accountCreationCtaDto2;
            AccountCreationCtaDto accountCreationCtaDto3;
            AccountCreationErrorViewModelDto.AccountCreationErrorMessageDto default_error_message;
            String subtitle;
            AccountCreationErrorViewModelDto.AccountCreationErrorMessageDto default_error_message2;
            String title;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            FetchSecondaryPostAgreementsResponseDto response = dataState.getResponse();
            if (response == null || !response.getInvitation_completed()) {
                if (response != null) {
                    AccountCreationSuccessViewModelDto success_view_model = response.getSuccess_view_model();
                    if (success_view_model != null) {
                        return toUiModel(success_view_model, InvitationState.Incomplete.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_CELEBRATION, null, "application-pending", null, 10, null), null, null, null, null, 61, null));
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (dataState.getInitializationError() != null) {
                    return new JointAccountCreatedViewState.InitializationError(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_CELEBRATION, null, null, null, 14, null), null, null, null, null, 61, null));
                }
                return new JointAccountCreatedViewState.Loading(null, null, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_CELEBRATION, null, null, null, 14, null), null, null, null, null, 61, null), 3, null);
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_CELEBRATION, null, "account-created", null, 10, null), null, null, null, null, 61, null);
            AccountCreationState creationState = dataState.getCreationState();
            if (creationState instanceof AccountCreationState.Fetched) {
                AccountCreationSuccessViewModelDto success_view_model2 = response.getSuccess_view_model();
                if (success_view_model2 == null) {
                    success_view_model2 = new AccountCreationSuccessViewModelDto(null, null, null, null, 15, null);
                }
                return toUiModel(success_view_model2, new InvitationState.Complete(((AccountCreationState.Fetched) creationState).getAccountNumber()), userInteractionEventDescriptor);
            }
            if (Intrinsics.areEqual(creationState, AccountCreationState.Polling.INSTANCE)) {
                AccountCreationLoadingViewModelDto loading_view_model = response.getLoading_view_model();
                String title_text = loading_view_model != null ? loading_view_model.getTitle_text() : null;
                AccountCreationLoadingViewModelDto loading_view_model2 = response.getLoading_view_model();
                return new JointAccountCreatedViewState.Loading(title_text, loading_view_model2 != null ? loading_view_model2.getBody_text() : null, userInteractionEventDescriptor);
            }
            if (creationState instanceof AccountCreationState.Failed) {
                AccountCreationErrorViewModelDto error_view_model = response.getError_view_model();
                String str = "";
                String str2 = (error_view_model == null || (default_error_message2 = error_view_model.getDefault_error_message()) == null || (title = default_error_message2.getTitle()) == null) ? "" : title;
                AccountCreationErrorViewModelDto error_view_model2 = response.getError_view_model();
                if (error_view_model2 != null && (default_error_message = error_view_model2.getDefault_error_message()) != null && (subtitle = default_error_message.getSubtitle()) != null) {
                    str = subtitle;
                }
                AccountCreationErrorViewModelDto error_view_model3 = response.getError_view_model();
                if (error_view_model3 == null || (accountCreationCtaDto2 = error_view_model3.getRefresh_cta()) == null) {
                    accountCreationCtaDto2 = new AccountCreationCtaDto(null, null, 3, null);
                }
                JointAccountCta uiModel = toUiModel(accountCreationCtaDto2);
                AccountCreationErrorViewModelDto error_view_model4 = response.getError_view_model();
                if (error_view_model4 == null || (accountCreationCtaDto3 = error_view_model4.getContact_support_cta()) == null) {
                    accountCreationCtaDto3 = new AccountCreationCtaDto(null, null, 3, null);
                }
                return new JointAccountCreatedViewState.LoadAccountError(str2, str, uiModel, toUiModel(accountCreationCtaDto3), userInteractionEventDescriptor);
            }
            if (!(creationState instanceof AccountCreationState.Absent)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = dataState.getAttempts() > 1;
            if (z) {
                AccountCreationErrorViewModelDto error_view_model5 = response.getError_view_model();
                timeout_error_message = error_view_model5 != null ? error_view_model5.getMulti_timeout_error_message() : null;
            } else {
                AccountCreationErrorViewModelDto error_view_model6 = response.getError_view_model();
                if (error_view_model6 != null) {
                    timeout_error_message = error_view_model6.getTimeout_error_message();
                }
            }
            if (timeout_error_message == null) {
                timeout_error_message = new AccountCreationErrorViewModelDto.AccountCreationErrorMessageDto(null, null, 3, null);
            }
            String title2 = timeout_error_message.getTitle();
            String subtitle2 = timeout_error_message.getSubtitle();
            AccountCreationErrorViewModelDto error_view_model7 = response.getError_view_model();
            if (error_view_model7 == null || (accountCreationCtaDto = error_view_model7.getRefresh_cta()) == null) {
                accountCreationCtaDto = new AccountCreationCtaDto(null, null, 3, null);
            }
            JointAccountCta uiModel2 = toUiModel(accountCreationCtaDto);
            AccountCreationErrorViewModelDto error_view_model8 = response.getError_view_model();
            return new JointAccountCreatedViewState.LoadAccountError(title2, subtitle2, uiModel2, z ? (error_view_model8 == null || (contact_support_cta = error_view_model8.getContact_support_cta()) == null) ? null : toUiModel(contact_support_cta) : null, userInteractionEventDescriptor);
        }
    }
}
