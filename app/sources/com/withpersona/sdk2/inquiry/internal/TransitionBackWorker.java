package com.withpersona.sdk2.inquiry.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper7;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TransitionBackWorker.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackResult;", "sessionToken", "", "inquiryId", "fromStep", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiryApiHelper", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;)V", "getSessionToken", "()Ljava/lang/String;", "getInquiryId", "getFromStep", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquiryApiHelper", "()Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;", "run", "Lkotlinx/coroutines/flow/Flow;", "doesSameWorkAs", "", "otherWorker", "Factory", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TransitionBackWorker implements Worker<InquiryApiHelper7> {
    private final String fromStep;
    private final InquiryApiHelper inquiryApiHelper;
    private final String inquiryId;
    private final InquirySessionConfig inquirySessionConfig;
    private final String sessionToken;

    /* compiled from: TransitionBackWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker;", "sessionToken", "", "inquiryId", "fromStep", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        TransitionBackWorker create(String sessionToken, String inquiryId, String fromStep, InquirySessionConfig inquirySessionConfig);
    }

    public TransitionBackWorker(String sessionToken, String inquiryId, String fromStep, InquirySessionConfig inquirySessionConfig, InquiryApiHelper inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getInquiryId() {
        return this.inquiryId;
    }

    public final String getFromStep() {
        return this.fromStep;
    }

    public final InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    public final InquiryApiHelper getInquiryApiHelper() {
        return this.inquiryApiHelper;
    }

    /* compiled from: TransitionBackWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackResult;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1", m3645f = "TransitionBackWorker.kt", m3646l = {21, 21}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1 */
    static final class C436261 extends ContinuationImpl7 implements Function2<FlowCollector<? super InquiryApiHelper7>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C436261(Continuation<? super C436261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436261 c436261 = TransitionBackWorker.this.new C436261(continuation);
            c436261.L$0 = obj;
            return c436261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super InquiryApiHelper7> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436261) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C436261 c436261;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                InquiryApiHelper inquiryApiHelper = TransitionBackWorker.this.getInquiryApiHelper();
                String sessionToken = TransitionBackWorker.this.getSessionToken();
                String inquiryId = TransitionBackWorker.this.getInquiryId();
                String fromStep = TransitionBackWorker.this.getFromStep();
                InquirySessionConfig inquirySessionConfig = TransitionBackWorker.this.getInquirySessionConfig();
                this.L$0 = flowCollector;
                this.label = 1;
                c436261 = this;
                obj = inquiryApiHelper.transitionBack$inquiry_internal_release(sessionToken, inquiryId, fromStep, inquirySessionConfig, c436261);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            c436261 = this;
            c436261.L$0 = null;
            c436261.label = 2;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<InquiryApiHelper7> run() {
        return FlowKt.flow(new C436261(null));
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof TransitionBackWorker)) {
            return false;
        }
        TransitionBackWorker transitionBackWorker = (TransitionBackWorker) otherWorker;
        return Intrinsics.areEqual(this.sessionToken, transitionBackWorker.sessionToken) && Intrinsics.areEqual(this.inquiryId, transitionBackWorker.inquiryId);
    }
}
