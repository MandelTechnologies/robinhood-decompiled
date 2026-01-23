package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.squareup.workflow1.p415ui.WorkflowLayout;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate2;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState2;
import com.withpersona.sdk2.inquiry.inline_inquiry.InlineInquiryController;
import com.withpersona.sdk2.inquiry.inline_inquiry.InlineInquiryScreen;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2InquiryFragmentBinding;
import com.withpersona.sdk2.inquiry.internal.error_reporting.ExceptionUtils3;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerModule;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerParams;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModule;
import com.withpersona.sdk2.inquiry.resources.R$style;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector2;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollectorModule;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ControllerRequest;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryControllerModule;
import com.withpersona.sdk2.inquiry.shared.files.FilesModule;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerKey;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: InquiryFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u0016J\u0011\u0010(\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\r¨\u0006L"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InlineInquiryScreen;", "<init>", "()V", "", "resetState", "Landroid/os/Bundle;", "savedInstanceState", "", "createAndLaunchWorkflow", "(ZLandroid/os/Bundle;)V", "validateArgumentsOrFinish", "()Z", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InlineInquiryController;", "getController", "()Lcom/withpersona/sdk2/inquiry/inline_inquiry/InlineInquiryController;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onDestroy", "onDetach", "outState", "onSaveInstanceState", "getContext", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "cancelOutput", "onCancelClick$inquiry_internal_release", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V", "onCancelClick", "Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments;", "args$delegate", "Lkotlin/Lazy;", "getArgs", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryArguments;", "args", "Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "viewModel", "Lcom/withpersona/sdk2/inquiry/internal/WorkflowStateViewModel;", "workflowStateViewModel$delegate", "getWorkflowStateViewModel", "()Lcom/withpersona/sdk2/inquiry/internal/WorkflowStateViewModel;", "workflowStateViewModel", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryFragmentBinding;", "binding", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryFragmentBinding;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;", "component", "Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;", "themedContext", "Landroid/content/Context;", "", "getTheme", "()I", "theme", "isInline", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InquiryFragment extends Fragment implements InlineInquiryScreen {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InquiryFragment.args_delegate$lambda$0(this.f$0);
        }
    });
    private Pi2InquiryFragmentBinding binding;
    private InquiryComponent component;
    private Context themedContext;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: workflowStateViewModel$delegate, reason: from kotlin metadata */
    private final Lazy workflowStateViewModel;

    public InquiryFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(InquiryViewModel.class), new Function0<ViewModelStore>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy).getStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM8219viewModels$lambda1 = FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM8219viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM8219viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM8219viewModels$lambda1 = FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM8219viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM8219viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.workflowStateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WorkflowStateViewModel.class), new Function0<ViewModelStore>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy2).getStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM8219viewModels$lambda1 = FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM8219viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM8219viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM8219viewModels$lambda1 = FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM8219viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM8219viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InquiryArguments args_delegate$lambda$0(InquiryFragment inquiryFragment) {
        return new InquiryArguments(inquiryFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InquiryArguments getArgs() {
        return (InquiryArguments) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InquiryViewModel getViewModel() {
        return (InquiryViewModel) this.viewModel.getValue();
    }

    private final WorkflowStateViewModel getWorkflowStateViewModel() {
        return (WorkflowStateViewModel) this.workflowStateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTheme() {
        if (!isInline()) {
            return 0;
        }
        Integer theme = getArgs().getTheme();
        if (theme != null && theme.intValue() != 0) {
            return theme.intValue();
        }
        return R$style.Persona_Inquiry_Theme;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (isInline()) {
            Integer theme = getArgs().getTheme();
            if (theme != null && theme.intValue() != 0) {
                iIntValue = theme.intValue();
            } else {
                iIntValue = R$style.Persona_Inquiry_Theme;
            }
            this.themedContext = new ContextThemeWrapper(context, iIntValue);
            return;
        }
        this.themedContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ExceptionUtils3.clearLastError(contextRequireContext);
        if (getArgs().getEnableErrorLogging() || getArgs().getConsumeExceptions()) {
            ExceptionUtils3.registerExceptionHandler(contextRequireContext, getViewModel().getSdkFilesManager().directoriesToDeleteOnError());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        Pi2InquiryFragmentBinding pi2InquiryFragmentBindingInflate = Pi2InquiryFragmentBinding.inflate(inflater, container, false);
        this.binding = pi2InquiryFragmentBindingInflate;
        if (pi2InquiryFragmentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi2InquiryFragmentBindingInflate = null;
        }
        FrameLayout root = pi2InquiryFragmentBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        try {
            if (validateArgumentsOrFinish()) {
                getViewModel().init$inquiry_internal_release(this);
                getViewModel().getInquiryId().setValue(getArgs().getInquiryId());
                getViewModel().getSessionToken().setValue(getArgs().getSessionToken());
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C436151(savedInstanceState, null), 3, null);
                createAndLaunchWorkflow(false, savedInstanceState);
                InlineInquiryController controller = getController();
                if (controller != null) {
                    controller.onAttached(this);
                }
            }
        } catch (Exception e) {
            if (getArgs().getConsumeExceptions()) {
                if (getArgs().getEnableErrorLogging()) {
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    ExceptionUtils3.getErrorHandler(contextRequireContext).recordError(e);
                }
                String requestKey = getArgs().getRequestKey();
                Bundle bundle = new Bundle();
                bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
                bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
                bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.ExceptionError);
                Unit unit = Unit.INSTANCE;
                Fragment2.setFragmentResult(this, requestKey, bundle);
                return;
            }
            throw e;
        }
    }

    /* compiled from: InquiryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", m3645f = "InquiryFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1 */
    static final class C436151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436151(Bundle bundle, Continuation<? super C436151> continuation) {
            super(2, continuation);
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InquiryFragment.this.new C436151(this.$savedInstanceState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(InquiryFragment.this.getViewModel().getForceFallbackModeFlow(), 1);
                final InquiryFragment inquiryFragment = InquiryFragment.this;
                final Bundle bundle = this.$savedInstanceState;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        inquiryFragment.createAndLaunchWorkflow(true, bundle);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDrop.collect(flowCollector, this) == coroutine_suspended) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public final void createAndLaunchWorkflow(boolean resetState, Bundle savedInstanceState) {
        String serverEndpoint;
        String webRtcServerEndpoint;
        String fallbackModeServerEndpoint;
        DataCollector dataCollector2;
        FallbackMode fallbackMode;
        ApiControllerModule apiControllerModule;
        InquiryWorkflow.Props templateProps;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String packageName = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int i = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        if (StringsKt.startsWith$default(packageName, "com.withpersona", false, 2, (Object) null)) {
            serverEndpoint = getArgs().getServerEndpoint();
        } else {
            serverEndpoint = "https://withpersona.com";
        }
        String packageName2 = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
        if (StringsKt.startsWith$default(packageName2, "com.withpersona", false, 2, (Object) null)) {
            webRtcServerEndpoint = getArgs().getWebRtcServerEndpoint();
        } else {
            webRtcServerEndpoint = "https://webrtc-consumer.withpersona.com";
        }
        String packageName3 = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName3, "getPackageName(...)");
        if (StringsKt.startsWith$default(packageName3, "com.withpersona", false, 2, (Object) null)) {
            fallbackModeServerEndpoint = getArgs().getFallbackModeServerEndpoint();
        } else {
            fallbackModeServerEndpoint = "https://inquiry-fallback.withpersona.com";
        }
        if (getArgs().getReturnCollectedData()) {
            dataCollector2 = getViewModel().getDataCollector();
        } else {
            dataCollector2 = new DataCollector2();
        }
        if (getViewModel().getForceFallbackModeFlow().getValue().booleanValue() || getArgs().getStaticInquiryTemplate() != null) {
            fallbackMode = FallbackMode.ALWAYS;
        } else {
            fallbackMode = getArgs().getFallbackMode();
        }
        if (fallbackMode == FallbackMode.ALWAYS) {
            apiControllerModule = new ApiControllerModule(ApiControllerParams.Fallback.INSTANCE);
        } else {
            StaticInquiryTemplate staticInquiryTemplate = getArgs().getStaticInquiryTemplate();
            StaticInquiryTemplate2 staticInquiryTemplate2 = staticInquiryTemplate instanceof StaticInquiryTemplate2 ? (StaticInquiryTemplate2) staticInquiryTemplate : null;
            if (staticInquiryTemplate2 != null) {
                apiControllerModule = new ApiControllerModule(new ApiControllerParams.Offline(staticInquiryTemplate2.getResourceId()));
            } else {
                apiControllerModule = new ApiControllerModule(ApiControllerParams.Fallback.INSTANCE);
            }
        }
        ExternalInquiryController externalInquiryController = new ExternalInquiryController(this) { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment$createAndLaunchWorkflow$externalInquiryController$1
            private final Flow<ControllerRequest> controllerRequestFlow;
            private final SharedFlow2<InquiryEvent> eventFlow;
            private final boolean handleBackPress;
            private final boolean isNavBarEnabled;
            private final StateFlow2<ScreenState> screenStateFlow;

            {
                this.controllerRequestFlow = this.getViewModel().getControllerRequestFlow();
                this.screenStateFlow = this.getViewModel().getScreenStateFlow();
                this.eventFlow = this.getViewModel().getEventFlow();
                this.isNavBarEnabled = this.getArgs().isNavBarEnabled();
                this.handleBackPress = this.getArgs().getHandleBackPress();
            }

            @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController
            public Flow<ControllerRequest> getControllerRequestFlow() {
                return this.controllerRequestFlow;
            }

            @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController
            public StateFlow2<ScreenState> getScreenStateFlow() {
                return this.screenStateFlow;
            }

            @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController
            public SharedFlow2<InquiryEvent> getEventFlow() {
                return this.eventFlow;
            }

            @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController
            /* renamed from: isNavBarEnabled, reason: from getter */
            public boolean getIsNavBarEnabled() {
                return this.isNavBarEnabled;
            }

            @Override // com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController
            public boolean getHandleBackPress() {
                return this.handleBackPress;
            }
        };
        DaggerInquiryComponent.Builder builder = DaggerInquiryComponent.builder();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        InquiryComponent inquiryComponentBuild = builder.inquiryActivityModule(new InquiryActivityModule(fragmentActivityRequireActivity)).documentLaunchersModule(new DocumentLaunchersModule(getViewModel().getPictureLaunchResultLauncher$inquiry_internal_release(), getViewModel().getDocumentsSelectResultLauncher$inquiry_internal_release(), getViewModel().getSelectFromPhotoLibraryLauncher$inquiry_internal_release())).documentSelectLauncherModule(new DocumentSelectLauncherModule(getViewModel().getDocumentSelectResultLauncher$inquiry_internal_release())).permissionsLauncherModule(new PermissionsLauncherModule(getViewModel().getRequestPermissionResultLauncher$inquiry_internal_release())).passportNfcReaderLauncherModule(new PassportNfcReaderLauncherModule(getViewModel().getPassportNfcReaderLauncher$inquiry_internal_release())).customTabsLauncherModule(new CustomTabsLauncherModule(getViewModel().getCustomTabsLauncher$inquiry_internal_release())).networkCoreModule(new NetworkCoreModule(getArgs().getUseServerStyles(), getArgs().getEnvironmentId(), getArgs().getLocale())).dataCollectorModule(new DataCollectorModule(dataCollector2)).inquiryModule(new InquiryModule(serverEndpoint, webRtcServerEndpoint, fallbackModeServerEndpoint)).apiControllerModule(apiControllerModule).externalInquiryControllerModule(new ExternalInquiryControllerModule(externalInquiryController)).sharedModule(new SharedModule(getArgs().getControlNavigationBar(), getArgs().getControlStatusBar())).resolvableApiLauncherModule(new ResolvableApiLauncherModule(getViewModel().getResolvableApiLauncher$inquiry_internal_release())).fallbackModeModule(new FallbackModeModule(fallbackMode, getArgs().getEnvironment(), getWorkflowStateViewModel().getSavedStateHandle())).filesModule(new FilesModule(getViewModel().getSdkFilesManager())).build();
        this.component = inquiryComponentBuild;
        FontDownloader.Companion companion = FontDownloader.INSTANCE;
        companion.setInstance(inquiryComponentBuild.fontDownloader());
        companion.getInstance().restoreState(savedInstanceState);
        String value = getViewModel().getInquiryId().getValue();
        String oneTimeLinkCode = getArgs().getOneTimeLinkCode();
        String value2 = getViewModel().getSessionToken().getValue();
        InquiryViewModel viewModel = getViewModel();
        Intrinsics.checkNotNull(inquiryComponentBuild);
        if (value != null) {
            templateProps = new InquiryWorkflow.Props.InquiryProps(value, value2, getArgs().getEnvironmentId(), getArgs().getEnvironment(), getArgs().getTheme(), false, 32, null);
        } else if (oneTimeLinkCode != null) {
            templateProps = new InquiryWorkflow.Props.OneTimeCodeProps(oneTimeLinkCode, getArgs().getEnvironment(), getArgs().getTheme(), false, 8, null);
        } else {
            String templateId = getArgs().getTemplateId();
            String templateVersion = getArgs().getTemplateVersion();
            String accountId = getArgs().getAccountId();
            String referenceId = getArgs().getReferenceId();
            InquiryFieldsMap fieldsWrapper = getArgs().getFieldsWrapper();
            templateProps = new InquiryWorkflow.Props.TemplateProps(templateId, templateVersion, accountId, referenceId, getArgs().getEnvironmentId(), fieldsWrapper != null ? fieldsWrapper.getFields() : null, getArgs().getThemeSetId(), getArgs().getStaticInquiryTemplate(), getArgs().getEnvironment(), getArgs().getTheme(), false, 1024, null);
        }
        viewModel.createWorkflow$inquiry_internal_release(inquiryComponentBuild, templateProps, getWorkflowStateViewModel(), resetState);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        WorkflowLayout workflowLayout = new WorkflowLayout(contextRequireContext2, attributeSet, i, objArr == true ? 1 : 0);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        WorkflowLayout.start$default(workflowLayout, lifecycle, getViewModel().render(getWorkflowStateViewModel()), null, new ViewEnvironment(MapsKt.mapOf(Tuples4.m3642to(ViewRegistry.INSTANCE, getViewModel().viewRegistry()), Tuples4.m3642to(SystemUiControllerKey.INSTANCE, inquiryComponentBuild.systemUiController()))), 4, null);
        Pi2InquiryFragmentBinding pi2InquiryFragmentBinding = this.binding;
        if (pi2InquiryFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi2InquiryFragmentBinding = null;
        }
        pi2InquiryFragmentBinding.getRoot().removeAllViews();
        Pi2InquiryFragmentBinding pi2InquiryFragmentBinding2 = this.binding;
        if (pi2InquiryFragmentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi2InquiryFragmentBinding2 = null;
        }
        pi2InquiryFragmentBinding2.getRoot().addView(workflowLayout);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C436131(inquiryComponentBuild, null), 3, null);
    }

    /* compiled from: InquiryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$createAndLaunchWorkflow$1", m3645f = "InquiryFragment.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryFragment$createAndLaunchWorkflow$1 */
    static final class C436131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InquiryComponent $component;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436131(InquiryComponent inquiryComponent, Continuation<? super C436131> continuation) {
            super(2, continuation);
            this.$component = inquiryComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InquiryFragment.this.new C436131(this.$component, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<InquiryWorkflow.Output> result = InquiryFragment.this.getViewModel().getResult();
                final InquiryFragment inquiryFragment = InquiryFragment.this;
                final InquiryComponent inquiryComponent = this.$component;
                FlowCollector<? super InquiryWorkflow.Output> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryFragment.createAndLaunchWorkflow.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InquiryWorkflow.Output) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InquiryWorkflow.Output output, Continuation<? super Unit> continuation) {
                        String sessionToken = output.getSessionToken();
                        if (sessionToken != null) {
                            inquiryComponent.errorReportingManager().reportErrors(sessionToken);
                        }
                        inquiryFragment.getViewModel().getSdkFilesManager().cleanup();
                        if (output instanceof InquiryWorkflow.Output.Complete) {
                            InquiryFragment inquiryFragment2 = inquiryFragment;
                            String requestKey = inquiryFragment2.getArgs().getRequestKey();
                            Bundle bundle = new Bundle();
                            InquiryFragment inquiryFragment3 = inquiryFragment;
                            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
                            InquiryWorkflow.Output.Complete complete = (InquiryWorkflow.Output.Complete) output;
                            bundle.putString("INQUIRY_ID_KEY", complete.getInquiryId());
                            bundle.putString("INQUIRY_STATUS_KEY", complete.getInquiryStatus());
                            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(complete.getFields()));
                            bundle.putParcelable("COLLECTED_DATA", CollectedDataConversions.toCollectedData(inquiryFragment3.getViewModel().getDataCollector().getCollectedData()));
                            String sessionToken2 = complete.getSessionToken();
                            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? InquiryArguments.INSTANCE.removeBearer(sessionToken2) : null);
                            Unit unit = Unit.INSTANCE;
                            Fragment2.setFragmentResult(inquiryFragment2, requestKey, bundle);
                        } else if (output instanceof InquiryWorkflow.Output.ReinitializeWithFallbackMode) {
                            InquiryWorkflow.Output.ReinitializeWithFallbackMode reinitializeWithFallbackMode = (InquiryWorkflow.Output.ReinitializeWithFallbackMode) output;
                            inquiryFragment.getViewModel().getInquiryId().setValue(reinitializeWithFallbackMode.getInquiryId());
                            inquiryFragment.getViewModel().getSessionToken().setValue(reinitializeWithFallbackMode.getSessionToken());
                            inquiryFragment.getViewModel().setForceFallbackMode$inquiry_internal_release(true);
                        } else if (output instanceof InquiryWorkflow.Output.Cancel) {
                            InquiryWorkflow.Output.Cancel cancel = (InquiryWorkflow.Output.Cancel) output;
                            if (cancel.getForce()) {
                                inquiryFragment.onCancelClick$inquiry_internal_release(cancel);
                            } else {
                                CancelDialogFragment.Companion companion = CancelDialogFragment.INSTANCE;
                                FragmentManager childFragmentManager = inquiryFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                companion.show$inquiry_internal_release(childFragmentManager, inquiryFragment.getTheme(), cancel);
                            }
                        } else {
                            if (!(output instanceof InquiryWorkflow.Output.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            InquiryWorkflow.Output.Error error = (InquiryWorkflow.Output.Error) output;
                            String sessionToken3 = error.getSessionToken();
                            if (sessionToken3 != null) {
                                inquiryComponent.errorReportingManager().reportError(sessionToken3, error.getCause());
                            }
                            InquiryFragment inquiryFragment4 = inquiryFragment;
                            String requestKey2 = inquiryFragment4.getArgs().getRequestKey();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
                            bundle2.putString("ERROR_DEBUG_MESSAGE_KEY", error.getDebugMessage());
                            bundle2.putParcelable("ERROR_CODE_KEY", error.getErrorCode());
                            Unit unit2 = Unit.INSTANCE;
                            Fragment2.setFragmentResult(inquiryFragment4, requestKey2, bundle2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (result.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ThreatEventState2.registerThreatEventReceiver(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().refreshAppSetId();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ThreatEventState2.unregisterThreatEventReceiver(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ExceptionUtils3.unregisterExceptionHandler(contextRequireContext);
        InlineInquiryController controller = getController();
        if (controller != null) {
            controller.onDetached();
        }
        super.onDestroy();
        getViewModel().onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        FontDownloader.INSTANCE.getInstance().saveState(outState);
    }

    private final boolean validateArgumentsOrFinish() {
        String sessionToken = getArgs().getSessionToken();
        if (sessionToken == null || !StringsKt.contains$default((CharSequence) sessionToken, '\n', false, 2, (Object) null)) {
            return true;
        }
        String requestKey = getArgs().getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.SessionTokenError);
        Unit unit = Unit.INSTANCE;
        Fragment2.setFragmentResult(this, requestKey, bundle);
        getParentFragmentManager().popBackStack();
        return false;
    }

    private final InlineInquiryController getController() {
        ActivityResultCaller parentFragment = getParentFragment();
        KeyEventDispatcher.Component activity = getActivity();
        if (parentFragment instanceof InlineInquiryController) {
            return (InlineInquiryController) parentFragment;
        }
        if (activity instanceof InlineInquiryController) {
            return (InlineInquiryController) activity;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    public final void onCancelClick$inquiry_internal_release(InquiryWorkflow.Output.Cancel cancelOutput) {
        InquiryComponent inquiryComponent;
        ErrorReportingManager errorReportingManager;
        Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
        String sessionToken = cancelOutput.getSessionToken();
        if (sessionToken != null && (inquiryComponent = this.component) != null && (errorReportingManager = inquiryComponent.errorReportingManager()) != null) {
            errorReportingManager.reportSessionCancelled(sessionToken);
        }
        String requestKey = getArgs().getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        if (ExtensionsKt.isRegularInquiryId(cancelOutput.getInquiryId())) {
            bundle.putString("INQUIRY_ID_KEY", cancelOutput.getInquiryId());
            String sessionToken2 = cancelOutput.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? InquiryArguments.INSTANCE.removeBearer(sessionToken2) : null);
        }
        Unit unit = Unit.INSTANCE;
        Fragment2.setFragmentResult(this, requestKey, bundle);
    }

    private final boolean isInline() {
        return requireActivity().getClass() != InquiryActivity.class;
    }
}
