package com.robinhood.shared.trading.tradeflow;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.Updater;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderForm.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradeflow.OrderFormKt$OrderForm$1$2, reason: use source file name */
/* loaded from: classes12.dex */
final class OrderForm3 implements Function4<AnimatedContentScope, OrderForm6, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ OrderForm6 $currentState;
    final /* synthetic */ long $foregroundColor;
    final /* synthetic */ SnapshotIntState2 $numPadHeight$delegate;
    final /* synthetic */ Function1<OrderData, Unit> $onSwipeToTrade;
    final /* synthetic */ OrderData $orderData;
    final /* synthetic */ Function2<Composer, Integer, Unit> $orderFormBottomContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $orderFormContent;
    final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $orderFormNumpad;
    final /* synthetic */ Function2<Composer, Integer, Unit> $orderFormTopBar;
    final /* synthetic */ OrderInProgressLoadingState $orderInProgressLoadingState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $orderReceiptCardContent;
    final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $orderReceiptScreenContent;
    final /* synthetic */ String $swipeTextOverride;
    final /* synthetic */ Function5<Boolean, Integer, Float, Composer, Integer, Unit> $swipeToTradeBackground;

    /* compiled from: OrderForm.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trading.tradeflow.OrderFormKt$OrderForm$1$2$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderForm6.values().length];
            try {
                iArr[OrderForm6.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderForm6.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderForm6.SUBMITTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderForm6.SUBMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderForm6.CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    OrderForm3(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, String str, OrderForm6 orderForm6, OrderData orderdata, Function1<? super OrderData, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, long j, Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function5, int i, long j2, OrderInProgressLoadingState orderInProgressLoadingState, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32, SnapshotIntState2 snapshotIntState2, Function2<? super Composer, ? super Integer, Unit> function24) {
        this.$orderFormNumpad = function3;
        this.$swipeTextOverride = str;
        this.$currentState = orderForm6;
        this.$orderData = orderdata;
        this.$onSwipeToTrade = function1;
        this.$orderFormTopBar = function2;
        this.$orderFormContent = function22;
        this.$orderFormBottomContent = function23;
        this.$foregroundColor = j;
        this.$swipeToTradeBackground = function5;
        this.$$dirty = i;
        this.$backgroundColor = j2;
        this.$orderInProgressLoadingState = orderInProgressLoadingState;
        this.$orderReceiptScreenContent = function32;
        this.$numPadHeight$delegate = snapshotIntState2;
        this.$orderReceiptCardContent = function24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$4$lambda$1$lambda$0(int i) {
        return -i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, OrderForm6 orderForm6, Composer composer, Integer num) {
        invoke(animatedContentScope, orderForm6, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, OrderForm6 animateTargetState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(animateTargetState, "animateTargetState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-428169444, i, -1, "com.robinhood.shared.trading.tradeflow.OrderForm.<anonymous>.<anonymous> (OrderForm.kt:116)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Function3<Modifier, Composer, Integer, Unit> function3 = this.$orderFormNumpad;
        String strStringResource = this.$swipeTextOverride;
        OrderForm6 orderForm6 = this.$currentState;
        OrderData orderdata = this.$orderData;
        Function1<OrderData, Unit> function1 = this.$onSwipeToTrade;
        Function2<Composer, Integer, Unit> function2 = this.$orderFormTopBar;
        Function2<Composer, Integer, Unit> function22 = this.$orderFormContent;
        Function2<Composer, Integer, Unit> function23 = this.$orderFormBottomContent;
        long j = this.$foregroundColor;
        Function5<Boolean, Integer, Float, Composer, Integer, Unit> function5 = this.$swipeToTradeBackground;
        int i2 = this.$$dirty;
        long j2 = this.$backgroundColor;
        OrderInProgressLoadingState orderInProgressLoadingState = this.$orderInProgressLoadingState;
        Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function32 = this.$orderReceiptScreenContent;
        SnapshotIntState2 snapshotIntState2 = this.$numPadHeight$delegate;
        Function2<Composer, Integer, Unit> function24 = this.$orderReceiptCardContent;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int i3 = WhenMappings.$EnumSwitchMapping$0[animateTargetState.ordinal()];
        if (i3 == 1 || i3 == 2) {
            composer.startReplaceGroup(252624186);
            int intValue = snapshotIntState2.getIntValue();
            int i4 = function3 == null ? 0 : 150;
            composer.startReplaceGroup(839472140);
            if (strStringResource == null) {
                strStringResource = StringResources_androidKt.stringResource(C20649R.string.order_review_swipe_to_submit_prompt, composer, 0);
            }
            composer.endReplaceGroup();
            OrderForm2.m26342SwipeToTradeContainerE1AOrGg(orderForm6, orderdata, function1, function2, function22, function23, j, i4, intValue, strStringResource, null, function5, composer, ((i2 >> 3) & 8) << 3, 0, 1024);
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
        } else if (i3 == 3 || i3 == 4) {
            composer.startReplaceGroup(254132243);
            OrderInProgressLoadingView2.m26346OrderInProgressLoadingViewt6yy7ic(animateTargetState == OrderForm6.SUBMITTED, WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), j2, j, orderInProgressLoadingState, composer, 0, 0);
            composer.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
        } else {
            if (i3 != 5) {
                composer.startReplaceGroup(839430648);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(254739719);
            if (function32 != null) {
                composer.startReplaceGroup(254767929);
                function32.invoke(AnimatedContent, composer, Integer.valueOf(i & 14));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(254887031);
                Alignment center = companion2.getCenter();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$OrderForm$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(OrderForm3.invoke$lambda$4$lambda$1$lambda$0(((Integer) obj).intValue()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierAnimateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, modifierFillMaxSize$default2, EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null), null, null, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAnimateEnterExit$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(companion, bentoTheme.getColors(composer, i5).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM())), bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                function24.invoke(composer, 0);
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            Unit unit3 = Unit.INSTANCE;
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
