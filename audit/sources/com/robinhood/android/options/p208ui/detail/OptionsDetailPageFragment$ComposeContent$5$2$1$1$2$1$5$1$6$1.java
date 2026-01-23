package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$6$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$6$1(Object obj) {
        super(1, obj, OptionsDetailPageFragment.class, "onDisclosureTapped", "onDisclosureTapped(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsDetailPageFragment) this.receiver).onDisclosureTapped(p0);
    }
}
