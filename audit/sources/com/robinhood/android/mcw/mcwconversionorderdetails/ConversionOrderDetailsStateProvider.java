package com.robinhood.android.mcw.mcwconversionorderdetails;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.mcw.mcwconversionorderdetails.models.ConversionOrderDetailsDataState;
import com.robinhood.android.mcw.mcwconversionorderdetails.models.ConversionOrderDetailsViewState;
import com.robinhood.android.mcw.mcwconversionorderdetails.models.DisplayRow;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p325fx.p326db.FxExecution;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.ZonedDateTime;

/* compiled from: ConversionOrderDetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002J\f\u0010\t\u001a\u00020\u0007*\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/models/ConversionOrderDetailsDataState;", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/models/ConversionOrderDetailsViewState;", "<init>", "()V", "statusMessage", "", "Lcom/robinhood/shared/models/history/shared/OrderState;", "formattedWithCurrencyCode", "Lcom/robinhood/models/util/Money;", "reduce", "dataState", "feature-mcw-conversion-order-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ConversionOrderDetailsStateProvider implements StateProvider<ConversionOrderDetailsDataState, ConversionOrderDetailsViewState> {
    public static final int $stable = 0;

    /* compiled from: ConversionOrderDetailsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderState.values().length];
            try {
                iArr[OrderState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderState.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderState.FILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderState.CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderState.REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderState.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String statusMessage(OrderState orderState) {
        switch (WhenMappings.$EnumSwitchMapping$0[orderState.ordinal()]) {
            case 1:
                return "Queued";
            case 2:
                return "Pending";
            case 3:
                return "Completed";
            case 4:
                return "Cancelled";
            case 5:
                return "Rejected";
            case 6:
                return "Failed";
            default:
                List listSplit$default = StringsKt.split$default((CharSequence) orderState.name(), new char[]{'_'}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(listSplit$default.size());
                int size = listSplit$default.size();
                for (int i = 0; i < size; i++) {
                    String lowerCase = ((String) listSplit$default.get(i)).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase.length() > 0) {
                        char upperCase = Character.toUpperCase(lowerCase.charAt(0));
                        String strSubstring = lowerCase.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        lowerCase = upperCase + strSubstring;
                    }
                    arrayList.add(lowerCase);
                }
                return CollectionsKt.joinToString$default(arrayList, PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
        }
    }

    private final String formattedWithCurrencyCode(Money money) {
        return Money.format$default(money, null, false, null, false, 2, 2, false, null, false, false, 967, null) + PlaceholderUtils.XXShortPlaceholderText + money.getCurrency().getCurrencyCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConversionOrderDetailsViewState reduce(ConversionOrderDetailsDataState dataState) {
        String str;
        Currency currency;
        String str2;
        StringResource stringResourceInvoke;
        int i;
        String currencyCode;
        BigDecimal fxFeeInBps;
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getOrder() == null || dataState.isFxFeeEnabled() == null) {
            return ConversionOrderDetailsViewState.Loading.INSTANCE;
        }
        Money amountFrom = dataState.getOrder().getAmountFrom();
        Money amountTo = dataState.getOrder().getAmountTo();
        BigDecimal weightedAvgConversionRate = dataState.getOrder().getWeightedAvgConversionRate();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = weightedAvgConversionRate.setScale(4, roundingMode);
        FxExecution fxExecution = (FxExecution) CollectionsKt.getOrNull(dataState.getOrder().getFxExecutions(), 0);
        if (fxExecution == null || (fxFeeInBps = fxExecution.getFxFeeInBps()) == null || (bigDecimalDivide = fxFeeInBps.divide(new BigDecimal("10000"), 4, roundingMode)) == null || (str = FormatsLocalized.getPercentFormat().format(bigDecimalDivide)) == null || !dataState.isFxFeeEnabled().booleanValue()) {
            str = null;
        }
        OrderState state = dataState.getOrder().getState();
        OrderState orderState = OrderState.FILLED;
        Money money = state == orderState ? amountTo : amountFrom;
        Currency currency2 = money.getCurrency();
        Currency currency3 = Currencies.USD;
        if (Intrinsics.areEqual(currency2, currency3)) {
            currency = currency3;
            str2 = Money.format$default(money, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
        } else {
            currency = currency3;
            str2 = formattedWithCurrencyCode(money);
        }
        if (dataState.getOrder().getState() == orderState) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C21759R.string.subtitle_completed;
            Currency currency4 = amountTo.getCurrency();
            if (Intrinsics.areEqual(currency4, currency)) {
                currencyCode = "US dollar";
            } else if (Intrinsics.areEqual(currency4, Currencies.SGD)) {
                currencyCode = "Singapore dollar";
            } else {
                currencyCode = Intrinsics.areEqual(currency4, Currencies.GBP) ? "pound sterling" : currency4.getCurrencyCode();
            }
            stringResourceInvoke = companion.invoke(i2, currencyCode);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21759R.string.subtitle_not_completed, amountFrom.getCurrency().getCurrencyCode(), amountTo.getCurrency().getCurrencyCode());
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        List listMutableListOf = CollectionsKt.mutableListOf(new DisplayRow(companion2.invoke(C21759R.string.status_label, new Object[0]), statusMessage(dataState.getOrder().getState()), null));
        if (dataState.getOrder().getState() == orderState) {
            DisplayRow displayRow = new DisplayRow(companion2.invoke(C11048R.string.general_label_from, new Object[0]), formattedWithCurrencyCode(amountFrom), null);
            DisplayRow displayRow2 = new DisplayRow(companion2.invoke(C11048R.string.general_label_to, new Object[0]), formattedWithCurrencyCode(amountTo), null);
            StringResource stringResourceInvoke2 = companion2.invoke(C21759R.string.exchange_rate_label, new Object[0]);
            String currencyCode2 = amountFrom.getCurrency().getCurrencyCode();
            String plainString = scale.toPlainString();
            String currencyCode3 = amountTo.getCurrency().getCurrencyCode();
            if (str != null) {
                String str3 = ", includes a " + str + " fee";
                if (str3 == null) {
                    str3 = "";
                }
                listMutableListOf.addAll(CollectionsKt.listOf((Object[]) new DisplayRow[]{displayRow, displayRow2, new DisplayRow(stringResourceInvoke2, "1 " + currencyCode2 + " = " + plainString + PlaceholderUtils.XXShortPlaceholderText + currencyCode3 + str3, null)}));
                i = 0;
            }
        } else {
            i = 0;
            listMutableListOf.add(new DisplayRow(companion2.invoke(C21759R.string.entered_amount_label, new Object[0]), formattedWithCurrencyCode(amountFrom), null));
        }
        StringResource stringResourceInvoke3 = companion2.invoke(C21759R.string.created_at_label, new Object[i]);
        ZonedDateTime zonedDateTime$default = Instants.toZonedDateTime$default(dataState.getOrder().getCreatedAt(), null, 1, null);
        ZonedDateTimeFormatter zonedDateTimeFormatter = ZonedDateTimeFormatter.LONG_DATE_TIME_WITH_ZONE;
        listMutableListOf.addAll(CollectionsKt.listOf((Object[]) new DisplayRow[]{new DisplayRow(stringResourceInvoke3, zonedDateTimeFormatter.format((ZonedDateTimeFormatter) zonedDateTime$default), null), new DisplayRow(companion2.invoke(C21759R.string.updated_at_label, new Object[i]), zonedDateTimeFormatter.format((ZonedDateTimeFormatter) Instants.toZonedDateTime$default(dataState.getOrder().getUpdatedAt(), null, 1, null)), null)}));
        return new ConversionOrderDetailsViewState.Loaded(str2, stringResourceInvoke, listMutableListOf);
    }
}
