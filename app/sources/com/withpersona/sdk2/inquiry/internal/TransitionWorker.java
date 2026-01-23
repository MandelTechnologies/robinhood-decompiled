package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.Conversions4;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.TransitionInquiryRequest;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TransitionWorker.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bBI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;", "sessionToken", "", "inquiryId", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "service", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;)V", "getSessionToken", "()Ljava/lang/String;", "getInquiryId", "run", "Lkotlinx/coroutines/flow/Flow;", "runTransition", "runFallbackTransition", "Response", "TransitionData", "Factory", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TransitionWorker implements Worker<Response> {
    private final FallbackModeManager fallbackModeManager;
    private final String inquiryId;
    private final InquirySessionConfig inquirySessionConfig;
    private final InquiryService service;
    private final String sessionToken;
    private final TransitionData transitionData;
    private final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;", "sessionToken", "", "inquiryId", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        TransitionWorker create(String sessionToken, String inquiryId, InquirySessionConfig inquirySessionConfig, TransitionData transitionData);
    }

    public TransitionWorker(String sessionToken, String inquiryId, InquirySessionConfig inquirySessionConfig, TransitionData transitionData, InquiryService service, FallbackModeManager fallbackModeManager, UiStepSavedStateHelper uiStepSavedStateHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(transitionData, "transitionData");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.inquirySessionConfig = inquirySessionConfig;
        this.transitionData = transitionData;
        this.service = service;
        this.fallbackModeManager = fallbackModeManager;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getInquiryId() {
        return this.inquiryId;
    }

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", m3645f = "TransitionWorker.kt", m3646l = {35, 37}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1 */
    static final class C436271 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C436271(Continuation<? super C436271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436271 c436271 = TransitionWorker.this.new C436271(continuation);
            c436271.L$0 = obj;
            return c436271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436271) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (TransitionWorker.this.fallbackModeManager.isFallbackModeActive()) {
                    Flow flowRunFallbackTransition = TransitionWorker.this.runFallbackTransition();
                    this.label = 1;
                } else {
                    Flow flowRunTransition = TransitionWorker.this.runTransition();
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C436271(null));
    }

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", m3645f = "TransitionWorker.kt", m3646l = {42, 52, 55, 67}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1 */
    static final class C436291 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C436291(Continuation<? super C436291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436291 c436291 = TransitionWorker.this.new C436291(continuation);
            c436291.L$0 = obj;
            return c436291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436291) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            if (r1.emit(r2, r14) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
        
            if (r3.emit(r1, r14) == r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            retrofit2.Response response;
            Object objBody;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                InquiryService inquiryService = TransitionWorker.this.service;
                String sessionToken = TransitionWorker.this.getSessionToken();
                String inquiryId = TransitionWorker.this.getInquiryId();
                TransitionInquiryRequest transitionInquiryRequestCreate = TransitionInquiryRequest.INSTANCE.create(TransitionWorker.this.transitionData.getFromComponent(), TransitionWorker.this.transitionData.getComponentParams(), TransitionWorker.this.transitionData.getFromStep());
                this.L$0 = flowCollector3;
                this.label = 1;
                Object objTransition = inquiryService.transition(sessionToken, inquiryId, transitionInquiryRequestCreate, this);
                if (objTransition != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    obj = objTransition;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        response = (retrofit2.Response) this.L$1;
                        flowCollector2 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objBody = response.body();
                        if (objBody != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) objBody;
                        Response.Success success = new Response.Success(checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig().getPollingMode() == CheckInquiryResponse.PollingMode.None ? Conversions4.toInquiryState(checkInquiryResponse, TransitionWorker.this.getSessionToken(), TransitionWorker.this.inquirySessionConfig) : null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            retrofit2.Response response2 = (retrofit2.Response) obj;
            if (response2.isSuccessful()) {
                UiStepSavedStateHelper uiStepSavedStateHelper = TransitionWorker.this.uiStepSavedStateHelper;
                this.L$0 = flowCollector;
                this.L$1 = response2;
                this.label = 3;
                if (uiStepSavedStateHelper.clearSavedState(this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    response = response2;
                    objBody = response.body();
                    if (objBody != null) {
                    }
                }
            } else {
                Response.Error error = new Response.Error(NetworkUtilsKt.toErrorInfo(response2));
                this.L$0 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Response> runTransition() {
        return FlowKt.flow(new C436291(null));
    }

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", m3645f = "TransitionWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 81, 83}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1 */
    static final class C436281 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C436281(Continuation<? super C436281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436281 c436281 = TransitionWorker.this.new C436281(continuation);
            c436281.L$0 = obj;
            return c436281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436281) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
        
            if (r1.emit(r2, r10) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                FallbackModeManager fallbackModeManager = TransitionWorker.this.fallbackModeManager;
                String sessionToken = TransitionWorker.this.getSessionToken();
                TransitionInquiryRequest transitionInquiryRequestCreate = TransitionInquiryRequest.INSTANCE.create(TransitionWorker.this.transitionData.getFromComponent(), TransitionWorker.this.transitionData.getComponentParams(), TransitionWorker.this.transitionData.getFromStep());
                this.L$0 = flowCollector;
                this.label = 1;
                obj = fallbackModeManager.transition(sessionToken, transitionInquiryRequestCreate, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            retrofit2.Response response = (retrofit2.Response) obj;
            if (!response.isSuccessful()) {
                Response.Error error = new Response.Error(NetworkUtilsKt.toErrorInfo(response));
                this.L$0 = null;
                this.label = 2;
            } else {
                Response.Success success = new Response.Success(null);
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Response> runFallbackTransition() {
        return FlowKt.flow(new C436281(null));
    }

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response$Success;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: TransitionWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "getNextState", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Response {
            private final InquiryState nextState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                InquiryState inquiryState = this.nextState;
                if (inquiryState == null) {
                    return 0;
                }
                return inquiryState.hashCode();
            }

            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }

            public Success(InquiryState inquiryState) {
                super(null);
                this.nextState = inquiryState;
            }

            public final InquiryState getNextState() {
                return this.nextState;
            }
        }

        private Response() {
        }

        /* compiled from: TransitionWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Response;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
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

    /* compiled from: TransitionWorker.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getFromComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "getComponentParams", "()Ljava/util/Map;", "Ljava/lang/String;", "getFromStep", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class TransitionData implements Parcelable {
        public static final Parcelable.Creator<TransitionData> CREATOR = new Creator();
        private final Map<String, ComponentParam> componentParams;
        private final UiComponent fromComponent;
        private final String fromStep;

        /* compiled from: TransitionWorker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransitionData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiComponent uiComponent = (UiComponent) parcel.readParcelable(TransitionData.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TransitionData.class.getClassLoader()));
                }
                return new TransitionData(uiComponent, linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionData[] newArray(int i) {
                return new TransitionData[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransitionData)) {
                return false;
            }
            TransitionData transitionData = (TransitionData) other;
            return Intrinsics.areEqual(this.fromComponent, transitionData.fromComponent) && Intrinsics.areEqual(this.componentParams, transitionData.componentParams) && Intrinsics.areEqual(this.fromStep, transitionData.fromStep);
        }

        public int hashCode() {
            return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
        }

        public String toString() {
            return "TransitionData(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fromComponent, flags);
            Map<String, ComponentParam> map = this.componentParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.fromStep);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TransitionData(UiComponent fromComponent, Map<String, ? extends ComponentParam> componentParams, String fromStep) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.componentParams = componentParams;
            this.fromStep = fromStep;
        }

        public final UiComponent getFromComponent() {
            return this.fromComponent;
        }

        public final Map<String, ComponentParam> getComponentParams() {
            return this.componentParams;
        }

        public final String getFromStep() {
            return this.fromStep;
        }
    }
}
