package com.plaid.internal.core.protos.clients;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration;
import com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences;
import com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference;
import com.plaid.internal.core.protos.income_verification_manager.InterfaceC6080c;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes24.dex */
public final class LinkCustomizations$LinkCustomization extends GeneratedMessageLite<LinkCustomizations$LinkCustomization, C6067d> implements MessageLiteOrBuilder {
    public static final int ACCOUNT_CLASS_BUSINESS_DISABLED_FIELD_NUMBER = 76;
    public static final int ACCOUNT_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 39;
    public static final int ACCOUNT_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 40;
    public static final int ACCOUNT_NUMBER_PANE_TITLE_FIELD_NUMBER = 38;
    public static final int ACCOUNT_SELECT_PANE_IS_ENABLED_FIELD_NUMBER = 46;
    public static final int ACCOUNT_SELECT_PANE_IS_MULTI_ACCOUNT_SELECT_ENABLED_FIELD_NUMBER = 47;
    public static final int ACCOUNT_SELECT_PANE_MODE_FIELD_NUMBER = 75;
    public static final int ACCOUNT_SELECT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 45;
    public static final int ACCOUNT_SELECT_PANE_TITLE_FIELD_NUMBER = 44;
    public static final int AUTH_FLOW_TYPE_FIELD_NUMBER = 115;
    public static final int CONNECTED_PANE_HEADING_FIELD_NUMBER = 55;
    public static final int CONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 6;
    public static final int CONNECTED_PANE_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 5;
    public static final int CONNECTED_PANE_TITLE_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 56;
    public static final int CREDENTIAL_PANE_PLAID_LEGAL_ENABLED_FIELD_NUMBER = 14;
    public static final int CREDENTIAL_PANE_RESET_PASSWORD_BUTTON_FIELD_NUMBER = 13;
    public static final int CREDENTIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 12;
    public static final int CREDENTIAL_PANE_TITLE_FIELD_NUMBER = 11;
    public static final int CREDENTIAL_PANE_TOS_CONTENT_FIELD_NUMBER = 15;
    public static final int CREDENTIAL_PANE_TOS_ENABLED_FIELD_NUMBER = 16;
    private static final LinkCustomizations$LinkCustomization DEFAULT_INSTANCE;

    /* renamed from: DOCUMENT_INCOME_UPLOAD_PANE_DOCUMENT_FILE_TYPE_PREFERENCES_FIELD_NUMBER */
    public static final int f1967x633bef10 = 90;

    /* renamed from: DOCUMENT_INCOME_UPLOAD_PANE_NUMBER_OF_UPLOADS_PREFERENCES_FIELD_NUMBER */
    public static final int f1968xe4f4c31f = 91;
    public static final int DOCUMENT_TIME_RANGE_FIELD_NUMBER = 108;
    public static final int DTM_ENABLEMENT_STATUS_FIELD_NUMBER = 105;
    public static final int DTM_USE_CASES_FIELD_NUMBER = 104;
    public static final int ERROR_PANE_TITLE_FIELD_NUMBER = 20;
    public static final int EU_CONSENT_PANE_CANCEL_FIELD_NUMBER = 63;
    public static final int EU_CONSENT_PANE_CONTACT_DETAILS_TITLE_FIELD_NUMBER = 57;
    public static final int EU_CONSENT_PANE_CONTINUE_AGREE_FIELD_NUMBER = 61;
    public static final int EU_CONSENT_PANE_CONTINUE_FIELD_NUMBER = 62;
    public static final int EU_CONSENT_PANE_DETAILS_TITLE_FIELD_NUMBER = 60;
    public static final int EU_CONSENT_PANE_IS_ENABLED_FIELD_NUMBER = 17;
    public static final int EU_CONSENT_PANE_LINK_WITH_PLAID_FIELD_NUMBER = 58;
    public static final int EU_CONSENT_PANE_SUBMIT_AGREE_FIELD_NUMBER = 19;
    public static final int EU_CONSENT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 18;
    public static final int EU_CONSENT_PANE_TRANSACTIONS_TITLE_FIELD_NUMBER = 59;
    public static final int EXIT_PANE_CANCEL_BUTTON_FIELD_NUMBER = 25;
    public static final int EXIT_PANE_HEADING_FIELD_NUMBER = 22;
    public static final int EXIT_PANE_MESSAGE_FIELD_NUMBER = 23;
    public static final int EXIT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 24;
    public static final int EXIT_PANE_TITLE_FIELD_NUMBER = 21;
    public static final int GLOBAL_APPEARANCE_FIELD_NUMBER = 82;
    public static final int GLOBAL_BUTTON_BORDER_RADIUS_FIELD_NUMBER = 88;
    public static final int GLOBAL_BUTTON_COLOR_FIELD_NUMBER = 85;
    public static final int GLOBAL_BUTTON_COLOR_HOVER_FIELD_NUMBER = 86;
    public static final int GLOBAL_BUTTON_DARK_MODE_COLOR_FIELD_NUMBER = 116;
    public static final int GLOBAL_BUTTON_DARK_MODE_COLOR_HOVER_FIELD_NUMBER = 117;
    public static final int GLOBAL_BUTTON_DARK_MODE_TEXT_COLOR_FIELD_NUMBER = 118;
    public static final int GLOBAL_BUTTON_FONT_WEIGHT_FIELD_NUMBER = 89;
    public static final int GLOBAL_BUTTON_TEXT_COLOR_FIELD_NUMBER = 87;
    public static final int GLOBAL_HIGHLIGHT_COLOR_FIELD_NUMBER = 1;
    public static final int GLOBAL_OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int IDENTITY_MATCH_RISK_PROFILE_KEY_FIELD_NUMBER = 106;
    public static final int INSTITUTION_SEARCH_PANE_EXIT_BUTTON_FIELD_NUMBER = 29;
    public static final int INSTITUTION_SEARCH_PANE_INITIAL_MESSAGE_FIELD_NUMBER = 31;
    public static final int INSTITUTION_SEARCH_PANE_NO_RESULTS_MESSAGE_FIELD_NUMBER = 32;
    public static final int INSTITUTION_SEARCH_PANE_PLACEHOLDER_FIELD_NUMBER = 30;
    public static final int INSTITUTION_SEARCH_PANE_TIMEOUT_MESSAGE_FIELD_NUMBER = 33;
    public static final int INSTITUTION_SELECT_PANE_INSTITUTION_LIST_FIELD_NUMBER = 28;
    public static final int INSTITUTION_SELECT_PANE_SEARCH_BUTTON_FIELD_NUMBER = 27;
    public static final int INSTITUTION_SELECT_PANE_TITLE_FIELD_NUMBER = 26;

    /* renamed from: INSTITUTION_SELECT_PANE_USE_DYNAMIC_INSTITUTION_SELECT_FIELD_NUMBER */
    public static final int f1969x62664d77 = 69;
    public static final int IS_VENMO_SPECIFIC_FIELD_NUMBER = 107;
    public static final int LANGUAGE_FIELD_NUMBER = 53;
    public static final int LAYER_CONSENT_PANE_HEADER_TEXT_ACTION_FIELD_NUMBER = 102;
    public static final int LAYER_CONSENT_PANE_HEADER_TEXT_PROFILE_TERM_FIELD_NUMBER = 103;
    public static final int LOADING_PANE_TITLE_FIELD_NUMBER = 34;
    public static final int LOGO_URL_FIELD_NUMBER = 113;

    /* renamed from: MANUAL_VERIFICATION_OF_INCOME_UPLOAD_PANE_DOCUMENT_PREFERENCES_FIELD_NUMBER */
    public static final int f1970x982003e7 = 70;
    public static final int MFA_PANE_TITLE_FIELD_NUMBER = 41;
    public static final int OAUTH_LANDING_PANE_AFTER_CONTINUE_FIELD_NUMBER = 65;
    public static final int OAUTH_LANDING_PANE_AUTHENTICATE_BANK_FIELD_NUMBER = 64;
    public static final int OAUTH_LANDING_PANE_CONTINUE_TO_INSTITUTION_FIELD_NUMBER = 67;
    public static final int OAUTH_LANDING_PANE_REDIRECTED_BACK_FIELD_NUMBER = 66;
    private static volatile Parser<LinkCustomizations$LinkCustomization> PARSER = null;
    public static final int PRIVACY_INTERSTITIAL_PANE_CO_BRANDED_IS_ENABLED_FIELD_NUMBER = 73;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_ACCOUNT_NAME_FIELD_NUMBER = 74;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_FIELD_NUMBER = 48;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_AGREE_FIELD_NUMBER = 50;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 49;
    public static final int PRODUCT_DOMAIN_FIELD_NUMBER = 110;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_ALLOW_BUTTON_FIELD_NUMBER = 78;

    /* renamed from: PRODUCT_SCOPES_TRANSPARENCY_PANE_MODAL_DISMISS_BUTTON_FIELD_NUMBER */
    public static final int f1971xdcb857b4 = 81;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_FIELD_NUMBER = 80;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_UPDATE_USE_CASE_FIELD_NUMBER = 79;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_USE_CASE_FIELD_NUMBER = 77;
    public static final int PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_FIELD_NUMBER = 119;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_ADDRESS_FIELD_NUMBER = 96;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_DATE_OF_BIRTH_FIELD_NUMBER = 94;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_DOCUMENTS_FIELD_NUMBER = 98;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_EMAIL_FIELD_NUMBER = 95;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_NAME_FIELD_NUMBER = 93;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_SSN_FIELD_NUMBER = 97;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_SSN_LAST4_ONLY_FIELD_NUMBER = 109;
    public static final int PROFILE_ELIGIBILITY_ITEMS_ALLOW_INDIRECT_FIELD_NUMBER = 100;
    public static final int PROFILE_ELIGIBILITY_ITEMS_ALLOW_REAUTHENTICATION_FIELD_NUMBER = 101;
    public static final int PROFILE_ELIGIBILITY_REQUIRE_IDENTITY_FIELD_NUMBER = 92;
    public static final int PROFILE_ELIGIBILITY_REQUIRE_ITEMS_FIELD_NUMBER = 99;
    public static final int RECAPTCHA_PANE_MESSAGE_FIELD_NUMBER = 43;
    public static final int RECAPTCHA_PANE_TITLE_FIELD_NUMBER = 42;
    public static final int RECONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 10;
    public static final int RECONNECTED_PANE_MESSAGE_FIELD_NUMBER = 8;
    public static final int RECONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 9;
    public static final int RECONNECTED_PANE_TITLE_FIELD_NUMBER = 7;
    public static final int ROUTING_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 36;
    public static final int ROUTING_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 37;
    public static final int ROUTING_NUMBER_PANE_TITLE_FIELD_NUMBER = 35;
    public static final int START_DATE_DAYS_AGO_FIELD_NUMBER = 52;
    public static final int TEMPLATE_NAME_FIELD_NUMBER = 112;
    public static final int TEMPLATE_SYMBOL_FIELD_NUMBER = 114;
    public static final int TEMPLATE_TOKEN_CONFIGURATION_FIELD_NUMBER = 120;
    public static final int WALLET_SELECT_PANE_HIDDEN_WALLET_BRAND_LIST_FIELD_NUMBER = 84;
    public static final int WALLET_SELECT_PANE_PINNED_WALLET_BRAND_LIST_FIELD_NUMBER = 83;
    private static final Internal.ListAdapter.Converter<Integer, EnumC6068e> dtmUseCases_converter_ = new C6064a();
    private BoolValue accountClassBusinessDisabled_;
    private StringValue accountNumberPaneMessage_;
    private StringValue accountNumberPaneSubmitButton_;
    private StringValue accountNumberPaneTitle_;
    private BoolValue accountSelectPaneIsEnabled_;
    private BoolValue accountSelectPaneIsMultiAccountSelectEnabled_;
    private int accountSelectPaneMode_;
    private StringValue accountSelectPaneSubmitButton_;
    private StringValue accountSelectPaneTitle_;
    private AuthFlowType authFlowType_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private StringValue connectedPaneHeading_;
    private BoolValue connectedPaneIsEnabled_;
    private StringValue connectedPaneMessage_;
    private StringValue connectedPaneSubmitButton_;
    private StringValue connectedPaneTitle_;
    private BoolValue credentialPanePlaidLegalEnabled_;
    private StringValue credentialPaneResetPasswordButton_;
    private StringValue credentialPaneSubmitButton_;
    private StringValue credentialPaneTitle_;
    private StringValue credentialPaneTosContent_;
    private BoolValue credentialPaneTosEnabled_;
    private External$DocumentNumberOfUploadsPreferences documentIncomeUploadPaneNumberOfUploadsPreferences_;
    private StringValue documentTimeRange_;
    private BoolValue dtmEnablementStatus_;
    private int dtmUseCasesMemoizedSerializedSize;
    private StringValue errorPaneTitle_;
    private StringValue euConsentPaneCancel_;
    private StringValue euConsentPaneContactDetailsTitle_;
    private StringValue euConsentPaneContinueAgree_;
    private StringValue euConsentPaneContinue_;
    private StringValue euConsentPaneDetailsTitle_;
    private BoolValue euConsentPaneIsEnabled_;
    private StringValue euConsentPaneLinkWithPlaid_;
    private StringValue euConsentPaneSubmitAgree_;
    private StringValue euConsentPaneSubmitButton_;
    private StringValue euConsentPaneTransactionsTitle_;
    private StringValue exitPaneCancelButton_;
    private StringValue exitPaneHeading_;
    private StringValue exitPaneMessage_;
    private StringValue exitPaneSubmitButton_;
    private StringValue exitPaneTitle_;
    private int globalAppearance_;
    private Int32Value globalButtonBorderRadius_;
    private StringValue globalButtonColorHover_;
    private StringValue globalButtonColor_;
    private StringValue globalButtonDarkModeColorHover_;
    private StringValue globalButtonDarkModeColor_;
    private StringValue globalButtonDarkModeTextColor_;
    private StringValue globalButtonFontWeight_;
    private StringValue globalButtonTextColor_;
    private StringValue globalHighlightColor_;
    private StringValue globalOverlayBackgroundColor_;
    private StringValue identityMatchRiskProfileKey_;
    private StringValue institutionSearchPaneExitButton_;
    private StringValue institutionSearchPaneInitialMessage_;
    private StringValue institutionSearchPaneNoResultsMessage_;
    private StringValue institutionSearchPanePlaceholder_;
    private StringValue institutionSearchPaneTimeoutMessage_;
    private StringValue institutionSelectPaneSearchButton_;
    private StringValue institutionSelectPaneTitle_;
    private BoolValue institutionSelectPaneUseDynamicInstitutionSelect_;
    private BoolValue isVenmoSpecific_;
    private StringValue language_;
    private StringValue layerConsentPaneHeaderTextAction_;
    private StringValue layerConsentPaneHeaderTextProfileTerm_;
    private StringValue loadingPaneTitle_;
    private StringValue logoUrl_;
    private StringValue mfaPaneTitle_;
    private StringValue oauthLandingPaneAfterContinue_;
    private StringValue oauthLandingPaneAuthenticateBank_;
    private StringValue oauthLandingPaneContinueToInstitution_;
    private StringValue oauthLandingPaneRedirectedBack_;
    private BoolValue privacyInterstitialPaneCoBrandedIsEnabled_;
    private StringValue privacyInterstitialPaneHeadingAccountName_;
    private StringValue privacyInterstitialPaneHeading_;
    private StringValue privacyInterstitialPaneSubmitAgree_;
    private StringValue privacyInterstitialPaneSubmitButton_;
    private int productDomain_;
    private StringValue productScopesTransparencyPaneAllowButton_;
    private StringValue productScopesTransparencyPaneModalDismissButton_;
    private int productScopesTransparencyPaneMode_;
    private StringValue productScopesTransparencyPaneUpdateUseCase_;
    private StringValue productScopesTransparencyPaneUseCase_;
    private int profileEligibilityDesiredAccountType_;
    private int profileEligibilityIdentityFieldAddress_;
    private int profileEligibilityIdentityFieldDateOfBirth_;
    private int profileEligibilityIdentityFieldDocuments_;
    private int profileEligibilityIdentityFieldEmail_;
    private int profileEligibilityIdentityFieldName_;
    private BoolValue profileEligibilityIdentityFieldSsnLast4Only_;
    private int profileEligibilityIdentityFieldSsn_;
    private BoolValue profileEligibilityItemsAllowIndirect_;
    private BoolValue profileEligibilityItemsAllowReauthentication_;
    private int profileEligibilityRequireIdentity_;
    private int profileEligibilityRequireItems_;
    private StringValue recaptchaPaneMessage_;
    private StringValue recaptchaPaneTitle_;
    private BoolValue reconnectedPaneIsEnabled_;
    private StringValue reconnectedPaneMessage_;
    private StringValue reconnectedPaneSubmitButton_;
    private StringValue reconnectedPaneTitle_;
    private StringValue routingNumberPaneMessage_;
    private StringValue routingNumberPaneSubmitButton_;
    private StringValue routingNumberPaneTitle_;
    private Int32Value startDateDaysAgo_;
    private StringValue templateName_;
    private StringValue templateSymbol_;
    private LinkCustomizations$TemplateTokenConfiguration templateTokenConfiguration_;
    private Internal.ProtobufList<String> countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> institutionSelectPaneInstitutionList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> walletSelectPanePinnedWalletBrandList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> walletSelectPaneHiddenWalletBrandList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.IntList dtmUseCases_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<LinkCustomizations$DocumentPreference> manualVerificationOfIncomeUploadPaneDocumentPreferences_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<External$DocumentUploadFilePreference> documentIncomeUploadPaneDocumentFileTypePreferences_ = GeneratedMessageLite.emptyProtobufList();

