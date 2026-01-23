package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.advancedorderbottomsheet.EditingField;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderFragment$ComposeContent$2$1$5$1 extends FunctionReferenceImpl implements Function1<EditingField, Unit> {
    EquityAdvancedOrderFragment$ComposeContent$2$1$5$1(Object obj) {
        super(1, obj, EquityAdvancedOrderDuxo.class, "handleRowClicked", "handleRowClicked(Lcom/robinhood/android/advancedorderbottomsheet/EditingField;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EditingField editingField) {
        invoke2(editingField);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EditingField p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EquityAdvancedOrderDuxo) this.receiver).handleRowClicked(p0);
    }
}
