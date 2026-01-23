package com.robinhood.android.slip.lib.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SlipUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.lib.fragments.SlipUpsellFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipUpsellFragment2 extends AdaptedFunctionReference implements Function0<Unit> {
    SlipUpsellFragment2(Object obj) {
        super(0, obj, SlipUpsellFragment.class, "dismiss", "dismiss()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SlipUpsellFragment) this.receiver).dismiss();
    }
}
