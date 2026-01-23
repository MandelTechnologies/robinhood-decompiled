package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsScreen;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import futures_onboarding_value_props.proto.p463v1.ImageInfoDto;
import futures_onboarding_value_props.proto.p463v1.LottieInfoDto;
import futures_onboarding_value_props.proto.p463v1.PageDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FuturesOnboardingValuePropsScreen.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aO\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"FUTURES_ONBOARDING_PAGER", "", "FUTURES_VALUE_PROPS_PROGRESS_INDICATOR", "FuturesOnboardingValuePropsScreen", "", "onSignupClicked", "Lkotlin/Function0;", "continueButtonLabel", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_onboarding_value_props/proto/v1/PageDto;", "onPageShown", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FuturesPager", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ImageHero", "imageInfo", "Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "(Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;Landroidx/compose/runtime/Composer;I)V", "LottieHero", "lottieInfo", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "pageIndex", "", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)V", "feature-futures-onboarding_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "animationState", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsScreen {
    public static final String FUTURES_ONBOARDING_PAGER = "futures_onboarding_pager";
    public static final String FUTURES_VALUE_PROPS_PROGRESS_INDICATOR = "futures_value_prop_progress_indicator";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesOnboardingValuePropsScreen$lambda$7(Function0 function0, String str, ImmutableList immutableList, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesOnboardingValuePropsScreen(function0, str, immutableList, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesPager$lambda$8(PagerState pagerState, ImmutableList immutableList, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesPager(pagerState, immutableList, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageHero$lambda$9(ImageInfoDto imageInfoDto, int i, Composer composer, int i2) {
        ImageHero(imageInfoDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LottieHero$lambda$15(LottieInfoDto lottieInfoDto, PagerState pagerState, int i, int i2, Composer composer, int i3) {
        LottieHero(lottieInfoDto, pagerState, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesOnboardingValuePropsScreen(final Function0<Unit> onSignupClicked, final String continueButtonLabel, final ImmutableList<PageDto> pages, final Function1<? super PageDto, Unit> onPageShown, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EventLogger current;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final PagerState pagerStateRememberPagerState;
        boolean z;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        long jM21427getFg30d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSignupClicked, "onSignupClicked");
        Intrinsics.checkNotNullParameter(continueButtonLabel, "continueButtonLabel");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(onPageShown, "onPageShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(-818632517);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSignupClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(continueButtonLabel) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pages) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageShown) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-818632517, i4, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreen (FuturesOnboardingValuePropsScreen.kt:63)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(pages);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(pages.size());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                FuturesPager(pagerStateRememberPagerState, pages, onPageShown, Column5.weight$default(column6, SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), composerStartRestartGroup, (i4 >> 3) & 1008, 0);
                composerStartRestartGroup.startReplaceGroup(-996264923);
                if (pages.size() <= 1) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion.getTop(), composerStartRestartGroup, 6);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1708649077);
                    int size = pages.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (pagerStateRememberPagerState.getCurrentPage() == i6) {
                            composerStartRestartGroup.startReplaceGroup(616765346);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(616766179);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BoxKt.Box(TestTag3.testTag(SizeKt.m5169size3ABfNKs(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), RoundedCornerShape2.getCircleShape()), jM21427getFg30d7_KjU, null, 2, null), C2002Dp.m7995constructorimpl(6)), "futures_value_prop_progress_indicator_" + i6), composerStartRestartGroup, 0);
                    }
                    z = false;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                } else {
                    z = false;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(pages) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | ((i4 & 14) != 4 ? true : z);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesOnboardingValuePropsScreen.FuturesOnboardingValuePropsScreen$lambda$6$lambda$5$lambda$4(current, pages, pagerStateRememberPagerState, onSignupClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, continueButtonLabel, PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, i4 & 112, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesOnboardingValuePropsScreen.FuturesOnboardingValuePropsScreen$lambda$7(onSignupClicked, continueButtonLabel, pages, onPageShown, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(pages);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(pages.size());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    FuturesPager(pagerStateRememberPagerState, pages, onPageShown, Column5.weight$default(column62, SizeKt.m5156height3ABfNKs(companion32, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), composerStartRestartGroup, (i4 >> 3) & 1008, 0);
                    composerStartRestartGroup.startReplaceGroup(-996264923);
                    if (pages.size() <= 1) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(pages) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | ((i4 & 14) != 4 ? true : z);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FuturesOnboardingValuePropsScreen.FuturesOnboardingValuePropsScreen$lambda$6$lambda$5$lambda$4(current, pages, pagerStateRememberPagerState, onSignupClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, continueButtonLabel, PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, i4 & 112, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition LottieHero$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieHero$lambda$12(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit FuturesOnboardingValuePropsScreen$lambda$6$lambda$5$lambda$4(EventLogger eventLogger, ImmutableList immutableList, PagerState pagerState, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.FUTURES_VALUE_PROPS_SCREEN, null, ((PageDto) immutableList.get(pagerState.getCurrentPage())).getTitle_markdown(), null, 10, null), null, null, new Context(pagerState.getCurrentPage() + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FuturesPager(final PagerState pagerState, final ImmutableList<PageDto> immutableList, final Function1<? super PageDto, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(449883339);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
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
                    ComposerKt.traceEventStart(449883339, i3, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesPager (FuturesOnboardingValuePropsScreen.kt:128)");
                }
                Modifier modifier5 = modifier4;
                PagerKt.m5301HorizontalPager8jOkeI(pagerState, TestTag3.testTag(modifier4, FUTURES_ONBOARDING_PAGER), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(838775786, true, new C174471(immutableList, function1, pagerState), composerStartRestartGroup, 54), composerStartRestartGroup, i3 & 14, 24576, 16380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesOnboardingValuePropsScreen.FuturesPager$lambda$8(pagerState, immutableList, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            PagerKt.m5301HorizontalPager8jOkeI(pagerState, TestTag3.testTag(modifier4, FUTURES_ONBOARDING_PAGER), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(838775786, true, new C174471(immutableList, function1, pagerState), composerStartRestartGroup, 54), composerStartRestartGroup, i3 & 14, 24576, 16380);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: FuturesOnboardingValuePropsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$FuturesPager$1 */
    static final class C174471 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function1<PageDto, Unit> $onPageShown;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ ImmutableList<PageDto> $pages;

        /* JADX WARN: Multi-variable type inference failed */
        C174471(ImmutableList<PageDto> immutableList, Function1<? super PageDto, Unit> function1, PagerState pagerState) {
            this.$pages = immutableList;
            this.$onPageShown = function1;
            this.$pagerState = pagerState;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            invoke(pagerScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838775786, i2, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesPager.<anonymous> (FuturesOnboardingValuePropsScreen.kt:133)");
            }
            PageDto pageDto = this.$pages.get(i);
            this.$onPageShown.invoke(pageDto);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FUTURES_VALUE_PROPS_SCREEN, null, pageDto.getTitle_markdown(), null, 10, null), null, new Context(i + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
            PagerState pagerState = this.$pagerState;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImageInfoDto image_info = pageDto.getImage_info();
            if (image_info != null) {
                composer.startReplaceGroup(960924026);
                FuturesOnboardingValuePropsScreen.ImageHero(image_info, composer, 0);
                composer.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                composer.startReplaceGroup(960987638);
                LottieInfoDto lottie_info = pageDto.getLottie_info();
                if (lottie_info != null) {
                    FuturesOnboardingValuePropsScreen.LottieHero(lottie_info, pagerState, i, composer, (i2 << 3) & 896);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
            }
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            String title_markdown = pageDto.getTitle_markdown();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(title_markdown, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12), 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8124);
            Alignment center = companion2.getCenter();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String subtitle_markdown = pageDto.getSubtitle_markdown();
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
            int i4 = BentoMarkdownText.$stable;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, iM7919getCentere0LSkKk, 0L, 0L, false, composer, i4 << 15, 28);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$FuturesPager$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesOnboardingValuePropsScreen.C174471.invoke$lambda$8$lambda$3$lambda$2$lambda$1(context, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i5 = MarkdownStyle.$stable;
            BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, i5 << 6, 10);
            composer.endNode();
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            String disclaimer_markdown = pageDto.getDisclaimer_markdown();
            composer.startReplaceGroup(-1215870829);
            if (disclaimer_markdown != null) {
                Alignment center2 = companion2.getCenter();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                final android.content.Context context2 = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i3).getTextM(), companion4.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), 0L, false, composer, i4 << 15, 24);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(context2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$FuturesPager$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesOnboardingValuePropsScreen.C174471.invoke$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(context2, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(disclaimer_markdown, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composer, i5 << 6, 10);
                composer.endNode();
                Unit unit3 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$3$lambda$2$lambda$1(android.content.Context context, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(android.content.Context context, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageHero(final ImageInfoDto imageInfoDto, Composer composer, final int i) {
        int i2;
        String dark_mode_url;
        Composer composerStartRestartGroup = composer.startRestartGroup(629169781);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(imageInfoDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629169781, i2, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ImageHero (FuturesOnboardingValuePropsScreen.kt:233)");
            }
            if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                dark_mode_url = imageInfoDto.getLight_mode_url();
            } else {
                dark_mode_url = imageInfoDto.getDark_mode_url();
            }
            String str = dark_mode_url;
            ImageLoader imageLoader = Coil.imageLoader((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            ContentScale.Companion companion = ContentScale.INSTANCE;
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str, imageLoader, null, null, companion.getFillWidth(), 0, null, composerStartRestartGroup, 24576, 108), (String) null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, companion.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOnboardingValuePropsScreen.ImageHero$lambda$9(imageInfoDto, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LottieHero(final LottieInfoDto lottieInfoDto, final PagerState pagerState, final int i, Composer composer, final int i2) {
        int i3;
        String dark_mode_url;
        Composer composerStartRestartGroup = composer.startRestartGroup(1922902122);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lottieInfoDto) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1922902122, i3, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.LottieHero (FuturesOnboardingValuePropsScreen.kt:255)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                dark_mode_url = lottieInfoDto.getLight_mode_url();
            } else {
                dark_mode_url = lottieInfoDto.getDark_mode_url();
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(dark_mode_url)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieInfoDto.PlaybackTypeDto playback_type = lottieInfoDto.getPlayback_type();
            LottieInfoDto.PlaybackTypeDto.LoopSection loopSection = playback_type instanceof LottieInfoDto.PlaybackTypeDto.LoopSection ? (LottieInfoDto.PlaybackTypeDto.LoopSection) playback_type : null;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LottieHero$lambda$10(lottieCompositionResultRememberLottieComposition), pagerState.getCurrentPage() == i, false, false, loopSection != null ? new LottieClipSpec.Frame(Integer.valueOf(loopSection.getValue().getStart_frame()), Integer.valueOf(loopSection.getValue().getEnd_frame()), false, 4, null) : null, 0.0f, loopSection == null ? 1 : Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, LottieClipSpec.Frame.$stable << 12, 940);
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? lottieInfoDto.getLight_mode_name() : lottieInfoDto.getDark_mode_name()), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 8, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE));
            ContentScale fit = ContentScale.INSTANCE.getFit();
            LottieComposition lottieCompositionLottieHero$lambda$10 = LottieHero$lambda$10(lottieCompositionResultRememberLottieComposition);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(FuturesOnboardingValuePropsScreen.LottieHero$lambda$12(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionLottieHero$lambda$10, (Function0) objRememberedValue, modifierM5156height3ABfNKs, false, false, false, null, false, null, null, fit, false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOnboardingValuePropsScreen.LottieHero$lambda$15(lottieInfoDto, pagerState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
