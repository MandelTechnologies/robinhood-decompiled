package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$5$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24346x380b4666 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    C24346x380b4666(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "setSpreadSelectedOnCurrentPage", "setSpreadSelectedOnCurrentPage(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((OptionSideBySideChainDuxo) this.receiver).setSpreadSelectedOnCurrentPage(z);
    }
}
