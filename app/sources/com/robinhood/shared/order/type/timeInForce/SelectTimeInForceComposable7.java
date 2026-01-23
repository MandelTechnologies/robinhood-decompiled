package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SelectTimeInForceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SelectTimeInForceComposable7 extends AdaptedFunctionReference implements Function0<Unit> {
    SelectTimeInForceComposable7(Object obj) {
        super(0, obj, LifecycleAwareNavigator.class, "popBackStack", "popBackStack(Z)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LifecycleAwareNavigator.popBackStack$default((LifecycleAwareNavigator) this.receiver, false, 1, null);
    }
}
