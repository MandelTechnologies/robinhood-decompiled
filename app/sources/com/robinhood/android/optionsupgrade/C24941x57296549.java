package com.robinhood.android.optionsupgrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.level0.OptionUpgradeExperiments;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C24941x57296549 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>>, Account, Continuation<? super Unit>, Object> {
    final /* synthetic */ Experiment $postEnablementExperiment$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionOnboardingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24941x57296549(Continuation continuation, Experiment experiment, OptionOnboardingDuxo optionOnboardingDuxo) {
        super(3, continuation);
        this.$postEnablementExperiment$inlined = experiment;
        this.this$0 = optionOnboardingDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>> flowCollector, Account account, Continuation<? super Unit> continuation) {
        C24941x57296549 c24941x57296549 = new C24941x57296549(continuation, this.$postEnablementExperiment$inlined, this.this$0);
        c24941x57296549.L$0 = flowCollector;
        c24941x57296549.L$1 = account;
        return c24941x57296549.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowBuffer$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Account account = (Account) this.L$1;
            List<Experiment<?>> option_upgrade_experiments = OptionUpgradeExperiments.getOPTION_UPGRADE_EXPERIMENTS();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(option_upgrade_experiments, 10));
            Iterator<T> it = option_upgrade_experiments.iterator();
            while (it.hasNext()) {
                final Experiment experiment = (Experiment) it.next();
                if (account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    flowBuffer$default = FlowKt.flowOf(Tuples4.m3642to(experiment.getServerName(), Optional.INSTANCE.m2972of(KaizenExperiment.VARIATION_CONTROL)));
                } else {
                    Observable map = ExperimentsProvider.DefaultImpls.streamVariation$default(this.this$0.experimentsStore, experiment, false, 2, null).map(new Function() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$experimentAssignments$1$onboardingImprovementExperiments$1$1
                        @Override // io.reactivex.functions.Function
                        public final Tuples2<String, Optional<String>> apply(Optional<String> it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Tuples4.m3642to(experiment.getServerName(), it2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
                }
                arrayList.add(flowBuffer$default);
            }
            List<Experiment<?>> listListOf = CollectionsKt.listOf(this.$postEnablementExperiment$inlined);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            for (final Experiment<?> experiment2 : listListOf) {
                ObservableSource map2 = this.this$0.experimentsStore.streamVariation(experiment2, false).map(new Function() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$experimentAssignments$1$otherExperiments$1$1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<String, Optional<String>> apply(Optional<String> it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Tuples4.m3642to(experiment2.getServerName(), it2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                arrayList2.add(Context7.buffer$default(RxConvert.asFlow(map2), Integer.MAX_VALUE, null, 2, null));
            }
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2)).toArray(new Flow[0]);
            Flow<List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>> flow = new Flow<List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$lambda$3$$inlined$combine$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>> flowCollector2, Continuation continuation) {
                    final Flow[] flowArr2 = flowArr;
                    Object objCombineInternal = Combine.combineInternal(flowCollector2, flowArr2, new Function0<Tuples2<? extends String, ? extends Optional<? extends String>>[]>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$lambda$3$$inlined$combine$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Tuples2<? extends String, ? extends Optional<? extends String>>[] invoke() {
                            return new Tuples2[flowArr2.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$lambda$3$$inlined$combine$1$3", m3645f = "OptionOnboardingDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1$invokeSuspend$lambda$3$$inlined$combine$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>>, Tuples2<? extends String, ? extends Optional<? extends String>>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends Tuples2<? extends String, ? extends Optional<? extends String>>>> flowCollector, Tuples2<? extends String, ? extends Optional<? extends String>>[] tuples2Arr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = tuples2Arr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List list = ArraysKt.toList((Tuples2[]) ((Object[]) this.L$1));
                            this.label = 1;
                            if (flowCollector.emit(list, this) == coroutine_suspended) {
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
