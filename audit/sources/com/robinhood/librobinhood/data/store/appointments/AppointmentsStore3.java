package com.robinhood.librobinhood.data.store.appointments;

import com.robinhood.models.p355ui.appointments.Appointment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AppointmentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "", "Lcom/robinhood/models/ui/appointments/Appointment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$appointmentEndpoint$2", m3645f = "AppointmentsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$appointmentEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AppointmentsStore3 extends ContinuationImpl7 implements Function3<String, Appointment, Continuation<? super Unit>, Object> {
    int label;

    AppointmentsStore3(Continuation<? super AppointmentsStore3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(String str, Appointment appointment, Continuation<? super Unit> continuation) {
        return new AppointmentsStore3(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
