package com.robinhood.shared.equities.store.subzero;

import com.robinhood.models.api.AccountType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubzeroOnboardingHandler.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "", "subzeroFtuxSeenCountPref", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Lcom/robinhood/prefs/IntPreference;)V", "handle", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingResult;", "tradeSide", "Lcom/robinhood/models/db/EquityOrderSide;", "accountType", "Lcom/robinhood/models/api/AccountType;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingEntryPoint;", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SubzeroOnboardingHandler {
    private final IntPreference subzeroFtuxSeenCountPref;

    public SubzeroOnboardingHandler(@SubzeroModule2 IntPreference subzeroFtuxSeenCountPref) {
        Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
        this.subzeroFtuxSeenCountPref = subzeroFtuxSeenCountPref;
    }

    public final SubzeroOnboardingHandler3 handle(EquityOrderSide tradeSide, AccountType accountType, String accountNumber, UUID instrumentId, SubzeroOnboardingHandler2 entryPoint) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        int i = this.subzeroFtuxSeenCountPref.get();
        if (i >= 2 || entryPoint == null || tradeSide != EquityOrderSide.SELL_SHORT) {
            return SubzeroOnboardingHandler3.NoAction.INSTANCE;
        }
        String str = "robinhood://microgram_launch?id=app-subzero-onboarding&deeplink=robinhood%3A%2F%2F%3Faccount_number%3D" + accountNumber + "%26instrument_id%3D" + instrumentId + "%26entry_point%3D" + entryPoint.getValue();
        if (accountType != AccountType.CASH) {
            this.subzeroFtuxSeenCountPref.set(2);
            return new SubzeroOnboardingHandler3.DeepLink(str);
        }
        if (i == 0) {
            this.subzeroFtuxSeenCountPref.set(1);
            return new SubzeroOnboardingHandler3.DeepLink(str);
        }
        this.subzeroFtuxSeenCountPref.set(2);
        return SubzeroOnboardingHandler3.SellShort.INSTANCE;
    }
}
