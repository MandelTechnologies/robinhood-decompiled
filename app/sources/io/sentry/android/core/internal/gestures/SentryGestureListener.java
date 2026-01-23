package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.TransactionContext;
import io.sentry.TransactionOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.UiElement;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.TracingUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes21.dex */
public final class SentryGestureListener implements GestureDetector.OnGestureListener {
    private final WeakReference<Activity> activityRef;
    private final IHub hub;
    private final SentryAndroidOptions options;
    private UiElement activeUiElement = null;
    private ITransaction activeTransaction = null;
    private GestureType activeEventType = GestureType.Unknown;
    private final ScrollState scrollState = new ScrollState(null);

    private enum GestureType {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    public SentryGestureListener(Activity activity, IHub iHub, SentryAndroidOptions sentryAndroidOptions) {
        this.activityRef = new WeakReference<>(activity);
        this.hub = iHub;
        this.options = sentryAndroidOptions;
    }

    public void onUp(MotionEvent motionEvent) {
        View viewEnsureWindowDecorView = ensureWindowDecorView("onUp");
        UiElement uiElement = this.scrollState.target;
        if (viewEnsureWindowDecorView == null || uiElement == null) {
            return;
        }
        if (this.scrollState.f10716type == GestureType.Unknown) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        addBreadcrumb(uiElement, this.scrollState.f10716type, Collections.singletonMap("direction", this.scrollState.calculateDirection(motionEvent)), motionEvent);
        startTracing(uiElement, this.scrollState.f10716type);
        this.scrollState.reset();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.scrollState.reset();
        this.scrollState.startX = motionEvent.getX();
        this.scrollState.startY = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewEnsureWindowDecorView = ensureWindowDecorView("onSingleTapUp");
        if (viewEnsureWindowDecorView != null && motionEvent != null) {
            UiElement uiElementFindTarget = ViewUtils.findTarget(this.options, viewEnsureWindowDecorView, motionEvent.getX(), motionEvent.getY(), UiElement.Type.CLICKABLE);
            if (uiElementFindTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            GestureType gestureType = GestureType.Click;
            addBreadcrumb(uiElementFindTarget, gestureType, Collections.EMPTY_MAP, motionEvent);
            startTracing(uiElementFindTarget, gestureType);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewEnsureWindowDecorView = ensureWindowDecorView("onScroll");
        if (viewEnsureWindowDecorView != null && motionEvent != null && this.scrollState.f10716type == GestureType.Unknown) {
            UiElement uiElementFindTarget = ViewUtils.findTarget(this.options, viewEnsureWindowDecorView, motionEvent.getX(), motionEvent.getY(), UiElement.Type.SCROLLABLE);
            if (uiElementFindTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Scroll target found: " + uiElementFindTarget.getIdentifier(), new Object[0]);
            this.scrollState.setTarget(uiElementFindTarget);
            this.scrollState.f10716type = GestureType.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scrollState.f10716type = GestureType.Swipe;
        return false;
    }

    private void addBreadcrumb(UiElement uiElement, GestureType gestureType, Map<String, Object> map, MotionEvent motionEvent) {
        if (this.options.isEnableUserInteractionBreadcrumbs()) {
            String gestureType2 = getGestureType(gestureType);
            Hint hint = new Hint();
            hint.set("android:motionEvent", motionEvent);
            hint.set("android:view", uiElement.getView());
            this.hub.addBreadcrumb(Breadcrumb.userInteraction(gestureType2, uiElement.getResourceName(), uiElement.getClassName(), uiElement.getTag(), map), hint);
        }
    }

    private void startTracing(UiElement uiElement, GestureType gestureType) {
        boolean z = gestureType == GestureType.Click || !(gestureType == this.activeEventType && uiElement.equals(this.activeUiElement));
        if (!this.options.isTracingEnabled() || !this.options.isEnableUserInteractionTracing()) {
            if (z) {
                TracingUtils.startNewTrace(this.hub);
                this.activeUiElement = uiElement;
                this.activeEventType = gestureType;
                return;
            }
            return;
        }
        Activity activity = this.activityRef.get();
        if (activity == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String identifier = uiElement.getIdentifier();
        ITransaction iTransaction = this.activeTransaction;
        if (iTransaction != null) {
            if (!z && !iTransaction.isFinished()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "The view with id: " + identifier + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.options.getIdleTimeout() != null) {
                    this.activeTransaction.scheduleFinish();
                    return;
                }
                return;
            }
            stopTracing(SpanStatus.OK);
        }
        String str = getActivityName(activity) + "." + identifier;
        String str2 = "ui.action." + getGestureType(gestureType);
        TransactionOptions transactionOptions = new TransactionOptions();
        transactionOptions.setWaitForChildren(true);
        transactionOptions.setDeadlineTimeout(30000L);
        transactionOptions.setIdleTimeout(this.options.getIdleTimeout());
        transactionOptions.setTrimEnd(true);
        final ITransaction iTransactionStartTransaction = this.hub.startTransaction(new TransactionContext(str, TransactionNameSource.COMPONENT, str2), transactionOptions);
        iTransactionStartTransaction.getSpanContext().setOrigin("auto.ui.gesture_listener." + uiElement.getOrigin());
        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener$$ExternalSyntheticLambda1
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                this.f$0.applyScope(iScope, iTransactionStartTransaction);
            }
        });
        this.activeTransaction = iTransactionStartTransaction;
        this.activeUiElement = uiElement;
        this.activeEventType = gestureType;
    }

    void stopTracing(SpanStatus spanStatus) {
        ITransaction iTransaction = this.activeTransaction;
        if (iTransaction != null) {
            if (iTransaction.getStatus() == null) {
                this.activeTransaction.finish(spanStatus);
            } else {
                this.activeTransaction.finish();
            }
        }
        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener$$ExternalSyntheticLambda0
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                this.f$0.clearScope(iScope);
            }
        });
        this.activeTransaction = null;
        if (this.activeUiElement != null) {
            this.activeUiElement = null;
        }
        this.activeEventType = GestureType.Unknown;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearScope(final IScope iScope) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener$$ExternalSyntheticLambda3
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction) {
                SentryGestureListener.$r8$lambda$swQftAtdYiZzynh0U2qi8SMzjqU(this.f$0, iScope, iTransaction);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$swQftAtdYiZzynh0U2qi8SMzjqU(SentryGestureListener sentryGestureListener, IScope iScope, ITransaction iTransaction) {
        if (iTransaction == sentryGestureListener.activeTransaction) {
            iScope.clearTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyScope(final IScope iScope, final ITransaction iTransaction) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener$$ExternalSyntheticLambda2
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                SentryGestureListener.m28532$r8$lambda$KJ1b2jPl3Pt1Ulxy1a7hsyHEw4(this.f$0, iScope, iTransaction, iTransaction2);
            }
        });
    }

    /* renamed from: $r8$lambda$KJ1b2jPl3P-t1Ulxy1a7hsyHEw4, reason: not valid java name */
    public static /* synthetic */ void m28532$r8$lambda$KJ1b2jPl3Pt1Ulxy1a7hsyHEw4(SentryGestureListener sentryGestureListener, IScope iScope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            sentryGestureListener.getClass();
            iScope.setTransaction(iTransaction);
        } else {
            sentryGestureListener.options.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private View ensureWindowDecorView(String str) {
        Activity activity = this.activityRef.get();
        if (activity == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    /* renamed from: io.sentry.android.core.internal.gestures.SentryGestureListener$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C457091 {

        /* renamed from: $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType */
        static final /* synthetic */ int[] f6641xbbba4381;

        static {
            int[] iArr = new int[GestureType.values().length];
            f6641xbbba4381 = iArr;
            try {
                iArr[GestureType.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6641xbbba4381[GestureType.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6641xbbba4381[GestureType.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6641xbbba4381[GestureType.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String getGestureType(GestureType gestureType) {
        int i = C457091.f6641xbbba4381[gestureType.ordinal()];
        if (i == 1) {
            return "click";
        }
        if (i == 2) {
            return "scroll";
        }
        if (i == 3) {
            return "swipe";
        }
        return "unknown";
    }

    private static final class ScrollState {
        private float startX;
        private float startY;
        private UiElement target;

        /* renamed from: type, reason: collision with root package name */
        private GestureType f10716type;

        private ScrollState() {
            this.f10716type = GestureType.Unknown;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }

        /* synthetic */ ScrollState(C457091 c457091) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(UiElement uiElement) {
            this.target = uiElement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String calculateDirection(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.startX;
            float y = motionEvent.getY() - this.startY;
            if (Math.abs(x) > Math.abs(y)) {
                if (x > 0.0f) {
                    return "right";
                }
                return "left";
            }
            if (y > 0.0f) {
                return "down";
            }
            return "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.target = null;
            this.f10716type = GestureType.Unknown;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }
    }
}
