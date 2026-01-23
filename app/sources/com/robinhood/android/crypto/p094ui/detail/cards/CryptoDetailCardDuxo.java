package com.robinhood.android.crypto.p094ui.detail.cards;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDataState2;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CardsToInvalidate;
import com.robinhood.librobinhood.data.store.CryptoDetailIacHeroCardInvalidator;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.alert.ShownAdvancedAlertCdpCardCountPref;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.ApiIacHeroCardLocationArg;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoDetailCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u000212B{\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\u00020'H\u0082@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020'H\u0082@¢\u0006\u0002\u0010)J\u0016\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0002J\u0006\u00100\u001a\u00020'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Args;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "iacHeroCardStore", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "iacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "assetDigestStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "shownAdvancedAlertCdpCardCountPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadBreakingNews", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadIacHeroCard", "loadLessonEarnability", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAdvancedAlertCard", "onCardDismissed", "Args", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailCardDuxo extends BaseDuxo<CryptoDetailCardDataState, CryptoDetailCardViewState> implements HasArgs<Args> {
    private static final int MAX_ADVANCED_ALERT_CARD_SHOWN_COUNT = 2;
    private final AssetDigestStore assetDigestStore;
    private final BreakingNewsStore breakingNewsStore;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CurrencyPairStore currencyPairStore;
    private final EducationLessonsStore educationLessonsStore;
    private final ExperimentsStore experimentsStore;
    private final CryptoDetailIacHeroCardInvalidator iacHeroCardInvalidator;
    private final IacHeroCardStore iacHeroCardStore;
    private final SavedStateHandle savedStateHandle;
    private final IntPreference shownAdvancedAlertCdpCardCountPref;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 202}, m3647m = "loadIacHeroCard")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadIacHeroCard$1 */
    static final class C133211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C133211(Continuation<? super C133211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoDetailCardDuxo.this.loadIacHeroCard(this);
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "loadLessonEarnability")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadLessonEarnability$1 */
    static final class C133231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C133231(Continuation<? super C133231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoDetailCardDuxo.this.loadLessonEarnability(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDetailCardDuxo(ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairStore currencyPairStore, UnifiedAccountStore unifiedAccountStore, EducationLessonsStore educationLessonsStore, BreakingNewsStore breakingNewsStore, IacHeroCardStore iacHeroCardStore, CryptoDetailIacHeroCardInvalidator iacHeroCardInvalidator, AssetDigestStore assetDigestStore, @ShownAdvancedAlertCdpCardCountPref IntPreference shownAdvancedAlertCdpCardCountPref, CryptoDetailCardDuxo6 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CryptoDetailCardDataState(null, null, null, null, null, false, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(iacHeroCardInvalidator, "iacHeroCardInvalidator");
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(shownAdvancedAlertCdpCardCountPref, "shownAdvancedAlertCdpCardCountPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.currencyPairStore = currencyPairStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.educationLessonsStore = educationLessonsStore;
        this.breakingNewsStore = breakingNewsStore;
        this.iacHeroCardStore = iacHeroCardStore;
        this.iacHeroCardInvalidator = iacHeroCardInvalidator;
        this.assetDigestStore = assetDigestStore;
        this.shownAdvancedAlertCdpCardCountPref = shownAdvancedAlertCdpCardCountPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C133251(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C133262(null), 3, null);
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1 */
    static final class C133251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C133251(Continuation<? super C133251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133251 c133251 = CryptoDetailCardDuxo.this.new C133251(continuation);
            c133251.L$0 = obj;
            return c133251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C133251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(CryptoDetailCardDuxo.this.currencyPairStore.streamCurrencyPair(((Args) CryptoDetailCardDuxo.INSTANCE.getArgs((HasArgs) CryptoDetailCardDuxo.this)).getCurrencyPairId())), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailCardDuxo.this, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$repeatOnLifecycle;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailCardDuxo cryptoDetailCardDuxo, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailCardDuxo;
                this.$$this$repeatOnLifecycle = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$repeatOnLifecycle, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497811 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497811(UiCurrencyPair uiCurrencyPair, Continuation<? super C497811> continuation) {
                    super(2, continuation);
                    this.$uiCurrencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497811 c497811 = new C497811(this.$uiCurrencyPair, continuation);
                    c497811.L$0 = obj;
                    return c497811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
                    return ((C497811) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailCardDataState.copy$default((CryptoDetailCardDataState) this.L$0, this.$uiCurrencyPair, null, null, null, null, false, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) this.L$0;
                    this.this$0.applyMutation(new C497811(uiCurrencyPair, null));
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$repeatOnLifecycle, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$repeatOnLifecycle, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$repeatOnLifecycle, null, null, new AnonymousClass4(this.this$0, uiCurrencyPair, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$repeatOnLifecycle, null, null, new AnonymousClass5(this.this$0, uiCurrencyPair, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$2", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ CryptoDetailCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoDetailCardDuxo cryptoDetailCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoDetailCardDuxo;
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
                        CryptoDetailCardDuxo cryptoDetailCardDuxo = this.this$0;
                        this.label = 1;
                        if (cryptoDetailCardDuxo.loadBreakingNews(this) == coroutine_suspended) {
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

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$3", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ CryptoDetailCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CryptoDetailCardDuxo cryptoDetailCardDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoDetailCardDuxo;
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
                        CryptoDetailCardDuxo cryptoDetailCardDuxo = this.this$0;
                        this.label = 1;
                        if (cryptoDetailCardDuxo.loadIacHeroCard(this) == coroutine_suspended) {
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

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$4", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                int label;
                final /* synthetic */ CryptoDetailCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CryptoDetailCardDuxo cryptoDetailCardDuxo, UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoDetailCardDuxo;
                    this.$uiCurrencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.this$0, this.$uiCurrencyPair, continuation);
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
                        CryptoDetailCardDuxo cryptoDetailCardDuxo = this.this$0;
                        UiCurrencyPair uiCurrencyPair = this.$uiCurrencyPair;
                        this.label = 1;
                        if (cryptoDetailCardDuxo.loadLessonEarnability(uiCurrencyPair, this) == coroutine_suspended) {
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

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$5", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$1$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                int label;
                final /* synthetic */ CryptoDetailCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(CryptoDetailCardDuxo cryptoDetailCardDuxo, UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoDetailCardDuxo;
                    this.$uiCurrencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.this$0, this.$uiCurrencyPair, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.loadAdvancedAlertCard(this.$uiCurrencyPair);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2 */
    static final class C133262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C133262(Continuation<? super C133262> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailCardDuxo.this.new C133262(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C133262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/CardsToInvalidate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CardsToInvalidate, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailCardDuxo cryptoDetailCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CardsToInvalidate cardsToInvalidate, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cardsToInvalidate, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2$1$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497821 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
                final /* synthetic */ CardsToInvalidate $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497821(CardsToInvalidate cardsToInvalidate, Continuation<? super C497821> continuation) {
                    super(2, continuation);
                    this.$it = cardsToInvalidate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497821 c497821 = new C497821(this.$it, continuation);
                    c497821.L$0 = obj;
                    return c497821;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
                    return ((C497821) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoDetailCardDataState) this.L$0).invalidateIacHeroCard(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497821((CardsToInvalidate) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CardsToInvalidate> flowStreamInvalidationTrigger = CryptoDetailCardDuxo.this.iacHeroCardInvalidator.streamInvalidationTrigger();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailCardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamInvalidationTrigger, anonymousClass1, this) == coroutine_suspended) {
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
    public final Object loadBreakingNews(Continuation<? super Unit> continuation) {
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.poll(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        final Flow flowOnEach = FlowKt.onEach(Operators.connectWhen(FlowKt.transformLatest(this.cryptoAccountProvider.streamAccountNumber(new CryptoAccountSwitcherLocation.Detail(((Args) INSTANCE.getArgs((HasArgs) this)).getCurrencyPairId())), new CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$1(null, this)), this.cryptoExperimentsStore.streamCryptoMibExperiment(), Operators.toOptionals(Context7.buffer$default(RxConvert.asFlow(this.unifiedAccountStore.streamIndividualAccount()), Integer.MAX_VALUE, null, 2, null))), new C133183(null));
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.m28818catch(FlowKt.transformLatest(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = flowOnEach.collect(new C133142(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$$inlined$mapNotNull$1$2 */
            public static final class C133142<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$$inlined$mapNotNull$1$2", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C133142.this.emit(null, this);
                    }
                }

                public C133142(FlowCollector flowCollector) {
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
                        UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) obj).getOrNull();
                        String accountNumber = unifiedAccountV2 != null ? unifiedAccountV2.getAccountNumber() : null;
                        if (accountNumber != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
        }), new CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$2(null, this)), new CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3(null, this)), new C133197(null)), new C133208(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$3", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$3 */
    static final class C133183 extends ContinuationImpl7 implements Function2<Optional<? extends UnifiedAccountV2>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C133183(Continuation<? super C133183> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133183 c133183 = CryptoDetailCardDuxo.this.new C133183(continuation);
            c133183.L$0 = obj;
            return c133183;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Optional<UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
            return ((C133183) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
            return invoke2((Optional<UnifiedAccountV2>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((UnifiedAccountV2) ((Optional) this.L$0).component1()) == null) {
                CryptoDetailCardDuxo.this.applyMutation(new AnonymousClass1(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$3$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
                return ((AnonymousClass1) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoDetailCardDataState.copy$default((CryptoDetailCardDataState) this.L$0, null, CryptoDetailCardDataState2.DoNotShow.INSTANCE, null, null, null, false, 61, null);
            }
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$7", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$7 */
    static final class C133197 extends ContinuationImpl7 implements Function3<FlowCollector<? super BreakingNews>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        C133197(Continuation<? super C133197> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super BreakingNews> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return CryptoDetailCardDuxo.this.new C133197(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$7$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
                return ((AnonymousClass1) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoDetailCardDataState.copy$default((CryptoDetailCardDataState) this.L$0, null, CryptoDetailCardDataState2.DoNotShow.INSTANCE, null, null, null, false, 61, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoDetailCardDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "breakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$8", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$8 */
    static final class C133208 extends ContinuationImpl7 implements Function2<BreakingNews, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C133208(Continuation<? super C133208> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133208 c133208 = CryptoDetailCardDuxo.this.new C133208(continuation);
            c133208.L$0 = obj;
            return c133208;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BreakingNews breakingNews, Continuation<? super Unit> continuation) {
            return ((C133208) create(breakingNews, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$8$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
            final /* synthetic */ BreakingNews $breakingNews;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BreakingNews breakingNews, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$breakingNews = breakingNews;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$breakingNews, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
                return ((AnonymousClass1) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CryptoDetailCardDataState2 loaded;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoDetailCardDataState cryptoDetailCardDataState = (CryptoDetailCardDataState) this.L$0;
                if (this.$breakingNews != null) {
                    loaded = new CryptoDetailCardDataState2.Loaded(this.$breakingNews);
                } else {
                    loaded = CryptoDetailCardDataState2.DoNotShow.INSTANCE;
                }
                return CryptoDetailCardDataState.copy$default(cryptoDetailCardDataState, null, loaded, null, null, null, false, 61, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoDetailCardDuxo.this.applyMutation(new AnonymousClass1((BreakingNews) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadIacHeroCard(Continuation<? super Unit> continuation) {
        C133211 c133211;
        IacHeroCard iacHeroCard;
        if (continuation instanceof C133211) {
            c133211 = (C133211) continuation;
            int i = c133211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c133211.label = i - Integer.MIN_VALUE;
            } else {
                c133211 = new C133211(continuation);
            }
        }
        Object objFirstOrNull = c133211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c133211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<Boolean> flowStreamCryptoUsIacHeroCardCdpKillSwitch = this.cryptoExperimentsStore.streamCryptoUsIacHeroCardCdpKillSwitch();
            c133211.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoUsIacHeroCardCdpKillSwitch, c133211);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            iacHeroCard = (IacHeroCard) objFirstOrNull;
            applyMutation(new C133222(iacHeroCard, null));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        if (!Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true))) {
            IacHeroCardStore iacHeroCardStore = this.iacHeroCardStore;
            ApiIacHeroCardLocationArg.Cdp cdp = new ApiIacHeroCardLocationArg.Cdp(((Args) INSTANCE.getArgs((HasArgs) this)).getCurrencyPairId());
            c133211.label = 2;
            objFirstOrNull = iacHeroCardStore.getIacHeroCard(cdp, c133211);
        } else {
            iacHeroCard = null;
            applyMutation(new C133222(iacHeroCard, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadIacHeroCard$2", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadIacHeroCard$2 */
    static final class C133222 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
        final /* synthetic */ IacHeroCard $iacHeroCard;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C133222(IacHeroCard iacHeroCard, Continuation<? super C133222> continuation) {
            super(2, continuation);
            this.$iacHeroCard = iacHeroCard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133222 c133222 = new C133222(this.$iacHeroCard, continuation);
            c133222.L$0 = obj;
            return c133222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
            return ((C133222) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoDetailCardDataState2 loaded;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoDetailCardDataState cryptoDetailCardDataState = (CryptoDetailCardDataState) this.L$0;
            if (this.$iacHeroCard != null) {
                loaded = new CryptoDetailCardDataState2.Loaded(this.$iacHeroCard);
            } else {
                loaded = CryptoDetailCardDataState2.DoNotShow.INSTANCE;
            }
            return CryptoDetailCardDataState.copy$default(cryptoDetailCardDataState, null, null, loaded, null, null, false, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLessonEarnability(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) throws Throwable {
        C133231 c133231;
        Object objM28550constructorimpl;
        if (continuation instanceof C133231) {
            c133231 = (C133231) continuation;
            int i = c133231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c133231.label = i - Integer.MIN_VALUE;
            } else {
                c133231 = new C133231(continuation);
            }
        }
        Object objAwait = c133231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c133231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Result.Companion companion = Result.INSTANCE;
                Single<ApiEducationEarnability> singleFetchLessonEarnability = this.educationLessonsStore.fetchLessonEarnability(new Either.Right(uiCurrencyPair.getAssetCurrencyId().toString()));
                c133231.label = 1;
                objAwait = RxAwait3.await(singleFetchLessonEarnability, c133231);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiEducationEarnability) objAwait);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            ApiEducationEarnability apiEducationEarnability = (ApiEducationEarnability) objM28550constructorimpl;
            if (apiEducationEarnability != null && (apiEducationEarnability.getCrypto_earnability() == ApiEducationEarnability.RewardState.USER_CAN_CLAIM || apiEducationEarnability.getCrypto_earnability() == ApiEducationEarnability.RewardState.USER_NO_CRYPTO_ACCOUNT)) {
                applyMutation(new CryptoDetailCardDuxo3(apiEducationEarnability, null));
            } else {
                applyMutation(new CryptoDetailCardDuxo4(null));
            }
        } else {
            if (!Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
                throw thM28553exceptionOrNullimpl;
            }
            applyMutation(new CryptoDetailCardDuxo5(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadAdvancedAlertCard$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadAdvancedAlertCard$1 */
    static final class C133171 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
        final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoDetailCardDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C133171(UiCurrencyPair uiCurrencyPair, CryptoDetailCardDuxo cryptoDetailCardDuxo, Continuation<? super C133171> continuation) {
            super(2, continuation);
            this.$uiCurrencyPair = uiCurrencyPair;
            this.this$0 = cryptoDetailCardDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133171 c133171 = new C133171(this.$uiCurrencyPair, this.this$0, continuation);
            c133171.L$0 = obj;
            return c133171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
            return ((C133171) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoDetailCardDataState2 loaded;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoDetailCardDataState cryptoDetailCardDataState = (CryptoDetailCardDataState) this.L$0;
            if (!this.$uiCurrencyPair.getMarketOrdersOnly() && this.this$0.shownAdvancedAlertCdpCardCountPref.get() < 2) {
                loaded = new CryptoDetailCardDataState2.Loaded(Unit.INSTANCE);
            } else {
                loaded = CryptoDetailCardDataState2.DoNotShow.INSTANCE;
            }
            return CryptoDetailCardDataState.copy$default(cryptoDetailCardDataState, null, null, null, loaded, null, false, 55, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAdvancedAlertCard(UiCurrencyPair uiCurrencyPair) {
        applyMutation(new C133171(uiCurrencyPair, this, null));
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCardDismissed$1", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$onCardDismissed$1 */
    static final class C133241 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C133241(Continuation<? super C133241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C133241 c133241 = new C133241(continuation);
            c133241.L$0 = obj;
            return c133241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
            return ((C133241) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoDetailCardDataState.copy$default((CryptoDetailCardDataState) this.L$0, null, null, null, null, null, true, 31, null);
        }
    }

    public final void onCardDismissed() {
        applyMutation(new C133241(null));
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: CryptoDetailCardDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Args copy(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Args(currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.currencyPairId, ((Args) other).currencyPairId);
        }

        public int hashCode() {
            return this.currencyPairId.hashCode();
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
        }

        public Args(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }

    /* compiled from: CryptoDetailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Args;", "<init>", "()V", "MAX_ADVANCED_ALERT_CARD_SHOWN_COUNT", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoDetailCardDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(CryptoDetailCardDuxo cryptoDetailCardDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoDetailCardDuxo);
        }
    }
}
