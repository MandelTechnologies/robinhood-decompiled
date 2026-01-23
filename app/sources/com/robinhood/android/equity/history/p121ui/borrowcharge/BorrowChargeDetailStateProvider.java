package com.robinhood.android.equity.history.p121ui.borrowcharge;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.equity.history.C15093R;
import com.robinhood.android.equity.history.p121ui.borrowcharge.BorrowChargeDetailViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiBorrowCharge3;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: BorrowChargeDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BorrowChargeDetailStateProvider implements StateProvider<BorrowChargeDetailDataState, BorrowChargeDetailViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BorrowChargeDetailViewState reduce(BorrowChargeDetailDataState dataState) {
        StringResource stringResourceInvoke;
        BigDecimal totalCharges;
        BigDecimal bigDecimalNegate;
        ApiBorrowCharge3 status;
        Instant chargeDate;
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Account account = dataState.getAccount();
        StringResource title = (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle();
        GroupedBorrowCharges groupedBorrowCharges = dataState.getGroupedBorrowCharges();
        String str = (groupedBorrowCharges == null || (chargeDate = groupedBorrowCharges.getChargeDate()) == null) ? null : InstantFormatter.DATE_IN_UTC.format(chargeDate);
        if (dataState.getGroupedBorrowCharges() != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C15093R.string.borrow_charge_charge_period_subtitle;
            InstantFormatter instantFormatter = InstantFormatter.DATE_NO_YEAR_IN_UTC;
            stringResourceInvoke = companion.invoke(i, instantFormatter.format(dataState.getGroupedBorrowCharges().getBillingStartDate()), instantFormatter.format(dataState.getGroupedBorrowCharges().getBillingEndDate()));
        } else {
            stringResourceInvoke = null;
        }
        GroupedBorrowCharges groupedBorrowCharges2 = dataState.getGroupedBorrowCharges();
        StringResource stringResourceDisplayString = (groupedBorrowCharges2 == null || (status = groupedBorrowCharges2.getStatus()) == null) ? null : BorrowChargeDetailStateProvider2.displayString(status);
        GroupedBorrowCharges groupedBorrowCharges3 = dataState.getGroupedBorrowCharges();
        String str2 = Money3.format$default((groupedBorrowCharges3 == null || (totalCharges = groupedBorrowCharges3.getTotalCharges()) == null || (bigDecimalNegate = totalCharges.negate()) == null) ? null : Money3.toMoney$default(bigDecimalNegate, null, 1, null), null, 1, null);
        List<BorrowChargeDetailViewState.UiBorrowCharge> instrumentBorrowCharges = dataState.getInstrumentBorrowCharges();
        return new BorrowChargeDetailViewState(title, str2, str, stringResourceInvoke, stringResourceDisplayString, instrumentBorrowCharges != null ? extensions2.toPersistentList(instrumentBorrowCharges) : null);
    }
}
