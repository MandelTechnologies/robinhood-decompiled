package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.options.p208ui.detail.OptionsDetailPagePnlDataState2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;

/* compiled from: OptionsDetailPagePnlDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"getPnlDataState", "Lcom/robinhood/android/options/ui/detail/PnlDataState;", "currentAccount", "Lcom/robinhood/models/db/Account;", "inRetirementPnlM1", "", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPagePnlDataStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPagePnlDataState {
    public static final OptionsDetailPagePnlDataState2 getPnlDataState(Account account, boolean z) {
        if (account == null) {
            return new OptionsDetailPagePnlDataState2.FetchLegacy(false);
        }
        BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
        if (brokerageAccountType.isRetirement() && z) {
            return OptionsDetailPagePnlDataState2.FetchWithClearingData.INSTANCE;
        }
        if (!brokerageAccountType.isRetirement()) {
            return OptionsDetailPagePnlDataState2.FetchWithClearingData.INSTANCE;
        }
        if (brokerageAccountType.isRetirement() && !z) {
            return new OptionsDetailPagePnlDataState2.FetchLegacy(true);
        }
        return new OptionsDetailPagePnlDataState2.FetchLegacy(false);
    }
}
