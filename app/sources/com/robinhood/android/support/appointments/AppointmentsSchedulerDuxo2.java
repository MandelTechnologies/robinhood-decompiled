package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AppointmentsSchedulerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$debugScreen$1", m3645f = "AppointmentsSchedulerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerDuxo$debugScreen$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AppointmentsSchedulerDuxo2 extends ContinuationImpl7 implements Function2<AppointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState>, Object> {
    final /* synthetic */ String $agentName;
    final /* synthetic */ String $notes;
    final /* synthetic */ AppointmentsSchedulerViewState6 $subScreen;
    final /* synthetic */ String $userEmail;
    final /* synthetic */ String $userNumber;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppointmentsSchedulerDuxo2(String str, String str2, String str3, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, String str4, Continuation<? super AppointmentsSchedulerDuxo2> continuation) {
        super(2, continuation);
        this.$userNumber = str;
        this.$userEmail = str2;
        this.$agentName = str3;
        this.$subScreen = appointmentsSchedulerViewState6;
        this.$notes = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppointmentsSchedulerDuxo2 appointmentsSchedulerDuxo2 = new AppointmentsSchedulerDuxo2(this.$userNumber, this.$userEmail, this.$agentName, this.$subScreen, this.$notes, continuation);
        appointmentsSchedulerDuxo2.L$0 = obj;
        return appointmentsSchedulerDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppointmentsSchedulerDataState appointmentsSchedulerDataState, Continuation<? super AppointmentsSchedulerDataState> continuation) {
        return ((AppointmentsSchedulerDuxo2) create(appointmentsSchedulerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) this.L$0;
        String str = this.$userNumber;
        String str2 = str == null ? "" : str;
        String str3 = this.$userEmail;
        return appointmentsSchedulerDataState.copy((11971 & 1) != 0 ? appointmentsSchedulerDataState.campaignId : null, (11971 & 2) != 0 ? appointmentsSchedulerDataState.userZoneId : null, (11971 & 4) != 0 ? appointmentsSchedulerDataState.userNumber : str2, (11971 & 8) != 0 ? appointmentsSchedulerDataState.userEmail : str3 == null ? "" : str3, (11971 & 16) != 0 ? appointmentsSchedulerDataState.agentName : this.$agentName, (11971 & 32) != 0 ? appointmentsSchedulerDataState.isLoading : false, (11971 & 64) != 0 ? appointmentsSchedulerDataState.isCreatingAppointment : false, (11971 & 128) != 0 ? appointmentsSchedulerDataState.timeSlots : null, (11971 & 256) != 0 ? appointmentsSchedulerDataState.currentScreen : this.$subScreen, (11971 & 512) != 0 ? appointmentsSchedulerDataState.selectedWeekIndex : null, (11971 & 1024) != 0 ? appointmentsSchedulerDataState.selectedDayOfWeekIndex : null, (11971 & 2048) != 0 ? appointmentsSchedulerDataState.selectedTimeOfDayIndex : null, (11971 & 4096) != 0 ? appointmentsSchedulerDataState.notes : this.$notes, (11971 & 8192) != 0 ? appointmentsSchedulerDataState.useCloseNavButton : false);
    }
}
