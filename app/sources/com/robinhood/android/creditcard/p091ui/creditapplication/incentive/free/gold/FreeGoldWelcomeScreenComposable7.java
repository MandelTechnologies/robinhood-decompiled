package com.robinhood.android.creditcard.p091ui.creditapplication.incentive.free.gold;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.TermsComposableKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FreeGoldWelcomeScreenComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"FreeGoldWelcomeScreenComposable", "", "maxHeight", "", "annualFeeMicro", "", "onLearnMoreClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(DJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FreeGoldWelcomeScreenComposable7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeGoldWelcomeScreenComposable$lambda$2(double d, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FreeGoldWelcomeScreenComposable(d, j, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FreeGoldWelcomeScreenComposable(final double d, final long j, final Function0<Unit> onLearnMoreClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1840397089);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMoreClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1840397089, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposable (FreeGoldWelcomeScreenComposable.kt:46)");
                }
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TermsComposableKt.TERMS_COMPOSABLE_LIST_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FreeGoldWelcomeScreenComposable7.FreeGoldWelcomeScreenComposable$lambda$1$lambda$0(onLearnMoreClick, j, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, bottom, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FreeGoldWelcomeScreenComposable7.FreeGoldWelcomeScreenComposable$lambda$2(d, j, onLearnMoreClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.Vertical bottom2 = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TermsComposableKt.TERMS_COMPOSABLE_LIST_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z = ((i3 & 112) != 32) | ((i3 & 896) == 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FreeGoldWelcomeScreenComposable7.FreeGoldWelcomeScreenComposable$lambda$1$lambda$0(onLearnMoreClick, j, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag2, null, null, false, bottom2, centerHorizontally2, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeGoldWelcomeScreenComposable$lambda$1$lambda$0(final Function0 function0, final long j, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        FreeGoldWelcomeScreenComposable freeGoldWelcomeScreenComposable = FreeGoldWelcomeScreenComposable.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, freeGoldWelcomeScreenComposable.m12768getLambda$388577868$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, freeGoldWelcomeScreenComposable.m12764getLambda$1284462613$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, freeGoldWelcomeScreenComposable.m12765getLambda$1398073108$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, freeGoldWelcomeScreenComposable.m12766getLambda$1511683603$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, freeGoldWelcomeScreenComposable.m12767getLambda$1625294098$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1738904593, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposableKt$FreeGoldWelcomeScreenComposable$1$1$1
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
                    ComposerKt.traceEventStart(-1738904593, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.free.gold.FreeGoldWelcomeScreenComposable.<anonymous>.<anonymous>.<anonymous> (FreeGoldWelcomeScreenComposable.kt:135)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer.startReplaceGroup(-345030777);
                long j2 = j;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composer.startReplaceGroup(-345030037);
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C12201R.string.f4068x838d3b58, new Object[]{TermsComposableKt.toDollars(j2)}, composer, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composer.endReplaceGroup();
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    composer.startReplaceGroup(-345014204);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(C12201R.string.f4067xe343415f, composer, 0));
                        builder.pop(iPushStyle);
                        composer.endReplaceGroup();
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.stringResource(C12201R.string.credit_card_app_free_gold_welcome_screen_subscription_label_end, composer, 0));
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer.endReplaceGroup();
                        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
                        TextAlign.Companion companion2 = TextAlign.INSTANCE;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, textS, composer, 48, 0, 8120);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C12201R.string.credit_card_app_free_gold_welcome_screen_learn_more, composer, 0), modifierM5146paddingqDBjuR0$default, null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), composer, 0, 56);
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_card_app_free_gold_welcome_screen_disclaimer, composer, 0), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }
}
