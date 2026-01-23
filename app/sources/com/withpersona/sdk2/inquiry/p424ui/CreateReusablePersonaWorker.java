package com.withpersona.sdk2.inquiry.p424ui;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule4;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p424ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Collection2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: CreateReusablePersonaWorker.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;", "uiService", "Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "deviceIdProvider", "Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;", "customTabsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "sessionToken", "", "inquiryId", "url", "componentName", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiService;Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "Output", "Factory", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateReusablePersonaWorker implements Worker<Output> {
    private final String componentName;
    private final ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher;
    private final DeviceId deviceIdProvider;
    private final String inquiryId;
    private final String sessionToken;
    private final UiService uiService;
    private final String url;

    /* compiled from: CreateReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker;", "sessionToken", "", "inquiryId", "url", "componentName", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        CreateReusablePersonaWorker create(String sessionToken, String inquiryId, String url, String componentName);
    }

    public CreateReusablePersonaWorker(UiService uiService, DeviceId deviceIdProvider, ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher, String sessionToken, String inquiryId, String url, String componentName) {
        Intrinsics.checkNotNullParameter(uiService, "uiService");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.uiService = uiService;
        this.deviceIdProvider = deviceIdProvider;
        this.customTabsLauncher = customTabsLauncher;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    /* compiled from: CreateReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1", m3645f = "CreateReusablePersonaWorker.kt", m3646l = {35, 40, 45, 52, 62, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, 73}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1 */
    static final class C437751 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437751(Continuation<? super C437751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437751 c437751 = CreateReusablePersonaWorker.this.new C437751(continuation);
            c437751.L$0 = obj;
            return c437751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437751) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        
            if (r1.emit(r2, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
        
            if (r1.emit(r8, r7) != r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
        
            if (r1.emit(r8, r7) != r0) goto L53;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[PHI: r1
          0x00e4: PHI (r1v10 kotlinx.coroutines.flow.FlowCollector) = (r1v13 kotlinx.coroutines.flow.FlowCollector), (r1v14 kotlinx.coroutines.flow.FlowCollector) binds: [B:43:0x00e1, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Response response;
            com.withpersona.sdk2.inquiry.p424ui.network.Metadata meta;
            FlowCollector flowCollector;
            Flow flowTake;
            FlowCollector flowCollector2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (Exception unused) {
                Output.Error error = new Output.Error(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
                this.L$0 = null;
                this.label = 2;
            }
            switch (r1) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    UiService uiService = CreateReusablePersonaWorker.this.uiService;
                    String str = CreateReusablePersonaWorker.this.inquiryId;
                    String str2 = CreateReusablePersonaWorker.this.sessionToken;
                    this.L$0 = flowCollector3;
                    this.label = 1;
                    obj = uiService.fetchOneTimeLinkCodeForPersonasCreate(str, str2, this);
                    r1 = flowCollector3;
                    if (obj != coroutine_suspended) {
                        response = (Response) obj;
                        if (response.isSuccessful()) {
                            Output.Error error2 = new Output.Error(NetworkUtilsKt.toErrorInfo(response));
                            this.L$0 = null;
                            this.label = 3;
                            break;
                        } else {
                            OneTimeLinkCodeResponse oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) response.body();
                            String oneTimeLinkCode = (oneTimeLinkCodeResponse == null || (meta = oneTimeLinkCodeResponse.getMeta()) == null) ? null : meta.getOneTimeLinkCode();
                            if (oneTimeLinkCode == null) {
                                Output.Error error3 = new Output.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                                this.L$0 = null;
                                this.label = 4;
                                break;
                            } else {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateReusablePersonaWorker.this, oneTimeLinkCode, null);
                                this.L$0 = r1;
                                this.label = 5;
                                flowCollector = r1;
                                if (BuildersKt.withContext(main, anonymousClass1, this) != coroutine_suspended) {
                                    flowTake = FlowKt.take(new CustomTabsLauncherModule4(), 1);
                                    this.L$0 = flowCollector;
                                    this.label = 6;
                                    flowCollector2 = flowCollector;
                                    if (Collection2.toList$default(flowTake, null, this, 1, null) != coroutine_suspended) {
                                        Output.Complete complete = Output.Complete.INSTANCE;
                                        this.L$0 = null;
                                        this.label = 7;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = flowCollector4;
                    response = (Response) obj;
                    if (response.isSuccessful()) {
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                    FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector5;
                    flowTake = FlowKt.take(new CustomTabsLauncherModule4(), 1);
                    this.L$0 = flowCollector;
                    this.label = 6;
                    flowCollector2 = flowCollector;
                    if (Collection2.toList$default(flowTake, null, this, 1, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector6;
                    Output.Complete complete2 = Output.Complete.INSTANCE;
                    this.L$0 = null;
                    this.label = 7;
                    break;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CreateReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1$1", m3645f = "CreateReusablePersonaWorker.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $oneTimeLinkCode;
            int label;
            final /* synthetic */ CreateReusablePersonaWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateReusablePersonaWorker createReusablePersonaWorker, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createReusablePersonaWorker;
                this.$oneTimeLinkCode = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$oneTimeLinkCode, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ActivityResultLauncher activityResultLauncher = this.this$0.customTabsLauncher;
                    CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
                    Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
                    activityResultLauncher.launch(new CustomTabsLauncherModule2(customTabsIntentBuild, ReusablePersonasUtils.createReusablePersonaUrl(this.this$0.url, this.$oneTimeLinkCode, this.this$0.componentName)));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        return FlowKt.flow(new C437751(null));
    }

    /* compiled from: CreateReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;", "", "Complete", "Error", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output$Error;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Output {

        /* compiled from: CreateReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Complete implements Output {
            public static final Complete INSTANCE = new Complete();

            public boolean equals(Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return -1705280535;
            }

            public String toString() {
                return "Complete";
            }

            private Complete() {
            }
        }

        /* compiled from: CreateReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output$Error;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getErrorInfo", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error implements Output {
            private final InternalErrorInfo errorInfo;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.errorInfo, ((Error) other).errorInfo);
            }

            public int hashCode() {
                return this.errorInfo.hashCode();
            }

            public String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }

            public Error(InternalErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                this.errorInfo = errorInfo;
            }

            public final InternalErrorInfo getErrorInfo() {
                return this.errorInfo;
            }
        }
    }
}
