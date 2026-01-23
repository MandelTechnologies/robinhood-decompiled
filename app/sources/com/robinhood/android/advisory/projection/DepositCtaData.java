package com.robinhood.android.advisory.projection;

import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.transfer.TransferNavigationDestination;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCta.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/DepositCtaData;", "", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getIntent", "Lcom/robinhood/android/navigation/keys/IntentKey;", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DepositCtaData {
    public static final int $stable = 0;
    private final BrokerageAccountType brokerageAccountType;
    private final String rhsAccountNumber;

    public static /* synthetic */ DepositCtaData copy$default(DepositCtaData depositCtaData, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositCtaData.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = depositCtaData.brokerageAccountType;
        }
        return depositCtaData.copy(str, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final DepositCtaData copy(String rhsAccountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new DepositCtaData(rhsAccountNumber, brokerageAccountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositCtaData)) {
            return false;
        }
        DepositCtaData depositCtaData = (DepositCtaData) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, depositCtaData.rhsAccountNumber) && this.brokerageAccountType == depositCtaData.brokerageAccountType;
    }

    public int hashCode() {
        return (this.rhsAccountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode();
    }

    public String toString() {
        return "DepositCtaData(rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    public DepositCtaData(String rhsAccountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.rhsAccountNumber = rhsAccountNumber;
        this.brokerageAccountType = brokerageAccountType;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final IntentKey getIntent(SimulateDepositFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return TransferNavigationDestination.getTransferNavigationDestination(this.rhsAccountNumber, this.brokerageAccountType, frequency, MAXTransferContext.EntryPoint.ADVISORY_FUTURE_PROJECTION);
    }
}
