package com.robinhood.android.disclosures.lib.homescreen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HomescreenDisclosureComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposableKt$DashboardDisclosureComponent$1$1, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class HomescreenDisclosureComposable4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    HomescreenDisclosureComposable4(Object obj) {
        super(1, obj, HomescreenDisclosureDuxo.class, "onShowDialog", "onShowDialog(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        ((HomescreenDisclosureDuxo) this.receiver).onShowDialog(num);
    }
}
