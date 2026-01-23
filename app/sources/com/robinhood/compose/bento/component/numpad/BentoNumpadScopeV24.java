package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpadScopeV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$BentoNumpadWithButton$1$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class BentoNumpadScopeV24 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    BentoNumpadScopeV24(Object obj) {
        super(1, obj, BentoNumpadScopeV22.class, "onKeyPress", "onKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BentoNumpadScopeV22) this.receiver).onKeyPress(p0);
    }
}
