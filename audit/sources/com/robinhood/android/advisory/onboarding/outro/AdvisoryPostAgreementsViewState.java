package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPostAgreementsViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "LoadingAccount", "FirstDepositSubmission", "Celebration", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$Celebration;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$FirstDepositSubmission;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$LoadingAccount;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryPostAgreementsViewState {
    UserInteractionEventDescriptor getDescriptor();

    /* compiled from: AdvisoryPostAgreementsViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$LoadingAccount;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "state", "Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getState", "()Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadingAccount implements AdvisoryPostAgreementsViewState {
        public static final int $stable = 8;
        private final UserInteractionEventDescriptor descriptor;
        private final AccountLoadingScreenState state;

        public static /* synthetic */ LoadingAccount copy$default(LoadingAccount loadingAccount, AccountLoadingScreenState accountLoadingScreenState, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                accountLoadingScreenState = loadingAccount.state;
            }
            if ((i & 2) != 0) {
                userInteractionEventDescriptor = loadingAccount.descriptor;
            }
            return loadingAccount.copy(accountLoadingScreenState, userInteractionEventDescriptor);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountLoadingScreenState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final LoadingAccount copy(AccountLoadingScreenState state, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new LoadingAccount(state, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingAccount)) {
                return false;
            }
            LoadingAccount loadingAccount = (LoadingAccount) other;
            return Intrinsics.areEqual(this.state, loadingAccount.state) && Intrinsics.areEqual(this.descriptor, loadingAccount.descriptor);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "LoadingAccount(state=" + this.state + ", descriptor=" + this.descriptor + ")";
        }

        public LoadingAccount(AccountLoadingScreenState state, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.state = state;
            this.descriptor = descriptor;
        }

        public final AccountLoadingScreenState getState() {
            return this.state;
        }

        @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }

    /* compiled from: AdvisoryPostAgreementsViewState.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$FirstDepositSubmission;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferConfig", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "footerTitle", "Lcom/robinhood/utils/resource/StringResource;", "footerDescription", "visual", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSinkAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getTransferConfig", "()Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "getFooterTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getFooterDescription", "getVisual", "()Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FirstDepositSubmission implements AdvisoryPostAgreementsViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;
        private final UserInteractionEventDescriptor descriptor;
        private final StringResource footerDescription;
        private final StringResource footerTitle;
        private final TransferAccount sinkAccount;
        private final AdvisoryFirstDepositConfig.Transfer transferConfig;
        private final FirstDepositNumberVisual visual;

        public static /* synthetic */ FirstDepositSubmission copy$default(FirstDepositSubmission firstDepositSubmission, String str, BrokerageAccountType brokerageAccountType, TransferAccount transferAccount, AdvisoryFirstDepositConfig.Transfer transfer, StringResource stringResource, StringResource stringResource2, FirstDepositNumberVisual firstDepositNumberVisual, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = firstDepositSubmission.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = firstDepositSubmission.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                transferAccount = firstDepositSubmission.sinkAccount;
            }
            if ((i & 8) != 0) {
                transfer = firstDepositSubmission.transferConfig;
            }
            if ((i & 16) != 0) {
                stringResource = firstDepositSubmission.footerTitle;
            }
            if ((i & 32) != 0) {
                stringResource2 = firstDepositSubmission.footerDescription;
            }
            if ((i & 64) != 0) {
                firstDepositNumberVisual = firstDepositSubmission.visual;
            }
            if ((i & 128) != 0) {
                userInteractionEventDescriptor = firstDepositSubmission.descriptor;
            }
            FirstDepositNumberVisual firstDepositNumberVisual2 = firstDepositNumberVisual;
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            StringResource stringResource3 = stringResource;
            StringResource stringResource4 = stringResource2;
            return firstDepositSubmission.copy(str, brokerageAccountType, transferAccount, transfer, stringResource3, stringResource4, firstDepositNumberVisual2, userInteractionEventDescriptor2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final AdvisoryFirstDepositConfig.Transfer getTransferConfig() {
            return this.transferConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getFooterTitle() {
            return this.footerTitle;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getFooterDescription() {
            return this.footerDescription;
        }

        /* renamed from: component7, reason: from getter */
        public final FirstDepositNumberVisual getVisual() {
            return this.visual;
        }

        /* renamed from: component8, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final FirstDepositSubmission copy(String accountNumber, BrokerageAccountType brokerageAccountType, TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer transferConfig, StringResource footerTitle, StringResource footerDescription, FirstDepositNumberVisual visual, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(transferConfig, "transferConfig");
            Intrinsics.checkNotNullParameter(visual, "visual");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new FirstDepositSubmission(accountNumber, brokerageAccountType, sinkAccount, transferConfig, footerTitle, footerDescription, visual, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstDepositSubmission)) {
                return false;
            }
            FirstDepositSubmission firstDepositSubmission = (FirstDepositSubmission) other;
            return Intrinsics.areEqual(this.accountNumber, firstDepositSubmission.accountNumber) && this.brokerageAccountType == firstDepositSubmission.brokerageAccountType && Intrinsics.areEqual(this.sinkAccount, firstDepositSubmission.sinkAccount) && Intrinsics.areEqual(this.transferConfig, firstDepositSubmission.transferConfig) && Intrinsics.areEqual(this.footerTitle, firstDepositSubmission.footerTitle) && Intrinsics.areEqual(this.footerDescription, firstDepositSubmission.footerDescription) && Intrinsics.areEqual(this.visual, firstDepositSubmission.visual) && Intrinsics.areEqual(this.descriptor, firstDepositSubmission.descriptor);
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.sinkAccount.hashCode()) * 31) + this.transferConfig.hashCode()) * 31;
            StringResource stringResource = this.footerTitle;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            StringResource stringResource2 = this.footerDescription;
            return ((((iHashCode2 + (stringResource2 != null ? stringResource2.hashCode() : 0)) * 31) + this.visual.hashCode()) * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "FirstDepositSubmission(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", sinkAccount=" + this.sinkAccount + ", transferConfig=" + this.transferConfig + ", footerTitle=" + this.footerTitle + ", footerDescription=" + this.footerDescription + ", visual=" + this.visual + ", descriptor=" + this.descriptor + ")";
        }

        public FirstDepositSubmission(String accountNumber, BrokerageAccountType brokerageAccountType, TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer transferConfig, StringResource stringResource, StringResource stringResource2, FirstDepositNumberVisual visual, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(transferConfig, "transferConfig");
            Intrinsics.checkNotNullParameter(visual, "visual");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
            this.sinkAccount = sinkAccount;
            this.transferConfig = transferConfig;
            this.footerTitle = stringResource;
            this.footerDescription = stringResource2;
            this.visual = visual;
            this.descriptor = descriptor;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final AdvisoryFirstDepositConfig.Transfer getTransferConfig() {
            return this.transferConfig;
        }

        public final StringResource getFooterTitle() {
            return this.footerTitle;
        }

        public final StringResource getFooterDescription() {
            return this.footerDescription;
        }

        public final FirstDepositNumberVisual getVisual() {
            return this.visual;
        }

        @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }

    /* compiled from: AdvisoryPostAgreementsViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$Celebration;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "dashboardKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "primaryDestination", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "primaryCtaText", "primaryCtaIdentifier", "", "alternateFundingDestination", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getDashboardKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "getPrimaryDestination", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getPrimaryCtaText", "getPrimaryCtaIdentifier", "()Ljava/lang/String;", "getAlternateFundingDestination", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Celebration implements AdvisoryPostAgreementsViewState {
        public static final int $stable = 8;
        private final IntentKey alternateFundingDestination;
        private final IntentKey dashboardKey;
        private final UserInteractionEventDescriptor descriptor;
        private final String primaryCtaIdentifier;
        private final StringResource primaryCtaText;
        private final IntentKey primaryDestination;
        private final StringResource primaryText;
        private final StringResource secondaryText;

        public static /* synthetic */ Celebration copy$default(Celebration celebration, IntentKey intentKey, IntentKey intentKey2, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, String str, IntentKey intentKey3, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = celebration.dashboardKey;
            }
            if ((i & 2) != 0) {
                intentKey2 = celebration.primaryDestination;
            }
            if ((i & 4) != 0) {
                stringResource = celebration.primaryText;
            }
            if ((i & 8) != 0) {
                stringResource2 = celebration.secondaryText;
            }
            if ((i & 16) != 0) {
                stringResource3 = celebration.primaryCtaText;
            }
            if ((i & 32) != 0) {
                str = celebration.primaryCtaIdentifier;
            }
            if ((i & 64) != 0) {
                intentKey3 = celebration.alternateFundingDestination;
            }
            if ((i & 128) != 0) {
                userInteractionEventDescriptor = celebration.descriptor;
            }
            IntentKey intentKey4 = intentKey3;
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            StringResource stringResource4 = stringResource3;
            String str2 = str;
            return celebration.copy(intentKey, intentKey2, stringResource, stringResource2, stringResource4, str2, intentKey4, userInteractionEventDescriptor2);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getDashboardKey() {
            return this.dashboardKey;
        }

        /* renamed from: component2, reason: from getter */
        public final IntentKey getPrimaryDestination() {
            return this.primaryDestination;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPrimaryCtaIdentifier() {
            return this.primaryCtaIdentifier;
        }

        /* renamed from: component7, reason: from getter */
        public final IntentKey getAlternateFundingDestination() {
            return this.alternateFundingDestination;
        }

        /* renamed from: component8, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final Celebration copy(IntentKey dashboardKey, IntentKey primaryDestination, StringResource primaryText, StringResource secondaryText, StringResource primaryCtaText, String primaryCtaIdentifier, IntentKey alternateFundingDestination, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(dashboardKey, "dashboardKey");
            Intrinsics.checkNotNullParameter(primaryDestination, "primaryDestination");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new Celebration(dashboardKey, primaryDestination, primaryText, secondaryText, primaryCtaText, primaryCtaIdentifier, alternateFundingDestination, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Celebration)) {
                return false;
            }
            Celebration celebration = (Celebration) other;
            return Intrinsics.areEqual(this.dashboardKey, celebration.dashboardKey) && Intrinsics.areEqual(this.primaryDestination, celebration.primaryDestination) && Intrinsics.areEqual(this.primaryText, celebration.primaryText) && Intrinsics.areEqual(this.secondaryText, celebration.secondaryText) && Intrinsics.areEqual(this.primaryCtaText, celebration.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaIdentifier, celebration.primaryCtaIdentifier) && Intrinsics.areEqual(this.alternateFundingDestination, celebration.alternateFundingDestination) && Intrinsics.areEqual(this.descriptor, celebration.descriptor);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.dashboardKey.hashCode() * 31) + this.primaryDestination.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31) + this.primaryCtaIdentifier.hashCode()) * 31;
            IntentKey intentKey = this.alternateFundingDestination;
            return ((iHashCode + (intentKey == null ? 0 : intentKey.hashCode())) * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "Celebration(dashboardKey=" + this.dashboardKey + ", primaryDestination=" + this.primaryDestination + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", primaryCtaText=" + this.primaryCtaText + ", primaryCtaIdentifier=" + this.primaryCtaIdentifier + ", alternateFundingDestination=" + this.alternateFundingDestination + ", descriptor=" + this.descriptor + ")";
        }

        public Celebration(IntentKey dashboardKey, IntentKey primaryDestination, StringResource primaryText, StringResource secondaryText, StringResource primaryCtaText, String primaryCtaIdentifier, IntentKey intentKey, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(dashboardKey, "dashboardKey");
            Intrinsics.checkNotNullParameter(primaryDestination, "primaryDestination");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
            Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.dashboardKey = dashboardKey;
            this.primaryDestination = primaryDestination;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.primaryCtaText = primaryCtaText;
            this.primaryCtaIdentifier = primaryCtaIdentifier;
            this.alternateFundingDestination = intentKey;
            this.descriptor = descriptor;
        }

        public final IntentKey getDashboardKey() {
            return this.dashboardKey;
        }

        public final IntentKey getPrimaryDestination() {
            return this.primaryDestination;
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final StringResource getPrimaryCtaText() {
            return this.primaryCtaText;
        }

        public final String getPrimaryCtaIdentifier() {
            return this.primaryCtaIdentifier;
        }

        public final IntentKey getAlternateFundingDestination() {
            return this.alternateFundingDestination;
        }

        @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }
}
