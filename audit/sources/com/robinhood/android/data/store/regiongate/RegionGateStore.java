package com.robinhood.android.data.store.regiongate;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.MicrogramOnlyUsageRegionGateApi;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.RegionGateExceptions;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RegionGateStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB<\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0012H\u0097@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/data/store/regiongate/RegionGateStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStoreExtension", "Lcom/robinhood/android/data/store/regiongate/ExperimentsStoreExtension;", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/data/store/regiongate/ExperimentsStoreExtension;Ljava/util/Set;Lcom/robinhood/store/StoreBundle;)V", "getRegionGateState", "", "regionGate", "trigger", "(Lcom/robinhood/android/regiongate/RegionGate;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegionGateStateByName", "regionGateName", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamRegionGateStateFlow", "Lkotlinx/coroutines/flow/Flow;", "streamRegionGateState", "Lio/reactivex/Observable;", "Companion", "lib-store-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RegionGateStore extends Store implements RegionGateProvider {
    private static final long EXPERIMENT_REQUEST_TIMEOUT = 2000;
    private final ExperimentsStore experimentsStore;
    private final ExperimentsStoreExtension experimentsStoreExtension;
    private final Set<RegionGate> regionGates;
    private final UserStore userStore;

    /* compiled from: RegionGateStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore", m3645f = "RegionGateStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "getRegionGateState")
    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$getRegionGateState$1 */
    /* loaded from: classes2.dex */
    static final class C138841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C138841(Continuation<? super C138841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RegionGateStore.this.getRegionGateState(null, false, this);
        }
    }

    /* compiled from: RegionGateStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore", m3645f = "RegionGateStore.kt", m3646l = {85}, m3647m = "getRegionGateStateByName")
    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$getRegionGateStateByName$1 */
    /* loaded from: classes2.dex */
    static final class C138851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C138851(Continuation<? super C138851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RegionGateStore.this.getRegionGateStateByName(null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionGateStore(UserStore userStore, ExperimentsStore experimentsStore, ExperimentsStoreExtension experimentsStoreExtension, Set<RegionGate> regionGates, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(experimentsStoreExtension, "experimentsStoreExtension");
        Intrinsics.checkNotNullParameter(regionGates, "regionGates");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.userStore = userStore;
        this.experimentsStore = experimentsStore;
        this.experimentsStoreExtension = experimentsStoreExtension;
        this.regionGates = regionGates;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.regiongate.RegionGateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRegionGateState(RegionGate regionGate, boolean z, Continuation<? super Boolean> continuation) {
        C138841 c138841;
        if (continuation instanceof C138841) {
            c138841 = (C138841) continuation;
            int i = c138841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c138841.label = i - Integer.MIN_VALUE;
            } else {
                c138841 = new C138841(continuation);
            }
        }
        Object objAwaitFirst = c138841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c138841.label;
        boolean zBooleanValue = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitFirst);
                Observable<Boolean> observableTimeout = streamRegionGateState(regionGate, z).timeout(2000L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(observableTimeout, "timeout(...)");
                c138841.L$0 = regionGate;
                c138841.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(observableTimeout, c138841);
                if (objAwaitFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                regionGate = (RegionGate) c138841.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
            }
            Intrinsics.checkNotNull(objAwaitFirst);
            zBooleanValue = ((Boolean) objAwaitFirst).booleanValue();
        } catch (NoSuchElementException e) {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            companion.log("Encountered NoSuchElementException when checking if user is member of " + regionGate);
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, e, false, null, 4, null);
        } catch (TimeoutException e2) {
            CrashReporter.Companion companion2 = CrashReporter.INSTANCE;
            companion2.log("Encountered TimeoutException when checking if user is member of " + regionGate);
            CrashReporter.DefaultImpls.reportNonFatal$default(companion2, e2, false, null, 4, null);
        }
        return boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.regiongate.RegionGateProvider
    @MicrogramOnlyUsageRegionGateApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRegionGateStateByName(String str, boolean z, Continuation<? super Boolean> continuation) {
        C138851 c138851;
        Object next;
        boolean zBooleanValue;
        if (continuation instanceof C138851) {
            c138851 = (C138851) continuation;
            int i = c138851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c138851.label = i - Integer.MIN_VALUE;
            } else {
                c138851 = new C138851(continuation);
            }
        }
        Object regionGateState = c138851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c138851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState);
            Iterator<T> it = this.regionGates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((RegionGate) next).getName(), str)) {
                    break;
                }
            }
            RegionGate regionGate = (RegionGate) next;
            if (regionGate == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RegionGateExceptions("RegionGate with name " + str + " not found in regionGates"), true, null, 4, null);
            }
            if (regionGate != null) {
                c138851.label = 1;
                regionGateState = getRegionGateState(regionGate, z, c138851);
                if (regionGateState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                zBooleanValue = false;
                return boxing.boxBoolean(zBooleanValue);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(regionGateState);
        }
        zBooleanValue = ((Boolean) regionGateState).booleanValue();
        return boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.robinhood.android.regiongate.RegionGateProvider
    public Flow<Boolean> streamRegionGateStateFlow(RegionGate regionGate, boolean trigger) {
        Flow<Boolean> flowFlowOf;
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        final RegionGateConfiguration configuration = regionGate.getConfiguration();
        if (configuration instanceof RegionGateConfiguration.UserInSupportedCountries) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
            return new Flow<Boolean>() { // from class: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$1$2 */
                public static final class C138812<T> implements FlowCollector {
                    final /* synthetic */ RegionGateConfiguration $configuration$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$1$2", m3645f = "RegionGateStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C138812.this.emit(null, this);
                        }
                    }

                    public C138812(FlowCollector flowCollector, RegionGateConfiguration regionGateConfiguration) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$configuration$inlined = regionGateConfiguration;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            Boolean boolBoxBoolean = boxing.boxBoolean(SetsKt.minus((Set) ((RegionGateConfiguration.UserInSupportedCountries) this.$configuration$inlined).getSupportedCountries(), (Iterable) ((RegionGateConfiguration.UserInSupportedCountries) this.$configuration$inlined).getExcludedCountries()).contains(((User) obj).getOrigin().getLocality()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C138812(flowCollector, configuration), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        if (configuration instanceof RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            this.experimentsStore.refresh(false);
            final Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
            return FlowKt.combine(new Flow<Tuples2<? extends Boolean, ? extends Boolean>>() { // from class: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$2

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$2$2 */
                public static final class C138822<T> implements FlowCollector {
                    final /* synthetic */ RegionGateConfiguration $configuration$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$2$2", m3645f = "RegionGateStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$2$2$1, reason: invalid class name */
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
                            return C138822.this.emit(null, this);
                        }
                    }

                    public C138822(FlowCollector flowCollector, RegionGateConfiguration regionGateConfiguration) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$configuration$inlined = regionGateConfiguration;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            User user = (User) obj;
                            Tuples2 tuples2 = new Tuples2(boxing.boxBoolean(((RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment) this.$configuration$inlined).getExcludedCountries().contains(user.getOrigin().getLocality())), boxing.boxBoolean(((RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment) this.$configuration$inlined).getSupportedCountries().contains(user.getOrigin().getLocality())));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default2.collect(new C138822(flowCollector, configuration), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, this.experimentsStoreExtension.streamInAnyTargetVariant(((RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment) configuration).getExperimentTargets(), trigger), new C138863(null));
        }
        if (!(configuration instanceof RegionGateConfiguration.UserInAnyExperiment)) {
            throw new NoWhenBranchMatchedException();
        }
        this.experimentsStore.refresh(false);
        RegionGateConfiguration.UserInAnyExperiment userInAnyExperiment = (RegionGateConfiguration.UserInAnyExperiment) configuration;
        if (userInAnyExperiment.getExcludedCountries().isEmpty()) {
            flowFlowOf = FlowKt.flowOf(Boolean.FALSE);
        } else {
            UserStore.refresh$default(this.userStore, false, 1, null);
            final Flow flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
            flowFlowOf = new Flow<Boolean>() { // from class: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$3
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default3.collect(new C138832(flowCollector, configuration), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$3$2 */
                public static final class C138832<T> implements FlowCollector {
                    final /* synthetic */ RegionGateConfiguration $configuration$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$3$2", m3645f = "RegionGateStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$$inlined$map$3$2$1, reason: invalid class name */
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
                            return C138832.this.emit(null, this);
                        }
                    }

                    public C138832(FlowCollector flowCollector, RegionGateConfiguration regionGateConfiguration) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$configuration$inlined = regionGateConfiguration;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            Boolean boolBoxBoolean = boxing.boxBoolean(((RegionGateConfiguration.UserInAnyExperiment) this.$configuration$inlined).getExcludedCountries().contains(((User) obj).getOrigin().getLocality()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            };
        }
        return FlowKt.combine(flowFlowOf, this.experimentsStoreExtension.streamInAnyTargetVariant(userInAnyExperiment.getExperimentTargets(), trigger), new C138875(null));
    }

    /* compiled from: RegionGateStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "inExperiment"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$3", m3645f = "RegionGateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$3 */
    /* loaded from: classes2.dex */
    static final class C138863 extends ContinuationImpl7 implements Function3<Tuples2<? extends Boolean, ? extends Boolean>, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C138863(Continuation<? super C138863> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke((Tuples2<Boolean, Boolean>) tuples2, bool.booleanValue(), continuation);
        }

        public final Object invoke(Tuples2<Boolean, Boolean> tuples2, boolean z, Continuation<? super Boolean> continuation) {
            C138863 c138863 = new C138863(continuation);
            c138863.L$0 = tuples2;
            c138863.Z$0 = z;
            return c138863.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            return boxing.boxBoolean(!((Boolean) tuples2.component1()).booleanValue() && (((Boolean) tuples2.component2()).booleanValue() || this.Z$0));
        }
    }

    /* compiled from: RegionGateStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "isExcluded", "inExperiment"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$5", m3645f = "RegionGateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.regiongate.RegionGateStore$streamRegionGateStateFlow$5 */
    /* loaded from: classes2.dex */
    static final class C138875 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        C138875(Continuation<? super C138875> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            C138875 c138875 = new C138875(continuation);
            c138875.Z$0 = z;
            c138875.Z$1 = z2;
            return c138875.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(!this.Z$0 && this.Z$1);
        }
    }

    @Override // com.robinhood.android.regiongate.RegionGateProvider
    public Observable<Boolean> streamRegionGateState(RegionGate regionGate, boolean trigger) {
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        return asObservable(streamRegionGateStateFlow(regionGate, trigger));
    }
}
