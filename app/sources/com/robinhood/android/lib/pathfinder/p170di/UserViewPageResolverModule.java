package com.robinhood.android.lib.pathfinder.p170di;

import com.robinhood.android.lib.pathfinder.UserViewPageResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.security.contracts.PathfinderChallenge;
import com.robinhood.android.security.contracts.PathfinderLoggedInChallengeFragmentKey;
import com.robinhood.android.security.contracts.PlaidAuthenticationFragmentKey;
import com.robinhood.android.security.contracts.PlaidBankListFragmentKey;
import com.robinhood.models.api.pathfinder.userview.UserViewPageType;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.shared.security.contracts.KbaFragmentKey;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.contracts.SupportChatPageFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.AttestationFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.CheckboxConfirmPageFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.ContactChannelFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.ContactEmailFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.DocumentRequestListFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.FreeTextDescriptionFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.HeroImageFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.LoggedOutAccountDetailFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.MultiSelectFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.PendingDepositsFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.ReviewAgreementFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.SimpleInputFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.SupportLandingFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserViewPageResolverModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007J\b\u0010\u0013\u001a\u00020\u0005H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0005H\u0007J\b\u0010\u0017\u001a\u00020\u0005H\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0007J\b\u0010\u0019\u001a\u00020\u0005H\u0007J\b\u0010\u001a\u001a\u00020\u0005H\u0007J\b\u0010\u001b\u001a\u00020\u0005H\u0007J\b\u0010\u001c\u001a\u00020\u0005H\u0007J\b\u0010\u001d\u001a\u00020\u0005H\u0007J\b\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0007J\b\u0010 \u001a\u00020\u0005H\u0007J\b\u0010!\u001a\u00020\u0005H\u0007J\b\u0010\"\u001a\u00020\u0005H\u0007J\b\u0010#\u001a\u00020\u0005H\u0007J\b\u0010$\u001a\u00020\u0005H\u0007J\b\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\u0005H\u0007J\b\u0010'\u001a\u00020\u0005H\u0007J\b\u0010(\u001a\u00020\u0005H\u0007J\b\u0010)\u001a\u00020\u0005H\u0007J\b\u0010*\u001a\u00020\u0005H\u0007J\b\u0010+\u001a\u00020\u0005H\u0007J\b\u0010,\u001a\u00020\u0005H\u0007J\b\u0010-\u001a\u00020\u0005H\u0007J\b\u0010.\u001a\u00020\u0005H\u0007J\b\u0010/\u001a\u00020\u0005H\u0007J\b\u00100\u001a\u00020\u0005H\u0007J\b\u00101\u001a\u00020\u0005H\u0007J\b\u00102\u001a\u00020\u0005H\u0007J\b\u00103\u001a\u00020\u0005H\u0007¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/di/UserViewPageResolverModule;", "", "<init>", "()V", "providePageResolverAppMfaEnroll", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "providePageResolverAttestation", "providePageResolverChallengePage", "providePageResolverContactChannel", "providePageResolverContactEmail", "providePageResolverContactSecretCode", "providePageResolverCheckboxConfirm", "providePageResolverDocumentRequestsList", "providePageResolverEmailChallenge", "providePageResolverHeroImage", "providePageResolverIdentityVerificationInitiate", "providePageResolverKba", "providePageResolverLoggedInChallenge", "providePageResolverLoggedInIdentityVerificationWait", "providePageResolverLoggedOutAccountDetail", "providePageResolverMultiSelect", "providePageResolverObfuscatedEmailV3", "providePageResolverOutboundVoice", "providePageResolverPaginatedListSdui", "providePageResolverPaginatedListWithTabs", "providePageResolverPdtDepositFundsInitiated", "providePageResolverPendingDeposits", "providePageResolverPlaidBankList", "providePageResolverPlaidAuthentication", "providePageResolverReviewAgreement", "providePageResolverSduiPage", "providePageResolverShowFullEmailV3", "providePageResolverSimpleInput", "providePageResolverSmsChallenge", "providePageResolverSmsMfaEnrollOtp", "providePageResolverSmsMfaEnrolPhoneInput", "providePageResolverSupportChat", "providePageResolverSupportLanding", "providePageResolverSurveyYesNo", "providePageResolverSurveyRatingQuestion", "providePageResolverSurveyMultipleChoiceQuestion", "providePageResolverSurveyFreeFormQuestion", "providePageResolverSurveyComplete", "providePageResolverSurveyCompleteToast", "providePageResolverSurveyContactRedirect", "providePageResolverTransferFunds", "providePageResolverFreeTextDescription", "providePageResolverUarContactSelfieVerificationInitiate", "providePageResolverUarContactSelfieVerificationWait", "providePageResolverUarEmailUpdateInput", "providePageResolverUarEmailUpdateVerification", "providePageResolverUarVerificationSuccess", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UserViewPageResolverModule {
    public static final int $stable = 0;
    public static final UserViewPageResolverModule INSTANCE = new UserViewPageResolverModule();

    private UserViewPageResolverModule() {
    }

    @UserViewPageTypeKey(UserViewPageType.APP_MFA_ENROLL)
    public final UserViewPageResolver providePageResolverAppMfaEnroll() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverAppMfaEnroll.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderAppMfaEnroll(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.ATTESTATION)
    public final UserViewPageResolver providePageResolverAttestation() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverAttestation.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new AttestationFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CHALLENGE_PAGE)
    public final UserViewPageResolver providePageResolverChallengePage() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverChallengePage.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new PathfinderChallenge(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CONTACT_CHANNEL)
    public final UserViewPageResolver providePageResolverContactChannel() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverContactChannel.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new ContactChannelFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CONTACT_EMAIL)
    public final UserViewPageResolver providePageResolverContactEmail() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverContactEmail.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new ContactEmailFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CONTACT_SECRET_CODE)
    public final UserViewPageResolver providePageResolverContactSecretCode() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverContactSecretCode.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.LoggedOutSecretCodeValidation(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CHECKBOX_CONFIRM_PAGE)
    public final UserViewPageResolver providePageResolverCheckboxConfirm() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverCheckboxConfirm.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new CheckboxConfirmPageFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.DOCUMENT_REQUESTS_LIST_PAGE)
    public final UserViewPageResolver providePageResolverDocumentRequestsList() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverDocumentRequestsList.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new DocumentRequestListFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.EMAIL_CHALLENGE_PAGE)
    public final UserViewPageResolver providePageResolverEmailChallenge() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverEmailChallenge.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderEmailChallenge(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.HERO_IMAGE)
    public final UserViewPageResolver providePageResolverHeroImage() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverHeroImage.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new HeroImageFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.IDENTITY_VERIFICATION_INITIATE_PAGE)
    public final UserViewPageResolver providePageResolverIdentityVerificationInitiate() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverIdentityVerificationInitiate.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderIdentityVerificationInitiate(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.KBA_PAGE)
    public final UserViewPageResolver providePageResolverKba() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverKba.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new KbaFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.LOGGED_IN_CHALLENGE_PAGE)
    public final UserViewPageResolver providePageResolverLoggedInChallenge() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverLoggedInChallenge.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new PathfinderLoggedInChallengeFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.LOGGED_IN_IDENTITY_VERIFICATION_WAIT_PAGE)
    public final UserViewPageResolver providePageResolverLoggedInIdentityVerificationWait() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverLoggedInIdentityVerificationWait.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.LOGGED_OUT_ACCOUNT_DETAIL)
    public final UserViewPageResolver providePageResolverLoggedOutAccountDetail() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverLoggedOutAccountDetail.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LoggedOutAccountDetailFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.MULTI_SELECT_PAGE)
    public final UserViewPageResolver providePageResolverMultiSelect() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverMultiSelect.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new MultiSelectFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.OBFUSCATED_EMAIL_V3_PAGE)
    public final UserViewPageResolver providePageResolverObfuscatedEmailV3() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverObfuscatedEmailV3.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new EmailConfirmationFragmentKey.ObfuscatedEmailV3(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.OUTBOUND_VOICE_PAGE)
    public final UserViewPageResolver providePageResolverOutboundVoice() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverOutboundVoice.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.OutboundVoicePage(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PAGINATED_LIST_SDUI_PAGE)
    public final UserViewPageResolver providePageResolverPaginatedListSdui() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPaginatedListSdui.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSdui.PaginatedList(inquiryId, page.getSequence());
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PAGINATED_LIST_WITH_TABS_SDUI_PAGE)
    public final UserViewPageResolver providePageResolverPaginatedListWithTabs() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPaginatedListWithTabs.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSdui.PaginatedListWithTabs(inquiryId, page.getSequence());
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PDT_DEPOSIT_FUNDS_INITIATED_PAGE)
    public final UserViewPageResolver providePageResolverPdtDepositFundsInitiated() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPdtDepositFundsInitiated.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderPdtDepositFundsInitiated(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PENDING_DEPOSITS_PAGE)
    public final UserViewPageResolver providePageResolverPendingDeposits() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPendingDeposits.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new PendingDepositsFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PLAID_BANK_LIST_PAGE)
    public final UserViewPageResolver providePageResolverPlaidBankList() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPlaidBankList.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new PlaidBankListFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.PLAID_AUTHENTICATION_PAGE)
    public final UserViewPageResolver providePageResolverPlaidAuthentication() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverPlaidAuthentication.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new PlaidAuthenticationFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.REVIEW_AGREEMENT_PAGE)
    public final UserViewPageResolver providePageResolverReviewAgreement() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverReviewAgreement.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new ReviewAgreementFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SDUI_PAGE)
    public final UserViewPageResolver providePageResolverSduiPage() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSduiPage.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSdui.Default(inquiryId, page.getSequence());
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SHOW_FULL_EMAIL_PAGE_V3)
    public final UserViewPageResolver providePageResolverShowFullEmailV3() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverShowFullEmailV3.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new EmailConfirmationFragmentKey.ShowFullEmailV3(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SIMPLE_INPUT_PAGE)
    public final UserViewPageResolver providePageResolverSimpleInput() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSimpleInput.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new SimpleInputFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SMS_CHALLENGE)
    public final UserViewPageResolver providePageResolverSmsChallenge() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSmsChallenge.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSmsChallenge(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SMS_MFA_ENROLL_OTP)
    public final UserViewPageResolver providePageResolverSmsMfaEnrollOtp() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSmsMfaEnrollOtp.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSmsMfaEnrollOtp(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SMS_MFA_ENROLL_PHONE_INPUT_PAGE)
    public final UserViewPageResolver providePageResolverSmsMfaEnrolPhoneInput() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSmsMfaEnrolPhoneInput.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SUPPORT_CHAT)
    public final UserViewPageResolver providePageResolverSupportChat() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSupportChat.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID uuid, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(uuid, "<unused var>");
                Intrinsics.checkNotNullParameter(page, "page");
                return new SupportChatPageFragmentKey(new CxChatFragmentKey.Pathfinder(page, true, false, false, null, 28, null));
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SUPPORT_LANDING_PAGE)
    public final UserViewPageResolver providePageResolverSupportLanding() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSupportLanding.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new SupportLandingFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_YES_NO_QUESTION)
    public final UserViewPageResolver providePageResolverSurveyYesNo() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyYesNo.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyYesNoQuestion(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_RATING_QUESTION)
    public final UserViewPageResolver providePageResolverSurveyRatingQuestion() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyRatingQuestion.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyRatingQuestion(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_MULTIPLE_CHOICE_QUESTION)
    public final UserViewPageResolver providePageResolverSurveyMultipleChoiceQuestion() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyMultipleChoiceQuestion.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyMultipleChoiceQuestion(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_FREE_FORM_QUESTION_PAGE)
    public final UserViewPageResolver providePageResolverSurveyFreeFormQuestion() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyFreeFormQuestion.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyFreeFormQuestion(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_COMPLETE_PAGE)
    public final UserViewPageResolver providePageResolverSurveyComplete() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyComplete.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyComplete(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_COMPLETE_TOAST_PAGE)
    public final UserViewPageResolver providePageResolverSurveyCompleteToast() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyCompleteToast.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyCompleteToast(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.SURVEY_CONTACT_REDIRECT_PAGE)
    public final UserViewPageResolver providePageResolverSurveyContactRedirect() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverSurveyContactRedirect.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.SurveyContactRedirect(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.TRANSFER_FUNDS_PAGE)
    public final UserViewPageResolver providePageResolverTransferFunds() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverTransferFunds.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.PathfinderTransferFunds(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.CONTACT_TEXT_DESCRIPTION)
    public final UserViewPageResolver providePageResolverFreeTextDescription() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverFreeTextDescription.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new FreeTextDescriptionFragmentKey(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.UAR_CONTACT_SELFIE_VERIFICATION_INITIATE)
    public final UserViewPageResolver providePageResolverUarContactSelfieVerificationInitiate() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverUarContactSelfieVerificationInitiate.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.UarContactSelfieVerificationInitiate(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.UAR_CONTACT_SELFIE_VERIFICATION_WAIT)
    public final UserViewPageResolver providePageResolverUarContactSelfieVerificationWait() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverUarContactSelfieVerificationWait.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.UarContactSelfieVerificationWait(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.UAR_EMAIL_UPDATE_INPUT_PAGE)
    public final UserViewPageResolver providePageResolverUarEmailUpdateInput() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverUarEmailUpdateInput.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.UarEmailUpdateInput(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.UAR_EMAIL_UPDATE_VERIFICATION_PAGE)
    public final UserViewPageResolver providePageResolverUarEmailUpdateVerification() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverUarEmailUpdateVerification.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.UarEmailUpdateVerification(inquiryId, page);
            }
        };
    }

    @UserViewPageTypeKey(UserViewPageType.UAR_VERIFICATION_SUCCESS_PAGE)
    public final UserViewPageResolver providePageResolverUarVerificationSuccess() {
        return new UserViewPageResolver() { // from class: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule.providePageResolverUarVerificationSuccess.1
            @Override // com.robinhood.android.lib.pathfinder.UserViewPageResolver
            public final FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(page, "page");
                return new LegacyFragmentKey.UarVerificationSuccess(inquiryId, page);
            }
        };
    }
}
