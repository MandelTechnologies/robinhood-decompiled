package com.robinhood.android.optionsupgrade;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.SplashPageImprovement;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionOnboardingImprovementSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0015\u001aY\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u000e\u0010\u001f\u001a\u00020 X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#\"\u000e\u0010$\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006+²\u0006\f\u0010,\u001a\u0004\u0018\u00010-X\u008a\u0084\u0002"}, m3636d2 = {"OptionOnboardingImprovementSplashComposable", "", "splashData", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement;", "footerMarkdown", "", "isLoading", "", "onContinueClicked", "Lkotlin/Function0;", "onBackPressed", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/optionsupgrade/SplashPageImprovement;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Topbar", "backButtonTint", "Landroidx/compose/ui/graphics/Color;", "Topbar-gKt5lHk", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "ScrollableContent", "isLottie", "(ZLcom/robinhood/android/optionsupgrade/SplashPageImprovement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "isAchromatic", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "textLinkColor", "BottomBar-88mDfTA", "(ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "SPLASH_ASSET_RATIO", "", "SPLASH_ASSET_SIZE", "Landroidx/compose/ui/unit/Dp;", "F", "CREATIVE_IMAGE_TAG", "CREATIVE_LOTTIE_TAG", "TITLE_TAG", "DESCRIPTION_NO_LEARN_MORE_TAG", "DESCRIPTION_LEARN_MORE_TAG", "DISCLAIMER_TEXT_TAG", "CTA_TAG", "feature-options-upgrade_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingImprovementSplashComposable3 {
    public static final String CREATIVE_IMAGE_TAG = "creative_image_tag";
    public static final String CREATIVE_LOTTIE_TAG = "creative_lottie_tag";
    public static final String CTA_TAG = "continue_tag";
    public static final String DESCRIPTION_LEARN_MORE_TAG = "description_learn_more_tag";
    public static final String DESCRIPTION_NO_LEARN_MORE_TAG = "description_no_learn_more_tag";
    public static final String DISCLAIMER_TEXT_TAG = "disclaimer_text_tag";
    private static final float SPLASH_ASSET_RATIO = 0.6f;
    private static final float SPLASH_ASSET_SIZE = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
    public static final String TITLE_TAG = "title_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar_88mDfTA$lambda$4(boolean z, String str, boolean z2, Function0 function0, Context context, Navigator navigator, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m17403BottomBar88mDfTA(z, str, z2, function0, context, navigator, modifier, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingImprovementSplashComposable$lambda$0(SplashPageImprovement splashPageImprovement, String str, boolean z, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionOnboardingImprovementSplashComposable(splashPageImprovement, str, z, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableContent$lambda$3(boolean z, SplashPageImprovement splashPageImprovement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ScrollableContent(z, splashPageImprovement, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Topbar_gKt5lHk$lambda$2(Function0 function0, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m17404TopbargKt5lHk(function0, modifier, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingImprovementSplashComposable(final SplashPageImprovement splashData, final String footerMarkdown, final boolean z, final Function0<Unit> onContinueClicked, final Function0<Unit> onBackPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        final boolean z3;
        long jM21371getBg0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(splashData, "splashData");
        Intrinsics.checkNotNullParameter(footerMarkdown, "footerMarkdown");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(661132394);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(splashData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(footerMarkdown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(661132394, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable (OptionOnboardingImprovementSplashComposable.kt:66)");
                    }
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    z3 = splashData.getCreative() instanceof SplashPageImprovement.Creative.RemoteLottie;
                    if (!z3) {
                        composerStartRestartGroup.startReplaceGroup(-924355355);
                        if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                            jM21371getBg0d7_KjU = BentoColor.INSTANCE.m21211getDayHeatherBG0d7_KjU();
                        } else {
                            jM21371getBg0d7_KjU = BentoColor.INSTANCE.m21310getNightHeatherBG0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-924207020);
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    final boolean z4 = z2;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-27779026, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-27779026, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:82)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, null, composer3, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(898975727, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(898975727, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:87)");
                            }
                            OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(z3, footerMarkdown, z4, onContinueClicked, context, navigator, null, 0L, composer3, 0, 192);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-1704121799, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(padding) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1704121799, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:98)");
                            }
                            OptionOnboardingImprovementSplashComposable3.ScrollableContent(z3, splashData, PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom())), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306800, 441);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingImprovementSplashComposable3.OptionOnboardingImprovementSplashComposable$lambda$0(splashData, footerMarkdown, z, onContinueClicked, onBackPressed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                z3 = splashData.getCreative() instanceof SplashPageImprovement.Creative.RemoteLottie;
                if (!z3) {
                }
                final boolean z42 = z2;
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-27779026, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-27779026, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:82)");
                        }
                        OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, null, composer3, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(898975727, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(898975727, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:87)");
                        }
                        OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(z3, footerMarkdown, z42, onContinueClicked, context2, navigator2, null, 0L, composer3, 0, 192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-1704121799, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.OptionOnboardingImprovementSplashComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(padding) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1704121799, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:98)");
                        }
                        OptionOnboardingImprovementSplashComposable3.ScrollableContent(z3, splashData, PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom())), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306800, 441);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: Topbar-gKt5lHk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17404TopbargKt5lHk(final Function0<Unit> onBackPressed, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color color2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Color color3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1682479026);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    color3 = color2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final Color color4 = i4 == 0 ? null : color2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1682479026, i3, -1, "com.robinhood.android.optionsupgrade.Topbar (OptionOnboardingImprovementSplashComposable.kt:120)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$62189605$feature_options_upgrade_externalDebug = OptionOnboardingImprovementSplashComposable.INSTANCE.getLambda$62189605$feature_options_upgrade_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(723259769, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$Topbar$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(723259769, i6, -1, "com.robinhood.android.optionsupgrade.Topbar.<anonymous>.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:129)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(Modifier.INSTANCE, false, color4, onBackPressed, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i6 << 12) & 57344), 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    Color color5 = color4;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$62189605$feature_options_upgrade_externalDebug, null, composableLambdaRememberComposableLambda, null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    color3 = color5;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingImprovementSplashComposable3.Topbar_gKt5lHk$lambda$2(onBackPressed, modifier3, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            color2 = color;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$62189605$feature_options_upgrade_externalDebug2 = OptionOnboardingImprovementSplashComposable.INSTANCE.getLambda$62189605$feature_options_upgrade_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(723259769, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$Topbar$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(723259769, i6, -1, "com.robinhood.android.optionsupgrade.Topbar.<anonymous>.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:129)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(Modifier.INSTANCE, false, color4, onBackPressed, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i6 << 12) & 57344), 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    Color color52 = color4;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$62189605$feature_options_upgrade_externalDebug2, null, composableLambdaRememberComposableLambda2, null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    color3 = color52;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        color2 = color;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void ScrollableContent(final boolean z, final SplashPageImprovement splashPageImprovement, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520253409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(splashPageImprovement) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520253409, i3, -1, "com.robinhood.android.optionsupgrade.ScrollableContent (OptionOnboardingImprovementSplashComposable.kt:146)");
            }
            BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, ComposableLambda3.rememberComposableLambda(-1451602807, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt.ScrollableContent.1
                private static final LottieComposition invoke$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    int i6;
                    SplashPageImprovement splashPageImprovement2;
                    boolean z2;
                    Modifier.Companion companion;
                    int i7;
                    BentoTheme bentoTheme;
                    int i8;
                    TextStyle displayCapsuleMedium;
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1451602807, i6, -1, "com.robinhood.android.optionsupgrade.ScrollableContent.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:150)");
                    }
                    float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    SplashPageImprovement splashPageImprovement3 = splashPageImprovement;
                    boolean z3 = z;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(fMo5102getMaxHeightD9Ej5fM * OptionOnboardingImprovementSplashComposable3.SPLASH_ASSET_RATIO)), C2002Dp.m7993boximpl(OptionOnboardingImprovementSplashComposable3.SPLASH_ASSET_SIZE))).getValue());
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 5, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    SplashPageImprovement.Creative creative = splashPageImprovement3.getCreative();
                    if (creative instanceof SplashPageImprovement.Creative.Drawable) {
                        composer3.startReplaceGroup(-1950367441);
                        splashPageImprovement2 = splashPageImprovement3;
                        z2 = z3;
                        ImageKt.Image(PainterResources_androidKt.painterResource(((SplashPageImprovement.Creative.Drawable) splashPageImprovement3.getCreative()).getDrawableRes(), composer3, 0), splashPageImprovement3.getTitle(), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingImprovementSplashComposable3.CREATIVE_IMAGE_TAG), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24960, 104);
                        composer3.endReplaceGroup();
                        companion = companion2;
                        bentoTheme = bentoTheme2;
                        i7 = i9;
                    } else {
                        splashPageImprovement2 = splashPageImprovement3;
                        z2 = z3;
                        if (!(creative instanceof SplashPageImprovement.Creative.RemoteLottie)) {
                            composer3.startReplaceGroup(1876745470);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-1949837310);
                        companion = companion2;
                        i7 = i9;
                        bentoTheme = bentoTheme2;
                        LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(((SplashPageImprovement.Creative.RemoteLottie) splashPageImprovement2.getCreative()).getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingImprovementSplashComposable3.CREATIVE_LOTTIE_TAG), 0.0f, 1, null), OptionOnboardingImprovementSplashComposable3.SPLASH_ASSET_SIZE), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, companion3.getTopCenter(), ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer2, 1572912, 221184, 0, 2047932);
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    String title = splashPageImprovement2.getTitle();
                    if (z2) {
                        composer3.startReplaceGroup(-866071586);
                        i8 = i7;
                        displayCapsuleMedium = bentoTheme.getTypography(composer3, i8).getDisplayMartinaLarge();
                        composer3.endReplaceGroup();
                    } else {
                        i8 = i7;
                        composer3.startReplaceGroup(-865985251);
                        displayCapsuleMedium = bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium();
                        composer3.endReplaceGroup();
                    }
                    TextStyle textStyle = displayCapsuleMedium;
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    int i10 = i8;
                    Modifier.Companion companion6 = companion;
                    BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, "title_tag"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer3, 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(splashPageImprovement2.getSummary(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion6, OptionOnboardingImprovementSplashComposable3.DESCRIPTION_NO_LEARN_MORE_TAG), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i10).m21596getXxlargeD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8120);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM()), composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingImprovementSplashComposable3.ScrollableContent$lambda$3(z, splashPageImprovement, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* renamed from: BottomBar-88mDfTA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17403BottomBar88mDfTA(final boolean z, final String footerMarkdown, final boolean z2, final Function0<Unit> onContinueClicked, final Context context, final Navigator navigator, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        final boolean z4;
        Modifier modifier2;
        long j2;
        final long jM21426getFg20d7_KjU;
        int i4;
        final Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(footerMarkdown, "footerMarkdown");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(2011323093);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(footerMarkdown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(context) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    j2 = j;
                    int i6 = composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
                    i3 |= i6;
                } else {
                    j2 = j;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 128) == 0) {
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM21426getFg20d7_KjU = j2;
                    }
                    i4 = i3;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    long j4 = j2;
                    i4 = i3;
                    modifier3 = modifier2;
                    jM21426getFg20d7_KjU = j4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2011323093, i4, -1, "com.robinhood.android.optionsupgrade.BottomBar (OptionOnboardingImprovementSplashComposable.kt:236)");
                }
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.valueOf(z3), null, null, ComposableLambda3.rememberComposableLambda(1598398093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1

                    /* compiled from: OptionOnboardingImprovementSplashComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1 */
                    static final class C249761 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ String $footerMarkdown;
                        final /* synthetic */ boolean $isLoading;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ Function0<Unit> $onContinueClicked;
                        final /* synthetic */ long $textLinkColor;

                        C249761(Modifier modifier, long j, String str, Navigator navigator, Context context, Function0<Unit> function0, boolean z) {
                            this.$modifier = modifier;
                            this.$textLinkColor = j;
                            this.$footerMarkdown = str;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$onContinueClicked = function0;
                            this.$isLoading = z;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1372016088, i, -1, "com.robinhood.android.optionsupgrade.BottomBar.<anonymous>.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:239)");
                            }
                            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(this.$modifier, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            long j = this.$textLinkColor;
                            String str = this.$footerMarkdown;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Function0<Unit> function0 = this.$onContinueClicked;
                            boolean z = this.$isLoading;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), j, false, composer, BentoMarkdownText.$stable << 15, 16);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingImprovementSplashComposable3.DISCLAIMER_TEXT_TAG), 0.0f, 1, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0140: CONSTRUCTOR (r7v2 'objRememberedValue' java.lang.Object) = 
                                      (r5v0 'navigator' com.robinhood.android.navigation.Navigator A[DONT_INLINE])
                                      (r8v0 'context' android.content.Context A[DONT_INLINE])
                                     A[MD:(com.robinhood.android.navigation.Navigator, android.content.Context):void (m)] (LINE:257) call: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.Navigator, android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 413
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable4.C249761.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, String url) {
                                Intrinsics.checkNotNullParameter(url, "url");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(url, ""), null, false, null, null, 60, null);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1598398093, i7, -1, "com.robinhood.android.optionsupgrade.BottomBar.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:238)");
                            }
                            SurfaceKt.m5967SurfaceT9BRK9s(null, null, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1372016088, true, new C249761(modifier3, jM21426getFg20d7_KjU, footerMarkdown, navigator, context, onContinueClicked, z4), composer3, 54), composer3, 12583296, 123);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 << 15) & 458752) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j3 = jM21426getFg20d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingImprovementSplashComposable3.BottomBar_88mDfTA$lambda$4(z, footerMarkdown, z2, onContinueClicked, context, navigator, modifier4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((12582912 & i) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    i4 = i3;
                    modifier3 = modifier5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.valueOf(z3), null, null, ComposableLambda3.rememberComposableLambda(1598398093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1

                        /* compiled from: OptionOnboardingImprovementSplashComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1 */
                        static final class C249761 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ String $footerMarkdown;
                            final /* synthetic */ boolean $isLoading;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ Function0<Unit> $onContinueClicked;
                            final /* synthetic */ long $textLinkColor;

                            C249761(Modifier modifier, long j, String str, Navigator navigator, Context context, Function0<Unit> function0, boolean z) {
                                this.$modifier = modifier;
                                this.$textLinkColor = j;
                                this.$footerMarkdown = str;
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$onContinueClicked = function0;
                                this.$isLoading = z;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0140: CONSTRUCTOR (r7v2 'objRememberedValue' java.lang.Object) = 
                                  (r5v0 'navigator' com.robinhood.android.navigation.Navigator A[DONT_INLINE])
                                  (r8v0 'context' android.content.Context A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.navigation.Navigator, android.content.Context):void (m)] (LINE:257) call: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.Navigator, android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposableKt$BottomBar$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 20 more
                                */
                            public final void invoke(androidx.compose.runtime.Composer r27, int r28) {
                                /*
                                    Method dump skipped, instructions count: 413
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionsupgrade.OptionOnboardingImprovementSplashComposable4.C249761.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, String url) {
                                Intrinsics.checkNotNullParameter(url, "url");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(url, ""), null, false, null, null, 60, null);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1598398093, i7, -1, "com.robinhood.android.optionsupgrade.BottomBar.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:238)");
                            }
                            SurfaceKt.m5967SurfaceT9BRK9s(null, null, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1372016088, true, new C249761(modifier3, jM21426getFg20d7_KjU, footerMarkdown, navigator, context, onContinueClicked, z4), composer3, 54), composer3, 12583296, 123);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 << 15) & 458752) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    j3 = jM21426getFg20d7_KjU;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
    }
