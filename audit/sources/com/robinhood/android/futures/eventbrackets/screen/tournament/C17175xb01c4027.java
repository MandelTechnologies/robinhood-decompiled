package com.robinhood.android.futures.eventbrackets.screen.tournament;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventsTournamentBracketTabComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$5$2$1 */
/* loaded from: classes3.dex */
/* synthetic */ class C17175xb01c4027 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    C17175xb01c4027(Object obj) {
        super(1, obj, EventsTournamentBracketDuxo.class, "onTabSelected", "onTabSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((EventsTournamentBracketDuxo) this.receiver).onTabSelected(i);
    }
}
