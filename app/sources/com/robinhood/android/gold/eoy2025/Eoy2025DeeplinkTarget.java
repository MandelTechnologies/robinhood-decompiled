package com.robinhood.android.gold.eoy2025;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayExperiment;
import com.robinhood.android.gold.contracts.Eoy2025IntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Eoy2025DeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025DeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class Eoy2025DeeplinkTarget extends DeeplinkTarget4 {
    public static final Eoy2025DeeplinkTarget INSTANCE = new Eoy2025DeeplinkTarget();
    public static final int $stable = 8;

    private Eoy2025DeeplinkTarget() {
        super("holiday_hub", (ExperimentDeclaration) EoyGiveawayExperiment.INSTANCE, false, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("box");
        return new Intent[]{deeplinkContext.getMainIntent(), Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new Eoy2025IntentKey(queryParameter, queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null), null, false, 12, null)};
    }
}
