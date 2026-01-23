package com.robinhood.android.equitydetail.p123ui.disclosure;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.InstrumentDisclosureStore;
import com.robinhood.models.p320db.bonfire.InstrumentDisclosure;
import java.util.UUID;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InstrumentDetailDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureViewState;", "instrumentDisclosureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/InstrumentDisclosureStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/InstrumentDisclosureStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class InstrumentDetailDisclosureDuxo extends BaseDuxo4<InstrumentDetailDisclosureViewState> {
    public static final int $stable = 8;
    private final InstrumentDisclosureStore instrumentDisclosureStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailDisclosureDuxo(InstrumentDisclosureStore instrumentDisclosureStore, DuxoBundle duxoBundle) {
        super(new InstrumentDetailDisclosureViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentDisclosureStore, "instrumentDisclosureStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentDisclosureStore = instrumentDisclosureStore;
    }

    /* compiled from: InstrumentDetailDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1", m3645f = "InstrumentDetailDisclosureDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1 */
    static final class C154741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C154741(UUID uuid, String str, Continuation<? super C154741> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailDisclosureDuxo.this.new C154741(this.$instrumentId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C154741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InstrumentDetailDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/bonfire/InstrumentDisclosure;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1$1", m3645f = "InstrumentDetailDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDisclosure, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InstrumentDetailDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailDisclosureDuxo instrumentDetailDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDisclosure instrumentDisclosure, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentDisclosure, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentDetailDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/disclosure/InstrumentDetailDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1$1$1", m3645f = "InstrumentDetailDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.disclosure.InstrumentDetailDisclosureDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499531 extends ContinuationImpl7 implements Function2<InstrumentDetailDisclosureViewState, Continuation<? super InstrumentDetailDisclosureViewState>, Object> {
                final /* synthetic */ InstrumentDisclosure $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499531(InstrumentDisclosure instrumentDisclosure, Continuation<? super C499531> continuation) {
                    super(2, continuation);
                    this.$it = instrumentDisclosure;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499531 c499531 = new C499531(this.$it, continuation);
                    c499531.L$0 = obj;
                    return c499531;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentDetailDisclosureViewState instrumentDetailDisclosureViewState, Continuation<? super InstrumentDetailDisclosureViewState> continuation) {
                    return ((C499531) create(instrumentDetailDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((InstrumentDetailDisclosureViewState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499531((InstrumentDisclosure) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<InstrumentDisclosure> flowStream = InstrumentDetailDisclosureDuxo.this.instrumentDisclosureStore.stream(this.$instrumentId, this.$accountNumber);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentDetailDisclosureDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStream, anonymousClass1, this) == coroutine_suspended) {
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

    public final Job bind(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C154741(instrumentId, accountNumber, null), 3, null);
    }
}
