package com.robinhood.android.listsoptions.optionwatchlist;

import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionWatchlistHubContentAdapter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter$onBindViewHolder$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubContentAdapter2 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionWatchlistHubContentAdapter2(Object obj) {
        super(0, obj, OptionWatchlistHubContentAdapter.Callbacks.class, "onQuoteClicked", "onQuoteClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionWatchlistHubContentAdapter.Callbacks) this.receiver).onQuoteClicked();
    }
}
