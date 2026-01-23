package com.robinhood.trader.onboarding.region;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.regiongate.experiment.I18nSingaporeEnabled;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.UserRegion;
import com.robinhood.shared.user.contracts.UserCreationRegionSelectorFragmentKey;
import io.reactivex.rxkotlin.Singles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UserCreationRegionSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onSearch", "input", "", "onRegionChange", "region", "Lcom/robinhood/iso/countrycode/CountryCode;", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UserCreationRegionSelectorDuxo extends BaseDuxo4<UserCreationRegionSelectorViewState> implements HasSavedState {
    private static final ImmutableSet3<CountryCode> defaultRegions;
    private static final ImmutableSet3<CountryCode> regions;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;
    private final UserRegionStore userRegionStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCreationRegionSelectorDuxo(UserRegionStore userRegionStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new UserCreationRegionSelectorViewState(((UserCreationRegionSelectorFragmentKey) INSTANCE.getArgs(savedStateHandle)).getRegionCode(), extensions2.persistentListOf(), extensions2.persistentListOf(), extensions2.persistentListOf()), duxoBundle);
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userRegionStore = userRegionStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, Singles.INSTANCE.zip(ExperimentsStore.getState$default(this.experimentsStore, I18nSingaporeEnabled.INSTANCE, false, 2, null), this.userRegionStore.getCurrentRegion()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationRegionSelectorDuxo.onCreate$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(UserCreationRegionSelectorDuxo userCreationRegionSelectorDuxo, Tuples2 tuples2) {
        ImmutableList3 immutableList3PersistentListOf;
        ImmutableSet3<CountryCode> immutableSet3RemoveAll;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Boolean bool = (Boolean) tuples2.component1();
        final CountryCode companion = CountryCode.INSTANCE.getInstance(((UserRegion) tuples2.component2()).getRegion());
        if (!Intrinsics.areEqual(companion, CountryCode.Supported.UnitedKingdom.INSTANCE) && !Affiliate.RHSG.INSTANCE.contains(companion)) {
            companion = CountryCode.Supported.UnitedStates.INSTANCE;
        }
        if (bool.booleanValue()) {
            immutableList3PersistentListOf = extensions2.toPersistentList(CollectionsKt.sortedWith(CollectionsKt.sortedWith(defaultRegions.add((ImmutableSet3<CountryCode>) CountryCode.Supported.Singapore.INSTANCE).add((ImmutableSet3<CountryCode>) companion), new Comparator() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onCreate$lambda$3$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(CountryCode.getDisplayCountry$default((CountryCode) t, null, 1, null), CountryCode.getDisplayCountry$default((CountryCode) t2, null, 1, null));
                }
            }), new Comparator() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onCreate$lambda$3$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual((CountryCode) t2, companion)), Boolean.valueOf(Intrinsics.areEqual((CountryCode) t, companion)));
                }
            }));
        } else {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        if (bool.booleanValue()) {
            immutableSet3RemoveAll = regions.removeAll((Collection<? extends CountryCode>) immutableList3PersistentListOf);
        } else {
            immutableSet3RemoveAll = defaultRegions;
        }
        userCreationRegionSelectorDuxo.applyMutation(new UserCreationRegionSelectorDuxo2(immutableList3PersistentListOf, extensions2.toPersistentList(CollectionsKt.sortedWith(immutableSet3RemoveAll, new Comparator() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onCreate$lambda$3$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(CountryCode.getDisplayCountry$default((CountryCode) t, null, 1, null), CountryCode.getDisplayCountry$default((CountryCode) t2, null, 1, null));
            }
        })), null));
        return Unit.INSTANCE;
    }

    public final void onSearch(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            return;
        }
        ImmutableSet3<CountryCode> immutableSet3 = regions;
        ArrayList arrayList = new ArrayList();
        for (CountryCode countryCode : immutableSet3) {
            if (StringsKt.startsWith(CountryCode.getDisplayCountry$default(countryCode, null, 1, null), input, true)) {
                arrayList.add(countryCode);
            }
        }
        applyMutation(new C417341(extensions2.toPersistentList(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onSearch$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(CountryCode.getDisplayCountry$default((CountryCode) t, null, 1, null), CountryCode.getDisplayCountry$default((CountryCode) t2, null, 1, null));
            }
        })), null));
    }

    /* compiled from: UserCreationRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onSearch$1", m3645f = "UserCreationRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onSearch$1 */
    static final class C417341 extends ContinuationImpl7 implements Function2<UserCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState>, Object> {
        final /* synthetic */ ImmutableList3<CountryCode> $filteredRegions;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C417341(ImmutableList3<? extends CountryCode> immutableList3, Continuation<? super C417341> continuation) {
            super(2, continuation);
            this.$filteredRegions = immutableList3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C417341 c417341 = new C417341(this.$filteredRegions, continuation);
            c417341.L$0 = obj;
            return c417341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationRegionSelectorViewState userCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState> continuation) {
            return ((C417341) create(userCreationRegionSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationRegionSelectorViewState.copy$default((UserCreationRegionSelectorViewState) this.L$0, null, this.$filteredRegions, null, null, 13, null);
        }
    }

    /* compiled from: UserCreationRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onRegionChange$1", m3645f = "UserCreationRegionSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorDuxo$onRegionChange$1 */
    static final class C417331 extends ContinuationImpl7 implements Function2<UserCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState>, Object> {
        final /* synthetic */ CountryCode $region;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C417331(CountryCode countryCode, Continuation<? super C417331> continuation) {
            super(2, continuation);
            this.$region = countryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C417331 c417331 = new C417331(this.$region, continuation);
            c417331.L$0 = obj;
            return c417331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationRegionSelectorViewState userCreationRegionSelectorViewState, Continuation<? super UserCreationRegionSelectorViewState> continuation) {
            return ((C417331) create(userCreationRegionSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationRegionSelectorViewState.copy$default((UserCreationRegionSelectorViewState) this.L$0, this.$region, null, null, null, 14, null);
        }
    }

    public final void onRegionChange(CountryCode region) {
        Intrinsics.checkNotNullParameter(region, "region");
        applyMutation(new C417331(region, null));
    }

    /* compiled from: UserCreationRegionSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorDuxo;", "Lcom/robinhood/shared/user/contracts/UserCreationRegionSelectorFragmentKey;", "<init>", "()V", "defaultRegions", "Lkotlinx/collections/immutable/PersistentSet;", "Lcom/robinhood/iso/countrycode/CountryCode;", "regions", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UserCreationRegionSelectorDuxo, UserCreationRegionSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UserCreationRegionSelectorFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (UserCreationRegionSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UserCreationRegionSelectorFragmentKey getArgs(UserCreationRegionSelectorDuxo userCreationRegionSelectorDuxo) {
            return (UserCreationRegionSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, userCreationRegionSelectorDuxo);
        }
    }

    static {
        CountryCode.Supported.UnitedKingdom unitedKingdom = CountryCode.Supported.UnitedKingdom.INSTANCE;
        CountryCode.Supported.UnitedStates unitedStates = CountryCode.Supported.UnitedStates.INSTANCE;
        defaultRegions = extensions2.persistentSetOf(unitedKingdom, unitedStates);
        CountryCode.Companion companion = CountryCode.INSTANCE;
        regions = extensions2.persistentSetOf(companion.getInstance(CountryCode.COUNTRY_CODE_AU), companion.getInstance(CountryCode.COUNTRY_CODE_BN), companion.getInstance(CountryCode.COUNTRY_CODE_KH), companion.getInstance(CountryCode.COUNTRY_CODE_CK), companion.getInstance(CountryCode.COUNTRY_CODE_TL), companion.getInstance(CountryCode.COUNTRY_CODE_FJ), CountryCode.Supported.HongKongSARChina.INSTANCE, CountryCode.Supported.India.INSTANCE, CountryCode.Supported.Indonesia.INSTANCE, companion.getInstance(CountryCode.COUNTRY_CODE_JP), companion.getInstance(CountryCode.COUNTRY_CODE_KI), companion.getInstance(CountryCode.COUNTRY_CODE_LA), companion.getInstance(CountryCode.COUNTRY_CODE_MO), CountryCode.Supported.Malaysia.INSTANCE, companion.getInstance(CountryCode.COUNTRY_CODE_MH), companion.getInstance(CountryCode.COUNTRY_CODE_FM), companion.getInstance(CountryCode.COUNTRY_CODE_MN), companion.getInstance(CountryCode.COUNTRY_CODE_NR), companion.getInstance(CountryCode.COUNTRY_CODE_NC), companion.getInstance(CountryCode.COUNTRY_CODE_NZ), companion.getInstance(CountryCode.COUNTRY_CODE_NU), companion.getInstance(CountryCode.COUNTRY_CODE_PW), companion.getInstance(CountryCode.COUNTRY_CODE_PG), companion.getInstance(CountryCode.COUNTRY_CODE_CN), companion.getInstance(CountryCode.COUNTRY_CODE_PH), companion.getInstance(CountryCode.COUNTRY_CODE_WS), CountryCode.Supported.Singapore.INSTANCE, companion.getInstance(CountryCode.COUNTRY_CODE_SB), companion.getInstance(CountryCode.COUNTRY_CODE_KR), CountryCode.Supported.Taiwan.INSTANCE, CountryCode.Supported.Thailand.INSTANCE, companion.getInstance(CountryCode.COUNTRY_CODE_TO), companion.getInstance(CountryCode.COUNTRY_CODE_TV), unitedKingdom, unitedStates, companion.getInstance(CountryCode.COUNTRY_CODE_VU), CountryCode.Supported.Vietnam.INSTANCE);
    }
}
