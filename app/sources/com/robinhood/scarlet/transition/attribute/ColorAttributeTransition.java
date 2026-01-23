package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorAttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/ColorAttributeTransition;", "T", "", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;)V", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/animation/Animator;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ColorAttributeTransition<T> extends AttributeTransition<T, Integer> {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.scarlet.transition.AttributeTransition
    public /* bridge */ /* synthetic */ Animator createAnimator(Object obj, Integer num, Integer num2, Integer num3) {
        return createAnimator2((ColorAttributeTransition<T>) obj, num, num2, num3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorAttributeTransition(StyleableProperty<? super T, Integer> property) {
        super(property, false, false, 6, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }

    /* renamed from: createAnimator, reason: avoid collision after fix types in other method */
    protected Animator createAnimator2(T view, Integer currentValue, Integer previousValue, Integer newValue) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(view, "view");
        if (newValue != null) {
            if (currentValue != null) {
                iIntValue = currentValue.intValue();
            } else if (previousValue != null) {
                iIntValue = previousValue.intValue();
            }
            if (iIntValue == newValue.intValue()) {
                return null;
            }
            StyleableProperty<? super T, Integer> property = getProperty();
            GammaEvaluator gammaEvaluator = GammaEvaluator.INSTANCE;
            Intrinsics.checkNotNull(gammaEvaluator, "null cannot be cast to non-null type android.animation.TypeEvaluator<kotlin.Int?>");
            return ObjectAnimator.ofObject(view, property, gammaEvaluator, Integer.valueOf(iIntValue), newValue);
        }
        return null;
    }
}
