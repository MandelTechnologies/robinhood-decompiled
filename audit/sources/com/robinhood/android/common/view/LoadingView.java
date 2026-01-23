package com.robinhood.android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.animation.CircularReveal;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingView.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u0011J(\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0014J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0016H\u0014J\b\u0010%\u001a\u00020\u0016H\u0014J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0016J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/common/view/LoadingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "messageTxt", "Landroid/widget/TextView;", "loadingViewImage", "Landroid/widget/ImageView;", "loadingViewProgressBar", "Landroid/widget/ProgressBar;", "radius", "", "revealX", "", "revealY", "detached", "", "setMessage", "", "resId", "message", "", "setColor", ResourceTypes.COLOR, "onSizeChanged", "w", "h", "oldw", "oldh", "setHotSpot", "x", "y", "onAttachedToWindow", "onDetachedFromWindow", "show", "hide", "setVisible", "visible", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LoadingView extends FrameLayout {
    public static final int $stable = 8;
    private boolean detached;
    private final ImageView loadingViewImage;
    private final ProgressBar loadingViewProgressBar;
    private final TextView messageTxt;
    private float radius;
    private int revealX;
    private int revealY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, C11048R.style.LoadingView);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C11048R.layout.merge_loading_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(C11048R.id.loading_view_msg_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.messageTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11048R.id.loading_view_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.loadingViewImage = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11048R.id.loading_view_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.loadingViewProgressBar = (ProgressBar) viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13997R.styleable.LoadingView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setMessage(typedArrayObtainStyledAttributes.getString(C13997R.styleable.LoadingView_android_text));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setMessage(int resId) {
        setMessage(getResources().getString(resId));
    }

    public final void setMessage(String message) {
        this.messageTxt.setText(message);
        this.messageTxt.setVisibility(TextUtils.isEmpty(message) ? 8 : 0);
    }

    public final void setColor(int color) {
        this.messageTxt.setTextColor(getResources().getColor(color, getContext().getTheme()));
        this.loadingViewProgressBar.setIndeterminateTintList(getResources().getColorStateList(color, getContext().getTheme()));
        this.loadingViewImage.setImageTintList(getResources().getColorStateList(color, getContext().getTheme()));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setHotSpot(w, h);
        this.radius = (float) Math.sqrt((w * w) + (h * h));
    }

    private final void setHotSpot(int x, int y) {
        this.revealX = x;
        this.revealY = y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.detached = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.detached = true;
    }

    public final void show() {
        if (!isShown() && !this.detached && getMeasuredHeight() != 0) {
            CircularReveal.createCircularReveal(this, this.revealX, this.revealY, 0.0f, this.radius).start();
        } else {
            setVisibility(0);
        }
    }

    public final void hide() {
        if (isShown() && !this.detached && getMeasuredHeight() != 0) {
            CircularReveal.createCircularHide(this, this.revealX, this.revealY, this.radius, 0.0f).start();
        } else {
            setVisibility(4);
        }
    }

    public final void setVisible(boolean visible) {
        if (visible) {
            show();
        } else {
            hide();
        }
    }
}
