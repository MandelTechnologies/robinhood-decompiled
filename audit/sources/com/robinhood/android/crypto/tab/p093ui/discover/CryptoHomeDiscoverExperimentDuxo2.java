package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoHomeDiscoverExperimentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", RhGcmListenerService.EXTRA_CATEGORY}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeDiscoverExperimentDuxo2 extends ContinuationImpl7 implements Function2<CryptoTradingOptionsCategory, Continuation<? super Flow<? extends Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHomeDiscoverExperimentDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeDiscoverExperimentDuxo2(CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Continuation<? super CryptoHomeDiscoverExperimentDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeDiscoverExperimentDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeDiscoverExperimentDuxo2 cryptoHomeDiscoverExperimentDuxo2 = new CryptoHomeDiscoverExperimentDuxo2(this.this$0, continuation);
        cryptoHomeDiscoverExperimentDuxo2.L$0 = obj;
        return cryptoHomeDiscoverExperimentDuxo2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CryptoTradingOptionsCategory cryptoTradingOptionsCategory, Continuation<? super Flow<Tuples2<CryptoTradingOptionsCategory, CryptoTradingOptions>>> continuation) {
        return ((CryptoHomeDiscoverExperimentDuxo2) create(cryptoTradingOptionsCategory, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CryptoTradingOptionsCategory cryptoTradingOptionsCategory, Continuation<? super Flow<? extends Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions>>> continuation) {
        return invoke2(cryptoTradingOptionsCategory, (Continuation<? super Flow<Tuples2<CryptoTradingOptionsCategory, CryptoTradingOptions>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CryptoTradingOptionsCategory cryptoTradingOptionsCategory = (CryptoTradingOptionsCategory) this.L$0;
        final Flow flowStreamTradingOptions$default = CryptoTradingOptionsStore.streamTradingOptions$default(this.this$0.cryptoTradingOptionsStore, CryptoTradingOptionsLocation.DISCOVER_COINS, CryptoTradingAssetType.CRYPTO, cryptoTradingOptionsCategory, null, null, 24, null);
        return new Flow<Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions>>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1$invokeSuspend$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoTradingOptionsCategory $category$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoHomeDiscoverExperimentDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentDuxo$onCreate$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CryptoTradingOptionsCategory cryptoTradingOptionsCategory) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$category$inlined = cryptoTradingOptionsCategory;
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
                        Tuples2 tuples2M3642to = Tuples4.m3642to(this.$category$inlined, (CryptoTradingOptions) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Tuples2<? extends CryptoTradingOptionsCategory, ? extends CryptoTradingOptions>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamTradingOptions$default.collect(new AnonymousClass2(flowCollector, cryptoTradingOptionsCategory), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
