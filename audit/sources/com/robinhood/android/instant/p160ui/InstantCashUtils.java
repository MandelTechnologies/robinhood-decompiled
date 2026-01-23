package com.robinhood.android.instant.p160ui;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitives;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantCashUtils.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a.\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001¨\u0006\u0010"}, m3636d2 = {"getSwitchAccountSassyInputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "Lcom/robinhood/models/db/Account;", "source", "Lcom/robinhood/android/instant/ui/SwitchAccountSource;", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "createIntentForMarginUpgrade", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "inputParams", "feature-lib-instant_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instant.ui.InstantCashUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstantCashUtils {
    public static final Map<String, JsonPrimitive<?>> getSwitchAccountSassyInputParams(Account account, InstantCashConstants2 source) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return getSwitchAccountSassyInputParams(account.getAccountNumber(), account.getBrokerageAccountType(), source);
    }

    public static final Map<String, JsonPrimitive<?>> getSwitchAccountSassyInputParams(String accountNumber, BrokerageAccountType brokerageAccountType, InstantCashConstants2 source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("account_number", JsonPrimitives.toJsonPrimitive(accountNumber));
        linkedHashMap.put(InstantCashConstants.ACCOUNT_TYPE_KEY, JsonPrimitives.toJsonPrimitive(brokerageAccountType.toString()));
        linkedHashMap.put("source", JsonPrimitives.toJsonPrimitive(source.getValue()));
        return linkedHashMap;
    }

    public static final Intent createIntentForMarginUpgrade(Navigator navigator, Context context, Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new ContactSupportFragmentKey.Sassy(InstantCashConstants.SWITCH_TO_MARGIN_ACCOUNT_FLOW_ID, null, inputParams), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
    }
}
