package com.robinhood.android.common.onboarding.p085ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseSplashFragment$onViewCreated$2$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class BaseSplashFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    BaseSplashFragment3(Object obj) {
        super(0, obj, BaseSplashFragment.class, "onLinkTextClicked", "onLinkTextClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseSplashFragment) this.receiver).onLinkTextClicked();
    }
}
