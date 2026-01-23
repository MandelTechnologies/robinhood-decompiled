package com.robinhood.android.doc.serverdriven.splash;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.splash.SddrSplashViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SddrSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrSplashDuxo extends BaseDuxo5<SddrSplashViewState, SddrSplashErrorEvent> implements HasSavedState {
    public static final String NO_ALLOWED_CAPTURE_METHODS_MESSAGE = "No allowed capture methods found.";
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrSplashDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(SddrSplashViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C143211(null));
    }

    /* compiled from: SddrSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.splash.SddrSplashDuxo$onCreate$1", m3645f = "SddrSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.splash.SddrSplashDuxo$onCreate$1 */
    static final class C143211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143211(Continuation<? super C143211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrSplashDuxo.this.new C143211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            Tuples2 tuples2M3642to;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = ((SddrDestination.Splash) SddrSplashDuxo.INSTANCE.getArgs((HasSavedState) SddrSplashDuxo.this)).getContent().getAllowedCaptureMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ApiDocumentRequest.AllowedCaptureMethods) next) == ApiDocumentRequest.AllowedCaptureMethods.FILE_UPLOAD) {
                    break;
                }
            }
            ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods = (ApiDocumentRequest.AllowedCaptureMethods) next;
            Iterator<T> it2 = ((SddrDestination.Splash) SddrSplashDuxo.INSTANCE.getArgs((HasSavedState) SddrSplashDuxo.this)).getContent().getAllowedCaptureMethods().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((ApiDocumentRequest.AllowedCaptureMethods) next2) == ApiDocumentRequest.AllowedCaptureMethods.CAMERA) {
                    break;
                }
            }
            ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods2 = (ApiDocumentRequest.AllowedCaptureMethods) next2;
            if (allowedCaptureMethods == null && allowedCaptureMethods2 != null) {
                tuples2M3642to = Tuples4.m3642to(allowedCaptureMethods2, null);
            } else if (allowedCaptureMethods != null && allowedCaptureMethods2 == null) {
                tuples2M3642to = Tuples4.m3642to(allowedCaptureMethods, null);
            } else if (allowedCaptureMethods != null && allowedCaptureMethods2 != null) {
                tuples2M3642to = Tuples4.m3642to(allowedCaptureMethods, allowedCaptureMethods2);
            } else {
                SddrSplashDuxo.this.submit(new SddrSplashErrorEvent(SddrSplashDuxo.NO_ALLOWED_CAPTURE_METHODS_MESSAGE));
                return Unit.INSTANCE;
            }
            ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods3 = (ApiDocumentRequest.AllowedCaptureMethods) tuples2M3642to.component1();
            ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods4 = (ApiDocumentRequest.AllowedCaptureMethods) tuples2M3642to.component2();
            SddrSplashDuxo sddrSplashDuxo = SddrSplashDuxo.this;
            sddrSplashDuxo.applyMutation(new AnonymousClass1(sddrSplashDuxo, allowedCaptureMethods3, allowedCaptureMethods4, null));
            return Unit.INSTANCE;
        }

        /* compiled from: SddrSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.splash.SddrSplashDuxo$onCreate$1$1", m3645f = "SddrSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.serverdriven.splash.SddrSplashDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SddrSplashViewState, Continuation<? super SddrSplashViewState>, Object> {
            final /* synthetic */ ApiDocumentRequest.AllowedCaptureMethods $primary;
            final /* synthetic */ ApiDocumentRequest.AllowedCaptureMethods $secondary;
            int label;
            final /* synthetic */ SddrSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SddrSplashDuxo sddrSplashDuxo, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sddrSplashDuxo;
                this.$primary = allowedCaptureMethods;
                this.$secondary = allowedCaptureMethods2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$primary, this.$secondary, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SddrSplashViewState sddrSplashViewState, Continuation<? super SddrSplashViewState> continuation) {
                return ((AnonymousClass1) create(sddrSplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new SddrSplashViewState.Loaded(((SddrDestination.Splash) SddrSplashDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getContent().getContent(), this.$primary, this.$secondary);
            }
        }
    }

    /* compiled from: SddrSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashDuxo;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Splash;", "<init>", "()V", "NO_ALLOWED_CAPTURE_METHODS_MESSAGE", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrSplashDuxo, SddrDestination.Splash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.Splash getArgs(SavedStateHandle savedStateHandle) {
            return (SddrDestination.Splash) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.Splash getArgs(SddrSplashDuxo sddrSplashDuxo) {
            return (SddrDestination.Splash) DuxoCompanion.DefaultImpls.getArgs(this, sddrSplashDuxo);
        }
    }
}
