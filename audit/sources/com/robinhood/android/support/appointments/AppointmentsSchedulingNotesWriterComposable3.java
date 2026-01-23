package com.robinhood.android.support.appointments;

import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AppointmentsSchedulingNotesWriterComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$AppointmentsSchedulingNotesWriterComposable$2$1", m3645f = "AppointmentsSchedulingNotesWriterComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$AppointmentsSchedulingNotesWriterComposable$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AppointmentsSchedulingNotesWriterComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppointmentsSchedulerDuxo $duxo;
    final /* synthetic */ SnapshotState<TextFieldValue> $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppointmentsSchedulingNotesWriterComposable3(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, SnapshotState<TextFieldValue> snapshotState, Continuation<? super AppointmentsSchedulingNotesWriterComposable3> continuation) {
        super(2, continuation);
        this.$duxo = appointmentsSchedulerDuxo;
        this.$textFieldValue$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppointmentsSchedulingNotesWriterComposable3(this.$duxo, this.$textFieldValue$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppointmentsSchedulingNotesWriterComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$duxo.updateNotes(AppointmentsSchedulingNotesWriterComposable.AppointmentsSchedulingNotesWriterComposable$lambda$1(this.$textFieldValue$delegate).getText());
        return Unit.INSTANCE;
    }
}
