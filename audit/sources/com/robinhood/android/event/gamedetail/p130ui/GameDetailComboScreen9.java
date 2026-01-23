package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$GameDetailComboScreen$2$6$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailComboScreen9 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    GameDetailComboScreen9(Object obj) {
        super(1, obj, GdpV2ComboUiCallbacks.class, "onStartOnboarding", "onStartOnboarding(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID uuid) {
        ((GdpV2ComboUiCallbacks) this.receiver).onStartOnboarding(uuid);
    }
}
