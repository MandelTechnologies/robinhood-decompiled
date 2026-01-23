package com.robinhood.android.account.naming.common;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameViewState;", "", "nickname", "", "isSaving", "", "inputMessageText", "Lcom/robinhood/android/account/naming/common/InputMessageText;", "ctaText", "", "ctaEnabled", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/android/account/naming/common/InputMessageText;IZLcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;)V", "getNickname", "()Ljava/lang/String;", "()Z", "getInputMessageText", "()Lcom/robinhood/android/account/naming/common/InputMessageText;", "getCtaText", "()I", "getCtaEnabled", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountNicknameViewState {
    public static final int $stable = 0;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean ctaEnabled;
    private final int ctaText;
    private final AccountNicknameViewState2 inputMessageText;
    private final boolean isSaving;
    private final ManagementType managementType;
    private final String nickname;

    public static /* synthetic */ AccountNicknameViewState copy$default(AccountNicknameViewState accountNicknameViewState, String str, boolean z, AccountNicknameViewState2 accountNicknameViewState2, int i, boolean z2, BrokerageAccountType brokerageAccountType, ManagementType managementType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountNicknameViewState.nickname;
        }
        if ((i2 & 2) != 0) {
            z = accountNicknameViewState.isSaving;
        }
        if ((i2 & 4) != 0) {
            accountNicknameViewState2 = accountNicknameViewState.inputMessageText;
        }
        if ((i2 & 8) != 0) {
            i = accountNicknameViewState.ctaText;
        }
        if ((i2 & 16) != 0) {
            z2 = accountNicknameViewState.ctaEnabled;
        }
        if ((i2 & 32) != 0) {
            brokerageAccountType = accountNicknameViewState.brokerageAccountType;
        }
        if ((i2 & 64) != 0) {
            managementType = accountNicknameViewState.managementType;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        ManagementType managementType2 = managementType;
        boolean z3 = z2;
        AccountNicknameViewState2 accountNicknameViewState22 = accountNicknameViewState2;
        return accountNicknameViewState.copy(str, z, accountNicknameViewState22, i, z3, brokerageAccountType2, managementType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountNicknameViewState2 getInputMessageText() {
        return this.inputMessageText;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component7, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final AccountNicknameViewState copy(String nickname, boolean isSaving, AccountNicknameViewState2 inputMessageText, int ctaText, boolean ctaEnabled, BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(inputMessageText, "inputMessageText");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        return new AccountNicknameViewState(nickname, isSaving, inputMessageText, ctaText, ctaEnabled, brokerageAccountType, managementType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNicknameViewState)) {
            return false;
        }
        AccountNicknameViewState accountNicknameViewState = (AccountNicknameViewState) other;
        return Intrinsics.areEqual(this.nickname, accountNicknameViewState.nickname) && this.isSaving == accountNicknameViewState.isSaving && Intrinsics.areEqual(this.inputMessageText, accountNicknameViewState.inputMessageText) && this.ctaText == accountNicknameViewState.ctaText && this.ctaEnabled == accountNicknameViewState.ctaEnabled && this.brokerageAccountType == accountNicknameViewState.brokerageAccountType && this.managementType == accountNicknameViewState.managementType;
    }

    public int hashCode() {
        return (((((((((((this.nickname.hashCode() * 31) + Boolean.hashCode(this.isSaving)) * 31) + this.inputMessageText.hashCode()) * 31) + Integer.hashCode(this.ctaText)) * 31) + Boolean.hashCode(this.ctaEnabled)) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode();
    }

    public String toString() {
        return "AccountNicknameViewState(nickname=" + this.nickname + ", isSaving=" + this.isSaving + ", inputMessageText=" + this.inputMessageText + ", ctaText=" + this.ctaText + ", ctaEnabled=" + this.ctaEnabled + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ")";
    }

    public AccountNicknameViewState(String nickname, boolean z, AccountNicknameViewState2 inputMessageText, int i, boolean z2, BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(inputMessageText, "inputMessageText");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        this.nickname = nickname;
        this.isSaving = z;
        this.inputMessageText = inputMessageText;
        this.ctaText = i;
        this.ctaEnabled = z2;
        this.brokerageAccountType = brokerageAccountType;
        this.managementType = managementType;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final AccountNicknameViewState2 getInputMessageText() {
        return this.inputMessageText;
    }

    public final int getCtaText() {
        return this.ctaText;
    }

    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }
}
