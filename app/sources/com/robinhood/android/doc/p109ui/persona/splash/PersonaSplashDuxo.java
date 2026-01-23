package com.robinhood.android.doc.p109ui.persona.splash;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.doc.p109ui.persona.splash.PersonaSplashDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.contracts.PersonaSplashIntentKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PersonaSplashDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent;", "Lcom/robinhood/android/udf/HasSavedState;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onAlertPrimaryCtaClicked", "", "onAlertSecondaryCtaClicked", "onPrimaryCtaClicked", "onSecondaryCtaClicked", "onErrorAlertDismissed", "showThanksScreenOrExit", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo, reason: use source file name */
/* loaded from: classes7.dex */
public final class PersonaSplashDuxo extends BaseDuxo5<VerifyIdentitySplashViewState, PersonaSplashDuxo2> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final DocumentRequestStore store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaSplashDuxo(DocumentRequestStore store, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new VerifyIdentitySplashViewState(false, false, false, false, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.store = store;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onAlertPrimaryCtaClicked() {
        showThanksScreenOrExit();
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onAlertSecondaryCtaClicked$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onAlertSecondaryCtaClicked$1 */
    static final class C143861 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143861(Continuation<? super C143861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143861 c143861 = new C143861(continuation);
            c143861.L$0 = obj;
            return c143861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
            return ((C143861) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, false, false, false, 13, null);
        }
    }

    public final void onAlertSecondaryCtaClicked() {
        applyMutation(new C143861(null));
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1 */
    static final class C143881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143881(Continuation<? super C143881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaSplashDuxo.this.new C143881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PersonaSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
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
            public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
                return ((AnonymousClass1) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, true, false, false, false, 14, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C143881 c143881;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PersonaSplashDuxo.this.applyMutation(new AnonymousClass1(null));
                    DocumentRequestStore documentRequestStore = PersonaSplashDuxo.this.store;
                    ApiDocumentRequest.State state = ApiDocumentRequest.State.PENDING_UPLOAD;
                    this.label = 1;
                    c143881 = this;
                    try {
                        obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c143881, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception unused) {
                        PersonaSplashDuxo.this.applyMutation(new AnonymousClass2(null));
                        PersonaSplashDuxo.this.applyMutation(new AnonymousClass3(null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c143881 = this;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    List<ApiDocumentRequest.Reason> reasons = ((DocumentRequest) obj2).getReasons();
                    if (!(reasons instanceof Collection) || !reasons.isEmpty()) {
                        Iterator<T> it = reasons.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (ApiDocumentRequest.Reason.INSTANCE.getONBOARDING_SUPPORTED_REASONS().contains((ApiDocumentRequest.Reason) it.next())) {
                                    arrayList.add(obj2);
                                    break;
                                }
                            }
                        }
                    }
                }
                PersonaSplashDuxo.this.submit(new PersonaSplashDuxo2.DocumentRequestLoadingFinished(arrayList));
            } catch (Exception unused2) {
                c143881 = this;
            }
            PersonaSplashDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PersonaSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$2", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
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
            public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
                return ((AnonymousClass2) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, false, true, false, 11, null);
            }
        }

        /* compiled from: PersonaSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$3", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onPrimaryCtaClicked$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
                return ((AnonymousClass3) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, false, false, false, 14, null);
            }
        }
    }

    public final void onPrimaryCtaClicked() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C143881(null), 3, null);
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onSecondaryCtaClicked$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onSecondaryCtaClicked$1 */
    static final class C143891 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143891(Continuation<? super C143891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143891 c143891 = new C143891(continuation);
            c143891.L$0 = obj;
            return c143891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
            return ((C143891) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, true, false, false, 13, null);
        }
    }

    public final void onSecondaryCtaClicked() {
        applyMutation(new C143891(null));
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onErrorAlertDismissed$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$onErrorAlertDismissed$1 */
    static final class C143871 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143871(Continuation<? super C143871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143871 c143871 = new C143871(continuation);
            c143871.L$0 = obj;
            return c143871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
            return ((C143871) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, false, false, false, 11, null);
        }
    }

    public final void onErrorAlertDismissed() {
        applyMutation(new C143871(null));
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$showThanksScreenOrExit$1", m3645f = "PersonaSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$showThanksScreenOrExit$1 */
    static final class C143901 extends ContinuationImpl7 implements Function2<VerifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143901(Continuation<? super C143901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143901 c143901 = new C143901(continuation);
            c143901.L$0 = obj;
            return c143901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyIdentitySplashViewState verifyIdentitySplashViewState, Continuation<? super VerifyIdentitySplashViewState> continuation) {
            return ((C143901) create(verifyIdentitySplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyIdentitySplashViewState.copy$default((VerifyIdentitySplashViewState) this.L$0, false, false, false, true, 7, null);
        }
    }

    public final void showThanksScreenOrExit() {
        if (((PersonaSplashIntentKey) INSTANCE.getExtras((HasSavedState) this)).getStyle().getShowThankYouScreen()) {
            applyMutation(new C143901(null));
        } else {
            submit(PersonaSplashDuxo2.FinishFlow.INSTANCE);
        }
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashDuxo;", "Lcom/robinhood/shared/documents/contracts/PersonaSplashIntentKey;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashDuxo$Companion, reason: from kotlin metadata */
    public static final class Companion implements DuxoCompanion2<PersonaSplashDuxo, PersonaSplashIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PersonaSplashIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (PersonaSplashIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PersonaSplashIntentKey getExtras(PersonaSplashDuxo personaSplashDuxo) {
            return (PersonaSplashIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, personaSplashDuxo);
        }
    }
}
