package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailPositions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailPositionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailPositions {
    public static final GameDetailPositions INSTANCE = new GameDetailPositions();

    /* renamed from: lambda$-316798785, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8950lambda$316798785 = ComposableLambda3.composableLambdaInstance(-316798785, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailPositionsKt$lambda$-316798785$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316798785, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailPositionsKt.lambda$-316798785.<anonymous> (GameDetailPositions.kt:27)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C16283R.string.game_detail_positions_header, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$582381814 = ComposableLambda3.composableLambdaInstance(582381814, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailPositionsKt$lambda$582381814$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582381814, i, -1, "com.robinhood.android.event.gamedetail.ui.ComposableSingletons$GameDetailPositionsKt.lambda$582381814.<anonymous> (GameDetailPositions.kt:49)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(48)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-316798785$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14224getLambda$316798785$feature_game_detail_externalDebug() {
        return f8950lambda$316798785;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$582381814$feature_game_detail_externalDebug() {
        return lambda$582381814;
    }
}
