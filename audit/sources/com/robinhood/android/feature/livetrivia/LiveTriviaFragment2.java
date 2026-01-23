package com.robinhood.android.feature.livetrivia;

import android.content.Context;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.FragmentManager;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposable2;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;
import trivia.p550v1.GetVideoViewModelResponseDto;

/* compiled from: LiveTriviaFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$4$2$2, reason: use source file name */
/* loaded from: classes3.dex */
final class LiveTriviaFragment2 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
    final /* synthetic */ boolean $isVideoPlaying;
    final /* synthetic */ LiveTriviaViewState $state;
    final /* synthetic */ LiveTriviaFragment this$0;

    LiveTriviaFragment2(boolean z, LiveTriviaViewState liveTriviaViewState, LiveTriviaFragment liveTriviaFragment) {
        this.$isVideoPlaying = z;
        this.$state = liveTriviaViewState;
        this.this$0 = liveTriviaFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
        int i2;
        boolean z;
        LiveTriviaViewState liveTriviaViewState;
        Modifier.Companion companion;
        float f;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(272121040, i2, -1, "com.robinhood.android.feature.livetrivia.LiveTriviaFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveTriviaFragment.kt:243)");
        }
        float fM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(BoxWithConstraints.getConstraints());
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer2.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
        composer2.endReplaceGroup();
        float f2 = fM7974getMaxHeightimpl * 0.5f;
        float fMo5012toDpu2uoSUM = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(f2 - Math.max(snapshotIntState2.getIntValue() - f2, 0.0f));
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, fMo5012toDpu2uoSUM), 0.0f, 1, null);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Modifier modifierAlign = BoxWithConstraints.align(modifierFillMaxWidth$default, companion4.getTopStart());
        Alignment center = companion4.getCenter();
        boolean z2 = this.$isVideoPlaying;
        LiveTriviaViewState liveTriviaViewState2 = this.$state;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAlign);
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion5.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer2.startReplaceGroup(1139492353);
        if (z2) {
            z = z2;
            liveTriviaViewState = liveTriviaViewState2;
            companion = companion3;
        } else {
            GetVideoViewModelResponseDto triviaVideoViewModel = liveTriviaViewState2.getTriviaVideoViewModel();
            String asset_url = triviaVideoViewModel != null ? triviaVideoViewModel.getAsset_url() : null;
            if (asset_url != null) {
                liveTriviaViewState = liveTriviaViewState2;
                composer2.startReplaceGroup(964953927);
                companion = companion3;
                z = z2;
                f = 0.0f;
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(asset_url).build(), null, null, null, 0, null, composer, 0, 62), "Reward image", SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, fMo5012toDpu2uoSUM), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                composer2 = composer;
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1139536826);
                if (z && liveTriviaViewState.isVideoLoading()) {
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5149L, 0L, composer, 48, 5);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.startReplaceGroup(5004770);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$4$2$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveTriviaFragment2.invoke$lambda$6$lambda$5(snapshotIntState2, (IntSize) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion6 = companion;
                Modifier modifierAlign2 = BoxWithConstraints.align(SizeKt.fillMaxWidth$default(OnRemeasuredModifier2.onSizeChanged(companion6, (Function1) objRememberedValue), f, 1, null), companion4.getBottomCenter());
                Alignment center2 = companion4.getCenter();
                LiveTriviaFragment liveTriviaFragment = this.this$0;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAlign2);
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(companion6, f, 1, null), AnimationSpecKt.tween$default(500, 0, null, 6, null), null, 2, null);
                RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-live-trivia", null, 2, null);
                FragmentManager childFragmentManager = liveTriviaFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, childFragmentManager, modifierAnimateContentSize$default, null, null, null, null, false, null, composer, 0, 504);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            composer2.startReplaceGroup(964666340);
            GetVideoViewModelResponseDto triviaVideoViewModel2 = liveTriviaViewState2.getTriviaVideoViewModel();
            liveTriviaViewState = liveTriviaViewState2;
            SpinningCoinGridComposable2.m14478SpinningCoinGridComposableKz89ssw(fMo5012toDpu2uoSUM, triviaVideoViewModel2 != null ? triviaVideoViewModel2.is_gold_styled() : false, null, composer2, 0, 4);
            composer2.endReplaceGroup();
            companion = companion3;
            z = z2;
        }
        f = 0.0f;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1139536826);
        if (z) {
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5149L, 0L, composer, 48, 5);
            composer2 = composer;
        }
        composer2.endReplaceGroup();
        composer2.endNode();
        composer2.startReplaceGroup(5004770);
        objRememberedValue = composer2.rememberedValue();
        if (objRememberedValue == companion2.getEmpty()) {
        }
        composer2.endReplaceGroup();
        Modifier.Companion companion62 = companion;
        Modifier modifierAlign22 = BoxWithConstraints.align(SizeKt.fillMaxWidth$default(OnRemeasuredModifier2.onSizeChanged(companion62, (Function1) objRememberedValue), f, 1, null), companion4.getBottomCenter());
        Alignment center22 = companion4.getCenter();
        LiveTriviaFragment liveTriviaFragment2 = this.this$0;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierAlign22);
        Function0<ComposeUiNode> constructor22 = companion5.getConstructor();
        if (composer2.getApplier() == null) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion5.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (!composerM6388constructorimpl.getInserting()) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier22, companion5.getSetModifier());
        Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(companion62, f, 1, null), AnimationSpecKt.tween$default(500, 0, null, 6, null), null, 2, null);
        RemoteMicrogramApplication remoteMicrogramApplication2 = new RemoteMicrogramApplication("app-live-trivia", null, 2, null);
        FragmentManager childFragmentManager2 = liveTriviaFragment2.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication2, childFragmentManager2, modifierAnimateContentSize$default2, null, null, null, null, false, null, composer, 0, 504);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
        invoke(boxWithConstraints4, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }
}
