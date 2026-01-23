package com.robinhood.android.common.util;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareReceiver.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/util/ShareReceiver;", "Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiver;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ShareReceiver extends HammerBroadcastReceiver {
    public AnalyticsLogger analytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        ComponentName componentName = extras != null ? (ComponentName) extras.getParcelable("android.intent.extra.CHOSEN_COMPONENT") : null;
        if (componentName != null) {
            AnalyticsLogger analytics = getAnalytics();
            String packageName = componentName.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_SYSTEM_SHARE, packageName, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
    }

    /* compiled from: ShareReceiver.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/util/ShareReceiver$Companion;", "", "<init>", "()V", "getIntentSender", "Landroid/content/IntentSender;", "context", "Landroid/content/Context;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntentSender getIntentSender(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntentSender intentSender = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ShareReceiver.class), 201326592).getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
            return intentSender;
        }
    }
}
