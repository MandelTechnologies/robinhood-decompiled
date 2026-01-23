package com.robinhood.android.crypto.costbasis.hub;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.crypto.contracts.CryptoCostBasisHubFragmentKey;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo;
import com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubEvent;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001+BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u001aH\u0002J\u0016\u0010&\u001a\u0004\u0018\u00010'*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010(\u001a\u00020!*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010)\u001a\u00020!*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010*\u001a\u00020!*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubViewState;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisHubFragmentKey;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoCostBasisStore", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/contentful/StaticContentStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "section", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSection;", "limit", "", "reset", "", "refreshRow", "row", "Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "refreshConfirmedSection", "cursor", "", "isLoadingMore", "hasFetchedAll", "needsInitialLoad", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubDuxo extends BaseDuxo3<CryptoCostBasisHubDataState, CryptoCostBasisHubViewState, CryptoCostBasisHubEvent> implements HasArgs<CryptoCostBasisHubFragmentKey> {
    private static final String CONTENTFUL_ID_2025_DEPOSITS = "6iQ0liuZRfNQ07JXukqfMs";
    private static final String CONTENTFUL_ID_MISSING_DETAILS = "1Jcc7S24397QwxRRTGXmFz";
    public static final int FIRST_PAGE_SIZE = 5;
    private static final int MAX_PAGE_REFRESH = 50;
    public static final int SUBSEQUENT_PAGE_SIZE = 10;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoCostBasisStore cryptoCostBasisStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCostBasisHubSection.values().length];
            try {
                iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoCostBasisHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoCostBasisHubFragmentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCostBasisHubDuxo(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisStore cryptoCostBasisStore, CryptoAccountStore cryptoAccountStore, StaticContentStore staticContentStore) {
        super(new CryptoCostBasisHubDataState(new CryptoCostBasisHubSectionDataState(localizedDateTimeFormatter, CryptoCostBasisHubSection.SOLD_IN_2025, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new CryptoCostBasisHubSectionDataState(localizedDateTimeFormatter, CryptoCostBasisHubSection.MISSING_DETAILS, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new CryptoCostBasisHubSectionDataState(localizedDateTimeFormatter, CryptoCostBasisHubSection.CONFIRMED, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null)), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.savedStateHandle = savedStateHandle;
        this.cryptoCostBasisStore = cryptoCostBasisStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C128951(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C128962(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C128973(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C128984(null));
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$1 */
    static final class C128951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C128951(Continuation<? super C128951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisHubDuxo.this.new C128951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo = CryptoCostBasisHubDuxo.this;
            cryptoCostBasisHubDuxo.withDataState(new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CryptoCostBasisHubDuxo.C128951.invokeSuspend$lambda$1(cryptoCostBasisHubDuxo, (CryptoCostBasisHubDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubDataState cryptoCostBasisHubDataState) {
            CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo2;
            for (CryptoCostBasisHubSection cryptoCostBasisHubSection : CryptoCostBasisHubSection.getEntries()) {
                if (cryptoCostBasisHubDuxo.needsInitialLoad(cryptoCostBasisHubDataState, cryptoCostBasisHubSection)) {
                    cryptoCostBasisHubDuxo2 = cryptoCostBasisHubDuxo;
                    try {
                        CryptoCostBasisHubDuxo.load$default(cryptoCostBasisHubDuxo2, cryptoCostBasisHubSection, 5, false, 4, null);
                    } catch (Throwable th) {
                        cryptoCostBasisHubDuxo2.submit(new CryptoCostBasisHubEvent.Error(th));
                    }
                } else {
                    cryptoCostBasisHubDuxo2 = cryptoCostBasisHubDuxo;
                }
                cryptoCostBasisHubDuxo = cryptoCostBasisHubDuxo2;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$2", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$2 */
    static final class C128962 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C128962(Continuation<? super C128962> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisHubDuxo.this.new C128962(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisHubDuxo.this.refreshConfirmedSection();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$3", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$3 */
    static final class C128973 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C128973(Continuation<? super C128973> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisHubDuxo.this.new C128973(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128973) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C128973 c128973;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = CryptoCostBasisHubDuxo.this.staticContentStore;
                    this.label = 1;
                    c128973 = this;
                    try {
                        obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CryptoCostBasisHubDuxo.CONTENTFUL_ID_2025_DEPOSITS, null, c128973, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c128973 = this;
                }
                CryptoCostBasisHubDuxo.this.applyMutation(new AnonymousClass1((EntryResource) obj, null));
            } catch (Throwable unused2) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$3$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
            final /* synthetic */ EntryResource<OtherMarkdown> $soldIn2025Banner;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EntryResource<OtherMarkdown> entryResource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$soldIn2025Banner = entryResource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$soldIn2025Banner, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSection2025Sold(), null, null, null, false, null, null, this.$soldIn2025Banner.getValue(), 63, null), null, null, 6, null);
            }
        }
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$4", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$4 */
    static final class C128984 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C128984(Continuation<? super C128984> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisHubDuxo.this.new C128984(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128984) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C128984 c128984;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = CryptoCostBasisHubDuxo.this.staticContentStore;
                    this.label = 1;
                    c128984 = this;
                    try {
                        obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CryptoCostBasisHubDuxo.CONTENTFUL_ID_MISSING_DETAILS, null, c128984, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c128984 = this;
                }
                CryptoCostBasisHubDuxo.this.applyMutation(new AnonymousClass1((EntryResource) obj, null));
            } catch (Throwable unused2) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$4$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
            final /* synthetic */ EntryResource<OtherMarkdown> $missingDetailsBanner;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EntryResource<OtherMarkdown> entryResource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$missingDetailsBanner = entryResource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$missingDetailsBanner, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSectionMissingDetails(), null, null, null, false, null, null, this.$missingDetailsBanner.getValue(), 63, null), null, 5, null);
            }
        }
    }

    public static /* synthetic */ void load$default(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection cryptoCostBasisHubSection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        cryptoCostBasisHubDuxo.load(cryptoCostBasisHubSection, i, z);
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$1 */
    static final class C128931 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
        final /* synthetic */ CryptoCostBasisHubSection $section;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoCostBasisHubDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoCostBasisHubSection.values().length];
                try {
                    iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128931(CryptoCostBasisHubSection cryptoCostBasisHubSection, Continuation<? super C128931> continuation) {
            super(2, continuation);
            this.$section = cryptoCostBasisHubSection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128931 c128931 = new C128931(this.$section, continuation);
            c128931.L$0 = obj;
            return c128931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
            return ((C128931) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[this.$section.ordinal()];
            if (i == 1) {
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSection2025Sold(), null, null, null, false, null, null, null, 71, null), null, null, 6, null);
            }
            if (i == 2) {
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSectionMissingDetails(), null, null, null, false, null, null, null, 71, null), null, 5, null);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, null, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSectionConfirmed(), null, null, null, false, null, null, null, 71, null), 3, null);
        }
    }

    public final void load(final CryptoCostBasisHubSection section, final int limit, final boolean reset) {
        Intrinsics.checkNotNullParameter(section, "section");
        if (reset) {
            applyMutation(new C128931(section, null));
        }
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisHubDuxo.load$lambda$0(reset, this, section, limit, (CryptoCostBasisHubDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$lambda$0(boolean z, CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection cryptoCostBasisHubSection, int i, CryptoCostBasisHubDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (!z && (cryptoCostBasisHubDuxo.isLoadingMore(dataState, cryptoCostBasisHubSection) || cryptoCostBasisHubDuxo.hasFetchedAll(dataState, cryptoCostBasisHubSection))) {
            return Unit.INSTANCE;
        }
        cryptoCostBasisHubDuxo.applyMutation(new CryptoCostBasisHubDuxo2(cryptoCostBasisHubSection, null));
        BuildersKt__Builders_commonKt.launch$default(cryptoCostBasisHubDuxo.getLifecycleScope(), null, null, new CryptoCostBasisHubDuxo3(cryptoCostBasisHubDuxo, cryptoCostBasisHubSection, z, dataState, i, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshRow$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshRow$1 */
    static final class C128991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CostBasisRow $row;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128991(CostBasisRow costBasisRow, Continuation<? super C128991> continuation) {
            super(2, continuation);
            this.$row = costBasisRow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisHubDuxo.this.new C128991(this.$row, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoCostBasisStore cryptoCostBasisStore = CryptoCostBasisHubDuxo.this.cryptoCostBasisStore;
                    UUID uuid = StringsKt.toUuid(this.$row.getAccountId());
                    UUID uuid2 = StringsKt.toUuid(this.$row.getId());
                    this.label = 1;
                    obj = cryptoCostBasisStore.fetchUiCostBasisDetails(uuid, uuid2, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoCostBasisHubDuxo.this.applyMutation(new AnonymousClass1((UiCostBasisDetails) obj, null));
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    CryptoCostBasisHubDuxo.this.submit(new CryptoCostBasisHubEvent.Error(th));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshRow$1$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshRow$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
            final /* synthetic */ UiCostBasisDetails $details;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiCostBasisDetails uiCostBasisDetails, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$details = uiCostBasisDetails;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$details, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
                return cryptoCostBasisHubDataState.copy(CryptoCostBasisHubDataState3.updateRowIfExists(cryptoCostBasisHubDataState.getSection2025Sold(), this.$details), CryptoCostBasisHubDataState3.updateRowIfExists(cryptoCostBasisHubDataState.getSectionMissingDetails(), this.$details), CryptoCostBasisHubDataState3.updateRowIfExists(cryptoCostBasisHubDataState.getSectionConfirmed(), this.$details));
            }
        }
    }

    public final void refreshRow(CostBasisRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C128991(row, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshConfirmedSection() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisHubDuxo.refreshConfirmedSection$lambda$1(this.f$0, (CryptoCostBasisHubDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshConfirmedSection$lambda$1(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(cryptoCostBasisHubDuxo.getLifecycleScope(), null, null, new CryptoCostBasisHubDuxo4(dataState, cryptoCostBasisHubDuxo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String cursor(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubSection cryptoCostBasisHubSection) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoCostBasisHubSection.ordinal()];
        if (i == 1) {
            return cryptoCostBasisHubDataState.getSection2025Sold().getCursor$feature_crypto_cost_basis_externalDebug();
        }
        if (i == 2) {
            return cryptoCostBasisHubDataState.getSectionMissingDetails().getCursor$feature_crypto_cost_basis_externalDebug();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return cryptoCostBasisHubDataState.getSectionConfirmed().getCursor$feature_crypto_cost_basis_externalDebug();
    }

    private final boolean isLoadingMore(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubSection cryptoCostBasisHubSection) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoCostBasisHubSection.ordinal()];
        if (i == 1) {
            return cryptoCostBasisHubDataState.getSection2025Sold().isLoadingMore$feature_crypto_cost_basis_externalDebug();
        }
        if (i == 2) {
            return cryptoCostBasisHubDataState.getSectionMissingDetails().isLoadingMore$feature_crypto_cost_basis_externalDebug();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return cryptoCostBasisHubDataState.getSectionConfirmed().isLoadingMore$feature_crypto_cost_basis_externalDebug();
    }

    private final boolean hasFetchedAll(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubSection cryptoCostBasisHubSection) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoCostBasisHubSection.ordinal()];
        if (i == 1) {
            return Intrinsics.areEqual(cryptoCostBasisHubDataState.getSection2025Sold().getHasFetchedAll$feature_crypto_cost_basis_externalDebug(), Boolean.TRUE);
        }
        if (i == 2) {
            return Intrinsics.areEqual(cryptoCostBasisHubDataState.getSectionMissingDetails().getHasFetchedAll$feature_crypto_cost_basis_externalDebug(), Boolean.TRUE);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Intrinsics.areEqual(cryptoCostBasisHubDataState.getSectionConfirmed().getHasFetchedAll$feature_crypto_cost_basis_externalDebug(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needsInitialLoad(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubSection cryptoCostBasisHubSection) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoCostBasisHubSection.ordinal()];
        if (i == 1) {
            return cryptoCostBasisHubDataState.getSection2025Sold().getDetails$feature_crypto_cost_basis_externalDebug() == null;
        }
        if (i == 2) {
            return cryptoCostBasisHubDataState.getSectionMissingDetails().getDetails$feature_crypto_cost_basis_externalDebug() == null;
        }
        if (i == 3) {
            return cryptoCostBasisHubDataState.getSectionConfirmed().getDetails$feature_crypto_cost_basis_externalDebug() == null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisHubFragmentKey;", "<init>", "()V", "FIRST_PAGE_SIZE", "", "SUBSEQUENT_PAGE_SIZE", "MAX_PAGE_REFRESH", "CONTENTFUL_ID_2025_DEPOSITS", "", "CONTENTFUL_ID_MISSING_DETAILS", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoCostBasisHubDuxo, CryptoCostBasisHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoCostBasisHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoCostBasisHubFragmentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoCostBasisHubFragmentKey getArgs(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo) {
            return (CryptoCostBasisHubFragmentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoCostBasisHubDuxo);
        }
    }
}
