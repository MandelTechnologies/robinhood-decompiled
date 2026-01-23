package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountInputStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputViewState;", "<init>", "()V", "reduce", "dataState", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AmountInputStateProvider implements StateProvider<AmountInputDataState, AmountInputViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AmountInputViewState reduce(AmountInputDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new AmountInputViewState(StringResource.INSTANCE.invoke(C30310R.string.withdraw, new Object[0]), TransferType3.getStringResource(dataState.getTransferType()), AmountInputStateProvider2.getInputViewState(dataState), AmountInputStateProvider2.isContinueButtonEnabled(dataState), dataState.isValidating());
    }
}
