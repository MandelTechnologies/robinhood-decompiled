package com.robinhood.android.recurring.lib.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.ForceIntro;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateRecurringInvestmentDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"getCreateRecurringInvestmentIntents", "", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Landroid/net/Uri;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recurring.lib.deeplink.targets.CreateRecurringInvestmentDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CreateRecurringInvestmentDeeplinkTarget2 {
    public static /* synthetic */ Intent[] getCreateRecurringInvestmentIntents$default(Navigator navigator, Context context, Uri uri, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
        if ((i & 4) != 0) {
            frequency = null;
        }
        return getCreateRecurringInvestmentIntents(navigator, context, uri, frequency);
    }

    public static final Intent[] getCreateRecurringInvestmentIntents(Navigator navigator, Context context, Uri data, ApiInvestmentSchedule.Frequency frequency) {
        ForceIntro forceIntro;
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String queryParameter = data.getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String str = queryParameter;
        String queryParameter2 = data.getQueryParameter("forceIntro");
        if (queryParameter2 == null || (forceIntro = (ForceIntro) ForceIntro.INSTANCE.fromServerValue(queryParameter2)) == null) {
            forceIntro = ForceIntro.FALSE;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new RecurringGenericCreationFragmentKey(new InvestmentTarget(null, null, ApiAssetType.EQUITY), RecurringContext.EntryPoint.COMMS, false, frequency, null, null, str, false, forceIntro, false, null, false, false, false, null, false, false, 130740, null), false, false, false, null, false, true, false, false, false, null, false, 7796, null)};
    }
}