    public static final class AuthFlowType extends GeneratedMessageLite<AuthFlowType, C6063a> implements MessageLiteOrBuilder {
        public static final int AUTH_TYPE_SELECT_ENABLED_FIELD_NUMBER = 7;
        public static final int AUTOMATED_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 2;
        public static final int DATABASE_INSIGHTS_ENABLED_FIELD_NUMBER = 6;
        public static final int DATABASE_MATCH_ENABLED_FIELD_NUMBER = 5;
        private static final AuthFlowType DEFAULT_INSTANCE;
        public static final int INSTANT_MATCH_ENABLED_FIELD_NUMBER = 1;
        public static final int INSTANT_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 4;
        private static volatile Parser<AuthFlowType> PARSER = null;
        public static final int REROUTE_TO_CREDENTIALS_FIELD_NUMBER = 9;
        public static final int SAME_DAY_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 3;
        public static final int SMS_MICRODEPOSITS_VERIFICATION_ENABLED_FIELD_NUMBER = 8;
        private boolean authTypeSelectEnabled_;
        private boolean automatedMicrodepositsEnabled_;
        private boolean databaseInsightsEnabled_;
        private boolean databaseMatchEnabled_;
        private boolean instantMatchEnabled_;
        private boolean instantMicrodepositsEnabled_;
        private String rerouteToCredentials_ = "";
        private boolean sameDayMicrodepositsEnabled_;
        private boolean smsMicrodepositsVerificationEnabled_;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$AuthFlowType$a */
        public static final class C6063a extends GeneratedMessageLite.Builder<AuthFlowType, C6063a> implements MessageLiteOrBuilder {
            public C6063a() {
                super(AuthFlowType.DEFAULT_INSTANCE);
            }
        }

        static {
            AuthFlowType authFlowType = new AuthFlowType();
            DEFAULT_INSTANCE = authFlowType;
            GeneratedMessageLite.registerDefaultInstance(AuthFlowType.class, authFlowType);
        }

        private AuthFlowType() {
        }

        private void clearAuthTypeSelectEnabled() {
            this.authTypeSelectEnabled_ = false;
        }

        private void clearAutomatedMicrodepositsEnabled() {
            this.automatedMicrodepositsEnabled_ = false;
        }

        private void clearDatabaseInsightsEnabled() {
            this.databaseInsightsEnabled_ = false;
        }

        private void clearDatabaseMatchEnabled() {
            this.databaseMatchEnabled_ = false;
        }

        private void clearInstantMatchEnabled() {
            this.instantMatchEnabled_ = false;
        }

        private void clearInstantMicrodepositsEnabled() {
            this.instantMicrodepositsEnabled_ = false;
        }

        private void clearRerouteToCredentials() {
            this.rerouteToCredentials_ = getDefaultInstance().getRerouteToCredentials();
        }

        private void clearSameDayMicrodepositsEnabled() {
            this.sameDayMicrodepositsEnabled_ = false;
        }

        private void clearSmsMicrodepositsVerificationEnabled() {
            this.smsMicrodepositsVerificationEnabled_ = false;
        }

        public static AuthFlowType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6063a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AuthFlowType parseDelimitedFrom(InputStream inputStream) {
            return (AuthFlowType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthFlowType parseFrom(ByteBuffer byteBuffer) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AuthFlowType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAuthTypeSelectEnabled(boolean z) {
            this.authTypeSelectEnabled_ = z;
        }

        private void setAutomatedMicrodepositsEnabled(boolean z) {
            this.automatedMicrodepositsEnabled_ = z;
        }

        private void setDatabaseInsightsEnabled(boolean z) {
            this.databaseInsightsEnabled_ = z;
        }

        private void setDatabaseMatchEnabled(boolean z) {
            this.databaseMatchEnabled_ = z;
        }

        private void setInstantMatchEnabled(boolean z) {
            this.instantMatchEnabled_ = z;
        }

        private void setInstantMicrodepositsEnabled(boolean z) {
            this.instantMicrodepositsEnabled_ = z;
        }

        private void setRerouteToCredentials(String str) {
            str.getClass();
            this.rerouteToCredentials_ = str;
        }

        private void setRerouteToCredentialsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rerouteToCredentials_ = byteString.toStringUtf8();
        }

        private void setSameDayMicrodepositsEnabled(boolean z) {
            this.sameDayMicrodepositsEnabled_ = z;
        }

        private void setSmsMicrodepositsVerificationEnabled(boolean z) {
            this.smsMicrodepositsVerificationEnabled_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6074a.f2030a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthFlowType();
                case 2:
                    return new C6063a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\tȈ", new Object[]{"instantMatchEnabled_", "automatedMicrodepositsEnabled_", "sameDayMicrodepositsEnabled_", "instantMicrodepositsEnabled_", "databaseMatchEnabled_", "databaseInsightsEnabled_", "authTypeSelectEnabled_", "smsMicrodepositsVerificationEnabled_", "rerouteToCredentials_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AuthFlowType> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AuthFlowType.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getAuthTypeSelectEnabled() {
            return this.authTypeSelectEnabled_;
        }

        public boolean getAutomatedMicrodepositsEnabled() {
            return this.automatedMicrodepositsEnabled_;
        }

        public boolean getDatabaseInsightsEnabled() {
            return this.databaseInsightsEnabled_;
        }

        public boolean getDatabaseMatchEnabled() {
            return this.databaseMatchEnabled_;
        }

        public boolean getInstantMatchEnabled() {
            return this.instantMatchEnabled_;
        }

        public boolean getInstantMicrodepositsEnabled() {
            return this.instantMicrodepositsEnabled_;
        }

        public String getRerouteToCredentials() {
            return this.rerouteToCredentials_;
        }

        public ByteString getRerouteToCredentialsBytes() {
            return ByteString.copyFromUtf8(this.rerouteToCredentials_);
        }

        public boolean getSameDayMicrodepositsEnabled() {
            return this.sameDayMicrodepositsEnabled_;
        }

        public boolean getSmsMicrodepositsVerificationEnabled() {
            return this.smsMicrodepositsVerificationEnabled_;
        }

        public static C6063a newBuilder(AuthFlowType authFlowType) {
            return DEFAULT_INSTANCE.createBuilder(authFlowType);
        }

        public static AuthFlowType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthFlowType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AuthFlowType parseFrom(ByteString byteString) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AuthFlowType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AuthFlowType parseFrom(byte[] bArr) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthFlowType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AuthFlowType parseFrom(InputStream inputStream) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthFlowType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthFlowType parseFrom(CodedInputStream codedInputStream) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AuthFlowType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthFlowType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$a */
    public class C6064a implements Internal.ListAdapter.Converter<Integer, EnumC6068e> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final EnumC6068e convert(Integer num) {
            EnumC6068e enumC6068eForNumber = EnumC6068e.forNumber(num.intValue());
            return enumC6068eForNumber == null ? EnumC6068e.UNRECOGNIZED : enumC6068eForNumber;
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$b */
    public enum EnumC6065b implements Internal.EnumLite {
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE(0),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT(1),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT(2),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE_VALUE = 0;

        /* renamed from: LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS_VALUE */
        public static final int f1972x9f01a755 = 3;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT_VALUE = 1;

        /* renamed from: b */
        public static final a f1973b = new a();

        /* renamed from: a */
        public final int f1975a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6065b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6065b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f1976a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6065b.forNumber(i) != null;
            }
        }

        EnumC6065b(int i) {
            this.f1975a = i;
        }

        public static EnumC6065b forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS;
        }

        public static Internal.EnumLiteMap<EnumC6065b> internalGetValueMap() {
            return f1973b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f1976a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f1975a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6065b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$c */
    public enum EnumC6066c implements Internal.EnumLite {
        LINK_CUSTOMIZATION_APPEARANCE_NONE(0),
        LINK_CUSTOMIZATION_APPEARANCE_LIGHT(1),
        LINK_CUSTOMIZATION_APPEARANCE_DARK(2),
        LINK_CUSTOMIZATION_APPEARANCE_SYSTEM(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_APPEARANCE_DARK_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_LIGHT_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_SYSTEM_VALUE = 3;

        /* renamed from: b */
        public static final a f1977b = new a();

        /* renamed from: a */
        public final int f1979a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6066c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6066c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f1980a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6066c.forNumber(i) != null;
            }
        }

        EnumC6066c(int i) {
            this.f1979a = i;
        }

        public static EnumC6066c forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_APPEARANCE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_APPEARANCE_LIGHT;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_APPEARANCE_DARK;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_APPEARANCE_SYSTEM;
        }

        public static Internal.EnumLiteMap<EnumC6066c> internalGetValueMap() {
            return f1977b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f1980a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f1979a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6066c valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$d */
    public static final class C6067d extends GeneratedMessageLite.Builder<LinkCustomizations$LinkCustomization, C6067d> implements MessageLiteOrBuilder {
        public C6067d() {
            super(LinkCustomizations$LinkCustomization.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$e */
    public enum EnumC6068e implements Internal.EnumLite {
        LINK_CUSTOMIZATION_DTM_USE_CASE_NONE(0),
        LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY(1),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS(2),
        LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE(3),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS(4),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD(5),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT(6),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD(7),
        LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES(8),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES(9),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS(10),
        LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY(11),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION(12),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES(13),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT(14),
        LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT(15),
        LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER(16),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT(17),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN(18),
        LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT(19),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME(20),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT(21),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING(22),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT(23),
        UNRECOGNIZED(-1);


        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER_VALUE */
        public static final int f1981xeb8da324 = 16;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT_VALUE = 19;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT_VALUE */
        public static final int f1983x8734536 = 23;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT_VALUE = 21;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING_VALUE */
        public static final int f1984x85e7a3f9 = 22;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN_VALUE = 18;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS_VALUE = 10;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY_VALUE = 11;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE_VALUE = 3;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT_VALUE = 17;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS_VALUE = 2;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES_VALUE */
        public static final int f1985xfe3203ba = 13;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES_VALUE = 9;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD_VALUE = 7;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY_VALUE = 1;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES_VALUE */
        public static final int f1986xbf93bc3d = 8;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT_VALUE */
        public static final int f1988x3a95769c = 15;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT_VALUE = 6;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD_VALUE */
        public static final int f1990x862cb5d0 = 5;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME_VALUE = 20;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION_VALUE */
        public static final int f1992x3834878 = 12;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS_VALUE */
        public static final int f1994xdd931744 = 4;

        /* renamed from: LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT_VALUE */
        public static final int f1996xf61cd191 = 14;

        /* renamed from: b */
        public static final a f1997b = new a();

        /* renamed from: a */
        public final int f1999a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$e$a */
        public class a implements Internal.EnumLiteMap<EnumC6068e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6068e.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$e$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2000a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6068e.forNumber(i) != null;
            }
        }

        EnumC6068e(int i) {
            this.f1999a = i;
        }

        public static EnumC6068e forNumber(int i) {
            switch (i) {
                case 0:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_NONE;
                case 1:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY;
                case 2:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS;
                case 3:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE;
                case 4:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS;
                case 5:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD;
                case 6:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT;
                case 7:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD;
                case 8:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES;
                case 9:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES;
                case 10:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS;
                case 11:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY;
                case 12:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION;
                case 13:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES;
                case 14:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT;
                case 15:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT;
                case 16:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER;
                case 17:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT;
                case 18:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN;
                case 19:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT;
                case 20:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME;
                case 21:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT;
                case 22:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING;
                case 23:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6068e> internalGetValueMap() {
            return f1997b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2000a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f1999a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6068e valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$f */
    public enum EnumC6069f implements Internal.EnumLite {
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN(0),
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK(1),
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER(2),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2001b = new a();

        /* renamed from: a */
        public final int f2003a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$f$a */
        public class a implements Internal.EnumLiteMap<EnumC6069f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6069f.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$f$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2004a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6069f.forNumber(i) != null;
            }
        }

        EnumC6069f(int i) {
            this.f2003a = i;
        }

        public static EnumC6069f forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK;
            }
            if (i != 2) {
                return null;
            }
            return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER;
        }

        public static Internal.EnumLiteMap<EnumC6069f> internalGetValueMap() {
            return f2001b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2004a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2003a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6069f valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$g */
    public enum EnumC6070g implements Internal.EnumLite {
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE(0),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE(1),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY(2),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE(3),
        UNRECOGNIZED(-1);


        /* renamed from: LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY_VALUE */
        public static final int f2006x1760c4f0 = 2;

        /* renamed from: LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE_VALUE */
        public static final int f2007x168aaf17 = 0;

        /* renamed from: LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE_VALUE */
        public static final int f2009xc2f9f8a4 = 1;

        /* renamed from: LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE_VALUE */
        public static final int f2011xf210d155 = 3;

        /* renamed from: b */
        public static final a f2012b = new a();

        /* renamed from: a */
        public final int f2014a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$g$a */
        public class a implements Internal.EnumLiteMap<EnumC6070g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6070g.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$g$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2015a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6070g.forNumber(i) != null;
            }
        }

        EnumC6070g(int i) {
            this.f2014a = i;
        }

        public static EnumC6070g forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE;
        }

        public static Internal.EnumLiteMap<EnumC6070g> internalGetValueMap() {
            return f2012b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2015a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2014a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6070g valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$h */
    public enum EnumC6071h implements Internal.EnumLite {
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN(0),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY(1),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME(2),
        UNRECOGNIZED(-1);


        /* renamed from: LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY_VALUE */
        public static final int f2016xb2799969 = 1;

        /* renamed from: LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME_VALUE */
        public static final int f2018xf436a94d = 2;

        /* renamed from: LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN_VALUE */
        public static final int f2020xe00cf7c7 = 0;

        /* renamed from: b */
        public static final a f2021b = new a();

        /* renamed from: a */
        public final int f2023a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$h$a */
        public class a implements Internal.EnumLiteMap<EnumC6071h> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6071h.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$h$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2024a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6071h.forNumber(i) != null;
            }
        }

        EnumC6071h(int i) {
            this.f2023a = i;
        }

        public static EnumC6071h forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY;
            }
            if (i != 2) {
                return null;
            }
            return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME;
        }

        public static Internal.EnumLiteMap<EnumC6071h> internalGetValueMap() {
            return f2021b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2024a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2023a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6071h valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$i */
    public enum EnumC6072i implements Internal.EnumLite {
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN(0),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE(1),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL(2),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT_VALUE = 3;

        /* renamed from: LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL_VALUE */
        public static final int f2025x227f8707 = 2;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2026b = new a();

        /* renamed from: a */
        public final int f2028a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$i$a */
        public class a implements Internal.EnumLiteMap<EnumC6072i> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6072i.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$i$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2029a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6072i.forNumber(i) != null;
            }
        }

        EnumC6072i(int i) {
            this.f2028a = i;
        }

        public static EnumC6072i forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT;
        }

