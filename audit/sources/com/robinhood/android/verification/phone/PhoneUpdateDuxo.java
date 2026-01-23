package com.robinhood.android.verification.phone;

import com.robinhood.android.api.verification.VerificationApi;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.verification.phone.PhoneUpdateEvent;
import com.robinhood.models.api.identi.ApiStartPhoneUpdateSuvRequest;
import com.robinhood.models.api.identi.ApiStartPhoneUpdateSuvResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PhoneUpdateDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;", "Lcom/robinhood/android/verification/phone/PhoneUpdateViewState;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "verificationApi", "Lcom/robinhood/android/api/verification/VerificationApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/verification/phone/PhoneUpdateStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/verification/VerificationApi;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;Lcom/robinhood/android/verification/phone/PhoneUpdateStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "setPhoneNumberTypedText", "phoneNumberTypedText", "", "setInternationalInfo", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "startSuv", "phoneNumber", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneUpdateDuxo extends BaseDuxo3<PhoneUpdateDataState, PhoneUpdateViewState, PhoneUpdateEvent> {
    public static final int $stable = 8;
    private final SuvMigrationManager suvMigrationManager;
    private final UserStore userStore;
    private final VerificationApi verificationApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneUpdateDuxo(VerificationApi verificationApi, UserStore userStore, SuvMigrationManager suvMigrationManager, PhoneUpdateStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new PhoneUpdateDataState(false, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(verificationApi, "verificationApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.verificationApi = verificationApi;
        this.userStore = userStore;
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314341(null), 3, null);
    }

    /* compiled from: PhoneUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$onCreate$1", m3645f = "PhoneUpdateDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$onCreate$1 */
    static final class C314341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314341(Continuation<? super C314341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PhoneUpdateDuxo.this.new C314341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = PhoneUpdateDuxo.this.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirst(user, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PhoneUpdateDuxo.this.submit(new PhoneUpdateEvent.InitialLocality(((User) obj).getOrigin().getLocality()));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PhoneUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$setPhoneNumberTypedText$1", m3645f = "PhoneUpdateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$setPhoneNumberTypedText$1 */
    static final class C314361 extends ContinuationImpl7 implements Function2<PhoneUpdateDataState, Continuation<? super PhoneUpdateDataState>, Object> {
        final /* synthetic */ String $phoneNumberTypedText;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314361(String str, Continuation<? super C314361> continuation) {
            super(2, continuation);
            this.$phoneNumberTypedText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C314361 c314361 = new C314361(this.$phoneNumberTypedText, continuation);
            c314361.L$0 = obj;
            return c314361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneUpdateDataState phoneUpdateDataState, Continuation<? super PhoneUpdateDataState> continuation) {
            return ((C314361) create(phoneUpdateDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PhoneUpdateDataState.copy$default((PhoneUpdateDataState) this.L$0, false, null, this.$phoneNumberTypedText, 3, null);
        }
    }

    public final void setPhoneNumberTypedText(String phoneNumberTypedText) {
        Intrinsics.checkNotNullParameter(phoneNumberTypedText, "phoneNumberTypedText");
        applyMutation(new C314361(phoneNumberTypedText, null));
    }

    /* compiled from: PhoneUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$setInternationalInfo$1", m3645f = "PhoneUpdateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$setInternationalInfo$1 */
    static final class C314351 extends ContinuationImpl7 implements Function2<PhoneUpdateDataState, Continuation<? super PhoneUpdateDataState>, Object> {
        final /* synthetic */ InternationalInfo $internationalInfo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314351(InternationalInfo internationalInfo, Continuation<? super C314351> continuation) {
            super(2, continuation);
            this.$internationalInfo = internationalInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C314351 c314351 = new C314351(this.$internationalInfo, continuation);
            c314351.L$0 = obj;
            return c314351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneUpdateDataState phoneUpdateDataState, Continuation<? super PhoneUpdateDataState> continuation) {
            return ((C314351) create(phoneUpdateDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PhoneUpdateDataState.copy$default((PhoneUpdateDataState) this.L$0, false, this.$internationalInfo, null, 5, null);
        }
    }

    public final void setInternationalInfo(InternationalInfo internationalInfo) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        applyMutation(new C314351(internationalInfo, null));
    }

    /* compiled from: PhoneUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$1", m3645f = "PhoneUpdateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$1 */
    static final class C314371 extends ContinuationImpl7 implements Function2<PhoneUpdateDataState, Continuation<? super PhoneUpdateDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C314371(Continuation<? super C314371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C314371 c314371 = new C314371(continuation);
            c314371.L$0 = obj;
            return c314371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneUpdateDataState phoneUpdateDataState, Continuation<? super PhoneUpdateDataState> continuation) {
            return ((C314371) create(phoneUpdateDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PhoneUpdateDataState.copy$default((PhoneUpdateDataState) this.L$0, true, null, null, 6, null);
        }
    }

    /* compiled from: PhoneUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$2", m3645f = "PhoneUpdateDuxo.kt", m3646l = {55, 67}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$2 */
    static final class C314382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $phoneNumber;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314382(String str, Continuation<? super C314382> continuation) {
            super(2, continuation);
            this.$phoneNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PhoneUpdateDuxo.this.new C314382(this.$phoneNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object obj2;
            String str;
            PhoneUpdateDuxo phoneUpdateDuxo;
            UUID uuid;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PhoneUpdateDuxo phoneUpdateDuxo2 = PhoneUpdateDuxo.this;
                String str2 = this.$phoneNumber;
                Result.Companion companion2 = Result.INSTANCE;
                VerificationApi verificationApi = phoneUpdateDuxo2.verificationApi;
                ApiStartPhoneUpdateSuvRequest apiStartPhoneUpdateSuvRequest = new ApiStartPhoneUpdateSuvRequest(str2);
                this.label = 1;
                obj = verificationApi.startPhoneUpdateSuv(apiStartPhoneUpdateSuvRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    phoneUpdateDuxo = (PhoneUpdateDuxo) this.L$3;
                    str = (String) this.L$2;
                    uuid = (UUID) this.L$1;
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    phoneUpdateDuxo.submit(new PhoneUpdateEvent.StartSuv(str, uuid, ((Boolean) obj).booleanValue()));
                    PhoneUpdateDuxo phoneUpdateDuxo3 = PhoneUpdateDuxo.this;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                    if (thM28553exceptionOrNullimpl != null) {
                        phoneUpdateDuxo3.applyMutation(new PhoneUpdateDuxo3(null));
                        phoneUpdateDuxo3.submit(new PhoneUpdateEvent.Error(thM28553exceptionOrNullimpl));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiStartPhoneUpdateSuvResponse) obj);
            obj2 = objM28550constructorimpl;
            PhoneUpdateDuxo phoneUpdateDuxo4 = PhoneUpdateDuxo.this;
            str = this.$phoneNumber;
            if (Result.m28556isSuccessimpl(obj2)) {
                ApiStartPhoneUpdateSuvResponse apiStartPhoneUpdateSuvResponse = (ApiStartPhoneUpdateSuvResponse) obj2;
                phoneUpdateDuxo4.applyMutation(new PhoneUpdateDuxo2(null));
                if (apiStartPhoneUpdateSuvResponse.getWorkflowStatus() == VerificationWorkflowResult.APPROVED) {
                    phoneUpdateDuxo4.submit(new PhoneUpdateEvent.Success(str));
                } else {
                    UUID workflowId = apiStartPhoneUpdateSuvResponse.getWorkflowId();
                    SuvMigrationManager suvMigrationManager = phoneUpdateDuxo4.suvMigrationManager;
                    UUID workflowId2 = apiStartPhoneUpdateSuvResponse.getWorkflowId();
                    this.L$0 = obj2;
                    this.L$1 = workflowId;
                    this.L$2 = str;
                    this.L$3 = phoneUpdateDuxo4;
                    this.label = 2;
                    Object objIsMigrated = suvMigrationManager.isMigrated(workflowId2, this);
                    if (objIsMigrated != coroutine_suspended) {
                        phoneUpdateDuxo = phoneUpdateDuxo4;
                        obj = objIsMigrated;
                        uuid = workflowId;
                        phoneUpdateDuxo.submit(new PhoneUpdateEvent.StartSuv(str, uuid, ((Boolean) obj).booleanValue()));
                    }
                    return coroutine_suspended;
                }
            }
            PhoneUpdateDuxo phoneUpdateDuxo32 = PhoneUpdateDuxo.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
            if (thM28553exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void startSuv(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        applyMutation(new C314371(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314382(phoneNumber, null), 3, null);
    }
}
