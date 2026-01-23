package com.robinhood.android.matcha.p177ui.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaSearchFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    MatchaSearchFragment4(Object obj) {
        super(0, obj, MatchaSearchFragment.class, "onTagRemoveClick", "onTagRemoveClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MatchaSearchFragment) this.receiver).onTagRemoveClick();
    }
}
