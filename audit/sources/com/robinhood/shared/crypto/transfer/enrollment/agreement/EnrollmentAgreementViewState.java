package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003()*B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J'\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0018HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountState", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "isCompletingEnrollment", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;Z)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getCryptoAccountState", "()Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "()Z", "contentState", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "getContentState", "()Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "titleResource", "Lcom/robinhood/utils/resource/StringResource;", "getTitleResource", "()Lcom/robinhood/utils/resource/StringResource;", "subtitleResource", "", "getSubtitleResource", "()I", "primaryButtonLabelResource", "getPrimaryButtonLabelResource", "secondaryButtonLabelResource", "getSecondaryButtonLabelResource", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ContentState", "ButtonState", "CryptoAccountState", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentAgreementViewState {
    public static final int $stable = 8;
    private final AppType appType;
    private final CryptoAccountState cryptoAccountState;
    private final boolean isCompletingEnrollment;

    public static /* synthetic */ EnrollmentAgreementViewState copy$default(EnrollmentAgreementViewState enrollmentAgreementViewState, AppType appType, CryptoAccountState cryptoAccountState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = enrollmentAgreementViewState.appType;
        }
        if ((i & 2) != 0) {
            cryptoAccountState = enrollmentAgreementViewState.cryptoAccountState;
        }
        if ((i & 4) != 0) {
            z = enrollmentAgreementViewState.isCompletingEnrollment;
        }
        return enrollmentAgreementViewState.copy(appType, cryptoAccountState, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoAccountState getCryptoAccountState() {
        return this.cryptoAccountState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCompletingEnrollment() {
        return this.isCompletingEnrollment;
    }

    public final EnrollmentAgreementViewState copy(AppType appType, CryptoAccountState cryptoAccountState, boolean isCompletingEnrollment) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountState, "cryptoAccountState");
        return new EnrollmentAgreementViewState(appType, cryptoAccountState, isCompletingEnrollment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentAgreementViewState)) {
            return false;
        }
        EnrollmentAgreementViewState enrollmentAgreementViewState = (EnrollmentAgreementViewState) other;
        return this.appType == enrollmentAgreementViewState.appType && Intrinsics.areEqual(this.cryptoAccountState, enrollmentAgreementViewState.cryptoAccountState) && this.isCompletingEnrollment == enrollmentAgreementViewState.isCompletingEnrollment;
    }

    public int hashCode() {
        return (((this.appType.hashCode() * 31) + this.cryptoAccountState.hashCode()) * 31) + Boolean.hashCode(this.isCompletingEnrollment);
    }

    public String toString() {
        return "EnrollmentAgreementViewState(appType=" + this.appType + ", cryptoAccountState=" + this.cryptoAccountState + ", isCompletingEnrollment=" + this.isCompletingEnrollment + ")";
    }

    public EnrollmentAgreementViewState(AppType appType, CryptoAccountState cryptoAccountState, boolean z) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountState, "cryptoAccountState");
        this.appType = appType;
        this.cryptoAccountState = cryptoAccountState;
        this.isCompletingEnrollment = z;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public /* synthetic */ EnrollmentAgreementViewState(AppType appType, CryptoAccountState cryptoAccountState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? CryptoAccountState.Loading.INSTANCE : cryptoAccountState, z);
    }

    public final CryptoAccountState getCryptoAccountState() {
        return this.cryptoAccountState;
    }

    public final boolean isCompletingEnrollment() {
        return this.isCompletingEnrollment;
    }

    public final ContentState getContentState() {
        CryptoAccountState cryptoAccountState = this.cryptoAccountState;
        if (Intrinsics.areEqual(cryptoAccountState, CryptoAccountState.Loading.INSTANCE)) {
            return ContentState.InitialLoading.INSTANCE;
        }
        if (Intrinsics.areEqual(cryptoAccountState, CryptoAccountState.HasAccount.INSTANCE)) {
            return new ContentState.Loaded(this.isCompletingEnrollment);
        }
        if (!(cryptoAccountState instanceof CryptoAccountState.NoAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ContentState.NoCryptoAccount(((CryptoAccountState.NoAccount) this.cryptoAccountState).getDisplayText());
    }

    public final StringResource getTitleResource() {
        if (this.appType == AppType.RHC) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_agreement_title_rhc, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_agreement_title, new Object[0]);
    }

    public final int getSubtitleResource() {
        if (this.appType == AppType.RHC) {
            return C37934R.string.crypto_transfer_enrollment_agreement_disclaimer_rhc;
        }
        return C37934R.string.crypto_transfer_enrollment_agreement_disclaimer;
    }

    public final StringResource getPrimaryButtonLabelResource() {
        if (this.appType == AppType.RHC) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_agreement_primary_button_rhc, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_agreement_primary_button, new Object[0]);
    }

    public final StringResource getSecondaryButtonLabelResource() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_agreement_secondary_button, new Object[0]);
    }

    /* compiled from: EnrollmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "", "continueButtonState", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ButtonState;", "getContinueButtonState", "()Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ButtonState;", "skipButtonState", "getSkipButtonState", "InitialLoading", "NoCryptoAccount", "Loaded", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$InitialLoading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$NoCryptoAccount;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ContentState {
        ButtonState getContinueButtonState();

        ButtonState getSkipButtonState();

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static ButtonState getContinueButtonState(ContentState contentState) {
                return ButtonState.HIDDEN;
            }

            public static ButtonState getSkipButtonState(ContentState contentState) {
                return ButtonState.HIDDEN;
            }
        }

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$InitialLoading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InitialLoading implements ContentState {
            public static final int $stable = 0;
            public static final InitialLoading INSTANCE = new InitialLoading();

            public boolean equals(Object other) {
                return this == other || (other instanceof InitialLoading);
            }

            public int hashCode() {
                return 730228170;
            }

            public String toString() {
                return "InitialLoading";
            }

            private InitialLoading() {
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getContinueButtonState() {
                return DefaultImpls.getContinueButtonState(this);
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getSkipButtonState() {
                return DefaultImpls.getSkipButtonState(this);
            }
        }

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$NoCryptoAccount;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "displayText", "", "<init>", "(Ljava/lang/String;)V", "getDisplayText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoCryptoAccount implements ContentState {
            public static final int $stable = 0;
            private final String displayText;

            public static /* synthetic */ NoCryptoAccount copy$default(NoCryptoAccount noCryptoAccount, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = noCryptoAccount.displayText;
                }
                return noCryptoAccount.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDisplayText() {
                return this.displayText;
            }

            public final NoCryptoAccount copy(String displayText) {
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                return new NoCryptoAccount(displayText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoCryptoAccount) && Intrinsics.areEqual(this.displayText, ((NoCryptoAccount) other).displayText);
            }

            public int hashCode() {
                return this.displayText.hashCode();
            }

            public String toString() {
                return "NoCryptoAccount(displayText=" + this.displayText + ")";
            }

            public NoCryptoAccount(String displayText) {
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                this.displayText = displayText;
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getContinueButtonState() {
                return DefaultImpls.getContinueButtonState(this);
            }

            public final String getDisplayText() {
                return this.displayText;
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getSkipButtonState() {
                return DefaultImpls.getSkipButtonState(this);
            }
        }

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ContentState;", "isCompletingEnrollment", "", "<init>", "(Z)V", "()Z", "continueButtonState", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ButtonState;", "getContinueButtonState", "()Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ButtonState;", "skipButtonState", "getSkipButtonState", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements ContentState {
            public static final int $stable = 0;
            private final boolean isCompletingEnrollment;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loaded.isCompletingEnrollment;
                }
                return loaded.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsCompletingEnrollment() {
                return this.isCompletingEnrollment;
            }

            public final Loaded copy(boolean isCompletingEnrollment) {
                return new Loaded(isCompletingEnrollment);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && this.isCompletingEnrollment == ((Loaded) other).isCompletingEnrollment;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isCompletingEnrollment);
            }

            public String toString() {
                return "Loaded(isCompletingEnrollment=" + this.isCompletingEnrollment + ")";
            }

            public Loaded(boolean z) {
                this.isCompletingEnrollment = z;
            }

            public final boolean isCompletingEnrollment() {
                return this.isCompletingEnrollment;
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getContinueButtonState() {
                if (this.isCompletingEnrollment) {
                    return ButtonState.LOADING;
                }
                return ButtonState.ENABLED;
            }

            @Override // com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementViewState.ContentState
            public ButtonState getSkipButtonState() {
                if (this.isCompletingEnrollment) {
                    return ButtonState.DISABLED;
                }
                return ButtonState.ENABLED;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EnrollmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "LOADING", "HIDDEN", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        public static final ButtonState ENABLED = new ButtonState("ENABLED", 0);
        public static final ButtonState DISABLED = new ButtonState("DISABLED", 1);
        public static final ButtonState LOADING = new ButtonState("LOADING", 2);
        public static final ButtonState HIDDEN = new ButtonState("HIDDEN", 3);

        private static final /* synthetic */ ButtonState[] $values() {
            return new ButtonState[]{ENABLED, DISABLED, LOADING, HIDDEN};
        }

        public static EnumEntries<ButtonState> getEntries() {
            return $ENTRIES;
        }

        private ButtonState(String str, int i) {
        }

        static {
            ButtonState[] buttonStateArr$values = $values();
            $VALUES = buttonStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonStateArr$values);
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }
    }

    /* compiled from: EnrollmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "", "Loading", "HasAccount", "NoAccount", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$HasAccount;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$Loading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$NoAccount;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface CryptoAccountState {

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$Loading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements CryptoAccountState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1294734537;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$HasAccount;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HasAccount implements CryptoAccountState {
            public static final int $stable = 0;
            public static final HasAccount INSTANCE = new HasAccount();

            public boolean equals(Object other) {
                return this == other || (other instanceof HasAccount);
            }

            public int hashCode() {
                return 2111684184;
            }

            public String toString() {
                return "HasAccount";
            }

            private HasAccount() {
            }
        }

        /* compiled from: EnrollmentAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState$NoAccount;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementViewState$CryptoAccountState;", "displayText", "", "<init>", "(Ljava/lang/String;)V", "getDisplayText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoAccount implements CryptoAccountState {
            public static final int $stable = 0;
            private final String displayText;

            public static /* synthetic */ NoAccount copy$default(NoAccount noAccount, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = noAccount.displayText;
                }
                return noAccount.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDisplayText() {
                return this.displayText;
            }

            public final NoAccount copy(String displayText) {
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                return new NoAccount(displayText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoAccount) && Intrinsics.areEqual(this.displayText, ((NoAccount) other).displayText);
            }

            public int hashCode() {
                return this.displayText.hashCode();
            }

            public String toString() {
                return "NoAccount(displayText=" + this.displayText + ")";
            }

            public NoAccount(String displayText) {
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                this.displayText = displayText;
            }

            public final String getDisplayText() {
                return this.displayText;
            }
        }
    }
}
