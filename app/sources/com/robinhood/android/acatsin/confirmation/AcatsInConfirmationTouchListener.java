package com.robinhood.android.acatsin.confirmation;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.common.view.DiscreteTouchListener;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInConfirmationTouchListener.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J*\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener;", "Lcom/robinhood/android/common/view/DiscreteTouchListener;", "callbacks", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener$Callbacks;", "view", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener$Callbacks;Landroid/view/View;Landroid/content/Context;)V", "getCallbacks", "()Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener$Callbacks;", "getView", "()Landroid/view/View;", "width", "", "onDown", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroid/view/MotionEvent;", "onUp", "onScroll", "e1", "e2", "distanceX", "distanceY", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInConfirmationTouchListener extends DiscreteTouchListener {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final View view;
    private float width;

    /* compiled from: AcatsInConfirmationTouchListener.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationTouchListener$Callbacks;", "", "pauseAnimation", "", "resumeAnimation", "stepAnimation", "dProgress", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void pauseAnimation();

        void resumeAnimation();

        void stepAnimation(float dProgress);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final View getView() {
        return this.view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInConfirmationTouchListener(Callbacks callbacks, final View view, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        this.callbacks = callbacks;
        this.view = view;
        OneShotPreDrawListener.add(view, new Runnable() { // from class: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationTouchListener$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.width = r0.getView().getWidth();
            }
        });
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.callbacks.pauseAnimation();
        return true;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener
    public boolean onUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.callbacks.resumeAnimation();
        return true;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.callbacks.stepAnimation((distanceX / (this.width / 2)) * (-1));
        return true;
    }
}
