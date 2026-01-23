package com.robinhood.android.common.portfolio.instrument;

import com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo3;
import com.robinhood.android.models.portfolio.InstrumentDetails;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.OptionStrategyDetails;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InstrumentListItemDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemDataState;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemState;", "stateProvider", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo$PositionItemStateProvider;", "instrumentDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo$PositionItemStateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "pollingRate", "", "displayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "bindOptions", "", "optionCuratedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "PositionItemStateProvider", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentListItemDuxo extends BaseDuxo<InstrumentItemDataState, InstrumentListItemDuxo3> {
    public static final int $stable = 8;
    private final InstrumentDetailsStore instrumentDetailsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentListItemDuxo(PositionItemStateProvider stateProvider, InstrumentDetailsStore instrumentDetailsStore, DuxoBundle duxoBundle) {
        super(new InstrumentItemDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(instrumentDetailsStore, "instrumentDetailsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentDetailsStore = instrumentDetailsStore;
    }

    /* compiled from: InstrumentListItemDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1 */
    static final class C115241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentDisplayType $displayType;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ float $pollingRate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115241(UUID uuid, InstrumentDisplayType instrumentDisplayType, InstrumentType instrumentType, float f, Continuation<? super C115241> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$displayType = instrumentDisplayType;
            this.$instrumentType = instrumentType;
            this.$pollingRate = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentListItemDuxo.this.new C115241(this.$instrumentId, this.$displayType, this.$instrumentType, this.$pollingRate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InstrumentDetailsStore instrumentDetailsStore = InstrumentListItemDuxo.this.instrumentDetailsStore;
                UUID uuid = this.$instrumentId;
                String serverValue = this.$displayType.getServerValue();
                InstrumentType instrumentTypeFromServerValue = InstrumentType.INSTANCE.fromServerValue(this.$instrumentType.getServerValue());
                if (instrumentTypeFromServerValue == null) {
                    instrumentTypeFromServerValue = InstrumentType.UNKNOWN;
                }
                Flow<InstrumentDetails3> flowRefreshAndStreamInstrumentDetails = instrumentDetailsStore.refreshAndStreamInstrumentDetails(uuid, serverValue, instrumentTypeFromServerValue, (long) this.$pollingRate, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentListItemDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowRefreshAndStreamInstrumentDetails, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentListItemDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetails3, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InstrumentListItemDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentListItemDuxo instrumentListItemDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentListItemDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetails3 instrumentDetails3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentDetails3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentListItemDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1$1$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496871 extends ContinuationImpl7 implements Function2<InstrumentItemDataState, Continuation<? super InstrumentItemDataState>, Object> {
                final /* synthetic */ InstrumentDetails3 $details;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496871(InstrumentDetails3 instrumentDetails3, Continuation<? super C496871> continuation) {
                    super(2, continuation);
                    this.$details = instrumentDetails3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496871 c496871 = new C496871(this.$details, continuation);
                    c496871.L$0 = obj;
                    return c496871;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentItemDataState instrumentItemDataState, Continuation<? super InstrumentItemDataState> continuation) {
                    return ((C496871) create(instrumentItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InstrumentItemDataState instrumentItemDataState = (InstrumentItemDataState) this.L$0;
                    InstrumentDetails3 instrumentDetails3 = this.$details;
                    return instrumentItemDataState.copy(instrumentDetails3 instanceof InstrumentDetails ? (InstrumentDetails) instrumentDetails3 : null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496871((InstrumentDetails3) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID instrumentId, InstrumentType instrumentType, float pollingRate, InstrumentDisplayType displayType) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115241(instrumentId, displayType, instrumentType, pollingRate, null), 3, null);
    }

    /* compiled from: InstrumentListItemDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1 */
    static final class C115251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ CuratedListItem $optionCuratedListItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115251(UUID uuid, String str, CuratedListItem curatedListItem, Continuation<? super C115251> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$displayType = str;
            this.$optionCuratedListItem = curatedListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentListItemDuxo.this.new C115251(this.$instrumentId, this.$displayType, this.$optionCuratedListItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<InstrumentDetails3> flowRefreshAndStreamInstrumentDetails = InstrumentListItemDuxo.this.instrumentDetailsStore.refreshAndStreamInstrumentDetails(this.$instrumentId, this.$displayType, InstrumentType.OPTION_STRATEGY, 2L, this.$optionCuratedListItem);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentListItemDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowRefreshAndStreamInstrumentDetails, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentListItemDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetails3, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InstrumentListItemDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentListItemDuxo instrumentListItemDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentListItemDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetails3 instrumentDetails3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentDetails3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentListItemDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1$1$1", m3645f = "InstrumentListItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentListItemDuxo$bindOptions$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496881 extends ContinuationImpl7 implements Function2<InstrumentItemDataState, Continuation<? super InstrumentItemDataState>, Object> {
                final /* synthetic */ InstrumentDetails3 $details;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496881(InstrumentDetails3 instrumentDetails3, Continuation<? super C496881> continuation) {
                    super(2, continuation);
                    this.$details = instrumentDetails3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496881 c496881 = new C496881(this.$details, continuation);
                    c496881.L$0 = obj;
                    return c496881;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentItemDataState instrumentItemDataState, Continuation<? super InstrumentItemDataState> continuation) {
                    return ((C496881) create(instrumentItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InstrumentItemDataState instrumentItemDataState = (InstrumentItemDataState) this.L$0;
                    InstrumentDetails3 instrumentDetails3 = this.$details;
                    return instrumentItemDataState.copy(instrumentDetails3 instanceof OptionStrategyDetails ? (OptionStrategyDetails) instrumentDetails3 : null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496881((InstrumentDetails3) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bindOptions(UUID instrumentId, String displayType, CuratedListItem optionCuratedListItem) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(optionCuratedListItem, "optionCuratedListItem");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115251(instrumentId, displayType, optionCuratedListItem, null), 3, null);
    }

    /* compiled from: InstrumentListItemDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentListItemDuxo$PositionItemStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemDataState;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemState;", "<init>", "()V", "reduce", "dataState", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PositionItemStateProvider implements StateProvider<InstrumentItemDataState, InstrumentListItemDuxo3> {
        public static final int $stable = 0;

        @Override // com.robinhood.android.udf.StateProvider
        public InstrumentListItemDuxo3 reduce(InstrumentItemDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getDetails() != null) {
                return new InstrumentListItemDuxo3.Loaded(dataState.getDetails());
            }
            return InstrumentListItemDuxo3.Loading.INSTANCE;
        }
    }
}
