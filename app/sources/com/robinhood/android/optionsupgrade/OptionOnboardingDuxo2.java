package com.robinhood.android.optionsupgrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.experiments.Experiment;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import options_product.service.OnboardingExperimentDto;

/* compiled from: OptionOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Loptions_product/service/OnboardingExperimentDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$cachedExperiments$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingDuxo2 extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends OnboardingExperimentDto>>, Object> {
    int label;
    final /* synthetic */ OptionOnboardingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingDuxo2(OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super OptionOnboardingDuxo2> continuation) {
        super(1, continuation);
        this.this$0 = optionOnboardingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OptionOnboardingDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends OnboardingExperimentDto>> continuation) {
        return invoke2((Continuation<? super List<OnboardingExperimentDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<OnboardingExperimentDto>> continuation) {
        return ((OptionOnboardingDuxo2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Experiment experiment;
        Flow flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isSdpEntryPoint()) {
                experiment = Experiments.OptionsPostEnablementSdpEntryExperiment.INSTANCE;
            } else {
                experiment = Experiments.OptionsPostEnablementNonSdpEntryExperiment.INSTANCE;
            }
            OptionOnboarding2 accountInfo = ((OptionOnboarding) OptionOnboardingDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getAccountInfo();
            if (accountInfo instanceof OptionOnboarding2.AccountNumber) {
                flow = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccount(((OptionOnboarding2.AccountNumber) accountInfo).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
            } else {
                if (!(accountInfo instanceof OptionOnboarding2.AccountType)) {
                    throw new NoWhenBranchMatchedException();
                }
                flow = FlowKt.flow(new OptionOnboardingDuxo3(this.this$0, accountInfo, null));
            }
            Flow flowTransformLatest = FlowKt.transformLatest(flow, new C24941x57296549(null, experiment, this.this$0));
            this.label = 1;
            obj = FlowKt.first(flowTransformLatest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList<Tuples2> arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!Intrinsics.areEqual(((Tuples2) obj2).getSecond(), Optional2.INSTANCE)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Tuples2 tuples2 : arrayList) {
            String str = (String) tuples2.component1();
            String str2 = (String) ((Optional) tuples2.component2()).getOrNull();
            if (str2 == null) {
                str2 = "";
            }
            arrayList2.add(new OnboardingExperimentDto(str, str2));
        }
        return arrayList2;
    }
}
