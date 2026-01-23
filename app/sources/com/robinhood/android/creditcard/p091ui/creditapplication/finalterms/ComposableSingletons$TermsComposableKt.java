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

/* compiled from: TermsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$TermsComposableKt {
    public static final ComposableSingletons$TermsComposableKt INSTANCE = new ComposableSingletons$TermsComposableKt();

    /* renamed from: lambda$-996027945, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8773lambda$996027945 = ComposableLambda3.composableLambdaInstance(-996027945, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-996027945$1
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
                ComposerKt.traceEventStart(-996027945, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-996027945.<anonymous> (TermsComposable.kt:52)");
            }
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(18), 0.0f, 2, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$644485120 = ComposableLambda3.composableLambdaInstance(644485120, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$644485120$1
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
                ComposerKt.traceEventStart(644485120, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$644485120.<anonymous> (TermsComposable.kt:61)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$217215391 = ComposableLambda3.composableLambdaInstance(217215391, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$217215391$1
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
                ComposerKt.traceEventStart(217215391, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$217215391.<anonymous> (TermsComposable.kt:63)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TermsComposableKt.TERMS_COMPOSABLE_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_title, composer, 0);
            int i2 = C12201R.font.itc_garamond_std_book_condensed;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            FontFamily FontFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i2, companion.getNormal(), 0, 0, 12, null));
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(36), companion.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(34.56d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), composer, 48, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-210054338, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8770lambda$210054338 = ComposableLambda3.composableLambdaInstance(-210054338, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-210054338$1
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
                ComposerKt.traceEventStart(-210054338, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-210054338.<anonymous> (TermsComposable.kt:83)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-637324067, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8771lambda$637324067 = ComposableLambda3.composableLambdaInstance(-637324067, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-637324067$1
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
                ComposerKt.traceEventStart(-637324067, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-637324067.<anonymous> (TermsComposable.kt:85)");
            }
            TermsComposableKt.GoldIconDivider(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1064593796, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8768lambda$1064593796 = ComposableLambda3.composableLambdaInstance(-1064593796, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-1064593796$1
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
                ComposerKt.traceEventStart(-1064593796, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-1064593796.<anonymous> (TermsComposable.kt:88)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_gold_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1919133254, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8769lambda$1919133254 = ComposableLambda3.composableLambdaInstance(-1919133254, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-1919133254$1
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
                ComposerKt.traceEventStart(-1919133254, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-1919133254.<anonymous> (TermsComposable.kt:105)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(12)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1521294584 = ComposableLambda3.composableLambdaInstance(1521294584, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$1521294584$1
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
                ComposerKt.traceEventStart(1521294584, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$1521294584.<anonymous> (TermsComposable.kt:120)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-831379970, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8772lambda$831379970 = ComposableLambda3.composableLambdaInstance(-831379970, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt$lambda$-831379970$1
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
                ComposerKt.traceEventStart(-831379970, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$TermsComposableKt.lambda$-831379970.<anonymous> (TermsComposable.kt:122)");
            }
            TermsComposableKt.RewardsDisclaimer(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1064593796$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12679getLambda$1064593796$feature_credit_card_externalDebug() {
        return f8768lambda$1064593796;
    }

    /* renamed from: getLambda$-1919133254$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12680getLambda$1919133254$feature_credit_card_externalDebug() {
        return f8769lambda$1919133254;
    }

    /* renamed from: getLambda$-210054338$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12681getLambda$210054338$feature_credit_card_externalDebug() {
        return f8770lambda$210054338;
    }

    /* renamed from: getLambda$-637324067$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12682getLambda$637324067$feature_credit_card_externalDebug() {
        return f8771lambda$637324067;
    }

    /* renamed from: getLambda$-831379970$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12683getLambda$831379970$feature_credit_card_externalDebug() {
        return f8772lambda$831379970;
    }

    /* renamed from: getLambda$-996027945$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12684getLambda$996027945$feature_credit_card_externalDebug() {
        return f8773lambda$996027945;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1521294584$feature_credit_card_externalDebug() {
        return lambda$1521294584;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$217215391$feature_credit_card_externalDebug() {
        return lambda$217215391;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$644485120$feature_credit_card_externalDebug() {
        return lambda$644485120;
    }
}
