package com.robinhood.android.advisory.projection;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProjectionViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/ProjectionAccountInfo;", "", "accountNumber", "", "userEndOfYearAge", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getUserEndOfYearAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/android/advisory/projection/ProjectionAccountInfo;", "equals", "", "other", "hashCode", "toString", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProjectionAccountInfo {
    public static final int $stable = 0;
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final Integer userEndOfYearAge;

    public static /* synthetic */ ProjectionAccountInfo copy$default(ProjectionAccountInfo projectionAccountInfo, String str, Integer num, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectionAccountInfo.accountNumber;
        }
        if ((i & 2) != 0) {
            num = projectionAccountInfo.userEndOfYearAge;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = projectionAccountInfo.brokerageAccountType;
        }
        return projectionAccountInfo.copy(str, num, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getUserEndOfYearAge() {
        return this.userEndOfYearAge;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ProjectionAccountInfo copy(String accountNumber, Integer userEndOfYearAge, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new ProjectionAccountInfo(accountNumber, userEndOfYearAge, brokerageAccountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectionAccountInfo)) {
            return false;
        }
        ProjectionAccountInfo projectionAccountInfo = (ProjectionAccountInfo) other;
        return Intrinsics.areEqual(this.accountNumber, projectionAccountInfo.accountNumber) && Intrinsics.areEqual(this.userEndOfYearAge, projectionAccountInfo.userEndOfYearAge) && this.brokerageAccountType == projectionAccountInfo.brokerageAccountType;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        Integer num = this.userEndOfYearAge;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.brokerageAccountType.hashCode();
    }

    public String toString() {
        return "ProjectionAccountInfo(accountNumber=" + this.accountNumber + ", userEndOfYearAge=" + this.userEndOfYearAge + ", brokerageAccountType=" + this.brokerageAccountType + ")";
    }

    public ProjectionAccountInfo(String accountNumber, Integer num, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.accountNumber = accountNumber;
        this.userEndOfYearAge = num;
        this.brokerageAccountType = brokerageAccountType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Integer getUserEndOfYearAge() {
        return this.userEndOfYearAge;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }
}
