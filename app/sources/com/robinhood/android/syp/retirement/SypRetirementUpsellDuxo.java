package com.robinhood.android.syp.retirement;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore;
import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SypRetirementUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDataState;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState;", "sypRetirementUpsellStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SypRetirementUpsellStore;", "stateProvider", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/SypRetirementUpsellStore;Lcom/robinhood/android/syp/retirement/SypRetirementUpsellStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SypRetirementUpsellDuxo extends BaseDuxo<SypRetirementUpsellDataState, SypRetirementUpsellViewState> {
    public static final int $stable = 8;
    private final SypRetirementUpsellStore sypRetirementUpsellStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SypRetirementUpsellDuxo(SypRetirementUpsellStore sypRetirementUpsellStore, SypRetirementUpsellStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new SypRetirementUpsellDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(sypRetirementUpsellStore, "sypRetirementUpsellStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sypRetirementUpsellStore = sypRetirementUpsellStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.sypRetirementUpsellStore.refresh(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C292181(null), 3, null);
    }

    /* compiled from: SypRetirementUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1", m3645f = "SypRetirementUpsellDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1 */
    static final class C292181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C292181(Continuation<? super C292181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SypRetirementUpsellDuxo.this.new C292181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C292181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SypRetirementUpsellDuxo.this.sypRetirementUpsellStore.stream());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SypRetirementUpsellDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SypRetirementUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1$1", m3645f = "SypRetirementUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SypRetirementUpsellDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SypRetirementUpsellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SypRetirementUpsellDuxo sypRetirementUpsellDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sypRetirementUpsellDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SypRetirementUpsellDetails sypRetirementUpsellDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(sypRetirementUpsellDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SypRetirementUpsellDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1$1$1", m3645f = "SypRetirementUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.syp.retirement.SypRetirementUpsellDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505611 extends ContinuationImpl7 implements Function2<SypRetirementUpsellDataState, Continuation<? super SypRetirementUpsellDataState>, Object> {
                final /* synthetic */ SypRetirementUpsellDetails $details;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505611(SypRetirementUpsellDetails sypRetirementUpsellDetails, Continuation<? super C505611> continuation) {
                    super(2, continuation);
                    this.$details = sypRetirementUpsellDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505611 c505611 = new C505611(this.$details, continuation);
                    c505611.L$0 = obj;
                    return c505611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SypRetirementUpsellDataState sypRetirementUpsellDataState, Continuation<? super SypRetirementUpsellDataState> continuation) {
                    return ((C505611) create(sypRetirementUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((SypRetirementUpsellDataState) this.L$0).copy(this.$details);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505611((SypRetirementUpsellDetails) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
