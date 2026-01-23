package com.robinhood.android.account.naming.common;

import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;", "", "nickname", "", "validation", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "isSaving", "", "ctaText", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/account/store/naming/NicknameValidationResult;ZILcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;)V", "getNickname", "()Ljava/lang/String;", "getValidation", "()Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "()Z", "getCtaText", "()I", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountNicknameDataState {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final int ctaText;
    private final boolean isSaving;
    private final ManagementType managementType;
    private final String nickname;
    private final NicknameValidationResult validation;

    public static /* synthetic */ AccountNicknameDataState copy$default(AccountNicknameDataState accountNicknameDataState, String str, NicknameValidationResult nicknameValidationResult, boolean z, int i, BrokerageAccountType brokerageAccountType, ManagementType managementType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountNicknameDataState.nickname;
        }
        if ((i2 & 2) != 0) {
            nicknameValidationResult = accountNicknameDataState.validation;
        }
        if ((i2 & 4) != 0) {
            z = accountNicknameDataState.isSaving;
        }
        if ((i2 & 8) != 0) {
            i = accountNicknameDataState.ctaText;
        }
        if ((i2 & 16) != 0) {
            brokerageAccountType = accountNicknameDataState.brokerageAccountType;
        }
        if ((i2 & 32) != 0) {
            managementType = accountNicknameDataState.managementType;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        ManagementType managementType2 = managementType;
        return accountNicknameDataState.copy(str, nicknameValidationResult, z, i, brokerageAccountType2, managementType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final NicknameValidationResult getValidation() {
        return this.validation;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component6, reason: from getter */
    public final ManagementType getManagementType() {
        return this.managementType;
    }

    public final AccountNicknameDataState copy(String nickname, NicknameValidationResult validation, boolean isSaving, int ctaText, BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        return new AccountNicknameDataState(nickname, validation, isSaving, ctaText, brokerageAccountType, managementType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNicknameDataState)) {
            return false;
        }
        AccountNicknameDataState accountNicknameDataState = (AccountNicknameDataState) other;
        return Intrinsics.areEqual(this.nickname, accountNicknameDataState.nickname) && Intrinsics.areEqual(this.validation, accountNicknameDataState.validation) && this.isSaving == accountNicknameDataState.isSaving && this.ctaText == accountNicknameDataState.ctaText && this.brokerageAccountType == accountNicknameDataState.brokerageAccountType && this.managementType == accountNicknameDataState.managementType;
    }

    public int hashCode() {
        return (((((((((this.nickname.hashCode() * 31) + this.validation.hashCode()) * 31) + Boolean.hashCode(this.isSaving)) * 31) + Integer.hashCode(this.ctaText)) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode();
    }

    public String toString() {
        return "AccountNicknameDataState(nickname=" + this.nickname + ", validation=" + this.validation + ", isSaving=" + this.isSaving + ", ctaText=" + this.ctaText + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ")";
    }

    public AccountNicknameDataState(String nickname, NicknameValidationResult validation, boolean z, int i, BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        this.nickname = nickname;
        this.validation = validation;
        this.isSaving = z;
        this.ctaText = i;
        this.brokerageAccountType = brokerageAccountType;
        this.managementType = managementType;
    }

    public /* synthetic */ AccountNicknameDataState(String str, NicknameValidationResult nicknameValidationResult, boolean z, int i, BrokerageAccountType brokerageAccountType, ManagementType managementType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? NicknameValidationResult.NotEnoughLetters.INSTANCE : nicknameValidationResult, (i2 & 4) != 0 ? false : z, i, (i2 & 16) != 0 ? BrokerageAccountType.UNKNOWN : brokerageAccountType, (i2 & 32) != 0 ? ManagementType.UNKNOWN : managementType);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final NicknameValidationResult getValidation() {
        return this.validation;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final int getCtaText() {
        return this.ctaText;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ManagementType getManagementType() {
        return this.managementType;
    }
}
