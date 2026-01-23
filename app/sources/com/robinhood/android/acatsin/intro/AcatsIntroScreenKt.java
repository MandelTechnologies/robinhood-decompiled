package com.robinhood.android.acatsin.intro;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.intro.AcatsInIntroViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0015H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0017\u001a\u00020\u0018*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"AcatsIntroBackButtonTag", "", "AcatsIntroLottieTag", "AcatsIntroImageTag", "AcatsIntroScreen", "", "viewState", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "callbacks", "Lcom/robinhood/android/acatsin/intro/AcatsIntroScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;Lcom/robinhood/android/acatsin/intro/AcatsIntroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AcatsIntroLoadedScreen", "state", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Ready;", "pageIndex", "", "onContinue", "Lkotlin/Function0;", "onPageChange", "Lkotlin/Function1;", "(Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Ready;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "aspectRatio", "", "Landroid/graphics/Rect;", "getAspectRatio", "(Landroid/graphics/Rect;)F", "feature-acats-in_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "playRemaining", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsIntroScreenKt {
    public static final String AcatsIntroBackButtonTag = "acats_intro_back_button";
    public static final String AcatsIntroImageTag = "acats_intro_image";
    public static final String AcatsIntroLottieTag = "acats_intro_lottie";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsIntroLoadedScreen$lambda$16(AcatsInIntroViewState.Ready ready, int i, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        AcatsIntroLoadedScreen(ready, i, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsIntroScreen$lambda$6(AcatsInIntroViewState acatsInIntroViewState, AcatsIntroScreenCallbacks acatsIntroScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsIntroScreen(acatsInIntroViewState, acatsIntroScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsIntroScreen(final AcatsInIntroViewState viewState, final AcatsIntroScreenCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        AcatsInIntroViewState.Ready ready;
        final long jet;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1896004585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1896004585, i3, -1, "com.robinhood.android.acatsin.intro.AcatsIntroScreen (AcatsIntroScreen.kt:61)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changed(viewState));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(AcatsIntroScreenKt.AcatsIntroScreen$lambda$1$lambda$0(viewState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (!(viewState instanceof AcatsInIntroViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-893243357);
                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, new ShimmerLoaderType.Hero.Size.Relative(0.45f), true, true, composerStartRestartGroup, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3456, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(viewState instanceof AcatsInIntroViewState.Ready)) {
                        composerStartRestartGroup.startReplaceGroup(-893245157);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-893235030);
                    AcatsInIntroViewState.Ready ready2 = (AcatsInIntroViewState.Ready) viewState;
                    int iAcatsIntroScreen$lambda$2 = AcatsIntroScreen$lambda$2(snapshotState4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i5 = i3 & 112;
                    boolean z2 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new AcatsIntroScreenKt$AcatsIntroScreen$1$1$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z3 = i5 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new AcatsIntroScreenKt$AcatsIntroScreen$1$2$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AcatsIntroLoadedScreen(ready2, iAcatsIntroScreen$lambda$2, function0, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                ready = !(viewState instanceof AcatsInIntroViewState.Ready) ? (AcatsInIntroViewState.Ready) viewState : null;
                if (!(ready == null && ready.getBonusShown())) {
                    composerStartRestartGroup.startReplaceGroup(-1920166107);
                    jet = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1920114554);
                    jet = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifier5 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$AcatsIntroScreenKt.INSTANCE.getLambda$1837485852$feature_acats_in_externalDebug(), boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), ComposableLambda3.rememberComposableLambda(-648147600, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$AcatsIntroScreen$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-648147600, i6, -1, "com.robinhood.android.acatsin.intro.AcatsIntroScreen.<anonymous>.<anonymous> (AcatsIntroScreen.kt:99)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AcatsIntroScreenKt.AcatsIntroBackButtonTag);
                        AcatsIntroScreenCallbacks acatsIntroScreenCallbacks = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(acatsIntroScreenCallbacks);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new AcatsIntroScreenKt$AcatsIntroScreen$1$3$1$1(acatsIntroScreenCallbacks);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, Color.m6701boximpl(jet), (Function0) ((KFunction) objRememberedValue4), composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i6 << 12) & 57344), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsIntroScreenKt.AcatsIntroScreen$lambda$6(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(AcatsIntroScreenKt.AcatsIntroScreen$lambda$1$lambda$0(viewState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (!(viewState instanceof AcatsInIntroViewState.Loading)) {
                        }
                        if (!(viewState instanceof AcatsInIntroViewState.Ready)) {
                        }
                        if (ready == null) {
                            if (!(ready == null && ready.getBonusShown())) {
                            }
                            Modifier modifier52 = modifier4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$AcatsIntroScreenKt.INSTANCE.getLambda$1837485852$feature_acats_in_externalDebug(), boxScopeInstance2.align(Modifier.INSTANCE, companion3.getTopCenter()), ComposableLambda3.rememberComposableLambda(-648147600, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$AcatsIntroScreen$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                                    invoke(bentoAppBarScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i6 & 6) == 0) {
                                        i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-648147600, i6, -1, "com.robinhood.android.acatsin.intro.AcatsIntroScreen.<anonymous>.<anonymous> (AcatsIntroScreen.kt:99)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AcatsIntroScreenKt.AcatsIntroBackButtonTag);
                                    AcatsIntroScreenCallbacks acatsIntroScreenCallbacks = callbacks;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer2.changedInstance(acatsIntroScreenCallbacks);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new AcatsIntroScreenKt$AcatsIntroScreen$1$3$1$1(acatsIntroScreenCallbacks);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, Color.m6701boximpl(jet), (Function0) ((KFunction) objRememberedValue4), composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i6 << 12) & 57344), 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AcatsIntroScreen$lambda$1$lambda$0(AcatsInIntroViewState acatsInIntroViewState) {
        if (acatsInIntroViewState instanceof AcatsInIntroViewState.Ready) {
            return ((AcatsInIntroViewState.Ready) acatsInIntroViewState).getPageIndex();
        }
        return 0;
    }

    private static final LottieComposition AcatsIntroLoadedScreen$lambda$11(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final boolean AcatsIntroLoadedScreen$lambda$14(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final int AcatsIntroScreen$lambda$2(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AcatsIntroLoadedScreen(final AcatsInIntroViewState.Ready ready, int i, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, Composer composer, final int i2) {
        int i3;
        PagerState pagerState;
        Modifier.Companion companion;
        float f;
        Object obj;
        boolean z;
        Rect bounds;
        Composer composer2;
        Rect bounds2;
        Composer composer3;
        final int i4 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708666059);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ready) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1708666059, i5, -1, "com.robinhood.android.acatsin.intro.AcatsIntroLoadedScreen (AcatsIntroScreen.kt:115)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ready);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Object obj2 = objRememberedValue;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(AcatsIntroScreenKt.AcatsIntroLoadedScreen$lambda$8$lambda$7(ready));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function02);
                    obj2 = function02;
                }
                composerStartRestartGroup.endReplaceGroup();
                PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) obj2, composerStartRestartGroup, 0, 3);
                Integer numValueOf = Integer.valueOf(i4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState) | ((i5 & 112) == 32);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AcatsIntroScreenKt$AcatsIntroLoadedScreen$1$1(pagerStateRememberPagerState, i4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i5 >> 3) & 14);
                Integer numValueOf2 = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged2 = ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AcatsIntroScreenKt$AcatsIntroLoadedScreen$2$1(function1, pagerStateRememberPagerState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(ready.getLottieUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged3 = composerStartRestartGroup.changed(ready);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(AcatsIntroScreenKt.AcatsIntroLoadedScreen$lambda$13$lambda$12(ready));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                float aspectRatio = 1.0f;
                if (ready.getOverrideImageUrls().get(i4) == null) {
                    composerStartRestartGroup.startReplaceGroup(-549398005);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    LottieComposition lottieCompositionAcatsIntroLoadedScreen$lambda$11 = AcatsIntroLoadedScreen$lambda$11(lottieCompositionResultRememberLottieComposition);
                    if (lottieCompositionAcatsIntroLoadedScreen$lambda$11 != null && (bounds2 = lottieCompositionAcatsIntroLoadedScreen$lambda$11.getBounds()) != null) {
                        aspectRatio = getAspectRatio(bounds2);
                    }
                    pagerState = pagerStateRememberPagerState;
                    PagedLottie2.PagedLottie(TestTag3.testTag(AspectRatio3.aspectRatio$default(modifierFillMaxWidth$default, aspectRatio, false, 2, null), AcatsIntroLottieTag), AcatsIntroLoadedScreen$lambda$11(lottieCompositionResultRememberLottieComposition), ContentScale.INSTANCE.getCrop(), ready.getLottieSpecs(), i4, 0.0f, AcatsIntroLoadedScreen$lambda$14(snapshotState4), composerStartRestartGroup, ((i5 << 9) & 57344) | 384, 32);
                    i4 = i4;
                    Composer composer4 = composerStartRestartGroup;
                    composer4.endReplaceGroup();
                    companion = companion2;
                    f = 0.0f;
                    obj = null;
                    z = true;
                    composer2 = composer4;
                } else {
                    pagerState = pagerStateRememberPagerState;
                    composerStartRestartGroup.startReplaceGroup(-548919241);
                    companion = companion2;
                    f = 0.0f;
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(ready.getOverrideImageUrls().get(i4)).size(Size.ORIGINAL).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    ContentScale crop = ContentScale.INSTANCE.getCrop();
                    obj = null;
                    z = true;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    LottieComposition lottieCompositionAcatsIntroLoadedScreen$lambda$112 = AcatsIntroLoadedScreen$lambda$11(lottieCompositionResultRememberLottieComposition);
                    if (lottieCompositionAcatsIntroLoadedScreen$lambda$112 != null && (bounds = lottieCompositionAcatsIntroLoadedScreen$lambda$112.getBounds()) != null) {
                        aspectRatio = getAspectRatio(bounds);
                    }
                    ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, TestTag3.testTag(AspectRatio3.aspectRatio$default(modifierFillMaxWidth$default2, aspectRatio, false, 2, null), AcatsIntroImageTag), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                }
                Composer composer5 = composer2;
                boolean z2 = z;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composer5, 0, 7);
                Composer composer6 = composer5;
                PagerKt.m5301HorizontalPager8jOkeI(pagerState, Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, f, z2 ? 1 : 0, obj), 1.0f, false, 2, null), null, null, 0, 0.0f, companion3.getTop(), null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1585015838, z2, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$AcatsIntroLoadedScreen$3$1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer7, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer7, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope HorizontalPager, int i6, Composer composer7, int i7) {
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1585015838, i7, -1, "com.robinhood.android.acatsin.intro.AcatsIntroLoadedScreen.<anonymous>.<anonymous> (AcatsIntroScreen.kt:168)");
                        }
                        ImmutableList<UIComponent<GenericAction>> immutableList = ready.getPages().get(i6);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer7.startReplaceGroup(767440808);
                        SduiColumns.SduiLazyColumn(immutableList, GenericAction.class, modifierM5146paddingqDBjuR0$default, LazyListStateKt.rememberLazyListState(0, 0, composer7, 0, 3), null, null, HorizontalPadding.Default, false, composer7, 12582912, 0);
                        composer7.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer6, 54), composer6, 1572864, 24576, 16316);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-863901676, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$AcatsIntroLoadedScreen$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer7, int i6) {
                        String strStringResource;
                        if ((i6 & 3) == 2 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-863901676, i6, -1, "com.robinhood.android.acatsin.intro.AcatsIntroLoadedScreen.<anonymous>.<anonymous> (AcatsIntroScreen.kt:176)");
                        }
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        if (i4 < ready.getPages().size() - 1) {
                            composer7.startReplaceGroup(-1050578926);
                            strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer7, 0);
                            composer7.endReplaceGroup();
                        } else {
                            composer7.startReplaceGroup(-1050450524);
                            strStringResource = StringResources_androidKt.stringResource(C7725R.string.acats_in_intro_swipies_cta_page_4, composer7, 0);
                            composer7.endReplaceGroup();
                        }
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer7, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer6, 54), composer6, 6);
                composer6.endNode();
                composer3 = composer6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer3 = composer6;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return AcatsIntroScreenKt.AcatsIntroLoadedScreen$lambda$16(ready, i4, function0, function1, i2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AcatsIntroLoadedScreen$lambda$8$lambda$7(AcatsInIntroViewState.Ready ready) {
        return ready.getPages().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AcatsIntroLoadedScreen$lambda$13$lambda$12(AcatsInIntroViewState.Ready ready) {
        return ready.getPageIndex() == ready.getPages().size();
    }

    private static final float getAspectRatio(Rect rect) {
        return rect.width() / rect.height();
    }
}
