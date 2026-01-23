package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.builders.HeaderState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GameDetailDuelContractsHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailDuelContractsHeaderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailDuelContractsHeader {
    public static final GameDetailDuelContractsHeader INSTANCE = new GameDetailDuelContractsHeader();
    private static Function2<Composer, Integer, Unit> lambda$487578973 = ComposableLambda3.composableLambdaInstance(487578973, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailDuelContractsHeaderKt$lambda$487578973$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487578973, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailDuelContractsHeaderKt.lambda$487578973.<anonymous> (GameDetailDuelContractsHeader.kt:221)");
            }
            Color.Companion companion = Color.INSTANCE;
            GameDetailDuelContractsHeader3.GameDetailDuelContractsHeader(new HeaderState(new HeaderState.DuelTeamState("", false, "", "28", new DayNightColor(companion.m6724getRed0d7_KjU(), companion.m6724getRed0d7_KjU(), null), "Very long name blaaaa", "2-3", true), new HeaderState.DuelTeamState("", true, "", "11", new DayNightColor(companion.m6717getBlue0d7_KjU(), companion.m6717getBlue0d7_KjU(), null), "Very long name blaaaa", "1-2", true)), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$487578973$feature_game_detail_externalDebug() {
        return lambda$487578973;
    }
}
