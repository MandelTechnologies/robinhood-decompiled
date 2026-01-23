package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.animation.CircularReveal;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsLoadingView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J(\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0014J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RdsLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "radius", "", "revealX", "", "revealY", "newValue", "", "loading", "setLoading", "(Z)V", "messageTextView", "Landroid/widget/TextView;", "value", "", "message", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "onVisibilityAggregated", "", "isVisible", "onSizeChanged", "w", "h", "oldWidth", "oldHeight", "show", "hide", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsLoadingView extends ConstraintLayout {
    public static final int $stable = 8;
    private boolean loading;
    private final TextView messageTextView;
    private float radius;
    private int revealX;
    private int revealY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C11839R.layout.merge_rds_loading, this);
        View viewFindViewById = findViewById(C11839R.id.loading_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.messageTextView = (TextView) viewFindViewById;
        int[] LoadingView = C13997R.styleable.LoadingView;
        Intrinsics.checkNotNullExpressionValue(LoadingView, "LoadingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LoadingView, 0, 0);
        setMessage(typedArrayObtainStyledAttributes.getText(C13997R.styleable.LoadingView_android_text));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setLoading(boolean z) {
        if (z != this.loading) {
            this.loading = z;
            if (z) {
                IdlingResourceCounters2.increment(IdlingResourceType.LOADING_VIEW);
            } else {
                IdlingResourceCounters2.decrement(IdlingResourceType.LOADING_VIEW);
            }
        }
    }

    public final CharSequence getMessage() {
        return this.messageTextView.getText().toString();
    }

    public final void setMessage(CharSequence charSequence) {
        this.messageTextView.setText(charSequence);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);
        setLoading(isVisible);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldWidth, int oldHeight) {
        super.onSizeChanged(w, h, oldWidth, oldHeight);
        this.revealX = w;
        this.revealY = h;
        this.radius = (float) Math.sqrt((w * w) + (h * h));
    }

    public final void show() {
        if (!isShown() && isAttachedToWindow() && getMeasuredHeight() != 0) {
            CircularReveal.createCircularReveal(this, this.revealX, this.revealY, 0.0f, this.radius).start();
        } else {
            setVisibility(0);
        }
    }

    public final void hide() {
        if (isShown() && isAttachedToWindow() && getMeasuredHeight() != 0) {
            CircularReveal.createCircularHide(this, this.revealX, this.revealY, this.radius, 0.0f).start();
        } else {
            setVisibility(4);
        }
    }
}
