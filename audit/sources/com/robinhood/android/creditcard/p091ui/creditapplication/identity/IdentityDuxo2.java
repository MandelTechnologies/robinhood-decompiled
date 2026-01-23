package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IdentityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$setDetails$1", m3645f = "IdentityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxo$setDetails$1, reason: use source file name */
/* loaded from: classes2.dex */
final class IdentityDuxo2 extends ContinuationImpl7 implements Function2<IdentityViewState, Continuation<? super IdentityViewState>, Object> {
    final /* synthetic */ IdentityDetailsPrefillResponse2 $details;
    final /* synthetic */ PersonalInfo $info;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityDuxo2(PersonalInfo personalInfo, IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2, Continuation<? super IdentityDuxo2> continuation) {
        super(2, continuation);
        this.$info = personalInfo;
        this.$details = identityDetailsPrefillResponse2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IdentityDuxo2 identityDuxo2 = new IdentityDuxo2(this.$info, this.$details, continuation);
        identityDuxo2.L$0 = obj;
        return identityDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IdentityViewState identityViewState, Continuation<? super IdentityViewState> continuation) {
        return ((IdentityDuxo2) create(identityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return IdentityViewState.copy$default((IdentityViewState) this.L$0, this.$info, null, this.$details.getResidentialAddress(), null, null, null, 58, null);
    }
}
