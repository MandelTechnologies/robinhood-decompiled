package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatAttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/FloatAttributeTransition;", "T", "", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "isOptIn", "", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;Z)V", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Landroid/animation/Animator;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FloatAttributeTransition<T> extends AttributeTransition<T, Float> {
    public static final int $stable = 8;

    public /* synthetic */ FloatAttributeTransition(StyleableProperty styleableProperty, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styleableProperty, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.scarlet.transition.AttributeTransition
    public /* bridge */ /* synthetic */ Animator createAnimator(Object obj, Float f, Float f2, Float f3) {
        return createAnimator2((FloatAttributeTransition<T>) obj, f, f2, f3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatAttributeTransition(StyleableProperty<? super T, Float> property, boolean z) {
        super(property, z, false, 4, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }

    /* renamed from: createAnimator, reason: avoid collision after fix types in other method */
    protected Animator createAnimator2(T view, Float currentValue, Float previousValue, Float newValue) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(view, "view");
        if (newValue != null) {
            if (currentValue != null) {
                fFloatValue = currentValue.floatValue();
            } else if (previousValue != null) {
                fFloatValue = previousValue.floatValue();
            }
            if (Intrinsics.areEqual(fFloatValue, newValue)) {
                return null;
            }
            return ObjectAnimator.ofFloat(view, getProperty(), fFloatValue, newValue.floatValue());
        }
        return null;
    }
}
