package com.withpersona.sdk2.inquiry.internal.network;

import android.location.Location;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsData;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionAuthorization;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionAuthorization2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: InquiryApiHelper.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", m3645f = "InquiryApiHelper.kt", m3646l = {280}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1, reason: use source file name */
/* loaded from: classes18.dex */
final class InquiryApiHelper5 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ResponseBody>>, Object> {
    final /* synthetic */ ThreatEventState $appdomeThreatEvents;
    final /* synthetic */ GpsData $gpsData;
    final /* synthetic */ String $sessionToken;
    int label;
    final /* synthetic */ InquiryApiHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InquiryApiHelper5(InquiryApiHelper inquiryApiHelper, String str, GpsData gpsData, ThreatEventState threatEventState, Continuation<? super InquiryApiHelper5> continuation) {
        super(1, continuation);
        this.this$0 = inquiryApiHelper;
        this.$sessionToken = str;
        this.$gpsData = gpsData;
        this.$appdomeThreatEvents = threatEventState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InquiryApiHelper5(this.this$0, this.$sessionToken, this.$gpsData, this.$appdomeThreatEvents, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ResponseBody>> continuation) {
        return ((InquiryApiHelper5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Map<String, ThreatEventState.EventMetadata> eventsSeen;
        GpsPrecisionAuthorization precision;
        Location location;
        Location location2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InquiryService inquiryService = this.this$0.service;
        String str = this.$sessionToken;
        UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
        GpsData gpsData = this.$gpsData;
        ArrayList arrayList = null;
        Double dBoxDouble = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : boxing.boxDouble(location2.getLatitude());
        GpsData gpsData2 = this.$gpsData;
        Double dBoxDouble2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : boxing.boxDouble(location.getLongitude());
        GpsData gpsData3 = this.$gpsData;
        String serverRequestFormat = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : GpsPrecisionAuthorization2.toServerRequestFormat(precision);
        ThreatEventState threatEventState = this.$appdomeThreatEvents;
        if (threatEventState != null && (eventsSeen = threatEventState.getEventsSeen()) != null) {
            arrayList = new ArrayList(eventsSeen.size());
            for (Map.Entry<String, ThreatEventState.EventMetadata> entry : eventsSeen.entrySet()) {
                String key = entry.getKey();
                String timestamp = entry.getValue().getTimestamp();
                String str2 = "";
                if (timestamp == null) {
                    timestamp = "";
                }
                String reasonData = entry.getValue().getReasonData();
                if (reasonData != null) {
                    str2 = reasonData;
                }
                arrayList.add(new UpdateInquirySessionRequest.AppdomeThreatEvent(key, timestamp, str2));
            }
        }
        UpdateInquirySessionRequest updateInquirySessionRequestCreateUpdateInquirySessionRequest = companion.createUpdateInquirySessionRequest(dBoxDouble2, dBoxDouble, serverRequestFormat, arrayList);
        this.label = 1;
        Object objUpdateInquiry = inquiryService.updateInquiry(str, updateInquirySessionRequestCreateUpdateInquirySessionRequest, this);
        return objUpdateInquiry == coroutine_suspended ? coroutine_suspended : objUpdateInquiry;
    }
}
