package com.withpersona.sdk2.inquiry.governmentid.network;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.Moshi;
import com.squareup.workflow1.Worker;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtils;
import com.withpersona.sdk2.inquiry.device.RootedDeviceUtils;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* compiled from: SubmitVerificationWorker.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\"\u0010 \u001a\u00020!*\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "context", "Landroid/content/Context;", "sessionToken", "", "inquiryId", "fromStep", "fromComponent", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;", "governmentIdRequestArguments", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "dataCollector", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "webRtcObjectId", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;)V", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "addToForm", "", CarResultComposable2.BODY, "", "Lokhttp3/MultipartBody$Part;", "Response", "Factory", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SubmitVerificationWorker implements Worker<Response> {
    private final CameraProperties cameraProperties;
    private final CameraStatsManager cameraStatsManager;
    private final Context context;
    private final DataCollector dataCollector;
    private final FallbackModeManager fallbackModeManager;
    private final String fromComponent;
    private final String fromStep;
    private final GovernmentIdRequestArguments governmentIdRequestArguments;
    private final ImageHelper imageHelper;
    private final String inquiryId;
    private final GovernmentIdService service;
    private final String sessionToken;
    private final String webRtcObjectId;

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker;", "sessionToken", "", "inquiryId", "fromComponent", "fromStep", "governmentIdRequestArguments", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "webRtcObjectId", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        SubmitVerificationWorker create(String sessionToken, String inquiryId, String fromComponent, String fromStep, GovernmentIdRequestArguments governmentIdRequestArguments, String webRtcObjectId, CameraProperties cameraProperties);
    }

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr[CameraProperties.FacingMode.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GovernmentId.Side.values().length];
            try {
                iArr2[GovernmentId.Side.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GovernmentId.Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GovernmentId.Side.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SubmitVerificationWorker(Context context, String sessionToken, String inquiryId, String fromStep, String fromComponent, GovernmentIdService service, GovernmentIdRequestArguments governmentIdRequestArguments, DataCollector dataCollector, FallbackModeManager fallbackModeManager, ImageHelper imageHelper, String str, CameraProperties cameraProperties, CameraStatsManager cameraStatsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentIdRequestArguments = governmentIdRequestArguments;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof SubmitVerificationWorker) && Intrinsics.areEqual(this.sessionToken, ((SubmitVerificationWorker) otherWorker).sessionToken);
    }

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", m3645f = "SubmitVerificationWorker.kt", m3646l = {66, 88, 106, 108, 115}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1 */
    static final class C436021 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C436021(Continuation<? super C436021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436021 c436021 = SubmitVerificationWorker.this.new C436021(continuation);
            c436021.L$0 = obj;
            return c436021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436021) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0179, code lost:
        
            if (r1.emit(r3, r14) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0195, code lost:
        
            if (r1.emit(r2, r14) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a7, code lost:
        
            if (r1.emit(r3, r14) == r0) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object objEnqueueVerificationRequestWithRetry;
            NetworkCallResult networkCallResult;
            FlowCollector flowCollector2;
            NetworkCallResult networkCallResult2;
            GovernmentIdRequestArguments governmentIdRequestArguments;
            List<GovernmentId> ids;
            GenericFileUploadErrorResponse genericFileUploadErrorResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                List listMutableListOf = CollectionsKt.mutableListOf(companion.createFormData("data[id]", SubmitVerificationWorker.this.inquiryId), companion.createFormData("data[type]", "inquiry"), companion.createFormData("meta[from_component]", SubmitVerificationWorker.this.fromComponent), companion.createFormData("meta[from_step]", SubmitVerificationWorker.this.fromStep));
                GovernmentIdRequestArguments governmentIdRequestArguments2 = SubmitVerificationWorker.this.governmentIdRequestArguments;
                if (governmentIdRequestArguments2 != null) {
                    SubmitVerificationWorker submitVerificationWorker = SubmitVerificationWorker.this;
                    submitVerificationWorker.addToForm(governmentIdRequestArguments2, listMutableListOf, submitVerificationWorker.cameraProperties);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SubmitVerificationWorker.this, listMutableListOf, null);
                this.L$0 = flowCollector;
                this.label = 1;
                objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass1, this);
                if (objEnqueueVerificationRequestWithRetry != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                networkCallResult2 = (NetworkCallResult) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    if (networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                        Intrinsics.checkNotNull(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                        ResponseBody errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                        if (errorBody != null) {
                            try {
                                genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new Moshi.Builder().add(GenericFileUploadErrorResponse.Companion.getAdapter()).build().adapter(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                            } catch (Exception unused) {
                            }
                            if (genericFileUploadErrorResponse == null) {
                                Response.FileUploadError fileUploadError = new Response.FileUploadError(genericFileUploadErrorResponse.getErrors().get(0));
                                this.L$0 = networkCallResult;
                                this.L$1 = null;
                                this.label = 3;
                            } else {
                                Response.FileUploadError fileUploadError2 = new Response.FileUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.L$0 = networkCallResult;
                                this.L$1 = null;
                                this.label = 4;
                            }
                        }
                        genericFileUploadErrorResponse = null;
                        if (genericFileUploadErrorResponse == null) {
                        }
                    } else {
                        Response.Error error = new Response.Error(networkErrorInfo);
                        this.L$0 = networkCallResult;
                        this.L$1 = null;
                        this.label = 5;
                    }
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            objEnqueueVerificationRequestWithRetry = obj;
            networkCallResult = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
            SubmitVerificationWorker submitVerificationWorker2 = SubmitVerificationWorker.this;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (!submitVerificationWorker2.dataCollector.getIsActive() && (governmentIdRequestArguments = submitVerificationWorker2.governmentIdRequestArguments) != null && (ids = governmentIdRequestArguments.getIds()) != null) {
                    Iterator<T> it = ids.iterator();
                    while (it.hasNext()) {
                        Iterator<T> it2 = ((GovernmentId) it.next()).getFrames().iterator();
                        while (it2.hasNext()) {
                            new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
                        }
                    }
                }
                Response.Success success = Response.Success.INSTANCE;
                this.L$0 = flowCollector;
                this.L$1 = networkCallResult;
                this.label = 2;
                if (flowCollector.emit(success, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    networkCallResult2 = networkCallResult;
                    networkCallResult = networkCallResult2;
                    flowCollector = flowCollector2;
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$1", m3645f = "SubmitVerificationWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 73}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<? extends Object>>, Object> {
            final /* synthetic */ List<MultipartBody.Part> $body;
            int label;
            final /* synthetic */ SubmitVerificationWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SubmitVerificationWorker submitVerificationWorker, List<MultipartBody.Part> list, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = submitVerificationWorker;
                this.$body = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$body, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<? extends Object>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return (retrofit2.Response) obj;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (retrofit2.Response) obj;
                }
                ResultKt.throwOnFailure(obj);
                if (this.this$0.fallbackModeManager.isFallbackModeActive()) {
                    FallbackModeManager fallbackModeManager = this.this$0.fallbackModeManager;
                    String str = this.this$0.sessionToken;
                    List<MultipartBody.Part> list = this.$body;
                    this.label = 1;
                    obj = fallbackModeManager.transition(str, list, this);
                } else {
                    GovernmentIdService governmentIdService = this.this$0.service;
                    String str2 = this.this$0.sessionToken;
                    String str3 = this.this$0.inquiryId;
                    List<MultipartBody.Part> list2 = this.$body;
                    this.label = 2;
                    obj = governmentIdService.transitionGovernmentVerification(str2, str3, list2, this);
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C436021(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToForm(GovernmentIdRequestArguments governmentIdRequestArguments, List<MultipartBody.Part> list, CameraProperties cameraProperties) {
        String lowerCase;
        String str;
        String str2;
        GovernmentId governmentId;
        String idClassKey;
        this.dataCollector.submit(new GovernmentIdStepData(this.fromStep, governmentIdRequestArguments.getIds()));
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        MultipartBody.Part partCreateFormData = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][label]", cameraProperties.getLabel());
        String str3 = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][facing_mode]";
        if (WhenMappings.$EnumSwitchMapping$0[cameraProperties.getFacingMode().ordinal()] == 1) {
            lowerCase = "";
        } else {
            lowerCase = cameraProperties.getFacingMode().toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        MultipartBody.Part partCreateFormData2 = companion.createFormData(str3, lowerCase);
        MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][width]", String.valueOf(cameraProperties.getSize().getWidth()));
        MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][height]", String.valueOf(cameraProperties.getSize().getHeight()));
        MultipartBody.Part partCreateFormData5 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][aspectRatio]", String.valueOf(cameraProperties.getAspectRatio()));
        MultipartBody.Part partCreateFormData6 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][frameRate]", String.valueOf(cameraProperties.getFrameRate()));
        MultipartBody.Part partCreateFormData7 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][kind]", "");
        MultipartBody.Part partCreateFormData8 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][selectedCameraIndex]", "");
        MultipartBody.Part partCreateFormData9 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][streamStability]", "");
        MultipartBody.Part partCreateFormData10 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][allCameraLabels]", "");
        String str4 = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][client]";
        if (RootedDeviceUtils.isDeviceRooted(this.context)) {
            str = "mobile";
        } else {
            str = "mobile_sdk";
        }
        MultipartBody.Part partCreateFormData11 = companion.createFormData(str4, str);
        String str5 = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][platform]";
        if (EmulatorDeviceUtils.isDeviceEmulator()) {
            str2 = "android";
        } else {
            str2 = "android_sdk";
        }
        list.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, partCreateFormData5, partCreateFormData6, partCreateFormData7, partCreateFormData8, partCreateFormData9, partCreateFormData10, partCreateFormData11, companion.createFormData(str5, str2), companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][factor]", String.valueOf(this.cameraStatsManager.getCameraStats().getAverageRotation()))}));
        List<GovernmentId> ids = governmentIdRequestArguments.getIds();
        if ((ids instanceof Collection) && ids.isEmpty()) {
            governmentId = (GovernmentId) CollectionsKt.firstOrNull((List) governmentIdRequestArguments.getIds());
            if (governmentId != null) {
                list.add(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyIdClass() + "]", idClassKey));
            }
        } else {
            Iterator<T> it = ids.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((GovernmentId) it.next()).getIdClassKey(), IdClass.KeyAutoClassification)) {
                    break;
                }
            }
            governmentId = (GovernmentId) CollectionsKt.firstOrNull((List) governmentIdRequestArguments.getIds());
            if (governmentId != null && (idClassKey = governmentId.getIdClassKey()) != null) {
                list.add(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyIdClass() + "]", idClassKey));
            }
        }
        Iterator it2 = governmentIdRequestArguments.getIds().iterator();
        while (true) {
            String str6 = "front_and_back";
            if (!it2.hasNext()) {
                if (this.webRtcObjectId != null) {
                    MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                    MultipartBody.Part partCreateFormData12 = companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][name]", "video");
                    String str7 = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][capture-method]";
                    String lowerCase2 = GovernmentIdCapture.CaptureMethod.Auto.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    list.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{partCreateFormData12, companion2.createFormData(str7, lowerCase2), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "video"), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][page]", "front_and_back"), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][objectId]", this.webRtcObjectId)}));
                    return;
                }
                return;
            }
            GovernmentId governmentId2 = (GovernmentId) it2.next();
            for (Frame frame : governmentId2.getFrames()) {
                Iterator it3 = it2;
                if (StringsKt.startsWith$default(frame.getMimeType(), "image/", false, 2, (Object) null)) {
                    this.imageHelper.resizeAndCompressImageInPlace(new File(frame.getAbsoluteFilePath()));
                }
                it2 = it3;
            }
            Iterator it4 = it2;
            int i = WhenMappings.$EnumSwitchMapping$1[governmentId2.getSide().ordinal()];
            if (i == 1) {
                str6 = "front";
            } else if (i == 2) {
                str6 = TestTags.BACK;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            MultipartBody.Part.Companion companion3 = MultipartBody.Part.INSTANCE;
            list.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][page]", str6), companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][capture_method]", governmentId2.getCaptureMethod().toString())}));
            list.addAll(addToForm$lambda$5$createFormDataForFrames(governmentIdRequestArguments, governmentId2.getFrames()));
            if (governmentId2 instanceof GovernmentId.GovernmentIdImage) {
                RawExtraction rawExtraction = ((GovernmentId.GovernmentIdImage) governmentId2).getRawExtraction();
                if (rawExtraction != null) {
                    List<MultipartBody.Part> list2 = list;
                    list2.add(companion3.createFormData("data[attributes][client-extraction-raws][][type]", rawExtraction.getType()));
                    list2.add(companion3.createFormData("data[attributes][client-extraction-raws][][value]", rawExtraction.getValue()));
                }
                list.add(companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "image"));
            } else {
                if (!(governmentId2 instanceof GovernmentId.GovernmentIdVideo)) {
                    throw new NoWhenBranchMatchedException();
                }
                list.add(companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "video"));
            }
            it2 = it4;
        }
    }

    private static final List<MultipartBody.Part> addToForm$lambda$5$createFormDataForFrames(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType())))));
        }
        return arrayList;
    }

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "", "<init>", "()V", "Success", "FileUploadError", "Error", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$FileUploadError;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$Success;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Response {
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 1775834809;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
                super(null);
            }
        }

        private Response() {
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$FileUploadError;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class FileUploadError extends Response {
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FileUploadError(GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error extends Response {
            private final InternalErrorInfo.NetworkErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo.NetworkErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo.NetworkErrorInfo getCause() {
                return this.cause;
            }
        }
    }
}
