package com.robinhood.android.gold.upgrade;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpgradeGoldDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/UpgradeGoldDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UpgradeGoldDeeplinkTarget extends DeeplinkTarget4 {
    public static final UpgradeGoldDeeplinkTarget INSTANCE = new UpgradeGoldDeeplinkTarget();
    public static final int $stable = 8;

    private UpgradeGoldDeeplinkTarget() {
        super("upgrade_gold", (RegionGate) GoldRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new NullPointerException("gold upgrade source should not be null"), true, null, 4, null);
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("feature");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("exit_deeplink");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("is_standalone");
        boolean z = queryParameter4 != null ? Boolean.parseBoolean(queryParameter4) : false;
        String queryParameter5 = deeplinkContext.getUri().getQueryParameter("sage_id");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(deeplinkContext.getMainIntent());
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (queryParameter == null) {
            queryParameter = "deeplink";
        }
        String str = queryParameter;
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        arrayList.add(Navigator.DefaultImpls.createIntent$default(navigator, context, new GoldUpgradeIntentKey(str, queryParameter2, queryParameter3, null, queryParameter5, false, 40, null), null, false, 12, null));
        return (Intent[]) arrayList.toArray(new Intent[0]);
    }
}
