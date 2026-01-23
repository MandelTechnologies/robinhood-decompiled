package com.robinhood.android.banking.p065ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.lib.databinding.FragmentScheduleAutomaticDepositBinding;
import com.robinhood.android.banking.p065ui.ScheduleAutomaticDepositFragment;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ScheduleAutomaticDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/banking/lib/databinding/FragmentScheduleAutomaticDepositBinding;", "getBinding", "()Lcom/robinhood/android/banking/lib/databinding/FragmentScheduleAutomaticDepositBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "frequencies", "", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<set-?>", "currentFrequency", "getCurrentFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "setCurrentFrequency", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "currentFrequency$delegate", "Lkotlin/properties/ReadWriteProperty;", "callbacks", "Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "refreshUi", "onIntervalSelected", "Callbacks", "Args", "Companion", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScheduleAutomaticDepositFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ScheduleAutomaticDepositFragment.class, "binding", "getBinding()Lcom/robinhood/android/banking/lib/databinding/FragmentScheduleAutomaticDepositBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ScheduleAutomaticDepositFragment.class, "currentFrequency", "getCurrentFrequency()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", 0)), Reflection.property1(new PropertyReference1Impl(ScheduleAutomaticDepositFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: currentFrequency$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentFrequency;
    private final List<ApiAutomaticDeposit.Frequency> frequencies;

    /* compiled from: ScheduleAutomaticDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", "", "onAutomaticDepositIntervalSelected", "", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAutomaticDepositIntervalSelected(ApiAutomaticDeposit.Frequency frequency);
    }

    public ScheduleAutomaticDepositFragment() {
        super(C9631R.layout.fragment_schedule_automatic_deposit);
        this.binding = ViewBinding5.viewBinding(this, ScheduleAutomaticDepositFragment2.INSTANCE);
        this.frequencies = ArraysKt.toList(ApiAutomaticDeposit.Frequency.values());
        this.currentFrequency = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[1]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.banking.ui.ScheduleAutomaticDepositFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ScheduleAutomaticDepositFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentScheduleAutomaticDepositBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentScheduleAutomaticDepositBinding) value;
    }

    private final ApiAutomaticDeposit.Frequency getCurrentFrequency() {
        return (ApiAutomaticDeposit.Frequency) this.currentFrequency.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentFrequency(ApiAutomaticDeposit.Frequency frequency) {
        this.currentFrequency.setValue(this, $$delegatedProperties[1], frequency);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (!(context instanceof Callbacks)) {
            throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
        }
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        if (getCurrentFrequency() == null) {
            setCurrentFrequency(((Args) INSTANCE.getArgs((Fragment) this)).getInitialFrequency());
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        int i = C9631R.layout.row_automatic_deposit_option;
        AchTransferStringHelper achTransferStringHelper = AchTransferStringHelper.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayAdapter arrayAdapter = new ArrayAdapter(fragmentActivityRequireActivity, i, R.id.text1, achTransferStringHelper.getAutomaticDepositOptions(resources, this.frequencies));
        FragmentScheduleAutomaticDepositBinding binding = getBinding();
        RdsButton automaticDepositConfirmBtn = binding.automaticDepositConfirmBtn;
        Intrinsics.checkNotNullExpressionValue(automaticDepositConfirmBtn, "automaticDepositConfirmBtn");
        OnClickListeners.onClick(automaticDepositConfirmBtn, new ScheduleAutomaticDepositFragment3(this));
        binding.automaticDepositList.setAdapter((ListAdapter) arrayAdapter);
        binding.automaticDepositList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.robinhood.android.banking.ui.ScheduleAutomaticDepositFragment$onViewCreated$1$2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                ScheduleAutomaticDepositFragment scheduleAutomaticDepositFragment = this.this$0;
                scheduleAutomaticDepositFragment.setCurrentFrequency((ApiAutomaticDeposit.Frequency) scheduleAutomaticDepositFragment.frequencies.get(i2));
                this.this$0.refreshUi();
            }
        });
        refreshUi();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C30383R.string.ach_transfer_automatic_deposit_interval_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi() {
        FragmentScheduleAutomaticDepositBinding binding = getBinding();
        binding.automaticDepositList.setItemChecked(CollectionsKt.indexOf((List<? extends ApiAutomaticDeposit.Frequency>) this.frequencies, getCurrentFrequency()), true);
        if (getCurrentFrequency() != null) {
            binding.automaticDepositConfirmBtn.setEnabled(true);
            RhTextView rhTextView = binding.automaticDepositExplanationTxt;
            AchTransferStringHelper achTransferStringHelper = AchTransferStringHelper.INSTANCE;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ApiAutomaticDeposit.Frequency currentFrequency = getCurrentFrequency();
            Intrinsics.checkNotNull(currentFrequency);
            rhTextView.setText(achTransferStringHelper.getAutomaticDepositExplanation(resources, currentFrequency));
            return;
        }
        binding.automaticDepositConfirmBtn.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIntervalSelected() {
        AnalyticsLogger analytics = getAnalytics();
        ApiAutomaticDeposit.Frequency currentFrequency = getCurrentFrequency();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTED, "", currentFrequency != null ? currentFrequency.toString() : null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        if (getCurrentFrequency() != null) {
            Callbacks callbacks = getCallbacks();
            ApiAutomaticDeposit.Frequency currentFrequency2 = getCurrentFrequency();
            Intrinsics.checkNotNull(currentFrequency2);
            callbacks.onAutomaticDepositIntervalSelected(currentFrequency2);
            return;
        }
        Toast.makeText(getActivity(), C9631R.string.ach_transfer_automatic_deposit_interval_error, 0).show();
    }

    /* compiled from: ScheduleAutomaticDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Args;", "Landroid/os/Parcelable;", "initialFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<init>", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getInitialFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiAutomaticDeposit.Frequency initialFrequency;

        /* compiled from: ScheduleAutomaticDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ApiAutomaticDeposit.Frequency frequency = this.initialFrequency;
            if (frequency == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(frequency.name());
            }
        }

        public Args(ApiAutomaticDeposit.Frequency frequency) {
            this.initialFrequency = frequency;
        }

        public final ApiAutomaticDeposit.Frequency getInitialFrequency() {
            return this.initialFrequency;
        }
    }

    /* compiled from: ScheduleAutomaticDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment;", "Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Args;", "<init>", "()V", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ScheduleAutomaticDepositFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ScheduleAutomaticDepositFragment scheduleAutomaticDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, scheduleAutomaticDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ScheduleAutomaticDepositFragment newInstance(Args args) {
            return (ScheduleAutomaticDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ScheduleAutomaticDepositFragment scheduleAutomaticDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, scheduleAutomaticDepositFragment, args);
        }
    }
}
