package com.robinhood.android.optionsexercise;

import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionExerciseManager.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/models/db/OptionEvent;", "Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/librobinhood/data/store/OptionEventStore;Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", "getOptionEventStore", "()Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "getSubmissionObservable", "Lio/reactivex/Single;", "isFinal", "", Card.Icon.ORDER, "fetchOrder", "orderId", "getShouldTriggerConfirmationInstantly", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseManager extends OrderSubmissionManager<OptionEvent, ApiOptionExerciseRequest> {
    public static final int $stable = 8;
    private final OptionEventStore optionEventStore;
    private final OptionExerciseStore optionExerciseStore;
    private final RxFactory rxFactory;

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(ApiOptionExerciseRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    public final OptionEventStore getOptionEventStore() {
        return this.optionEventStore;
    }

    public final RxFactory getRxFactory() {
        return this.rxFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionExerciseManager(@RootCoroutineScope CoroutineScope coroutineScope, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, RxFactory rxFactory) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.optionEventStore = optionEventStore;
        this.optionExerciseStore = optionExerciseStore;
        this.rxFactory = rxFactory;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(ApiOptionExerciseRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getSource_ref_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(OptionEvent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getId();
    }

    /* compiled from: OptionExerciseManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OptionEvent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseManager$getSubmissionObservable$1", m3645f = "OptionExerciseManager.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseManager$getSubmissionObservable$1 */
    static final class C246881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OptionEvent>, Object> {
        final /* synthetic */ ApiOptionExerciseRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246881(ApiOptionExerciseRequest apiOptionExerciseRequest, Continuation<? super C246881> continuation) {
            super(2, continuation);
            this.$request = apiOptionExerciseRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionExerciseManager.this.new C246881(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OptionEvent> continuation) {
            return ((C246881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint<ApiOptionExerciseRequest, ApiOptionEvent> submitOptionExercise = OptionExerciseManager.this.optionExerciseStore.getSubmitOptionExercise();
                ApiOptionExerciseRequest apiOptionExerciseRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(submitOptionExercise, apiOptionExerciseRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiOptionEvent) obj).toDbModel();
        }
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<OptionEvent> getSubmissionObservable(ApiOptionExerciseRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C246881(request, null), 1, null);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(OptionEvent order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.getState().isFinal();
    }

    /* compiled from: OptionExerciseManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OptionEvent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseManager$fetchOrder$1", m3645f = "OptionExerciseManager.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseManager$fetchOrder$1 */
    static final class C246871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OptionEvent>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246871(UUID uuid, Continuation<? super C246871> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionExerciseManager.this.new C246871(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OptionEvent> continuation) {
            return ((C246871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint<UUID, ApiOptionEvent> getOptionEvent = OptionExerciseManager.this.getOptionEventStore().getGetOptionEvent();
                UUID uuid = this.$orderId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(getOptionEvent, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiOptionEvent) obj).toDbModel();
        }
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<OptionEvent> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C246871(orderId, null), 1, null);
    }
}
