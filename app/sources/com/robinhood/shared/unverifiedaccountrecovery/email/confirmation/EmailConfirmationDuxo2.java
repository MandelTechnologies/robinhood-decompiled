package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo;
import com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmailConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1", m3645f = "EmailConfirmationDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EmailConfirmationDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EmailConfirmationInputOption $option;
    int label;
    final /* synthetic */ EmailConfirmationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailConfirmationDuxo2(EmailConfirmationDuxo emailConfirmationDuxo, EmailConfirmationInputOption emailConfirmationInputOption, Continuation<? super EmailConfirmationDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = emailConfirmationDuxo;
        this.$option = emailConfirmationInputOption;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailConfirmationDuxo2(this.this$0, this.$option, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailConfirmationDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1$1", m3645f = "EmailConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1$1 */
    static final class C411691 extends ContinuationImpl7 implements Function2<EmailConfirmationDataState, Continuation<? super EmailConfirmationDataState>, Object> {
        final /* synthetic */ EmailConfirmationInputOption $option;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411691(EmailConfirmationInputOption emailConfirmationInputOption, Continuation<? super C411691> continuation) {
            super(2, continuation);
            this.$option = emailConfirmationInputOption;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C411691 c411691 = new C411691(this.$option, continuation);
            c411691.L$0 = obj;
            return c411691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailConfirmationDataState emailConfirmationDataState, Continuation<? super EmailConfirmationDataState> continuation) {
            return ((C411691) create(emailConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailConfirmationDataState.copy$default((EmailConfirmationDataState) this.L$0, null, this.$option, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EmailConfirmationDuxo2 emailConfirmationDuxo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C411691(this.$option, null));
            PathfinderStore pathfinderStore = this.this$0.pathfinderStore;
            EmailConfirmationDuxo.Companion companion = EmailConfirmationDuxo.INSTANCE;
            UUID inquiryId = ((EmailConfirmationFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
            int sequence = ((EmailConfirmationFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
            UserViewInput userInput = EmailConfirmationInputOption2.toUserInput(this.$option, companion.getArgs((HasSavedState) this.this$0) instanceof EmailConfirmationFragmentKey.ObfuscatedEmailV3);
            EmailConfirmationDuxo3 emailConfirmationDuxo3 = new EmailConfirmationDuxo3(this.this$0);
            this.label = 1;
            emailConfirmationDuxo2 = this;
            obj = pathfinderStore.handleUserInput(inquiryId, sequence, userInput, emailConfirmationDuxo3, emailConfirmationDuxo2);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            emailConfirmationDuxo2 = this;
        }
        UserViewState userViewState = (UserViewState) obj;
        emailConfirmationDuxo2.this$0.applyMutation(new C411702(null));
        if (userViewState != null && emailConfirmationDuxo2.$option == EmailConfirmationInputOption.LOGIN) {
            emailConfirmationDuxo2.this$0.submit(EmailConfirmationEvent.RouteToLogin.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1$2", m3645f = "EmailConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationDuxo$sendUserInput$1$2 */
    static final class C411702 extends ContinuationImpl7 implements Function2<EmailConfirmationDataState, Continuation<? super EmailConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C411702(Continuation<? super C411702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C411702 c411702 = new C411702(continuation);
            c411702.L$0 = obj;
            return c411702;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailConfirmationDataState emailConfirmationDataState, Continuation<? super EmailConfirmationDataState> continuation) {
            return ((C411702) create(emailConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailConfirmationDataState.copy$default((EmailConfirmationDataState) this.L$0, null, null, 1, null);
        }
    }
}
