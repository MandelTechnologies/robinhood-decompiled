package com.robinhood.android.common.options.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import java.util.UUID;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$$inlined$flatMapLatest$1", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$$inlined$flatMapLatest$1 */
/* loaded from: classes2.dex */
public final class C11331x85360e83 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Optional<? extends Index>, ? extends Integer>>, Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ IndexStore $indexStore$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11331x85360e83(Continuation continuation, IndexStore indexStore) {
        super(3, continuation);
        this.$indexStore$inlined = indexStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Optional<? extends Index>, ? extends Integer>> flowCollector, Tuples2<? extends UiOptionStrategyInfo, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C11331x85360e83 c11331x85360e83 = new C11331x85360e83(continuation, this.$indexStore$inlined);
        c11331x85360e83.L$0 = flowCollector;
        c11331x85360e83.L$1 = tuples2;
        return c11331x85360e83.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Tuples2<? extends Optional<? extends Index>, ? extends Integer>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
            final int iIntValue = ((Number) tuples2.component2()).intValue();
            UUID indexUnderlyingId = OptionUnderlyings.getIndexUnderlyingId(uiOptionStrategyInfo.getUnderlyings());
            if (indexUnderlyingId != null) {
                final Flow<Index> flowStreamIndex = this.$indexStore$inlined.streamIndex(indexUnderlyingId);
                flowFlowOf = new Flow<Tuples2<? extends Optional<? extends Index>, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$lambda$16$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Optional<? extends Index>, ? extends Integer>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamIndex.collect(new AnonymousClass2(flowCollector2, iIntValue), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$lambda$16$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ int $i$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$lambda$16$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexInstrumentToIndexFlow$lambda$16$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, int i) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$i$inlined = i;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(Optional3.asOptional((Index) obj), boxing.boxInt(this.$i$inlined));
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
                };
            } else {
                flowFlowOf = FlowKt.flowOf(Tuples4.m3642to(Optional2.INSTANCE, boxing.boxInt(iIntValue)));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
