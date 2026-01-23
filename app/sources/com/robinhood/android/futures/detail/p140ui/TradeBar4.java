package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.TradeBar4;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.utils.LoggingUtils5;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeBar.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0087\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"TRADE_LADDER_BUTTON_TOOLTIP_OFFSET", "", "TradeBar", "", "expanded", "", "tradeBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "isTradeBarInteractive", "onExpanded", "Lkotlin/Function1;", "navigateToOnboarding", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "onTradeLadderClicked", "Lkotlin/Function0;", "onTradeOrderFormClicked", "onTradeLadderTooltipClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TradeBarOverviewContent", "overviewContent", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewTradeBarOverviewContent_MarginRequired", "(Landroidx/compose/runtime/Composer;I)V", "PreviewTradeBarOverviewContent_RhsAccountLabel", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.TradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradeBar4 {
    private static final float TRADE_LADDER_BUTTON_TOOLTIP_OFFSET = -50.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTradeBarOverviewContent_MarginRequired$lambda$5(int i, Composer composer, int i2) {
        PreviewTradeBarOverviewContent_MarginRequired(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTradeBarOverviewContent_RhsAccountLabel$lambda$6(int i, Composer composer, int i2) {
        PreviewTradeBarOverviewContent_RhsAccountLabel(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeBar$lambda$0(boolean z, FuturesDetailViewState.TradeBarData tradeBarData, boolean z2, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeBar(z, tradeBarData, z2, function1, function12, function0, function13, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeBarOverviewContent$lambda$4(FuturesDetailViewState.TradeBarData.TradeBarOverviewContent tradeBarOverviewContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeBarOverviewContent(tradeBarOverviewContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeBar(final boolean z, final FuturesDetailViewState.TradeBarData tradeBarData, final boolean z2, final Function1<? super Boolean, Unit> onExpanded, final Function1<? super FuturesOrderSide, Unit> navigateToOnboarding, final Function0<Unit> onTradeLadderClicked, final Function1<? super FuturesOrderSide, Unit> onTradeOrderFormClicked, final Function0<Unit> onTradeLadderTooltipClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tradeBarData, "tradeBarData");
        Intrinsics.checkNotNullParameter(onExpanded, "onExpanded");
        Intrinsics.checkNotNullParameter(navigateToOnboarding, "navigateToOnboarding");
        Intrinsics.checkNotNullParameter(onTradeLadderClicked, "onTradeLadderClicked");
        Intrinsics.checkNotNullParameter(onTradeOrderFormClicked, "onTradeOrderFormClicked");
        Intrinsics.checkNotNullParameter(onTradeLadderTooltipClicked, "onTradeLadderTooltipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416216502);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(tradeBarData) : composerStartRestartGroup.changedInstance(tradeBarData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onExpanded) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(navigateToOnboarding) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTradeLadderClicked) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTradeOrderFormClicked) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTradeLadderTooltipClicked) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
                if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1416216502, i3, -1, "com.robinhood.android.futures.detail.ui.TradeBar (TradeBar.kt:68)");
                    }
                    boolean z5 = z3;
                    Modifier modifier4 = modifier2;
                    AutoLoggingCompositionLocals.EventLoggable(LoggingUtils5.tradeBarEventDescriptor(tradeBarData, composerStartRestartGroup, (i3 >> 3) & 14), ComposableLambda3.rememberComposableLambda(-193923201, true, new C170801(modifier4, z5, tradeBarData, z4, onExpanded, onTradeLadderTooltipClicked, onTradeLadderClicked, navigateToOnboarding, onTradeOrderFormClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TradeBar4.TradeBar$lambda$0(z, tradeBarData, z2, onExpanded, navigateToOnboarding, onTradeLadderClicked, onTradeOrderFormClicked, onTradeLadderTooltipClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 100663296;
            modifier2 = modifier;
            if ((38347923 & i3) != 38347922) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                boolean z52 = z3;
                Modifier modifier42 = modifier2;
                AutoLoggingCompositionLocals.EventLoggable(LoggingUtils5.tradeBarEventDescriptor(tradeBarData, composerStartRestartGroup, (i3 >> 3) & 14), ComposableLambda3.rememberComposableLambda(-193923201, true, new C170801(modifier42, z52, tradeBarData, z4, onExpanded, onTradeLadderTooltipClicked, onTradeLadderClicked, navigateToOnboarding, onTradeOrderFormClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TradeBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1 */
    static final class C170801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ boolean $isTradeBarInteractive;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<FuturesOrderSide, Unit> $navigateToOnboarding;
        final /* synthetic */ Function1<Boolean, Unit> $onExpanded;
        final /* synthetic */ Function0<Unit> $onTradeLadderClicked;
        final /* synthetic */ Function0<Unit> $onTradeLadderTooltipClicked;
        final /* synthetic */ Function1<FuturesOrderSide, Unit> $onTradeOrderFormClicked;
        final /* synthetic */ FuturesDetailViewState.TradeBarData $tradeBarData;

        /* JADX WARN: Multi-variable type inference failed */
        C170801(Modifier modifier, boolean z, FuturesDetailViewState.TradeBarData tradeBarData, boolean z2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super FuturesOrderSide, Unit> function12, Function1<? super FuturesOrderSide, Unit> function13) {
            this.$modifier = modifier;
            this.$expanded = z;
            this.$tradeBarData = tradeBarData;
            this.$isTradeBarInteractive = z2;
            this.$onExpanded = function1;
            this.$onTradeLadderTooltipClicked = function0;
            this.$onTradeLadderClicked = function02;
            this.$navigateToOnboarding = function12;
            this.$onTradeOrderFormClicked = function13;
        }

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
                ComposerKt.traceEventStart(-193923201, i, -1, "com.robinhood.android.futures.detail.ui.TradeBar.<anonymous> (TradeBar.kt:72)");
            }
            composer.startReplaceGroup(-1676599275);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            if (!this.$expanded) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                modifierFillMaxWidth$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 6, null);
            }
            composer.endReplaceGroup();
            FuturesDetailViewState.TradeBarData tradeBarData = this.$tradeBarData;
            boolean z = this.$isTradeBarInteractive;
            boolean z2 = this.$expanded;
            Function1<Boolean, Unit> function1 = this.$onExpanded;
            Function0<Unit> function0 = this.$onTradeLadderTooltipClicked;
            Function0<Unit> function02 = this.$onTradeLadderClicked;
            Function1<FuturesOrderSide, Unit> function12 = this.$navigateToOnboarding;
            Function1<FuturesOrderSide, Unit> function13 = this.$onTradeOrderFormClicked;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
            FuturesDetailViewState.TradeBarData.TradeBarOverviewContent tradeBarOverviewContent = tradeBarData.getTradeBarOverviewContent();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            TradeBar4.TradeBarOverviewContent(tradeBarOverviewContent, boxScopeInstance.align(companion3, companion.getBottomCenter()), composer, 0, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            float f = 0;
            Spacer2.Spacer(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composer, 0);
            Alignment bottomCenter = companion.getBottomCenter();
            Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null);
            Boolean boolValueOf = Boolean.valueOf(z2);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeBar4.C170801.invoke$lambda$8$lambda$5$lambda$4$lambda$3((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, modifierWeight$default, (Function1) objRememberedValue2, bottomCenter, "expandingTradeButton", null, ComposableLambda3.rememberComposableLambda(2041910060, true, new TradeBar5(tradeBarData, function1, function0, function02, function12, function13), composer, 54), composer, 1600896, 32);
            composer.endNode();
            composer.startReplaceGroup(-1754407166);
            if (!z) {
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion3);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierMatchParentSize, false, null, null, (Function0) objRememberedValue3, 6, null), composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final ContentTransform invoke$lambda$8$lambda$5$lambda$4$lambda$3(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return new ContentTransform(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone(), (((Boolean) AnimatedContent.getInitialState()).booleanValue() || !((Boolean) AnimatedContent.getTargetState()).booleanValue()) ? 1.0f : 0.0f, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeBarOverviewContent(final FuturesDetailViewState.TradeBarData.TradeBarOverviewContent tradeBarOverviewContent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534751935);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(tradeBarOverviewContent) : composerStartRestartGroup.changedInstance(tradeBarOverviewContent) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534751935, i3, -1, "com.robinhood.android.futures.detail.ui.TradeBarOverviewContent (TradeBar.kt:276)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary().m21717getMinHeightD9Ej5fM(), 0.0f, 2, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5158heightInVpY3zN4$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (tradeBarOverviewContent instanceof FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired) {
                    modifier3 = modifier4;
                    if (!(tradeBarOverviewContent instanceof FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.RhsAccountLabel)) {
                        composerStartRestartGroup.startReplaceGroup(-1568518544);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1378710322);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion3);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMatchParentSize);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.RhsAccountLabel rhsAccountLabel = (FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.RhsAccountLabel) tradeBarOverviewContent;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(rhsAccountLabel.getIconAsset()), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                    BentoText2.m20747BentoText38GnDrw(StringResources2.getText(rhsAccountLabel.getAccountNickName(), composerStartRestartGroup, StringResource.$stable), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1379348085);
                    Modifier modifierMatchParentSize2 = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMatchParentSize2);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_margin_required, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
                    BentoText2.m20747BentoText38GnDrw(StringResources2.getText(((FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired) tradeBarOverviewContent).getText(), composerStartRestartGroup, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradeBar4.TradeBarOverviewContent$lambda$4(tradeBarOverviewContent, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5158heightInVpY3zN4$default2 = SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary().m21717getMinHeightD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5158heightInVpY3zN4$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (tradeBarOverviewContent instanceof FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired) {
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewTradeBarOverviewContent_MarginRequired(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1136127939);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136127939, i, -1, "com.robinhood.android.futures.detail.ui.PreviewTradeBarOverviewContent_MarginRequired (TradeBar.kt:327)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradeBar.INSTANCE.getLambda$1971048837$feature_futures_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeBar4.PreviewTradeBarOverviewContent_MarginRequired$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewTradeBarOverviewContent_RhsAccountLabel(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(749932982);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(749932982, i, -1, "com.robinhood.android.futures.detail.ui.PreviewTradeBarOverviewContent_RhsAccountLabel (TradeBar.kt:340)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradeBar.INSTANCE.m14559getLambda$1711834770$feature_futures_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeBar4.PreviewTradeBarOverviewContent_RhsAccountLabel$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
