package com.withpersona.sdk2.inquiry.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import java.util.List;
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

/* compiled from: RestoreUiStepStateWorker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "sessionToken", "", "inquiryId", "stepName", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "doesSameWorkAs", "", "otherWorker", "Factory", "Output", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RestoreUiStepStateWorker implements Worker<Output> {
    private final String inquiryId;
    private final String sessionToken;
    private final String stepName;
    private final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* compiled from: RestoreUiStepStateWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker;", "sessionToken", "", "inquiryId", "stepName", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        RestoreUiStepStateWorker create(String sessionToken, String inquiryId, String stepName);
    }

    public RestoreUiStepStateWorker(UiStepSavedStateHelper uiStepSavedStateHelper, String sessionToken, String inquiryId, String stepName) {
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.stepName = stepName;
    }

    /* compiled from: RestoreUiStepStateWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output;", "", "Success", "Failure", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output$Failure;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output$Success;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Output {

        /* compiled from: RestoreUiStepStateWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output;", "components", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<init>", "(Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success implements Output {
            private final List<UiComponentConfig> components;

            /* JADX WARN: Multi-variable type inference failed */
            public Success(List<? extends UiComponentConfig> components) {
                Intrinsics.checkNotNullParameter(components, "components");
                this.components = components;
            }

            public final List<UiComponentConfig> getComponents() {
                return this.components;
            }
        }

        /* compiled from: RestoreUiStepStateWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output$Failure;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Failure implements Output {
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failure);
            }

            public int hashCode() {
                return -1486380735;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
            }
        }
    }

    /* compiled from: RestoreUiStepStateWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1", m3645f = "RestoreUiStepStateWorker.kt", m3646l = {33, 40, 42}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1 */
    static final class C436251 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C436251(Continuation<? super C436251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436251 c436251 = RestoreUiStepStateWorker.this.new C436251(continuation);
            c436251.L$0 = obj;
            return c436251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C436251) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (r1.emit(r2, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L22;
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
                UiStepSavedStateHelper uiStepSavedStateHelper = RestoreUiStepStateWorker.this.uiStepSavedStateHelper;
                String str = RestoreUiStepStateWorker.this.sessionToken;
                String str2 = RestoreUiStepStateWorker.this.inquiryId;
                String str3 = RestoreUiStepStateWorker.this.stepName;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = uiStepSavedStateHelper.restoreComponentConfigs(str, str2, str3, this);
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
            List list = (List) obj;
            if (list != null) {
                Output.Success success = new Output.Success(list);
                this.L$0 = null;
                this.label = 2;
            } else {
                Output.Failure failure = Output.Failure.INSTANCE;
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        return FlowKt.flow(new C436251(null));
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof RestoreUiStepStateWorker)) {
            return false;
        }
        RestoreUiStepStateWorker restoreUiStepStateWorker = (RestoreUiStepStateWorker) otherWorker;
        return Intrinsics.areEqual(restoreUiStepStateWorker.sessionToken, this.sessionToken) && Intrinsics.areEqual(restoreUiStepStateWorker.inquiryId, this.inquiryId) && Intrinsics.areEqual(restoreUiStepStateWorker.stepName, this.stepName);
    }
}
