package com.robinhood.android.lists.p173ui.userlist;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListUserListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$itemTouchHelperCallbacks$2$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListUserListFragment5 extends FunctionReferenceImpl implements Function2<UUID, Integer, Unit> {
    CuratedListUserListFragment5(Object obj) {
        super(2, obj, CuratedListUserListFragment.class, "synchronizeListPositionChange", "synchronizeListPositionChange(Ljava/util/UUID;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, Integer num) {
        invoke(uuid, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(UUID p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CuratedListUserListFragment) this.receiver).synchronizeListPositionChange(p0, i);
    }
}
