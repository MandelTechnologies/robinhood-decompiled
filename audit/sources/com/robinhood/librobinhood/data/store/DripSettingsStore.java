package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.recurring.retrofit.RecurringBrokebackApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.HasShownDripHistoryUpsellByAccountPref;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAccountDripSettings;
import com.robinhood.models.api.ApiDripSettingsRequest;
import com.robinhood.models.api.ApiInstrumentDripSettings;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DripEnrollment;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.recurring.models.dao.DripSettingsDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import timber.log.Timber;

/* compiled from: DripSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001AB;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u0017J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020!0$2\b\u0010\"\u001a\u0004\u0018\u00010\u0017J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\"\u001a\u00020\u0017H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010\"\u001a\u00020\u0017J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0$2\u0006\u0010\"\u001a\u00020\u0017J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*2\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0017J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0*J\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0*2\u0006\u0010\"\u001a\u00020\u0017J\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.010*2\u0006\u0010\"\u001a\u00020\u00172\u0006\u00102\u001a\u000203J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u00107J\u001e\u00108\u001a\u0002052\u0006\u00106\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u00109J\u001e\u0010:\u001a\u00020\u00132\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010;J&\u0010<\u001a\u00020\u00132\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00142\b\b\u0002\u0010?\u001a\u00020\u001dJ\u0018\u0010@\u001a\u00020\u00142\b\b\u0002\u0010?\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/android/api/recurring/retrofit/RecurringBrokebackApi;", "hasShownDripHistoryUpsellPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/DripSettingsDao;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/api/recurring/retrofit/RecurringBrokebackApi;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/recurring/models/dao/DripSettingsDao;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;)V", "saveActionPaginated", "Lkotlin/Function1;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiInstrumentDripSettings;", "", "dripEnrollmentEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/DripEnrollment;", "dripEnrollmentQuery", "Lcom/robinhood/android/moria/db/Query;", "streamDripAccessibility", "Lkotlinx/coroutines/flow/Flow;", "", "account", "Lcom/robinhood/models/db/Account;", "streamDripOnboardingEligibility", "Lcom/robinhood/librobinhood/data/store/DripEligibility;", "accountNumber", "eligibleForDripOnboarding", "Lio/reactivex/Single;", "streamDripEnrollment", "getDripCardType", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "shouldShowDripHistoryUpsell", "shouldShowDripStatusButton", "Lio/reactivex/Observable;", "markDripHistoryUpsellShown", "streamIndividualAccountInstrumentSettings", "", "Lcom/robinhood/models/ui/UiInstrumentDripSettings;", "streamSettingsForAllInstruments", "streamInstrumentSettings", "Lcom/robinhood/utils/Optional;", "instrumentId", "Ljava/util/UUID;", "setIndividualAccountSettings", "Lcom/robinhood/models/api/ApiAccountDripSettings;", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAccountSettings", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIndividualAccountInstrumentSettings", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInstrumentSettings", "(Ljava/util/UUID;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "force", "refreshForAccount", "DripCardType", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DripSettingsStore extends Store {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final RecurringBrokebackApi brokeback;
    private final DripSettingsDao dao;
    private final Endpoint<String, DripEnrollment> dripEnrollmentEndpoint;
    private final Query<String, DripEnrollment> dripEnrollmentQuery;
    private final StringToBooleanMapPreference hasShownDripHistoryUpsellPref;
    private final Function1<PaginatedResult<ApiInstrumentDripSettings>, Unit> saveActionPaginated;

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore", m3645f = "DripSettingsStore.kt", m3646l = {202}, m3647m = "setAccountSettings")
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$setAccountSettings$1 */
    static final class C338221 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C338221(Continuation<? super C338221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DripSettingsStore.this.setAccountSettings(false, null, this);
        }
    }

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore", m3645f = "DripSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "setIndividualAccountInstrumentSettings")
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$setIndividualAccountInstrumentSettings$1 */
    static final class C338231 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C338231(Continuation<? super C338231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DripSettingsStore.this.setIndividualAccountInstrumentSettings(null, false, this);
        }
    }

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore", m3645f = "DripSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "setIndividualAccountSettings")
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$setIndividualAccountSettings$1 */
    static final class C338241 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C338241(Continuation<? super C338241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DripSettingsStore.this.setIndividualAccountSettings(false, this);
        }
    }

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore", m3645f = "DripSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "setInstrumentSettings")
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$setInstrumentSettings$1 */
    static final class C338251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C338251(Continuation<? super C338251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DripSettingsStore.this.setInstrumentSettings(null, false, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DripSettingsStore(AccountProvider accountProvider, RecurringBrokebackApi brokeback, @HasShownDripHistoryUpsellByAccountPref StringToBooleanMapPreference hasShownDripHistoryUpsellPref, StoreBundle storeBundle, final DripSettingsDao dao, AccountAccessStore accountAccessStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(hasShownDripHistoryUpsellPref, "hasShownDripHistoryUpsellPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        this.accountProvider = accountProvider;
        this.brokeback = brokeback;
        this.hasShownDripHistoryUpsellPref = hasShownDripHistoryUpsellPref;
        this.dao = dao;
        this.accountAccessStore = accountAccessStore;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveActionPaginated = new Function1<PaginatedResult<? extends ApiInstrumentDripSettings>, Unit>() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiInstrumentDripSettings> paginatedResult) {
                m22645invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22645invoke(PaginatedResult<? extends ApiInstrumentDripSettings> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(paginatedResult);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.dripEnrollmentEndpoint = companion.create(new DripSettingsStore2(this, null), logoutKillswitch2, new DripSettingsStore3(this, null), clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.dripEnrollmentQuery = Store.create$default(this, Query.INSTANCE, "dripEnrollmentQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsStore.dripEnrollmentQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsStore.dripEnrollmentQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job dripEnrollmentQuery$lambda$0(DripSettingsStore dripSettingsStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(dripSettingsStore.dripEnrollmentEndpoint, accountNumber, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow dripEnrollmentQuery$lambda$1(DripSettingsStore dripSettingsStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return dripSettingsStore.dao.getEnrollmentForAccount(accountNumber);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "NONE", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DripCardType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DripCardType[] $VALUES;
        public static final DripCardType DISABLED = new DripCardType("DISABLED", 0);
        public static final DripCardType ENABLED = new DripCardType("ENABLED", 1);
        public static final DripCardType NONE = new DripCardType("NONE", 2);

        private static final /* synthetic */ DripCardType[] $values() {
            return new DripCardType[]{DISABLED, ENABLED, NONE};
        }

        public static EnumEntries<DripCardType> getEntries() {
            return $ENTRIES;
        }

        private DripCardType(String str, int i) {
        }

        static {
            DripCardType[] dripCardTypeArr$values = $values();
            $VALUES = dripCardTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dripCardTypeArr$values);
        }

        public static DripCardType valueOf(String str) {
            return (DripCardType) Enum.valueOf(DripCardType.class, str);
        }

        public static DripCardType[] values() {
            return (DripCardType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamDripAccessibility(Account account) {
        return this.accountAccessStore.getFeatureAccess(account, AccountFeature.DRIP);
    }

    public final Flow<DripEligibility> streamDripOnboardingEligibility(String accountNumber) {
        Observable<Account> observableStreamAccount;
        if (accountNumber == null) {
            observableStreamAccount = this.accountProvider.streamIndividualAccount();
        } else {
            observableStreamAccount = this.accountProvider.streamAccount(accountNumber);
        }
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(observableStreamAccount), Integer.MAX_VALUE, null, 2, null), new C33816xa4e3a57c(null, this)));
    }

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/DripEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore$eligibleForDripOnboarding$1", m3645f = "DripSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$eligibleForDripOnboarding$1 */
    static final class C338191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DripEligibility>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338191(String str, Continuation<? super C338191> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DripSettingsStore.this.new C338191(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DripEligibility> continuation) {
            return ((C338191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Flow<DripEligibility> flowStreamDripOnboardingEligibility = DripSettingsStore.this.streamDripOnboardingEligibility(this.$accountNumber);
            this.label = 1;
            Object objFirst = FlowKt.first(flowStreamDripOnboardingEligibility, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    public final Single<DripEligibility> eligibleForDripOnboarding(String accountNumber) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C338191(accountNumber, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamDripEnrollment(String accountNumber) {
        final Flow<DripEnrollment> flowAsFlow = this.dripEnrollmentQuery.asFlow(accountNumber);
        return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$streamDripEnrollment$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C338152(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$streamDripEnrollment$$inlined$map$1$2 */
            public static final class C338152<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore$streamDripEnrollment$$inlined$map$1$2", m3645f = "DripSettingsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$streamDripEnrollment$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338152.this.emit(null, this);
                    }
                }

                public C338152(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((DripEnrollment) obj).getDripEnrolled());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Single<DripCardType> getDripCardType(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single<DripCardType> singleFirstOrError = this.accountProvider.streamAccount(accountNumber).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.getDripCardType.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DripCardType> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                DripSettingsStore dripSettingsStore = DripSettingsStore.this;
                return dripSettingsStore.asObservable(dripSettingsStore.streamDripAccessibility(account)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.getDripCardType.1.1
                    @Override // io.reactivex.functions.Function
                    public final DripCardType apply(Boolean dripIsAccessible) {
                        Intrinsics.checkNotNullParameter(dripIsAccessible, "dripIsAccessible");
                        return !dripIsAccessible.booleanValue() ? DripCardType.NONE : account.getDripEnabled() ? DripCardType.ENABLED : DripCardType.DISABLED;
                    }
                });
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    public final Single<Boolean> shouldShowDripHistoryUpsell(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Singles singles = Singles.INSTANCE;
        SingleSource map = eligibleForDripOnboarding(accountNumber).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.shouldShowDripHistoryUpsell.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(DripEligibility it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof DripEligibility.Eligible);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Single singleJust = Single.just(Boolean.valueOf(this.hasShownDripHistoryUpsellPref.get(accountNumber, false)));
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        Single<Boolean> singleZip = Single.zip(map, singleJust, new BiFunction<Boolean, Boolean, R>() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$shouldShowDripHistoryUpsell$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(Boolean t, Boolean u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) Boolean.valueOf(t.booleanValue() && !u.booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return singleZip;
    }

    public final Observable<Boolean> shouldShowDripStatusButton(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Boolean> observable = eligibleForDripOnboarding(accountNumber).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.shouldShowDripStatusButton.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(DripEligibility it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf((it instanceof DripEligibility.Eligible) || (it instanceof DripEligibility.AlreadyOnboarded));
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    public final void markDripHistoryUpsellShown(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.hasShownDripHistoryUpsellPref.set(accountNumber, true);
    }

    public final Observable<List<UiInstrumentDripSettings>> streamIndividualAccountInstrumentSettings() {
        Observable<List<UiInstrumentDripSettings>> observableSwitchMap = ObservablesKt.filterIsPresent(this.accountProvider.streamIndividualAccountNumberOptional()).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.streamIndividualAccountInstrumentSettings.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiInstrumentDripSettings>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                DripSettingsStore dripSettingsStore = DripSettingsStore.this;
                return dripSettingsStore.asObservable(dripSettingsStore.dao.get(accountNumber));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<List<UiInstrumentDripSettings>> streamSettingsForAllInstruments(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(this.dao.get(accountNumber));
    }

    public final Observable<Optional<UiInstrumentDripSettings>> streamInstrumentSettings(String accountNumber, final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Observable map = streamSettingsForAllInstruments(accountNumber).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore.streamInstrumentSettings.1
            @Override // io.reactivex.functions.Function
            public final Optional<UiInstrumentDripSettings> apply(List<UiInstrumentDripSettings> list) {
                T next;
                Intrinsics.checkNotNullParameter(list, "list");
                Optional.Companion companion = Optional.INSTANCE;
                UUID uuid = instrumentId;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((UiInstrumentDripSettings) next).getInstrument().getId(), uuid)) {
                        break;
                    }
                }
                return companion.m2972of(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setIndividualAccountSettings(boolean z, Continuation<? super ApiAccountDripSettings> continuation) {
        C338241 c338241;
        if (continuation instanceof C338241) {
            c338241 = (C338241) continuation;
            int i = c338241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338241.label = i - Integer.MIN_VALUE;
            } else {
                c338241 = new C338241(continuation);
            }
        }
        Object objAwaitFirst = c338241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338241.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitFirst);
                Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.accountProvider.streamIndividualAccountNumberOptional());
                c338241.Z$0 = z;
                c338241.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(observableFilterIsPresent, c338241);
                if (objAwaitFirst == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitFirst);
                return (ApiAccountDripSettings) objAwaitFirst;
            }
            z = c338241.Z$0;
            ResultKt.throwOnFailure(objAwaitFirst);
            String str = (String) objAwaitFirst;
            RecurringBrokebackApi recurringBrokebackApi = this.brokeback;
            Intrinsics.checkNotNull(str);
            ApiDripSettingsRequest apiDripSettingsRequest = new ApiDripSettingsRequest(z);
            c338241.label = 2;
            objAwaitFirst = recurringBrokebackApi.patchAccountDripSettings(str, apiDripSettingsRequest, c338241);
        } finally {
            refresh(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setAccountSettings(boolean z, String str, Continuation<? super ApiAccountDripSettings> continuation) {
        C338221 c338221;
        if (continuation instanceof C338221) {
            c338221 = (C338221) continuation;
            int i = c338221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338221.label = i - Integer.MIN_VALUE;
            } else {
                c338221 = new C338221(continuation);
            }
        }
        Object objPatchAccountDripSettings = c338221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338221.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPatchAccountDripSettings);
                RecurringBrokebackApi recurringBrokebackApi = this.brokeback;
                ApiDripSettingsRequest apiDripSettingsRequest = new ApiDripSettingsRequest(z);
                c338221.L$0 = str;
                c338221.label = 1;
                objPatchAccountDripSettings = recurringBrokebackApi.patchAccountDripSettings(str, apiDripSettingsRequest, c338221);
                if (objPatchAccountDripSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c338221.L$0;
                ResultKt.throwOnFailure(objPatchAccountDripSettings);
            }
            return (ApiAccountDripSettings) objPatchAccountDripSettings;
        } finally {
            refreshForAccount(true, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setIndividualAccountInstrumentSettings(UUID uuid, boolean z, Continuation<? super ApiInstrumentDripSettings> continuation) {
        C338231 c338231;
        if (continuation instanceof C338231) {
            c338231 = (C338231) continuation;
            int i = c338231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338231.label = i - Integer.MIN_VALUE;
            } else {
                c338231 = new C338231(continuation);
            }
        }
        Object objAwaitFirst = c338231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitFirst);
                Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.accountProvider.streamIndividualAccountNumberOptional());
                c338231.L$0 = uuid;
                c338231.Z$0 = z;
                c338231.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(observableFilterIsPresent, c338231);
                if (objAwaitFirst == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitFirst);
                return (ApiInstrumentDripSettings) objAwaitFirst;
            }
            z = c338231.Z$0;
            uuid = (UUID) c338231.L$0;
            ResultKt.throwOnFailure(objAwaitFirst);
            String str = (String) objAwaitFirst;
            RecurringBrokebackApi recurringBrokebackApi = this.brokeback;
            Intrinsics.checkNotNull(str);
            ApiDripSettingsRequest apiDripSettingsRequest = new ApiDripSettingsRequest(z);
            c338231.L$0 = null;
            c338231.label = 2;
            objAwaitFirst = recurringBrokebackApi.patchInstrumentDripSettings(str, uuid, apiDripSettingsRequest, c338231);
        } finally {
            refresh(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setInstrumentSettings(UUID uuid, boolean z, String str, Continuation<? super ApiInstrumentDripSettings> continuation) {
        C338251 c338251;
        if (continuation instanceof C338251) {
            c338251 = (C338251) continuation;
            int i = c338251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338251.label = i - Integer.MIN_VALUE;
            } else {
                c338251 = new C338251(continuation);
            }
        }
        Object objPatchInstrumentDripSettings = c338251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338251.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPatchInstrumentDripSettings);
                RecurringBrokebackApi recurringBrokebackApi = this.brokeback;
                ApiDripSettingsRequest apiDripSettingsRequest = new ApiDripSettingsRequest(z);
                c338251.L$0 = str;
                c338251.label = 1;
                objPatchInstrumentDripSettings = recurringBrokebackApi.patchInstrumentDripSettings(str, uuid, apiDripSettingsRequest, c338251);
                if (objPatchInstrumentDripSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c338251.L$0;
                ResultKt.throwOnFailure(objPatchInstrumentDripSettings);
            }
            return (ApiInstrumentDripSettings) objPatchInstrumentDripSettings;
        } finally {
            refreshForAccount(true, str);
        }
    }

    public static /* synthetic */ void refresh$default(DripSettingsStore dripSettingsStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dripSettingsStore.refresh(z);
    }

    public final void refresh(boolean force) {
        this.accountProvider.refresh(force);
        Maybe maybeFlatMapMaybe = ObservablesKt.filterIsPresent(this.accountProvider.streamIndividualAccountNumberOptional()).firstOrError().cache().flatMapMaybe(new C338211(force));
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapMaybe, "flatMapMaybe(...)");
        ScopedSubscriptionKt.subscribeIn(maybeFlatMapMaybe, getStoreScope());
    }

    /* compiled from: DripSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$refresh$1 */
    static final class C338211<T, R> implements Function {
        final /* synthetic */ boolean $force;

        C338211(boolean z) {
            this.$force = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Single apply$lambda$0(DripSettingsStore dripSettingsStore, String str, String str2) {
            return RxFactory.DefaultImpls.rxSingle$default(dripSettingsStore, null, new DripSettingsStore4(dripSettingsStore, str, str2, null), 1, null);
        }

        @Override // io.reactivex.functions.Function
        public final MaybeSource<? extends PaginatedResult<ApiInstrumentDripSettings>> apply(final String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            final DripSettingsStore dripSettingsStore = DripSettingsStore.this;
            return dripSettingsStore.refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$refresh$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DripSettingsStore.C338211.apply$lambda$0(dripSettingsStore, accountNumber, (String) obj);
                }
            }).saveAction(DripSettingsStore.this.saveActionPaginated).force(this.$force).toMaybe(DripSettingsStore.this.getNetworkWrapper());
        }
    }

    public static /* synthetic */ void refreshForAccount$default(DripSettingsStore dripSettingsStore, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dripSettingsStore.refreshForAccount(z, str);
    }

    public final void refreshForAccount(boolean force, final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint.DefaultImpls.refresh$default(this.dripEnrollmentEndpoint, accountNumber, force, null, 4, null);
        this.accountProvider.refresh(force);
        ScopedSubscriptionKt.subscribeIn(refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.DripSettingsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsStore.refreshForAccount$lambda$7(this.f$0, accountNumber, (String) obj);
            }
        }).saveAction(this.saveActionPaginated).force(force).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refreshForAccount$lambda$7(DripSettingsStore dripSettingsStore, String str, String str2) {
        return RxFactory.DefaultImpls.rxSingle$default(dripSettingsStore, null, new DripSettingsStore5(dripSettingsStore, str, str2, null), 1, null);
    }
}
