package com.robinhood.android.event.detail;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$3$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailScreen3 extends AdaptedFunctionReference implements Function3<UUID, SideDto, PositionEffectDto, Unit> {
    EventDetailScreen3(Object obj) {
        super(3, obj, EventDetailDuxo.class, "onTrade", "onTrade(Ljava/util/UUID;Lrosetta/mainst/SideDto;Lrosetta/mainst/PositionEffectDto;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto) {
        invoke2(uuid, sideDto, positionEffectDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0, SideDto p1, PositionEffectDto p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        EventDetailDuxo.onTrade$default((EventDetailDuxo) this.receiver, p0, p1, p2, false, 8, null);
    }
}
