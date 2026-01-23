package com.robinhood.android.optionsexercise;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.style.PrimaryToolbarOverlay;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetFragment;
import com.robinhood.android.optionsexercise.OptionExerciseViewState;
import com.robinhood.android.optionsexercise.databinding.MergeOptionExerciseBinding;
import com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.experiments.OptionsOrderChecksToGuided;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: OptionExerciseFragment.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002xyB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u001a\u0010T\u001a\u00020Q2\u0006\u0010U\u001a\u00020#2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010V\u001a\u00020QH\u0016J\b\u0010W\u001a\u00020QH\u0016J\b\u0010X\u001a\u00020QH\u0016J\b\u0010Y\u001a\u00020QH\u0016J\u0010\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020\u0002H\u0016J\b\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020Q2\u0006\u0010_\u001a\u00020`H\u0002J\u001a\u0010a\u001a\u00020]2\u0006\u0010b\u001a\u00020G2\b\u0010c\u001a\u0004\u0018\u00010SH\u0016J\u001a\u0010d\u001a\u00020]2\u0006\u0010b\u001a\u00020G2\b\u0010c\u001a\u0004\u0018\u00010SH\u0016J\b\u0010e\u001a\u00020QH\u0016J*\u0010f\u001a\u00020Q2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020QH\u0016J\u0010\u0010p\u001a\u00020Q2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010q\u001a\u00020QH\u0016J\t\u0010r\u001a\u00020]H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0016R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\u0016R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b0\u0010\u0016R\u001b\u00102\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b3\u0010%R\u001b\u00105\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b6\u0010\u0016R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0018\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0018\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u0016\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u0003\u0018\u00010Cj\u0004\u0018\u0001`EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020GX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020GX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0018\u0010s\u001a\b\u0012\u0004\u0012\u00020u0tX\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006z"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "duxo", "Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", "accountTxt", "getAccountTxt", "accountTxt$delegate", "selectedAccountSubtitle", "getSelectedAccountSubtitle", "selectedAccountSubtitle$delegate", "accountInfoBottomDivider", "Landroid/view/View;", "getAccountInfoBottomDivider", "()Landroid/view/View;", "accountInfoBottomDivider$delegate", "multiplierTxt", "getMultiplierTxt", "multiplierTxt$delegate", "contractQuantityEdt", "Landroid/widget/EditText;", "getContractQuantityEdt", "()Landroid/widget/EditText;", "contractQuantityEdt$delegate", "strikePriceTxt", "getStrikePriceTxt", "strikePriceTxt$delegate", "exerciseReviewContainer", "getExerciseReviewContainer", "exerciseReviewContainer$delegate", "exerciseReviewTxt", "getExerciseReviewTxt", "exerciseReviewTxt$delegate", "binding", "Lcom/robinhood/android/optionsexercise/databinding/MergeOptionExerciseBinding;", "getBinding", "()Lcom/robinhood/android/optionsexercise/databinding/MergeOptionExerciseBinding;", "binding$delegate", "callbacks", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "callbacks$delegate", "validationFailure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "reviewingConstraintLayoutRes", "", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "initialLayoutRes", "getInitialLayoutRes", "()I", "contentRes", "getContentRes", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onResume", "validateAndReviewOrder", "performSubmitOrder", "onFormStateUpdated", "getConstraintsForState", "formState", "onBackPressed", "", "setState", "state", "Lcom/robinhood/android/optionsexercise/OptionExerciseViewState;", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "overrideDayTradeChecks", "launchTransfers", "recommendedAmount", "Ljava/math/BigDecimal;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "accountNumber", "", "launchAccountRestrictions", "launchDayTradeOverview", "finish", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseFragment extends BaseOrderFragment<DefaultOrderState> implements OptionExerciseValidationFailureResolver, RegionGated {
    private static final String DIALOG_NOT_SUPPORTED_OPTION_INSTRUMENT = "not-supported-option-instrument";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountInfoBottomDivider$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountInfoBottomDivider;

    /* renamed from: accountTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountTxt;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int contentRes;

    /* renamed from: contractQuantityEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractQuantityEdt;

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: exerciseReviewContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 exerciseReviewContainer;

    /* renamed from: exerciseReviewTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 exerciseReviewTxt;
    public ExperimentsStore experimentsStore;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;

    /* renamed from: multiplierTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 multiplierTxt;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;

    /* renamed from: selectedAccountSubtitle$delegate, reason: from kotlin metadata */
    private final Interfaces2 selectedAccountSubtitle;

    /* renamed from: strikePriceTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 strikePriceTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    private Validator.Failure<? super OptionExerciseContext, ? super OptionExerciseValidationFailureResolver> validationFailure;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "descriptionTxt", "getDescriptionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "accountTxt", "getAccountTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "selectedAccountSubtitle", "getSelectedAccountSubtitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "accountInfoBottomDivider", "getAccountInfoBottomDivider()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "multiplierTxt", "getMultiplierTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "contractQuantityEdt", "getContractQuantityEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "strikePriceTxt", "getStrikePriceTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "exerciseReviewContainer", "getExerciseReviewContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "exerciseReviewTxt", "getExerciseReviewTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsexercise/databinding/MergeOptionExerciseBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionExerciseFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DefaultOrderState.values().length];
            try {
                iArr[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionExerciseFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionExerciseDuxo.class);
        this.titleTxt = bindView(C24704R.id.option_exercise_title);
        this.descriptionTxt = bindView(C24704R.id.option_exercise_description);
        this.accountTxt = bindView(C24704R.id.account_txt);
        this.selectedAccountSubtitle = bindView(C24704R.id.selected_account_subtitle);
        this.accountInfoBottomDivider = bindView(C24704R.id.account_info_bottom_divider);
        this.multiplierTxt = bindView(C24704R.id.contracts_multiplier_txt);
        this.contractQuantityEdt = bindView(C24704R.id.contract_quantity_edt);
        this.strikePriceTxt = bindView(C24704R.id.strike_price_txt);
        this.exerciseReviewContainer = bindView(C24704R.id.exercise_review_container);
        this.exerciseReviewTxt = bindView(C24704R.id.exercise_review_txt);
        this.binding = ViewBinding5.viewBinding(this, OptionExerciseFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(BaseOrderFragment.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.reviewingConstraintLayoutRes = C24704R.layout.fragment_option_exercise_reviewing;
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.initialLayoutRes = C24704R.layout.fragment_option_exercise;
        this.contentRes = C24704R.layout.merge_option_exercise;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final OptionExerciseDuxo getDuxo() {
        return (OptionExerciseDuxo) this.duxo.getValue();
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getDescriptionTxt() {
        return (TextView) this.descriptionTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getAccountTxt() {
        return (TextView) this.accountTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getSelectedAccountSubtitle() {
        return (TextView) this.selectedAccountSubtitle.getValue(this, $$delegatedProperties[3]);
    }

    private final View getAccountInfoBottomDivider() {
        return (View) this.accountInfoBottomDivider.getValue(this, $$delegatedProperties[4]);
    }

    private final TextView getMultiplierTxt() {
        return (TextView) this.multiplierTxt.getValue(this, $$delegatedProperties[5]);
    }

    private final EditText getContractQuantityEdt() {
        return (EditText) this.contractQuantityEdt.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getStrikePriceTxt() {
        return (TextView) this.strikePriceTxt.getValue(this, $$delegatedProperties[7]);
    }

    private final View getExerciseReviewContainer() {
        return (View) this.exerciseReviewContainer.getValue(this, $$delegatedProperties[8]);
    }

    private final TextView getExerciseReviewTxt() {
        return (TextView) this.exerciseReviewTxt.getValue(this, $$delegatedProperties[9]);
    }

    private final MergeOptionExerciseBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[10]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionExerciseBinding) value;
    }

    private final BaseOrderFragment.Callbacks getCallbacks() {
        return (BaseOrderFragment.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[11]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setRefId(getCallbacks().getOrderUuid());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
        getReviewOrderBtn().setEnabled(false);
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EditText contractQuantityEdt = getContractQuantityEdt();
        Observable<R> map = RxTextView.textChanges(contractQuantityEdt).map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$onResume$1$1
            @Override // io.reactivex.functions.Function
            public final BigDecimal apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(it.toString());
                return bigDecimalOrNull == null ? BigDecimal.ZERO : bigDecimalOrNull;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new OptionExerciseFragment4(getDuxo()));
        contractQuantityEdt.setSelection(getContractQuantityEdt().getText().length());
        contractQuantityEdt.requestFocus();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C246822(this));
        Observable<OptionExerciseViewState> states = getDuxo().getStates();
        final C246833 c246833 = new PropertyReference1Impl() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment.onResume.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((OptionExerciseViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c246833) { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c246833, "function");
                this.function = c246833;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C246844(this));
    }

    /* compiled from: OptionExerciseFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$onResume$2 */
    /* synthetic */ class C246822 extends FunctionReferenceImpl implements Function1<OptionExerciseViewState, Unit> {
        C246822(Object obj) {
            super(1, obj, OptionExerciseFragment.class, "setState", "setState(Lcom/robinhood/android/optionsexercise/OptionExerciseViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionExerciseViewState optionExerciseViewState) throws Resources.NotFoundException {
            invoke2(optionExerciseViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionExerciseViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionExerciseFragment) this.receiver).setState(p0);
        }
    }

    /* compiled from: OptionExerciseFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$onResume$4 */
    /* synthetic */ class C246844 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C246844(Object obj) {
            super(1, obj, OptionExerciseFragment.class, "setFormState", "setFormState(Lcom/robinhood/android/lib/trade/OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionExerciseFragment) this.receiver).setFormState(p0);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$performSubmitOrder$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionExerciseContext exerciseContext = ((OptionExerciseViewState) it).getExerciseContext();
                return Optional3.asOptional(exerciseContext != null ? exerciseContext.getExerciseRequest() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionExerciseFragment$performSubmitOrder$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Single singleFirstOrError = ObservablesKt.filterIsPresent(map).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C246852(getDuxo()));
    }

    /* compiled from: OptionExerciseFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$performSubmitOrder$2 */
    /* synthetic */ class C246852 extends FunctionReferenceImpl implements Function1<ApiOptionExerciseRequest, Unit> {
        C246852(Object obj) {
            super(1, obj, OptionExerciseDuxo.class, "submit", "submit(Lcom/robinhood/models/api/ApiOptionExerciseRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApiOptionExerciseRequest apiOptionExerciseRequest) {
            invoke2(apiOptionExerciseRequest);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ApiOptionExerciseRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionExerciseDuxo) this.receiver).submit(p0);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        boolean reviewing = getReviewing();
        getContractQuantityEdt().setEnabled(!reviewing);
        getExerciseReviewContainer().setVisibility(reviewing ? 0 : 8);
        if (reviewing) {
            ScarletManager.putOverlay$default(getScarletManager(), PrimaryToolbarOverlay.INSTANCE, null, 2, null);
        } else {
            ScarletManager.removeOverlay$default(getScarletManager(), PrimaryToolbarOverlay.INSTANCE.getPriority(), null, 2, null);
        }
        super.onFormStateUpdated();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            return this.initialConstraints;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.reviewingConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getReviewing()) {
            getDuxo().setFormState(DefaultOrderState.EDITING);
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setState(final OptionExerciseViewState state) throws Resources.NotFoundException {
        String string2;
        Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> validationContextConsume;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource title;
        TextView titleTxt = getTitleTxt();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        titleTxt.setText(state.getTitleString(resources));
        TextView descriptionTxt = getDescriptionTxt();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        descriptionTxt.setText(state.getDescriptionString(resources2));
        TextView multiplierTxt = getMultiplierTxt();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        multiplierTxt.setText(state.getMultiplierTxt(resources3));
        getStrikePriceTxt().setText(state.getStrikePriceTxt());
        getBinding().totalValueRowComposeView.setContent(ComposableLambda3.composableLambdaInstance(-2105833657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1

            /* compiled from: OptionExerciseFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1$1 */
            static final class C246861 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ OptionExerciseViewState $state;
                final /* synthetic */ OptionExerciseFragment this$0;

                C246861(OptionExerciseViewState optionExerciseViewState, OptionExerciseFragment optionExerciseFragment) {
                    this.$state = optionExerciseViewState;
                    this.this$0 = optionExerciseFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1549639047, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseFragment.setState.<anonymous>.<anonymous>.<anonymous> (OptionExerciseFragment.kt:185)");
                    }
                    OptionExerciseViewState optionExerciseViewState = this.$state;
                    Resources resources = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String totalLabelString = optionExerciseViewState.getTotalLabelString(resources);
                    OptionExerciseViewState optionExerciseViewState2 = this.$state;
                    Resources resources2 = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    String shortPositionText = optionExerciseViewState2.getShortPositionText(resources2);
                    OptionExerciseViewState optionExerciseViewState3 = this.$state;
                    Resources resources3 = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    OptionExerciseBorrowFeeState borrowFeeState = optionExerciseViewState3.getBorrowFeeState(resources3);
                    String totalPriceString = this.$state.getTotalPriceString();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(this.this$0);
                    final OptionExerciseViewState optionExerciseViewState4 = this.$state;
                    final OptionExerciseFragment optionExerciseFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                              (r0v10 'optionExerciseViewState4' com.robinhood.android.optionsexercise.OptionExerciseViewState A[DONT_INLINE])
                              (r1v2 'optionExerciseFragment' com.robinhood.android.optionsexercise.OptionExerciseFragment A[DONT_INLINE])
                             A[MD:(com.robinhood.android.optionsexercise.OptionExerciseViewState, com.robinhood.android.optionsexercise.OptionExerciseFragment):void (m)] (LINE:192) call: com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.optionsexercise.OptionExerciseViewState, com.robinhood.android.optionsexercise.OptionExerciseFragment):void type: CONSTRUCTOR in method: com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r14 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r13.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r13.skipToGroupEnd()
                            return
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.robinhood.android.optionsexercise.OptionExerciseFragment.setState.<anonymous>.<anonymous>.<anonymous> (OptionExerciseFragment.kt:185)"
                            r2 = -1549639047(0xffffffffa3a26279, float:-1.760578E-17)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
                        L1f:
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r14 = r12.$state
                            com.robinhood.android.optionsexercise.OptionExerciseFragment r0 = r12.this$0
                            android.content.res.Resources r0 = r0.getResources()
                            java.lang.String r1 = "getResources(...)"
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                            java.lang.String r2 = r14.getTotalLabelString(r0)
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r14 = r12.$state
                            com.robinhood.android.optionsexercise.OptionExerciseFragment r0 = r12.this$0
                            android.content.res.Resources r0 = r0.getResources()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                            java.lang.String r3 = r14.getShortPositionText(r0)
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r14 = r12.$state
                            com.robinhood.android.optionsexercise.OptionExerciseFragment r0 = r12.this$0
                            android.content.res.Resources r0 = r0.getResources()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                            com.robinhood.android.optionsexercise.OptionExerciseBorrowFeeState r4 = r14.getBorrowFeeState(r0)
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r14 = r12.$state
                            java.lang.String r5 = r14.getTotalPriceString()
                            r14 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                            r13.startReplaceGroup(r14)
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r14 = r12.$state
                            boolean r14 = r13.changedInstance(r14)
                            com.robinhood.android.optionsexercise.OptionExerciseFragment r0 = r12.this$0
                            boolean r0 = r13.changedInstance(r0)
                            r14 = r14 | r0
                            com.robinhood.android.optionsexercise.OptionExerciseViewState r0 = r12.$state
                            com.robinhood.android.optionsexercise.OptionExerciseFragment r1 = r12.this$0
                            java.lang.Object r6 = r13.rememberedValue()
                            if (r14 != 0) goto L79
                            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r14 = r14.getEmpty()
                            if (r6 != r14) goto L81
                        L79:
                            com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.optionsexercise.OptionExerciseFragment$setState$1$1$1$$ExternalSyntheticLambda0
                            r6.<init>(r0, r1)
                            r13.updateRememberedValue(r6)
                        L81:
                            r8 = r6
                            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                            r13.endReplaceGroup()
                            r10 = 24576(0x6000, float:3.4438E-41)
                            r11 = 32
                            r6 = 1
                            r7 = 0
                            r9 = r13
                            com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposable.OptionExerciseTotalValueRowComposable(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r13 == 0) goto L9a
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L9a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionsexercise.OptionExerciseFragment6.C246861.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OptionExerciseViewState optionExerciseViewState, OptionExerciseFragment optionExerciseFragment) {
                        OptionExerciseViewState.ShortDetailBottomSheetState shortDetailBottomSheetState = optionExerciseViewState.getShortDetailBottomSheetState();
                        if (shortDetailBottomSheetState != null) {
                            OptionExerciseShortDetailBottomSheetFragment optionExerciseShortDetailBottomSheetFragment = (OptionExerciseShortDetailBottomSheetFragment) OptionExerciseShortDetailBottomSheetFragment.INSTANCE.newInstance((Parcelable) new OptionExerciseShortDetailBottomSheetFragment.Args(shortDetailBottomSheetState.getSharesToExercise(), shortDetailBottomSheetState.getSharesYouCanSell(), shortDetailBottomSheetState.getShortPosition()));
                            FragmentManager childFragmentManager = optionExerciseFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            optionExerciseShortDetailBottomSheetFragment.show(childFragmentManager, OptionExerciseShortDetailBottomSheetFragment.TAG);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2105833657, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseFragment.setState.<anonymous>.<anonymous> (OptionExerciseFragment.kt:184)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-1549639047, true, new C246861(state, this.this$0), composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            TextView exerciseReviewTxt = getExerciseReviewTxt();
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            exerciseReviewTxt.setText(state.getExerciseReviewString(resources4));
            TextView accountTxt = getAccountTxt();
            Account account = state.getAccount();
            if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null || (title = withAccount.getTitle()) == null) {
                string2 = null;
            } else {
                Resources resources5 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                CharSequence text = title.getText(resources5);
                if (text != null) {
                    string2 = text.toString();
                }
            }
            accountTxt.setText(string2);
            getReviewOrderBtn().setEnabled(BigDecimals7.isPositive(state.getQuantity()));
            if (state.getExerciseChecks() != null) {
                EditText contractQuantityEdt = getContractQuantityEdt();
                Resources resources6 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                contractQuantityEdt.setHint(state.getQuantityHint(resources6));
            }
            boolean zShowAccountInfoRow = state.showAccountInfoRow(getReviewing());
            getAccountTxt().setVisibility(zShowAccountInfoRow ? 0 : 8);
            getSelectedAccountSubtitle().setVisibility(zShowAccountInfoRow ? 0 : 8);
            getAccountInfoBottomDivider().setVisibility(zShowAccountInfoRow ? 0 : 8);
            UiEvent<Boolean> notSupportedOptionInstrument = state.getNotSupportedOptionInstrument();
            if ((notSupportedOptionInstrument != null ? notSupportedOptionInstrument.consume() : null) != null) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C24704R.id.dialog_id_not_supported_option_instrument).setTitle(C24704R.string.option_exercise_corp_action_title, new Object[0]).setMessage(C24704R.string.option_exercise_corp_action_description, new Object[0]).setPositiveButton(C11048R.string.general_label_contact_support, new Object[0]);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, DIALOG_NOT_SUPPORTED_OPTION_INSTRUMENT, false, 4, null);
            }
            UiEvent<Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver>> validationContextEvent = state.getValidationContextEvent();
            if (validationContextEvent == null || (validationContextConsume = validationContextEvent.consume()) == null) {
                return;
            }
            Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> failure = validationContextConsume.getFailure();
            if (failure != null) {
                BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
                OptionExerciseContext exerciseContext = state.getExerciseContext();
                Intrinsics.checkNotNull(exerciseContext);
                failure.showAlert(baseActivityRequireBaseActivity, exerciseContext);
            }
            this.validationFailure = failure;
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
            if (id == C24704R.id.dialog_id_not_supported_option_instrument) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Navigators3.showContactSupportTriageFragment$default(getNavigator(), fragmentActivityRequireActivity, null, false, 6, null);
                fragmentActivityRequireActivity.finish();
                return true;
            }
            if (id == C24704R.id.dialog_id_exercise_validation_error) {
                Validator.Failure<? super OptionExerciseContext, ? super OptionExerciseValidationFailureResolver> failure = this.validationFailure;
                if (failure == null) {
                    return false;
                }
                getDuxo().handleFailureResolution(failure.onPositiveResponse(this, passthroughArgs));
                return true;
            }
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
            if (id == C24704R.id.dialog_id_exercise_validation_error) {
                Validator.Failure<? super OptionExerciseContext, ? super OptionExerciseValidationFailureResolver> failure = this.validationFailure;
                if (failure == null) {
                    return false;
                }
                getDuxo().handleFailureResolution(failure.onNegativeResponse(this, passthroughArgs));
                return true;
            }
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }

        @Override // com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver
        public void overrideDayTradeChecks() {
            getDuxo().overrideDayTradeChecks();
        }

        @Override // com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver
        public void launchTransfers(final BigDecimal recommendedAmount, final BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String accountNumber) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            final TransferConfiguration.Standard standard = new TransferConfiguration.Standard(recommendedAmount, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(accountNumber, false, transferAccountType, 2, null), null, MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK, null, false, false, null, null, false, 8102, null);
            Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OptionsOrderChecksToGuided.INSTANCE}, false, null, 6, null).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionExerciseFragment.launchTransfers$lambda$4(standard, recommendedAmount, brokerageAccountType, this, (Boolean) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launchTransfers$lambda$4(TransferConfiguration.Standard standard, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, OptionExerciseFragment optionExerciseFragment, Boolean bool) {
            IntentKey depositFundsDeepLink;
            if (bool.booleanValue()) {
                depositFundsDeepLink = new TransferV2(TransferDirectionV2.DEPOSIT, standard, null, 4, null);
            } else {
                depositFundsDeepLink = new DepositFundsDeepLink(bigDecimal, null, TransferContext.RobinhoodAccountType.INSTANCE.from(brokerageAccountType), false, MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK, 10, null);
            }
            Navigator navigator = optionExerciseFragment.getNavigator();
            Context contextRequireContext = optionExerciseFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, depositFundsDeepLink, null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver
        public void launchAccountRestrictions() {
            String string2 = getString(C20649R.string.url_account_restrictions);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            finish();
        }

        @Override // com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver
        public void launchDayTradeOverview(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_DAY_TRADE_SETTINGS, false, false, false, null, null, accountNumber, null, false, 446, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }

        @Override // com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver
        public void finish() {
            requireActivity().finish();
        }

        /* compiled from: OptionExerciseFragment.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "optionInstrumentId", "Ljava/util/UUID;", "reason", "Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionInstrumentId", "()Ljava/util/UUID;", "getReason", "()Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final String accountNumber;
            private final UUID optionInstrumentId;
            private final ApiOptionExerciseRequest.Reason reason;

            /* compiled from: OptionExerciseFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args(parcel.readString(), (UUID) parcel.readSerializable(), ApiOptionExerciseRequest.Reason.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, ApiOptionExerciseRequest.Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = args.accountNumber;
                }
                if ((i & 2) != 0) {
                    uuid = args.optionInstrumentId;
                }
                if ((i & 4) != 0) {
                    reason = args.reason;
                }
                return args.copy(str, uuid, reason);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getOptionInstrumentId() {
                return this.optionInstrumentId;
            }

            /* renamed from: component3, reason: from getter */
            public final ApiOptionExerciseRequest.Reason getReason() {
                return this.reason;
            }

            public final Args copy(String accountNumber, UUID optionInstrumentId, ApiOptionExerciseRequest.Reason reason) {
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new Args(accountNumber, optionInstrumentId, reason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Args)) {
                    return false;
                }
                Args args = (Args) other;
                return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.optionInstrumentId, args.optionInstrumentId) && this.reason == args.reason;
            }

            public int hashCode() {
                String str = this.accountNumber;
                return ((((str == null ? 0 : str.hashCode()) * 31) + this.optionInstrumentId.hashCode()) * 31) + this.reason.hashCode();
            }

            public String toString() {
                return "Args(accountNumber=" + this.accountNumber + ", optionInstrumentId=" + this.optionInstrumentId + ", reason=" + this.reason + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeSerializable(this.optionInstrumentId);
                dest.writeString(this.reason.name());
            }

            public Args(String str, UUID optionInstrumentId, ApiOptionExerciseRequest.Reason reason) {
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.accountNumber = str;
                this.optionInstrumentId = optionInstrumentId;
                this.reason = reason;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final UUID getOptionInstrumentId() {
                return this.optionInstrumentId;
            }

            public final ApiOptionExerciseRequest.Reason getReason() {
                return this.reason;
            }
        }

        /* compiled from: OptionExerciseFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsexercise/OptionExerciseFragment;", "Lcom/robinhood/android/optionsexercise/OptionExerciseFragment$Args;", "<init>", "()V", "DIALOG_NOT_SUPPORTED_OPTION_INSTRUMENT", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<OptionExerciseFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(OptionExerciseFragment optionExerciseFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionExerciseFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public OptionExerciseFragment newInstance(Args args) {
                return (OptionExerciseFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(OptionExerciseFragment optionExerciseFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionExerciseFragment, args);
            }
        }
    }
