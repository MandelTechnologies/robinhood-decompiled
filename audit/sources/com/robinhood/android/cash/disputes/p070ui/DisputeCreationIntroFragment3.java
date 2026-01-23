package com.robinhood.android.cash.disputes.p070ui;

import com.robinhood.android.cash.disputes.p070ui.DisputeCreationIntroFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DisputeCreationIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.DisputeCreationIntroFragment$onViewCreated$1$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DisputeCreationIntroFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    DisputeCreationIntroFragment3(Object obj) {
        super(0, obj, DisputeCreationIntroFragment.Callbacks.class, "onIntroContinue", "onIntroContinue()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DisputeCreationIntroFragment.Callbacks) this.receiver).onIntroContinue();
    }
}
