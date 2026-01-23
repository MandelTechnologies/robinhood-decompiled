package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderEditableValueRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$4$1", m3645f = "EquityAdvancedOrderEditableValueRowComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderEditableValueRowComposableKt$EquityAdvancedOrderEditableValueRowComposable$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityAdvancedOrderEditableValueRowComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EditingField $editingField;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ FocusRequester $internalFocusRequester;
    final /* synthetic */ boolean $requireFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderEditableValueRowComposable3(boolean z, FocusRequester focusRequester, EditingField editingField, FocusManager focusManager, Continuation<? super EquityAdvancedOrderEditableValueRowComposable3> continuation) {
        super(2, continuation);
        this.$requireFocus = z;
        this.$internalFocusRequester = focusRequester;
        this.$editingField = editingField;
        this.$focusManager = focusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderEditableValueRowComposable3(this.$requireFocus, this.$internalFocusRequester, this.$editingField, this.$focusManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderEditableValueRowComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$requireFocus) {
            FocusRequester.m6497requestFocus3ESFkO8$default(this.$internalFocusRequester, 0, 1, null);
        } else if (this.$editingField == null) {
            this.$focusManager.clearFocus(true);
        }
        return Unit.INSTANCE;
    }
}
