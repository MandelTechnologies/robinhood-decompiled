package com.robinhood.trader.onboarding.region;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.UserRegion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UserCreationRegionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.trader.onboarding.region.UserCreationRegionDuxo$onCreate$1$1", m3645f = "UserCreationRegionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class UserCreationRegionDuxo2 extends ContinuationImpl7 implements Function2<UserCreationRegionViewState, Continuation<? super UserCreationRegionViewState>, Object> {
    final /* synthetic */ Boolean $isSingaporeEnabled;
    final /* synthetic */ UserRegion $region;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserCreationRegionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserCreationRegionDuxo2(UserRegion userRegion, UserCreationRegionDuxo userCreationRegionDuxo, Boolean bool, Continuation<? super UserCreationRegionDuxo2> continuation) {
        super(2, continuation);
        this.$region = userRegion;
        this.this$0 = userCreationRegionDuxo;
        this.$isSingaporeEnabled = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserCreationRegionDuxo2 userCreationRegionDuxo2 = new UserCreationRegionDuxo2(this.$region, this.this$0, this.$isSingaporeEnabled, continuation);
        userCreationRegionDuxo2.L$0 = obj;
        return userCreationRegionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UserCreationRegionViewState userCreationRegionViewState, Continuation<? super UserCreationRegionViewState> continuation) {
        return ((UserCreationRegionDuxo2) create(userCreationRegionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UserCreationRegionViewState userCreationRegionViewState = (UserCreationRegionViewState) this.L$0;
        CountryCode companion = CountryCode.INSTANCE.getInstance(this.$region.getRegion());
        if (!this.this$0.isUsOrGb(companion) && (this.this$0.isUsOrGb(companion) || !this.$isSingaporeEnabled.booleanValue())) {
            companion = null;
        }
        return userCreationRegionViewState.copy(false, companion);
    }
}
