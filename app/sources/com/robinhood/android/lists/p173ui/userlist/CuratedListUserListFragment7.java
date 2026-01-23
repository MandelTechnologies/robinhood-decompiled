package com.robinhood.android.lists.p173ui.userlist;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListUserListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$itemTouchHelperCallbacks$2$3, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListUserListFragment7 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    CuratedListUserListFragment7(Object obj) {
        super(1, obj, CuratedListUserListFragment.class, "onWatchListItemBuy", "onWatchListItemBuy(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CuratedListUserListFragment) this.receiver).onWatchListItemBuy(p0);
    }
}
