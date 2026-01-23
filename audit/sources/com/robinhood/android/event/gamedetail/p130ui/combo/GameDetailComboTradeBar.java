package com.robinhood.android.event.gamedetail.p130ui.combo;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBarState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailComboTradeBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboTradeBar {
    public static final GameDetailComboTradeBar INSTANCE = new GameDetailComboTradeBar();
    private static Function2<Composer, Integer, Unit> lambda$1611006327 = ComposableLambda3.composableLambdaInstance(1611006327, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt$lambda$1611006327$1
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
                ComposerKt.traceEventStart(1611006327, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt.lambda$1611006327.<anonymous> (GameDetailComboTradeBar.kt:239)");
            }
            GameDetailComboTradeBar5.LoadingPriceButton("Getting price...", PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(20)), composer, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1522464284 = ComposableLambda3.composableLambdaInstance(1522464284, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt$lambda$1522464284$1
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
                ComposerKt.traceEventStart(1522464284, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt.lambda$1522464284.<anonymous> (GameDetailComboTradeBar.kt:238)");
            }
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, null, GameDetailComboTradeBar.INSTANCE.getLambda$1611006327$feature_game_detail_externalDebug(), composer, 12582912, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1895468266, reason: not valid java name */
    private static Function4<AnimatedContentScope, GameDetailComboTradeBarState.ErrorState, Composer, Integer, Unit> f8951lambda$1895468266 = ComposableLambda3.composableLambdaInstance(-1895468266, false, new Function4<AnimatedContentScope, GameDetailComboTradeBarState.ErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt$lambda$-1895468266$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, GameDetailComboTradeBarState.ErrorState errorState, Composer composer, Integer num) {
            invoke(animatedContentScope, errorState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, GameDetailComboTradeBarState.ErrorState errorState, Composer composer, int i) {
            long jM21426getFg20d7_KjU;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895468266, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.ComposableSingletons$GameDetailComboTradeBarKt.lambda$-1895468266.<anonymous> (GameDetailComboTradeBar.kt:259)");
            }
            if (errorState != null) {
                composer.startReplaceGroup(-1960005831);
                String textAsString = StringResources6.getTextAsString(errorState.getMessage(), composer, StringResource.$stable);
                if (errorState.getUseErrorColor()) {
                    composer.startReplaceGroup(-1959871446);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1959800177);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composer.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(textAsString, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8122);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1959610550);
                Spacer2.Spacer(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1895468266$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function4<AnimatedContentScope, GameDetailComboTradeBarState.ErrorState, Composer, Integer, Unit> m14251getLambda$1895468266$feature_game_detail_externalDebug() {
        return f8951lambda$1895468266;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1522464284$feature_game_detail_externalDebug() {
        return lambda$1522464284;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1611006327$feature_game_detail_externalDebug() {
        return lambda$1611006327;
    }
}
