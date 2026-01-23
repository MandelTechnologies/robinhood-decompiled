package com.robinhood.android.acatsin.agreement;

import bonfire.proto.idl.acats.p027v1.AcatsService;
import bonfire.proto.idl.acats.p027v1.ConfirmPendingJointAccountACATSRequestDto;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementEvent;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementViewState;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.HasSavedState;
import java.util.UUID;
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

/* compiled from: AcatsInAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$signAgreement$1$1$2", m3645f = "AcatsInAgreementDuxo.kt", m3646l = {66, 76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$signAgreement$1$1$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAgreementDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AcatsInAgreementViewState.Loaded $loadedState;
    int label;
    final /* synthetic */ AcatsInAgreementDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAgreementDuxo3(AcatsInAgreementDuxo acatsInAgreementDuxo, AcatsInAgreementViewState.Loaded loaded, Continuation<? super AcatsInAgreementDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = acatsInAgreementDuxo;
        this.$loadedState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInAgreementDuxo3(this.this$0, this.$loadedState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInAgreementDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r1.ConfirmPendingJointAccountACATS(r3, r11) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: Exception -> 0x0078, TryCatch #1 {Exception -> 0x0078, blocks: (B:31:0x0083, B:20:0x0043, B:22:0x004b, B:24:0x005b, B:29:0x007b, B:30:0x0082, B:17:0x003c), top: B:40:0x003c }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        AcatsInAgreementDuxo3 acatsInAgreementDuxo3;
        AgreementsStore agreementsStore;
        UiAgreementWithContent acatsAgreement;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                agreementsStore = this.this$0.agreementsStore;
                acatsAgreement = this.$loadedState.getAcatsAgreement();
                this.label = 1;
                acatsInAgreementDuxo3 = this;
            } catch (Exception e) {
                e = e;
                acatsInAgreementDuxo3 = this;
            }
            try {
                if (AgreementsStore.signAgreement$default(agreementsStore, acatsAgreement, null, null, acatsInAgreementDuxo3, 6, null) != coroutine_suspended) {
                    if (acatsInAgreementDuxo3.$loadedState.isCoOwnerFlow()) {
                    }
                    acatsInAgreementDuxo3.this$0.submit(AcatsInAgreementEvent.AgreementSigned.INSTANCE);
                }
                return coroutine_suspended;
            } catch (Exception e2) {
                e = e2;
                exc = e;
                acatsInAgreementDuxo3.this$0.submit(new AcatsInAgreementEvent.AgreementError(exc));
                acatsInAgreementDuxo3.this$0.applyMutation(new C77671(acatsInAgreementDuxo3.$loadedState, null));
                return Unit.INSTANCE;
            }
        }
        try {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                acatsInAgreementDuxo3 = this;
                if (acatsInAgreementDuxo3.$loadedState.isCoOwnerFlow()) {
                    UUID acatsId = ((AcatsInAgreementContract.Key) AcatsInAgreementDuxo.INSTANCE.getArgs((HasSavedState) acatsInAgreementDuxo3.this$0)).getAcatsId();
                    if (acatsId != null) {
                        AcatsService acatsService = acatsInAgreementDuxo3.this$0.acatsService;
                        String string2 = acatsId.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        ConfirmPendingJointAccountACATSRequestDto confirmPendingJointAccountACATSRequestDto = new ConfirmPendingJointAccountACATSRequestDto(string2);
                        acatsInAgreementDuxo3.label = 2;
                    } else {
                        throw new IllegalStateException("ACATS ID is required for co-owner flow");
                    }
                }
                acatsInAgreementDuxo3.this$0.submit(AcatsInAgreementEvent.AgreementSigned.INSTANCE);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                acatsInAgreementDuxo3 = this;
                acatsInAgreementDuxo3.this$0.submit(AcatsInAgreementEvent.AgreementSigned.INSTANCE);
            }
        } catch (Exception e3) {
            exc = e3;
            acatsInAgreementDuxo3 = this;
            acatsInAgreementDuxo3.this$0.submit(new AcatsInAgreementEvent.AgreementError(exc));
            acatsInAgreementDuxo3.this$0.applyMutation(new C77671(acatsInAgreementDuxo3.$loadedState, null));
            return Unit.INSTANCE;
        }
        acatsInAgreementDuxo3.this$0.applyMutation(new C77671(acatsInAgreementDuxo3.$loadedState, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$signAgreement$1$1$2$1", m3645f = "AcatsInAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementDuxo$signAgreement$1$1$2$1 */
    static final class C77671 extends ContinuationImpl7 implements Function2<AcatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState>, Object> {
        final /* synthetic */ AcatsInAgreementViewState.Loaded $loadedState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77671(AcatsInAgreementViewState.Loaded loaded, Continuation<? super C77671> continuation) {
            super(2, continuation);
            this.$loadedState = loaded;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C77671(this.$loadedState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAgreementViewState acatsInAgreementViewState, Continuation<? super AcatsInAgreementViewState> continuation) {
            return ((C77671) create(acatsInAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAgreementViewState.Loaded.copy$default(this.$loadedState, false, false, false, null, null, 27, null);
        }
    }
}
