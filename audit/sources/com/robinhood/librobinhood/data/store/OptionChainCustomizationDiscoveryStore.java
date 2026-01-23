package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.api.ApiIacAlertSheet;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: OptionChainCustomizationDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0015\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "optionsProductApi", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/android/api/optionsproduct/OptionsProduct;Lcom/robinhood/store/StoreBundle;)V", "iacAlertSheetForInvestingOptionChainEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint", "", "iacAlertSheetForInvestingOptionBuilderEndpoint", "", "recordOptionUserContextSeen", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/OptionSeenContext;", "getRecordOptionUserContextSeen", "()Lcom/robinhood/android/moria/network/PostEndpoint;", "getIacAlertSheetForInvestingOptionChain", "Lcom/robinhood/models/ui/IacAlertSheet;", "optionChainId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlertSheetForInvestingOptionChainCustomizationGtm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIacAlertSheetForInvestingOptionBuilder", "strategyId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionChainCustomizationDiscoveryStore extends Store {
    private final OptionsBonfireApi bonfireApi;
    private final Endpoint<String, Response<ApiIacAlertSheetResponse>> iacAlertSheetForInvestingOptionBuilderEndpoint;
    private final Endpoint<Unit, Response<ApiIacAlertSheetResponse>> iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint;
    private final Endpoint<UUID, Response<ApiIacAlertSheetResponse>> iacAlertSheetForInvestingOptionChainEndpoint;
    private final OptionsProduct optionsProductApi;
    private final PostEndpoint<Tuples2<OptionSeenContext, String>, Unit> recordOptionUserContextSeen;

    /* compiled from: OptionChainCustomizationDiscoveryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore", m3645f = "OptionChainCustomizationDiscoveryStore.kt", m3646l = {79}, m3647m = "getAlertSheetForInvestingOptionChainCustomizationGtm")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$getAlertSheetForInvestingOptionChainCustomizationGtm$1 */
    static final class C339891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C339891(Continuation<? super C339891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionChainCustomizationDiscoveryStore.this.getAlertSheetForInvestingOptionChainCustomizationGtm(this);
        }
    }

    /* compiled from: OptionChainCustomizationDiscoveryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore", m3645f = "OptionChainCustomizationDiscoveryStore.kt", m3646l = {86}, m3647m = "getIacAlertSheetForInvestingOptionBuilder")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$getIacAlertSheetForInvestingOptionBuilder$1 */
    static final class C339901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C339901(Continuation<? super C339901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionChainCustomizationDiscoveryStore.this.getIacAlertSheetForInvestingOptionBuilder(null, this);
        }
    }

    /* compiled from: OptionChainCustomizationDiscoveryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore", m3645f = "OptionChainCustomizationDiscoveryStore.kt", m3646l = {70}, m3647m = "getIacAlertSheetForInvestingOptionChain")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$getIacAlertSheetForInvestingOptionChain$1 */
    static final class C339911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C339911(Continuation<? super C339911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionChainCustomizationDiscoveryStore.this.getIacAlertSheetForInvestingOptionChain(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainCustomizationDiscoveryStore(OptionsBonfireApi bonfireApi, OptionsProduct optionsProductApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.optionsProductApi = optionsProductApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.iacAlertSheetForInvestingOptionChainEndpoint = Endpoint.Companion.create$default(companion, new OptionChainCustomizationDiscoveryStore6(this, null), getLogoutKillswitch(), new OptionChainCustomizationDiscoveryStore7(null), storeBundle.getClock(), null, 16, null);
        this.iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint = Endpoint.Companion.create$default(companion, new OptionChainCustomizationDiscoveryStore4(this, null), getLogoutKillswitch(), new OptionChainCustomizationDiscoveryStore5(null), storeBundle.getClock(), null, 16, null);
        this.iacAlertSheetForInvestingOptionBuilderEndpoint = Endpoint.Companion.create$default(companion, new OptionChainCustomizationDiscoveryStore2(this, null), getLogoutKillswitch(), new OptionChainCustomizationDiscoveryStore3(null), storeBundle.getClock(), null, 16, null);
        this.recordOptionUserContextSeen = PostEndpoint.INSTANCE.create(new OptionChainCustomizationDiscoveryStore8(this, null), new OptionChainCustomizationDiscoveryStore9(null));
    }

    public final PostEndpoint<Tuples2<OptionSeenContext, String>, Unit> getRecordOptionUserContextSeen() {
        return this.recordOptionUserContextSeen;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIacAlertSheetForInvestingOptionChain(UUID uuid, Continuation<? super IacAlertSheet> continuation) {
        C339911 c339911;
        ApiIacAlertSheet alert_sheet;
        if (continuation instanceof C339911) {
            c339911 = (C339911) continuation;
            int i = c339911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339911.label = i - Integer.MIN_VALUE;
            } else {
                c339911 = new C339911(continuation);
            }
        }
        C339911 c3399112 = c339911;
        Object objForceFetch$default = c3399112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3399112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, Response<ApiIacAlertSheetResponse>> endpoint = this.iacAlertSheetForInvestingOptionChainEndpoint;
            c3399112.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c3399112, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiIacAlertSheetResponse apiIacAlertSheetResponse = (ApiIacAlertSheetResponse) ((Response) objForceFetch$default).body();
        if (apiIacAlertSheetResponse == null || (alert_sheet = apiIacAlertSheetResponse.getAlert_sheet()) == null) {
            return null;
        }
        return alert_sheet.toUiModel(IacAlertSheetLocation.INVESTING_OPTION_CHAIN);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAlertSheetForInvestingOptionChainCustomizationGtm(Continuation<? super IacAlertSheet> continuation) {
        C339891 c339891;
        ApiIacAlertSheet alert_sheet;
        if (continuation instanceof C339891) {
            c339891 = (C339891) continuation;
            int i = c339891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339891.label = i - Integer.MIN_VALUE;
            } else {
                c339891 = new C339891(continuation);
            }
        }
        C339891 c3398912 = c339891;
        Object objForceFetch$default = c3398912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3398912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, Response<ApiIacAlertSheetResponse>> endpoint = this.iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint;
            Unit unit = Unit.INSTANCE;
            c3398912.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c3398912, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiIacAlertSheetResponse apiIacAlertSheetResponse = (ApiIacAlertSheetResponse) ((Response) objForceFetch$default).body();
        if (apiIacAlertSheetResponse == null || (alert_sheet = apiIacAlertSheetResponse.getAlert_sheet()) == null) {
            return null;
        }
        return alert_sheet.toUiModel(IacAlertSheetLocation.INVESTING_OPTION_CHAIN_CUSTOMIZATION_GTM);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIacAlertSheetForInvestingOptionBuilder(String str, Continuation<? super IacAlertSheet> continuation) {
        C339901 c339901;
        ApiIacAlertSheet alert_sheet;
        if (continuation instanceof C339901) {
            c339901 = (C339901) continuation;
            int i = c339901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339901.label = i - Integer.MIN_VALUE;
            } else {
                c339901 = new C339901(continuation);
            }
        }
        C339901 c3399012 = c339901;
        Object objForceFetch$default = c3399012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3399012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, Response<ApiIacAlertSheetResponse>> endpoint = this.iacAlertSheetForInvestingOptionBuilderEndpoint;
            c3399012.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3399012, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiIacAlertSheetResponse apiIacAlertSheetResponse = (ApiIacAlertSheetResponse) ((Response) objForceFetch$default).body();
        if (apiIacAlertSheetResponse == null || (alert_sheet = apiIacAlertSheetResponse.getAlert_sheet()) == null) {
            return null;
        }
        return alert_sheet.toUiModel(IacAlertSheetLocation.INVESTING_OPTION_CHAIN_BUILDER);
    }
}
