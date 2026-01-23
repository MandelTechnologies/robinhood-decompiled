package com.robinhood.android.navigation.app.extensions;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.HelpCenterWebViewFragmentKey;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigators.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a(\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b¨\u0006\u0013"}, m3636d2 = {"createContactSupportTriageIntent", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "initialState", "Lcom/robinhood/models/api/PathfinderInitialState;", "topicId", "", "inquiryId", "Ljava/util/UUID;", "unknownParams", "", "requireAuthentication", "", "showContactSupportTriageFragment", "", "showHelpCenterWebViewFragment", "url", "lib-navigation-app_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.app.extensions.NavigatorsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Navigators3 {
    public static /* synthetic */ Intent createContactSupportTriageIntent$default(Navigator navigator, Context context, PathfinderInitialState pathfinderInitialState, String str, UUID uuid, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            pathfinderInitialState = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        if ((i & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 32) != 0) {
            z = false;
        }
        return createContactSupportTriageIntent(navigator, context, pathfinderInitialState, str, uuid, map, z);
    }

    public static final Intent createContactSupportTriageIntent(Navigator navigator, Context context, PathfinderInitialState pathfinderInitialState, String str, UUID uuid, Map<String, String> unknownParams, boolean z) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownParams, "unknownParams");
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new ContactSupportFragmentKey.TriageFlow(pathfinderInitialState, str, uuid, null, unknownParams, 8, null), false, false, false, null, false, true, false, true, z, null, false, 6260, null);
    }

    public static final void showContactSupportTriageFragment(Navigator navigator, Context context, PathfinderInitialState initialState) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        context.startActivity(createContactSupportTriageIntent$default(navigator, context, initialState, null, null, null, false, 60, null));
    }

    public static /* synthetic */ void showContactSupportTriageFragment$default(Navigator navigator, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        showContactSupportTriageFragment(navigator, context, str, z);
    }

    public static final void showContactSupportTriageFragment(Navigator navigator, Context context, String str, boolean z) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(createContactSupportTriageIntent$default(navigator, context, null, str, null, null, z, 26, null));
    }

    public static final void showHelpCenterWebViewFragment(Navigator navigator, Context context, String url) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new HelpCenterWebViewFragmentKey(url), false, false, true, false, null, false, null, null, 996, null);
    }
}
