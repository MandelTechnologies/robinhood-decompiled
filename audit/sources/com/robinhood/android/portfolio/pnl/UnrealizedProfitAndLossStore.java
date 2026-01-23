package com.robinhood.android.portfolio.pnl;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: UnrealizedProfitAndLossStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "Lcom/robinhood/store/Store;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/store/StoreBundle;)V", "getUnrealizedProfitAndLossDataForInstrument", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "streamQuote", "Lcom/robinhood/models/db/Quote;", "instrumentHalted", "", "streamQuote$lib_store_profit_and_loss_externalDebug", "legacyStreamQuoteObservable", "Lio/reactivex/Observable;", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UnrealizedProfitAndLossStore extends Store {
    public static final int $stable = 8;
    private final EquitiesBrokeback equitiesBrokeback;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnrealizedProfitAndLossStore(QuoteStore quoteStore, PositionStore positionStore, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.quoteStore = quoteStore;
        this.positionStore = positionStore;
        this.equitiesBrokeback = equitiesBrokeback;
    }

    public final Flow<UnrealizedProfitAndLossData> getUnrealizedProfitAndLossDataForInstrument(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccount$default(this.positionStore, instrumentId, accountNumber, false, 4, null)), Integer.MAX_VALUE, null, 2, null)), new C25675x5a97c543(null, this, instrumentId));
    }

    public final Flow<Quote> streamQuote$lib_store_profit_and_loss_externalDebug(final UUID instrumentId, final boolean instrumentHalted) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.quoteStore.getStreamQuote().asFlow(instrumentId));
        return new Flow<Quote>() { // from class: com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore$streamQuote$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore$streamQuote$$inlined$map$1$2 */
            public static final class C256772<T> implements FlowCollector {
                final /* synthetic */ boolean $instrumentHalted$inlined;
                final /* synthetic */ UUID $instrumentId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ UnrealizedProfitAndLossStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore$streamQuote$$inlined$map$1$2", m3645f = "UnrealizedProfitAndLossStore.kt", m3646l = {52, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore$streamQuote$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C256772.this.emit(null, this);
                    }
                }

                public C256772(FlowCollector flowCollector, boolean z, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$instrumentHalted$inlined = z;
                    this.this$0 = unrealizedProfitAndLossStore;
                    this.$instrumentId$inlined = uuid;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
                
                    if (r1.emit(r14, r8) != r2) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    Quote quoteCopy$default;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    Object obj2 = anonymousClass12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass12.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        quoteCopy$default = (Quote) obj;
                        if (this.$instrumentHalted$inlined) {
                            EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
                            UUID uuid = this.$instrumentId$inlined;
                            String serverValue = Historical.Bounds.EXTENDED.getServerValue();
                            Boolean boolBoxBoolean = boxing.boxBoolean(true);
                            anonymousClass12.L$0 = flowCollector;
                            anonymousClass12.L$1 = quoteCopy$default;
                            anonymousClass12.label = 1;
                            Object quote$default = EquitiesBrokeback.DefaultImpls.getQuote$default(equitiesBrokeback, uuid, null, serverValue, boolBoxBoolean, anonymousClass12, 2, null);
                            if (quote$default != coroutine_suspended) {
                                flowCollector2 = flowCollector;
                                obj2 = quote$default;
                            }
                        } else {
                            anonymousClass12.L$0 = null;
                            anonymousClass12.L$1 = null;
                            anonymousClass12.label = 2;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    Quote quote = (Quote) anonymousClass12.L$1;
                    flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    quoteCopy$default = quote;
                    quoteCopy$default = Quote.copy$default(quoteCopy$default, null, null, null, null, null, false, null, ApiQuote.toDbQuote$default((ApiQuote) obj2, null, 1, null).getLastNonRegularHoursTradePrice(), null, null, null, null, null, null, false, null, null, null, null, null, 1048447, null);
                    flowCollector = flowCollector2;
                    anonymousClass12.L$0 = null;
                    anonymousClass12.L$1 = null;
                    anonymousClass12.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Quote> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C256772(flowCollector, instrumentHalted, this, instrumentId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<Quote> legacyStreamQuoteObservable(UUID instrumentId, boolean instrumentHalted) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return asObservable(streamQuote$lib_store_profit_and_loss_externalDebug(instrumentId, instrumentHalted));
    }
}
