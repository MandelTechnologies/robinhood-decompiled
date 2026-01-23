package com.robinhood.android.futures.eventbrackets.screen.tournament;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventsTournamentBracketTabComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$5$3$1 */
/* loaded from: classes3.dex */
/* synthetic */ class C17176xb01c43e8 extends FunctionReferenceImpl implements Function2<UUID, UUID, Unit> {
    C17176xb01c43e8(Object obj) {
        super(2, obj, EventsTournamentBracketDuxo.class, "onTopicSelected", "onTopicSelected(Ljava/util/UUID;Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, UUID uuid2) {
        invoke2(uuid, uuid2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0, UUID p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((EventsTournamentBracketDuxo) this.receiver).onTopicSelected(p0, p1);
    }
}