        public static Internal.EnumLiteMap<EnumC6072i> internalGetValueMap() {
            return f2026b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2029a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2028a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6072i valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = new LinkCustomizations$LinkCustomization();
        DEFAULT_INSTANCE = linkCustomizations$LinkCustomization;
        GeneratedMessageLite.registerDefaultInstance(LinkCustomizations$LinkCustomization.class, linkCustomizations$LinkCustomization);
    }

    private LinkCustomizations$LinkCustomization() {
    }

    private void addAllCountryCodes(Iterable<String> iterable) {
        ensureCountryCodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.countryCodes_);
    }

    private void addAllDocumentIncomeUploadPaneDocumentFileTypePreferences(Iterable<? extends External$DocumentUploadFilePreference> iterable) {
        m1384x82583900();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.documentIncomeUploadPaneDocumentFileTypePreferences_);
    }

    private void addAllDtmUseCases(Iterable<? extends EnumC6068e> iterable) {
        ensureDtmUseCasesIsMutable();
        Iterator<? extends EnumC6068e> it = iterable.iterator();
        while (it.hasNext()) {
            this.dtmUseCases_.addInt(it.next().getNumber());
        }
    }

    private void addAllDtmUseCasesValue(Iterable<Integer> iterable) {
        ensureDtmUseCasesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.dtmUseCases_.addInt(it.next().intValue());
        }
    }

    private void addAllInstitutionSelectPaneInstitutionList(Iterable<String> iterable) {
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.institutionSelectPaneInstitutionList_);
    }

    private void addAllManualVerificationOfIncomeUploadPaneDocumentPreferences(Iterable<? extends LinkCustomizations$DocumentPreference> iterable) {
        m1385x4fa1827();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.manualVerificationOfIncomeUploadPaneDocumentPreferences_);
    }

    private void addAllWalletSelectPaneHiddenWalletBrandList(Iterable<String> iterable) {
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.walletSelectPaneHiddenWalletBrandList_);
    }

    private void addAllWalletSelectPanePinnedWalletBrandList(Iterable<String> iterable) {
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.walletSelectPanePinnedWalletBrandList_);
    }

    private void addCountryCodes(String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(str);
    }

    private void addCountryCodesBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(byteString.toStringUtf8());
    }

    private void addDocumentIncomeUploadPaneDocumentFileTypePreferences(External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        external$DocumentUploadFilePreference.getClass();
        m1384x82583900();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.add(external$DocumentUploadFilePreference);
    }

    private void addDtmUseCases(EnumC6068e enumC6068e) {
        enumC6068e.getClass();
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.addInt(enumC6068e.getNumber());
    }

    private void addDtmUseCasesValue(int i) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.addInt(i);
    }

    private void addInstitutionSelectPaneInstitutionList(String str) {
        str.getClass();
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(str);
    }

    private void addInstitutionSelectPaneInstitutionListBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(byteString.toStringUtf8());
    }

    private void addManualVerificationOfIncomeUploadPaneDocumentPreferences(LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        linkCustomizations$DocumentPreference.getClass();
        m1385x4fa1827();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.add(linkCustomizations$DocumentPreference);
    }

    private void addWalletSelectPaneHiddenWalletBrandList(String str) {
        str.getClass();
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.add(str);
    }

    private void addWalletSelectPaneHiddenWalletBrandListBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.add(byteString.toStringUtf8());
    }

    private void addWalletSelectPanePinnedWalletBrandList(String str) {
        str.getClass();
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.add(str);
    }

    private void addWalletSelectPanePinnedWalletBrandListBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.add(byteString.toStringUtf8());
    }

    private void clearAccountClassBusinessDisabled() {
        this.accountClassBusinessDisabled_ = null;
        this.bitField2_ &= -131073;
    }

    private void clearAccountNumberPaneMessage() {
        this.accountNumberPaneMessage_ = null;
        this.bitField1_ &= -1073741825;
    }

    private void clearAccountNumberPaneSubmitButton() {
        this.accountNumberPaneSubmitButton_ = null;
        this.bitField1_ &= Integer.MAX_VALUE;
    }

    private void clearAccountNumberPaneTitle() {
        this.accountNumberPaneTitle_ = null;
        this.bitField1_ &= -536870913;
    }

    private void clearAccountSelectPaneIsEnabled() {
        this.accountSelectPaneIsEnabled_ = null;
        this.bitField2_ &= -33;
    }

    private void clearAccountSelectPaneIsMultiAccountSelectEnabled() {
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = null;
        this.bitField2_ &= -65;
    }

    private void clearAccountSelectPaneMode() {
        this.accountSelectPaneMode_ = 0;
    }

    private void clearAccountSelectPaneSubmitButton() {
        this.accountSelectPaneSubmitButton_ = null;
        this.bitField2_ &= -17;
    }

    private void clearAccountSelectPaneTitle() {
        this.accountSelectPaneTitle_ = null;
        this.bitField2_ &= -9;
    }

    private void clearAuthFlowType() {
        this.authFlowType_ = null;
        this.bitField2_ &= -134217729;
    }

    private void clearConnectedPaneHeading() {
        this.connectedPaneHeading_ = null;
        this.bitField0_ &= -65537;
    }

    private void clearConnectedPaneIsEnabled() {
        this.connectedPaneIsEnabled_ = null;
        this.bitField0_ &= -32769;
    }

    private void clearConnectedPaneMessage() {
        this.connectedPaneMessage_ = null;
        this.bitField0_ &= -8193;
    }

    private void clearConnectedPaneSubmitButton() {
        this.connectedPaneSubmitButton_ = null;
        this.bitField0_ &= -16385;
    }

    private void clearConnectedPaneTitle() {
        this.connectedPaneTitle_ = null;
        this.bitField0_ &= -4097;
    }

    private void clearCountryCodes() {
        this.countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCredentialPanePlaidLegalEnabled() {
        this.credentialPanePlaidLegalEnabled_ = null;
        this.bitField0_ &= -16777217;
    }

    private void clearCredentialPaneResetPasswordButton() {
        this.credentialPaneResetPasswordButton_ = null;
        this.bitField0_ &= -8388609;
    }

    private void clearCredentialPaneSubmitButton() {
        this.credentialPaneSubmitButton_ = null;
        this.bitField0_ &= -4194305;
    }

    private void clearCredentialPaneTitle() {
        this.credentialPaneTitle_ = null;
        this.bitField0_ &= -2097153;
    }

    private void clearCredentialPaneTosContent() {
        this.credentialPaneTosContent_ = null;
        this.bitField0_ &= -33554433;
    }

    private void clearCredentialPaneTosEnabled() {
        this.credentialPaneTosEnabled_ = null;
        this.bitField0_ &= -67108865;
    }

    private void clearDocumentIncomeUploadPaneDocumentFileTypePreferences() {
        this.documentIncomeUploadPaneDocumentFileTypePreferences_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = null;
        this.bitField2_ &= -262145;
    }

    private void clearDocumentTimeRange() {
        this.documentTimeRange_ = null;
        this.bitField2_ &= -536870913;
    }

    private void clearDtmEnablementStatus() {
        this.dtmEnablementStatus_ = null;
        this.bitField2_ &= -65537;
    }

    private void clearDtmUseCases() {
        this.dtmUseCases_ = GeneratedMessageLite.emptyIntList();
    }

    private void clearErrorPaneTitle() {
        this.errorPaneTitle_ = null;
        this.bitField1_ &= -513;
    }

    private void clearEuConsentPaneCancel() {
        this.euConsentPaneCancel_ = null;
        this.bitField1_ &= -17;
    }

    private void clearEuConsentPaneContactDetailsTitle() {
        this.euConsentPaneContactDetailsTitle_ = null;
        this.bitField0_ &= -1073741825;
    }

    private void clearEuConsentPaneContinue() {
        this.euConsentPaneContinue_ = null;
        this.bitField1_ &= -9;
    }

    private void clearEuConsentPaneContinueAgree() {
        this.euConsentPaneContinueAgree_ = null;
        this.bitField1_ &= -5;
    }

    private void clearEuConsentPaneDetailsTitle() {
        this.euConsentPaneDetailsTitle_ = null;
        this.bitField1_ &= -3;
    }

    private void clearEuConsentPaneIsEnabled() {
        this.euConsentPaneIsEnabled_ = null;
        this.bitField0_ &= -134217729;
    }

    private void clearEuConsentPaneLinkWithPlaid() {
        this.euConsentPaneLinkWithPlaid_ = null;
        this.bitField0_ &= Integer.MAX_VALUE;
    }

    private void clearEuConsentPaneSubmitAgree() {
        this.euConsentPaneSubmitAgree_ = null;
        this.bitField0_ &= -536870913;
    }

    private void clearEuConsentPaneSubmitButton() {
        this.euConsentPaneSubmitButton_ = null;
        this.bitField0_ &= -268435457;
    }

    private void clearEuConsentPaneTransactionsTitle() {
        this.euConsentPaneTransactionsTitle_ = null;
        this.bitField1_ &= -2;
    }

    private void clearExitPaneCancelButton() {
        this.exitPaneCancelButton_ = null;
        this.bitField1_ &= -16385;
    }

    private void clearExitPaneHeading() {
        this.exitPaneHeading_ = null;
        this.bitField1_ &= -2049;
    }

    private void clearExitPaneMessage() {
        this.exitPaneMessage_ = null;
        this.bitField1_ &= -4097;
    }

    private void clearExitPaneSubmitButton() {
        this.exitPaneSubmitButton_ = null;
        this.bitField1_ &= -8193;
    }

    private void clearExitPaneTitle() {
        this.exitPaneTitle_ = null;
        this.bitField1_ &= -1025;
    }

    private void clearGlobalAppearance() {
        this.globalAppearance_ = 0;
    }

    private void clearGlobalButtonBorderRadius() {
        this.globalButtonBorderRadius_ = null;
        this.bitField0_ &= -129;
    }

    private void clearGlobalButtonColor() {
        this.globalButtonColor_ = null;
        this.bitField0_ &= -17;
    }

    private void clearGlobalButtonColorHover() {
        this.globalButtonColorHover_ = null;
        this.bitField0_ &= -33;
    }

    private void clearGlobalButtonDarkModeColor() {
        this.globalButtonDarkModeColor_ = null;
        this.bitField0_ &= -513;
    }

    private void clearGlobalButtonDarkModeColorHover() {
        this.globalButtonDarkModeColorHover_ = null;
        this.bitField0_ &= -1025;
    }

    private void clearGlobalButtonDarkModeTextColor() {
        this.globalButtonDarkModeTextColor_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearGlobalButtonFontWeight() {
        this.globalButtonFontWeight_ = null;
        this.bitField0_ &= -257;
    }

    private void clearGlobalButtonTextColor() {
        this.globalButtonTextColor_ = null;
        this.bitField0_ &= -65;
    }

    private void clearGlobalHighlightColor() {
        this.globalHighlightColor_ = null;
        this.bitField0_ &= -5;
    }

    private void clearGlobalOverlayBackgroundColor() {
        this.globalOverlayBackgroundColor_ = null;
        this.bitField0_ &= -9;
    }

    private void clearIdentityMatchRiskProfileKey() {
        this.identityMatchRiskProfileKey_ = null;
        this.bitField2_ &= -268435457;
    }

    private void clearInstitutionSearchPaneExitButton() {
        this.institutionSearchPaneExitButton_ = null;
        this.bitField1_ &= -262145;
    }

    private void clearInstitutionSearchPaneInitialMessage() {
        this.institutionSearchPaneInitialMessage_ = null;
        this.bitField1_ &= -1048577;
    }

    private void clearInstitutionSearchPaneNoResultsMessage() {
        this.institutionSearchPaneNoResultsMessage_ = null;
        this.bitField1_ &= -2097153;
    }

    private void clearInstitutionSearchPanePlaceholder() {
        this.institutionSearchPanePlaceholder_ = null;
        this.bitField1_ &= -524289;
    }

    private void clearInstitutionSearchPaneTimeoutMessage() {
        this.institutionSearchPaneTimeoutMessage_ = null;
        this.bitField1_ &= -4194305;
    }

    private void clearInstitutionSelectPaneInstitutionList() {
        this.institutionSelectPaneInstitutionList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearInstitutionSelectPaneSearchButton() {
        this.institutionSelectPaneSearchButton_ = null;
        this.bitField1_ &= -65537;
    }

    private void clearInstitutionSelectPaneTitle() {
        this.institutionSelectPaneTitle_ = null;
        this.bitField1_ &= -32769;
    }

    private void clearInstitutionSelectPaneUseDynamicInstitutionSelect() {
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = null;
        this.bitField1_ &= -131073;
    }

    private void clearIsVenmoSpecific() {
        this.isVenmoSpecific_ = null;
        this.bitField2_ &= -67108865;
    }

    private void clearLanguage() {
        this.language_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLayerConsentPaneHeaderTextAction() {
        this.layerConsentPaneHeaderTextAction_ = null;
        this.bitField1_ &= -8388609;
    }

    private void clearLayerConsentPaneHeaderTextProfileTerm() {
        this.layerConsentPaneHeaderTextProfileTerm_ = null;
        this.bitField1_ &= -16777217;
    }

    private void clearLoadingPaneTitle() {
        this.loadingPaneTitle_ = null;
        this.bitField1_ &= -33554433;
    }

    private void clearLogoUrl() {
        this.logoUrl_ = null;
        this.bitField2_ &= -4194305;
    }

    private void clearManualVerificationOfIncomeUploadPaneDocumentPreferences() {
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMfaPaneTitle() {
        this.mfaPaneTitle_ = null;
        this.bitField2_ &= -2;
    }

    private void clearOauthLandingPaneAfterContinue() {
        this.oauthLandingPaneAfterContinue_ = null;
        this.bitField1_ &= -65;
    }

    private void clearOauthLandingPaneAuthenticateBank() {
        this.oauthLandingPaneAuthenticateBank_ = null;
        this.bitField1_ &= -33;
    }

    private void clearOauthLandingPaneContinueToInstitution() {
        this.oauthLandingPaneContinueToInstitution_ = null;
        this.bitField1_ &= -257;
    }

    private void clearOauthLandingPaneRedirectedBack() {
        this.oauthLandingPaneRedirectedBack_ = null;
        this.bitField1_ &= -129;
    }

    private void clearPrivacyInterstitialPaneCoBrandedIsEnabled() {
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = null;
        this.bitField2_ &= -1025;
    }

    private void clearPrivacyInterstitialPaneHeading() {
        this.privacyInterstitialPaneHeading_ = null;
        this.bitField2_ &= -129;
    }

    private void clearPrivacyInterstitialPaneHeadingAccountName() {
        this.privacyInterstitialPaneHeadingAccountName_ = null;
        this.bitField2_ &= -2049;
    }

    private void clearPrivacyInterstitialPaneSubmitAgree() {
        this.privacyInterstitialPaneSubmitAgree_ = null;
        this.bitField2_ &= -513;
    }

    private void clearPrivacyInterstitialPaneSubmitButton() {
        this.privacyInterstitialPaneSubmitButton_ = null;
        this.bitField2_ &= -257;
    }

    private void clearProductDomain() {
        this.productDomain_ = 0;
    }

    private void clearProductScopesTransparencyPaneAllowButton() {
        this.productScopesTransparencyPaneAllowButton_ = null;
        this.bitField2_ &= -8193;
    }

    private void clearProductScopesTransparencyPaneModalDismissButton() {
        this.productScopesTransparencyPaneModalDismissButton_ = null;
        this.bitField2_ &= -32769;
    }

    private void clearProductScopesTransparencyPaneMode() {
        this.productScopesTransparencyPaneMode_ = 0;
    }

    private void clearProductScopesTransparencyPaneUpdateUseCase() {
        this.productScopesTransparencyPaneUpdateUseCase_ = null;
        this.bitField2_ &= -16385;
    }

    private void clearProductScopesTransparencyPaneUseCase() {
        this.productScopesTransparencyPaneUseCase_ = null;
        this.bitField2_ &= -4097;
    }

    private void clearProfileEligibilityDesiredAccountType() {
        this.profileEligibilityDesiredAccountType_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldAddress() {
        this.profileEligibilityIdentityFieldAddress_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldDateOfBirth() {
        this.profileEligibilityIdentityFieldDateOfBirth_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldDocuments() {
        this.profileEligibilityIdentityFieldDocuments_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldEmail() {
        this.profileEligibilityIdentityFieldEmail_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldName() {
        this.profileEligibilityIdentityFieldName_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldSsn() {
        this.profileEligibilityIdentityFieldSsn_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldSsnLast4Only() {
        this.profileEligibilityIdentityFieldSsnLast4Only_ = null;
        this.bitField2_ &= -8388609;
    }

    private void clearProfileEligibilityItemsAllowIndirect() {
        this.profileEligibilityItemsAllowIndirect_ = null;
        this.bitField2_ &= -16777217;
    }

    private void clearProfileEligibilityItemsAllowReauthentication() {
        this.profileEligibilityItemsAllowReauthentication_ = null;
        this.bitField2_ &= -33554433;
    }

    private void clearProfileEligibilityRequireIdentity() {
        this.profileEligibilityRequireIdentity_ = 0;
    }

    private void clearProfileEligibilityRequireItems() {
        this.profileEligibilityRequireItems_ = 0;
    }

    private void clearRecaptchaPaneMessage() {
        this.recaptchaPaneMessage_ = null;
        this.bitField2_ &= -5;
    }

    private void clearRecaptchaPaneTitle() {
        this.recaptchaPaneTitle_ = null;
        this.bitField2_ &= -3;
    }

    private void clearReconnectedPaneIsEnabled() {
        this.reconnectedPaneIsEnabled_ = null;
        this.bitField0_ &= -1048577;
    }

    private void clearReconnectedPaneMessage() {
        this.reconnectedPaneMessage_ = null;
        this.bitField0_ &= -262145;
    }

    private void clearReconnectedPaneSubmitButton() {
        this.reconnectedPaneSubmitButton_ = null;
        this.bitField0_ &= -524289;
    }

    private void clearReconnectedPaneTitle() {
        this.reconnectedPaneTitle_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearRoutingNumberPaneMessage() {
        this.routingNumberPaneMessage_ = null;
        this.bitField1_ &= -134217729;
    }

    private void clearRoutingNumberPaneSubmitButton() {
        this.routingNumberPaneSubmitButton_ = null;
        this.bitField1_ &= -268435457;
    }

    private void clearRoutingNumberPaneTitle() {
        this.routingNumberPaneTitle_ = null;
        this.bitField1_ &= -67108865;
    }

    private void clearStartDateDaysAgo() {
        this.startDateDaysAgo_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTemplateName() {
        this.templateName_ = null;
        this.bitField2_ &= -1048577;
    }

    private void clearTemplateSymbol() {
        this.templateSymbol_ = null;
        this.bitField2_ &= -2097153;
    }

    private void clearTemplateTokenConfiguration() {
        this.templateTokenConfiguration_ = null;
        this.bitField2_ &= -524289;
    }

    private void clearWalletSelectPaneHiddenWalletBrandList() {
        this.walletSelectPaneHiddenWalletBrandList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWalletSelectPanePinnedWalletBrandList() {
        this.walletSelectPanePinnedWalletBrandList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCountryCodesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* renamed from: ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable */
    private void m1384x82583900() {
        Internal.ProtobufList<External$DocumentUploadFilePreference> protobufList = this.documentIncomeUploadPaneDocumentFileTypePreferences_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.documentIncomeUploadPaneDocumentFileTypePreferences_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDtmUseCasesIsMutable() {
        Internal.IntList intList = this.dtmUseCases_;
        if (intList.isModifiable()) {
            return;
        }
        this.dtmUseCases_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureInstitutionSelectPaneInstitutionListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.institutionSelectPaneInstitutionList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.institutionSelectPaneInstitutionList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* renamed from: ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable */
    private void m1385x4fa1827() {
        Internal.ProtobufList<LinkCustomizations$DocumentPreference> protobufList = this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWalletSelectPaneHiddenWalletBrandListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.walletSelectPaneHiddenWalletBrandList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.walletSelectPaneHiddenWalletBrandList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWalletSelectPanePinnedWalletBrandListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.walletSelectPanePinnedWalletBrandList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.walletSelectPanePinnedWalletBrandList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LinkCustomizations$LinkCustomization getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAccountClassBusinessDisabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.accountClassBusinessDisabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.accountClassBusinessDisabled_ = boolValue;
        } else {
            this.accountClassBusinessDisabled_ = BoolValue.newBuilder(this.accountClassBusinessDisabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 131072;
    }

    private void mergeAccountNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.accountNumberPaneMessage_ = stringValue;
        } else {
            this.accountNumberPaneMessage_ = StringValue.newBuilder(this.accountNumberPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1073741824;
    }

    private void mergeAccountNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.accountNumberPaneSubmitButton_ = stringValue;
        } else {
            this.accountNumberPaneSubmitButton_ = StringValue.newBuilder(this.accountNumberPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    private void mergeAccountNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.accountNumberPaneTitle_ = stringValue;
        } else {
            this.accountNumberPaneTitle_ = StringValue.newBuilder(this.accountNumberPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 536870912;
    }

    private void mergeAccountSelectPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.accountSelectPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsEnabled_ = boolValue;
        } else {
            this.accountSelectPaneIsEnabled_ = BoolValue.newBuilder(this.accountSelectPaneIsEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 32;
    }

    private void mergeAccountSelectPaneIsMultiAccountSelectEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
        } else {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = BoolValue.newBuilder(this.accountSelectPaneIsMultiAccountSelectEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 64;
    }

    private void mergeAccountSelectPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountSelectPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.accountSelectPaneSubmitButton_ = stringValue;
        } else {
            this.accountSelectPaneSubmitButton_ = StringValue.newBuilder(this.accountSelectPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 16;
    }

    private void mergeAccountSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountSelectPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.accountSelectPaneTitle_ = stringValue;
        } else {
            this.accountSelectPaneTitle_ = StringValue.newBuilder(this.accountSelectPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 8;
    }

    private void mergeAuthFlowType(AuthFlowType authFlowType) {
        authFlowType.getClass();
        AuthFlowType authFlowType2 = this.authFlowType_;
        if (authFlowType2 == null || authFlowType2 == AuthFlowType.getDefaultInstance()) {
            this.authFlowType_ = authFlowType;
        } else {
            this.authFlowType_ = AuthFlowType.newBuilder(this.authFlowType_).mergeFrom((AuthFlowType.C6063a) authFlowType).buildPartial();
        }
        this.bitField2_ |= 134217728;
    }

    private void mergeConnectedPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneHeading_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.connectedPaneHeading_ = stringValue;
        } else {
            this.connectedPaneHeading_ = StringValue.newBuilder(this.connectedPaneHeading_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 65536;
    }

    private void mergeConnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.connectedPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.connectedPaneIsEnabled_ = boolValue;
        } else {
            this.connectedPaneIsEnabled_ = BoolValue.newBuilder(this.connectedPaneIsEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 32768;
    }

    private void mergeConnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.connectedPaneMessage_ = stringValue;
        } else {
            this.connectedPaneMessage_ = StringValue.newBuilder(this.connectedPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    private void mergeConnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.connectedPaneSubmitButton_ = stringValue;
        } else {
            this.connectedPaneSubmitButton_ = StringValue.newBuilder(this.connectedPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 16384;
    }

    private void mergeConnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.connectedPaneTitle_ = stringValue;
        } else {
            this.connectedPaneTitle_ = StringValue.newBuilder(this.connectedPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    private void mergeCredentialPanePlaidLegalEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.credentialPanePlaidLegalEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.credentialPanePlaidLegalEnabled_ = boolValue;
        } else {
            this.credentialPanePlaidLegalEnabled_ = BoolValue.newBuilder(this.credentialPanePlaidLegalEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 16777216;
    }

    private void mergeCredentialPaneResetPasswordButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneResetPasswordButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.credentialPaneResetPasswordButton_ = stringValue;
        } else {
            this.credentialPaneResetPasswordButton_ = StringValue.newBuilder(this.credentialPaneResetPasswordButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8388608;
    }

    private void mergeCredentialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.credentialPaneSubmitButton_ = stringValue;
        } else {
            this.credentialPaneSubmitButton_ = StringValue.newBuilder(this.credentialPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4194304;
    }

    private void mergeCredentialPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.credentialPaneTitle_ = stringValue;
        } else {
            this.credentialPaneTitle_ = StringValue.newBuilder(this.credentialPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2097152;
    }

    private void mergeCredentialPaneTosContent(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneTosContent_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.credentialPaneTosContent_ = stringValue;
        } else {
            this.credentialPaneTosContent_ = StringValue.newBuilder(this.credentialPaneTosContent_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 33554432;
    }

    private void mergeCredentialPaneTosEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.credentialPaneTosEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.credentialPaneTosEnabled_ = boolValue;
        } else {
            this.credentialPaneTosEnabled_ = BoolValue.newBuilder(this.credentialPaneTosEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 67108864;
    }

    private void mergeDocumentIncomeUploadPaneNumberOfUploadsPreferences(External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        external$DocumentNumberOfUploadsPreferences.getClass();
        External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences2 = this.documentIncomeUploadPaneNumberOfUploadsPreferences_;
        if (external$DocumentNumberOfUploadsPreferences2 == null || external$DocumentNumberOfUploadsPreferences2 == External$DocumentNumberOfUploadsPreferences.getDefaultInstance()) {
            this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = external$DocumentNumberOfUploadsPreferences;
        } else {
            this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = External$DocumentNumberOfUploadsPreferences.newBuilder(this.documentIncomeUploadPaneNumberOfUploadsPreferences_).mergeFrom((External$DocumentNumberOfUploadsPreferences.C6076a) external$DocumentNumberOfUploadsPreferences).buildPartial();
        }
        this.bitField2_ |= 262144;
    }

    private void mergeDocumentTimeRange(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.documentTimeRange_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.documentTimeRange_ = stringValue;
        } else {
            this.documentTimeRange_ = StringValue.newBuilder(this.documentTimeRange_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 536870912;
    }

    private void mergeDtmEnablementStatus(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.dtmEnablementStatus_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.dtmEnablementStatus_ = boolValue;
        } else {
            this.dtmEnablementStatus_ = BoolValue.newBuilder(this.dtmEnablementStatus_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 65536;
    }

    private void mergeErrorPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.errorPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.errorPaneTitle_ = stringValue;
        } else {
            this.errorPaneTitle_ = StringValue.newBuilder(this.errorPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 512;
    }

    private void mergeEuConsentPaneCancel(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneCancel_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneCancel_ = stringValue;
        } else {
            this.euConsentPaneCancel_ = StringValue.newBuilder(this.euConsentPaneCancel_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16;
    }

    private void mergeEuConsentPaneContactDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContactDetailsTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneContactDetailsTitle_ = stringValue;
        } else {
            this.euConsentPaneContactDetailsTitle_ = StringValue.newBuilder(this.euConsentPaneContactDetailsTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1073741824;
    }

    private void mergeEuConsentPaneContinue(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContinue_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneContinue_ = stringValue;
        } else {
            this.euConsentPaneContinue_ = StringValue.newBuilder(this.euConsentPaneContinue_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8;
    }

    private void mergeEuConsentPaneContinueAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContinueAgree_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneContinueAgree_ = stringValue;
        } else {
            this.euConsentPaneContinueAgree_ = StringValue.newBuilder(this.euConsentPaneContinueAgree_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4;
    }

    private void mergeEuConsentPaneDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneDetailsTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneDetailsTitle_ = stringValue;
        } else {
            this.euConsentPaneDetailsTitle_ = StringValue.newBuilder(this.euConsentPaneDetailsTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2;
    }

    private void mergeEuConsentPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.euConsentPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.euConsentPaneIsEnabled_ = boolValue;
        } else {
            this.euConsentPaneIsEnabled_ = BoolValue.newBuilder(this.euConsentPaneIsEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 134217728;
    }

    private void mergeEuConsentPaneLinkWithPlaid(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneLinkWithPlaid_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneLinkWithPlaid_ = stringValue;
        } else {
            this.euConsentPaneLinkWithPlaid_ = StringValue.newBuilder(this.euConsentPaneLinkWithPlaid_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void mergeEuConsentPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneSubmitAgree_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitAgree_ = stringValue;
        } else {
            this.euConsentPaneSubmitAgree_ = StringValue.newBuilder(this.euConsentPaneSubmitAgree_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 536870912;
    }

    private void mergeEuConsentPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitButton_ = stringValue;
        } else {
            this.euConsentPaneSubmitButton_ = StringValue.newBuilder(this.euConsentPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 268435456;
    }

    private void mergeEuConsentPaneTransactionsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneTransactionsTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.euConsentPaneTransactionsTitle_ = stringValue;
        } else {
            this.euConsentPaneTransactionsTitle_ = StringValue.newBuilder(this.euConsentPaneTransactionsTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1;
    }

    private void mergeExitPaneCancelButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneCancelButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.exitPaneCancelButton_ = stringValue;
        } else {
            this.exitPaneCancelButton_ = StringValue.newBuilder(this.exitPaneCancelButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16384;
    }

    private void mergeExitPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneHeading_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.exitPaneHeading_ = stringValue;
        } else {
            this.exitPaneHeading_ = StringValue.newBuilder(this.exitPaneHeading_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2048;
    }

    private void mergeExitPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.exitPaneMessage_ = stringValue;
        } else {
            this.exitPaneMessage_ = StringValue.newBuilder(this.exitPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4096;
    }

    private void mergeExitPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.exitPaneSubmitButton_ = stringValue;
        } else {
            this.exitPaneSubmitButton_ = StringValue.newBuilder(this.exitPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8192;
    }

    private void mergeExitPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.exitPaneTitle_ = stringValue;
        } else {
            this.exitPaneTitle_ = StringValue.newBuilder(this.exitPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1024;
    }

    private void mergeGlobalButtonBorderRadius(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.globalButtonBorderRadius_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.globalButtonBorderRadius_ = int32Value;
        } else {
            this.globalButtonBorderRadius_ = Int32Value.newBuilder(this.globalButtonBorderRadius_).mergeFrom((Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeGlobalButtonColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonColor_ = stringValue;
        } else {
            this.globalButtonColor_ = StringValue.newBuilder(this.globalButtonColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeGlobalButtonColorHover(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonColorHover_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonColorHover_ = stringValue;
        } else {
            this.globalButtonColorHover_ = StringValue.newBuilder(this.globalButtonColorHover_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeGlobalButtonDarkModeColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonDarkModeColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeColor_ = stringValue;
        } else {
            this.globalButtonDarkModeColor_ = StringValue.newBuilder(this.globalButtonDarkModeColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    private void mergeGlobalButtonDarkModeColorHover(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonDarkModeColorHover_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeColorHover_ = stringValue;
        } else {
            this.globalButtonDarkModeColorHover_ = StringValue.newBuilder(this.globalButtonDarkModeColorHover_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    private void mergeGlobalButtonDarkModeTextColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonDarkModeTextColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeTextColor_ = stringValue;
        } else {
            this.globalButtonDarkModeTextColor_ = StringValue.newBuilder(this.globalButtonDarkModeTextColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    private void mergeGlobalButtonFontWeight(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonFontWeight_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonFontWeight_ = stringValue;
        } else {
            this.globalButtonFontWeight_ = StringValue.newBuilder(this.globalButtonFontWeight_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeGlobalButtonTextColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalButtonTextColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalButtonTextColor_ = stringValue;
        } else {
            this.globalButtonTextColor_ = StringValue.newBuilder(this.globalButtonTextColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeGlobalHighlightColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalHighlightColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalHighlightColor_ = stringValue;
        } else {
            this.globalHighlightColor_ = StringValue.newBuilder(this.globalHighlightColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeGlobalOverlayBackgroundColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalOverlayBackgroundColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.globalOverlayBackgroundColor_ = stringValue;
        } else {
            this.globalOverlayBackgroundColor_ = StringValue.newBuilder(this.globalOverlayBackgroundColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeIdentityMatchRiskProfileKey(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.identityMatchRiskProfileKey_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.identityMatchRiskProfileKey_ = stringValue;
        } else {
            this.identityMatchRiskProfileKey_ = StringValue.newBuilder(this.identityMatchRiskProfileKey_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 268435456;
    }

    private void mergeInstitutionSearchPaneExitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneExitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSearchPaneExitButton_ = stringValue;
        } else {
            this.institutionSearchPaneExitButton_ = StringValue.newBuilder(this.institutionSearchPaneExitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 262144;
    }

    private void mergeInstitutionSearchPaneInitialMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneInitialMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSearchPaneInitialMessage_ = stringValue;
        } else {
            this.institutionSearchPaneInitialMessage_ = StringValue.newBuilder(this.institutionSearchPaneInitialMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1048576;
    }

    private void mergeInstitutionSearchPaneNoResultsMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneNoResultsMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSearchPaneNoResultsMessage_ = stringValue;
        } else {
            this.institutionSearchPaneNoResultsMessage_ = StringValue.newBuilder(this.institutionSearchPaneNoResultsMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2097152;
    }

    private void mergeInstitutionSearchPanePlaceholder(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPanePlaceholder_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSearchPanePlaceholder_ = stringValue;
        } else {
            this.institutionSearchPanePlaceholder_ = StringValue.newBuilder(this.institutionSearchPanePlaceholder_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 524288;
    }

    private void mergeInstitutionSearchPaneTimeoutMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneTimeoutMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSearchPaneTimeoutMessage_ = stringValue;
        } else {
            this.institutionSearchPaneTimeoutMessage_ = StringValue.newBuilder(this.institutionSearchPaneTimeoutMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4194304;
    }

    private void mergeInstitutionSelectPaneSearchButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSelectPaneSearchButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSelectPaneSearchButton_ = stringValue;
        } else {
            this.institutionSelectPaneSearchButton_ = StringValue.newBuilder(this.institutionSelectPaneSearchButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 65536;
    }

    private void mergeInstitutionSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSelectPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.institutionSelectPaneTitle_ = stringValue;
        } else {
            this.institutionSelectPaneTitle_ = StringValue.newBuilder(this.institutionSelectPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 32768;
    }

    private void mergeInstitutionSelectPaneUseDynamicInstitutionSelect(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
        } else {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = BoolValue.newBuilder(this.institutionSelectPaneUseDynamicInstitutionSelect_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField1_ |= 131072;
    }

    private void mergeIsVenmoSpecific(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.isVenmoSpecific_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.isVenmoSpecific_ = boolValue;
        } else {
            this.isVenmoSpecific_ = BoolValue.newBuilder(this.isVenmoSpecific_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 67108864;
    }

    private void mergeLanguage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.language_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.language_ = stringValue;
        } else {
            this.language_ = StringValue.newBuilder(this.language_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLayerConsentPaneHeaderTextAction(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.layerConsentPaneHeaderTextAction_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.layerConsentPaneHeaderTextAction_ = stringValue;
        } else {
            this.layerConsentPaneHeaderTextAction_ = StringValue.newBuilder(this.layerConsentPaneHeaderTextAction_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8388608;
    }

    private void mergeLayerConsentPaneHeaderTextProfileTerm(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.layerConsentPaneHeaderTextProfileTerm_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.layerConsentPaneHeaderTextProfileTerm_ = stringValue;
        } else {
            this.layerConsentPaneHeaderTextProfileTerm_ = StringValue.newBuilder(this.layerConsentPaneHeaderTextProfileTerm_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16777216;
    }

    private void mergeLoadingPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.loadingPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.loadingPaneTitle_ = stringValue;
        } else {
            this.loadingPaneTitle_ = StringValue.newBuilder(this.loadingPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 33554432;
    }

    private void mergeLogoUrl(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.logoUrl_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.logoUrl_ = stringValue;
        } else {
            this.logoUrl_ = StringValue.newBuilder(this.logoUrl_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4194304;
    }

    private void mergeMfaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.mfaPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.mfaPaneTitle_ = stringValue;
        } else {
            this.mfaPaneTitle_ = StringValue.newBuilder(this.mfaPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 1;
    }

    private void mergeOauthLandingPaneAfterContinue(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneAfterContinue_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAfterContinue_ = stringValue;
        } else {
            this.oauthLandingPaneAfterContinue_ = StringValue.newBuilder(this.oauthLandingPaneAfterContinue_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 64;
    }

    private void mergeOauthLandingPaneAuthenticateBank(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneAuthenticateBank_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAuthenticateBank_ = stringValue;
        } else {
            this.oauthLandingPaneAuthenticateBank_ = StringValue.newBuilder(this.oauthLandingPaneAuthenticateBank_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 32;
    }

    private void mergeOauthLandingPaneContinueToInstitution(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneContinueToInstitution_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.oauthLandingPaneContinueToInstitution_ = stringValue;
        } else {
            this.oauthLandingPaneContinueToInstitution_ = StringValue.newBuilder(this.oauthLandingPaneContinueToInstitution_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 256;
    }

    private void mergeOauthLandingPaneRedirectedBack(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneRedirectedBack_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.oauthLandingPaneRedirectedBack_ = stringValue;
        } else {
            this.oauthLandingPaneRedirectedBack_ = StringValue.newBuilder(this.oauthLandingPaneRedirectedBack_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 128;
    }

    private void mergePrivacyInterstitialPaneCoBrandedIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
        } else {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = BoolValue.newBuilder(this.privacyInterstitialPaneCoBrandedIsEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 1024;
    }

    private void mergePrivacyInterstitialPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneHeading_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeading_ = stringValue;
        } else {
            this.privacyInterstitialPaneHeading_ = StringValue.newBuilder(this.privacyInterstitialPaneHeading_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 128;
    }

    private void mergePrivacyInterstitialPaneHeadingAccountName(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneHeadingAccountName_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
        } else {
            this.privacyInterstitialPaneHeadingAccountName_ = StringValue.newBuilder(this.privacyInterstitialPaneHeadingAccountName_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2048;
    }

    private void mergePrivacyInterstitialPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneSubmitAgree_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitAgree_ = stringValue;
        } else {
            this.privacyInterstitialPaneSubmitAgree_ = StringValue.newBuilder(this.privacyInterstitialPaneSubmitAgree_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 512;
    }

    private void mergePrivacyInterstitialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitButton_ = stringValue;
        } else {
            this.privacyInterstitialPaneSubmitButton_ = StringValue.newBuilder(this.privacyInterstitialPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 256;
    }

    private void mergeProductScopesTransparencyPaneAllowButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.productScopesTransparencyPaneAllowButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneAllowButton_ = stringValue;
        } else {
            this.productScopesTransparencyPaneAllowButton_ = StringValue.newBuilder(this.productScopesTransparencyPaneAllowButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 8192;
    }

    private void mergeProductScopesTransparencyPaneModalDismissButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.productScopesTransparencyPaneModalDismissButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneModalDismissButton_ = stringValue;
        } else {
            this.productScopesTransparencyPaneModalDismissButton_ = StringValue.newBuilder(this.productScopesTransparencyPaneModalDismissButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 32768;
    }

    private void mergeProductScopesTransparencyPaneUpdateUseCase(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.productScopesTransparencyPaneUpdateUseCase_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneUpdateUseCase_ = stringValue;
        } else {
            this.productScopesTransparencyPaneUpdateUseCase_ = StringValue.newBuilder(this.productScopesTransparencyPaneUpdateUseCase_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 16384;
    }

    private void mergeProductScopesTransparencyPaneUseCase(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.productScopesTransparencyPaneUseCase_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneUseCase_ = stringValue;
        } else {
            this.productScopesTransparencyPaneUseCase_ = StringValue.newBuilder(this.productScopesTransparencyPaneUseCase_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4096;
    }

    private void mergeProfileEligibilityIdentityFieldSsnLast4Only(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.profileEligibilityIdentityFieldSsnLast4Only_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.profileEligibilityIdentityFieldSsnLast4Only_ = boolValue;
        } else {
            this.profileEligibilityIdentityFieldSsnLast4Only_ = BoolValue.newBuilder(this.profileEligibilityIdentityFieldSsnLast4Only_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 8388608;
    }

    private void mergeProfileEligibilityItemsAllowIndirect(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.profileEligibilityItemsAllowIndirect_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.profileEligibilityItemsAllowIndirect_ = boolValue;
        } else {
            this.profileEligibilityItemsAllowIndirect_ = BoolValue.newBuilder(this.profileEligibilityItemsAllowIndirect_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 16777216;
    }

    private void mergeProfileEligibilityItemsAllowReauthentication(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.profileEligibilityItemsAllowReauthentication_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.profileEligibilityItemsAllowReauthentication_ = boolValue;
        } else {
            this.profileEligibilityItemsAllowReauthentication_ = BoolValue.newBuilder(this.profileEligibilityItemsAllowReauthentication_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 33554432;
    }

    private void mergeRecaptchaPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.recaptchaPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.recaptchaPaneMessage_ = stringValue;
        } else {
            this.recaptchaPaneMessage_ = StringValue.newBuilder(this.recaptchaPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4;
    }

    private void mergeRecaptchaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.recaptchaPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.recaptchaPaneTitle_ = stringValue;
        } else {
            this.recaptchaPaneTitle_ = StringValue.newBuilder(this.recaptchaPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2;
    }

    private void mergeReconnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.reconnectedPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.reconnectedPaneIsEnabled_ = boolValue;
        } else {
            this.reconnectedPaneIsEnabled_ = BoolValue.newBuilder(this.reconnectedPaneIsEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 1048576;
    }

    private void mergeReconnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.reconnectedPaneMessage_ = stringValue;
        } else {
            this.reconnectedPaneMessage_ = StringValue.newBuilder(this.reconnectedPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 262144;
    }

    private void mergeReconnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.reconnectedPaneSubmitButton_ = stringValue;
        } else {
            this.reconnectedPaneSubmitButton_ = StringValue.newBuilder(this.reconnectedPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 524288;
    }

    private void mergeReconnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.reconnectedPaneTitle_ = stringValue;
        } else {
            this.reconnectedPaneTitle_ = StringValue.newBuilder(this.reconnectedPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 131072;
    }

    private void mergeRoutingNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneMessage_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.routingNumberPaneMessage_ = stringValue;
        } else {
            this.routingNumberPaneMessage_ = StringValue.newBuilder(this.routingNumberPaneMessage_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 134217728;
    }

    private void mergeRoutingNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.routingNumberPaneSubmitButton_ = stringValue;
        } else {
            this.routingNumberPaneSubmitButton_ = StringValue.newBuilder(this.routingNumberPaneSubmitButton_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 268435456;
    }

    private void mergeRoutingNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneTitle_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.routingNumberPaneTitle_ = stringValue;
        } else {
            this.routingNumberPaneTitle_ = StringValue.newBuilder(this.routingNumberPaneTitle_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 67108864;
    }

    private void mergeStartDateDaysAgo(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.startDateDaysAgo_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.startDateDaysAgo_ = int32Value;
        } else {
            this.startDateDaysAgo_ = Int32Value.newBuilder(this.startDateDaysAgo_).mergeFrom((Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeTemplateName(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.templateName_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.templateName_ = stringValue;
        } else {
            this.templateName_ = StringValue.newBuilder(this.templateName_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 1048576;
    }

    private void mergeTemplateSymbol(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.templateSymbol_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.templateSymbol_ = stringValue;
        } else {
            this.templateSymbol_ = StringValue.newBuilder(this.templateSymbol_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2097152;
    }

    private void mergeTemplateTokenConfiguration(LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        linkCustomizations$TemplateTokenConfiguration.getClass();
        LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration2 = this.templateTokenConfiguration_;
        if (linkCustomizations$TemplateTokenConfiguration2 == null || linkCustomizations$TemplateTokenConfiguration2 == LinkCustomizations$TemplateTokenConfiguration.getDefaultInstance()) {
            this.templateTokenConfiguration_ = linkCustomizations$TemplateTokenConfiguration;
        } else {
            this.templateTokenConfiguration_ = LinkCustomizations$TemplateTokenConfiguration.newBuilder(this.templateTokenConfiguration_).mergeFrom((LinkCustomizations$TemplateTokenConfiguration.C6073a) linkCustomizations$TemplateTokenConfiguration).buildPartial();
        }
        this.bitField2_ |= 524288;
    }

    public static C6067d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkCustomizations$LinkCustomization parseDelimitedFrom(InputStream inputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteBuffer byteBuffer) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkCustomizations$LinkCustomization> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDocumentIncomeUploadPaneDocumentFileTypePreferences(int i) {
        m1384x82583900();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.remove(i);
    }

    private void removeManualVerificationOfIncomeUploadPaneDocumentPreferences(int i) {
        m1385x4fa1827();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.remove(i);
    }

    private void setAccountClassBusinessDisabled(BoolValue boolValue) {
        boolValue.getClass();
        this.accountClassBusinessDisabled_ = boolValue;
        this.bitField2_ |= 131072;
    }

    private void setAccountNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneMessage_ = stringValue;
        this.bitField1_ |= 1073741824;
    }

    private void setAccountNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneSubmitButton_ = stringValue;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    private void setAccountNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneTitle_ = stringValue;
        this.bitField1_ |= 536870912;
    }

    private void setAccountSelectPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.accountSelectPaneIsEnabled_ = boolValue;
        this.bitField2_ |= 32;
    }

    private void setAccountSelectPaneIsMultiAccountSelectEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
        this.bitField2_ |= 64;
    }

    private void setAccountSelectPaneMode(EnumC6065b enumC6065b) {
        this.accountSelectPaneMode_ = enumC6065b.getNumber();
    }

    private void setAccountSelectPaneModeValue(int i) {
        this.accountSelectPaneMode_ = i;
    }

    private void setAccountSelectPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.accountSelectPaneSubmitButton_ = stringValue;
        this.bitField2_ |= 16;
    }

    private void setAccountSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.accountSelectPaneTitle_ = stringValue;
        this.bitField2_ |= 8;
    }

    private void setAuthFlowType(AuthFlowType authFlowType) {
        authFlowType.getClass();
        this.authFlowType_ = authFlowType;
        this.bitField2_ |= 134217728;
    }

    private void setConnectedPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneHeading_ = stringValue;
        this.bitField0_ |= 65536;
    }

    private void setConnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.connectedPaneIsEnabled_ = boolValue;
        this.bitField0_ |= 32768;
    }

    private void setConnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneMessage_ = stringValue;
        this.bitField0_ |= 8192;
    }

    private void setConnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 16384;
    }

    private void setConnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneTitle_ = stringValue;
        this.bitField0_ |= 4096;
    }

    private void setCountryCodes(int i, String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i, str);
    }

    private void setCredentialPanePlaidLegalEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.credentialPanePlaidLegalEnabled_ = boolValue;
        this.bitField0_ |= 16777216;
    }

    private void setCredentialPaneResetPasswordButton(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneResetPasswordButton_ = stringValue;
        this.bitField0_ |= 8388608;
    }

    private void setCredentialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 4194304;
    }

    private void setCredentialPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneTitle_ = stringValue;
        this.bitField0_ |= 2097152;
    }

    private void setCredentialPaneTosContent(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneTosContent_ = stringValue;
        this.bitField0_ |= 33554432;
    }

    private void setCredentialPaneTosEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.credentialPaneTosEnabled_ = boolValue;
        this.bitField0_ |= 67108864;
    }

    private void setDocumentIncomeUploadPaneDocumentFileTypePreferences(int i, External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        external$DocumentUploadFilePreference.getClass();
        m1384x82583900();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.set(i, external$DocumentUploadFilePreference);
    }

    private void setDocumentIncomeUploadPaneNumberOfUploadsPreferences(External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        external$DocumentNumberOfUploadsPreferences.getClass();
        this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = external$DocumentNumberOfUploadsPreferences;
        this.bitField2_ |= 262144;
    }

    private void setDocumentTimeRange(StringValue stringValue) {
        stringValue.getClass();
        this.documentTimeRange_ = stringValue;
        this.bitField2_ |= 536870912;
    }

    private void setDtmEnablementStatus(BoolValue boolValue) {
        boolValue.getClass();
        this.dtmEnablementStatus_ = boolValue;
        this.bitField2_ |= 65536;
    }

    private void setDtmUseCases(int i, EnumC6068e enumC6068e) {
        enumC6068e.getClass();
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.setInt(i, enumC6068e.getNumber());
    }

    private void setDtmUseCasesValue(int i, int i2) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.setInt(i, i2);
    }

    private void setErrorPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.errorPaneTitle_ = stringValue;
        this.bitField1_ |= 512;
    }

    private void setEuConsentPaneCancel(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneCancel_ = stringValue;
        this.bitField1_ |= 16;
    }

    private void setEuConsentPaneContactDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContactDetailsTitle_ = stringValue;
        this.bitField0_ |= 1073741824;
    }

    private void setEuConsentPaneContinue(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContinue_ = stringValue;
        this.bitField1_ |= 8;
    }

    private void setEuConsentPaneContinueAgree(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContinueAgree_ = stringValue;
        this.bitField1_ |= 4;
    }

    private void setEuConsentPaneDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneDetailsTitle_ = stringValue;
        this.bitField1_ |= 2;
    }

    private void setEuConsentPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.euConsentPaneIsEnabled_ = boolValue;
        this.bitField0_ |= 134217728;
    }

    private void setEuConsentPaneLinkWithPlaid(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneLinkWithPlaid_ = stringValue;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void setEuConsentPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneSubmitAgree_ = stringValue;
        this.bitField0_ |= 536870912;
    }

    private void setEuConsentPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 268435456;
    }

    private void setEuConsentPaneTransactionsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneTransactionsTitle_ = stringValue;
        this.bitField1_ |= 1;
    }

    private void setExitPaneCancelButton(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneCancelButton_ = stringValue;
        this.bitField1_ |= 16384;
    }

    private void setExitPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneHeading_ = stringValue;
        this.bitField1_ |= 2048;
    }

    private void setExitPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneMessage_ = stringValue;
        this.bitField1_ |= 4096;
    }

    private void setExitPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneSubmitButton_ = stringValue;
        this.bitField1_ |= 8192;
    }

    private void setExitPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneTitle_ = stringValue;
        this.bitField1_ |= 1024;
    }

    private void setGlobalAppearance(EnumC6066c enumC6066c) {
        this.globalAppearance_ = enumC6066c.getNumber();
    }

    private void setGlobalAppearanceValue(int i) {
        this.globalAppearance_ = i;
    }

    private void setGlobalButtonBorderRadius(Int32Value int32Value) {
        int32Value.getClass();
        this.globalButtonBorderRadius_ = int32Value;
        this.bitField0_ |= 128;
    }

    private void setGlobalButtonColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonColor_ = stringValue;
        this.bitField0_ |= 16;
    }

    private void setGlobalButtonColorHover(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonColorHover_ = stringValue;
        this.bitField0_ |= 32;
    }

    private void setGlobalButtonDarkModeColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonDarkModeColor_ = stringValue;
        this.bitField0_ |= 512;
    }

    private void setGlobalButtonDarkModeColorHover(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonDarkModeColorHover_ = stringValue;
        this.bitField0_ |= 1024;
    }

    private void setGlobalButtonDarkModeTextColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonDarkModeTextColor_ = stringValue;
        this.bitField0_ |= 2048;
    }

    private void setGlobalButtonFontWeight(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonFontWeight_ = stringValue;
        this.bitField0_ |= 256;
    }

    private void setGlobalButtonTextColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalButtonTextColor_ = stringValue;
        this.bitField0_ |= 64;
    }

    private void setGlobalHighlightColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalHighlightColor_ = stringValue;
        this.bitField0_ |= 4;
    }

    private void setGlobalOverlayBackgroundColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalOverlayBackgroundColor_ = stringValue;
        this.bitField0_ |= 8;
    }

    private void setIdentityMatchRiskProfileKey(StringValue stringValue) {
        stringValue.getClass();
        this.identityMatchRiskProfileKey_ = stringValue;
        this.bitField2_ |= 268435456;
    }

    private void setInstitutionSearchPaneExitButton(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneExitButton_ = stringValue;
        this.bitField1_ |= 262144;
    }

    private void setInstitutionSearchPaneInitialMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneInitialMessage_ = stringValue;
        this.bitField1_ |= 1048576;
    }

    private void setInstitutionSearchPaneNoResultsMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneNoResultsMessage_ = stringValue;
        this.bitField1_ |= 2097152;
    }

    private void setInstitutionSearchPanePlaceholder(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPanePlaceholder_ = stringValue;
        this.bitField1_ |= 524288;
    }

    private void setInstitutionSearchPaneTimeoutMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneTimeoutMessage_ = stringValue;
        this.bitField1_ |= 4194304;
    }

    private void setInstitutionSelectPaneInstitutionList(int i, String str) {
        str.getClass();
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.set(i, str);
    }

    private void setInstitutionSelectPaneSearchButton(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSelectPaneSearchButton_ = stringValue;
        this.bitField1_ |= 65536;
    }

    private void setInstitutionSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSelectPaneTitle_ = stringValue;
        this.bitField1_ |= 32768;
    }

    private void setInstitutionSelectPaneUseDynamicInstitutionSelect(BoolValue boolValue) {
        boolValue.getClass();
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
        this.bitField1_ |= 131072;
    }

    private void setIsVenmoSpecific(BoolValue boolValue) {
        boolValue.getClass();
        this.isVenmoSpecific_ = boolValue;
        this.bitField2_ |= 67108864;
    }

    private void setLanguage(StringValue stringValue) {
        stringValue.getClass();
        this.language_ = stringValue;
        this.bitField0_ |= 1;
    }

    private void setLayerConsentPaneHeaderTextAction(StringValue stringValue) {
        stringValue.getClass();
        this.layerConsentPaneHeaderTextAction_ = stringValue;
        this.bitField1_ |= 8388608;
    }

    private void setLayerConsentPaneHeaderTextProfileTerm(StringValue stringValue) {
        stringValue.getClass();
        this.layerConsentPaneHeaderTextProfileTerm_ = stringValue;
        this.bitField1_ |= 16777216;
    }

    private void setLoadingPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.loadingPaneTitle_ = stringValue;
        this.bitField1_ |= 33554432;
    }

    private void setLogoUrl(StringValue stringValue) {
        stringValue.getClass();
        this.logoUrl_ = stringValue;
        this.bitField2_ |= 4194304;
    }

    private void setManualVerificationOfIncomeUploadPaneDocumentPreferences(int i, LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        linkCustomizations$DocumentPreference.getClass();
        m1385x4fa1827();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.set(i, linkCustomizations$DocumentPreference);
    }

    private void setMfaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.mfaPaneTitle_ = stringValue;
        this.bitField2_ |= 1;
    }

    private void setOauthLandingPaneAfterContinue(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneAfterContinue_ = stringValue;
        this.bitField1_ |= 64;
    }

    private void setOauthLandingPaneAuthenticateBank(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneAuthenticateBank_ = stringValue;
        this.bitField1_ |= 32;
    }

    private void setOauthLandingPaneContinueToInstitution(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneContinueToInstitution_ = stringValue;
        this.bitField1_ |= 256;
    }

    private void setOauthLandingPaneRedirectedBack(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneRedirectedBack_ = stringValue;
        this.bitField1_ |= 128;
    }

    private void setPrivacyInterstitialPaneCoBrandedIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
        this.bitField2_ |= 1024;
    }

    private void setPrivacyInterstitialPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneHeading_ = stringValue;
        this.bitField2_ |= 128;
    }

    private void setPrivacyInterstitialPaneHeadingAccountName(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
        this.bitField2_ |= 2048;
    }

    private void setPrivacyInterstitialPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneSubmitAgree_ = stringValue;
        this.bitField2_ |= 512;
    }

    private void setPrivacyInterstitialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneSubmitButton_ = stringValue;
        this.bitField2_ |= 256;
    }

    private void setProductDomain(EnumC6069f enumC6069f) {
        this.productDomain_ = enumC6069f.getNumber();
    }

    private void setProductDomainValue(int i) {
        this.productDomain_ = i;
    }

    private void setProductScopesTransparencyPaneAllowButton(StringValue stringValue) {
        stringValue.getClass();
        this.productScopesTransparencyPaneAllowButton_ = stringValue;
        this.bitField2_ |= 8192;
    }

    private void setProductScopesTransparencyPaneModalDismissButton(StringValue stringValue) {
        stringValue.getClass();
        this.productScopesTransparencyPaneModalDismissButton_ = stringValue;
        this.bitField2_ |= 32768;
    }

    private void setProductScopesTransparencyPaneMode(EnumC6070g enumC6070g) {
        this.productScopesTransparencyPaneMode_ = enumC6070g.getNumber();
    }

    private void setProductScopesTransparencyPaneModeValue(int i) {
        this.productScopesTransparencyPaneMode_ = i;
    }

    private void setProductScopesTransparencyPaneUpdateUseCase(StringValue stringValue) {
        stringValue.getClass();
        this.productScopesTransparencyPaneUpdateUseCase_ = stringValue;
        this.bitField2_ |= 16384;
    }

    private void setProductScopesTransparencyPaneUseCase(StringValue stringValue) {
        stringValue.getClass();
        this.productScopesTransparencyPaneUseCase_ = stringValue;
        this.bitField2_ |= 4096;
    }

    private void setProfileEligibilityDesiredAccountType(EnumC6071h enumC6071h) {
        this.profileEligibilityDesiredAccountType_ = enumC6071h.getNumber();
    }

    private void setProfileEligibilityDesiredAccountTypeValue(int i) {
        this.profileEligibilityDesiredAccountType_ = i;
    }

    private void setProfileEligibilityIdentityFieldAddress(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldAddress_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldAddressValue(int i) {
        this.profileEligibilityIdentityFieldAddress_ = i;
    }

    private void setProfileEligibilityIdentityFieldDateOfBirth(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldDateOfBirth_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldDateOfBirthValue(int i) {
        this.profileEligibilityIdentityFieldDateOfBirth_ = i;
    }

    private void setProfileEligibilityIdentityFieldDocuments(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldDocuments_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldDocumentsValue(int i) {
        this.profileEligibilityIdentityFieldDocuments_ = i;
    }

    private void setProfileEligibilityIdentityFieldEmail(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldEmail_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldEmailValue(int i) {
        this.profileEligibilityIdentityFieldEmail_ = i;
    }

    private void setProfileEligibilityIdentityFieldName(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldName_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldNameValue(int i) {
        this.profileEligibilityIdentityFieldName_ = i;
    }

    private void setProfileEligibilityIdentityFieldSsn(EnumC6072i enumC6072i) {
        this.profileEligibilityIdentityFieldSsn_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityIdentityFieldSsnLast4Only(BoolValue boolValue) {
        boolValue.getClass();
        this.profileEligibilityIdentityFieldSsnLast4Only_ = boolValue;
        this.bitField2_ |= 8388608;
    }

    private void setProfileEligibilityIdentityFieldSsnValue(int i) {
        this.profileEligibilityIdentityFieldSsn_ = i;
    }

    private void setProfileEligibilityItemsAllowIndirect(BoolValue boolValue) {
        boolValue.getClass();
        this.profileEligibilityItemsAllowIndirect_ = boolValue;
        this.bitField2_ |= 16777216;
    }

    private void setProfileEligibilityItemsAllowReauthentication(BoolValue boolValue) {
        boolValue.getClass();
        this.profileEligibilityItemsAllowReauthentication_ = boolValue;
        this.bitField2_ |= 33554432;
    }

    private void setProfileEligibilityRequireIdentity(EnumC6072i enumC6072i) {
        this.profileEligibilityRequireIdentity_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityRequireIdentityValue(int i) {
        this.profileEligibilityRequireIdentity_ = i;
    }

    private void setProfileEligibilityRequireItems(EnumC6072i enumC6072i) {
        this.profileEligibilityRequireItems_ = enumC6072i.getNumber();
    }

    private void setProfileEligibilityRequireItemsValue(int i) {
        this.profileEligibilityRequireItems_ = i;
    }

    private void setRecaptchaPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.recaptchaPaneMessage_ = stringValue;
        this.bitField2_ |= 4;
    }

    private void setRecaptchaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.recaptchaPaneTitle_ = stringValue;
        this.bitField2_ |= 2;
    }

    private void setReconnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.reconnectedPaneIsEnabled_ = boolValue;
        this.bitField0_ |= 1048576;
    }

    private void setReconnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneMessage_ = stringValue;
        this.bitField0_ |= 262144;
    }

    private void setReconnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 524288;
    }

    private void setReconnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneTitle_ = stringValue;
        this.bitField0_ |= 131072;
    }

    private void setRoutingNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneMessage_ = stringValue;
        this.bitField1_ |= 134217728;
    }

    private void setRoutingNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneSubmitButton_ = stringValue;
        this.bitField1_ |= 268435456;
    }

    private void setRoutingNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneTitle_ = stringValue;
        this.bitField1_ |= 67108864;
    }

    private void setStartDateDaysAgo(Int32Value int32Value) {
        int32Value.getClass();
        this.startDateDaysAgo_ = int32Value;
        this.bitField0_ |= 2;
    }

    private void setTemplateName(StringValue stringValue) {
        stringValue.getClass();
        this.templateName_ = stringValue;
        this.bitField2_ |= 1048576;
    }

    private void setTemplateSymbol(StringValue stringValue) {
        stringValue.getClass();
        this.templateSymbol_ = stringValue;
        this.bitField2_ |= 2097152;
    }

    private void setTemplateTokenConfiguration(LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        linkCustomizations$TemplateTokenConfiguration.getClass();
        this.templateTokenConfiguration_ = linkCustomizations$TemplateTokenConfiguration;
        this.bitField2_ |= 524288;
    }

    private void setWalletSelectPaneHiddenWalletBrandList(int i, String str) {
        str.getClass();
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.set(i, str);
    }

    private void setWalletSelectPanePinnedWalletBrandList(int i, String str) {
        str.getClass();
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.set(i, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6074a.f2030a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkCustomizations$LinkCustomization();
            case 2:
                return new C6067d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000r\u0000\u0003\u0001xr\u0000\u0007\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\f\u0004ဉ\r\u0005ဉ\u000e\u0006ဉ\u000f\u0007ဉ\u0011\bဉ\u0012\tဉ\u0013\nဉ\u0014\u000bဉ\u0015\fဉ\u0016\rဉ\u0017\u000eဉ\u0018\u000fဉ\u0019\u0010ဉ\u001a\u0011ဉ\u001b\u0012ဉ\u001c\u0013ဉ\u001d\u0014ဉ)\u0015ဉ*\u0016ဉ+\u0017ဉ,\u0018ဉ-\u0019ဉ.\u001aဉ/\u001bဉ0\u001cȚ\u001dဉ2\u001eဉ3\u001fဉ4 ဉ5!ဉ6\"ဉ9#ဉ:$ဉ;%ဉ<&ဉ='ဉ>(ဉ?)ဉ@*ဉA+ဉB,ဉC-ဉD.ဉE/ဉF0ဉG1ဉH2ဉI4ဉ\u00015ဉ\u00007ဉ\u00108Ț9ဉ\u001e:ဉ\u001f;ဉ <ဉ!=ဉ\">ဉ#?ဉ$@ဉ%Aဉ&Bဉ'Cဉ(Eဉ1F\u001bIဉJJဉKK\fLဉQMဉLNဉMOဉNP\fQဉOR\fSȚTȚUဉ\u0004Vဉ\u0005Wဉ\u0006Xဉ\u0007Yဉ\bZ\u001b[ဉR\\\f]\f^\f_\f`\fa\fb\fc\fdဉXeဉYfဉ7gဉ8h,iဉPjဉ\\kဉZlဉ]mဉWn\fpဉTqဉVrဉUsဉ[tဉ\tuဉ\nvဉ\u000bw\fxဉS", new Object[]{"bitField0_", "bitField1_", "bitField2_", "globalHighlightColor_", "globalOverlayBackgroundColor_", "connectedPaneTitle_", "connectedPaneMessage_", "connectedPaneSubmitButton_", "connectedPaneIsEnabled_", "reconnectedPaneTitle_", "reconnectedPaneMessage_", "reconnectedPaneSubmitButton_", "reconnectedPaneIsEnabled_", "credentialPaneTitle_", "credentialPaneSubmitButton_", "credentialPaneResetPasswordButton_", "credentialPanePlaidLegalEnabled_", "credentialPaneTosContent_", "credentialPaneTosEnabled_", "euConsentPaneIsEnabled_", "euConsentPaneSubmitButton_", "euConsentPaneSubmitAgree_", "errorPaneTitle_", "exitPaneTitle_", "exitPaneHeading_", "exitPaneMessage_", "exitPaneSubmitButton_", "exitPaneCancelButton_", "institutionSelectPaneTitle_", "institutionSelectPaneSearchButton_", "institutionSelectPaneInstitutionList_", "institutionSearchPaneExitButton_", "institutionSearchPanePlaceholder_", "institutionSearchPaneInitialMessage_", "institutionSearchPaneNoResultsMessage_", "institutionSearchPaneTimeoutMessage_", "loadingPaneTitle_", "routingNumberPaneTitle_", "routingNumberPaneMessage_", "routingNumberPaneSubmitButton_", "accountNumberPaneTitle_", "accountNumberPaneMessage_", "accountNumberPaneSubmitButton_", "mfaPaneTitle_", "recaptchaPaneTitle_", "recaptchaPaneMessage_", "accountSelectPaneTitle_", "accountSelectPaneSubmitButton_", "accountSelectPaneIsEnabled_", "accountSelectPaneIsMultiAccountSelectEnabled_", "privacyInterstitialPaneHeading_", "privacyInterstitialPaneSubmitButton_", "privacyInterstitialPaneSubmitAgree_", "startDateDaysAgo_", "language_", "connectedPaneHeading_", "countryCodes_", "euConsentPaneContactDetailsTitle_", "euConsentPaneLinkWithPlaid_", "euConsentPaneTransactionsTitle_", "euConsentPaneDetailsTitle_", "euConsentPaneContinueAgree_", "euConsentPaneContinue_", "euConsentPaneCancel_", "oauthLandingPaneAuthenticateBank_", "oauthLandingPaneAfterContinue_", "oauthLandingPaneRedirectedBack_", "oauthLandingPaneContinueToInstitution_", "institutionSelectPaneUseDynamicInstitutionSelect_", "manualVerificationOfIncomeUploadPaneDocumentPreferences_", LinkCustomizations$DocumentPreference.class, "privacyInterstitialPaneCoBrandedIsEnabled_", "privacyInterstitialPaneHeadingAccountName_", "accountSelectPaneMode_", "accountClassBusinessDisabled_", "productScopesTransparencyPaneUseCase_", "productScopesTransparencyPaneAllowButton_", "productScopesTransparencyPaneUpdateUseCase_", "productScopesTransparencyPaneMode_", "productScopesTransparencyPaneModalDismissButton_", "globalAppearance_", "walletSelectPanePinnedWalletBrandList_", "walletSelectPaneHiddenWalletBrandList_", "globalButtonColor_", "globalButtonColorHover_", "globalButtonTextColor_", "globalButtonBorderRadius_", "globalButtonFontWeight_", "documentIncomeUploadPaneDocumentFileTypePreferences_", External$DocumentUploadFilePreference.class, "documentIncomeUploadPaneNumberOfUploadsPreferences_", "profileEligibilityRequireIdentity_", "profileEligibilityIdentityFieldName_", "profileEligibilityIdentityFieldDateOfBirth_", "profileEligibilityIdentityFieldEmail_", "profileEligibilityIdentityFieldAddress_", "profileEligibilityIdentityFieldSsn_", "profileEligibilityIdentityFieldDocuments_", "profileEligibilityRequireItems_", "profileEligibilityItemsAllowIndirect_", "profileEligibilityItemsAllowReauthentication_", "layerConsentPaneHeaderTextAction_", "layerConsentPaneHeaderTextProfileTerm_", "dtmUseCases_", "dtmEnablementStatus_", "identityMatchRiskProfileKey_", "isVenmoSpecific_", "documentTimeRange_", "profileEligibilityIdentityFieldSsnLast4Only_", "productDomain_", "templateName_", "logoUrl_", "templateSymbol_", "authFlowType_", "globalButtonDarkModeColor_", "globalButtonDarkModeColorHover_", "globalButtonDarkModeTextColor_", "profileEligibilityDesiredAccountType_", "templateTokenConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkCustomizations$LinkCustomization> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LinkCustomizations$LinkCustomization.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public BoolValue getAccountClassBusinessDisabled() {
        BoolValue boolValue = this.accountClassBusinessDisabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getAccountNumberPaneMessage() {
        StringValue stringValue = this.accountNumberPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountNumberPaneSubmitButton() {
        StringValue stringValue = this.accountNumberPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountNumberPaneTitle() {
        StringValue stringValue = this.accountNumberPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getAccountSelectPaneIsEnabled() {
        BoolValue boolValue = this.accountSelectPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getAccountSelectPaneIsMultiAccountSelectEnabled() {
        BoolValue boolValue = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public EnumC6065b getAccountSelectPaneMode() {
        EnumC6065b enumC6065bForNumber = EnumC6065b.forNumber(this.accountSelectPaneMode_);
        return enumC6065bForNumber == null ? EnumC6065b.UNRECOGNIZED : enumC6065bForNumber;
    }

    public int getAccountSelectPaneModeValue() {
        return this.accountSelectPaneMode_;
    }

    public StringValue getAccountSelectPaneSubmitButton() {
        StringValue stringValue = this.accountSelectPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountSelectPaneTitle() {
        StringValue stringValue = this.accountSelectPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public AuthFlowType getAuthFlowType() {
        AuthFlowType authFlowType = this.authFlowType_;
        return authFlowType == null ? AuthFlowType.getDefaultInstance() : authFlowType;
    }

    public StringValue getConnectedPaneHeading() {
        StringValue stringValue = this.connectedPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getConnectedPaneIsEnabled() {
        BoolValue boolValue = this.connectedPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getConnectedPaneMessage() {
        StringValue stringValue = this.connectedPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getConnectedPaneSubmitButton() {
        StringValue stringValue = this.connectedPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getConnectedPaneTitle() {
        StringValue stringValue = this.connectedPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public String getCountryCodes(int i) {
        return this.countryCodes_.get(i);
    }

    public ByteString getCountryCodesBytes(int i) {
        return ByteString.copyFromUtf8(this.countryCodes_.get(i));
    }

    public int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public List<String> getCountryCodesList() {
        return this.countryCodes_;
    }

    public BoolValue getCredentialPanePlaidLegalEnabled() {
        BoolValue boolValue = this.credentialPanePlaidLegalEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getCredentialPaneResetPasswordButton() {
        StringValue stringValue = this.credentialPaneResetPasswordButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneSubmitButton() {
        StringValue stringValue = this.credentialPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneTitle() {
        StringValue stringValue = this.credentialPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneTosContent() {
        StringValue stringValue = this.credentialPaneTosContent_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getCredentialPaneTosEnabled() {
        BoolValue boolValue = this.credentialPaneTosEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public External$DocumentUploadFilePreference getDocumentIncomeUploadPaneDocumentFileTypePreferences(int i) {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.get(i);
    }

    public int getDocumentIncomeUploadPaneDocumentFileTypePreferencesCount() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.size();
    }

    public List<External$DocumentUploadFilePreference> getDocumentIncomeUploadPaneDocumentFileTypePreferencesList() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_;
    }

    public InterfaceC6080c getDocumentIncomeUploadPaneDocumentFileTypePreferencesOrBuilder(int i) {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.get(i);
    }

    /* renamed from: getDocumentIncomeUploadPaneDocumentFileTypePreferencesOrBuilderList */
    public List<? extends InterfaceC6080c> m1386x17d1c872() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_;
    }

    public External$DocumentNumberOfUploadsPreferences getDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences = this.documentIncomeUploadPaneNumberOfUploadsPreferences_;
        return external$DocumentNumberOfUploadsPreferences == null ? External$DocumentNumberOfUploadsPreferences.getDefaultInstance() : external$DocumentNumberOfUploadsPreferences;
    }

    public StringValue getDocumentTimeRange() {
        StringValue stringValue = this.documentTimeRange_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getDtmEnablementStatus() {
        BoolValue boolValue = this.dtmEnablementStatus_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public EnumC6068e getDtmUseCases(int i) {
        EnumC6068e enumC6068eForNumber = EnumC6068e.forNumber(this.dtmUseCases_.getInt(i));
        return enumC6068eForNumber == null ? EnumC6068e.UNRECOGNIZED : enumC6068eForNumber;
    }

    public int getDtmUseCasesCount() {
        return this.dtmUseCases_.size();
    }

    public List<EnumC6068e> getDtmUseCasesList() {
        return new Internal.ListAdapter(this.dtmUseCases_, dtmUseCases_converter_);
    }

    public int getDtmUseCasesValue(int i) {
        return this.dtmUseCases_.getInt(i);
    }

    public List<Integer> getDtmUseCasesValueList() {
        return this.dtmUseCases_;
    }

    public StringValue getErrorPaneTitle() {
        StringValue stringValue = this.errorPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneCancel() {
        StringValue stringValue = this.euConsentPaneCancel_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContactDetailsTitle() {
        StringValue stringValue = this.euConsentPaneContactDetailsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContinue() {
        StringValue stringValue = this.euConsentPaneContinue_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContinueAgree() {
        StringValue stringValue = this.euConsentPaneContinueAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneDetailsTitle() {
        StringValue stringValue = this.euConsentPaneDetailsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getEuConsentPaneIsEnabled() {
        BoolValue boolValue = this.euConsentPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getEuConsentPaneLinkWithPlaid() {
        StringValue stringValue = this.euConsentPaneLinkWithPlaid_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneSubmitAgree() {
        StringValue stringValue = this.euConsentPaneSubmitAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneSubmitButton() {
        StringValue stringValue = this.euConsentPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneTransactionsTitle() {
        StringValue stringValue = this.euConsentPaneTransactionsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneCancelButton() {
        StringValue stringValue = this.exitPaneCancelButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneHeading() {
        StringValue stringValue = this.exitPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneMessage() {
        StringValue stringValue = this.exitPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneSubmitButton() {
        StringValue stringValue = this.exitPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneTitle() {
        StringValue stringValue = this.exitPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public EnumC6066c getGlobalAppearance() {
        EnumC6066c enumC6066cForNumber = EnumC6066c.forNumber(this.globalAppearance_);
        return enumC6066cForNumber == null ? EnumC6066c.UNRECOGNIZED : enumC6066cForNumber;
    }

    public int getGlobalAppearanceValue() {
        return this.globalAppearance_;
    }

    public Int32Value getGlobalButtonBorderRadius() {
        Int32Value int32Value = this.globalButtonBorderRadius_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public StringValue getGlobalButtonColor() {
        StringValue stringValue = this.globalButtonColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonColorHover() {
        StringValue stringValue = this.globalButtonColorHover_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonDarkModeColor() {
        StringValue stringValue = this.globalButtonDarkModeColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonDarkModeColorHover() {
        StringValue stringValue = this.globalButtonDarkModeColorHover_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonDarkModeTextColor() {
        StringValue stringValue = this.globalButtonDarkModeTextColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonFontWeight() {
        StringValue stringValue = this.globalButtonFontWeight_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalButtonTextColor() {
        StringValue stringValue = this.globalButtonTextColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalHighlightColor() {
        StringValue stringValue = this.globalHighlightColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalOverlayBackgroundColor() {
        StringValue stringValue = this.globalOverlayBackgroundColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getIdentityMatchRiskProfileKey() {
        StringValue stringValue = this.identityMatchRiskProfileKey_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneExitButton() {
        StringValue stringValue = this.institutionSearchPaneExitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneInitialMessage() {
        StringValue stringValue = this.institutionSearchPaneInitialMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneNoResultsMessage() {
        StringValue stringValue = this.institutionSearchPaneNoResultsMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPanePlaceholder() {
        StringValue stringValue = this.institutionSearchPanePlaceholder_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneTimeoutMessage() {
        StringValue stringValue = this.institutionSearchPaneTimeoutMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public String getInstitutionSelectPaneInstitutionList(int i) {
        return this.institutionSelectPaneInstitutionList_.get(i);
    }

    public ByteString getInstitutionSelectPaneInstitutionListBytes(int i) {
        return ByteString.copyFromUtf8(this.institutionSelectPaneInstitutionList_.get(i));
    }

    public int getInstitutionSelectPaneInstitutionListCount() {
        return this.institutionSelectPaneInstitutionList_.size();
    }

    public List<String> getInstitutionSelectPaneInstitutionListList() {
        return this.institutionSelectPaneInstitutionList_;
    }

    public StringValue getInstitutionSelectPaneSearchButton() {
        StringValue stringValue = this.institutionSelectPaneSearchButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSelectPaneTitle() {
        StringValue stringValue = this.institutionSelectPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getInstitutionSelectPaneUseDynamicInstitutionSelect() {
        BoolValue boolValue = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getIsVenmoSpecific() {
        BoolValue boolValue = this.isVenmoSpecific_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getLanguage() {
        StringValue stringValue = this.language_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getLayerConsentPaneHeaderTextAction() {
        StringValue stringValue = this.layerConsentPaneHeaderTextAction_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getLayerConsentPaneHeaderTextProfileTerm() {
        StringValue stringValue = this.layerConsentPaneHeaderTextProfileTerm_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getLoadingPaneTitle() {
        StringValue stringValue = this.loadingPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getLogoUrl() {
        StringValue stringValue = this.logoUrl_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public LinkCustomizations$DocumentPreference getManualVerificationOfIncomeUploadPaneDocumentPreferences(int i) {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.get(i);
    }

    public int getManualVerificationOfIncomeUploadPaneDocumentPreferencesCount() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.size();
    }

    public List<LinkCustomizations$DocumentPreference> getManualVerificationOfIncomeUploadPaneDocumentPreferencesList() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
    }

    /* renamed from: getManualVerificationOfIncomeUploadPaneDocumentPreferencesOrBuilder */
    public InterfaceC6075b m1387x8e7830db(int i) {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.get(i);
    }

    /* renamed from: getManualVerificationOfIncomeUploadPaneDocumentPreferencesOrBuilderList */
    public List<? extends InterfaceC6075b> m1388x43127019() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
    }

    public StringValue getMfaPaneTitle() {
        StringValue stringValue = this.mfaPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneAfterContinue() {
        StringValue stringValue = this.oauthLandingPaneAfterContinue_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneAuthenticateBank() {
        StringValue stringValue = this.oauthLandingPaneAuthenticateBank_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneContinueToInstitution() {
        StringValue stringValue = this.oauthLandingPaneContinueToInstitution_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneRedirectedBack() {
        StringValue stringValue = this.oauthLandingPaneRedirectedBack_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getPrivacyInterstitialPaneCoBrandedIsEnabled() {
        BoolValue boolValue = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getPrivacyInterstitialPaneHeading() {
        StringValue stringValue = this.privacyInterstitialPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneHeadingAccountName() {
        StringValue stringValue = this.privacyInterstitialPaneHeadingAccountName_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneSubmitAgree() {
        StringValue stringValue = this.privacyInterstitialPaneSubmitAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneSubmitButton() {
        StringValue stringValue = this.privacyInterstitialPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public EnumC6069f getProductDomain() {
        EnumC6069f enumC6069fForNumber = EnumC6069f.forNumber(this.productDomain_);
        return enumC6069fForNumber == null ? EnumC6069f.UNRECOGNIZED : enumC6069fForNumber;
    }

    public int getProductDomainValue() {
        return this.productDomain_;
    }

    public StringValue getProductScopesTransparencyPaneAllowButton() {
        StringValue stringValue = this.productScopesTransparencyPaneAllowButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getProductScopesTransparencyPaneModalDismissButton() {
        StringValue stringValue = this.productScopesTransparencyPaneModalDismissButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public EnumC6070g getProductScopesTransparencyPaneMode() {
        EnumC6070g enumC6070gForNumber = EnumC6070g.forNumber(this.productScopesTransparencyPaneMode_);
        return enumC6070gForNumber == null ? EnumC6070g.UNRECOGNIZED : enumC6070gForNumber;
    }

    public int getProductScopesTransparencyPaneModeValue() {
        return this.productScopesTransparencyPaneMode_;
    }

    public StringValue getProductScopesTransparencyPaneUpdateUseCase() {
        StringValue stringValue = this.productScopesTransparencyPaneUpdateUseCase_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getProductScopesTransparencyPaneUseCase() {
        StringValue stringValue = this.productScopesTransparencyPaneUseCase_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public EnumC6071h getProfileEligibilityDesiredAccountType() {
        EnumC6071h enumC6071hForNumber = EnumC6071h.forNumber(this.profileEligibilityDesiredAccountType_);
        return enumC6071hForNumber == null ? EnumC6071h.UNRECOGNIZED : enumC6071hForNumber;
    }

    public int getProfileEligibilityDesiredAccountTypeValue() {
        return this.profileEligibilityDesiredAccountType_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldAddress() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldAddress_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityIdentityFieldAddressValue() {
        return this.profileEligibilityIdentityFieldAddress_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldDateOfBirth() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldDateOfBirth_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityIdentityFieldDateOfBirthValue() {
        return this.profileEligibilityIdentityFieldDateOfBirth_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldDocuments() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldDocuments_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityIdentityFieldDocumentsValue() {
        return this.profileEligibilityIdentityFieldDocuments_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldEmail() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldEmail_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityIdentityFieldEmailValue() {
        return this.profileEligibilityIdentityFieldEmail_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldName() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldName_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityIdentityFieldNameValue() {
        return this.profileEligibilityIdentityFieldName_;
    }

    public EnumC6072i getProfileEligibilityIdentityFieldSsn() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityIdentityFieldSsn_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public BoolValue getProfileEligibilityIdentityFieldSsnLast4Only() {
        BoolValue boolValue = this.profileEligibilityIdentityFieldSsnLast4Only_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public int getProfileEligibilityIdentityFieldSsnValue() {
        return this.profileEligibilityIdentityFieldSsn_;
    }

    public BoolValue getProfileEligibilityItemsAllowIndirect() {
        BoolValue boolValue = this.profileEligibilityItemsAllowIndirect_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getProfileEligibilityItemsAllowReauthentication() {
        BoolValue boolValue = this.profileEligibilityItemsAllowReauthentication_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public EnumC6072i getProfileEligibilityRequireIdentity() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityRequireIdentity_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityRequireIdentityValue() {
        return this.profileEligibilityRequireIdentity_;
    }

    public EnumC6072i getProfileEligibilityRequireItems() {
        EnumC6072i enumC6072iForNumber = EnumC6072i.forNumber(this.profileEligibilityRequireItems_);
        return enumC6072iForNumber == null ? EnumC6072i.UNRECOGNIZED : enumC6072iForNumber;
    }

    public int getProfileEligibilityRequireItemsValue() {
        return this.profileEligibilityRequireItems_;
    }

    public StringValue getRecaptchaPaneMessage() {
        StringValue stringValue = this.recaptchaPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRecaptchaPaneTitle() {
        StringValue stringValue = this.recaptchaPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getReconnectedPaneIsEnabled() {
        BoolValue boolValue = this.reconnectedPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getReconnectedPaneMessage() {
        StringValue stringValue = this.reconnectedPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getReconnectedPaneSubmitButton() {
        StringValue stringValue = this.reconnectedPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getReconnectedPaneTitle() {
        StringValue stringValue = this.reconnectedPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneMessage() {
        StringValue stringValue = this.routingNumberPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneSubmitButton() {
        StringValue stringValue = this.routingNumberPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneTitle() {
        StringValue stringValue = this.routingNumberPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public Int32Value getStartDateDaysAgo() {
        Int32Value int32Value = this.startDateDaysAgo_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public StringValue getTemplateName() {
        StringValue stringValue = this.templateName_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getTemplateSymbol() {
        StringValue stringValue = this.templateSymbol_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public LinkCustomizations$TemplateTokenConfiguration getTemplateTokenConfiguration() {
        LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration = this.templateTokenConfiguration_;
        return linkCustomizations$TemplateTokenConfiguration == null ? LinkCustomizations$TemplateTokenConfiguration.getDefaultInstance() : linkCustomizations$TemplateTokenConfiguration;
    }

    public String getWalletSelectPaneHiddenWalletBrandList(int i) {
        return this.walletSelectPaneHiddenWalletBrandList_.get(i);
    }

    public ByteString getWalletSelectPaneHiddenWalletBrandListBytes(int i) {
        return ByteString.copyFromUtf8(this.walletSelectPaneHiddenWalletBrandList_.get(i));
    }

    public int getWalletSelectPaneHiddenWalletBrandListCount() {
        return this.walletSelectPaneHiddenWalletBrandList_.size();
    }

    public List<String> getWalletSelectPaneHiddenWalletBrandListList() {
        return this.walletSelectPaneHiddenWalletBrandList_;
    }

    public String getWalletSelectPanePinnedWalletBrandList(int i) {
        return this.walletSelectPanePinnedWalletBrandList_.get(i);
    }

    public ByteString getWalletSelectPanePinnedWalletBrandListBytes(int i) {
        return ByteString.copyFromUtf8(this.walletSelectPanePinnedWalletBrandList_.get(i));
    }

    public int getWalletSelectPanePinnedWalletBrandListCount() {
        return this.walletSelectPanePinnedWalletBrandList_.size();
    }

    public List<String> getWalletSelectPanePinnedWalletBrandListList() {
        return this.walletSelectPanePinnedWalletBrandList_;
    }

    public boolean hasAccountClassBusinessDisabled() {
        return (this.bitField2_ & 131072) != 0;
    }

    public boolean hasAccountNumberPaneMessage() {
        return (this.bitField1_ & 1073741824) != 0;
    }

    public boolean hasAccountNumberPaneSubmitButton() {
        return (this.bitField1_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasAccountNumberPaneTitle() {
        return (this.bitField1_ & 536870912) != 0;
    }

    public boolean hasAccountSelectPaneIsEnabled() {
        return (this.bitField2_ & 32) != 0;
    }

    public boolean hasAccountSelectPaneIsMultiAccountSelectEnabled() {
        return (this.bitField2_ & 64) != 0;
    }

    public boolean hasAccountSelectPaneSubmitButton() {
        return (this.bitField2_ & 16) != 0;
    }

    public boolean hasAccountSelectPaneTitle() {
        return (this.bitField2_ & 8) != 0;
    }

    public boolean hasAuthFlowType() {
        return (this.bitField2_ & 134217728) != 0;
    }

    public boolean hasConnectedPaneHeading() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasConnectedPaneIsEnabled() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasConnectedPaneMessage() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasConnectedPaneSubmitButton() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasConnectedPaneTitle() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasCredentialPanePlaidLegalEnabled() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasCredentialPaneResetPasswordButton() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasCredentialPaneSubmitButton() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasCredentialPaneTitle() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasCredentialPaneTosContent() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasCredentialPaneTosEnabled() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        return (this.bitField2_ & 262144) != 0;
    }

    public boolean hasDocumentTimeRange() {
        return (this.bitField2_ & 536870912) != 0;
    }

    public boolean hasDtmEnablementStatus() {
        return (this.bitField2_ & 65536) != 0;
    }

    public boolean hasErrorPaneTitle() {
        return (this.bitField1_ & 512) != 0;
    }

    public boolean hasEuConsentPaneCancel() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasEuConsentPaneContactDetailsTitle() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasEuConsentPaneContinue() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasEuConsentPaneContinueAgree() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasEuConsentPaneDetailsTitle() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasEuConsentPaneIsEnabled() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasEuConsentPaneLinkWithPlaid() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasEuConsentPaneSubmitAgree() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasEuConsentPaneSubmitButton() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasEuConsentPaneTransactionsTitle() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasExitPaneCancelButton() {
        return (this.bitField1_ & 16384) != 0;
    }

    public boolean hasExitPaneHeading() {
        return (this.bitField1_ & 2048) != 0;
    }

    public boolean hasExitPaneMessage() {
        return (this.bitField1_ & 4096) != 0;
    }

    public boolean hasExitPaneSubmitButton() {
        return (this.bitField1_ & 8192) != 0;
    }

    public boolean hasExitPaneTitle() {
        return (this.bitField1_ & 1024) != 0;
    }

    public boolean hasGlobalButtonBorderRadius() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasGlobalButtonColor() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasGlobalButtonColorHover() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasGlobalButtonDarkModeColor() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasGlobalButtonDarkModeColorHover() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasGlobalButtonDarkModeTextColor() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasGlobalButtonFontWeight() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasGlobalButtonTextColor() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGlobalHighlightColor() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGlobalOverlayBackgroundColor() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIdentityMatchRiskProfileKey() {
        return (this.bitField2_ & 268435456) != 0;
    }

    public boolean hasInstitutionSearchPaneExitButton() {
        return (this.bitField1_ & 262144) != 0;
    }

    public boolean hasInstitutionSearchPaneInitialMessage() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public boolean hasInstitutionSearchPaneNoResultsMessage() {
        return (this.bitField1_ & 2097152) != 0;
    }

    public boolean hasInstitutionSearchPanePlaceholder() {
        return (this.bitField1_ & 524288) != 0;
    }

    public boolean hasInstitutionSearchPaneTimeoutMessage() {
        return (this.bitField1_ & 4194304) != 0;
    }

    public boolean hasInstitutionSelectPaneSearchButton() {
        return (this.bitField1_ & 65536) != 0;
    }

    public boolean hasInstitutionSelectPaneTitle() {
        return (this.bitField1_ & 32768) != 0;
    }

    public boolean hasInstitutionSelectPaneUseDynamicInstitutionSelect() {
        return (this.bitField1_ & 131072) != 0;
    }

    public boolean hasIsVenmoSpecific() {
        return (this.bitField2_ & 67108864) != 0;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLayerConsentPaneHeaderTextAction() {
        return (this.bitField1_ & 8388608) != 0;
    }

    public boolean hasLayerConsentPaneHeaderTextProfileTerm() {
        return (this.bitField1_ & 16777216) != 0;
    }

    public boolean hasLoadingPaneTitle() {
        return (this.bitField1_ & 33554432) != 0;
    }

    public boolean hasLogoUrl() {
        return (this.bitField2_ & 4194304) != 0;
    }

    public boolean hasMfaPaneTitle() {
        return (this.bitField2_ & 1) != 0;
    }

    public boolean hasOauthLandingPaneAfterContinue() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasOauthLandingPaneAuthenticateBank() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasOauthLandingPaneContinueToInstitution() {
        return (this.bitField1_ & 256) != 0;
    }

    public boolean hasOauthLandingPaneRedirectedBack() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasPrivacyInterstitialPaneCoBrandedIsEnabled() {
        return (this.bitField2_ & 1024) != 0;
    }

    public boolean hasPrivacyInterstitialPaneHeading() {
        return (this.bitField2_ & 128) != 0;
    }

    public boolean hasPrivacyInterstitialPaneHeadingAccountName() {
        return (this.bitField2_ & 2048) != 0;
    }

    public boolean hasPrivacyInterstitialPaneSubmitAgree() {
        return (this.bitField2_ & 512) != 0;
    }

    public boolean hasPrivacyInterstitialPaneSubmitButton() {
        return (this.bitField2_ & 256) != 0;
    }

    public boolean hasProductScopesTransparencyPaneAllowButton() {
        return (this.bitField2_ & 8192) != 0;
    }

    public boolean hasProductScopesTransparencyPaneModalDismissButton() {
        return (this.bitField2_ & 32768) != 0;
    }

    public boolean hasProductScopesTransparencyPaneUpdateUseCase() {
        return (this.bitField2_ & 16384) != 0;
    }

    public boolean hasProductScopesTransparencyPaneUseCase() {
        return (this.bitField2_ & 4096) != 0;
    }

    public boolean hasProfileEligibilityIdentityFieldSsnLast4Only() {
        return (this.bitField2_ & 8388608) != 0;
    }

    public boolean hasProfileEligibilityItemsAllowIndirect() {
        return (this.bitField2_ & 16777216) != 0;
    }

    public boolean hasProfileEligibilityItemsAllowReauthentication() {
        return (this.bitField2_ & 33554432) != 0;
    }

    public boolean hasRecaptchaPaneMessage() {
        return (this.bitField2_ & 4) != 0;
    }

    public boolean hasRecaptchaPaneTitle() {
        return (this.bitField2_ & 2) != 0;
    }

    public boolean hasReconnectedPaneIsEnabled() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasReconnectedPaneMessage() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasReconnectedPaneSubmitButton() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasReconnectedPaneTitle() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasRoutingNumberPaneMessage() {
        return (this.bitField1_ & 134217728) != 0;
    }

    public boolean hasRoutingNumberPaneSubmitButton() {
        return (this.bitField1_ & 268435456) != 0;
    }

    public boolean hasRoutingNumberPaneTitle() {
        return (this.bitField1_ & 67108864) != 0;
    }

    public boolean hasStartDateDaysAgo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTemplateName() {
        return (this.bitField2_ & 1048576) != 0;
    }

    public boolean hasTemplateSymbol() {
        return (this.bitField2_ & 2097152) != 0;
    }

    public boolean hasTemplateTokenConfiguration() {
        return (this.bitField2_ & 524288) != 0;
    }

    public static C6067d newBuilder(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$LinkCustomization);
    }

    public static LinkCustomizations$LinkCustomization parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteString byteString) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addDocumentIncomeUploadPaneDocumentFileTypePreferences(int i, External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        external$DocumentUploadFilePreference.getClass();
        m1384x82583900();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.add(i, external$DocumentUploadFilePreference);
    }

    private void addManualVerificationOfIncomeUploadPaneDocumentPreferences(int i, LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        linkCustomizations$DocumentPreference.getClass();
        m1385x4fa1827();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.add(i, linkCustomizations$DocumentPreference);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(byte[] bArr) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(InputStream inputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(CodedInputStream codedInputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
