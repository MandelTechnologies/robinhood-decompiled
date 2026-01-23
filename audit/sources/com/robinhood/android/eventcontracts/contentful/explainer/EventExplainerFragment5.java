package com.robinhood.android.eventcontracts.contentful.explainer;

import com.robinhood.android.futures.contracts.FuturesEventExplainerFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventExplainerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.contentful.explainer.EventExplainerFragment$Content$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventExplainerFragment5 extends FunctionReferenceImpl implements Function0<Unit> {
    EventExplainerFragment5(Object obj) {
        super(0, obj, FuturesEventExplainerFragmentKey.Callbacks.class, "onDismissExplainer", "onDismissExplainer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesEventExplainerFragmentKey.Callbacks) this.receiver).onDismissExplainer();
    }
}
