package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsSbsBidAskPriceLabelNuxShownPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsSideBySideBidAskPriceLabelTypePref;
import com.robinhood.models.api.ApiOptionSettings;
import com.robinhood.models.dao.OptionSettingsDao;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.LocalDate;

/* compiled from: OptionSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0017J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010'\u001a\u00020\u0017J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0)2\u0006\u0010'\u001a\u00020\u0017J\u0016\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010.\u001a\u00020&J\u0018\u0010\u001f\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\u0010J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u0010J\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001005J\f\u00106\u001a\b\u0012\u0004\u0012\u00020&05J\u0006\u00107\u001a\u00020$J\u001e\u00108\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00172\u0006\u00109\u001a\u00020&H\u0086@¢\u0006\u0002\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00180\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00180\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionSettingsDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "sideBySideBidAskPriceLabelTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "sbsBidAskPriceLabelNuxShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionSettingsDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "getOptionSettings", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiOptionSettings;", "streamOptionSettingsFromAccount", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/OptionSettings;", "setTradeOnExpirationSetting", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/ApiOptionSettings$TradeOnExpirationRequest;", "setDefaultPricingSetting", "Lcom/robinhood/models/api/ApiOptionSettings$DefaultPricingSettingRequest;", "setShortSharesOnOptionEvents", "Lcom/robinhood/models/api/ApiOptionSettings$ShortSharesOnOptionEventsRequest;", "refresh", "", "force", "", "accountNumber", "streamOptionSettings", "Lio/reactivex/Observable;", "streamTradeOnExpirationState", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "toggleFridayTradingCompletable", "Lio/reactivex/Completable;", "newTradeOnExpirationSetting", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getSideBySideBidAskPriceLabelSetting", "setSideBySideBidAskPriceLabelSetting", "type", "streamSideBySideBidAskPriceLabelSetting", "Lkotlinx/coroutines/flow/Flow;", "streamSbsBidAskPriceLabelNuxShown", "setSbsBidAskPriceLabelNuxShown", "toggleShortSelling", "enableShortSelling", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionSettingsStore extends Store {
    private final OptionSettingsDao dao;
    private final Endpoint<String, ApiOptionSettings> getOptionSettings;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionsApi optionsApi;
    private final BooleanPreference sbsBidAskPriceLabelNuxShownPref;
    private final PostEndpoint<ApiOptionSettings.DefaultPricingSettingRequest, ApiOptionSettings> setDefaultPricingSetting;
    private final PostEndpoint<ApiOptionSettings.ShortSharesOnOptionEventsRequest, ApiOptionSettings> setShortSharesOnOptionEvents;
    private final PostEndpoint<ApiOptionSettings.TradeOnExpirationRequest, ApiOptionSettings> setTradeOnExpirationSetting;
    private final EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> sideBySideBidAskPriceLabelTypePref;
    private final Query<String, OptionSettings> streamOptionSettingsFromAccount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSettingsStore(StoreBundle storeBundle, OptionSettingsDao dao, OptionsApi optionsApi, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, @OptionChainSettingsSideBySideBidAskPriceLabelTypePref EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> sideBySideBidAskPriceLabelTypePref, @OptionChainSettingsSbsBidAskPriceLabelNuxShownPref BooleanPreference sbsBidAskPriceLabelNuxShownPref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(sideBySideBidAskPriceLabelTypePref, "sideBySideBidAskPriceLabelTypePref");
        Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelNuxShownPref, "sbsBidAskPriceLabelNuxShownPref");
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.sideBySideBidAskPriceLabelTypePref = sideBySideBidAskPriceLabelTypePref;
        this.sbsBidAskPriceLabelNuxShownPref = sbsBidAskPriceLabelNuxShownPref;
        Endpoint<String, ApiOptionSettings> endpointCreate = Endpoint.INSTANCE.create(new OptionSettingsStore2(optionsApi), getLogoutKillswitch(), new OptionSettingsStore3(dao), storeBundle.getClock(), new DefaultStaleDecider(OptionSettings.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getOptionSettings = endpointCreate;
        this.streamOptionSettingsFromAccount = Store.create$default(this, Query.INSTANCE, "streamOptionSettingsFromAccount", CollectionsKt.listOf(new RefreshEach(new OptionSettingsStore8(endpointCreate))), new OptionSettingsStore9(dao), false, 8, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.setTradeOnExpirationSetting = companion.create(new OptionSettingsStore6(this, null), new OptionSettingsStore7(dao));
        this.setDefaultPricingSetting = companion.create(new C340981(null), new C340992(dao));
        this.setShortSharesOnOptionEvents = companion.create(new OptionSettingsStore4(this, null), new OptionSettingsStore5(dao));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getOptionSettings$insert(OptionSettingsDao optionSettingsDao, ApiOptionSettings apiOptionSettings, Continuation continuation) {
        optionSettingsDao.insert(apiOptionSettings);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object setTradeOnExpirationSetting$insert$0(OptionSettingsDao optionSettingsDao, ApiOptionSettings apiOptionSettings, Continuation continuation) {
        optionSettingsDao.insert(apiOptionSettings);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionSettings;", "it", "Lcom/robinhood/models/api/ApiOptionSettings$DefaultPricingSettingRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSettingsStore$setDefaultPricingSetting$1", m3645f = "OptionSettingsStore.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$setDefaultPricingSetting$1 */
    static final class C340981 extends ContinuationImpl7 implements Function2<ApiOptionSettings.DefaultPricingSettingRequest, Continuation<? super ApiOptionSettings>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340981(Continuation<? super C340981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340981 c340981 = OptionSettingsStore.this.new C340981(continuation);
            c340981.L$0 = obj;
            return c340981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionSettings.DefaultPricingSettingRequest defaultPricingSettingRequest, Continuation<? super ApiOptionSettings> continuation) {
            return ((C340981) create(defaultPricingSettingRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ApiOptionSettings.DefaultPricingSettingRequest defaultPricingSettingRequest = (ApiOptionSettings.DefaultPricingSettingRequest) this.L$0;
            OptionsApi optionsApi = OptionSettingsStore.this.optionsApi;
            String account_number = defaultPricingSettingRequest.getAccount_number();
            this.label = 1;
            Object objSubmitDefaultPricingRequest = optionsApi.submitDefaultPricingRequest(account_number, defaultPricingSettingRequest, this);
            return objSubmitDefaultPricingRequest == coroutine_suspended ? coroutine_suspended : objSubmitDefaultPricingRequest;
        }
    }

    /* compiled from: OptionSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$setDefaultPricingSetting$2 */
    /* synthetic */ class C340992 extends AdaptedFunctionReference implements Function2<ApiOptionSettings, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C340992(Object obj) {
            super(2, obj, OptionSettingsDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiOptionSettings;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionSettings apiOptionSettings, Continuation<? super Unit> continuation) {
            return OptionSettingsStore.setDefaultPricingSetting$insert$1((OptionSettingsDao) this.receiver, apiOptionSettings, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object setDefaultPricingSetting$insert$1(OptionSettingsDao optionSettingsDao, ApiOptionSettings apiOptionSettings, Continuation continuation) {
        optionSettingsDao.insert(apiOptionSettings);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object setShortSharesOnOptionEvents$insert$2(OptionSettingsDao optionSettingsDao, ApiOptionSettings apiOptionSettings, Continuation continuation) {
        optionSettingsDao.insert(apiOptionSettings);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(OptionSettingsStore optionSettingsStore, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        optionSettingsStore.refresh(z, str);
    }

    public final void refresh(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint.DefaultImpls.refresh$default(this.getOptionSettings, accountNumber, force, null, 4, null);
    }

    public final Observable<OptionSettings> streamOptionSettings(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.streamOptionSettingsFromAccount.asObservable(accountNumber);
    }

    public final Observable<OptionSettings.TradingOnExpirationState> streamTradeOnExpirationState(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable map = this.streamOptionSettingsFromAccount.asObservable(accountNumber).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionSettingsStore.streamTradeOnExpirationState.1
            @Override // io.reactivex.functions.Function
            public final OptionSettings.TradingOnExpirationState apply(OptionSettings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTradingOnExpirationState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Completable toggleFridayTradingCompletable(final String accountNumber, final boolean newTradeOnExpirationSetting) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Completable completableSwitchMapCompletable = this.optionMarketHoursStore.streamCurrentOrNextMarketDates().take(1L).switchMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionSettingsStore.toggleFridayTradingCompletable.1

            /* compiled from: OptionSettingsStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSettingsStore$toggleFridayTradingCompletable$1$1", m3645f = "OptionSettingsStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$toggleFridayTradingCompletable$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ boolean $newTradeOnExpirationSetting;
                int label;
                final /* synthetic */ OptionSettingsStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSettingsStore optionSettingsStore, String str, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSettingsStore;
                    this.$accountNumber = str;
                    this.$newTradeOnExpirationSetting = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$accountNumber, this.$newTradeOnExpirationSetting, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    OptionSettings.TradingOnExpirationState tradingOnExpirationState;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PostEndpoint postEndpoint = this.this$0.setTradeOnExpirationSetting;
                        String str = this.$accountNumber;
                        if (this.$newTradeOnExpirationSetting) {
                            tradingOnExpirationState = OptionSettings.TradingOnExpirationState.ENABLED;
                        } else {
                            tradingOnExpirationState = OptionSettings.TradingOnExpirationState.DISABLED;
                        }
                        ApiOptionSettings.TradeOnExpirationRequest tradeOnExpirationRequest = new ApiOptionSettings.TradeOnExpirationRequest(str, tradingOnExpirationState);
                        this.label = 1;
                        if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tradeOnExpirationRequest, null, this, 2, null) == coroutine_suspended) {
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

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final OptionCurrentOrNextMarketDates dates) {
                Intrinsics.checkNotNullParameter(dates, "dates");
                OptionSettingsStore optionSettingsStore = OptionSettingsStore.this;
                Completable completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(optionSettingsStore, null, new AnonymousClass1(optionSettingsStore, accountNumber, newTradeOnExpirationSetting, null), 1, null);
                final OptionSettingsStore optionSettingsStore2 = OptionSettingsStore.this;
                return completableRxCompletable$default.doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.OptionSettingsStore.toggleFridayTradingCompletable.1.2
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        Set<LocalDate> allDates = dates.getAllDates();
                        OptionSettingsStore optionSettingsStore3 = optionSettingsStore2;
                        Iterator<T> it = allDates.iterator();
                        while (it.hasNext()) {
                            optionSettingsStore3.optionInstrumentStore.pingAllOptionInstrumentsOnDate((LocalDate) it.next());
                        }
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        return completableSwitchMapCompletable;
    }

    /* compiled from: OptionSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSettingsStore$setDefaultPricingSetting$3", m3645f = "OptionSettingsStore.kt", m3646l = {131}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$setDefaultPricingSetting$3 */
    static final class C341003 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ OptionSettings.DefaultPricingSetting $defaultPricingSetting;
        int label;
        final /* synthetic */ OptionSettingsStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341003(String str, OptionSettingsStore optionSettingsStore, OptionSettings.DefaultPricingSetting defaultPricingSetting, Continuation<? super C341003> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = optionSettingsStore;
            this.$defaultPricingSetting = defaultPricingSetting;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C341003(this.$accountNumber, this.this$0, this.$defaultPricingSetting, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341003) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow flowBuffer$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$accountNumber;
                if (str != null) {
                    flowBuffer$default = FlowKt.flowOf(str);
                } else {
                    Observable<String> observableTake = this.this$0.optionAccountSwitcherStore.streamActiveAccountNumber().take(1L);
                    Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                    flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableTake), Integer.MAX_VALUE, null, 2, null);
                }
                final OptionSettingsStore optionSettingsStore = this.this$0;
                final OptionSettings.DefaultPricingSetting defaultPricingSetting = this.$defaultPricingSetting;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.librobinhood.data.store.OptionSettingsStore.setDefaultPricingSetting.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str2, Continuation<? super Unit> continuation) {
                        Object objPost$default = PostEndpoint.DefaultImpls.post$default(optionSettingsStore.setDefaultPricingSetting, new ApiOptionSettings.DefaultPricingSettingRequest(str2, defaultPricingSetting), null, continuation, 2, null);
                        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowBuffer$default.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void setDefaultPricingSetting(String accountNumber, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
        Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C341003(accountNumber, this, defaultPricingSetting, null), 3, null);
    }

    public final OptionChainSettingsSideBySideBidAskPriceLabelType getSideBySideBidAskPriceLabelSetting() {
        return (OptionChainSettingsSideBySideBidAskPriceLabelType) this.sideBySideBidAskPriceLabelTypePref.get();
    }

    public final void setSideBySideBidAskPriceLabelSetting(OptionChainSettingsSideBySideBidAskPriceLabelType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.sideBySideBidAskPriceLabelTypePref.set(type2);
    }

    public final Flow<OptionChainSettingsSideBySideBidAskPriceLabelType> streamSideBySideBidAskPriceLabelSetting() {
        Observable observableDistinctUntilChanged = this.sideBySideBidAskPriceLabelTypePref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<Boolean> streamSbsBidAskPriceLabelNuxShown() {
        Observable<Boolean> observableDistinctUntilChanged = this.sbsBidAskPriceLabelNuxShownPref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }

    public final void setSbsBidAskPriceLabelNuxShown() {
        this.sbsBidAskPriceLabelNuxShownPref.set(true);
    }

    public final Object toggleShortSelling(String str, boolean z, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.setShortSharesOnOptionEvents, new ApiOptionSettings.ShortSharesOnOptionEventsRequest(str, z), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }
}
