package com.robinhood.android.acatsin;

import com.robinhood.models.acats.p299db.p300ui.CapabilityStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onStart$4$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onStart$4$1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
    final /* synthetic */ Account $accountDetails;
    final /* synthetic */ boolean $hasAccessToOptions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onStart$4$1(Account account, boolean z, Continuation<? super AcatsInDuxo$onStart$4$1> continuation) {
        super(2, continuation);
        this.$accountDetails = account;
        this.$hasAccessToOptions = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInDuxo$onStart$4$1 acatsInDuxo$onStart$4$1 = new AcatsInDuxo$onStart$4$1(this.$accountDetails, this.$hasAccessToOptions, continuation);
        acatsInDuxo$onStart$4$1.L$0 = obj;
        return acatsInDuxo$onStart$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
        return ((AcatsInDuxo$onStart$4$1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BrokerageAccountType brokerageAccountType;
        CapabilityStatus capabilityStatus;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
        Account account = this.$accountDetails;
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        if (this.$hasAccessToOptions) {
            capabilityStatus = CapabilityStatus.ENABLED;
        } else {
            capabilityStatus = CapabilityStatus.DISABLED;
        }
        return AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, capabilityStatus, null, null, brokerageAccountType2, null, false, null, false, false, false, false, false, null, false, false, false, false, -4718593, 15, null);
    }
}
