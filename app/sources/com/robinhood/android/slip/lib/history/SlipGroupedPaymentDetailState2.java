package com.robinhood.android.slip.lib.history;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.slip.lib.C28536R;
import com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailState3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.SlipGroupedPayment;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipGroupedPaymentDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailStateProvider, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipGroupedPaymentDetailState2 implements StateProvider<SlipGroupedPaymentDetailDataState, SlipGroupedPaymentDetailState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SlipGroupedPaymentDetailState3 reduce(SlipGroupedPaymentDetailDataState dataState) {
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null) {
            return new SlipGroupedPaymentDetailState3.Error(dataState.getError());
        }
        if (dataState.getSlipPayment() != null) {
            SlipGroupedPayment slipPayment = dataState.getSlipPayment();
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C28536R.string.title, Money.format$default(slipPayment.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            StringResource stringResourceInvoke2 = companion.invoke(C28536R.string.subtitle, new Object[0]);
            String accountNumber = slipPayment.getAccountNumber();
            Account account = dataState.getAccount();
            return new SlipGroupedPaymentDetailState3.Loaded(stringResourceInvoke, stringResourceInvoke2, accountNumber, (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle(), LocalDateFormatter.MEDIUM.format((LocalDateFormatter) slipPayment.getRecordDate()), dataState.getSlipPayment().getPayments(), slipPayment.getWithheldAmount(), slipPayment.getNetCredit());
        }
        return SlipGroupedPaymentDetailState3.Loading.INSTANCE;
    }
}
