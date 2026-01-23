package com.robinhood.api.appointments;

import com.robinhood.models.api.appointments.ApiAppointment;
import com.robinhood.models.api.appointments.ApiAppointmentsAvailability;
import com.robinhood.models.api.appointments.ApiAppointmentsEligibility;
import com.robinhood.models.api.appointments.ApiCreateAppointmentRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AppointmentsApi.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/api/appointments/AppointmentsApi;", "", "getAppointmentsEligibility", "Lcom/robinhood/models/api/appointments/ApiAppointmentsEligibility;", "campaignId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppointmentsAvailability", "Lcom/robinhood/models/api/appointments/ApiAppointmentsAvailability;", "getAppointments", "", "Lcom/robinhood/models/api/appointments/ApiAppointment;", "activeOnly", "", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppointment", "appointmentId", "createAppointment", "request", "Lcom/robinhood/models/api/appointments/ApiCreateAppointmentRequest;", "(Lcom/robinhood/models/api/appointments/ApiCreateAppointmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rescheduleAppointment", "(Ljava/lang/String;Lcom/robinhood/models/api/appointments/ApiCreateAppointmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAppointment", "", "lib-api-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface AppointmentsApi {
    @DELETE("appointments/{appointment_id}/")
    Object cancelAppointment(@Path("appointment_id") String str, Continuation<? super Unit> continuation);

    @POST("appointments/")
    Object createAppointment(@Body ApiCreateAppointmentRequest apiCreateAppointmentRequest, Continuation<? super ApiAppointment> continuation);

    @GET("appointments/{appointment_id}/")
    Object getAppointment(@Path("appointment_id") String str, Continuation<? super ApiAppointment> continuation);

    @GET("appointments/")
    Object getAppointments(@Query("active_only") boolean z, @Query("campaign_id") String str, Continuation<? super List<ApiAppointment>> continuation);

    @GET("appointments/availability/")
    Object getAppointmentsAvailability(@Query("campaign_id") String str, Continuation<? super ApiAppointmentsAvailability> continuation);

    @GET("appointments/eligibility/")
    Object getAppointmentsEligibility(@Query("campaign_id") String str, Continuation<? super ApiAppointmentsEligibility> continuation);

    @PATCH("appointments/{appointment_id}/")
    Object rescheduleAppointment(@Path("appointment_id") String str, @Body ApiCreateAppointmentRequest apiCreateAppointmentRequest, Continuation<? super ApiAppointment> continuation);

    /* compiled from: AppointmentsApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAppointmentsEligibility$default(AppointmentsApi appointmentsApi, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppointmentsEligibility");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return appointmentsApi.getAppointmentsEligibility(str, continuation);
        }

        public static /* synthetic */ Object getAppointments$default(AppointmentsApi appointmentsApi, boolean z, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppointments");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return appointmentsApi.getAppointments(z, str, continuation);
        }
    }
}
