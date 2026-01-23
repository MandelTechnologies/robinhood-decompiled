package com.robinhood.android.optionsupgrade;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;", "", "isTradeOnExpirationRequestInFlight", "", "isLoadingNextScreensOnPositiveButton", "isLoadingNextScreensOnNegativeButton", "isMemberPdtRevampV1", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(ZZZZLcom/robinhood/models/db/Account;)V", "()Z", "getAccount", "()Lcom/robinhood/models/db/Account;", "isPositiveButtonLoading", "isNegativeButtonLoading", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingUpsellTradeOnExpirationViewState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean isLoadingNextScreensOnNegativeButton;
    private final boolean isLoadingNextScreensOnPositiveButton;
    private final boolean isMemberPdtRevampV1;
    private final boolean isNegativeButtonLoading;
    private final boolean isPositiveButtonLoading;
    private final boolean isTradeOnExpirationRequestInFlight;

    public OptionOnboardingUpsellTradeOnExpirationViewState() {
        this(false, false, false, false, null, 31, null);
    }

    public static /* synthetic */ OptionOnboardingUpsellTradeOnExpirationViewState copy$default(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, boolean z, boolean z2, boolean z3, boolean z4, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionOnboardingUpsellTradeOnExpirationViewState.isTradeOnExpirationRequestInFlight;
        }
        if ((i & 2) != 0) {
            z2 = optionOnboardingUpsellTradeOnExpirationViewState.isLoadingNextScreensOnPositiveButton;
        }
        if ((i & 4) != 0) {
            z3 = optionOnboardingUpsellTradeOnExpirationViewState.isLoadingNextScreensOnNegativeButton;
        }
        if ((i & 8) != 0) {
            z4 = optionOnboardingUpsellTradeOnExpirationViewState.isMemberPdtRevampV1;
        }
        if ((i & 16) != 0) {
            account = optionOnboardingUpsellTradeOnExpirationViewState.account;
        }
        Account account2 = account;
        boolean z5 = z3;
        return optionOnboardingUpsellTradeOnExpirationViewState.copy(z, z2, z5, z4, account2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTradeOnExpirationRequestInFlight() {
        return this.isTradeOnExpirationRequestInFlight;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingNextScreensOnPositiveButton() {
        return this.isLoadingNextScreensOnPositiveButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingNextScreensOnNegativeButton() {
        return this.isLoadingNextScreensOnNegativeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component5, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final OptionOnboardingUpsellTradeOnExpirationViewState copy(boolean isTradeOnExpirationRequestInFlight, boolean isLoadingNextScreensOnPositiveButton, boolean isLoadingNextScreensOnNegativeButton, boolean isMemberPdtRevampV1, Account account) {
        return new OptionOnboardingUpsellTradeOnExpirationViewState(isTradeOnExpirationRequestInFlight, isLoadingNextScreensOnPositiveButton, isLoadingNextScreensOnNegativeButton, isMemberPdtRevampV1, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingUpsellTradeOnExpirationViewState)) {
            return false;
        }
        OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState = (OptionOnboardingUpsellTradeOnExpirationViewState) other;
        return this.isTradeOnExpirationRequestInFlight == optionOnboardingUpsellTradeOnExpirationViewState.isTradeOnExpirationRequestInFlight && this.isLoadingNextScreensOnPositiveButton == optionOnboardingUpsellTradeOnExpirationViewState.isLoadingNextScreensOnPositiveButton && this.isLoadingNextScreensOnNegativeButton == optionOnboardingUpsellTradeOnExpirationViewState.isLoadingNextScreensOnNegativeButton && this.isMemberPdtRevampV1 == optionOnboardingUpsellTradeOnExpirationViewState.isMemberPdtRevampV1 && Intrinsics.areEqual(this.account, optionOnboardingUpsellTradeOnExpirationViewState.account);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isTradeOnExpirationRequestInFlight) * 31) + Boolean.hashCode(this.isLoadingNextScreensOnPositiveButton)) * 31) + Boolean.hashCode(this.isLoadingNextScreensOnNegativeButton)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1)) * 31;
        Account account = this.account;
        return iHashCode + (account == null ? 0 : account.hashCode());
    }

    public String toString() {
        return "OptionOnboardingUpsellTradeOnExpirationViewState(isTradeOnExpirationRequestInFlight=" + this.isTradeOnExpirationRequestInFlight + ", isLoadingNextScreensOnPositiveButton=" + this.isLoadingNextScreensOnPositiveButton + ", isLoadingNextScreensOnNegativeButton=" + this.isLoadingNextScreensOnNegativeButton + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ", account=" + this.account + ")";
    }

    public OptionOnboardingUpsellTradeOnExpirationViewState(boolean z, boolean z2, boolean z3, boolean z4, Account account) {
        this.isTradeOnExpirationRequestInFlight = z;
        this.isLoadingNextScreensOnPositiveButton = z2;
        this.isLoadingNextScreensOnNegativeButton = z3;
        this.isMemberPdtRevampV1 = z4;
        this.account = account;
        this.isPositiveButtonLoading = z || z2;
        this.isNegativeButtonLoading = z3;
    }

    public /* synthetic */ OptionOnboardingUpsellTradeOnExpirationViewState(boolean z, boolean z2, boolean z3, boolean z4, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : account);
    }

    public final boolean isTradeOnExpirationRequestInFlight() {
        return this.isTradeOnExpirationRequestInFlight;
    }

    public final boolean isLoadingNextScreensOnPositiveButton() {
        return this.isLoadingNextScreensOnPositiveButton;
    }

    public final boolean isLoadingNextScreensOnNegativeButton() {
        return this.isLoadingNextScreensOnNegativeButton;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: isPositiveButtonLoading, reason: from getter */
    public final boolean getIsPositiveButtonLoading() {
        return this.isPositiveButtonLoading;
    }

    /* renamed from: isNegativeButtonLoading, reason: from getter */
    public final boolean getIsNegativeButtonLoading() {
        return this.isNegativeButtonLoading;
    }
}
