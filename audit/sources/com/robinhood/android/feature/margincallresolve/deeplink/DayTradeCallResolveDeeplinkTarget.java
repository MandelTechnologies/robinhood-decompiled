package com.robinhood.android.feature.margincallresolve.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.margin.contracts.DayTradeCallResolveIntentKey;
import com.robinhood.android.margin.experiments.DayTradeCallRefactor;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: DayTradeCallResolveDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/deeplink/DayTradeCallResolveDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DayTradeCallResolveDeeplinkTarget extends DeeplinkTarget4 {
    public static final DayTradeCallResolveDeeplinkTarget INSTANCE = new DayTradeCallResolveDeeplinkTarget();
    public static final int $stable = 8;

    private DayTradeCallResolveDeeplinkTarget() {
        super("day_trade_call_resolve", false, false, false, true, false, null, 110, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        if (queryParameter != null && deeplinkContext.getExperimentState(DayTradeCallRefactor.INSTANCE)) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(MarginCallDeeplinkTargets.MARGIN_CALL_MICROGRAM_ID, null, 2, null), deeplinkContext.getUri().toString(), null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[]{deeplinkContext.getMainIntent(), Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DayTradeCallResolveIntentKey(queryParameter), null, false, 12, null)};
    }
}
