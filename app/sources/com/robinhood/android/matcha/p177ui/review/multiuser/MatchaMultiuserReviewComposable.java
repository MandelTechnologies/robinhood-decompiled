package com.robinhood.android.matcha.p177ui.review.multiuser;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.SwipeableDefaults;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.amount.ProfileBubbles;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewComposable;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.android.matcha.p177ui.review.MemoComposable3;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaMultiuserReviewComposable;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MatchaMultiuserReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u009b\u0001\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"ReviewMultiuserTransaction", "", "toolbarTitle", "", "toolbarSubtitle", "profileAvatarStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "amountText", ErrorBundle.SUMMARY_ENTRY, "onSummaryShowMoreClick", "Lkotlin/Function0;", "swipeHint", "onSubmit", "onBackClick", "onToolbarTitleClick", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "onMemoClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "ReviewMultiuserCard", "swipeOffsetPx", "", "parentHeight", "Landroidx/compose/ui/unit/Dp;", "ReviewMultiuserCard-xKBSf-U", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;FFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "SwipeAnimationDuration", "", "CardHeightPercentage", "CardTopCornerRadius", "CardBottomCornerRadius", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaMultiuserReviewComposable {
    private static final int CardBottomCornerRadius = 10;
    private static final float CardHeightPercentage = 0.8f;
    private static final int CardTopCornerRadius = 0;
    private static final int SwipeAnimationDuration = 350;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewMultiuserCard_xKBSf_U$lambda$7(String str, String str2, ImmutableList immutableList, String str3, String str4, Function0 function0, float f, float f2, Function0 function02, Function0 function03, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function04, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m16409ReviewMultiuserCardxKBSfU(str, str2, immutableList, str3, str4, function0, f, f2, function02, function03, matchaReviewTransactionViewState3, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewMultiuserTransaction$lambda$0(String str, String str2, ImmutableList immutableList, String str3, String str4, Function0 function0, String str5, Function0 function02, Function0 function03, Function0 function04, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function05, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ReviewMultiuserTransaction(str, str2, immutableList, str3, str4, function0, str5, function02, function03, function04, matchaReviewTransactionViewState3, function05, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaMultiuserReviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$ReviewMultiuserTransaction$1 */
    static final class C214681 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ String $amountText;
        final /* synthetic */ MatchaReviewTransactionViewState3 $memoState;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Function0<Unit> $onMemoClick;
        final /* synthetic */ Function0<Unit> $onSubmit;
        final /* synthetic */ Function0<Unit> $onSummaryShowMoreClick;
        final /* synthetic */ Function0<Unit> $onToolbarTitleClick;
        final /* synthetic */ ImmutableList<ProfileAvatarState> $profileAvatarStates;
        final /* synthetic */ String $summary;
        final /* synthetic */ String $swipeHint;
        final /* synthetic */ String $toolbarSubtitle;
        final /* synthetic */ String $toolbarTitle;

        /* JADX WARN: Multi-variable type inference failed */
        C214681(Function0<Unit> function0, String str, String str2, String str3, ImmutableList<? extends ProfileAvatarState> immutableList, String str4, String str5, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0<Unit> function05) {
            this.$onSubmit = function0;
            this.$swipeHint = str;
            this.$toolbarTitle = str2;
            this.$toolbarSubtitle = str3;
            this.$profileAvatarStates = immutableList;
            this.$amountText = str4;
            this.$summary = str5;
            this.$onSummaryShowMoreClick = function02;
            this.$onBackClick = function03;
            this.$onToolbarTitleClick = function04;
            this.$memoState = matchaReviewTransactionViewState3;
            this.$onMemoClick = function05;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$3$lambda$2(final SwipeableState swipeableState, final Function0 function0, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$ReviewMultiuserTransaction$1$invoke$lambda$3$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    if (swipeableState.getCurrentValue() == MatchaMultiuserReviewComposable2.Finish) {
                        function0.invoke();
                    }
                }
            };
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-670495118, i2, -1, "com.robinhood.android.matcha.ui.review.multiuser.ReviewMultiuserTransaction.<anonymous> (MatchaMultiuserReviewComposable.kt:68)");
            }
            float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
            MatchaMultiuserReviewComposable2 matchaMultiuserReviewComposable2 = MatchaMultiuserReviewComposable2.Start;
            final SwipeableState swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(matchaMultiuserReviewComposable2, AnimationSpecKt.tween$default(MatchaMultiuserReviewComposable.SwipeAnimationDuration, 0, Easing3.getFastOutSlowInEasing(), 2, null), null, composer, 6, 4);
            float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fMo5102getMaxHeightD9Ej5fM);
            composer.startReplaceGroup(-100700984);
            if (swipeableStateRememberSwipeableState.isAnimationRunning()) {
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(swipeableStateRememberSwipeableState) | composer.changed(this.$onSubmit);
                final Function0<Unit> function0 = this.$onSubmit;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$ReviewMultiuserTransaction$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchaMultiuserReviewComposable.C214681.invoke$lambda$3$lambda$2(swipeableStateRememberSwipeableState, function0, (DisposableEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 6);
            }
            composer.endReplaceGroup();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment topCenter = companion.getTopCenter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, 2, null);
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(Float.valueOf(0.0f), matchaMultiuserReviewComposable2), Tuples4.m3642to(Float.valueOf(-fMo5016toPx0680j_4), MatchaMultiuserReviewComposable2.Finish));
            Orientation orientation = Orientation.Vertical;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$ReviewMultiuserTransaction$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchaMultiuserReviewComposable.C214681.invoke$lambda$5$lambda$4((MatchaMultiuserReviewComposable2) obj, (MatchaMultiuserReviewComposable2) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5651swipeablepPrIpRY = SwipeableKt.m5651swipeablepPrIpRY(modifierM4872backgroundbw27NRU$default, swipeableStateRememberSwipeableState, mapMapOf, orientation, (440 & 8) != 0, (440 & 16) != 0 ? false : false, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                @Override // kotlin.jvm.functions.Function2
                public final FixedThreshold invoke(Object obj, Object obj2) {
                    return new FixedThreshold(C2002Dp.m7995constructorimpl(56), null);
                }
            } : (Function2) objRememberedValue2, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & 256) != 0 ? SwipeableDefaults.INSTANCE.m5650getVelocityThresholdD9Ej5fM() : 0.0f);
            String str = this.$swipeHint;
            String str2 = this.$toolbarTitle;
            String str3 = this.$toolbarSubtitle;
            ImmutableList<ProfileAvatarState> immutableList = this.$profileAvatarStates;
            String str4 = this.$amountText;
            String str5 = this.$summary;
            Function0<Unit> function02 = this.$onSummaryShowMoreClick;
            Function0<Unit> function03 = this.$onBackClick;
            Function0<Unit> function04 = this.$onToolbarTitleClick;
            MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3 = this.$memoState;
            Function0<Unit> function05 = this.$onMemoClick;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5651swipeablepPrIpRY);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            MatchaReviewComposable.ReviewSwipeHint(BoxScopeInstance.INSTANCE.align(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(0.19999999f * fMo5102getMaxHeightD9Ej5fM)), companion.getBottomCenter()), str, swipeableStateRememberSwipeableState.getOffset().getValue().floatValue(), composer, 0);
            MatchaMultiuserReviewComposable.m16409ReviewMultiuserCardxKBSfU(str2, str3, immutableList, str4, str5, function02, swipeableStateRememberSwipeableState.getOffset().getValue().floatValue(), fMo5102getMaxHeightD9Ej5fM, function03, function04, matchaReviewTransactionViewState3, function05, null, composer, 0, 0, 4096);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThresholdConfig invoke$lambda$5$lambda$4(MatchaMultiuserReviewComposable2 matchaMultiuserReviewComposable2, MatchaMultiuserReviewComposable2 matchaMultiuserReviewComposable22) {
            Intrinsics.checkNotNullParameter(matchaMultiuserReviewComposable2, "<unused var>");
            Intrinsics.checkNotNullParameter(matchaMultiuserReviewComposable22, "<unused var>");
            return new FractionalThreshold(0.5f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewMultiuserTransaction(final String toolbarTitle, final String str, final ImmutableList<? extends ProfileAvatarState> profileAvatarStates, final String amountText, final String summary, final Function0<Unit> onSummaryShowMoreClick, final String swipeHint, final Function0<Unit> onSubmit, final Function0<Unit> onBackClick, final Function0<Unit> function0, final MatchaReviewTransactionViewState3 memoState, final Function0<Unit> onMemoClick, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(onSummaryShowMoreClick, "onSummaryShowMoreClick");
        Intrinsics.checkNotNullParameter(swipeHint, "swipeHint");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1835272696);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(toolbarTitle) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(profileAvatarStates) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(amountText) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(summary) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSummaryShowMoreClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(swipeHint) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSubmit) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackClick) ? 67108864 : 33554432;
        }
        if ((i3 & 512) == 0) {
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
            }
            if ((i3 & 1024) == 0) {
                i5 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i5 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 4 : 2);
            } else {
                i5 = i2;
            }
            int i9 = i5;
            if ((i3 & 2048) == 0) {
                i6 = i9 | 48;
            } else if ((i2 & 48) == 0) {
                i6 = i9 | (composerStartRestartGroup.changedInstance(onMemoClick) ? 32 : 16);
            } else {
                i6 = i9;
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
                i8 = i6 | 384;
            } else {
                int i10 = i6;
                if ((i2 & 384) == 0) {
                    i10 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i8 = i10;
            }
            if ((i4 & 306783379) == 306783378 || (i8 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835272696, i4, i8, "com.robinhood.android.matcha.ui.review.multiuser.ReviewMultiuserTransaction (MatchaMultiuserReviewComposable.kt:66)");
                }
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambda3.rememberComposableLambda(-670495118, true, new C214681(onSubmit, swipeHint, toolbarTitle, str, profileAvatarStates, amountText, summary, onSummaryShowMoreClick, onBackClick, function0, memoState, onMemoClick), composerStartRestartGroup, 54), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchaMultiuserReviewComposable.ReviewMultiuserTransaction$lambda$0(toolbarTitle, str, profileAvatarStates, amountText, summary, onSummaryShowMoreClick, swipeHint, onSubmit, onBackClick, function0, memoState, onMemoClick, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 805306368;
        if ((i3 & 1024) == 0) {
        }
        int i92 = i5;
        if ((i3 & 2048) == 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambda3.rememberComposableLambda(-670495118, true, new C214681(onSubmit, swipeHint, toolbarTitle, str, profileAvatarStates, amountText, summary, onSummaryShowMoreClick, onBackClick, function0, memoState, onMemoClick), composerStartRestartGroup, 54), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* renamed from: ReviewMultiuserCard-xKBSf-U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16409ReviewMultiuserCardxKBSfU(final String toolbarTitle, final String str, final ImmutableList<? extends ProfileAvatarState> profileAvatarStates, final String amountText, final String summary, final Function0<Unit> onSummaryShowMoreClick, final float f, final float f2, final Function0<Unit> onBackClick, final Function0<Unit> function0, final MatchaReviewTransactionViewState3 memoState, final Function0<Unit> onMemoClick, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier2;
        Composer composer2;
        boolean z2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(onSummaryShowMoreClick, "onSummaryShowMoreClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-290859913);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(toolbarTitle) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(profileAvatarStates) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(amountText) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(summary) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSummaryShowMoreClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackClick) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else {
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
            }
            if ((i3 & 1024) == 0) {
                i5 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i5 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 4 : 2);
            } else {
                i5 = i2;
            }
            if ((i3 & 2048) == 0) {
                i5 |= 48;
            } else if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(onMemoClick) ? 32 : 16;
            }
            i6 = i3 & 4096;
            if (i6 != 0) {
                i7 = i6;
                if ((i2 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                if ((i4 & 306783379) == 306783378 && (i5 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290859913, i4, i5, "com.robinhood.android.matcha.ui.review.multiuser.ReviewMultiuserCard (MatchaMultiuserReviewComposable.kt:145)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment bottomCenter = companion.getBottomCenter();
                    int i8 = i4;
                    int i9 = i5;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0.8f * f2));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Modifier modifier4 = modifier3;
                    z = (i8 & 3670016) != 1048576;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MatchaMultiuserReviewComposable.ReviewMultiuserCard_xKBSf_U$lambda$2$lambda$1(f, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierM5156height3ABfNKs, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
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
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(0, 0, 10, 10));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    int i11 = i8 >> 12;
                    modifier2 = modifier4;
                    MatchaReviewComposable.ReviewToolbar(null, toolbarTitle, str2, function0, onBackClick, composerStartRestartGroup, ((i8 << 3) & 1008) | ((i8 >> 18) & 7168) | (i11 & 57344), 1);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    int i12 = i8 >> 6;
                    ProfileBubbles.ProfileBubbles(profileAvatarStates, modifierM5146paddingqDBjuR0$default, null, false, null, composerStartRestartGroup, i12 & 14, 28);
                    composer2 = composerStartRestartGroup;
                    Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                    composer2.startReplaceGroup(5004770);
                    z2 = (i8 & 7168) != 2048;
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MatchaMultiuserReviewComposable.ReviewMultiuserCard_xKBSf_U$lambda$6$lambda$5$lambda$4$lambda$3(amountText, (Context) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, composer2, 48, 4);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_amount_input_multi_user_subtitle, composer2, 0), column6.align(companion3, companion.getCenterHorizontally()), Color.m6701boximpl(bentoTheme.getColors(composer2, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextM(), composer2, 0, 0, 8184);
                    MemoComposable3.Memo(column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion.getCenterHorizontally()), memoState, onMemoClick, composer2, (i9 << 3) & 1008);
                    Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                    MatchaReviewComposable.ReviewSummary(summary, true, null, onSummaryShowMoreClick, composer2, (i11 & 14) | 48 | (i12 & 7168), 4);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MatchaMultiuserReviewComposable.ReviewMultiuserCard_xKBSf_U$lambda$7(toolbarTitle, str, profileAvatarStates, amountText, summary, onSummaryShowMoreClick, f, f2, onBackClick, function0, memoState, onMemoClick, modifier5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 384;
            i7 = i6;
            if ((i4 & 306783379) == 306783378) {
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment bottomCenter2 = companion4.getBottomCenter();
                int i82 = i4;
                int i92 = i5;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0.8f * f2));
                composerStartRestartGroup.startReplaceGroup(5004770);
                Modifier modifier42 = modifier3;
                if ((i82 & 3670016) != 1048576) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchaMultiuserReviewComposable.ReviewMultiuserCard_xKBSf_U$lambda$2$lambda$1(f, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifierM5156height3ABfNKs2, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter2, false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i102 = BentoTheme.$stable;
                        Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(0, 0, 10, 10));
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            int i112 = i82 >> 12;
                            modifier2 = modifier42;
                            MatchaReviewComposable.ReviewToolbar(null, toolbarTitle, str2, function0, onBackClick, composerStartRestartGroup, ((i82 << 3) & 1008) | ((i82 >> 18) & 7168) | (i112 & 57344), 1);
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            int i122 = i82 >> 6;
                            ProfileBubbles.ProfileBubbles(profileAvatarStates, modifierM5146paddingqDBjuR0$default2, null, false, null, composerStartRestartGroup, i122 & 14, 28);
                            composer2 = composerStartRestartGroup;
                            Spacer2.Spacer(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), composer2, 0);
                            composer2.startReplaceGroup(5004770);
                            if ((i82 & 7168) != 2048) {
                            }
                            objRememberedValue2 = composer2.rememberedValue();
                            if (!z2) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaMultiuserReviewComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MatchaMultiuserReviewComposable.ReviewMultiuserCard_xKBSf_U$lambda$6$lambda$5$lambda$4$lambda$3(amountText, (Context) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                                composer2.endReplaceGroup();
                                AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), null, composer2, 48, 4);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_amount_input_multi_user_subtitle, composer2, 0), column62.align(companion32, companion4.getCenterHorizontally()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i102).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i102).getTextM(), composer2, 0, 0, 8184);
                                MemoComposable3.Memo(column62.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composer2, i102).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally()), memoState, onMemoClick, composer2, (i92 << 3) & 1008);
                                Spacer2.Spacer(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), composer2, 0);
                                MatchaReviewComposable.ReviewSummary(summary, true, null, onSummaryShowMoreClick, composer2, (i112 & 14) | 48 | (i122 & 7168), 4);
                                composer2.endNode();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i6 = i3 & 4096;
        if (i6 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewMultiuserCard_xKBSf_U$lambda$2$lambda$1(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TickerInputView ReviewMultiuserCard_xKBSf_U$lambda$6$lambda$5$lambda$4$lambda$3(String str, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, 0.0f, 0, 30, null);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        tickerInputView.setValue(charArray);
        return tickerInputView;
    }
}
