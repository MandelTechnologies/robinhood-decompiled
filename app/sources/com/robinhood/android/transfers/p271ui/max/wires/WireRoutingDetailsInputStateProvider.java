package com.robinhood.android.transfers.p271ui.max.wires;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputStateProvider implements StateProvider<WireRoutingDetailsInputDataState, WireRoutingDetailsInputViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public WireRoutingDetailsInputViewState reduce(WireRoutingDetailsInputDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C30065R.string.wire_routing_number_input_title_outgoing_wire_v2, new Object[0]);
        StringResource stringResourceInvoke2 = companion.invoke(C30065R.string.wire_routing_number_input_detail_outgoing_wire_v3, new Object[0]);
        TransferAccount transferAccount = dataState.getTransferAccount();
        String accountName = transferAccount != null ? transferAccount.getAccountName() : null;
        String accountNumber = dataState.getAccountNumber();
        if (accountNumber == null) {
            accountNumber = "";
        }
        String routingNumber = dataState.getRoutingNumber();
        if (routingNumber == null) {
            routingNumber = "";
        }
        return new WireRoutingDetailsInputViewState(stringResourceInvoke, stringResourceInvoke2, accountName, accountNumber, routingNumber, dataState.isAgreementChecked(), dataState.isContinueButtonEnabled(), dataState.isValidating(), dataState.isLoading(), true, dataState.getMode(), WireRoutingDetailsInputStateProvider2.getConfirmModeDisplayInfo(dataState), null, 4096, null);
    }
}
