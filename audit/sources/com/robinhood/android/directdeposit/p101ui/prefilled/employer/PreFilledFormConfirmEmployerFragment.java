package com.robinhood.android.directdeposit.p101ui.prefilled.employer;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PreFilledFormConfirmEmployerFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "employerTxt", "Landroid/widget/TextView;", "getEmployerTxt", "()Landroid/widget/TextView;", "employerTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "confirmBtn", "Landroid/widget/Button;", "getConfirmBtn", "()Landroid/widget/Button;", "confirmBtn$delegate", "updateBtn", "getUpdateBtn", "updateBtn$delegate", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "Callbacks", "Args", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormConfirmEmployerFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: confirmBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 confirmBtn;

    /* renamed from: employerTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 employerTxt;
    public EventLogger eventLogger;

    /* renamed from: updateBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 updateBtn;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormConfirmEmployerFragment.class, "employerTxt", "getEmployerTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormConfirmEmployerFragment.class, "confirmBtn", "getConfirmBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormConfirmEmployerFragment.class, "updateBtn", "getUpdateBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormConfirmEmployerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormConfirmEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Callbacks;", "", "updatedEmployer", "", "getUpdatedEmployer", "()Ljava/lang/String;", "onEmployerConfirmed", "", "employer", "updatedEmploymentInfo", "", "onUpdateEmployer", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        String getUpdatedEmployer();

        void onEmployerConfirmed(String employer, boolean updatedEmploymentInfo);

        void onUpdateEmployer();
    }

    public PreFilledFormConfirmEmployerFragment() {
        super(C14044R.layout.fragment_pre_filled_form_confirm_employer);
        this.employerTxt = bindView(C14044R.id.pre_filled_form_confirm_employer_name);
        this.confirmBtn = bindView(C14044R.id.pre_filled_form_confirm_employer);
        this.updateBtn = bindView(C14044R.id.pre_filled_form_update_employer);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final TextView getEmployerTxt() {
        return (TextView) this.employerTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final Button getConfirmBtn() {
        return (Button) this.confirmBtn.getValue(this, $$delegatedProperties[1]);
    }

    private final Button getUpdateBtn() {
        return (Button) this.updateBtn.getValue(this, $$delegatedProperties[2]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getConfirmBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormConfirmEmployerFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(getUpdateBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormConfirmEmployerFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PreFilledFormConfirmEmployerFragment preFilledFormConfirmEmployerFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormConfirmEmployerFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_PARTIAL_PAYCHECK, new Screen(Screen.Name.DD_CONFIRM_EMPLOYER, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormConfirmEmployerFragment.getCallbacks().onEmployerConfirmed(((Args) INSTANCE.getArgs((Fragment) preFilledFormConfirmEmployerFragment)).getEmployerName(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PreFilledFormConfirmEmployerFragment preFilledFormConfirmEmployerFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormConfirmEmployerFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_UPDATE_EMPLOYER, new Screen(Screen.Name.DD_CONFIRM_EMPLOYER, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormConfirmEmployerFragment.getCallbacks().onUpdateEmployer();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TextView employerTxt = getEmployerTxt();
        String updatedEmployer = getCallbacks().getUpdatedEmployer();
        if (updatedEmployer == null) {
            updatedEmployer = ((Args) INSTANCE.getArgs((Fragment) this)).getEmployerName();
        }
        employerTxt.setText(updatedEmployer);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_CONFIRM_EMPLOYER, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* compiled from: PreFilledFormConfirmEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Args;", "Landroid/os/Parcelable;", "employerName", "", "<init>", "(Ljava/lang/String;)V", "getEmployerName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String employerName;

        /* compiled from: PreFilledFormConfirmEmployerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
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
            dest.writeString(this.employerName);
        }

        public Args(String employerName) {
            Intrinsics.checkNotNullParameter(employerName, "employerName");
            this.employerName = employerName;
        }

        public final String getEmployerName() {
            return this.employerName;
        }
    }

    /* compiled from: PreFilledFormConfirmEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Args;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PreFilledFormConfirmEmployerFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PreFilledFormConfirmEmployerFragment preFilledFormConfirmEmployerFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, preFilledFormConfirmEmployerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PreFilledFormConfirmEmployerFragment newInstance(Args args) {
            return (PreFilledFormConfirmEmployerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PreFilledFormConfirmEmployerFragment preFilledFormConfirmEmployerFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, preFilledFormConfirmEmployerFragment, args);
        }
    }
}
