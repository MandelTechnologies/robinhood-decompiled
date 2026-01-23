package com.robinhood.android.futures.history.p142ui.order;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.futures.history.extensions.StringResources3;
import com.robinhood.android.futures.history.p142ui.order.OrderDetailViewState;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderDetailContent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"OrderDetailContent", "", "viewState", "Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-history_externalDebug", "goldSavingsPositionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.history.ui.order.OrderDetailContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderDetailContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderDetailContent$lambda$23(OrderDetailViewState orderDetailViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderDetailContent(orderDetailViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0549  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderDetailContent(final OrderDetailViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Integer title;
        SnapshotState snapshotState;
        float f;
        BentoTheme bentoTheme;
        ?? r2;
        int i4;
        StringResource description;
        StringResource queuedOrderLabel;
        Integer orderStatusRes;
        Integer timeInForceRes;
        String submittedDateStr;
        String limitPriceStr;
        String stopPriceStr;
        StringResource filledQuantity;
        String filledTime;
        String averageFilledPrice;
        String executionPrice;
        OrderDetailViewState.Fee realizedProfitOrLoss;
        OrderDetailViewState.Fee otherFees;
        OrderDetailViewState.Fee commissionFees;
        int i5;
        StringResource goldSavings;
        int i6;
        OrderDetailViewState.Fee totalCostOrCredit;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1102620962);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1102620962, i3, -1, "com.robinhood.android.futures.history.ui.order.OrderDetailContent (OrderDetailContent.kt:34)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    modifier3 = modifier2;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    modifier3 = modifier2;
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, scrollStateRememberScrollState, false, null, false, 14, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 1, null);
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
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
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
                title = viewState.getTitle();
                composerStartRestartGroup.startReplaceGroup(-67669380);
                if (title != null) {
                    snapshotState = snapshotState2;
                    r2 = 0;
                    f = 0.0f;
                    bentoTheme = bentoTheme2;
                    i4 = i8;
                } else {
                    snapshotState = snapshotState2;
                    f = 0.0f;
                    bentoTheme = bentoTheme2;
                    r2 = 0;
                    i4 = i8;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(title.intValue(), composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                description = viewState.getDescription();
                composerStartRestartGroup.startReplaceGroup(-67659884);
                if (description != null) {
                    Composer composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources3.getText(description, composerStartRestartGroup, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer2, 0, 0, 8188);
                    composerStartRestartGroup = composer2;
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                queuedOrderLabel = viewState.getQueuedOrderLabel();
                composerStartRestartGroup.startReplaceGroup(-67646482);
                if (queuedOrderLabel != null) {
                    Composer composer3 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources3.getText(queuedOrderLabel, composerStartRestartGroup, StringResource.$stable), PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, r2), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                    composerStartRestartGroup = composer3;
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_account_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_account_futures, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, null, false, false, 4061, null);
                int i9 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i9, 6);
                orderStatusRes = viewState.getOrderStatusRes();
                composerStartRestartGroup.startReplaceGroup(-67623051);
                if (orderStatusRes != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_order_status_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(orderStatusRes.intValue(), composerStartRestartGroup, 0), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit4 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                timeInForceRes = viewState.getTimeInForceRes();
                composerStartRestartGroup.startReplaceGroup(-67611770);
                if (timeInForceRes != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_time_in_force_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(timeInForceRes.intValue(), composerStartRestartGroup, 0), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit5 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                submittedDateStr = viewState.getSubmittedDateStr();
                composerStartRestartGroup.startReplaceGroup(-67600890);
                if (submittedDateStr != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_submitted_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(submittedDateStr, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit6 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                limitPriceStr = viewState.getLimitPriceStr();
                composerStartRestartGroup.startReplaceGroup(-67590110);
                if (limitPriceStr != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_limit_price_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(limitPriceStr, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit7 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                stopPriceStr = viewState.getStopPriceStr();
                composerStartRestartGroup.startReplaceGroup(-67579489);
                if (stopPriceStr != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_stop_price_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(stopPriceStr, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit8 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                filledQuantity = viewState.getFilledQuantity();
                composerStartRestartGroup.startReplaceGroup(-67568872);
                if (filledQuantity != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_filled_quantity_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(StringResources3.getText(filledQuantity, composerStartRestartGroup, StringResource.$stable), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit9 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                filledTime = viewState.getFilledTime();
                composerStartRestartGroup.startReplaceGroup(-67557630);
                if (filledTime != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_filled_time_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(filledTime, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit10 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                averageFilledPrice = viewState.getAverageFilledPrice();
                composerStartRestartGroup.startReplaceGroup(-67546793);
                if (averageFilledPrice != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_avg_filled_price_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(averageFilledPrice, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit11 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                executionPrice = viewState.getExecutionPrice();
                composerStartRestartGroup.startReplaceGroup(-67535442);
                if (executionPrice != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_execution_price_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(executionPrice, r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit12 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                realizedProfitOrLoss = viewState.getRealizedProfitOrLoss();
                composerStartRestartGroup.startReplaceGroup(-67524227);
                if (realizedProfitOrLoss != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(realizedProfitOrLoss.getName(), composerStartRestartGroup, StringResource.$stable), r2, 2, r2), null, null, null, new AnnotatedString(realizedProfitOrLoss.getAmount(), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit13 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                otherFees = viewState.getOtherFees();
                composerStartRestartGroup.startReplaceGroup(-67514898);
                if (otherFees != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(otherFees.getName(), composerStartRestartGroup, StringResource.$stable), r2, 2, r2), null, null, null, new AnnotatedString(otherFees.getAmount(), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    Unit unit14 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                commissionFees = viewState.getCommissionFees();
                composerStartRestartGroup.startReplaceGroup(-67505874);
                if (commissionFees != null) {
                    i5 = i9;
                } else {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(commissionFees.getName(), composerStartRestartGroup, StringResource.$stable), r2, 2, r2), null, null, null, new AnnotatedString(commissionFees.getAmount(), r2, 2, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i9, 6);
                    i5 = i9;
                    Unit unit15 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                goldSavings = viewState.getGoldSavings();
                composerStartRestartGroup.startReplaceGroup(-67496490);
                if (goldSavings != null) {
                    i6 = 2;
                } else {
                    String text = StringResources3.getText(goldSavings, composerStartRestartGroup, StringResource.$stable);
                    Composer composer4 = composerStartRestartGroup;
                    TextStyle textStylePlus = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS().plus(new TextStyle(GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, OrderDetailContent$lambda$1(snapshotState), null, composer4, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null));
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer4, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i4).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
                    composer4.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        final SnapshotState snapshotState3 = snapshotState;
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.history.ui.order.OrderDetailContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OrderDetailContent.OrderDetailContent$lambda$22$lambda$20$lambda$19$lambda$18(snapshotState3, (LayoutCoordinates) obj);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue2);
                    i6 = 2;
                    BentoText2.m20747BentoText38GnDrw(text, modifierOnGloballyPositioned, null, null, null, null, null, 0, false, 0, 0, null, 0, textStylePlus, composer4, 0, 0, 8188);
                    composerStartRestartGroup = composer4;
                    Unit unit16 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                totalCostOrCredit = viewState.getTotalCostOrCredit();
                composerStartRestartGroup.startReplaceGroup(-67473234);
                if (totalCostOrCredit != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources3.getText(totalCostOrCredit.getName(), composerStartRestartGroup, StringResource.$stable), r2, i6, r2), null, null, null, new AnnotatedString(totalCostOrCredit.getAmount(), r2, i6, r2), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i5, 6);
                    Unit unit17 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.order.OrderDetailContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderDetailContent.OrderDetailContent$lambda$23(viewState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier42 = modifier3;
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier42, scrollStateRememberScrollState2, false, null, false, 14, null);
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default2, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                title = viewState.getTitle();
                composerStartRestartGroup.startReplaceGroup(-67669380);
                if (title != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                description = viewState.getDescription();
                composerStartRestartGroup.startReplaceGroup(-67659884);
                if (description != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                queuedOrderLabel = viewState.getQueuedOrderLabel();
                composerStartRestartGroup.startReplaceGroup(-67646482);
                if (queuedOrderLabel != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_account_label, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_order_detail_account_futures, composerStartRestartGroup, 0), r2, 2, r2), null, null, null, null, false, false, 4061, null);
                int i92 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, null, composerStartRestartGroup, i92, 6);
                orderStatusRes = viewState.getOrderStatusRes();
                composerStartRestartGroup.startReplaceGroup(-67623051);
                if (orderStatusRes != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                timeInForceRes = viewState.getTimeInForceRes();
                composerStartRestartGroup.startReplaceGroup(-67611770);
                if (timeInForceRes != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                submittedDateStr = viewState.getSubmittedDateStr();
                composerStartRestartGroup.startReplaceGroup(-67600890);
                if (submittedDateStr != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                limitPriceStr = viewState.getLimitPriceStr();
                composerStartRestartGroup.startReplaceGroup(-67590110);
                if (limitPriceStr != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                stopPriceStr = viewState.getStopPriceStr();
                composerStartRestartGroup.startReplaceGroup(-67579489);
                if (stopPriceStr != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                filledQuantity = viewState.getFilledQuantity();
                composerStartRestartGroup.startReplaceGroup(-67568872);
                if (filledQuantity != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                filledTime = viewState.getFilledTime();
                composerStartRestartGroup.startReplaceGroup(-67557630);
                if (filledTime != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                averageFilledPrice = viewState.getAverageFilledPrice();
                composerStartRestartGroup.startReplaceGroup(-67546793);
                if (averageFilledPrice != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                executionPrice = viewState.getExecutionPrice();
                composerStartRestartGroup.startReplaceGroup(-67535442);
                if (executionPrice != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                realizedProfitOrLoss = viewState.getRealizedProfitOrLoss();
                composerStartRestartGroup.startReplaceGroup(-67524227);
                if (realizedProfitOrLoss != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                otherFees = viewState.getOtherFees();
                composerStartRestartGroup.startReplaceGroup(-67514898);
                if (otherFees != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                commissionFees = viewState.getCommissionFees();
                composerStartRestartGroup.startReplaceGroup(-67505874);
                if (commissionFees != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                goldSavings = viewState.getGoldSavings();
                composerStartRestartGroup.startReplaceGroup(-67496490);
                if (goldSavings != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                totalCostOrCredit = viewState.getTotalCostOrCredit();
                composerStartRestartGroup.startReplaceGroup(-67473234);
                if (totalCostOrCredit != null) {
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

    private static final void OrderDetailContent$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    private static final long OrderDetailContent$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderDetailContent$lambda$22$lambda$20$lambda$19$lambda$18(SnapshotState snapshotState, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        OrderDetailContent$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoordinates));
        return Unit.INSTANCE;
    }
}
