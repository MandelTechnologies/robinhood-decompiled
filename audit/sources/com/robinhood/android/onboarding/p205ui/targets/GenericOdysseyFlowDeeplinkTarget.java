package com.robinhood.android.onboarding.p205ui.targets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericOdysseyFlowDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/targets/GenericOdysseyFlowDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "ODYSSEY_VERSION", "", "PATH", "THEME_OVERRIDE", "WORKFLOW_TYPE", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GenericOdysseyFlowDeeplinkTarget extends DeeplinkTarget4 {
    private static final String ODYSSEY_VERSION = "odysseyVersion";
    private static final String PATH = "path";
    private static final String THEME_OVERRIDE = "theme_override";
    private static final String WORKFLOW_TYPE = "workflow_type";
    public static final GenericOdysseyFlowDeeplinkTarget INSTANCE = new GenericOdysseyFlowDeeplinkTarget();
    public static final int $stable = 8;

    private GenericOdysseyFlowDeeplinkTarget() {
        super("odyssey", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter(ODYSSEY_VERSION);
        String queryParameter2 = uri.getQueryParameter(THEME_OVERRIDE);
        Boolean boolValueOf = queryParameter2 != null ? Boolean.valueOf(queryParameter2.equals("dark")) : null;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!CollectionsKt.listOf((Object[]) new String[]{ODYSSEY_VERSION, PATH, WORKFLOW_TYPE}).contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String queryParameter3 = uri.getQueryParameter(str);
            Tuples2 tuples2M3642to = queryParameter3 != null ? Tuples4.m3642to(str, queryParameter3) : null;
            if (tuples2M3642to != null) {
                arrayList2.add(tuples2M3642to);
            }
        }
        Map map = MapsKt.toMap(arrayList2);
        String queryParameter4 = uri.getQueryParameter(PATH);
        if (Intrinsics.areEqual(queryParameter4, "workflow")) {
            Navigator navigator = deeplinkContext.getNavigator();
            Context context = deeplinkContext.getContext();
            String queryParameter5 = uri.getQueryParameter(WORKFLOW_TYPE);
            if (queryParameter5 != null) {
                return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new GenericSdFlowIntentKey(queryParameter5, true, queryParameter, null, map, null, false, null, boolValueOf, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null), null, false, 12, null)};
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Intrinsics.areEqual(queryParameter4, "rhy_upgrade")) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new RhyUpgradeKey(null, null, 3, null), null, false, 12, null)};
        }
        if (queryParameter4 == null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new GenericSdFlowIntentKey(queryParameter4, false, queryParameter, null, map, null, false, null, boolValueOf, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, null), null, false, 12, null)};
    }
}
