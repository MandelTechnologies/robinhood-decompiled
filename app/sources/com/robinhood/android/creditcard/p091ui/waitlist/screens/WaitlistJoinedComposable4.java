package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.p014ui.PlayerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.WaitlistJoinedComposable4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextResponse;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WaitlistJoinedComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"WaitlistJoined", "", "onClose", "Lkotlin/Function0;", "onInvite", "video", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "referralsBlocked", "", "referralContext", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse$RhReferralContext;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/Pair;ZLcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse$RhReferralContext;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/runtime/Composer;II)V", "RowItem", "labelId", "", "valueId", "(IILandroidx/compose/runtime/Composer;I)V", "Video", "fallback", "audioOn", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/common/MediaItem;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WAITLIST_JOINED_HEADER_TEST_TAG", "", "WAITLIST_JOINED_TITLE_TEST_TAG", "WAITLIST_JOINED_SUBTITLE_TEST_TAG", "WAITLIST_JOINED_CLOSE_CTA_TEST_TAG", "WAITLIST_JOINED_VOLUME_CTA_TEST_TAG", "WAITLIST_JOINED_ROW_TEST_TAG", "WAITLIST_JOINED_REFERRAL_BLOCKED_TEST_TAG", "WAITLIST_JOINED_TERMS_TEST_TAG", "WAITLIST_JOINED_VIDEO_TEST_TAG", "feature-credit-card_externalDebug", "showVideo", "showContent", "contentState", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WaitlistJoinedComposable4 {
    public static final String WAITLIST_JOINED_CLOSE_CTA_TEST_TAG = "waitlist-joined-close-cta-test-tag";
    public static final String WAITLIST_JOINED_HEADER_TEST_TAG = "waitlist-joined-header-test-tag";
    public static final String WAITLIST_JOINED_REFERRAL_BLOCKED_TEST_TAG = "waitlist-joined-referral-blocked-test-tag";
    public static final String WAITLIST_JOINED_ROW_TEST_TAG = "waitlist-joined-row-test-tag";
    public static final String WAITLIST_JOINED_SUBTITLE_TEST_TAG = "waitlist-joined-subtitle-test-tag";
    public static final String WAITLIST_JOINED_TERMS_TEST_TAG = "waitlist-joined-terms-test-tag";
    public static final String WAITLIST_JOINED_TITLE_TEST_TAG = "waitlist-joined-title-test-tag";
    public static final String WAITLIST_JOINED_VIDEO_TEST_TAG = "waitlist-joined-video-test-tag";
    public static final String WAITLIST_JOINED_VOLUME_CTA_TEST_TAG = "waitlist-joined-volume-cta-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowItem$lambda$16(int i, int i2, int i3, Composer composer, int i4) {
        RowItem(i, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Video$lambda$25(MediaSource mediaSource, MediaItem mediaItem, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Video(mediaSource, mediaItem, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitlistJoined$lambda$14(Function0 function0, Function0 function02, Tuples2 tuples2, boolean z, ReferralContextResponse.RhReferralContext rhReferralContext, AccountSelectorTabArgs accountSelectorTabArgs, int i, int i2, Composer composer, int i3) {
        WaitlistJoined(function0, function02, tuples2, z, rhReferralContext, accountSelectorTabArgs, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: WaitlistJoinedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2 */
    static final class C127232 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
        final /* synthetic */ SnapshotState<Boolean> $audioOn$delegate;
        final /* synthetic */ SnapshotState4<Float> $contentState$delegate;
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ Function0<Unit> $onInvite;
        final /* synthetic */ ReferralContextResponse.RhReferralContext $referralContext;
        final /* synthetic */ boolean $referralsBlocked;
        final /* synthetic */ SnapshotState<Boolean> $showVideo$delegate;
        final /* synthetic */ Tuples2<MediaSource, MediaItem> $video;

        /* JADX WARN: Multi-variable type inference failed */
        C127232(Tuples2<? extends MediaSource, MediaItem> tuples2, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState4<Float> snapshotState4, AccountSelectorTabArgs accountSelectorTabArgs, ReferralContextResponse.RhReferralContext rhReferralContext, Function0<Unit> function0, boolean z, Function0<Unit> function02) {
            this.$video = tuples2;
            this.$showVideo$delegate = snapshotState;
            this.$audioOn$delegate = snapshotState2;
            this.$contentState$delegate = snapshotState4;
            this.$accountSelectorTabArgs = accountSelectorTabArgs;
            this.$referralContext = rhReferralContext;
            this.$onClose = function0;
            this.$referralsBlocked = z;
            this.$onInvite = function02;
        }

        public final void invoke(Composer composer, int i) {
            final SnapshotState4<Float> snapshotState4;
            AccountSelectorTabArgs accountSelectorTabArgs;
            ReferralContextResponse.RhReferralContext rhReferralContext;
            Function0<Unit> function0;
            boolean z;
            String subtitle;
            final SnapshotState4<Float> snapshotState42;
            boolean z2;
            Modifier.Companion companion;
            BentoTheme bentoTheme;
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486277702, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoined.<anonymous> (WaitlistJoinedComposable.kt:112)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
            Screen.Name name = Screen.Name.CC_WAITLIST_JOINED;
            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifierM4872backgroundbw27NRU$default, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null));
            Tuples2<MediaSource, MediaItem> tuples2 = this.$video;
            SnapshotState<Boolean> snapshotState = this.$showVideo$delegate;
            SnapshotState<Boolean> snapshotState2 = this.$audioOn$delegate;
            SnapshotState4<Float> snapshotState43 = this.$contentState$delegate;
            AccountSelectorTabArgs accountSelectorTabArgs2 = this.$accountSelectorTabArgs;
            ReferralContextResponse.RhReferralContext rhReferralContext2 = this.$referralContext;
            Function0<Unit> function02 = this.$onClose;
            boolean z3 = this.$referralsBlocked;
            Function0<Unit> function03 = this.$onInvite;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(1680727226);
            if (WaitlistJoinedComposable4.WaitlistJoined$lambda$2(snapshotState)) {
                function0 = function02;
                snapshotState4 = snapshotState43;
                z = z3;
                rhReferralContext = rhReferralContext2;
                accountSelectorTabArgs = accountSelectorTabArgs2;
                WaitlistJoinedComposable4.Video(tuples2.getFirst(), tuples2.getSecond(), WaitlistJoinedComposable4.WaitlistJoined$lambda$10(snapshotState2), TestTag3.testTag(companion2, WaitlistJoinedComposable4.WAITLIST_JOINED_VIDEO_TEST_TAG), composer, 3072, 0);
            } else {
                snapshotState4 = snapshotState43;
                accountSelectorTabArgs = accountSelectorTabArgs2;
                rhReferralContext = rhReferralContext2;
                function0 = function02;
                z = z3;
            }
            composer.endReplaceGroup();
            boolean z4 = !WaitlistJoinedComposable4.WaitlistJoined$lambda$2(snapshotState);
            EnterTransition none = EnterTransition.INSTANCE.getNone();
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween(600, 0, Easing3.getLinearEasing()), 0.0f, 2, null);
            WaitlistJoinedComposable waitlistJoinedComposable = WaitlistJoinedComposable.INSTANCE;
            final Function0<Unit> function04 = function0;
            boolean z5 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z4, (Modifier) null, none, exitTransitionFadeOut$default, (String) null, waitlistJoinedComposable.getLambda$1969137060$feature_credit_card_externalDebug(), composer, 196608, 18);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WaitlistJoinedComposable4.C127232.invoke$lambda$21$lambda$1$lambda$0((DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierFillMaxSize$default, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierDrawBehind);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WaitlistJoinedComposable4.C127232.invoke$lambda$21$lambda$20$lambda$3$lambda$2(snapshotState4, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(-1041238995);
            if (accountSelectorTabArgs != null) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
            }
            composer.endReplaceGroup();
            final SnapshotState4<Float> snapshotState44 = snapshotState4;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(waitlistJoinedComposable.m12874getLambda$1155622731$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(2038370313, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$1$2$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2038370313, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoined.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistJoinedComposable.kt:167)");
                    }
                    if (function04 != null) {
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_JOINED, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), WaitlistJoinedComposable4.WAITLIST_JOINED_CLOSE_CTA_TEST_TAG), false, 0L, function04, composer2, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), ComposableLambda3.rememberComposableLambda(-1067557526, true, new WaitlistJoinedComposable8(snapshotState2), composer, 54), null, true, false, null, null, 0L, null, composer, 200070, 0, 2002);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), centerVertically, composer, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.BUBBLE_CHECKED_16);
            BentoColor bentoColor = BentoColor.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(size16, null, bentoColor.m21138getCCGoldAccent0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_heading, composer, 0), TestTag3.testTag(companion2, WaitlistJoinedComposable4.WAITLIST_JOINED_HEADER_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 48, 0, 16380);
            composer.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
            Modifier modifierTestTag = TestTag3.testTag(companion2, WaitlistJoinedComposable4.WAITLIST_JOINED_TITLE_TEST_TAG);
            String title = rhReferralContext != null ? rhReferralContext.getTitle() : null;
            composer.startReplaceGroup(-1041131440);
            if (title == null) {
                title = StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_title, composer, 0);
            }
            composer.endReplaceGroup();
            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion6 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(title, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composer, 6);
            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer, 6, 1), WaitlistJoinedComposable4.WAITLIST_JOINED_SUBTITLE_TEST_TAG);
            if (rhReferralContext == null || (subtitle = rhReferralContext.getSubtitle()) == null) {
                subtitle = "";
            }
            BentoText2.m20747BentoText38GnDrw(subtitle, modifierTestTag2, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            composer.endNode();
            Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getBottomCenter());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer, modifierAlign);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(snapshotState44);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WaitlistJoinedComposable4.C127232.invoke$lambda$21$lambda$20$lambda$19$lambda$7$lambda$6(snapshotState44, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(spaceAround, centerVertically2, composer, 54);
            int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer2);
            Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion4.getSetModifier());
            WaitlistJoinedComposable4.RowItem(C12201R.string.waitlist_joined_material, C12201R.string.waitlist_joined_gold, composer, 0);
            WaitlistJoinedComposable4.RowItem(C12201R.string.waitlist_joined_weight, C12201R.string.waitlist_joined_36g, composer, 0);
            WaitlistJoinedComposable4.RowItem(C12201R.string.waitlist_joined_quantity, C12201R.string.waitlist_joined_limited, composer, 0);
            composer.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion4.getSetModifier());
            if (z5) {
                composer.startReplaceGroup(300918927);
                composer.startReplaceGroup(5004770);
                boolean zChanged3 = composer.changed(snapshotState44);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion5.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WaitlistJoinedComposable4.C127232.m1881xbdc77e60(snapshotState44, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                z2 = z5;
                snapshotState42 = snapshotState44;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_referrals_blocked, composer, 0), TestTag3.testTag(GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue4), WaitlistJoinedComposable4.WAITLIST_JOINED_REFERRAL_BLOCKED_TEST_TAG), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
                composer.endReplaceGroup();
                companion = companion2;
                bentoTheme = bentoTheme2;
                i2 = i3;
            } else {
                snapshotState42 = snapshotState44;
                z2 = z5;
                composer.startReplaceGroup(301550831);
                final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_referrals_terms_url, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zChanged4 = composer.changed(snapshotState42);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue5 == companion5.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WaitlistJoinedComposable4.C127232.m1882x24f1b25b(snapshotState42, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                companion = companion2;
                Modifier modifierTestTag3 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue5), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, strStringResource, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), WaitlistJoinedComposable4.WAITLIST_JOINED_TERMS_TEST_TAG);
                String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_offer_t_and_c, composer, 0);
                BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
                bentoTheme = bentoTheme2;
                i2 = i3;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(context) | composer.changed(strStringResource);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == companion5.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WaitlistJoinedComposable4.C127232.m1883x4ebb17df(context, strStringResource);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue6, strStringResource2, modifierTestTag3, null, size, false, Color.m6701boximpl(jM21425getFg0d7_KjU), composer, 24576, 40);
                composer.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion5.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WaitlistJoinedComposable4.C127232.m1884x78847d63((DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(modifierFillMaxWidth$default3, (Function1) objRememberedValue7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composer, modifierDrawBehind2);
            Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl8 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion4.getSetModifier());
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, bentoColor.m21139getCCGoldBG0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(42511785, true, new WaitlistJoinedComposable9(snapshotState42, z2, function03), composer, 54), composer, 805306368, 506);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$1$lambda$0(DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Brush.Companion companion = Brush.INSTANCE;
            Float fValueOf = Float.valueOf(0.0f);
            Color.Companion companion2 = Color.INSTANCE;
            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.3765f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.7828f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$20$lambda$3$lambda$2(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(WaitlistJoinedComposable4.WaitlistJoined$lambda$13(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$20$lambda$19$lambda$7$lambda$6(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(WaitlistJoinedComposable4.WaitlistJoined$lambda$13(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda$21$lambda$20$lambda$19$lambda$18$lambda$10$lambda$9 */
        public static final Unit m1881xbdc77e60(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(WaitlistJoinedComposable4.WaitlistJoined$lambda$13(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda$21$lambda$20$lambda$19$lambda$18$lambda$12$lambda$11 */
        public static final Unit m1882x24f1b25b(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(WaitlistJoinedComposable4.WaitlistJoined$lambda$13(snapshotState4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda$21$lambda$20$lambda$19$lambda$18$lambda$14$lambda$13 */
        public static final Unit m1883x4ebb17df(Context context, String str) {
            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda$21$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15 */
        public static final Unit m1884x78847d63(DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Brush.Companion companion = Brush.INSTANCE;
            Float fValueOf = Float.valueOf(0.0f);
            BentoColor bentoColor = BentoColor.INSTANCE;
            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21139getCCGoldBG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WaitlistJoined$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WaitlistJoined$lambda$13(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WaitlistJoined$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean WaitlistJoined$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WaitlistJoined(final Function0<Unit> function0, final Function0<Unit> onInvite, final Tuples2<? extends MediaSource, MediaItem> video, final boolean z, final ReferralContextResponse.RhReferralContext rhReferralContext, AccountSelectorTabArgs accountSelectorTabArgs, Composer composer, final int i, final int i2) {
        int i3;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotState snapshotState2;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onInvite, "onInvite");
        Intrinsics.checkNotNullParameter(video, "video");
        Composer composerStartRestartGroup = composer.startRestartGroup(-164625266);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInvite) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(video) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rhReferralContext) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                accountSelectorTabArgs2 = accountSelectorTabArgs;
                i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                AccountSelectorTabArgs accountSelectorTabArgs3 = i4 == 0 ? null : accountSelectorTabArgs2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-164625266, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoined (WaitlistJoinedComposable.kt:88)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WaitlistJoinedComposable4.WaitlistJoined$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WaitlistJoinedComposable4.WaitlistJoined$lambda$5$lambda$4();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WaitlistJoinedComposable4.WaitlistJoined$lambda$9$lambda$8();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new WaitlistJoinedComposable6(snapshotState, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!WaitlistJoined$lambda$6(snapshotState2) ? 1.0f : 0.0f, AnimationSpecKt.tween(600, 0, new CubicBezierEasing(0.17f, 0.17f, 0.1f, 0.1f)), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                Boolean bool = Boolean.FALSE;
                Boolean bool2 = Boolean.TRUE;
                AccountSelectorTabArgs accountSelectorTabArgs4 = accountSelectorTabArgs3;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(486277702, true, new C127232(video, snapshotState, snapshotState3, snapshotState4AnimateFloatAsState, accountSelectorTabArgs4, rhReferralContext, function0, z, onInvite), composerStartRestartGroup, 54);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoTheme2.BentoTheme(bool, null, bool2, null, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 100663686, 250);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                accountSelectorTabArgs2 = accountSelectorTabArgs4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WaitlistJoinedComposable4.WaitlistJoined$lambda$14(function0, onInvite, video, z, rhReferralContext, accountSelectorTabArgs5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        accountSelectorTabArgs2 = accountSelectorTabArgs;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr4 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr22 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr32 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState32 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = new WaitlistJoinedComposable6(snapshotState, snapshotState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!WaitlistJoined$lambda$6(snapshotState2) ? 1.0f : 0.0f, AnimationSpecKt.tween(600, 0, new CubicBezierEasing(0.17f, 0.17f, 0.1f, 0.1f)), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                Boolean bool3 = Boolean.FALSE;
                Boolean bool22 = Boolean.TRUE;
                AccountSelectorTabArgs accountSelectorTabArgs42 = accountSelectorTabArgs3;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(486277702, true, new C127232(video, snapshotState, snapshotState32, snapshotState4AnimateFloatAsState2, accountSelectorTabArgs42, rhReferralContext, function0, z, onInvite), composerStartRestartGroup, 54);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoTheme2.BentoTheme(bool3, null, bool22, null, null, null, null, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 100663686, 250);
                if (ComposerKt.isTraceInProgress()) {
                }
                accountSelectorTabArgs2 = accountSelectorTabArgs42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState WaitlistJoined$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WaitlistJoined$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState WaitlistJoined$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WaitlistJoined$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WaitlistJoined$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState WaitlistJoined$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RowItem(final int i, final int i2, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-161091029);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161091029, i4, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.RowItem (WaitlistJoinedComposable.kt:325)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, WAITLIST_JOINED_ROW_TEST_TAG);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextAnnotation(), composer2, 24576, 0, 8174);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i2, composer2, (i4 >> 3) & 14), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8190);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WaitlistJoinedComposable4.RowItem$lambda$16(i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Video(final MediaSource mediaSource, final MediaItem fallback, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        final ExoPlayer exoPlayer;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final LifecycleOwner lifecycleOwner;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1290334660);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(mediaSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fallback) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-1290334660, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.Video (WaitlistJoinedComposable.kt:351)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                Object obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                    if (mediaSource != null) {
                        exoPlayerBuild.setMediaSource(mediaSource);
                    } else {
                        exoPlayerBuild.setMediaItem(fallback);
                    }
                    exoPlayerBuild.prepare();
                    exoPlayerBuild.setRepeatMode(1);
                    exoPlayerBuild.setPlayWhenReady(true);
                    exoPlayerBuild.setVideoScalingMode(1);
                    exoPlayerBuild.setVolume(0.0f);
                    composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                    obj = exoPlayerBuild;
                }
                exoPlayer = (ExoPlayer) obj;
                composerStartRestartGroup.endReplaceGroup();
                Intrinsics.checkNotNull(exoPlayer);
                if (z) {
                    exoPlayer.setVolume(0.0f);
                } else {
                    exoPlayer.setVolume(exoPlayer.getDeviceVolume());
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WaitlistJoinedComposable4.Video$lambda$21$lambda$20(context, exoPlayer, (Context) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier4, null, composerStartRestartGroup, (i3 >> 6) & 112, 4);
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WaitlistJoinedComposable4.Video$lambda$24$lambda$23(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return WaitlistJoinedComposable4.Video$lambda$25(mediaSource, fallback, z, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            Object obj2 = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
            }
            exoPlayer = (ExoPlayer) obj2;
            composerStartRestartGroup.endReplaceGroup();
            Intrinsics.checkNotNull(exoPlayer);
            if (z) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return WaitlistJoinedComposable4.Video$lambda$21$lambda$20(context, exoPlayer, (Context) obj22);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier4, null, composerStartRestartGroup, (i3 >> 6) & 112, 4);
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return WaitlistJoinedComposable4.Video$lambda$24$lambda$23(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj22);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView Video$lambda$21$lambda$20(Context context, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(3);
        playerView.setShutterBackgroundColor(0);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Video$lambda$24$lambda$23(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$Video$2$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    exoPlayer.pause();
                } else if (event == Lifecycle.Event.ON_START) {
                    exoPlayer.play();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$Video$lambda$24$lambda$23$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
            }
        };
    }
}
