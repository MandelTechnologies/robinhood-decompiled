package com.robinhood.android.retirement.dashboard.contribution;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.deposit.AdvisoryDepositsGoldPill;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionSummary;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.retirement.dashboard.C26985R;
import com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContributionsSummaryCard.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a3\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0003¢\u0006\u0002\u0010$\u001a3\u0010&\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160(2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010)\u001a-\u0010*\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160#2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010,\u001a\u001f\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u00100\u001a\u0017\u00104\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u00105\u001a)\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u000209H\u0007¢\u0006\u0002\u0010:\u001a\u0012\u0010;\u001a\u00020\u0016*\u00020<2\u0006\u00107\u001a\u00020\t\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r\"\u0013\u0010\u000e\u001a\u00020\f¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\u0010\"\u0010\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r\"\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u00101\u001a\u00020\t8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b2\u00103¨\u0006=²\u0006\n\u0010>\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010?\u001a\u0004\u0018\u00010@X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010B\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020EX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020GX\u008a\u0084\u0002"}, m3636d2 = {"coerceForLottie", "", "realMinimum", "ContributionCardRingMaxScale", "DebounceClickDelayMs", "", "RingFilledFrame", "", "CardScaleAnimLabel", "", "CardPaddingAnimLabel", "ContributionCardRingSize", "Landroidx/compose/ui/unit/Dp;", "F", "ContributionCardRingMaxSize", "getContributionCardRingMaxSize", "()F", "ContributionCardRowsMaxWidth", "isFirstTimeGlobal", "Landroidx/compose/runtime/MutableState;", "", "ContributionCardLottie", "", "Landroidx/compose/foundation/layout/BoxScope;", "percentage", "clicked", "ringPlacement", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/foundation/layout/BoxScope;FZLcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SummaryCardTextContent", "state", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SummaryCardLoggingIdentifier", "LoadedContributionsSummaryCard", "onDismissStrategiesBanner", "Lkotlin/Function1;", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeaderWithGoldValueProps", "onClickHeader", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContributionCardDataRow", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Row;", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Row;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SummaryCardPlaceholderTag", "getSummaryCardPlaceholderTag$annotations", "()V", "PlaceholderContributionSummaryCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContributionSummaryCard", "accountNumber", "duxo", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDuxo;Landroidx/compose/runtime/Composer;II)V", "contributionSummaryCard", "Landroidx/compose/foundation/lazy/LazyListScope;", "lib-retirement-dashboard_externalDebug", "isFirstTime", "composition", "Lcom/airbnb/lottie/LottieComposition;", "scale", "padding", "wasClicked", "ringOffset", "Landroidx/compose/ui/geometry/Offset;", "viewState", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionsSummaryCard2 {
    private static final String CardPaddingAnimLabel = "summary_card_padding_anim";
    private static final String CardScaleAnimLabel = "summary_card_scale_anim";
    private static final float ContributionCardRingMaxScale = 1.2f;
    private static final float ContributionCardRingMaxSize;
    private static final float ContributionCardRingSize;
    private static final float ContributionCardRowsMaxWidth;
    private static final long DebounceClickDelayMs = 140;
    private static final int RingFilledFrame = 60;
    private static final String SummaryCardLoggingIdentifier = "contribution_summary_card";
    public static final String SummaryCardPlaceholderTag = "summary_card_placeholder";
    private static final SnapshotState<Boolean> isFirstTimeGlobal;

    /* compiled from: ContributionsSummaryCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContributionsSummaryCard.values().length];
            try {
                iArr[ContributionsSummaryCard.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContributionsSummaryCard.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContributionsSummaryCard.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionCardDataRow$lambda$45(ContributionSummaryCardViewState.Row row, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionCardDataRow(row, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionCardLottie$lambda$10(BoxScope boxScope, float f, boolean z, ContributionsSummaryCard contributionsSummaryCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionCardLottie(boxScope, f, z, contributionsSummaryCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionCardLottie$lambda$4(BoxScope boxScope, float f, boolean z, ContributionsSummaryCard contributionsSummaryCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionCardLottie(boxScope, f, z, contributionsSummaryCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionCardLottie$lambda$7(BoxScope boxScope, float f, boolean z, ContributionsSummaryCard contributionsSummaryCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionCardLottie(boxScope, f, z, contributionsSummaryCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContributionCardLottie$lambda$9$lambda$8(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionSummaryCard$lambda$50(String str, Modifier modifier, ContributionSummaryCardDuxo contributionSummaryCardDuxo, int i, int i2, Composer composer, int i3) {
        ContributionSummaryCard(str, modifier, contributionSummaryCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithGoldValueProps$lambda$43(ContributionSummaryCardViewState.Loaded loaded, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HeaderWithGoldValueProps(loaded, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContributionsSummaryCard$lambda$38(ContributionSummaryCardViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedContributionsSummaryCard(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderContributionSummaryCard$lambda$46(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderContributionSummaryCard(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummaryCardTextContent$lambda$18(ContributionSummaryCardViewState.Loaded loaded, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        SummaryCardTextContent(loaded, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSummaryCardPlaceholderTag$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LoadedContributionsSummaryCard$lambda$37$lambda$36(final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$LoadedContributionsSummaryCard$lambda$37$lambda$36$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$21(snapshotState, false);
            }
        };
    }

    private static final boolean ContributionCardLottie$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition ContributionCardLottie$lambda$3(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float ContributionCardLottie$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float ContributionCardLottie$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final ContributionSummaryCardViewState ContributionSummaryCard$lambda$47(SnapshotState4<? extends ContributionSummaryCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean LoadedContributionsSummaryCard$lambda$20(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final long LoadedContributionsSummaryCard$lambda$23(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContributionsSummaryCard LoadedContributionsSummaryCard$lambda$27(SnapshotState4<? extends ContributionsSummaryCard> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static /* synthetic */ float coerceForLottie$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.01f;
        }
        return coerceForLottie(f, f2);
    }

    public static final float coerceForLottie(float f, float f2) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return RangesKt.coerceAtLeast(((float) Math.floor(f * r0)) / 100, f2);
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(128);
        ContributionCardRingSize = fM7995constructorimpl;
        ContributionCardRingMaxSize = C2002Dp.m7995constructorimpl(fM7995constructorimpl * 1.2f);
        ContributionCardRowsMaxWidth = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        isFirstTimeGlobal = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final float getContributionCardRingMaxSize() {
        return ContributionCardRingMaxSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContributionCardLottie(final BoxScope boxScope, final float f, final boolean z, final ContributionsSummaryCard contributionsSummaryCard, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        BentoTheme bentoTheme;
        int i4;
        int i5;
        LottieComposition lottieCompositionContributionCardLottie$lambda$3;
        Alignment bottomEnd;
        float fM21592getMediumD9Ej5fM;
        BoxScope boxScope2;
        Modifier modifier3;
        final float progress;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1061056312);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(contributionsSummaryCard.ordinal()) ? 2048 : 1024;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1061056312, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.ContributionCardLottie (ContributionsSummaryCard.kt:142)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = isFirstTimeGlobal;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                float f2 = 60;
                float fCoerceForLottie = coerceForLottie(f * f2, 1.0f);
                int iRoundToInt = MathKt.roundToInt(fCoerceForLottie);
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    i5 = C26985R.raw.contribution_card_day_lottie;
                } else {
                    i5 = C26985R.raw.contribution_card_night_lottie;
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i5)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Composer composer2 = composerStartRestartGroup;
                lottieCompositionContributionCardLottie$lambda$3 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition);
                if (lottieCompositionContributionCardLottie$lambda$3 != null) {
                    final Modifier modifier6 = modifier5;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ContributionsSummaryCard2.ContributionCardLottie$lambda$4(boxScope, f, z, contributionsSummaryCard, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                float endFrame = lottieCompositionContributionCardLottie$lambda$3.getEndFrame();
                float f3 = (!z || f >= 1.0f) ? 1.0f : (endFrame - fCoerceForLottie) / (endFrame - f2);
                if (!z) {
                    bottomEnd = Alignment.INSTANCE.getCenterEnd();
                } else {
                    int i7 = WhenMappings.$EnumSwitchMapping$0[contributionsSummaryCard.ordinal()];
                    if (i7 == 1) {
                        bottomEnd = Alignment.INSTANCE.getBottomEnd();
                    } else if (i7 == 2) {
                        bottomEnd = Alignment.INSTANCE.getCenterEnd();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bottomEnd = Alignment.INSTANCE.getTopEnd();
                    }
                }
                Alignment alignment = bottomEnd;
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z ? 1.2f : 1.0f, AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, CardScaleAnimLabel, null, composer2, 3072, 20);
                if (z) {
                    composer2.startReplaceGroup(-1028896560);
                    fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1028833103);
                    fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM();
                    composer2.endReplaceGroup();
                }
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(fM21592getMediumD9Ej5fM, AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, CardPaddingAnimLabel, null, composer2, 3072, 20);
                composer2.startReplaceGroup(1767935380);
                if (ContributionCardLottie$lambda$1(snapshotState) || z) {
                    boxScope2 = boxScope;
                    Modifier modifier7 = modifier5;
                    LottieComposition lottieCompositionContributionCardLottie$lambda$32 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition);
                    Integer numValueOf = Integer.valueOf(ContributionCardLottie$lambda$1(snapshotState) ? 0 : iRoundToInt);
                    Integer numValueOf2 = ContributionCardLottie$lambda$1(snapshotState) ? Integer.valueOf(iRoundToInt) : null;
                    modifier3 = modifier7;
                    LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionContributionCardLottie$lambda$32, false, false, false, new LottieClipSpec.Frame(numValueOf, numValueOf2, false, 4, null), RangesKt.coerceAtMost(f3, 3.0f), 0, null, false, false, composer2, (LottieClipSpec.Frame.$stable << 12) | 384, 970);
                    composer2 = composer2;
                    progress = lottieAnimationStateAnimateLottieCompositionAsState.getProgress();
                } else {
                    LottieComposition lottieCompositionContributionCardLottie$lambda$33 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition);
                    if (lottieCompositionContributionCardLottie$lambda$33 == null) {
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup3 != null) {
                            final Modifier modifier8 = modifier5;
                            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ContributionsSummaryCard2.ContributionCardLottie$lambda$7(boxScope, f, z, contributionsSummaryCard, modifier8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    progress = lottieCompositionContributionCardLottie$lambda$33.getProgressForFrame(fCoerceForLottie);
                    boxScope2 = boxScope;
                    modifier3 = modifier5;
                }
                composer2.endReplaceGroup();
                Modifier modifierScale = Scale2.scale(PaddingKt.m5142padding3ABfNKs(boxScope2.align(modifier3, alignment), C2002Dp.m7995constructorimpl(ContributionCardLottie$lambda$6(snapshotState4AnimateFloatAsState2))), ContributionCardLottie$lambda$5(snapshotState4AnimateFloatAsState));
                float f4 = ContributionCardRingSize;
                Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(modifierScale, 0.0f, 0.0f, f4, f4, 3, null);
                LottieComposition lottieCompositionContributionCardLottie$lambda$34 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition);
                composer2.startReplaceGroup(5004770);
                boolean zChanged = composer2.changed(progress);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ContributionsSummaryCard2.ContributionCardLottie$lambda$9$lambda$8(progress));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                float f5 = progress;
                Composer composer3 = composer2;
                Modifier modifier9 = modifier3;
                LottieAnimation2.LottieAnimation(lottieCompositionContributionCardLottie$lambda$34, (Function0) objRememberedValue2, modifierM5173sizeInqDBjuR0$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composer3, 0, 0, 65528);
                composerStartRestartGroup = composer3;
                LottieComposition lottieCompositionContributionCardLottie$lambda$35 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition);
                if ((lottieCompositionContributionCardLottie$lambda$35 != null ? lottieCompositionContributionCardLottie$lambda$35.getFrameForProgress(f5) : 0.0f) >= iRoundToInt && ContributionCardLottie$lambda$1(snapshotState)) {
                    ContributionCardLottie$lambda$2(snapshotState, false);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionsSummaryCard2.ContributionCardLottie$lambda$10(boxScope, f, z, contributionsSummaryCard, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float f22 = 60;
            float fCoerceForLottie2 = coerceForLottie(f * f22, 1.0f);
            int iRoundToInt2 = MathKt.roundToInt(fCoerceForLottie2);
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i5)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Composer composer22 = composerStartRestartGroup;
            lottieCompositionContributionCardLottie$lambda$3 = ContributionCardLottie$lambda$3(lottieCompositionResultRememberLottieComposition2);
            if (lottieCompositionContributionCardLottie$lambda$3 != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ContributionCardLottie$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SummaryCardTextContent(final ContributionSummaryCardViewState.Loaded loaded, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        ContributionSummaryCardViewState.Loaded loaded2;
        int i3;
        Modifier modifier2;
        Function0<Unit> function02;
        boolean useManagedAccountLayout;
        boolean useHeaderWithGoldValueProps;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Arrangement arrangement;
        Modifier.Companion companion;
        int i4;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-688462624);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else if ((i & 6) == 0) {
            loaded2 = loaded;
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            loaded2 = loaded;
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
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-688462624, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.SummaryCardTextContent (ContributionsSummaryCard.kt:242)");
                    }
                    useManagedAccountLayout = loaded2.getUseManagedAccountLayout();
                    RetirementCombinedSummaryCardViewModel viewModel = loaded2.getViewModel();
                    useHeaderWithGoldValueProps = loaded2.getUseHeaderWithGoldValueProps();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function02, 7, null);
                    Modifier modifier5 = modifier4;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getStart(), useHeaderWithGoldValueProps ? companion2.getTop() : companion2.getCenterVertically(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion4, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(-942009152);
                    if (useHeaderWithGoldValueProps) {
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier4, companion3.getSetModifier());
                        arrangement = arrangement2;
                        i4 = 0;
                        companion = companion4;
                        BentoText2.m20747BentoText38GnDrw(viewModel.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1143161066);
                        if (useManagedAccountLayout) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), StringResources_androidKt.stringResource(C26985R.string.retirement_contributions_dashboard_cta, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 56);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                    } else {
                        arrangement = arrangement2;
                        companion = companion4;
                        i4 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion, 0.0f, ContributionCardRowsMaxWidth, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i4);
                    currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default);
                    Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor5);
                    }
                    composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier5, companion3.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(1887060214);
                    int i7 = i4;
                    for (ContributionSummaryCardViewState.Row row : loaded.getRows()) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ContributionSummaryCardViewState.Row row2 = row;
                        composerStartRestartGroup.startReplaceGroup(1887061782);
                        if (i7 != 0) {
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ContributionCardDataRow(row2, null, composerStartRestartGroup, StringResource.$stable, 2);
                        i7 = i8;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(-941961040);
                    if (!useManagedAccountLayout) {
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion6.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C26985R.string.retirement_contributions_dashboard_cta, composerStartRestartGroup, i4), null, null, null, false, null, composerStartRestartGroup, (i3 >> 6) & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12), null, bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                        composerStartRestartGroup.endNode();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, ContributionCardRingSize), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i4);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContributionsSummaryCard2.SummaryCardTextContent$lambda$18(loaded, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                useManagedAccountLayout = loaded2.getUseManagedAccountLayout();
                RetirementCombinedSummaryCardViewModel viewModel2 = loaded2.getViewModel();
                useHeaderWithGoldValueProps = loaded2.getUseHeaderWithGoldValueProps();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function02, 7, null);
                Modifier modifier52 = modifier4;
                Arrangement arrangement22 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement22.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor7 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap7, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier7, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default2, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement22.getStart(), useHeaderWithGoldValueProps ? companion22.getTop() : companion22.getCenterVertically(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy4, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Modifier modifierWeight$default2 = Row5.weight$default(Row6.INSTANCE, companion42, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement22.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(-942009152);
                            if (useHeaderWithGoldValueProps) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(companion, 0.0f, ContributionCardRowsMaxWidth, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement.getTop(), companion22.getStart(), composerStartRestartGroup, i4);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                            CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5176widthInVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting()) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier52, companion32.getSetModifier());
                                composerStartRestartGroup.startReplaceGroup(1887060214);
                                int i72 = i4;
                                while (r0.hasNext()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(-941961040);
                                if (!useManagedAccountLayout) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, ContributionCardRingSize), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i4);
                                composerStartRestartGroup.endNode();
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
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
        }
        function02 = function0;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedContributionsSummaryCard(final ContributionSummaryCardViewState.Loaded state, final Function1<? super String, Unit> onDismissStrategiesBanner, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final Context context;
        final Navigator navigator;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        final long jMo7449getContainerSizeYbymL2g;
        boolean zChanged;
        Object objRememberedValue4;
        final SnapshotState4 snapshotState4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue5;
        final SnapshotState snapshotState3;
        SnapshotState4 snapshotState42;
        Composer composer2;
        Function0<Unit> function0;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        RetirementCombinedContributionSummary summary;
        Modifier.Companion companion2;
        Object obj;
        int i5;
        Modifier modifier3;
        Composer composer3;
        Composer composer4;
        Object objRememberedValue6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissStrategiesBanner, "onDismissStrategiesBanner");
        Composer composerStartRestartGroup = composer.startRestartGroup(-312658647);
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
            i3 |= composerStartRestartGroup.changedInstance(onDismissStrategiesBanner) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312658647, i4, -1, "com.robinhood.android.retirement.dashboard.contribution.LoadedContributionsSummaryCard (ContributionsSummaryCard.kt:342)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                RetirementCombinedSummaryCardViewModel viewModel = state.getViewModel();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                jMo7449getContainerSizeYbymL2g = ((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g();
                long jLoadedContributionsSummaryCard$lambda$23 = LoadedContributionsSummaryCard$lambda$23(snapshotState2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(jLoadedContributionsSummaryCard$lambda$23);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$26$lambda$25(jMo7449getContainerSizeYbymL2g, snapshotState2);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$34$lambda$29$lambda$28(coroutineScope, navigator, context, state, snapshotState, snapshotState4);
                        }
                    };
                    snapshotState3 = snapshotState;
                    snapshotState42 = snapshotState4;
                    composerStartRestartGroup.updateRememberedValue(function02);
                    objRememberedValue5 = function02;
                } else {
                    snapshotState3 = snapshotState;
                    snapshotState42 = snapshotState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-2137879837);
                if (state.getStrategiesUpsellBanner() == null) {
                    StrategiesUpsellBanner.StrategiesUpsellBanner(state.getAccountNumber(), state.getStrategiesUpsellBanner(), onDismissStrategiesBanner, null, composerStartRestartGroup, (i4 << 3) & 896, 8);
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-2137870828);
                if (state.getUseHeaderWithGoldValueProps()) {
                    function0 = function0HapticClick;
                } else {
                    function0 = function0HapticClick;
                    HeaderWithGoldValueProps(state, function0, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, i4 & 14, 0);
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion5, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, SummaryCardLoggingIdentifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                SnapshotState4 snapshotState43 = snapshotState42;
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i7 = i4 & 14;
                SummaryCardTextContent(state, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), function0, composer2, i7 | 48, 0);
                summary = viewModel.getSummary();
                composer2.startReplaceGroup(-1300120620);
                if (summary != null) {
                    composer3 = composer2;
                    i5 = 1;
                    modifier3 = modifier4;
                    obj = null;
                    companion2 = companion5;
                } else {
                    composer2.startReplaceGroup(-1633490746);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ContributionsSummaryCard2.m2430xf25f5fd0(snapshotState3, snapshotState2, (LayoutCoordinates) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue7);
                    companion2 = companion5;
                    obj = null;
                    Composer composer5 = composer2;
                    i5 = 1;
                    modifier3 = modifier4;
                    ContributionCardLottie(boxScopeInstance, summary.getCurrentPercent(), LoadedContributionsSummaryCard$lambda$20(snapshotState3), LoadedContributionsSummaryCard$lambda$27(snapshotState43), modifierOnGloballyPositioned, composer5, 24582, 0);
                    composer3 = composer5;
                    Unit unit = Unit.INSTANCE;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (state.getUseManagedAccountLayout()) {
                    composer3.startReplaceGroup(-1847712127);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, i5, obj), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 4);
                    composer4 = composer3;
                    composer4.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-1847876272);
                    ContributionDepositCtas.ContributionDepositCtas(state, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, i5, obj), composer3, i7, 0);
                    composer3.endReplaceGroup();
                    composer4 = composer3;
                }
                composer4.endNode();
                Unit unit2 = Unit.INSTANCE;
                composer4.startReplaceGroup(5004770);
                objRememberedValue6 = composer4.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$37$lambda$36(snapshotState3, (DisposableEffectScope) obj2);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue6);
                }
                composer4.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer4, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$38(state, onDismissStrategiesBanner, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            RetirementCombinedSummaryCardViewModel viewModel2 = state.getViewModel();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            jMo7449getContainerSizeYbymL2g = ((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g();
            long jLoadedContributionsSummaryCard$lambda$232 = LoadedContributionsSummaryCard$lambda$23(snapshotState2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(jLoadedContributionsSummaryCard$lambda$232);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$26$lambda$25(jMo7449getContainerSizeYbymL2g, snapshotState2);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                snapshotState4 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        Function0 function022 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$34$lambda$29$lambda$28(coroutineScope, navigator, context, state, snapshotState, snapshotState4);
                            }
                        };
                        snapshotState3 = snapshotState;
                        snapshotState42 = snapshotState4;
                        composerStartRestartGroup.updateRememberedValue(function022);
                        objRememberedValue5 = function022;
                        composerStartRestartGroup.endReplaceGroup();
                        Function0<Unit> function0HapticClick2 = Haptics.hapticClick((Function0) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-2137879837);
                        if (state.getStrategiesUpsellBanner() == null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-2137870828);
                        if (state.getUseHeaderWithGoldValueProps()) {
                        }
                        composer2.endReplaceGroup();
                        Modifier.Companion companion52 = Modifier.INSTANCE;
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion52, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, SummaryCardLoggingIdentifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default2);
                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                            SnapshotState4 snapshotState432 = snapshotState42;
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            int i72 = i4 & 14;
                            SummaryCardTextContent(state, SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null), function0, composer2, i72 | 48, 0);
                            summary = viewModel2.getSummary();
                            composer2.startReplaceGroup(-1300120620);
                            if (summary != null) {
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (state.getUseManagedAccountLayout()) {
                            }
                            composer4.endNode();
                            Unit unit22 = Unit.INSTANCE;
                            composer4.startReplaceGroup(5004770);
                            objRememberedValue6 = composer4.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                            }
                            composer4.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer4, 54);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContributionsSummaryCard$lambda$21(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void LoadedContributionsSummaryCard$lambda$24(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContributionsSummaryCard LoadedContributionsSummaryCard$lambda$26$lambda$25(long j, SnapshotState snapshotState) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LoadedContributionsSummaryCard$lambda$23(snapshotState) & 4294967295L)) / ((int) (j & 4294967295L));
        if (0.0f <= fIntBitsToFloat && fIntBitsToFloat <= 0.34f) {
            return ContributionsSummaryCard.Top;
        }
        if (0.34f <= fIntBitsToFloat && fIntBitsToFloat <= 0.67f) {
            return ContributionsSummaryCard.Middle;
        }
        return ContributionsSummaryCard.Bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContributionsSummaryCard$lambda$34$lambda$29$lambda$28(CoroutineScope coroutineScope, Navigator navigator, Context context, ContributionSummaryCardViewState.Loaded loaded, SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ContributionsSummaryCard5(navigator, context, loaded, snapshotState, snapshotState4, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LoadedContributionsSummaryCard$lambda$34$lambda$33$lambda$32$lambda$31$lambda$30 */
    public static final Unit m2430xf25f5fd0(SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (!LoadedContributionsSummaryCard$lambda$20(snapshotState)) {
            LoadedContributionsSummaryCard$lambda$24(snapshotState2, LayoutCoordinates2.positionInRoot(coordinates));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HeaderWithGoldValueProps(final ContributionSummaryCardViewState.Loaded loaded, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        ContributionSummaryCardViewState.Loaded loaded2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        String advisoryGoldValuePropsTitle;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1373974404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else if ((i & 6) == 0) {
            loaded2 = loaded;
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            loaded2 = loaded;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1373974404, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.HeaderWithGoldValueProps (ContributionsSummaryCard.kt:459)");
                }
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), centerVertically, composerStartRestartGroup, 48);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionsSummaryCard2.HeaderWithGoldValueProps$lambda$42$lambda$40$lambda$39(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(loaded2.getViewModel().getTitle(), ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1609588757);
                if (loaded.getUseManagedAccountLayout()) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), StringResources_androidKt.stringResource(C26985R.string.retirement_contributions_dashboard_cta, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 56);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                advisoryGoldValuePropsTitle = loaded.getAdvisoryGoldValuePropsTitle();
                composerStartRestartGroup.startReplaceGroup(-1609576408);
                if (advisoryGoldValuePropsTitle != null) {
                    AdvisoryDepositsGoldPill.AdvisoryDepositsGoldPill(advisoryGoldValuePropsTitle, loaded.getAccountNumber(), null, composerStartRestartGroup, 0, 4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionsSummaryCard2.HeaderWithGoldValueProps$lambda$43(loaded, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), centerVertically2, composerStartRestartGroup, 48);
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
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionsSummaryCard2.HeaderWithGoldValueProps$lambda$42$lambda$40$lambda$39(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(loaded2.getViewModel().getTitle(), ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1609588757);
                    if (loaded.getUseManagedAccountLayout()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(Row5.weight$default(row62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    advisoryGoldValuePropsTitle = loaded.getAdvisoryGoldValuePropsTitle();
                    composerStartRestartGroup.startReplaceGroup(-1609576408);
                    if (advisoryGoldValuePropsTitle != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithGoldValueProps$lambda$42$lambda$40$lambda$39(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContributionCardDataRow(final ContributionSummaryCardViewState.Row row, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1922816041);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(row) : composerStartRestartGroup.changedInstance(row) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1922816041, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.ContributionCardDataRow (ContributionsSummaryCard.kt:495)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                StringResource label = row.getLabel();
                int i6 = StringResource.$stable;
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(label, composerStartRestartGroup, i6), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(row.getValue(), composer2, i6), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionsSummaryCard2.ContributionCardDataRow$lambda$45(row, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                StringResource label2 = row.getLabel();
                int i62 = StringResource.$stable;
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(label2, composerStartRestartGroup, i62), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(row.getValue(), composer2, i62), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PlaceholderContributionSummaryCard(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1653964984);
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
                ComposerKt.traceEventStart(1653964984, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.PlaceholderContributionSummaryCard (ContributionsSummaryCard.kt:524)");
            }
            Spacer2.Spacer(TestTag3.testTag(SizeKt.m5169size3ABfNKs(modifier, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), SummaryCardPlaceholderTag), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionsSummaryCard2.PlaceholderContributionSummaryCard$lambda$46(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionSummaryCard(final String accountNumber, Modifier modifier, ContributionSummaryCardDuxo contributionSummaryCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ContributionSummaryCardDuxo contributionSummaryCardDuxo2;
        Modifier modifier3;
        int i4;
        ContributionSummaryCardDuxo contributionSummaryCardDuxo3;
        ContributionSummaryCardViewState contributionSummaryCardViewStateContributionSummaryCard$lambda$47;
        boolean zChangedInstance;
        Object objRememberedValue;
        final ContributionSummaryCardDuxo contributionSummaryCardDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1046519746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    contributionSummaryCardDuxo2 = contributionSummaryCardDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(contributionSummaryCardDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    contributionSummaryCardDuxo2 = contributionSummaryCardDuxo;
                }
                i3 |= i6;
            } else {
                contributionSummaryCardDuxo2 = contributionSummaryCardDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ContributionSummaryCardDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$ContributionSummaryCard$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$ContributionSummaryCard$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-897);
                        contributionSummaryCardDuxo3 = (ContributionSummaryCardDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1046519746, i4, -1, "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCard (ContributionsSummaryCard.kt:540)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(contributionSummaryCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        contributionSummaryCardViewStateContributionSummaryCard$lambda$47 = ContributionSummaryCard$lambda$47(snapshotState4CollectAsStateWithLifecycle);
                        if (!(contributionSummaryCardViewStateContributionSummaryCard$lambda$47 instanceof ContributionSummaryCardViewState.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(298162703);
                            ContributionSummaryCardViewState.Loaded loaded = (ContributionSummaryCardViewState.Loaded) contributionSummaryCardViewStateContributionSummaryCard$lambda$47;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(contributionSummaryCardDuxo3);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new ContributionsSummaryCard3(contributionSummaryCardDuxo3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LoadedContributionsSummaryCard(loaded, (Function1) ((KFunction) objRememberedValue3), null, composerStartRestartGroup, 0, 4);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(contributionSummaryCardViewStateContributionSummaryCard$lambda$47 instanceof ContributionSummaryCardViewState.Loading)) {
                                composerStartRestartGroup.startReplaceGroup(-683120971);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(298396598);
                            PlaceholderContributionSummaryCard(modifier3, composerStartRestartGroup, (i4 >> 3) & 14, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i7 = i4 & 14;
                        zChangedInstance = composerStartRestartGroup.changedInstance(contributionSummaryCardDuxo3) | (i7 == 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ContributionsSummaryCard4(contributionSummaryCardDuxo3, accountNumber, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        contributionSummaryCardDuxo4 = contributionSummaryCardDuxo3;
                        modifier4 = modifier3;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                contributionSummaryCardDuxo3 = contributionSummaryCardDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(contributionSummaryCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                contributionSummaryCardViewStateContributionSummaryCard$lambda$47 = ContributionSummaryCard$lambda$47(snapshotState4CollectAsStateWithLifecycle2);
                if (!(contributionSummaryCardViewStateContributionSummaryCard$lambda$47 instanceof ContributionSummaryCardViewState.Loaded)) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i72 = i4 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(contributionSummaryCardDuxo3) | (i72 == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new ContributionsSummaryCard4(contributionSummaryCardDuxo3, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    contributionSummaryCardDuxo4 = contributionSummaryCardDuxo3;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                contributionSummaryCardDuxo4 = contributionSummaryCardDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionsSummaryCard2.ContributionSummaryCard$lambda$50(accountNumber, modifier4, contributionSummaryCardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void contributionSummaryCard(LazyListScope lazyListScope, final String accountNumber) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        LazyListScope.item$default(lazyListScope, SummaryCardLoggingIdentifier, null, ComposableLambda3.composableLambdaInstance(1843777062, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt.contributionSummaryCard.4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1843777062, i, -1, "com.robinhood.android.retirement.dashboard.contribution.contributionSummaryCard.<anonymous> (ContributionsSummaryCard.kt:569)");
                }
                ContributionsSummaryCard2.ContributionSummaryCard(accountNumber, null, null, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }
}
