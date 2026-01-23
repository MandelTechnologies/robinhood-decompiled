package com.robinhood.librobinhood.usecase;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "accountNumber", "", "entrypointSurface", "Lcom/robinhood/librobinhood/usecase/ShowOptionsLevel3EntryPointSurface;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CheckOptionUpgradeToLevel3EligibilityUseCase {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final OptionOnboardingStore optionOnboardingStore;
    private final OptionOrderStore optionOrderStore;

    /* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckOptionUpgradeToLevel3EligibilityUseCase3.values().length];
            try {
                iArr[CheckOptionUpgradeToLevel3EligibilityUseCase3.POST_TRADE_UPSELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckOptionUpgradeToLevel3EligibilityUseCase3.OPTIONS_ASSET_HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckOptionUpgradeToLevel3EligibilityUseCase3.SDP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckOptionUpgradeToLevel3EligibilityUseCase(AccountProvider accountProvider, ExperimentsStore experimentsStore, OptionOnboardingStore optionOnboardingStore, OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.optionOnboardingStore = optionOnboardingStore;
        this.optionOrderStore = optionOrderStore;
    }

    public final Flow<Boolean> invoke(String accountNumber, CheckOptionUpgradeToLevel3EligibilityUseCase3 entrypointSurface) {
        Flow flowStreamStateFlow$default;
        Flow flowDistinctUntilChanged;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(entrypointSurface, "entrypointSurface");
        Flow flowTransformLatest = FlowKt.transformLatest(this.accountProvider.streamAllSelfDirectedIndividualAccounts(), new C34919x3f6917b5(null, accountNumber));
        Flow flowTransformLatest2 = FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.optionOnboardingStore.streamOptionOnboardingOptionsStatus(accountNumber)), new C34920x3f6917b6(null));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[entrypointSurface.ordinal()];
        if (i == 1) {
            flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsLevel3EntryPointPostTradeUpsell.INSTANCE}, false, null, 6, null);
        } else if (i == 2) {
            flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsLevel3EntryPointAssetHome.INSTANCE}, false, null, 6, null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsLevel3EntryPointSdp.INSTANCE}, false, null, 6, null);
        }
        int i2 = iArr[entrypointSurface.ordinal()];
        if (i2 == 1 || i2 == 2) {
            final Flow flowOnStart = FlowKt.onStart(this.optionOrderStore.getFilledOptionOrderCountForAccount(accountNumber), new CheckOptionUpgradeToLevel3EligibilityUseCase2(this, null));
            flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$$inlined$map$1$2", m3645f = "CheckOptionUpgradeToLevel3EligibilityUseCase.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                            Boolean boolBoxBoolean = boxing.boxBoolean(((Number) obj).intValue() >= 10);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowOnStart.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flowDistinctUntilChanged = FlowKt.flowOf(Boolean.TRUE);
        }
        return Operators.connectWhen(FlowKt.combine(flowTransformLatest, flowTransformLatest2, flowDistinctUntilChanged, new C349221(null)), flowStreamStateFlow$default, FlowKt.flowOf(Boolean.FALSE));
    }

    /* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "isAccountEligible", "isCurrentOptionsStatusEligible", "tradeCountEligibilityFlow"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$1", m3645f = "CheckOptionUpgradeToLevel3EligibilityUseCase.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$1 */
    static final class C349221 extends ContinuationImpl7 implements Function4<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        C349221(Continuation<? super C349221> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Boolean> continuation) {
            C349221 c349221 = new C349221(continuation);
            c349221.Z$0 = z;
            c349221.Z$1 = z2;
            c349221.Z$2 = z3;
            return c349221.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.Z$0 && this.Z$1 && this.Z$2);
        }
    }
}
