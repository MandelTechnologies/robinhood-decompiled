package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.store.matcha.MatchaBadgeStore;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.CmSunsetExperiment;
import com.robinhood.librobinhood.CmSunsetExperiment2;
import com.robinhood.librobinhood.CmSunsetExperiment3;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.librobinhood.data.prefs.HasShownRhyMigrationSheetPref;
import com.robinhood.librobinhood.data.prefs.HasVisitedMcDucklingTabEligibleRhyPref;
import com.robinhood.librobinhood.data.prefs.HasVisitedMcDucklingTabPref;
import com.robinhood.librobinhood.data.prefs.RhyCmSunsetOptedOut;
import com.robinhood.librobinhood.data.prefs.RhyMigrationCmSunsetFullScreenCount;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: McDucklingBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B{\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0016\u0010%\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u001f0\u001f0\u001eH\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "matchaBadgeStore", "Lcom/robinhood/android/store/matcha/MatchaBadgeStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "hasVisitedMcDucklingTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasVisitedMcDucklingTabEligibleRhyPref", "hasShownRhyMigrationSheetPref", "cmSunsetOptedOutPref", "cmSunsetFullscreenCount", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/store/matcha/MatchaBadgeStore;Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;)V", "visitedMcDucklingTab", "", "streamBadgeResult", "Lkotlinx/coroutines/flow/Flow;", "", "streamHasVisitedMcDucklingTabPref", "streamHasVisitedMcDucklingTabEligibleRhyPref", "streamHasShownRhyMigrationSheetPrefChanges", "streamHasValidCreditApplicationInvite", "streamHasRhyAccounts", "streamRhyEligibility", "kotlin.jvm.PlatformType", "streamIsInCmSunsetExperiment", "streamRhyCmSunsetOptedOut", "streamHasSeenFullscreenTakeover", "streamMatchaShouldBadge", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class McDucklingBadgeStore extends Store {
    private IntPreference cmSunsetFullscreenCount;
    private BooleanPreference cmSunsetOptedOutPref;
    private final CreditCardStore creditCardStore;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasShownRhyMigrationSheetPref;
    private final BooleanPreference hasVisitedMcDucklingTabEligibleRhyPref;
    private final BooleanPreference hasVisitedMcDucklingTabPref;
    private final MatchaBadgeStore matchaBadgeStore;
    private final RhyAccountStore rhyAccountStore;
    private final RhyApplicationStore rhyApplicationStore;
    private final RhyTabStateStore rhyTabStateStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McDucklingBadgeStore(StoreBundle storeBundle, CreditCardStore creditCardStore, ExperimentsStore experimentsStore, MatchaBadgeStore matchaBadgeStore, RhyApplicationStore rhyApplicationStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, @HasVisitedMcDucklingTabPref BooleanPreference hasVisitedMcDucklingTabPref, @HasVisitedMcDucklingTabEligibleRhyPref BooleanPreference hasVisitedMcDucklingTabEligibleRhyPref, @HasShownRhyMigrationSheetPref BooleanPreference hasShownRhyMigrationSheetPref, @RhyCmSunsetOptedOut BooleanPreference cmSunsetOptedOutPref, @RhyMigrationCmSunsetFullScreenCount IntPreference cmSunsetFullscreenCount) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(matchaBadgeStore, "matchaBadgeStore");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabPref, "hasVisitedMcDucklingTabPref");
        Intrinsics.checkNotNullParameter(hasVisitedMcDucklingTabEligibleRhyPref, "hasVisitedMcDucklingTabEligibleRhyPref");
        Intrinsics.checkNotNullParameter(hasShownRhyMigrationSheetPref, "hasShownRhyMigrationSheetPref");
        Intrinsics.checkNotNullParameter(cmSunsetOptedOutPref, "cmSunsetOptedOutPref");
        Intrinsics.checkNotNullParameter(cmSunsetFullscreenCount, "cmSunsetFullscreenCount");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.matchaBadgeStore = matchaBadgeStore;
        this.rhyApplicationStore = rhyApplicationStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.userStore = userStore;
        this.hasVisitedMcDucklingTabPref = hasVisitedMcDucklingTabPref;
        this.hasVisitedMcDucklingTabEligibleRhyPref = hasVisitedMcDucklingTabEligibleRhyPref;
        this.hasShownRhyMigrationSheetPref = hasShownRhyMigrationSheetPref;
        this.cmSunsetOptedOutPref = cmSunsetOptedOutPref;
        this.cmSunsetFullscreenCount = cmSunsetFullscreenCount;
    }

    public final void visitedMcDucklingTab() {
        if (!this.hasVisitedMcDucklingTabPref.get()) {
            this.hasVisitedMcDucklingTabPref.set(true);
        }
        if (!this.hasVisitedMcDucklingTabEligibleRhyPref.get()) {
            BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C339421(null), 3, null);
        }
        this.matchaBadgeStore.markBadgeSeen();
    }

    /* compiled from: McDucklingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$visitedMcDucklingTab$1", m3645f = "McDucklingBadgeStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$visitedMcDucklingTab$1 */
    static final class C339421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C339421(Continuation<? super C339421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return McDucklingBadgeStore.this.new C339421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C339421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRhyEligibility = McDucklingBadgeStore.this.streamRhyEligibility();
                this.label = 1;
                obj = FlowKt.lastOrNull(flowStreamRhyEligibility, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                McDucklingBadgeStore.this.hasVisitedMcDucklingTabEligibleRhyPref.set(true);
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Boolean> streamBadgeResult() {
        final Flow[] flowArr = {streamHasVisitedMcDucklingTabEligibleRhyPref(), streamHasShownRhyMigrationSheetPrefChanges(), streamHasRhyAccounts(), streamRhyEligibility(), streamIsInCmSunsetExperiment(), streamRhyCmSunsetOptedOut(), streamHasSeenFullscreenTakeover(), streamMatchaShouldBadge(), streamHasVisitedMcDucklingTabPref(), streamHasValidCreditApplicationInvite()};
        return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamBadgeResult$$inlined$combine$1

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamBadgeResult$$inlined$combine$1$3", m3645f = "McDucklingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamBadgeResult$$inlined$combine$1$3 */
            public static final class C339353 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C339353(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                    C339353 c339353 = new C339353(continuation);
                    c339353.L$0 = flowCollector;
                    c339353.L$1 = boolArr;
                    return c339353.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                        Boolean bool = boolArr[0];
                        Boolean bool2 = boolArr[1];
                        Boolean bool3 = boolArr[2];
                        Boolean bool4 = boolArr[3];
                        Boolean bool5 = boolArr[4];
                        Boolean bool6 = boolArr[5];
                        Boolean bool7 = boolArr[6];
                        Boolean bool8 = boolArr[7];
                        Boolean bool9 = boolArr[8];
                        Boolean bool10 = boolArr[9];
                        if (!bool5.booleanValue() ? bool.booleanValue() || bool2.booleanValue() || bool3.booleanValue() || !bool4.booleanValue() : bool6.booleanValue() || bool7.booleanValue() || bool3.booleanValue() || !bool4.booleanValue()) {
                            boolean z = bool8.booleanValue() || !bool9.booleanValue() || bool10.booleanValue();
                            Boolean boolBoxBoolean = boxing.boxBoolean(z);
                            this.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Boolean[]>() { // from class: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamBadgeResult$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean[] invoke() {
                        return new Boolean[flowArr2.length];
                    }
                }, new C339353(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }

    private final Flow<Boolean> streamHasVisitedMcDucklingTabPref() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.hasVisitedMcDucklingTabPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
    }

    private final Flow<Boolean> streamHasVisitedMcDucklingTabEligibleRhyPref() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.hasVisitedMcDucklingTabEligibleRhyPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
    }

    private final Flow<Boolean> streamHasShownRhyMigrationSheetPrefChanges() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.hasShownRhyMigrationSheetPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
    }

    private final Flow<Boolean> streamHasValidCreditApplicationInvite() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.rhyTabStateStore.streamRhyTabState()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(FlowKt.m28818catch(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ McDucklingBadgeStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$$inlined$map$1$2", m3645f = "McDucklingBadgeStore.kt", m3646l = {53, 54, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
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

                public AnonymousClass2(FlowCollector flowCollector, McDucklingBadgeStore mcDucklingBadgeStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = mcDucklingBadgeStore;
                }

                /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
                
                    if (r2.emit(r12, r0) != r1) goto L55;
                 */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    FlowCollector flowCollector;
                    ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse;
                    boolean z;
                    ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
                    List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
                    List<ValidCreditApplicationInviteResponse.Response.Invite> list;
                    Iterator<T> it;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object validCreditApplicationInvites = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = anonymousClass1.label;
                    boolean z2 = false;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(validCreditApplicationInvites);
                        FlowCollector flowCollector2 = this.$this_unsafeFlow;
                        i = ((RhyTabState) obj).getState() == ApiRhyTabStateResponse.ApiRhyTabState.CREDIT_CARD_WAITLIST ? 1 : 0;
                        Observable<User> user = this.this$0.userStore.getUser();
                        anonymousClass1.L$0 = flowCollector2;
                        anonymousClass1.I$0 = i;
                        anonymousClass1.label = 1;
                        Object objAwaitFirst = RxAwait3.awaitFirst(user, anonymousClass1);
                        if (objAwaitFirst != coroutine_suspended) {
                            flowCollector = flowCollector2;
                            validCreditApplicationInvites = objAwaitFirst;
                        }
                        return coroutine_suspended;
                    }
                    if (i3 == 1) {
                        i = anonymousClass1.I$0;
                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(validCreditApplicationInvites);
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(validCreditApplicationInvites);
                            return Unit.INSTANCE;
                        }
                        i = anonymousClass1.I$0;
                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(validCreditApplicationInvites);
                        validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) validCreditApplicationInvites;
                        if (validCreditApplicationInviteResponse != null && (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) != null && (invites = creditApplicationInvites.getInvites()) != null) {
                            list = invites;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) it.next()).getExpiresAt();
                                    if (expiresAt == null || Instant.now().compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (i != 0 && z) {
                            z2 = true;
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z2);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 3;
                    }
                    UUID id = ((User) validCreditApplicationInvites).getId();
                    CreditCardStore creditCardStore = this.this$0.creditCardStore;
                    String string2 = id.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    anonymousClass1.L$0 = flowCollector;
                    anonymousClass1.I$0 = i;
                    anonymousClass1.label = 2;
                    validCreditApplicationInvites = creditCardStore.getValidCreditApplicationInvites(string2, anonymousClass1);
                    if (validCreditApplicationInvites != coroutine_suspended) {
                        validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) validCreditApplicationInvites;
                        if (validCreditApplicationInviteResponse != null) {
                            list = invites;
                            if (list instanceof Collection) {
                            }
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                        }
                        z = false;
                        if (i != 0) {
                            z2 = true;
                        }
                        Boolean boolBoxBoolean2 = boxing.boxBoolean(z2);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 3;
                    }
                    return coroutine_suspended;
                }
            }
        }, new C339402(null)));
    }

    /* compiled from: McDucklingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$2", m3645f = "McDucklingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasValidCreditApplicationInvite$2 */
    static final class C339402 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C339402(Continuation<? super C339402> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C339402 c339402 = new C339402(continuation);
            c339402.L$0 = flowCollector;
            return c339402.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    private final Flow<Boolean> streamHasRhyAccounts() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.rhyAccountStore.streamAccounts()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(FlowKt.m28818catch(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C339362(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$$inlined$map$1$2 */
            public static final class C339362<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$$inlined$map$1$2", m3645f = "McDucklingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339362.this.emit(null, this);
                    }
                }

                public C339362(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(!((List) obj).isEmpty());
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
        }, new C339392(null)));
    }

    /* compiled from: McDucklingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$2", m3645f = "McDucklingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamHasRhyAccounts$2 */
    static final class C339392 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C339392(Continuation<? super C339392> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C339392 c339392 = new C339392(continuation);
            c339392.L$0 = flowCollector;
            return c339392.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamRhyEligibility() {
        Observable<Boolean> observable = this.rhyApplicationStore.getEligibility().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return FlowKt.distinctUntilChanged(FlowKt.m28818catch(Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null), new C339411(null)));
    }

    /* compiled from: McDucklingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlin.jvm.PlatformType", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamRhyEligibility$1", m3645f = "McDucklingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamRhyEligibility$1 */
    static final class C339411 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C339411(Continuation<? super C339411> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C339411 c339411 = new C339411(continuation);
            c339411.L$0 = flowCollector;
            return c339411.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    }

    private final Flow<Boolean> streamIsInCmSunsetExperiment() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment.INSTANCE, CmSunsetExperiment2.CONTROL, false, 4, null), ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment3.INSTANCE, CmSunsetExperiment4.CONTROL, false, 4, null))), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamIsInCmSunsetExperiment$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C339382(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamIsInCmSunsetExperiment$$inlined$map$1$2 */
            public static final class C339382<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamIsInCmSunsetExperiment$$inlined$map$1$2", m3645f = "McDucklingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.McDucklingBadgeStore$streamIsInCmSunsetExperiment$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C339382.this.emit(null, this);
                    }
                }

                public C339382(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((CmSunsetExperiment2) tuples2.getFirst()).isCohortOneOrLater() && ((CmSunsetExperiment4) tuples2.getSecond()).isMember());
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
        });
    }

    private final Flow<Boolean> streamRhyCmSunsetOptedOut() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.cmSunsetOptedOutPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
    }

    private final Flow<Boolean> streamHasSeenFullscreenTakeover() {
        return FlowKt.distinctUntilChanged(FlowKt.flowOf(Boolean.valueOf(this.cmSunsetFullscreenCount.get() > 0)));
    }

    private final Flow<Boolean> streamMatchaShouldBadge() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.matchaBadgeStore.streamShouldBadge()), Integer.MAX_VALUE, null, 2, null));
    }
}
