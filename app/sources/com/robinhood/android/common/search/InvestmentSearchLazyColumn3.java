package com.robinhood.android.common.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentSearchLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$investmentSearchItems$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class InvestmentSearchLazyColumn3 extends FunctionReferenceImpl implements Function1<SearchItem, Unit> {
    InvestmentSearchLazyColumn3(Object obj) {
        super(1, obj, InvestmentSearchLazyColumn.class, "onItemClicked", "onItemClicked(Lcom/robinhood/android/common/search/SearchItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SearchItem searchItem) {
        invoke2(searchItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SearchItem p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestmentSearchLazyColumn) this.receiver).onItemClicked(p0);
    }
}
