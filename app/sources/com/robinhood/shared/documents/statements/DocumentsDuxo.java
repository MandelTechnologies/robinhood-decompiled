package com.robinhood.shared.documents.statements;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTaxFormResubmissionStatus;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentsFragmentKey;
import com.robinhood.shared.documents.statements.DocumentsDuxo8;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.rxkotlin.Observables;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\"R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/documents/statements/DocumentsViewState;", "Lcom/robinhood/shared/documents/statements/DocumentsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "refreshDocuments", "includeManaged", "", "isCategoryMatchingBrokerageAccountType", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/db/Document$Category;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementTypeFromDocumentCategory", "Lcom/robinhood/models/api/ManagementType;", "onManagementTypeChipClicked", "managementType", "Companion", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DocumentsDuxo extends BaseDuxo5<DocumentsViewState, DocumentsDuxo8> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DocumentStore documentStore;
    private final PersistentCacheManager persistentCacheManager;
    private final RegionGateProvider regionGateProvider;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocumentsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Document.Category.values().length];
            try {
                iArr[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Document.Category.IRA_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Document.Category.RHC_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Document.Category.RHC_EU_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Document.Category.TAX.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Document.Category.TRADE_CONFIRM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentsDuxo(DuxoBundle duxoBundle, DocumentStore documentStore, PersistentCacheManager persistentCacheManager, RhyAccountStore rhyAccountStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(new DocumentsViewState(((DocumentsFragmentKey) INSTANCE.getArgs(savedStateHandle)).getCategory(), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.documentStore = documentStore;
        this.persistentCacheManager = persistentCacheManager;
        this.rhyAccountStore = rhyAccountStore;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observables observables = Observables.INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(this.accountProvider.streamAllSelfDirectedAccounts(), this.accountProvider.streamAllManagedAccounts()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$2(this.f$0, (Tuples2) obj);
            }
        });
        DocumentStore documentStore = this.documentStore;
        Companion companion = INSTANCE;
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(documentStore.getSelfDirectedDocuments(((DocumentsFragmentKey) companion.getArgs((HasSavedState) this)).getCategory()), this.documentStore.getManagedDocuments(((DocumentsFragmentKey) companion.getArgs((HasSavedState) this)).getCategory())), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        this.rhyAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyAccountStore.streamAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$5(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.persistentCacheManager.getTaxFormResubmissionStatus(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$6(this.f$0, (ApiTaxFormResubmissionStatus) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EventContractsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentsDuxo.onResume$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(DocumentsDuxo documentsDuxo, Tuples2 tuples2) {
        Object next;
        Object next2;
        boolean z;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List list = (List) tuples2.component1();
        List list2 = (List) tuples2.component2();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (documentsDuxo.isCategoryMatchingBrokerageAccountType(((DocumentsFragmentKey) INSTANCE.getArgs((HasSavedState) documentsDuxo)).getCategory(), ((Account) next).getBrokerageAccountType())) {
                break;
            }
        }
        Account account = (Account) next;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (documentsDuxo.isCategoryMatchingBrokerageAccountType(((DocumentsFragmentKey) INSTANCE.getArgs((HasSavedState) documentsDuxo)).getCategory(), ((Account) next2).getBrokerageAccountType())) {
                break;
            }
        }
        Account account2 = (Account) next2;
        if (account2 != null) {
            if (account != null) {
                documentsDuxo.applyMutation(new DocumentsDuxo2(documentsDuxo, account, account2, null));
            } else {
                documentsDuxo.applyMutation(new DocumentsDuxo3(null));
            }
            z = true;
        } else {
            z = false;
        }
        documentsDuxo.refreshDocuments(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(DocumentsDuxo documentsDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        documentsDuxo.applyMutation(new DocumentsDuxo4((List) tuples2.component1(), (List) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(DocumentsDuxo documentsDuxo, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            documentsDuxo.submit(new DocumentsDuxo8.Error(throwable));
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(DocumentsDuxo documentsDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        documentsDuxo.applyMutation(new DocumentsDuxo5(accounts2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(DocumentsDuxo documentsDuxo, ApiTaxFormResubmissionStatus taxFormResubmissionStatus) {
        Intrinsics.checkNotNullParameter(taxFormResubmissionStatus, "taxFormResubmissionStatus");
        documentsDuxo.applyMutation(new DocumentsDuxo6(taxFormResubmissionStatus, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(DocumentsDuxo documentsDuxo, boolean z) {
        documentsDuxo.applyMutation(new DocumentsDuxo7(z, null));
        return Unit.INSTANCE;
    }

    private final void refreshDocuments(boolean includeManaged) {
        switch (WhenMappings.$EnumSwitchMapping$0[((DocumentsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCategory().ordinal()]) {
            case 1:
                return;
            case 2:
                this.documentStore.refreshIraDocuments(includeManaged);
                return;
            case 3:
            case 4:
                DocumentStore.refreshRhcDocuments$default(this.documentStore, false, 1, null);
                return;
            case 5:
                this.documentStore.refreshJointAccountStatements(includeManaged);
                return;
            case 6:
                DocumentStore.refreshRhdDailyStatements$default(this.documentStore, false, 1, null);
                return;
            case 7:
                DocumentStore.refreshRhdMonthlyStatements$default(this.documentStore, false, 1, null);
                return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                this.documentStore.refreshIndividualDocuments(false, includeManaged);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean isCategoryMatchingBrokerageAccountType(Document.Category category, BrokerageAccountType brokerageAccountType) {
        int i = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        if (i != 2) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 12:
                            break;
                        case 13:
                            break;
                        case 14:
                            break;
                        default:
                            return false;
                    }
                }
                return brokerageAccountType == BrokerageAccountType.INDIVIDUAL;
            }
            return brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        }
        return brokerageAccountType == BrokerageAccountType.IRA_ROTH || brokerageAccountType == BrokerageAccountType.IRA_TRADITIONAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ManagementType getManagementTypeFromDocumentCategory(Document.Category category) {
        switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
            case 12:
            case 13:
            case 14:
                return ManagementType.MANAGED;
            default:
                return ManagementType.SELF_DIRECTED;
        }
    }

    /* compiled from: DocumentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/statements/DocumentsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsDuxo$onManagementTypeChipClicked$1", m3645f = "DocumentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.statements.DocumentsDuxo$onManagementTypeChipClicked$1 */
    static final class C387831 extends ContinuationImpl7 implements Function2<DocumentsViewState, Continuation<? super DocumentsViewState>, Object> {
        final /* synthetic */ ManagementType $managementType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387831(ManagementType managementType, Continuation<? super C387831> continuation) {
            super(2, continuation);
            this.$managementType = managementType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C387831 c387831 = new C387831(this.$managementType, continuation);
            c387831.L$0 = obj;
            return c387831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DocumentsViewState documentsViewState, Continuation<? super DocumentsViewState> continuation) {
            return ((C387831) create(documentsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DocumentsViewState documentsViewState = (DocumentsViewState) this.L$0;
            return DocumentsViewState.copy$default(documentsViewState, null, null, null, null, null, ManagementTypeChipGroupViewState.copy$default(documentsViewState.getManagementTypeChipGroupViewState(), this.$managementType, false, null, null, 14, null), false, 95, null);
        }
    }

    public final void onManagementTypeChipClicked(ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        applyMutation(new C387831(managementType, null));
    }

    /* compiled from: DocumentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/documents/statements/DocumentsDuxo;", "Lcom/robinhood/shared/documents/contracts/DocumentsFragmentKey;", "<init>", "()V", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocumentsDuxo, DocumentsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocumentsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (DocumentsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocumentsFragmentKey getArgs(DocumentsDuxo documentsDuxo) {
            return (DocumentsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, documentsDuxo);
        }
    }
}
