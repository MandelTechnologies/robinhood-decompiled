package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$$inlined$flatMapLatest$1", m3645f = "CryptoAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33665xf713d3e2 extends ContinuationImpl7 implements Function3<FlowCollector<? super CryptoAccount>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33665xf713d3e2(Continuation continuation, CryptoAccountStore cryptoAccountStore, String str) {
        super(3, continuation);
        this.this$0 = cryptoAccountStore;
        this.$accountNumber$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super CryptoAccount> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        C33665xf713d3e2 c33665xf713d3e2 = new C33665xf713d3e2(continuation, this.this$0, this.$accountNumber$inlined);
        c33665xf713d3e2.L$0 = flowCollector;
        c33665xf713d3e2.L$1 = bool;
        return c33665xf713d3e2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<CryptoAccount> flowStreamAccount;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                final Flow flowAsFlow = QueryKt.asFlow(this.this$0.getAccountsQuery);
                final String str = this.$accountNumber$inlined;
                flowStreamAccount = new Flow<CryptoAccount>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$lambda$11$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoAccount> flowCollector2, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector2, str), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$lambda$11$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ String $accountNumber$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$lambda$11$$inlined$map$1$2", m3645f = "CryptoAccountStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamSelectedAccountByAccountNumber$lambda$11$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, String str) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$accountNumber$inlined = str;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            CryptoAccount cryptoAccount;
                            T next;
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
                                List list = (List) obj;
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    cryptoAccount = null;
                                    if (!it.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.areEqual(((CryptoAccount) next).getRhsAccountNumber(), this.$accountNumber$inlined)) {
                                        break;
                                    }
                                }
                                CryptoAccount cryptoAccount2 = next;
                                if (cryptoAccount2 == null) {
                                    Iterator<T> it2 = list.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        T next2 = it2.next();
                                        if (Intrinsics.areEqual(((CryptoAccount) next2).getRhfAccountNumber(), this.$accountNumber$inlined)) {
                                            cryptoAccount = next2;
                                            break;
                                        }
                                    }
                                    cryptoAccount2 = cryptoAccount;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoAccount2, anonymousClass1) == coroutine_suspended) {
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
                };
            } else {
                flowStreamAccount = this.this$0.streamAccount();
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamAccount, this) == coroutine_suspended) {
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
