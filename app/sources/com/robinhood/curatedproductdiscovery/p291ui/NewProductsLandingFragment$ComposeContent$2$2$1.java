package com.robinhood.curatedproductdiscovery.p291ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewProductsLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
/* synthetic */ class NewProductsLandingFragment$ComposeContent$2$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    NewProductsLandingFragment$ComposeContent$2$2$1(Object obj) {
        super(1, obj, NewProductsLandingFragment.class, "onDisclosureClick", "onDisclosureClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((NewProductsLandingFragment) this.receiver).onDisclosureClick(p0);
    }
}
