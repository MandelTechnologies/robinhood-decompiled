package com.robinhood.android.listsoptions.optionwatchlist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistHubContentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$itemTouchHelperCallbacks$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubContentFragment9 extends FunctionReferenceImpl implements Function1<String, Unit> {
    OptionWatchlistHubContentFragment9(Object obj) {
        super(1, obj, OptionWatchlistHubContentDuxo.class, "synchronizeListDeleteItem", "synchronizeListDeleteItem(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionWatchlistHubContentDuxo) this.receiver).synchronizeListDeleteItem(p0);
    }
}
