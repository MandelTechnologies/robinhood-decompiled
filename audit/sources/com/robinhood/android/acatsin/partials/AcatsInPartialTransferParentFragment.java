package com.robinhood.android.acatsin.partials;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment;
import com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract;
import com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentFragment;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment;
import com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetParentFragment;
import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetParentFragment;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.contracts.MarginUpgradeContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AcatsInPartialTransferParentFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00013B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010%\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R(\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000201 2*\n\u0012\u0004\u0012\u000201\u0018\u000100000/X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Callbacks;", "Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "buildPartialFragment", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment;", "callbacks", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAddAssetClicked", "addAssetItem", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "onEditAssetClicked", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAssetEntered", "onAssetUpdated", "onAssetRemoved", "onDoneClicked", "assets", "", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "onSecondaryButtonClicked", "enableMarginLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/margin/contracts/EnableMarginInvestingKey;", "kotlin.jvm.PlatformType", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialTransferParentFragment extends BaseFragment implements AcatsInBuildPartialFragment.Callbacks, AcatsInAssetPageCallbacks, RhBottomSheetDialogFragment.OnClickListener, AutoLoggableFragment {
    private AcatsInBuildPartialFragment buildPartialFragment;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EnableMarginInvestingKey>> enableMarginLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPartialTransferParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInPartialTransferParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.Asset.AssetType.values().length];
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return false;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInPartialTransferParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPartialTransferParentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInPartialTransferParentContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EnableMarginInvestingKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new MarginUpgradeContract(new Function0() { // from class: com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentFragment$enableMarginLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(MarginUpgradeContract.Result result) {
                AcatsInPartialTransferParentFragment acatsInPartialTransferParentFragment = this.this$0;
                AcatsInPartialCashAssetFragment.Companion companion = AcatsInPartialCashAssetFragment.INSTANCE;
                boolean z = result instanceof MarginUpgradeContract.Result.Complete;
                AcatsInPartialTransferParentFragment.Companion companion2 = AcatsInPartialTransferParentFragment.INSTANCE;
                acatsInPartialTransferParentFragment.replaceFragment(companion.newInstance((Parcelable) new AcatsInPartialCashAssetFragment.Args(true, ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) acatsInPartialTransferParentFragment)).getRhsAccountNumber(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this.this$0)).getAccountNumber(), null, z, 8, null)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.enableMarginLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* compiled from: AcatsInPartialTransferParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentFragment;", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInPartialTransferParentFragment, AcatsInPartialTransferParentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInPartialTransferParentContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInPartialTransferParentContract.Key getArgs(AcatsInPartialTransferParentFragment acatsInPartialTransferParentFragment) {
            return (AcatsInPartialTransferParentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPartialTransferParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPartialTransferParentFragment newInstance(AcatsInPartialTransferParentContract.Key key) {
            return (AcatsInPartialTransferParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPartialTransferParentFragment acatsInPartialTransferParentFragment, AcatsInPartialTransferParentContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPartialTransferParentFragment, key);
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_PARTIAL_TRANSFER;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInPartialTransferParentContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInPartialTransferParentContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInPartialTransferParentContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    private final AcatsInPartialTransferParentContract.Callbacks getCallbacks() {
        return (AcatsInPartialTransferParentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragment currentFragment = getCurrentFragment();
        AcatsInBuildPartialFragment acatsInBuildPartialFragment = null;
        AcatsInBuildPartialFragment acatsInBuildPartialFragment2 = currentFragment instanceof AcatsInBuildPartialFragment ? (AcatsInBuildPartialFragment) currentFragment : null;
        if (acatsInBuildPartialFragment2 == null) {
            AcatsInBuildPartialFragment.Companion companion = AcatsInBuildPartialFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            AcatsInBuildPartialFragment acatsInBuildPartialFragment3 = (AcatsInBuildPartialFragment) companion.newInstance((Parcelable) new AcatsInBuildPartialFragment.Args(((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getBrokerageOrDtcNumber(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getRhsAccountNumber(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getRhsAccountTitle(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getSupportedContentTypes(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getBuildPartialBannerContentfulId(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getAssets(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).isAcatsRetry(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getHasSubzeroExperiment()));
            this.buildPartialFragment = acatsInBuildPartialFragment3;
            int i = C11048R.id.fragment_container;
            if (acatsInBuildPartialFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buildPartialFragment");
            } else {
                acatsInBuildPartialFragment = acatsInBuildPartialFragment3;
            }
            setFragment(i, acatsInBuildPartialFragment);
            return;
        }
        this.buildPartialFragment = acatsInBuildPartialFragment2;
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment.Callbacks
    public void onAddAssetClicked(BuildPartialItem.AddAsset addAssetItem) {
        BaseFragment baseFragment;
        Intrinsics.checkNotNullParameter(addAssetItem, "addAssetItem");
        int i = WhenMappings.$EnumSwitchMapping$0[addAssetItem.getType().ordinal()];
        if (i == 1) {
            AcatsInPartialCashAssetFragment.Companion companion = AcatsInPartialCashAssetFragment.INSTANCE;
            boolean isMarginSupported = addAssetItem.getIsMarginSupported();
            Companion companion2 = INSTANCE;
            baseFragment = (BaseFragment) companion.newInstance((Parcelable) new AcatsInPartialCashAssetFragment.Args(isMarginSupported, ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getRhsAccountNumber(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getAccountNumber(), null, false, 24, null));
        } else if (i == 2) {
            baseFragment = (BaseFragment) AcatsInPartialEquityAssetParentFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialEquityAssetParentFragment.Args(null, ((AcatsInPartialTransferParentContract.Key) INSTANCE.getArgs((Fragment) this)).getHasSubzeroExperiment(), 1, null));
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Unknown ACATs asset type " + addAssetItem.getType()).toString());
            }
            baseFragment = (BaseFragment) AcatsInPartialOptionAssetParentFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialOptionAssetParentFragment.Args(null, false, 3, null));
        }
        replaceFragment(baseFragment);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment.Callbacks
    public void onEditAssetClicked(UiAcatsAsset asset) {
        BaseFragment baseFragment;
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof UiAcatsAsset.CashAsset) {
            AcatsInPartialCashAssetFragment.Companion companion = AcatsInPartialCashAssetFragment.INSTANCE;
            UiAcatsAsset.CashAsset cashAsset = (UiAcatsAsset.CashAsset) asset;
            boolean zIsMarginSupported = cashAsset.isMarginSupported();
            Companion companion2 = INSTANCE;
            baseFragment = (BaseFragment) companion.newInstance((Parcelable) new AcatsInPartialCashAssetFragment.Args(zIsMarginSupported, ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getRhsAccountNumber(), ((AcatsInPartialTransferParentContract.Key) companion2.getArgs((Fragment) this)).getAccountNumber(), cashAsset, false, 16, null));
        } else if (asset instanceof UiAcatsAsset.EquityAsset) {
            baseFragment = (BaseFragment) AcatsInPartialEquityAssetParentFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialEquityAssetParentFragment.Args((UiAcatsAsset.EquityAsset) asset, ((AcatsInPartialTransferParentContract.Key) INSTANCE.getArgs((Fragment) this)).getHasSubzeroExperiment()));
        } else {
            if (!(asset instanceof UiAcatsAsset.OptionAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            baseFragment = (BaseFragment) AcatsInPartialOptionAssetParentFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialOptionAssetParentFragment.Args((UiAcatsAsset.OptionAsset) asset, false, 2, null));
        }
        replaceFragment(baseFragment);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetEntered(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        popLastFragment();
        AcatsInBuildPartialFragment acatsInBuildPartialFragment = this.buildPartialFragment;
        if (acatsInBuildPartialFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildPartialFragment");
            acatsInBuildPartialFragment = null;
        }
        acatsInBuildPartialFragment.addAsset(asset);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetUpdated(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        popLastFragment();
        AcatsInBuildPartialFragment acatsInBuildPartialFragment = this.buildPartialFragment;
        if (acatsInBuildPartialFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildPartialFragment");
            acatsInBuildPartialFragment = null;
        }
        acatsInBuildPartialFragment.updateAsset(asset);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetRemoved(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        popLastFragment();
        AcatsInBuildPartialFragment acatsInBuildPartialFragment = this.buildPartialFragment;
        if (acatsInBuildPartialFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildPartialFragment");
            acatsInBuildPartialFragment = null;
        }
        acatsInBuildPartialFragment.removeAsset(asset);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment.Callbacks
    public void onDoneClicked(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        getCallbacks().onBuildPartialTransferComplete(assets);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        String str;
        if (dialogId == C7686R.id.dialog_id_conflicting_asset_entered) {
            UiAcatsAsset uiAcatsAsset = passthroughArgs != null ? (UiAcatsAsset) passthroughArgs.getParcelable(AcatsInBuildPartialFragment.CONFLICTING_ASSET_KEY) : null;
            if (uiAcatsAsset != null) {
                onEditAssetClicked(uiAcatsAsset);
            }
            return true;
        }
        if (dialogId == C7686R.id.dialog_id_options_not_enabled) {
            Companion companion = INSTANCE;
            String rhsAccountNumber = ((AcatsInPartialTransferParentContract.Key) companion.getArgs((Fragment) this)).getRhsAccountNumber();
            if (rhsAccountNumber != null) {
                if (((AcatsInPartialTransferParentContract.Key) companion.getArgs((Fragment) this)).getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    str = OptionOnboarding.OptionOnboardingSource.Legacy.SOURCE_ACATS_JOINT_ACCOUNT;
                } else {
                    str = OptionOnboarding.OptionOnboardingSource.Legacy.SOURCE_ACATS;
                }
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OptionOnboarding(new OptionOnboarding2.AccountNumber(rhsAccountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy(str), null, 4, null), null, false, null, null, 60, null);
            }
            return true;
        }
        if (dialogId != C7686R.id.dialog_id_margin_not_enabled) {
            return false;
        }
        NavigationActivityResultContract3.launch$default(this.enableMarginLauncher, new EnableMarginInvestingKey(((AcatsInPartialTransferParentContract.Key) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), "PARTIAL_ACATS_IN", EnableMarginInvestingKey2.AcatsIn.INSTANCE, false, false, 16, null), null, false, 6, null);
        return true;
    }
}
