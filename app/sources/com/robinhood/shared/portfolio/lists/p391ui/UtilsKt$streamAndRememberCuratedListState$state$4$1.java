package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.models.p320db.CuratedListItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UtilsKt$streamAndRememberCuratedListState$state$4$1 extends FunctionReferenceImpl implements Function2<UUID, CuratedListItem, Unit> {
    UtilsKt$streamAndRememberCuratedListState$state$4$1(Object obj) {
        super(2, obj, CuratedListDuxo.class, "onWatchListItemRemoved", "onWatchListItemRemoved$lib_lists_ui_externalDebug(Ljava/util/UUID;Lcom/robinhood/models/db/CuratedListItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, CuratedListItem curatedListItem) {
        invoke2(uuid, curatedListItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0, CuratedListItem p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CuratedListDuxo) this.receiver).onWatchListItemRemoved$lib_lists_ui_externalDebug(p0, p1);
    }
}
