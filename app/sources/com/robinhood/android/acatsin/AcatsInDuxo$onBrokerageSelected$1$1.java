package com.robinhood.android.acatsin;

import com.robinhood.android.acatsin.AcatsInEvent;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenResponse;
import com.robinhood.utils.Either;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onBrokerageSelected$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {529}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onBrokerageSelected$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiBrokerage $brokerage;
    final /* synthetic */ Either.Left<ApiBrokerage> $brokerageOrDtcNumber;
    final /* synthetic */ Ref.ObjectRef<Boolean> $newPlaidError;
    final /* synthetic */ Ref.ObjectRef<String> $plaidLinkToken;
    final /* synthetic */ String $rhsAccountNumber;
    Object L$0;
    int label;
    final /* synthetic */ AcatsInDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onBrokerageSelected$1$1(ApiBrokerage apiBrokerage, Ref.ObjectRef<String> objectRef, AcatsInDuxo acatsInDuxo, String str, Ref.ObjectRef<Boolean> objectRef2, Either.Left<ApiBrokerage> left, Continuation<? super AcatsInDuxo$onBrokerageSelected$1$1> continuation) {
        super(2, continuation);
        this.$brokerage = apiBrokerage;
        this.$plaidLinkToken = objectRef;
        this.this$0 = acatsInDuxo;
        this.$rhsAccountNumber = str;
        this.$newPlaidError = objectRef2;
        this.$brokerageOrDtcNumber = left;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInDuxo$onBrokerageSelected$1$1(this.$brokerage, this.$plaidLinkToken, this.this$0, this.$rhsAccountNumber, this.$newPlaidError, this.$brokerageOrDtcNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInDuxo$onBrokerageSelected$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Boolean] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Map mapEmptyMap;
        Ref.ObjectRef<String> objectRef;
        Object plaidLinkToken;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            this.$plaidLinkToken.element = null;
            this.$newPlaidError.element = boxing.boxBoolean(true);
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            SentryTeam sentryTeam = SentryTeam.EQUITIES;
            String plaid_institution_id = this.$brokerage.getPlaid_institution_id();
            if (plaid_institution_id == null || (mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to("plaidInstitutionId", plaid_institution_id))) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            companion.reportNonFatal(e, true, new EventMetadata(sentryTeam, mapEmptyMap, null, 4, null));
        } finally {
            AcatsInDuxo acatsInDuxo = this.this$0;
            acatsInDuxo.applyMutation(new C77022(this.$plaidLinkToken, this.$newPlaidError, this.$brokerageOrDtcNumber, acatsInDuxo, null));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$brokerage.getPlaid_institution_id() != null) {
                objectRef = this.$plaidLinkToken;
                AcatsPlaidStore acatsPlaidStore = this.this$0.acatsPlaidStore;
                String str = this.$rhsAccountNumber;
                String dtcc_number = this.$brokerage.getDtcc_number();
                String plaid_institution_id2 = this.$brokerage.getPlaid_institution_id();
                String str2 = this.this$0.packageName;
                this.L$0 = objectRef;
                this.label = 1;
                plaidLinkToken = acatsPlaidStore.getPlaidLinkToken(str, dtcc_number, plaid_institution_id2, str2, this);
                if (plaidLinkToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef<String> objectRef2 = (Ref.ObjectRef) this.L$0;
        ResultKt.throwOnFailure(obj);
        objectRef = objectRef2;
        plaidLinkToken = obj;
        objectRef.element = ((ApiAcatsInPlaidTokenResponse) plaidLinkToken).getPlaid_link_token();
        this.this$0.getSavedStateHandle().set("plaid_link_pending", boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onBrokerageSelected$1$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onBrokerageSelected$1$1$2 */
    static final class C77022 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ Either.Left<ApiBrokerage> $brokerageOrDtcNumber;
        final /* synthetic */ Ref.ObjectRef<Boolean> $newPlaidError;
        final /* synthetic */ Ref.ObjectRef<String> $plaidLinkToken;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77022(Ref.ObjectRef<String> objectRef, Ref.ObjectRef<Boolean> objectRef2, Either.Left<ApiBrokerage> left, AcatsInDuxo acatsInDuxo, Continuation<? super C77022> continuation) {
            super(2, continuation);
            this.$plaidLinkToken = objectRef;
            this.$newPlaidError = objectRef2;
            this.$brokerageOrDtcNumber = left;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77022 c77022 = new C77022(this.$plaidLinkToken, this.$newPlaidError, this.$brokerageOrDtcNumber, this.this$0, continuation);
            c77022.L$0 = obj;
            return c77022;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77022) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
            String str = this.$plaidLinkToken.element;
            Boolean bool = this.$newPlaidError.element;
            AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState, null, false, false, this.$brokerageOrDtcNumber, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool != null ? bool.booleanValue() : acatsInDataState.getPlaidHasErrored(), null, false, false, false, false, false, null, false, false, false, false, -16778697, 15, null);
            AcatsFlowStep nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.BROKERAGE_SEARCH);
            if (nextFlowStep != null) {
                this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen()));
            }
            return acatsInDataStateCopy$default;
        }
    }
}
