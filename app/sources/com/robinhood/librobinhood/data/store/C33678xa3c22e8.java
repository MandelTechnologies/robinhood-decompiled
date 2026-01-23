package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$$inlined$flatMapLatest$1", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33678xa3c22e8 extends ContinuationImpl7 implements Function3<FlowCollector<? super String>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $defaultNumberFlow$inlined;
    final /* synthetic */ CryptoAccountSwitcherLocation $location$inlined;
    final /* synthetic */ Function1 $verifyNumberValidForLocation$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33678xa3c22e8(Continuation continuation, CryptoAccountSwitcherStore cryptoAccountSwitcherStore, Function1 function1, Flow flow, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation) {
        super(3, continuation);
        this.this$0 = cryptoAccountSwitcherStore;
        this.$verifyNumberValidForLocation$inlined = function1;
        this.$defaultNumberFlow$inlined = flow;
        this.$location$inlined = cryptoAccountSwitcherLocation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super String> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        C33678xa3c22e8 c33678xa3c22e8 = new C33678xa3c22e8(continuation, this.this$0, this.$verifyNumberValidForLocation$inlined, this.$defaultNumberFlow$inlined, this.$location$inlined);
        c33678xa3c22e8.L$0 = flowCollector;
        c33678xa3c22e8.L$1 = bool;
        return c33678xa3c22e8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<String> flowCombineTransform;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (!((Boolean) this.L$1).booleanValue()) {
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null);
                flowCombineTransform = new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$lambda$3$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector2, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$lambda$3$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$lambda$3$$inlined$map$1$2", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                Object orNull = ((Optional) obj).getOrNull();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                flowCombineTransform = FlowKt.combineTransform(this.this$0.selectedAccountNumberFlow, FlowKt.transformLatest(this.this$0.selectedAccountNumberFlow, new C33679x6146af9a(null, this.$verifyNumberValidForLocation$inlined)), new CryptoAccountSwitcherStore2(this.$defaultNumberFlow$inlined, this.this$0, this.$location$inlined, null));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCombineTransform, this) == coroutine_suspended) {
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
