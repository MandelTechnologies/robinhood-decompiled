package com.robinhood.shared.common.instrumentratings;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo2;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRatings;
import com.robinhood.shared.equities.models.instrumentdetails.store.InstrumentRatingsStore;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InstrumentRatingsV2Duxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState;", "instrumentRatingsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2StateProvider;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2StateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentUuid", "Ljava/util/UUID;", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class InstrumentRatingsV2Duxo extends BaseDuxo<InstrumentRatingsV2Duxo2, InstrumentRatingsV2Duxo4> {
    public static final int $stable = 8;
    private final InstrumentRatingsStore instrumentRatingsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentRatingsV2Duxo(InstrumentRatingsStore instrumentRatingsStore, DuxoBundle duxoBundle, InstrumentRatingsV2Duxo3 stateProvider) {
        super(InstrumentRatingsV2Duxo2.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentRatingsStore, "instrumentRatingsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.instrumentRatingsStore = instrumentRatingsStore;
    }

    /* compiled from: InstrumentRatingsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1", m3645f = "InstrumentRatingsV2Duxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1 */
    static final class C374631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374631(UUID uuid, Continuation<? super C374631> continuation) {
            super(2, continuation);
            this.$instrumentUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentRatingsV2Duxo.this.new C374631(this.$instrumentUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(InstrumentRatingsV2Duxo.this.instrumentRatingsStore.stream(this.$instrumentUuid)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentRatingsV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentRatingsV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "ratings", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1$1", m3645f = "InstrumentRatingsV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentRatings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InstrumentRatingsV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentRatingsV2Duxo instrumentRatingsV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentRatingsV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentRatings instrumentRatings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentRatings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentRatingsV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1$1$1", m3645f = "InstrumentRatingsV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2Duxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506641 extends ContinuationImpl7 implements Function2<InstrumentRatingsV2Duxo2, Continuation<? super InstrumentRatingsV2Duxo2>, Object> {
                final /* synthetic */ InstrumentRatings $ratings;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506641(InstrumentRatings instrumentRatings, Continuation<? super C506641> continuation) {
                    super(2, continuation);
                    this.$ratings = instrumentRatings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C506641(this.$ratings, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentRatingsV2Duxo2 instrumentRatingsV2Duxo2, Continuation<? super InstrumentRatingsV2Duxo2> continuation) {
                    return ((C506641) create(instrumentRatingsV2Duxo2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new InstrumentRatingsV2Duxo2.Loaded(this.$ratings);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506641((InstrumentRatings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID instrumentUuid) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobJob$default, null, new C374631(instrumentUuid, null), 2, null);
        return completableJobJob$default;
    }
}
