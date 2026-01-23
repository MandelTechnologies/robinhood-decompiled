package com.robinhood.android.privacy;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import com.robinhood.models.api.identi.ApiToggleDiscoverabilityRequest;
import com.robinhood.models.api.identi.ApiUpdateDiscoverabilityStatusRequest;
import com.robinhood.models.api.identi.OptOutConsentType;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileDiscoverabilityManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;", "", "identi", "Lcom/robinhood/api/retrofit/Identi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/coroutines/rx/RxFactory;)V", "getDiscoverabilityConsentStatuses", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "updateDiscoverabilityConsentStatus", "Lio/reactivex/Completable;", "type", "Lcom/robinhood/models/api/identi/OptOutConsentType;", "status", "", "toggleDiscoverability", "lib-privacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfileDiscoverabilityManager {
    private final Identi identi;
    private final RxFactory rxFactory;

    public ProfileDiscoverabilityManager(Identi identi2, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.identi = identi2;
        this.rxFactory = rxFactory;
    }

    /* compiled from: ProfileDiscoverabilityManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.privacy.ProfileDiscoverabilityManager$getDiscoverabilityConsentStatuses$1", m3645f = "ProfileDiscoverabilityManager.kt", m3646l = {21}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.privacy.ProfileDiscoverabilityManager$getDiscoverabilityConsentStatuses$1 */
    static final class C258651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ApiOptOutConsentStatus>>, Object> {
        int label;

        C258651(Continuation<? super C258651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileDiscoverabilityManager.this.new C258651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ApiOptOutConsentStatus>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ApiOptOutConsentStatus>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ApiOptOutConsentStatus>> continuation) {
            return ((C258651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Identi identi2 = ProfileDiscoverabilityManager.this.identi;
            this.label = 1;
            Object discoverabilityConsentStatus = identi2.getDiscoverabilityConsentStatus(this);
            return discoverabilityConsentStatus == coroutine_suspended ? coroutine_suspended : discoverabilityConsentStatus;
        }
    }

    public final Single<List<ApiOptOutConsentStatus>> getDiscoverabilityConsentStatuses() {
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C258651(null), 1, null);
    }

    /* compiled from: ProfileDiscoverabilityManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.privacy.ProfileDiscoverabilityManager$updateDiscoverabilityConsentStatus$1", m3645f = "ProfileDiscoverabilityManager.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.privacy.ProfileDiscoverabilityManager$updateDiscoverabilityConsentStatus$1 */
    static final class C258671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $status;
        final /* synthetic */ OptOutConsentType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258671(OptOutConsentType optOutConsentType, boolean z, Continuation<? super C258671> continuation) {
            super(2, continuation);
            this.$type = optOutConsentType;
            this.$status = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileDiscoverabilityManager.this.new C258671(this.$type, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = ProfileDiscoverabilityManager.this.identi;
                ApiUpdateDiscoverabilityStatusRequest apiUpdateDiscoverabilityStatusRequest = new ApiUpdateDiscoverabilityStatusRequest(this.$type, this.$status, null, 4, null);
                this.label = 1;
                if (identi2.updateDiscoverabilityConsentStatus(apiUpdateDiscoverabilityStatusRequest, this) == coroutine_suspended) {
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

    public final Completable updateDiscoverabilityConsentStatus(OptOutConsentType type2, boolean status) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return RxFactory.DefaultImpls.rxCompletable$default(this.rxFactory, null, new C258671(type2, status, null), 1, null);
    }

    /* compiled from: ProfileDiscoverabilityManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.privacy.ProfileDiscoverabilityManager$toggleDiscoverability$1", m3645f = "ProfileDiscoverabilityManager.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.privacy.ProfileDiscoverabilityManager$toggleDiscoverability$1 */
    static final class C258661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258661(boolean z, Continuation<? super C258661> continuation) {
            super(2, continuation);
            this.$status = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileDiscoverabilityManager.this.new C258661(this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = ProfileDiscoverabilityManager.this.identi;
                ApiToggleDiscoverabilityRequest apiToggleDiscoverabilityRequest = new ApiToggleDiscoverabilityRequest(this.$status, null, 2, null);
                this.label = 1;
                if (identi2.toggleDiscoverability(apiToggleDiscoverabilityRequest, this) == coroutine_suspended) {
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

    public final Completable toggleDiscoverability(boolean status) {
        return RxFactory.DefaultImpls.rxCompletable$default(this.rxFactory, null, new C258661(status, null), 1, null);
    }
}
