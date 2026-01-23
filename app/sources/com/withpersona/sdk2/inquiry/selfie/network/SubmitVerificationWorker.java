package com.withpersona.sdk2.inquiry.selfie.network;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtils;
import com.withpersona.sdk2.inquiry.device.RootedDeviceUtils;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.shared.DateTimeUtils;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: SubmitVerificationWorker.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B¥\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\"2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\u001a\u0010&\u001a\u00020'*\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;", "context", "Landroid/content/Context;", "sessionToken", "", "inquiryId", "selfieType", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "service", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieService;", "fromStep", "fromComponent", "fieldKeySelfie", "dataCollector", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "webRtcObjectId", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "startSelfieTimestamp", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;J)V", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "submitSelfies", "", "Response", "Factory", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SubmitVerificationWorker implements Worker<Response> {
    private final CameraProperties cameraProperties;
    private final CameraStatsManager cameraStatsManager;
    private final Context context;
    private final DataCollector dataCollector;
    private final FallbackModeManager fallbackModeManager;
    private final String fieldKeySelfie;
    private final String fromComponent;
    private final String fromStep;
    private final ImageHelper imageHelper;
    private final String inquiryId;
    private final SelfieType selfieType;
    private final List<Selfie> selfies;
    private final SelfieService service;
    private final String sessionToken;
    private final long startSelfieTimestamp;
    private final String webRtcObjectId;

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001Jn\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker;", "sessionToken", "", "inquiryId", "fromComponent", "fromStep", "selfieType", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "fieldKeySelfie", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "webRtcObjectId", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        SubmitVerificationWorker create(String sessionToken, String inquiryId, String fromComponent, String fromStep, SelfieType selfieType, String fieldKeySelfie, List<? extends Selfie> selfies, String webRtcObjectId, CameraProperties cameraProperties, long startSelfieTimestamp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubmitVerificationWorker(Context context, String sessionToken, String inquiryId, SelfieType selfieType, List<? extends Selfie> selfies, SelfieService service, String fromStep, String fromComponent, String fieldKeySelfie, DataCollector dataCollector, FallbackModeManager fallbackModeManager, ImageHelper imageHelper, String str, CameraProperties cameraProperties, CameraStatsManager cameraStatsManager, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(selfieType, "selfieType");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.selfieType = selfieType;
        this.selfies = selfies;
        this.service = service;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.fieldKeySelfie = fieldKeySelfie;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
        this.startSelfieTimestamp = j;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof SubmitVerificationWorker) && Intrinsics.areEqual(this.sessionToken, ((SubmitVerificationWorker) otherWorker).sessionToken);
    }

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", m3645f = "SubmitVerificationWorker.kt", m3646l = {EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1 */
    static final class C437451 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[Selfie.Pose.values().length];
                try {
                    iArr[Selfie.Pose.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Selfie.Pose.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Selfie.Pose.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CameraProperties.FacingMode.values().length];
                try {
                    iArr2[CameraProperties.FacingMode.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        C437451(Continuation<? super C437451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437451 c437451 = SubmitVerificationWorker.this.new C437451(continuation);
            c437451.L$0 = obj;
            return c437451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437451) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:90:0x05fa, code lost:
        
            if (r5.emit(r4, r35) == r1) goto L91;
         */
        /* JADX WARN: Removed duplicated region for block: B:89:0x05e2  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            String str;
            String lowerCase;
            String str2;
            String str3;
            Object objEnqueueVerificationRequestWithRetry;
            Iterator it;
            String str4;
            String str5;
            FlowCollector flowCollector2;
            NetworkCallResult networkCallResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                SubmitVerificationWorker submitVerificationWorker = SubmitVerificationWorker.this;
                submitVerificationWorker.submitSelfies(submitVerificationWorker.dataCollector, SubmitVerificationWorker.this.selfies);
                ArrayList arrayList = new ArrayList();
                List list = SubmitVerificationWorker.this.selfies;
                SubmitVerificationWorker submitVerificationWorker2 = SubmitVerificationWorker.this;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Selfie selfie = (Selfie) it2.next();
                    File file = new File(selfie.getAbsoluteFilePath());
                    if (selfie instanceof Selfie.SelfieImage) {
                        submitVerificationWorker2.imageHelper.resizeAndCompressImageInPlace(file);
                        RequestBody requestBodyCreate = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/*"));
                        Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) selfie;
                        int i2 = WhenMappings.$EnumSwitchMapping$0[selfieImage.getPose().ordinal()];
                        if (i2 == 1) {
                            str4 = "center_photo";
                        } else if (i2 == 2) {
                            str4 = "left_photo";
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str4 = "right_photo";
                        }
                        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                        String str6 = str4;
                        it = it2;
                        MultipartBody.Part partCreateFormData = companion.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][frames][]", file.getName(), requestBodyCreate);
                        String str7 = "data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][name]";
                        SelfieType selfieType = submitVerificationWorker2.selfieType;
                        if (Intrinsics.areEqual(selfieType, SelfieType.CenterOnly.INSTANCE)) {
                            str5 = "photo";
                        } else {
                            if (!Intrinsics.areEqual(selfieType, SelfieType.ThreePhotos.INSTANCE) && !Intrinsics.areEqual(selfieType, SelfieType.ConfigurablePoses.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str5 = str6;
                        }
                        arrayList.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{companion.createFormData(str7, str5), companion.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][capture-method]", selfieImage.getCaptureMethod().getMethod()), companion.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][captured-at]", DateTimeUtils.toIsoString(selfieImage.getCapturedTimestamp())), companion.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][type]", "image"), partCreateFormData}));
                    } else {
                        it = it2;
                        if (!(selfie instanceof Selfie.SelfieVideo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RequestBody requestBodyCreate2 = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("video/*"));
                        MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                        MultipartBody.Part partCreateFormData2 = companion2.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][frames][]", file.getName(), requestBodyCreate2);
                        arrayList.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{companion2.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][name]", "video"), companion2.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][capture-method]", ((Selfie.SelfieVideo) selfie).getCaptureMethod().getMethod()), companion2.createFormData("data[attributes][fields][" + submitVerificationWorker2.fieldKeySelfie + "][files][][type]", "video"), partCreateFormData2}));
                    }
                    it2 = it;
                }
                if (SubmitVerificationWorker.this.webRtcObjectId != null) {
                    MultipartBody.Part.Companion companion3 = MultipartBody.Part.INSTANCE;
                    arrayList.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{companion3.createFormData("data[attributes][fields][" + SubmitVerificationWorker.this.fieldKeySelfie + "][files][][name]", "video"), companion3.createFormData("data[attributes][fields][" + SubmitVerificationWorker.this.fieldKeySelfie + "][files][][capture-method]", Selfie.CaptureMethod.AUTO.getMethod()), companion3.createFormData("data[attributes][fields][" + SubmitVerificationWorker.this.fieldKeySelfie + "][files][][type]", "video"), companion3.createFormData("data[attributes][fields][" + SubmitVerificationWorker.this.fieldKeySelfie + "][files][][objectId]", SubmitVerificationWorker.this.webRtcObjectId)}));
                }
                SubmitVerificationWorker submitVerificationWorker3 = SubmitVerificationWorker.this;
                MultipartBody.Part.Companion companion4 = MultipartBody.Part.INSTANCE;
                MultipartBody.Part partCreateFormData3 = companion4.createFormData("data[id]", submitVerificationWorker3.inquiryId);
                MultipartBody.Part partCreateFormData4 = companion4.createFormData("data[type]", "inquiry");
                String str8 = "data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][type]";
                SelfieType selfieType2 = submitVerificationWorker3.selfieType;
                if (Intrinsics.areEqual(selfieType2, SelfieType.CenterOnly.INSTANCE)) {
                    str = "only_center";
                } else if (Intrinsics.areEqual(selfieType2, SelfieType.ThreePhotos.INSTANCE)) {
                    str = "profile_and_center";
                } else {
                    if (!Intrinsics.areEqual(selfieType2, SelfieType.ConfigurablePoses.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "configurable_poses";
                }
                MultipartBody.Part partCreateFormData5 = companion4.createFormData(str8, str);
                MultipartBody.Part partCreateFormData6 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][capture-started-at]", DateTimeUtils.toIsoString(submitVerificationWorker3.startSelfieTimestamp));
                MultipartBody.Part partCreateFormData7 = companion4.createFormData("meta[from_component]", submitVerificationWorker3.fromComponent);
                MultipartBody.Part partCreateFormData8 = companion4.createFormData("meta[from_step]", submitVerificationWorker3.fromStep);
                MultipartBody.Part partCreateFormData9 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][label]", submitVerificationWorker3.cameraProperties.getLabel());
                String str9 = "data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][facing_mode]";
                if (WhenMappings.$EnumSwitchMapping$1[submitVerificationWorker3.cameraProperties.getFacingMode().ordinal()] != 1) {
                    lowerCase = submitVerificationWorker3.cameraProperties.getFacingMode().toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                MultipartBody.Part partCreateFormData10 = companion4.createFormData(str9, lowerCase);
                MultipartBody.Part partCreateFormData11 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][width]", String.valueOf(submitVerificationWorker3.cameraProperties.getSize().getWidth()));
                MultipartBody.Part partCreateFormData12 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][height]", String.valueOf(submitVerificationWorker3.cameraProperties.getSize().getHeight()));
                MultipartBody.Part partCreateFormData13 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][aspectRatio]", String.valueOf(submitVerificationWorker3.cameraProperties.getAspectRatio()));
                MultipartBody.Part partCreateFormData14 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][frameRate]", String.valueOf(submitVerificationWorker3.cameraProperties.getFrameRate()));
                MultipartBody.Part partCreateFormData15 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][kind]", "");
                MultipartBody.Part partCreateFormData16 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][selectedCameraIndex]", "");
                MultipartBody.Part partCreateFormData17 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][streamStability]", "");
                MultipartBody.Part partCreateFormData18 = companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][allCameraLabels]", "");
                String str10 = "data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][client]";
                if (RootedDeviceUtils.isDeviceRooted(submitVerificationWorker3.context)) {
                    str2 = "mobile";
                } else {
                    str2 = "mobile_sdk";
                }
                MultipartBody.Part partCreateFormData19 = companion4.createFormData(str10, str2);
                String str11 = "data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][platform]";
                if (EmulatorDeviceUtils.isDeviceEmulator()) {
                    str3 = "android";
                } else {
                    str3 = "android_sdk";
                }
                arrayList.addAll(CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{partCreateFormData3, partCreateFormData4, partCreateFormData5, partCreateFormData6, partCreateFormData7, partCreateFormData8, partCreateFormData9, partCreateFormData10, partCreateFormData11, partCreateFormData12, partCreateFormData13, partCreateFormData14, partCreateFormData15, partCreateFormData16, partCreateFormData17, partCreateFormData18, partCreateFormData19, companion4.createFormData(str11, str3), companion4.createFormData("data[attributes][fields][" + submitVerificationWorker3.fieldKeySelfie + "][cameraProperties][factor]", String.valueOf(submitVerificationWorker3.cameraStatsManager.getCameraStats().getAverageRotation()))}));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SubmitVerificationWorker.this, arrayList, null);
                this.L$0 = flowCollector;
                this.label = 1;
                objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass2, this);
                if (objEnqueueVerificationRequestWithRetry != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                networkCallResult = (NetworkCallResult) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    Response.Error error = new Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            objEnqueueVerificationRequestWithRetry = obj;
            flowCollector2 = flowCollector;
            networkCallResult = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
            SubmitVerificationWorker submitVerificationWorker4 = SubmitVerificationWorker.this;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (!submitVerificationWorker4.dataCollector.getIsActive()) {
                    for (Selfie selfie2 : submitVerificationWorker4.selfies) {
                        if (selfie2 instanceof Selfie.SelfieImage) {
                            new File(((Selfie.SelfieImage) selfie2).getAbsoluteFilePath()).delete();
                        }
                    }
                }
                Response.Success success = Response.Success.INSTANCE;
                this.L$0 = flowCollector2;
                this.L$1 = networkCallResult;
                this.label = 2;
                if (flowCollector2.emit(success, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", m3645f = "SubmitVerificationWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 256}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function1<Continuation<? super retrofit2.Response<? extends Object>>, Object> {
            final /* synthetic */ List<MultipartBody.Part> $body;
            int label;
            final /* synthetic */ SubmitVerificationWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SubmitVerificationWorker submitVerificationWorker, List<MultipartBody.Part> list, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.this$0 = submitVerificationWorker;
                this.$body = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$body, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super retrofit2.Response<? extends Object>> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                    SelfieService selfieService = this.this$0.service;
                    String str2 = this.this$0.sessionToken;
                    String str3 = this.this$0.inquiryId;
                    List<MultipartBody.Part> list2 = this.$body;
                    this.label = 2;
                    obj = selfieService.transitionSelfieVerification(str2, str3, list2, this);
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C437451(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSelfies(DataCollector dataCollector, List<? extends Selfie> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Selfie.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Selfie.SelfieImage) obj2).getPose(), obj2);
        }
        dataCollector.submit(new SelfieStepData(this.fromStep, (Selfie) linkedHashMap.get(Selfie.Pose.Center), (Selfie) linkedHashMap.get(Selfie.Pose.Left), (Selfie) linkedHashMap.get(Selfie.Pose.Right)));
    }

    /* compiled from: SubmitVerificationWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response$Success;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;", "<init>", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        private Response() {
        }

        /* compiled from: SubmitVerificationWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Response {
            private final InternalErrorInfo cause;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }
    }
}
