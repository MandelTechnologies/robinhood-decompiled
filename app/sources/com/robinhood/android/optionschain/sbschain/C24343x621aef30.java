package com.robinhood.android.optionschain.sbschain;

import com.robinhood.models.p320db.OptionContractType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$1$2$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24343x621aef30 extends FunctionReferenceImpl implements Function1<OptionContractType, Unit> {
    C24343x621aef30(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "onContractTypeClicked", "onContractTypeClicked(Lcom/robinhood/models/db/OptionContractType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OptionContractType optionContractType) {
        invoke2(optionContractType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OptionContractType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).onContractTypeClicked(p0);
    }
}
