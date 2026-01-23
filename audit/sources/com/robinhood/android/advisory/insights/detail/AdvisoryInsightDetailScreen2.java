package com.robinhood.android.advisory.insights.detail;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.exoplayer.ExoPlayer;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryInsightDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryInsightDetailScreen2 implements Function4<AnimatedContentScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ AudioControllerState $audioController;
    final /* synthetic */ long $audioDurationMs;
    final /* synthetic */ SnapshotState<Boolean> $hideAsset$delegate;
    final /* synthetic */ ExoPlayer $videoPlayer;
    final /* synthetic */ AdvisoryInsightDetailViewState $viewState;

    AdvisoryInsightDetailScreen2(SnapshotState<Boolean> snapshotState, AdvisoryInsightDetailViewState advisoryInsightDetailViewState, AudioControllerState audioControllerState, long j, ExoPlayer exoPlayer) {
        this.$hideAsset$delegate = snapshotState;
        this.$viewState = advisoryInsightDetailViewState;
        this.$audioController = audioControllerState;
        this.$audioDurationMs = j;
        this.$videoPlayer = exoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer, Integer num2) {
        invoke(animatedContentScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, int i, Composer composer, int i2) {
        AudioControllerState audioControllerState;
        long j;
        Composer composer2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(393594422, i2, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:290)");
        }
        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(scrollStateRememberScrollState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(AdvisoryInsightDetailScreen2.invoke$lambda$1$lambda$0(scrollStateRememberScrollState));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        boolean zInvoke$lambda$2 = invoke$lambda$2(snapshotState4);
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(zInvoke$lambda$2);
        final SnapshotState<Boolean> snapshotState = this.$hideAsset$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new NestedScrollModifier() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$1$2$hideAssetInterceptor$1$1
                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostFling-RZ2iAVY */
                public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j2, long j3, Continuation continuation) {
                    return super.mo5023onPostFlingRZ2iAVY(j2, j3, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostScroll-DzOQY0M */
                public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j2, long j3, int i5) {
                    return super.mo5024onPostScrollDzOQY0M(j2, j3, i5);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreFling-QWom1Mo */
                public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j2, Continuation continuation) {
                    return super.mo5609onPreFlingQWom1Mo(j2, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreScroll-OzD1aCk */
                public long mo5298onPreScrollOzD1aCk(long available, int source) {
                    int i5 = (int) (available & 4294967295L);
                    if (Float.intBitsToFloat(i5) >= 0.0f || AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$1(snapshotState)) {
                        if (Float.intBitsToFloat(i5) > 0.0f && AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$1(snapshotState) && AdvisoryInsightDetailScreen2.invoke$lambda$2(snapshotState4)) {
                            AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$2(snapshotState, false);
                        }
                    } else {
                        AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$2(snapshotState, true);
                    }
                    return Offset.INSTANCE.m6553getZeroF1C5BW0();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(AnimationModifier.animateContentSize$default(NestedScrollModifier7.nestedScroll$default(companion, (AdvisoryInsightDetailScreen4) objRememberedValue2, null, 2, null), null, null, 3, null), null, 1, null);
        final AdvisoryInsightDetailViewState advisoryInsightDetailViewState = this.$viewState;
        AudioControllerState audioControllerState2 = this.$audioController;
        long j2 = this.$audioDurationMs;
        SnapshotState<Boolean> snapshotState2 = this.$hideAsset$delegate;
        final ExoPlayer exoPlayer = this.$videoPlayer;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(-1173017456);
        AdvisoryInsightDetailViewState.Loaded loaded = (AdvisoryInsightDetailViewState.Loaded) advisoryInsightDetailViewState;
        if (loaded.getAssetUiModel() != null) {
            audioControllerState = audioControllerState2;
            j = j2;
            composer2 = composer;
            i4 = 3;
            i3 = 2;
            AnimatedVisibilityKt.AnimatedVisibility(column6, !AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$1(snapshotState2), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(495049119, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$1$2$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(495049119, i5, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:323)");
                    }
                    ExoPlayer exoPlayer2 = exoPlayer;
                    AdvisoryInsightDetailViewState3 assetUiModel = ((AdvisoryInsightDetailViewState.Loaded) advisoryInsightDetailViewState).getAssetUiModel();
                    if (assetUiModel != null) {
                        AdvisoryInsightDetailScreen.InsightAssetSection(exoPlayer2, assetUiModel, TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM()), 0.0f, 1, null), null, false, 3, null), 0.0f, C2002Dp.m7995constructorimpl(330), 1, null), AdvisoryInsightDetailScreen.TAG_ASSET_SECTION), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            }, composer, 54), composer2, 1600518, 18);
        } else {
            audioControllerState = audioControllerState2;
            j = j2;
            composer2 = composer;
            i3 = 2;
            i4 = 3;
        }
        composer2.endReplaceGroup();
        AdvisoryInsightDetailScreen.TextContentSection(extensions2.toImmutableList(loaded.getContentMarkdown()), loaded.getFormattedDate(), loaded.getDisclosureMarkdown(), loaded.getPostContentCta(), scrollStateRememberScrollState, TestTag3.testTag(AnimationModifier.animateContentSize$default(Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, i3, null), 1.0f, false, 2, null), null, null, i4, null), AdvisoryInsightDetailScreen.TAG_AUDIO_CONTENT), audioControllerState, j, loaded.getTopLineText(), composer2, 0, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1$lambda$0(ScrollState scrollState) {
        return !scrollState.getCanScrollBackward();
    }
}
