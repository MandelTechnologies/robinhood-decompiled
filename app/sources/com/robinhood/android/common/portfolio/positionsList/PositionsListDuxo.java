package com.robinhood.android.common.portfolio.positionsList;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.eventcontracts.experiments.EventContractShimmerExperiment;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.SelectedPositionsDisplayOption;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.FuturesAssetHomeOpenedPref;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.HasOpenedEcHubPref;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PositionsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013BM\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u001bJ\u0006\u0010%\u001a\u00020\u001bJ#\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0006\u0010/\u001a\u00020\u001bJ\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "positionsDisplayOptionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "futuresAssetHomeOpenedPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasOpenedEcHubPref", "stateProvider", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/common/portfolio/positionsList/PositionsListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "args", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo$Args;", "reorderPendingRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "onCreate", "", "bind", "Lio/reactivex/disposables/Disposable;", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "onSortOptionsFragmentShown", "onReorderStart", "onReorder", "Lkotlinx/coroutines/Job;", "positionItems", "", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "delay", "Lkotlin/time/Duration;", "onReorder-HG0u8IE", "(Ljava/util/List;J)Lkotlinx/coroutines/Job;", "onReorderFinish", "onAssetHomeOpened", "type", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "Args", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PositionsListDuxo extends BaseDuxo<PositionsListDataState, PositionsListViewState> {
    public static final int $stable = 8;
    private Args args;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference futuresAssetHomeOpenedPref;
    private final BooleanPreference hasOpenedEcHubPref;
    private final PositionsDisplayOptionsStore positionsDisplayOptionsStore;
    private final PositionsV2Store positionsV2Store;
    private final BehaviorRelay<Boolean> reorderPendingRelay;

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetHomeAssetType.values().length];
            try {
                iArr[AssetHomeAssetType.FUTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHomeAssetType.PREDICTION_MARKETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHomeAssetType.EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetHomeAssetType.OPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetHomeAssetType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetHomeAssetType.CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsListDuxo(PositionsDisplayOptionsStore positionsDisplayOptionsStore, PositionsV2Store positionsV2Store, ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, @FuturesAssetHomeOpenedPref BooleanPreference futuresAssetHomeOpenedPref, @HasOpenedEcHubPref BooleanPreference hasOpenedEcHubPref, PositionsListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new PositionsListDataState(null, null, null, null, null, null, null, false, false, false, false, false, 4095, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(futuresAssetHomeOpenedPref, "futuresAssetHomeOpenedPref");
        Intrinsics.checkNotNullParameter(hasOpenedEcHubPref, "hasOpenedEcHubPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.positionsDisplayOptionsStore = positionsDisplayOptionsStore;
        this.positionsV2Store = positionsV2Store;
        this.experimentsStore = experimentsStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.futuresAssetHomeOpenedPref = futuresAssetHomeOpenedPref;
        this.hasOpenedEcHubPref = hasOpenedEcHubPref;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.reorderPendingRelay = behaviorRelayCreateDefault;
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo$Args;", "", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;)V", "getAccountNumber", "()Ljava/lang/String;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class Args {
        private final String accountNumber;
        private final PositionInstrumentType positionInstrumentType;
        private final PositionsLocation positionsLocation;

        public static /* synthetic */ Args copy$default(Args args, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                positionInstrumentType = args.positionInstrumentType;
            }
            if ((i & 4) != 0) {
                positionsLocation = args.positionsLocation;
            }
            return args.copy(str, positionInstrumentType, positionsLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PositionInstrumentType getPositionInstrumentType() {
            return this.positionInstrumentType;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }

        public final Args copy(String accountNumber, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation) {
            Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            return new Args(accountNumber, positionInstrumentType, positionsLocation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.positionInstrumentType == args.positionInstrumentType && this.positionsLocation == args.positionsLocation;
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.positionInstrumentType.hashCode()) * 31) + this.positionsLocation.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", positionInstrumentType=" + this.positionInstrumentType + ", positionsLocation=" + this.positionsLocation + ")";
        }

        public Args(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation) {
            Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
            Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
            this.accountNumber = str;
            this.positionInstrumentType = positionInstrumentType;
            this.positionsLocation = positionsLocation;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PositionInstrumentType getPositionInstrumentType() {
            return this.positionInstrumentType;
        }

        public final PositionsLocation getPositionsLocation() {
            return this.positionsLocation;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C115781(null));
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1 */
    static final class C115781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C115781(Continuation<? super C115781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115781 c115781 = PositionsListDuxo.this.new C115781(continuation);
            c115781.L$0 = obj;
            return c115781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionsListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1", m3645f = "PositionsListDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PositionsListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionsListDuxo positionsListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionsListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.futuresAssetHomeOpenedPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    C496891 c496891 = new C496891(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, c496891, this) == coroutine_suspended) {
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

            /* compiled from: PositionsListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresAssetHomeOpened", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496891 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ PositionsListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496891(PositionsListDuxo positionsListDuxo, Continuation<? super C496891> continuation) {
                    super(2, continuation);
                    this.this$0 = positionsListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496891 c496891 = new C496891(this.this$0, continuation);
                    c496891.Z$0 = ((Boolean) obj).booleanValue();
                    return c496891;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C496891) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PositionsListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1$1$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496901 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
                    final /* synthetic */ boolean $futuresAssetHomeOpened;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496901(boolean z, Continuation<? super C496901> continuation) {
                        super(2, continuation);
                        this.$futuresAssetHomeOpened = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496901 c496901 = new C496901(this.$futuresAssetHomeOpened, continuation);
                        c496901.L$0 = obj;
                        return c496901;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
                        return ((C496901) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, null, null, null, false, false, this.$futuresAssetHomeOpened, false, false, 3583, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496901(this.Z$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PositionsListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PositionsListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(PositionsListDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PositionsListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2", m3645f = "PositionsListDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PositionsListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PositionsListDuxo positionsListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = positionsListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.hasOpenedEcHubPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
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

            /* compiled from: PositionsListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasOpenedEcHub", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ PositionsListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PositionsListDuxo positionsListDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = positionsListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PositionsListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2$1$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496911 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
                    final /* synthetic */ boolean $hasOpenedEcHub;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496911(boolean z, Continuation<? super C496911> continuation) {
                        super(2, continuation);
                        this.$hasOpenedEcHub = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496911 c496911 = new C496911(this.$hasOpenedEcHub, continuation);
                        c496911.L$0 = obj;
                        return c496911;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
                        return ((C496911) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, this.$hasOpenedEcHub, false, 3071, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496911(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PositionsListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3", m3645f = "PositionsListDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PositionsListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PositionsListDuxo positionsListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = positionsListDuxo;
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{EventContractShimmerExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
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

            /* compiled from: PositionsListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInEcShimmerExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ PositionsListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PositionsListDuxo positionsListDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = positionsListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PositionsListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3$1$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496921 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
                    final /* synthetic */ boolean $isInEcShimmerExp;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496921(boolean z, Continuation<? super C496921> continuation) {
                        super(2, continuation);
                        this.$isInEcShimmerExp = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496921 c496921 = new C496921(this.$isInEcShimmerExp, continuation);
                        c496921.L$0 = obj;
                        return c496921;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
                        return ((C496921) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, this.$isInEcShimmerExp, 2047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496921(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Disposable bind(String accountNumber, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation) {
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        this.args = new Args(accountNumber, positionInstrumentType, positionsLocation);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        if (accountNumber == null) {
            applyMutation(new C115751(null));
            return compositeDisposable;
        }
        applyMutation(new C115762(positionsLocation, positionInstrumentType, null));
        disposable.plusAssign(compositeDisposable, bind(this.positionsDisplayOptionsStore.streamSelectedPositionsDisplayOption(accountNumber, positionInstrumentType), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsListDuxo.bind$lambda$0(this.f$0, (Optional) obj);
            }
        }));
        Observable observableStreamPositions$default = PositionsV2Store.streamPositions$default(this.positionsV2Store, accountNumber, positionInstrumentType, positionsLocation, null, 8, null);
        Observable<R> map = this.reorderPendingRelay.map(new Function() { // from class: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo.bind.4
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        disposable.plusAssign(compositeDisposable, bind(ObservablesKt.connectWhen$default(observableStreamPositions$default, map, null, 2, null), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsListDuxo.bind$lambda$1(this.f$0, (PositionsV2) obj);
            }
        }));
        disposable.plusAssign(compositeDisposable, bind(this.reorderPendingRelay, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsListDuxo.bind$lambda$2(this.f$0, (Boolean) obj);
            }
        }));
        return compositeDisposable;
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$1 */
    static final class C115751 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
        int label;

        C115751(Continuation<? super C115751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C115751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
            return ((C115751) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new PositionsListDataState(null, null, null, null, null, null, null, false, false, false, false, false, 4095, null);
        }
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$2", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$2 */
    static final class C115762 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
        final /* synthetic */ PositionInstrumentType $positionInstrumentType;
        final /* synthetic */ PositionsLocation $positionsLocation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115762(PositionsLocation positionsLocation, PositionInstrumentType positionInstrumentType, Continuation<? super C115762> continuation) {
            super(2, continuation);
            this.$positionsLocation = positionsLocation;
            this.$positionInstrumentType = positionInstrumentType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115762 c115762 = new C115762(this.$positionsLocation, this.$positionInstrumentType, continuation);
            c115762.L$0 = obj;
            return c115762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
            return ((C115762) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, this.$positionsLocation, this.$positionInstrumentType, null, null, null, null, null, false, false, false, false, false, 4092, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(PositionsListDuxo positionsListDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        positionsListDuxo.applyMutation(new PositionsListDuxo2((SelectedPositionsDisplayOption) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(PositionsListDuxo positionsListDuxo, PositionsV2 positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        positionsListDuxo.applyMutation(new PositionsListDuxo3(positions, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(PositionsListDuxo positionsListDuxo, Boolean bool) {
        positionsListDuxo.applyMutation(new PositionsListDuxo4(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onSortOptionsFragmentShown$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$onSortOptionsFragmentShown$1 */
    static final class C115801 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C115801(Continuation<? super C115801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115801 c115801 = new C115801(continuation);
            c115801.L$0 = obj;
            return c115801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
            return ((C115801) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, null, null, null, false, true, false, false, false, 3839, null);
        }
    }

    public final void onSortOptionsFragmentShown() {
        applyMutation(new C115801(null));
    }

    public final void onReorderStart() {
        this.reorderPendingRelay.accept(Boolean.TRUE);
    }

    /* renamed from: onReorder-HG0u8IE, reason: not valid java name */
    public final Job m12335onReorderHG0u8IE(List<PositionsV2.PositionListItemV2> positionItems, long delay) {
        PositionsLocation positionsLocation;
        Intrinsics.checkNotNullParameter(positionItems, "positionItems");
        PositionsV2.PositionListItemV2 positionListItemV2 = (PositionsV2.PositionListItemV2) CollectionsKt.firstOrNull((List) positionItems);
        if (positionListItemV2 == null) {
            CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
            completableJobJob$default.complete();
            return completableJobJob$default;
        }
        String accountNumber = positionListItemV2.getAccountNumber();
        PositionInstrumentType instrumentType = positionListItemV2.getInstrumentType();
        Args args = this.args;
        if (args == null || (positionsLocation = args.getPositionsLocation()) == null) {
            CompletableJob completableJobJob$default2 = Job6.Job$default(null, 1, null);
            completableJobJob$default2.completeExceptionally(new IllegalStateException("Positions location not initialized"));
            return completableJobJob$default2;
        }
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new PositionsListDuxo5(this, accountNumber, instrumentType, positionsLocation, positionItems, delay, null), 3, null);
    }

    public final void onReorderFinish() {
        this.reorderPendingRelay.accept(Boolean.FALSE);
    }

    public final void onAssetHomeOpened(AssetHomeAssetType type2) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(type2, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                this.futuresAssetHomeOpenedPref.set(true);
                return;
            case 2:
                withDataState(new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PositionsListDuxo.onAssetHomeOpened$lambda$5(this.f$0, (PositionsListDataState) obj);
                    }
                });
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Args args = this.args;
                if (args == null || (accountNumber = args.getAccountNumber()) == null) {
                    return;
                }
                this.cryptoAccountProvider.mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation.Home.INSTANCE, accountNumber);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAssetHomeOpened$lambda$5(PositionsListDuxo positionsListDuxo, PositionsListDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.isInEcShimmerExp()) {
            positionsListDuxo.hasOpenedEcHubPref.set(true);
        }
        return Unit.INSTANCE;
    }
}
