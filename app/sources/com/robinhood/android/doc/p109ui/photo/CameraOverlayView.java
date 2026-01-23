package com.robinhood.android.doc.p109ui.photo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.robinhood.android.camera.CameraUtils;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.gold.contracts.GoldFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CameraOverlayView.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0002J0\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001eH\u0002J\u0006\u0010)\u001a\u00020\u001cJ\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0014R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/CameraOverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "aspectRatio", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "strokeWidth", "targetPadding", "framePaint", "Landroid/graphics/Paint;", "targetRect", "Landroid/graphics/RectF;", GoldFeature.MARGIN, "getMargin", "targetCorners", "", "Lcom/robinhood/android/doc/ui/photo/CameraOverlayView$Corner;", "Landroid/graphics/Path;", "onSizeChanged", "", "w", "", "h", "oldw", "oldh", "updateTargetRect", "updateCorner", "path", "xCorner", "yCorner", "xMultiplier", "yMultiplier", "flip", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Corner", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CameraOverlayView extends View {
    private static final int FULL_VIEW_FLIP_DISTANCE = 8000;
    private float aspectRatio;
    private final Paint framePaint;
    private final float margin;
    private final float strokeWidth;
    private final Map<Corner, Path> targetCorners;
    private final float targetPadding;
    private final RectF targetRect;
    public static final int $stable = 8;

    public /* synthetic */ CameraOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraOverlayView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float dimension = context.getResources().getDimension(C14254R.dimen.doc_upload_camera_frame_stroke);
        this.strokeWidth = dimension;
        this.targetPadding = context.getResources().getDimension(C14254R.dimen.doc_upload_camera_target_padding);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(dimension);
        paint.setStyle(Paint.Style.STROKE);
        this.framePaint = paint;
        this.targetRect = new RectF();
        this.margin = context.getResources().getDimension(C13997R.dimen.rds_spacing_default);
        Corner[] cornerArrValues = Corner.values();
        ArrayList arrayList = new ArrayList(cornerArrValues.length);
        for (Corner corner : cornerArrValues) {
            arrayList.add(Tuples4.m3642to(corner, new Path()));
        }
        this.targetCorners = MapsKt.toMap(arrayList);
        int[] CameraOverlayView = C14254R.styleable.CameraOverlayView;
        Intrinsics.checkNotNullExpressionValue(CameraOverlayView, "CameraOverlayView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CameraOverlayView, 0, 0);
        this.framePaint.setColor(typedArrayObtainStyledAttributes.getColor(C14254R.styleable.CameraOverlayView_frameColor, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            setAspectRatio(1.4142f);
        }
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
        updateTargetRect();
        invalidate();
    }

    public final float getMargin() {
        return this.margin;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/CameraOverlayView$Corner;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "xyDirectionality", "Lkotlin/Pair;", "", "getXyDirectionality", "()Lkotlin/Pair;", "getRelevantCorners", "", "rect", "Landroid/graphics/RectF;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Corner {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Corner[] $VALUES;
        public static final Corner TOP_LEFT = new Corner("TOP_LEFT", 0);
        public static final Corner TOP_RIGHT = new Corner("TOP_RIGHT", 1);
        public static final Corner BOTTOM_LEFT = new Corner("BOTTOM_LEFT", 2);
        public static final Corner BOTTOM_RIGHT = new Corner("BOTTOM_RIGHT", 3);

        /* compiled from: CameraOverlayView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Corner.values().length];
                try {
                    iArr[Corner.TOP_LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Corner.TOP_RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Corner.BOTTOM_LEFT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Corner.BOTTOM_RIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Corner[] $values() {
            return new Corner[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        }

        public static EnumEntries<Corner> getEntries() {
            return $ENTRIES;
        }

        private Corner(String str, int i) {
        }

        static {
            Corner[] cornerArr$values = $values();
            $VALUES = cornerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cornerArr$values);
        }

        public final Tuples2<Integer, Integer> getXyDirectionality() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return Tuples4.m3642to(1, 1);
            }
            if (i == 2) {
                return Tuples4.m3642to(-1, 1);
            }
            if (i == 3) {
                return Tuples4.m3642to(1, -1);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return Tuples4.m3642to(-1, -1);
        }

        public final Tuples2<Float, Float> getRelevantCorners(RectF rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return Tuples4.m3642to(Float.valueOf(rect.left), Float.valueOf(rect.top));
            }
            if (i == 2) {
                return Tuples4.m3642to(Float.valueOf(rect.right), Float.valueOf(rect.top));
            }
            if (i == 3) {
                return Tuples4.m3642to(Float.valueOf(rect.left), Float.valueOf(rect.bottom));
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return Tuples4.m3642to(Float.valueOf(rect.right), Float.valueOf(rect.bottom));
        }

        public static Corner valueOf(String str) {
            return (Corner) Enum.valueOf(Corner.class, str);
        }

        public static Corner[] values() {
            return (Corner[]) $VALUES.clone();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateTargetRect();
    }

    private final void updateTargetRect() {
        this.targetRect.set(CameraUtils.INSTANCE.getCroppingRect(getWidth(), getHeight(), this.aspectRatio, this.margin));
        for (Map.Entry<Corner, Path> entry : this.targetCorners.entrySet()) {
            Corner key = entry.getKey();
            Path value = entry.getValue();
            Tuples2<Float, Float> relevantCorners = key.getRelevantCorners(this.targetRect);
            float fFloatValue = relevantCorners.component1().floatValue();
            float fFloatValue2 = relevantCorners.component2().floatValue();
            Tuples2<Integer, Integer> xyDirectionality = key.getXyDirectionality();
            updateCorner(value, fFloatValue, fFloatValue2, xyDirectionality.component1().intValue(), xyDirectionality.component2().intValue());
        }
    }

    private final void updateCorner(Path path, float xCorner, float yCorner, int xMultiplier, int yMultiplier) {
        float f = this.targetPadding;
        path.reset();
        float f2 = xMultiplier * f;
        float f3 = 2;
        float f4 = yMultiplier * f;
        float f5 = yCorner + f4;
        path.moveTo((f2 * f3) + xCorner, f5);
        float f6 = xCorner + f2;
        path.lineTo(f6, f5);
        path.lineTo(f6, yCorner + (f4 * f3));
    }

    public final void flip() throws Resources.NotFoundException {
        setCameraDistance(getResources().getDisplayMetrics().density * FULL_VIEW_FLIP_DISTANCE);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), C14254R.animator.flip_overlay_anim);
        animatorLoadAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorLoadAnimator.setTarget(this);
        animatorLoadAnimator.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(this.targetRect, this.framePaint);
        Iterator<T> it = this.targetCorners.values().iterator();
        while (it.hasNext()) {
            canvas.drawPath((Path) it.next(), this.framePaint);
        }
    }
}
