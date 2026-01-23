package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition;
import com.robinhood.utils.p409ui.animation.AndroidProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: DrawableAttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0012B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "T", "Landroid/view/View;", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "Landroid/graphics/drawable/Drawable;", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "isOptIn", "", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;Z)V", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Landroid/animation/Animator;", "DualDrawable", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DrawableAttributeTransition<T extends View> extends AttributeTransition<T, Drawable> {
    public static final int $stable = 8;

    public /* synthetic */ DrawableAttributeTransition(StyleableProperty styleableProperty, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styleableProperty, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableAttributeTransition(StyleableProperty<? super T, Drawable> property, boolean z) {
        super(property, z, false, 4, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.scarlet.transition.AttributeTransition
    public Animator createAnimator(final T view, Drawable currentValue, Drawable previousValue, Drawable newValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (currentValue == null || newValue == null) {
            return null;
        }
        Drawable drawableMutate = currentValue.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        Drawable drawableMutate2 = newValue.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate2, "mutate(...)");
        final DualDrawable dualDrawable = new DualDrawable(drawableMutate, drawableMutate2);
        getProperty().set(view, dualDrawable);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dualDrawable, DualDrawable.INSTANCE.getFRACTION(), 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition$createAnimator$1$1
            private boolean hasCancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.hasCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.hasCancelled) {
                    return;
                }
                StyleableProperty property = this.this$0.getProperty();
                View view2 = view;
                Drawable top = dualDrawable.getTop();
                top.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(dualDrawable.getInitialAlphaFractionTop() * 255), 0, 255));
                Unit unit = Unit.INSTANCE;
                property.set(view2, top);
            }
        });
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableAttributeTransition.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0019¨\u0006&"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition$DualDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "bottom", "Landroid/graphics/drawable/Drawable;", "top", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getBottom", "()Landroid/graphics/drawable/Drawable;", "getTop", "initialAlphaFractionBottom", "", "getInitialAlphaFractionBottom", "()F", "initialAlphaFractionTop", "getInitialAlphaFractionTop", "jumpedToCurrentState", "", "getJumpedToCurrentState", "()Z", "setJumpedToCurrentState", "(Z)V", "value", "alphaMultiplier", "setAlphaMultiplier", "(F)V", "fraction", "getFraction", "setFraction", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "getAlpha", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes26.dex */
    static final class DualDrawable extends LayerDrawable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Property<DualDrawable, Float> FRACTION;
        private float alphaMultiplier;
        private final Drawable bottom;
        private float fraction;
        private final float initialAlphaFractionBottom;
        private final float initialAlphaFractionTop;
        private boolean jumpedToCurrentState;
        private final Drawable top;

        public final Drawable getBottom() {
            return this.bottom;
        }

        public final Drawable getTop() {
            return this.top;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DualDrawable(Drawable bottom, Drawable top) {
            super(new Drawable[]{bottom, top});
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(top, "top");
            this.bottom = bottom;
            this.top = top;
            this.initialAlphaFractionBottom = bottom.getAlpha() / 255.0f;
            this.initialAlphaFractionTop = top.getAlpha() / 255.0f;
            this.alphaMultiplier = 1.0f;
            setPaddingMode(1);
        }

        public final float getInitialAlphaFractionBottom() {
            return this.initialAlphaFractionBottom;
        }

        public final float getInitialAlphaFractionTop() {
            return this.initialAlphaFractionTop;
        }

        public final boolean getJumpedToCurrentState() {
            return this.jumpedToCurrentState;
        }

        public final void setJumpedToCurrentState(boolean z) {
            this.jumpedToCurrentState = z;
        }

        private final void setAlphaMultiplier(float f) {
            if (this.alphaMultiplier == f) {
                return;
            }
            this.alphaMultiplier = f;
            invalidateSelf();
        }

        public final float getFraction() {
            return this.fraction;
        }

        public final void setFraction(float f) {
            this.fraction = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (!this.jumpedToCurrentState) {
                jumpToCurrentState();
                this.jumpedToCurrentState = true;
            }
            float f = this.alphaMultiplier;
            Drawable drawable = this.bottom;
            float f2 = 255;
            drawable.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(this.initialAlphaFractionBottom * f * f2), 0, 255));
            drawable.draw(canvas);
            Drawable drawable2 = this.top;
            drawable2.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(this.fraction * f * this.initialAlphaFractionTop * f2), 0, 255));
            drawable2.draw(canvas);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
            setAlphaMultiplier(alpha / 255.0f);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
            return RangesKt.coerceIn(MathKt.roundToInt(this.alphaMultiplier * 255), 0, 255);
        }

        /* compiled from: DrawableAttributeTransition.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition$DualDrawable$Companion;", "", "<init>", "()V", "FRACTION", "Landroid/util/Property;", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition$DualDrawable;", "", "getFRACTION", "()Landroid/util/Property;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Property<DualDrawable, Float> getFRACTION() {
                return DualDrawable.FRACTION;
            }
        }

        static {
            final DrawableAttributeTransition2 drawableAttributeTransition2 = new MutablePropertyReference1Impl() { // from class: com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition$DualDrawable$Companion$FRACTION$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return Float.valueOf(((DrawableAttributeTransition.DualDrawable) obj).getFraction());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
                public void set(Object obj, Object obj2) {
                    ((DrawableAttributeTransition.DualDrawable) obj).setFraction(((Number) obj2).floatValue());
                }
            };
            AndroidProperties androidProperties = AndroidProperties.INSTANCE;
            final String name = drawableAttributeTransition2.getName();
            final Class<Float> cls = Float.class;
            FRACTION = new Property<DualDrawable, Float>(name, cls) { // from class: com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition$DualDrawable$special$$inlined$asAndroidProperty$1
                @Override // android.util.Property
                public boolean isReadOnly() {
                    return false;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Float, java.lang.Object] */
                @Override // android.util.Property
                public Float get(DrawableAttributeTransition.DualDrawable view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    return drawableAttributeTransition2.get(view);
                }

                @Override // android.util.Property
                public void set(DrawableAttributeTransition.DualDrawable view, Float value) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    drawableAttributeTransition2.set(view, value);
                }
            };
        }
    }
}
