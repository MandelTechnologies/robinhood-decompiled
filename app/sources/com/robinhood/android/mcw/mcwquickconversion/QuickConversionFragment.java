package com.robinhood.android.mcw.mcwquickconversion;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.mcw.contracts.CurrencyConverterContract;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.mcw.mcwquickconversion.models.UiEvent;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: QuickConversionFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "currencyConverterLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "navigateToCurrencyConverter", "finishWithSuccess", "updatedBalance", "Lcom/robinhood/models/util/Money;", "finishWithOrderCheckAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "handleConversionError", "handleRegionGateFailed", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-mcw-quick-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class QuickConversionFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private static final String TAG_QUICK_CONVERSION_ERROR_DIALOG = "quick_conversion_error_dialog";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuickConversionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof QuickConversionCallbacks)) {
                parentFragment = null;
            }
            QuickConversionCallbacks quickConversionCallbacks = (QuickConversionCallbacks) parentFragment;
            if (quickConversionCallbacks != null) {
                return quickConversionCallbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof QuickConversionCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>> currencyConverterLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuickConversionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(QuickConversionFragment quickConversionFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        quickConversionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public QuickConversionFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new CurrencyConverterContract(new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment$currencyConverterLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(CurrencyConverterContract.Result result) {
                if (result instanceof CurrencyConverterContract.Result.Completed) {
                    this.this$0.finishWithSuccess(((CurrencyConverterContract.Result.Completed) result).getUpdatedBalance());
                } else if (result != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.currencyConverterLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private final QuickConversionCallbacks getCallbacks() {
        return (QuickConversionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1633777840);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633777840, i2, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment.ComposeContent (QuickConversionFragment.kt:36)");
            }
            QuickConversionKey quickConversionKey = (QuickConversionKey) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuickConversionFragment.ComposeContent$lambda$2$lambda$1(this.f$0, (UiEvent) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            QuickConversionComposable.QuickConversionComposable(quickConversionKey, (Function1) objRememberedValue, null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickConversionFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(QuickConversionFragment quickConversionFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof UiEvent.Close) {
            quickConversionFragment.dismiss();
        } else if (event instanceof UiEvent.ConversionComplete) {
            quickConversionFragment.finishWithSuccess(((UiEvent.ConversionComplete) event).getUpdatedBalance());
        } else if (event instanceof UiEvent.ConversionError) {
            quickConversionFragment.handleConversionError();
        } else if (event instanceof UiEvent.EditAmount) {
            quickConversionFragment.navigateToCurrencyConverter();
        } else if (event instanceof UiEvent.FxRate) {
            Navigator navigator = quickConversionFragment.getNavigator();
            Context contextRequireContext = quickConversionFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            UtilsKt.tryShowFxRateBottomSheet(navigator, contextRequireContext);
        } else if (event instanceof UiEvent.OrderCheckAction) {
            quickConversionFragment.finishWithOrderCheckAction(((UiEvent.OrderCheckAction) event).getAction());
        } else {
            if (!(event instanceof UiEvent.RegionGateFailed)) {
                throw new NoWhenBranchMatchedException();
            }
            quickConversionFragment.handleRegionGateFailed();
        }
        return Unit.INSTANCE;
    }

    private final void navigateToCurrencyConverter() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CurrencyConverterKey>> activityResultLauncher = this.currencyConverterLauncher;
        Companion companion = INSTANCE;
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new CurrencyConverterKey(((QuickConversionKey) companion.getArgs((Fragment) this)).getAccountNumber(), Tuples4.m3642to(((QuickConversionKey) companion.getArgs((Fragment) this)).getSourceCurrency(), ((QuickConversionKey) companion.getArgs((Fragment) this)).getAmountNeeded().getCurrency()), null, ((QuickConversionKey) companion.getArgs((Fragment) this)).getAmountNeeded().getDecimalValue(), false, true, null, 68, null), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithSuccess(Money updatedBalance) {
        QuickConversionCallbacks callbacks = getCallbacks();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        callbacks.onConversionComplete(UtilsKt.buildSuccessMessage(updatedBalance, resources));
        dismiss();
    }

    private final void finishWithOrderCheckAction(GenericOrderCheckAction action) {
        getCallbacks().onConversionOrderCheckAction(action);
        dismiss();
    }

    private final void handleConversionError() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C21790R.string.error_dialog_title, new Object[0]).setMessage(C21790R.string.error_dialog_desc, new Object[0]).setPositiveButton(C21790R.string.error_dialog_cta_text, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, TAG_QUICK_CONVERSION_ERROR_DIALOG, false, 4, null);
    }

    private final void handleRegionGateFailed() {
        dismiss();
    }

    /* compiled from: QuickConversionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionFragment;", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "<init>", "()V", "TAG_QUICK_CONVERSION_ERROR_DIALOG", "", "feature-lib-mcw-quick-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<QuickConversionFragment, QuickConversionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public QuickConversionFragment createDialogFragment(QuickConversionKey quickConversionKey) {
            return (QuickConversionFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, quickConversionKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public QuickConversionKey getArgs(QuickConversionFragment quickConversionFragment) {
            return (QuickConversionKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, quickConversionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuickConversionFragment newInstance(QuickConversionKey quickConversionKey) {
            return (QuickConversionFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, quickConversionKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuickConversionFragment quickConversionFragment, QuickConversionKey quickConversionKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, quickConversionFragment, quickConversionKey);
        }
    }
}
