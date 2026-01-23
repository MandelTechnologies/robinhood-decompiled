package com.robinhood.android.acatsin.accountcontents;

import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountContentsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInAccountContentsFragment2 extends FunctionReferenceImpl implements Function1<AccountContentItem, Unit> {
    AcatsInAccountContentsFragment2(Object obj) {
        super(1, obj, AcatsInAccountContentsDuxo.class, "onItemSelected", "onItemSelected(Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountContentItem accountContentItem) {
        invoke2(accountContentItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountContentItem p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AcatsInAccountContentsDuxo) this.receiver).onItemSelected(p0);
    }
}
