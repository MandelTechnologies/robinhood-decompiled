package com.robinhood.android.individualaccounts.onboarding.outro;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountOutroState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "", "<init>", "()V", "LoadingAccount", "AccountConfirmed", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$AccountConfirmed;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$LoadingAccount;", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroViewState, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class IndividualAccountOutroState3 {
    public static final int $stable = 0;

    public /* synthetic */ IndividualAccountOutroState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IndividualAccountOutroState3() {
    }

    /* compiled from: IndividualAccountOutroState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$LoadingAccount;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "showCloseIcon", "", "showLoadingAnimation", "showRefreshButton", "showContactSupportButton", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZZZ)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getShowCloseIcon", "()Z", "getShowLoadingAnimation", "getShowRefreshButton", "getShowContactSupportButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroViewState$LoadingAccount, reason: from toString */
    public static final /* data */ class LoadingAccount extends IndividualAccountOutroState3 {
        public static final int $stable = StringResource.$stable;
        private final ServerToBentoAssetMapper2 icon;
        private final boolean showCloseIcon;
        private final boolean showContactSupportButton;
        private final boolean showLoadingAnimation;
        private final boolean showRefreshButton;
        private final StringResource subtitle;
        private final StringResource title;

        public static /* synthetic */ LoadingAccount copy$default(LoadingAccount loadingAccount, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loadingAccount.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = loadingAccount.subtitle;
            }
            if ((i & 4) != 0) {
                serverToBentoAssetMapper2 = loadingAccount.icon;
            }
            if ((i & 8) != 0) {
                z = loadingAccount.showCloseIcon;
            }
            if ((i & 16) != 0) {
                z2 = loadingAccount.showLoadingAnimation;
            }
            if ((i & 32) != 0) {
                z3 = loadingAccount.showRefreshButton;
            }
            if ((i & 64) != 0) {
                z4 = loadingAccount.showContactSupportButton;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            boolean z7 = z2;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
            return loadingAccount.copy(stringResource, stringResource2, serverToBentoAssetMapper22, z, z7, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowLoadingAnimation() {
            return this.showLoadingAnimation;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowRefreshButton() {
            return this.showRefreshButton;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowContactSupportButton() {
            return this.showContactSupportButton;
        }

        public final LoadingAccount copy(StringResource title, StringResource subtitle, ServerToBentoAssetMapper2 icon, boolean showCloseIcon, boolean showLoadingAnimation, boolean showRefreshButton, boolean showContactSupportButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new LoadingAccount(title, subtitle, icon, showCloseIcon, showLoadingAnimation, showRefreshButton, showContactSupportButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingAccount)) {
                return false;
            }
            LoadingAccount loadingAccount = (LoadingAccount) other;
            return Intrinsics.areEqual(this.title, loadingAccount.title) && Intrinsics.areEqual(this.subtitle, loadingAccount.subtitle) && this.icon == loadingAccount.icon && this.showCloseIcon == loadingAccount.showCloseIcon && this.showLoadingAnimation == loadingAccount.showLoadingAnimation && this.showRefreshButton == loadingAccount.showRefreshButton && this.showContactSupportButton == loadingAccount.showContactSupportButton;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            StringResource stringResource = this.subtitle;
            return ((((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.showCloseIcon)) * 31) + Boolean.hashCode(this.showLoadingAnimation)) * 31) + Boolean.hashCode(this.showRefreshButton)) * 31) + Boolean.hashCode(this.showContactSupportButton);
        }

        public String toString() {
            return "LoadingAccount(title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", showCloseIcon=" + this.showCloseIcon + ", showLoadingAnimation=" + this.showLoadingAnimation + ", showRefreshButton=" + this.showRefreshButton + ", showContactSupportButton=" + this.showContactSupportButton + ")";
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        public final boolean getShowLoadingAnimation() {
            return this.showLoadingAnimation;
        }

        public final boolean getShowRefreshButton() {
            return this.showRefreshButton;
        }

        public final boolean getShowContactSupportButton() {
            return this.showContactSupportButton;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingAccount(StringResource title, StringResource stringResource, ServerToBentoAssetMapper2 icon, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.subtitle = stringResource;
            this.icon = icon;
            this.showCloseIcon = z;
            this.showLoadingAnimation = z2;
            this.showRefreshButton = z3;
            this.showContactSupportButton = z4;
        }
    }

    /* compiled from: IndividualAccountOutroState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$AccountConfirmed;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroViewState$AccountConfirmed, reason: from toString */
    public static final /* data */ class AccountConfirmed extends IndividualAccountOutroState3 {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ AccountConfirmed copy$default(AccountConfirmed accountConfirmed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountConfirmed.accountNumber;
            }
            return accountConfirmed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountConfirmed copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AccountConfirmed(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountConfirmed) && Intrinsics.areEqual(this.accountNumber, ((AccountConfirmed) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "AccountConfirmed(accountNumber=" + this.accountNumber + ")";
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountConfirmed(String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }
    }
}
