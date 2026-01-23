package com.robinhood.android.indexes.detail;

import com.robinhood.models.p320db.Security;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class IndexDetailPageFragment2 extends FunctionReferenceImpl implements Function2<Boolean, Security, Unit> {
    IndexDetailPageFragment2(Object obj) {
        super(2, obj, IndexDetailPageFragment.class, "addToWatchlist", "addToWatchlist(ZLcom/robinhood/models/db/Security;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Security security) {
        invoke(bool.booleanValue(), security);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Security p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((IndexDetailPageFragment) this.receiver).addToWatchlist(z, p1);
    }
}
