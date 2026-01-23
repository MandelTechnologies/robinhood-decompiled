package com.withpersona.sdk2.inquiry.p424ui.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse2;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse3;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: UiAddressAutocompleteWorker.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;", "sessionToken", "", "triggeringComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "addressText", "uiService", "Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/UiService;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "doesSameWorkAs", "", "otherWorker", "Response", "Factory", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UiAddressAutocompleteWorker implements Worker<Response> {
    private final String addressText;
    private final String sessionToken;
    private final UiComponent triggeringComponent;
    private final UiService uiService;

    public /* synthetic */ UiAddressAutocompleteWorker(String str, UiComponent uiComponent, String str2, UiService uiService, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiComponent, str2, uiService);
    }

    private UiAddressAutocompleteWorker(String str, UiComponent uiComponent, String str2, UiService uiService) {
        this.sessionToken = str;
        this.triggeringComponent = uiComponent;
        this.addressText = str2;
        this.uiService = uiService;
    }

    /* compiled from: UiAddressAutocompleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", m3645f = "UiAddressAutocompleteWorker.kt", m3646l = {19, 28, 30}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1 */
    static final class C437811 extends ContinuationImpl7 implements Function2<FlowCollector<? super Response>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437811(Continuation<? super C437811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437811 c437811 = UiAddressAutocompleteWorker.this.new C437811(continuation);
            c437811.L$0 = obj;
            return c437811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Response> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437811) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            if (r1.emit(r2, r9) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        
            if (r1.emit(r3, r9) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            List<AddressAutocompleteResponse3> listEmptyList;
            AddressAutocompleteResponse2 meta;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                UiService uiService = UiAddressAutocompleteWorker.this.uiService;
                String str = UiAddressAutocompleteWorker.this.sessionToken;
                AddressAutocompleteRequest addressAutocompleteRequestCreate = AddressAutocompleteRequest.INSTANCE.create(UiAddressAutocompleteWorker.this.triggeringComponent, UiAddressAutocompleteWorker.this.addressText);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = uiService.getAddressSuggestions(str, addressAutocompleteRequestCreate, this);
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
                AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) response.body();
                if (addressAutocompleteResponse == null || (meta = addressAutocompleteResponse.getMeta()) == null || (listEmptyList = meta.getPredictions()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Response.Success success = new Response.Success(listEmptyList);
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Response> run() {
        return FlowKt.flow(new C437811(null));
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof UiAddressAutocompleteWorker) && Intrinsics.areEqual(this.addressText, ((UiAddressAutocompleteWorker) otherWorker).addressText);
    }

    /* compiled from: UiAddressAutocompleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response$Success;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Response {
        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: UiAddressAutocompleteWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response$Success;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;", "results", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "<init>", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Response {
            private final List<AddressAutocompleteResponse3> results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(List<AddressAutocompleteResponse3> results) {
                super(null);
                Intrinsics.checkNotNullParameter(results, "results");
                this.results = results;
            }

            public final List<AddressAutocompleteResponse3> getResults() {
                return this.results;
            }
        }

        private Response() {
        }

        /* compiled from: UiAddressAutocompleteWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response$Error;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error extends Response {
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }
    }

    /* compiled from: UiAddressAutocompleteWorker.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Factory;", "", "uiService", "Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiService;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker;", "sessionToken", "", "triggeringComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "addressText", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final UiService uiService;

        public Factory(UiService uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        public final UiAddressAutocompleteWorker create(String sessionToken, UiComponent triggeringComponent, String addressText) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(triggeringComponent, "triggeringComponent");
            Intrinsics.checkNotNullParameter(addressText, "addressText");
            return new UiAddressAutocompleteWorker(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }
}
