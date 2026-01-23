package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.api.ApiOptionTooltip6;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionTooltipStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bJ \u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001aJ \u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001aJ \u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u000f\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "Lcom/robinhood/store/Store;", "optionsProductApi", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/optionsproduct/OptionsProduct;Lcom/robinhood/store/StoreBundle;)V", "getOptionStrategyBuilderTooltipEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Triple;", "", "Lcom/robinhood/models/api/OptionTooltipLocationItem;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/OptionTooltip;", "getOptionChainTooltipEndpoint", "Lkotlin/Pair;", "getOptionDetailPageTooltipEndpoint", "getOptionSimulatedReturnTooltipEndpoint", "recordOptionTooltipSeen", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "receiptId", "accountNumber", "getOptionStrategyBuilderNavBarSettingsTooltip", "strategyId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionChainNavBarSettingsTooltip", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionSimulatedReturnSliderTooltip", "symbol", "getOptionSimulatedReturnInfoButtonTooltip", "getOptionDetailPageProjectedReturnTooltip", "source", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionTooltipStore extends Store {
    private final Endpoint<Tuples2<ApiOptionTooltip6, String>, Optional<OptionTooltip>> getOptionChainTooltipEndpoint;
    private final Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> getOptionDetailPageTooltipEndpoint;
    private final Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> getOptionSimulatedReturnTooltipEndpoint;
    private final Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> getOptionStrategyBuilderTooltipEndpoint;
    private final OptionsProduct optionsProductApi;
    private final PostEndpoint<Tuples2<String, String>, Unit> recordOptionTooltipSeen;

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore", m3645f = "OptionTooltipStore.kt", m3646l = {106}, m3647m = "getOptionChainNavBarSettingsTooltip")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionChainNavBarSettingsTooltip$1 */
    static final class C341441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341441(Continuation<? super C341441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionTooltipStore.this.getOptionChainNavBarSettingsTooltip(null, this);
        }
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore", m3645f = "OptionTooltipStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "getOptionDetailPageProjectedReturnTooltip")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionDetailPageProjectedReturnTooltip$1 */
    static final class C341451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341451(Continuation<? super C341451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionTooltipStore.this.getOptionDetailPageProjectedReturnTooltip(null, null, this);
        }
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore", m3645f = "OptionTooltipStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "getOptionSimulatedReturnInfoButtonTooltip")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionSimulatedReturnInfoButtonTooltip$1 */
    static final class C341461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341461(Continuation<? super C341461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionTooltipStore.this.getOptionSimulatedReturnInfoButtonTooltip(null, null, this);
        }
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore", m3645f = "OptionTooltipStore.kt", m3646l = {115}, m3647m = "getOptionSimulatedReturnSliderTooltip")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionSimulatedReturnSliderTooltip$1 */
    static final class C341471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341471(Continuation<? super C341471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionTooltipStore.this.getOptionSimulatedReturnSliderTooltip(null, null, this);
        }
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore", m3645f = "OptionTooltipStore.kt", m3646l = {98}, m3647m = "getOptionStrategyBuilderNavBarSettingsTooltip")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$getOptionStrategyBuilderNavBarSettingsTooltip$1 */
    static final class C341481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341481(Continuation<? super C341481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionTooltipStore.this.getOptionStrategyBuilderNavBarSettingsTooltip(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionTooltipStore(OptionsProduct optionsProductApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsProductApi = optionsProductApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getOptionStrategyBuilderTooltipEndpoint = Endpoint.Companion.create$default(companion, new OptionTooltipStore8(this, null), getLogoutKillswitch(), new OptionTooltipStore9(null), storeBundle.getClock(), null, 16, null);
        this.getOptionChainTooltipEndpoint = Endpoint.Companion.create$default(companion, new OptionTooltipStore2(this, null), getLogoutKillswitch(), new OptionTooltipStore3(null), storeBundle.getClock(), null, 16, null);
        this.getOptionDetailPageTooltipEndpoint = Endpoint.Companion.create$default(companion, new OptionTooltipStore4(this, null), getLogoutKillswitch(), new OptionTooltipStore5(null), storeBundle.getClock(), null, 16, null);
        this.getOptionSimulatedReturnTooltipEndpoint = Endpoint.Companion.create$default(companion, new OptionTooltipStore6(this, null), getLogoutKillswitch(), new OptionTooltipStore7(null), storeBundle.getClock(), null, 16, null);
        this.recordOptionTooltipSeen = PostEndpoint.INSTANCE.create(new C341491(null), new C341502(null));
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$1", m3645f = "OptionTooltipStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$1 */
    static final class C341491 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C341491(Continuation<? super C341491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341491 c341491 = OptionTooltipStore.this.new C341491(continuation);
            c341491.L$0 = obj;
            return c341491;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<String, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C341491) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                String str = (String) tuples2.component1();
                String str2 = (String) tuples2.component2();
                OptionsProduct optionsProduct = OptionTooltipStore.this.optionsProductApi;
                this.label = 1;
                if (optionsProduct.postOptionTooltipSeen(str, str2, this) == coroutine_suspended) {
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

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$2", m3645f = "OptionTooltipStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$2 */
    static final class C341502 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C341502(Continuation<? super C341502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C341502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C341502) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionTooltipStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$3", m3645f = "OptionTooltipStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionTooltipStore$recordOptionTooltipSeen$3 */
    static final class C341513 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $receiptId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341513(String str, String str2, Continuation<? super C341513> continuation) {
            super(2, continuation);
            this.$receiptId = str;
            this.$accountNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionTooltipStore.this.new C341513(this.$receiptId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341513) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OptionTooltipStore.this.recordOptionTooltipSeen;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$receiptId, this.$accountNumber);
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null) == coroutine_suspended) {
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

    public final void recordOptionTooltipSeen(String receiptId, String accountNumber) {
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C341513(receiptId, accountNumber, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionStrategyBuilderNavBarSettingsTooltip(String str, String str2, Continuation<? super OptionTooltip> continuation) {
        C341481 c341481;
        if (continuation instanceof C341481) {
            c341481 = (C341481) continuation;
            int i = c341481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341481.label = i - Integer.MIN_VALUE;
            } else {
                c341481 = new C341481(continuation);
            }
        }
        C341481 c3414812 = c341481;
        Object objForceFetch$default = c3414812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3414812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> endpoint = this.getOptionStrategyBuilderTooltipEndpoint;
            Tuples3 tuples3 = new Tuples3(str, ApiOptionTooltip6.NAV_BAR_SETTINGS_BUTTON, str2);
            c3414812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples3, null, c3414812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Optional) objForceFetch$default).getOrNull();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionChainNavBarSettingsTooltip(String str, Continuation<? super OptionTooltip> continuation) {
        C341441 c341441;
        if (continuation instanceof C341441) {
            c341441 = (C341441) continuation;
            int i = c341441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341441.label = i - Integer.MIN_VALUE;
            } else {
                c341441 = new C341441(continuation);
            }
        }
        C341441 c3414412 = c341441;
        Object objForceFetch$default = c3414412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3414412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples2<ApiOptionTooltip6, String>, Optional<OptionTooltip>> endpoint = this.getOptionChainTooltipEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(ApiOptionTooltip6.NAV_BAR_SETTINGS_BUTTON, str);
            c3414412.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, c3414412, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Optional) objForceFetch$default).getOrNull();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionSimulatedReturnSliderTooltip(String str, String str2, Continuation<? super OptionTooltip> continuation) {
        C341471 c341471;
        if (continuation instanceof C341471) {
            c341471 = (C341471) continuation;
            int i = c341471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341471.label = i - Integer.MIN_VALUE;
            } else {
                c341471 = new C341471(continuation);
            }
        }
        C341471 c3414712 = c341471;
        Object objForceFetch$default = c3414712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3414712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> endpoint = this.getOptionSimulatedReturnTooltipEndpoint;
            Tuples3 tuples3 = new Tuples3(str, ApiOptionTooltip6.ABOVE_EQUITY_PRICE_SCROLLER, str2);
            c3414712.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples3, null, c3414712, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Optional) objForceFetch$default).getOrNull();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionSimulatedReturnInfoButtonTooltip(String str, String str2, Continuation<? super OptionTooltip> continuation) {
        C341461 c341461;
        if (continuation instanceof C341461) {
            c341461 = (C341461) continuation;
            int i = c341461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341461.label = i - Integer.MIN_VALUE;
            } else {
                c341461 = new C341461(continuation);
            }
        }
        C341461 c3414612 = c341461;
        Object objForceFetch$default = c3414612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3414612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> endpoint = this.getOptionSimulatedReturnTooltipEndpoint;
            Tuples3 tuples3 = new Tuples3(str, ApiOptionTooltip6.INFO_BUTTON, str2);
            c3414612.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples3, null, c3414612, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Optional) objForceFetch$default).getOrNull();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionDetailPageProjectedReturnTooltip(String str, String str2, Continuation<? super OptionTooltip> continuation) {
        C341451 c341451;
        if (continuation instanceof C341451) {
            c341451 = (C341451) continuation;
            int i = c341451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341451.label = i - Integer.MIN_VALUE;
            } else {
                c341451 = new C341451(continuation);
            }
        }
        C341451 c3414512 = c341451;
        Object objForceFetch$default = c3414512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3414512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples3<String, ApiOptionTooltip6, String>, Optional<OptionTooltip>> endpoint = this.getOptionDetailPageTooltipEndpoint;
            Tuples3 tuples3 = new Tuples3(str, ApiOptionTooltip6.SIMULATED_RETURNS_BUTTON, str2);
            c3414512.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples3, null, c3414512, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Optional) objForceFetch$default).getOrNull();
    }
}
