package com.robinhood.android.acats.retries.activity;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.Logger;
import com.robinhood.android.acats.contracts.AcatsRetriesIntentKey;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.retries.AcatsRetriesEvents;
import com.robinhood.android.acats.retries.activity.AcatsRetriesDataState;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.api.bonfire.ApiSearchBrokeragesResponse;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AcatsRetriesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00010BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0010\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%J\u0014\u0010&\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsBrokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "brokerageStore", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acats/retries/activity/AcatsRetriesStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onStop", "submitRetry", "getInstruments", "acatId", "Ljava/util/UUID;", "getOptions", "rowClicked", "action", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "updateAssets", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "updateAccountTitle", "account", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "updateAccountNumber", "accountNumber", "", "Companion", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsRetriesDuxo extends BaseDuxo3<AcatsRetriesDataState, AcatsRetriesViewState, AcatsRetriesEvents> implements HasSavedState {
    private final AcatsBrokerageStore acatsBrokerageStore;
    private final AcatsTransferStore acatsTransferStore;
    private final AcatsBrokerageStore brokerageStore;
    private final InstrumentStore instrumentStore;
    private final OptionChainStore optionChainStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.AcatRetryStep.values().length];
            try {
                iArr[ApiAcatsTransfer.AcatRetryStep.ASSETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRetryStep.ACCOUNT_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRetryStep.ACCOUNT_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsRetriesDuxo(AcatsBrokerageStore acatsBrokerageStore, AcatsTransferStore acatsTransferStore, AcatsBrokerageStore brokerageStore, InstrumentStore instrumentStore, OptionInstrumentStore optionInstrumentStore, OptionChainStore optionChainStore, SavedStateHandle savedStateHandle, AcatsRetriesStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsRetriesDataState(((AcatsRetriesIntentKey) companion.getExtras(savedStateHandle)).getAcatsId(), null, null, null, null, false, null, null, null, ((AcatsRetriesIntentKey) companion.getExtras(savedStateHandle)).getSource(), 510, null), stateProvider, duxoBundle);
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.acatsTransferStore = acatsTransferStore;
        this.brokerageStore = brokerageStore;
        this.instrumentStore = instrumentStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionChainStore = optionChainStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.acatsTransferStore.refresh(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C76711(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C76722(null), 3, null);
        Companion companion = INSTANCE;
        getInstruments(((AcatsRetriesIntentKey) companion.getExtras((HasSavedState) this)).getAcatsId());
        getOptions(((AcatsRetriesIntentKey) companion.getExtras((HasSavedState) this)).getAcatsId());
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C76733(null), 3, null);
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1 */
    static final class C76711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76711(Continuation<? super C76711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesDuxo.this.new C76711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsRetriesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsTransfer, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsRetriesDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsRetriesDuxo acatsRetriesDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsRetriesDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsTransfer acatsTransfer, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(acatsTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v16, types: [T, com.robinhood.models.acats.db.bonfire.AcatsTransfer] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.robinhood.models.acats.db.bonfire.AcatsTransfer] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ?? r1 = (AcatsTransfer) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r1;
                List<AcatsTransfer.Asset> assets = r1.getAssets();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : assets) {
                    if (((AcatsTransfer.Asset) obj2).getAssetType() == ApiAcatsTransfer.Asset.AssetType.CASH) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() > 1) {
                    CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("Found multiple cash assets in the acats transfer list of assets"), false, new EventMetadata(SentryTeam.EQUITIES, MapsKt.mapOf(Tuples4.m3642to("feature", "acats"), Tuples4.m3642to("acatsId", ((AcatsRetriesIntentKey) AcatsRetriesDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getAcatsId().toString())), null, 4, null));
                    T t = objectRef.element;
                    AcatsTransfer acatsTransfer = (AcatsTransfer) t;
                    List<AcatsTransfer.Asset> assets2 = ((AcatsTransfer) t).getAssets();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : assets2) {
                        AcatsTransfer.Asset asset = (AcatsTransfer.Asset) obj3;
                        if (asset.getAssetType() != ApiAcatsTransfer.Asset.AssetType.CASH || Intrinsics.areEqual(asset, CollectionsKt.first((List) arrayList))) {
                            arrayList2.add(obj3);
                        }
                    }
                    objectRef.element = AcatsTransfer.copy$default(acatsTransfer, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097147, null);
                }
                this.this$0.applyMutation(new AnonymousClass2(objectRef, null));
                return Unit.INSTANCE;
            }

            /* compiled from: AcatsRetriesDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1$1$2", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
                final /* synthetic */ Ref.ObjectRef<AcatsTransfer> $filteredAcatsTransfer;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Ref.ObjectRef<AcatsTransfer> objectRef, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$filteredAcatsTransfer = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$filteredAcatsTransfer, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
                    return ((AnonymousClass2) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AcatsRetriesDataState.copy$default((AcatsRetriesDataState) this.L$0, null, this.$filteredAcatsTransfer.element, null, null, null, false, null, null, null, null, 1021, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AcatsTransfer> flowAsFlow = AcatsRetriesDuxo.this.acatsTransferStore.getStreamAcatsTransferById().asFlow(((AcatsRetriesIntentKey) AcatsRetriesDuxo.INSTANCE.getExtras((HasSavedState) AcatsRetriesDuxo.this)).getAcatsId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsRetriesDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2", m3645f = "AcatsRetriesDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2 */
    static final class C76722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76722(Continuation<? super C76722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesDuxo.this.new C76722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = Operators.combine(Context7.buffer$default(RxConvert.asFlow(AcatsRetriesDuxo.this.acatsBrokerageStore.getAvailableAccounts()), Integer.MAX_VALUE, null, 2, null), AcatsRetriesDuxo.this.acatsTransferStore.getStreamAcatsTransferById().asFlow(((AcatsRetriesIntentKey) AcatsRetriesDuxo.INSTANCE.getExtras((HasSavedState) AcatsRetriesDuxo.this)).getAcatsId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsRetriesDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AcatsRetriesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends AvailableAccount>, ? extends AcatsTransfer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsRetriesDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsRetriesDuxo acatsRetriesDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsRetriesDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends AvailableAccount>, ? extends AcatsTransfer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends List<AvailableAccount>, AcatsTransfer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends List<AvailableAccount>, AcatsTransfer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                List list = (List) tuples2.component1();
                AcatsTransfer acatsTransfer = (AcatsTransfer) tuples2.component2();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((AvailableAccount) next).getRhsAccountNumber(), acatsTransfer.getRhsAccountNumber())) {
                        break;
                    }
                }
                AvailableAccount availableAccount = (AvailableAccount) next;
                if (availableAccount != null) {
                    this.this$0.applyMutation(new AcatsRetriesDuxo6(availableAccount, null));
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3", m3645f = "AcatsRetriesDuxo.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3 */
    static final class C76733 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76733(Continuation<? super C76733> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesDuxo.this.new C76733(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76733) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(AcatsRetriesDuxo.this.acatsTransferStore.getStreamAcatsTransferById().asFlow(((AcatsRetriesIntentKey) AcatsRetriesDuxo.INSTANCE.getExtras((HasSavedState) AcatsRetriesDuxo.this)).getAcatsId()), new AnonymousClass1(AcatsRetriesDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AcatsRetriesDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: AcatsRetriesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "it", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsTransfer, Continuation<? super List<? extends ApiBrokerage>>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsRetriesDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsRetriesDuxo acatsRetriesDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsRetriesDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AcatsTransfer acatsTransfer, Continuation<? super List<ApiBrokerage>> continuation) {
                return ((AnonymousClass1) create(acatsTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AcatsTransfer acatsTransfer, Continuation<? super List<? extends ApiBrokerage>> continuation) {
                return invoke2(acatsTransfer, (Continuation<? super List<ApiBrokerage>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsTransfer acatsTransfer = (AcatsTransfer) this.L$0;
                    String rhsAccountNumber = acatsTransfer.getRhsAccountNumber();
                    if (rhsAccountNumber == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String contraBrokerName = acatsTransfer.getContraBrokerName();
                    if (contraBrokerName != null) {
                        AcatsBrokerageStore acatsBrokerageStore = this.this$0.brokerageStore;
                        this.label = 1;
                        obj = acatsBrokerageStore.searchBrokerages(contraBrokerName, rhsAccountNumber, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<ApiBrokerage> results = ((ApiSearchBrokeragesResponse) obj).getResults();
                if (results != null) {
                    return results;
                }
                return CollectionsKt.emptyList();
            }
        }

        /* compiled from: AcatsRetriesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$2", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ApiBrokerage>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsRetriesDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AcatsRetriesDuxo acatsRetriesDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = acatsRetriesDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiBrokerage> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ApiBrokerage>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ApiBrokerage> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AcatsRetriesDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$2$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
                final /* synthetic */ List<ApiBrokerage> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<ApiBrokerage> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
                    return ((AnonymousClass1) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AcatsRetriesDataState.copy$default((AcatsRetriesDataState) this.L$0, null, null, null, (ApiBrokerage) CollectionsKt.firstOrNull((List) this.$it), null, false, null, null, null, null, 1015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        withDataState(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.onStop$lambda$0((AcatsRetriesDataState) obj);
            }
        });
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$0(AcatsRetriesDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.INSTANCE.mo1679d(String.valueOf(it.getRequest()), new Object[0]);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$submitRetry$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$submitRetry$1 */
    static final class C76741 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C76741(Continuation<? super C76741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76741 c76741 = new C76741(continuation);
            c76741.L$0 = obj;
            return c76741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
            return ((C76741) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsRetriesDataState.copy$default((AcatsRetriesDataState) this.L$0, null, null, null, null, null, true, null, null, null, null, 991, null);
        }
    }

    public final void submitRetry() {
        applyMutation(new C76741(null));
        withDataState(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.submitRetry$lambda$4(this.f$0, (AcatsRetriesDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitRetry$lambda$4(final AcatsRetriesDuxo acatsRetriesDuxo, final AcatsRetriesDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AcatsTransferStore acatsTransferStore = acatsRetriesDuxo.acatsTransferStore;
        ApiAcatsTransferRequest request = dataState.getRequest();
        if (request == null) {
            return Unit.INSTANCE;
        }
        LifecycleHost.DefaultImpls.bind$default(acatsRetriesDuxo, SinglesKt.recoverFromRefIdConflict(acatsTransferStore.postTransferRequest(request), new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.submitRetry$lambda$4$lambda$1(this.f$0, (UUID) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.submitRetry$lambda$4$lambda$2(this.f$0, dataState, (AcatsTransfer) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.submitRetry$lambda$4$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single submitRetry$lambda$4$lambda$1(AcatsRetriesDuxo acatsRetriesDuxo, UUID conflictingResourceId) {
        Intrinsics.checkNotNullParameter(conflictingResourceId, "conflictingResourceId");
        return RxFactory.DefaultImpls.rxSingle$default(acatsRetriesDuxo, null, new AcatsRetriesDuxo7(acatsRetriesDuxo, conflictingResourceId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitRetry$lambda$4$lambda$2(AcatsRetriesDuxo acatsRetriesDuxo, AcatsRetriesDataState acatsRetriesDataState, AcatsTransfer acatsTransfer) {
        AcatsTransferStore.refresh$default(acatsRetriesDuxo.acatsTransferStore, false, 1, null);
        AcatsInScreenContext screenContext = acatsRetriesDataState.getScreenContext();
        UUID id = acatsTransfer.getId();
        Either.Right right = new Either.Right(acatsTransfer.getContraDtccNumber());
        StringResource.Companion companion = StringResource.INSTANCE;
        acatsRetriesDuxo.submit(new AcatsRetriesEvents.TransferSubmit.TransferSubmitSuccess(new AcatsInConfirmationContract.Key(screenContext, right, id, companion.invoke(C7686R.string.acats_in_confirmation_title, new Object[0]), companion.invoke(C7686R.string.acats_in_confirmation_description, new Object[0]), false, false, 64, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitRetry$lambda$4$lambda$3(AcatsRetriesDuxo acatsRetriesDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        acatsRetriesDuxo.submit(new AcatsRetriesEvents.TransferSubmit.TransferSubmitError(t));
        return Unit.INSTANCE;
    }

    public final void getInstruments(UUID acatId) {
        Intrinsics.checkNotNullParameter(acatId, "acatId");
        final Flow<AcatsTransfer> flowAsFlow = this.acatsTransferStore.getStreamAcatsTransferById().asFlow(acatId);
        Observable observableFlatMap = asObservable(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C76652(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$$inlined$map$1$2 */
            public static final class C76652<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AcatsRetriesDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$$inlined$map$1$2", m3645f = "AcatsRetriesDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getInstruments$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C76652.this.emit(null, this);
                    }
                }

                public C76652(FlowCollector flowCollector, AcatsRetriesDuxo acatsRetriesDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = acatsRetriesDuxo;
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
                        List<AcatsTransfer.Asset> assets = ((AcatsTransfer) obj).getAssets();
                        ArrayList arrayList = new ArrayList();
                        for (T t : assets) {
                            if (((AcatsTransfer.Asset) t).getAssetType() == ApiAcatsTransfer.Asset.AssetType.EQUITY) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList<UUID> arrayList2 = new ArrayList();
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            UUID assetId = ((AcatsTransfer.Asset) it.next()).getAssetId();
                            if (assetId != null) {
                                arrayList2.add(assetId);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (UUID uuid : arrayList2) {
                            this.this$0.instrumentStore.refresh(true, uuid);
                            arrayList3.add(uuid);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList3, anonymousClass1) == coroutine_suspended) {
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
        }).flatMap(new Function() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo.getInstruments.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Instrument>> apply(List<UUID> instrumentIds) {
                Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
                return AcatsRetriesDuxo.this.instrumentStore.getInstruments(instrumentIds);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.getInstruments$lambda$9(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInstruments$lambda$9(AcatsRetriesDuxo acatsRetriesDuxo, List list) {
        acatsRetriesDuxo.applyMutation(new AcatsRetriesDuxo2(list, null));
        return Unit.INSTANCE;
    }

    public final void getOptions(UUID acatId) {
        Intrinsics.checkNotNullParameter(acatId, "acatId");
        final Flow<AcatsTransfer> flowAsFlow = this.acatsTransferStore.getStreamAcatsTransferById().asFlow(acatId);
        Observable observableFlatMap = asObservable(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C76662(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$$inlined$map$1$2 */
            public static final class C76662<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$$inlined$map$1$2", m3645f = "AcatsRetriesDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C76662.this.emit(null, this);
                    }
                }

                public C76662(FlowCollector flowCollector) {
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
                        List<AcatsTransfer.Asset> assets = ((AcatsTransfer) obj).getAssets();
                        ArrayList arrayList = new ArrayList();
                        for (T t : assets) {
                            if (((AcatsTransfer.Asset) t).getAssetType() == ApiAcatsTransfer.Asset.AssetType.OPTION) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            UUID instrumentId = ((AcatsTransfer.Asset) it.next()).getInstrumentId();
                            if (instrumentId != null) {
                                arrayList2.add(instrumentId);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList2, anonymousClass1) == coroutine_suspended) {
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
        }).flatMap(new Function() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$getOptions$optionsInstrumentStream$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<OptionInstrument>> apply(List<UUID> optionIds) {
                Intrinsics.checkNotNullParameter(optionIds, "optionIds");
                List<UUID> list = optionIds;
                this.this$0.optionInstrumentStore.pingOptionInstruments(list, true);
                return this.this$0.optionInstrumentStore.getOptionInstruments(list);
            }
        });
        Intrinsics.checkNotNull(observableFlatMap);
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.getOptions$lambda$13(this.f$0, (List) obj);
            }
        });
        Observable observableFlatMap2 = observableFlatMap.flatMap(new Function() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo.getOptions.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionInstrument> apply(List<OptionInstrument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.fromIterable(it);
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo.getOptions.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOptionChain> apply(OptionInstrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AcatsRetriesDuxo acatsRetriesDuxo = AcatsRetriesDuxo.this;
                return acatsRetriesDuxo.asObservable(acatsRetriesDuxo.optionChainStore.getStreamUiOptionChain().asFlow(it.getOptionChainId()));
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo.getOptions.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UiOptionChain uiOptionChain) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                UUID firstEquityUnderlyingId = uiOptionChain.getFirstEquityUnderlyingId();
                if (firstEquityUnderlyingId != null) {
                    AcatsRetriesDuxo acatsRetriesDuxo = AcatsRetriesDuxo.this;
                    acatsRetriesDuxo.instrumentStore.refresh(true, firstEquityUnderlyingId);
                    Observable<Instrument> instrument = acatsRetriesDuxo.instrumentStore.getInstrument(firstEquityUnderlyingId);
                    if (instrument != null) {
                        return instrument;
                    }
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap2, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.getOptions$lambda$14(this.f$0, (Instrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOptions$lambda$13(AcatsRetriesDuxo acatsRetriesDuxo, List list) {
        acatsRetriesDuxo.applyMutation(new AcatsRetriesDuxo3(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOptions$lambda$14(AcatsRetriesDuxo acatsRetriesDuxo, Instrument instrument) {
        acatsRetriesDuxo.applyMutation(new AcatsRetriesDuxo4(instrument, null));
        return Unit.INSTANCE;
    }

    public final void rowClicked(final ApiAcatsTransfer.AcatRetryStep action) {
        withDataState(new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsRetriesDuxo.rowClicked$lambda$15(this.f$0, action, (AcatsRetriesDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowClicked$lambda$15(AcatsRetriesDuxo acatsRetriesDuxo, ApiAcatsTransfer.AcatRetryStep acatRetryStep, AcatsRetriesDataState state) {
        AcatsRetriesEvents assetsConfirmRowClick;
        Intrinsics.checkNotNullParameter(state, "state");
        int i = acatRetryStep == null ? -1 : WhenMappings.$EnumSwitchMapping$0[acatRetryStep.ordinal()];
        if (i != -1) {
            if (i == 1) {
                assetsConfirmRowClick = new AcatsRetriesEvents.RowClickEvent.AssetsConfirmRowClick(state.getAssetRowClickedFragmentKey());
            } else if (i == 2) {
                AcatsInAccountNumberContract.Key accountNumberRowClickedKey = state.getAccountNumberRowClickedKey();
                if (accountNumberRowClickedKey == null) {
                    return Unit.INSTANCE;
                }
                assetsConfirmRowClick = new AcatsRetriesEvents.RowClickEvent.AccountNumberRowClicked(accountNumberRowClickedKey);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                assetsConfirmRowClick = new AcatsRetriesEvents.RowClickEvent.AccountTypeRowClicked(state.getAccountTypeRowClickedKey());
            }
            acatsRetriesDuxo.submit(assetsConfirmRowClick);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAssets$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAssets$1 */
    static final class C76771 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
        final /* synthetic */ List<UiAcatsAsset> $assets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C76771(List<? extends UiAcatsAsset> list, Continuation<? super C76771> continuation) {
            super(2, continuation);
            this.$assets = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76771 c76771 = new C76771(this.$assets, continuation);
            c76771.L$0 = obj;
            return c76771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
            return ((C76771) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) this.L$0;
            return AcatsRetriesDataState.copy$default(acatsRetriesDataState, null, null, null, null, AcatsRetriesDataState.NewUserValues.copy$default(acatsRetriesDataState.getNewUserValues(), null, null, this.$assets, 3, null), false, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void updateAssets(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        applyMutation(new C76771(assets, null));
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAccountTitle$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAccountTitle$1 */
    static final class C76761 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
        final /* synthetic */ AvailableAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76761(AvailableAccount availableAccount, Continuation<? super C76761> continuation) {
            super(2, continuation);
            this.$account = availableAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76761 c76761 = new C76761(this.$account, continuation);
            c76761.L$0 = obj;
            return c76761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
            return ((C76761) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) this.L$0;
            return AcatsRetriesDataState.copy$default(acatsRetriesDataState, null, null, null, null, AcatsRetriesDataState.NewUserValues.copy$default(acatsRetriesDataState.getNewUserValues(), null, this.$account, null, 5, null), false, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void updateAccountTitle(AvailableAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C76761(account, null));
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAccountNumber$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$updateAccountNumber$1 */
    static final class C76751 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76751(String str, Continuation<? super C76751> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76751 c76751 = new C76751(this.$accountNumber, continuation);
            c76751.L$0 = obj;
            return c76751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
            return ((C76751) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsRetriesDataState acatsRetriesDataState = (AcatsRetriesDataState) this.L$0;
            return AcatsRetriesDataState.copy$default(acatsRetriesDataState, null, null, null, null, AcatsRetriesDataState.NewUserValues.copy$default(acatsRetriesDataState.getNewUserValues(), this.$accountNumber, null, null, 6, null), false, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void updateAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C76751(accountNumber, null));
    }

    /* compiled from: AcatsRetriesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "Lcom/robinhood/android/acats/contracts/AcatsRetriesIntentKey;", "<init>", "()V", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<AcatsRetriesDuxo, AcatsRetriesIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsRetriesIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (AcatsRetriesIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsRetriesIntentKey getExtras(AcatsRetriesDuxo acatsRetriesDuxo) {
            return (AcatsRetriesIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, acatsRetriesDuxo);
        }
    }
}
