package com.robinhood.microgram.sdui;

import com.robinhood.microgram.sdui.MicrogramScreenFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MicrogramScreenFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$4$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class MicrogramScreenFragment6 extends FunctionReferenceImpl implements Function0<Unit> {
    MicrogramScreenFragment6(Object obj) {
        super(0, obj, MicrogramScreenFragment.Callbacks.class, "dismissChild", "dismissChild()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MicrogramScreenFragment.Callbacks) this.receiver).dismissChild();
    }
}
