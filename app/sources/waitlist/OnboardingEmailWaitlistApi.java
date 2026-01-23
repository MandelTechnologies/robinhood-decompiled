package waitlist;

import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: OnboardingEmailWaitlistApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lwaitlist/OnboardingEmailWaitlistApi;", "", "getEmailWaitlistSpot", "Lcom/robinhood/models/api/bonfire/waitlist/ApiEmailWaitlistSpot;", "waitlistName", "", "email", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public interface OnboardingEmailWaitlistApi {
    @GET("waitlist/{waitlist_name}/email/spot/")
    Object getEmailWaitlistSpot(@Path("waitlist_name") String str, @Query("email") String str2, Continuation<? super ApiEmailWaitlistSpot> continuation);
}
