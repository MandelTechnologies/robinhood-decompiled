package com.robinhood.android.equities.taxlots.appbar;

import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TableDetails;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
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
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: TaxLotsTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getTaxLotsCachedService", "()Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "lotStatus", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsTopAppBarDuxo extends BaseDuxo4<SelectLotsTopAppBarViewState> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final TaxLotsCachedService taxLotsCachedService;

    public final TaxLotsCachedService getTaxLotsCachedService() {
        return this.taxLotsCachedService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotsTopAppBarDuxo(TaxLotsCachedService taxLotsCachedService, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new SelectLotsTopAppBarViewState(null, null, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLotsCachedService = taxLotsCachedService;
        this.experimentsStore = experimentsStore;
    }

    /* compiled from: TaxLotsTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1", m3645f = "TaxLotsTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1 */
    static final class C148601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TaxLotStatus $lotStatus;
        final /* synthetic */ UUID $orderId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148601(String str, UUID uuid, UUID uuid2, TaxLotStatus taxLotStatus, Continuation<? super C148601> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$lotStatus = taxLotStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148601 c148601 = TaxLotsTopAppBarDuxo.this.new C148601(this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotStatus, continuation);
            c148601.L$0 = obj;
            return c148601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TaxLotsTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$1", m3645f = "TaxLotsTopAppBarDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TaxLotsTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taxLotsTopAppBarDuxo;
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null);
                    final TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo.bind.1.1.1

                        /* compiled from: TaxLotsTopAppBarDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$1$1$1", m3645f = "TaxLotsTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498791 extends ContinuationImpl7 implements Function2<SelectLotsTopAppBarViewState, Continuation<? super SelectLotsTopAppBarViewState>, Object> {
                            final /* synthetic */ boolean $enabled;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498791(boolean z, Continuation<? super C498791> continuation) {
                                super(2, continuation);
                                this.$enabled = z;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498791 c498791 = new C498791(this.$enabled, continuation);
                                c498791.L$0 = obj;
                                return c498791;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, Continuation<? super SelectLotsTopAppBarViewState> continuation) {
                                return ((C498791) create(selectLotsTopAppBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsTopAppBarViewState.copy$default((SelectLotsTopAppBarViewState) this.L$0, null, null, this.$enabled, 3, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            taxLotsTopAppBarDuxo.applyMutation(new C498791(z, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TaxLotsTopAppBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TaxLotsTopAppBarDuxo.this, this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotStatus, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TaxLotsTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$2", m3645f = "TaxLotsTopAppBarDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TaxLotStatus $lotStatus;
            final /* synthetic */ UUID $orderId;
            int label;
            final /* synthetic */ TaxLotsTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo, String str, UUID uuid, UUID uuid2, TaxLotStatus taxLotStatus, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = taxLotsTopAppBarDuxo;
                this.$accountNumber = str;
                this.$orderId = uuid;
                this.$instrumentId = uuid2;
                this.$lotStatus = taxLotStatus;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotStatus, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<StreamTaxLotsSummaryResponse> flowStreamTaxLotSummary = this.this$0.getTaxLotsCachedService().streamTaxLotSummary(this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotStatus);
                    final TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo = this.this$0;
                    FlowCollector<? super StreamTaxLotsSummaryResponse> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo.bind.1.2.1

                        /* compiled from: TaxLotsTopAppBarDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$2$1$1", m3645f = "TaxLotsTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.appbar.SelectLotsTopAppBarDuxo$bind$1$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498801 extends ContinuationImpl7 implements Function2<SelectLotsTopAppBarViewState, Continuation<? super SelectLotsTopAppBarViewState>, Object> {
                            final /* synthetic */ StreamTaxLotsSummaryResponse $summary;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498801(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, Continuation<? super C498801> continuation) {
                                super(2, continuation);
                                this.$summary = streamTaxLotsSummaryResponse;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498801 c498801 = new C498801(this.$summary, continuation);
                                c498801.L$0 = obj;
                                return c498801;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, Continuation<? super SelectLotsTopAppBarViewState> continuation) {
                                return ((C498801) create(selectLotsTopAppBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                SelectLotsTopAppBarViewState selectLotsTopAppBarViewState = (SelectLotsTopAppBarViewState) this.L$0;
                                TableDetails table_details = this.$summary.getTable_details();
                                String header_title = table_details != null ? table_details.getHeader_title() : null;
                                TableDetails table_details2 = this.$summary.getTable_details();
                                return SelectLotsTopAppBarViewState.copy$default(selectLotsTopAppBarViewState, header_title, table_details2 != null ? table_details2.getHeader_subtitle() : null, false, 4, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((StreamTaxLotsSummaryResponse) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, Continuation<? super Unit> continuation) {
                            taxLotsTopAppBarDuxo.applyMutation(new C498801(streamTaxLotsSummaryResponse, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamTaxLotSummary.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    public final Job bind(String accountNumber, UUID orderId, UUID instrumentId, TaxLotStatus lotStatus) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotStatus, "lotStatus");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C148601(accountNumber, orderId, instrumentId, lotStatus, null), 3, null);
    }
}
