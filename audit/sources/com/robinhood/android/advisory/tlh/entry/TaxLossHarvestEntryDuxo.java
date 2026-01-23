package com.robinhood.android.advisory.tlh.entry;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.prefs.BooleanPreference;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: TaxLossHarvestEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "nuxScreenImpressionsPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/prefs/BooleanPreference;)V", "markNuxSeen", "", "onStart", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TaxLossHarvestEntryDuxo extends BaseDuxo4<TaxLossHarvestEntryViewState> {
    public static final int $stable = 8;
    private final BooleanPreference nuxScreenImpressionsPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestEntryDuxo(DuxoBundle duxoBundle, @TaxLossHarvestNuxScreenImpressionsPref BooleanPreference nuxScreenImpressionsPref) {
        super(new TaxLossHarvestEntryViewState(nuxScreenImpressionsPref.get()), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(nuxScreenImpressionsPref, "nuxScreenImpressionsPref");
        this.nuxScreenImpressionsPref = nuxScreenImpressionsPref;
    }

    /* compiled from: TaxLossHarvestEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$markNuxSeen$1", m3645f = "TaxLossHarvestEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$markNuxSeen$1 */
    static final class C93881 extends ContinuationImpl7 implements Function2<TaxLossHarvestEntryViewState, Continuation<? super TaxLossHarvestEntryViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C93881(Continuation<? super C93881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C93881 c93881 = new C93881(continuation);
            c93881.L$0 = obj;
            return c93881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TaxLossHarvestEntryViewState taxLossHarvestEntryViewState, Continuation<? super TaxLossHarvestEntryViewState> continuation) {
            return ((C93881) create(taxLossHarvestEntryViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((TaxLossHarvestEntryViewState) this.L$0).copy(true);
        }
    }

    public final void markNuxSeen() {
        this.nuxScreenImpressionsPref.set(true);
        applyMutation(new C93881(null));
    }

    /* compiled from: TaxLossHarvestEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1", m3645f = "TaxLossHarvestEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1 */
    static final class C93891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C93891(Continuation<? super C93891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C93891 c93891 = TaxLossHarvestEntryDuxo.this.new C93891(continuation);
            c93891.L$0 = obj;
            return c93891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C93891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TaxLossHarvestEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1", m3645f = "TaxLossHarvestEntryDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TaxLossHarvestEntryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taxLossHarvestEntryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.nuxScreenImpressionsPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
                    C496101 c496101 = new C496101(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c496101, this) == coroutine_suspended) {
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

            /* compiled from: TaxLossHarvestEntryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasSeenNuxScreen", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1$1", m3645f = "TaxLossHarvestEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496101 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ TaxLossHarvestEntryDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496101(TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo, Continuation<? super C496101> continuation) {
                    super(2, continuation);
                    this.this$0 = taxLossHarvestEntryDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496101 c496101 = new C496101(this.this$0, continuation);
                    c496101.Z$0 = ((Boolean) obj).booleanValue();
                    return c496101;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C496101) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TaxLossHarvestEntryDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1$1$1", m3645f = "TaxLossHarvestEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496111 extends ContinuationImpl7 implements Function2<TaxLossHarvestEntryViewState, Continuation<? super TaxLossHarvestEntryViewState>, Object> {
                    final /* synthetic */ boolean $hasSeenNuxScreen;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496111(boolean z, Continuation<? super C496111> continuation) {
                        super(2, continuation);
                        this.$hasSeenNuxScreen = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496111 c496111 = new C496111(this.$hasSeenNuxScreen, continuation);
                        c496111.L$0 = obj;
                        return c496111;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TaxLossHarvestEntryViewState taxLossHarvestEntryViewState, Continuation<? super TaxLossHarvestEntryViewState> continuation) {
                        return ((C496111) create(taxLossHarvestEntryViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((TaxLossHarvestEntryViewState) this.L$0).copy(this.$hasSeenNuxScreen);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496111(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(TaxLossHarvestEntryDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C93891(null));
    }
}
