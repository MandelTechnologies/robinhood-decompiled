package com.robinhood.android.disclosures.lib.homescreen;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetDashboardDisclosureRequestDto;
import advisory.proto.p008v1.GetDashboardDisclosureResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: HomescreenDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0015\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "lastSeenDisclosurePref", "Lcom/robinhood/prefs/IntPreference;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "streamOptionsDisclosureType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "account", "Lcom/robinhood/models/db/Account;", "onStart", "", "onShowDialog", "disclosureVersion", "", "(Ljava/lang/Integer;)V", "setAccountNumber", "accountNumber", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class HomescreenDisclosureDuxo extends BaseDuxo4<HomescreenDisclosureViewState> {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final AdvisoryService advisoryService;
    private final AnalyticsLogger analytics;
    private final BrokerageResourceManager brokerageResourceManager;
    private final CuratedListStore curatedListStore;
    private final IntPreference lastSeenDisclosurePref;
    private final RegionGateProvider regionGateProvider;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomescreenDisclosureDuxo(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AnalyticsLogger analytics, BrokerageResourceManager brokerageResourceManager, RegionGateProvider regionGateProvider, UserStore userStore, AdvisoryService advisoryService, @LastSeenDisclosurePref IntPreference lastSeenDisclosurePref, CuratedListStore curatedListStore, DuxoBundle duxoBundle) {
        super(new HomescreenDisclosureViewState(null, false, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(lastSeenDisclosurePref, "lastSeenDisclosurePref");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountAccessStore = accountAccessStore;
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.brokerageResourceManager = brokerageResourceManager;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.advisoryService = advisoryService;
        this.lastSeenDisclosurePref = lastSeenDisclosurePref;
        this.curatedListStore = curatedListStore;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<OptionsDisclosure2> streamOptionsDisclosureType(final Account account) {
        Flow<OptionsDisclosure2> flowFlowOf;
        if (account == null) {
            flowFlowOf = FlowKt.flowOf(OptionsDisclosure2.TAXABLE);
        } else if (account.getBrokerageAccountType().isRetirement()) {
            final Flow<Boolean> featureAccess = this.accountAccessStore.getFeatureAccess(account, AccountFeature.OPTIONS_HAS_ACCESS);
            flowFlowOf = new Flow<OptionsDisclosure2>() { // from class: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Account $account$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$1$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Account account) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$account$inlined = account;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        OptionsDisclosure2 optionsDisclosure2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            if (this.$account$inlined.isManaged() || zBooleanValue) {
                                optionsDisclosure2 = OptionsDisclosure2.NONE;
                            } else {
                                optionsDisclosure2 = OptionsDisclosure2.RETIREMENT;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(optionsDisclosure2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super OptionsDisclosure2> flowCollector, Continuation continuation) {
                    Object objCollect = featureAccess.collect(new AnonymousClass2(flowCollector, account), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        } else {
            final Flow<Boolean> featureAccess2 = this.accountAccessStore.getFeatureAccess(account, AccountFeature.OPTIONS_SUPPORTED);
            flowFlowOf = new Flow<OptionsDisclosure2>() { // from class: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$2

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$2$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$$inlined$map$2$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        OptionsDisclosure2 optionsDisclosure2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((Boolean) obj).booleanValue()) {
                                optionsDisclosure2 = OptionsDisclosure2.TAXABLE;
                            } else {
                                optionsDisclosure2 = OptionsDisclosure2.NONE;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(optionsDisclosure2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super OptionsDisclosure2> flowCollector, Continuation continuation) {
                    Object objCollect = featureAccess2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), flowFlowOf, new C142461(null));
    }

    /* compiled from: HomescreenDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "inOptionsRegionGate", "", "disclosureType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$streamOptionsDisclosureType$1 */
    static final class C142461 extends ContinuationImpl7 implements Function3<Boolean, OptionsDisclosure2, Continuation<? super OptionsDisclosure2>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C142461(Continuation<? super C142461> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, OptionsDisclosure2 optionsDisclosure2, Continuation<? super OptionsDisclosure2> continuation) {
            return invoke(bool.booleanValue(), optionsDisclosure2, continuation);
        }

        public final Object invoke(boolean z, OptionsDisclosure2 optionsDisclosure2, Continuation<? super OptionsDisclosure2> continuation) {
            C142461 c142461 = new C142461(continuation);
            c142461.Z$0 = z;
            c142461.L$0 = optionsDisclosure2;
            return c142461.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.Z$0 ? (OptionsDisclosure2) this.L$0 : OptionsDisclosure2.NONE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Flow flowTransformLatest = FlowKt.transformLatest(this.accountNumberFlow, new HomescreenDisclosureDuxo$onStart$$inlined$flatMapLatest$1(null, this));
        getLifecycleScope().launchWhenStarted(new C142441(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C142452(FlowKt.combine(flowTransformLatest, this.curatedListStore.streamCuratedLists(), new HomescreenDisclosureDuxo3(null)), this, flowTransformLatest, null));
    }

    /* compiled from: HomescreenDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1 */
    static final class C142441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142441(Continuation<? super C142441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomescreenDisclosureDuxo.this.new C142441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(HomescreenDisclosureDuxo.this.accountNumberFlow), new C14239x822bec12(null, HomescreenDisclosureDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomescreenDisclosureDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showFuturesDisclosure", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                final /* synthetic */ boolean $showFuturesDisclosure;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$showFuturesDisclosure = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$showFuturesDisclosure, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                    return ((AnonymousClass1) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, null, this.$showFuturesDisclosure, null, null, null, null, null, 125, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: HomescreenDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2 */
    static final class C142452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $accountStream;
        final /* synthetic */ Flow<BrokerageDisclosure> $standardDisclosureStream;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HomescreenDisclosureDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C142452(Flow<? extends BrokerageDisclosure> flow, HomescreenDisclosureDuxo homescreenDisclosureDuxo, Flow<Account> flow2, Continuation<? super C142452> continuation) {
            super(2, continuation);
            this.$standardDisclosureStream = flow;
            this.this$0 = homescreenDisclosureDuxo;
            this.$accountStream = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142452 c142452 = new C142452(this.$standardDisclosureStream, this.this$0, this.$accountStream, continuation);
            c142452.L$0 = obj;
            return c142452;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<BrokerageDisclosure> $standardDisclosureStream;
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends BrokerageDisclosure> flow, HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$standardDisclosureStream = flow;
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$standardDisclosureStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(this.$standardDisclosureStream, Context7.buffer$default(RxConvert.asFlow(this.this$0.userStore.getUser()), Integer.MAX_VALUE, null, 2, null), new C498531(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/brokeragecontent/BrokerageDisclosure;", "user", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498531 extends ContinuationImpl7 implements Function3<BrokerageDisclosure, User, Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends String>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                C498531(Continuation<? super C498531> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(BrokerageDisclosure brokerageDisclosure, User user, Continuation<? super Tuples2<? extends CountryCode.Supported, String>> continuation) {
                    C498531 c498531 = new C498531(continuation);
                    c498531.L$0 = brokerageDisclosure;
                    c498531.L$1 = user;
                    return c498531.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(BrokerageDisclosure brokerageDisclosure, User user, Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends String>> continuation) {
                    return invoke2(brokerageDisclosure, user, (Continuation<? super Tuples2<? extends CountryCode.Supported, String>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    BrokerageDisclosure brokerageDisclosure = (BrokerageDisclosure) this.L$0;
                    User user = (User) this.L$1;
                    return Tuples4.m3642to(user.getOrigin().getLocality(), brokerageDisclosure != null ? BrokerageResource2.getContentfulId(brokerageDisclosure, user.getOrigin().getLocality()) : null);
                }
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends CountryCode.Supported, ? extends String>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CountryCode.Supported, ? extends String> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends CountryCode.Supported, String>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends CountryCode.Supported, String> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HomescreenDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C498541 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                    final /* synthetic */ String $disclosureId;
                    final /* synthetic */ CountryCode.Supported $locality;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498541(String str, CountryCode.Supported supported, Continuation<? super C498541> continuation) {
                        super(2, continuation);
                        this.$disclosureId = str;
                        this.$locality = supported;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498541 c498541 = new C498541(this.$disclosureId, this.$locality, continuation);
                        c498541.L$0 = obj;
                        return c498541;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                        return ((C498541) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, null, false, this.$disclosureId, null, null, null, this.$locality, 59, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        CountryCode.Supported supported = (CountryCode.Supported) tuples2.component1();
                        this.this$0.applyMutation(new C498541((String) tuples2.component2(), supported, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$standardDisclosureStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$standardDisclosureStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.$accountStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.$accountStream, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<BrokerageDisclosure> $standardDisclosureStream;
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Flow<? extends BrokerageDisclosure> flow, HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$standardDisclosureStream = flow;
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$standardDisclosureStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowMapLatest = FlowKt.mapLatest(this.$standardDisclosureStream, new AnonymousClass1(this.this$0, null));
                    C498552 c498552 = new C498552(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMapLatest, c498552, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/brokeragecontent/BrokerageDisclosure;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BrokerageDisclosure, Continuation<? super Integer>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BrokerageDisclosure brokerageDisclosure, Continuation<? super Integer> continuation) {
                    return ((AnonymousClass1) create(brokerageDisclosure, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        BrokerageDisclosure brokerageDisclosure = (BrokerageDisclosure) this.L$0;
                        if (brokerageDisclosure != BrokerageDisclosure.HOME_SCREEN) {
                            return null;
                        }
                        BrokerageResourceManager brokerageResourceManager = this.this$0.brokerageResourceManager;
                        this.label = 1;
                        obj = brokerageResourceManager.loadResourceSuspend(brokerageDisclosure, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((Disclosure) obj).getVersion();
                }
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "disclosureVersion", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C498552 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498552(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super C498552> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498552 c498552 = new C498552(this.this$0, continuation);
                    c498552.L$0 = obj;
                    return c498552;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return ((C498552) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HomescreenDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                    final /* synthetic */ Integer $disclosureVersion;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Integer num, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$disclosureVersion = num;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosureVersion, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                        return ((AnonymousClass1) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, null, false, null, this.$disclosureVersion, null, null, null, 119, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Integer) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.lastSeenDisclosurePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "lastSeenDisclosureVersion", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.I$0 = ((Number) obj).intValue();
                    return anonymousClass1;
                }

                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                /* compiled from: HomescreenDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3$1$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498561 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                    final /* synthetic */ int $lastSeenDisclosureVersion;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498561(int i, Continuation<? super C498561> continuation) {
                        super(2, continuation);
                        this.$lastSeenDisclosureVersion = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498561 c498561 = new C498561(this.$lastSeenDisclosureVersion, continuation);
                        c498561.L$0 = obj;
                        return c498561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                        return ((C498561) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, null, false, null, null, boxing.boxInt(this.$lastSeenDisclosureVersion), null, null, 111, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498561(this.I$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Account> $accountStream;
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Flow<Account> flow, HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$accountStream = flow;
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$accountStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountStream, new C14240x2d03da1(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionsDisclosureType", "Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDisclosure2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDisclosure2 optionsDisclosure2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(optionsDisclosure2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HomescreenDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                    final /* synthetic */ OptionsDisclosure2 $optionsDisclosureType;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionsDisclosure2 optionsDisclosure2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$optionsDisclosureType = optionsDisclosure2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionsDisclosureType, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                        return ((AnonymousClass1) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, this.$optionsDisclosureType, false, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OptionsDisclosure2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HomescreenDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Account> $accountStream;
            int label;
            final /* synthetic */ HomescreenDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Flow<Account> flow, HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$accountStream = flow;
                this.this$0 = homescreenDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$accountStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Account> flow = this.$accountStream;
                    final HomescreenDisclosureDuxo homescreenDisclosureDuxo = this.this$0;
                    Flow<String> flow2 = new Flow<String>() { // from class: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, homescreenDisclosureDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ HomescreenDisclosureDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$invokeSuspend$$inlined$map$1$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, HomescreenDisclosureDuxo homescreenDisclosureDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = homescreenDisclosureDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
                            
                                if (r10.emit(r9, r0) != r1) goto L29;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                FlowCollector flowCollector;
                                T t;
                                FlowCollector flowCollector2;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    flowCollector = this.$this_unsafeFlow;
                                    Account account = (Account) obj;
                                    if (account != null && account.isManaged()) {
                                        AdvisoryService advisoryService = this.this$0.advisoryService;
                                        GetDashboardDisclosureRequestDto getDashboardDisclosureRequestDto = new GetDashboardDisclosureRequestDto(account.getAccountNumber());
                                        anonymousClass1.L$0 = flowCollector;
                                        anonymousClass1.label = 1;
                                        Object objGetDashboardDisclosure = advisoryService.GetDashboardDisclosure(getDashboardDisclosureRequestDto, anonymousClass1);
                                        if (objGetDashboardDisclosure != coroutine_suspended) {
                                            obj2 = objGetDashboardDisclosure;
                                            flowCollector2 = flowCollector;
                                        }
                                        return coroutine_suspended;
                                    }
                                    t = null;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                } else {
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    }
                                    flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                    ResultKt.throwOnFailure(obj2);
                                }
                                ?? markdown_text = ((GetDashboardDisclosureResponseDto) obj2).getMarkdown_text();
                                flowCollector = flowCollector2;
                                t = markdown_text;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: HomescreenDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$2", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HomescreenDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HomescreenDisclosureDuxo homescreenDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = homescreenDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HomescreenDisclosureDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$2$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$2$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState>, Object> {
                    final /* synthetic */ String $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HomescreenDisclosureViewState homescreenDisclosureViewState, Continuation<? super HomescreenDisclosureViewState> continuation) {
                        return ((AnonymousClass1) create(homescreenDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HomescreenDisclosureViewState.copy$default((HomescreenDisclosureViewState) this.L$0, null, false, null, null, null, this.$it, null, 95, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onShowDialog(Integer disclosureVersion) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_WATCHLIST_DISCLOSURE, AnalyticsStrings.BUTTON_WATCHLIST_DISCLOSURE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        if (disclosureVersion != null) {
            this.lastSeenDisclosurePref.set(disclosureVersion.intValue());
        }
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumberFlow.setValue(accountNumber);
    }
}
