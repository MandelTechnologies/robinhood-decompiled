package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityAdvancedOrderFragment$ComposeContent$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
    final /* synthetic */ SnapshotState4<EquityAdvancedOrderViewState> $viewState$delegate;
    final /* synthetic */ EquityAdvancedOrderFragment this$0;

    EquityAdvancedOrderFragment$ComposeContent$2$1(EquityAdvancedOrderFragment equityAdvancedOrderFragment, BentoNumpadScopeV22 bentoNumpadScopeV22, CoroutineScope coroutineScope, SnapshotState4<EquityAdvancedOrderViewState> snapshotState4) {
        this.this$0 = equityAdvancedOrderFragment;
        this.$numpadScope = bentoNumpadScopeV22;
        this.$coroutineScope = coroutineScope;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1$2 */
    static final class C152272 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ SnapshotState4<EquityAdvancedOrderViewState> $viewState$delegate;
        final /* synthetic */ EquityAdvancedOrderFragment this$0;

        C152272(EquityAdvancedOrderFragment equityAdvancedOrderFragment, BentoNumpadScopeV22 bentoNumpadScopeV22, CoroutineScope coroutineScope, SnapshotState4<EquityAdvancedOrderViewState> snapshotState4) {
            this.this$0 = equityAdvancedOrderFragment;
            this.$numpadScope = bentoNumpadScopeV22;
            this.$coroutineScope = coroutineScope;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(293745535, i, -1, "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (EquityAdvancedOrderFragment.kt:237)");
            }
            EquityAdvancedOrderNumpadState numpadState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getNumpadState();
            EquityAdvancedOrderDuxo duxo = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$1$1(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo2 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(duxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$2$1(duxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            InstrumentAccountSwitcherState accountSwitcherState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getAccountSwitcherState();
            ImmutableList<EquityOrderFormRowState> rowStates = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getRowStates();
            EquityAdvancedOrderDuxo duxo3 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$3$1(duxo3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo4 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(duxo4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$4$1(duxo4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            EquityAdvancedOrderBottomSheetState bottomSheetState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getBottomSheetState();
            EquityAdvancedOrderDuxo duxo5 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(duxo5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$5$1(duxo5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            EditingField editingField = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getEditingField();
            EquityAdvancedOrderDuxo duxo6 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(duxo6);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$6$1(duxo6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue6;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo7 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(duxo7);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new EquityAdvancedOrderFragment$ComposeContent$2$1$2$7$1(duxo7);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            Function0 function02 = (Function0) kFunction5;
            Function0 function03 = (Function0) ((KFunction) objRememberedValue7);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(this.this$0);
            final EquityAdvancedOrderFragment equityAdvancedOrderFragment = this.this$0;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderFragment$ComposeContent$2$1.C152272.invoke$lambda$8$lambda$7(equityAdvancedOrderFragment, (Tuples2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function1 function12 = (Function1) objRememberedValue8;
            composer.endReplaceGroup();
            Function1 function13 = (Function1) kFunction2;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(this.this$0);
            final EquityAdvancedOrderFragment equityAdvancedOrderFragment2 = this.this$0;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderFragment$ComposeContent$2$1.C152272.invoke$lambda$10$lambda$9(equityAdvancedOrderFragment2, (EquityOrderFormRowState.Icon.IconId) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            EquityAdvancedOrderFragment equityAdvancedOrderFragment3 = this.this$0;
            AdvancedOrderNumpadLayout.AdvancedOrderNumpadLayout(numpadState, function1, function0, function02, function03, function12, rowStates, bottomSheetState, function13, (Function1) objRememberedValue9, (Function0) kFunction3, equityAdvancedOrderFragment3, accountSwitcherState, editingField, (Function0) kFunction4, equityAdvancedOrderFragment3, this.$numpadScope, this.$coroutineScope, null, composer, StringResource.$stable | (EquityAdvancedOrderBottomSheetState.$stable << 21), (InstrumentAccountSwitcherState.$stable << 6) | (BentoNumpadScopeV22.$stable << 18), 262144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(EquityAdvancedOrderFragment equityAdvancedOrderFragment, EquityOrderFormRowState.Icon.IconId iconId) {
            Intrinsics.checkNotNullParameter(iconId, "iconId");
            equityAdvancedOrderFragment.getDuxo().handleRowIconClick$lib_equity_advanced_order_externalDebug(iconId);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(EquityAdvancedOrderFragment equityAdvancedOrderFragment, Tuples2 tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            equityAdvancedOrderFragment.getDuxo().handleNumberChange((BigDecimal) tuples2.component1(), (EditingField) tuples2.component2());
            return Unit.INSTANCE;
        }
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2053674591, i, -1, "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment.ComposeContent.<anonymous>.<anonymous> (EquityAdvancedOrderFragment.kt:230)");
        }
        if (EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getAdvancedOrderSubmissionExperimentMember()) {
            composer.startReplaceGroup(789547901);
            OrderForm6 orderFormState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getOrderFormState();
            EquityOrderContext equityOrderContext = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getEquityOrderContext();
            EquityAdvancedOrderDuxo duxo = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EquityAdvancedOrderFragment$ComposeContent$2$1$1$1(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposableSingletons$EquityAdvancedOrderFragmentKt composableSingletons$EquityAdvancedOrderFragmentKt = ComposableSingletons$EquityAdvancedOrderFragmentKt.INSTANCE;
            OrderForm2.m26341OrderFormVzGUr2s(orderFormState, equityOrderContext, (Function1) ((KFunction) objRememberedValue), composableSingletons$EquityAdvancedOrderFragmentKt.m13724getLambda$1052008672$lib_equity_advanced_order_externalDebug(), ComposableLambda3.rememberComposableLambda(293745535, true, new C152272(this.this$0, this.$numpadScope, this.$coroutineScope, this.$viewState$delegate), composer, 54), composableSingletons$EquityAdvancedOrderFragmentKt.getLambda$1639499742$lib_equity_advanced_order_externalDebug(), companion, composableSingletons$EquityAdvancedOrderFragmentKt.getLambda$521334867$lib_equity_advanced_order_externalDebug(), null, false, null, 0L, 0L, null, null, null, composer, (EquityOrderContext.$stable << 3) | 14380032, 6, 64256);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(792224751);
            EquityAdvancedOrderNumpadState numpadState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getNumpadState();
            EquityAdvancedOrderDuxo duxo2 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(duxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new EquityAdvancedOrderFragment$ComposeContent$2$1$3$1(duxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo3 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new EquityAdvancedOrderFragment$ComposeContent$2$1$4$1(duxo3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            InstrumentAccountSwitcherState accountSwitcherState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getAccountSwitcherState();
            ImmutableList<EquityOrderFormRowState> rowStates = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getRowStates();
            EquityAdvancedOrderDuxo duxo4 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(duxo4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new EquityAdvancedOrderFragment$ComposeContent$2$1$5$1(duxo4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo5 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(duxo5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new EquityAdvancedOrderFragment$ComposeContent$2$1$6$1(duxo5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            EquityAdvancedOrderBottomSheetState bottomSheetState = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getBottomSheetState();
            EquityAdvancedOrderDuxo duxo6 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(duxo6);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new EquityAdvancedOrderFragment$ComposeContent$2$1$7$1(duxo6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue6;
            composer.endReplaceGroup();
            EditingField editingField = EquityAdvancedOrderFragment.ComposeContent$lambda$1(this.$viewState$delegate).getEditingField();
            EquityAdvancedOrderDuxo duxo7 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(duxo7);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new EquityAdvancedOrderFragment$ComposeContent$2$1$8$1(duxo7);
                composer.updateRememberedValue(objRememberedValue7);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue7;
            composer.endReplaceGroup();
            EquityAdvancedOrderDuxo duxo8 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(duxo8);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new EquityAdvancedOrderFragment$ComposeContent$2$1$9$1(duxo8);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            Function0 function02 = (Function0) kFunction5;
            Function0 function03 = (Function0) ((KFunction) objRememberedValue8);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(this.this$0);
            final EquityAdvancedOrderFragment equityAdvancedOrderFragment = this.this$0;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderFragment$ComposeContent$2$1.invoke$lambda$9$lambda$8(equityAdvancedOrderFragment, (Tuples2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            Function1 function12 = (Function1) objRememberedValue9;
            composer.endReplaceGroup();
            Function1 function13 = (Function1) kFunction2;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer.changedInstance(this.this$0);
            final EquityAdvancedOrderFragment equityAdvancedOrderFragment2 = this.this$0;
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderFragment$ComposeContent$2$1.invoke$lambda$11$lambda$10(equityAdvancedOrderFragment2, (EquityOrderFormRowState.Icon.IconId) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceGroup();
            EquityAdvancedOrderFragment equityAdvancedOrderFragment3 = this.this$0;
            AdvancedOrderNumpadLayout.AdvancedOrderNumpadLayout(numpadState, function1, function0, function02, function03, function12, rowStates, bottomSheetState, function13, (Function1) objRememberedValue10, (Function0) kFunction3, equityAdvancedOrderFragment3, accountSwitcherState, editingField, (Function0) kFunction4, equityAdvancedOrderFragment3, this.$numpadScope, this.$coroutineScope, null, composer, StringResource.$stable | (EquityAdvancedOrderBottomSheetState.$stable << 21), (InstrumentAccountSwitcherState.$stable << 6) | (BentoNumpadScopeV22.$stable << 18), 262144);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(EquityAdvancedOrderFragment equityAdvancedOrderFragment, EquityOrderFormRowState.Icon.IconId iconId) {
        Intrinsics.checkNotNullParameter(iconId, "iconId");
        equityAdvancedOrderFragment.getDuxo().handleRowIconClick$lib_equity_advanced_order_externalDebug(iconId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(EquityAdvancedOrderFragment equityAdvancedOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        equityAdvancedOrderFragment.getDuxo().handleNumberChange((BigDecimal) tuples2.component1(), (EditingField) tuples2.component2());
        return Unit.INSTANCE;
    }
}
