package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.librobinhood.data.store.pims.PimsStore;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.pims.ApiDataSubjectRequestResponse;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataRequestDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "pimsStore", "Lcom/robinhood/librobinhood/data/store/pims/PimsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/pims/PimsStore;)V", "reset", "", "submitRequest", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PersonalDataRequestDuxo extends OldBaseDuxo<PersonalDataRequestViewState> {
    public static final int $stable = 8;
    private final PimsStore pimsStore;

    /* compiled from: PersonalDataRequestDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDataRequestType.values().length];
            try {
                iArr[PersonalDataRequestType.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDataRequestType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PersonalDataRequestDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo", m3645f = "PersonalDataRequestDuxo.kt", m3646l = {25, 26}, m3647m = "submitRequest")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$submitRequest$1 */
    static final class C282281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C282281(Continuation<? super C282281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PersonalDataRequestDuxo.this.submitRequest(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalDataRequestDuxo(PimsStore pimsStore) {
        super(PersonalDataRequestViewState.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pimsStore, "pimsStore");
        this.pimsStore = pimsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataRequestViewState reset$lambda$0(PersonalDataRequestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PersonalDataRequestViewState.Default.INSTANCE;
    }

    public final void reset() {
        applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataRequestDuxo.reset$lambda$0((PersonalDataRequestViewState) obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitRequest(PersonalDataRequestType personalDataRequestType, UUID uuid, Continuation<? super Unit> continuation) {
        C282281 c282281;
        final ApiDataSubjectRequestResponse apiDataSubjectRequestResponse;
        if (continuation instanceof C282281) {
            c282281 = (C282281) continuation;
            int i = c282281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c282281.label = i - Integer.MIN_VALUE;
            } else {
                c282281 = new C282281(continuation);
            }
        }
        Object objSubmitDataAccessRequest = c282281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c282281.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSubmitDataAccessRequest);
                applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalDataRequestDuxo.submitRequest$lambda$1((PersonalDataRequestViewState) obj);
                    }
                });
                int i3 = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
                if (i3 == 1) {
                    PimsStore pimsStore = this.pimsStore;
                    c282281.label = 1;
                    objSubmitDataAccessRequest = pimsStore.submitDataAccessRequest(uuid, c282281);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PimsStore pimsStore2 = this.pimsStore;
                    c282281.label = 2;
                    objSubmitDataAccessRequest = pimsStore2.submitDataDeletionRequest(uuid, c282281);
                    if (objSubmitDataAccessRequest == coroutine_suspended) {
                    }
                    apiDataSubjectRequestResponse = (ApiDataSubjectRequestResponse) objSubmitDataAccessRequest;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(objSubmitDataAccessRequest);
                apiDataSubjectRequestResponse = (ApiDataSubjectRequestResponse) objSubmitDataAccessRequest;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSubmitDataAccessRequest);
                apiDataSubjectRequestResponse = (ApiDataSubjectRequestResponse) objSubmitDataAccessRequest;
            }
            applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PersonalDataRequestDuxo.submitRequest$lambda$2(apiDataSubjectRequestResponse, (PersonalDataRequestViewState) obj);
                }
            });
        } catch (Exception e) {
            final ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(e);
            if (errorResponseExtractErrorResponse instanceof ChallengeErrorResponse) {
                applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalDataRequestDuxo.submitRequest$lambda$3(errorResponseExtractErrorResponse, (PersonalDataRequestViewState) obj);
                    }
                });
            } else {
                applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDuxo$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalDataRequestDuxo.submitRequest$lambda$4((PersonalDataRequestViewState) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataRequestViewState submitRequest$lambda$1(PersonalDataRequestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PersonalDataRequestViewState.Loading.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataRequestViewState submitRequest$lambda$2(ApiDataSubjectRequestResponse apiDataSubjectRequestResponse, PersonalDataRequestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (apiDataSubjectRequestResponse.getIsSuccessful()) {
            return PersonalDataRequestViewState.Success.INSTANCE;
        }
        return PersonalDataRequestViewState.Failure.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataRequestViewState submitRequest$lambda$3(ErrorResponse errorResponse, PersonalDataRequestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new PersonalDataRequestViewState.ChallengeReceived(((ChallengeErrorResponse) errorResponse).getChallenge());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataRequestViewState submitRequest$lambda$4(PersonalDataRequestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PersonalDataRequestViewState.Failure.INSTANCE;
    }
}
