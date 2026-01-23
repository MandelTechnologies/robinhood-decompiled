package com.robinhood.android.debitcard.linking.p098ui;

import android.view.KeyEvent;
import com.stripe.android.view.CardInputWidget;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DebitCardNumbersInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$onViewCreated$1$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardNumbersInputFragment6 extends AdaptedFunctionReference implements Function1<KeyEvent, Unit> {
    DebitCardNumbersInputFragment6(Object obj) {
        super(1, obj, CardInputWidget.class, "dispatchKeyEvent", "dispatchKeyEvent(Landroid/view/KeyEvent;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent keyEvent) {
        ((CardInputWidget) this.receiver).dispatchKeyEvent(keyEvent);
    }
}
