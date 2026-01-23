package com.robinhood.trader.onboarding.region;

import com.robinhood.android.regiongate.experiment.I18nSingaporeEnabled;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.UserRegion;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationRegionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\u00020\u0011*\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionViewState;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onRegionChanged", "region", "Lcom/robinhood/iso/countrycode/CountryCode;", "isUsOrGb", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UserCreationRegionDuxo extends BaseDuxo4<UserCreationRegionViewState> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final UserRegionStore userRegionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCreationRegionDuxo(UserRegionStore userRegionStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new UserCreationRegionViewState(true, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userRegionStore = userRegionStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, Singles.INSTANCE.zip(ExperimentsStore.getState$default(this.experimentsStore, I18nSingaporeEnabled.INSTANCE, false, 2, null), this.userRegionStore.getCurrentRegion()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationRegionDuxo.onCreate$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(UserCreationRegionDuxo userCreationRegionDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        userCreationRegionDuxo.applyMutation(new UserCreationRegionDuxo2((UserRegion) tuples2.component2(), userCreationRegionDuxo, (Boolean) tuples2.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: UserCreationRegionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.onboarding.region.UserCreationRegionDuxo$onRegionChanged$1", m3645f = "UserCreationRegionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionDuxo$onRegionChanged$1 */
    static final class C417001 extends ContinuationImpl7 implements Function2<UserCreationRegionViewState, Continuation<? super UserCreationRegionViewState>, Object> {
        final /* synthetic */ CountryCode $region;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C417001(CountryCode countryCode, Continuation<? super C417001> continuation) {
            super(2, continuation);
            this.$region = countryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C417001 c417001 = new C417001(this.$region, continuation);
            c417001.L$0 = obj;
            return c417001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationRegionViewState userCreationRegionViewState, Continuation<? super UserCreationRegionViewState> continuation) {
            return ((C417001) create(userCreationRegionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationRegionViewState.copy$default((UserCreationRegionViewState) this.L$0, false, this.$region, 1, null);
        }
    }

    public final void onRegionChanged(CountryCode region) {
        Intrinsics.checkNotNullParameter(region, "region");
        applyMutation(new C417001(region, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUsOrGb(CountryCode countryCode) {
        return Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedStates.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE);
    }
}
