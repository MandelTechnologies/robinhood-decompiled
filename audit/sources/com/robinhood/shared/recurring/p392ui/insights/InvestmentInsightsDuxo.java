package com.robinhood.shared.recurring.p392ui.insights;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.bonfire.RecurringInsightsStore;
import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InvestmentInsightsDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0013\u0014B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo$InitArgs;", "recurringInsightsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RecurringInsightsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RecurringInsightsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "update", "InitArgs", "Companion", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InvestmentInsightsDuxo extends BaseDuxo<InvestmentInsightsDataState, InvestmentInsightsViewState> implements HasArgs<InitArgs> {
    private final RecurringInsightsStore recurringInsightsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentInsightsDuxo(RecurringInsightsStore recurringInsightsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new InvestmentInsightsDataState(((InitArgs) INSTANCE.getArgs(savedStateHandle)).getInvestmentScheduleId(), null, null, 6, null), InvestmentInsightsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(recurringInsightsStore, "recurringInsightsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.recurringInsightsStore = recurringInsightsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        update();
    }

    /* compiled from: InvestmentInsightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$1", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$1 */
    static final class C396081 extends ContinuationImpl7 implements Function2<InvestmentInsightsDataState, Continuation<? super InvestmentInsightsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C396081(Continuation<? super C396081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C396081 c396081 = new C396081(continuation);
            c396081.L$0 = obj;
            return c396081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentInsightsDataState investmentInsightsDataState, Continuation<? super InvestmentInsightsDataState> continuation) {
            return ((C396081) create(investmentInsightsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentInsightsDataState.copy$default((InvestmentInsightsDataState) this.L$0, null, null, null, 3, null);
        }
    }

    public final void update() {
        applyMutation(new C396081(null));
        this.recurringInsightsStore.refresh(((InitArgs) INSTANCE.getArgs((HasArgs) this)).getInvestmentScheduleId(), true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C396092(null), 3, null);
    }

    /* compiled from: InvestmentInsightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2 */
    static final class C396092 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396092(Continuation<? super C396092> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentInsightsDuxo.this.new C396092(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM28818catch = FlowKt.m28818catch(InvestmentInsightsDuxo.this.recurringInsightsStore.getStreamRecurringInsightsPageResponse().asFlow(((InitArgs) InvestmentInsightsDuxo.INSTANCE.getArgs((HasArgs) InvestmentInsightsDuxo.this)).getInvestmentScheduleId()), new AnonymousClass1(InvestmentInsightsDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InvestmentInsightsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InvestmentInsightsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$1", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super RecurringInsightsPageResponse>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestmentInsightsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentInsightsDuxo investmentInsightsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = investmentInsightsDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super RecurringInsightsPageResponse> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = th;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestmentInsightsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$1$1", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507561 extends ContinuationImpl7 implements Function2<InvestmentInsightsDataState, Continuation<? super InvestmentInsightsDataState>, Object> {
                final /* synthetic */ Throwable $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507561(Throwable th, Continuation<? super C507561> continuation) {
                    super(2, continuation);
                    this.$it = th;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507561 c507561 = new C507561(this.$it, continuation);
                    c507561.L$0 = obj;
                    return c507561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestmentInsightsDataState investmentInsightsDataState, Continuation<? super InvestmentInsightsDataState> continuation) {
                    return ((C507561) create(investmentInsightsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InvestmentInsightsDataState.copy$default((InvestmentInsightsDataState) this.L$0, null, null, this.$it, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507561((Throwable) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: InvestmentInsightsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "insightsPageResponse", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$2", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RecurringInsightsPageResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestmentInsightsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestmentInsightsDuxo investmentInsightsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investmentInsightsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RecurringInsightsPageResponse recurringInsightsPageResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(recurringInsightsPageResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestmentInsightsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$2$1", m3645f = "InvestmentInsightsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDuxo$update$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestmentInsightsDataState, Continuation<? super InvestmentInsightsDataState>, Object> {
                final /* synthetic */ RecurringInsightsPageResponse $insightsPageResponse;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RecurringInsightsPageResponse recurringInsightsPageResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$insightsPageResponse = recurringInsightsPageResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$insightsPageResponse, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestmentInsightsDataState investmentInsightsDataState, Continuation<? super InvestmentInsightsDataState> continuation) {
                    return ((AnonymousClass1) create(investmentInsightsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InvestmentInsightsDataState.copy$default((InvestmentInsightsDataState) this.L$0, null, this.$insightsPageResponse, null, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((RecurringInsightsPageResponse) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InvestmentInsightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo$InitArgs;", "Landroid/os/Parcelable;", "investmentScheduleId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID investmentScheduleId;

        /* compiled from: InvestmentInsightsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.investmentScheduleId;
            }
            return initArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        public final InitArgs copy(UUID investmentScheduleId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            return new InitArgs(investmentScheduleId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.investmentScheduleId, ((InitArgs) other).investmentScheduleId);
        }

        public int hashCode() {
            return this.investmentScheduleId.hashCode();
        }

        public String toString() {
            return "InitArgs(investmentScheduleId=" + this.investmentScheduleId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.investmentScheduleId);
        }

        public InitArgs(UUID investmentScheduleId) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            this.investmentScheduleId = investmentScheduleId;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }
    }

    /* compiled from: InvestmentInsightsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo$InitArgs;", "<init>", "()V", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<InvestmentInsightsDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(InvestmentInsightsDuxo investmentInsightsDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, investmentInsightsDuxo);
        }
    }
}
