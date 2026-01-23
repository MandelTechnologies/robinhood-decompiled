package com.robinhood.android.transfers.pathfinder.p269ui.transferfunds;

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
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.pathfinder.C30419R;
import com.robinhood.android.transfers.pathfinder.databinding.FragmentPathfinderTransferFundsBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.pathfinder.contexts.AccountType;
import com.robinhood.models.api.pathfinder.contexts.TransferType;
import com.robinhood.models.p355ui.pathfinder.contexts.TransferFundsContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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

/* compiled from: PathfinderTransferFundsFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0002J\f\u0010*\u001a\u00020+*\u00020,H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010%\u001a\u00020&*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "getDefaultAchRelationshipPref", "()Lcom/robinhood/prefs/StringPreference;", "setDefaultAchRelationshipPref", "(Lcom/robinhood/prefs/StringPreference;)V", "duxo", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/pathfinder/databinding/FragmentPathfinderTransferFundsBinding;", "getBinding", "()Lcom/robinhood/android/transfers/pathfinder/databinding/FragmentPathfinderTransferFundsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "launchActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "bind", "state", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "Lcom/robinhood/models/api/pathfinder/contexts/AccountType;", "getTransferAccountType", "(Lcom/robinhood/models/api/pathfinder/contexts/AccountType;)Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "toTransferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Lcom/robinhood/models/ui/pathfinder/contexts/TransferFundsContext;", "Companion", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PathfinderTransferFundsFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @DefaultAchRelationship
    public StringPreference defaultAchRelationshipPref;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> launchActivity;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PathfinderTransferFundsFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/pathfinder/databinding/FragmentPathfinderTransferFundsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PathfinderTransferFundsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.BROKERAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.SPENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PathfinderTransferFundsFragment() {
        super(C30419R.layout.fragment_pathfinder_transfer_funds);
        this.duxo = OldDuxos.oldDuxo(this, PathfinderTransferFundsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PathfinderTransferFundsFragment2.INSTANCE);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsFragment$launchActivity$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getResultCode() == -1) {
                    this.this$0.getDuxo().submitResult();
                } else {
                    this.this$0.requireActivity().onBackPressed();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launchActivity = activityResultLauncherRegisterForActivityResult;
    }

    public final StringPreference getDefaultAchRelationshipPref() {
        StringPreference stringPreference = this.defaultAchRelationshipPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultAchRelationshipPref");
        return null;
    }

    public final void setDefaultAchRelationshipPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.defaultAchRelationshipPref = stringPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderTransferFundsDuxo getDuxo() {
        return (PathfinderTransferFundsDuxo) this.duxo.getValue();
    }

    private final FragmentPathfinderTransferFundsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPathfinderTransferFundsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            TransferConfiguration transferConfiguration = toTransferConfiguration(((UserViewStatePageContext.TransferFundsPage) ((LegacyFragmentKey.PathfinderTransferFunds) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext());
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            this.launchActivity.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Transfer(transferConfiguration), null, false, 12, null));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C304381(this));
    }

    /* compiled from: PathfinderTransferFundsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsFragment$onStart$1 */
    /* synthetic */ class C304381 extends FunctionReferenceImpl implements Function1<PathfinderTransferFundsViewState, Unit> {
        C304381(Object obj) {
            super(1, obj, PathfinderTransferFundsFragment.class, "bind", "bind(Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PathfinderTransferFundsViewState pathfinderTransferFundsViewState) {
            invoke2(pathfinderTransferFundsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PathfinderTransferFundsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PathfinderTransferFundsFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().transferFundsErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PathfinderTransferFundsFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PathfinderTransferFundsFragment pathfinderTransferFundsFragment) {
        pathfinderTransferFundsFragment.getDuxo().submitResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PathfinderTransferFundsViewState state) {
        ShimmerLoadingView transferFundsLoadingView = getBinding().transferFundsLoadingView;
        Intrinsics.checkNotNullExpressionValue(transferFundsLoadingView, "transferFundsLoadingView");
        transferFundsLoadingView.setVisibility(state.getShowLoadingView() ? 0 : 8);
        ErrorView transferFundsErrorView = getBinding().transferFundsErrorView;
        Intrinsics.checkNotNullExpressionValue(transferFundsErrorView, "transferFundsErrorView");
        transferFundsErrorView.setVisibility(state.getShowErrorView() ? 0 : 8);
    }

    private final ApiTransferAccount.TransferAccountType getTransferAccountType(AccountType accountType) {
        int i = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
        if (i == 1) {
            return ApiTransferAccount.TransferAccountType.RHS;
        }
        if (i == 2) {
            return ApiTransferAccount.TransferAccountType.RHY;
        }
        if (i == 3 || i == 4) {
            return ApiTransferAccount.TransferAccountType.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final TransferConfiguration toTransferConfiguration(TransferFundsContext transferFundsContext) {
        TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, getTransferAccountType(transferFundsContext.getTargetAccount()), 3, null);
        String str = getDefaultAchRelationshipPref().get();
        TransferConfiguration.TransferAccountSelection transferAccountSelection2 = str != null ? new TransferConfiguration.TransferAccountSelection(str, false, ApiTransferAccount.TransferAccountType.ACH, 2, null) : null;
        List<String> postTransferPagesToExclude = transferFundsContext.getPostTransferPagesToExclude();
        ApiPostTransferPage.PostTransferPageType.Companion companion = ApiPostTransferPage.PostTransferPageType.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = postTransferPagesToExclude.iterator();
        while (it.hasNext()) {
            ApiPostTransferPage.PostTransferPageType postTransferPageType = (ApiPostTransferPage.PostTransferPageType) companion.fromServerValue((String) it.next());
            if (postTransferPageType != null) {
                arrayList.add(postTransferPageType);
            }
        }
        return new TransferConfiguration.Standard(transferFundsContext.getAmount(), null, false, transferFundsContext.getTransferType() == TransferType.WITHDRAWAL ? transferAccountSelection : transferAccountSelection2, transferFundsContext.getTransferType() == TransferType.DEPOSIT ? transferAccountSelection : transferAccountSelection2, new ApiCreateTransferRequest.ApiPostTransferPageConfig(arrayList), null, null, false, false, null, null, false, 8134, null);
    }

    /* compiled from: PathfinderTransferFundsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderTransferFunds;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderTransferFundsFragment, LegacyFragmentKey.PathfinderTransferFunds> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderTransferFunds pathfinderTransferFunds) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderTransferFunds);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderTransferFunds getArgs(PathfinderTransferFundsFragment pathfinderTransferFundsFragment) {
            return (LegacyFragmentKey.PathfinderTransferFunds) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderTransferFundsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderTransferFundsFragment newInstance(LegacyFragmentKey.PathfinderTransferFunds pathfinderTransferFunds) {
            return (PathfinderTransferFundsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderTransferFunds);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderTransferFundsFragment pathfinderTransferFundsFragment, LegacyFragmentKey.PathfinderTransferFunds pathfinderTransferFunds) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderTransferFundsFragment, pathfinderTransferFunds);
        }
    }
}
