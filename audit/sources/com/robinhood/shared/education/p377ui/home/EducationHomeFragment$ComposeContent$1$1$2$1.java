package com.robinhood.shared.education.p377ui.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EducationHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class EducationHomeFragment$ComposeContent$1$1$2$1 extends AdaptedFunctionReference implements Function0<Unit> {
    EducationHomeFragment$ComposeContent$1$1$2$1(Object obj) {
        super(0, obj, EducationHomeFragment.class, "onBackPressed", "onBackPressed()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EducationHomeFragment) this.receiver).onBackPressed();
    }
}
