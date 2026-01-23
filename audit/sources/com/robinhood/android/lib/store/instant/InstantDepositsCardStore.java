package com.robinhood.android.lib.store.instant;

import com.robinhood.android.lib.api.instant.InstantBonfireApi;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InstantDepositsCardStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00132\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/store/instant/InstantDepositsCardStore;", "Lcom/robinhood/store/Store;", "instantBonfireApi", "Lcom/robinhood/android/lib/api/instant/InstantBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/api/instant/InstantBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "cache", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "refresh", "Lkotlinx/coroutines/Job;", "accountNumber", "streamInstantCard", "Lkotlinx/coroutines/flow/Flow;", "lib-store-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantDepositsCardStore extends Store {
    private final StateFlow2<Map<String, InstantDepositCard>> cache;
    private final Endpoint<String, InstantDepositCard> endpoint;
    private final InstantBonfireApi instantBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantDepositsCardStore(InstantBonfireApi instantBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instantBonfireApi, "instantBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instantBonfireApi = instantBonfireApi;
        this.cache = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InstantDepositsCardStore2(this, null), getLogoutKillswitch(), new InstantDepositsCardStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Job refresh(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, accountNumber, false, null, 6, null);
    }

    public final Flow<InstantDepositCard> streamInstantCard(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final StateFlow2<Map<String, InstantDepositCard>> stateFlow2 = this.cache;
        return FlowKt.distinctUntilChanged(new Flow<InstantDepositCard>() { // from class: com.robinhood.android.lib.store.instant.InstantDepositsCardStore$streamInstantCard$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.store.instant.InstantDepositsCardStore$streamInstantCard$$inlined$map$1$2 */
            public static final class C205732<T> implements FlowCollector {
                final /* synthetic */ String $accountNumber$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.store.instant.InstantDepositsCardStore$streamInstantCard$$inlined$map$1$2", m3645f = "InstantDepositsCardStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.store.instant.InstantDepositsCardStore$streamInstantCard$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C205732.this.emit(null, this);
                    }
                }

                public C205732(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$accountNumber$inlined = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$accountNumber$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super InstantDepositCard> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C205732(flowCollector, accountNumber), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
