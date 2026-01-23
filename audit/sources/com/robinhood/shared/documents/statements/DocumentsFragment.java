package com.robinhood.shared.documents.statements;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.tax.contracts.TaxCertification;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Document;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.documents.contracts.DocumentsFragmentKey;
import com.robinhood.shared.documents.statements.DocumentsAdapter;
import com.robinhood.shared.documents.statements.DocumentsDuxo8;
import com.robinhood.shared.documents.statements.databinding.FragmentDocumentsBinding;
import com.robinhood.utils.resource.StringResource;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DocumentsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010/\u001a\u00020#H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0018\u00104\u001a\u00020#2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0014J\u0010\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;H\u0017J\u0018\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020#H\u0016J\u0010\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020\u001aH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 ¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/documents/statements/DocumentsDuxo;", "getDuxo", "()Lcom/robinhood/shared/documents/statements/DocumentsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/documents/statements/databinding/FragmentDocumentsBinding;", "getBinding", "()Lcom/robinhood/shared/documents/statements/databinding/FragmentDocumentsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/shared/documents/statements/DocumentsAdapter;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "bind", "viewState", "Lcom/robinhood/shared/documents/statements/DocumentsViewState;", "bindManagementTypeChipGroup", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onDocumentActionReceived", "document", "Lcom/robinhood/models/db/Document;", "launchMode", "Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "onTaxCertificationBannerClicked", "setLoading", "loading", "Companion", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DocumentsFragment extends BaseFragment implements DocumentsAdapter.Callbacks {
    private DocumentsAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocumentsFragment.class, "binding", "getBinding()Lcom/robinhood/shared/documents/statements/databinding/FragmentDocumentsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocumentsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Document.Category.values().length];
            try {
                iArr[Document.Category.TAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Document.Category.IRA_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Document.Category.RHC_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Document.Category.RHC_EU_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Document.Category.TRADE_CONFIRM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocumentsFragment() {
        super(C38788R.layout.fragment_documents);
        this.duxo = DuxosKt.duxo(this, DocumentsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DocumentsFragment4.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.documents.statements.DocumentsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentsFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentsDuxo getDuxo() {
        return (DocumentsDuxo) this.duxo.getValue();
    }

    private final FragmentDocumentsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocumentsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((DocumentsFragmentKey) companion.getArgs((Fragment) this)).getCategory().ordinal()];
        if (i == 1) {
            return "TAX_DOCUMENTS_LIST";
        }
        if (i == 2) {
            return "BROKERAGE_STATEMENTS_LIST";
        }
        if (i == 3) {
            return "RETIREMENT_STATEMENTS_LIST";
        }
        if (i == 4) {
            return "CRYPTO_STATEMENTS_LIST";
        }
        return super.getScreenName() + PlaceholderUtils.XXShortPlaceholderText + ((DocumentsFragmentKey) companion.getArgs((Fragment) this)).getCategory();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ((DocumentsFragmentKey) INSTANCE.getArgs((Fragment) this)).getCategory().getServerValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(DocumentsFragment documentsFragment) {
        return new ToolbarScrollAnimator(documentsFragment.requireToolbar(), documentsFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        DocumentsViewState value = getDuxo().getStateFlow().getValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        toolbar.setTitle(value.getToolbarTitle(resources));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().documentsEmpty;
        Document.Category category = ((DocumentsFragmentKey) INSTANCE.getArgs((Fragment) this)).getCategory();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(Documents.getCategoryInfoString(category, resources));
        this.adapter = new DocumentsAdapter(this);
        RecyclerView documentsList = getBinding().documentsList;
        Intrinsics.checkNotNullExpressionValue(documentsList, "documentsList");
        DocumentsAdapter documentsAdapter = this.adapter;
        if (documentsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            documentsAdapter = null;
        }
        bindAdapter(documentsList, documentsAdapter);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView documentsList2 = getBinding().documentsList;
        Intrinsics.checkNotNullExpressionValue(documentsList2, "documentsList");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, documentsList2, this, null, 4, null);
        BaseFragment.collectDuxoState$default(this, null, new C387851(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C387862(null), 1, null);
    }

    /* compiled from: DocumentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$1", m3645f = "DocumentsFragment.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$1 */
    static final class C387851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C387851(Continuation<? super C387851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocumentsFragment.this.new C387851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocumentsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ DocumentsFragment $tmp0;

            AnonymousClass1(DocumentsFragment documentsFragment) {
                this.$tmp0 = documentsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, DocumentsFragment.class, "bind", "bind(Lcom/robinhood/shared/documents/statements/DocumentsViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(DocumentsViewState documentsViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C387851.invokeSuspend$bind(this.$tmp0, documentsViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((DocumentsViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(DocumentsFragment documentsFragment, DocumentsViewState documentsViewState, Continuation continuation) {
            documentsFragment.bind(documentsViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DocumentsViewState> stateFlow = DocumentsFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentsFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: DocumentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$2", m3645f = "DocumentsFragment.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$2 */
    static final class C387862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C387862(Continuation<? super C387862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocumentsFragment.this.new C387862(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocumentsFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/documents/statements/DocumentsEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$2$1", m3645f = "DocumentsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<DocumentsDuxo8>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocumentsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocumentsFragment documentsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = documentsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<DocumentsDuxo8> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final DocumentsFragment documentsFragment = this.this$0;
                    if ((event.getData() instanceof DocumentsDuxo8.Error) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.shared.documents.statements.DocumentsFragment$onViewCreated$2$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                m25329invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25329invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                DocumentsDuxo8.Error error = (DocumentsDuxo8.Error) event.getData();
                                ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                                FragmentActivity fragmentActivityRequireActivity = documentsFragment.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), true, false, 0, null, 56, null);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<DocumentsDuxo8>> eventFlow = DocumentsFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentsFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView documentsList = getBinding().documentsList;
        Intrinsics.checkNotNullExpressionValue(documentsList, "documentsList");
        toolbarScrollAnimator.dispatchScroll(documentsList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DocumentsViewState viewState) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhToolbar.setTitle(viewState.getToolbarTitle(resources));
        }
        RhTextView documentsEmpty = getBinding().documentsEmpty;
        Intrinsics.checkNotNullExpressionValue(documentsEmpty, "documentsEmpty");
        documentsEmpty.setVisibility(viewState.getShowEmptyState() ? 0 : 8);
        bindManagementTypeChipGroup(viewState);
        setLoading(viewState.isLoading());
        DocumentsAdapter documentsAdapter = this.adapter;
        if (documentsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            documentsAdapter = null;
        }
        documentsAdapter.submitList(viewState.getCurrentShowingItems());
    }

    private final void bindManagementTypeChipGroup(DocumentsViewState viewState) {
        ManagementTypeChipGroupViewState managementTypeChipGroupViewState = viewState.getManagementTypeChipGroupViewState();
        if (managementTypeChipGroupViewState.getShouldShowManagementTypeChipGroup()) {
            ChipGroup chipGroup = getBinding().chipGroup;
            Intrinsics.checkNotNullExpressionValue(chipGroup, "chipGroup");
            chipGroup.setVisibility(0);
            final RdsChip rdsChip = getBinding().chipSelfDirected;
            StringResource selfDirectedChipText = managementTypeChipGroupViewState.getSelfDirectedChipText();
            Resources resources = rdsChip.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rdsChip.setText(selfDirectedChipText.getText(resources));
            rdsChip.setSelected(managementTypeChipGroupViewState.getCurrentManagementType() == ManagementType.SELF_DIRECTED);
            rdsChip.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.documents.statements.DocumentsFragment$bindManagementTypeChipGroup$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.this$0.getDuxo().onManagementTypeChipClicked(ManagementType.SELF_DIRECTED);
                    rdsChip.setSelected(true);
                }
            });
            final RdsChip rdsChip2 = getBinding().chipManaged;
            StringResource managedChipText = managementTypeChipGroupViewState.getManagedChipText();
            Resources resources2 = rdsChip2.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rdsChip2.setText(managedChipText.getText(resources2));
            rdsChip2.setSelected(managementTypeChipGroupViewState.getCurrentManagementType() == ManagementType.MANAGED);
            rdsChip2.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.documents.statements.DocumentsFragment$bindManagementTypeChipGroup$2$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.this$0.getDuxo().onManagementTypeChipClicked(ManagementType.MANAGED);
                    rdsChip2.setSelected(true);
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        switch (WhenMappings.$EnumSwitchMapping$0[((DocumentsFragmentKey) INSTANCE.getArgs((Fragment) this)).getCategory().ordinal()]) {
            case 1:
                inflater.inflate(C11048R.menu.menu_help, menu);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
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
                inflater.inflate(C11048R.menu.menu_info, menu);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C11048R.id.action_help) {
            String string2 = getString(C38788R.string.documents_help_url);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            WebUtils.viewUrl$default(requireContext(), string2, 0, 4, (Object) null);
            return true;
        }
        if (itemId == C11048R.id.action_info) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Companion companion = INSTANCE;
            String categoryTitleString = Documents.getCategoryTitleString(((DocumentsFragmentKey) companion.getArgs((Fragment) this)).getCategory(), resources);
            String categoryInfoString = Documents.getCategoryInfoString(((DocumentsFragmentKey) companion.getArgs((Fragment) this)).getCategory(), resources);
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion2.create(contextRequireContext).setTitle(categoryTitleString).setMessage(categoryInfoString);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, SduiFeatureDiscovery3.INFO_TAG, false, 4, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.shared.documents.statements.DocumentsAdapter.Callbacks
    public void onDocumentActionReceived(Document document, DocumentDownloadLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), requireBaseActivity(), new DocumentDownloadKey(document, launchMode, null, false, 12, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.shared.documents.statements.DocumentsAdapter.Callbacks
    public void onTaxCertificationBannerClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), requireBaseActivity(), new TaxCertification(null, 1, null), null, false, null, null, 60, null);
    }

    private final void setLoading(boolean loading) {
        LinearLayout progressContainer = getBinding().progressContainer;
        Intrinsics.checkNotNullExpressionValue(progressContainer, "progressContainer");
        progressContainer.setVisibility(loading ? 0 : 8);
        ConstraintLayout listContainer = getBinding().listContainer;
        Intrinsics.checkNotNullExpressionValue(listContainer, "listContainer");
        listContainer.setVisibility(loading ? 8 : 0);
    }

    /* compiled from: DocumentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/documents/statements/DocumentsFragment;", "Lcom/robinhood/shared/documents/contracts/DocumentsFragmentKey;", "<init>", "()V", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DocumentsFragment, DocumentsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(DocumentsFragmentKey documentsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, documentsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocumentsFragmentKey getArgs(DocumentsFragment documentsFragment) {
            return (DocumentsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, documentsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocumentsFragment newInstance(DocumentsFragmentKey documentsFragmentKey) {
            return (DocumentsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, documentsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocumentsFragment documentsFragment, DocumentsFragmentKey documentsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, documentsFragment, documentsFragmentKey);
        }
    }
}
