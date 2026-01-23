package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.android.matcha.p177ui.search.MatchaSearchAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaSearchAdapter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchAdapter$onBindViewHolder$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaSearchAdapter3 extends FunctionReferenceImpl implements Function0<Unit> {
    MatchaSearchAdapter3(Object obj) {
        super(0, obj, MatchaSearchAdapter.Callbacks.class, "onShareQrClick", "onShareQrClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MatchaSearchAdapter.Callbacks) this.receiver).onShareQrClick();
    }
}
