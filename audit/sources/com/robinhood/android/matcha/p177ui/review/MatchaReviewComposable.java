package com.robinhood.android.matcha.p177ui.review;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewComposable;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.utils.resource.StringResource;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MatchaReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0017\u001a¥\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a]\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\"\u001a7\u0010#\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010%\u001a%\u0010&\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010'\u001aG\u0010(\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010)\u001a\r\u0010*\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010+\"\u000e\u0010,\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000¨\u00062²\u0006\f\u00103\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002"}, m3636d2 = {"ReviewTransaction", "", "isMultiuserUi", "", "toolbarTitle", "", "toolbarSubtitle", "profileAvatarState", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "primaryText", "secondaryText", ErrorBundle.SUMMARY_ENTRY, "swipeHint", "onSubmit", "Lkotlin/Function0;", "onBackClick", "onToolbarTitleClick", "bannerViewState", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "onBannerClick", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "onMemoClick", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReviewCard", "swipeOffsetPx", "", "parentHeight", "Landroidx/compose/ui/unit/Dp;", "ReviewCard-9UqVb8Q", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReviewUserDetails", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReviewSummary", "onSummaryShowMoreClick", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReviewSwipeHint", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "ReviewToolbar", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SubmitLoading", "(Landroidx/compose/runtime/Composer;I)V", "SwipeAnimationDuration", "", "CardHeightPercentage", "CardTopCornerRadius", "CardBottomCornerRadius", "MaxSummaryLines", "feature-p2p_externalDebug", "didOverflow", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaReviewComposable {
    private static final int CardBottomCornerRadius = 10;
    private static final float CardHeightPercentage = 0.8f;
    private static final int CardTopCornerRadius = 0;
    private static final int MaxSummaryLines = 3;
    private static final int SwipeAnimationDuration = 350;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCard_9UqVb8Q$lambda$5(boolean z, String str, String str2, ProfileAvatarState profileAvatarState, String str3, String str4, String str5, float f, float f2, Function0 function0, Function0 function02, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, Function0 function03, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function04, int i, int i2, Composer composer, int i3) {
        m16396ReviewCard9UqVb8Q(z, str, str2, profileAvatarState, str3, str4, str5, f, f2, function0, function02, matchaReviewTransactionViewState2, function03, matchaReviewTransactionViewState3, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewSummary$lambda$17(String str, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ReviewSummary(str, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewSwipeHint$lambda$21(Modifier modifier, String str, float f, int i, Composer composer, int i2) {
        ReviewSwipeHint(modifier, str, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewToolbar$lambda$22(Modifier modifier, String str, String str2, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        ReviewToolbar(modifier, str, str2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewTransaction$lambda$0(boolean z, String str, String str2, ProfileAvatarState profileAvatarState, String str3, String str4, String str5, String str6, Function0 function0, Function0 function02, Function0 function03, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, Function0 function04, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function05, int i, int i2, Composer composer, int i3) {
        ReviewTransaction(z, str, str2, profileAvatarState, str3, str4, str5, str6, function0, function02, function03, matchaReviewTransactionViewState2, function04, matchaReviewTransactionViewState3, function05, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewUserDetails$lambda$8(Modifier modifier, ProfileAvatarState profileAvatarState, String str, String str2, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, Function0 function0, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function02, int i, int i2, Composer composer, int i3) {
        ReviewUserDetails(modifier, profileAvatarState, str, str2, matchaReviewTransactionViewState2, function0, matchaReviewTransactionViewState3, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmitLoading$lambda$25(int i, Composer composer, int i2) {
        SubmitLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewTransaction$1 */
    static final class C214411 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ MatchaReviewTransactionViewState2 $bannerViewState;
        final /* synthetic */ boolean $isMultiuserUi;
        final /* synthetic */ MatchaReviewTransactionViewState3 $memoState;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Function0<Unit> $onBannerClick;
        final /* synthetic */ Function0<Unit> $onMemoClick;
        final /* synthetic */ Function0<Unit> $onSubmit;
        final /* synthetic */ Function0<Unit> $onToolbarTitleClick;
        final /* synthetic */ String $primaryText;
        final /* synthetic */ ProfileAvatarState $profileAvatarState;
        final /* synthetic */ String $secondaryText;
        final /* synthetic */ String $summary;
        final /* synthetic */ String $swipeHint;
        final /* synthetic */ String $toolbarSubtitle;
        final /* synthetic */ String $toolbarTitle;

        C214411(Function0<Unit> function0, String str, boolean z, String str2, String str3, ProfileAvatarState profileAvatarState, String str4, String str5, String str6, Function0<Unit> function02, Function0<Unit> function03, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, Function0<Unit> function04, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0<Unit> function05) {
            this.$onSubmit = function0;
            this.$swipeHint = str;
            this.$isMultiuserUi = z;
            this.$toolbarTitle = str2;
            this.$toolbarSubtitle = str3;
            this.$profileAvatarState = profileAvatarState;
            this.$primaryText = str4;
            this.$secondaryText = str5;
            this.$summary = str6;
            this.$onBackClick = function02;
            this.$onToolbarTitleClick = function03;
            this.$bannerViewState = matchaReviewTransactionViewState2;
            this.$onBannerClick = function04;
            this.$memoState = matchaReviewTransactionViewState3;
            this.$onMemoClick = function05;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$3$lambda$2(final SwipeableState swipeableState, final Function0 function0, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewTransaction$1$invoke$lambda$3$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    if (swipeableState.getCurrentValue() == MatchaReviewComposable2.Finish) {
                        function0.invoke();
                    }
                }
            };
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
                ComposerKt.traceEventStart(-1554663287, i2, -1, "com.robinhood.android.matcha.ui.review.ReviewTransaction.<anonymous> (MatchaReviewComposable.kt:89)");
            }
            float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
            MatchaReviewComposable2 matchaReviewComposable2 = MatchaReviewComposable2.Start;
            final SwipeableState swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(matchaReviewComposable2, AnimationSpecKt.tween$default(MatchaReviewComposable.SwipeAnimationDuration, 0, Easing3.getFastOutSlowInEasing(), 2, null), null, composer, 6, 4);
            float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fMo5102getMaxHeightD9Ej5fM);
            composer.startReplaceGroup(617213215);
            if (swipeableStateRememberSwipeableState.isAnimationRunning()) {
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(swipeableStateRememberSwipeableState) | composer.changed(this.$onSubmit);
                final Function0<Unit> function0 = this.$onSubmit;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewTransaction$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchaReviewComposable.C214411.invoke$lambda$3$lambda$2(swipeableStateRememberSwipeableState, function0, (DisposableEffectScope) obj);
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
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(Float.valueOf(0.0f), matchaReviewComposable2), Tuples4.m3642to(Float.valueOf(-fMo5016toPx0680j_4), MatchaReviewComposable2.Finish));
            Orientation orientation = Orientation.Vertical;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewTransaction$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchaReviewComposable.C214411.invoke$lambda$5$lambda$4((MatchaReviewComposable2) obj, (MatchaReviewComposable2) obj2);
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
            boolean z = this.$isMultiuserUi;
            String str2 = this.$toolbarTitle;
            String str3 = this.$toolbarSubtitle;
            ProfileAvatarState profileAvatarState = this.$profileAvatarState;
            String str4 = this.$primaryText;
            String str5 = this.$secondaryText;
            String str6 = this.$summary;
            Function0<Unit> function02 = this.$onBackClick;
            Function0<Unit> function03 = this.$onToolbarTitleClick;
            MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2 = this.$bannerViewState;
            Function0<Unit> function04 = this.$onBannerClick;
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
            MatchaReviewComposable.m16396ReviewCard9UqVb8Q(z, str2, str3, profileAvatarState, str4, str5, str6, swipeableStateRememberSwipeableState.getOffset().getValue().floatValue(), fMo5102getMaxHeightD9Ej5fM, function02, function03, matchaReviewTransactionViewState2, function04, matchaReviewTransactionViewState3, function05, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThresholdConfig invoke$lambda$5$lambda$4(MatchaReviewComposable2 matchaReviewComposable2, MatchaReviewComposable2 matchaReviewComposable22) {
            Intrinsics.checkNotNullParameter(matchaReviewComposable2, "<unused var>");
            Intrinsics.checkNotNullParameter(matchaReviewComposable22, "<unused var>");
            return new FractionalThreshold(0.5f);
        }
    }

    private static final Boolean ReviewSummary$lambda$16$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    private static final LottieComposition SubmitLoading$lambda$24$lambda$23(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final void ReviewTransaction(final boolean z, final String toolbarTitle, final String str, final ProfileAvatarState profileAvatarState, final String primaryText, final String str2, final String summary, final String swipeHint, final Function0<Unit> onSubmit, final Function0<Unit> onBackClick, final Function0<Unit> function0, final MatchaReviewTransactionViewState2 bannerViewState, final Function0<Unit> onBannerClick, final MatchaReviewTransactionViewState3 memoState, final Function0<Unit> onMemoClick, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        String str3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(profileAvatarState, "profileAvatarState");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(swipeHint, "swipeHint");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(bannerViewState, "bannerViewState");
        Intrinsics.checkNotNullParameter(onBannerClick, "onBannerClick");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2126588831);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(toolbarTitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(profileAvatarState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(summary) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(swipeHint) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmit) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(bannerViewState) : composerStartRestartGroup.changedInstance(bannerViewState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBannerClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onMemoClick) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (i6 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126588831, i5, i6, "com.robinhood.android.matcha.ui.review.ReviewTransaction (MatchaReviewComposable.kt:87)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            C214411 c214411 = new C214411(onSubmit, swipeHint, z2, toolbarTitle, str3, profileAvatarState, primaryText, str2, summary, onBackClick, function0, bannerViewState, onBannerClick, memoState, onMemoClick);
            composer2 = composerStartRestartGroup;
            BoxWithConstraints.BoxWithConstraints(modifierFillMaxSize$default, null, false, ComposableLambda3.rememberComposableLambda(-1554663287, true, c214411, composer2, 54), composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.ReviewTransaction$lambda$0(z, toolbarTitle, str, profileAvatarState, primaryText, str2, summary, swipeHint, onSubmit, onBackClick, function0, bannerViewState, onBannerClick, memoState, onMemoClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MatchaReviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewToolbar$1 */
    static final class C214391 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onToolbarTitleClick;
        final /* synthetic */ String $toolbarSubtitle;
        final /* synthetic */ String $toolbarTitle;

        C214391(String str, String str2, Modifier modifier, Function0<Unit> function0) {
            this.$toolbarTitle = str;
            this.$toolbarSubtitle = str2;
            this.$modifier = modifier;
            this.$onToolbarTitleClick = function0;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            final Function0<Unit> function0;
            Modifier modifierM4893clickableXHw0xAI$default;
            Function0<Unit> function02;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-523056696, i, -1, "com.robinhood.android.matcha.ui.review.ReviewToolbar.<anonymous> (MatchaReviewComposable.kt:358)");
            }
            String str = this.$toolbarTitle;
            String str2 = this.$toolbarSubtitle;
            Modifier modifier = this.$modifier;
            Function0<Unit> function03 = this.$onToolbarTitleClick;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 0, 0, 8186);
            composer.startReplaceGroup(159662989);
            if (str2 != null) {
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer.startReplaceGroup(640699141);
                if (function03 != null) {
                    composer.startReplaceGroup(5004770);
                    function0 = function03;
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$ReviewToolbar$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MatchaReviewComposable.C214391.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier, false, null, null, (Function0) objRememberedValue, 7, null);
                    if (modifierM4893clickableXHw0xAI$default == null) {
                    }
                    composer.endReplaceGroup();
                    function02 = function0;
                    BentoText2.m20747BentoText38GnDrw(str2, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                    composer.startReplaceGroup(640708532);
                    if (function02 != null) {
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), StringResources_androidKt.stringResource(C11048R.string.general_action_edit, composer, 0), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function02, false, composer, BentoIcon4.Size12.$stable, 32);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                } else {
                    function0 = function03;
                }
                modifierM4893clickableXHw0xAI$default = modifier;
                composer.endReplaceGroup();
                function02 = function0;
                BentoText2.m20747BentoText38GnDrw(str2, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                composer.startReplaceGroup(640708532);
                if (function02 != null) {
                }
                composer.endReplaceGroup();
                composer.endNode();
            }
            composer.endReplaceGroup();
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
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ReviewCard-9UqVb8Q, reason: not valid java name */
    public static final void m16396ReviewCard9UqVb8Q(final boolean z, final String toolbarTitle, final String str, final ProfileAvatarState profileAvatarState, final String primaryText, final String str2, final String summary, final float f, final float f2, final Function0<Unit> onBackClick, final Function0<Unit> function0, final MatchaReviewTransactionViewState2 bannerViewState, final Function0<Unit> onBannerClick, final MatchaReviewTransactionViewState3 memoState, final Function0<Unit> onMemoClick, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(profileAvatarState, "profileAvatarState");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(bannerViewState, "bannerViewState");
        Intrinsics.checkNotNullParameter(onBannerClick, "onBannerClick");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1652255424);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(toolbarTitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(profileAvatarState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(summary) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(bannerViewState) : composerStartRestartGroup.changedInstance(bannerViewState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBannerClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onMemoClick) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1652255424, i5, i6, "com.robinhood.android.matcha.ui.review.ReviewCard (MatchaReviewComposable.kt:171)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment bottomCenter = companion.getBottomCenter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0.8f * f2));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i5 & 29360128) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaReviewComposable.ReviewCard_9UqVb8Q$lambda$2$lambda$1(f, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierM5156height3ABfNKs, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(0, 0, 10, 10));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i7 = i6 << 9;
            ReviewToolbar(null, toolbarTitle, str, function0, onBackClick, composerStartRestartGroup, (i5 & 1008) | (i7 & 7168) | ((i5 >> 15) & 57344), 1);
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ReviewUserDetails(null, profileAvatarState, primaryText, str2, bannerViewState, onBannerClick, memoState, onMemoClick, composerStartRestartGroup, ((i5 >> 6) & 8176) | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 1);
            composer2 = composerStartRestartGroup;
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0);
            ReviewSummary(summary, z, null, null, composer2, ((i5 >> 18) & 14) | ((i5 << 3) & 112), 12);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.ReviewCard_9UqVb8Q$lambda$5(z, toolbarTitle, str, profileAvatarState, primaryText, str2, summary, f, f2, onBackClick, function0, bannerViewState, onBannerClick, memoState, onMemoClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewCard_9UqVb8Q$lambda$2$lambda$1(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(f);
        return Unit.INSTANCE;
    }

    public static final void ReviewUserDetails(Modifier modifier, final ProfileAvatarState profileAvatarState, final String primaryText, final String str, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, final Function0<Unit> onBannerClick, MatchaReviewTransactionViewState3 memoState, Function0<Unit> onMemoClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        BentoTheme bentoTheme;
        int i4;
        Modifier.Companion companion;
        BentoTheme bentoTheme2;
        int i5;
        final MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3;
        final Function0<Unit> function0;
        final Modifier modifier3;
        MatchaReviewTransactionViewState2 bannerViewState = matchaReviewTransactionViewState2;
        Intrinsics.checkNotNullParameter(profileAvatarState, "profileAvatarState");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(bannerViewState, "bannerViewState");
        Intrinsics.checkNotNullParameter(onBannerClick, "onBannerClick");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(122563045);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(profileAvatarState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryText) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(bannerViewState) : composerStartRestartGroup.changedInstance(bannerViewState) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBannerClick) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onMemoClick) ? 8388608 : 4194304;
        }
        int i7 = i3;
        if ((4793491 & i7) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
            matchaReviewTransactionViewState3 = memoState;
            function0 = onMemoClick;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(122563045, i7, -1, "com.robinhood.android.matcha.ui.review.ReviewUserDetails (MatchaReviewComposable.kt:229)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Modifier modifier5 = modifier4;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier.Companion companion4 = companion3;
            int i9 = i7 >> 3;
            ProfileAvatar3.ProfileAvatar(profileAvatarState, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 7, null), null, null, composerStartRestartGroup, i9 & 14, 12);
            TextStyle displayCapsuleMedium = bentoTheme3.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(primaryText, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, (i7 >> 6) & 14, 0, 8126);
            composer2.startReplaceGroup(-1290353366);
            if (str == null) {
                bentoTheme = bentoTheme3;
                i4 = i8;
            } else {
                TextStyle textS = bentoTheme3.getTypography(composer2, i8).getTextS();
                int iM7919getCentere0LSkKk = companion5.m7919getCentere0LSkKk();
                long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer2, i8).m21426getFg20d7_KjU();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme3.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                companion4 = companion4;
                bentoTheme = bentoTheme3;
                i4 = i8;
                BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8120);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1290343207);
            bannerViewState = matchaReviewTransactionViewState2;
            if (bannerViewState instanceof MatchaReviewTransactionViewState2.Visible) {
                bentoTheme2 = bentoTheme;
                i5 = i4;
                companion = companion4;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MatchaReviewTransactionViewState2.Visible visible = (MatchaReviewTransactionViewState2.Visible) bannerViewState;
                StringResource text = visible.getText();
                Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = text.getText(resources).toString();
                StringResource ctaText = visible.getCtaText();
                Resources resources2 = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5146paddingqDBjuR0$default2, string2, null, ctaText.getText(resources2).toString(), onBannerClick, composer2, i9 & 57344, 4);
            } else {
                companion = companion4;
                bentoTheme2 = bentoTheme;
                i5 = i4;
            }
            composer2.endReplaceGroup();
            matchaReviewTransactionViewState3 = memoState;
            function0 = onMemoClick;
            MemoComposable3.Memo(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), matchaReviewTransactionViewState3, function0, composer2, (i7 >> 15) & 1008);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MatchaReviewTransactionViewState2 matchaReviewTransactionViewState22 = bannerViewState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.ReviewUserDetails$lambda$8(modifier3, profileAvatarState, primaryText, str, matchaReviewTransactionViewState22, onBannerClick, matchaReviewTransactionViewState3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewSummary(final String summary, final boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final Function0<Unit> function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(summary, "summary");
        Composer composerStartRestartGroup = composer.startRestartGroup(-349825885);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(summary) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue3;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-349825885, i3, -1, "com.robinhood.android.matcha.ui.review.ReviewSummary (MatchaReviewComposable.kt:276)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_summary_label, composerStartRestartGroup, 0);
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    Modifier modifier5 = modifier4;
                    int i7 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, bold, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8110);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    TextStyle textS2 = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS();
                    int iM7922getLefte0LSkKk = companion3.m7922getLefte0LSkKk();
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
                    int i8 = !z ? 3 : Integer.MAX_VALUE;
                    int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                    TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7922getLefte0LSkKk);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MatchaReviewComposable.ReviewSummary$lambda$16$lambda$15$lambda$14(snapshotState, (TextLayoutResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(summary, null, colorM6701boximpl, null, null, null, textAlignM7912boximpl, iM7959getEllipsisgIe3tQ8, false, i8, 0, (Function1) objRememberedValue2, 0, textS2, composerStartRestartGroup, (i7 & 14) | 12582912, 48, 5434);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1639758689);
                    if (Intrinsics.areEqual(ReviewSummary$lambda$16$lambda$12(snapshotState), Boolean.TRUE)) {
                        function04 = function03;
                    } else {
                        function04 = function03;
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function04, StringResources_androidKt.stringResource(C21284R.string.matcha_summary_show_more, composerStartRestartGroup, 0), null, null, BentoTextButton3.Size.f5148S, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), composerStartRestartGroup, ((i7 >> 9) & 14) | 24576, 44);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MatchaReviewComposable.ReviewSummary$lambda$17(summary, z, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 5, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource2 = StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_summary_label, composerStartRestartGroup, 0);
                    TextStyle textS3 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS();
                    FontWeight bold2 = FontWeight.INSTANCE.getBold();
                    TextAlign.Companion companion32 = TextAlign.INSTANCE;
                    Modifier modifier52 = modifier4;
                    int i72 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, bold2, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS3, composerStartRestartGroup, 24576, 0, 8110);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    TextStyle textS22 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS();
                    int iM7922getLefte0LSkKk2 = companion32.m7922getLefte0LSkKk();
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU();
                    int i82 = !z ? 3 : Integer.MAX_VALUE;
                    int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    Color colorM6701boximpl2 = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                    TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7922getLefte0LSkKk2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(summary, null, colorM6701boximpl2, null, null, null, textAlignM7912boximpl2, iM7959getEllipsisgIe3tQ82, false, i82, 0, (Function1) objRememberedValue2, 0, textS22, composerStartRestartGroup, (i72 & 14) | 12582912, 48, 5434);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1639758689);
                    if (Intrinsics.areEqual(ReviewSummary$lambda$16$lambda$12(snapshotState), Boolean.TRUE)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewSummary$lambda$16$lambda$15$lambda$14(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(Boolean.valueOf(it.getDidOverflowHeight()));
        return Unit.INSTANCE;
    }

    public static final void ReviewSwipeHint(final Modifier modifier, String str, final float f, Composer composer, final int i) {
        int i2;
        final String swipeHint = str;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(swipeHint, "swipeHint");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2083143692);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(swipeHint) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083143692, i3, -1, "com.robinhood.android.matcha.ui.review.ReviewSwipeHint (MatchaReviewComposable.kt:324)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaReviewComposable.ReviewSwipeHint$lambda$19$lambda$18(f, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifier, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
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
            Painter painterPainterResource = PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_caret_up_24dp, composerStartRestartGroup, 0);
            ColorFilter.Companion companion2 = ColorFilter.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            ImageKt.Image(painterPainterResource, (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion2, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), 0, 2, null), composerStartRestartGroup, 48, 60);
            swipeHint = str;
            BentoText2.m20747BentoText38GnDrw(swipeHint, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 0, 8170);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.ReviewSwipeHint$lambda$21(modifier, swipeHint, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewSwipeHint$lambda$19$lambda$18(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(f);
        return Unit.INSTANCE;
    }

    public static final void ReviewToolbar(Modifier modifier, final String toolbarTitle, final String str, final Function0<Unit> function0, final Function0<Unit> onBackClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-407679909);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(toolbarTitle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-407679909, i3, -1, "com.robinhood.android.matcha.ui.review.ReviewToolbar (MatchaReviewComposable.kt:354)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-523056696, true, new C214391(toolbarTitle, str, modifier2, function0), composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(1825885980, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt.ReviewToolbar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1825885980, i5, -1, "com.robinhood.android.matcha.ui.review.ReviewToolbar.<anonymous> (MatchaReviewComposable.kt:386)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackClick, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composer2, ((i3 << 3) & 112) | 390, 0, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.ReviewToolbar$lambda$22(modifier3, toolbarTitle, str, function0, onBackClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SubmitLoading(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1965439957);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1965439957, i, -1, "com.robinhood.android.matcha.ui.review.SubmitLoading (MatchaReviewComposable.kt:392)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(SubmitLoading$lambda$24$lambda$23(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C21284R.raw.lottie_feather_spinner)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), null, false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer2, 1572864, 0, 0, 2097086);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewComposable.SubmitLoading$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
