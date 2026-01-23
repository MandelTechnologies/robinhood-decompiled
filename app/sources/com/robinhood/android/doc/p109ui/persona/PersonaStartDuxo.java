package com.robinhood.android.doc.p109ui.persona;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.doc.experiments.PrismExperiments;
import com.robinhood.android.doc.experiments.PrismExperiments2;
import com.robinhood.android.doc.p109ui.persona.PersonaStartEvent;
import com.robinhood.android.doc.p109ui.persona.PersonaStartFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.SelfieConsentRequest;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PersonaStartDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "installation", "Lcom/robinhood/prefs/Installation;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "markwon", "Lio/noties/markwon/Markwon;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/api/retrofit/PathfinderApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/agreements/AgreementsStore;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getIdenti", "()Lcom/robinhood/api/retrofit/Identi;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitJob", "Lkotlinx/coroutines/Job;", "personaAgreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "isInPrismCollectionExperiment", "", "onStart", "", "signUserAgreement", "submitAgreement", "submitSkipBiometric", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PersonaStartDuxo extends BaseDuxo5<PersonaStartViewState, PersonaStartEvent> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final AuthManager authManager;
    private final ExperimentsStore experimentsStore;
    private final Identi identi;
    private final Installation installation;
    private boolean isInPrismCollectionExperiment;
    private final Markwon markwon;
    private final PathfinderApi pathfinderApi;
    private UiAgreementWithContent personaAgreement;
    private final SavedStateHandle savedStateHandle;
    private Job submitJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final Identi getIdenti() {
        return this.identi;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaStartDuxo(Identi identi2, PathfinderApi pathfinderApi, Installation installation, AuthManager authManager, AgreementsStore agreementsStore, Markwon markwon, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new PersonaStartViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.identi = identi2;
        this.pathfinderApi = pathfinderApi;
        this.installation = installation;
        this.authManager = authManager;
        this.agreementsStore = agreementsStore;
        this.markwon = markwon;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (this.authManager.isLoggedIn()) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143711(null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143722(null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143733(null), 3, null);
        }
    }

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$1", m3645f = "PersonaStartDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$1 */
    static final class C143711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143711(Continuation<? super C143711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaStartDuxo.this.new C143711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AgreementsStore agreementsStore = PersonaStartDuxo.this.agreementsStore;
                this.label = 1;
                obj = agreementsStore.getAgreementWithContent(ApiUserAgreement.TYPE_PERSONA_SELFIE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) obj;
            PersonaStartDuxo.this.personaAgreement = uiAgreementWithContent;
            PersonaStartDuxo personaStartDuxo = PersonaStartDuxo.this;
            personaStartDuxo.applyMutation(new AnonymousClass1(personaStartDuxo, uiAgreementWithContent, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PersonaStartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$1$1", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PersonaStartViewState, Continuation<? super PersonaStartViewState>, Object> {
            final /* synthetic */ UiAgreementWithContent $agreement;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PersonaStartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PersonaStartDuxo personaStartDuxo, UiAgreementWithContent uiAgreementWithContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = personaStartDuxo;
                this.$agreement = uiAgreementWithContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$agreement, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PersonaStartViewState personaStartViewState, Continuation<? super PersonaStartViewState> continuation) {
                return ((AnonymousClass1) create(personaStartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((PersonaStartViewState) this.L$0).copy(false, this.this$0.markwon.render(this.this$0.markwon.mo17577parse(this.$agreement.getContent())));
            }
        }
    }

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$2", m3645f = "PersonaStartDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$2 */
    static final class C143722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143722(Continuation<? super C143722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaStartDuxo.this.new C143722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PersonaStartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$2$1", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PersonaStartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PersonaStartDuxo personaStartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = personaStartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.isInPrismCollectionExperiment = this.Z$0;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(PersonaStartDuxo.this.experimentsStore, new Experiment[]{PrismExperiments.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PersonaStartDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$3", m3645f = "PersonaStartDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$3 */
    static final class C143733 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C143733(Continuation<? super C143733> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaStartDuxo.this.new C143733(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143733) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C143733 c143733;
            PersonaStartDuxo personaStartDuxo;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonaStartDuxo personaStartDuxo2 = PersonaStartDuxo.this;
                ExperimentsStore experimentsStore = personaStartDuxo2.experimentsStore;
                PrismExperiments2 prismExperiments2 = PrismExperiments2.INSTANCE;
                this.L$0 = personaStartDuxo2;
                this.label = 1;
                c143733 = this;
                Object objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, prismExperiments2, false, c143733, 2, null);
                if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                personaStartDuxo = personaStartDuxo2;
                value = objM22650coGetState0E7RQCE$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                personaStartDuxo = (PersonaStartDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
                c143733 = this;
            }
            Boolean boolBoxBoolean = boxing.boxBoolean(false);
            if (Result.m28555isFailureimpl(value)) {
                value = boolBoxBoolean;
            }
            personaStartDuxo.isInPrismCollectionExperiment = ((Boolean) value).booleanValue();
            PersonaStartDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PersonaStartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$3$1", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PersonaStartViewState, Continuation<? super PersonaStartViewState>, Object> {
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
            public final Object invoke(PersonaStartViewState personaStartViewState, Continuation<? super PersonaStartViewState> continuation) {
                return ((AnonymousClass1) create(personaStartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PersonaStartViewState.copy$default((PersonaStartViewState) this.L$0, false, null, 2, null);
            }
        }
    }

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1", m3645f = "PersonaStartDuxo.kt", m3646l = {87, 89, 91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1 */
    static final class C143741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143741(Continuation<? super C143741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaStartDuxo.this.new C143741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PersonaStartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1$1", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PersonaStartViewState, Continuation<? super PersonaStartViewState>, Object> {
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
            public final Object invoke(PersonaStartViewState personaStartViewState, Continuation<? super PersonaStartViewState> continuation) {
                return ((AnonymousClass1) create(personaStartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PersonaStartViewState.copy$default((PersonaStartViewState) this.L$0, true, null, 2, null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
        
            if (r14.sendSelfieConsent(r3, r6, r13) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            C143741 c143741;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PersonaStartDuxo.this.applyMutation(new AnonymousClass1(null));
                    try {
                        UiAgreementWithContent uiAgreementWithContent = PersonaStartDuxo.this.personaAgreement;
                        if (uiAgreementWithContent != null) {
                            AgreementsStore agreementsStore = PersonaStartDuxo.this.agreementsStore;
                            this.label = 1;
                            c143741 = this;
                            if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, c143741, 6, null) == coroutine_suspended) {
                            }
                            Unit unit = Unit.INSTANCE;
                            PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(false, PersonaStartDuxo.this.isInPrismCollectionExperiment, 1, null));
                        } else {
                            c143741 = this;
                            if (!PersonaStartDuxo.this.authManager.isLoggedIn()) {
                                PathfinderApi pathfinderApi = PersonaStartDuxo.this.pathfinderApi;
                                Companion companion = PersonaStartDuxo.INSTANCE;
                                UUID loggedOutUserUuid = ((PersonaStartFragment.Args) companion.getArgs((HasSavedState) PersonaStartDuxo.this)).getData().getLoggedOutUserUuid();
                                Intrinsics.checkNotNull(loggedOutUserUuid);
                                SelfieConsentRequest selfieConsentRequest = new SelfieConsentRequest(PersonaStartDuxo.this.installation.mo2745id(), ((PersonaStartFragment.Args) companion.getArgs((HasSavedState) PersonaStartDuxo.this)).getData().getSkipInquiryVerificationForUnauthedSelfieConsent());
                                c143741.label = 3;
                            } else {
                                Identi identi2 = PersonaStartDuxo.this.getIdenti();
                                ApiUserAgreement.Request persona = ApiUserAgreement.Request.INSTANCE.getPersona();
                                c143741.label = 2;
                                if (identi2.agreeToUserAgreement(persona, this) == coroutine_suspended) {
                                }
                                PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(false, PersonaStartDuxo.this.isInPrismCollectionExperiment, 1, null));
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        c143741 = this;
                        th = th;
                        PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementFailure(th));
                        PersonaStartDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                }
                try {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        c143741 = this;
                        Unit unit2 = Unit.INSTANCE;
                        PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(false, PersonaStartDuxo.this.isInPrismCollectionExperiment, 1, null));
                    } else if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        c143741 = this;
                        PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(false, PersonaStartDuxo.this.isInPrismCollectionExperiment, 1, null));
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        c143741 = this;
                        Unit unit3 = Unit.INSTANCE;
                        PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(false, PersonaStartDuxo.this.isInPrismCollectionExperiment, 1, null));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c143741 = this;
                    PersonaStartDuxo.this.submit(new PersonaStartEvent.SubmitConsentToAgreementFailure(th));
                    PersonaStartDuxo.this.applyMutation(new AnonymousClass2(null));
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            PersonaStartDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PersonaStartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1$2", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$signUserAgreement$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PersonaStartViewState, Continuation<? super PersonaStartViewState>, Object> {
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
            public final Object invoke(PersonaStartViewState personaStartViewState, Continuation<? super PersonaStartViewState> continuation) {
                return ((AnonymousClass2) create(personaStartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PersonaStartViewState.copy$default((PersonaStartViewState) this.L$0, false, null, 2, null);
            }
        }
    }

    private final Job signUserAgreement() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143741(null), 3, null);
    }

    public final void submitAgreement() {
        Job job = this.submitJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.submitJob = signUserAgreement();
    }

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaStartDuxo$submitSkipBiometric$1", m3645f = "PersonaStartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartDuxo$submitSkipBiometric$1 */
    static final class C143751 extends ContinuationImpl7 implements Function2<PersonaStartViewState, Continuation<? super PersonaStartViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143751(Continuation<? super C143751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143751 c143751 = new C143751(continuation);
            c143751.L$0 = obj;
            return c143751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PersonaStartViewState personaStartViewState, Continuation<? super PersonaStartViewState> continuation) {
            return ((C143751) create(personaStartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PersonaStartViewState.copy$default((PersonaStartViewState) this.L$0, false, null, 2, null);
        }
    }

    public final void submitSkipBiometric() {
        applyMutation(new C143751(null));
        submit(new PersonaStartEvent.SubmitConsentToAgreementSuccess(true, false, 2, null));
    }

    /* compiled from: PersonaStartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartDuxo;", "Lcom/robinhood/android/doc/ui/persona/PersonaStartFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PersonaStartDuxo, PersonaStartFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PersonaStartFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PersonaStartFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PersonaStartFragment.Args getArgs(PersonaStartDuxo personaStartDuxo) {
            return (PersonaStartFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, personaStartDuxo);
        }
    }
}
