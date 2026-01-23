package com.robinhood.android.support.call;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ReviewCallDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ReviewCallDetailsFragment3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    ReviewCallDetailsFragment3(Object obj) {
        super(1, obj, ReviewCallDetailsFragment.class, "onClickEditPhoneNumber", "onClickEditPhoneNumber(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((ReviewCallDetailsFragment) this.receiver).onClickEditPhoneNumber(z);
    }
}
