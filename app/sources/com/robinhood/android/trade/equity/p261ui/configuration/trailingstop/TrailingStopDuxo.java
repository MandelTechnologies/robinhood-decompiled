package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrailingStopDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "instrumentId", "Ljava/util/UUID;", "onResume", "", "setTrailType", "type", "Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;", "setTrailAmount", "amount", "Ljava/math/BigDecimal;", "validatePrice", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TrailingStopDuxo extends BaseDuxo3<TrailingStopDataState, TrailingStopViewState, TrailingStopEvent> implements HasSavedState {
    private final UUID instrumentId;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TrailingStopDuxo(InstrumentStore instrumentStore, QuoteStore quoteStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, TrailingStopStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new TrailingStopDataState(((TrailingStopFragment.Args) companion.getArgs(savedStateHandle)).getScreenType().getSide(), null, null, null, null, null, 62, null), stateProvider, duxoBundle);
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.savedStateHandle = savedStateHandle;
        this.instrumentId = ((TrailingStopFragment.Args) companion.getArgs(getSavedStateHandle())).getInstrumentId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.instrumentStore.refresh(false, this.instrumentId);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(this.instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrailingStopDuxo.onResume$lambda$0(this.f$0, (Instrument) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.quoteStore.getStreamQuote().asObservable(this.instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrailingStopDuxo.onResume$lambda$1(this.f$0, (Quote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(TrailingStopDuxo trailingStopDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        trailingStopDuxo.applyMutation(new TrailingStopDuxo2(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(TrailingStopDuxo trailingStopDuxo, Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        trailingStopDuxo.applyMutation(new TrailingStopDuxo3(quote, null));
        return Unit.INSTANCE;
    }

    /* compiled from: TrailingStopDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$setTrailType$1", m3645f = "TrailingStopDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$setTrailType$1 */
    static final class C294501 extends ContinuationImpl7 implements Function2<TrailingStopDataState, Continuation<? super TrailingStopDataState>, Object> {
        final /* synthetic */ OrderTrailingPeg.TrailingPegType $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294501(OrderTrailingPeg.TrailingPegType trailingPegType, Continuation<? super C294501> continuation) {
            super(2, continuation);
            this.$type = trailingPegType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294501 c294501 = new C294501(this.$type, continuation);
            c294501.L$0 = obj;
            return c294501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrailingStopDataState trailingStopDataState, Continuation<? super TrailingStopDataState> continuation) {
            return ((C294501) create(trailingStopDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((TrailingStopDataState) this.L$0).updateTrailType(this.$type);
        }
    }

    public final void setTrailType(OrderTrailingPeg.TrailingPegType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        applyMutation(new C294501(type2, null));
    }

    /* compiled from: TrailingStopDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$setTrailAmount$1", m3645f = "TrailingStopDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$setTrailAmount$1 */
    static final class C294491 extends ContinuationImpl7 implements Function2<TrailingStopDataState, Continuation<? super TrailingStopDataState>, Object> {
        final /* synthetic */ BigDecimal $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294491(BigDecimal bigDecimal, Continuation<? super C294491> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294491 c294491 = new C294491(this.$amount, continuation);
            c294491.L$0 = obj;
            return c294491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrailingStopDataState trailingStopDataState, Continuation<? super TrailingStopDataState> continuation) {
            return ((C294491) create(trailingStopDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((TrailingStopDataState) this.L$0).updateTrailAmount(this.$amount);
        }
    }

    public final void setTrailAmount(BigDecimal amount) {
        applyMutation(new C294491(amount, null));
    }

    /* compiled from: TrailingStopDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$validatePrice$1", m3645f = "TrailingStopDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopDuxo$validatePrice$1 */
    static final class C294511 extends ContinuationImpl7 implements Function2<TrailingStopDataState, Continuation<? super TrailingStopDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294511(Continuation<? super C294511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294511 c294511 = new C294511(continuation);
            c294511.L$0 = obj;
            return c294511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrailingStopDataState trailingStopDataState, Continuation<? super TrailingStopDataState> continuation) {
            return ((C294511) create(trailingStopDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((TrailingStopDataState) this.L$0).validate();
        }
    }

    public final void validatePrice() {
        applyMutation(new C294511(null));
    }

    /* compiled from: TrailingStopDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TrailingStopDuxo, TrailingStopFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TrailingStopFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (TrailingStopFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TrailingStopFragment.Args getArgs(TrailingStopDuxo trailingStopDuxo) {
            return (TrailingStopFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, trailingStopDuxo);
        }
    }
}
