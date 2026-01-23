package com.robinhood.android.margin.upgrade.agreements;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeAgreementState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010*J\u0098\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0015HÖ\u0001J\t\u0010=\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "isLoading", "", InstantRetirementAgreementComponents.MarkdownTag, "", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "errorReason", "throwable", "", "firstCheckboxChecked", "secondCheckboxChecked", "jointAccountCoOwnerFirstName", "disclaimerStringRes", "", "<init>", "(Lcom/robinhood/models/db/Account;ZLjava/lang/String;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Ljava/lang/Integer;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "()Z", "getMarkdown", "()Ljava/lang/String;", "getAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getNewBuyingPower", "()Lcom/robinhood/models/util/Money;", "getErrorReason", "getThrowable", "()Ljava/lang/Throwable;", "getFirstCheckboxChecked", "getSecondCheckboxChecked", "getJointAccountCoOwnerFirstName", "getDisclaimerStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/robinhood/models/db/Account;ZLjava/lang/String;Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;", "equals", "other", "hashCode", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeAgreementDataState {
    public static final int $stable = 8;
    private final Account account;
    private final UiAgreementWithContent agreement;
    private final Integer disclaimerStringRes;
    private final String errorReason;
    private final boolean firstCheckboxChecked;
    private final boolean isLoading;
    private final String jointAccountCoOwnerFirstName;
    private final String markdown;
    private final Money newBuyingPower;
    private final ApiToggleMarginInvestingResponse2 result;
    private final boolean secondCheckboxChecked;
    private final Throwable throwable;

    public MarginUpgradeAgreementDataState() {
        this(null, false, null, null, null, null, null, null, false, false, null, null, 4095, null);
    }

    public static /* synthetic */ MarginUpgradeAgreementDataState copy$default(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Account account, boolean z, String str, UiAgreementWithContent uiAgreementWithContent, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, Money money, String str2, Throwable th, boolean z2, boolean z3, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            account = marginUpgradeAgreementDataState.account;
        }
        if ((i & 2) != 0) {
            z = marginUpgradeAgreementDataState.isLoading;
        }
        if ((i & 4) != 0) {
            str = marginUpgradeAgreementDataState.markdown;
        }
        if ((i & 8) != 0) {
            uiAgreementWithContent = marginUpgradeAgreementDataState.agreement;
        }
        if ((i & 16) != 0) {
            apiToggleMarginInvestingResponse2 = marginUpgradeAgreementDataState.result;
        }
        if ((i & 32) != 0) {
            money = marginUpgradeAgreementDataState.newBuyingPower;
        }
        if ((i & 64) != 0) {
            str2 = marginUpgradeAgreementDataState.errorReason;
        }
        if ((i & 128) != 0) {
            th = marginUpgradeAgreementDataState.throwable;
        }
        if ((i & 256) != 0) {
            z2 = marginUpgradeAgreementDataState.firstCheckboxChecked;
        }
        if ((i & 512) != 0) {
            z3 = marginUpgradeAgreementDataState.secondCheckboxChecked;
        }
        if ((i & 1024) != 0) {
            str3 = marginUpgradeAgreementDataState.jointAccountCoOwnerFirstName;
        }
        if ((i & 2048) != 0) {
            num = marginUpgradeAgreementDataState.disclaimerStringRes;
        }
        String str4 = str3;
        Integer num2 = num;
        boolean z4 = z2;
        boolean z5 = z3;
        String str5 = str2;
        Throwable th2 = th;
        ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse22 = apiToggleMarginInvestingResponse2;
        Money money2 = money;
        return marginUpgradeAgreementDataState.copy(account, z, str, uiAgreementWithContent, apiToggleMarginInvestingResponse22, money2, str5, th2, z4, z5, str4, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSecondCheckboxChecked() {
        return this.secondCheckboxChecked;
    }

    /* renamed from: component11, reason: from getter */
    public final String getJointAccountCoOwnerFirstName() {
        return this.jointAccountCoOwnerFirstName;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getDisclaimerStringRes() {
        return this.disclaimerStringRes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component4, reason: from getter */
    public final UiAgreementWithContent getAgreement() {
        return this.agreement;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiToggleMarginInvestingResponse2 getResult() {
        return this.result;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getNewBuyingPower() {
        return this.newBuyingPower;
    }

    /* renamed from: component7, reason: from getter */
    public final String getErrorReason() {
        return this.errorReason;
    }

    /* renamed from: component8, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFirstCheckboxChecked() {
        return this.firstCheckboxChecked;
    }

    public final MarginUpgradeAgreementDataState copy(Account account, boolean isLoading, String markdown, UiAgreementWithContent agreement, ApiToggleMarginInvestingResponse2 result, Money newBuyingPower, String errorReason, Throwable throwable, boolean firstCheckboxChecked, boolean secondCheckboxChecked, String jointAccountCoOwnerFirstName, Integer disclaimerStringRes) {
        return new MarginUpgradeAgreementDataState(account, isLoading, markdown, agreement, result, newBuyingPower, errorReason, throwable, firstCheckboxChecked, secondCheckboxChecked, jointAccountCoOwnerFirstName, disclaimerStringRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeAgreementDataState)) {
            return false;
        }
        MarginUpgradeAgreementDataState marginUpgradeAgreementDataState = (MarginUpgradeAgreementDataState) other;
        return Intrinsics.areEqual(this.account, marginUpgradeAgreementDataState.account) && this.isLoading == marginUpgradeAgreementDataState.isLoading && Intrinsics.areEqual(this.markdown, marginUpgradeAgreementDataState.markdown) && Intrinsics.areEqual(this.agreement, marginUpgradeAgreementDataState.agreement) && this.result == marginUpgradeAgreementDataState.result && Intrinsics.areEqual(this.newBuyingPower, marginUpgradeAgreementDataState.newBuyingPower) && Intrinsics.areEqual(this.errorReason, marginUpgradeAgreementDataState.errorReason) && Intrinsics.areEqual(this.throwable, marginUpgradeAgreementDataState.throwable) && this.firstCheckboxChecked == marginUpgradeAgreementDataState.firstCheckboxChecked && this.secondCheckboxChecked == marginUpgradeAgreementDataState.secondCheckboxChecked && Intrinsics.areEqual(this.jointAccountCoOwnerFirstName, marginUpgradeAgreementDataState.jointAccountCoOwnerFirstName) && Intrinsics.areEqual(this.disclaimerStringRes, marginUpgradeAgreementDataState.disclaimerStringRes);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.markdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiAgreementWithContent uiAgreementWithContent = this.agreement;
        int iHashCode3 = (iHashCode2 + (uiAgreementWithContent == null ? 0 : uiAgreementWithContent.hashCode())) * 31;
        ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2 = this.result;
        int iHashCode4 = (iHashCode3 + (apiToggleMarginInvestingResponse2 == null ? 0 : apiToggleMarginInvestingResponse2.hashCode())) * 31;
        Money money = this.newBuyingPower;
        int iHashCode5 = (iHashCode4 + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.errorReason;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.throwable;
        int iHashCode7 = (((((iHashCode6 + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.firstCheckboxChecked)) * 31) + Boolean.hashCode(this.secondCheckboxChecked)) * 31;
        String str3 = this.jointAccountCoOwnerFirstName;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.disclaimerStringRes;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MarginUpgradeAgreementDataState(account=" + this.account + ", isLoading=" + this.isLoading + ", markdown=" + this.markdown + ", agreement=" + this.agreement + ", result=" + this.result + ", newBuyingPower=" + this.newBuyingPower + ", errorReason=" + this.errorReason + ", throwable=" + this.throwable + ", firstCheckboxChecked=" + this.firstCheckboxChecked + ", secondCheckboxChecked=" + this.secondCheckboxChecked + ", jointAccountCoOwnerFirstName=" + this.jointAccountCoOwnerFirstName + ", disclaimerStringRes=" + this.disclaimerStringRes + ")";
    }

    public MarginUpgradeAgreementDataState(Account account, boolean z, String str, UiAgreementWithContent uiAgreementWithContent, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, Money money, String str2, Throwable th, boolean z2, boolean z3, String str3, Integer num) {
        this.account = account;
        this.isLoading = z;
        this.markdown = str;
        this.agreement = uiAgreementWithContent;
        this.result = apiToggleMarginInvestingResponse2;
        this.newBuyingPower = money;
        this.errorReason = str2;
        this.throwable = th;
        this.firstCheckboxChecked = z2;
        this.secondCheckboxChecked = z3;
        this.jointAccountCoOwnerFirstName = str3;
        this.disclaimerStringRes = num;
    }

    public /* synthetic */ MarginUpgradeAgreementDataState(Account account, boolean z, String str, UiAgreementWithContent uiAgreementWithContent, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, Money money, String str2, Throwable th, boolean z2, boolean z3, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uiAgreementWithContent, (i & 16) != 0 ? null : apiToggleMarginInvestingResponse2, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : th, (i & 256) != 0 ? true : z2, (i & 512) == 0 ? z3 : true, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : num);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getMarkdown() {
        return this.markdown;
    }

    public final UiAgreementWithContent getAgreement() {
        return this.agreement;
    }

    public final ApiToggleMarginInvestingResponse2 getResult() {
        return this.result;
    }

    public final Money getNewBuyingPower() {
        return this.newBuyingPower;
    }

    public final String getErrorReason() {
        return this.errorReason;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean getFirstCheckboxChecked() {
        return this.firstCheckboxChecked;
    }

    public final boolean getSecondCheckboxChecked() {
        return this.secondCheckboxChecked;
    }

    public final String getJointAccountCoOwnerFirstName() {
        return this.jointAccountCoOwnerFirstName;
    }

    public final Integer getDisclaimerStringRes() {
        return this.disclaimerStringRes;
    }
}
