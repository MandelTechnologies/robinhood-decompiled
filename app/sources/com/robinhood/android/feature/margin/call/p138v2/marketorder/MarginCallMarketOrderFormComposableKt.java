package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.AnnotatedString2;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.feature.margin.call.p138v2.C16772R;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderFormComposableKt;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState4;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginCallMarketOrderFormComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001aA\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0013\u001a1\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"MarginCallMarketOrderFormScreen", "", "state", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;", "onBackClick", "Lkotlin/Function0;", "onNbboRefresh", "onSwipeToTrade", "onClose", "onViewOrders", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderFormContent", "setSummaryScrollable", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderFormContentScrollable", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderSummaryContent", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NbboSummaryContent", "OrderReceiptContent", "onDoneClick", "(Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-margin-call-v2_externalDebug", "showTapToScroll", "summaryIsScrollable"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderFormComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginCallMarketOrderFormScreen$lambda$9(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarginCallMarketOrderFormScreen(marginCallMarketOrderViewState, function0, function02, function03, function04, function05, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NbboSummaryContent$lambda$25(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NbboSummaryContent(marginCallMarketOrderViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContent$lambda$13(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormContent(marginCallMarketOrderViewState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContentScrollable$lambda$15(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormContentScrollable(marginCallMarketOrderViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReceiptContent$lambda$33(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        OrderReceiptContent(marginCallMarketOrderViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderSummaryContent$lambda$17(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderSummaryContent(marginCallMarketOrderViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarginCallMarketOrderFormScreen(MarginCallMarketOrderViewState marginCallMarketOrderViewState, final Function0<Unit> onBackClick, final Function0<Unit> onNbboRefresh, final Function0<Unit> onSwipeToTrade, final Function0<Unit> onClose, final Function0<Unit> onViewOrders, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue4;
        boolean z;
        Object objRememberedValue5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final MarginCallMarketOrderViewState state = marginCallMarketOrderViewState;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onNbboRefresh, "onNbboRefresh");
        Intrinsics.checkNotNullParameter(onSwipeToTrade, "onSwipeToTrade");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onViewOrders, "onViewOrders");
        Composer composerStartRestartGroup = composer.startRestartGroup(384836226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNbboRefresh) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSwipeToTrade) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClose) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onViewOrders) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i3;
            if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(384836226, i4, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen (MarginCallMarketOrderFormComposable.kt:56)");
                }
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
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
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new C16796x432c348c(scrollStateRememberScrollState, snapshotState2, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                OrderForm6 orderFormState = marginCallMarketOrderViewState.getOrderFormState();
                Object obj = new Object();
                long prime = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                composerStartRestartGroup.startReplaceGroup(460519559);
                String strStringResource = !MarginCallMarketOrderFormScreen$lambda$1(snapshotState) ? StringResources_androidKt.stringResource(C16772R.string.tap_to_scroll, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 7168) != 2048;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$8$lambda$7(onSwipeToTrade, obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                state = marginCallMarketOrderViewState;
                composer2 = composerStartRestartGroup;
                OrderForm2.m26341OrderFormVzGUr2s(orderFormState, obj, (Function1) objRememberedValue5, ComposableLambda3.rememberComposableLambda(1160764198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1160764198, i6, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:74)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2M14482getLambda$48662631$feature_margin_call_v2_externalDebug = ComposableSingletons$MarginCallMarketOrderFormComposableKt.INSTANCE.m14482getLambda$48662631$feature_margin_call_v2_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M14482getLambda$48662631$feature_margin_call_v2_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1890724411, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1890724411, i7, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:78)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1024736901, true, new C167984(state, onNbboRefresh, scrollStateRememberScrollState, snapshotState2, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(888709604, true, new C167995(state, onClose, onViewOrders), composerStartRestartGroup, 54), modifier4, null, null, false, null, prime, 0L, ComposableLambda3.rememberComposableLambda(-67697878, true, new Function5<Boolean, Integer, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.6
                    @Override // kotlin.jvm.functions.Function5
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Float f, Composer composer3, Integer num2) {
                        invoke(bool.booleanValue(), num.intValue(), f.floatValue(), composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2, int i6, float f, Composer composer3, int i7) {
                        if ((i7 & 1025) == 1024 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-67697878, i7, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:112)");
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$1(snapshotState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1471014062, true, new AnonymousClass1(coroutineScope, scrollStateRememberScrollState, snapshotState), composer3, 54), composer3, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: MarginCallMarketOrderFormComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$6$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                        final /* synthetic */ CoroutineScope $scope;
                        final /* synthetic */ ScrollState $scrollState;
                        final /* synthetic */ SnapshotState<Boolean> $showTapToScroll$delegate;

                        AnonymousClass1(CoroutineScope coroutineScope, ScrollState scrollState, SnapshotState<Boolean> snapshotState) {
                            this.$scope = coroutineScope;
                            this.$scrollState = scrollState;
                            this.$showTapToScroll$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                            invoke(animatedVisibilityScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1471014062, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:117)");
                            }
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, 2, null);
                            boolean zMarginCallMarketOrderFormScreen$lambda$1 = MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$1(this.$showTapToScroll$delegate);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$scrollState);
                            final CoroutineScope coroutineScope = this.$scope;
                            final ScrollState scrollState = this.$scrollState;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$6$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MarginCallMarketOrderFormComposableKt.C168006.AnonymousClass1.invoke$lambda$1$lambda$0(coroutineScope, scrollState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, zMarginCallMarketOrderFormScreen$lambda$1, null, null, (Function0) objRememberedValue, 6, null), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, ScrollState scrollState) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16801x9a5d678(scrollState, null), 3, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, strStringResource, composer2, (3670016 & i4) | 224256, 3072, 22400);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$9(state, onBackClick, onNbboRefresh, onSwipeToTrade, onClose, onViewOrders, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i3;
        if ((599187 & i4) == 599186) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
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
            Boolean boolValueOf2 = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = new C16796x432c348c(scrollStateRememberScrollState, snapshotState2, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                OrderForm6 orderFormState2 = marginCallMarketOrderViewState.getOrderFormState();
                Object obj2 = new Object();
                long prime2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                composerStartRestartGroup.startReplaceGroup(460519559);
                if (!MarginCallMarketOrderFormScreen$lambda$1(snapshotState)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 7168) != 2048) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$8$lambda$7(onSwipeToTrade, obj22);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    state = marginCallMarketOrderViewState;
                    composer2 = composerStartRestartGroup;
                    OrderForm2.m26341OrderFormVzGUr2s(orderFormState2, obj2, (Function1) objRememberedValue5, ComposableLambda3.rememberComposableLambda(1160764198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1160764198, i6, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:74)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2M14482getLambda$48662631$feature_margin_call_v2_externalDebug = ComposableSingletons$MarginCallMarketOrderFormComposableKt.INSTANCE.m14482getLambda$48662631$feature_margin_call_v2_externalDebug();
                            final Function0<Unit> function0 = onBackClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M14482getLambda$48662631$feature_margin_call_v2_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1890724411, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1890724411, i7, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:78)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1024736901, true, new C167984(state, onNbboRefresh, scrollStateRememberScrollState, snapshotState2, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(888709604, true, new C167995(state, onClose, onViewOrders), composerStartRestartGroup, 54), modifier4, null, null, false, null, prime2, 0L, ComposableLambda3.rememberComposableLambda(-67697878, true, new Function5<Boolean, Integer, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen.6
                        @Override // kotlin.jvm.functions.Function5
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Float f, Composer composer3, Integer num2) {
                            invoke(bool.booleanValue(), num.intValue(), f.floatValue(), composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z2, int i6, float f, Composer composer3, int i7) {
                            if ((i7 & 1025) == 1024 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-67697878, i7, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:112)");
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$1(snapshotState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1471014062, true, new AnonymousClass1(coroutineScope2, scrollStateRememberScrollState, snapshotState), composer3, 54), composer3, 200064, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MarginCallMarketOrderFormComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$6$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                            final /* synthetic */ CoroutineScope $scope;
                            final /* synthetic */ ScrollState $scrollState;
                            final /* synthetic */ SnapshotState<Boolean> $showTapToScroll$delegate;

                            AnonymousClass1(CoroutineScope coroutineScope, ScrollState scrollState, SnapshotState<Boolean> snapshotState) {
                                this.$scope = coroutineScope;
                                this.$scrollState = scrollState;
                                this.$showTapToScroll$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                invoke(animatedVisibilityScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1471014062, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:117)");
                                }
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, 2, null);
                                boolean zMarginCallMarketOrderFormScreen$lambda$1 = MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$1(this.$showTapToScroll$delegate);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$scrollState);
                                final CoroutineScope coroutineScope = this.$scope;
                                final ScrollState scrollState = this.$scrollState;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$6$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MarginCallMarketOrderFormComposableKt.C168006.AnonymousClass1.invoke$lambda$1$lambda$0(coroutineScope, scrollState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, zMarginCallMarketOrderFormScreen$lambda$1, null, null, (Function0) objRememberedValue, 6, null), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, ScrollState scrollState) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16801x9a5d678(scrollState, null), 3, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, strStringResource, composer2, (3670016 & i4) | 224256, 3072, 22400);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginCallMarketOrderFormScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginCallMarketOrderFormScreen$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginCallMarketOrderFormScreen$lambda$8$lambda$7(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: MarginCallMarketOrderFormComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$4 */
    static final class C167984 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onNbboRefresh;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState<Boolean> $showTapToScroll$delegate;
        final /* synthetic */ MarginCallMarketOrderViewState $state;
        final /* synthetic */ SnapshotState<Boolean> $summaryIsScrollable$delegate;

        C167984(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0<Unit> function0, ScrollState scrollState, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$state = marginCallMarketOrderViewState;
            this.$onNbboRefresh = function0;
            this.$scrollState = scrollState;
            this.$summaryIsScrollable$delegate = snapshotState;
            this.$showTapToScroll$delegate = snapshotState2;
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
                ComposerKt.traceEventStart(1024736901, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:86)");
            }
            if (MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$4(this.$summaryIsScrollable$delegate)) {
                composer.startReplaceGroup(-690476395);
                MarginCallMarketOrderFormComposableKt.OrderFormContentScrollable(this.$state, this.$onNbboRefresh, ScrollKt.verticalScroll$default(Modifier.INSTANCE, this.$scrollState, false, null, false, 14, null), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-690236796);
                MarginCallMarketOrderViewState marginCallMarketOrderViewState = this.$state;
                composer.startReplaceGroup(-1633490746);
                final SnapshotState<Boolean> snapshotState = this.$showTapToScroll$delegate;
                final SnapshotState<Boolean> snapshotState2 = this.$summaryIsScrollable$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginCallMarketOrderFormComposableKt.C167984.invoke$lambda$1$lambda$0(snapshotState, snapshotState2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                MarginCallMarketOrderFormComposableKt.OrderFormContent(marginCallMarketOrderViewState, (Function1) objRememberedValue, this.$onNbboRefresh, null, composer, 48, 8);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, boolean z) {
            MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$2(snapshotState, z);
            MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$5(snapshotState2, z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginCallMarketOrderFormScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginCallMarketOrderFormScreen$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: MarginCallMarketOrderFormComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$5 */
    static final class C167995 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ Function0<Unit> $onViewOrders;
        final /* synthetic */ MarginCallMarketOrderViewState $state;

        C167995(MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0<Unit> function0, Function0<Unit> function02) {
            this.$state = marginCallMarketOrderViewState;
            this.$onClose = function0;
            this.$onViewOrders = function02;
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
                ComposerKt.traceEventStart(888709604, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormScreen.<anonymous> (MarginCallMarketOrderFormComposable.kt:104)");
            }
            MarginCallMarketOrderViewState marginCallMarketOrderViewState = this.$state;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onClose);
            final Function0<Unit> function0 = this.$onClose;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFormComposableKt.C167995.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$onViewOrders);
            final Function0<Unit> function03 = this.$onViewOrders;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFormComposableKt.C167995.invoke$lambda$3$lambda$2(function03);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            MarginCallMarketOrderFormComposableKt.OrderReceiptContent(marginCallMarketOrderViewState, function02, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderFormContent(final MarginCallMarketOrderViewState state, final Function1<? super Boolean, Unit> setSummaryScrollable, final Function0<Unit> onNbboRefresh, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(setSummaryScrollable, "setSummaryScrollable");
        Intrinsics.checkNotNullParameter(onNbboRefresh, "onNbboRefresh");
        Composer composerStartRestartGroup = composer.startRestartGroup(-493477262);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(setSummaryScrollable) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNbboRefresh) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-493477262, i3, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderFormContent (MarginCallMarketOrderFormComposable.kt:142)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                int i5 = i3 & 14;
                OrderSummaryContent(state, null, composerStartRestartGroup, i5, 2);
                Modifier modifierWeight$default = Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginCallMarketOrderFormComposableKt.OrderFormContent$lambda$12$lambda$11$lambda$10(setSummaryScrollable, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(OnRemeasuredModifier2.onSizeChanged(modifierWeight$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
                NbboSummaryContent(state, onNbboRefresh, null, composerStartRestartGroup, ((i3 >> 3) & 112) | i5, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginCallMarketOrderFormComposableKt.OrderFormContent$lambda$13(state, setSummaryScrollable, onNbboRefresh, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                int i52 = i3 & 14;
                OrderSummaryContent(state, null, composerStartRestartGroup, i52, 2);
                Modifier modifierWeight$default2 = Column5.weight$default(column62, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginCallMarketOrderFormComposableKt.OrderFormContent$lambda$12$lambda$11$lambda$10(setSummaryScrollable, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(OnRemeasuredModifier2.onSizeChanged(modifierWeight$default2, (Function1) objRememberedValue), composerStartRestartGroup, 0);
                    NbboSummaryContent(state, onNbboRefresh, null, composerStartRestartGroup, ((i3 >> 3) & 112) | i52, 4);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContent$lambda$12$lambda$11$lambda$10(Function1 function1, IntSize intSize) {
        if (((int) (intSize.getPackedValue() & 4294967295L)) <= 0) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderFormContentScrollable(final MarginCallMarketOrderViewState state, final Function0<Unit> onNbboRefresh, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNbboRefresh, "onNbboRefresh");
        Composer composerStartRestartGroup = composer.startRestartGroup(-383613530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNbboRefresh) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-383613530, i3, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderFormContentScrollable (MarginCallMarketOrderFormComposable.kt:170)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                OrderSummaryContent(state, null, composerStartRestartGroup, i3 & 14, 2);
                NbboSummaryContent(state, onNbboRefresh, null, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginCallMarketOrderFormComposableKt.OrderFormContentScrollable$lambda$15(state, onNbboRefresh, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                OrderSummaryContent(state, null, composerStartRestartGroup, i3 & 14, 2);
                NbboSummaryContent(state, onNbboRefresh, null, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OrderSummaryContent(final MarginCallMarketOrderViewState marginCallMarketOrderViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final MarginCallMarketOrderViewState4 orderSummaryViewState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1781672887);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(marginCallMarketOrderViewState) ? 4 : 2);
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
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1781672887, i3, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryContent (MarginCallMarketOrderFormComposable.kt:181)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                String strStringResource = StringResources_androidKt.stringResource(C16772R.string.order_summary_submit_market_order, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(companion2, C2002Dp.m7995constructorimpl(24), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                orderSummaryViewState = marginCallMarketOrderViewState.getOrderSummaryViewState();
                composerStartRestartGroup.startReplaceGroup(1398070987);
                if (!(orderSummaryViewState instanceof MarginCallMarketOrderViewState4.Error)) {
                    boolean z = orderSummaryViewState instanceof MarginCallMarketOrderViewState4.Loading;
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(540728362, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$OrderSummaryContent$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(540728362, i6, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryContent.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:197)");
                            }
                            MarginCallMarketOrderViewState4 marginCallMarketOrderViewState4 = orderSummaryViewState;
                            MarginCallMarketOrderViewState4.Content content = marginCallMarketOrderViewState4 instanceof MarginCallMarketOrderViewState4.Content ? (MarginCallMarketOrderViewState4.Content) marginCallMarketOrderViewState4 : null;
                            int tradesCount = 0;
                            String strStringResource2 = StringResources_androidKt.stringResource(C16772R.string.order_summary_number_of_positions, composer2, 0);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            if (content != null) {
                                try {
                                    tradesCount = content.getTradesCount();
                                } catch (Throwable th) {
                                    builder.pop(iPushStyle);
                                    throw th;
                                }
                            }
                            builder.append(String.valueOf(tradesCount));
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, false, 0L, null, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(1780529441, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$OrderSummaryContent$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            String totalCreditCostValue;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1780529441, i6, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryContent.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:213)");
                            }
                            MarginCallMarketOrderViewState4 marginCallMarketOrderViewState4 = orderSummaryViewState;
                            String callCreditCostValue = null;
                            MarginCallMarketOrderViewState4.Content content = marginCallMarketOrderViewState4 instanceof MarginCallMarketOrderViewState4.Content ? (MarginCallMarketOrderViewState4.Content) marginCallMarketOrderViewState4 : null;
                            String totalCreditCostHeader = content != null ? content.getTotalCreditCostHeader() : null;
                            composer2.startReplaceGroup(1691813982);
                            if (totalCreditCostHeader == null) {
                                totalCreditCostHeader = StringResources_androidKt.stringResource(C16772R.string.order_summary_estimated_credit_placeholder, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            String strStringResource2 = StringResources_androidKt.stringResource(C16772R.string.order_summary_estimated_credit_toward_call, composer2, 0);
                            composer2.startReplaceGroup(1691824598);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(1691826153);
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            if (content != null) {
                                try {
                                    totalCreditCostValue = content.getTotalCreditCostValue();
                                } finally {
                                }
                            } else {
                                totalCreditCostValue = null;
                            }
                            composer2.startReplaceGroup(1691830088);
                            if (totalCreditCostValue == null) {
                                totalCreditCostValue = StringResources_androidKt.stringResource(C16772R.string.order_summary_money_value_placeholder, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            builder.append(totalCreditCostValue);
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composer2.endReplaceGroup();
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1691838648);
                            builder = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(1691840203);
                            iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getPrime(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            if (content != null) {
                                try {
                                    callCreditCostValue = content.getCallCreditCostValue();
                                } finally {
                                }
                            }
                            composer2.startReplaceGroup(1691844231);
                            if (callCreditCostValue == null) {
                                callCreditCostValue = StringResources_androidKt.stringResource(C16772R.string.order_summary_money_value_placeholder, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            builder.append(callCreditCostValue);
                            builder.pop(iPushStyle);
                            composer2.endReplaceGroup();
                            AnnotatedString annotatedString2 = builder.toAnnotatedString();
                            composer2.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, totalCreditCostHeader, strStringResource2, null, new BentoBaseRowState.Meta.TwoLine(annotatedString, annotatedString2), null, false, false, false, 0L, null, composer2, BentoBaseRowState.Meta.TwoLine.$stable << 15, 0, 4051);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-1866210398, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$OrderSummaryContent$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1866210398, i6, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryContent.<anonymous>.<anonymous> (MarginCallMarketOrderFormComposable.kt:242)");
                            }
                            MarginCallMarketOrderViewState4 marginCallMarketOrderViewState4 = orderSummaryViewState;
                            String accountType = null;
                            MarginCallMarketOrderViewState4.Content content = marginCallMarketOrderViewState4 instanceof MarginCallMarketOrderViewState4.Content ? (MarginCallMarketOrderViewState4.Content) marginCallMarketOrderViewState4 : null;
                            String strStringResource2 = StringResources_androidKt.stringResource(C16772R.string.order_summary_account, composer2, 0);
                            composer2.startReplaceGroup(1868147023);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(1868148578);
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            if (content != null) {
                                try {
                                    accountType = content.getAccountType();
                                } catch (Throwable th) {
                                    builder.pop(iPushStyle);
                                    throw th;
                                }
                            }
                            composer2.startReplaceGroup(1868152513);
                            if (accountType == null) {
                                accountType = StringResources_androidKt.stringResource(C16772R.string.order_summary_account_type_placeholder, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            builder.append(accountType);
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composer2.endReplaceGroup();
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            composer2.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, new BentoBaseRowState.Meta.SingleLine(annotatedString), null, false, false, false, 0L, null, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginCallMarketOrderFormComposableKt.OrderSummaryContent$lambda$17(marginCallMarketOrderViewState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                String strStringResource2 = StringResources_androidKt.stringResource(C16772R.string.order_summary_submit_market_order, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5144paddingVpY3zN4$default(companion22, C2002Dp.m7995constructorimpl(24), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                orderSummaryViewState = marginCallMarketOrderViewState.getOrderSummaryViewState();
                composerStartRestartGroup.startReplaceGroup(1398070987);
                if (!(orderSummaryViewState instanceof MarginCallMarketOrderViewState4.Error)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NbboSummaryContent(final MarginCallMarketOrderViewState marginCallMarketOrderViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        MarginCallMarketOrderViewState marginCallMarketOrderViewState2;
        int i3;
        Modifier modifier2;
        MarginCallMarketOrderViewState2 nbboSummaryViewState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        int iPushStyle;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2121156340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            marginCallMarketOrderViewState2 = marginCallMarketOrderViewState;
        } else if ((i & 6) == 0) {
            marginCallMarketOrderViewState2 = marginCallMarketOrderViewState;
            i3 = (composerStartRestartGroup.changed(marginCallMarketOrderViewState2) ? 4 : 2) | i;
        } else {
            marginCallMarketOrderViewState2 = marginCallMarketOrderViewState;
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
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2121156340, i3, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryContent (MarginCallMarketOrderFormComposable.kt:266)");
                }
                nbboSummaryViewState = marginCallMarketOrderViewState2.getNbboSummaryViewState();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!(nbboSummaryViewState instanceof MarginCallMarketOrderViewState2.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-1860037800);
                    LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$MarginCallMarketOrderFormComposableKt.INSTANCE.m14481getLambda$1518329010$feature_margin_call_v2_externalDebug(), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else if (nbboSummaryViewState instanceof MarginCallMarketOrderViewState2.Content) {
                    composerStartRestartGroup.startReplaceGroup(-1859621067);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    float f = 24;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                    int i5 = i3;
                    modifier3 = modifier5;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16772R.string.order_summary_order_summary, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion2, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 48, 0, 8188);
                    composerStartRestartGroup.startReplaceGroup(1464046668);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1464046868);
                    MarginCallMarketOrderViewState2.Content content = (MarginCallMarketOrderViewState2.Content) nbboSummaryViewState;
                    for (Tuples2<String, String> tuples2 : content.getNbboSummaries()) {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(((Object) tuples2.getFirst()) + PlaceholderUtils.XXShortPlaceholderText);
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                builder.append(((Object) tuples2.getSecond()) + PlaceholderUtils.XXShortPlaceholderText);
                                builder.pop(iPushStyle);
                            } finally {
                            }
                        } finally {
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(((MarginCallMarketOrderViewState2.Content) nbboSummaryViewState).getRefreshedAt() + PlaceholderUtils.XXShortPlaceholderText);
                        Unit unit2 = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.startReplaceGroup(1464067323);
                        if (content.getRefreshString().length() > 0) {
                            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i7).getPrime(), 0L, FontWeight.INSTANCE.getBold(), bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS().m7663getFontStyle4Lr2A7w(), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61426, (DefaultConstructorMarker) null), null, null, null, 14, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z = (i5 & 112) == 32;
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$NbboSummaryContent$1$1$4$1
                                    @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                    public final void onClick(LinkAnnotation it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        function0.invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("refresh-nbbo", textLinkStyles, (LinkInteractionListener) objRememberedValue));
                            try {
                                builder.append(((MarginCallMarketOrderViewState2.Content) nbboSummaryViewState).getRefreshString());
                            } finally {
                                builder.pop(iPushLink);
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 48, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } finally {
                    }
                } else {
                    modifier3 = modifier5;
                    if (nbboSummaryViewState instanceof MarginCallMarketOrderViewState2.Error) {
                        composerStartRestartGroup.startReplaceGroup(-1857338134);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1857314326);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginCallMarketOrderFormComposableKt.NbboSummaryContent$lambda$25(marginCallMarketOrderViewState, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            nbboSummaryViewState = marginCallMarketOrderViewState2.getNbboSummaryViewState();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                if (!(nbboSummaryViewState instanceof MarginCallMarketOrderViewState2.Loading)) {
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OrderReceiptContent(final MarginCallMarketOrderViewState marginCallMarketOrderViewState, Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        int i3;
        float f;
        Composer composer2;
        final Function0<Unit> function03;
        Composer composerStartRestartGroup = composer.startRestartGroup(1235541862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(marginCallMarketOrderViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1235541862, i2, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.OrderReceiptContent (MarginCallMarketOrderFormComposable.kt:346)");
            }
            MarginCallMarketOrderViewState3 orderConfirmationViewState = marginCallMarketOrderViewState.getOrderConfirmationViewState();
            if (orderConfirmationViewState == null) {
                function03 = function0;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                int i4 = i2;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                String header = orderConfirmationViewState.getHeader();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(header, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1914772506);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(orderConfirmationViewState.getSummary());
                String summaryViewOrder = orderConfirmationViewState.getSummaryViewOrder();
                composerStartRestartGroup.startReplaceGroup(-1914768087);
                if (summaryViewOrder == null) {
                    i3 = i4;
                } else {
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).getPrime(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    i3 = i4;
                    boolean z = (i3 & 896) == 256;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$OrderReceiptContent$1$1$summaryText$1$1$1$1
                            @Override // androidx.compose.p011ui.text.LinkInteractionListener
                            public final void onClick(LinkAnnotation it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function02.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    builder.pushLink(new LinkAnnotation.Clickable("view-orders-summary", null, (LinkInteractionListener) objRememberedValue, 2, null));
                    builder.append(summaryViewOrder);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16382);
                float f2 = 24;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
                if (orderConfirmationViewState instanceof MarginCallMarketOrderViewState3.Completed) {
                    composerStartRestartGroup.startReplaceGroup(772453191);
                    AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C16772R.string.positions_closed, composerStartRestartGroup, 0), null, 2, null);
                    MarginCallMarketOrderViewState3.Completed completed = (MarginCallMarketOrderViewState3.Completed) orderConfirmationViewState;
                    BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(completed.getPositionsClosed());
                    int i7 = BentoBaseRowState.Meta.SingleLine.$stable;
                    f = f2;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString2, null, null, singleLine, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i7 << 15) | 805306368, 0, 15835);
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(completed.getTotalsHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(completed.getTotalsValue()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i7 << 15) | 805306368, 0, 15835);
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(completed.getTowardsCallHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(AnnotatedString2.AnnotatedString$default(completed.getTowardsCallValue(), new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).getPrime(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), null, 4, null)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i7 << 15) | 805306368, 0, 15835);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    f = f2;
                    if (orderConfirmationViewState instanceof MarginCallMarketOrderViewState3.Failed) {
                        composerStartRestartGroup.startReplaceGroup(773820229);
                        AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C16772R.string.positions_closed, composerStartRestartGroup, 0), null, 2, null);
                        MarginCallMarketOrderViewState3.Failed failed = (MarginCallMarketOrderViewState3.Failed) orderConfirmationViewState;
                        BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(failed.getPositionsClosed());
                        int i8 = BentoBaseRowState.Meta.SingleLine.$stable;
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString3, null, null, singleLine2, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i8 << 15) | 805306368, 0, 15835);
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(failed.getEstimatedTotalsHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(failed.getEstimatedTotalsValue()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i8 << 15) | 805306368, 0, 15835);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else if (orderConfirmationViewState instanceof MarginCallMarketOrderViewState3.Partial) {
                        composerStartRestartGroup.startReplaceGroup(774678557);
                        AnnotatedString annotatedString4 = new AnnotatedString(StringResources_androidKt.stringResource(C16772R.string.positions_closed, composerStartRestartGroup, 0), null, 2, null);
                        MarginCallMarketOrderViewState3.Partial partial = (MarginCallMarketOrderViewState3.Partial) orderConfirmationViewState;
                        BentoBaseRowState.Meta.SingleLine singleLine3 = new BentoBaseRowState.Meta.SingleLine(partial.getPositionsClosed());
                        int i9 = BentoBaseRowState.Meta.SingleLine.$stable;
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString4, null, null, singleLine3, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(partial.getTotalsHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(partial.getTotalsValue()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(partial.getPendingHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(partial.getPendingValue()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        if (!(orderConfirmationViewState instanceof MarginCallMarketOrderViewState3.Pending)) {
                            composerStartRestartGroup.startReplaceGroup(-1914744237);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(775889603);
                        AnnotatedString annotatedString5 = new AnnotatedString(StringResources_androidKt.stringResource(C16772R.string.positions_closed, composerStartRestartGroup, 0), null, 2, null);
                        MarginCallMarketOrderViewState3.Pending pending = (MarginCallMarketOrderViewState3.Pending) orderConfirmationViewState;
                        BentoBaseRowState.Meta.SingleLine singleLine4 = new BentoBaseRowState.Meta.SingleLine(pending.getPositionsClosed());
                        int i10 = BentoBaseRowState.Meta.SingleLine.$stable;
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString5, null, null, singleLine4, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i10 << 15) | 805306368, 0, 15835);
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(pending.getEstimatedTotalsHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(pending.getEstimatedTotalsValue()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i10 << 15) | 805306368, 0, 15835);
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(pending.getEstimatedTowardsCallHeader(), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(AnnotatedString2.AnnotatedString$default(pending.getEstimatedTowardsCallValue(), new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).getPrime(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), null, 4, null)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i10 << 15) | 805306368, 0, 15835);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer2, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C16772R.string.done, composer2, 0);
                long prime = bentoTheme.getColors(composer2, i5).getPrime();
                composer2.startReplaceGroup(5004770);
                boolean z2 = (i6 & 112) == 32;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function03 = function0;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginCallMarketOrderFormComposableKt.OrderReceiptContent$lambda$32$lambda$31$lambda$30$lambda$29(function03);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    function03 = function0;
                }
                composer2.endReplaceGroup();
                Composer composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource, modifierFillMaxWidth$default2, null, null, false, false, Color.m6701boximpl(prime), null, null, null, false, null, composer3, 384, 0, 8056);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                Unit unit2 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginCallMarketOrderFormComposableKt.OrderReceiptContent$lambda$33(marginCallMarketOrderViewState, function03, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReceiptContent$lambda$32$lambda$31$lambda$30$lambda$29(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
