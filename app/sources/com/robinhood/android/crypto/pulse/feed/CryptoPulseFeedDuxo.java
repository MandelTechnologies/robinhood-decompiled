package com.robinhood.android.crypto.pulse.feed;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.utils.Optional;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.Moshi;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;

/* compiled from: CryptoPulseFeedDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004:\u00011Ba\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\"\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedFragmentArgs;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedViewState;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedEvent;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "currencyPairIdsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Companion", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseFeedDuxo extends BaseDuxo3<CryptoPulseFeedDataState, CryptoPulseFeedViewState, CryptoPulseFeedEvent> implements HasSavedState, HasArgs<CryptoPulseFeedFragmentArgs> {
    public static final String PUSH_ITEM_ID = "push-account-crypto_pulse";
    private final AccountProvider accountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoPulseStore cryptoPulseStore;
    private final StateFlow2<List<String>> currencyPairIdsFlow;
    private final ExperimentsProvider experimentsProvider;
    private final NotificationSettingStore notificationSettingStore;
    private final PerformanceChartStore performanceChartStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoPulseFeedFragmentArgs getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoPulseFeedFragmentArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoPulseFeedDuxo(AccountProvider accountProvider, CryptoPulseStore cryptoPulseStore, CryptoExperimentsStore cryptoExperimentsStore, ExperimentsProvider experimentsProvider, NotificationSettingStore notificationSettingStore, PerformanceChartStore performanceChartStore, Clock clock, DuxoBundle duxoBundle, LazyMoshi moshi, CryptoPulseFeedStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Moshi moshi2 = moshi.get();
        Companion companion = INSTANCE;
        super(new CryptoPulseFeedDataState(clock, moshi2, ((CryptoPulseFeedFragmentArgs) companion.getArgs(savedStateHandle)).getFeedResponse(), ((CryptoPulseFeedFragmentArgs) companion.getArgs(savedStateHandle)).getRefreshResponse(), null, null, false, null, null, 496, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.cryptoPulseStore = cryptoPulseStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.experimentsProvider = experimentsProvider;
        this.notificationSettingStore = notificationSettingStore;
        this.performanceChartStore = performanceChartStore;
        this.savedStateHandle = savedStateHandle;
        this.currencyPairIdsFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129351(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129362(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C129373(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C129384(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C129395(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C129406(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C129417(null));
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$1 */
    static final class C129351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129351(Continuation<? super C129351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$1$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                return ((AnonymousClass1) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CryptoPulseFeedDataState cryptoPulseFeedDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoPulseFeedDataState cryptoPulseFeedDataState2 = (CryptoPulseFeedDataState) this.L$0;
                    Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                    this.L$0 = cryptoPulseFeedDataState2;
                    this.label = 1;
                    Object objAwait = RxAwait3.await(individualAccountNumber, this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoPulseFeedDataState = cryptoPulseFeedDataState2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoPulseFeedDataState = (CryptoPulseFeedDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) ((Optional) obj).getOrNull();
                if (str == null) {
                    str = "";
                }
                return CryptoPulseFeedDataState.copy$default(cryptoPulseFeedDataState, null, null, null, null, str, null, false, null, null, 495, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoPulseFeedDuxo cryptoPulseFeedDuxo = CryptoPulseFeedDuxo.this;
            cryptoPulseFeedDuxo.applyMutation(new AnonymousClass1(cryptoPulseFeedDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$2", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$2 */
    static final class C129362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129362(Continuation<? super C129362> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129362(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = CryptoPulseFeedDuxo.this.currencyPairIdsFlow;
                List<GetCryptoPulseFeedRefreshResponseDto.FeedItemDto> feed_items = ((CryptoPulseFeedFragmentArgs) CryptoPulseFeedDuxo.INSTANCE.getArgs((HasSavedState) CryptoPulseFeedDuxo.this)).getRefreshResponse().getFeed_items();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(feed_items, 10));
                Iterator<T> it = feed_items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GetCryptoPulseFeedRefreshResponseDto.FeedItemDto) it.next()).getCurrency_pair_id());
                }
                this.label = 1;
                if (stateFlow2.emit(arrayList, this) == coroutine_suspended) {
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

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3 */
    static final class C129373 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129373(Continuation<? super C129373> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129373(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129373) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoPulseFeedDuxo.this.currencyPairIdsFlow);
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<List<? extends String>>() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C129322<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C129322.this.emit(null, this);
                            }
                        }

                        public C129322(FlowCollector flowCollector) {
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
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C129322(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C12933x1868ece(null, CryptoPulseFeedDuxo.this.cryptoPulseStore));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoPulseFeedDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "getCryptoPulseFeedRefreshResponseDto", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$3", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<GetCryptoPulseFeedRefreshResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(getCryptoPulseFeedRefreshResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulseFeedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$3$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
                final /* synthetic */ GetCryptoPulseFeedRefreshResponseDto $getCryptoPulseFeedRefreshResponseDto;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$getCryptoPulseFeedRefreshResponseDto = getCryptoPulseFeedRefreshResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$getCryptoPulseFeedRefreshResponseDto, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Map mapEmptyMap;
                    List<GetCryptoPulseFeedRefreshResponseDto.FeedItemDto> feed_items;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPulseFeedDataState cryptoPulseFeedDataState = (CryptoPulseFeedDataState) this.L$0;
                    GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto = cryptoPulseFeedDataState.getGetCryptoPulseFeedRefreshResponseDto();
                    if (getCryptoPulseFeedRefreshResponseDto == null || (feed_items = getCryptoPulseFeedRefreshResponseDto.getFeed_items()) == null) {
                        mapEmptyMap = null;
                    } else {
                        List<GetCryptoPulseFeedRefreshResponseDto.FeedItemDto> list = feed_items;
                        mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (Object obj2 : list) {
                            mapEmptyMap.put(((GetCryptoPulseFeedRefreshResponseDto.FeedItemDto) obj2).getCurrency_pair_id(), obj2);
                        }
                    }
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto2 = this.$getCryptoPulseFeedRefreshResponseDto;
                    List<GetCryptoPulseFeedRefreshResponseDto.FeedItemDto> feed_items2 = getCryptoPulseFeedRefreshResponseDto2.getFeed_items();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(feed_items2, 10));
                    for (GetCryptoPulseFeedRefreshResponseDto.FeedItemDto feedItemDto : feed_items2) {
                        GetCryptoPulseFeedRefreshResponseDto.FeedItemDto feedItemDto2 = (GetCryptoPulseFeedRefreshResponseDto.FeedItemDto) mapEmptyMap.get(feedItemDto.getCurrency_pair_id());
                        arrayList.add(GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.copy$default(feedItemDto, null, null, null, feedItemDto2 != null ? feedItemDto2.getDigest() : null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null));
                    }
                    return CryptoPulseFeedDataState.copy$default(cryptoPulseFeedDataState, null, null, null, getCryptoPulseFeedRefreshResponseDto2.copy(arrayList), null, null, false, null, null, 503, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GetCryptoPulseFeedRefreshResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4 */
    static final class C129384 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129384(Continuation<? super C129384> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129384(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129384) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoUsPulseExperiment.Variant> flowStreamCryptoPulseExperiment = CryptoPulseFeedDuxo.this.cryptoExperimentsStore.streamCryptoPulseExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPulseFeedDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoPulseExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoUsPulseExperiment.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoUsPulseExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulseFeedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4$1$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497351 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
                final /* synthetic */ CryptoUsPulseExperiment.Variant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497351(CryptoUsPulseExperiment.Variant variant, Continuation<? super C497351> continuation) {
                    super(2, continuation);
                    this.$it = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497351 c497351 = new C497351(this.$it, continuation);
                    c497351.L$0 = obj;
                    return c497351;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                    return ((C497351) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoPulseFeedDataState.copy$default((CryptoPulseFeedDataState) this.L$0, null, null, null, null, null, this.$it, false, null, null, 479, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497351((CryptoUsPulseExperiment.Variant) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$5", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$5 */
    static final class C129395 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129395(Continuation<? super C129395> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129395(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129395) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NotificationSettingStore notificationSettingStore = CryptoPulseFeedDuxo.this.notificationSettingStore;
                this.label = 1;
                obj = notificationSettingStore.fetchNotificationItem(CryptoPulseFeedDuxo.PUSH_ITEM_ID, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoPulseFeedDuxo.this.applyMutation(new AnonymousClass1(obj instanceof ApiNotificationSettingsItem.ToggleSettingsItem ? (ApiNotificationSettingsItem.ToggleSettingsItem) obj : null, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$5$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
            final /* synthetic */ ApiNotificationSettingsItem.ToggleSettingsItem $notificationItem;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$notificationItem = toggleSettingsItem;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$notificationItem, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                return ((AnonymousClass1) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ApiNotificationSettingsToggleSettingsItem data;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoPulseFeedDataState cryptoPulseFeedDataState = (CryptoPulseFeedDataState) this.L$0;
                ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem = this.$notificationItem;
                return CryptoPulseFeedDataState.copy$default(cryptoPulseFeedDataState, null, null, null, null, null, null, ((toggleSettingsItem == null || (data = toggleSettingsItem.getData()) == null) ? null : data.getStatus()) == ApiNotificationSettingsToggleSettingsItem.Status.f5427ON, null, null, 447, null);
            }
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6 */
    static final class C129406 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129406(Continuation<? super C129406> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129406(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129406) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(CryptoPulseFeedDuxo.this.experimentsProvider, AssetDigestValuePropsExperiment.INSTANCE, AssetDigestValuePropsExperiment2.CONTROL, false, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPulseFeedDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCoStreamVariant$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetDigestValuePropsExperiment2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(assetDigestValuePropsExperiment2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulseFeedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6$1$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497361 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
                final /* synthetic */ AssetDigestValuePropsExperiment2 $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497361(AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, Continuation<? super C497361> continuation) {
                    super(2, continuation);
                    this.$it = assetDigestValuePropsExperiment2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497361 c497361 = new C497361(this.$it, continuation);
                    c497361.L$0 = obj;
                    return c497361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                    return ((C497361) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoPulseFeedDataState.copy$default((CryptoPulseFeedDataState) this.L$0, null, null, null, null, null, null, false, this.$it, null, 383, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497361((AssetDigestValuePropsExperiment2) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7 */
    static final class C129417 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129417(Continuation<? super C129417> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedDuxo.this.new C129417(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129417) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(CryptoPulseFeedDuxo.this.accountProvider.streamIndividualAccountNumber()), Integer.MAX_VALUE, null, 2, null), new C12934x5dfe524a(null, CryptoPulseFeedDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPulseFeedDuxo.this, null);
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

        /* compiled from: CryptoPulseFeedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7$2", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Direction, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPulseFeedDuxo cryptoPulseFeedDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Direction direction, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(direction, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulseFeedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7$2$1", m3645f = "CryptoPulseFeedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedDuxo$onCreate$7$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState>, Object> {
                final /* synthetic */ Direction $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Direction direction, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = direction;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulseFeedDataState cryptoPulseFeedDataState, Continuation<? super CryptoPulseFeedDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPulseFeedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoPulseFeedDataState.copy$default((CryptoPulseFeedDataState) this.L$0, null, null, null, null, null, null, false, null, this.$it, 255, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((Direction) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPulseFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDuxo;", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedFragmentArgs;", "<init>", "()V", "PUSH_ITEM_ID", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoPulseFeedDuxo, CryptoPulseFeedFragmentArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoPulseFeedFragmentArgs getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoPulseFeedFragmentArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoPulseFeedFragmentArgs getArgs(CryptoPulseFeedDuxo cryptoPulseFeedDuxo) {
            return (CryptoPulseFeedFragmentArgs) DuxoCompanion.DefaultImpls.getArgs(this, cryptoPulseFeedDuxo);
        }
    }
}
