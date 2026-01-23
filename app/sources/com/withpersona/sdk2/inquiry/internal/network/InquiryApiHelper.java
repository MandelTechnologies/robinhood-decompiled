package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState2;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker2;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper2;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper3;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper4;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper7;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper8;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper9;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.Retry2;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsData;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtils;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig2;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig3;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: InquiryApiHelper.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J0\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0080@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"J \u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"J4\u0010,\u001a\u0004\u0018\u00010+2\"\u0010-\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/\u0012\u0006\u0012\u0004\u0018\u00010\u00010.H\u0082@¢\u0006\u0002\u00102J.\u00103\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010'J\u001e\u00104\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u00105R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;", "", "applicationContext", "Landroid/content/Context;", "service", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/RealFallbackModeManager;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "deviceIdProvider", "Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;", "playIntegrityHelper", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/RealFallbackModeManager;Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper;)V", "createInquiry", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInquirySession", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResult;", "inquiryId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeOneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeCodeResult;", "oneTimeLinkCode", "updateInquiry", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquiryResult;", "sessionToken", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackResult;", "fromStep", "transitionBack$inquiry_internal_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyDeviceIntegrity", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityResult;", "updateInquiryInternal", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "makeInquiryCallWithRetry", "inquiryCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runTransitionBack", "runFallbackTransitionBack", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryApiHelper {
    private final Context applicationContext;
    private final DeviceId deviceIdProvider;
    private final RealFallbackModeManager fallbackModeManager;
    private final PlayIntegrityHelper playIntegrityHelper;
    private final SandboxFlags sandboxFlags;
    private final InquiryService service;

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {57, 73}, m3647m = "createInquiry")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$createInquiry$1 */
    static final class C436481 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C436481(Continuation<? super C436481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.createInquiry(null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {118}, m3647m = "createInquirySession")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$createInquirySession$1 */
    static final class C436491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C436491(Continuation<? super C436491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.createInquirySession(null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "exchangeOneTimeLinkCode")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$exchangeOneTimeLinkCode$1 */
    static final class C436501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C436501(Continuation<? super C436501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.exchangeOneTimeLinkCode(null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "makeInquiryCallWithRetry")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$1 */
    static final class C436511 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C436511(Continuation<? super C436511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.makeInquiryCallWithRetry(null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {369}, m3647m = "runFallbackTransitionBack")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$runFallbackTransitionBack$1 */
    static final class C436531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C436531(Continuation<? super C436531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.runFallbackTransitionBack(null, null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {340}, m3647m = "runTransitionBack")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$runTransitionBack$1 */
    static final class C436541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C436541(Continuation<? super C436541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.runTransitionBack(null, null, null, null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 201}, m3647m = "updateInquiry")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiry$1 */
    static final class C436551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C436551(Continuation<? super C436551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.updateInquiry(null, null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "updateInquiryInternal")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$1 */
    static final class C436561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C436561(Continuation<? super C436561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.updateInquiryInternal(null, null, this);
        }
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 255}, m3647m = "verifyDeviceIntegrity")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$1 */
    static final class C436571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C436571(Continuation<? super C436571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InquiryApiHelper.this.verifyDeviceIntegrity(null, null, this);
        }
    }

    public InquiryApiHelper(Context applicationContext, InquiryService service, RealFallbackModeManager fallbackModeManager, SandboxFlags sandboxFlags, DeviceId deviceIdProvider, PlayIntegrityHelper playIntegrityHelper) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(playIntegrityHelper, "playIntegrityHelper");
        this.applicationContext = applicationContext;
        this.service = service;
        this.fallbackModeManager = fallbackModeManager;
        this.sandboxFlags = sandboxFlags;
        this.deviceIdProvider = deviceIdProvider;
        this.playIntegrityHelper = playIntegrityHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        if (r15 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createInquiry(InquiryAttributes inquiryAttributes, Continuation<? super InquiryApiHelper2> continuation) {
        C436481 c436481;
        InquiryApiHelper inquiryApiHelper;
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
        if (continuation instanceof C436481) {
            c436481 = (C436481) continuation;
            int i = c436481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436481.label = i - Integer.MIN_VALUE;
            } else {
                c436481 = new C436481(continuation);
            }
        }
        Object objCreateInquiry = c436481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436481.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateInquiry);
                if (inquiryAttributes.getTemplateId() != null && !StringsKt.startsWith$default(inquiryAttributes.getTemplateId(), "itmpl_", false, 2, (Object) null)) {
                    return new InquiryApiHelper2.Error("The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1", new InternalErrorInfo.IntegrationErrorInfo("Invalid template format: " + inquiryAttributes.getTemplateId()));
                }
                if (this.fallbackModeManager.isFallbackModeActive()) {
                    this.sandboxFlags.setSandboxModeEnabled(inquiryAttributes.getEnvironment() == Environment.SANDBOX);
                    RealFallbackModeManager realFallbackModeManager = this.fallbackModeManager;
                    c436481.L$0 = this;
                    c436481.label = 1;
                    objCreateInquiry = realFallbackModeManager.createFallbackSession(inquiryAttributes, c436481);
                    if (objCreateInquiry != coroutine_suspended) {
                        inquiryApiHelper = this;
                        networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) objCreateInquiry;
                        if (networkErrorInfo != null) {
                        }
                    }
                } else {
                    InquiryService inquiryService = this.service;
                    CreateInquiryRequest createInquiryRequestCreate = CreateInquiryRequest.INSTANCE.create(inquiryAttributes.getTemplateId(), inquiryAttributes.getTemplateVersion(), CreateInquiryRequest2.toServerKey(inquiryAttributes.getEnvironment()), inquiryAttributes.getEnvironmentId(), inquiryAttributes.getAccountId(), inquiryAttributes.getReferenceId(), inquiryAttributes.getFields(), inquiryAttributes.getThemeSetId());
                    String str = this.fallbackModeManager.getFallbackMode() == FallbackMode.DEFER ? "defer" : null;
                    c436481.label = 2;
                    objCreateInquiry = inquiryService.createInquiry(createInquiryRequestCreate, str, c436481);
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateInquiry);
                Response response = (Response) objCreateInquiry;
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) objBody;
                    return new InquiryApiHelper2.Success(checkInquiryResponse.getData().getId(), checkInquiryResponse.getData().getAttributes().getNextStep(), checkInquiryResponse.getToken());
                }
                InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(response);
                return new InquiryApiHelper2.Error(errorInfo.getMessage(), errorInfo);
            }
            inquiryApiHelper = (InquiryApiHelper) c436481.L$0;
            ResultKt.throwOnFailure(objCreateInquiry);
            networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) objCreateInquiry;
            if (networkErrorInfo != null) {
                StaticTemplateSession currentSession = inquiryApiHelper.fallbackModeManager.getCurrentSession();
                if (currentSession == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String inquiryId = currentSession.getInquiryId();
                NextStep currentStep = currentSession.getCurrentStep();
                if (currentStep != null) {
                    return new InquiryApiHelper2.Success(inquiryId, currentStep, null, 4, null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            return new InquiryApiHelper2.Error(networkErrorInfo.getMessage(), networkErrorInfo);
        } catch (SocketTimeoutException e) {
            return new InquiryApiHelper2.Error("There was a problem reaching the server.", NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createInquirySession(String str, Continuation<? super InquiryApiHelper3> continuation) {
        C436491 c436491;
        InquiryApiHelper inquiryApiHelper;
        InquirySessionConfig2 inquirySessionConfig2M3226to;
        InquirySessionConfig3 inquirySessionConfig3M3227to;
        if (continuation instanceof C436491) {
            c436491 = (C436491) continuation;
            int i = c436491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436491.label = i - Integer.MIN_VALUE;
            } else {
                c436491 = new C436491(continuation);
            }
        }
        Object objCreateInquirySession = c436491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateInquirySession);
            StaticTemplateSession currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new InquiryApiHelper3.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.getDefault());
            }
            InquiryService inquiryService = this.service;
            CreateInquirySessionRequest createInquirySessionRequestCreate = CreateInquirySessionRequest.INSTANCE.create(str);
            String deviceId = this.deviceIdProvider.getDeviceId();
            c436491.L$0 = this;
            c436491.label = 1;
            objCreateInquirySession = inquiryService.createInquirySession(createInquirySessionRequestCreate, deviceId, c436491);
            if (objCreateInquirySession == coroutine_suspended) {
                return coroutine_suspended;
            }
            inquiryApiHelper = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquiryApiHelper = (InquiryApiHelper) c436491.L$0;
            ResultKt.throwOnFailure(objCreateInquirySession);
        }
        Response response = (Response) objCreateInquirySession;
        if (response.isSuccessful()) {
            String str2 = response.headers().get("persona-device-id");
            if (str2 != null) {
                inquiryApiHelper.deviceIdProvider.setDeviceId(str2);
            }
            Object objBody = response.body();
            Intrinsics.checkNotNull(objBody);
            CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) objBody;
            String playIntegrityProjectId = createInquirySessionResponse.getData().getAttributes().getPlayIntegrityProjectId();
            if (playIntegrityProjectId != null) {
                inquiryApiHelper.playIntegrityHelper.prepare(playIntegrityProjectId);
            }
            String str3 = "Bearer " + createInquirySessionResponse.getMeta().getAccessToken();
            CreateInquirySessionResponse.GpsCollectionRequirement gpsCollectionRequirement = createInquirySessionResponse.getData().getAttributes().getGpsCollectionRequirement();
            if (gpsCollectionRequirement == null || (inquirySessionConfig2M3226to = CreateInquirySessionWorker2.m3226to(gpsCollectionRequirement)) == null) {
                inquirySessionConfig2M3226to = InquirySessionConfig2.NONE;
            }
            CreateInquirySessionResponse.GpsPrecisionRequirement gpsPrecisionRequirement = createInquirySessionResponse.getData().getAttributes().getGpsPrecisionRequirement();
            if (gpsPrecisionRequirement == null || (inquirySessionConfig3M3227to = CreateInquirySessionWorker2.m3227to(gpsPrecisionRequirement)) == null) {
                inquirySessionConfig3M3227to = InquirySessionConfig3.PRECISE;
            }
            return new InquiryApiHelper3.Success(str3, new InquirySessionConfig(inquirySessionConfig2M3226to, inquirySessionConfig3M3227to, createInquirySessionResponse.getData().getAttributes().getPlayIntegrityProjectId() != null));
        }
        return new InquiryApiHelper3.Error(NetworkUtilsKt.toErrorInfo(response));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object exchangeOneTimeLinkCode(String str, Continuation<? super InquiryApiHelper4> continuation) {
        C436501 c436501;
        InquiryApiHelper inquiryApiHelper;
        Map<String, ExchangeOneTimeLinkCodeResponse.Relationship> relationships;
        ExchangeOneTimeLinkCodeResponse.Relationship relationship;
        ExchangeOneTimeLinkCodeResponse.RelationshipData data;
        if (continuation instanceof C436501) {
            c436501 = (C436501) continuation;
            int i = c436501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436501.label = i - Integer.MIN_VALUE;
            } else {
                c436501 = new C436501(continuation);
            }
        }
        Object objExchangeOneTimeLinkCode = c436501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objExchangeOneTimeLinkCode);
            InquiryService inquiryService = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            c436501.L$0 = this;
            c436501.L$1 = str;
            c436501.label = 1;
            objExchangeOneTimeLinkCode = inquiryService.exchangeOneTimeLinkCode(exchangeOneTimeLinkCodeRequest, c436501);
            if (objExchangeOneTimeLinkCode == coroutine_suspended) {
                return coroutine_suspended;
            }
            inquiryApiHelper = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c436501.L$1;
            inquiryApiHelper = (InquiryApiHelper) c436501.L$0;
            ResultKt.throwOnFailure(objExchangeOneTimeLinkCode);
        }
        Response response = (Response) objExchangeOneTimeLinkCode;
        if (response.isSuccessful()) {
            String str2 = response.headers().get("persona-device-id");
            if (str2 != null) {
                inquiryApiHelper.deviceIdProvider.setDeviceId(str2);
            }
            Object objBody = response.body();
            Intrinsics.checkNotNull(objBody);
            ExchangeOneTimeLinkCodeResponse exchangeOneTimeLinkCodeResponse = (ExchangeOneTimeLinkCodeResponse) objBody;
            ExchangeOneTimeLinkCodeResponse.Data data2 = exchangeOneTimeLinkCodeResponse.getData();
            String id = (data2 == null || (relationships = data2.getRelationships()) == null || (relationship = relationships.get("inquiry")) == null || (data = relationship.getData()) == null) ? null : data.getId();
            if (id == null) {
                return new InquiryApiHelper4.Error(new InternalErrorInfo.UnknownErrorInfo("Error exchanging one-time-code."));
            }
            ExchangeOneTimeLinkCodeResponse.Metadata meta = exchangeOneTimeLinkCodeResponse.getMeta();
            return new InquiryApiHelper4.Success(id, "Bearer " + (meta != null ? meta.getAccessToken() : null));
        }
        if (NetworkUtilsKt.toErrorInfo(response).getCode() == 404) {
            return new InquiryApiHelper4.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str));
        }
        return new InquiryApiHelper4.Error(NetworkUtilsKt.toErrorInfo(response));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInquiry(String str, InquirySessionConfig inquirySessionConfig, Continuation<? super InquiryApiHelper8> continuation) {
        C436551 c436551;
        InquiryApiHelper inquiryApiHelper;
        InquirySessionConfig inquirySessionConfig2;
        InternalErrorInfo internalErrorInfo;
        if (continuation instanceof C436551) {
            c436551 = (C436551) continuation;
            int i = c436551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436551.label = i - Integer.MIN_VALUE;
            } else {
                c436551 = new C436551(continuation);
            }
        }
        Object objVerifyDeviceIntegrity = c436551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objVerifyDeviceIntegrity);
            c436551.L$0 = this;
            c436551.L$1 = str;
            c436551.L$2 = inquirySessionConfig;
            c436551.label = 1;
            objVerifyDeviceIntegrity = verifyDeviceIntegrity(str, inquirySessionConfig, c436551);
            if (objVerifyDeviceIntegrity != coroutine_suspended) {
                inquiryApiHelper = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) c436551.L$0;
            ResultKt.throwOnFailure(objVerifyDeviceIntegrity);
            internalErrorInfo = (InternalErrorInfo) objVerifyDeviceIntegrity;
            if (internalErrorInfo == null && inquirySessionConfig2.isGpsRequired()) {
                return new InquiryApiHelper8.Error(internalErrorInfo);
            }
            return InquiryApiHelper8.Success.INSTANCE;
        }
        inquirySessionConfig = (InquirySessionConfig) c436551.L$2;
        str = (String) c436551.L$1;
        inquiryApiHelper = (InquiryApiHelper) c436551.L$0;
        ResultKt.throwOnFailure(objVerifyDeviceIntegrity);
        InquiryApiHelper9 inquiryApiHelper9 = (InquiryApiHelper9) objVerifyDeviceIntegrity;
        if (inquiryApiHelper9 instanceof InquiryApiHelper9.Error) {
            return new InquiryApiHelper8.Error(((InquiryApiHelper9.Error) inquiryApiHelper9).getCause());
        }
        c436551.L$0 = inquirySessionConfig;
        c436551.L$1 = null;
        c436551.L$2 = null;
        c436551.label = 2;
        objVerifyDeviceIntegrity = inquiryApiHelper.updateInquiryInternal(str, inquirySessionConfig, c436551);
        if (objVerifyDeviceIntegrity != coroutine_suspended) {
            inquirySessionConfig2 = inquirySessionConfig;
            internalErrorInfo = (InternalErrorInfo) objVerifyDeviceIntegrity;
            if (internalErrorInfo == null) {
            }
            return InquiryApiHelper8.Success.INSTANCE;
        }
        return coroutine_suspended;
    }

    public final Object transitionBack$inquiry_internal_release(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, Continuation<? super InquiryApiHelper7> continuation) {
        if (this.fallbackModeManager.isFallbackModeActive()) {
            return runFallbackTransitionBack(str, str3, continuation);
        }
        return runTransitionBack(str, str2, str3, inquirySessionConfig, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r9.release(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyDeviceIntegrity(String str, InquirySessionConfig inquirySessionConfig, Continuation<? super InquiryApiHelper9> continuation) {
        C436571 c436571;
        String str2;
        InquiryApiHelper inquiryApiHelper;
        InternalErrorInfo internalErrorInfo;
        if (continuation instanceof C436571) {
            c436571 = (C436571) continuation;
            int i = c436571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436571.label = i - Integer.MIN_VALUE;
            } else {
                c436571 = new C436571(continuation);
            }
        }
        Object objGenerateToken = c436571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGenerateToken);
            if (!inquirySessionConfig.getUsePlayIntegrity()) {
                return InquiryApiHelper9.Success.INSTANCE;
            }
            PlayIntegrityHelper playIntegrityHelper = this.playIntegrityHelper;
            c436571.L$0 = this;
            c436571.L$1 = str;
            c436571.label = 1;
            objGenerateToken = playIntegrityHelper.generateToken(c436571);
            if (objGenerateToken != coroutine_suspended) {
                str2 = str;
                inquiryApiHelper = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            String str3 = (String) c436571.L$1;
            InquiryApiHelper inquiryApiHelper2 = (InquiryApiHelper) c436571.L$0;
            ResultKt.throwOnFailure(objGenerateToken);
            str2 = str3;
            inquiryApiHelper = inquiryApiHelper2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGenerateToken);
                return InquiryApiHelper9.Success.INSTANCE;
            }
            inquiryApiHelper = (InquiryApiHelper) c436571.L$0;
            ResultKt.throwOnFailure(objGenerateToken);
            internalErrorInfo = (InternalErrorInfo) objGenerateToken;
            if (internalErrorInfo != null) {
                PlayIntegrityHelper playIntegrityHelper2 = inquiryApiHelper.playIntegrityHelper;
                c436571.L$0 = null;
                c436571.label = 3;
            } else {
                return new InquiryApiHelper9.Error(internalErrorInfo);
            }
        }
        String str4 = (String) objGenerateToken;
        if (str4 == null) {
            return InquiryApiHelper9.Success.INSTANCE;
        }
        InquiryApiHelper6 inquiryApiHelper6 = new InquiryApiHelper6(inquiryApiHelper, str2, str4, null);
        c436571.L$0 = inquiryApiHelper;
        c436571.L$1 = null;
        c436571.label = 2;
        objGenerateToken = inquiryApiHelper.makeInquiryCallWithRetry(inquiryApiHelper6, c436571);
        if (objGenerateToken != coroutine_suspended) {
            internalErrorInfo = (InternalErrorInfo) objGenerateToken;
            if (internalErrorInfo != null) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r15 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInquiryInternal(String str, InquirySessionConfig inquirySessionConfig, Continuation<? super InternalErrorInfo> continuation) {
        C436561 c436561;
        InquiryApiHelper inquiryApiHelper;
        String str2;
        GpsData gpsData;
        ThreatEventState threatEventState;
        String str3;
        GpsData gpsData2;
        InquiryApiHelper inquiryApiHelper2;
        if (continuation instanceof C436561) {
            c436561 = (C436561) continuation;
            int i = c436561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436561.label = i - Integer.MIN_VALUE;
            } else {
                c436561 = new C436561(continuation);
            }
        }
        Object objFirstOrNull = c436561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            GpsData locationAndPrecision = inquirySessionConfig.getGpsCollectionRequirement() != InquirySessionConfig2.NONE ? GpsUtils.getLocationAndPrecision(this.applicationContext) : null;
            Flow<ThreatEventState> threatEventFlow = ThreatEventState2.getThreatEventFlow();
            if (threatEventFlow != null) {
                c436561.L$0 = this;
                c436561.L$1 = str;
                c436561.L$2 = locationAndPrecision;
                c436561.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(threatEventFlow, c436561);
                if (objFirstOrNull != coroutine_suspended) {
                    GpsData gpsData3 = locationAndPrecision;
                    str3 = str;
                    gpsData2 = gpsData3;
                    inquiryApiHelper2 = this;
                }
                return coroutine_suspended;
            }
            inquiryApiHelper = this;
            str2 = str;
            gpsData = locationAndPrecision;
            threatEventState = null;
            if (gpsData == null) {
                Map<String, ThreatEventState.EventMetadata> eventsSeen = threatEventState != null ? threatEventState.getEventsSeen() : null;
                if (eventsSeen == null || eventsSeen.isEmpty()) {
                    return null;
                }
            }
            InquiryApiHelper5 inquiryApiHelper5 = new InquiryApiHelper5(inquiryApiHelper, str2, gpsData, threatEventState, null);
            c436561.L$0 = null;
            c436561.L$1 = null;
            c436561.L$2 = null;
            c436561.label = 2;
            objFirstOrNull = inquiryApiHelper.makeInquiryCallWithRetry(inquiryApiHelper5, c436561);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
                return (InternalErrorInfo) objFirstOrNull;
            }
            gpsData2 = (GpsData) c436561.L$2;
            str3 = (String) c436561.L$1;
            inquiryApiHelper2 = (InquiryApiHelper) c436561.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        gpsData = gpsData2;
        str2 = str3;
        threatEventState = (ThreatEventState) objFirstOrNull;
        inquiryApiHelper = inquiryApiHelper2;
        if (gpsData == null) {
        }
        InquiryApiHelper5 inquiryApiHelper52 = new InquiryApiHelper5(inquiryApiHelper, str2, gpsData, threatEventState, null);
        c436561.L$0 = null;
        c436561.L$1 = null;
        c436561.L$2 = null;
        c436561.label = 2;
        objFirstOrNull = inquiryApiHelper.makeInquiryCallWithRetry(inquiryApiHelper52, c436561);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeInquiryCallWithRetry(Function1<? super Continuation<? super Response<ResponseBody>>, ? extends Object> function1, Continuation<? super InternalErrorInfo> continuation) {
        C436511 c436511;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C436511) {
            c436511 = (C436511) continuation;
            int i = c436511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436511.label = i - Integer.MIN_VALUE;
            } else {
                c436511 = new C436511(continuation);
            }
        }
        Object obj = c436511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            C436522 c436522 = new C436522(function1, objectRef2, null);
            c436511.L$0 = objectRef2;
            c436511.label = 1;
            if (Retry2.retry(5, c436522, c436511) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c436511.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "attempt", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2 */
    static final class C436522 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function1<Continuation<? super Response<ResponseBody>>, Object> $inquiryCall;
        final /* synthetic */ Ref.ObjectRef<InternalErrorInfo> $lastError;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436522(Function1<? super Continuation<? super Response<ResponseBody>>, ? extends Object> function1, Ref.ObjectRef<InternalErrorInfo> objectRef, Continuation<? super C436522> continuation) {
            super(2, continuation);
            this.$inquiryCall = function1;
            this.$lastError = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436522 c436522 = new C436522(this.$inquiryCall, this.$lastError, continuation);
            c436522.I$0 = ((Number) obj).intValue();
            return c436522;
        }

        public final Object invoke(int i, Continuation<? super Boolean> continuation) {
            return ((C436522) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r12 == r0) goto L20;
         */
        /* JADX WARN: Type inference failed for: r12v12, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.I$0 > 0) {
                        this.label = 1;
                        if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Response response = (Response) obj;
                        if (!response.isSuccessful()) {
                            ?? errorInfo = NetworkUtilsKt.toErrorInfo(response);
                            this.$lastError.element = errorInfo;
                            return boxing.boxBoolean(errorInfo.isRecoverable());
                        }
                        this.$lastError.element = null;
                        return boxing.boxBoolean(false);
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Function1<Continuation<? super Response<ResponseBody>>, Object> function1 = this.$inquiryCall;
                this.label = 2;
                obj = function1.invoke(this);
            } catch (IOException e) {
                this.$lastError.element = new InternalErrorInfo.NetworkErrorInfo(0, e.getMessage(), true, null, 8, null);
                return boxing.boxBoolean(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runTransitionBack(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, Continuation<? super InquiryApiHelper7> continuation) {
        C436541 c436541;
        if (continuation instanceof C436541) {
            c436541 = (C436541) continuation;
            int i = c436541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436541.label = i - Integer.MIN_VALUE;
            } else {
                c436541 = new C436541(continuation);
            }
        }
        Object objTransitionBack = c436541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436541.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTransitionBack);
                InquiryService inquiryService = this.service;
                TransitionBackRequest transitionBackRequestCreate = TransitionBackRequest.INSTANCE.create(str3);
                c436541.L$0 = str;
                c436541.L$1 = inquirySessionConfig;
                c436541.label = 1;
                objTransitionBack = inquiryService.transitionBack(str, str2, transitionBackRequestCreate, c436541);
                if (objTransitionBack == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inquirySessionConfig = (InquirySessionConfig) c436541.L$1;
                str = (String) c436541.L$0;
                ResultKt.throwOnFailure(objTransitionBack);
            }
            Response response = (Response) objTransitionBack;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                return new InquiryApiHelper7.Success(Conversions4.toInquiryState((CheckInquiryResponse) objBody, str, inquirySessionConfig));
            }
            return new InquiryApiHelper7.Error(NetworkUtilsKt.toErrorInfo(response));
        } catch (SocketTimeoutException e) {
            return new InquiryApiHelper7.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFallbackTransitionBack(String str, String str2, Continuation<? super InquiryApiHelper7> continuation) {
        C436531 c436531;
        InquiryApiHelper inquiryApiHelper;
        if (continuation instanceof C436531) {
            c436531 = (C436531) continuation;
            int i = c436531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436531.label = i - Integer.MIN_VALUE;
            } else {
                c436531 = new C436531(continuation);
            }
        }
        Object objTransitionBack = c436531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436531.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTransitionBack);
                RealFallbackModeManager realFallbackModeManager = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestCreate = TransitionBackRequest.INSTANCE.create(str2);
                c436531.L$0 = this;
                c436531.label = 1;
                objTransitionBack = realFallbackModeManager.transitionBack(str, transitionBackRequestCreate, c436531);
                if (objTransitionBack == coroutine_suspended) {
                    return coroutine_suspended;
                }
                inquiryApiHelper = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inquiryApiHelper = (InquiryApiHelper) c436531.L$0;
                ResultKt.throwOnFailure(objTransitionBack);
            }
            Response response = (Response) objTransitionBack;
            StaticTemplateSession currentSession = inquiryApiHelper.fallbackModeManager.getCurrentSession();
            if (!response.isSuccessful()) {
                return new InquiryApiHelper7.Error(NetworkUtilsKt.toErrorInfo(response));
            }
            if (currentSession == null) {
                return new InquiryApiHelper7.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null."));
            }
            return new InquiryApiHelper7.Success(currentSession.currentStepAsInquiryState$inquiry_internal_release());
        } catch (SocketTimeoutException e) {
            return new InquiryApiHelper7.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
    }
}
