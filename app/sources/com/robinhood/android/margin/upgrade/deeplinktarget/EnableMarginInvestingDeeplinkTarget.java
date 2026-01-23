package com.robinhood.android.margin.upgrade.deeplinktarget;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnableMarginInvestingDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/deeplinktarget/EnableMarginInvestingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class EnableMarginInvestingDeeplinkTarget extends DeeplinkTarget4 {
    public static final EnableMarginInvestingDeeplinkTarget INSTANCE = new EnableMarginInvestingDeeplinkTarget();
    public static final int $stable = 8;

    private EnableMarginInvestingDeeplinkTarget() {
        super("enable_margin_investing", (RegionGate) LeveredMarginRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r3.equals("short_selling_nux") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3.equals("sell_to_open_order_check") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r3.equals("short_selling_marketing") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r12 = r12.getUri().getQueryParameter("instrument_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        r12 = com.robinhood.utils.extensions.StringsKt.toUuid(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        r4 = new com.robinhood.android.margin.contracts.EnableMarginInvestingKey2.ShortSelling(r12);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        EnableMarginInvestingKey2 enableMarginInvestingKey2;
        EnableMarginInvestingKey2 shortSelling;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        }
        String str = queryParameter;
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("account_number");
        if (str != null) {
            switch (str.hashCode()) {
                case -1593616652:
                    break;
                case -1407203866:
                    enableMarginInvestingKey2 = !str.equals("ACATS_IN") ? EnableMarginInvestingKey2.Default.INSTANCE : EnableMarginInvestingKey2.AcatsIn.INSTANCE;
                    shortSelling = enableMarginInvestingKey2;
                    break;
                case -495830215:
                    break;
                case 559947524:
                    if (!str.equals("PARTIAL_ACATS_IN")) {
                    }
                    shortSelling = enableMarginInvestingKey2;
                    break;
                case 1884449503:
                    break;
                case 1911864625:
                    if (str.equals("iat_flow")) {
                        enableMarginInvestingKey2 = EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE;
                    }
                    shortSelling = enableMarginInvestingKey2;
                    break;
                case 2003395203:
                    if (str.equals("gold_welcome")) {
                        enableMarginInvestingKey2 = EnableMarginInvestingKey2.GoldWelcome.INSTANCE;
                    }
                    shortSelling = enableMarginInvestingKey2;
                    break;
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new EnableMarginInvestingKey(queryParameter2, str, shortSelling, false, false, 24, null), null, false, 12, null)};
    }
}
