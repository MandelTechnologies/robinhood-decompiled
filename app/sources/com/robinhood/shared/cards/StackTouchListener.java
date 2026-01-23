package com.robinhood.shared.cards;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.robinhood.shared.cards.SwipeDismissTouchListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StackTouchListener.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/cards/StackTouchListener;", "Lcom/robinhood/shared/cards/SwipeDismissTouchListener;", "view", "Landroid/view/View;", "token", "", "callbacks", "Lcom/robinhood/shared/cards/StackTouchListener$TouchCallbacks;", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lcom/robinhood/shared/cards/StackTouchListener$TouchCallbacks;)V", "maxTimeForTap", "", "downTouchTime", "", "onTouch", "", "motionEvent", "Landroid/view/MotionEvent;", "TouchCallbacks", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StackTouchListener extends SwipeDismissTouchListener {
    public static final int $stable = 8;
    private final TouchCallbacks callbacks;
    private long downTouchTime;
    private final int maxTimeForTap;

    /* compiled from: StackTouchListener.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/cards/StackTouchListener$TouchCallbacks;", "Lcom/robinhood/shared/cards/SwipeDismissTouchListener$DismissCallbacks;", "canClick", "", "token", "", "onClicked", "", "view", "Landroid/view/View;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TouchCallbacks extends SwipeDismissTouchListener.DismissCallbacks {
        boolean canClick(Object token);

        void onClicked(View view, Object token);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackTouchListener(View view, Object token, TouchCallbacks callbacks) {
        super(view, token, callbacks);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.maxTimeForTap = ViewConfiguration.getLongPressTimeout();
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener, android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        boolean zOnTouch = super.onTouch(view, motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (SystemClock.elapsedRealtime() - this.downTouchTime <= this.maxTimeForTap) {
                    this.callbacks.onClicked(getMView(), getMToken());
                    zOnTouch = true;
                }
                this.downTouchTime = 0L;
                getMView().setPressed(false);
                return zOnTouch;
            }
            if (action != 2) {
                if (action == 3) {
                    this.downTouchTime = 0L;
                    getMView().setPressed(false);
                    return zOnTouch;
                }
            } else if (zOnTouch) {
                this.downTouchTime = 0L;
                getMView().setPressed(false);
                return zOnTouch;
            }
        } else if (this.callbacks.canClick(getMToken())) {
            this.downTouchTime = SystemClock.elapsedRealtime();
            getMView().setPressed(true);
        }
        return zOnTouch;
    }
}
