package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.blackwidow.C9859R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ExploreLegendUpsellComposableKt {
    public static final ComposableSingletons$ExploreLegendUpsellComposableKt INSTANCE = new ComposableSingletons$ExploreLegendUpsellComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$219377078 = ComposableLambda3.composableLambdaInstance(219377078, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$219377078$1
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
                ComposerKt.traceEventStart(219377078, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$219377078.<anonymous> (ExploreLegendUpsellComposable.kt:293)");
            }
            ExploreLegendUpsellComposableKt.LegendLogo(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$277359351 = ComposableLambda3.composableLambdaInstance(277359351, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$277359351$1
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
                ComposerKt.traceEventStart(277359351, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$277359351.<anonymous> (ExploreLegendUpsellComposable.kt:298)");
            }
            ExploreLegendUpsellComposableKt.TradingPlatformDynamicText(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$335341624 = ComposableLambda3.composableLambdaInstance(335341624, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$335341624$1
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
                ComposerKt.traceEventStart(335341624, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$335341624.<anonymous> (ExploreLegendUpsellComposable.kt:303)");
            }
            ExploreLegendUpsellComposableKt.VerticalFadedLine(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$393323897 = ComposableLambda3.composableLambdaInstance(393323897, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$393323897$1
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
                ComposerKt.traceEventStart(393323897, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$393323897.<anonymous> (ExploreLegendUpsellComposable.kt:308)");
            }
            ExploreLegendUpsellComposableKt.Headline2StyledText(C9859R.string.guided_by_powerful_charts, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$133558204 = ComposableLambda3.composableLambdaInstance(133558204, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$133558204$1
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
                ComposerKt.traceEventStart(133558204, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$133558204.<anonymous> (ExploreLegendUpsellComposable.kt:330)");
            }
            ExploreLegendUpsellComposableKt.PulseMarketSection(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1955364908 = ComposableLambda3.composableLambdaInstance(1955364908, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1955364908$1
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
                ComposerKt.traceEventStart(1955364908, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1955364908.<anonymous> (ExploreLegendUpsellComposable.kt:335)");
            }
            ExploreLegendUpsellComposableKt.VerticalFadedLine(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1147424547 = ComposableLambda3.composableLambdaInstance(1147424547, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1147424547$1
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
                ComposerKt.traceEventStart(1147424547, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1147424547.<anonymous> (ExploreLegendUpsellComposable.kt:340)");
            }
            ExploreLegendUpsellComposableKt.Headline2StyledText(C9859R.string.ideal_setup, null, composer, 0, 2);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1321371366 = ComposableLambda3.composableLambdaInstance(1321371366, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1321371366$1
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
                ComposerKt.traceEventStart(1321371366, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1321371366.<anonymous> (ExploreLegendUpsellComposable.kt:401)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM()), composer, 0);
            ExploreLegendUpsellComposableKt.m11455TitleStyledText8iNrtrE(C9859R.string.ready_when_you_are, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 7, null), 0, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1379353639 = ComposableLambda3.composableLambdaInstance(1379353639, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1379353639$1
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
                ComposerKt.traceEventStart(1379353639, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1379353639.<anonymous> (ExploreLegendUpsellComposable.kt:413)");
            }
            ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(Either2.asLeft(Integer.valueOf(C9859R.string.gated_options_once_you_spot_a_trend)), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1495318185 = ComposableLambda3.composableLambdaInstance(1495318185, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1495318185$1
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
                ComposerKt.traceEventStart(1495318185, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1495318185.<anonymous> (ExploreLegendUpsellComposable.kt:428)");
            }
            ExploreLegendUpsellComposableKt.VerticalFadedLine(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1553300458 = ComposableLambda3.composableLambdaInstance(1553300458, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1553300458$1
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
                ComposerKt.traceEventStart(1553300458, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1553300458.<anonymous> (ExploreLegendUpsellComposable.kt:433)");
            }
            ExploreLegendUpsellComposableKt.m11455TitleStyledText8iNrtrE(C9859R.string.dynamic_linking, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), 0, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1611282731 = ComposableLambda3.composableLambdaInstance(1611282731, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1611282731$1
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
                ComposerKt.traceEventStart(1611282731, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1611282731.<anonymous> (ExploreLegendUpsellComposable.kt:441)");
            }
            ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(Either2.asLeft(Integer.valueOf(C9859R.string.gated_instant_link_widgets)), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), 0, 0.0f, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$671841406 = ComposableLambda3.composableLambdaInstance(671841406, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$671841406$1
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
                ComposerKt.traceEventStart(671841406, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$671841406.<anonymous> (ExploreLegendUpsellComposable.kt:456)");
            }
            ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(Either2.asLeft(Integer.valueOf(C9859R.string.but_one_more_thing)), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$729823679 = ComposableLambda3.composableLambdaInstance(729823679, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$729823679$1
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
                ComposerKt.traceEventStart(729823679, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$729823679.<anonymous> (ExploreLegendUpsellComposable.kt:464)");
            }
            ExploreLegendUpsellComposableKt.VerticalFadedLine(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$787805952 = ComposableLambda3.composableLambdaInstance(787805952, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$787805952$1
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
                ComposerKt.traceEventStart(787805952, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$787805952.<anonymous> (ExploreLegendUpsellComposable.kt:469)");
            }
            ExploreLegendUpsellComposableKt.m11455TitleStyledText8iNrtrE(C9859R.string.its_free, null, 0, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$845788225 = ComposableLambda3.composableLambdaInstance(845788225, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$845788225$1
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
                ComposerKt.traceEventStart(845788225, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$845788225.<anonymous> (ExploreLegendUpsellComposable.kt:473)");
            }
            ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(Either2.asLeft(Integer.valueOf(C9859R.string.rh_legend_available_variant_1_and_2)), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0, 0.0f, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-931290567, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8672lambda$931290567 = ComposableLambda3.composableLambdaInstance(-931290567, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$-931290567$1
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
                ComposerKt.traceEventStart(-931290567, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$-931290567.<anonymous> (ExploreLegendUpsellComposable.kt:1068)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$62447335 = ComposableLambda3.composableLambdaInstance(62447335, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$62447335$1
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
                ComposerKt.traceEventStart(62447335, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$62447335.<anonymous> (ExploreLegendUpsellComposable.kt:1076)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_label_disclosure, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1477957913 = ComposableLambda3.composableLambdaInstance(1477957913, false, C9875xe112b9d.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1901821025 = ComposableLambda3.composableLambdaInstance(1901821025, false, C9880xbd9cad7f.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1653483047 = ComposableLambda3.composableLambdaInstance(1653483047, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1653483047$1
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
                ComposerKt.traceEventStart(1653483047, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1653483047.<anonymous> (ExploreLegendUpsellComposable.kt:1276)");
            }
            ExploreLegendUpsellComposableKt.BottomBarLinkCta(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$226389564 = ComposableLambda3.composableLambdaInstance(226389564, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$226389564$1
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
                ComposerKt.traceEventStart(226389564, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$226389564.<anonymous> (ExploreLegendUpsellComposable.kt:1275)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null), ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$1653483047$feature_black_widow_upsell_externalDebug(), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-931290567$feature_black_widow_upsell_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11439getLambda$931290567$feature_black_widow_upsell_externalDebug() {
        return f8672lambda$931290567;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1147424547$feature_black_widow_upsell_externalDebug() {
        return lambda$1147424547;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1321371366$feature_black_widow_upsell_externalDebug() {
        return lambda$1321371366;
    }

    public final Function2<Composer, Integer, Unit> getLambda$133558204$feature_black_widow_upsell_externalDebug() {
        return lambda$133558204;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1379353639$feature_black_widow_upsell_externalDebug() {
        return lambda$1379353639;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1477957913$feature_black_widow_upsell_externalDebug() {
        return lambda$1477957913;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1495318185$feature_black_widow_upsell_externalDebug() {
        return lambda$1495318185;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1553300458$feature_black_widow_upsell_externalDebug() {
        return lambda$1553300458;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1611282731$feature_black_widow_upsell_externalDebug() {
        return lambda$1611282731;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1653483047$feature_black_widow_upsell_externalDebug() {
        return lambda$1653483047;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1901821025$feature_black_widow_upsell_externalDebug() {
        return lambda$1901821025;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1955364908$feature_black_widow_upsell_externalDebug() {
        return lambda$1955364908;
    }

    public final Function2<Composer, Integer, Unit> getLambda$219377078$feature_black_widow_upsell_externalDebug() {
        return lambda$219377078;
    }

    public final Function2<Composer, Integer, Unit> getLambda$226389564$feature_black_widow_upsell_externalDebug() {
        return lambda$226389564;
    }

    public final Function2<Composer, Integer, Unit> getLambda$277359351$feature_black_widow_upsell_externalDebug() {
        return lambda$277359351;
    }

    public final Function2<Composer, Integer, Unit> getLambda$335341624$feature_black_widow_upsell_externalDebug() {
        return lambda$335341624;
    }

    public final Function2<Composer, Integer, Unit> getLambda$393323897$feature_black_widow_upsell_externalDebug() {
        return lambda$393323897;
    }

    public final Function2<Composer, Integer, Unit> getLambda$62447335$feature_black_widow_upsell_externalDebug() {
        return lambda$62447335;
    }

    public final Function2<Composer, Integer, Unit> getLambda$671841406$feature_black_widow_upsell_externalDebug() {
        return lambda$671841406;
    }

    public final Function2<Composer, Integer, Unit> getLambda$729823679$feature_black_widow_upsell_externalDebug() {
        return lambda$729823679;
    }

    public final Function2<Composer, Integer, Unit> getLambda$787805952$feature_black_widow_upsell_externalDebug() {
        return lambda$787805952;
    }

    public final Function2<Composer, Integer, Unit> getLambda$845788225$feature_black_widow_upsell_externalDebug() {
        return lambda$845788225;
    }
}
