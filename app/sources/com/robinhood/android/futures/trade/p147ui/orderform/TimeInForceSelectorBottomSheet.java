package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.futures.trade.p147ui.orderform.TimeInForceSelectorBottomSheet;
import com.robinhood.android.futures.trade.p147ui.shared.TimeInForceSelectionContent;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TimeInForceSelectorBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"TimeInForceSelectorBottomSheet", "", "orderFormContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "onTimeInForceSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "onTimeInForceSelectorDismissed", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TimeInForceSelectorBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSelectorBottomSheet$lambda$0(FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        TimeInForceSelectorBottomSheet(orderFormContentData, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TimeInForceSelectorBottomSheet(final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function1<? super FuturesTimeInForce, Unit> onTimeInForceSelected, final Function0<Unit> onTimeInForceSelectorDismissed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onTimeInForceSelected, "onTimeInForceSelected");
        Intrinsics.checkNotNullParameter(onTimeInForceSelectorDismissed, "onTimeInForceSelectorDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1393610938);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTimeInForceSelected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTimeInForceSelectorDismissed) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393610938, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheet (TimeInForceSelectorBottomSheet.kt:23)");
            }
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onTimeInForceSelectorDismissed, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(168675457, true, new C176371(orderFormContentData, onTimeInForceSelected, onTimeInForceSelectorDismissed), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimeInForceSelectorBottomSheet.TimeInForceSelectorBottomSheet$lambda$0(orderFormContentData, onTimeInForceSelected, onTimeInForceSelectorDismissed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TimeInForceSelectorBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheetKt$TimeInForceSelectorBottomSheet$1 */
    static final class C176371 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<FuturesTimeInForce, Unit> $onTimeInForceSelected;
        final /* synthetic */ Function0<Unit> $onTimeInForceSelectorDismissed;
        final /* synthetic */ FuturesOrderFormViewState.OrderFormContentData $orderFormContentData;

        /* JADX WARN: Multi-variable type inference failed */
        C176371(FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function1<? super FuturesTimeInForce, Unit> function1, Function0<Unit> function0) {
            this.$orderFormContentData = orderFormContentData;
            this.$onTimeInForceSelected = function1;
            this.$onTimeInForceSelectorDismissed = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, FuturesTimeInForce timeInForce) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            function1.invoke(timeInForce);
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            final RhModalBottomSheet5 rhModalBottomSheet5;
            boolean z;
            boolean zChanged;
            Object objRememberedValue;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(168675457, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheet.<anonymous> (TimeInForceSelectorBottomSheet.kt:27)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null);
            FuturesOrderFormViewState.OrderFormContentData orderFormContentData = this.$orderFormContentData;
            final Function1<FuturesTimeInForce, Unit> function1 = this.$onTimeInForceSelected;
            final Function0<Unit> function0 = this.$onTimeInForceSelectorDismissed;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_time_in_force_selector_title, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(Column6.INSTANCE.align(companion, companion2.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            FuturesTimeInForce timeInForce = orderFormContentData.getTimeInForce();
            StringResource gfdLabel = orderFormContentData.getGfdLabel();
            composer.startReplaceGroup(-848605772);
            String text = gfdLabel == null ? null : StringResources4.getText(gfdLabel, composer, StringResource.$stable);
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer.changed(function1);
            if ((i4 & 14) != 4) {
                if ((i4 & 8) != 0) {
                    rhModalBottomSheet5 = RhModalBottomSheet;
                    if (composer.changedInstance(rhModalBottomSheet5)) {
                    }
                    zChanged = zChanged2 | z | composer.changed(function0);
                    objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheetKt$TimeInForceSelectorBottomSheet$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TimeInForceSelectorBottomSheet.C176371.invoke$lambda$2$lambda$1$lambda$0(function1, rhModalBottomSheet5, function0, (FuturesTimeInForce) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    TimeInForceSelectionContent.TimeInForceSelectionContent(timeInForce, text, (Function1) objRememberedValue, null, false, composer, 0, 24);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                rhModalBottomSheet5 = RhModalBottomSheet;
                z = false;
                zChanged = zChanged2 | z | composer.changed(function0);
                objRememberedValue = composer.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.TimeInForceSelectorBottomSheetKt$TimeInForceSelectorBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TimeInForceSelectorBottomSheet.C176371.invoke$lambda$2$lambda$1$lambda$0(function1, rhModalBottomSheet5, function0, (FuturesTimeInForce) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TimeInForceSelectionContent.TimeInForceSelectionContent(timeInForce, text, (Function1) objRememberedValue, null, false, composer, 0, 24);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                rhModalBottomSheet5 = RhModalBottomSheet;
            }
            z = true;
            zChanged = zChanged2 | z | composer.changed(function0);
            objRememberedValue = composer.rememberedValue();
            if (zChanged) {
            }
            composer.endReplaceGroup();
            TimeInForceSelectionContent.TimeInForceSelectionContent(timeInForce, text, (Function1) objRememberedValue, null, false, composer, 0, 24);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }
    }
}
