package com.robinhood.shared.stepupverification.identityverification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.pathfinder.contexts.IdentityVerificationInitiateContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.databinding.FragmentLoadingWithErrorViewBinding;
import com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateViewState;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IdentityVerificationInitiateFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateDuxo;", "getDuxo", "()Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", "getBinding", "()Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "docUploadLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "launchDocUpload", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IdentityVerificationInitiateFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<Intent> docUploadLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IdentityVerificationInitiateFragment.class, "binding", "getBinding()Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public IdentityVerificationInitiateFragment() {
        super(C39791R.layout.fragment_loading_with_error_view);
        this.duxo = OldDuxos.oldDuxo(this, IdentityVerificationInitiateDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, IdentityVerificationInitiateFragment2.INSTANCE);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateFragment$docUploadLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                int resultCode = result.getResultCode();
                if (resultCode == -1) {
                    this.this$0.getDuxo().submitVerificationResult(true);
                } else if (resultCode == 2) {
                    this.this$0.getDuxo().submitVerificationResult(false);
                } else {
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.docUploadLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityVerificationInitiateDuxo getDuxo() {
        return (IdentityVerificationInitiateDuxo) this.duxo.getValue();
    }

    private final FragmentLoadingWithErrorViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoadingWithErrorViewBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C398561(this));
    }

    /* compiled from: IdentityVerificationInitiateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateFragment$onStart$1 */
    /* synthetic */ class C398561 extends FunctionReferenceImpl implements Function1<IdentityVerificationInitiateViewState, Unit> {
        C398561(Object obj) {
            super(1, obj, IdentityVerificationInitiateFragment.class, "bind", "bind(Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentityVerificationInitiateViewState identityVerificationInitiateViewState) {
            invoke2(identityVerificationInitiateViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(IdentityVerificationInitiateViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((IdentityVerificationInitiateFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            launchDocUpload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final IdentityVerificationInitiateViewState state) {
        ErrorView errorView = getBinding().errorView;
        Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
        errorView.setVisibility(state.getShowErrorView() ? 0 : 8);
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getShowLoadingView() ? 0 : 8);
        if (state instanceof IdentityVerificationInitiateViewState.InputError) {
            getBinding().errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdentityVerificationInitiateFragment.bind$lambda$0(this.f$0, state);
                }
            });
        } else {
            if (state instanceof IdentityVerificationInitiateViewState.Initial) {
                return;
            }
            if (!(state instanceof IdentityVerificationInitiateViewState.UnknownError)) {
                throw new NoWhenBranchMatchedException();
            }
            ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), ((IdentityVerificationInitiateViewState.UnknownError) state).getThrowable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(IdentityVerificationInitiateFragment identityVerificationInitiateFragment, IdentityVerificationInitiateViewState identityVerificationInitiateViewState) {
        identityVerificationInitiateFragment.getDuxo().submitVerificationResult(((IdentityVerificationInitiateViewState.InputError) identityVerificationInitiateViewState).getVerificationSuccess());
        return Unit.INSTANCE;
    }

    private final void launchDocUpload() {
        Observable<IdentityVerificationInitiateViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdentityVerificationInitiateFragment.launchDocUpload$lambda$2(this.f$0, (IdentityVerificationInitiateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchDocUpload$lambda$2(IdentityVerificationInitiateFragment identityVerificationInitiateFragment, IdentityVerificationInitiateViewState identityVerificationInitiateViewState) {
        IdentityVerificationInitiateContext context = ((UserViewStatePageContext.IdentityVerificationInitiate) ((LegacyFragmentKey.PathfinderIdentityVerificationInitiate) INSTANCE.getArgs((Fragment) identityVerificationInitiateFragment)).getUserViewState().getTypeContext()).getContext();
        List<UUID> documentRequestIds = context.getDocumentRequestIds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documentRequestIds, 10));
        Iterator<T> it = documentRequestIds.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(DocumentRequest.INSTANCE.forDocumentRequestId((UUID) it.next()));
            } catch (NullPointerException e) {
                CrashReporter.INSTANCE.log(CollectionsKt.joinToString$default(context.getDocumentRequestIds(), null, null, null, 0, null, null, 63, null));
                throw e;
            }
        }
        Navigator navigator = identityVerificationInitiateFragment.getNavigator();
        Context contextRequireContext = identityVerificationInitiateFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        identityVerificationInitiateFragment.docUploadLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new DocumentUpload(arrayList, false, false, null, true, null, false, null, false, 494, null), false, false, false, null, false, true, false, false, identityVerificationInitiateViewState.getIsLoggedIn(), null, false, 6772, null));
        return Unit.INSTANCE;
    }

    /* compiled from: IdentityVerificationInitiateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderIdentityVerificationInitiate;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<IdentityVerificationInitiateFragment, LegacyFragmentKey.PathfinderIdentityVerificationInitiate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderIdentityVerificationInitiate pathfinderIdentityVerificationInitiate) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderIdentityVerificationInitiate);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderIdentityVerificationInitiate getArgs(IdentityVerificationInitiateFragment identityVerificationInitiateFragment) {
            return (LegacyFragmentKey.PathfinderIdentityVerificationInitiate) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, identityVerificationInitiateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IdentityVerificationInitiateFragment newInstance(LegacyFragmentKey.PathfinderIdentityVerificationInitiate pathfinderIdentityVerificationInitiate) {
            return (IdentityVerificationInitiateFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderIdentityVerificationInitiate);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IdentityVerificationInitiateFragment identityVerificationInitiateFragment, LegacyFragmentKey.PathfinderIdentityVerificationInitiate pathfinderIdentityVerificationInitiate) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, identityVerificationInitiateFragment, pathfinderIdentityVerificationInitiate);
        }
    }
}
