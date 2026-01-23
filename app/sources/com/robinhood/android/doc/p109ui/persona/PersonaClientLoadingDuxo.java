package com.robinhood.android.doc.p109ui.persona;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.persona.PersonaClientLoadingDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.identi.ApiCreatePersonaInquiryRequest;
import com.robinhood.models.api.identi.ApiCreatePersonaInquiryResponse;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PersonaClientLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/api/docupload/DocUploadApi;Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;Lcom/robinhood/prefs/TrustedDeviceIdPref;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PersonaClientLoadingDuxo extends BaseDuxo5<Unit, PersonaClientLoadingDuxo2> implements HasSavedState {
    private final AuthManager authManager;
    private final DocUploadApi docUploadApi;
    private final LocaleConfiguration localeConfiguration;
    private final SavedStateHandle savedStateHandle;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaClientLoadingDuxo(AuthManager authManager, DocUploadApi docUploadApi, LocaleConfiguration localeConfiguration, TrustedDeviceIdPref trustedDeviceIdPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.authManager = authManager;
        this.docUploadApi = docUploadApi;
        this.localeConfiguration = localeConfiguration;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PersonaClientLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingDuxo;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaClient;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PersonaClientLoadingDuxo, DocUploadDestination.PersonaClient> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.PersonaClient getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadDestination.PersonaClient) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.PersonaClient getArgs(PersonaClientLoadingDuxo personaClientLoadingDuxo) {
            return (DocUploadDestination.PersonaClient) DuxoCompanion.DefaultImpls.getArgs(this, personaClientLoadingDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C143631(null), 3, null);
    }

    /* compiled from: PersonaClientLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaClientLoadingDuxo$onCreate$1", m3645f = "PersonaClientLoadingDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaClientLoadingDuxo$onCreate$1 */
    static final class C143631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143631(Continuation<? super C143631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaClientLoadingDuxo.this.new C143631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DocUploadApi docUploadApi = PersonaClientLoadingDuxo.this.docUploadApi;
                    Companion companion = PersonaClientLoadingDuxo.INSTANCE;
                    DocumentRequest photoIdRequest = ((DocUploadDestination.PersonaClient) companion.getArgs((HasSavedState) PersonaClientLoadingDuxo.this)).getPhotoIdRequest();
                    UUID id = photoIdRequest != null ? photoIdRequest.getId() : null;
                    DocumentRequest selfieRequest = ((DocUploadDestination.PersonaClient) companion.getArgs((HasSavedState) PersonaClientLoadingDuxo.this)).getSelfieRequest();
                    ApiCreatePersonaInquiryRequest apiCreatePersonaInquiryRequest = new ApiCreatePersonaInquiryRequest(id, selfieRequest != null ? selfieRequest.getId() : null, ((DocUploadDestination.PersonaClient) companion.getArgs((HasSavedState) PersonaClientLoadingDuxo.this)).getSkipBiometric(), PersonaClientLoadingDuxo.this.trustedDeviceIdPref.get());
                    this.label = 1;
                    obj = docUploadApi.createPersonaInquiry(apiCreatePersonaInquiryRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiCreatePersonaInquiryResponse apiCreatePersonaInquiryResponse = (ApiCreatePersonaInquiryResponse) obj;
                Locale locale = (Locale) CollectionsKt.firstOrNull((List) PersonaClientLoadingDuxo.this.localeConfiguration.preferredLocales(Locale.Category.DISPLAY));
                PersonaClientLoadingDuxo.this.submit(new PersonaClientLoadingDuxo2.InquiryCreated(apiCreatePersonaInquiryResponse.getInquiry_id(), PersonaClientLoadingDuxo.this.authManager.isLoggedIn(), locale != null ? locale.toLanguageTag() : null));
            } catch (Exception e) {
                if (!Throwables.isNetworkRelated(e)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                }
                PersonaClientLoadingDuxo.this.submit(PersonaClientLoadingDuxo2.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }
}
