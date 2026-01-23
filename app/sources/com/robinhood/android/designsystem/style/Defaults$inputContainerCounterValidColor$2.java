package com.robinhood.android.designsystem.style;

import android.content.res.ColorStateList;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty4;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Defaults$inputContainerCounterValidColor$2 extends FunctionReferenceImpl implements Function2<RdsTextInputContainerView, ColorStateList, Unit> {
    Defaults$inputContainerCounterValidColor$2(Object obj) {
        super(2, obj, KProperty4.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RdsTextInputContainerView rdsTextInputContainerView, ColorStateList colorStateList) {
        invoke2(rdsTextInputContainerView, colorStateList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RdsTextInputContainerView p0, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((KProperty4) this.receiver).set(p0, colorStateList);
    }
}
