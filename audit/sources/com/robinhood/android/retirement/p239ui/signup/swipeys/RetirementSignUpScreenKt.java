package com.robinhood.android.retirement.p239ui.signup.swipeys;

import android.content.Context;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatable5;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerScope;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.api.RetirementSignupSwipey;
import com.robinhood.android.responsive.Density4;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.retirement.lib.RetirementUpsellTheme;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.animation.Animators;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\r\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u001a1\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001b\u001a9\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040#H\u0003¢\u0006\u0002\u0010$\u001aC\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.\u001a/\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00102\u001a5\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020-2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004072\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010:\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\u0010=\u001a_\u0010>\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010:\u001a\u00020-2\u0006\u0010,\u001a\u00020-2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010A\u001a_\u0010B\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010:\u001a\u00020-2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010C\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u000e\u0010/\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006D²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020GX\u008a\u0084\u0002"}, m3636d2 = {"BasicLoadingTestTag", "", "LottieCompositionLoadingTestTag", "LoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RetirementSignUpScreen", "state", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "callbacks", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;", "(Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TextContentMinHeight", "Landroidx/compose/ui/unit/Dp;", "getTextContentMinHeight", "(Landroidx/compose/runtime/Composer;I)F", "RetirementUpsellVerticalSpacing", "getRetirementUpsellVerticalSpacing", "swipeyEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "identifier", "Swipeys", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loaded;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "(Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loaded;Lcom/airbnb/lottie/LottieComposition;Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SwipeHandler", "pagerState", "Lcom/google/accompanist/pager/PagerState;", "currentSwipeyIndex", "", "totalPages", "onSwipe", "Lkotlin/Function1;", "(Lcom/google/accompanist/pager/PagerState;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SwipeyTextContent", "swipeys", "", "Lcom/robinhood/android/models/retirement/api/RetirementSignupSwipey;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isRebrandMember", "", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;Ljava/util/List;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZLandroidx/compose/runtime/Composer;II)V", "SwipeyPageIndicatorAnim", "SwipeyPageIndicator", "currentPage", "(IIZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SwipeyCta", "text", "loading", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SwipeyContentColumn", "isCtaLoading", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(Lcom/google/accompanist/pager/PagerState;Ljava/util/List;IZLcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)V", "CompactSwipeyScreen", "lottieAnimatable", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;Ljava/util/List;IZZLcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/compose/LottieAnimatable;Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;Landroidx/compose/runtime/Composer;II)V", "MediumSwipeyScreen", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;Ljava/util/List;IZLcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/compose/LottieAnimatable;Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;ZLandroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug", "startFrame", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpScreenKt {
    public static final String BasicLoadingTestTag = "sign_up_screen_loading";
    public static final String LottieCompositionLoadingTestTag = "lottie_composition_loading";
    private static final String SwipeyPageIndicatorAnim = "swipey_page_indicator_anim";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompactSwipeyScreen$lambda$24(Modifier modifier, PagerState pagerState, List list, int i, boolean z, boolean z2, LottieComposition lottieComposition, LottieAnimatable lottieAnimatable, RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, int i2, int i3, Composer composer, int i4) {
        CompactSwipeyScreen(modifier, pagerState, list, i, z, z2, lottieComposition, lottieAnimatable, retirementSignUpScreenCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreen$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumSwipeyScreen$lambda$28(Modifier modifier, PagerState pagerState, List list, int i, boolean z, LottieComposition lottieComposition, LottieAnimatable lottieAnimatable, RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, boolean z2, int i2, int i3, Composer composer, int i4) {
        MediumSwipeyScreen(modifier, pagerState, list, i, z, lottieComposition, lottieAnimatable, retirementSignUpScreenCallbacks, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSignUpScreen$lambda$1(RetirementSignUpViewState retirementSignUpViewState, RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementSignUpScreen(retirementSignUpViewState, retirementSignUpScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeHandler$lambda$12(PagerState pagerState, int i, int i2, Function1 function1, int i3, Composer composer, int i4) {
        SwipeHandler(pagerState, i, i2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeyContentColumn$lambda$20(PagerState pagerState, List list, int i, boolean z, RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, boolean z2, Modifier modifier, Arrangement.Vertical vertical, int i2, int i3, Composer composer, int i4) {
        SwipeyContentColumn(pagerState, list, i, z, retirementSignUpScreenCallbacks, z2, modifier, vertical, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeyCta$lambda$17(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SwipeyCta(str, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeyPageIndicator$lambda$16(int i, int i2, boolean z, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        SwipeyPageIndicator(i, i2, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeyTextContent$lambda$13(Modifier modifier, PagerState pagerState, List list, SduiActionHandler sduiActionHandler, boolean z, int i, int i2, Composer composer, int i3) {
        SwipeyTextContent(modifier, pagerState, list, sduiActionHandler, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Swipeys$lambda$9(RetirementSignUpViewState.Loaded loaded, LottieComposition lottieComposition, RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Swipeys(loaded, lottieComposition, retirementSignUpScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final long SwipeyPageIndicator$lambda$15$lambda$14(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1005796249);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1005796249, i3, -1, "com.robinhood.android.retirement.ui.signup.swipeys.LoadingScreen (RetirementSignUpScreen.kt:88)");
            }
            int i5 = ((i3 << 3) & 112) | 3078;
            Modifier modifier2 = modifier;
            LocalShowPlaceholder.Loadable(true, modifier2, null, ComposableSingletons$RetirementSignUpScreenKt.INSTANCE.getLambda$1945870633$feature_retirement_tab_externalDebug(), composerStartRestartGroup, i5, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpScreenKt.LoadingScreen$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RetirementSignUpScreen(final RetirementSignUpViewState state, final RetirementSignUpScreenCallbacks callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(186954174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(186954174, i3, -1, "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreen (RetirementSignUpScreen.kt:136)");
            }
            RetirementSignUpViewState.Loaded loaded = state instanceof RetirementSignUpViewState.Loaded ? (RetirementSignUpViewState.Loaded) state : null;
            RetirementUpsellTheme.RetirementUpsellTheme(!((loaded == null || loaded.isSwipeyRebrandMember()) ? false : true), ComposableLambda3.rememberComposableLambda(-133047097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt.RetirementSignUpScreen.1
                private static final LottieComposition invoke$lambda$1(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-133047097, i5, -1, "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreen.<anonymous> (RetirementSignUpScreen.kt:140)");
                    }
                    Modifier modifier2 = modifier;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                    RetirementSignUpViewState retirementSignUpViewState = state;
                    if (retirementSignUpViewState instanceof RetirementSignUpViewState.Failure) {
                        composer2.startReplaceGroup(648904808);
                        RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(retirementSignUpScreenCallbacks);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RetirementSignUpScreenKt$RetirementSignUpScreen$1$1$1(retirementSignUpScreenCallbacks);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        ErrorScreenComposable.ErrorScreenComposable(modifierM4872backgroundbw27NRU$default, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composer2.endReplaceGroup();
                    } else if (retirementSignUpViewState instanceof RetirementSignUpViewState.Loaded) {
                        composer2.startReplaceGroup(649169889);
                        OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composer2, 6);
                        composer2.startReplaceGroup(990777551);
                        String lottie_url_light = ((RetirementSignUpViewState.Loaded) state).isSwipeyRebrandMember() ? bentoTheme.getColors(composer2, i6).getIsDay() ? ((RetirementSignUpViewState.Loaded) state).getResponse().getSwipeys().get(((RetirementSignUpViewState.Loaded) state).getCurrentIndex()).getLottie_url_light() : ((RetirementSignUpViewState.Loaded) state).getResponse().getSwipeys().get(((RetirementSignUpViewState.Loaded) state).getCurrentIndex()).getLottie_url_dark() : ((RetirementSignUpViewState.Loaded) state).getResponse().getLottie_url();
                        composer2.endReplaceGroup();
                        LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottie_url_light)), null, null, null, null, null, composer2, 0, 62);
                        if (invoke$lambda$1(lottieCompositionResultRememberLottieComposition) != null || ((RetirementSignUpViewState.Loaded) state).isSwipeyRebrandMember()) {
                            composer2.startReplaceGroup(649895320);
                            RetirementSignUpScreenKt.Swipeys((RetirementSignUpViewState.Loaded) state, invoke$lambda$1(lottieCompositionResultRememberLottieComposition), callbacks, modifierM4872backgroundbw27NRU$default, composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(650217906);
                            RetirementSignUpScreenKt.LoadingScreen(TestTag3.testTag(modifierM4872backgroundbw27NRU$default, RetirementSignUpScreenKt.LottieCompositionLoadingTestTag), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        if (!(retirementSignUpViewState instanceof RetirementSignUpViewState.Loading)) {
                            composer2.startReplaceGroup(990763253);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(650483762);
                        RetirementSignUpScreenKt.LoadingScreen(TestTag3.testTag(modifierM4872backgroundbw27NRU$default, RetirementSignUpScreenKt.BasicLoadingTestTag), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpScreenKt.RetirementSignUpScreen$lambda$1(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final float getTextContentMinHeight(Composer composer, int i) {
        float fM7995constructorimpl;
        composer.startReplaceGroup(1331357115);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331357115, i, -1, "com.robinhood.android.retirement.ui.signup.swipeys.<get-TextContentMinHeight> (RetirementSignUpScreen.kt:194)");
        }
        composer.startReplaceGroup(-466065427);
        boolean zIsLowDensityScreen = Density4.isLowDensityScreen(composer, 0);
        composer.endReplaceGroup();
        if (zIsLowDensityScreen) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
        } else {
            composer.startReplaceGroup(-466064216);
            boolean z = WindowSize.INSTANCE.getCurrentWidth(composer, 6) != WindowSize.Compact;
            composer.endReplaceGroup();
            fM7995constructorimpl = z ? C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE) : C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM7995constructorimpl;
    }

    @JvmName
    public static final float getRetirementUpsellVerticalSpacing(Composer composer, int i) {
        float fM21590getDefaultD9Ej5fM;
        composer.startReplaceGroup(-302569573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-302569573, i, -1, "com.robinhood.android.retirement.ui.signup.swipeys.<get-RetirementUpsellVerticalSpacing> (RetirementSignUpScreen.kt:202)");
        }
        if (Density4.isLowDensityScreen(composer, 0)) {
            fM21590getDefaultD9Ej5fM = C2002Dp.m7995constructorimpl(12);
        } else {
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM21590getDefaultD9Ej5fM;
    }

    public static final Screen swipeyEventScreen(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new Screen(Screen.Name.RETIREMENT_ONBOARDING_SWIPEY, null, identifier, null, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Swipeys(final RetirementSignUpViewState.Loaded state, final LottieComposition lottieComposition, final RetirementSignUpScreenCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final List<RetirementSignupSwipey> swipeys;
        RetirementSignupSwipey retirementSignupSwipey;
        boolean zChanged;
        Object objRememberedValue;
        SnapshotIntState2 snapshotIntState2;
        boolean zAnimationsEnabled;
        boolean zChanged2;
        Object objRememberedValue2;
        LottieClipSpec.Frame frame;
        LottieAnimatable lottieAnimatableRememberLottieAnimatable;
        boolean zChanged3;
        RetirementSignupSwipey retirementSignupSwipey2;
        Object retirementSignUpScreenKt$Swipeys$1$1;
        int i5;
        ?? r15;
        LottieAnimatable lottieAnimatable;
        SnapshotIntState2 snapshotIntState22;
        Integer lottie_animation_loop_start_frame;
        int i6;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1076987642);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1076987642, i4, -1, "com.robinhood.android.retirement.ui.signup.swipeys.Swipeys (RetirementSignUpScreen.kt:215)");
                }
                swipeys = state.getResponse().getSwipeys();
                retirementSignupSwipey = swipeys.get(state.getCurrentIndex());
                int currentIndex = state.getCurrentIndex();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(currentIndex);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(swipeys.get(state.getCurrentIndex()).getLottie_animation_frame_start());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                zAnimationsEnabled = Animators.INSTANCE.animationsEnabled((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                int currentIndex2 = state.getCurrentIndex();
                int intValue = snapshotIntState2.getIntValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(currentIndex2) | composerStartRestartGroup.changed(intValue);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new LottieClipSpec.Frame(Integer.valueOf(!zAnimationsEnabled ? snapshotIntState2.getIntValue() : retirementSignupSwipey.getLottie_animation_frame_end() - 1), Integer.valueOf(retirementSignupSwipey.getLottie_animation_frame_end()), true);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                frame = (LottieClipSpec.Frame) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                lottieAnimatableRememberLottieAnimatable = LottieAnimatable5.rememberLottieAnimatable(composerStartRestartGroup, 0);
                Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged3 = composerStartRestartGroup.changed(lottieAnimatableRememberLottieAnimatable) | composerStartRestartGroup.changedInstance(lottieComposition) | composerStartRestartGroup.changedInstance(retirementSignupSwipey) | composerStartRestartGroup.changedInstance(frame) | composerStartRestartGroup.changed(snapshotIntState2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    retirementSignupSwipey2 = retirementSignupSwipey;
                    i5 = 0;
                    r15 = 1;
                    retirementSignUpScreenKt$Swipeys$1$1 = new RetirementSignUpScreenKt$Swipeys$1$1(lottieAnimatableRememberLottieAnimatable, lottieComposition, retirementSignupSwipey2, frame, snapshotIntState2, null);
                    lottieAnimatable = lottieAnimatableRememberLottieAnimatable;
                    snapshotIntState22 = snapshotIntState2;
                    composerStartRestartGroup.updateRememberedValue(retirementSignUpScreenKt$Swipeys$1$1);
                } else {
                    retirementSignupSwipey2 = retirementSignupSwipey;
                    lottieAnimatable = lottieAnimatableRememberLottieAnimatable;
                    retirementSignUpScreenKt$Swipeys$1$1 = objRememberedValue4;
                    i5 = 0;
                    r15 = 1;
                    snapshotIntState22 = snapshotIntState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                RetirementSignupSwipey retirementSignupSwipey3 = retirementSignupSwipey2;
                EffectsKt.LaunchedEffect(retirementSignupSwipey3, numValueOf, lottieComposition, (Function2) retirementSignUpScreenKt$Swipeys$1$1, composerStartRestartGroup, (i4 << 3) & 896);
                lottie_animation_loop_start_frame = retirementSignupSwipey3.getLottie_animation_loop_start_frame();
                if (lottie_animation_loop_start_frame != null) {
                    int iIntValue = lottie_animation_loop_start_frame.intValue();
                    int frameForProgress = lottieComposition != null ? (int) lottieComposition.getFrameForProgress(lottieAnimatable.getProgress()) : i5;
                    if (((iIntValue > frameForProgress || frameForProgress > retirementSignupSwipey3.getLottie_animation_frame_end()) ? i5 : r15) != 0 && iIntValue != snapshotIntState22.getIntValue()) {
                        snapshotIntState22.setIntValue(iIntValue);
                    }
                }
                final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(i5, composerStartRestartGroup, i5, r15);
                int currentIndex3 = state.getCurrentIndex();
                int size = swipeys.size();
                composerStartRestartGroup.startReplaceGroup(5004770);
                i6 = ((i4 & 896) != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? r15 : i5;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i6 == 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new RetirementSignUpScreenKt$Swipeys$3$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SwipeHandler(pagerStateRememberPagerState, currentIndex3, size, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                final Modifier modifier5 = modifier4;
                final LottieAnimatable lottieAnimatable2 = lottieAnimatable;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, swipeyEventScreen(retirementSignupSwipey3.getLogging_identifier()), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1020802811, r15, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt.Swipeys.4

                    /* compiled from: RetirementSignUpScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$Swipeys$4$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[WindowSize.values().length];
                            try {
                                iArr[WindowSize.Compact.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[WindowSize.Medium.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[WindowSize.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020802811, i8, -1, "com.robinhood.android.retirement.ui.signup.swipeys.Swipeys.<anonymous> (RetirementSignUpScreen.kt:267)");
                        }
                        int i9 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer3, 6).ordinal()];
                        if (i9 == 1) {
                            composer3.startReplaceGroup(-1926790108);
                            RetirementSignUpScreenKt.CompactSwipeyScreen(modifier5, pagerStateRememberPagerState, swipeys, state.getCurrentIndex(), state.getCtaLoading(), state.isSwipeyRebrandMember(), lottieComposition, lottieAnimatable2, callbacks, composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (i9 != 2 && i9 != 3) {
                                composer3.startReplaceGroup(1738959266);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(1738977949);
                            RetirementSignUpScreenKt.MediumSwipeyScreen(modifier5, pagerStateRememberPagerState, swipeys, state.getCurrentIndex(), state.getCtaLoading(), lottieComposition, lottieAnimatable2, callbacks, state.isSwipeyRebrandMember(), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
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
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpScreenKt.Swipeys$lambda$9(state, lottieComposition, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            swipeys = state.getResponse().getSwipeys();
            retirementSignupSwipey = swipeys.get(state.getCurrentIndex());
            int currentIndex4 = state.getCurrentIndex();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(currentIndex4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(swipeys.get(state.getCurrentIndex()).getLottie_animation_frame_start());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                zAnimationsEnabled = Animators.INSTANCE.animationsEnabled((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                int currentIndex22 = state.getCurrentIndex();
                int intValue2 = snapshotIntState2.getIntValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(currentIndex22) | composerStartRestartGroup.changed(intValue2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new LottieClipSpec.Frame(Integer.valueOf(!zAnimationsEnabled ? snapshotIntState2.getIntValue() : retirementSignupSwipey.getLottie_animation_frame_end() - 1), Integer.valueOf(retirementSignupSwipey.getLottie_animation_frame_end()), true);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    frame = (LottieClipSpec.Frame) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    lottieAnimatableRememberLottieAnimatable = LottieAnimatable5.rememberLottieAnimatable(composerStartRestartGroup, 0);
                    Integer numValueOf2 = Integer.valueOf(snapshotIntState2.getIntValue());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged3 = composerStartRestartGroup.changed(lottieAnimatableRememberLottieAnimatable) | composerStartRestartGroup.changedInstance(lottieComposition) | composerStartRestartGroup.changedInstance(retirementSignupSwipey) | composerStartRestartGroup.changedInstance(frame) | composerStartRestartGroup.changed(snapshotIntState2);
                    Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        retirementSignupSwipey2 = retirementSignupSwipey;
                        i5 = 0;
                        r15 = 1;
                        retirementSignUpScreenKt$Swipeys$1$1 = new RetirementSignUpScreenKt$Swipeys$1$1(lottieAnimatableRememberLottieAnimatable, lottieComposition, retirementSignupSwipey2, frame, snapshotIntState2, null);
                        lottieAnimatable = lottieAnimatableRememberLottieAnimatable;
                        snapshotIntState22 = snapshotIntState2;
                        composerStartRestartGroup.updateRememberedValue(retirementSignUpScreenKt$Swipeys$1$1);
                        composerStartRestartGroup.endReplaceGroup();
                        RetirementSignupSwipey retirementSignupSwipey32 = retirementSignupSwipey2;
                        EffectsKt.LaunchedEffect(retirementSignupSwipey32, numValueOf2, lottieComposition, (Function2) retirementSignUpScreenKt$Swipeys$1$1, composerStartRestartGroup, (i4 << 3) & 896);
                        lottie_animation_loop_start_frame = retirementSignupSwipey32.getLottie_animation_loop_start_frame();
                        if (lottie_animation_loop_start_frame != null) {
                        }
                        final PagerState pagerStateRememberPagerState2 = PagerStateKt.rememberPagerState(i5, composerStartRestartGroup, i5, r15);
                        int currentIndex32 = state.getCurrentIndex();
                        int size2 = swipeys.size();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i4 & 896) != 256) {
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (i6 == 0) {
                                objRememberedValue3 = new RetirementSignUpScreenKt$Swipeys$3$1(callbacks);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                SwipeHandler(pagerStateRememberPagerState2, currentIndex32, size2, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                                composer2 = composerStartRestartGroup;
                                final Modifier modifier52 = modifier4;
                                final LottieAnimatable lottieAnimatable22 = lottieAnimatable;
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, swipeyEventScreen(retirementSignupSwipey32.getLogging_identifier()), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1020802811, r15, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt.Swipeys.4

                                    /* compiled from: RetirementSignUpScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$Swipeys$4$WhenMappings */
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[WindowSize.values().length];
                                            try {
                                                iArr[WindowSize.Compact.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[WindowSize.Medium.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[WindowSize.Expanded.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i8) {
                                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1020802811, i8, -1, "com.robinhood.android.retirement.ui.signup.swipeys.Swipeys.<anonymous> (RetirementSignUpScreen.kt:267)");
                                        }
                                        int i9 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer3, 6).ordinal()];
                                        if (i9 == 1) {
                                            composer3.startReplaceGroup(-1926790108);
                                            RetirementSignUpScreenKt.CompactSwipeyScreen(modifier52, pagerStateRememberPagerState2, swipeys, state.getCurrentIndex(), state.getCtaLoading(), state.isSwipeyRebrandMember(), lottieComposition, lottieAnimatable22, callbacks, composer3, 0, 0);
                                            composer3.endReplaceGroup();
                                        } else {
                                            if (i9 != 2 && i9 != 3) {
                                                composer3.startReplaceGroup(1738959266);
                                                composer3.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer3.startReplaceGroup(1738977949);
                                            RetirementSignUpScreenKt.MediumSwipeyScreen(modifier52, pagerStateRememberPagerState2, swipeys, state.getCurrentIndex(), state.getCtaLoading(), lottieComposition, lottieAnimatable22, callbacks, state.isSwipeyRebrandMember(), composer3, 0, 0);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SwipeHandler(final PagerState pagerState, final int i, final int i2, final Function1<? super Integer, Unit> function1, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1496467411);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1496467411, i4, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeHandler (RetirementSignUpScreen.kt:303)");
            }
            Integer numValueOf = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i5 = i4 & 14;
            boolean z = ((i4 & 112) == 32) | (i5 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RetirementSignUpScreenKt$SwipeHandler$1$1(pagerState, i, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & 14);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = (i5 == 4) | ((i4 & 7168) == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new RetirementSignUpScreenKt$SwipeHandler$2$1(pagerState, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(pagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
            Pager.m9191HorizontalPager7SJwSw(i2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), pagerState, false, 0.0f, null, null, null, null, false, ComposableSingletons$RetirementSignUpScreenKt.INSTANCE.m18219getLambda$939958738$feature_retirement_tab_externalDebug(), composerStartRestartGroup, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 896), 6, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpScreenKt.SwipeHandler$lambda$12(pagerState, i, i2, function1, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SwipeyTextContent(Modifier modifier, final PagerState pagerState, final List<RetirementSignupSwipey> list, final SduiActionHandler<? super GenericAction> sduiActionHandler, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        PagerState pagerState2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(31283786);
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
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                pagerState2 = pagerState;
                i3 |= composerStartRestartGroup.changed(pagerState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(31283786, i3, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyTextContent (RetirementSignUpScreen.kt:328)");
                }
                int i5 = i3 << 3;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                Pager.m9191HorizontalPager7SJwSw(list.size(), modifier5, pagerState2, false, 0.0f, null, Alignment.INSTANCE.getBottom(), null, null, false, ComposableLambda3.rememberComposableLambda(-1710535281, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt.SwipeyTextContent.1
                    public final void invoke(PagerScope HorizontalPager, int i6, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if ((i7 & 48) == 0) {
                            i8 = i7 | (composer3.changed(i6) ? 32 : 16);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1710535281, i8, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyTextContent.<anonymous> (RetirementSignUpScreen.kt:335)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(companion2, RetirementSignUpScreenKt.getTextContentMinHeight(composer3, 0), 0.0f, 2, null);
                        List<RetirementSignupSwipey> list2 = list;
                        boolean z2 = z;
                        SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5158heightInVpY3zN4$default);
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
                        String title = list2.get(i6).getTitle();
                        composer3.startReplaceGroup(-786397606);
                        TextStyle retirementRebrandTitleStyle = z2 ? UtilKt.getRetirementRebrandTitleStyle() : UtilKt.getRetirementPromoTitleStyle(BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable), composer3, 0);
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-786390977);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = (bentoTheme.getColors(composer3, i9).getIsDay() || !z2) ? bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU() : UtilKt.getRetirementRebrandNeonTitleColor();
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, retirementRebrandTitleStyle, composer3, 0, 0, 8120);
                        ImmutableList3 persistentList = extensions2.toPersistentList(list2.get(i6).getSubtitle_sdui());
                        composer3.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, companion2, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer3, 100663296, 0);
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, (i5 & 112) | 1572864 | (i5 & 896), 6, 952);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpScreenKt.SwipeyTextContent$lambda$13(modifier3, pagerState, list, sduiActionHandler, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        pagerState2 = pagerState;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 << 3;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            Pager.m9191HorizontalPager7SJwSw(list.size(), modifier52, pagerState2, false, 0.0f, null, Alignment.INSTANCE.getBottom(), null, null, false, ComposableLambda3.rememberComposableLambda(-1710535281, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt.SwipeyTextContent.1
                public final void invoke(PagerScope HorizontalPager, int i6, Composer composer3, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    if ((i7 & 48) == 0) {
                        i8 = i7 | (composer3.changed(i6) ? 32 : 16);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1710535281, i8, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyTextContent.<anonymous> (RetirementSignUpScreen.kt:335)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(companion2, RetirementSignUpScreenKt.getTextContentMinHeight(composer3, 0), 0.0f, 2, null);
                    List<RetirementSignupSwipey> list2 = list;
                    boolean z2 = z;
                    SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5158heightInVpY3zN4$default);
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
                    String title = list2.get(i6).getTitle();
                    composer3.startReplaceGroup(-786397606);
                    TextStyle retirementRebrandTitleStyle = z2 ? UtilKt.getRetirementRebrandTitleStyle() : UtilKt.getRetirementPromoTitleStyle(BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable), composer3, 0);
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-786390977);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = (bentoTheme.getColors(composer3, i9).getIsDay() || !z2) ? bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU() : UtilKt.getRetirementRebrandNeonTitleColor();
                    composer3.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, retirementRebrandTitleStyle, composer3, 0, 0, 8120);
                    ImmutableList3 persistentList = extensions2.toPersistentList(list2.get(i6).getSubtitle_sdui());
                    composer3.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, companion2, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer3, 100663296, 0);
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                    invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i52 & 112) | 1572864 | (i52 & 896), 6, 952);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SwipeyPageIndicator(final int i, final int i2, final boolean z, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i6;
        final Modifier modifier3;
        long xrayDark;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1515897588);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 == 0) {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1515897588, i5, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyPageIndicator (RetirementSignUpScreen.kt:376)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1786169197);
                for (i6 = 0; i6 < i2; i6++) {
                    if (z && i == i6) {
                        composerStartRestartGroup.startReplaceGroup(-1786164262);
                        xrayDark = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (z) {
                        composerStartRestartGroup.startReplaceGroup(-1786162341);
                        xrayDark = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i == i6) {
                        composerStartRestartGroup.startReplaceGroup(-1786160351);
                        xrayDark = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getXrayLight();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1786158560);
                        xrayDark = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getXrayDark();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(xrayDark, null, SwipeyPageIndicatorAnim, null, composerStartRestartGroup, 384, 10);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(6)), RoundedCornerShape2.getCircleShape()), SwipeyPageIndicator$lambda$15$lambda$14(snapshotState4M4805animateColorAsStateeuL9pac), null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1786149429);
                    if (i6 < i2 - 1) {
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpScreenKt.SwipeyPageIndicator$lambda$16(i, i2, z, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) != 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1786169197);
                while (i6 < i2) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SwipeyCta(final String str, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        boolean z2;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1746959495);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1746959495, i3, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyCta (RetirementSignUpScreen.kt:408)");
                }
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 6) & 14), str2, ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), getRetirementUpsellVerticalSpacing(composerStartRestartGroup, 0)), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), null, null, false, z2, null, null, null, null, false, null, composer2, ((i3 << 3) & 112) | ((i3 << 15) & 3670016), 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpScreenKt.SwipeyCta$lambda$17(str, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 6) & 14), str2, ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), getRetirementUpsellVerticalSpacing(composerStartRestartGroup, 0)), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), null, null, false, z2, null, null, null, null, false, null, composer2, ((i3 << 3) & 112) | ((i3 << 15) & 3670016), 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeyContentColumn(final PagerState pagerState, final List<RetirementSignupSwipey> swipeys, final int i, final boolean z, final RetirementSignUpScreenCallbacks callbacks, final boolean z2, Modifier modifier, Arrangement.Vertical vertical, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        Modifier modifier2;
        int i6;
        int i7;
        Arrangement.Vertical top;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float retirementUpsellVerticalSpacing;
        Composer composer2;
        String proceed_text;
        boolean z4;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(swipeys, "swipeys");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1823558327);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(swipeys) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= (i2 & 32768) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        if (i8 == 0) {
            if ((1572864 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                i7 = 32768;
                top = vertical;
            } else {
                i7 = 32768;
                top = vertical;
                if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(top) ? 8388608 : 4194304;
                }
            }
            if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1823558327, i4, -1, "com.robinhood.android.retirement.ui.signup.swipeys.SwipeyContentColumn (RetirementSignUpScreen.kt:441)");
                }
                int i9 = i4 >> 18;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, ((((i9 & 112) | ((i9 & 14) | 384)) >> 3) & 14) | 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i10 = i4 >> 3;
                int i11 = i4;
                SwipeyTextContent(null, pagerState, swipeys, callbacks, z2, composerStartRestartGroup, ((i4 << 3) & 1008) | (i10 & 7168) | (i10 & 57344), 1);
                int size = swipeys.size();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(819171025);
                if (!z2) {
                    retirementUpsellVerticalSpacing = C2002Dp.m7995constructorimpl(0);
                } else {
                    retirementUpsellVerticalSpacing = getRetirementUpsellVerticalSpacing(composerStartRestartGroup, 0);
                }
                float f = retirementUpsellVerticalSpacing;
                composerStartRestartGroup.endReplaceGroup();
                int i12 = i11 >> 6;
                SwipeyPageIndicator(i5, size, z2, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, f, 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i12 & 14) | ((i11 >> 9) & 896), 0);
                composer2 = composerStartRestartGroup;
                proceed_text = swipeys.get(i).getProceed_text();
                if (proceed_text == null) {
                    proceed_text = "";
                }
                String str = proceed_text;
                composer2.startReplaceGroup(5004770);
                z4 = (i11 & 57344) != 16384 || ((i11 & i7) != 0 && composer2.changedInstance(callbacks));
                objRememberedValue = composer2.rememberedValue();
                if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new RetirementSignUpScreenKt$SwipeyContentColumn$1$1$1(callbacks);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                SwipeyCta(str, z3, (Function0) ((KFunction) objRememberedValue), null, composer2, i12 & 112, 8);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Arrangement.Vertical vertical2 = top;
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpScreenKt.SwipeyContentColumn$lambda$20(pagerState, swipeys, i, z, callbacks, z2, modifier3, vertical2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 1572864;
        modifier2 = modifier;
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
            if (i8 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i92 = i4 >> 18;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, ((((i92 & 112) | ((i92 & 14) | 384)) >> 3) & 14) | 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                int i102 = i4 >> 3;
                int i112 = i4;
                SwipeyTextContent(null, pagerState, swipeys, callbacks, z2, composerStartRestartGroup, ((i4 << 3) & 1008) | (i102 & 7168) | (i102 & 57344), 1);
                int size2 = swipeys.size();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(819171025);
                if (!z2) {
                }
                float f2 = retirementUpsellVerticalSpacing;
                composerStartRestartGroup.endReplaceGroup();
                int i122 = i112 >> 6;
                SwipeyPageIndicator(i5, size2, z2, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, f2, 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i122 & 14) | ((i112 >> 9) & 896), 0);
                composer2 = composerStartRestartGroup;
                proceed_text = swipeys.get(i).getProceed_text();
                if (proceed_text == null) {
                }
                String str2 = proceed_text;
                composer2.startReplaceGroup(5004770);
                if ((i112 & 57344) != 16384) {
                    objRememberedValue = composer2.rememberedValue();
                    if (!z4) {
                        objRememberedValue = new RetirementSignUpScreenKt$SwipeyContentColumn$1$1$1(callbacks);
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceGroup();
                        SwipeyCta(str2, z3, (Function0) ((KFunction) objRememberedValue), null, composer2, i122 & 112, 8);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        final Arrangement.Vertical vertical22 = top;
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompactSwipeyScreen(Modifier modifier, final PagerState pagerState, final List<RetirementSignupSwipey> list, final int i, final boolean z, final boolean z2, final LottieComposition lottieComposition, final LottieAnimatable lottieAnimatable, final RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PagerState pagerState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1859753447);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                pagerState2 = pagerState;
                i4 |= composerStartRestartGroup.changed(pagerState2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else {
                            if ((i2 & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            if ((i3 & 64) != 0) {
                                if ((i2 & 1572864) == 0) {
                                    i4 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 1048576 : 524288;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i4 |= composerStartRestartGroup.changed(lottieAnimatable) ? 8388608 : 4194304;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    i4 |= (134217728 & i2) == 0 ? composerStartRestartGroup.changed(retirementSignUpScreenCallbacks) : composerStartRestartGroup.changedInstance(retirementSignUpScreenCallbacks) ? 67108864 : 33554432;
                                }
                                if ((38347923 & i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                } else {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1859753447, i4, -1, "com.robinhood.android.retirement.ui.signup.swipeys.CompactSwipeyScreen (RetirementSignUpScreen.kt:480)");
                                    }
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                                    Modifier modifier4 = modifier2;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    ContentScale crop = ContentScale.INSTANCE.getCrop();
                                    Alignment bottomCenter = companion.getBottomCenter();
                                    Modifier modifierWeight$default = Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    z3 = (29360128 & i4) != 8388608;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(lottieAnimatable.getProgress());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierWeight$default, false, false, false, null, false, null, bottomCenter, crop, false, false, null, null, false, composer2, ((i4 >> 18) & 14) | 805306368, 6, 63992);
                                    SwipeyContentColumn(pagerState2, list, i, z, retirementSignUpScreenCallbacks, z2, null, null, composer2, ((i4 >> 3) & 8190) | ((i4 >> 12) & 57344) | (458752 & i4), 192);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return RetirementSignUpScreenKt.CompactSwipeyScreen$lambda$24(modifier3, pagerState, list, i, z, z2, lottieComposition, lottieAnimatable, retirementSignUpScreenCallbacks, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 1572864;
                            if ((i3 & 128) != 0) {
                            }
                            if ((i3 & 256) != 0) {
                            }
                            if ((38347923 & i4) == 38347922) {
                                if (i5 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Modifier modifier42 = modifier2;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                                    Alignment bottomCenter2 = companion3.getBottomCenter();
                                    Modifier modifierWeight$default2 = Column5.weight$default(column62, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    if ((29360128 & i4) != 8388608) {
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z3) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(lottieAnimatable.getProgress());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierWeight$default2, false, false, false, null, false, null, bottomCenter2, crop2, false, false, null, null, false, composer2, ((i4 >> 18) & 14) | 805306368, 6, 63992);
                                        SwipeyContentColumn(pagerState2, list, i, z, retirementSignUpScreenCallbacks, z2, null, null, composer2, ((i4 >> 3) & 8190) | ((i4 >> 12) & 57344) | (458752 & i4), 192);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier42;
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        if ((38347923 & i4) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((38347923 & i4) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((38347923 & i4) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((38347923 & i4) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        pagerState2 = pagerState;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((38347923 & i4) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediumSwipeyScreen(Modifier modifier, final PagerState pagerState, final List<RetirementSignupSwipey> list, final int i, final boolean z, final LottieComposition lottieComposition, final LottieAnimatable lottieAnimatable, final RetirementSignUpScreenCallbacks retirementSignUpScreenCallbacks, final boolean z2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PagerState pagerState2;
        List<RetirementSignupSwipey> list2;
        int i5;
        boolean z3;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z5;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1351155405);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                pagerState2 = pagerState;
                i4 |= composerStartRestartGroup.changed(pagerState2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    list2 = list;
                    i4 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 = i;
                        i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z3 = z;
                            i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else {
                            if ((i2 & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 131072 : 65536;
                            }
                            if ((i3 & 64) == 0) {
                                i4 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(lottieAnimatable) ? 1048576 : 524288;
                            }
                            if ((i3 & 128) == 0) {
                                i4 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i4 |= (16777216 & i2) == 0 ? composerStartRestartGroup.changed(retirementSignUpScreenCallbacks) : composerStartRestartGroup.changedInstance(retirementSignUpScreenCallbacks) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) != 0) {
                                if ((i2 & 100663296) == 0) {
                                    z4 = z2;
                                    i4 |= composerStartRestartGroup.changed(z4) ? 67108864 : 33554432;
                                }
                                if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    if (i6 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1351155405, i4, -1, "com.robinhood.android.retirement.ui.signup.swipeys.MediumSwipeyScreen (RetirementSignUpScreen.kt:514)");
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    int i7 = i4 >> 3;
                                    int i8 = i4 >> 9;
                                    PagerState pagerState3 = pagerState2;
                                    List<RetirementSignupSwipey> list3 = list2;
                                    int i9 = i5;
                                    SwipeyContentColumn(pagerState3, list3, i9, z3, retirementSignUpScreenCallbacks, z4, Row5.weight$default(row6, companion3, 1.0f, false, 2, null), arrangement.getCenter(), composerStartRestartGroup, (i7 & 7168) | (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 896) | (57344 & i8) | (i8 & 458752), 0);
                                    ContentScale fit = ContentScale.INSTANCE.getFit();
                                    Alignment center = companion.getCenter();
                                    Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    z5 = (3670016 & i4) != 1048576;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(lottieAnimatable.getProgress());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierWeight$default, false, false, false, null, false, null, center, fit, false, false, null, null, false, composer2, ((i4 >> 15) & 14) | 805306368, 6, 63992);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                final Modifier modifier3 = modifier2;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return RetirementSignUpScreenKt.MediumSwipeyScreen$lambda$28(modifier3, pagerState, list, i, z, lottieComposition, lottieAnimatable, retirementSignUpScreenCallbacks, z2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 100663296;
                            z4 = z2;
                            if ((i4 & 38347923) == 38347922) {
                                if (i6 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    Modifier.Companion companion32 = Modifier.INSTANCE;
                                    int i72 = i4 >> 3;
                                    int i82 = i4 >> 9;
                                    PagerState pagerState32 = pagerState2;
                                    List<RetirementSignupSwipey> list32 = list2;
                                    int i92 = i5;
                                    SwipeyContentColumn(pagerState32, list32, i92, z3, retirementSignUpScreenCallbacks, z4, Row5.weight$default(row62, companion32, 1.0f, false, 2, null), arrangement2.getCenter(), composerStartRestartGroup, (i72 & 7168) | (i72 & 14) | 12582912 | (i72 & 112) | (i72 & 896) | (57344 & i82) | (i82 & 458752), 0);
                                    ContentScale fit2 = ContentScale.INSTANCE.getFit();
                                    Alignment center2 = companion4.getCenter();
                                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    if ((3670016 & i4) != 1048576) {
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z5) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(lottieAnimatable.getProgress());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierWeight$default2, false, false, false, null, false, null, center2, fit2, false, false, null, null, false, composer2, ((i4 >> 15) & 14) | 805306368, 6, 63992);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }
                            }
                            final Modifier modifier32 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        z4 = z2;
                        if ((i4 & 38347923) == 38347922) {
                        }
                        final Modifier modifier322 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z3 = z;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    z4 = z2;
                    if ((i4 & 38347923) == 38347922) {
                    }
                    final Modifier modifier3222 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i5 = i;
                if ((i3 & 16) == 0) {
                }
                z3 = z;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                z4 = z2;
                if ((i4 & 38347923) == 38347922) {
                }
                final Modifier modifier32222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            list2 = list;
            if ((i3 & 8) != 0) {
            }
            i5 = i;
            if ((i3 & 16) == 0) {
            }
            z3 = z;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            z4 = z2;
            if ((i4 & 38347923) == 38347922) {
            }
            final Modifier modifier322222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        pagerState2 = pagerState;
        if ((i3 & 4) == 0) {
        }
        list2 = list;
        if ((i3 & 8) != 0) {
        }
        i5 = i;
        if ((i3 & 16) == 0) {
        }
        z3 = z;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        z4 = z2;
        if ((i4 & 38347923) == 38347922) {
        }
        final Modifier modifier3222222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
