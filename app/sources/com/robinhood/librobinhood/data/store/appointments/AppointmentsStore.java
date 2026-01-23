package com.robinhood.librobinhood.data.store.appointments;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.appointments.AppointmentsApi;
import com.robinhood.models.api.appointments.ApiAppointment;
import com.robinhood.models.api.appointments.ApiAppointment2;
import com.robinhood.models.api.appointments.ApiAppointmentsAvailability;
import com.robinhood.models.api.appointments.ApiAppointmentsEligibility;
import com.robinhood.models.api.appointments.ApiCreateAppointmentRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.models.p355ui.appointments.Appointment2;
import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import com.robinhood.models.p355ui.appointments.AppointmentsAvailability;
import com.robinhood.models.p355ui.appointments.AppointmentsAvailability2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: AppointmentsStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u000eJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!J(\u0010\"\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\nH\u0086@¢\u0006\u0004\b%\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/appointments/AppointmentsStore;", "Lcom/robinhood/store/Store;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/api/appointments/AppointmentsApi;", "appointmentsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/api/appointments/AppointmentsApi;Lcom/robinhood/store/StoreBundle;)V", "", "campaignId", "Lcom/robinhood/models/ui/appointments/AppointmentsAvailability;", "getAppointmentsAvailability", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getEligibility", "activeOnly", "", "Lcom/robinhood/models/ui/appointments/Appointment;", "getAppointments", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "fetchAppointment", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "pollAppointment", "(Ljava/lang/String;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "notes", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "appointmentSlot", "rescheduleAppointment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/appointments/AppointmentSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleAppointment", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/appointments/AppointmentSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancelAppointment", "Lj$/time/Clock;", "Lcom/robinhood/api/appointments/AppointmentsApi;", "Lcom/robinhood/android/moria/network/Endpoint;", "appointmentEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AppointmentsStore extends Store {
    private final Endpoint<String, Appointment> appointmentEndpoint;
    private final AppointmentsApi appointmentsApi;
    private final Clock clock;

    /* compiled from: AppointmentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore", m3645f = "AppointmentsStore.kt", m3646l = {56}, m3647m = "getAppointments")
    /* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$getAppointments$1 */
    static final class C344501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344501(Continuation<? super C344501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsStore.this.getAppointments(null, false, this);
        }
    }

    /* compiled from: AppointmentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore", m3645f = "AppointmentsStore.kt", m3646l = {39}, m3647m = "getAppointmentsAvailability")
    /* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$getAppointmentsAvailability$1 */
    static final class C344511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344511(Continuation<? super C344511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsStore.this.getAppointmentsAvailability(null, this);
        }
    }

    /* compiled from: AppointmentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore", m3645f = "AppointmentsStore.kt", m3646l = {47}, m3647m = "getEligibility")
    /* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$getEligibility$1 */
    static final class C344521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344521(Continuation<? super C344521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsStore.this.getEligibility(null, this);
        }
    }

    /* compiled from: AppointmentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore", m3645f = "AppointmentsStore.kt", m3646l = {80}, m3647m = "rescheduleAppointment")
    /* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$rescheduleAppointment$1 */
    static final class C344531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344531(Continuation<? super C344531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsStore.this.rescheduleAppointment(null, null, null, null, this);
        }
    }

    /* compiled from: AppointmentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.appointments.AppointmentsStore", m3645f = "AppointmentsStore.kt", m3646l = {99}, m3647m = "scheduleAppointment")
    /* renamed from: com.robinhood.librobinhood.data.store.appointments.AppointmentsStore$scheduleAppointment$1 */
    static final class C344541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344541(Continuation<? super C344541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppointmentsStore.this.scheduleAppointment(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppointmentsStore(Clock clock, AppointmentsApi appointmentsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appointmentsApi, "appointmentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.appointmentsApi = appointmentsApi;
        this.appointmentEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new AppointmentsStore2(this, null), storeBundle.getLogoutKillswitch(), new AppointmentsStore3(null), clock, null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAppointmentsAvailability(String str, Continuation<? super AppointmentsAvailability> continuation) {
        C344511 c344511;
        if (continuation instanceof C344511) {
            c344511 = (C344511) continuation;
            int i = c344511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344511.label = i - Integer.MIN_VALUE;
            } else {
                c344511 = new C344511(continuation);
            }
        }
        Object appointmentsAvailability = c344511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(appointmentsAvailability);
            AppointmentsApi appointmentsApi = this.appointmentsApi;
            c344511.label = 1;
            appointmentsAvailability = appointmentsApi.getAppointmentsAvailability(str, c344511);
            if (appointmentsAvailability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(appointmentsAvailability);
        }
        return AppointmentsAvailability2.toUiModel((ApiAppointmentsAvailability) appointmentsAvailability);
    }

    public static /* synthetic */ Object getEligibility$default(AppointmentsStore appointmentsStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return appointmentsStore.getEligibility(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEligibility(String str, Continuation<? super Boolean> continuation) {
        C344521 c344521;
        if (continuation instanceof C344521) {
            c344521 = (C344521) continuation;
            int i = c344521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344521.label = i - Integer.MIN_VALUE;
            } else {
                c344521 = new C344521(continuation);
            }
        }
        Object appointmentsEligibility = c344521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(appointmentsEligibility);
            AppointmentsApi appointmentsApi = this.appointmentsApi;
            c344521.label = 1;
            appointmentsEligibility = appointmentsApi.getAppointmentsEligibility(str, c344521);
            if (appointmentsEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(appointmentsEligibility);
        }
        return boxing.boxBoolean(((ApiAppointmentsEligibility) appointmentsEligibility).isEligible());
    }

    public static /* synthetic */ Object getAppointments$default(AppointmentsStore appointmentsStore, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return appointmentsStore.getAppointments(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAppointments(String str, boolean z, Continuation<? super List<Appointment>> continuation) {
        C344501 c344501;
        if (continuation instanceof C344501) {
            c344501 = (C344501) continuation;
            int i = c344501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344501.label = i - Integer.MIN_VALUE;
            } else {
                c344501 = new C344501(continuation);
            }
        }
        Object appointments = c344501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(appointments);
            AppointmentsApi appointmentsApi = this.appointmentsApi;
            c344501.label = 1;
            appointments = appointmentsApi.getAppointments(z, str, c344501);
            if (appointments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(appointments);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) appointments) {
            ApiAppointment apiAppointment = (ApiAppointment) obj;
            Instant instantNow = Instant.now(this.clock);
            if (apiAppointment.getStatus() == ApiAppointment2.SCHEDULED && apiAppointment.getStartTime().compareTo(instantNow) > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Appointment2.toUiModel((ApiAppointment) it.next()));
        }
        return arrayList2;
    }

    public final Object fetchAppointment(String str, Continuation<? super Appointment> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.appointmentEndpoint, str, null, continuation, 2, null);
    }

    public final Flow<Appointment> pollAppointment(String id, Duration duration) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return Endpoint.DefaultImpls.poll$default(this.appointmentEndpoint, id, duration, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rescheduleAppointment(String str, String str2, String str3, AppointmentSlot appointmentSlot, Continuation<? super Appointment> continuation) {
        C344531 c344531;
        if (continuation instanceof C344531) {
            c344531 = (C344531) continuation;
            int i = c344531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344531.label = i - Integer.MIN_VALUE;
            } else {
                c344531 = new C344531(continuation);
            }
        }
        Object objRescheduleAppointment = c344531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRescheduleAppointment);
            AppointmentsApi appointmentsApi = this.appointmentsApi;
            ApiCreateAppointmentRequest apiCreateAppointmentRequest = new ApiCreateAppointmentRequest(appointmentSlot.getStartTime(), appointmentSlot.getEndTime(), str3, appointmentSlot.getResources(), str2);
            c344531.label = 1;
            objRescheduleAppointment = appointmentsApi.rescheduleAppointment(str, apiCreateAppointmentRequest, c344531);
            if (objRescheduleAppointment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRescheduleAppointment);
        }
        return Appointment2.toUiModel((ApiAppointment) objRescheduleAppointment);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scheduleAppointment(String str, String str2, AppointmentSlot appointmentSlot, Continuation<? super Appointment> continuation) {
        C344541 c344541;
        if (continuation instanceof C344541) {
            c344541 = (C344541) continuation;
            int i = c344541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344541.label = i - Integer.MIN_VALUE;
            } else {
                c344541 = new C344541(continuation);
            }
        }
        Object objCreateAppointment = c344541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateAppointment);
            AppointmentsApi appointmentsApi = this.appointmentsApi;
            ApiCreateAppointmentRequest apiCreateAppointmentRequest = new ApiCreateAppointmentRequest(appointmentSlot.getStartTime(), appointmentSlot.getEndTime(), str2, appointmentSlot.getResources(), str);
            c344541.label = 1;
            objCreateAppointment = appointmentsApi.createAppointment(apiCreateAppointmentRequest, c344541);
            if (objCreateAppointment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateAppointment);
        }
        return Appointment2.toUiModel((ApiAppointment) objCreateAppointment);
    }

    public final Object cancelAppointment(String str, Continuation<? super Unit> continuation) {
        Object objCancelAppointment = this.appointmentsApi.cancelAppointment(str, continuation);
        return objCancelAppointment == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCancelAppointment : Unit.INSTANCE;
    }
}
