package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0019\u001aB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowViewState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo$NavRowDuxoInitArgs;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "validateCurrentUnderlyingId", "id", "Ljava/util/UUID;", "NavRowDuxoInitArgs", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerTopNavRowDuxo extends BaseDuxo5<OptionsPortfolioRiskAnalyzerTopNavRowViewState, OptionsPortfolioRiskAnalyzerTopNavRowEvent> implements HasArgs<NavRowDuxoInitArgs> {
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final IndexStore indexStore;
    private final InstrumentStore instrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public NavRowDuxoInitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (NavRowDuxoInitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsPortfolioRiskAnalyzerTopNavRowDuxo(IndexStore indexStore, InstrumentStore instrumentStore, AggregateOptionPositionStore aggregateOptionPositionStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionsPortfolioRiskAnalyzerTopNavRowViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C236711(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1", m3645f = "OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1 */
    static final class C236711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C236711(Continuation<? super C236711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerTopNavRowDuxo.this.new C236711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C236711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(OptionsPortfolioRiskAnalyzerTopNavRowDuxo.this.aggregateOptionPositionStore.streamUiAggregateOptionPositionsFlow(((NavRowDuxoInitArgs) OptionsPortfolioRiskAnalyzerTopNavRowDuxo.INSTANCE.getArgs((HasArgs) OptionsPortfolioRiskAnalyzerTopNavRowDuxo.this)).getAccountNumber()), new C23668xfe449ce7(null, OptionsPortfolioRiskAnalyzerTopNavRowDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsPortfolioRiskAnalyzerTopNavRowDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "items", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$2", m3645f = "OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends NavRowItemViewState>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerTopNavRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerTopNavRowDuxo optionsPortfolioRiskAnalyzerTopNavRowDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerTopNavRowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends NavRowItemViewState> list, Continuation<? super Unit> continuation) {
                return invoke2((List<NavRowItemViewState>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<NavRowItemViewState> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$2$1", m3645f = "OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerTopNavRowViewState, Continuation<? super OptionsPortfolioRiskAnalyzerTopNavRowViewState>, Object> {
                final /* synthetic */ List<NavRowItemViewState> $items;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<NavRowItemViewState> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$items = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$items, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerTopNavRowViewState optionsPortfolioRiskAnalyzerTopNavRowViewState, Continuation<? super OptionsPortfolioRiskAnalyzerTopNavRowViewState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerTopNavRowViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((OptionsPortfolioRiskAnalyzerTopNavRowViewState) this.L$0).copy(extensions2.toPersistentList(this.$items));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void validateCurrentUnderlyingId(final UUID id) {
        withDataState(new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsPortfolioRiskAnalyzerTopNavRowDuxo.validateCurrentUnderlyingId$lambda$1(id, this, (OptionsPortfolioRiskAnalyzerTopNavRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit validateCurrentUnderlyingId$lambda$1(UUID uuid, OptionsPortfolioRiskAnalyzerTopNavRowDuxo optionsPortfolioRiskAnalyzerTopNavRowDuxo, OptionsPortfolioRiskAnalyzerTopNavRowViewState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ImmutableList<NavRowItemViewState> tabItems = ds.getTabItems();
        NavRowItemViewState navRowItemViewState = (NavRowItemViewState) CollectionsKt.firstOrNull((List) tabItems);
        UUID underlyingId = navRowItemViewState != null ? navRowItemViewState.getUnderlyingId() : null;
        if (uuid != null && (tabItems == null || !tabItems.isEmpty())) {
            Iterator<NavRowItemViewState> it = tabItems.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getUnderlyingId(), uuid)) {
                    break;
                }
            }
            if (underlyingId != null) {
            }
        } else if (underlyingId != null) {
            optionsPortfolioRiskAnalyzerTopNavRowDuxo.submit(new OptionsPortfolioRiskAnalyzerTopNavRowEvent.UpdateUnderlyingId(underlyingId));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo$NavRowDuxoInitArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavRowDuxoInitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NavRowDuxoInitArgs> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<NavRowDuxoInitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavRowDuxoInitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavRowDuxoInitArgs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavRowDuxoInitArgs[] newArray(int i) {
                return new NavRowDuxoInitArgs[i];
            }
        }

        public static /* synthetic */ NavRowDuxoInitArgs copy$default(NavRowDuxoInitArgs navRowDuxoInitArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navRowDuxoInitArgs.accountNumber;
            }
            return navRowDuxoInitArgs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NavRowDuxoInitArgs copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new NavRowDuxoInitArgs(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavRowDuxoInitArgs) && Intrinsics.areEqual(this.accountNumber, ((NavRowDuxoInitArgs) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "NavRowDuxoInitArgs(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public NavRowDuxoInitArgs(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo$NavRowDuxoInitArgs;", "<init>", "()V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionsPortfolioRiskAnalyzerTopNavRowDuxo, NavRowDuxoInitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public NavRowDuxoInitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (NavRowDuxoInitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public NavRowDuxoInitArgs getArgs(OptionsPortfolioRiskAnalyzerTopNavRowDuxo optionsPortfolioRiskAnalyzerTopNavRowDuxo) {
            return (NavRowDuxoInitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerTopNavRowDuxo);
        }
    }
}
