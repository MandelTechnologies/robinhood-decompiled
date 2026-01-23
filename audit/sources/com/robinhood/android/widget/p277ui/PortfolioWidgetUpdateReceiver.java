package com.robinhood.android.widget.p277ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdateReceiver.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateReceiver;", "Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiver;", "<init>", "()V", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "getUpdateDispatcher", "()Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "setUpdateDispatcher", "(Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetUpdateReceiver extends HammerBroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_FORCE = "force";
    public PortfolioWidgetUpdateDispatcher updateDispatcher;

    public final PortfolioWidgetUpdateDispatcher getUpdateDispatcher() {
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher = this.updateDispatcher;
        if (portfolioWidgetUpdateDispatcher != null) {
            return portfolioWidgetUpdateDispatcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateDispatcher");
        return null;
    }

    public final void setUpdateDispatcher(PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher) {
        Intrinsics.checkNotNullParameter(portfolioWidgetUpdateDispatcher, "<set-?>");
        this.updateDispatcher = portfolioWidgetUpdateDispatcher;
    }

    @Override // com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        getUpdateDispatcher().scheduleUpdate(context, intent.getBooleanExtra(EXTRA_FORCE, false), true);
    }

    /* compiled from: PortfolioWidgetUpdateReceiver.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateReceiver$Companion;", "", "<init>", "()V", "EXTRA_FORCE", "", "getUpdatePendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", PortfolioWidgetUpdateReceiver.EXTRA_FORCE, "", "getUpdatePendingIntent$feature_widget_externalDebug", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PendingIntent getUpdatePendingIntent$feature_widget_externalDebug(Context context, boolean force) {
            Intrinsics.checkNotNullParameter(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) PortfolioWidgetUpdateReceiver.class).putExtra(PortfolioWidgetUpdateReceiver.EXTRA_FORCE, force), 201326592);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }
    }
}
