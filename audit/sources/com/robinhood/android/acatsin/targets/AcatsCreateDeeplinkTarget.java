package com.robinhood.android.acatsin.targets;

import android.content.Intent;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsCreateDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/targets/AcatsCreateDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsCreateDeeplinkTarget extends DeeplinkTarget4 {
    public static final AcatsCreateDeeplinkTarget INSTANCE = new AcatsCreateDeeplinkTarget();
    public static final int $stable = 8;

    private AcatsCreateDeeplinkTarget() {
        super("acats_create", (RegionGate) AcatsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        boolean z;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = "unknown";
        }
        String str = queryParameter;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("skip_intro");
        boolean z2 = true;
        if (queryParameter2 == null || !Boolean.parseBoolean(queryParameter2)) {
            z = true;
            z2 = false;
        } else {
            z = true;
        }
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("force_bonus_intro");
        boolean z3 = (queryParameter3 == null || Boolean.parseBoolean(queryParameter3) != z) ? false : z;
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter5 = deeplinkContext.getUri().getQueryParameter("skip_promo_screen");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AcatsIn(str, z2, z3, queryParameter4, (queryParameter5 == null || Boolean.parseBoolean(queryParameter5) != z) ? false : z), null, false, 12, null)};
    }
}
