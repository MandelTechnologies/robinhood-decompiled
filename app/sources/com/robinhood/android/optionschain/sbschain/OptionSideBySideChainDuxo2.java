package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.utils.http.HttpStatusCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionSideBySideChainDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {HttpStatusCode.DOWNTIME_ERROR}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldShowDeeplinkNux;
    final /* synthetic */ boolean $shouldShowNormalNux;
    int label;
    final /* synthetic */ OptionSideBySideChainDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainDuxo2(OptionSideBySideChainDuxo optionSideBySideChainDuxo, boolean z, boolean z2, Continuation<? super OptionSideBySideChainDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionSideBySideChainDuxo;
        this.$shouldShowDeeplinkNux = z;
        this.$shouldShowNormalNux = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainDuxo2(this.this$0, this.$shouldShowDeeplinkNux, this.$shouldShowNormalNux, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowTake = FlowKt.take(FlowKt.m28818catch(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{Experiments.OptionsSideBySideChainNuxRevampExperiment.INSTANCE}, false, null, 6, null), new C243881(null)), 1);
            C243892 c243892 = new C243892(this.this$0, this.$shouldShowDeeplinkNux, this.$shouldShowNormalNux, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowTake, c243892, this) == coroutine_suspended) {
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

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {519}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$1 */
    static final class C243881 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C243881(Continuation<? super C243881> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C243881 c243881 = new C243881(continuation);
            c243881.L$0 = flowCollector;
            return c243881.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inSbsNuxRevampExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$2 */
    static final class C243892 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $shouldShowDeeplinkNux;
        final /* synthetic */ boolean $shouldShowNormalNux;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ OptionSideBySideChainDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C243892(OptionSideBySideChainDuxo optionSideBySideChainDuxo, boolean z, boolean z2, Continuation<? super C243892> continuation) {
            super(2, continuation);
            this.this$0 = optionSideBySideChainDuxo;
            this.$shouldShowDeeplinkNux = z;
            this.$shouldShowNormalNux = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C243892 c243892 = new C243892(this.this$0, this.$shouldShowDeeplinkNux, this.$shouldShowNormalNux, continuation);
            c243892.Z$0 = ((Boolean) obj).booleanValue();
            return c243892;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C243892) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OptionSideBySideChainDataState4 optionSideBySideChainDataState4;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = !this.this$0.optionSbsEduFooterDismissedPref.get() && this.Z$0;
                if (this.$shouldShowDeeplinkNux && (((InternalOptionChainFragmentKey) OptionSideBySideChainDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getLaunchMode() instanceof OptionChainLaunchMode.SideBySideChainOnboardingFirstStep)) {
                    optionSideBySideChainDataState4 = OptionSideBySideChainDataState4.DEEPLINK_ONBOARDING;
                } else if (this.$shouldShowDeeplinkNux) {
                    optionSideBySideChainDataState4 = OptionSideBySideChainDataState4.DEEPLINK_AFTER_SEARCH;
                } else if (z) {
                    optionSideBySideChainDataState4 = OptionSideBySideChainDataState4.SBS_NUX_REVAMP;
                } else {
                    optionSideBySideChainDataState4 = this.$shouldShowNormalNux ? OptionSideBySideChainDataState4.NORMAL : OptionSideBySideChainDataState4.NONE;
                }
                this.this$0.applyMutation(new AnonymousClass1(optionSideBySideChainDataState4, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$2$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainNuxMode$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionSideBySideChainDataState4 $nuxMode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainDataState4 optionSideBySideChainDataState4, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$nuxMode = optionSideBySideChainDataState4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nuxMode, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, this.$nuxMode, false, false, false, false, false, null, false, false, false, -4194305, null);
            }
        }
    }
}
