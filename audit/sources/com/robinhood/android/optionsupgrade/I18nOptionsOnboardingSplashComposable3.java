package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18nOptionsOnboardingSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"I18nOptionsOnboardingSplashComposable", "", "splashIconRes", "", "splashIconContainerBg", "Landroidx/compose/ui/graphics/Color;", "loading", "", "title", "", "summaryMarkdown", "onCloseButtonClicked", "Lkotlin/Function0;", "onContinueButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "titleStyle", "Landroidx/compose/ui/text/TextStyle;", "footerAlignment", "Landroidx/compose/ui/text/style/TextAlign;", "footerFontColor", "footerHyperlinkColor", "closeButtonTint", "footerMarkdown", "I18nOptionsOnboardingSplashComposable-YeHINzE", "(IJZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;IJJLandroidx/compose/ui/graphics/Color;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class I18nOptionsOnboardingSplashComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I18nOptionsOnboardingSplashComposable_YeHINzE$lambda$0(int i, long j, boolean z, String str, String str2, Function0 function0, Function0 function02, Modifier modifier, TextStyle textStyle, int i2, long j2, long j3, Color color, String str3, int i3, int i4, int i5, Composer composer, int i6) {
        m17392I18nOptionsOnboardingSplashComposableYeHINzE(i, j, z, str, str2, function0, function02, modifier, textStyle, i2, j2, j3, color, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0316  */
    /* renamed from: I18nOptionsOnboardingSplashComposable-YeHINzE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17392I18nOptionsOnboardingSplashComposableYeHINzE(final int i, final long j, final boolean z, final String title, final String summaryMarkdown, final Function0<Unit> onCloseButtonClicked, final Function0<Unit> onContinueButtonClicked, Modifier modifier, TextStyle textStyle, int i2, long j2, long j3, Color color, String str, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        long jM21425getFg0d7_KjU;
        int i8;
        int i9;
        TextStyle bookCoverCapsuleSmall;
        int iM7922getLefte0LSkKk;
        long jM21425getFg0d7_KjU2;
        TextStyle textStyle2;
        Modifier modifier3;
        int i10;
        final Color color2;
        final long j4;
        int i11;
        final long j5;
        final String str2;
        TextStyle textStyle3;
        Composer composer2;
        final String str3;
        final long j6;
        final Color color3;
        final int i12;
        final long j7;
        final Modifier modifier4;
        final TextStyle textStyle4;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summaryMarkdown, "summaryMarkdown");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1475270467);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i13 = 16;
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(title) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(summaryMarkdown) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i6 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onCloseButtonClicked) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i6 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinueButtonClicked) ? 1048576 : 524288;
        }
        int i14 = i5 & 128;
        if (i14 != 0) {
            i6 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i3 & 12582912) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 100663296) == 0) {
            i6 |= ((i5 & 256) == 0 && composerStartRestartGroup.changed(textStyle)) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i2)) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (((i5 & 1024) == 0 && composerStartRestartGroup.changed(j2)) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            int i15 = i7;
            jM21425getFg0d7_KjU = j3;
            if ((i5 & 2048) == 0 && composerStartRestartGroup.changed(jM21425getFg0d7_KjU)) {
                i13 = 32;
            }
            i7 = i15 | i13;
        } else {
            jM21425getFg0d7_KjU = j3;
        }
        int i16 = i5 & 4096;
        if (i16 != 0) {
            i8 = i7 | 384;
        } else {
            int i17 = i7;
            if ((i4 & 384) == 0) {
                i17 |= composerStartRestartGroup.changed(color) ? 256 : 128;
            }
            i8 = i17;
        }
        int i18 = i5 & 8192;
        if (i18 != 0) {
            i9 = i8 | 3072;
        } else {
            int i19 = i8;
            if ((i4 & 3072) == 0) {
                i9 = i19 | (composerStartRestartGroup.changed(str) ? 2048 : 1024);
            } else {
                i9 = i19;
            }
        }
        if ((i6 & 306783379) != 306783378 || (i9 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i5 & 256) != 0) {
                    bookCoverCapsuleSmall = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                    i6 &= -234881025;
                } else {
                    bookCoverCapsuleSmall = textStyle;
                }
                if ((i5 & 512) != 0) {
                    iM7922getLefte0LSkKk = TextAlign.INSTANCE.m7922getLefte0LSkKk();
                    i6 = (-1879048193) & i6;
                } else {
                    iM7922getLefte0LSkKk = i2;
                }
                if ((i5 & 1024) != 0) {
                    jM21425getFg0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    i9 &= -15;
                } else {
                    jM21425getFg0d7_KjU2 = j2;
                }
                if ((i5 & 2048) != 0) {
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    i9 &= -113;
                }
                Color color4 = i16 != 0 ? null : color;
                if (i18 != 0) {
                    textStyle2 = bookCoverCapsuleSmall;
                    modifier3 = modifier2;
                    i10 = i9;
                    color2 = color4;
                    j4 = jM21425getFg0d7_KjU2;
                    long j8 = jM21425getFg0d7_KjU;
                    i11 = i6;
                    j5 = j8;
                    str2 = null;
                    composerStartRestartGroup.endDefaults();
                    final int i20 = iM7922getLefte0LSkKk;
                    if (ComposerKt.isTraceInProgress()) {
                        textStyle3 = textStyle2;
                    } else {
                        textStyle3 = textStyle2;
                        ComposerKt.traceEventStart(1475270467, i11, i10, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable (I18nOptionsOnboardingSplashComposable.kt:48)");
                    }
                    Color color5 = color2;
                    final TextStyle textStyle5 = textStyle3;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(1994085639, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i21) {
                            if ((i21 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1994085639, i21, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:53)");
                            }
                            Function2<Composer, Integer, Unit> function2M17386getLambda$1854898252$feature_options_upgrade_externalDebug = I18nOptionsOnboardingSplashComposable.INSTANCE.m17386getLambda$1854898252$feature_options_upgrade_externalDebug();
                            final Color color6 = color2;
                            final Function0<Unit> function0 = onCloseButtonClicked;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17386getLambda$1854898252$feature_options_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1920245240, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i22) {
                                    int i23;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i22 & 6) == 0) {
                                        i23 = i22 | ((i22 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                                    } else {
                                        i23 = i22;
                                    }
                                    if ((i23 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1920245240, i23, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous>.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:56)");
                                    }
                                    Color color7 = color6;
                                    composer4.startReplaceGroup(1480263951);
                                    long jM21425getFg0d7_KjU3 = color7 == null ? BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU() : color7.getValue();
                                    composer4.endReplaceGroup();
                                    final Function0<Unit> function02 = function0;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-454269450, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt.I18nOptionsOnboardingSplashComposable.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i24) {
                                            if ((i24 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-454269450, i24, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous>.<anonymous>.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:59)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer5, BentoAppBarScope.$stable << 12, 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 805306368, 509);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(j), 0L, null, composer3, 390, 0, 1786);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-240959160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i21) {
                            if ((i21 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-240959160, i21, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:68)");
                            }
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                            BentoButtonKt.m20586BentoButtonEikTQX8(onContinueButtonClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, z, null, null, null, null, false, null, composer3, 0, 0, 8120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-1228132206, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i21) {
                            int i22;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i21 & 6) == 0) {
                                i22 = i21 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i22 = i21;
                            }
                            if ((i22 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1228132206, i22, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:76)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
                            long j9 = j;
                            int i23 = i;
                            String str4 = title;
                            TextStyle textStyle6 = textStyle5;
                            String str5 = summaryMarkdown;
                            String str6 = str2;
                            int i24 = i20;
                            long j10 = j4;
                            long j11 = j5;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), j9, null, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i25 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM4872backgroundbw27NRU$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i25).m21592getMediumD9Ej5fM(), 7, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i23, composer3, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 108);
                            composer3.endNode();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i25).getJet(), 0.0f, composer3, 0, 5);
                            Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            BentoText2.m20747BentoText38GnDrw(str4, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i25).m21592getMediumD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(12), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, textStyle6, composer3, 0, 0, 8188);
                            BentoMarkdownText2.BentoMarkdownText(str5, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, 0, 30);
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                            composer3.startReplaceGroup(-1222216101);
                            if (str6 != null) {
                                BentoMarkdownText2.BentoMarkdownText(str6, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i25).getTextS(), i24, j10, j11, false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306800, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str2;
                    j6 = j5;
                    color3 = color5;
                    i12 = i20;
                    j7 = j4;
                    modifier4 = modifier3;
                    textStyle4 = textStyle5;
                } else {
                    textStyle2 = bookCoverCapsuleSmall;
                    modifier3 = modifier2;
                    i10 = i9;
                    color2 = color4;
                    j4 = jM21425getFg0d7_KjU2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 & 256) != 0) {
                    i6 &= -234881025;
                }
                if ((i5 & 512) != 0) {
                    i6 &= -1879048193;
                }
                if ((i5 & 1024) != 0) {
                    i9 &= -15;
                }
                if ((i5 & 2048) != 0) {
                    i9 &= -113;
                }
                textStyle2 = textStyle;
                iM7922getLefte0LSkKk = i2;
                j4 = j2;
                i10 = i9;
                modifier3 = modifier2;
                color2 = color;
            }
            long j9 = jM21425getFg0d7_KjU;
            str2 = str;
            i11 = i6;
            j5 = j9;
            composerStartRestartGroup.endDefaults();
            final int i202 = iM7922getLefte0LSkKk;
            if (ComposerKt.isTraceInProgress()) {
            }
            Color color52 = color2;
            final TextStyle textStyle52 = textStyle3;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(1994085639, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i21) {
                    if ((i21 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1994085639, i21, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:53)");
                    }
                    Function2<Composer, Integer, Unit> function2M17386getLambda$1854898252$feature_options_upgrade_externalDebug = I18nOptionsOnboardingSplashComposable.INSTANCE.m17386getLambda$1854898252$feature_options_upgrade_externalDebug();
                    final Color color6 = color2;
                    final Function0<Unit> function0 = onCloseButtonClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17386getLambda$1854898252$feature_options_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1920245240, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i22) {
                            int i23;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i22 & 6) == 0) {
                                i23 = i22 | ((i22 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i23 = i22;
                            }
                            if ((i23 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1920245240, i23, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous>.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:56)");
                            }
                            Color color7 = color6;
                            composer4.startReplaceGroup(1480263951);
                            long jM21425getFg0d7_KjU3 = color7 == null ? BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU() : color7.getValue();
                            composer4.endReplaceGroup();
                            final Function0<Unit> function02 = function0;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-454269450, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt.I18nOptionsOnboardingSplashComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i24) {
                                    if ((i24 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-454269450, i24, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous>.<anonymous>.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:59)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer5, BentoAppBarScope.$stable << 12, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 805306368, 509);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(j), 0L, null, composer3, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-240959160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i21) {
                    if ((i21 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-240959160, i21, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:68)");
                    }
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    BentoButtonKt.m20586BentoButtonEikTQX8(onContinueButtonClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, z, null, null, null, null, false, null, composer3, 0, 0, 8120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-1228132206, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$I18nOptionsOnboardingSplashComposable$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i21) {
                    int i22;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i21 & 6) == 0) {
                        i22 = i21 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i22 = i21;
                    }
                    if ((i22 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1228132206, i22, -1, "com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:76)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
                    long j92 = j;
                    int i23 = i;
                    String str4 = title;
                    TextStyle textStyle6 = textStyle52;
                    String str5 = summaryMarkdown;
                    String str6 = str2;
                    int i24 = i202;
                    long j10 = j4;
                    long j11 = j5;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), j92, null, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i25 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM4872backgroundbw27NRU$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i25).m21592getMediumD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i23, composer3, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 108);
                    composer3.endNode();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i25).getJet(), 0.0f, composer3, 0, 5);
                    Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(str4, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i25).m21592getMediumD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(12), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, textStyle6, composer3, 0, 0, 8188);
                    BentoMarkdownText2.BentoMarkdownText(str5, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, 0, 30);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    composer3.startReplaceGroup(-1222216101);
                    if (str6 != null) {
                        BentoMarkdownText2.BentoMarkdownText(str6, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i25).getTextS(), i24, j10, j11, false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306800, 440);
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str2;
            j6 = j5;
            color3 = color52;
            i12 = i202;
            j7 = j4;
            modifier4 = modifier3;
            textStyle4 = textStyle52;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle4 = textStyle;
            j7 = j2;
            color3 = color;
            str3 = str;
            j6 = jM21425getFg0d7_KjU;
            composer2 = composerStartRestartGroup;
            modifier4 = modifier2;
            i12 = i2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I18nOptionsOnboardingSplashComposable3.I18nOptionsOnboardingSplashComposable_YeHINzE$lambda$0(i, j, z, title, summaryMarkdown, onCloseButtonClicked, onContinueButtonClicked, modifier4, textStyle4, i12, j7, j6, color3, str3, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
