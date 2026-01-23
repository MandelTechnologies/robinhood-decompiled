package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RhyTransactionDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$RhyTransactionDetailPreview$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyTransactionDetailComposable2 extends FunctionReferenceImpl implements Function1<Integer, String> {
    RhyTransactionDetailComposable2(Object obj) {
        super(1, obj, Context.class, "getString", "getString(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i) {
        return ((Context) this.receiver).getString(i);
    }
}
