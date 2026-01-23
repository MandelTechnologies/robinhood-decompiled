package com.robinhood.android.equities.taxlots.footer;

import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.math.BigDecimals7;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FooterDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;", "Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stateProvider", "Lcom/robinhood/android/equities/taxlots/footer/FooterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/equities/taxlots/footer/FooterStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "argsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo$Args;", "bind", "", "args", "onCreate", "numShares", "Ljava/math/BigDecimal;", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "Args", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FooterDuxo extends BaseDuxo<FooterDataState, FooterViewState> {
    public static final int $stable = 8;
    private final StateFlow2<Args> argsFlow;
    private final ExperimentsStore experimentsStore;
    private final TaxLotsCachedService taxLotsCachedService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterDuxo(TaxLotsCachedService taxLotsCachedService, ExperimentsStore experimentsStore, FooterStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new FooterDataState(null, false, null, null, null, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLotsCachedService = taxLotsCachedService;
        this.experimentsStore = experimentsStore;
        this.argsFlow = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: FooterDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/footer/FooterDuxo$Args;", "", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "invalidNumberOfShares", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getInvalidNumberOfShares", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID instrumentId;
        private final BigDecimal invalidNumberOfShares;
        private final UUID orderId;

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, UUID uuid2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = args.orderId;
            }
            if ((i & 4) != 0) {
                uuid2 = args.instrumentId;
            }
            if ((i & 8) != 0) {
                bigDecimal = args.invalidNumberOfShares;
            }
            return args.copy(str, uuid, uuid2, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getInvalidNumberOfShares() {
            return this.invalidNumberOfShares;
        }

        public final Args copy(String accountNumber, UUID orderId, UUID instrumentId, BigDecimal invalidNumberOfShares) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(accountNumber, orderId, instrumentId, invalidNumberOfShares);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.orderId, args.orderId) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.invalidNumberOfShares, args.invalidNumberOfShares);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31;
            BigDecimal bigDecimal = this.invalidNumberOfShares;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", invalidNumberOfShares=" + this.invalidNumberOfShares + ")";
        }

        public Args(String accountNumber, UUID orderId, UUID instrumentId, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.accountNumber = accountNumber;
            this.orderId = orderId;
            this.instrumentId = instrumentId;
            this.invalidNumberOfShares = bigDecimal;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final BigDecimal getInvalidNumberOfShares() {
            return this.invalidNumberOfShares;
        }
    }

    /* compiled from: FooterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$bind$1", m3645f = "FooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$bind$1 */
    static final class C148711 extends ContinuationImpl7 implements Function2<FooterDataState, Continuation<? super FooterDataState>, Object> {
        final /* synthetic */ Args $args;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148711(Args args, Continuation<? super C148711> continuation) {
            super(2, continuation);
            this.$args = args;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148711 c148711 = new C148711(this.$args, continuation);
            c148711.L$0 = obj;
            return c148711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FooterDataState footerDataState, Continuation<? super FooterDataState> continuation) {
            return ((C148711) create(footerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FooterDataState footerDataState = (FooterDataState) this.L$0;
            Args args = this.$args;
            UUID orderId = args != null ? args.getOrderId() : null;
            Args args2 = this.$args;
            return FooterDataState.copy$default(footerDataState, orderId, false, null, null, null, args2 != null ? args2.getInvalidNumberOfShares() : null, 30, null);
        }
    }

    public final void bind(Args args) {
        this.argsFlow.setValue(args);
        applyMutation(new C148711(args, null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C148721(null));
        FlowKt.launchIn(FlowKt.onEach(FlowKt.transformLatest(this.argsFlow, new FooterDuxo$onCreate$$inlined$flatMapLatest$1(null, this)), new C148733(null)), getLifecycleScope());
    }

    /* compiled from: FooterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1", m3645f = "FooterDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1 */
    static final class C148721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C148721(Continuation<? super C148721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FooterDuxo.this.new C148721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FooterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "m1Enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1$1", m3645f = "FooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ FooterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FooterDuxo footerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = footerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FooterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1$1$1", m3645f = "FooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498811 extends ContinuationImpl7 implements Function2<FooterDataState, Continuation<? super FooterDataState>, Object> {
                final /* synthetic */ boolean $m1Enabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498811(boolean z, Continuation<? super C498811> continuation) {
                    super(2, continuation);
                    this.$m1Enabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498811 c498811 = new C498811(this.$m1Enabled, continuation);
                    c498811.L$0 = obj;
                    return c498811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FooterDataState footerDataState, Continuation<? super FooterDataState> continuation) {
                    return ((C498811) create(footerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FooterDataState.copy$default((FooterDataState) this.L$0, null, this.$m1Enabled, null, null, null, null, 61, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498811(this.Z$0, null));
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
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(FooterDuxo.this.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FooterDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: FooterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$3", m3645f = "FooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$3 */
    static final class C148733 extends ContinuationImpl7 implements Function2<StreamSelectedTaxLotsResponse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C148733(Continuation<? super C148733> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148733 c148733 = FooterDuxo.this.new C148733(continuation);
            c148733.L$0 = obj;
            return c148733;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, Continuation<? super Unit> continuation) {
            return ((C148733) create(streamSelectedTaxLotsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FooterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$3$1", m3645f = "FooterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.footer.FooterDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FooterDataState, Continuation<? super FooterDataState>, Object> {
            final /* synthetic */ StreamSelectedTaxLotsResponse $response;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FooterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, FooterDuxo footerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = streamSelectedTaxLotsResponse;
                this.this$0 = footerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FooterDataState footerDataState, Continuation<? super FooterDataState> continuation) {
                return ((AnonymousClass1) create(footerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FooterDataState footerDataState = (FooterDataState) this.L$0;
                StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = this.$response;
                BigDecimal bigDecimalNumShares = streamSelectedTaxLotsResponse != null ? this.this$0.numShares(streamSelectedTaxLotsResponse) : null;
                StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse2 = this.$response;
                Money estimated_gain_loss = streamSelectedTaxLotsResponse2 != null ? streamSelectedTaxLotsResponse2.getEstimated_gain_loss() : null;
                StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse3 = this.$response;
                return FooterDataState.copy$default(footerDataState, null, false, bigDecimalNumShares, estimated_gain_loss, streamSelectedTaxLotsResponse3 != null ? streamSelectedTaxLotsResponse3.getEstimated_credit() : null, null, 35, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = (StreamSelectedTaxLotsResponse) this.L$0;
            FooterDuxo footerDuxo = FooterDuxo.this;
            footerDuxo.applyMutation(new AnonymousClass1(streamSelectedTaxLotsResponse, footerDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final BigDecimal numShares(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse) {
        BigDecimal next;
        List<TaxLotSelection> lots = streamSelectedTaxLotsResponse.getLots();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = lots.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String shares = ((TaxLotSelection) it.next()).getShares();
            next = shares != null ? StringsKt.toBigDecimalOrNull(shares) : null;
            if (next != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = next.add((BigDecimal) it2.next());
                Intrinsics.checkNotNullExpressionValue(next, "add(...)");
            }
        }
        return BigDecimals7.orZero(next);
    }
}
