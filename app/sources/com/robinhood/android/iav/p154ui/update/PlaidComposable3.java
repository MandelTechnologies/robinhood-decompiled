package com.robinhood.android.iav.p154ui.update;

import com.plaid.link.result.LinkResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$plaidLauncher$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class PlaidComposable3 extends FunctionReferenceImpl implements Function1<LinkResult, Unit> {
    PlaidComposable3(Object obj) {
        super(1, obj, PlaidDuxo.class, "onLinkResult", "onLinkResult(Lcom/plaid/link/result/LinkResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkResult linkResult) {
        invoke2(linkResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PlaidDuxo) this.receiver).onLinkResult(p0);
    }
}
