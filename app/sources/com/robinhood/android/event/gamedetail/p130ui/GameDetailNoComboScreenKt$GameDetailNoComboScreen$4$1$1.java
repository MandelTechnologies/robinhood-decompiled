package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailNoComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$1$1 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$1$1(Object obj) {
        super(1, obj, GdpV1UiCallbacks.class, "onPositionSelected", "onPositionSelected(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID uuid) {
        ((GdpV1UiCallbacks) this.receiver).onPositionSelected(uuid);
    }
}
