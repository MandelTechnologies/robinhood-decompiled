package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlanSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PlanSelectorComposableKt {
    public static final ComposableSingletons$PlanSelectorComposableKt INSTANCE = new ComposableSingletons$PlanSelectorComposableKt();

    /* renamed from: lambda$-1692961396, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8759lambda$1692961396 = ComposableLambda3.composableLambdaInstance(-1692961396, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt$lambda$-1692961396$1
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
                ComposerKt.traceEventStart(-1692961396, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt.lambda$-1692961396.<anonymous> (PlanSelectorComposable.kt:150)");
            }
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(18), 0.0f, 2, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1490289973 = ComposableLambda3.composableLambdaInstance(1490289973, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt$lambda$1490289973$1
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
                ComposerKt.traceEventStart(1490289973, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt.lambda$1490289973.<anonymous> (PlanSelectorComposable.kt:159)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1935827284 = ComposableLambda3.composableLambdaInstance(1935827284, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt$lambda$1935827284$1
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
                ComposerKt.traceEventStart(1935827284, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt.lambda$1935827284.<anonymous> (PlanSelectorComposable.kt:161)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TermsComposableKt.TERMS_COMPOSABLE_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_plan_selector_title, composer, 0);
            int i2 = C12201R.font.itc_garamond_std_book_condensed;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            FontFamily FontFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i2, companion.getNormal(), 0, 0, 12, null));
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(36), companion.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(34.56d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), composer, 48, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1913602701, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8760lambda$1913602701 = ComposableLambda3.composableLambdaInstance(-1913602701, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt$lambda$-1913602701$1
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
                ComposerKt.traceEventStart(-1913602701, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt.lambda$-1913602701.<anonymous> (PlanSelectorComposable.kt:182)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1022528079, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8758lambda$1022528079 = ComposableLambda3.composableLambdaInstance(-1022528079, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt$lambda$-1022528079$1
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
                ComposerKt.traceEventStart(-1022528079, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$PlanSelectorComposableKt.lambda$-1022528079.<anonymous> (PlanSelectorComposable.kt:195)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1022528079$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12669getLambda$1022528079$feature_credit_card_externalDebug() {
        return f8758lambda$1022528079;
    }

    /* renamed from: getLambda$-1692961396$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12670getLambda$1692961396$feature_credit_card_externalDebug() {
        return f8759lambda$1692961396;
    }

    /* renamed from: getLambda$-1913602701$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12671getLambda$1913602701$feature_credit_card_externalDebug() {
        return f8760lambda$1913602701;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1490289973$feature_credit_card_externalDebug() {
        return lambda$1490289973;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1935827284$feature_credit_card_externalDebug() {
        return lambda$1935827284;
    }
}
