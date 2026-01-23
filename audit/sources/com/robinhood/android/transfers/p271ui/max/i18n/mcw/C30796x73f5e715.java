package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$10$2$1 */
/* loaded from: classes9.dex */
/* synthetic */ class C30796x73f5e715 extends FunctionReferenceImpl implements Function1<Money, Unit> {
    C30796x73f5e715(Object obj) {
        super(1, obj, InternationalTransferV2Duxo.class, "onSuggestedDepositAmountClick", "onSuggestedDepositAmountClick(Lcom/robinhood/models/util/Money;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Money money) {
        invoke2(money);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Money p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InternationalTransferV2Duxo) this.receiver).onSuggestedDepositAmountClick(p0);
    }
}
