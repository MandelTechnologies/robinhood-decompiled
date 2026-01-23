package com.robinhood.android.transfers.p271ui.max.i18n;

import android.content.res.Resources;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.TransferEditScreenData;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.TransferReviewScreenData;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: InternationalTransferStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getNoExternalAccountRowText", "Lcom/robinhood/utils/resource/StringResource;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "accountButtonDisabled", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferStateProvider implements StateProvider<InternationalTransferDataState, InternationalTransferViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: InternationalTransferStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InternationalTransferStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InternationalTransferViewState reduce(InternationalTransferDataState dataState) throws Resources.NotFoundException {
        boolean z;
        StringResource noExternalAccountRowText;
        String displayTitle;
        StringResource stringResourceInvoke;
        StringResource stringResource;
        int i;
        int i2;
        String strConvertCurrency;
        Currency localCurrency;
        StringResource stringResourceInvoke2;
        TransferMode transferMode;
        TransferReviewScreenData transferReviewScreenData;
        ApiFxQuote fxQuote;
        ApiFxQuote fxQuote2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<TransferAccount> accounts2 = dataState.getAccounts();
        if (accounts2 != null) {
            List<TransferAccount> list = accounts2;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((TransferAccount) it.next()).isExternal()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
        }
        boolean z2 = !z;
        if (!dataState.getHasSelectedExternalAccount() && dataState.getAccounts() == null && dataState.getDefaultUkExternalTransferAccountId() == null) {
            noExternalAccountRowText = StringResource.INSTANCE.invoke("");
        } else {
            TransferAccount externalAccount = dataState.getExternalAccount();
            if (externalAccount == null || (displayTitle = externalAccount.getDisplayTitle()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(displayTitle)) == null) {
                noExternalAccountRowText = getNoExternalAccountRowText(dataState.getTransferDirection(), z2);
            } else {
                stringResource = stringResourceInvoke;
                StringResource.Companion companion = StringResource.INSTANCE;
                i = WhenMappings.$EnumSwitchMapping$0[dataState.getTransferDirection().ordinal()];
                if (i != 1) {
                    i2 = C30065R.string.gated_instant_transfer_from;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C30065R.string.transfer_to;
                }
                StringResource stringResourceInvoke3 = companion.invoke(i2, new Object[0]);
                TransferMode mode = dataState.getMode();
                TransferMode transferMode2 = TransferMode.EDIT;
                strConvertCurrency = null;
                TransferEditScreenData transferEditScreenData = mode != transferMode2 ? new TransferEditScreenData(dataState.getAmount().isPositive()) : null;
                TransferDirection transferDirection = dataState.getTransferDirection();
                CountryCode.Supported locality = dataState.getLocality();
                localCurrency = locality == null ? Locality2.getLocalCurrency(locality) : null;
                if (localCurrency != null) {
                    ApiFxQuote fxQuote3 = dataState.getFxQuote();
                    if (fxQuote3 != null) {
                        BigDecimal ONE = BigDecimal.ONE;
                        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                        Money moneyConvertAmount = InternationalTransferCurrencyUtils.convertAmount(localCurrency, transferDirection, new Money(localCurrency, ONE), fxQuote3);
                        stringResourceInvoke2 = companion.invoke(C30065R.string.default_fx_rate_symbol, InternationalTransferCurrencyUtils.getSymbolString(localCurrency) + Constants.SdidMigrationStatusCodes.ALREADY_SDID, "$" + moneyConvertAmount.getDecimalValue());
                        if (stringResourceInvoke2 == null) {
                            stringResourceInvoke2 = companion.invoke(C30065R.string.fx_unavailable, new Object[0]);
                        }
                        if (stringResourceInvoke2 == null) {
                        }
                    }
                } else {
                    stringResourceInvoke2 = companion.invoke(C30065R.string.fx_unavailable, new Object[0]);
                }
                Money moneyConvertAmount2 = (localCurrency != null || (fxQuote2 = dataState.getFxQuote()) == null) ? null : InternationalTransferCurrencyUtils.convertAmount(localCurrency, transferDirection, dataState.getAmount(), fxQuote2);
                if (dataState.getMode() != TransferMode.REVIEW) {
                    StringResource stringResource2 = stringResourceInvoke2;
                    Money amount = dataState.getAmount();
                    Money amount2 = moneyConvertAmount2 == null ? dataState.getAmount() : moneyConvertAmount2;
                    Instant lastUpdatedFxQuoteTime = dataState.getLastUpdatedFxQuoteTime();
                    String str = lastUpdatedFxQuoteTime != null ? InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) lastUpdatedFxQuoteTime) : null;
                    ApiDisclosureUIResponse disclosureResponse = dataState.getDisclosureResponse();
                    UIComponent<GenericAction> disclosure_text = disclosureResponse != null ? disclosureResponse.getDisclosure_text() : null;
                    boolean z3 = moneyConvertAmount2 != null || dataState.getMakingTransfer();
                    transferMode = transferMode2;
                    transferReviewScreenData = new TransferReviewScreenData(stringResource2, amount, amount2, str, stringResourceInvoke3, stringResource, disclosure_text, z3, dataState.getMakingTransfer(), z);
                } else {
                    transferMode = transferMode2;
                    transferReviewScreenData = null;
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, dataState.getEventContext(), null, null, 55, null);
                String inputChars = dataState.getInputChars();
                if (dataState.getMode() == transferMode && dataState.getLocality() != null && (fxQuote = dataState.getFxQuote()) != null) {
                    strConvertCurrency = InternationalTransferStateProvider2.convertCurrency(Locality2.getLocalCurrency(dataState.getLocality()), dataState.getTransferDirection(), dataState.getAmount(), fxQuote, this.resources);
                }
                return new InternationalTransferViewState(userInteractionEventDescriptor, new SwitchableTickerInputViewData(inputChars, strConvertCurrency, dataState.getAnimateInput(), dataState.getDisplaySwitcher()), transferEditScreenData, transferReviewScreenData, dataState.getTransferSummaryRequest(), dataState.getTransferSummaryState(), InternationalTransferStateProvider2.getToolbarTitleRes(dataState));
            }
        }
        stringResource = noExternalAccountRowText;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        i = WhenMappings.$EnumSwitchMapping$0[dataState.getTransferDirection().ordinal()];
        if (i != 1) {
        }
        StringResource stringResourceInvoke32 = companion2.invoke(i2, new Object[0]);
        TransferMode mode2 = dataState.getMode();
        TransferMode transferMode22 = TransferMode.EDIT;
        strConvertCurrency = null;
        if (mode2 != transferMode22) {
        }
        TransferDirection transferDirection2 = dataState.getTransferDirection();
        CountryCode.Supported locality2 = dataState.getLocality();
        if (locality2 == null) {
        }
        if (localCurrency != null) {
        }
        if (localCurrency != null) {
        }
        if (dataState.getMode() != TransferMode.REVIEW) {
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, null, null, dataState.getEventContext(), null, null, 55, null);
        String inputChars2 = dataState.getInputChars();
        if (dataState.getMode() == transferMode) {
            strConvertCurrency = InternationalTransferStateProvider2.convertCurrency(Locality2.getLocalCurrency(dataState.getLocality()), dataState.getTransferDirection(), dataState.getAmount(), fxQuote, this.resources);
        }
        return new InternationalTransferViewState(userInteractionEventDescriptor2, new SwitchableTickerInputViewData(inputChars2, strConvertCurrency, dataState.getAnimateInput(), dataState.getDisplaySwitcher()), transferEditScreenData, transferReviewScreenData, dataState.getTransferSummaryRequest(), dataState.getTransferSummaryState(), InternationalTransferStateProvider2.getToolbarTitleRes(dataState));
    }

    private final StringResource getNoExternalAccountRowText(TransferDirection transferDirection, boolean accountButtonDisabled) {
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            if (accountButtonDisabled) {
                return StringResource.INSTANCE.invoke(C30065R.string.uk_initiate_deposit_prompt, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C30065R.string.new_bank_account, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (accountButtonDisabled) {
            return StringResource.INSTANCE.invoke(C30065R.string.uk_initiate_withdraw_prompt, new Object[0]);
        }
        return StringResource.INSTANCE.invoke("");
    }
}
