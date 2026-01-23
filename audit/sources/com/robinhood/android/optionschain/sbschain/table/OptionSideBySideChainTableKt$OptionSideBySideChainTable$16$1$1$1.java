package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$1$1(Object obj) {
        super(0, obj, OptionSideBySideChainTableDuxo.class, "logHorizontalScrollStart", "logHorizontalScrollStart()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionSideBySideChainTableDuxo) this.receiver).logHorizontalScrollStart();
    }
}
