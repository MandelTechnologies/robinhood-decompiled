package com.robinhood.android.common.p081cx;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: SupportEmailHandler.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/cx/SupportEmailHandler;", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/android/navigation/Navigator;)V", "handleExternalSupportLink", "", "context", "Landroid/content/Context;", "topicId", "", "getPathfinderEmailIntent", "Landroid/content/Intent;", "getSupportHttpUrl", "Lokhttp3/HttpUrl;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SupportEmailHandler {
    public static final int $stable = 8;
    private final Navigator navigator;

    public SupportEmailHandler(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
    }

    public static /* synthetic */ void handleExternalSupportLink$default(SupportEmailHandler supportEmailHandler, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        supportEmailHandler.handleExternalSupportLink(context, str);
    }

    public final void handleExternalSupportLink(Context context, String topicId) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebUtils.viewUrl$default(WebUtils.INSTANCE, context, getSupportHttpUrl(context, topicId), 0, 4, null);
    }

    public static /* synthetic */ Intent getPathfinderEmailIntent$default(SupportEmailHandler supportEmailHandler, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return supportEmailHandler.getPathfinderEmailIntent(context, str);
    }

    public final Intent getPathfinderEmailIntent(Context context, String topicId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Navigator.DefaultImpls.createIntentForFragment$default(this.navigator, context, new ContactSupportFragmentKey.TriageFlow(null, topicId, null, null, null, 29, null), false, false, false, null, false, true, false, true, false, null, false, 7284, null);
    }

    static /* synthetic */ HttpUrl getSupportHttpUrl$default(SupportEmailHandler supportEmailHandler, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return supportEmailHandler.getSupportHttpUrl(context, str);
    }

    private final HttpUrl getSupportHttpUrl(Context context, String topicId) {
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String string2 = context.getString(C11048R.string.url_contact_page);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        HttpUrl.Builder builderNewBuilder = companion.get(string2).newBuilder();
        if (topicId != null) {
            builderNewBuilder.addQueryParameter("topic_id", topicId);
        }
        builderNewBuilder.addQueryParameter("src", "android_app");
        return builderNewBuilder.build();
    }
}
