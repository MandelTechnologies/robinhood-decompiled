package com.robinhood.android.creditcard.p091ui.creditapplication.incentive.free.gold;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FreeGoldWelcomeScreenComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FreeGoldWelcomeScreenComposable {
    public static final FreeGoldWelcomeScreenComposable INSTANCE = new FreeGoldWelcomeScreenComposable();

    /* renamed from: lambda$-388577868, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8794lambda$388577868 = ComposableLambda3.composableLambdaInstance(-388577868, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt$lambda$-388577868$1
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
                ComposerKt.traceEventStart(-388577868, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt.lambda$-388577868.<anonymous> (FreeGoldWelcomeScreenComposable.kt:55)");
            }
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.free_gold_icon), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1284462613, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8790lambda$1284462613 = ComposableLambda3.composableLambdaInstance(-1284462613, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt$lambda$-1284462613$1
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
                ComposerKt.traceEventStart(-1284462613, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt.lambda$-1284462613.<anonymous> (FreeGoldWelcomeScreenComposable.kt:65)");
            }
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_gradient), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE)), C2002Dp.m7995constructorimpl(19)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1398073108, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8791lambda$1398073108 = ComposableLambda3.composableLambdaInstance(-1398073108, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt$lambda$-1398073108$1
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
                ComposerKt.traceEventStart(-1398073108, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt.lambda$-1398073108.<anonymous> (FreeGoldWelcomeScreenComposable.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_free_gold_welcome_screen_title, composer, 0);
            int i3 = C12201R.font.itc_garamond_std_book_condensed;
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            FontFamily FontFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i3, companion2.getNormal(), 0, 0, 12, null));
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(36), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(34.56d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), composer, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1511683603, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8792lambda$1511683603 = ComposableLambda3.composableLambdaInstance(-1511683603, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt$lambda$-1511683603$1
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
                ComposerKt.traceEventStart(-1511683603, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt.lambda$-1511683603.<anonymous> (FreeGoldWelcomeScreenComposable.kt:97)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Divider5.m5851HorizontalDivider9IZ8Weo(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), composer, 0, 2);
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_gold_icon), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5162requiredSize3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(32)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            Divider5.m5851HorizontalDivider9IZ8Weo(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), composer, 0, 2);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1625294098, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8793lambda$1625294098 = ComposableLambda3.composableLambdaInstance(-1625294098, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt$lambda$-1625294098$1
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
                ComposerKt.traceEventStart(-1625294098, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.ComposableSingletons$FreeGoldWelcomeScreenComposableKt.lambda$-1625294098.<anonymous> (FreeGoldWelcomeScreenComposable.kt:124)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_card_app_free_gold_welcome_screen_subtitle, composer, 0), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1284462613$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12764getLambda$1284462613$feature_credit_card_externalDebug() {
        return f8790lambda$1284462613;
    }

    /* renamed from: getLambda$-1398073108$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12765getLambda$1398073108$feature_credit_card_externalDebug() {
        return f8791lambda$1398073108;
    }

    /* renamed from: getLambda$-1511683603$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12766getLambda$1511683603$feature_credit_card_externalDebug() {
        return f8792lambda$1511683603;
    }

    /* renamed from: getLambda$-1625294098$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12767getLambda$1625294098$feature_credit_card_externalDebug() {
        return f8793lambda$1625294098;
    }

    /* renamed from: getLambda$-388577868$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12768getLambda$388577868$feature_credit_card_externalDebug() {
        return f8794lambda$388577868;
    }
}
