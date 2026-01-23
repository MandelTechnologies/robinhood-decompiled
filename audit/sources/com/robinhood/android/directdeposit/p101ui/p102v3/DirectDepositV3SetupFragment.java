package com.robinhood.android.directdeposit.p101ui.p102v3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositBranchV3Fragment;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositV3ManualSetupFragment;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositV3SetupFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormFlowFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.rhy.contracts.DirectDepositV3Contract;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectDepositV3SetupFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002%&B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 \u0015*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositBranchV3Fragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "callbacks", "Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "atomicActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSwitcher;", "kotlin.jvm.PlatformType", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onAutomaticSelected", "onManualSelected", "onGetPrefilledForm", "onPrefilledFormFlowCompleted", "onManualDirectDepositFlowCompleted", "AtomicContract", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositV3SetupFragment extends BaseFragment implements DirectDepositBranchV3Fragment.Callbacks, DirectDepositV3ManualSetupFragment.Callbacks, PreFilledFormFlowFragment.Callbacks {
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<LegacyIntentKey.DirectDepositSwitcher>> atomicActivityLauncher;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectDepositV3SetupFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormFlowFragment.Callbacks
    public void onPrefilledFormFlowCancelled(Survey survey) {
        PreFilledFormFlowFragment.Callbacks.DefaultImpls.onPrefilledFormFlowCancelled(this, survey);
    }

    public DirectDepositV3SetupFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DirectDepositV3Contract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3SetupFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<LegacyIntentKey.DirectDepositSwitcher>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new AtomicContract(new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3SetupFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3SetupFragment$atomicActivityLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(DirectDepositV3SetupFragment.AtomicContract.Result result) {
                if (result instanceof DirectDepositV3SetupFragment.AtomicContract.Result.Success) {
                    this.this$0.getCallbacks().onDirectDepositFlowCompleted(DirectDepositV3Contract.CompletionType.AUTOMATIC);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.atomicActivityLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DirectDepositV3Contract.Callbacks getCallbacks() {
        return (DirectDepositV3Contract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
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
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new DirectDepositBranchV3Fragment());
        }
    }

    @Override // com.robinhood.android.directdeposit.ui.v3.DirectDepositBranchV3Fragment.Callbacks
    public void onAutomaticSelected() {
        NavigationActivityResultContract3.launch$default(this.atomicActivityLauncher, new LegacyIntentKey.DirectDepositSwitcher(false, false, false, false, false, false, 38, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.directdeposit.ui.v3.DirectDepositBranchV3Fragment.Callbacks
    public void onManualSelected() {
        replaceFragment(new DirectDepositV3ManualSetupFragment());
    }

    @Override // com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment.Callbacks
    public void onGetPrefilledForm() {
        replaceFragment(PreFilledFormFlowFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormFlowFragment.Args(false, 1, null)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormFlowFragment.Callbacks
    public void onPrefilledFormFlowCompleted() {
        onManualDirectDepositFlowCompleted();
    }

    @Override // com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment.Callbacks
    public void onManualDirectDepositFlowCompleted() {
        getCallbacks().onDirectDepositFlowCompleted(DirectDepositV3Contract.CompletionType.MANUAL);
    }

    /* compiled from: DirectDepositV3SetupFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSwitcher;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "parseResult", "resultCode", "", "intent", "Landroid/content/Intent;", "Result", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AtomicContract extends NavigationActivityResultContract<LegacyIntentKey.DirectDepositSwitcher, Result> {
        public static final int $stable = NavigationActivityResultContract.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AtomicContract(Function0<? extends Navigator> navigatorDelegate) {
            super(navigatorDelegate);
            Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
        }

        /* compiled from: DirectDepositV3SetupFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "<init>", "()V", "Success", "Canceled", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result$Canceled;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result$Success;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Result implements Parcelable, NavigationActivityResultContract2 {
            public static final int $stable = 0;

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
            }

            /* compiled from: DirectDepositV3SetupFragment.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result$Success;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Success extends Result {
                public static final int $stable = 0;
                public static final Success INSTANCE = new Success();
                public static final Parcelable.Creator<Success> CREATOR = new Creator();

                /* compiled from: DirectDepositV3SetupFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Success> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Success createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Success.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Success[] newArray(int i) {
                        return new Success[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
                public int getResultCode() {
                    return -1;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }

                private Success() {
                    super(null);
                }
            }

            /* compiled from: DirectDepositV3SetupFragment.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result$Canceled;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$AtomicContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Canceled extends Result {
                public static final int $stable = 0;
                public static final Canceled INSTANCE = new Canceled();
                public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

                /* compiled from: DirectDepositV3SetupFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Canceled> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Canceled createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Canceled.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Canceled[] newArray(int i) {
                        return new Canceled[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
                public int getResultCode() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }

                private Canceled() {
                    super(null);
                }
            }
        }

        @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract, androidx.view.result.contract.ActivityResultContract
        public Result parseResult(int resultCode, Intent intent) {
            Result.Success success = Result.Success.INSTANCE;
            if (resultCode == success.getResultCode()) {
                return success;
            }
            Result.Canceled canceled = Result.Canceled.INSTANCE;
            if (resultCode == canceled.getResultCode()) {
                return canceled;
            }
            return null;
        }
    }

    /* compiled from: DirectDepositV3SetupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Key;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3SetupFragment;", "key", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<DirectDepositV3Contract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public DirectDepositV3SetupFragment createFragment(DirectDepositV3Contract.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new DirectDepositV3SetupFragment();
        }
    }
}
