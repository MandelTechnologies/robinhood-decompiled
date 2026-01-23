package com.robinhood.android.support;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.shared.user.contracts.auth.ReLogin;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContactSupportDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"getContactSupportIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "requireAuthentication", "", "(Lcom/robinhood/android/deeplink/DeeplinkContext;Z)[Landroid/content/Intent;", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.ContactSupportDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ContactSupportDeeplinkTarget2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Intent[] getContactSupportIntent(DeeplinkTarget2 deeplinkContext, boolean z) {
        PathfinderInitialState pathfinderInitialState;
        String str;
        UUID uuid;
        String str2;
        boolean z2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = deeplinkContext.getUri().getQueryParameterNames();
        if (queryParameterNames != null) {
            String str3 = null;
            UUID uuidFromString = null;
            pathfinderInitialState = null;
            String str4 = null;
            boolean z3 = false;
            for (String str5 : queryParameterNames) {
                String queryParameter = deeplinkContext.getUri().getQueryParameter(str5);
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1462714733:
                            if (str5.equals("inquiry_id")) {
                                uuidFromString = UUID.fromString(queryParameter);
                                break;
                            } else {
                                break;
                            }
                        case -957291989:
                            if (str5.equals("topic_id")) {
                                str3 = queryParameter;
                                break;
                            } else {
                                break;
                            }
                        case 104974665:
                            if (str5.equals("current_user_id")) {
                                str4 = queryParameter;
                                break;
                            } else {
                                break;
                            }
                        case 189987798:
                            if (str5.equals("initial_state")) {
                                pathfinderInitialState = PathfinderInitialState.INSTANCE.parse(queryParameter);
                                break;
                            } else {
                                break;
                            }
                        case 342048723:
                            if (str5.equals("log_out")) {
                                if (Intrinsics.areEqual(queryParameter, "true")) {
                                    z3 = true;
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
                Intrinsics.checkNotNull(queryParameter);
                linkedHashMap.put(str5, queryParameter);
            }
            z2 = z3;
            str2 = str4;
            str = str3;
            uuid = uuidFromString;
        } else {
            pathfinderInitialState = null;
            str = null;
            uuid = null;
            str2 = null;
            z2 = false;
        }
        Intent intentCreateContactSupportTriageIntent = Navigators3.createContactSupportTriageIntent(deeplinkContext.getNavigator(), deeplinkContext.getContext(), pathfinderInitialState, str, uuid, linkedHashMap, z);
        if (z2) {
            intentCreateContactSupportTriageIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new ReLogin(null, str2, false, new Intent[]{intentCreateContactSupportTriageIntent}), null, false, 12, null);
        }
        return new Intent[]{intentCreateContactSupportTriageIntent};
    }
}
