package com.withpersona.sdk2.inquiry.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper3;
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

/* compiled from: CreateInquirySessionWorker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResult;", "inquiryId", "", "inquiryApiHelper", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/InquiryApiHelper;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "doesSameWorkAs", "", "otherWorker", "Factory", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateInquirySessionWorker implements Worker<InquiryApiHelper3> {
    private final InquiryApiHelper inquiryApiHelper;
    private final String inquiryId;

    /* compiled from: CreateInquirySessionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker;", "inquiryId", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        CreateInquirySessionWorker create(String inquiryId);
    }

    public CreateInquirySessionWorker(String inquiryId, InquiryApiHelper inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.inquiryId = inquiryId;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    /* compiled from: CreateInquirySessionWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResult;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1", m3645f = "CreateInquirySessionWorker.kt", m3646l = {21, 21}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1 */
    static final class C436051 extends ContinuationImpl7 implements Function2<FlowCollector<? super InquiryApiHelper3>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C436051(Continuation<? super C436051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436051 c436051 = CreateInquirySessionWorker.this.new C436051(continuation);
            c436051.L$0 = obj;
            return c436051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super InquiryApiHelper3> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436051) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
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
                InquiryApiHelper inquiryApiHelper = CreateInquirySessionWorker.this.inquiryApiHelper;
                String str = CreateInquirySessionWorker.this.inquiryId;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = inquiryApiHelper.createInquirySession(str, this);
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
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<InquiryApiHelper3> run() {
        return FlowKt.flow(new C436051(null));
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof CreateInquirySessionWorker) && Intrinsics.areEqual(this.inquiryId, ((CreateInquirySessionWorker) otherWorker).inquiryId);
    }
}
