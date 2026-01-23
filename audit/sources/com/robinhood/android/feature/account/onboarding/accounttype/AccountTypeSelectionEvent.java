package com.robinhood.android.feature.account.onboarding.accounttype;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTypeSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent;", "", "<init>", "()V", "BrokerageAccountTypeSelected", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent$BrokerageAccountTypeSelected;", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class AccountTypeSelectionEvent {
    public static final int $stable = 0;

    public /* synthetic */ AccountTypeSelectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountTypeSelectionEvent() {
    }

    /* compiled from: AccountTypeSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent$BrokerageAccountTypeSelected;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrokerageAccountTypeSelected extends AccountTypeSelectionEvent {
        public static final int $stable = 0;
        private final BrokerageAccountType brokerageAccountType;

        public static /* synthetic */ BrokerageAccountTypeSelected copy$default(BrokerageAccountTypeSelected brokerageAccountTypeSelected, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = brokerageAccountTypeSelected.brokerageAccountType;
            }
            return brokerageAccountTypeSelected.copy(brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final BrokerageAccountTypeSelected copy(BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new BrokerageAccountTypeSelected(brokerageAccountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrokerageAccountTypeSelected) && this.brokerageAccountType == ((BrokerageAccountTypeSelected) other).brokerageAccountType;
        }

        public int hashCode() {
            return this.brokerageAccountType.hashCode();
        }

        public String toString() {
            return "BrokerageAccountTypeSelected(brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrokerageAccountTypeSelected(BrokerageAccountType brokerageAccountType) {
            super(null);
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.brokerageAccountType = brokerageAccountType;
        }
    }
}
