package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiScheduleAlert;
import com.robinhood.models.p320db.ScheduleAlert;
import com.robinhood.models.p320db.ScheduleAlert2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Maybe;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScheduleAlertStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;", "Lcom/robinhood/store/Store;", "recurringApi", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;Lcom/robinhood/store/StoreBundle;)V", "streamScheduleAlert", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/db/ScheduleAlert;", "scheduleId", "Ljava/util/UUID;", "accountNumber", "", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiScheduleAlert;", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ScheduleAlertStore extends Store {
    private final Endpoint<Tuples2<UUID, String>, Optional<ApiScheduleAlert>> endpoint;
    private final RecurringApi recurringApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleAlertStore(RecurringApi recurringApi, StoreBundle storeBundle) {
        super(storeBundle, ScheduleAlert.INSTANCE);
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.recurringApi = recurringApi;
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new ScheduleAlertStore2(this, null), getLogoutKillswitch(), new ScheduleAlertStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: ScheduleAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/ScheduleAlert;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ScheduleAlertStore$streamScheduleAlert$1", m3645f = "ScheduleAlertStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ScheduleAlertStore$streamScheduleAlert$1 */
    static final class C343141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ScheduleAlert>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $scheduleId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343141(UUID uuid, String str, Continuation<? super C343141> continuation) {
            super(2, continuation);
            this.$scheduleId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAlertStore.this.new C343141(this.$scheduleId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ScheduleAlert> continuation) {
            return ((C343141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiScheduleAlert apiScheduleAlert;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = ScheduleAlertStore.this.endpoint;
                Tuples2 tuples2 = new Tuples2(this.$scheduleId, this.$accountNumber);
                this.label = 1;
                obj = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Optional optional = (Optional) obj;
            if (optional == null || (apiScheduleAlert = (ApiScheduleAlert) optional.getOrNull()) == null) {
                return null;
            }
            return ScheduleAlert2.toDbModel(apiScheduleAlert);
        }
    }

    public static /* synthetic */ Maybe streamScheduleAlert$default(ScheduleAlertStore scheduleAlertStore, UUID uuid, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return scheduleAlertStore.streamScheduleAlert(uuid, str);
    }

    public final Maybe<ScheduleAlert> streamScheduleAlert(UUID scheduleId, String accountNumber) {
        Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C343141(scheduleId, accountNumber, null), 1, null);
    }
}
