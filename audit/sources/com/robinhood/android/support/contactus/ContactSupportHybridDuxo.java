package com.robinhood.android.support.contactus;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb5;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.support.contactus.ContactSupportHybridEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CxVoiceContentIds;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.SupportInquiryStore;
import com.robinhood.models.api.ApiSupportBreadcrumb;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.models.api.suv.ApiCreateUserMachineRequest;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.ContactSupportHybridFragmentKey;
import com.robinhood.shared.support.contracts.SupportBreadcrumbResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactSupportHybridDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002/0BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "installation", "Lcom/robinhood/prefs/Installation;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "supportInquiryStore", "Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "breadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/prefs/Installation;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "onInquiryCreationComplete", "Lkotlin/Function1;", "Ljava/util/UUID;", "onInquiryCreationError", "", "errorPrefix", "", "createInquiry", "createInquiryForInitialState", "state", "Lcom/robinhood/models/api/PathfinderInitialState;", "createInquiryWithBreadcrumbs", "breadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "getBreadcrumbs", "breadcrumbResolver", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "createInquiryForSassy", "key", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Sassy;", "SaveKey", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ContactSupportHybridDuxo extends BaseDuxo5<Unit, ContactSupportHybridEvent> implements HasSavedState {
    private final AuthManager authManager;
    private final SupportBreadcrumbTracker breadcrumbTracker;
    private final ExperimentsStore experimentsStore;
    private final Installation installation;
    private final Function1<UUID, Unit> onInquiryCreationComplete;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final SupportInquiryStore supportInquiryStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupportHybridDuxo(Installation installation, AuthManager authManager, StaticContentStore staticContentStore, SupportInquiryStore supportInquiryStore, SupportBreadcrumbTracker breadcrumbTracker, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
        Intrinsics.checkNotNullParameter(breadcrumbTracker, "breadcrumbTracker");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.installation = installation;
        this.authManager = authManager;
        this.staticContentStore = staticContentStore;
        this.supportInquiryStore = supportInquiryStore;
        this.breadcrumbTracker = breadcrumbTracker;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.onInquiryCreationComplete = new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactSupportHybridDuxo.onInquiryCreationComplete$lambda$0(this.f$0, (UUID) obj);
            }
        };
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        UUID inquiryId;
        super.onCreate();
        Boolean bool = (Boolean) getSavedStateHandle().get("RECREATED");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        getSavedStateHandle().set("RECREATED", Boolean.TRUE);
        submit(ContactSupportHybridEvent.Loading.INSTANCE);
        Companion companion = INSTANCE;
        ContactSupportFragmentKey data = ((ContactSupportHybridFragmentKey) companion.getArgs((HasSavedState) this)).getData();
        ContactSupportFragmentKey.TriageFlow triageFlow = data instanceof ContactSupportFragmentKey.TriageFlow ? (ContactSupportFragmentKey.TriageFlow) data : null;
        ContactSupportFragmentKey data2 = ((ContactSupportHybridFragmentKey) companion.getArgs((HasSavedState) this)).getData();
        ContactSupportFragmentKey.Sassy sassy = data2 instanceof ContactSupportFragmentKey.Sassy ? (ContactSupportFragmentKey.Sassy) data2 : null;
        ContactSupportFragmentKey data3 = ((ContactSupportHybridFragmentKey) companion.getArgs((HasSavedState) this)).getData();
        ContactSupportFragmentKey.Email email = data3 instanceof ContactSupportFragmentKey.Email ? (ContactSupportFragmentKey.Email) data3 : null;
        if (triageFlow == null || (inquiryId = triageFlow.getInquiryId()) == null) {
            inquiryId = email != null ? email.getInquiryId() : null;
        }
        String flow = sassy != null ? sassy.getFlow() : null;
        PathfinderInitialState initialState = triageFlow != null ? triageFlow.getInitialState() : null;
        SupportBreadcrumbResolver breadcrumbResolver = triageFlow != null ? triageFlow.getBreadcrumbResolver() : null;
        boolean z = initialState != null && inquiryId == null;
        List<SupportBreadcrumb2> breadcrumbs = getBreadcrumbs(breadcrumbResolver);
        boolean z2 = !breadcrumbs.isEmpty() && inquiryId == null;
        ContactSupportFragmentKey data4 = ((ContactSupportHybridFragmentKey) companion.getArgs((HasSavedState) this)).getData();
        ContactSupportFragmentKey.Sassy sassy2 = data4 instanceof ContactSupportFragmentKey.Sassy ? (ContactSupportFragmentKey.Sassy) data4 : null;
        boolean z3 = sassy2 != null;
        boolean zIsLoggedIn = this.authManager.isLoggedIn();
        if (inquiryId != null) {
            this.onInquiryCreationComplete.invoke(inquiryId);
        }
        if (z3) {
            if (flow == null && zIsLoggedIn) {
                submit(ContactSupportHybridEvent.ShowSupportHub.INSTANCE);
            } else {
                createInquiryForSassy(sassy2);
            }
        } else if (z) {
            createInquiryForInitialState(initialState);
        } else if (z2) {
            createInquiryWithBreadcrumbs(breadcrumbs);
        } else if (inquiryId == null) {
            if (zIsLoggedIn) {
                submit(ContactSupportHybridEvent.ShowSupportHub.INSTANCE);
            } else {
                createInquiry();
            }
        }
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxCompletable$default(this, null, new C289721(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: ContactSupportHybridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.contactus.ContactSupportHybridDuxo$onCreate$1", m3645f = "ContactSupportHybridDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridDuxo$onCreate$1 */
    static final class C289721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C289721(Continuation<? super C289721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactSupportHybridDuxo.this.new C289721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = ContactSupportHybridDuxo.this.staticContentStore;
                this.label = 1;
                if (ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CxVoiceContentIds.CX_VOICE_CONTENT_CONTENTFUL_ID, null, this, 2, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInquiryCreationComplete$lambda$0(ContactSupportHybridDuxo contactSupportHybridDuxo, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        contactSupportHybridDuxo.submit(new ContactSupportHybridEvent.Loaded(uuid));
        return Unit.INSTANCE;
    }

    private final Function1<Throwable, Unit> onInquiryCreationError(final String errorPrefix) {
        return new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactSupportHybridDuxo.onInquiryCreationError$lambda$1(this.f$0, errorPrefix, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInquiryCreationError$lambda$1(ContactSupportHybridDuxo contactSupportHybridDuxo, String str, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        contactSupportHybridDuxo.submit(new ContactSupportHybridEvent.Failed(new WebError.InquiryCreationException(str + ": " + error.getMessage())));
        return Unit.INSTANCE;
    }

    private final void createInquiry() {
        LifecycleHost.DefaultImpls.bind$default(this, this.supportInquiryStore.createBlankInquiry(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(this.onInquiryCreationComplete, onInquiryCreationError("Error creating blank inquiry"));
    }

    private final void createInquiryForInitialState(PathfinderInitialState state) {
        LifecycleHost.DefaultImpls.bind$default(this, this.supportInquiryStore.createInquiryForState(state), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(this.onInquiryCreationComplete, onInquiryCreationError("Error creating inquiry for " + state.getKey()));
    }

    private final void createInquiryWithBreadcrumbs(List<? extends SupportBreadcrumb2> breadcrumbs) {
        List<? extends SupportBreadcrumb2> list = breadcrumbs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SupportBreadcrumb2 supportBreadcrumb2 : list) {
            arrayList.add(new ApiSupportBreadcrumb(supportBreadcrumb2.getType().getServerValue(), supportBreadcrumb2.getDetails(), supportBreadcrumb2.getSource()));
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.supportInquiryStore.createInquiryWithBreadcrumbs(arrayList), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(this.onInquiryCreationComplete, onInquiryCreationError("Error creating inquiry with " + SupportBreadcrumb5.typesString(breadcrumbs)));
    }

    private final List<SupportBreadcrumb2> getBreadcrumbs(SupportBreadcrumbResolver breadcrumbResolver) {
        List<SupportBreadcrumb> listCurrentBreadcrumbs = this.breadcrumbTracker.currentBreadcrumbs();
        if (breadcrumbResolver == null) {
            return listCurrentBreadcrumbs;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) listCurrentBreadcrumbs);
        mutableList.addAll(0, breadcrumbResolver.createBreadcrumbs());
        return CollectionsKt.toList(mutableList);
    }

    private final void createInquiryForSassy(ContactSupportFragmentKey.Sassy key) {
        LifecycleHost.DefaultImpls.bind$default(this, this.supportInquiryStore.createUserMachineInquiry(new ApiCreateUserMachineRequest(key.getFlow(), key.getVersion(), key.getInputParams(), this.installation.mo2745id())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(this.onInquiryCreationComplete, onInquiryCreationError("Error creating inquiry for Sassy with " + key));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactSupportHybridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo$SaveKey;", "", "<init>", "(Ljava/lang/String;I)V", "RECREATED", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SaveKey {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SaveKey[] $VALUES;
        public static final SaveKey RECREATED = new SaveKey("RECREATED", 0);

        private static final /* synthetic */ SaveKey[] $values() {
            return new SaveKey[]{RECREATED};
        }

        public static EnumEntries<SaveKey> getEntries() {
            return $ENTRIES;
        }

        private SaveKey(String str, int i) {
        }

        static {
            SaveKey[] saveKeyArr$values = $values();
            $VALUES = saveKeyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(saveKeyArr$values);
        }

        public static SaveKey valueOf(String str) {
            return (SaveKey) Enum.valueOf(SaveKey.class, str);
        }

        public static SaveKey[] values() {
            return (SaveKey[]) $VALUES.clone();
        }
    }

    /* compiled from: ContactSupportHybridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo;", "Lcom/robinhood/shared/support/contracts/ContactSupportHybridFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ContactSupportHybridDuxo, ContactSupportHybridFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContactSupportHybridFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ContactSupportHybridFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContactSupportHybridFragmentKey getArgs(ContactSupportHybridDuxo contactSupportHybridDuxo) {
            return (ContactSupportHybridFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, contactSupportHybridDuxo);
        }
    }
}
