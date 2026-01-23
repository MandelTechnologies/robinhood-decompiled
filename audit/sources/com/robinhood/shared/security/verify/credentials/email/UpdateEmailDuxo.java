package com.robinhood.shared.security.verify.credentials.email;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.verify.credentials.C39685R;
import com.robinhood.shared.security.verify.credentials.email.UpdateEmailEvent;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UpdateEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailViewState;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "hasConsentedToDisclosure", "", "getHasConsentedToDisclosure$feature_verify_credentials_externalDebug$annotations", "()V", "getHasConsentedToDisclosure$feature_verify_credentials_externalDebug", "()Z", "setHasConsentedToDisclosure$feature_verify_credentials_externalDebug", "(Z)V", "onPrimaryCtaClicked", "", "email", "", "submitConsentAndEmail", "updateEmail", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class UpdateEmailDuxo extends BaseDuxo5<UpdateEmailViewState, UpdateEmailEvent> {
    public static final int $stable = 8;
    private final AppType appType;
    private boolean hasConsentedToDisclosure;
    private final Identi identi;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* compiled from: UpdateEmailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getHasConsentedToDisclosure$feature_verify_credentials_externalDebug$annotations */
    public static /* synthetic */ void m2836x5a00614f() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEmailDuxo(AppType appType, Identi identi2, SuvWorkflowManager suvWorkflowManager, UserStore userStore, DuxoBundle duxoBundle) {
        super(new UpdateEmailViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.identi = identi2;
        this.suvWorkflowManager = suvWorkflowManager;
        this.userStore = userStore;
    }

    /* renamed from: getHasConsentedToDisclosure$feature_verify_credentials_externalDebug, reason: from getter */
    public final boolean getHasConsentedToDisclosure() {
        return this.hasConsentedToDisclosure;
    }

    /* renamed from: setHasConsentedToDisclosure$feature_verify_credentials_externalDebug */
    public final void m2838x6eacf7c3(boolean z) {
        this.hasConsentedToDisclosure = z;
    }

    public final void onPrimaryCtaClicked(String email) {
        int i;
        Intrinsics.checkNotNullParameter(email, "email");
        if (!this.hasConsentedToDisclosure) {
            if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
                i = C39685R.string.update_email_privacy_disclosure_message_rhc;
            } else {
                i = C39685R.string.update_email_privacy_disclosure_message;
            }
            submit(new UpdateEmailEvent.ShowPrivacyDisclosureDialog(i));
            return;
        }
        submitConsentAndEmail(email);
    }

    /* compiled from: UpdateEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1", m3645f = "UpdateEmailDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1 */
    static final class C397321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397321(String str, Continuation<? super C397321> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateEmailDuxo.this.new C397321(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdateEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1$1", m3645f = "UpdateEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UpdateEmailViewState, Continuation<? super UpdateEmailViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UpdateEmailViewState updateEmailViewState, Continuation<? super UpdateEmailViewState> continuation) {
                return ((AnonymousClass1) create(updateEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UpdateEmailViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UpdateEmailDuxo.this.applyMutation(new AnonymousClass1(null));
                    Identi identi2 = UpdateEmailDuxo.this.identi;
                    ApiUserAgreement.Request emailVerification = ApiUserAgreement.Request.INSTANCE.getEmailVerification();
                    this.label = 1;
                    if (identi2.agreeToUserAgreement(emailVerification, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UpdateEmailDuxo.this.m2838x6eacf7c3(true);
                UpdateEmailDuxo.this.updateEmail(this.$email);
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    UpdateEmailDuxo.this.applyMutation(new AnonymousClass2(null));
                    UpdateEmailDuxo.this.submit(new UpdateEmailEvent.Error(th));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UpdateEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1$2", m3645f = "UpdateEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$submitConsentAndEmail$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UpdateEmailViewState, Continuation<? super UpdateEmailViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UpdateEmailViewState updateEmailViewState, Continuation<? super UpdateEmailViewState> continuation) {
                return ((AnonymousClass2) create(updateEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UpdateEmailViewState) this.L$0).copy(false);
            }
        }
    }

    public final void submitConsentAndEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397321(email, null), 3, null);
    }

    /* compiled from: UpdateEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$updateEmail$1", m3645f = "UpdateEmailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$updateEmail$1 */
    static final class C397331 extends ContinuationImpl7 implements Function1<Continuation<? super User>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397331(String str, Continuation<? super C397331> continuation) {
            super(1, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UpdateEmailDuxo.this.new C397331(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super User> continuation) {
            return ((C397331) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdateEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$updateEmail$1$1", m3645f = "UpdateEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$updateEmail$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UpdateEmailViewState, Continuation<? super UpdateEmailViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UpdateEmailViewState updateEmailViewState, Continuation<? super UpdateEmailViewState> continuation) {
                return ((AnonymousClass1) create(updateEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UpdateEmailViewState) this.L$0).copy(true);
            }
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
            UpdateEmailDuxo.this.applyMutation(new AnonymousClass1(null));
            UserStore userStore = UpdateEmailDuxo.this.userStore;
            String str = this.$email;
            this.label = 1;
            Object objUpdateEmailAddress = userStore.updateEmailAddress(str, this);
            return objUpdateEmailAddress == coroutine_suspended ? coroutine_suspended : objUpdateEmailAddress;
        }
    }

    public final void updateEmail(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.suvWorkflowManager.handleRequest(new C397331(email, null), new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateEmailDuxo.updateEmail$lambda$0(this.f$0, email, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateEmailDuxo.updateEmail$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UpdateEmailDuxo.updateEmail$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateEmail$lambda$0(UpdateEmailDuxo updateEmailDuxo, String str, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        updateEmailDuxo.applyMutation(new UpdateEmailDuxo2(null));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        updateEmailDuxo.submit(new UpdateEmailEvent.Success(lowerCase));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateEmail$lambda$1(UpdateEmailDuxo updateEmailDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        updateEmailDuxo.applyMutation(new UpdateEmailDuxo3(null));
        updateEmailDuxo.submit(new UpdateEmailEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateEmail$lambda$2(UpdateEmailDuxo updateEmailDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        updateEmailDuxo.applyMutation(new UpdateEmailDuxo4(null));
        updateEmailDuxo.submit(new UpdateEmailEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }
}
