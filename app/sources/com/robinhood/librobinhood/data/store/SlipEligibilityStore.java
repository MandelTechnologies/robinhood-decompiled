package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/store/StoreBundle;)V", "eligibilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "getOnboardingEligibility", "Lio/reactivex/Single;", "accountNumber", "getSlipHubEnrollmentStatus", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore$SlipHubEnrollmentStatus;", "SlipHubEnrollmentStatus", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipEligibilityStore extends Store {
    private final AccountProvider accountProvider;
    private final Endpoint<String, UiSlipOnboardingEligibility> eligibilityEndpoint;
    private final SlipApi slipApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipEligibilityStore(AccountProvider accountProvider, SlipApi slipApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.slipApi = slipApi;
        this.eligibilityEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipEligibilityStore2(this, null), getLogoutKillswitch(), new SlipEligibilityStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: SlipEligibilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SlipEligibilityStore$getOnboardingEligibility$1", m3645f = "SlipEligibilityStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SlipEligibilityStore$getOnboardingEligibility$1 */
    static final class C343161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiSlipOnboardingEligibility>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343161(String str, Continuation<? super C343161> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipEligibilityStore.this.new C343161(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiSlipOnboardingEligibility> continuation) {
            return ((C343161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = SlipEligibilityStore.this.eligibilityEndpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UiSlipOnboardingEligibility> getOnboardingEligibility(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343161(accountNumber, null), 1, null);
    }

    public final Single<SlipHubEnrollmentStatus> getSlipHubEnrollmentStatus() {
        Single<SlipHubEnrollmentStatus> map = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.SlipEligibilityStore.getSlipHubEnrollmentStatus.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiSlipOnboardingEligibility>> apply(Optional<String> optional) {
                Single<R> map2;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                return (strComponent1 == null || (map2 = SlipEligibilityStore.this.getOnboardingEligibility(strComponent1).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SlipEligibilityStore$getSlipHubEnrollmentStatus$1$1$1
                    @Override // io.reactivex.functions.Function
                    public final Optional<UiSlipOnboardingEligibility> apply(UiSlipOnboardingEligibility it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(it);
                    }
                })) == null) ? Single.just(Optional2.INSTANCE) : map2;
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SlipEligibilityStore.getSlipHubEnrollmentStatus.2
            @Override // io.reactivex.functions.Function
            public final SlipHubEnrollmentStatus apply(Optional<UiSlipOnboardingEligibility> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                UiSlipOnboardingEligibility uiSlipOnboardingEligibilityComponent1 = optional.component1();
                if (uiSlipOnboardingEligibilityComponent1 != null && uiSlipOnboardingEligibilityComponent1.isConsented()) {
                    return SlipHubEnrollmentStatus.ENROLLED;
                }
                if (uiSlipOnboardingEligibilityComponent1 != null && uiSlipOnboardingEligibilityComponent1.getIsEligible()) {
                    return SlipHubEnrollmentStatus.NOT_ENROLLED;
                }
                return SlipHubEnrollmentStatus.NOT_ELIGIBLE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlipEligibilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore$SlipHubEnrollmentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ENROLLED", "NOT_ELIGIBLE", "ENROLLED", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SlipHubEnrollmentStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SlipHubEnrollmentStatus[] $VALUES;
        public static final SlipHubEnrollmentStatus NOT_ENROLLED = new SlipHubEnrollmentStatus("NOT_ENROLLED", 0);
        public static final SlipHubEnrollmentStatus NOT_ELIGIBLE = new SlipHubEnrollmentStatus("NOT_ELIGIBLE", 1);
        public static final SlipHubEnrollmentStatus ENROLLED = new SlipHubEnrollmentStatus("ENROLLED", 2);

        private static final /* synthetic */ SlipHubEnrollmentStatus[] $values() {
            return new SlipHubEnrollmentStatus[]{NOT_ENROLLED, NOT_ELIGIBLE, ENROLLED};
        }

        public static EnumEntries<SlipHubEnrollmentStatus> getEntries() {
            return $ENTRIES;
        }

        private SlipHubEnrollmentStatus(String str, int i) {
        }

        static {
            SlipHubEnrollmentStatus[] slipHubEnrollmentStatusArr$values = $values();
            $VALUES = slipHubEnrollmentStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(slipHubEnrollmentStatusArr$values);
        }

        public static SlipHubEnrollmentStatus valueOf(String str) {
            return (SlipHubEnrollmentStatus) Enum.valueOf(SlipHubEnrollmentStatus.class, str);
        }

        public static SlipHubEnrollmentStatus[] values() {
            return (SlipHubEnrollmentStatus[]) $VALUES.clone();
        }
    }
}
