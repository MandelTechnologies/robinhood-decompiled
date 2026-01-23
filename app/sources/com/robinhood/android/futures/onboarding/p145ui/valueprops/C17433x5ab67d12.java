package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsDuxo3;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.logging.TimberLogger;
import futures_onboarding_value_props.proto.p463v1.GetValuePropPagesRequestDto;
import futures_onboarding_value_props.proto.p463v1.GetValuePropPagesResponseDto;
import futures_onboarding_value_props.proto.p463v1.LocaleDto;
import futures_onboarding_value_props.proto.p463v1.PageDto;
import futures_onboarding_value_props.proto.p463v1.TypeDto;
import futures_onboarding_value_props.proto.p463v1.ValuePropsService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.Monitoring;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$$inlined$flatMapLatest$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C17433x5ab67d12 extends ContinuationImpl7 implements Function3<FlowCollector<? super ImmutableList<? extends PageDto>>, CountryCode.Supported, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17433x5ab67d12(Continuation continuation, FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo) {
        super(3, continuation);
        this.this$0 = futuresOnboardingValuePropsDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ImmutableList<? extends PageDto>> flowCollector, CountryCode.Supported supported, Continuation<? super Unit> continuation) {
        C17433x5ab67d12 c17433x5ab67d12 = new C17433x5ab67d12(continuation, this.this$0);
        c17433x5ab67d12.L$0 = flowCollector;
        c17433x5ab67d12.L$1 = supported;
        return c17433x5ab67d12.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final CountryCode.Supported supported = (CountryCode.Supported) this.L$1;
            final StateFlow<Monitoring> state = this.this$0.microgramMonitor.getState();
            final FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo = this.this$0;
            Flow<ImmutableList<? extends PageDto>> flow = new Flow<ImmutableList<? extends PageDto>>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super ImmutableList<? extends PageDto>> flowCollector2, Continuation continuation) {
                    Object objCollect = state.collect(new AnonymousClass2(flowCollector2, futuresOnboardingValuePropsDuxo, supported), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ CountryCode.Supported $locality$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$lambda$1$$inlined$map$1$2", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {59, 50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo, CountryCode.Supported supported) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = futuresOnboardingValuePropsDuxo;
                        this.$locality$inlined = supported;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
                    
                        if (r11.emit(r10, r0) == r1) goto L50;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    /* JADX WARN: Type inference failed for: r11v16, types: [kotlinx.collections.immutable.ImmutableList] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        Exception e;
                        FlowCollector flowCollector2;
                        TypeDto typeDto;
                        LocaleDto localeDto;
                        ImmutableList3 immutableList3PersistentListOf;
                        ImmutableList3 immutableList3PersistentListOf2;
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
                            flowCollector = this.$this_unsafeFlow;
                            Monitoring monitoring = (Monitoring) obj;
                            if (monitoring instanceof Monitoring.Loading) {
                                immutableList3PersistentListOf = extensions2.persistentListOf();
                            } else if (monitoring instanceof Monitoring.Terminated) {
                                this.this$0.submit(FuturesOnboardingValuePropsDuxo3.SkipToNextPage.INSTANCE);
                                immutableList3PersistentListOf = extensions2.persistentListOf();
                            } else {
                                if (Intrinsics.areEqual(monitoring, Monitoring.Ready.INSTANCE)) {
                                    try {
                                        ValuePropsService valuePropsService = this.this$0.valuePropsService;
                                        if (((FuturesOnboardingValuePropsFragment.Args) FuturesOnboardingValuePropsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).isEventsContracts()) {
                                            typeDto = TypeDto.TYPE_EVENTS;
                                        } else {
                                            typeDto = TypeDto.TYPE_FUTURES;
                                        }
                                        CountryCode.Supported supported = this.$locality$inlined;
                                        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedStates.INSTANCE)) {
                                            localeDto = LocaleDto.LOCALE_US;
                                        } else {
                                            localeDto = Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE) ? LocaleDto.LOCALE_GB : LocaleDto.LOCALE_UNSPECIFIED;
                                        }
                                        GetValuePropPagesRequestDto getValuePropPagesRequestDto = new GetValuePropPagesRequestDto(typeDto, localeDto);
                                        anonymousClass1.L$0 = flowCollector;
                                        anonymousClass1.label = 1;
                                        Object objGetValuePropPages = valuePropsService.GetValuePropPages(getValuePropPagesRequestDto, anonymousClass1);
                                        if (objGetValuePropPages != coroutine_suspended) {
                                            obj2 = objGetValuePropPages;
                                            flowCollector2 = flowCollector;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        flowCollector2 = flowCollector;
                                        TimberLogger.INSTANCE.mo1682e(e, "Error loading futures value props", new Object[0]);
                                        this.this$0.submit(FuturesOnboardingValuePropsDuxo3.SkipToNextPage.INSTANCE);
                                        immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                        ImmutableList3 immutableList3 = immutableList3PersistentListOf2;
                                        flowCollector = flowCollector2;
                                        immutableList3PersistentListOf = immutableList3;
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                    }
                                    return coroutine_suspended;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj2);
                            } catch (Exception e3) {
                                e = e3;
                                TimberLogger.INSTANCE.mo1682e(e, "Error loading futures value props", new Object[0]);
                                this.this$0.submit(FuturesOnboardingValuePropsDuxo3.SkipToNextPage.INSTANCE);
                                immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                ImmutableList3 immutableList32 = immutableList3PersistentListOf2;
                                flowCollector = flowCollector2;
                                immutableList3PersistentListOf = immutableList32;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                        immutableList3PersistentListOf2 = extensions2.toImmutableList(((GetValuePropPagesResponseDto) obj2).getPages());
                        ImmutableList3 immutableList322 = immutableList3PersistentListOf2;
                        flowCollector = flowCollector2;
                        immutableList3PersistentListOf = immutableList322;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }
            };
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
