package com.robinhood.android.gold.downgrade;

import com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldDowngradeValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment$ComposeContent$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldDowngradeValuePropsFragment5 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldDowngradeValuePropsFragment5(Object obj) {
        super(0, obj, GoldDowngradeValuePropsFragment.Callbacks.class, "onAbortDowngrade", "onAbortDowngrade()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldDowngradeValuePropsFragment.Callbacks) this.receiver).onAbortDowngrade();
    }
}
