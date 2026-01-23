package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.creditcard.p091ui.creditapplication.terms.TermsFragment;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.prefs.CreditApplicationIdPref;
import com.robinhood.android.lib.store.creditcard.prefs.IdentityIdPref;
import com.robinhood.android.models.creditcard.api.IdentityActionType;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationResponse2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: TermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B?\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0017\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PageEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "onContinue", "state", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;", "onContinue$feature_credit_card_externalDebug", "authExchange", "createCreditApp", "underwrite", "creditAppId", "", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class TermsDuxo extends BaseDuxo5<TermsViewState, CreditApplicationDuxo9> implements HasSavedState {
    private final StringPreference creditApplicationId;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final StringPreference identityId;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsDuxo(CreditCardStore creditCardStore, @IdentityIdPref StringPreference identityId, @CreditApplicationIdPref StringPreference creditApplicationId, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new TermsViewState(false, false, null, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.creditCardStore = creditCardStore;
        this.identityId = identityId;
        this.creditApplicationId = creditApplicationId;
        this.defaultDispatcher = defaultDispatcher;
        this.savedStateHandle = savedStateHandle;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new TermsDuxo2(null));
    }

    public final void onContinue$feature_credit_card_externalDebug(CreateCreditApplicationRequest state) {
        applyMutation(new TermsDuxo3(null));
        if (this.creditApplicationId.get() != null) {
            applyMutation(new TermsDuxo4(null));
            submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
        } else if (this.identityId.get() != null) {
            createCreditApp(state);
        } else {
            authExchange(state);
        }
    }

    /* compiled from: TermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$authExchange$1", m3645f = "TermsDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$authExchange$1 */
    static final class C126021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CreateCreditApplicationRequest $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126021(CreateCreditApplicationRequest createCreditApplicationRequest, Continuation<? super C126021> continuation) {
            super(2, continuation);
            this.$state = createCreditApplicationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TermsDuxo.this.new C126021(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreditCardStore creditCardStore = TermsDuxo.this.creditCardStore;
                    this.label = 1;
                    obj = creditCardStore.getAuthExchange(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    TermsDuxo.this.identityId.set(str);
                    TermsDuxo.this.createCreditApp(this.$state);
                } else {
                    Timber.INSTANCE.mo3353e("authExchange failed to return identityId", new Object[0]);
                    TermsDuxo.this.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                Timber.INSTANCE.mo3355e(th, "authExchange error", new Object[0]);
                TermsDuxo.this.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    private final void authExchange(CreateCreditApplicationRequest state) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C126021(state, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createCreditApp(CreateCreditApplicationRequest state) {
        if (state == null) {
            state = ((TermsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIdentityState();
        }
        if (state != null) {
            if (state.getCloseAuthorizedUserOverride() || ((TermsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAuthUser() == null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C126042(state, null), 2, null);
                return;
            } else {
                applyMutation(new C126031(null));
                return;
            }
        }
        if (this.creditApplicationId.get() != null) {
            String str = this.creditApplicationId.get();
            Intrinsics.checkNotNull(str);
            underwrite(str);
            return;
        }
        submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
    }

    /* compiled from: TermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$1", m3645f = "TermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$1 */
    static final class C126031 extends ContinuationImpl7 implements Function2<TermsViewState, Continuation<? super TermsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126031(Continuation<? super C126031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126031 c126031 = new C126031(continuation);
            c126031.L$0 = obj;
            return c126031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TermsViewState termsViewState, Continuation<? super TermsViewState> continuation) {
            return ((C126031) create(termsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TermsViewState.copy$default((TermsViewState) this.L$0, false, false, CreateCreditApplicationResponse2.AUTHORIZED_USER_CONFLICT, 2, null);
        }
    }

    /* compiled from: TermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$2", m3645f = "TermsDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$2 */
    static final class C126042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CreateCreditApplicationRequest $req;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126042(CreateCreditApplicationRequest createCreditApplicationRequest, Continuation<? super C126042> continuation) {
            super(2, continuation);
            this.$req = createCreditApplicationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TermsDuxo.this.new C126042(this.$req, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CreateCreditApplicationResponse.Response createCreditApplication;
            CreateCreditApplicationResponse.Response createCreditApplication2;
            CreateCreditApplicationResponse.Response.DataType data;
            CreateCreditApplicationResponse.Response.DataType.IdType creditApplication;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreditCardStore creditCardStore = TermsDuxo.this.creditCardStore;
                    CreateCreditApplicationRequest createCreditApplicationRequest = this.$req;
                    this.label = 1;
                    obj = creditCardStore.createCreditApplication(createCreditApplicationRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CreateCreditApplicationResponse createCreditApplicationResponse = (CreateCreditApplicationResponse) obj;
                String id = (createCreditApplicationResponse == null || (createCreditApplication2 = createCreditApplicationResponse.getCreateCreditApplication()) == null || (data = createCreditApplication2.getData()) == null || (creditApplication = data.getCreditApplication()) == null) ? null : creditApplication.getId();
                List<CreateCreditApplicationResponse2> errors = (createCreditApplicationResponse == null || (createCreditApplication = createCreditApplicationResponse.getCreateCreditApplication()) == null) ? null : createCreditApplication.getErrors();
                if (id != null) {
                    TermsDuxo.this.underwrite(id);
                } else {
                    List<CreateCreditApplicationResponse2> list = errors;
                    if (list != null && !list.isEmpty()) {
                        Timber.INSTANCE.mo3353e(errors.get(0).toString(), new Object[0]);
                        TermsDuxo.this.applyMutation(new AnonymousClass1(errors, null));
                    } else {
                        Timber.INSTANCE.mo3353e("createCreditApplication failed to return a creditAppId", new Object[0]);
                        TermsDuxo.this.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
                    }
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                Timber.INSTANCE.mo3355e(th, "createCreditApplication error", new Object[0]);
                TermsDuxo.this.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$2$1", m3645f = "TermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$createCreditApp$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TermsViewState, Continuation<? super TermsViewState>, Object> {
            final /* synthetic */ List<CreateCreditApplicationResponse2> $errors;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<? extends CreateCreditApplicationResponse2> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$errors = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$errors, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TermsViewState termsViewState, Continuation<? super TermsViewState> continuation) {
                return ((AnonymousClass1) create(termsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TermsViewState.copy$default((TermsViewState) this.L$0, false, false, this.$errors.get(0), 2, null);
            }
        }
    }

    /* compiled from: TermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$underwrite$1", m3645f = "TermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$underwrite$1 */
    static final class C126051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $creditAppId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126051(String str, Continuation<? super C126051> continuation) {
            super(2, continuation);
            this.$creditAppId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TermsDuxo.this.new C126051(this.$creditAppId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TermsDuxo.this.creditApplicationId.set(this.$creditAppId);
                TermsDuxo.this.creditCardStore.log(IdentityActionType.RH_APPLICATION_TERMS_AND_CONDITIONS_ACCEPTED);
                TermsDuxo.this.applyMutation(new AnonymousClass1(null));
                TermsDuxo.this.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$underwrite$1$1", m3645f = "TermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsDuxo$underwrite$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TermsViewState, Continuation<? super TermsViewState>, Object> {
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
            public final Object invoke(TermsViewState termsViewState, Continuation<? super TermsViewState> continuation) {
                return ((AnonymousClass1) create(termsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TermsViewState.copy$default((TermsViewState) this.L$0, false, true, null, 5, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void underwrite(String creditAppId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C126051(creditAppId, null), 2, null);
    }

    /* compiled from: TermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TermsDuxo, TermsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TermsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (TermsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TermsFragment.Args getArgs(TermsDuxo termsDuxo) {
            return (TermsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, termsDuxo);
        }
    }
}
