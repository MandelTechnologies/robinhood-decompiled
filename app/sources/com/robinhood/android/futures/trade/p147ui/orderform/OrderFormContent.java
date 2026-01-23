package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColors2;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderFormContent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001aW\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0015\u001am\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0017\u001am\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0017\u001a)\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"OrderFormContent", "", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "quantityFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "limitPriceFocusRequester", "stopPriceFocusRequester", "orderFormContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "onFocusChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "onDisabledClicked", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$DisabledClickSource;", "onShowTimeInForceSelector", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MarketOrder", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Landroidx/compose/ui/focus/FocusRequester;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LimitOrder", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StopMarketOrder", "SummaryStrings", "orderSummary", "Lcom/robinhood/utils/resource/StringResource;", "quoteSummary", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OrderFormContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitOrder$lambda$4(OrderForm6 orderForm6, FocusRequester focusRequester, FocusRequester focusRequester2, FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LimitOrder(orderForm6, focusRequester, focusRequester2, orderFormContentData, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketOrder$lambda$2(OrderForm6 orderForm6, FocusRequester focusRequester, FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketOrder(orderForm6, focusRequester, orderFormContentData, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContent$lambda$0(OrderForm6 orderForm6, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormContent(orderForm6, focusRequester, focusRequester2, focusRequester3, orderFormContentData, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StopMarketOrder$lambda$6(OrderForm6 orderForm6, FocusRequester focusRequester, FocusRequester focusRequester2, FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StopMarketOrder(orderForm6, focusRequester, focusRequester2, orderFormContentData, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummaryStrings$lambda$11(StringResource stringResource, StringResource stringResource2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SummaryStrings(stringResource, stringResource2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderFormContent(final OrderForm6 orderFormState, final FocusRequester quantityFocusRequester, final FocusRequester limitPriceFocusRequester, final FocusRequester stopPriceFocusRequester, final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, final Function0<Unit> onShowTimeInForceSelector, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(quantityFocusRequester, "quantityFocusRequester");
        Intrinsics.checkNotNullParameter(limitPriceFocusRequester, "limitPriceFocusRequester");
        Intrinsics.checkNotNullParameter(stopPriceFocusRequester, "stopPriceFocusRequester");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Intrinsics.checkNotNullParameter(onShowTimeInForceSelector, "onShowTimeInForceSelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(-609716743);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(orderFormState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityFocusRequester) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(limitPriceFocusRequester) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(stopPriceFocusRequester) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowTimeInForceSelector) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 == 0) {
            if ((100663296 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-609716743, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent (OrderFormContent.kt:38)");
                }
                DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(360292646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt.OrderFormContent.1
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
                            ComposerKt.traceEventStart(360292646, i5, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous> (OrderFormContent.kt:40)");
                        }
                        final Modifier modifier5 = modifier4;
                        final FuturesOrderFormViewState.OrderFormContentData orderFormContentData2 = orderFormContentData;
                        final OrderForm6 orderForm6 = orderFormState;
                        final FocusRequester focusRequester = quantityFocusRequester;
                        final Function1<FuturesOrderFormDataState.FocusedText, Unit> function1 = onFocusChanged;
                        final Function1<FuturesOrderFormDataState.DisabledClickSource, Unit> function12 = onDisabledClicked;
                        final FocusRequester focusRequester2 = limitPriceFocusRequester;
                        final Function0<Unit> function0 = onShowTimeInForceSelector;
                        final FocusRequester focusRequester3 = stopPriceFocusRequester;
                        TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-235407729, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt.OrderFormContent.1.1

                            /* compiled from: OrderFormContent.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$OrderFormContent$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[FuturesOrderConfiguration.values().length];
                                    try {
                                        iArr[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[FuturesOrderConfiguration.LIMIT.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-235407729, i6, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous>.<anonymous> (OrderFormContent.kt:41)");
                                }
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composer3, 0, 1);
                                final FuturesOrderFormViewState.OrderFormContentData orderFormContentData3 = orderFormContentData2;
                                OrderForm6 orderForm62 = orderForm6;
                                FocusRequester focusRequester4 = focusRequester;
                                Function1<FuturesOrderFormDataState.FocusedText, Unit> function13 = function1;
                                Function1<FuturesOrderFormDataState.DisabledClickSource, Unit> function14 = function12;
                                FocusRequester focusRequester5 = focusRequester2;
                                Function0<Unit> function02 = function0;
                                FocusRequester focusRequester6 = focusRequester3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                LocalShowPlaceholder.Loadable(orderFormContentData3.getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(30693577, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$OrderFormContent$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(30693577, i7, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderFormContent.kt:47)");
                                        }
                                        StringResource title = orderFormContentData3.getTitle();
                                        composer4.startReplaceGroup(-568240622);
                                        String text = title == null ? null : StringResources4.getText(title, composer4, StringResource.$stable);
                                        composer4.endReplaceGroup();
                                        if (text == null) {
                                            text = "";
                                        }
                                        BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleMedium(), composer4, 0, 0, 8190);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 6);
                                StringResource buyingPowerAvailable = orderFormContentData3.getBuyingPowerAvailable();
                                int i7 = StringResource.$stable;
                                String text = StringResources4.getText(buyingPowerAvailable, composer3, i7);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU();
                                TextStyle textS = bentoTheme.getTypography(composer3, i8).getTextS();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(text, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8184);
                                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 7, null);
                                int i9 = WhenMappings.$EnumSwitchMapping$0[orderFormContentData3.getOrderConfig().ordinal()];
                                if (i9 == 1) {
                                    composer3.startReplaceGroup(-1286449813);
                                    OrderFormContent.MarketOrder(orderForm62, focusRequester4, orderFormContentData3, function13, function14, modifierM5146paddingqDBjuR0$default, composer3, i7 << 6, 0);
                                    composer3.endReplaceGroup();
                                } else if (i9 == 2) {
                                    composer3.startReplaceGroup(-1286434970);
                                    OrderFormContent.LimitOrder(orderForm62, focusRequester4, focusRequester5, orderFormContentData3, function13, function14, function02, modifierM5146paddingqDBjuR0$default, composer3, i7 << 9, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (i9 != 3) {
                                        if (i9 != 4) {
                                            composer3.startReplaceGroup(-1286451514);
                                            composer3.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer3.startReplaceGroup(-1286395825);
                                        composer3.endReplaceGroup();
                                        throw new IllegalStateException("Not supported");
                                    }
                                    composer3.startReplaceGroup(-1286415191);
                                    OrderFormContent.StopMarketOrder(orderForm62, focusRequester4, focusRequester6, orderFormContentData3, function13, function14, function02, modifierM5146paddingqDBjuR0$default, composer3, i7 << 9, 0);
                                    composer3.endReplaceGroup();
                                }
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContent.OrderFormContent$lambda$0(orderFormState, quantityFocusRequester, limitPriceFocusRequester, stopPriceFocusRequester, orderFormContentData, onFocusChanged, onDisabledClicked, onShowTimeInForceSelector, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 100663296;
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(360292646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt.OrderFormContent.1
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
                        ComposerKt.traceEventStart(360292646, i5, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous> (OrderFormContent.kt:40)");
                    }
                    final Modifier modifier5 = modifier4;
                    final FuturesOrderFormViewState.OrderFormContentData orderFormContentData2 = orderFormContentData;
                    final OrderForm6 orderForm6 = orderFormState;
                    final FocusRequester focusRequester = quantityFocusRequester;
                    final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> function1 = onFocusChanged;
                    final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function12 = onDisabledClicked;
                    final FocusRequester focusRequester2 = limitPriceFocusRequester;
                    final Function0<Unit> function0 = onShowTimeInForceSelector;
                    final FocusRequester focusRequester3 = stopPriceFocusRequester;
                    TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-235407729, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt.OrderFormContent.1.1

                        /* compiled from: OrderFormContent.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$OrderFormContent$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FuturesOrderConfiguration.values().length];
                                try {
                                    iArr[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FuturesOrderConfiguration.LIMIT.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

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
                                ComposerKt.traceEventStart(-235407729, i6, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous>.<anonymous> (OrderFormContent.kt:41)");
                            }
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composer3, 0, 1);
                            final FuturesOrderFormViewState.OrderFormContentData orderFormContentData3 = orderFormContentData2;
                            OrderForm6 orderForm62 = orderForm6;
                            FocusRequester focusRequester4 = focusRequester;
                            Function1<FuturesOrderFormDataState.FocusedText, Unit> function13 = function1;
                            Function1<FuturesOrderFormDataState.DisabledClickSource, Unit> function14 = function12;
                            FocusRequester focusRequester5 = focusRequester2;
                            Function0<Unit> function02 = function0;
                            FocusRequester focusRequester6 = focusRequester3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            LocalShowPlaceholder.Loadable(orderFormContentData3.getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(30693577, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$OrderFormContent$1$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(30693577, i7, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderFormContent.kt:47)");
                                    }
                                    StringResource title = orderFormContentData3.getTitle();
                                    composer4.startReplaceGroup(-568240622);
                                    String text = title == null ? null : StringResources4.getText(title, composer4, StringResource.$stable);
                                    composer4.endReplaceGroup();
                                    if (text == null) {
                                        text = "";
                                    }
                                    BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleMedium(), composer4, 0, 0, 8190);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 3072, 6);
                            StringResource buyingPowerAvailable = orderFormContentData3.getBuyingPowerAvailable();
                            int i7 = StringResource.$stable;
                            String text = StringResources4.getText(buyingPowerAvailable, composer3, i7);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU();
                            TextStyle textS = bentoTheme.getTypography(composer3, i8).getTextS();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(text, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8184);
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 7, null);
                            int i9 = WhenMappings.$EnumSwitchMapping$0[orderFormContentData3.getOrderConfig().ordinal()];
                            if (i9 == 1) {
                                composer3.startReplaceGroup(-1286449813);
                                OrderFormContent.MarketOrder(orderForm62, focusRequester4, orderFormContentData3, function13, function14, modifierM5146paddingqDBjuR0$default, composer3, i7 << 6, 0);
                                composer3.endReplaceGroup();
                            } else if (i9 == 2) {
                                composer3.startReplaceGroup(-1286434970);
                                OrderFormContent.LimitOrder(orderForm62, focusRequester4, focusRequester5, orderFormContentData3, function13, function14, function02, modifierM5146paddingqDBjuR0$default, composer3, i7 << 9, 0);
                                composer3.endReplaceGroup();
                            } else {
                                if (i9 != 3) {
                                    if (i9 != 4) {
                                        composer3.startReplaceGroup(-1286451514);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(-1286395825);
                                    composer3.endReplaceGroup();
                                    throw new IllegalStateException("Not supported");
                                }
                                composer3.startReplaceGroup(-1286415191);
                                OrderFormContent.StopMarketOrder(orderForm62, focusRequester4, focusRequester6, orderFormContentData3, function13, function14, function02, modifierM5146paddingqDBjuR0$default, composer3, i7 << 9, 0);
                                composer3.endReplaceGroup();
                            }
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketOrder(final OrderForm6 orderFormState, final FocusRequester quantityFocusRequester, final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(quantityFocusRequester, "quantityFocusRequester");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(599636574);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(orderFormState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityFocusRequester) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(599636574, i4, -1, "com.robinhood.android.futures.trade.ui.orderform.MarketOrder (OrderFormContent.kt:111)");
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
                int i6 = i4 << 3;
                int i7 = 57344 & i6;
                int i8 = 458752 & i6;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i7 | i8);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i9).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay marketPriceText = orderFormContentData.getMarketPriceText();
                int i10 = StringResource.$stable;
                OrderFormRowsKt.PriceRow(orderFormContentData, marketPriceText, null, null, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i10 | 3456 | ((i4 >> 6) & 14) | i7 | i8);
                composer2 = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i9).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 5);
                modifier2 = modifier3;
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composer2, (i4 & 14) | (i10 << 6) | (i10 << 9) | (i10 << 12) | (i10 << 15) | (i10 << 18));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContent.MarketOrder$lambda$2(orderFormState, quantityFocusRequester, orderFormContentData, onFocusChanged, onDisabledClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) != 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                int i62 = i4 << 3;
                int i72 = 57344 & i62;
                int i82 = 458752 & i62;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i72 | i82);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i92 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i92).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay marketPriceText2 = orderFormContentData.getMarketPriceText();
                int i102 = StringResource.$stable;
                OrderFormRowsKt.PriceRow(orderFormContentData, marketPriceText2, null, null, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i102 | 3456 | ((i4 >> 6) & 14) | i72 | i82);
                composer2 = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composer2, i92).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 5);
                modifier2 = modifier3;
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composer2, (i4 & 14) | (i102 << 6) | (i102 << 9) | (i102 << 12) | (i102 << 15) | (i102 << 18));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LimitOrder(final OrderForm6 orderFormState, final FocusRequester quantityFocusRequester, final FocusRequester limitPriceFocusRequester, final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, final Function0<Unit> onShowTimeInForceSelector, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function1;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(quantityFocusRequester, "quantityFocusRequester");
        Intrinsics.checkNotNullParameter(limitPriceFocusRequester, "limitPriceFocusRequester");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Intrinsics.checkNotNullParameter(onShowTimeInForceSelector, "onShowTimeInForceSelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1327962577);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(orderFormState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityFocusRequester) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(limitPriceFocusRequester) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowTimeInForceSelector) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((4793491 & i4) != 4793490 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function1 = onDisabledClicked;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1327962577, i4, -1, "com.robinhood.android.futures.trade.ui.orderform.LimitOrder (OrderFormContent.kt:157)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i6 = i4 & 57344;
                int i7 = i4 & 458752;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i6 | i7);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay limitPriceText = orderFormContentData.getLimitPriceText();
                FuturesOrderFormDataState.FocusedText focusedText = FuturesOrderFormDataState.FocusedText.LIMIT_PRICE;
                int i9 = StringResource.$stable;
                int i10 = i4 >> 9;
                int i11 = i10 & 14;
                OrderFormRowsKt.PriceRow(orderFormContentData, limitPriceText, focusedText, limitPriceFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i9 | 384 | i11 | ((i4 << 3) & 7168) | i6 | i7);
                function1 = onDisabledClicked;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.TimeInForceRow(orderFormContentData, onShowTimeInForceSelector, function1, composerStartRestartGroup, i9 | i11 | ((i4 >> 15) & 112) | (i10 & 896));
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composerStartRestartGroup, (i9 << 18) | (i4 & 14) | (i9 << 6) | (i9 << 9) | (i9 << 12) | (i9 << 15));
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function12 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContent.LimitOrder$lambda$4(orderFormState, quantityFocusRequester, limitPriceFocusRequester, orderFormContentData, onFocusChanged, function12, onShowTimeInForceSelector, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        i4 = i3;
        if ((4793491 & i4) != 4793490) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                int i62 = i4 & 57344;
                int i72 = i4 & 458752;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i62 | i72);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay limitPriceText2 = orderFormContentData.getLimitPriceText();
                FuturesOrderFormDataState.FocusedText focusedText2 = FuturesOrderFormDataState.FocusedText.LIMIT_PRICE;
                int i92 = StringResource.$stable;
                int i102 = i4 >> 9;
                int i112 = i102 & 14;
                OrderFormRowsKt.PriceRow(orderFormContentData, limitPriceText2, focusedText2, limitPriceFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i92 | 384 | i112 | ((i4 << 3) & 7168) | i62 | i72);
                function1 = onDisabledClicked;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.TimeInForceRow(orderFormContentData, onShowTimeInForceSelector, function1, composerStartRestartGroup, i92 | i112 | ((i4 >> 15) & 112) | (i102 & 896));
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composerStartRestartGroup, (i92 << 18) | (i4 & 14) | (i92 << 6) | (i92 << 9) | (i92 << 12) | (i92 << 15));
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StopMarketOrder(final OrderForm6 orderFormState, final FocusRequester quantityFocusRequester, final FocusRequester stopPriceFocusRequester, final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, final Function0<Unit> onShowTimeInForceSelector, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function1;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(quantityFocusRequester, "quantityFocusRequester");
        Intrinsics.checkNotNullParameter(stopPriceFocusRequester, "stopPriceFocusRequester");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Intrinsics.checkNotNullParameter(onShowTimeInForceSelector, "onShowTimeInForceSelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1105971058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(orderFormState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityFocusRequester) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(stopPriceFocusRequester) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowTimeInForceSelector) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((4793491 & i4) != 4793490 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function1 = onDisabledClicked;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1105971058, i4, -1, "com.robinhood.android.futures.trade.ui.orderform.StopMarketOrder (OrderFormContent.kt:211)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i6 = i4 & 57344;
                int i7 = i4 & 458752;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i6 | i7);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay stopPriceText = orderFormContentData.getStopPriceText();
                FuturesOrderFormDataState.FocusedText focusedText = FuturesOrderFormDataState.FocusedText.STOP_PRICE;
                int i9 = StringResource.$stable;
                int i10 = i4 >> 9;
                int i11 = i10 & 14;
                OrderFormRowsKt.PriceRow(orderFormContentData, stopPriceText, focusedText, stopPriceFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i9 | 384 | i11 | ((i4 << 3) & 7168) | i6 | i7);
                function1 = onDisabledClicked;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.TimeInForceRow(orderFormContentData, onShowTimeInForceSelector, function1, composerStartRestartGroup, i9 | i11 | ((i4 >> 15) & 112) | (i10 & 896));
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composerStartRestartGroup, (i9 << 18) | (i4 & 14) | (i9 << 6) | (i9 << 9) | (i9 << 12) | (i9 << 15));
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> function12 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContent.StopMarketOrder$lambda$6(orderFormState, quantityFocusRequester, stopPriceFocusRequester, orderFormContentData, onFocusChanged, function12, onShowTimeInForceSelector, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        i4 = i3;
        if ((4793491 & i4) != 4793490) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                int i62 = i4 & 57344;
                int i72 = i4 & 458752;
                OrderFormRowsKt.QuantityRow(orderFormContentData.getQuantityText().getText(), orderFormContentData.getQuantityText().getUseSecondaryColor(), orderFormContentData.isEnabled(), quantityFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, ((i4 << 6) & 7168) | i62 | i72);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                FuturesOrderFormViewState.TextDisplay stopPriceText2 = orderFormContentData.getStopPriceText();
                FuturesOrderFormDataState.FocusedText focusedText2 = FuturesOrderFormDataState.FocusedText.STOP_PRICE;
                int i92 = StringResource.$stable;
                int i102 = i4 >> 9;
                int i112 = i102 & 14;
                OrderFormRowsKt.PriceRow(orderFormContentData, stopPriceText2, focusedText2, stopPriceFocusRequester, onFocusChanged, onDisabledClicked, composerStartRestartGroup, i92 | 384 | i112 | ((i4 << 3) & 7168) | i62 | i72);
                function1 = onDisabledClicked;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.TimeInForceRow(orderFormContentData, onShowTimeInForceSelector, function1, composerStartRestartGroup, i92 | i112 | ((i4 >> 15) & 112) | (i102 & 896));
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                OrderFormRowsKt.BuyingPowerEffectRow(orderFormState, orderFormContentData.getBuyingPowerEffect(), orderFormContentData.getMarginRequired(), orderFormContentData.getTotalCommission(), orderFormContentData.getRegulatoryAndExchangeFees(), orderFormContentData.getCommissionAndFees(), orderFormContentData.getTotalGoldSavings(), composerStartRestartGroup, (i92 << 18) | (i4 & 14) | (i92 << 6) | (i92 << 9) | (i92 << 12) | (i92 << 15));
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SummaryStrings(final StringResource orderSummary, final StringResource stringResource, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        String text;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderSummary, "orderSummary");
        Composer composerStartRestartGroup = composer.startRestartGroup(482120162);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orderSummary) : composerStartRestartGroup.changedInstance(orderSummary) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(482120162, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.SummaryStrings (OrderFormContent.kt:260)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                modifier3 = modifier4;
                int i5 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_summary_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                composerStartRestartGroup.startReplaceGroup(1384263548);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int i6 = StringResource.$stable;
                builder.append(StringResources4.getText(orderSummary, composerStartRestartGroup, (i5 & 14) | i6));
                builder.append(' ');
                composerStartRestartGroup.startReplaceGroup(1384267253);
                text = stringResource != null ? StringResources4.getText(stringResource, composerStartRestartGroup, i6 | ((i5 >> 3) & 14)) : null;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1384267843);
                if (text != null) {
                    int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(text);
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        builder.pop(iPushStyle);
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContent.SummaryStrings$lambda$11(orderSummary, stringResource, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                modifier3 = modifier4;
                int i52 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_summary_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                composerStartRestartGroup.startReplaceGroup(1384263548);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                int i62 = StringResource.$stable;
                builder2.append(StringResources4.getText(orderSummary, composerStartRestartGroup, (i52 & 14) | i62));
                builder2.append(' ');
                composerStartRestartGroup.startReplaceGroup(1384267253);
                if (stringResource != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1384267843);
                if (text != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
