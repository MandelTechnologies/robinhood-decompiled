package com.withpersona.sdk2.inquiry.governmentid.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.withpersona.sdk2.inquiry.governmentid.R$styleable;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpotlightView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/SpotlightView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "init", "", "left", "top", "right", "bottom", "onTargetViewLayoutChange", "(IIII)V", "onFinishInflate", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "targetViewId", "I", "", "radius", "F", "getRadius", "()F", "setRadius", "(F)V", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SpotlightView extends View {
    private Path clipPath;
    private float radius;
    private int targetViewId;

    public final float getRadius() {
        return this.radius;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public SpotlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, R$styleable.Pi2Spotlight, 0, 0)) == null) {
            return;
        }
        try {
            this.targetViewId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Pi2Spotlight_pi2Target, 0);
            this.radius = typedArrayObtainStyledAttributes.getDimension(R$styleable.Pi2Spotlight_pi2Radius, 0.0f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(this, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotlightView.onFinishInflate$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$2(final SpotlightView spotlightView) {
        View viewFindViewById;
        Object parent = spotlightView.getParent();
        if ((parent instanceof View) && (viewFindViewById = ((View) parent).findViewById(spotlightView.targetViewId)) != null) {
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f$0.onTargetViewLayoutChange(i, i2, i3, i4);
                }
            });
            spotlightView.onTargetViewLayoutChange(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTargetViewLayoutChange(int left, int top, int right, int bottom) {
        Path path = new Path();
        float f = this.radius;
        path.addRoundRect(left, top, right, bottom, f, f, Path.Direction.CW);
        this.clipPath = path;
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        if (path != null) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }
}
