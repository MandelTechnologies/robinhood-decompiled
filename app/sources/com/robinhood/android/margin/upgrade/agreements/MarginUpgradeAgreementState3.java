package com.robinhood.android.margin.upgrade.agreements;

import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeAgreementState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "", "<init>", "()V", "Loading", "IndividualAgreementLoaded", "JointAccountAgreementLoaded", "UpgradeSuccess", "UpgradeError", "GenericError", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$GenericError;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$IndividualAgreementLoaded;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$JointAccountAgreementLoaded;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$Loading;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$UpgradeError;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$UpgradeSuccess;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MarginUpgradeAgreementState3 {
    public static final int $stable = 0;

    public /* synthetic */ MarginUpgradeAgreementState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginUpgradeAgreementState3() {
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$Loading;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$Loading */
    public static final /* data */ class Loading extends MarginUpgradeAgreementState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1466123895;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$IndividualAgreementLoaded;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", InstantRetirementAgreementComponents.MarkdownTag, "", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "disclaimerStringRes", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;I)V", "getMarkdown", "()Ljava/lang/String;", "getAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getDisclaimerStringRes", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$IndividualAgreementLoaded, reason: from toString */
    public static final /* data */ class IndividualAgreementLoaded extends MarginUpgradeAgreementState3 {
        public static final int $stable = 8;
        private final UiAgreementWithContent agreement;
        private final int disclaimerStringRes;
        private final String markdown;

        public static /* synthetic */ IndividualAgreementLoaded copy$default(IndividualAgreementLoaded individualAgreementLoaded, String str, UiAgreementWithContent uiAgreementWithContent, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = individualAgreementLoaded.markdown;
            }
            if ((i2 & 2) != 0) {
                uiAgreementWithContent = individualAgreementLoaded.agreement;
            }
            if ((i2 & 4) != 0) {
                i = individualAgreementLoaded.disclaimerStringRes;
            }
            return individualAgreementLoaded.copy(str, uiAgreementWithContent, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMarkdown() {
            return this.markdown;
        }

        /* renamed from: component2, reason: from getter */
        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDisclaimerStringRes() {
            return this.disclaimerStringRes;
        }

        public final IndividualAgreementLoaded copy(String markdown, UiAgreementWithContent agreement, int disclaimerStringRes) {
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            return new IndividualAgreementLoaded(markdown, agreement, disclaimerStringRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndividualAgreementLoaded)) {
                return false;
            }
            IndividualAgreementLoaded individualAgreementLoaded = (IndividualAgreementLoaded) other;
            return Intrinsics.areEqual(this.markdown, individualAgreementLoaded.markdown) && Intrinsics.areEqual(this.agreement, individualAgreementLoaded.agreement) && this.disclaimerStringRes == individualAgreementLoaded.disclaimerStringRes;
        }

        public int hashCode() {
            return (((this.markdown.hashCode() * 31) + this.agreement.hashCode()) * 31) + Integer.hashCode(this.disclaimerStringRes);
        }

        public String toString() {
            return "IndividualAgreementLoaded(markdown=" + this.markdown + ", agreement=" + this.agreement + ", disclaimerStringRes=" + this.disclaimerStringRes + ")";
        }

        public final String getMarkdown() {
            return this.markdown;
        }

        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        public final int getDisclaimerStringRes() {
            return this.disclaimerStringRes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndividualAgreementLoaded(String markdown, UiAgreementWithContent agreement, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            this.markdown = markdown;
            this.agreement = agreement;
            this.disclaimerStringRes = i;
        }
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$JointAccountAgreementLoaded;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", InstantRetirementAgreementComponents.MarkdownTag, "", "accountNumber", "coOwnerFirstName", "firstCheckboxChecked", "", "secondCheckboxChecked", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/android/agreements/models/UiAgreementWithContent;)V", "getMarkdown", "()Ljava/lang/String;", "getAccountNumber", "getCoOwnerFirstName", "getFirstCheckboxChecked", "()Z", "getSecondCheckboxChecked", "getAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$JointAccountAgreementLoaded, reason: from toString */
    public static final /* data */ class JointAccountAgreementLoaded extends MarginUpgradeAgreementState3 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UiAgreementWithContent agreement;
        private final String coOwnerFirstName;
        private final boolean firstCheckboxChecked;
        private final String markdown;
        private final boolean secondCheckboxChecked;

        public static /* synthetic */ JointAccountAgreementLoaded copy$default(JointAccountAgreementLoaded jointAccountAgreementLoaded, String str, String str2, String str3, boolean z, boolean z2, UiAgreementWithContent uiAgreementWithContent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jointAccountAgreementLoaded.markdown;
            }
            if ((i & 2) != 0) {
                str2 = jointAccountAgreementLoaded.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = jointAccountAgreementLoaded.coOwnerFirstName;
            }
            if ((i & 8) != 0) {
                z = jointAccountAgreementLoaded.firstCheckboxChecked;
            }
            if ((i & 16) != 0) {
                z2 = jointAccountAgreementLoaded.secondCheckboxChecked;
            }
            if ((i & 32) != 0) {
                uiAgreementWithContent = jointAccountAgreementLoaded.agreement;
            }
            boolean z3 = z2;
            UiAgreementWithContent uiAgreementWithContent2 = uiAgreementWithContent;
            return jointAccountAgreementLoaded.copy(str, str2, str3, z, z3, uiAgreementWithContent2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMarkdown() {
            return this.markdown;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCoOwnerFirstName() {
            return this.coOwnerFirstName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getFirstCheckboxChecked() {
            return this.firstCheckboxChecked;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSecondCheckboxChecked() {
            return this.secondCheckboxChecked;
        }

        /* renamed from: component6, reason: from getter */
        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        public final JointAccountAgreementLoaded copy(String markdown, String accountNumber, String coOwnerFirstName, boolean firstCheckboxChecked, boolean secondCheckboxChecked, UiAgreementWithContent agreement) {
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(coOwnerFirstName, "coOwnerFirstName");
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            return new JointAccountAgreementLoaded(markdown, accountNumber, coOwnerFirstName, firstCheckboxChecked, secondCheckboxChecked, agreement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JointAccountAgreementLoaded)) {
                return false;
            }
            JointAccountAgreementLoaded jointAccountAgreementLoaded = (JointAccountAgreementLoaded) other;
            return Intrinsics.areEqual(this.markdown, jointAccountAgreementLoaded.markdown) && Intrinsics.areEqual(this.accountNumber, jointAccountAgreementLoaded.accountNumber) && Intrinsics.areEqual(this.coOwnerFirstName, jointAccountAgreementLoaded.coOwnerFirstName) && this.firstCheckboxChecked == jointAccountAgreementLoaded.firstCheckboxChecked && this.secondCheckboxChecked == jointAccountAgreementLoaded.secondCheckboxChecked && Intrinsics.areEqual(this.agreement, jointAccountAgreementLoaded.agreement);
        }

        public int hashCode() {
            return (((((((((this.markdown.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.coOwnerFirstName.hashCode()) * 31) + Boolean.hashCode(this.firstCheckboxChecked)) * 31) + Boolean.hashCode(this.secondCheckboxChecked)) * 31) + this.agreement.hashCode();
        }

        public String toString() {
            return "JointAccountAgreementLoaded(markdown=" + this.markdown + ", accountNumber=" + this.accountNumber + ", coOwnerFirstName=" + this.coOwnerFirstName + ", firstCheckboxChecked=" + this.firstCheckboxChecked + ", secondCheckboxChecked=" + this.secondCheckboxChecked + ", agreement=" + this.agreement + ")";
        }

        public final String getMarkdown() {
            return this.markdown;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getCoOwnerFirstName() {
            return this.coOwnerFirstName;
        }

        public final boolean getFirstCheckboxChecked() {
            return this.firstCheckboxChecked;
        }

        public final boolean getSecondCheckboxChecked() {
            return this.secondCheckboxChecked;
        }

        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JointAccountAgreementLoaded(String markdown, String accountNumber, String coOwnerFirstName, boolean z, boolean z2, UiAgreementWithContent agreement) {
            super(null);
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(coOwnerFirstName, "coOwnerFirstName");
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            this.markdown = markdown;
            this.accountNumber = accountNumber;
            this.coOwnerFirstName = coOwnerFirstName;
            this.firstCheckboxChecked = z;
            this.secondCheckboxChecked = z2;
            this.agreement = agreement;
        }
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$UpgradeSuccess;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/account/strings/DisplayName;)V", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getNewBuyingPower", "()Lcom/robinhood/models/util/Money;", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$UpgradeSuccess, reason: from toString */
    public static final /* data */ class UpgradeSuccess extends MarginUpgradeAgreementState3 {
        public static final int $stable = 8;
        private final DisplayName displayName;
        private final Money newBuyingPower;
        private final ApiToggleMarginInvestingResponse2 result;

        public static /* synthetic */ UpgradeSuccess copy$default(UpgradeSuccess upgradeSuccess, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, Money money, DisplayName displayName, int i, Object obj) {
            if ((i & 1) != 0) {
                apiToggleMarginInvestingResponse2 = upgradeSuccess.result;
            }
            if ((i & 2) != 0) {
                money = upgradeSuccess.newBuyingPower;
            }
            if ((i & 4) != 0) {
                displayName = upgradeSuccess.displayName;
            }
            return upgradeSuccess.copy(apiToggleMarginInvestingResponse2, money, displayName);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        /* renamed from: component3, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final UpgradeSuccess copy(ApiToggleMarginInvestingResponse2 result, Money newBuyingPower, DisplayName displayName) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new UpgradeSuccess(result, newBuyingPower, displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpgradeSuccess)) {
                return false;
            }
            UpgradeSuccess upgradeSuccess = (UpgradeSuccess) other;
            return this.result == upgradeSuccess.result && Intrinsics.areEqual(this.newBuyingPower, upgradeSuccess.newBuyingPower) && Intrinsics.areEqual(this.displayName, upgradeSuccess.displayName);
        }

        public int hashCode() {
            return (((this.result.hashCode() * 31) + this.newBuyingPower.hashCode()) * 31) + this.displayName.hashCode();
        }

        public String toString() {
            return "UpgradeSuccess(result=" + this.result + ", newBuyingPower=" + this.newBuyingPower + ", displayName=" + this.displayName + ")";
        }

        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpgradeSuccess(ApiToggleMarginInvestingResponse2 result, Money newBuyingPower, DisplayName displayName) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.result = result;
            this.newBuyingPower = newBuyingPower;
            this.displayName = displayName;
        }
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$UpgradeError;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Ljava/lang/String;)V", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getErrorReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$UpgradeError, reason: from toString */
    public static final /* data */ class UpgradeError extends MarginUpgradeAgreementState3 {
        public static final int $stable = 0;
        private final String errorReason;
        private final ApiToggleMarginInvestingResponse2 result;

        public static /* synthetic */ UpgradeError copy$default(UpgradeError upgradeError, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiToggleMarginInvestingResponse2 = upgradeError.result;
            }
            if ((i & 2) != 0) {
                str = upgradeError.errorReason;
            }
            return upgradeError.copy(apiToggleMarginInvestingResponse2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorReason() {
            return this.errorReason;
        }

        public final UpgradeError copy(ApiToggleMarginInvestingResponse2 result, String errorReason) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            return new UpgradeError(result, errorReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpgradeError)) {
                return false;
            }
            UpgradeError upgradeError = (UpgradeError) other;
            return this.result == upgradeError.result && Intrinsics.areEqual(this.errorReason, upgradeError.errorReason);
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + this.errorReason.hashCode();
        }

        public String toString() {
            return "UpgradeError(result=" + this.result + ", errorReason=" + this.errorReason + ")";
        }

        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        public final String getErrorReason() {
            return this.errorReason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.result = result;
            this.errorReason = errorReason;
        }
    }

    /* compiled from: MarginUpgradeAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$GenericError;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewState$GenericError, reason: from toString */
    public static final /* data */ class GenericError extends MarginUpgradeAgreementState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ GenericError copy$default(GenericError genericError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericError.throwable;
            }
            return genericError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final GenericError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new GenericError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericError) && Intrinsics.areEqual(this.throwable, ((GenericError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "GenericError(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
