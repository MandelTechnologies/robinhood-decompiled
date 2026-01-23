package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TableCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class TableCell6 implements PointerInputEventHandler {
    final /* synthetic */ TableCellState.BidAsk $cellState;
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onDoubleTap;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onLongPress;
    final /* synthetic */ Function1<DragTarget, Unit> $onSelectedLegBundleDownInitiated;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onSingleTap;
    final /* synthetic */ CoroutineScope $scope;

    /* JADX WARN: Multi-variable type inference failed */
    TableCell6(Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function1<? super DragTarget, Unit> function1, TableCellState.BidAsk bidAsk, CoroutineScope coroutineScope, InteractionSource3 interactionSource3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33) {
        this.$onLongPress = function3;
        this.$onSelectedLegBundleDownInitiated = function1;
        this.$cellState = bidAsk;
        this.$scope = coroutineScope;
        this.$interactionSource = interactionSource3;
        this.$onDoubleTap = function32;
        this.$onSingleTap = function33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Function1 function1, Function3 function3, TableCellState.BidAsk bidAsk, Offset offset) {
        if (function1 != null) {
            function1.invoke(null);
        }
        if (function3 != null) {
            Boolean boolValueOf = Boolean.valueOf(bidAsk.isSelected());
            OptionLegBundleWithRowIndex legBundleWithRowIndex = bidAsk.getLegBundleWithRowIndex();
            function3.invoke(boolValueOf, legBundleWithRowIndex != null ? legBundleWithRowIndex.getLegBundle() : null, bidAsk.getDisableType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Function1 function1, Function3 function3, TableCellState.BidAsk bidAsk, Offset offset) {
        if (function1 != null) {
            function1.invoke(null);
        }
        if (function3 != null) {
            Boolean boolValueOf = Boolean.valueOf(bidAsk.getWatchlistIndicator());
            OptionLegBundleWithRowIndex legBundleWithRowIndex = bidAsk.getLegBundleWithRowIndex();
            function3.invoke(boolValueOf, legBundleWithRowIndex != null ? legBundleWithRowIndex.getLegBundle() : null, bidAsk.getDisableType());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TableCell.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1$3", m3645f = "TableCell.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1$3 */
    static final class C246283 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ InteractionSource3 $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246283(InteractionSource3 interactionSource3, Continuation<? super C246283> continuation) {
            super(3, continuation);
            this.$interactionSource = interactionSource3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
            return m17292invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m17292invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
            C246283 c246283 = new C246283(this.$interactionSource, continuation);
            c246283.L$0 = tapGestureDetector2;
            c246283.J$0 = j;
            return c246283.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r9.emit(r3, r8) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PressInteraction.Press press;
            TapGestureDetector2 tapGestureDetector2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TapGestureDetector2 tapGestureDetector22 = (TapGestureDetector2) this.L$0;
                press = new PressInteraction.Press(this.J$0, null);
                InteractionSource3 interactionSource3 = this.$interactionSource;
                this.L$0 = tapGestureDetector22;
                this.L$1 = press;
                this.label = 1;
                if (interactionSource3.emit(press, this) != coroutine_suspended) {
                    tapGestureDetector2 = tapGestureDetector22;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                press = (PressInteraction.Press) this.L$1;
                tapGestureDetector2 = (TapGestureDetector2) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                press = (PressInteraction.Press) this.L$0;
                ResultKt.throwOnFailure(obj);
                InteractionSource3 interactionSource32 = this.$interactionSource;
                PressInteraction.Release release = new PressInteraction.Release(press);
                this.L$0 = null;
                this.label = 3;
            }
            this.L$0 = press;
            this.L$1 = null;
            this.label = 2;
            if (tapGestureDetector2.tryAwaitRelease(this) != coroutine_suspended) {
                InteractionSource3 interactionSource322 = this.$interactionSource;
                PressInteraction.Release release2 = new PressInteraction.Release(press);
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Function1 function1;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function3 = this.$onLongPress;
        if (function3 != null) {
            final Function1<DragTarget, Unit> function12 = this.$onSelectedLegBundleDownInitiated;
            final TableCellState.BidAsk bidAsk = this.$cellState;
            final CoroutineScope coroutineScope = this.$scope;
            final InteractionSource3 interactionSource3 = this.$interactionSource;
            function1 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TableCell6.invoke$lambda$1$lambda$0(function12, function3, bidAsk, coroutineScope, interactionSource3, (Offset) obj);
                }
            };
        } else {
            function1 = null;
        }
        final Function1<DragTarget, Unit> function13 = this.$onSelectedLegBundleDownInitiated;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function32 = this.$onDoubleTap;
        final TableCellState.BidAsk bidAsk2 = this.$cellState;
        Function1 function14 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TableCell6.invoke$lambda$2(function13, function32, bidAsk2, (Offset) obj);
            }
        };
        C246283 c246283 = new C246283(this.$interactionSource, null);
        final Function1<DragTarget, Unit> function15 = this.$onSelectedLegBundleDownInitiated;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function33 = this.$onSingleTap;
        final TableCellState.BidAsk bidAsk3 = this.$cellState;
        Object objDetectTapGestures = TapGestureDetector4.detectTapGestures(pointerInputScope, function14, function1, c246283, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TableCell6.invoke$lambda$3(function15, function33, bidAsk3, (Offset) obj);
            }
        }, continuation);
        return objDetectTapGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Function3 function3, TableCellState.BidAsk bidAsk, CoroutineScope coroutineScope, InteractionSource3 interactionSource3, Offset offset) {
        if (function1 != null) {
            function1.invoke(null);
        }
        Boolean boolValueOf = Boolean.valueOf(bidAsk.isSelected());
        OptionLegBundleWithRowIndex legBundleWithRowIndex = bidAsk.getLegBundleWithRowIndex();
        function3.invoke(boolValueOf, legBundleWithRowIndex != null ? legBundleWithRowIndex.getLegBundle() : null, bidAsk.getDisableType());
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TableCell7(interactionSource3, offset, null), 3, null);
        return Unit.INSTANCE;
    }
}
