package com.robinhood.iac.alertsheet;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.models.api.ApiIacAlertSheet;
import com.robinhood.models.api.ApiIacAlertSheetActionRequest;
import com.robinhood.models.api.ApiIacAlertSheetDismissRequest;
import com.robinhood.models.api.ApiIacAlertSheetRequest;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.serverdriven.api.ApiRichText;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.HttpCall;
import com.robinhood.rosetta.eventlogging.HttpCallData;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.api.iac.IacAlertSheetApi;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okhttp3.ResponseBody;
import p479j$.time.Duration;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: IacAlertSheetStore.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJL\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007JJ\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002J*\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002J\u0016\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "Lcom/robinhood/store/Store;", "iacAlertSheetApi", "Lcom/robinhood/shared/api/iac/IacAlertSheetApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/api/iac/IacAlertSheetApi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiIacAlertSheetRequest;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "pollForIacBottomSheet", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/IacAlertSheet;", "location", "Lcom/robinhood/models/db/IacAlertSheetLocation;", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "optionChainId", "optionStrategyId", "", "logAlertSheetGetCall", "", "response", "logNetworkCall", "url", "method", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "postItemAction", "actionRequest", "Lcom/robinhood/models/api/ApiIacAlertSheetActionRequest;", "(Lcom/robinhood/models/api/ApiIacAlertSheetActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postItemSeen", "id", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postItemDismissed", "dismissRequest", "Lcom/robinhood/models/api/ApiIacAlertSheetDismissRequest;", "(Lcom/robinhood/models/api/ApiIacAlertSheetDismissRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IacAlertSheetStore extends Store {
    public static final int $stable = 8;
    private final AppType appType;
    private final Endpoint<ApiIacAlertSheetRequest, Response<ApiIacAlertSheetResponse>> endpoint;
    private final EventLogger eventLogger;
    private final IacAlertSheetApi iacAlertSheetApi;
    private final TargetBackend targetBackend;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacAlertSheetStore(IacAlertSheetApi iacAlertSheetApi, EventLogger eventLogger, TargetBackend targetBackend, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(iacAlertSheetApi, "iacAlertSheetApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.iacAlertSheetApi = iacAlertSheetApi;
        this.eventLogger = eventLogger;
        this.targetBackend = targetBackend;
        this.appType = appType;
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new IacAlertSheetStore2(this, null), getLogoutKillswitch(), new IacAlertSheetStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Observable pollForIacBottomSheet$default(IacAlertSheetStore iacAlertSheetStore, IacAlertSheetLocation iacAlertSheetLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return iacAlertSheetStore.pollForIacBottomSheet(iacAlertSheetLocation, uuid, uuid2, uuid3, str);
    }

    @Deprecated
    public final Observable<Optional<IacAlertSheet>> pollForIacBottomSheet(final IacAlertSheetLocation location, final UUID instrumentId, final UUID currencyPairId, final UUID optionChainId, final String optionStrategyId) {
        Intrinsics.checkNotNullParameter(location, "location");
        Endpoint<ApiIacAlertSheetRequest, Response<ApiIacAlertSheetResponse>> endpoint = this.endpoint;
        ApiIacAlertSheetRequest apiIacAlertSheetRequest = new ApiIacAlertSheetRequest(location, instrumentId, currencyPairId, optionChainId, optionStrategyId);
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        Flow flowBackendPoll$default = Endpoint8.backendPoll$default(endpoint, apiIacAlertSheetRequest, durationOfSeconds, null, 4, null);
        if (this.appType != AppType.NCW) {
            Observable<Optional<IacAlertSheet>> observableJust = Observable.just(Optional.INSTANCE.m2972of(null));
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        Observable<Optional<IacAlertSheet>> map = convertToObservable(flowBackendPoll$default).takeUntil(getLogoutKillswitch().getKillswitchObservable()).map(new Function() { // from class: com.robinhood.iac.alertsheet.IacAlertSheetStore.pollForIacBottomSheet.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<IacAlertSheet> apply(Response<ApiIacAlertSheetResponse> response) {
                ApiRichText title;
                String text;
                String receipt_uuid;
                Intrinsics.checkNotNullParameter(response, "response");
                ApiIacAlertSheetResponse apiIacAlertSheetResponseBody = response.body();
                ApiIacAlertSheet alert_sheet = apiIacAlertSheetResponseBody != null ? apiIacAlertSheetResponseBody.getAlert_sheet() : null;
                IacAlertSheet uiModel = alert_sheet != null ? alert_sheet.toUiModel(location) : null;
                this.logAlertSheetGetCall(location, instrumentId, currencyPairId, optionChainId, optionStrategyId, response);
                EventLogger eventLogger = this.eventLogger;
                UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.NETWORK;
                String str = (alert_sheet == null || (receipt_uuid = alert_sheet.getReceipt_uuid()) == null) ? "" : receipt_uuid;
                String str2 = (alert_sheet == null || (title = alert_sheet.getTitle()) == null || (text = title.getText()) == null) ? "" : text;
                String str3 = null;
                String str4 = null;
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, null, null, null, new Context(0, 0, 0, null, null, null, str3, null, 0, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, new InAppComm(str, str2, str3, location.getServerValue(), null, str4, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                return Optional.INSTANCE.m2972of(uiModel);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    static /* synthetic */ void logAlertSheetGetCall$default(IacAlertSheetStore iacAlertSheetStore, IacAlertSheetLocation iacAlertSheetLocation, UUID uuid, UUID uuid2, UUID uuid3, String str, Response response, int i, Object obj) {
        if ((i & 32) != 0) {
            response = null;
        }
        iacAlertSheetStore.logAlertSheetGetCall(iacAlertSheetLocation, uuid, uuid2, uuid3, str, response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAlertSheetGetCall(IacAlertSheetLocation location, UUID instrumentId, UUID currencyPairId, UUID optionChainId, String optionStrategyId, Response<ApiIacAlertSheetResponse> response) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(this.targetBackend.getEndpoint().getBonfireUrl().getUrl()).buildUpon().appendPath("alert-sheet").appendPath("app-comms").appendPath("surface").appendPath("alert-sheet").appendQueryParameter("location", location.toString());
        if (instrumentId != null) {
            builderAppendQueryParameter.appendQueryParameter("instrument_id", instrumentId.toString());
        }
        if (currencyPairId != null) {
            builderAppendQueryParameter.appendQueryParameter("currency_pair_id", currencyPairId.toString());
        }
        if (optionChainId != null) {
            builderAppendQueryParameter.appendQueryParameter("option_chain_id", optionChainId.toString());
        }
        if (optionStrategyId != null) {
            builderAppendQueryParameter.appendQueryParameter("strategy_id", optionStrategyId);
        }
        String string2 = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        logNetworkCall(string2, HttpCall.Method.GET, response);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void logNetworkCall$default(IacAlertSheetStore iacAlertSheetStore, String str, HttpCall.Method method, Response response, int i, Object obj) {
        if ((i & 4) != 0) {
            response = null;
        }
        iacAlertSheetStore.logNetworkCall(str, method, response);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logNetworkCall(String url, HttpCall.Method method, Response<ApiIacAlertSheetResponse> response) {
        HttpCall.Response response2;
        EventLogger eventLogger = this.eventLogger;
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        HttpCall.Request request = new HttpCall.Request(method, url, null, 4, null);
        if (response != null) {
            String strMessage = response.message();
            Intrinsics.checkNotNullExpressionValue(strMessage, "message(...)");
            response2 = new HttpCall.Response(null, null, strMessage, response.code(), null, 19, null);
        } else {
            response2 = null;
        }
        ResponseBody responseBodyErrorBody = response != null ? response.errorBody() : null;
        Object[] objArr = 0 == true ? 1 : 0;
        eventLogger.logHttpCall(instantNow, new HttpCallData(new HttpCall(null, request, response2, new HttpCall.Error(null, String.valueOf(responseBodyErrorBody), null, 5, null), objArr, 17, 0 == true ? 1 : 0), 0 == true ? 1 : 0, null, 6, null));
    }

    public final Object postItemAction(ApiIacAlertSheetActionRequest apiIacAlertSheetActionRequest, Continuation<? super Unit> continuation) {
        Object objPostIacBottomSheetTapped = this.iacAlertSheetApi.postIacBottomSheetTapped(apiIacAlertSheetActionRequest.getId(), apiIacAlertSheetActionRequest.getAction(), continuation);
        return objPostIacBottomSheetTapped == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPostIacBottomSheetTapped : Unit.INSTANCE;
    }

    public final Object postItemSeen(UUID uuid, Continuation<? super Unit> continuation) {
        Object objPostIacBottomSheetSeen = this.iacAlertSheetApi.postIacBottomSheetSeen(uuid, continuation);
        return objPostIacBottomSheetSeen == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPostIacBottomSheetSeen : Unit.INSTANCE;
    }

    public final Object postItemDismissed(ApiIacAlertSheetDismissRequest apiIacAlertSheetDismissRequest, Continuation<? super Unit> continuation) {
        Object objPostIacBottomSheetDismissed = this.iacAlertSheetApi.postIacBottomSheetDismissed(apiIacAlertSheetDismissRequest.getId(), apiIacAlertSheetDismissRequest.getMethod(), continuation);
        return objPostIacBottomSheetDismissed == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPostIacBottomSheetDismissed : Unit.INSTANCE;
    }
}
