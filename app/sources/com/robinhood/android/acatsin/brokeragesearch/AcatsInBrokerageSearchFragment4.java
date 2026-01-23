package com.robinhood.android.acatsin.brokeragesearch;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsInBrokerageSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$cantFindBrokerageAdapter$1$onBindViewHolder$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInBrokerageSearchFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    AcatsInBrokerageSearchFragment4(Object obj) {
        super(0, obj, AcatsInBrokerageSearchDuxo.class, "onManualBrokerageEntrySelected", "onManualBrokerageEntrySelected()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AcatsInBrokerageSearchDuxo) this.receiver).onManualBrokerageEntrySelected();
    }
}
