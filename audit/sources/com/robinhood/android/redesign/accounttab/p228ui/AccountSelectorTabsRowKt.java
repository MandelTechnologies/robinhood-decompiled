package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.TabKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.p228ui.AccountSelectorTabsRowKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationConstants;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\"\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000526\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00120\r26\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00120\r2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00120\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c28\b\u0002\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\r2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00120\u0015H\u0007¢\u0006\u0004\b\"\u0010#\u001a«\u0001\u0010)\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010'\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00152%\b\u0002\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\bH\u0003¢\u0006\u0004\b,\u0010-\u001aU\u00101\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\b2$\u00100\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120/H\u0007¢\u0006\u0004\b1\u00102\u001a'\u00107\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106\u001a)\u00109\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u00108\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b9\u0010:\u001a-\u0010?\u001a\u00020\u00122\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0003¢\u0006\u0004\b=\u0010>\"\u0017\u0010@\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006N²\u0006\f\u0010G\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010;\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010I\u001a\u00020H8\nX\u008a\u0084\u0002²\u0006\u000e\u0010J\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\f\u0010M\u001a\u00020%8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "selectedTabIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "accountTabInfo", "", "accountsLoading", "hasPrivacy", "", "scrollPercentage", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "newUserExperienceStage", "showSubtitles", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "", "onTabSelected", "onTabReselected", "Lkotlin/Function1;", "tabInfo", "onTabLongPressed", "Lkotlin/Function0;", "onAccountAddClicked", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "width", "onTabWidthMeasured", "spacing", "onTabSpacingMeasured", "AccountSelectorTabsRow", "(ILkotlinx/collections/immutable/ImmutableList;ZZFLcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isSelected", "Landroidx/compose/ui/unit/Dp;", "height", "onMeasurementsConfirmed", "onWidthMeasured", "AccountTab", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;ZFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "performanceAlpha", "PerformanceRowArea", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;FLandroidx/compose/runtime/Composer;I)V", "balanceAlpha", "Lkotlin/Function4;", "content", "AnimatedBalanceAndPerformanceContent", "(FZLcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;FLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "textColor", "BalanceRow-XO-JAsU", "(ZLcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;JLandroidx/compose/runtime/Composer;I)V", "BalanceRow", "alphaWhileCollapsing", "PerformanceRow", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "elementHeight", "alpha", "AddAccountButton--orJrPs", "(FFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddAccountButton", "MIN_WIDTH_ACCOUNT_TAB", "F", "getMIN_WIDTH_ACCOUNT_TAB", "()F", "Landroidx/compose/animation/core/CubicBezierEasing;", "QuickFadeOutEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "currentSelectedTabIndex", "Lcom/robinhood/android/redesign/accounttab/ui/ScrollValues;", "scrollValues", "triggerBounceAnimationClick", "Lcom/robinhood/android/redesign/accounttab/ui/TabColors;", "colorValues", "stableWidth", "lib-account-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountSelectorTabsRowKt {
    private static final float MIN_WIDTH_ACCOUNT_TAB = C2002Dp.m7995constructorimpl(120);
    private static final CubicBezierEasing QuickFadeOutEasing = new CubicBezierEasing(0.8f, 0.0f, 1.0f, 0.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorTabsRow$lambda$14(int i, ImmutableList immutableList, boolean z, boolean z2, float f, NewUserExperienceStage newUserExperienceStage, boolean z3, Function2 function2, Function2 function22, Function1 function1, Function0 function0, Modifier modifier, LazyListState lazyListState, Function2 function23, Function1 function12, int i2, int i3, int i4, Composer composer, int i5) {
        AccountSelectorTabsRow(i, immutableList, z, z2, f, newUserExperienceStage, z3, function2, function22, function1, function0, modifier, lazyListState, function23, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTab$lambda$32(boolean z, boolean z2, Function0 function0, Function0 function02, AccountTabInfo.Account account, boolean z3, float f, Modifier modifier, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        AccountTab(z, z2, function0, function02, account, z3, f, modifier, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddAccountButton__orJrPs$lambda$61(float f, float f2, Function0 function0, int i, Composer composer, int i2) {
        m17897AddAccountButtonorJrPs(f, f2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedBalanceAndPerformanceContent$lambda$51(float f, boolean z, AccountTabInfo.Account account, float f2, Function6 function6, int i, Composer composer, int i2) {
        AnimatedBalanceAndPerformanceContent(f, z, account, f2, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceRow_XO_JAsU$lambda$58(boolean z, AccountTabInfo.Account account, long j, int i, Composer composer, int i2) {
        m17898BalanceRowXOJAsU(z, account, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceRow$lambda$60(AccountTabInfo.Account account, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PerformanceRow(account, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceRowArea$lambda$42(AccountTabInfo.Account account, float f, int i, Composer composer, int i2) {
        PerformanceRowArea(account, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountSelectorTabsRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4 */
    static final class C263794 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<TabColors> $colorValues$delegate;
        final /* synthetic */ HapticFeedback $haptics;
        final /* synthetic */ boolean $hasPrivacy;
        final /* synthetic */ Function0<Unit> $onTabLongPressed;
        final /* synthetic */ Function0<Unit> $onTabSelected;
        final /* synthetic */ RoundedCornerShape $roundedShape;
        final /* synthetic */ SnapshotState4<ScrollValues> $scrollValues$delegate;
        final /* synthetic */ boolean $showSubtitles;
        final /* synthetic */ AccountTabInfo.Account $tabInfo;
        final /* synthetic */ SnapshotState<Boolean> $triggerBounceAnimationClick$delegate;

        C263794(HapticFeedback hapticFeedback, Function0<Unit> function0, Function0<Unit> function02, RoundedCornerShape roundedCornerShape, AccountTabInfo.Account account, boolean z, SnapshotState4<ScrollValues> snapshotState4, SnapshotState<Boolean> snapshotState, SnapshotState4<TabColors> snapshotState42, boolean z2) {
            this.$haptics = hapticFeedback;
            this.$onTabLongPressed = function0;
            this.$onTabSelected = function02;
            this.$roundedShape = roundedCornerShape;
            this.$tabInfo = account;
            this.$showSubtitles = z;
            this.$scrollValues$delegate = snapshotState4;
            this.$triggerBounceAnimationClick$delegate = snapshotState;
            this.$colorValues$delegate = snapshotState42;
            this.$hasPrivacy = z2;
        }

        public final void invoke(Column5 Tab, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398939128, i, -1, "com.robinhood.android.redesign.accounttab.ui.AccountTab.<anonymous> (AccountSelectorTabsRow.kt:431)");
            }
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            HapticFeedback hapticFeedback = this.$haptics;
            Function0<Unit> function0 = this.$onTabLongPressed;
            Function0<Unit> function02 = this.$onTabSelected;
            RoundedCornerShape roundedCornerShape = this.$roundedShape;
            AccountTabInfo.Account account = this.$tabInfo;
            boolean z = this.$showSubtitles;
            final SnapshotState4<ScrollValues> snapshotState4 = this.$scrollValues$delegate;
            SnapshotState<Boolean> snapshotState = this.$triggerBounceAnimationClick$delegate;
            SnapshotState4<TabColors> snapshotState42 = this.$colorValues$delegate;
            boolean z2 = this.$hasPrivacy;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
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
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(hapticFeedback) | composer.changed(function0) | composer.changed(function02);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                Object accountSelectorTabsRowKt$AccountTab$4$1$1$1 = new AccountSelectorTabsRowKt$AccountTab$4$1$1$1(coroutineScope, hapticFeedback, function0, snapshotState, function02);
                composer.updateRememberedValue(accountSelectorTabsRowKt$AccountTab$4$1$1$1);
                objRememberedValue2 = accountSelectorTabsRowKt$AccountTab$4$1$1$1;
            }
            composer.endReplaceGroup();
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(SizeKt.m5176widthInVpY3zN4$default(SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (PointerInputEventHandler) objRememberedValue2), AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).m17915getMinTabWidthD9Ej5fM(), 0.0f, 2, null), AccountSelectorTabsRowKt.AccountTab$lambda$25(snapshotState42).m17922getBackgroundColor0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(((1 - AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPaddingProgress()) * 0.5f) + (AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPaddingProgress() * 1.0f)), AccountSelectorTabsRowKt.AccountTab$lambda$25(snapshotState42).m17923getBorderColor0d7_KjU(), roundedCornerShape), AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).m17914getHorizontalPaddingD9Ej5fM(), AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).m17916getVerticalPaddingD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String string2 = StringResources6.getText(account.getDisplayName(), composer, StringResource.$stable).toString();
            Color colorM6701boximpl = Color.m6701boximpl(AccountSelectorTabsRowKt.AccountTab$lambda$25(snapshotState42).m17924getTextColor0d7_KjU());
            FontWeight bold = FontWeight.INSTANCE.getBold();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8170);
            AccountSelectorTabsRowKt.AnimatedBalanceAndPerformanceContent(AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getBalanceAlpha(), z2, account, AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPerformanceAlpha(), ComposableLambda3.rememberComposableLambda(-108561127, true, new AccountSelectorTabsRowKt$AccountTab$4$1$2$1(z), composer, 54), composer, 24576);
            composer.endNode();
            composer.startReplaceGroup(-759062604);
            if (!account.getAccountExists() && !z) {
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(Alpha.alpha(companion2, AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPerformanceAlpha()), 0.0f, 0.0f, AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).m17914getHorizontalPaddingD9Ej5fM(), AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).m17916getVerticalPaddingD9Ej5fM(), 3, null), companion3.getBottomEnd());
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(snapshotState4);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorTabsRowKt.C263794.invoke$lambda$4$lambda$3$lambda$2(snapshotState4, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_PLUS_24), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), GraphicsLayerModifier6.graphicsLayer(modifierAlign, (Function1) objRememberedValue3), null, false, composer, BentoIcon4.Size24.$stable | 48, 48);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(((double) AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPerformanceAlpha()) < 0.95d ? 0.0f : AccountSelectorTabsRowKt.AccountTab$lambda$17(snapshotState4).getPerformanceAlpha());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AccountSelectorTabsRow$lambda$4(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AccountSelectorTabsRow$lambda$6(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollValues AccountTab$lambda$17(SnapshotState4<ScrollValues> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountTab$lambda$20(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabColors AccountTab$lambda$25(SnapshotState4<TabColors> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BalanceRow_XO_JAsU$lambda$55(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    public static final float getMIN_WIDTH_ACCOUNT_TAB() {
        return MIN_WIDTH_ACCOUNT_TAB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorTabsRow$lambda$1$lambda$0(int i, int i2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorTabsRow$lambda$3$lambda$2(int i) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorTabsRow(final int i, final ImmutableList<AccountTabInfo.Account> accountTabInfo, final boolean z, final boolean z2, final float f, NewUserExperienceStage newUserExperienceStage, final boolean z3, final Function2<? super Integer, ? super AccountTabInfo, Unit> onTabSelected, final Function2<? super Integer, ? super AccountTabInfo, Unit> onTabReselected, final Function1<? super AccountTabInfo, Unit> onTabLongPressed, final Function0<Unit> onAccountAddClicked, Modifier modifier, LazyListState lazyListState, Function2<? super Integer, ? super Integer, Unit> function2, Function1<? super Integer, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        LazyListState lazyListStateRememberLazyListState;
        Function2<? super Integer, ? super Integer, Unit> function22;
        Modifier modifier2;
        int i15;
        Function2<? super Integer, ? super Integer, Unit> function23;
        Function1<? super Integer, Unit> function12;
        Function2<? super Integer, ? super Integer, Unit> function24;
        final SnapshotState4 snapshotState4RememberUpdatedState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z4;
        final float f2;
        float fM7995constructorimpl;
        Density density;
        boolean zChanged;
        Object objRememberedValue2;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue3;
        int i16;
        Modifier modifier3;
        Modifier.Companion companion3;
        final Function2<? super Integer, ? super Integer, Unit> function25;
        int i17;
        Composer composer2;
        final NewUserExperienceStage newUserExperienceStage2;
        final Function2<? super Integer, ? super Integer, Unit> function26;
        final LazyListState lazyListState2;
        final Modifier modifier4;
        final Function1<? super Integer, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountTabInfo, "accountTabInfo");
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "newUserExperienceStage");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onTabReselected, "onTabReselected");
        Intrinsics.checkNotNullParameter(onTabLongPressed, "onTabLongPressed");
        Intrinsics.checkNotNullParameter(onAccountAddClicked, "onAccountAddClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1416037445);
        if ((i4 & 1) != 0) {
            i6 = i2 | 6;
            i5 = i;
        } else if ((i2 & 6) == 0) {
            i5 = i;
            i6 = i2 | (composerStartRestartGroup.changed(i5) ? 4 : 2);
        } else {
            i5 = i;
            i6 = i2;
        }
        if ((i4 & 2) != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(accountTabInfo) ? 32 : 16;
        }
        int i18 = i6;
        int i19 = 128;
        if ((i4 & 4) != 0) {
            i18 |= 384;
        } else if ((i2 & 384) == 0) {
            i18 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i18 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i18 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i18 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i18 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i18 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i18 |= composerStartRestartGroup.changed(newUserExperienceStage.ordinal()) ? 131072 : 65536;
            }
            if ((i4 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    i18 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                if ((i4 & 128) != 0) {
                    i18 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i18 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 8388608 : 4194304;
                }
                if ((i4 & 256) != 0) {
                    i18 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i18 |= composerStartRestartGroup.changedInstance(onTabReselected) ? 67108864 : 33554432;
                }
                if ((i4 & 512) != 0) {
                    i18 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i18 |= composerStartRestartGroup.changedInstance(onTabLongPressed) ? 536870912 : 268435456;
                }
                if ((i4 & 1024) != 0) {
                    i7 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i7 = (composerStartRestartGroup.changedInstance(onAccountAddClicked) ? 4 : 2) | i3;
                } else {
                    i7 = i3;
                }
                int i20 = i7;
                i8 = i4 & 2048;
                if (i8 != 0) {
                    i10 = i20 | 48;
                    i9 = i8;
                } else if ((i3 & 48) == 0) {
                    i9 = i8;
                    i10 = i20 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
                } else {
                    i9 = i8;
                    i10 = i20;
                }
                if ((i3 & 384) == 0) {
                    if ((i4 & 4096) == 0 && composerStartRestartGroup.changed(lazyListState)) {
                        i19 = 256;
                    }
                    i10 |= i19;
                }
                int i21 = i10;
                i11 = i4 & 8192;
                if (i11 != 0) {
                    i12 = i21 | 3072;
                } else {
                    int i22 = i21;
                    if ((i3 & 3072) == 0) {
                        i22 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                    }
                    i12 = i22;
                }
                i13 = i4 & 16384;
                if (i13 != 0) {
                    i14 = i12 | 24576;
                } else {
                    int i23 = i12;
                    if ((i3 & 24576) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    }
                    i14 = i23;
                }
                if ((i18 & 306783379) == 306783378 && (i14 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    newUserExperienceStage2 = newUserExperienceStage;
                    modifier4 = modifier;
                    lazyListState2 = lazyListState;
                    function26 = function2;
                    function13 = function1;
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier = i9 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i4 & 4096) == 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i14 &= -897;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$1$lambda$0(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function22 = (Function2) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function22 = function2;
                        }
                        if (i13 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            int i24 = i14;
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$3$lambda$2(((Integer) obj).intValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            Function1<? super Integer, Unit> function14 = (Function1) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            i15 = i24;
                            function23 = function22;
                            function12 = function14;
                        } else {
                            int i25 = i14;
                            modifier2 = modifier;
                            i15 = i25;
                            function23 = function22;
                            function12 = function1;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                function24 = function23;
                            } else {
                                function24 = function23;
                                ComposerKt.traceEventStart(1416037445, i18, i15, "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRow (AccountSelectorTabsRow.kt:108)");
                            }
                            int i26 = i18 & 14;
                            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Integer.valueOf(i5), composerStartRestartGroup, i26);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            z4 = f != 1.0f;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i27 = BentoTheme.$stable;
                            float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i27).m21595getXsmallD9Ej5fM();
                            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i27).m21593getSmallD9Ej5fM();
                            float f3 = 1 - f;
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i27).m21593getSmallD9Ej5fM() * f3) + C2002Dp.m7995constructorimpl(fM21595getXsmallD9Ej5fM * f));
                            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i27).m21592getMediumD9Ej5fM() * f3) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM * f));
                            f2 = 1.0f - f;
                            float f4 = 12;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f4) + C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f4) * f));
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(fM7995constructorimpl);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fM7995constructorimpl) | ((i15 & 57344) != 16384);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1(density, function12, fM7995constructorimpl, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(c2002DpM7993boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            companion2 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Function1<? super Integer, Unit> function15 = function12;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, fM7995constructorimpl2, 0.0f, fM7995constructorimpl3, 5, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(fM7995constructorimpl);
                            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(fM7995constructorimpl, 0.0f, 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = (i26 != 4) | ((i18 & 896) != 256) | composerStartRestartGroup.changedInstance(accountTabInfo) | composerStartRestartGroup.changed(z4) | ((i15 & 7168) != 2048) | ((3670016 & i18) != 1048576) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | ((29360128 & i18) != 8388608) | ((234881024 & i18) != 67108864) | ((1879048192 & i18) != 536870912) | ((i18 & 7168) != 2048) | ((i18 & 57344) != 16384) | composerStartRestartGroup.changed(f2) | ((i15 & 14) != 4);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                final boolean z5 = z4;
                                i16 = i15;
                                modifier3 = modifier2;
                                companion3 = companion2;
                                function25 = function24;
                                i17 = i18;
                                Function1 function16 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11(z, accountTabInfo, i, z5, function25, z3, snapshotState4RememberUpdatedState, onTabSelected, onTabReselected, onTabLongPressed, z2, f, snapshotState, f2, onAccountAddClicked, (LazyListScope) obj);
                                    }
                                };
                                composer2 = composerStartRestartGroup;
                                composer2.updateRememberedValue(function16);
                                objRememberedValue3 = function16;
                            } else {
                                function25 = function24;
                                modifier3 = modifier2;
                                i16 = i15;
                                composer2 = composerStartRestartGroup;
                                i17 = i18;
                                companion3 = companion2;
                            }
                            composer2.endReplaceGroup();
                            LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                            LazyDslKt.LazyRow(modifierM5146paddingqDBjuR0$default, lazyListState3, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composer2, (i16 >> 3) & 112, 488);
                            composer2.startReplaceGroup(1207782737);
                            if (!z || accountTabInfo.isEmpty()) {
                                newUserExperienceStage2 = newUserExperienceStage;
                            } else {
                                newUserExperienceStage2 = newUserExperienceStage;
                                NewUserExperiencePrompt.NewUserExperiencePrompt(newUserExperienceStage2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composer2, ((i17 >> 15) & 14) | 48, 0);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function26 = function25;
                            lazyListState2 = lazyListState3;
                            modifier4 = modifier3;
                            function13 = function15;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 4096) != 0) {
                            i14 &= -897;
                        }
                        lazyListStateRememberLazyListState = lazyListState;
                        function23 = function2;
                        function12 = function1;
                        i15 = i14;
                    }
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i262 = i18 & 14;
                    snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Integer.valueOf(i5), composerStartRestartGroup, i262);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (f != 1.0f) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i272 = BentoTheme.$stable;
                    float fM21595getXsmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i272).m21595getXsmallD9Ej5fM();
                    float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i272).m21593getSmallD9Ej5fM();
                    float f32 = 1 - f;
                    float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i272).m21593getSmallD9Ej5fM() * f32) + C2002Dp.m7995constructorimpl(fM21595getXsmallD9Ej5fM2 * f));
                    float fM7995constructorimpl32 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i272).m21592getMediumD9Ej5fM() * f32) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM2 * f));
                    f2 = 1.0f - f;
                    float f42 = 12;
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f42) + C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f42) * f));
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(fM7995constructorimpl);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fM7995constructorimpl) | ((i15 & 57344) != 16384);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1(density, function12, fM7995constructorimpl, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(c2002DpM7993boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        companion2 = Modifier.INSTANCE;
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Function1<? super Integer, Unit> function152 = function12;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, fM7995constructorimpl22, 0.0f, fM7995constructorimpl32, 5, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(fM7995constructorimpl);
                            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(fM7995constructorimpl, 0.0f, 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = (i262 != 4) | ((i18 & 896) != 256) | composerStartRestartGroup.changedInstance(accountTabInfo) | composerStartRestartGroup.changed(z4) | ((i15 & 7168) != 2048) | ((3670016 & i18) != 1048576) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | ((29360128 & i18) != 8388608) | ((234881024 & i18) != 67108864) | ((1879048192 & i18) != 536870912) | ((i18 & 7168) != 2048) | ((i18 & 57344) != 16384) | composerStartRestartGroup.changed(f2) | ((i15 & 14) != 4);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                final boolean z52 = z4;
                                i16 = i15;
                                modifier3 = modifier2;
                                companion3 = companion2;
                                function25 = function24;
                                i17 = i18;
                                Function1 function162 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11(z, accountTabInfo, i, z52, function25, z3, snapshotState4RememberUpdatedState, onTabSelected, onTabReselected, onTabLongPressed, z2, f, snapshotState, f2, onAccountAddClicked, (LazyListScope) obj);
                                    }
                                };
                                composer2 = composerStartRestartGroup;
                                composer2.updateRememberedValue(function162);
                                objRememberedValue3 = function162;
                                composer2.endReplaceGroup();
                                LazyListState lazyListState32 = lazyListStateRememberLazyListState;
                                LazyDslKt.LazyRow(modifierM5146paddingqDBjuR0$default2, lazyListState32, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue3, composer2, (i16 >> 3) & 112, 488);
                                composer2.startReplaceGroup(1207782737);
                                if (z) {
                                    newUserExperienceStage2 = newUserExperienceStage;
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function26 = function25;
                                    lazyListState2 = lazyListState32;
                                    modifier4 = modifier3;
                                    function13 = function152;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$14(i, accountTabInfo, z, z2, f, newUserExperienceStage2, z3, onTabSelected, onTabReselected, onTabLongPressed, onAccountAddClicked, modifier4, lazyListState2, function26, function13, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i18 |= 1572864;
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            int i202 = i7;
            i8 = i4 & 2048;
            if (i8 != 0) {
            }
            if ((i3 & 384) == 0) {
            }
            int i212 = i10;
            i11 = i4 & 8192;
            if (i11 != 0) {
            }
            i13 = i4 & 16384;
            if (i13 != 0) {
            }
            if ((i18 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    modifier = i9 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i4 & 4096) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        int i2022 = i7;
        i8 = i4 & 2048;
        if (i8 != 0) {
        }
        if ((i3 & 384) == 0) {
        }
        int i2122 = i10;
        i11 = i4 & 8192;
        if (i11 != 0) {
        }
        i13 = i4 & 16384;
        if (i13 != 0) {
        }
        if ((i18 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorTabsRow$lambda$7(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11(boolean z, final ImmutableList immutableList, int i, boolean z2, Function2 function2, boolean z3, SnapshotState4 snapshotState4, Function2 function22, Function2 function23, Function1 function1, boolean z4, float f, final SnapshotState snapshotState, final float f2, final Function0 function0, LazyListScope LazyRow) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        if (z) {
            LazyListScope.items$default(LazyRow, 5, null, null, ComposableSingletons$AccountSelectorTabsRowKt.INSTANCE.getLambda$227779924$lib_account_tab_externalDebug(), 6, null);
            lazyListScope = LazyRow;
        } else {
            lazyListScope = LazyRow;
            lazyListScope.items(immutableList.size(), new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11$lambda$9(immutableList, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11$lambda$10(immutableList, ((Integer) obj).intValue());
                }
            }, ComposableLambda3.composableLambdaInstance(1470185835, true, new AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3(immutableList, i, z2, function2, z3, snapshotState4, function22, function23, function1, z4, f, snapshotState)));
        }
        if (!z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1797707098, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i2 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1797707098, i2, -1, "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:250)");
                    }
                    AccountSelectorTabsRowKt.m17897AddAccountButtonorJrPs(AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$6(snapshotState), f2, function0, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyRow, null, null, ComposableSingletons$AccountSelectorTabsRowKt.INSTANCE.m17903getLambda$883502792$lib_account_tab_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11$lambda$9(ImmutableList immutableList, int i) {
        return ((AccountTabInfo.Account) immutableList.get(i)).getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountSelectorTabsRow$lambda$13$lambda$12$lambda$11$lambda$10(ImmutableList immutableList, int i) {
        if (i == immutableList.size()) {
            return "account-tab-add-btn";
        }
        return "account-tab-item";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTab(final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final AccountTabInfo.Account account, final boolean z3, final float f, Modifier modifier, Function1<? super C2002Dp, Unit> function1, Function1<? super Integer, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Function1<? super C2002Dp, Unit> function13;
        int i6;
        int i7;
        final Function1<? super C2002Dp, Unit> function14;
        final Function1<? super Integer, Unit> function15;
        Density density;
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4;
        final float fM21593getSmallD9Ej5fM;
        final float fM21590getDefaultD9Ej5fM;
        boolean z4;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4;
        Object objRememberedValue2;
        Composer.Companion companion;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Animatable animatable;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final long jM21372getBg20d7_KjU;
        final long jM21371getBg0d7_KjU;
        final long jM21426getFg20d7_KjU;
        final long jM21427getFg30d7_KjU;
        final long jM21425getFg0d7_KjU;
        final long jM21426getFg20d7_KjU2;
        boolean zChanged;
        final Density density2;
        RoundedCornerShape roundedCornerShape;
        int i8;
        Object objDerivedStateOf;
        boolean zChanged2;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Composer composer2;
        final Function1<? super C2002Dp, Unit> function16;
        final Function1<? super Integer, Unit> function17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1633034891);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(account) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        i4 = i2 & 128;
                        if (i4 != 0) {
                            i3 |= 12582912;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                            }
                        }
                        i5 = i2 & 256;
                        if (i5 != 0) {
                            i3 |= 100663296;
                            function13 = function1;
                        } else {
                            function13 = function1;
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
                            }
                        }
                        i6 = i2 & 512;
                        if (i6 == 0) {
                            if ((i & 805306368) == 0) {
                                i7 = i6;
                                i3 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                function14 = i5 == 0 ? null : function13;
                                function15 = i7 == 0 ? null : function12;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1633034891, i3, -1, "com.robinhood.android.redesign.accounttab.ui.AccountTab (AccountSelectorTabsRow.kt:292)");
                                }
                                HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = i3;
                                int i10 = BentoTheme.$stable;
                                fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM();
                                fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                z4 = (i9 & 3670016) != 1048576;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AccountSelectorTabsRowKt.AccountTab$lambda$16$lambda$15(f, fM21593getSmallD9Ej5fM, fM21590getDefaultD9Ej5fM);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                snapshotState4 = (SnapshotState4) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 != companion.getEmpty()) {
                                    snapshotMutationPolicy = null;
                                    objRememberedValue2 = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    snapshotMutationPolicy = null;
                                }
                                animatable = (Animatable) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                snapshotState = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                Boolean boolValueOf = Boolean.valueOf(AccountTab$lambda$20(snapshotState));
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new AccountSelectorTabsRowKt$AccountTab$1$1(animatable, snapshotState, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21372getBg20d7_KjU();
                                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU();
                                jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU();
                                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21427getFg30d7_KjU();
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU();
                                jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU();
                                boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i10).getIsDay();
                                float backgroundAlpha = AccountTab$lambda$17(snapshotState4).getBackgroundAlpha();
                                float borderAlpha = AccountTab$lambda$17(snapshotState4).getBorderAlpha();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged = composerStartRestartGroup.changed(isDay) | ((i9 & 112) != 32) | composerStartRestartGroup.changed(backgroundAlpha) | composerStartRestartGroup.changed(borderAlpha);
                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                                    density2 = density;
                                    roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                                    i8 = 67108864;
                                    Function0 function03 = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AccountSelectorTabsRowKt.AccountTab$lambda$24$lambda$23(z2, jM21372getBg20d7_KjU, jM21371getBg0d7_KjU, jM21426getFg20d7_KjU, jM21427getFg30d7_KjU, jM21425getFg0d7_KjU, jM21426getFg20d7_KjU2, snapshotState4);
                                        }
                                    };
                                    snapshotState4 = snapshotState4;
                                    objDerivedStateOf = SnapshotStateKt.derivedStateOf(function03);
                                    composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                                } else {
                                    objDerivedStateOf = objRememberedValue7;
                                    density2 = density;
                                    roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                                    i8 = 67108864;
                                }
                                SnapshotState4 snapshotState42 = (SnapshotState4) objDerivedStateOf;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierClip = Clip.clip(Scale2.scale(modifier2, ((Number) animatable.getValue()).floatValue()), roundedCornerShape);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged2 = ((i9 & 234881024) != i8) | ((i9 & 1879048192) != 536870912) | composerStartRestartGroup.changed(density2);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AccountSelectorTabsRowKt.AccountTab$lambda$29$lambda$28(function15, function14, density2, (LayoutCoordinates) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierClip, (Function1) objRememberedValue5);
                                long jM17922getBackgroundColor0d7_KjU = AccountTab$lambda$25(snapshotState42).m17922getBackgroundColor0d7_KjU();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                TabKt.m5981TabbogVsAg(z2, (Function0) objRememberedValue6, modifierOnGloballyPositioned, true, jM17922getBackgroundColor0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(1398939128, true, new C263794(hapticFeedback, function02, function0, roundedCornerShape, account, z, snapshotState4, snapshotState, snapshotState42, z3), composerStartRestartGroup, 54), composer2, ((i9 >> 3) & 14) | 12586032, 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function16 = function14;
                                function17 = function15;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function17 = function12;
                                composer2 = composerStartRestartGroup;
                                function16 = function13;
                            }
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AccountSelectorTabsRowKt.AccountTab$lambda$32(z, z2, function0, function02, account, z3, f, modifier3, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        i7 = i6;
                        if ((i3 & 306783379) == 306783378) {
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i92 = i3;
                            int i102 = BentoTheme.$stable;
                            fM21593getSmallD9Ej5fM = bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21593getSmallD9Ej5fM();
                            fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((i92 & 3670016) != 1048576) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountSelectorTabsRowKt.AccountTab$lambda$16$lambda$15(f, fM21593getSmallD9Ej5fM, fM21590getDefaultD9Ej5fM);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                snapshotState4 = (SnapshotState4) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 != companion.getEmpty()) {
                                }
                                animatable = (Animatable) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                Boolean boolValueOf2 = Boolean.valueOf(AccountTab$lambda$20(snapshotState));
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue4 = new AccountSelectorTabsRowKt$AccountTab$1$1(animatable, snapshotState, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                    jM21372getBg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i102).m21372getBg20d7_KjU();
                                    jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU();
                                    jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i102).m21426getFg20d7_KjU();
                                    jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i102).m21427getFg30d7_KjU();
                                    jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i102).m21425getFg0d7_KjU();
                                    jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i102).m21426getFg20d7_KjU();
                                    boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i102).getIsDay();
                                    float backgroundAlpha2 = AccountTab$lambda$17(snapshotState4).getBackgroundAlpha();
                                    float borderAlpha2 = AccountTab$lambda$17(snapshotState4).getBorderAlpha();
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged = composerStartRestartGroup.changed(isDay2) | ((i92 & 112) != 32) | composerStartRestartGroup.changed(backgroundAlpha2) | composerStartRestartGroup.changed(borderAlpha2);
                                    Object objRememberedValue72 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        density2 = density;
                                        roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                                        i8 = 67108864;
                                        Function0 function032 = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AccountSelectorTabsRowKt.AccountTab$lambda$24$lambda$23(z2, jM21372getBg20d7_KjU, jM21371getBg0d7_KjU, jM21426getFg20d7_KjU, jM21427getFg30d7_KjU, jM21425getFg0d7_KjU, jM21426getFg20d7_KjU2, snapshotState4);
                                            }
                                        };
                                        snapshotState4 = snapshotState4;
                                        objDerivedStateOf = SnapshotStateKt.derivedStateOf(function032);
                                        composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                                        SnapshotState4 snapshotState422 = (SnapshotState4) objDerivedStateOf;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierClip2 = Clip.clip(Scale2.scale(modifier2, ((Number) animatable.getValue()).floatValue()), roundedCornerShape);
                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                        if ((i92 & 1879048192) != 536870912) {
                                        }
                                        zChanged2 = ((i92 & 234881024) != i8) | ((i92 & 1879048192) != 536870912) | composerStartRestartGroup.changed(density2);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged2) {
                                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda11
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AccountSelectorTabsRowKt.AccountTab$lambda$29$lambda$28(function15, function14, density2, (LayoutCoordinates) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierClip2, (Function1) objRememberedValue5);
                                            long jM17922getBackgroundColor0d7_KjU2 = AccountTab$lambda$25(snapshotState422).m17922getBackgroundColor0d7_KjU();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue6 == companion.getEmpty()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composer2 = composerStartRestartGroup;
                                            TabKt.m5981TabbogVsAg(z2, (Function0) objRememberedValue6, modifierOnGloballyPositioned2, true, jM17922getBackgroundColor0d7_KjU2, 0L, null, ComposableLambda3.rememberComposableLambda(1398939128, true, new C263794(hapticFeedback2, function02, function0, roundedCornerShape, account, z, snapshotState4, snapshotState, snapshotState422, z3), composerStartRestartGroup, 54), composer2, ((i92 >> 3) & 14) | 12586032, 96);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function16 = function14;
                                            function17 = function15;
                                        }
                                    }
                                }
                            }
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 64) != 0) {
                    }
                    i4 = i2 & 128;
                    if (i4 != 0) {
                    }
                    i5 = i2 & 256;
                    if (i5 != 0) {
                    }
                    i6 = i2 & 512;
                    if (i6 == 0) {
                    }
                    i7 = i6;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                i4 = i2 & 128;
                if (i4 != 0) {
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                }
                i6 = i2 & 512;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i3 & 306783379) == 306783378) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i4 = i2 & 128;
            if (i4 != 0) {
            }
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            i6 = i2 & 512;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i3 & 306783379) == 306783378) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i3 & 306783379) == 306783378) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollValues AccountTab$lambda$16$lambda$15(float f, float f2, float f3) {
        float fCoerceIn = RangesKt.coerceIn((f - 0.9f) / 0.100000024f, 0.0f, 1.0f);
        float f4 = 1 - f;
        float f5 = 0;
        float f6 = (0.8f - f) / 0.8f;
        return new ScrollValues(RangesKt.coerceIn(f6, 0.0f, 1.0f), RangesKt.coerceIn(f6, 0.0f, 1.0f), fCoerceIn, ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2 * RangesKt.coerceAtLeast(f4, 0.0f))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f5)))).getValue(), ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f3 * RangesKt.coerceAtLeast(f4, 0.0f))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f5)))).getValue(), RangesKt.coerceIn(f4, 0.0f, 1.0f), RangesKt.coerceIn(f4, 0.0f, 1.0f), C2002Dp.m7995constructorimpl(MIN_WIDTH_ACCOUNT_TAB * f4), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountTab$lambda$21(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabColors AccountTab$lambda$24$lambda$23(boolean z, long j, long j2, long j3, long j4, long j5, long j6, SnapshotState4 snapshotState4) {
        long jM6705copywmQWz5c$default;
        long jM6705copywmQWz5c$default2;
        if (z) {
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j, AccountTab$lambda$17(snapshotState4).getBackgroundAlpha(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j2, AccountTab$lambda$17(snapshotState4).getBackgroundAlpha(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (z) {
            jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(j3, AccountTab$lambda$17(snapshotState4).getBorderAlpha(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(j4, AccountTab$lambda$17(snapshotState4).getBorderAlpha(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        return new TabColors(jM6705copywmQWz5c$default, jM6705copywmQWz5c$default2, z ? j5 : j6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTab$lambda$29$lambda$28(Function1 function1, Function1 function12, Density density, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        if (function1 != null) {
            function1.invoke(Integer.valueOf((int) (layoutCoordinates.mo7241getSizeYbymL2g() >> 32)));
        }
        if (function12 != null) {
            float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L));
            if (C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl(0)) > 0) {
                function12.invoke(C2002Dp.m7993boximpl(fMo5013toDpu2uoSUM));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PerformanceRowArea(final AccountTabInfo.Account account, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1897451223);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(account) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897451223, i2, -1, "com.robinhood.android.redesign.accounttab.ui.PerformanceRowArea (AccountSelectorTabsRow.kt:529)");
            }
            final float fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(account) | composerStartRestartGroup.changed(fM21592getMediumD9Ej5fM);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorTabsRowKt.PerformanceRowArea$lambda$41$lambda$40(account, fM21592getMediumD9Ej5fM, f, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorTabsRowKt.PerformanceRowArea$lambda$42(account, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult PerformanceRowArea$lambda$41$lambda$40(final AccountTabInfo.Account account, float f, final float f2, final SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose("performanceRow", ComposableLambda3.composableLambdaInstance(-939195498, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$PerformanceRowArea$1$1$measurementContent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939195498, i, -1, "com.robinhood.android.redesign.accounttab.ui.PerformanceRowArea.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:541)");
                }
                AccountSelectorTabsRowKt.PerformanceRow(AccountTabInfo.Account.copy$default(account, null, null, null, null, null, null, null, null, new BigDecimal(DeviceAttestationConstants.DEVICE_ATTEST_VERSION), true, false, null, false, 7423, null), 1.0f, null, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ComposableSingletons$AccountSelectorTabsRowKt composableSingletons$AccountSelectorTabsRowKt = ComposableSingletons$AccountSelectorTabsRowKt.INSTANCE;
        List listFlatten = CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{listSubcompose, SubcomposeLayout.subcompose("iconContent", composableSingletons$AccountSelectorTabsRowKt.getLambda$940331125$lib_account_tab_externalDebug()), SubcomposeLayout.subcompose("spacerContent", composableSingletons$AccountSelectorTabsRowKt.m17902getLambda$1475109548$lib_account_tab_externalDebug())}));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten, 10));
        Iterator it = listFlatten.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        if (it2.hasNext()) {
            numValueOf = Integer.valueOf(((Placeable) it2.next()).getHeight());
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((Placeable) it2.next()).getHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iMax = Math.max(numValueOf != null ? numValueOf.intValue() : 0, SubcomposeLayout.mo5010roundToPx0680j_4(f));
        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose("actual", ComposableLambda3.composableLambdaInstance(229990771, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$PerformanceRowArea$1$1$actualContent$1
            public final void invoke(Composer composer, int i) {
                Composer composer2;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(229990771, i, -1, "com.robinhood.android.redesign.accounttab.ui.PerformanceRowArea.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:571)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SubcomposeLayout.mo5013toDpu2uoSUM(iMax));
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                AccountTabInfo.Account account2 = account;
                float f3 = f2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5156height3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (account2.getAccountExists()) {
                    composer.startReplaceGroup(-1458132892);
                    composer2 = composer;
                    AccountSelectorTabsRowKt.PerformanceRow(account2, f3, null, composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer;
                    if (account2.getPendingApplication() == null) {
                        composer2.startReplaceGroup(-1458006288);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1457900144);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                invoke(composer, num2.intValue());
                return Unit.INSTANCE;
            }
        }));
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose2, 10));
        Iterator<T> it3 = listSubcompose2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Measurable) it3.next()).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, 0, iMax, iMax, 3, null)));
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            Integer numValueOf3 = Integer.valueOf(((Placeable) it4.next()).getWidth());
            loop2: while (true) {
                num = numValueOf3;
                while (it4.hasNext()) {
                    numValueOf3 = Integer.valueOf(((Placeable) it4.next()).getWidth());
                    if (num.compareTo(numValueOf3) < 0) {
                        break;
                    }
                }
            }
        }
        return MeasureScope.layout$default(SubcomposeLayout, num != null ? num.intValue() : Constraints.m7975getMaxWidthimpl(constraints.getValue()), iMax, null, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectorTabsRowKt.PerformanceRowArea$lambda$41$lambda$40$lambda$39(arrayList2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceRowArea$lambda$41$lambda$40$lambda$39(List list, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AnimatedBalanceAndPerformanceContent(final float f, final boolean z, final AccountTabInfo.Account tabInfo, final float f2, final Function6<? super Float, ? super Boolean, ? super AccountTabInfo.Account, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        float f3;
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1936835480);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tabInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f3 = f2;
            i2 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1936835480, i2, -1, "com.robinhood.android.redesign.accounttab.ui.AnimatedBalanceAndPerformanceContent (AccountSelectorTabsRow.kt:607)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((57344 & i2) == 16384) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(tabInfo) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final float f4 = f3;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorTabsRowKt.AnimatedBalanceAndPerformanceContent$lambda$50$lambda$49(f, content, z, tabInfo, f4, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function2);
                objRememberedValue = function2;
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorTabsRowKt.AnimatedBalanceAndPerformanceContent$lambda$51(f, z, tabInfo, f2, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult AnimatedBalanceAndPerformanceContent$lambda$50$lambda$49(final float f, final Function6 function6, final boolean z, final AccountTabInfo.Account account, final float f2, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose("expanded", ComposableLambda3.composableLambdaInstance(611261658, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AnimatedBalanceAndPerformanceContent$1$1$expandedPlaceables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                Float fValueOf = Float.valueOf(1.0f);
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(611261658, i, -1, "com.robinhood.android.redesign.accounttab.ui.AnimatedBalanceAndPerformanceContent.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:611)");
                }
                function6.invoke(fValueOf, Boolean.valueOf(z), account, fValueOf, composer, 3078);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        Iterator it2 = arrayList.iterator();
        Integer numValueOf2 = null;
        if (it2.hasNext()) {
            numValueOf = Integer.valueOf(((Placeable) it2.next()).getHeight());
            while (it2.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((Placeable) it2.next()).getHeight());
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            numValueOf2 = Integer.valueOf(((Placeable) it3.next()).getWidth());
            while (it3.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((Placeable) it3.next()).getWidth());
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        }
        int i = (int) (iIntValue * f);
        int iIntValue2 = (int) ((numValueOf2 != null ? numValueOf2.intValue() : 0) * f);
        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose("animated", ComposableLambda3.composableLambdaInstance(-1697909200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AnimatedBalanceAndPerformanceContent$1$1$animatedPlaceables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1697909200, i2, -1, "com.robinhood.android.redesign.accounttab.ui.AnimatedBalanceAndPerformanceContent.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:623)");
                }
                function6.invoke(Float.valueOf(f), Boolean.valueOf(z), account, Float.valueOf(f2), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose2, 10));
        Iterator<T> it4 = listSubcompose2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((Measurable) it4.next()).mo7239measureBRTryo0(Constraints.m7966copyZbe2FdA(constraints.getValue(), 0, iIntValue2, 0, i)));
        }
        return MeasureScope.layout$default(SubcomposeLayout, iIntValue2, i, null, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectorTabsRowKt.m2412xcc659b36(arrayList2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AnimatedBalanceAndPerformanceContent$lambda$50$lambda$49$lambda$48 */
    public static final Unit m2412xcc659b36(List list, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BalanceRow-XO-JAsU, reason: not valid java name */
    public static final void m17898BalanceRowXOJAsU(final boolean z, final AccountTabInfo.Account account, final long j, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2085451059);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(account) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2085451059, i2, -1, "com.robinhood.android.redesign.accounttab.ui.BalanceRow (AccountSelectorTabsRow.kt:650)");
            }
            BigDecimal balance = account.getBalance();
            String orDefault$default = Money3.formatOrDefault$default(balance != null ? Money3.toMoney$default(balance, null, 1, null) : null, null, null, 3, null);
            String str = z ? "****" : orDefault$default;
            final int length = orDefault$default.length();
            final TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final TextStyle textL = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextL();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = composerStartRestartGroup.changed(length) | composerStartRestartGroup.changed(textMeasurerRememberTextMeasurer) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(textL);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelectorTabsRowKt.BalanceRow_XO_JAsU$lambda$54$lambda$53(length, textMeasurerRememberTextMeasurer, textL, density);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorTabsRowKt.BalanceRow_XO_JAsU$lambda$57$lambda$56((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(str, null, (Function1) objRememberedValue2, null, "balance", null, ComposableLambda3.rememberComposableLambda(957083639, true, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$BalanceRow$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, str2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, String it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(957083639, i3, -1, "com.robinhood.android.redesign.accounttab.ui.BalanceRow.<anonymous> (AccountSelectorTabsRow.kt:683)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion, AccountSelectorTabsRowKt.BalanceRow_XO_JAsU$lambda$55(snapshotState4), 0.0f, 2, null);
                    AccountTabInfo.Account account2 = account;
                    long j2 = j;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5176widthInVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(it, Alpha.alpha(companion, account2.getAccountExists() ? 1.0f : 0.0f), Color.m6701boximpl(j2), null, null, null, null, 0, false, 1, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextL(), composer2, ((i3 >> 3) & 14) | 805306368, 0, 7672);
                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorTabsRowKt.BalanceRow_XO_JAsU$lambda$58(z, account, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp BalanceRow_XO_JAsU$lambda$54$lambda$53(int i, TextMeasurer textMeasurer, TextStyle textStyle, Density density) {
        return C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, StringsKt.repeat("8", i), textStyle, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform BalanceRow_XO_JAsU$lambda$57$lambda$56(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, Easing3.getFastOutSlowInEasing(), 2, null);
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(tweenSpecTween$default, 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(tweenSpecTween$default, 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PerformanceRow(AccountTabInfo.Account account, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        final AccountTabInfo.Account account2;
        int i3;
        float f2;
        int i4;
        Modifier modifier2;
        boolean isUp;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21452getNegative0d7_KjU;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        String percentChange;
        long jM21452getNegative0d7_KjU2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-639149733);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            account2 = account;
        } else if ((i & 6) == 0) {
            account2 = account;
            i3 = (composerStartRestartGroup.changedInstance(account2) ? 4 : 2) | i;
        } else {
            account2 = account;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-639149733, i3, -1, "com.robinhood.android.redesign.accounttab.ui.PerformanceRow (AccountSelectorTabsRow.kt:702)");
                    }
                    isUp = account2.getIsUp();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
                    Modifier modifierAlpha = Alpha.alpha(companion2, !account2.getShowPercentageChange() ? f2 : 0.0f);
                    if (!isUp) {
                        composerStartRestartGroup.startReplaceGroup(1050465009);
                        jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1050528497);
                        jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (!isUp) {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_12;
                    } else {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_12;
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(serverToBentoAssetMapper2), null, jM21452getNegative0d7_KjU, modifierAlpha, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    percentChange = account2.getPercentChange();
                    if (percentChange == null) {
                        percentChange = "";
                    }
                    Modifier modifierAlpha2 = Alpha.alpha(companion2, !account2.getShowPercentageChange() ? f2 : 0.0f);
                    if (!isUp) {
                        composerStartRestartGroup.startReplaceGroup(1051157425);
                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1051220913);
                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    String str = percentChange;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str, modifierAlpha2, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, bold, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textS, composerStartRestartGroup, 817913856, 0, 7528);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorTabsRowKt.PerformanceRow$lambda$60(account2, f, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                isUp = account2.getIsUp();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, 3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, centerVertically2, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default2);
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
                    Modifier modifierAlpha3 = Alpha.alpha(companion22, !account2.getShowPercentageChange() ? f2 : 0.0f);
                    if (!isUp) {
                    }
                    if (!isUp) {
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(serverToBentoAssetMapper2), null, jM21452getNegative0d7_KjU, modifierAlpha3, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    percentChange = account2.getPercentChange();
                    if (percentChange == null) {
                    }
                    Modifier modifierAlpha22 = Alpha.alpha(companion22, !account2.getShowPercentageChange() ? f2 : 0.0f);
                    if (!isUp) {
                    }
                    int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                    FontWeight bold2 = FontWeight.INSTANCE.getBold();
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    String str2 = percentChange;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, modifierAlpha22, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, bold2, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textS2, composerStartRestartGroup, 817913856, 0, 7528);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AddAccountButton--orJrPs, reason: not valid java name */
    public static final void m17897AddAccountButtonorJrPs(final float f, final float f2, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(245633869);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(245633869, i2, -1, "com.robinhood.android.redesign.accounttab.ui.AddAccountButton (AccountSelectorTabsRow.kt:754)");
            }
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            float fTransform = QuickFadeOutEasing.transform(f2);
            function02 = function0;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1318064546, true, new AccountSelectorTabsRowKt$AddAccountButton$1(C2002Dp.m7995constructorimpl(f * fTransform), fTransform, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(12) * fTransform), hapticFeedback, function02), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorTabsRowKt.AddAccountButton__orJrPs$lambda$61(f, f2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
