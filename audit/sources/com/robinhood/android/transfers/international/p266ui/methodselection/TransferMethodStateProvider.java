package com.robinhood.android.transfers.international.p266ui.methodselection;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.paymentinstruments.TransferType;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferMethodStateProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0002J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDataState;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState;", "<init>", "()V", "reduce", "dataState", "viewStateForDeposit", "viewStateForWithdraw", "paymentInstrument", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "currency", "Ljava/util/Currency;", "outgoingWireServiceFeeResponse", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferMethodStateProvider implements StateProvider<TransferMethodDataState, TransferMethodViewState> {
    public static final int $stable = 0;

    /* compiled from: TransferMethodStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.OUTGOING_WIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.SG_BANK_WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public TransferMethodViewState reduce(TransferMethodDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferMethodFragment.Args args = dataState.getArgs();
        if (args instanceof TransferMethodFragment.Args.Deposit) {
            return viewStateForDeposit();
        }
        if (!(args instanceof TransferMethodFragment.Args.Withdraw)) {
            throw new NoWhenBranchMatchedException();
        }
        TransferMethodFragment.Args.Withdraw withdraw = (TransferMethodFragment.Args.Withdraw) args;
        return viewStateForWithdraw(withdraw.getPaymentInstrument(), withdraw.getCurrency(), dataState.getOutgoingWireServiceFeeResponse());
    }

    private final TransferMethodViewState viewStateForDeposit() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new TransferMethodViewState.Loaded(companion.invoke(C30310R.string.select_deposit_method_title, new Object[0]), CollectionsKt.listOf((Object[]) new TransferMethodViewState.Row[]{TransferMethodViewState.Row.FastTransfer.INSTANCE, new TransferMethodViewState.Row.WireTransfer(companion.invoke(C30310R.string.select_deposit_method_wire_secondary, new Object[0]))}), true);
    }

    private final TransferMethodViewState viewStateForWithdraw(PaymentInstrumentV2 paymentInstrument, Currency currency, GetServiceFeeResponseDto outgoingWireServiceFeeResponse) {
        StringResource stringResourceInvoke;
        MoneyDto transfer_fee;
        Money money;
        PaymentInstrumentDetailsV2 details = paymentInstrument.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.paymentinstrument.db.PaymentInstrumentDetailsV2.I18nBankAccount");
        StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C30310R.string.select_withdraw_method_title, new Object[0]);
        List<TransferType> orDefault = ((PaymentInstrumentDetailsV2.I18nBankAccount) details).getTransferTypesByCurrency().getOrDefault(currency, CollectionsKt.emptyList());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = orDefault.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((TransferType) it.next()).ordinal()];
            Object wireTransfer = null;
            if (i == 1) {
                if (outgoingWireServiceFeeResponse != null && (transfer_fee = outgoingWireServiceFeeResponse.getTransfer_fee()) != null && (money = Money3.toMoney(transfer_fee)) != null) {
                    wireTransfer = Money.format$default(money, null, false, null, false, 0, null, false, null, true, false, 767, null);
                }
                if (wireTransfer != null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C30310R.string.select_withdraw_method_wire_secondary_with_fee, wireTransfer);
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C30310R.string.select_withdraw_method_wire_secondary, new Object[0]);
                }
                wireTransfer = new TransferMethodViewState.Row.WireTransfer(stringResourceInvoke);
            } else if (i == 2) {
                wireTransfer = TransferMethodViewState.Row.FastTransfer.INSTANCE;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (wireTransfer != null) {
                arrayList.add(wireTransfer);
            }
        }
        return new TransferMethodViewState.Loaded(stringResourceInvoke2, arrayList, false);
    }
}
