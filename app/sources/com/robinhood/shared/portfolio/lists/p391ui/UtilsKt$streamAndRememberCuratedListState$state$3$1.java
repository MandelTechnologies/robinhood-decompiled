package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.unified.DisplayType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UtilsKt$streamAndRememberCuratedListState$state$3$1 extends FunctionReferenceImpl implements Function2<UUID, DisplayType, Unit> {
    UtilsKt$streamAndRememberCuratedListState$state$3$1(Object obj) {
        super(2, obj, CuratedListDuxo.class, "onWatchlistViewModeChange", "onWatchlistViewModeChange$lib_lists_ui_externalDebug(Ljava/util/UUID;Lcom/robinhood/android/common/portfolio/unified/DisplayType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, DisplayType displayType) {
        invoke2(uuid, displayType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID uuid, DisplayType p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CuratedListDuxo) this.receiver).onWatchlistViewModeChange$lib_lists_ui_externalDebug(uuid, p1);
    }
}
