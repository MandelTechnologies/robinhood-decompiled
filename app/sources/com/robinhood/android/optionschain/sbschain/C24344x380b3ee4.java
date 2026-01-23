package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$3$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24344x380b3ee4 extends FunctionReferenceImpl implements Function1<OptionLegBundlesToReplace, Unit> {
    C24344x380b3ee4(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "onMultilegReplace", "onMultilegReplace(Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OptionLegBundlesToReplace optionLegBundlesToReplace) {
        invoke2(optionLegBundlesToReplace);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OptionLegBundlesToReplace p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).onMultilegReplace(p0);
    }
}
