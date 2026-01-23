package com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.SpanStyle;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BonusPointsWelcomeScreenComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"BonusPointsWelcomeScreenComposable", "", "maxHeight", "", "bonusPointsTextVariant", "Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "annualFeeMicro", "", "onLearnMoreClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(DLcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BonusPointsWelcomeScreenComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BonusPointsWelcomeScreenComposable$lambda$2(double d, BonusPointsTextVariant bonusPointsTextVariant, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BonusPointsWelcomeScreenComposable(d, bonusPointsTextVariant, j, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BonusPointsWelcomeScreenComposable(final double d, final BonusPointsTextVariant bonusPointsTextVariant, final long j, final Function0<Unit> onLearnMoreClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bonusPointsTextVariant, "bonusPointsTextVariant");
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1024895237);
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
            i3 |= composerStartRestartGroup.changed(bonusPointsTextVariant.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMoreClick) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1024895237, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposable (BonusPointsWelcomeScreenComposable.kt:57)");
                }
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TermsComposableKt.TERMS_COMPOSABLE_LIST_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BonusPointsWelcomeScreenComposable.BonusPointsWelcomeScreenComposable$lambda$1$lambda$0(bonusPointsTextVariant, j, onLearnMoreClick, (LazyListScope) obj);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BonusPointsWelcomeScreenComposable.BonusPointsWelcomeScreenComposable$lambda$2(d, bonusPointsTextVariant, j, onLearnMoreClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.Vertical bottom2 = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TermsComposableKt.TERMS_COMPOSABLE_LIST_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            z = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BonusPointsWelcomeScreenComposable.BonusPointsWelcomeScreenComposable$lambda$1$lambda$0(bonusPointsTextVariant, j, onLearnMoreClick, (LazyListScope) obj);
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
    public static final Unit BonusPointsWelcomeScreenComposable$lambda$1$lambda$0(final BonusPointsTextVariant bonusPointsTextVariant, final long j, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        BonusPointsWelcomeScreenComposable4 bonusPointsWelcomeScreenComposable4 = BonusPointsWelcomeScreenComposable4.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, bonusPointsWelcomeScreenComposable4.m12763getLambda$467724838$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, bonusPointsWelcomeScreenComposable4.m12762getLambda$2012586991$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-786921198, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$BonusPointsWelcomeScreenComposable$1$1$1

            /* compiled from: BonusPointsWelcomeScreenComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$BonusPointsWelcomeScreenComposable$1$1$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BonusPointsTextVariant.values().length];
                    try {
                        iArr[BonusPointsTextVariant.BONUS_POINTS_10K.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BonusPointsTextVariant.BONUS_POINTS_15K.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BonusPointsTextVariant.BONUS_POINTS_20K.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                String str;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-786921198, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposable.<anonymous>.<anonymous>.<anonymous> (BonusPointsWelcomeScreenComposable.kt:87)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_welcome_screen_title, composer, 0);
                int i3 = C12201R.font.itc_garamond_std_book_condensed;
                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(36), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i3, companion2.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(34.56d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8120);
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4877borderxT4_qwU$default(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16))), Color2.Color(4280031767L), null, 2, null), C2002Dp.m7995constructorimpl(1), Color2.Color(4280755489L), null, 4, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                composer.startReplaceGroup(-316987354);
                BonusPointsTextVariant bonusPointsTextVariant2 = bonusPointsTextVariant;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                InlineTextContent2.appendInlineContent$default(builder, "imageId", null, 2, null);
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                builder.append(StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_welcome_screen_points_label_start, composer, 0));
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                composer.startReplaceGroup(-316978723);
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), 0L, companion2.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                try {
                    int i4 = C12201R.string.credit_card_app_bonus_points_welcome_screen_points_label_end;
                    int i5 = WhenMappings.$EnumSwitchMapping$0[bonusPointsTextVariant2.ordinal()];
                    if (i5 == 1) {
                        str = "10,000";
                    } else if (i5 == 2) {
                        str = "15,000";
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "20,000";
                    }
                    builder.append(StringResources_androidKt.stringResource(i4, new Object[]{str}, composer, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composer.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierM5143paddingVpY3zN4, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("imageId", new InlineTextContent(new Placeholder(TextUnit2.getSp(14), TextUnit2.getSp(14), PlaceholderVerticalAlign.INSTANCE.m7579getTextCenterJ6kI3mc(), null), BonusPointsWelcomeScreenComposable4.INSTANCE.m12761getLambda$1969268899$feature_credit_card_externalDebug()))), null, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 6072);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, bonusPointsWelcomeScreenComposable4.getLambda$438744595$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1664410388, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposableKt$BonusPointsWelcomeScreenComposable$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1664410388, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsWelcomeScreenComposable.<anonymous>.<anonymous>.<anonymous> (BonusPointsWelcomeScreenComposable.kt:181)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_welcome_screen_subscription_title, composer, 0);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                TextAlign.Companion companion2 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8120);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.f4066x9ef1ad59, new Object[]{TermsComposableKt.toDollars(j)}, composer, 0), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_welcome_screen_learn_more, composer, 0), modifierM5146paddingqDBjuR0$default3, null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), composer, 0, 56);
                Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_welcome_screen_disclaimer, composer, 0), modifierM5146paddingqDBjuR0$default4, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }
}
