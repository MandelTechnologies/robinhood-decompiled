package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import android.content.res.Resources;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SimilarInstrumentsV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SimilarInstrumentsV2Kt {
    public static final ComposableSingletons$SimilarInstrumentsV2Kt INSTANCE = new ComposableSingletons$SimilarInstrumentsV2Kt();

    /* renamed from: lambda$-428910619, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8914lambda$428910619 = ComposableLambda3.composableLambdaInstance(-428910619, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$-428910619$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-428910619, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$-428910619.<anonymous> (SimilarInstrumentsV2.kt:426)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            SimilarInstrumentsV2Kt.SimilarInstrumentsV2(uuidRandomUUID, "NTDOY", extensions2.persistentListOf(), null, null, extensions2.persistentListOf(SimilarInstrumentsV2Kt.buildViewState$default(null, null, null, false, 15, null), SimilarInstrumentsV2Kt.buildViewState$default(null, null, "-5.0%", false, 3, null), SimilarInstrumentsV2Kt.buildViewState$default(null, null, "+0.0%", true, 3, null)), composer, 432, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1748022227, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8911lambda$1748022227 = ComposableLambda3.composableLambdaInstance(-1748022227, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$-1748022227$1
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
                ComposerKt.traceEventStart(-1748022227, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$-1748022227.<anonymous> (SimilarInstrumentsV2.kt:425)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer, 0)), null, null, null, null, null, null, null, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.m13918getLambda$428910619$feature_equity_detail_externalDebug(), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1908377493 = ComposableLambda3.composableLambdaInstance(1908377493, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$1908377493$1
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
                ComposerKt.traceEventStart(1908377493, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$1908377493.<anonymous> (SimilarInstrumentsV2.kt:448)");
            }
            SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card(UUID.randomUUID(), UUID.randomUUID(), "Nintendo", "NTDOY", Formats.getPercentDeltaFormat().format(new BigDecimal("0.05")), Boolean.TRUE, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16), 0.0f, 2, null), composer, 1772928, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-839116835, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8915lambda$839116835 = ComposableLambda3.composableLambdaInstance(-839116835, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$-839116835$1
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
                ComposerKt.traceEventStart(-839116835, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$-839116835.<anonymous> (SimilarInstrumentsV2.kt:447)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer, 0)), null, null, null, null, null, null, null, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.getLambda$1908377493$feature_equity_detail_externalDebug(), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-219984662, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8913lambda$219984662 = ComposableLambda3.composableLambdaInstance(-219984662, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$-219984662$1
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
                ComposerKt.traceEventStart(-219984662, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$-219984662.<anonymous> (SimilarInstrumentsV2.kt:469)");
            }
            SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card(UUID.randomUUID(), UUID.randomUUID(), "Nintendo", "NTDOY", Formats.getPercentDeltaFormat().format(new BigDecimal("-0.05")), Boolean.FALSE, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16), 0.0f, 2, null), composer, 1772928, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2066803406, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8912lambda$2066803406 = ComposableLambda3.composableLambdaInstance(-2066803406, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$-2066803406$1
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
                ComposerKt.traceEventStart(-2066803406, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$-2066803406.<anonymous> (SimilarInstrumentsV2.kt:468)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer, 0)), null, null, null, null, null, null, null, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.m13917getLambda$219984662$feature_equity_detail_externalDebug(), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2005630940 = ComposableLambda3.composableLambdaInstance(2005630940, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$2005630940$1
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
                ComposerKt.traceEventStart(2005630940, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$2005630940.<anonymous> (SimilarInstrumentsV2.kt:490)");
            }
            SimilarInstrumentsV2Kt.SimilarInstrumentsV2Card(UUID.randomUUID(), UUID.randomUUID(), "Take-Two Interactive Software Take-Three Interactive", "TTWO", Formats.getPercentDeltaFormat().format(new BigDecimal("0.05")), Boolean.TRUE, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16), 0.0f, 2, null), composer, 1772928, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$158812196 = ComposableLambda3.composableLambdaInstance(158812196, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt$lambda$158812196$1
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
                ComposerKt.traceEventStart(158812196, i, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.ComposableSingletons$SimilarInstrumentsV2Kt.lambda$158812196.<anonymous> (SimilarInstrumentsV2.kt:489)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer, 0)), null, null, null, null, null, null, null, ComposableSingletons$SimilarInstrumentsV2Kt.INSTANCE.getLambda$2005630940$feature_equity_detail_externalDebug(), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1748022227$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13915getLambda$1748022227$feature_equity_detail_externalDebug() {
        return f8911lambda$1748022227;
    }

    /* renamed from: getLambda$-2066803406$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13916getLambda$2066803406$feature_equity_detail_externalDebug() {
        return f8912lambda$2066803406;
    }

    /* renamed from: getLambda$-219984662$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13917getLambda$219984662$feature_equity_detail_externalDebug() {
        return f8913lambda$219984662;
    }

    /* renamed from: getLambda$-428910619$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13918getLambda$428910619$feature_equity_detail_externalDebug() {
        return f8914lambda$428910619;
    }

    /* renamed from: getLambda$-839116835$feature_equity_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13919getLambda$839116835$feature_equity_detail_externalDebug() {
        return f8915lambda$839116835;
    }

    public final Function2<Composer, Integer, Unit> getLambda$158812196$feature_equity_detail_externalDebug() {
        return lambda$158812196;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1908377493$feature_equity_detail_externalDebug() {
        return lambda$1908377493;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2005630940$feature_equity_detail_externalDebug() {
        return lambda$2005630940;
    }
}
