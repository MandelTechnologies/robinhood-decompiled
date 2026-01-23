package com.robinhood.android.newsfeed.view.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: LoggedCustomTabs.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b*\u0001\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J~\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "binded", "", "serviceConnection", "com/robinhood/android/newsfeed/view/util/LoggedCustomTabs$serviceConnection$1", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs$serviceConnection$1;", "bind", "", "context", "Landroid/content/Context;", "unbind", "viewUrl", "url", "Lokhttp3/HttpUrl;", "screenName", "", "desc", "reason", "source", "messageType", "type", "entityId", "tag", "sourceScreenName", "Callback", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LoggedCustomTabs {
    private static final String CHROME_PACKAGE_NAME = "com.android.chrome";
    private final AnalyticsLogger analytics;
    private boolean binded;
    private final RhProcessLifecycleOwner rhProcessLifecycleOwner;
    private final LoggedCustomTabs3 serviceConnection;
    public static final int $stable = 8;

    public LoggedCustomTabs(AnalyticsLogger analytics, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.analytics = analytics;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.serviceConnection = new LoggedCustomTabs3();
    }

    public final void bind(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.binded) {
            return;
        }
        this.binded = CustomTabsClient.bindCustomTabsService(context, CHROME_PACKAGE_NAME, this.serviceConnection);
    }

    public final void unbind(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.binded) {
            context.unbindService(this.serviceConnection);
            this.binded = false;
        }
    }

    public static /* synthetic */ void viewUrl$default(LoggedCustomTabs loggedCustomTabs, Context context, HttpUrl httpUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        loggedCustomTabs.viewUrl(context, httpUrl, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final void viewUrl(Context context, HttpUrl url, String screenName, String desc, String reason, String source, String messageType, String type2, String entityId, String tag, String sourceScreenName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        CustomTabsClient client = this.serviceConnection.getClient();
        Intent intent = new CustomTabsIntent.Builder(client != null ? client.newSession(new Callback(this.analytics, screenName, desc, reason, source, messageType, type2, entityId, tag, sourceScreenName)) : null).setToolbarColor(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary)).build().intent;
        intent.setData(HttpUrl2.toAndroidUri(url));
        Intrinsics.checkNotNullExpressionValue(intent, "apply(...)");
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            try {
                this.rhProcessLifecycleOwner.useExtendedTimeout();
                context.startActivity(intent);
                return;
            } catch (SecurityException unused) {
                CharSequence charSequenceLoadLabel = resolveInfoResolveActivity.loadLabel(packageManager);
                Intrinsics.checkNotNullExpressionValue(charSequenceLoadLabel, "loadLabel(...)");
                String string2 = context.getString(C11048R.string.general_error_external_app_crash, charSequenceLoadLabel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Toast.makeText(context, string2, 1).show();
                return;
            }
        }
        Toast.makeText(context, C11048R.string.general_error_no_browser_found, 1).show();
    }

    /* compiled from: LoggedCustomTabs.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs$Callback;", "Landroidx/browser/customtabs/CustomTabsCallback;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "screenName", "", "desc", "reason", "source", "messageType", "type", "entityId", "tag", "sourceScreenName", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "startTime", "", "Ljava/lang/Long;", "onNavigationEvent", "", "navigationEvent", "", "extras", "Landroid/os/Bundle;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Callback extends CustomTabsCallback {
        private final AnalyticsLogger analytics;
        private final String desc;
        private final String entityId;
        private final String messageType;
        private final String reason;
        private final String screenName;
        private final String source;
        private final String sourceScreenName;
        private Long startTime;
        private final String tag;
        private final String type;

        public Callback(AnalyticsLogger analytics, String screenName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.analytics = analytics;
            this.screenName = screenName;
            this.desc = str;
            this.reason = str2;
            this.source = str3;
            this.messageType = str4;
            this.type = str5;
            this.entityId = str6;
            this.tag = str7;
            this.sourceScreenName = str8;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int navigationEvent, Bundle extras) {
            if (navigationEvent == 5) {
                this.startTime = Long.valueOf(SystemClock.elapsedRealtime());
                return;
            }
            if (navigationEvent != 6) {
                return;
            }
            Long l = this.startTime;
            long jElapsedRealtime = l != null ? SystemClock.elapsedRealtime() - l.longValue() : 0L;
            this.startTime = null;
            this.analytics.buildTransitionEvent(AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR, this.screenName, this.desc, this.reason, this.source, this.sourceScreenName, this.messageType, this.type, this.entityId, this.tag, (int) jElapsedRealtime).send();
        }
    }
}
