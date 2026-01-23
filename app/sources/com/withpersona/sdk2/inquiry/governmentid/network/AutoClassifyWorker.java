package com.withpersona.sdk2.inquiry.governmentid.network;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonClass;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.TextExtractor;
import com.withpersona.sdk2.inquiry.governmentid.Conversions3;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: AutoClassifyWorker.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0018\u001a\u00020\u00132\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;", "sessionToken", "", "inquiryId", "fromStep", "fromComponent", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "supplementaryData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "idFrontAnalyzer", "Lcom/withpersona/sdk2/camera/TextExtractor;", "doesSameWorkAs", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "to", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Factory", "Response", "AutoClassificationResult", "SupplementaryData", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class AutoClassifyWorker implements Worker<Response> {
    private final long defaultManualCaptureDelayMs;
    private final boolean extractTextFromImage;
    private final String fromComponent;
    private final String fromStep;
    private final GovernmentId governmentId;
    private final TextExtractor idFrontAnalyzer;
    private final ImageHelper imageHelper;
    private final String inquiryId;
    private final GovernmentIdService service;
    private final String sessionToken;
    private final SupplementaryData supplementaryData;

    /* compiled from: AutoClassifyWorker.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "<init>", "()V", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SupplementaryData {
    }

    public AutoClassifyWorker(String sessionToken, String inquiryId, String fromStep, String fromComponent, GovernmentIdService service, GovernmentId governmentId, ImageHelper imageHelper, SupplementaryData supplementaryData, long j, boolean z) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(governmentId, "governmentId");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentId = governmentId;
        this.imageHelper = imageHelper;
        this.supplementaryData = supplementaryData;
        this.defaultManualCaptureDelayMs = j;
        this.extractTextFromImage = z;
        this.idFrontAnalyzer = new TextExtractor();
    }

    /* compiled from: AutoClassifyWorker.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Factory;", "", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "sessionToken", "", "inquiryId", "fromStep", "fromComponent", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "supplementaryData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final ImageHelper imageHelper;
        private final GovernmentIdService service;

        public Factory(GovernmentIdService service, ImageHelper imageHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
            this.service = service;
            this.imageHelper = imageHelper;
        }

        public final AutoClassifyWorker create(String sessionToken, String inquiryId, String fromStep, String fromComponent, GovernmentId governmentId, SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(governmentId, "governmentId");
            Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.areEqual(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    /* compiled from: AutoClassifyWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", m3645f = "AutoClassifyWorker.kt", m3646l = {125, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 156, 165, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1 */
    static final class C436011 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C436011(Continuation<? super C436011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436011 c436011 = AutoClassifyWorker.this.new C436011(continuation);
            c436011.L$0 = obj;
            return c436011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436011) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0135, code lost:
        
            if (r1.emit(r4, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0139, code lost:
        
            r2 = r1;
            r1 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0158, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01e4, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0203, code lost:
        
            if (r1.emit(r4, r12) == r0) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01e7 A[PHI: r1 r13
          0x01e7: PHI (r1v12 kotlinx.coroutines.flow.FlowCollector) = (r1v8 kotlinx.coroutines.flow.FlowCollector), (r1v14 kotlinx.coroutines.flow.FlowCollector) binds: [B:20:0x00fa, B:31:0x013b] A[DONT_GENERATE, DONT_INLINE]
          0x01e7: PHI (r13v7 com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) = 
          (r13v5 com.withpersona.sdk2.inquiry.network.core.NetworkCallResult)
          (r13v10 com.withpersona.sdk2.inquiry.network.core.NetworkCallResult)
         binds: [B:20:0x00fa, B:31:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            NetworkCallResult networkCallResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    List listMutableListOf = CollectionsKt.mutableListOf(companion.createFormData("data[id]", AutoClassifyWorker.this.inquiryId), companion.createFormData("data[type]", "inquiry"), companion.createFormData("meta[from_component]", AutoClassifyWorker.this.fromComponent), companion.createFormData("meta[from_step]", AutoClassifyWorker.this.fromStep));
                    List<Frame> frames = AutoClassifyWorker.this.governmentId.getFrames();
                    AutoClassifyWorker autoClassifyWorker = AutoClassifyWorker.this;
                    for (Frame frame : frames) {
                        if (StringsKt.startsWith$default(frame.getMimeType(), "image/", false, 2, (Object) null)) {
                            autoClassifyWorker.imageHelper.resizeAndCompressImageInPlace(new File(frame.getAbsoluteFilePath()));
                        }
                    }
                    listMutableListOf.addAll(CollectionsKt.listOf(MultipartBody.Part.INSTANCE.createFormData("data[attributes][files][][capture_method]", AutoClassifyWorker.this.governmentId.getCaptureMethod().toString())));
                    AutoClassifyWorker autoClassifyWorker2 = AutoClassifyWorker.this;
                    invokeSuspend$addFormDataForFrame(listMutableListOf, autoClassifyWorker2, (Frame) CollectionsKt.first((List) autoClassifyWorker2.governmentId.getFrames()));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(AutoClassifyWorker.this, listMutableListOf, null);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass2, this);
                    if (objEnqueueVerificationRequestWithRetry != coroutine_suspended) {
                        flowCollector = flowCollector2;
                        obj = objEnqueueVerificationRequestWithRetry;
                        networkCallResult = (NetworkCallResult) obj;
                        AutoClassifyWorker autoClassifyWorker3 = AutoClassifyWorker.this;
                        if (networkCallResult instanceof NetworkCallResult.Success) {
                            AutoClassifyResponse autoClassifyResponse = (AutoClassifyResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                            if (autoClassifyResponse != null) {
                                if (autoClassifyResponse instanceof AutoClassifyResponse.IdAcceptedResponse) {
                                    AutoClassifyResponse.IdAcceptedResponse idAcceptedResponse = (AutoClassifyResponse.IdAcceptedResponse) autoClassifyResponse;
                                    IdConfig idConfig = Conversions3.toIdConfig(idAcceptedResponse.getIdConfig(), idAcceptedResponse.getCountryCode(), autoClassifyWorker3.defaultManualCaptureDelayMs);
                                    if (idConfig == null) {
                                        Response.Error error = new Response.Error(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                                        this.L$0 = flowCollector;
                                        this.L$1 = networkCallResult;
                                        this.label = 2;
                                        break;
                                    } else {
                                        Response.Success success = new Response.Success(new AutoClassificationResult.IdClassifySuccess(idAcceptedResponse.getCountryCode(), idConfig));
                                        this.L$0 = flowCollector;
                                        this.L$1 = networkCallResult;
                                        this.label = 3;
                                        break;
                                    }
                                } else if (autoClassifyResponse instanceof AutoClassifyResponse.ClassificationFailedResponse) {
                                    Response.Success success2 = new Response.Success(new AutoClassificationResult.UnableToClassify(autoClassifyWorker3.m3222to(((AutoClassifyResponse.ClassificationFailedResponse) autoClassifyResponse).getIdClassesByCountries())));
                                    this.L$0 = flowCollector;
                                    this.L$1 = networkCallResult;
                                    this.label = 4;
                                    break;
                                } else if (autoClassifyResponse instanceof AutoClassifyResponse.IdRejectedResponse) {
                                    Response.Success success3 = new Response.Success(new AutoClassificationResult.IdTypeRejected(autoClassifyWorker3.m3222to(((AutoClassifyResponse.IdRejectedResponse) autoClassifyResponse).getIdClassesByCountries())));
                                    this.L$0 = flowCollector;
                                    this.L$1 = networkCallResult;
                                    this.label = 5;
                                    break;
                                } else {
                                    if (!Intrinsics.areEqual(autoClassifyResponse, AutoClassifyResponse.Unknown.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Response.Error error2 = new Response.Error(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                                    this.L$0 = flowCollector;
                                    this.L$1 = networkCallResult;
                                    this.label = 6;
                                    break;
                                }
                            } else {
                                Response.Error error3 = new Response.Error(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                                this.L$0 = flowCollector;
                                this.L$1 = networkCallResult;
                                this.label = 7;
                                break;
                            }
                            networkCallResult = networkCallResult;
                            flowCollector = flowCollector;
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                            Response.Error error4 = new Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                            this.L$0 = networkCallResult;
                            this.L$1 = null;
                            this.label = 8;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 1:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    networkCallResult = (NetworkCallResult) obj;
                    AutoClassifyWorker autoClassifyWorker32 = AutoClassifyWorker.this;
                    if (networkCallResult instanceof NetworkCallResult.Success) {
                    }
                    return coroutine_suspended;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    NetworkCallResult networkCallResult2 = (NetworkCallResult) this.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    networkCallResult = networkCallResult2;
                    flowCollector = flowCollector3;
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private static final void invokeSuspend$addFormDataForFrame(List<MultipartBody.Part> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strExtractText;
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            list.add(companion.createFormData("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strExtractText = autoClassifyWorker.idFrontAnalyzer.extractText(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.createFormData("data[attributes][client_extracted_text]", strExtractText));
        }

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", m3645f = "AutoClassifyWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<AutoClassifyResponse>>, Object> {
            final /* synthetic */ List<MultipartBody.Part> $body;
            int label;
            final /* synthetic */ AutoClassifyWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AutoClassifyWorker autoClassifyWorker, List<MultipartBody.Part> list, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.this$0 = autoClassifyWorker;
                this.$body = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$body, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<AutoClassifyResponse>> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
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
                GovernmentIdService governmentIdService = this.this$0.service;
                String str = this.this$0.sessionToken;
                String str2 = this.this$0.inquiryId;
                List<MultipartBody.Part> list = this.$body;
                SupplementaryData supplementaryData = this.this$0.supplementaryData;
                this.label = 1;
                Object objAutoClassifyGovernmentId = governmentIdService.autoClassifyGovernmentId(str, str2, list, supplementaryData, this);
                return objAutoClassifyGovernmentId == coroutine_suspended ? coroutine_suspended : objAutoClassifyGovernmentId;
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flowOn(FlowKt.flow(new C436011(null)), Dispatchers.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: to */
    public final List<IdConfigForCountry> m3222to(List<AutoClassifyResponse.IdClassesForCountry> list) {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String countryName = idClassesForCountry.getCountryName();
            String countryCode = idClassesForCountry.getCountryCode();
            List<Id> idConfigs = idClassesForCountry.getIdConfigs();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = idConfigs.iterator();
            while (it.hasNext()) {
                IdConfig idConfig = Conversions3.toIdConfig((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfig != null) {
                    arrayList2.add(idConfig);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    /* compiled from: AutoClassifyWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;", "", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response$Success;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Response {

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;", "autoClassificationResult", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;)V", "getAutoClassificationResult", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success implements Response {
            private final AutoClassificationResult autoClassificationResult;

            public Success(AutoClassificationResult autoClassificationResult) {
                Intrinsics.checkNotNullParameter(autoClassificationResult, "autoClassificationResult");
                this.autoClassificationResult = autoClassificationResult;
            }

            public final AutoClassificationResult getAutoClassificationResult() {
                return this.autoClassificationResult;
            }
        }

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error implements Response {
            private final InternalErrorInfo cause;

            public Error(InternalErrorInfo cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }
    }

    /* compiled from: AutoClassifyWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "", "IdClassifySuccess", "IdTypeRejected", "UnableToClassify", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$IdClassifySuccess;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$IdTypeRejected;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$UnableToClassify;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface AutoClassificationResult {

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$IdClassifySuccess;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class IdClassifySuccess implements AutoClassificationResult {
            private final String countryCode;
            private final IdConfig idConfig;

            public IdClassifySuccess(String countryCode, IdConfig idConfig) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(idConfig, "idConfig");
                this.countryCode = countryCode;
                this.idConfig = idConfig;
            }

            public final IdConfig getIdConfig() {
                return this.idConfig;
            }
        }

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$IdTypeRejected;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "idClassesPerCountry", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "<init>", "(Ljava/util/List;)V", "getIdClassesPerCountry", "()Ljava/util/List;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class IdTypeRejected implements AutoClassificationResult {
            private final List<IdConfigForCountry> idClassesPerCountry;

            public IdTypeRejected(List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            public final List<IdConfigForCountry> getIdClassesPerCountry() {
                return this.idClassesPerCountry;
            }
        }

        /* compiled from: AutoClassifyWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult$UnableToClassify;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$AutoClassificationResult;", "idClassesPerCountry", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "<init>", "(Ljava/util/List;)V", "getIdClassesPerCountry", "()Ljava/util/List;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class UnableToClassify implements AutoClassificationResult {
            private final List<IdConfigForCountry> idClassesPerCountry;

            public UnableToClassify(List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            public final List<IdConfigForCountry> getIdClassesPerCountry() {
                return this.idClassesPerCountry;
            }
        }
    }
}
