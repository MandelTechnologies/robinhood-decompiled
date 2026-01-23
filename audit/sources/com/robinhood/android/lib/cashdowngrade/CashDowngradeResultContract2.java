package com.robinhood.android.lib.cashdowngrade;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashDowngradeResultContract.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006¨\u0006\t"}, m3636d2 = {"createIntentForCashDowngrade", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "inputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "lib-cash-downgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.cashdowngrade.CashDowngradeResultContractKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CashDowngradeResultContract2 {
    public static final Intent createIntentForCashDowngrade(Navigator navigator, Context context, Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new ContactSupportFragmentKey.Sassy("brokerage.switch-to-cash-account", null, inputParams), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
    }
}
