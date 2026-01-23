package com.withpersona.sdk2.inquiry.p424ui;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.Moshi;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule4;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.p424ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import java.util.Map;
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

/* compiled from: VerifyReusablePersonaWorker.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBg\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;", "customTabsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "uiService", "Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "moshi", "Lcom/squareup/moshi/Moshi;", "sessionToken", "", "inquiryId", "url", "componentName", "componentParams", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Lcom/withpersona/sdk2/inquiry/ui/network/UiService;Lcom/squareup/moshi/Moshi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Output", "Factory", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class VerifyReusablePersonaWorker implements Worker<Output> {
    private final String componentName;
    private final Map<String, ComponentParam> componentParams;
    private final ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher;
    private final String inquiryId;
    private final Moshi moshi;
    private final String sessionToken;
    private final UiService uiService;
    private final String url;

    /* compiled from: VerifyReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker;", "sessionToken", "", "inquiryId", "url", "componentName", "componentParams", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        VerifyReusablePersonaWorker create(String sessionToken, String inquiryId, String url, String componentName, Map<String, ? extends ComponentParam> componentParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyReusablePersonaWorker(ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher, UiService uiService, Moshi moshi, String sessionToken, String inquiryId, String url, String componentName, Map<String, ? extends ComponentParam> componentParams) {
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(uiService, "uiService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        this.customTabsLauncher = customTabsLauncher;
        this.uiService = uiService;
        this.moshi = moshi;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
        this.componentParams = componentParams;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return Worker.DefaultImpls.doesSameWorkAs(this, otherWorker) && Intrinsics.areEqual(((VerifyReusablePersonaWorker) otherWorker).url, this.url);
    }

    /* compiled from: VerifyReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1", m3645f = "VerifyReusablePersonaWorker.kt", m3646l = {43, 49, 54, 61, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, 80, 82}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1 */
    static final class C437801 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437801(Continuation<? super C437801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437801 c437801 = VerifyReusablePersonaWorker.this.new C437801(continuation);
            c437801.L$0 = obj;
            return c437801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437801) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (r1.emit(r2, r8) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
        
            if (r1.emit(r9, r8) != r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
        
            if (r1.emit(r9, r8) != r0) goto L53;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[PHI: r1
          0x00f0: PHI (r1v10 kotlinx.coroutines.flow.FlowCollector) = (r1v13 kotlinx.coroutines.flow.FlowCollector), (r1v14 kotlinx.coroutines.flow.FlowCollector) binds: [B:43:0x00ed, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
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
                    UiService uiService = VerifyReusablePersonaWorker.this.uiService;
                    String str = VerifyReusablePersonaWorker.this.inquiryId;
                    String str2 = VerifyReusablePersonaWorker.this.sessionToken;
                    OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequestCreate = OneTimeLinkCodeForPersonasRequest.INSTANCE.create(VerifyReusablePersonaWorker.this.componentParams);
                    this.L$0 = flowCollector3;
                    this.label = 1;
                    obj = uiService.fetchOneTimeLinkCodeForPersonasVerify(str, str2, oneTimeLinkCodeForPersonasRequestCreate, this);
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
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(VerifyReusablePersonaWorker.this, oneTimeLinkCode, null);
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

        /* compiled from: VerifyReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1", m3645f = "VerifyReusablePersonaWorker.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $oneTimeLinkCode;
            int label;
            final /* synthetic */ VerifyReusablePersonaWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(VerifyReusablePersonaWorker verifyReusablePersonaWorker, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = verifyReusablePersonaWorker;
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
        return FlowKt.flow(new C437801(null));
    }

    /* compiled from: VerifyReusablePersonaWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;", "", "Complete", "Error", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output$Error;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Output {

        /* compiled from: VerifyReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Complete implements Output {
            public static final Complete INSTANCE = new Complete();

            public boolean equals(Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return -1215598964;
            }

            public String toString() {
                return "Complete";
            }

            private Complete() {
            }
        }

        /* compiled from: VerifyReusablePersonaWorker.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output$Error;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getErrorInfo", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
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
