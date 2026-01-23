package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.C31333R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.Currency;
import com.robinhood.transfers.api.Direction;
import com.robinhood.transfers.api.p405uk.ApiPaymentTransferFxConversion;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: UkBankTransferDetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UkBankTransferDetailsStateProvider implements StateProvider<UkBankTransferDetailsDataState, UkBankTransferDetailsViewState> {
    public static final int $stable = 0;

    /* compiled from: UkBankTransferDetailsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Currency.values().length];
            try {
                iArr2[Currency.GBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Currency.USD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Currency.SGD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Currency.EUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Currency.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public UkBankTransferDetailsViewState reduce(UkBankTransferDetailsDataState dataState) {
        int i;
        int i2;
        StringResource stringResourceInvoke;
        int i3;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PaymentTransfer transfer = dataState.getTransfer();
        PaymentInstrumentV2 paymentInstrument = dataState.getPaymentInstrument();
        if (transfer != null && paymentInstrument != null) {
            String displayTitle = UkBankTransferDetailsStateProvider2.getDisplayTitle(dataState.getPaymentInstrument());
            ArrayList arrayList = new ArrayList();
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C30065R.string.uk_transfer_status_header, new Object[0]), companion.invoke(UtilsKt.getLabelResId(dataState.getTransfer().getState()), new Object[0]), null, 4, null));
            Direction direction = dataState.getTransfer().getDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i4 = iArr[direction.ordinal()];
            if (i4 == 1) {
                if (displayTitle != null && displayTitle.length() > 0) {
                    arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C11048R.string.general_label_from, new Object[0]), companion.invoke(displayTitle), null, 4, null));
                }
                arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), companion.invoke(C8179R.string.account_type_individual, new Object[0]), null, 4, null));
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown direction!");
                }
                arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C11048R.string.general_label_from, new Object[0]), companion.invoke(C8179R.string.account_type_individual, new Object[0]), null, 4, null));
                if (displayTitle != null && displayTitle.length() > 0) {
                    arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), companion.invoke(displayTitle), null, 4, null));
                }
            }
            ApiPaymentTransferDetails details = dataState.getTransfer().getDetails();
            Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiUkBankTransfer");
            ApiPaymentTransferDetails.ApiUkBankTransfer apiUkBankTransfer = (ApiPaymentTransferDetails.ApiUkBankTransfer) details;
            ApiPaymentTransferFxConversion fx = apiUkBankTransfer.getFx();
            BigDecimal actual_target_fx_rate = fx.getActual_target_fx_rate();
            if (actual_target_fx_rate == null) {
                actual_target_fx_rate = fx.getTarget_fx_rate();
            }
            Currency currency = dataState.getTransfer().getCurrency();
            int i5 = WhenMappings.$EnumSwitchMapping$1[currency.ordinal()];
            if (i5 == 1) {
                i = C30065R.string.uk_amount_in_gbp;
            } else {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 4 && i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(("Unsupported currency type for UK transfers: " + currency).toString());
                }
                i = C30065R.string.uk_amount_in_usd;
            }
            arrayList.add(new UkBankTransferDetailsRow(companion.invoke(i, new Object[0]), companion.invoke(Money.format$default(Money3.toMoney(apiUkBankTransfer.getFx().getBase_amount(), apiUkBankTransfer.getFx().getBase_currency()), null, false, null, false, 0, null, false, null, false, false, 1023, null)), null, 4, null));
            StringResource stringResourceInvoke2 = companion.invoke(C30065R.string.uk_exchange_rate, new Object[0]);
            String string2 = actual_target_fx_rate.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(new UkBankTransferDetailsRow(stringResourceInvoke2, companion.invoke(string2), new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16)));
            StringResource stringResourceInvoke3 = companion.invoke(C30065R.string.received_at_label, new Object[0]);
            Instant createdAt = dataState.getTransfer().getCreatedAt();
            InstantFormatter instantFormatter = InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE;
            arrayList.add(new UkBankTransferDetailsRow(stringResourceInvoke3, companion.invoke(instantFormatter.format((InstantFormatter) createdAt)), null, 4, null));
            Instant updatedAt = dataState.getTransfer().getUpdatedAt();
            if (updatedAt != null) {
                arrayList.add(new UkBankTransferDetailsRow(companion.invoke(C31333R.string.last_updated_label, new Object[0]), companion.invoke(instantFormatter.format((InstantFormatter) updatedAt)), null, 4, null));
            }
            String str = AdjustmentWithFxState2.getAdjustmentWithFxState(dataState.getTransfer()).format();
            if (displayTitle == null || displayTitle.length() == 0) {
                int i6 = iArr[dataState.getTransfer().getDirection().ordinal()];
                if (i6 == 1) {
                    i2 = C8331R.string.transfer_deposit_label;
                } else {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Unknown direction!");
                    }
                    i2 = C8331R.string.transfer_withdrawal_label;
                }
                stringResourceInvoke = companion.invoke(i2, new Object[0]);
            } else {
                int i7 = iArr[dataState.getTransfer().getDirection().ordinal()];
                if (i7 == 1) {
                    i3 = C41787R.string.minerva_transfer_description_deposit_from;
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Unknown direction!");
                    }
                    i3 = C41787R.string.minerva_transfer_description_withdrawal_to;
                }
                stringResourceInvoke = companion.invoke(i3, displayTitle);
            }
            return new UkBankTransferDetailsViewState(str, stringResourceInvoke, arrayList, IsUkBankTransferCancelable.isUkBankTransferCancelable(transfer, dataState.isInCancelableUkTransferExperiment()), dataState.isCancelRequestInFlight());
        }
        return UkBankTransferDetailsViewState.INSTANCE.getLoadingMock();
    }
}
