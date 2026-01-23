package com.robinhood.librobinhood.util;

import android.content.SharedPreferences;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore;
import com.robinhood.models.api.ReferralCode;
import com.robinhood.models.api.ReferrerData;
import com.robinhood.models.api.bonfire.ApiTaxFormResubmissionStatus;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PersistentCacheManager.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 g2\u00020\u0001:\u0002fgB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u000209J \u0010Q\u001a\b\u0012\u0004\u0012\u0002000>2\u0006\u0010R\u001a\u0002092\n\b\u0002\u0010S\u001a\u0004\u0018\u000109J{\u0010T\u001a\b\u0012\u0004\u0012\u0002HU0>\"\b\b\u0000\u0010U*\u00020\u00012\u0006\u0010P\u001a\u0002092\u0006\u0010V\u001a\u00020<2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002HU0X2#\u0010Y\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\b[\u0012\b\bP\u0012\u0004\b\b(\\\u0012\u0006\u0012\u0004\u0018\u0001HU0Z2\u0016\u0010]\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001HU\u0012\u0006\u0012\u0004\u0018\u0001090Z2\b\b\u0002\u0010^\u001a\u00020_J\u0085\u0001\u0010`\u001a\u00020N\"\b\b\u0000\u0010U*\u00020\u00012\f\u0010a\u001a\b\u0012\u0004\u0012\u0002HU0b2\u0006\u0010P\u001a\u0002092\u0006\u0010V\u001a\u00020<2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002HU0X2#\u0010Y\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\b[\u0012\b\bP\u0012\u0004\b\b(\\\u0012\u0006\u0012\u0004\u0018\u0001HU0Z2\u0016\u0010]\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001HU\u0012\u0006\u0012\u0004\u0018\u0001090Z2\b\b\u0002\u0010^\u001a\u00020_H\u0002JJ\u0010c\u001a\u0004\u0018\u0001HU\"\u0004\b\u0000\u0010U2\u0006\u0010P\u001a\u0002092#\u0010Y\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\b[\u0012\b\bP\u0012\u0004\b\b(\\\u0012\u0006\u0012\u0004\u0018\u0001HU0Z2\u0006\u0010d\u001a\u00020<H\u0002¢\u0006\u0002\u0010eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060+X\u0082\u0004¢\u0006\u0002\n\u0000R*\u00107\u001a\u001e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000108j\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0001`:X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010;\u001a\u001e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020<08j\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020<`:X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010=\u001a\b\u0012\u0004\u0012\u00020,0>8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020.0>8F¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u0002020>8F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u0002040>8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u0002060>8F¢\u0006\u0006\u001a\u0004\bJ\u0010BR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u0002090>8F¢\u0006\u0006\u001a\u0004\bL\u0010B¨\u0006h"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "getBonfireApi", "()Lcom/robinhood/api/retrofit/BonfireApi;", "setBonfireApi", "(Lcom/robinhood/api/retrofit/BonfireApi;)V", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getTransfersBonfireApi", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "setTransfersBonfireApi", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "identi", "Lcom/robinhood/api/retrofit/Identi;", "getIdenti", "()Lcom/robinhood/api/retrofit/Identi;", "setIdenti", "(Lcom/robinhood/api/retrofit/Identi;)V", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "getReferralApi", "()Lcom/robinhood/api/referral/ReferralApi;", "setReferralApi", "(Lcom/robinhood/api/referral/ReferralApi;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "referralCodeJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ReferralCode;", "referrerDataJsonAdapter", "Lcom/robinhood/models/api/ReferrerData;", "settingsJsonAdapter", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "trustedContactJsonAdapter", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "taxFormResubmissionStatusJsonAdapter", "Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;", "suggestedAmountsResponseJsonAdapter", "Lcom/robinhood/models/api/bonfire/transfer/ApiSuggestedAmountsResponse;", "cacheMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cacheTimeMap", "", "referralCode", "Lio/reactivex/Observable;", "getReferralCode$annotations", "()V", "getReferralCode", "()Lio/reactivex/Observable;", "symmetricReferrerData", "getSymmetricReferrerData", "trustedContact", "getTrustedContact", "taxFormResubmissionStatus", "getTaxFormResubmissionStatus", "transfersSuggestedAmount", "getTransfersSuggestedAmount", "transfersDynamicPillAmountResponse", "getTransfersDynamicPillAmountResponse", "clear", "", "invalidate", "name", "getSettingsPage", "pageId", "accountNumber", "getValue", "T", "staleTime", "network", "Lio/reactivex/Single;", "fromJson", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "json", "toJson", "exposeNetworkErrors", "", "emitValues", "emitter", "Lio/reactivex/ObservableEmitter;", "getCachedValue", "cachedTime", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;J)Ljava/lang/Object;", "Keys", "Companion", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class PersistentCacheManager {
    private static final String PREF_TIME_SUFFIX = "_updated_at";
    public BonfireApi bonfireApi;
    private final HashMap<String, Object> cacheMap;
    private final HashMap<String, Long> cacheTimeMap;
    public Identi identi;
    public ReferralApi referralApi;
    private final JsonAdapter<ReferralCode> referralCodeJsonAdapter;
    private final JsonAdapter<ReferrerData> referrerDataJsonAdapter;
    public RxFactory rxFactory;
    private final JsonAdapter<ApiSettingsPage> settingsJsonAdapter;
    private final JsonAdapter<ApiSuggestedAmountsResponse> suggestedAmountsResponseJsonAdapter;
    private final JsonAdapter<ApiTaxFormResubmissionStatus> taxFormResubmissionStatusJsonAdapter;
    public TransfersBonfireApi transfersBonfireApi;
    private final JsonAdapter<ApiTrustedContact> trustedContactJsonAdapter;

    @UserPrefs
    public SharedPreferences userPrefs;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_transfersDynamicPillAmountResponse_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_transfersDynamicPillAmountResponse_$lambda$1(String str) {
        return str;
    }

    @Deprecated
    public static /* synthetic */ void getReferralCode$annotations() {
    }

    public PersistentCacheManager(LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        this.referralCodeJsonAdapter = moshi.adapter(new TypeToken<ReferralCode>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$1
        }.getType());
        this.referrerDataJsonAdapter = moshi.adapter(new TypeToken<ReferrerData>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$2
        }.getType());
        this.settingsJsonAdapter = moshi.adapter(new TypeToken<ApiSettingsPage>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$3
        }.getType());
        this.trustedContactJsonAdapter = moshi.adapter(new TypeToken<ApiTrustedContact>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$4
        }.getType());
        this.taxFormResubmissionStatusJsonAdapter = moshi.adapter(new TypeToken<ApiTaxFormResubmissionStatus>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$5
        }.getType());
        this.suggestedAmountsResponseJsonAdapter = moshi.adapter(new TypeToken<ApiSuggestedAmountsResponse>() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$special$$inlined$getAdapter$6
        }.getType());
        this.cacheMap = new HashMap<>();
        this.cacheTimeMap = new HashMap<>();
    }

    public final SharedPreferences getUserPrefs() {
        SharedPreferences sharedPreferences = this.userPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    public final void setUserPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.userPrefs = sharedPreferences;
    }

    public final BonfireApi getBonfireApi() {
        BonfireApi bonfireApi = this.bonfireApi;
        if (bonfireApi != null) {
            return bonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bonfireApi");
        return null;
    }

    public final void setBonfireApi(BonfireApi bonfireApi) {
        Intrinsics.checkNotNullParameter(bonfireApi, "<set-?>");
        this.bonfireApi = bonfireApi;
    }

    public final TransfersBonfireApi getTransfersBonfireApi() {
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        if (transfersBonfireApi != null) {
            return transfersBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersBonfireApi");
        return null;
    }

    public final void setTransfersBonfireApi(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "<set-?>");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    public final Identi getIdenti() {
        Identi identi2 = this.identi;
        if (identi2 != null) {
            return identi2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identi");
        return null;
    }

    public final void setIdenti(Identi identi2) {
        Intrinsics.checkNotNullParameter(identi2, "<set-?>");
        this.identi = identi2;
    }

    public final ReferralApi getReferralApi() {
        ReferralApi referralApi = this.referralApi;
        if (referralApi != null) {
            return referralApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("referralApi");
        return null;
    }

    public final void setReferralApi(ReferralApi referralApi) {
        Intrinsics.checkNotNullParameter(referralApi, "<set-?>");
        this.referralApi = referralApi;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final Observable<ReferralCode> getReferralCode() {
        return getValue$default(this, Keys.REFERRAL_CODE_V2, SlipPostTradeUpsellStore.MIN_PROMPT_GAP_MILLIS, RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$referralCode$1(this, null), 1, null), new PersistentCacheManager$referralCode$2(this.referralCodeJsonAdapter), new PersistentCacheManager$referralCode$3(this.referralCodeJsonAdapter), false, 32, null);
    }

    public final Observable<ReferrerData> getSymmetricReferrerData() {
        return getValue$default(this, Keys.SYMMETRIC_REFERRER_DATA_V2, 0L, RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$symmetricReferrerData$1(this, null), 1, null), new PersistentCacheManager$symmetricReferrerData$2(this.referrerDataJsonAdapter), new PersistentCacheManager$symmetricReferrerData$3(this.referrerDataJsonAdapter), false, 32, null);
    }

    public final Observable<ApiTrustedContact> getTrustedContact() {
        return getValue(Keys.TRUSTED_CONTACT, 0L, RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$trustedContact$1(this, null), 1, null), new PersistentCacheManager$trustedContact$2(this.trustedContactJsonAdapter), new PersistentCacheManager$trustedContact$3(this.trustedContactJsonAdapter), true);
    }

    public final Observable<ApiTaxFormResubmissionStatus> getTaxFormResubmissionStatus() {
        return getValue$default(this, Keys.TAX_FORM_RESUBMISSION_STATUS, Durations.FIVE_MINUTES.toMillis(), RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$taxFormResubmissionStatus$1(this, null), 1, null), new PersistentCacheManager$taxFormResubmissionStatus$2(this.taxFormResubmissionStatusJsonAdapter), new PersistentCacheManager$taxFormResubmissionStatus$3(this.taxFormResubmissionStatusJsonAdapter), false, 32, null);
    }

    public final Observable<ApiSuggestedAmountsResponse> getTransfersSuggestedAmount() {
        return getValue$default(this, Keys.TRANSFERS_SUGGESTED_AMOUNT, Durations.FIVE_MINUTES.toMillis(), RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$transfersSuggestedAmount$1(this, null), 1, null), new PersistentCacheManager$transfersSuggestedAmount$2(this.suggestedAmountsResponseJsonAdapter), new PersistentCacheManager$transfersSuggestedAmount$3(this.suggestedAmountsResponseJsonAdapter), false, 32, null);
    }

    public final Observable<String> getTransfersDynamicPillAmountResponse() {
        return getValue$default(this, Keys.TRANSFERS_DYNAMIC_SUGGESTED_AMOUNT, Durations.FIVE_MINUTES.toMillis(), RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new PersistentCacheManager$transfersDynamicPillAmountResponse$1(this, null), 1, null), new Function1() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersistentCacheManager._get_transfersDynamicPillAmountResponse_$lambda$0((String) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersistentCacheManager._get_transfersDynamicPillAmountResponse_$lambda$1((String) obj);
            }
        }, false, 32, null);
    }

    /* compiled from: PersistentCacheManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager$Keys;", "", "<init>", "()V", "REFERRAL_CODE_V2", "", "SETTINGS", "SYMMETRIC_REFERRER_DATA_V2", "TRUSTED_CONTACT", "TAX_FORM_RESUBMISSION_STATUS", "TRANSFERS_SUGGESTED_AMOUNT", "TRANSFERS_DYNAMIC_SUGGESTED_AMOUNT", "SYMMETRIC_REFERRER_CAMPAIGN_V2", "REFERRAL_CODE", "SYMMETRIC_REFERRER_DATA", "SYMMETRIC_REFERRER_CAMPAIGN", "STOCK_REWARD_INVENTORY_V3", "STOCK_REWARD_INVENTORY_V2", "SYMMETRIC_REFERRER_URL", "EXPERIMENTS", "ROBINHOOD_INSTANT_ELIGIBILITY", "REFERRAL_CAMPAIGN", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public static final class Keys {
        private static final String EXPERIMENTS = "cache_experiments";
        public static final Keys INSTANCE = new Keys();
        private static final String REFERRAL_CAMPAIGN = "cache_referralCampaign";
        private static final String REFERRAL_CODE = "cache_referralCode";
        public static final String REFERRAL_CODE_V2 = "cache_referralCodeV2";
        private static final String ROBINHOOD_INSTANT_ELIGIBILITY = "cache_robinhoodInstantEligibility";
        public static final String SETTINGS = "cache_settings_";
        private static final String STOCK_REWARD_INVENTORY_V2 = "cache_stockRewardInventory2";
        private static final String STOCK_REWARD_INVENTORY_V3 = "cache_stockRewardInventoryV3";
        private static final String SYMMETRIC_REFERRER_CAMPAIGN = "cache_symmetricReferrerCampaign";
        private static final String SYMMETRIC_REFERRER_CAMPAIGN_V2 = "cache_symmetricReferrerCampaignV2";
        private static final String SYMMETRIC_REFERRER_DATA = "cache_symmetricReferrerData";
        public static final String SYMMETRIC_REFERRER_DATA_V2 = "cache_symmetricReferrerDataV2";
        private static final String SYMMETRIC_REFERRER_URL = "cache_symmetricReferrerUrl";
        public static final String TAX_FORM_RESUBMISSION_STATUS = "cache_taxFormResubmissionStatus";
        public static final String TRANSFERS_DYNAMIC_SUGGESTED_AMOUNT = "cache_transfersDynamicSuggestedAmounts";
        public static final String TRANSFERS_SUGGESTED_AMOUNT = "cache_transfersSuggestedAmounts";
        public static final String TRUSTED_CONTACT = "cache_TrustedContact";

        private Keys() {
        }
    }

    public final void clear() {
        this.cacheMap.clear();
        this.cacheTimeMap.clear();
    }

    public final void invalidate(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = name + PREF_TIME_SUFFIX;
        this.cacheMap.remove(name);
        this.cacheTimeMap.remove(name);
        getUserPrefs().edit().remove(name).remove(str).apply();
    }

    public static /* synthetic */ Observable getSettingsPage$default(PersistentCacheManager persistentCacheManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return persistentCacheManager.getSettingsPage(str, str2);
    }

    public final Observable<ApiSettingsPage> getSettingsPage(String pageId, String accountNumber) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        StringBuilder sb = new StringBuilder();
        sb.append(Keys.SETTINGS);
        sb.append(pageId);
        if (accountNumber != null) {
            sb.append("_" + accountNumber);
        }
        return getValue$default(this, sb.toString(), 0L, RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new C349241(pageId, accountNumber, null), 1, null), new C349252(this.settingsJsonAdapter), new C349263(this.settingsJsonAdapter), false, 32, null);
    }

    /* compiled from: PersistentCacheManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.util.PersistentCacheManager$getSettingsPage$1", m3645f = "PersistentCacheManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.util.PersistentCacheManager$getSettingsPage$1 */
    /* loaded from: classes13.dex */
    static final class C349241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSettingsPage>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $pageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349241(String str, String str2, Continuation<? super C349241> continuation) {
            super(2, continuation);
            this.$pageId = str;
            this.$accountNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersistentCacheManager.this.new C349241(this.$pageId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSettingsPage> continuation) {
            return ((C349241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BonfireApi bonfireApi = PersistentCacheManager.this.getBonfireApi();
            String str = this.$pageId;
            String str2 = this.$accountNumber;
            this.label = 1;
            Object settingsPage = bonfireApi.getSettingsPage(str, str2, this);
            return settingsPage == coroutine_suspended ? coroutine_suspended : settingsPage;
        }
    }

    /* compiled from: PersistentCacheManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.util.PersistentCacheManager$getSettingsPage$2 */
    /* loaded from: classes13.dex */
    /* synthetic */ class C349252 extends FunctionReferenceImpl implements Function1<String, ApiSettingsPage> {
        C349252(Object obj) {
            super(1, obj, JsonAdapter.class, "fromJson", "fromJson(Ljava/lang/String;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ApiSettingsPage invoke(String str) {
            return (ApiSettingsPage) ((JsonAdapter) this.receiver).fromJson(str);
        }
    }

    /* compiled from: PersistentCacheManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.util.PersistentCacheManager$getSettingsPage$3 */
    /* loaded from: classes13.dex */
    /* synthetic */ class C349263 extends FunctionReferenceImpl implements Function1<ApiSettingsPage, String> {
        C349263(Object obj) {
            super(1, obj, JsonAdapter.class, "toJson", "toJson(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(ApiSettingsPage apiSettingsPage) {
            return ((JsonAdapter) this.receiver).toJson(apiSettingsPage);
        }
    }

    public static /* synthetic */ Observable getValue$default(PersistentCacheManager persistentCacheManager, String str, long j, Single single, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        return persistentCacheManager.getValue(str, j, single, function1, function12, (i & 32) != 0 ? false : z);
    }

    public final <T> Observable<T> getValue(final String name, final long staleTime, final Single<T> network, final Function1<? super String, ? extends T> fromJson, final Function1<? super T, String> toJson, final boolean exposeNetworkErrors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(fromJson, "fromJson");
        Intrinsics.checkNotNullParameter(toJson, "toJson");
        Observable observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.librobinhood.util.PersistentCacheManager$getValue$obs$1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<T> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this.this$0.emitValues(emitter, name, staleTime, network, fromJson, toJson, exposeNetworkErrors);
                emitter.onComplete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        Observable<T> observableSubscribeOn = observableCreate.subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void emitValues(ObservableEmitter<T> emitter, String name, long staleTime, Single<T> network, Function1<? super String, ? extends T> fromJson, Function1<? super T, String> toJson, boolean exposeNetworkErrors) {
        Object obj = this.cacheMap.get(name);
        if (obj == null) {
            obj = null;
        }
        Long l = this.cacheTimeMap.get(name);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l != null && l.longValue() + staleTime > jCurrentTimeMillis) {
            Intrinsics.checkNotNull(obj);
            emitter.onNext(obj);
            return;
        }
        String str = name + PREF_TIME_SUFFIX;
        if (obj == null) {
            long j = getUserPrefs().getLong(str, 0L);
            Object cachedValue = getCachedValue(name, fromJson, j);
            if (cachedValue != null) {
                emitter.onNext(cachedValue);
                if (j + staleTime > jCurrentTimeMillis) {
                    return;
                }
            }
        } else {
            emitter.onNext(obj);
        }
        try {
            T tBlockingGet = network.blockingGet();
            emitter.onNext(tBlockingGet);
            if (tBlockingGet != null) {
                emitter.onNext(tBlockingGet);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.cacheMap.put(name, tBlockingGet);
                this.cacheTimeMap.put(name, Long.valueOf(jCurrentTimeMillis2));
                String strInvoke = toJson.invoke(tBlockingGet);
                SharedPreferences.Editor editorEdit = getUserPrefs().edit();
                editorEdit.putString(name, strInvoke);
                editorEdit.putLong(str, jCurrentTimeMillis2);
                editorEdit.apply();
            }
        } catch (JsonDataException e) {
            if (emitter.getDisposed()) {
                return;
            }
            emitter.onError(e);
        } catch (Throwable th) {
            if (!exposeNetworkErrors || emitter.getDisposed()) {
                return;
            }
            emitter.onError(th);
        }
    }

    private final <T> T getCachedValue(String name, Function1<? super String, ? extends T> fromJson, long cachedTime) {
        T tInvoke;
        String string2 = getUserPrefs().getString(name, null);
        if (string2 == null) {
            return null;
        }
        try {
            tInvoke = fromJson.invoke(string2);
        } catch (JsonDataException unused) {
            SharedPreferences.Editor editorEdit = getUserPrefs().edit();
            editorEdit.remove(name);
            editorEdit.apply();
            tInvoke = null;
        }
        if (tInvoke == null) {
            return null;
        }
        this.cacheMap.put(name, tInvoke);
        this.cacheTimeMap.put(name, Long.valueOf(cachedTime));
        return tInvoke;
    }
}
