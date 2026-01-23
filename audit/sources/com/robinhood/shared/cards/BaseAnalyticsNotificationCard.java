package com.robinhood.shared.cards;

import android.content.Context;
import android.view.View;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAnalyticsNotificationCard.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020\u001fH\u0014J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\u001fH\u0014J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0013H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0012\u0010\u0018\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010&\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard;", "T", "Landroid/view/View;", "Lcom/robinhood/shared/cards/NotificationCard;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "depth", "", "getDepth", "()I", "setDepth", "(I)V", "cardId", "", "getCardId", "()Ljava/lang/String;", "loadId", "getLoadId", "message", "getMessage", "deeplinkUri", "getDeeplinkUri", "entityId", "getEntityId", "onImpression", "", "onClicked", "context", "Landroid/content/Context;", "onDismissed", "shouldLogEvent", "", "shouldBounce", "getShouldBounce", "()Z", "onImpressionImpl", "onClickedImpl", "onDismissedImpl", "sendAnalytics", "event", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class BaseAnalyticsNotificationCard<T extends View> implements NotificationCard<T> {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;
    private int depth;

    public abstract String getCardId();

    public abstract String getDeeplinkUri();

    public abstract String getEntityId();

    public abstract String getLoadId();

    public abstract String getMessage();

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean getShouldBounce() {
        return false;
    }

    protected void onClickedImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected void onDismissedImpl() {
    }

    protected void onImpressionImpl() {
    }

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

    public final int getDepth() {
        return this.depth;
    }

    public final void setDepth(int i) {
        this.depth = i;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public void onImpression() {
        sendAnalytics(getAnalytics(), AnalyticsStrings.NOTIF_STACK_EVENT_IMPRESSION);
        onImpressionImpl();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public void onClicked(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sendAnalytics(getAnalytics(), AnalyticsStrings.NOTIF_STACK_EVENT_ACTION);
        onClickedImpl(context);
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public void onDismissed(boolean shouldLogEvent) {
        if (shouldLogEvent) {
            sendAnalytics(getAnalytics(), AnalyticsStrings.NOTIF_STACK_EVENT_DISMISS);
        }
        onDismissedImpl();
    }

    private final void sendAnalytics(AnalyticsLogger analytics, String event) {
        analytics.logNotificationStack(event, this.depth, getType(), getCardId(), getLoadId(), getMessage(), getDeeplinkUri(), getEntityId());
    }
}
