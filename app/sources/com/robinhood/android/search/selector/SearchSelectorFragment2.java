package com.robinhood.android.search.selector;

import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$adapter$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SearchSelectorFragment2 extends FunctionReferenceImpl implements Function2<SearchSelectorViewState3.SecurityRow, Component.ComponentType, Unit> {
    SearchSelectorFragment2(Object obj) {
        super(2, obj, SearchSelectorFragment.class, "onSearchItemClicked", "onSearchItemClicked(Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SearchSelectorViewState3.SecurityRow securityRow, Component.ComponentType componentType) {
        invoke2(securityRow, componentType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SearchSelectorViewState3.SecurityRow p0, Component.ComponentType p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((SearchSelectorFragment) this.receiver).onSearchItemClicked(p0, p1);
    }
}
