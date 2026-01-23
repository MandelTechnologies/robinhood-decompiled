package com.robinhood.android.slip.lib.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.lib.fragments.SlipUpsellFragment$ComposeContent$1$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipUpsellFragment3 extends AdaptedFunctionReference implements Function1<String, Unit> {
    SlipUpsellFragment3(Object obj) {
        super(1, obj, SlipUpsellFragment.class, "handleDeeplink", "handleDeeplink(Ljava/lang/String;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SlipUpsellFragment) this.receiver).handleDeeplink(p0);
    }
}
