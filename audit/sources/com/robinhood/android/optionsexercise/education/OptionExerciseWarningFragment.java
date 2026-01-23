package com.robinhood.android.optionsexercise.education;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.education.OptionExerciseEducationContext;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.common.strings.C32428R;
import com.robinhood.enums.RhEnum;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionExerciseWarningFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004IJKLB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u0002022\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000202H\u0016J\b\u0010;\u001a\u000202H\u0016J\b\u0010<\u001a\u000202H\u0002J\b\u0010=\u001a\u000202H\u0002J\u001b\u0010>\u001a\u000202\"\b\b\u0000\u0010?*\u00020@*\u0002H?H\u0002¢\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020CH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b.\u0010/R\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", "visualizationContainer", "Landroid/widget/FrameLayout;", "getVisualizationContainer", "()Landroid/widget/FrameLayout;", "visualizationContainer$delegate", "lastUpdatedTxt", "getLastUpdatedTxt", "lastUpdatedTxt$delegate", "primaryButtonStringRes", "", "getPrimaryButtonStringRes", "()Ljava/lang/Integer;", "secondaryButtonStringRes", "getSecondaryButtonStringRes", OptionExerciseWarningFragment.ARG_OPTION_EDUCATION_CONTEXT, "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "getEducationContext", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "educationContext$delegate", "Lkotlin/Lazy;", OptionExerciseWarningFragment.ARG_MODE, "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "getMode", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "mode$delegate", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "callbacks", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPrimaryBtnClicked", "onSecondaryBtnClicked", "refreshOtmUi", "refreshHighPremiumUi", "bind", "V", "Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView;", "(Lcom/robinhood/android/optionsexercise/education/ExerciseWarningVisualizationView;)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Mode", "BreadcrumbType", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseWarningFragment extends BaseScrollableFragment implements SupportBreadcrumbTracker2, RegionGated {
    private static final String ARG_MODE = "mode";
    private static final String ARG_OPTION_EDUCATION_CONTEXT = "educationContext";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt;

    /* renamed from: educationContext$delegate, reason: from kotlin metadata */
    private final Lazy educationContext;

    /* renamed from: lastUpdatedTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 lastUpdatedTxt;

    /* renamed from: mode$delegate, reason: from kotlin metadata */
    private final Lazy mode;
    private final int primaryButtonStringRes;
    private final int secondaryButtonStringRes;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;

    /* renamed from: visualizationContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 visualizationContainer;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseWarningFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseWarningFragment.class, "descriptionTxt", "getDescriptionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseWarningFragment.class, "visualizationContainer", "getVisualizationContainer()Landroid/widget/FrameLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseWarningFragment.class, "lastUpdatedTxt", "getLastUpdatedTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseWarningFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionExerciseWarningFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Callbacks;", "", "onContinueWarning", "", "from", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueWarning(Mode from);
    }

    /* compiled from: OptionExerciseWarningFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionExerciseEducationContext.OtmWarningType.values().length];
            try {
                iArr[OptionExerciseEducationContext.OtmWarningType.OTM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionExerciseEducationContext.OtmWarningType.ALMOST_OTM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Mode.values().length];
            try {
                iArr2[Mode.HIGH_PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Mode.OTM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
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

    public OptionExerciseWarningFragment() {
        super(C24704R.layout.fragment_option_exercise_warning);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.titleTxt = bindView(C24704R.id.exercise_warning_title);
        this.descriptionTxt = bindView(C24704R.id.exercise_warning_description);
        this.visualizationContainer = bindView(C24704R.id.exercise_warning_visualization_container);
        this.lastUpdatedTxt = bindView(C24704R.id.exercise_warning_last_updated);
        this.primaryButtonStringRes = C11048R.string.general_label_continue;
        this.secondaryButtonStringRes = C32428R.string.exercise_cancel_label;
        this.educationContext = Fragments2.argument(this, ARG_OPTION_EDUCATION_CONTEXT);
        this.mode = Fragments2.argument(this, ARG_MODE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseWarningFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getDescriptionTxt() {
        return (TextView) this.descriptionTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final FrameLayout getVisualizationContainer() {
        return (FrameLayout) this.visualizationContainer.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getLastUpdatedTxt() {
        return (TextView) this.lastUpdatedTxt.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getPrimaryButtonStringRes() {
        return Integer.valueOf(this.primaryButtonStringRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getSecondaryButtonStringRes() {
        return Integer.valueOf(this.secondaryButtonStringRes);
    }

    private final OptionExerciseEducationContext getEducationContext() {
        return (OptionExerciseEducationContext) this.educationContext.getValue();
    }

    private final Mode getMode() {
        return (Mode) this.mode.getValue();
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        BreadcrumbType breadcrumbType;
        SupportBreadcrumbType supportBreadcrumbType = SupportBreadcrumbType.INVESTING_OPTIONS_EARLY_EXERCISE_WARNING;
        int i = WhenMappings.$EnumSwitchMapping$1[getMode().ordinal()];
        if (i == 1) {
            breadcrumbType = BreadcrumbType.HIGH_PREMIUM;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[getEducationContext().getShowOtmWarning().ordinal()];
            if (i2 == 1) {
                breadcrumbType = BreadcrumbType.OTM;
            } else {
                breadcrumbType = i2 != 2 ? null : BreadcrumbType.ALMOST_OTM;
            }
        }
        return Breadcrumbs2.createBreadcrumb(this, supportBreadcrumbType, breadcrumbType);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DirectionOverlay.NEGATIVE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int i = WhenMappings.$EnumSwitchMapping$1[getMode().ordinal()];
        if (i == 1) {
            refreshHighPremiumUi();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            refreshOtmUi();
        }
        getLastUpdatedTxt().setText(getString(C24704R.string.exercise_warning_last_updated_label, LocalTimeFormatter.SHORT.format(Instants.toLocalTime$default(getEducationContext().getLastUpdated(), null, 1, null))));
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onPrimaryBtnClicked() {
        getCallbacks().onContinueWarning(getMode());
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onSecondaryBtnClicked() {
        requireActivity().finish();
    }

    private final void refreshOtmUi() {
        int i = WhenMappings.$EnumSwitchMapping$0[getEducationContext().getShowOtmWarning().ordinal()];
        if (i == 1) {
            getTitleTxt().setText(getString(C24704R.string.exercise_warning_otm_title));
            getDescriptionTxt().setText(getString(C24704R.string.exercise_warning_otm_description));
        } else if (i == 2) {
            getTitleTxt().setText(getString(C24704R.string.exercise_warning_almost_otm_title));
            getDescriptionTxt().setText(getString(C24704R.string.exercise_warning_almost_otm_description));
        } else {
            throw new IllegalStateException("Tried to show a warning for NOT_OTM state");
        }
        bind((OptionExerciseWarningFragment) OtmVisualizationView.INSTANCE.inflate((ViewGroup) getVisualizationContainer()));
    }

    private final void refreshHighPremiumUi() {
        getTitleTxt().setText(getString(C24704R.string.exercise_warning_high_premium_title));
        TextView descriptionTxt = getDescriptionTxt();
        String string2 = ViewsKt.getString(descriptionTxt, C24704R.string.exercise_warning_high_premium_description);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore(descriptionTxt, (CharSequence) string2, false, true, num != null ? ViewsKt.getString(descriptionTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseWarningFragment$refreshHighPremiumUi$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.getContext(), this.this$0.getString(C24704R.string.exercise_warning_high_premium_url), 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
        bind((OptionExerciseWarningFragment) HighPremiumVisualizationView.INSTANCE.inflate((ViewGroup) getVisualizationContainer()));
    }

    private final <V extends ExerciseWarningVisualizationView> void bind(V v) {
        v.bind(getEducationContext());
        getVisualizationContainer().addView(v);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionExerciseWarningFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "OTM", "HIGH_PREMIUM", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode OTM = new Mode("OTM", 0);
        public static final Mode HIGH_PREMIUM = new Mode("HIGH_PREMIUM", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{OTM, HIGH_PREMIUM};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionExerciseWarningFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$BreadcrumbType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "OTM", "ALMOST_OTM", "HIGH_PREMIUM", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class BreadcrumbType implements RhEnum<BreadcrumbType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BreadcrumbType[] $VALUES;
        private final String serverValue;
        public static final BreadcrumbType OTM = new BreadcrumbType("OTM", 0, "outOfTheMoney");
        public static final BreadcrumbType ALMOST_OTM = new BreadcrumbType("ALMOST_OTM", 1, "closeToOutOfTheMoney");
        public static final BreadcrumbType HIGH_PREMIUM = new BreadcrumbType("HIGH_PREMIUM", 2, "highPremium");

        private static final /* synthetic */ BreadcrumbType[] $values() {
            return new BreadcrumbType[]{OTM, ALMOST_OTM, HIGH_PREMIUM};
        }

        public static EnumEntries<BreadcrumbType> getEntries() {
            return $ENTRIES;
        }

        private BreadcrumbType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            BreadcrumbType[] breadcrumbTypeArr$values = $values();
            $VALUES = breadcrumbTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(breadcrumbTypeArr$values);
            INSTANCE = new Companion(null);
        }

        public static BreadcrumbType valueOf(String str) {
            return (BreadcrumbType) Enum.valueOf(BreadcrumbType.class, str);
        }

        public static BreadcrumbType[] values() {
            return (BreadcrumbType[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionExerciseWarningFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Companion;", "", "<init>", "()V", "ARG_OPTION_EDUCATION_CONTEXT", "", "ARG_MODE", "newInstance", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment;", OptionExerciseWarningFragment.ARG_OPTION_EDUCATION_CONTEXT, "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", OptionExerciseWarningFragment.ARG_MODE, "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseWarningFragment newInstance(OptionExerciseEducationContext educationContext, Mode mode) {
            Intrinsics.checkNotNullParameter(educationContext, "educationContext");
            Intrinsics.checkNotNullParameter(mode, "mode");
            OptionExerciseWarningFragment optionExerciseWarningFragment = new OptionExerciseWarningFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OptionExerciseWarningFragment.ARG_OPTION_EDUCATION_CONTEXT, educationContext);
            bundle.putSerializable(OptionExerciseWarningFragment.ARG_MODE, mode);
            optionExerciseWarningFragment.setArguments(bundle);
            return optionExerciseWarningFragment;
        }
    }
}
