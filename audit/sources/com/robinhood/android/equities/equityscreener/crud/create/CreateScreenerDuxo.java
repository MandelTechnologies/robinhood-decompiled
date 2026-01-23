package com.robinhood.android.equities.equityscreener.crud.create;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreateScreenerDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDataState;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "stateProvider", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onBind", "Lkotlinx/coroutines/Job;", "screenerOrder", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CreateScreenerDuxo extends BaseDuxo<CreateScreenerDataState, CreateScreenerViewState> {
    public static final int $stable = 8;
    private final ScreenersStore screenersStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateScreenerDuxo(ScreenersStore screenersStore, CreateScreenerViewState2 stateProvider, DuxoBundle duxoBundle) {
        super(new CreateScreenerDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.screenersStore = screenersStore;
    }

    /* compiled from: CreateScreenerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1", m3645f = "CreateScreenerDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1 */
    static final class C146811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScreenerOrder $screenerOrder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146811(ScreenerOrder screenerOrder, Continuation<? super C146811> continuation) {
            super(2, continuation);
            this.$screenerOrder = screenerOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateScreenerDuxo.this.new C146811(this.$screenerOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow presetScreeners$default = ScreenersStore.getPresetScreeners$default(CreateScreenerDuxo.this.screenersStore, false, this.$screenerOrder, false, 5, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateScreenerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(presetScreeners$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CreateScreenerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "presets", "", "Lcom/robinhood/equityscreener/models/db/Screener;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1$1", m3645f = "CreateScreenerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends Screener>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateScreenerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateScreenerDuxo createScreenerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createScreenerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Screener> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Screener>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Screener> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CreateScreenerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1$1$1", m3645f = "CreateScreenerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerDuxo$onBind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498611 extends ContinuationImpl7 implements Function2<CreateScreenerDataState, Continuation<? super CreateScreenerDataState>, Object> {
                final /* synthetic */ List<Screener> $presets;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498611(List<Screener> list, Continuation<? super C498611> continuation) {
                    super(2, continuation);
                    this.$presets = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498611 c498611 = new C498611(this.$presets, continuation);
                    c498611.L$0 = obj;
                    return c498611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateScreenerDataState createScreenerDataState, Continuation<? super CreateScreenerDataState> continuation) {
                    return ((C498611) create(createScreenerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CreateScreenerDataState) this.L$0).copy(this.$presets);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498611((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job onBind(ScreenerOrder screenerOrder) {
        Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
        return getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C146811(screenerOrder, null));
    }
}
