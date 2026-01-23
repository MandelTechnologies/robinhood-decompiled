package com.robinhood.android.iav.p154ui;

import com.robinhood.android.iav.C18470R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFee;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoVS;", "<init>", "()V", "reduce", "dataState", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.PlaidConnectionStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class PlaidConnectionDuxo9 implements StateProvider<PlaidConnectionDuxoDS, PlaidConnectionDuxoVS> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PlaidConnectionDuxoVS reduce(PlaidConnectionDuxoDS dataState) {
        Tuples2 tuples2M3642to;
        boolean z;
        ApiServiceFee push;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiServiceFeeParams disclosureResponse = dataState.getDisclosureResponse();
        BigDecimal fee_rate = (disclosureResponse == null || (push = disclosureResponse.getPush()) == null) ? null : push.getFee_rate();
        if (fee_rate != null) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C18470R.string.fund_account_disclosure), fee_rate);
        } else {
            tuples2M3642to = Tuples4.m3642to(null, null);
        }
        Integer num = (Integer) tuples2M3642to.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2M3642to.component2();
        boolean z2 = true;
        if (dataState.getShowPopup() && dataState.getHasUserExitedPlaidYet()) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        return new PlaidConnectionDuxoVS(z2, (dataState.getShowPopup() || !dataState.getHasUserExitedPlaidYet()) ? false : z, num, bigDecimal, dataState.getPopupWasShown(), dataState.getIavAccountAccessToken(), dataState.getIavAccount(), dataState.getPlaidIavMetadata(), dataState.getHasShownGoldNativeFundingUpsell());
    }
}
