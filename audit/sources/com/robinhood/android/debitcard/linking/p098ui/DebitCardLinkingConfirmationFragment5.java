package com.robinhood.android.debitcard.linking.p098ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DebitCardLinkingConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingConfirmationFragment$onViewCreated$1$2$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardLinkingConfirmationFragment5 extends FunctionReferenceImpl implements Function0<Unit> {
    DebitCardLinkingConfirmationFragment5(Object obj) {
        super(0, obj, DebitCardLinkingConfirmationFragment.class, "onSecondaryButtonClicked", "onSecondaryButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DebitCardLinkingConfirmationFragment) this.receiver).onSecondaryButtonClicked();
    }
}
