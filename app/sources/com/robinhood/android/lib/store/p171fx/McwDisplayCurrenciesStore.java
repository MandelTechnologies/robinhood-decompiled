package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao;
import com.robinhood.android.lib.p166fx.provider.McwDisplayCurrenciesProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.mcw_fx_rates.proto.p499v1.GetFxRatesRequestDto;
import microgram.contracts.mcw_fx_rates.proto.p499v1.McwFxRatesService;

/* compiled from: McwDisplayCurrenciesStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/McwDisplayCurrenciesStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "dao", "Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao;", "microgramFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/store/StoreBundle;)V", "mcwFxRatesService", "Lmicrogram/contracts/mcw_fx_rates/proto/v1/McwFxRatesService;", "mcwFxRatesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lmicrogram/contracts/mcw_fx_rates/proto/v1/GetFxRatesRequestDto;", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "fetchMcwDisplayCurrencies", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class McwDisplayCurrenciesStore extends Store implements McwDisplayCurrenciesProvider {
    private final McwDisplayCurrenciesDao dao;
    private final Endpoint<GetFxRatesRequestDto, McwDisplayCurrencies> mcwFxRatesEndpoint;
    private final McwFxRatesService mcwFxRatesService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McwDisplayCurrenciesStore(McwDisplayCurrenciesDao dao, MicrogramComponent.Factory microgramFactory, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(microgramFactory, "microgramFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.mcwFxRatesService = (McwFxRatesService) MicrogramComponent.Factory.DefaultImpls.create$default(microgramFactory, getStoreScope(), new RemoteMicrogramApplication("app-mcw-fx-rates", null, 2, null), null, 4, null).getServiceLocator().getClient(McwFxRatesService.class);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        McwDisplayCurrenciesStore2 mcwDisplayCurrenciesStore2 = new McwDisplayCurrenciesStore2(dao);
        this.mcwFxRatesEndpoint = Endpoint.Companion.create$default(companion, new McwDisplayCurrenciesStore3(this, null), getLogoutKillswitch(), mcwDisplayCurrenciesStore2, storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object mcwFxRatesEndpoint$insert(McwDisplayCurrenciesDao mcwDisplayCurrenciesDao, McwDisplayCurrencies mcwDisplayCurrencies, Continuation continuation) {
        mcwDisplayCurrenciesDao.insert(mcwDisplayCurrencies);
        return Unit.INSTANCE;
    }

    /* compiled from: McwDisplayCurrenciesStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.McwDisplayCurrenciesStore$fetchMcwDisplayCurrencies$1", m3645f = "McwDisplayCurrenciesStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.fx.McwDisplayCurrenciesStore$fetchMcwDisplayCurrencies$1 */
    static final class C205711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205711(String str, Continuation<? super C205711> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return McwDisplayCurrenciesStore.this.new C205711(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C205711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = McwDisplayCurrenciesStore.this.mcwFxRatesEndpoint;
                GetFxRatesRequestDto getFxRatesRequestDto = new GetFxRatesRequestDto(this.$accountNumber);
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, getFxRatesRequestDto, null, this, 2, null) == coroutine_suspended) {
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

    @Override // com.robinhood.android.lib.p166fx.provider.McwDisplayCurrenciesProvider
    public Flow<McwDisplayCurrencies> fetchMcwDisplayCurrencies(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C205711(accountNumber, null), 3, null);
        return this.dao.streamMcwDisplayCurrencies();
    }
}
