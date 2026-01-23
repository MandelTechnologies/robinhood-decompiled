package com.robinhood.trader.onboarding.region;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: UserCreationRegionSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onCreate$1$1", m3645f = "UserCreationRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class UserCreationRegionSelectorDuxo2 extends ContinuationImpl7 implements Function2<UserCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState>, Object> {
    final /* synthetic */ ImmutableList3<CountryCode> $allRegions;
    final /* synthetic */ ImmutableList3<CountryCode> $suggestedRegions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserCreationRegionSelectorDuxo2(ImmutableList3<? extends CountryCode> immutableList3, ImmutableList3<? extends CountryCode> immutableList32, Continuation<? super UserCreationRegionSelectorDuxo2> continuation) {
        super(2, continuation);
        this.$suggestedRegions = immutableList3;
        this.$allRegions = immutableList32;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserCreationRegionSelectorDuxo2 userCreationRegionSelectorDuxo2 = new UserCreationRegionSelectorDuxo2(this.$suggestedRegions, this.$allRegions, continuation);
        userCreationRegionSelectorDuxo2.L$0 = obj;
        return userCreationRegionSelectorDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UserCreationRegionSelectorViewState userCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState> continuation) {
        return ((UserCreationRegionSelectorDuxo2) create(userCreationRegionSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UserCreationRegionSelectorViewState.copy$default((UserCreationRegionSelectorViewState) this.L$0, null, null, this.$suggestedRegions, this.$allRegions, 3, null);
    }
}
