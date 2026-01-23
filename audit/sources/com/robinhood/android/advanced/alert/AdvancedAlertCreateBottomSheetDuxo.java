package com.robinhood.android.advanced.alert;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetEvent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.librobinhood.data.store.alert.SortingType;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingItemRequest;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.Quote;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u001e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "alertStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "entityId", "Ljava/util/UUID;", "getEntityId", "()Ljava/util/UUID;", "onCreate", "", "createSetting", "settingType", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "enabled", "", "updateSetting", "settingId", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedAlertCreateBottomSheetDuxo extends BaseDuxo5<AdvancedAlertCreateBottomSheetViewState, AdvancedAlertCreateBottomSheetEvent> implements HasSavedState {
    private final AdvancedAlertStore alertStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAlertCreateBottomSheetDuxo(QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, AdvancedAlertStore alertStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new AdvancedAlertCreateBottomSheetViewState(0.0d, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(alertStore, "alertStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.quoteStore = quoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.alertStore = alertStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiAdvancedAlert2 getEntityType() {
        return ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((HasSavedState) this)).getEntityType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getEntityId() {
        return ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((HasSavedState) this)).getEntityId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C83621(null), 3, null);
    }

    /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1", m3645f = "AdvancedAlertCreateBottomSheetDuxo.kt", m3646l = {44, 54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1 */
    static final class C83621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiAdvancedAlert2.values().length];
                try {
                    iArr[ApiAdvancedAlert2.INSTRUMENTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiAdvancedAlert2.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C83621(Continuation<? super C83621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertCreateBottomSheetDuxo.this.new C83621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r3, r9) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r2, r9) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[AdvancedAlertCreateBottomSheetDuxo.this.getEntityType().ordinal()];
                if (i2 == 1) {
                    Flow<Quote> flowAsFlow = AdvancedAlertCreateBottomSheetDuxo.this.quoteStore.getStreamQuote().asFlow(AdvancedAlertCreateBottomSheetDuxo.this.getEntityId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedAlertCreateBottomSheetDuxo.this, null);
                    this.label = 1;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Flow<CryptoQuote> flowAsFlow2 = AdvancedAlertCreateBottomSheetDuxo.this.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(AdvancedAlertCreateBottomSheetDuxo.this.getEntityId(), null, null, 6, null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(AdvancedAlertCreateBottomSheetDuxo.this, null);
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$1", m3645f = "AdvancedAlertCreateBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvancedAlertCreateBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertCreateBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$1$1", m3645f = "AdvancedAlertCreateBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495271 extends ContinuationImpl7 implements Function2<AdvancedAlertCreateBottomSheetViewState, Continuation<? super AdvancedAlertCreateBottomSheetViewState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495271(Quote quote, Continuation<? super C495271> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495271 c495271 = new C495271(this.$quote, continuation);
                    c495271.L$0 = obj;
                    return c495271;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvancedAlertCreateBottomSheetViewState advancedAlertCreateBottomSheetViewState, Continuation<? super AdvancedAlertCreateBottomSheetViewState> continuation) {
                    return ((C495271) create(advancedAlertCreateBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((AdvancedAlertCreateBottomSheetViewState) this.L$0).copy(this.$quote.getLastTradePrice().getDecimalValue().doubleValue());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C495271((Quote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$2", m3645f = "AdvancedAlertCreateBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvancedAlertCreateBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertCreateBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuote cryptoQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$2$1", m3645f = "AdvancedAlertCreateBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvancedAlertCreateBottomSheetViewState, Continuation<? super AdvancedAlertCreateBottomSheetViewState>, Object> {
                final /* synthetic */ CryptoQuote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoQuote cryptoQuote, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$quote = cryptoQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quote, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvancedAlertCreateBottomSheetViewState advancedAlertCreateBottomSheetViewState, Continuation<? super AdvancedAlertCreateBottomSheetViewState> continuation) {
                    return ((AnonymousClass1) create(advancedAlertCreateBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((AdvancedAlertCreateBottomSheetViewState) this.L$0).copy(this.$quote.getMarkPrice().getDecimalValue().doubleValue());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CryptoQuote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void createSetting(String settingType, String price, boolean enabled) {
        Intrinsics.checkNotNullParameter(settingType, "settingType");
        Intrinsics.checkNotNullParameter(price, "price");
        submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(true));
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.createAdvancedAlert(getEntityId(), getEntityType(), true, new ApiCreateAdvancedAlertSettingItemRequest(settingType, price, enabled)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetDuxo.createSetting$lambda$0(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertCreateBottomSheetDuxo.createSetting$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSetting$lambda$0(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo) {
        advancedAlertCreateBottomSheetDuxo.submit(AdvancedAlertCreateBottomSheetEvent.DismissEvent.INSTANCE);
        advancedAlertCreateBottomSheetDuxo.submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSetting$lambda$1(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertCreateBottomSheetDuxo.submit(AdvancedAlertCreateBottomSheetEvent.ErrorEvent.INSTANCE);
        advancedAlertCreateBottomSheetDuxo.submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    public final void updateSetting(String settingId, String price, boolean enabled) {
        Intrinsics.checkNotNullParameter(settingId, "settingId");
        Intrinsics.checkNotNullParameter(price, "price");
        submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(true));
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.updateAdvancedAlert(getEntityId(), getEntityType(), SortingType.SETTING_TYPE, new ApiUpdateAdvancedAlertSettingItemRequest(settingId, price, enabled), true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetDuxo.updateSetting$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertCreateBottomSheetDuxo.updateSetting$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSetting$lambda$2(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo) {
        advancedAlertCreateBottomSheetDuxo.submit(AdvancedAlertCreateBottomSheetEvent.DismissEvent.INSTANCE);
        advancedAlertCreateBottomSheetDuxo.submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSetting$lambda$3(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertCreateBottomSheetDuxo.submit(AdvancedAlertCreateBottomSheetEvent.ErrorEvent.INSTANCE);
        advancedAlertCreateBottomSheetDuxo.submit(new AdvancedAlertCreateBottomSheetEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedAlertCreateBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetDuxo;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetArgs;", "<init>", "()V", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedAlertCreateBottomSheetDuxo, AdvancedAlertCreateBottomSheetArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedAlertCreateBottomSheetArgs getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedAlertCreateBottomSheetArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedAlertCreateBottomSheetArgs getArgs(AdvancedAlertCreateBottomSheetDuxo advancedAlertCreateBottomSheetDuxo) {
            return (AdvancedAlertCreateBottomSheetArgs) DuxoCompanion.DefaultImpls.getArgs(this, advancedAlertCreateBottomSheetDuxo);
        }
    }
}
