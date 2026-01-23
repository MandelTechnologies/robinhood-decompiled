package com.robinhood.librobinhood.data.store;

import androidx.collection.LruCache;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChain4;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: OptionUnderlyingQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0010\u001a\u00020\fJ\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "Lcom/robinhood/store/Store;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/store/StoreBundle;)V", "underlyingQuoteCache", "Landroidx/collection/LruCache;", "Lcom/robinhood/models/db/Underlying;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/UnderlyingQuote;", "streamUnderlyingQuoteWithCache", "underlying", "streamUnderlyingQuote", "underlyingId", "Ljava/util/UUID;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionUnderlyingQuoteStore extends Store {
    private final QuoteStore equityQuoteStore;
    private final IndexStore indexStore;
    private final LruCache<OptionChain4, Flow<UnderlyingQuote>> underlyingQuoteCache;

    /* compiled from: OptionUnderlyingQuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionUnderlyingQuoteStore(QuoteStore equityQuoteStore, IndexStore indexStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equityQuoteStore = equityQuoteStore;
        this.indexStore = indexStore;
        this.underlyingQuoteCache = new LruCache<>(3);
    }

    public final Flow<UnderlyingQuote> streamUnderlyingQuoteWithCache(OptionChain4 underlying) {
        Flow<UnderlyingQuote> flowShareIn;
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        synchronized (this.underlyingQuoteCache) {
            flowShareIn = this.underlyingQuoteCache.get(underlying);
            if (flowShareIn == null) {
                flowShareIn = FlowKt.shareIn(streamUnderlyingQuote(underlying), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(0L, 1800000L), 1);
                this.underlyingQuoteCache.put(underlying, flowShareIn);
            }
        }
        return flowShareIn;
    }

    public final Flow<UnderlyingQuote> streamUnderlyingQuote(OptionChain4 underlying) {
        OptionChain.UnderlyingType underlyingType;
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        UUID underlyingId = underlying.getUnderlyingId();
        if (underlying instanceof OptionChain4.EquityUnderlying) {
            underlyingType = OptionChain.UnderlyingType.EQUITY;
        } else {
            if (!(underlying instanceof OptionChain4.IndexUnderlying)) {
                throw new NoWhenBranchMatchedException();
            }
            underlyingType = OptionChain.UnderlyingType.INDEX;
        }
        return streamUnderlyingQuote(underlyingId, underlyingType);
    }

    public final Flow<UnderlyingQuote> streamUnderlyingQuote(UUID underlyingId, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        int i = WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
        if (i == 1) {
            final Flow<Quote> flowStreamQuote = this.equityQuoteStore.streamQuote(underlyingId);
            return new Flow<UnderlyingQuote>() { // from class: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$1$2 */
                public static final class C341532<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$1$2", m3645f = "OptionUnderlyingQuoteStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C341532.this.emit(null, this);
                        }
                    }

                    public C341532(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            UnderlyingQuote underlyingQuote$default = UnderlyingQuote.Companion.getUnderlyingQuote$default(UnderlyingQuote.INSTANCE, (Quote) obj, null, 2, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(underlyingQuote$default, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super UnderlyingQuote> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamQuote.collect(new C341532(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        final Flow<IndexValue> flowStreamIndexValue = this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(underlyingId));
        return new Flow<UnderlyingQuote>() { // from class: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$2$2 */
            public static final class C341542<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$2$2", m3645f = "OptionUnderlyingQuoteStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore$streamUnderlyingQuote$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C341542.this.emit(null, this);
                    }
                }

                public C341542(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UnderlyingQuote underlyingQuote$default = UnderlyingQuote.Companion.getUnderlyingQuote$default(UnderlyingQuote.INSTANCE, null, (IndexValue) obj, 1, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(underlyingQuote$default, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UnderlyingQuote> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamIndexValue.collect(new C341542(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
