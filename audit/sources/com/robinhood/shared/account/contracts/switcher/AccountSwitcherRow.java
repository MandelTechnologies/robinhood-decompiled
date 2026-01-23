package com.robinhood.shared.account.contracts.switcher;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import p479j$.time.Instant;

/* compiled from: AccountSwitcherRow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "managementType", "j$/time/Instant", "getCreatedAt", "()Lj$/time/Instant;", "createdAt", "", "getLoggingIdentifier", "()Ljava/lang/String;", "loggingIdentifier", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AccountSwitcherRow {
    BrokerageAccountType getBrokerageAccountType();

    Instant getCreatedAt();

    String getLoggingIdentifier();

    ManagementType getManagementType();
}
