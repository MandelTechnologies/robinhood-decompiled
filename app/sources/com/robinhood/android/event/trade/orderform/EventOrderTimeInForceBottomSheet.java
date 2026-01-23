package com.robinhood.android.event.trade.orderform;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheet;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: EventOrderTimeInForceBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"EventOrderTimeInForceBottomSheet", "", "currentTimeInForce", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "gtdDisplay", "Lcom/robinhood/utils/resource/StringResource;", "onTimeInForceSelected", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderTimeInForceBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderTimeInForceBottomSheet$lambda$0(OrderFormTimeInForce orderFormTimeInForce, StringResource stringResource, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        EventOrderTimeInForceBottomSheet(orderFormTimeInForce, stringResource, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EventOrderTimeInForceBottomSheet(final OrderFormTimeInForce orderFormTimeInForce, final StringResource stringResource, final Function1<? super OrderFormTimeInForce, Unit> onTimeInForceSelected, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onTimeInForceSelected, "onTimeInForceSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-695059525);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(orderFormTimeInForce == null ? -1 : orderFormTimeInForce.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTimeInForceSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-695059525, i2, -1, "com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheet (EventOrderTimeInForceBottomSheet.kt:29)");
            }
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(832736066, true, new C164911(stringResource, orderFormTimeInForce, onTimeInForceSelected), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderTimeInForceBottomSheet.EventOrderTimeInForceBottomSheet$lambda$0(orderFormTimeInForce, stringResource, onTimeInForceSelected, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EventOrderTimeInForceBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheetKt$EventOrderTimeInForceBottomSheet$1 */
    static final class C164911 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ OrderFormTimeInForce $currentTimeInForce;
        final /* synthetic */ StringResource $gtdDisplay;
        final /* synthetic */ Function1<OrderFormTimeInForce, Unit> $onTimeInForceSelected;

        /* JADX WARN: Multi-variable type inference failed */
        C164911(StringResource stringResource, OrderFormTimeInForce orderFormTimeInForce, Function1<? super OrderFormTimeInForce, Unit> function1) {
            this.$gtdDisplay = stringResource;
            this.$currentTimeInForce = orderFormTimeInForce;
            this.$onTimeInForceSelected = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(OrderFormTimeInForce.GTD);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1) {
            function1.invoke(OrderFormTimeInForce.IOC);
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(832736066, i, -1, "com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheet.<anonymous> (EventOrderTimeInForceBottomSheet.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
            StringResource stringResource = this.$gtdDisplay;
            OrderFormTimeInForce orderFormTimeInForce = this.$currentTimeInForce;
            final Function1<OrderFormTimeInForce, Unit> function1 = this.$onTimeInForceSelected;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16465R.string.events_time_in_force_bottom_sheet_title, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 1), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            String strStringResource = StringResources_androidKt.stringResource(C16465R.string.events_time_in_force_gtd_label, composer, 0);
            int i3 = C16465R.string.events_time_in_force_gtd_desc;
            composer.startReplaceGroup(-1625261739);
            String text = stringResource == null ? null : EventOrderFormScreen3.getText(stringResource, composer, StringResource.$stable);
            composer.endReplaceGroup();
            if (text == null) {
                text = "-";
            }
            BentoBaseRowState.Text.Plain plain = new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(i3, new Object[]{text}, composer, 0));
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, strStringResource, orderFormTimeInForce == OrderFormTimeInForce.GTD, (BentoBaseRowState.Text) plain, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion, stringResource == null, null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheetKt$EventOrderTimeInForceBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventOrderTimeInForceBottomSheet.C164911.invoke$lambda$4$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i4 = BentoSelectionRowState.$stable;
            BentoSelectionRow2.BentoSelectionRow(modifierBentoPlaceholder$default, bentoSelectionRowState, (Function0) objRememberedValue, composer, i4 << 3, 0);
            BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C16465R.string.events_time_in_force_ioc_label, composer, 0), orderFormTimeInForce == OrderFormTimeInForce.IOC, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C16465R.string.events_time_in_force_ioc_desc, composer, 0)), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderTimeInForceBottomSheetKt$EventOrderTimeInForceBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventOrderTimeInForceBottomSheet.C164911.invoke$lambda$4$lambda$3$lambda$2(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composer, i4 << 3, 1);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
