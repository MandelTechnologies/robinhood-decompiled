package com.robinhood.android.acatsin;

import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.acatsin.AcatsInEvent;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidAccountNumberResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenRequest;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkSuccess$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {624, 656}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onPlaidLinkSuccess$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AcatsInDataState $dataState;
    final /* synthetic */ LinkSuccess $linkSuccess;
    final /* synthetic */ String $rhsAccountNumber;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AcatsInDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onPlaidLinkSuccess$1$1(AcatsInDuxo acatsInDuxo, String str, LinkSuccess linkSuccess, AcatsInDataState acatsInDataState, Continuation<? super AcatsInDuxo$onPlaidLinkSuccess$1$1> continuation) {
        super(2, continuation);
        this.this$0 = acatsInDuxo;
        this.$rhsAccountNumber = str;
        this.$linkSuccess = linkSuccess;
        this.$dataState = acatsInDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInDuxo$onPlaidLinkSuccess$1$1(this.this$0, this.$rhsAccountNumber, this.$linkSuccess, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInDuxo$onPlaidLinkSuccess$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef7;
        Object objAwait;
        T t;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef10;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            CrashReporter.INSTANCE.reportNonFatal(e, true, new EventMetadata(SentryTeam.EQUITIES, MapsKt.mapOf(Tuples4.m3642to(PlaidExchangeTokenFragment.ARG_PLAID_PUBLIC_TOKEN, this.$linkSuccess.getPublicToken())), null, 4, null));
            booleanRef3.element = true;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef8 = new Ref.ObjectRef();
            objectRef9 = new Ref.ObjectRef();
            booleanRef3 = new Ref.BooleanRef();
            objectRef10 = new Ref.ObjectRef();
            AcatsPlaidStore acatsPlaidStore = this.this$0.acatsPlaidStore;
            ApiAcatsInPlaidTokenRequest apiAcatsInPlaidTokenRequest = new ApiAcatsInPlaidTokenRequest(this.$rhsAccountNumber, this.$linkSuccess.getPublicToken());
            this.L$0 = objectRef8;
            this.L$1 = objectRef9;
            this.L$2 = booleanRef3;
            this.L$3 = objectRef10;
            this.label = 1;
            Object objPostPlaidLinkToken = acatsPlaidStore.postPlaidLinkToken(apiAcatsInPlaidTokenRequest, this);
            obj2 = objPostPlaidLinkToken;
            if (objPostPlaidLinkToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$4;
                objectRef6 = (Ref.ObjectRef) this.L$3;
                booleanRef2 = (Ref.BooleanRef) this.L$2;
                objectRef7 = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    t = obj;
                    objectRef.element = t;
                } catch (Exception unused) {
                }
                objectRef3 = objectRef6;
                booleanRef = booleanRef2;
                objectRef5 = objectRef7;
                objectRef4 = objectRef2;
                this.this$0.exposeAcatsInSbExperiment(this.$dataState.getAcatsInSbExperimentVariant());
                if (Intrinsics.areEqual(this.$dataState.getAcatsInSbExperimentVariant(), KaizenExperiment.VARIATION_MEMBER)) {
                    this.this$0.confirmAccountNamesWithPlaid(this.$dataState.getRhsAccount());
                }
                this.this$0.getLifecycleScope().launchWhenResumed(new C77152(this.this$0, objectRef4, objectRef5, objectRef3, booleanRef, null));
                return Unit.INSTANCE;
            }
            objectRef10 = (Ref.ObjectRef) this.L$3;
            booleanRef3 = (Ref.BooleanRef) this.L$2;
            objectRef9 = (Ref.ObjectRef) this.L$1;
            objectRef8 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        ApiAcatsInPlaidAccountNumberResponse apiAcatsInPlaidAccountNumberResponse = (ApiAcatsInPlaidAccountNumberResponse) obj2;
        objectRef8.element = CollectionsKt.firstOrNull((List) apiAcatsInPlaidAccountNumberResponse.getContra_account_numbers());
        this.this$0.getSavedStateHandle().set("contra_account_number", objectRef8.element);
        objectRef9.element = apiAcatsInPlaidAccountNumberResponse.getAccess_token_id();
        this.this$0.getSavedStateHandle().set("plaid_access_token_id", objectRef9.element);
        objectRef = objectRef10;
        objectRef2 = objectRef8;
        if (objectRef2.element == 0 || objectRef9.element == 0) {
            objectRef3 = objectRef;
            objectRef4 = objectRef2;
            booleanRef = booleanRef3;
            objectRef5 = objectRef9;
            this.this$0.exposeAcatsInSbExperiment(this.$dataState.getAcatsInSbExperimentVariant());
            if (Intrinsics.areEqual(this.$dataState.getAcatsInSbExperimentVariant(), KaizenExperiment.VARIATION_MEMBER)) {
            }
            this.this$0.getLifecycleScope().launchWhenResumed(new C77152(this.this$0, objectRef4, objectRef5, objectRef3, booleanRef, null));
            return Unit.INSTANCE;
        }
        try {
            Deferred<PlaidBrokerAssets> plaidBrokerAssets = this.this$0.acatsInActivityStore.getPlaidBrokerAssets(this.$rhsAccountNumber, (String) objectRef2.element, (String) objectRef9.element, true);
            this.L$0 = objectRef2;
            this.L$1 = objectRef9;
            this.L$2 = booleanRef3;
            this.L$3 = objectRef;
            this.L$4 = objectRef;
            this.label = 2;
            objAwait = plaidBrokerAssets.await(this);
        } catch (Exception unused2) {
            objectRef6 = objectRef;
            booleanRef2 = booleanRef3;
            objectRef7 = objectRef9;
        }
        if (objAwait != coroutine_suspended) {
            objectRef6 = objectRef;
            booleanRef2 = booleanRef3;
            objectRef7 = objectRef9;
            t = objAwait;
            objectRef.element = t;
            objectRef3 = objectRef6;
            booleanRef = booleanRef2;
            objectRef5 = objectRef7;
            objectRef4 = objectRef2;
            this.this$0.exposeAcatsInSbExperiment(this.$dataState.getAcatsInSbExperimentVariant());
            if (Intrinsics.areEqual(this.$dataState.getAcatsInSbExperimentVariant(), KaizenExperiment.VARIATION_MEMBER)) {
            }
            this.this$0.getLifecycleScope().launchWhenResumed(new C77152(this.this$0, objectRef4, objectRef5, objectRef3, booleanRef, null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkSuccess$1$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkSuccess$1$1$2 */
    static final class C77152 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<PlaidBrokerAssets> $assets;
        final /* synthetic */ Ref.ObjectRef<String> $contraAccountNumber;
        final /* synthetic */ Ref.ObjectRef<String> $plaidAccessTokenId;
        final /* synthetic */ Ref.BooleanRef $postTokenFailed;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77152(AcatsInDuxo acatsInDuxo, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<PlaidBrokerAssets> objectRef3, Ref.BooleanRef booleanRef, Continuation<? super C77152> continuation) {
            super(2, continuation);
            this.this$0 = acatsInDuxo;
            this.$contraAccountNumber = objectRef;
            this.$plaidAccessTokenId = objectRef2;
            this.$assets = objectRef3;
            this.$postTokenFailed = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C77152(this.this$0, this.$contraAccountNumber, this.$plaidAccessTokenId, this.$assets, this.$postTokenFailed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.getSavedStateHandle().set("plaid_link_pending", boxing.boxBoolean(false));
            AcatsInDuxo acatsInDuxo = this.this$0;
            acatsInDuxo.applyMutation(new AnonymousClass1(this.$contraAccountNumber, this.$plaidAccessTokenId, this.$assets, this.$postTokenFailed, acatsInDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkSuccess$1$1$2$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkSuccess$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
            final /* synthetic */ Ref.ObjectRef<PlaidBrokerAssets> $assets;
            final /* synthetic */ Ref.ObjectRef<String> $contraAccountNumber;
            final /* synthetic */ Ref.ObjectRef<String> $plaidAccessTokenId;
            final /* synthetic */ Ref.BooleanRef $postTokenFailed;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<PlaidBrokerAssets> objectRef3, Ref.BooleanRef booleanRef, AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$contraAccountNumber = objectRef;
                this.$plaidAccessTokenId = objectRef2;
                this.$assets = objectRef3;
                this.$postTokenFailed = booleanRef;
                this.this$0 = acatsInDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contraAccountNumber, this.$plaidAccessTokenId, this.$assets, this.$postTokenFailed, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                return ((AnonymousClass1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, this.$contraAccountNumber.element, this.$plaidAccessTokenId.element, this.$assets.element, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$postTokenFailed.element, null, false, false, false, false, false, null, false, false, false, false, -16778177, 15, null);
                AcatsFlowStep nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.PLAID_ACCOUNT_NUMBER);
                if (nextFlowStep != null) {
                    this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen()));
                }
                return acatsInDataStateCopy$default;
            }
        }
    }
}
