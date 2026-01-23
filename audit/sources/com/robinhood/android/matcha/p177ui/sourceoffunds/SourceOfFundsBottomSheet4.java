package com.robinhood.android.matcha.p177ui.sourceoffunds;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceOfFundsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheet$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class SourceOfFundsBottomSheet4 extends FunctionReferenceImpl implements Function1<String, Unit> {
    SourceOfFundsBottomSheet4(Object obj) {
        super(1, obj, SourceOfFundsBottomSheetDuxo.class, "selectAccount", "selectAccount(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SourceOfFundsBottomSheetDuxo) this.receiver).selectAccount(p0);
    }
}
