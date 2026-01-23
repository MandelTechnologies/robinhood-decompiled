package com.robinhood.android.common.portfolio.pnl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.rosetta.common.Currency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import rosetta.portfolio.p541v1.AssetClassDto;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2", m3645f = "PnlHubSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2 extends ContinuationImpl7 implements Function3<FlowCollector<? super PnlHubSectionViewState>, Currency, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ PnlHubSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2(Continuation continuation, PnlHubSectionDuxo pnlHubSectionDuxo, String str) {
        super(3, continuation);
        this.this$0 = pnlHubSectionDuxo;
        this.$accountNumber$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PnlHubSectionViewState> flowCollector, Currency currency, Continuation<? super Unit> continuation) {
        PnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2 pnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2 = new PnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2(continuation, this.this$0, this.$accountNumber$inlined);
        pnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2.L$0 = flowCollector;
        pnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2.L$1 = currency;
        return pnlHubSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0126, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r13, r2, r21) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objFirstOrNull;
        AssetClassDto[] assetClassDtoArr;
        FlowCollector flowCollector;
        Currency currency;
        AssetClassDto[] assetClassDtoArr2;
        String str;
        ProfitAndLossHubSectionStore profitAndLossHubSectionStore;
        Flow<Boolean> flow;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Currency currency2 = (Currency) this.L$1;
            Flow<Boolean> featureAccess = this.this$0.accountAccessStore.getFeatureAccess(this.$accountNumber$inlined, AccountFeature.OPTIONS_SUPPORTED);
            ProfitAndLossHubSectionStore profitAndLossHubSectionStore2 = this.this$0.profitAndLossHubSectionStore;
            String str2 = this.$accountNumber$inlined;
            AssetClassDto[] assetClassDtoArr3 = new AssetClassDto[3];
            assetClassDtoArr3[0] = AssetClassDto.ASSET_CLASS_EQUITY;
            assetClassDtoArr3[1] = AssetClassDto.ASSET_CLASS_OPTION;
            Flow<Boolean> flowStreamCryptoPnlHubExperiment = this.this$0.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
            this.L$0 = flowCollector2;
            this.L$1 = assetClassDtoArr3;
            this.L$2 = assetClassDtoArr3;
            this.L$3 = currency2;
            this.L$4 = str2;
            this.L$5 = profitAndLossHubSectionStore2;
            this.L$6 = featureAccess;
            this.I$0 = 2;
            this.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoPnlHubExperiment, this);
            if (objFirstOrNull != coroutine_suspended) {
                assetClassDtoArr = assetClassDtoArr3;
                flowCollector = flowCollector2;
                currency = currency2;
                assetClassDtoArr2 = assetClassDtoArr;
                str = str2;
                profitAndLossHubSectionStore = profitAndLossHubSectionStore2;
                flow = featureAccess;
                i = 2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        int i3 = this.I$0;
        Flow<Boolean> flow2 = (Flow) this.L$6;
        ProfitAndLossHubSectionStore profitAndLossHubSectionStore3 = (ProfitAndLossHubSectionStore) this.L$5;
        String str3 = (String) this.L$4;
        Currency currency3 = (Currency) this.L$3;
        AssetClassDto[] assetClassDtoArr4 = (AssetClassDto[]) this.L$2;
        AssetClassDto[] assetClassDtoArr5 = (AssetClassDto[]) this.L$1;
        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        flowCollector = flowCollector3;
        assetClassDtoArr2 = assetClassDtoArr5;
        assetClassDtoArr = assetClassDtoArr4;
        currency = currency3;
        str = str3;
        profitAndLossHubSectionStore = profitAndLossHubSectionStore3;
        flow = flow2;
        i = i3;
        objFirstOrNull = obj;
        assetClassDtoArr[i] = Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true)) ? AssetClassDto.ASSET_CLASS_FOREX : null;
        Flow flowCombine = FlowKt.combine(flow, profitAndLossHubSectionStore.streamRealizedPnl(new ProfitAndLossHubSectionStore.RealizedPnlParams(str, currency, CollectionsKt.listOfNotNull((Object[]) assetClassDtoArr2))), this.this$0.profitAndLossHubSectionStore.streamSupportedAssetTypes(this.$accountNumber$inlined), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null)), FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.userStore.getUser()), Integer.MAX_VALUE, null, 2, null)), new PnlHubSectionDuxo3(this.this$0, this.$accountNumber$inlined, null));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 2;
    }
}
