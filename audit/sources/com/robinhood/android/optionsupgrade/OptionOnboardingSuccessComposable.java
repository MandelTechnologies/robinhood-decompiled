package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"OptionOnboardingSuccessComposable", "", "splashData", "Lcom/robinhood/android/optionsupgrade/SplashPageData;", "primaryButtonText", "", "modifier", "Landroidx/compose/ui/Modifier;", "primaryButtonLoading", "", "helperText", "inlineLinkText", "inlineLinkTextOnClick", "Lkotlin/Function0;", "primaryButtonOnClick", "secondaryButtonOnClick", "secondaryButtonText", "(Lcom/robinhood/android/optionsupgrade/SplashPageData;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "SUCCESS_PAGE_LOTTIE_TAG", "SUCCESS_PAGE_TITLE_TAG", "SUCCESS_PAGE_SUMMARY_TAG", "SUCCESS_PAGE_BUTTON_BAR_TAG", "feature-options-upgrade_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSuccessComposable {
    public static final String SUCCESS_PAGE_BUTTON_BAR_TAG = "primary_button_tag";
    public static final String SUCCESS_PAGE_LOTTIE_TAG = "lottie_tag";
    public static final String SUCCESS_PAGE_SUMMARY_TAG = "summary_tag";
    public static final String SUCCESS_PAGE_TITLE_TAG = "title_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingSuccessComposable$lambda$0(SplashPageData splashPageData, String str, Modifier modifier, boolean z, String str2, String str3, Function0 function0, Function0 function02, Function0 function03, String str4, int i, int i2, Composer composer, int i3) {
        OptionOnboardingSuccessComposable(splashPageData, str, modifier, z, str2, str3, function0, function02, function03, str4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingSuccessComposable(final SplashPageData splashData, final String primaryButtonText, Modifier modifier, boolean z, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str6;
        final Function0<Unit> function04;
        final boolean z3;
        final String str7;
        final String str8;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final String str9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(splashData, "splashData");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1300457457);
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
            i3 |= composerStartRestartGroup.changed(primaryButtonText) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str4 = str;
                        i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            str5 = str2;
                            i3 |= composerStartRestartGroup.changed(str5) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                            }
                            i10 = i2 & 256;
                            if (i10 == 0) {
                                i3 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                                }
                                i12 = i2 & 512;
                                if (i12 == 0) {
                                    if ((i & 805306368) == 0) {
                                        i13 = i12;
                                        i3 |= composerStartRestartGroup.changed(str3) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            z2 = false;
                                        }
                                        String str10 = i5 == 0 ? null : str4;
                                        if (i6 != 0) {
                                            str5 = null;
                                        }
                                        final Function0<Unit> function07 = i7 == 0 ? null : function0;
                                        Function0<Unit> function08 = i9 == 0 ? null : function02;
                                        final Function0<Unit> function09 = i11 == 0 ? null : function03;
                                        final String str11 = i13 == 0 ? null : str3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            str6 = str10;
                                        } else {
                                            str6 = str10;
                                            ComposerKt.traceEventStart(-1300457457, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable (OptionOnboardingSuccessComposable.kt:42)");
                                        }
                                        final Function0<Unit> function010 = function08;
                                        final boolean z4 = z2;
                                        final String str12 = str6;
                                        final Modifier modifier3 = modifier2;
                                        final String str13 = str5;
                                        BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(-901572951, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i15) {
                                                if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-901572951, i15, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous> (OptionOnboardingSuccessComposable.kt:44)");
                                                }
                                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, composer2, 0, 1);
                                                final String str14 = str12;
                                                final String str15 = str13;
                                                final Function0<Unit> function011 = function07;
                                                final Function0<Unit> function012 = function010;
                                                final String str16 = primaryButtonText;
                                                final boolean z5 = z4;
                                                final Function0<Unit> function013 = function09;
                                                final String str17 = str11;
                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(689681758, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1.1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                                        invoke(bentoButtonBar3, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i16) {
                                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                        if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(689681758, i16, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous>.<anonymous> (OptionOnboardingSuccessComposable.kt:49)");
                                                        }
                                                        BentoButtonBar2.BentoButtonBar(TestTag3.testTag(Modifier.INSTANCE, OptionOnboardingSuccessComposable.SUCCESS_PAGE_BUTTON_BAR_TAG), str14, str15, false, function011, null, function012, str16, z5, null, false, function013, str17, false, null, false, composer3, 6, 0, 58920);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54);
                                                final SplashPageData splashPageData = splashData;
                                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM21623defaultHorizontalPaddingrAjV9yQ, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-754968175, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1.2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                        invoke(boxScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    private static final LottieComposition invoke$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                                                        return lottieCompositionResult.getValue();
                                                    }

                                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i16) {
                                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                        if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-754968175, i16, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous>.<anonymous> (OptionOnboardingSuccessComposable.kt:63)");
                                                        }
                                                        Alignment.Companion companion = Alignment.INSTANCE;
                                                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                                        SplashPageData splashPageData2 = splashPageData;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
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
                                                        LottieAnimation2.LottieAnimation(invoke$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(splashPageData2.getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingSuccessComposable.SUCCESS_PAGE_LOTTIE_TAG), 0.0f, 1, null), C2002Dp.m7995constructorimpl(400)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, companion.getTopCenter(), ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer3, 48, 221184, 0, 2047996);
                                                        String title = splashPageData2.getTitle();
                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                        int i17 = BentoTheme.$stable;
                                                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i17).getDisplayCapsuleMedium();
                                                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                                        BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, "title_tag"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 48, 0, 8124);
                                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i17).m21593getSmallD9Ej5fM()), composer3, 0);
                                                        BentoText2.m20747BentoText38GnDrw(splashPageData2.getSummary(), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingSuccessComposable.SUCCESS_PAGE_SUMMARY_TAG), 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i17).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i17).getTextM(), composer3, 48, 0, 8120);
                                                        composer3.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 3456, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function04 = function07;
                                        z3 = z4;
                                        str7 = str13;
                                        str8 = str11;
                                        modifier2 = modifier3;
                                        function05 = function09;
                                        function06 = function010;
                                        str9 = str12;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        function04 = function0;
                                        function05 = function03;
                                        str8 = str3;
                                        z3 = z2;
                                        str9 = str4;
                                        str7 = str5;
                                        function06 = function02;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return OptionOnboardingSuccessComposable.OptionOnboardingSuccessComposable$lambda$0(splashData, primaryButtonText, modifier2, z3, str9, str7, function04, function06, function05, str8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 805306368;
                                i13 = i12;
                                if ((i3 & 306783379) == 306783378) {
                                    if (i14 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final Function0<Unit> function0102 = function08;
                                    final boolean z42 = z2;
                                    final String str122 = str6;
                                    final Modifier modifier32 = modifier2;
                                    final String str132 = str5;
                                    BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(-901572951, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i15) {
                                            if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-901572951, i15, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous> (OptionOnboardingSuccessComposable.kt:44)");
                                            }
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(modifier32, 0.0f, 1, null), 0.0f, composer2, 0, 1);
                                            final String str14 = str122;
                                            final String str15 = str132;
                                            final Function0<Unit> function011 = function07;
                                            final Function0<Unit> function012 = function0102;
                                            final String str16 = primaryButtonText;
                                            final boolean z5 = z42;
                                            final Function0<Unit> function013 = function09;
                                            final String str17 = str11;
                                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(689681758, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                                    invoke(bentoButtonBar3, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i16) {
                                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                    if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(689681758, i16, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous>.<anonymous> (OptionOnboardingSuccessComposable.kt:49)");
                                                    }
                                                    BentoButtonBar2.BentoButtonBar(TestTag3.testTag(Modifier.INSTANCE, OptionOnboardingSuccessComposable.SUCCESS_PAGE_BUTTON_BAR_TAG), str14, str15, false, function011, null, function012, str16, z5, null, false, function013, str17, false, null, false, composer3, 6, 0, 58920);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54);
                                            final SplashPageData splashPageData = splashData;
                                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM21623defaultHorizontalPaddingrAjV9yQ, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-754968175, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposableKt.OptionOnboardingSuccessComposable.1.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                    invoke(boxScope, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                private static final LottieComposition invoke$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                                                    return lottieCompositionResult.getValue();
                                                }

                                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i16) {
                                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                    if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-754968175, i16, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessComposable.<anonymous>.<anonymous> (OptionOnboardingSuccessComposable.kt:63)");
                                                    }
                                                    Alignment.Companion companion = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                                    SplashPageData splashPageData2 = splashPageData;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
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
                                                    LottieAnimation2.LottieAnimation(invoke$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(splashPageData2.getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingSuccessComposable.SUCCESS_PAGE_LOTTIE_TAG), 0.0f, 1, null), C2002Dp.m7995constructorimpl(400)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, companion.getTopCenter(), ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer3, 48, 221184, 0, 2047996);
                                                    String title = splashPageData2.getTitle();
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i17 = BentoTheme.$stable;
                                                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i17).getDisplayCapsuleMedium();
                                                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                                    BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, "title_tag"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 48, 0, 8124);
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i17).m21593getSmallD9Ej5fM()), composer3, 0);
                                                    BentoText2.m20747BentoText38GnDrw(splashPageData2.getSummary(), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, OptionOnboardingSuccessComposable.SUCCESS_PAGE_SUMMARY_TAG), 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i17).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i17).getTextM(), composer3, 48, 0, 8120);
                                                    composer3.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54), composer2, 3456, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function04 = function07;
                                    z3 = z42;
                                    str7 = str132;
                                    str8 = str11;
                                    modifier2 = modifier32;
                                    function05 = function09;
                                    function06 = function0102;
                                    str9 = str122;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i11 = i10;
                            i12 = i2 & 512;
                            if (i12 == 0) {
                            }
                            i13 = i12;
                            if ((i3 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        i12 = i2 & 512;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if ((i3 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str5 = str2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    i12 = i2 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str4 = str;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str5 = str2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i2 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str4 = str;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str5 = str2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i2 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str4 = str;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str5 = str2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i2 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
