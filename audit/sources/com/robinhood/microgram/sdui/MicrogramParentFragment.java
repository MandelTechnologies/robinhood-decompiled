package com.robinhood.microgram.sdui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import com.google.android.play.core.ktx.AppUpdateResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.microgram.sdui.MicrogramRouterFragment;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey3;
import com.robinhood.shared.common.contracts.MicrogramRouterTabFragmentKey;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.Monitoring;
import microgram.android.sdui.R$id;
import microgram.p507ui.p508v1.InitialScreenDataDto;

/* compiled from: MicrogramParentFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u000212B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\u000e\u0010%\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010,\u001a\u00020-*\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/microgram/sdui/MicrogramRouterFragmentCallbacks;", "<init>", "()V", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "getAppUpdateManager", "()Lcom/google/android/play/core/appupdate/AppUpdateManager;", "setAppUpdateManager", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "appUpdateLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "appUtilsViewModel", "Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel;", "getAppUtilsViewModel", "()Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel;", "appUtilsViewModel$delegate", "Lkotlin/Lazy;", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showErrorDialog", "checkForUpdate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDialogDismissed", "id", "", "dismissChild", "dismissEntireMicrogramFlow", "shimmerLoadingNavButtonType", "Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "getShimmerLoadingNavButtonType", "(Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;)Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;", "Companion", "MicrogramRouterTabFragmentKeyResolver", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MicrogramParentFragment extends BaseFragment implements MicrogramRouterFragment2 {
    private static final String emptyStateSaveName = "empty";
    private final ActivityResultLauncher<IntentSenderRequest> appUpdateLauncher;
    public AppUpdateManager appUpdateManager;

    /* renamed from: appUtilsViewModel$delegate, reason: from kotlin metadata */
    private final Lazy appUtilsViewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MicrogramRouterFragmentKey2.values().length];
            try {
                iArr[MicrogramRouterFragmentKey2.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MicrogramRouterFragmentKey2.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MicrogramRouterFragmentKey2.BOXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MicrogramRouterFragmentKey2.HERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MicrogramRouterFragmentKey2.EMPTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MicrogramRouterFragmentKey3.values().length];
            try {
                iArr2[MicrogramRouterFragmentKey3.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MicrogramRouterFragmentKey3.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramParentFragment", m3645f = "MicrogramParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.f2780x600b66fe}, m3647m = "checkForUpdate")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$checkForUpdate$1 */
    static final class C349981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349981(Continuation<? super C349981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramParentFragment.this.checkForUpdate(this);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public MicrogramParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        ActivityResultLauncher<IntentSenderRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$appUpdateLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.dismissEntireMicrogramFlow();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.appUpdateLauncher = activityResultLauncherRegisterForActivityResult;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$special$$inlined$viewModels$default$2
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
        this.appUtilsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MicrogramParentFragment2.class), new Function0<ViewModelStore>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m8219viewModels$lambda1(lazy).getStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$special$$inlined$viewModels$default$5
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
    }

    public final AppUpdateManager getAppUpdateManager() {
        AppUpdateManager appUpdateManager = this.appUpdateManager;
        if (appUpdateManager != null) {
            return appUpdateManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appUpdateManager");
        return null;
    }

    public final void setAppUpdateManager(AppUpdateManager appUpdateManager) {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<set-?>");
        this.appUpdateManager = appUpdateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramParentFragment2 getAppUtilsViewModel() {
        return (MicrogramParentFragment2) this.appUtilsViewModel.getValue();
    }

    @Override // com.robinhood.microgram.sdui.MicrogramAppUtils
    public MicrogramManager2 getInstance() {
        return getAppUtilsViewModel().getInstance();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getWindow().setSoftInputMode(16);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        ShimmerLoaderType list;
        super.onCreate(savedInstanceState);
        Fragment currentFragment = getCurrentFragment();
        MicrogramRouterFragment microgramRouterFragment = currentFragment instanceof MicrogramRouterFragment ? (MicrogramRouterFragment) currentFragment : null;
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((MicrogramRouterFragmentKey) companion.getArgs((Fragment) this)).getLoadingContent().ordinal()];
        if (i == 1) {
            list = new ShimmerLoaderType.List(true, false, 0, 6, null);
        } else if (i == 2) {
            list = new ShimmerLoaderType.Generic(false, 1, null);
        } else if (i == 3) {
            list = ShimmerLoaderType.Boxes.INSTANCE;
        } else if (i == 4) {
            list = new ShimmerLoaderType.Hero(true, false, null, 6, null);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            list = ShimmerLoaderType.Empty.INSTANCE;
        }
        if (getAppUtilsViewModel().getAndResetRecreationFlag()) {
            if (microgramRouterFragment != null) {
                getChildFragmentManager().beginTransaction().remove(microgramRouterFragment).disallowAddToBackStack().commitNowAllowingStateLoss();
            }
            replaceFragmentWithoutAnimationAndBackStack(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(list, getShimmerLoadingNavButtonType(((MicrogramRouterFragmentKey) companion.getArgs((Fragment) this)).getNavButtonType()))));
        } else if (microgramRouterFragment == null) {
            getChildFragmentManager().saveBackStack(emptyStateSaveName);
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(list, getShimmerLoadingNavButtonType(((MicrogramRouterFragmentKey) companion.getArgs((Fragment) this)).getNavButtonType()))));
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C349991(null), 3, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C350002(null));
    }

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$1", m3645f = "MicrogramParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$1 */
    static final class C349991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C349991(Continuation<? super C349991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramParentFragment.this.new C349991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C349991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred<UiObject<InitialScreenData, InitialScreenDataDto>> initialScreenDataAsync = MicrogramParentFragment.this.getAppUtilsViewModel().getInitialScreenDataAsync();
                this.label = 1;
                obj = initialScreenDataAsync.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            MicrogramParentFragment.this.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new AnonymousClass1(MicrogramParentFragment.this, (UiObject) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MicrogramParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$1$1", m3645f = "MicrogramParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UiObject<InitialScreenData, InitialScreenDataDto> $initialScreenData;
            int label;
            final /* synthetic */ MicrogramParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MicrogramParentFragment microgramParentFragment, UiObject<InitialScreenData, InitialScreenDataDto> uiObject, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = microgramParentFragment;
                this.$initialScreenData = uiObject;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$initialScreenData, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!(this.this$0.getCurrentFragment() instanceof MicrogramRouterFragment)) {
                    MicrogramParentFragment microgramParentFragment = this.this$0;
                    MicrogramRouterFragment.Companion companion = MicrogramRouterFragment.INSTANCE;
                    UiObject<InitialScreenData, InitialScreenDataDto> uiObject = this.$initialScreenData;
                    Companion companion2 = MicrogramParentFragment.INSTANCE;
                    microgramParentFragment.replaceFragmentWithoutAnimationAndBackStack(companion.newInstance((Parcelable) new MicrogramRouterFragment.Args(uiObject, ((MicrogramRouterFragmentKey) companion2.getArgs((Fragment) this.this$0)).getLoadingContent(), ((MicrogramRouterFragmentKey) companion2.getArgs((Fragment) this.this$0)).getNavButtonType())));
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2", m3645f = "MicrogramParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2 */
    static final class C350002 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C350002(Continuation<? super C350002> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramParentFragment.this.new C350002(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Monitoring> state = MicrogramParentFragment.this.getInstance().getComponent().getMicrogramMonitor().getState();
                Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2$invokeSuspend$$inlined$filterIsInstance$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object objCollect = state.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "MicrogramParentFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramParentFragment$onCreate$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (obj instanceof Monitoring.Terminated) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                final MicrogramParentFragment microgramParentFragment = MicrogramParentFragment.this;
                FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: com.robinhood.microgram.sdui.MicrogramParentFragment.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Monitoring.Terminated) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Monitoring.Terminated terminated, Continuation<? super Unit> continuation) {
                        if ((terminated instanceof Monitoring.Terminated.Closed) || (terminated instanceof Monitoring.Terminated.Failure)) {
                            microgramParentFragment.showErrorDialog();
                            return Unit.INSTANCE;
                        }
                        if (terminated instanceof Monitoring.Terminated.AppUpdateRequired) {
                            Object objCheckForUpdate = microgramParentFragment.checkForUpdate(continuation);
                            return objCheckForUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCheckForUpdate : Unit.INSTANCE;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
    public final void showErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder positiveButton = companion.create(fragmentActivityRequireActivity).setId(R$id.microgram_sdui_error_dialog).setMessage(C11048R.string.error_description_something_went_wrong, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "microgram-error", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (((com.google.android.play.core.ktx.AppUpdateResult.Downloaded) r8).completeUpdate(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkForUpdate(Continuation<? super Unit> continuation) {
        C349981 c349981;
        if (continuation instanceof C349981) {
            c349981 = (C349981) continuation;
            int i = c349981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349981.label = i - Integer.MIN_VALUE;
            } else {
                c349981 = new C349981(continuation);
            }
        }
        Object objFirstOrNull = c349981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c349981.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CrashReporter.INSTANCE.reportNonFatal(e2, false, new EventMetadata(SentryTeam.MOBILE_PLATFORM, null, null, 6, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<AppUpdateResult> flowRequestUpdateFlow = AppUpdateManagerKtxKt.requestUpdateFlow(getAppUpdateManager());
            c349981.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRequestUpdateFlow, c349981);
            if (objFirstOrNull == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        AppUpdateResult appUpdateResult = (AppUpdateResult) objFirstOrNull;
        if (appUpdateResult instanceof AppUpdateResult.Available) {
            ((AppUpdateResult.Available) appUpdateResult).startImmediateUpdate(this.appUpdateLauncher);
        } else if (appUpdateResult instanceof AppUpdateResult.Downloaded) {
            c349981.label = 2;
        } else {
            if (!(appUpdateResult instanceof AppUpdateResult.InProgress) && appUpdateResult != null && !Intrinsics.areEqual(appUpdateResult, AppUpdateResult.NotAvailable.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            showErrorDialog();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == R$id.microgram_sdui_error_dialog) {
            dismissEntireMicrogramFlow();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissChild() {
        if (popNearestParentBackStack()) {
            return;
        }
        requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissEntireMicrogramFlow() {
        dismissChild();
    }

    private final ShimmerLoadingFragment.Args.NavButtonType getShimmerLoadingNavButtonType(MicrogramRouterFragmentKey3 microgramRouterFragmentKey3) {
        int i = WhenMappings.$EnumSwitchMapping$1[microgramRouterFragmentKey3.ordinal()];
        if (i == 1) {
            return ShimmerLoadingFragment.Args.NavButtonType.BACK;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ShimmerLoadingFragment.Args.NavButtonType.CLOSE;
    }

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/MicrogramParentFragment;", "Lcom/robinhood/shared/common/contracts/MicrogramRouterFragmentKey;", "<init>", "()V", "emptyStateSaveName", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MicrogramParentFragment, MicrogramRouterFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MicrogramRouterFragmentKey microgramRouterFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, microgramRouterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MicrogramRouterFragmentKey getArgs(MicrogramParentFragment microgramParentFragment) {
            return (MicrogramRouterFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, microgramParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramParentFragment newInstance(MicrogramRouterFragmentKey microgramRouterFragmentKey) {
            return (MicrogramParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, microgramRouterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramParentFragment microgramParentFragment, MicrogramRouterFragmentKey microgramRouterFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, microgramParentFragment, microgramRouterFragmentKey);
        }
    }

    /* compiled from: MicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramParentFragment$MicrogramRouterTabFragmentKeyResolver;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/MicrogramParentFragment;", "Lcom/robinhood/shared/common/contracts/MicrogramRouterTabFragmentKey;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MicrogramRouterTabFragmentKeyResolver implements FragmentResolverWithArgsCompanion<MicrogramParentFragment, MicrogramRouterTabFragmentKey> {
        public static final int $stable = 0;
        public static final MicrogramRouterTabFragmentKeyResolver INSTANCE = new MicrogramRouterTabFragmentKeyResolver();

        private MicrogramRouterTabFragmentKeyResolver() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MicrogramRouterTabFragmentKey getArgs(MicrogramParentFragment microgramParentFragment) {
            return (MicrogramRouterTabFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, microgramParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramParentFragment newInstance(MicrogramRouterTabFragmentKey microgramRouterTabFragmentKey) {
            return (MicrogramParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, microgramRouterTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramParentFragment microgramParentFragment, MicrogramRouterTabFragmentKey microgramRouterTabFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, microgramParentFragment, microgramRouterTabFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MicrogramRouterTabFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return MicrogramParentFragment.INSTANCE.newInstance((Parcelable) new MicrogramRouterFragmentKey(key.getSource(), key.getDeeplink(), null, key.getLoadingContent(), key.getNavButtonType(), 4, null));
        }
    }
}
