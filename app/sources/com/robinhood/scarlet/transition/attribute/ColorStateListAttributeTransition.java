package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import com.robinhood.utils.p409ui.color.ColorStateLists;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorStateListAttributeTransition.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0015B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u0014R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "T", "", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "Landroid/content/res/ColorStateList;", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "applyNullValue", "", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;Z)V", "simpleProperty", "Landroid/util/Property;", "", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Ljava/lang/Object;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)Landroid/animation/Animator;", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ColorStateListAttributeTransition<T> extends AttributeTransition<T, ColorStateList> {
    private final Property<T, Integer> simpleProperty;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ColorStateListAttributeTransition(StyleableProperty styleableProperty, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styleableProperty, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.scarlet.transition.AttributeTransition
    public /* bridge */ /* synthetic */ Animator createAnimator(Object obj, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3) {
        return createAnimator2((ColorStateListAttributeTransition<T>) obj, colorStateList, colorStateList2, colorStateList3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorStateListAttributeTransition(StyleableProperty<? super T, ColorStateList> property, boolean z) {
        super(property, false, z, 2, null);
        Intrinsics.checkNotNullParameter(property, "property");
        this.simpleProperty = INSTANCE.simple(property);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: createAnimator, reason: avoid collision after fix types in other method */
    protected Animator createAnimator2(T view, ColorStateList currentValue, ColorStateList previousValue, ColorStateList newValue) {
        int[] drawableState;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 == null || (drawableState = view2.getDrawableState()) == null) {
            drawableState = new int[0];
        }
        Integer numValueOf2 = newValue != null ? Integer.valueOf(ColorStateLists.getColorForState(newValue, drawableState)) : null;
        if (numValueOf2 == null) {
            if (!getApplyNullValue()) {
                return null;
            }
            applyTo(view, newValue);
        }
        if (currentValue != null) {
            numValueOf = Integer.valueOf(ColorStateLists.getColorForState(currentValue, drawableState));
        } else {
            numValueOf = previousValue != null ? Integer.valueOf(ColorStateLists.getColorForState(previousValue, drawableState)) : numValueOf2;
        }
        if (Intrinsics.areEqual(numValueOf, numValueOf2)) {
            getProperty().set(view, newValue);
            return null;
        }
        return ObjectAnimator.ofObject(view, this.simpleProperty, GammaEvaluator.INSTANCE, numValueOf, numValueOf2);
    }

    /* compiled from: ColorStateListAttributeTransition.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0001*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition$Companion;", "", "<init>", "()V", "simple", "Landroid/util/Property;", "T", "", "Landroid/content/res/ColorStateList;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Property<T, Integer> simple(final Property<? super T, ColorStateList> property) {
            final String str = property.getName() + "-simple";
            final Class cls = Integer.TYPE;
            return new Property<T, Integer>(cls, str) { // from class: com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition$Companion$simple$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.util.Property
                public /* bridge */ /* synthetic */ Integer get(Object obj) {
                    return get((ColorStateListAttributeTransition2<T>) obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.util.Property
                public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
                    set((ColorStateListAttributeTransition2<T>) obj, num.intValue());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.util.Property
                public Integer get(T view) {
                    int[] drawableState;
                    Intrinsics.checkNotNullParameter(view, "view");
                    ColorStateList colorStateList = property.get(view);
                    int colorForState = 0;
                    if (colorStateList != null) {
                        View view2 = view instanceof View ? (View) view : null;
                        if (view2 == null || (drawableState = view2.getDrawableState()) == null) {
                            drawableState = new int[0];
                        }
                        colorForState = ColorStateLists.getColorForState(colorStateList, drawableState);
                    }
                    return Integer.valueOf(colorForState);
                }

                public void set(T view, int value) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    property.set(view, ColorStateList.valueOf(value));
                }
            };
        }
    }
}
