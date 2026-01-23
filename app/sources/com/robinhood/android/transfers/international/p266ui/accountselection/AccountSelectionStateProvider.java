package com.robinhood.android.transfers.international.p266ui.accountselection;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.currencybalance.api.CurrencyBalance;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionViewState;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.PaymentInstrument2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDataState;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "reduceInternal", "reduceExternal", "toRow", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Row;", "Lcom/robinhood/android/models/currencybalance/api/CurrencyBalance;", "accountNumber", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AccountSelectionStateProvider implements StateProvider<AccountSelectionDataState, AccountSelectionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: AccountSelectionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSelectionFragment.Args.Type.values().length];
            try {
                iArr[AccountSelectionFragment.Args.Type.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSelectionFragment.Args.Type.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AccountSelectionStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AccountSelectionViewState reduce(AccountSelectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getArgs().getType().ordinal()];
        if (i == 1) {
            return reduceInternal(dataState);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return reduceExternal(dataState);
    }

    private final AccountSelectionViewState reduceInternal(AccountSelectionDataState dataState) throws Resources.NotFoundException {
        String accountNumber = dataState.getAccountNumber();
        List<CurrencyBalance> currencyBalances = dataState.getCurrencyBalances();
        if (accountNumber == null || currencyBalances == null) {
            return AccountSelectionViewState.Loading.INSTANCE;
        }
        String string2 = this.resources.getString(C30310R.string.internal_account_selection_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        List listSortedWith = CollectionsKt.sortedWith(currencyBalances, new Comparator() { // from class: com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionStateProvider$reduceInternal$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Currency currency = ((CurrencyBalance) t).getCurrency();
                Currency currency2 = Currencies.USD;
                return ComparisonsKt.compareValues(Integer.valueOf(!Intrinsics.areEqual(currency, currency2) ? 1 : 0), Integer.valueOf(!Intrinsics.areEqual(((CurrencyBalance) t2).getCurrency(), currency2) ? 1 : 0));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(toRow((CurrencyBalance) it.next(), accountNumber));
        }
        return new AccountSelectionViewState.Loaded(string2, arrayList);
    }

    private final AccountSelectionViewState reduceExternal(AccountSelectionDataState dataState) throws Resources.NotFoundException {
        String currencyCode;
        List<PaymentInstrumentV2> bankAccountInstruments = dataState.getBankAccountInstruments();
        if (bankAccountInstruments == null) {
            return AccountSelectionViewState.Loading.INSTANCE;
        }
        String string2 = this.resources.getString(C30310R.string.external_account_selection_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ArrayList arrayList = new ArrayList();
        for (PaymentInstrumentV2 paymentInstrumentV2 : bankAccountInstruments) {
            PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
            Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.paymentinstrument.db.PaymentInstrumentDetailsV2.I18nBankAccount");
            PaymentInstrumentDetailsV2.I18nBankAccount i18nBankAccount = (PaymentInstrumentDetailsV2.I18nBankAccount) details;
            List<Currency> currencies = i18nBankAccount.getCurrencies();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(currencies, 10));
            for (Currency currency : currencies) {
                BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 6, null);
                String accountNameAndNumber = PaymentInstrument2.getAccountNameAndNumber(i18nBankAccount);
                Integer name = Currency2.getName(currency);
                if (name == null || (currencyCode = this.resources.getString(name.intValue())) == null) {
                    currencyCode = currency.getCurrencyCode();
                }
                arrayList2.add(new AccountSelectionViewState.Row(new BentoBaseRowState((BentoBaseRowState.Start) icon, accountNameAndNumber, currencyCode, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null), new MultiCurrencyAccount.External(paymentInstrumentV2, currency)));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return new AccountSelectionViewState.Loaded(string2, arrayList);
    }

    private final AccountSelectionViewState.Row toRow(CurrencyBalance currencyBalance, String str) {
        String currencyCode;
        boolean zIsPositive = BigDecimals7.isPositive(currencyBalance.getWithdrawableAmount());
        BentoBaseRowState.Start.FlagIcon flagIcon = new BentoBaseRowState.Start.FlagIcon(Currency2.getCountryCode(currencyBalance.getCurrency()));
        Integer name = Currency2.getName(currencyBalance.getCurrency());
        if (name == null || (currencyCode = this.resources.getString(name.intValue())) == null) {
            currencyCode = currencyBalance.getCurrency().getCurrencyCode();
        }
        String str2 = currencyCode;
        Intrinsics.checkNotNull(str2);
        return new AccountSelectionViewState.Row(new BentoBaseRowState((BentoBaseRowState.Start) flagIcon, str2, Currency2.formatWithSymbolPrefix(currencyBalance.getCurrency(), currencyBalance.getWithdrawableAmount()), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, zIsPositive, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (DefaultConstructorMarker) null), new MultiCurrencyAccount.Internal(str, currencyBalance));
    }
}
