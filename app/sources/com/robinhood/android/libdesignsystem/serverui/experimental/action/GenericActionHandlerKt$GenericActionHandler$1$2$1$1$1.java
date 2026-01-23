package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GenericActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
    final /* synthetic */ SheetState $bottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1(SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, Continuation<? super GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$bottomSheetState = sheetState;
        this.$bottomSheetContent$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1(this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SheetState sheetState = this.$bottomSheetState;
            this.label = 1;
            if (sheetState.hide(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$bottomSheetContent$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
