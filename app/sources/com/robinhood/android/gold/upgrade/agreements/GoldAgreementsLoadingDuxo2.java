package com.robinhood.android.gold.upgrade.agreements;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldSweepAgreementsFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: GoldAgreementsLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$loadUpgradeFlow$2$1$1", m3645f = "GoldAgreementsLoadingDuxo.kt", m3646l = {101, 104, 108}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$loadUpgradeFlow$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldAgreementsLoadingDuxo2 extends ContinuationImpl7 implements Function2<Produce4<? super Optional<? extends ApiGoldSweepAgreementsFlow>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiGoldSweepAgreementsFlow $goldAgreementsFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GoldAgreementsLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldAgreementsLoadingDuxo2(ApiGoldSweepAgreementsFlow apiGoldSweepAgreementsFlow, GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo, Continuation<? super GoldAgreementsLoadingDuxo2> continuation) {
        super(2, continuation);
        this.$goldAgreementsFlow = apiGoldSweepAgreementsFlow;
        this.this$0 = goldAgreementsLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldAgreementsLoadingDuxo2 goldAgreementsLoadingDuxo2 = new GoldAgreementsLoadingDuxo2(this.$goldAgreementsFlow, this.this$0, continuation);
        goldAgreementsLoadingDuxo2.L$0 = obj;
        return goldAgreementsLoadingDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Produce4<? super Optional<? extends ApiGoldSweepAgreementsFlow>> produce4, Continuation<? super Unit> continuation) {
        return invoke2((Produce4<? super Optional<ApiGoldSweepAgreementsFlow>>) produce4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Produce4<? super Optional<ApiGoldSweepAgreementsFlow>> produce4, Continuation<? super Unit> continuation) {
        return ((GoldAgreementsLoadingDuxo2) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (r1.send(r15, r14) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Produce4 produce4;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
        GoldAgreementsLoadingDuxo2 goldAgreementsLoadingDuxo2;
        GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo;
        Produce4 produce42;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produce4 = (Produce4) this.L$0;
            goldSweepAgreements = this.$goldAgreementsFlow.getGoldSweepAgreements();
            GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo3 = this.this$0;
            StaticContentStore staticContentStore = goldAgreementsLoadingDuxo3.staticContentStore;
            String agreementId = goldSweepAgreements.getGoldFullAgreement().getAgreementId();
            this.L$0 = produce4;
            this.L$1 = goldAgreementsLoadingDuxo3;
            this.L$2 = goldSweepAgreements;
            this.label = 1;
            goldAgreementsLoadingDuxo2 = this;
            if (ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, agreementId, null, goldAgreementsLoadingDuxo2, 2, null) != coroutine_suspended) {
                goldAgreementsLoadingDuxo = goldAgreementsLoadingDuxo3;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            goldSweepAgreements = (ApiGoldUpgradeFlow.ApiGoldSweepAgreements) this.L$2;
            goldAgreementsLoadingDuxo = (GoldAgreementsLoadingDuxo) this.L$1;
            Produce4 produce43 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            goldAgreementsLoadingDuxo2 = this;
            produce4 = produce43;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce42 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            goldAgreementsLoadingDuxo2 = this;
            Optional optionalAsOptional = Optional3.asOptional(goldAgreementsLoadingDuxo2.$goldAgreementsFlow);
            goldAgreementsLoadingDuxo2.L$0 = null;
            goldAgreementsLoadingDuxo2.label = 3;
        }
        StaticContentStore staticContentStore2 = goldAgreementsLoadingDuxo.staticContentStore;
        String agreementId2 = goldSweepAgreements.getSweepFullAgreement().getAgreementId();
        goldAgreementsLoadingDuxo2.L$0 = produce4;
        goldAgreementsLoadingDuxo2.L$1 = null;
        goldAgreementsLoadingDuxo2.L$2 = null;
        goldAgreementsLoadingDuxo2.label = 2;
        Object objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore2, agreementId2, null, goldAgreementsLoadingDuxo2, 2, null);
        if (objLoadEntry$default != coroutine_suspended) {
            produce42 = produce4;
            obj = objLoadEntry$default;
            Optional optionalAsOptional2 = Optional3.asOptional(goldAgreementsLoadingDuxo2.$goldAgreementsFlow);
            goldAgreementsLoadingDuxo2.L$0 = null;
            goldAgreementsLoadingDuxo2.label = 3;
        }
        return coroutine_suspended;
    }
}
