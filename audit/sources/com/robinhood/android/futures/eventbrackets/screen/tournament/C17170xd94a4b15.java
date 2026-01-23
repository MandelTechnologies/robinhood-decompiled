package com.robinhood.android.futures.eventbrackets.screen.tournament;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventsTournamentBracketTabComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$1$1 */
/* loaded from: classes3.dex */
/* synthetic */ class C17170xd94a4b15 extends FunctionReferenceImpl implements Function0<Unit> {
    C17170xd94a4b15(Object obj) {
        super(0, obj, EventsTournamentBracketScreenCallbacks.class, "onBackClicked", "onBackClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventsTournamentBracketScreenCallbacks) this.receiver).onBackClicked();
    }
}
