package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Bracket.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketKt$Bracket$1, reason: use source file name */
/* loaded from: classes3.dex */
final class Bracket3 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ BracketState $bracketState;
    final /* synthetic */ Function1<UUID, Unit> $onCardClick;
    final /* synthetic */ ImmutableList<BracketRoundData> $rounds;

    /* JADX WARN: Multi-variable type inference failed */
    Bracket3(ImmutableList<BracketRoundData> immutableList, BracketState bracketState, Function1<? super UUID, Unit> function1) {
        this.$rounds = immutableList;
        this.$bracketState = bracketState;
        this.$onCardClick = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, final int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1382188021, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.Bracket.<anonymous> (Bracket.kt:48)");
        }
        BracketRoundData bracketRoundData = this.$rounds.get(i);
        composer.startReplaceGroup(1849434622);
        final BracketState bracketState = this.$bracketState;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketKt$Bracket$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(Bracket3.invoke$lambda$1$lambda$0(bracketState, i));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BracketRound2.BracketRound(bracketRoundData, invoke$lambda$2((SnapshotState4) objRememberedValue), this.$bracketState.getFirstVisibleHorizontalIndexOffsetInPercentage(), i < CollectionsKt.getLastIndex(this.$rounds), this.$onCardClick, null, composer, 0, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$1$lambda$0(BracketState bracketState, int i) {
        int firstVisiblePage = bracketState.getFirstVisiblePage();
        return i >= firstVisiblePage ? i - firstVisiblePage : i;
    }

    private static final int invoke$lambda$2(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }
}
