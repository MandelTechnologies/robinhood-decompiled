package com.robinhood.android.acatsin.brokeragesearch;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchContract;
import com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchEvent;
import com.robinhood.android.acatsin.brokeragesearch.SearchState;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.api.bonfire.ApiSearchBrokeragesResponse;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: AcatsInBrokerageSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001(B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0017J\u0016\u0010%\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchViewState;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsValidationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onQueryUpdated", "query", "", "onBannerDismissed", "receiptUuid", "Ljava/util/UUID;", "onBannerClicked", "action", "", "onBrokerageSelected", "brokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "onManualBrokerageEntrySelected", "validateUserAccount", "onAccountVerifiedEligible", "Lkotlin/Function0;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInBrokerageSearchDuxo extends BaseDuxo3<AcatsInBrokerageSearchDataState, AcatsInBrokerageSearchViewState, AcatsInBrokerageSearchEvent> implements HasSavedState {
    private final AcatsValidationStore acatsValidationStore;
    private final AcatsBrokerageStore brokerageStore;
    private final IacInfoBannerStore iacInfoBannerStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInBrokerageSearchDuxo(AcatsValidationStore acatsValidationStore, AcatsBrokerageStore brokerageStore, IacInfoBannerStore iacInfoBannerStore, SavedStateHandle savedStateHandle, AcatsInBrokerageSearchStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new AcatsInBrokerageSearchDataState(null, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsValidationStore = acatsValidationStore;
        this.brokerageStore = brokerageStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        final IacInfoBannerLocation iacInfoBannerLocation = IacInfoBannerLocation.INFO_BANNER_ACATS_BROKERAGE_TOP_LEVEL;
        IacInfoBannerStore.refresh$default(this.iacInfoBannerStore, CollectionsKt.listOf(iacInfoBannerLocation), null, null, null, null, null, null, null, null, null, null, false, 4094, null);
        Observable map = IacInfoBannerStore.streamBatch$default(this.iacInfoBannerStore, CollectionsKt.listOf(iacInfoBannerLocation), null, null, null, null, null, null, null, null, null, null, 2046, null).map(new Function() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final Optional<List<IacInfoBanner>> apply(List<IacInfoBanner> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInBrokerageSearchDuxo.onStart$lambda$0(iacInfoBannerLocation, this, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(IacInfoBannerLocation iacInfoBannerLocation, AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo, Optional optional) {
        List list = (List) optional.component1();
        acatsInBrokerageSearchDuxo.applyMutation(new AcatsInBrokerageSearchDuxo4(list != null ? IacInfoBanners.findByLocation(list, iacInfoBannerLocation) : null, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInBrokerageSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onQueryUpdated$1", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onQueryUpdated$1 */
    static final class C78251 extends ContinuationImpl7 implements Function2<AcatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C78251(Continuation<? super C78251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78251 c78251 = new C78251(continuation);
            c78251.L$0 = obj;
            return c78251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState> continuation) {
            return ((C78251) create(acatsInBrokerageSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInBrokerageSearchDataState.copy$default((AcatsInBrokerageSearchDataState) this.L$0, SearchState.Loading.INSTANCE, null, false, 6, null);
        }
    }

    public final void onQueryUpdated(CharSequence query) {
        Intrinsics.checkNotNullParameter(query, "query");
        applyMutation(new C78251(null));
        String rhsAccountNumber = ((AcatsInBrokerageSearchContract.Key) INSTANCE.getArgs((HasSavedState) this)).getRhsAccountNumber();
        if (rhsAccountNumber != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C78262(query, rhsAccountNumber, null), 3, null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* compiled from: AcatsInBrokerageSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onQueryUpdated$2", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$onQueryUpdated$2 */
    static final class C78262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $query;
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78262(CharSequence charSequence, String str, Continuation<? super C78262> continuation) {
            super(2, continuation);
            this.$query = charSequence;
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78262 c78262 = AcatsInBrokerageSearchDuxo.this.new C78262(this.$query, this.$rhsAccountNumber, continuation);
            c78262.L$0 = obj;
            return c78262;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo = AcatsInBrokerageSearchDuxo.this;
                    CharSequence charSequence = this.$query;
                    String str = this.$rhsAccountNumber;
                    Result.Companion companion = Result.INSTANCE;
                    AcatsBrokerageStore acatsBrokerageStore = acatsInBrokerageSearchDuxo.brokerageStore;
                    String string2 = charSequence.toString();
                    this.label = 1;
                    obj = acatsBrokerageStore.searchBrokerages(string2, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(((ApiSearchBrokeragesResponse) obj).getResults());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo2 = AcatsInBrokerageSearchDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                acatsInBrokerageSearchDuxo2.applyMutation(new AcatsInBrokerageSearchDuxo2((List) objM28550constructorimpl, null));
            } else {
                acatsInBrokerageSearchDuxo2.submit(new AcatsInBrokerageSearchEvent.Error(thM28553exceptionOrNullimpl));
                acatsInBrokerageSearchDuxo2.applyMutation(new AcatsInBrokerageSearchDuxo3(null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onBannerDismissed(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        bind(this.iacInfoBannerStore.postDismissed(receiptUuid, IacDismissMethod.PASSIVE), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public final void onBannerClicked(UUID receiptUuid, String action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        bind(this.iacInfoBannerStore.postTapped(receiptUuid, action), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public final void onBrokerageSelected(final ApiBrokerage brokerage) {
        Intrinsics.checkNotNullParameter(brokerage, "brokerage");
        validateUserAccount(new Function0() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInBrokerageSearchDuxo.onBrokerageSelected$lambda$1(this.f$0, brokerage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBrokerageSelected$lambda$1(AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo, ApiBrokerage apiBrokerage) {
        acatsInBrokerageSearchDuxo.submit(new AcatsInBrokerageSearchEvent.BrokerageSelected(apiBrokerage));
        return Unit.INSTANCE;
    }

    public final void onManualBrokerageEntrySelected() {
        validateUserAccount(new Function0() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInBrokerageSearchDuxo.onManualBrokerageEntrySelected$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onManualBrokerageEntrySelected$lambda$2(AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo) {
        acatsInBrokerageSearchDuxo.submit(AcatsInBrokerageSearchEvent.ManualEntryBrokerageEntrySelected.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInBrokerageSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1 */
    static final class C78281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onAccountVerifiedEligible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78281(Function0<Unit> function0, Continuation<? super C78281> continuation) {
            super(2, continuation);
            this.$onAccountVerifiedEligible = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInBrokerageSearchDuxo.this.new C78281(this.$onAccountVerifiedEligible, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInBrokerageSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1$1", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState>, Object> {
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
            public final Object invoke(AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState> continuation) {
                return ((AnonymousClass1) create(acatsInBrokerageSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AcatsInBrokerageSearchDataState.copy$default((AcatsInBrokerageSearchDataState) this.L$0, null, null, true, 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsInBrokerageSearchDuxo.this.applyMutation(new AnonymousClass1(null));
                Single<UiAcatsValidationResponse> accountEligibility = AcatsInBrokerageSearchDuxo.this.acatsValidationStore.getAccountEligibility(((AcatsInBrokerageSearchContract.Key) AcatsInBrokerageSearchDuxo.INSTANCE.getArgs((HasSavedState) AcatsInBrokerageSearchDuxo.this)).getRhsAccountNumber());
                this.label = 1;
                obj = RxAwait3.await(accountEligibility, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AcatsInBrokerageSearchDuxo.this.applyMutation(new AnonymousClass2(null));
            GenericAlert error = ((UiAcatsValidationResponse) obj).getError();
            if (error != null) {
                AcatsInBrokerageSearchDuxo.this.submit(new AcatsInBrokerageSearchEvent.AccountIneligibleEvent(error));
            } else {
                this.$onAccountVerifiedEligible.invoke();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInBrokerageSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1$2", m3645f = "AcatsInBrokerageSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchDuxo$validateUserAccount$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AcatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState, Continuation<? super AcatsInBrokerageSearchDataState> continuation) {
                return ((AnonymousClass2) create(acatsInBrokerageSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AcatsInBrokerageSearchDataState.copy$default((AcatsInBrokerageSearchDataState) this.L$0, null, null, false, 3, null);
            }
        }
    }

    private final void validateUserAccount(Function0<Unit> onAccountVerifiedEligible) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C78281(onAccountVerifiedEligible, null), 3, null);
    }

    /* compiled from: AcatsInBrokerageSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInBrokerageSearchDuxo, AcatsInBrokerageSearchContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInBrokerageSearchContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInBrokerageSearchContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInBrokerageSearchContract.Key getArgs(AcatsInBrokerageSearchDuxo acatsInBrokerageSearchDuxo) {
            return (AcatsInBrokerageSearchContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInBrokerageSearchDuxo);
        }
    }
}
