package com.robinhood.android.trade.equity;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Consumers;
import com.robinhood.utils.extensions.Disposable4;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.notifications.Channels;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitOrderService.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0002J:\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J:\u0010,\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J:\u0010-\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J\b\u0010.\u001a\u00020 H\u0002J:\u0010/\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J8\u00100\u001a\u00020 2\u0006\u00101\u001a\u0002022\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J\u0010\u00103\u001a\u0002042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/SubmitOrderService;", "Landroid/app/Service;", "<init>", "()V", "binder", "Lcom/robinhood/android/trade/equity/SubmitOrderService$LocalBinder;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "getOrderManager", "()Lcom/robinhood/android/equity/submission/EquityOrderManager;", "setOrderManager", "(Lcom/robinhood/android/equity/submission/EquityOrderManager;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "orderDisposable", "Lio/reactivex/disposables/Disposable;", "primaryColor", "", "getPrimaryColor", "()I", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "onCreate", "", "onDestroy", "onSuccess", "onError", "orderTitle", "", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "completionUrl", "accountNumber", "showSubmittingNotification", "showReceivedNotification", "showSuccessNotification", "showErrorNotification", "showNotification", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "onBind", "Landroid/os/IBinder;", "LocalBinder", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SubmitOrderService extends Hammer_SubmitOrderService {
    private static final String ARG_ACCOUNT_NUMBER = "account-number";
    private static final String ARG_COMPLETION_URL = "completion-url";
    private static final String ARG_ORDER_INSTRUMENT_ID = "order-instrument-id";
    private static final String ARG_ORDER_SIDE = "order-side";
    private static final String ARG_ORDER_TITLE = "order-title";
    private static final int NOTIFICATION_ID = 1;
    private final LocalBinder binder;
    public Navigator navigator;
    private NotificationManagerCompat notificationManager;
    private Disposable orderDisposable;
    public EquityOrderManager orderManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SubmitOrderService() {
        super(null);
        this.binder = new LocalBinder();
    }

    public final EquityOrderManager getOrderManager() {
        EquityOrderManager equityOrderManager = this.orderManager;
        if (equityOrderManager != null) {
            return equityOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public final void setOrderManager(EquityOrderManager equityOrderManager) {
        Intrinsics.checkNotNullParameter(equityOrderManager, "<set-?>");
        this.orderManager = equityOrderManager;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final int getPrimaryColor() {
        return getColor(C20690R.color.mobius_prime);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        UUID uuid;
        EquityOrderSide equityOrderSide;
        if (intent != null) {
            final String stringExtra = intent.getStringExtra(ARG_ORDER_TITLE);
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                uuid = (UUID) intent.getSerializableExtra(ARG_ORDER_INSTRUMENT_ID, UUID.class);
            } else {
                uuid = (UUID) intent.getSerializableExtra(ARG_ORDER_INSTRUMENT_ID);
            }
            final UUID uuid2 = uuid;
            if (i >= 33) {
                equityOrderSide = (EquityOrderSide) intent.getSerializableExtra(ARG_ORDER_SIDE, EquityOrderSide.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra(ARG_ORDER_SIDE);
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.robinhood.models.db.EquityOrderSide");
                equityOrderSide = (EquityOrderSide) serializableExtra;
            }
            final EquityOrderSide equityOrderSide2 = equityOrderSide;
            final String stringExtra2 = intent.getStringExtra(ARG_COMPLETION_URL);
            final String stringExtra3 = intent.getStringExtra(ARG_ACCOUNT_NUMBER);
            this.orderDisposable = OrderSubmissionManager.orderStateChanges$default(getOrderManager(), null, 1, null).subscribe(new Consumer() { // from class: com.robinhood.android.trade.equity.SubmitOrderService.onStartCommand.1
                @Override // io.reactivex.functions.Consumer
                public final void accept(OrderSubmissionManager.Result<Order, DirectOrderRequestDraft> result) {
                    if (result instanceof OrderSubmissionManager.Result.Sending) {
                        SubmitOrderService.this.showSubmittingNotification(stringExtra, uuid2, equityOrderSide2, stringExtra2, stringExtra3);
                        return;
                    }
                    if (result instanceof OrderSubmissionManager.Result.Submitted) {
                        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.robinhood.android.lib.trade.submission.OrderSubmissionManager.Result.Submitted<com.robinhood.models.db.Order>");
                        if (((OrderSubmissionManager.Result.Submitted) result).getTriggersConfirmation()) {
                            SubmitOrderService.this.showReceivedNotification(stringExtra, uuid2, equityOrderSide2, stringExtra2, stringExtra3);
                            return;
                        } else {
                            SubmitOrderService.this.onSuccess();
                            return;
                        }
                    }
                    if (result instanceof OrderSubmissionManager.Result.Failure) {
                        SubmitOrderService.this.onError(stringExtra, uuid2, equityOrderSide2, stringExtra2, stringExtra3);
                    } else {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(result);
                        throw new ExceptionsH();
                    }
                }
            }, Consumers.onError());
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override // com.robinhood.android.trade.equity.Hammer_SubmitOrderService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.notificationManager = NotificationManagerCompat.from(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Disposable4.disposeSafe(this.orderDisposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess() {
        showSuccessNotification();
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String orderTitle, UUID instrumentId, EquityOrderSide side, String completionUrl, String accountNumber) {
        showErrorNotification(orderTitle, instrumentId, side, completionUrl, accountNumber);
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubmittingNotification(String orderTitle, UUID instrumentId, EquityOrderSide side, String completionUrl, String accountNumber) {
        NotificationCompat.Builder color = new NotificationCompat.Builder(this, Channels.DEFAULT.getId()).setSmallIcon(C20690R.drawable.ic_action_rh_logo).setContentTitle(orderTitle).setContentText(getString(C20649R.string.order_review_status_submitting)).setColor(getPrimaryColor());
        Intrinsics.checkNotNullExpressionValue(color, "setColor(...)");
        showNotification(color, instrumentId, side, completionUrl, accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReceivedNotification(String orderTitle, UUID instrumentId, EquityOrderSide side, String completionUrl, String accountNumber) {
        NotificationCompat.Builder color = new NotificationCompat.Builder(this, Channels.DEFAULT.getId()).setSmallIcon(C20690R.drawable.ic_action_rh_logo).setContentTitle(orderTitle).setContentText(getString(C29365R.string.order_review_status_received)).setColor(getPrimaryColor());
        Intrinsics.checkNotNullExpressionValue(color, "setColor(...)");
        showNotification(color, instrumentId, side, completionUrl, accountNumber);
    }

    private final void showSuccessNotification() {
        NotificationManagerCompat notificationManagerCompat = this.notificationManager;
        if (notificationManagerCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            notificationManagerCompat = null;
        }
        notificationManagerCompat.cancel(1);
    }

    private final void showErrorNotification(String orderTitle, UUID instrumentId, EquityOrderSide side, String completionUrl, String accountNumber) {
        NotificationCompat.Builder color = new NotificationCompat.Builder(this, Channels.DEFAULT.getId()).setSmallIcon(C29365R.drawable.ic_error).setContentTitle(orderTitle).setContentText(getString(C29365R.string.order_notification_error)).setColor(getPrimaryColor());
        Intrinsics.checkNotNullExpressionValue(color, "setColor(...)");
        showNotification(color, instrumentId, side, completionUrl, accountNumber);
    }

    private final void showNotification(NotificationCompat.Builder builder, UUID instrumentId, EquityOrderSide side, String completionUrl, String accountNumber) {
        Navigator navigator = getNavigator();
        Intrinsics.checkNotNull(instrumentId);
        Intrinsics.checkNotNull(side);
        EquityOrderActivityIntentKey.WithId withId = new EquityOrderActivityIntentKey.WithId(instrumentId, side, EquityOrderFlowSource.ORDER_SUBMIT_NOTIFICATION, null, accountNumber, completionUrl, null, false, false, WaitlistAnimationConstants.MIDDLE_YAW_FRAME, null);
        NotificationManagerCompat notificationManagerCompat = null;
        Notification notificationBuild = builder.setContentIntent(PendingIntent.getActivity(this, 0, navigator.createIntent(this, withId, null, false), 201326592)).setChannelId(Channels.DEFAULT.getId()).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        NotificationManagerCompat notificationManagerCompat2 = this.notificationManager;
        if (notificationManagerCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        } else {
            notificationManagerCompat = notificationManagerCompat2;
        }
        NotificationUtils.notifyIfPossible(notificationManagerCompat, 1, notificationBuild);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }

    /* compiled from: SubmitOrderService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/SubmitOrderService$LocalBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/robinhood/android/trade/equity/SubmitOrderService;)V", "service", "Lcom/robinhood/android/trade/equity/SubmitOrderService;", "getService", "()Lcom/robinhood/android/trade/equity/SubmitOrderService;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final SubmitOrderService getThis$0() {
            return SubmitOrderService.this;
        }
    }

    /* compiled from: SubmitOrderService.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0002J8\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/SubmitOrderService$Companion;", "", "<init>", "()V", "ARG_ORDER_TITLE", "", "ARG_ORDER_INSTRUMENT_ID", "ARG_ORDER_SIDE", "ARG_COMPLETION_URL", "ARG_ACCOUNT_NUMBER", "NOTIFICATION_ID", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "symbol", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "completionUrl", "start", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Intent newIntent(Context context, String symbol, EquityOrderSide side, UUID instrumentId, String accountNumber, String completionUrl) {
            Intent intent = new Intent(context, (Class<?>) SubmitOrderService.class);
            intent.putExtra(SubmitOrderService.ARG_ORDER_TITLE, context.getString(C29365R.string.order_notification_title, symbol));
            intent.putExtra(SubmitOrderService.ARG_ORDER_INSTRUMENT_ID, instrumentId);
            intent.putExtra(SubmitOrderService.ARG_ORDER_SIDE, side);
            intent.putExtra(SubmitOrderService.ARG_ACCOUNT_NUMBER, accountNumber);
            intent.putExtra(SubmitOrderService.ARG_COMPLETION_URL, completionUrl);
            return intent;
        }

        public final void start(Context context, String symbol, EquityOrderSide side, UUID instrumentId, String accountNumber, String completionUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            context.startService(newIntent(context, symbol, side, instrumentId, accountNumber, completionUrl));
        }
    }
}
