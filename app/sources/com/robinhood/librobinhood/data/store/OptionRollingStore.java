package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiOptionMaxRollableQuantity;
import com.robinhood.models.p320db.OptionMaxRollableQuantity;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionRollingStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/options/retrofit/OptionsApi;)V", "getOptionMaxRollableQuantity", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiOptionMaxRollableQuantity;", "pollOptionMaxRollableQuantity", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/OptionMaxRollableQuantity;", "accountNumber", "strategyCode", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionRollingStore extends Store {
    private final Endpoint<Tuples2<String, String>, ApiOptionMaxRollableQuantity> getOptionMaxRollableQuantity;
    private final OptionsApi optionsApi;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionMaxRollableQuantity$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionRollingStore(StoreBundle storeBundle, OptionsApi optionsApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        this.optionsApi = optionsApi;
        this.getOptionMaxRollableQuantity = Endpoint.INSTANCE.create(new OptionRollingStore2(this, null), getLogoutKillswitch(), new OptionRollingStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionRollingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionRollingStore.getOptionMaxRollableQuantity$lambda$0((Long) obj));
            }
        });
    }

    public final Observable<OptionMaxRollableQuantity> pollOptionMaxRollableQuantity(String accountNumber, String strategyCode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.getOptionMaxRollableQuantity, Tuples4.m3642to(accountNumber, strategyCode), null, null, 6, null);
        return asObservable(new Flow<OptionMaxRollableQuantity>() { // from class: com.robinhood.librobinhood.data.store.OptionRollingStore$pollOptionMaxRollableQuantity$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionRollingStore$pollOptionMaxRollableQuantity$$inlined$map$1$2 */
            public static final class C340972<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionRollingStore$pollOptionMaxRollableQuantity$$inlined$map$1$2", m3645f = "OptionRollingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionRollingStore$pollOptionMaxRollableQuantity$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C340972.this.emit(null, this);
                    }
                }

                public C340972(FlowCollector flowCollector) {
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
                        OptionMaxRollableQuantity dbModel = ((ApiOptionMaxRollableQuantity) obj).toDbModel();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super OptionMaxRollableQuantity> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C340972(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
