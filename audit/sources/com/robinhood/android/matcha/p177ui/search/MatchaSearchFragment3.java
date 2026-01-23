package com.robinhood.android.matcha.p177ui.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaSearchFragment3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    MatchaSearchFragment3(Object obj) {
        super(1, obj, MatchaSearchFragment.class, "onTagClick", "onTagClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((MatchaSearchFragment) this.receiver).onTagClick(i);
    }
}
