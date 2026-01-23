package com.robinhood.android.event.gamedetail.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailLastPlay.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailLastPlay {
    public static final GameDetailLastPlay INSTANCE = new GameDetailLastPlay();

    /* renamed from: lambda$-179083455, reason: not valid java name */
    private static Function3<String, Composer, Integer, Unit> f8942lambda$179083455 = ComposableLambda3.composableLambdaInstance(-179083455, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt$lambda$-179083455$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String targetState, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(targetState) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-179083455, i2, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt.lambda$-179083455.<anonymous> (GameDetailLastPlay.kt:45)");
            }
            BentoText2.m20747BentoText38GnDrw(targetState, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(5), 7, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, (i2 & 14) | 24624, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<String, Composer, Integer, Unit> lambda$1825804297 = ComposableLambda3.composableLambdaInstance(1825804297, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt$lambda$1825804297$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String targetState, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(targetState) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1825804297, i2, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt.lambda$1825804297.<anonymous> (GameDetailLastPlay.kt:58)");
            }
            BentoText2.m20747BentoText38GnDrw(targetState, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, i2 & 14, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$545338037 = ComposableLambda3.composableLambdaInstance(545338037, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt$lambda$545338037$1
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
                ComposerKt.traceEventStart(545338037, i, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailLastPlayKt.lambda$545338037.<anonymous> (GameDetailLastPlay.kt:97)");
            }
            GameDetailLastPlay5.GameDetailLastPlay(new GameDetailLastPlayState(StringResource.INSTANCE.invoke(C16283R.string.game_detail_last_play_header, new Object[0]), "F. Gore rushed for 10 yards. Tackled by LAR at LAR 4."), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-179083455$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function3<String, Composer, Integer, Unit> m14189getLambda$179083455$feature_game_detail_externalDebug() {
        return f8942lambda$179083455;
    }

    public final Function3<String, Composer, Integer, Unit> getLambda$1825804297$feature_game_detail_externalDebug() {
        return lambda$1825804297;
    }

    public final Function2<Composer, Integer, Unit> getLambda$545338037$feature_game_detail_externalDebug() {
        return lambda$545338037;
    }
}
