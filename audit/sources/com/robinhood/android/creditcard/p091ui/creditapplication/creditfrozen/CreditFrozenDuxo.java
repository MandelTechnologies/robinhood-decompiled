package com.robinhood.android.creditcard.p091ui.creditapplication.creditfrozen;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.TaskQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.TaskResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreditFrozenDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/creditfrozen/CreditFrozenDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/creditfrozen/CreditFrozenViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PageEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "pollingJob", "Lkotlinx/coroutines/Job;", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "rerun", "rerun$feature_credit_card_externalDebug", "poll", "taskId", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditFrozenDuxo extends BaseDuxo5<CreditFrozenViewState, CreditApplicationDuxo9> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private Job pollingJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditFrozenDuxo(CreditCardStore creditCardStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new CreditFrozenViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new CreditFrozenDuxo2(null));
    }

    public final void rerun$feature_credit_card_externalDebug() {
        applyMutation(new CreditFrozenDuxo3(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new CreditFrozenDuxo4(this, null), 2, null);
    }

    /* compiled from: CreditFrozenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$poll$1", m3645f = "CreditFrozenDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$poll$1 */
    static final class C123221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $taskId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C123221(String str, Continuation<? super C123221> continuation) {
            super(2, continuation);
            this.$taskId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditFrozenDuxo.this.new C123221(this.$taskId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C123221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TaskResponse> flowStreamTaskState = CreditFrozenDuxo.this.creditCardStore.streamTaskState(this.$taskId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreditFrozenDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTaskState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CreditFrozenDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/creditcard/api/graphql/TaskResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$poll$1$1", m3645f = "CreditFrozenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$poll$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TaskResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreditFrozenDuxo this$0;

            /* compiled from: CreditFrozenDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$poll$1$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TaskQueryResponse2.values().length];
                    try {
                        iArr[TaskQueryResponse2.SUCCEEDED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TaskQueryResponse2.FAILED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TaskQueryResponse2.CANCELLED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TaskQueryResponse2.NOT_FOUND.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TaskQueryResponse2.DISPATCHED_FAILED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreditFrozenDuxo creditFrozenDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = creditFrozenDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaskResponse taskResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(taskResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                GraphqlValidationType<TaskResponse.Response> task;
                TaskResponse.Response data;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TaskResponse taskResponse = (TaskResponse) this.L$0;
                TaskQueryResponse2 status = (taskResponse == null || (task = taskResponse.getTask()) == null || (data = task.getData()) == null) ? null : data.getStatus();
                int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i == 1) {
                    Job job = this.this$0.pollingJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
                } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                    Job job2 = this.this$0.pollingJob;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, null, 1, null);
                    }
                    this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void poll(String taskId) {
        this.pollingJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C123221(taskId, null), 2, null);
    }
}
