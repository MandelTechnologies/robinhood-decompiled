package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhEditText.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "analyticsIdentifier", "", "value", "", "useCustomNumpad", "getUseCustomNumpad", "()Z", "setUseCustomNumpad", "(Z)V", "clearFocusOnSoftInputHide", "hideSoftInputOnFocusLoss", "editStartTime", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "onFocusChanged", "", "focused", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onKeyPreIme", "keyCode", "event", "Landroid/view/KeyEvent;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public class RhEditText extends Hammer_RhEditText {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;
    private final String analyticsIdentifier;
    private final boolean clearFocusOnSoftInputHide;
    private long editStartTime;
    private final boolean hideSoftInputOnFocusLoss;
    private boolean useCustomNumpad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11048R.styleable.RhEditText);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.analyticsIdentifier = typedArrayObtainStyledAttributes.getString(C11048R.styleable.RhEditText_analyticsIdentifier);
        this.clearFocusOnSoftInputHide = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhEditText_clearFocusOnSoftInputHide, false);
        this.hideSoftInputOnFocusLoss = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhEditText_hideSoftInputOnFocusLoss, false);
        setUseCustomNumpad(typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhEditText_useCustomNumpad, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean getUseCustomNumpad() {
        return this.useCustomNumpad;
    }

    public final void setUseCustomNumpad(boolean z) {
        if (z) {
            setFocusable(true);
            setFocusableInTouchMode(true);
            setShowSoftInputOnFocus(false);
        } else {
            setFocusable(true);
            setFocusableInTouchMode(true);
            setShowSoftInputOnFocus(true);
        }
        this.useCustomNumpad = z;
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

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (!focused && this.hideSoftInputOnFocusLoss) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
        }
        if (this.analyticsIdentifier != null) {
            if (focused) {
                this.editStartTime = SystemClock.elapsedRealtime();
            } else if (this.editStartTime != 0) {
                getAnalytics().logFieldTransition(this.analyticsIdentifier, SystemClock.elapsedRealtime() - this.editStartTime);
                this.editStartTime = 0L;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.clearFocusOnSoftInputHide && keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled()) {
                    Object systemService = getContext().getSystemService("input_method");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
                    clearFocus();
                    return true;
                }
            }
        }
        return super.onKeyPreIme(keyCode, event);
    }
}
