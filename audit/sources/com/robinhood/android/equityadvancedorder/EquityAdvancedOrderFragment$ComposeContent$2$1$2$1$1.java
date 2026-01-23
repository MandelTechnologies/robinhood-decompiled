package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.focus.FocusManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderFragment$ComposeContent$2$1$2$1$1 extends FunctionReferenceImpl implements Function1<FocusManager, Unit> {
    EquityAdvancedOrderFragment$ComposeContent$2$1$2$1$1(Object obj) {
        super(1, obj, EquityAdvancedOrderDuxo.class, "hideKeyboard", "hideKeyboard(Landroidx/compose/ui/focus/FocusManager;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusManager focusManager) {
        invoke2(focusManager);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusManager focusManager) {
        ((EquityAdvancedOrderDuxo) this.receiver).hideKeyboard(focusManager);
    }
}
