package com.robinhood.shared.documents.prism.managers;

import android.net.Uri;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiVideoSelfieAdditionalInfo;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadResponse;
import com.robinhood.shared.documents.prism.PrismExperiments5;
import com.robinhood.shared.documents.prism.utils.PrismUtils;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationManager;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismUploadManager.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J8\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lkotlinx/coroutines/CoroutineScope;)V", "uploadPrismData", "", "documentRequestId", "", "videoUri", "Landroid/net/Uri;", "photoUri", "timeSeries", "additionalInfo", "Lcom/robinhood/models/api/identi/ApiVideoSelfieAdditionalInfo;", "uploadPrismDataWithResponse", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadResponse;", "(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;Lcom/robinhood/models/api/identi/ApiVideoSelfieAdditionalInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismUploadManager {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final DeviceAttestationManager deviceAttestationManager;
    private final DocumentRequestStore documentRequestStore;
    private final ExperimentsStore experimentsStore;

    /* compiled from: PrismUploadManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.managers.PrismUploadManager", m3645f = "PrismUploadManager.kt", m3646l = {50, 53, 57}, m3647m = "uploadPrismDataWithResponse")
    /* renamed from: com.robinhood.shared.documents.prism.managers.PrismUploadManager$uploadPrismDataWithResponse$1 */
    static final class C387801 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C387801(Continuation<? super C387801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismUploadManager.this.uploadPrismDataWithResponse(null, null, null, null, null, this);
        }
    }

    public PrismUploadManager(DocumentRequestStore documentRequestStore, DeviceAttestationManager deviceAttestationManager, ExperimentsStore experimentsStore, @RootCoroutineScope CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.documentRequestStore = documentRequestStore;
        this.deviceAttestationManager = deviceAttestationManager;
        this.experimentsStore = experimentsStore;
        this.coroutineScope = coroutineScope;
    }

    /* compiled from: PrismUploadManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.managers.PrismUploadManager$uploadPrismData$1", m3645f = "PrismUploadManager.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.managers.PrismUploadManager$uploadPrismData$1 */
    static final class C387791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiVideoSelfieAdditionalInfo $additionalInfo;
        final /* synthetic */ String $documentRequestId;
        final /* synthetic */ Uri $photoUri;
        final /* synthetic */ String $timeSeries;
        final /* synthetic */ Uri $videoUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387791(String str, Uri uri, Uri uri2, String str2, ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo, Continuation<? super C387791> continuation) {
            super(2, continuation);
            this.$documentRequestId = str;
            this.$videoUri = uri;
            this.$photoUri = uri2;
            this.$timeSeries = str2;
            this.$additionalInfo = apiVideoSelfieAdditionalInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismUploadManager.this.new C387791(this.$documentRequestId, this.$videoUri, this.$photoUri, this.$timeSeries, this.$additionalInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrismUploadManager prismUploadManager = PrismUploadManager.this;
                String str = this.$documentRequestId;
                Uri uri = this.$videoUri;
                Uri uri2 = this.$photoUri;
                String str2 = this.$timeSeries;
                ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo = this.$additionalInfo;
                this.label = 1;
                if (prismUploadManager.uploadPrismDataWithResponse(str, uri, uri2, str2, apiVideoSelfieAdditionalInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void uploadPrismData(String documentRequestId, Uri videoUri, Uri photoUri, String timeSeries, ApiVideoSelfieAdditionalInfo additionalInfo) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(photoUri, "photoUri");
        Intrinsics.checkNotNullParameter(timeSeries, "timeSeries");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C387791(documentRequestId, videoUri, photoUri, timeSeries, additionalInfo, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadPrismDataWithResponse(String str, Uri uri, Uri uri2, String str2, ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo, Continuation<? super ApiVideoSelfieUploadResponse> continuation) {
        C387801 c387801;
        String str3;
        Uri uri3;
        Uri uri4;
        Object objM22650coGetState0E7RQCE$default;
        String str4;
        ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo2;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri5;
        Uri uri6;
        String path;
        Uri uri7;
        Uri uri8;
        if (continuation instanceof C387801) {
            c387801 = (C387801) continuation;
            int i = c387801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c387801.label = i - Integer.MIN_VALUE;
            } else {
                c387801 = new C387801(continuation);
            }
        }
        C387801 c3878012 = c387801;
        Object objGenerateNonce = c3878012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3878012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGenerateNonce);
            ExperimentsStore experimentsStore = this.experimentsStore;
            PrismExperiments5 prismExperiments5 = PrismExperiments5.INSTANCE;
            str3 = str;
            c3878012.L$0 = str3;
            uri3 = uri;
            c3878012.L$1 = uri3;
            uri4 = uri2;
            c3878012.L$2 = uri4;
            c3878012.L$3 = str2;
            c3878012.L$4 = apiVideoSelfieAdditionalInfo;
            c3878012.label = 1;
            objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, prismExperiments5, false, c3878012, 2, null);
            if (objM22650coGetState0E7RQCE$default != coroutine_suspended) {
                str4 = str2;
                apiVideoSelfieAdditionalInfo2 = apiVideoSelfieAdditionalInfo;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri8 = (Uri) c3878012.L$1;
                uri7 = (Uri) c3878012.L$0;
                ResultKt.throwOnFailure(objGenerateNonce);
                ApiVideoSelfieUploadResponse apiVideoSelfieUploadResponse = (ApiVideoSelfieUploadResponse) objGenerateNonce;
                PrismUtils prismUtils = PrismUtils.INSTANCE;
                prismUtils.deleteFile(uri7);
                prismUtils.deleteFile(uri8);
                return apiVideoSelfieUploadResponse;
            }
            apiVideoSelfieAdditionalInfo2 = (ApiVideoSelfieAdditionalInfo) c3878012.L$4;
            str4 = (String) c3878012.L$3;
            uri6 = (Uri) c3878012.L$2;
            uri5 = (Uri) c3878012.L$1;
            str8 = (String) c3878012.L$0;
            ResultKt.throwOnFailure(objGenerateNonce);
            String str9 = str4;
            str6 = (String) objGenerateNonce;
            str5 = str9;
            uri4 = uri6;
            uri3 = uri5;
            str7 = str8;
            ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo3 = apiVideoSelfieAdditionalInfo2;
            DocumentRequestStore documentRequestStore = this.documentRequestStore;
            path = uri3.getPath();
            if (path == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String path2 = uri4.getPath();
            if (path2 != null) {
                c3878012.L$0 = uri3;
                c3878012.L$1 = uri4;
                c3878012.L$2 = null;
                c3878012.L$3 = null;
                c3878012.L$4 = null;
                c3878012.label = 3;
                objGenerateNonce = documentRequestStore.uploadVideoSelfie(str6, str7, false, path, path2, str5, apiVideoSelfieAdditionalInfo3, c3878012);
                if (objGenerateNonce != coroutine_suspended) {
                    uri7 = uri3;
                    uri8 = uri4;
                    ApiVideoSelfieUploadResponse apiVideoSelfieUploadResponse2 = (ApiVideoSelfieUploadResponse) objGenerateNonce;
                    PrismUtils prismUtils2 = PrismUtils.INSTANCE;
                    prismUtils2.deleteFile(uri7);
                    prismUtils2.deleteFile(uri8);
                    return apiVideoSelfieUploadResponse2;
                }
                return coroutine_suspended;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        apiVideoSelfieAdditionalInfo2 = (ApiVideoSelfieAdditionalInfo) c3878012.L$4;
        str4 = (String) c3878012.L$3;
        Uri uri9 = (Uri) c3878012.L$2;
        Uri uri10 = (Uri) c3878012.L$1;
        String str10 = (String) c3878012.L$0;
        ResultKt.throwOnFailure(objGenerateNonce);
        objM22650coGetState0E7RQCE$default = ((Result) objGenerateNonce).getValue();
        uri4 = uri9;
        uri3 = uri10;
        str3 = str10;
        Boolean boolBoxBoolean = boxing.boxBoolean(false);
        if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default)) {
            objM22650coGetState0E7RQCE$default = boolBoxBoolean;
        }
        if (((Boolean) objM22650coGetState0E7RQCE$default).booleanValue() && this.deviceAttestationManager.isRegistered()) {
            DeviceAttestationManager deviceAttestationManager = this.deviceAttestationManager;
            c3878012.L$0 = str3;
            c3878012.L$1 = uri3;
            c3878012.L$2 = uri4;
            c3878012.L$3 = str4;
            c3878012.L$4 = apiVideoSelfieAdditionalInfo2;
            c3878012.label = 2;
            objGenerateNonce = deviceAttestationManager.generateNonce(c3878012);
            if (objGenerateNonce != coroutine_suspended) {
                str8 = str3;
                uri5 = uri3;
                uri6 = uri4;
                String str92 = str4;
                str6 = (String) objGenerateNonce;
                str5 = str92;
                uri4 = uri6;
                uri3 = uri5;
                str7 = str8;
                ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo32 = apiVideoSelfieAdditionalInfo2;
                DocumentRequestStore documentRequestStore2 = this.documentRequestStore;
                path = uri3.getPath();
                if (path == null) {
                }
            }
            return coroutine_suspended;
        }
        str5 = str4;
        str6 = null;
        str7 = str3;
        ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo322 = apiVideoSelfieAdditionalInfo2;
        DocumentRequestStore documentRequestStore22 = this.documentRequestStore;
        path = uri3.getPath();
        if (path == null) {
        }
    }
}
