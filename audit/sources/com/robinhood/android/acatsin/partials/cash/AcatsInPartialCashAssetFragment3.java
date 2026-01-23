package com.robinhood.android.acatsin.partials.cash;

import android.view.KeyEvent;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialCashAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$3$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInPartialCashAssetFragment3 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    AcatsInPartialCashAssetFragment3(Object obj) {
        super(1, obj, RhMoneyInputView.class, "dispatchInputKeyEvent", "dispatchInputKeyEvent(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RhMoneyInputView) this.receiver).dispatchInputKeyEvent(p0);
    }
}
