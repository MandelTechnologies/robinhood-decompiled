package com.robinhood.android.event.gamedetail.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GameDetailTradeBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailTradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailTradeBar {
    public static final GameDetailTradeBar INSTANCE = new GameDetailTradeBar();

    /* renamed from: lambda$-763378561, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8943lambda$763378561 = ComposableLambda3.composableLambdaInstance(-763378561, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailTradeBarKt$lambda$-763378561$1
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
                ComposerKt.traceEventStart(-763378561, i, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailTradeBarKt.lambda$-763378561.<anonymous> (GameDetailTradeBar.kt:202)");
            }
            GameDetailTradeBar4.DisabledMessageText(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1316791473 = ComposableLambda3.composableLambdaInstance(1316791473, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailTradeBarKt$lambda$1316791473$1
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
                ComposerKt.traceEventStart(1316791473, i, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailTradeBarKt.lambda$1316791473.<anonymous> (GameDetailTradeBar.kt:207)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-763378561$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14191getLambda$763378561$feature_game_detail_externalDebug() {
        return f8943lambda$763378561;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1316791473$feature_game_detail_externalDebug() {
        return lambda$1316791473;
    }
}
