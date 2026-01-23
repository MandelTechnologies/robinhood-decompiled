package com.robinhood.android.transfers.contracts;

import android.content.Intent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputActivityResultContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputActivityIntentKey;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "parseResult", "resultCode", "", "intent", "Landroid/content/Intent;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputActivityResultContract extends NavigationActivityResultContract<WireRoutingDetailsInputActivityIntentKey, WireRoutingDetailsInputActivityResultContract3> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireRoutingDetailsInputActivityResultContract(Function0<? extends Navigator> navigatorDelegate) {
        super(navigatorDelegate);
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
    }

    @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract, androidx.view.result.contract.ActivityResultContract
    public WireRoutingDetailsInputActivityResultContract3 parseResult(int resultCode, Intent intent) {
        if (resultCode != -1) {
            return WireRoutingDetailsInputActivityResultContract3.Failure.INSTANCE;
        }
        if (intent != null) {
            return (WireRoutingDetailsInputActivityResultContract3) intent.getParcelableExtra(WireRoutingDetailsInputActivityResultContract2.EXTRA_WIRE_ROUTING_NUMBER_INPUT_RESULT);
        }
        return null;
    }
}
