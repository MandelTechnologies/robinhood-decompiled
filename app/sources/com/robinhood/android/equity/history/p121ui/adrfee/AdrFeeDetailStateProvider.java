package com.robinhood.android.equity.history.p121ui.adrfee;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiAdrFee;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AdrFeeSalesTax;
import com.robinhood.models.p355ui.UiAdrFee;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: AdrFeeDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDataState;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AdrFeeDetailStateProvider implements StateProvider<AdrFeeDetailDataState, AdrFeeDetailViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AdrFeeDetailViewState reduce(AdrFeeDetailDataState dataState) {
        AdrFeeDetailViewState.FeeViewState feeViewState;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        ImmutableList immutableList;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiAdrFee uiAdrFee = dataState.getUiAdrFee();
        StringResource title = null;
        if (uiAdrFee != null) {
            Instant paidAt = uiAdrFee.getAdrFee().getPaidAt();
            String str = paidAt != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) paidAt) : null;
            String str2 = LocalDateFormatter.MEDIUM.format(uiAdrFee.getAdrFee().getRecordDate());
            String str3 = Money.format$default(uiAdrFee.getAdrFee().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            String str4 = Formats.getShareQuantityFormat().format(uiAdrFee.getAdrFee().getPosition());
            String str5 = Money.format$default(uiAdrFee.getAdrFee().getRate(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            ApiAdrFee.State state = uiAdrFee.getAdrFee().getState();
            List<AdrFeeSalesTax> salesTaxes = uiAdrFee.getAdrFee().getSalesTaxes();
            if (salesTaxes != null) {
                List<AdrFeeSalesTax> list = salesTaxes;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (AdrFeeSalesTax adrFeeSalesTax : list) {
                    arrayList.add(new AdrFeeDetailViewState.SalesTaxItem(adrFeeSalesTax.getDisplayName(), adrFeeSalesTax.getFee()));
                }
                immutableList = extensions2.toImmutableList(arrayList);
            } else {
                immutableList = null;
            }
            feeViewState = new AdrFeeDetailViewState.FeeViewState(str, str2, str3, str4, str5, state, immutableList);
        } else {
            feeViewState = null;
        }
        UiAdrFee uiAdrFee2 = dataState.getUiAdrFee();
        String instrumentSymbol = uiAdrFee2 != null ? uiAdrFee2.getInstrumentSymbol() : null;
        UiAdrFee uiAdrFee3 = dataState.getUiAdrFee();
        String instrumentName = uiAdrFee3 != null ? uiAdrFee3.getInstrumentName() : null;
        Account account = dataState.getAccount();
        if (account != null && (displayName = AccountDisplayNames.getDisplayName(account)) != null && (withAccount = displayName.getWithAccount()) != null) {
            title = withAccount.getTitle();
        }
        return new AdrFeeDetailViewState(feeViewState, instrumentSymbol, instrumentName, title, dataState.getDisclosureMarkdown());
    }
}
