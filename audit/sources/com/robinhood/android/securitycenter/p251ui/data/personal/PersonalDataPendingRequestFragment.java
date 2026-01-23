package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataPendingRequestBinding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PersonalDataPendingRequestFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataPendingRequestFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataPendingRequestBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataPendingRequestBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "toScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PersonalDataPendingRequestFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonalDataPendingRequestFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataPendingRequestBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PersonalDataPendingRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDataRequestType.values().length];
            try {
                iArr[PersonalDataRequestType.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDataRequestType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PersonalDataPendingRequestFragment() {
        super(C28186R.layout.fragment_personal_data_pending_request);
        this.binding = ViewBinding5.viewBinding(this, PersonalDataPendingRequestFragment2.INSTANCE);
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

    private final FragmentPersonalDataPendingRequestBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPersonalDataPendingRequestBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentPersonalDataPendingRequestBinding binding = getBinding();
        RdsButton personalDataPendingRequestCta = binding.personalDataPendingRequestCta;
        Intrinsics.checkNotNullExpressionValue(personalDataPendingRequestCta, "personalDataPendingRequestCta");
        OnClickListeners.onClick(personalDataPendingRequestCta, new Function0() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataPendingRequestFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalDataPendingRequestFragment.onViewCreated$lambda$1$lambda$0(this.f$0);
            }
        });
        RdsTimelineRowView rdsTimelineRowView = binding.personalDataPendingRequestTimelineTop;
        Companion companion = INSTANCE;
        rdsTimelineRowView.setTimestampText(((Args) companion.getArgs((Fragment) this)).getRequestDate());
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getRequestType().ordinal()];
        if (i == 1) {
            binding.personalDataPendingRequestTitle.setText(C28186R.string.personal_data_pending_access_request_title);
            RhTextView rhTextView = binding.personalDataPendingRequestSubtitle;
            String string2 = getString(C28186R.string.personal_data_pending_access_request_subtitle, ((Args) companion.getArgs((Fragment) this)).getRequestDate());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            rhTextView.setText(HtmlCompat.fromHtml$default(string2, 0, 2, null));
            binding.personalDataPendingRequestTimelineTop.setPrimaryText(getString(C28186R.string.personal_data_pending_access_request_timeline_top_title));
            binding.personalDataPendingRequestTimelineMiddle.setPrimaryText(getString(C28186R.string.personal_data_pending_access_request_timeline_middle_title));
            binding.personalDataPendingRequestTimelineBottom.setPrimaryText(getString(C28186R.string.personal_data_pending_access_request_timeline_bottom_title));
            binding.personalDataPendingRequestCta.setText(C28186R.string.personal_data_pending_access_request_cta);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        binding.personalDataPendingRequestTitle.setText(C28186R.string.personal_data_pending_delete_request_title);
        RhTextView rhTextView2 = binding.personalDataPendingRequestSubtitle;
        String string3 = getString(C28186R.string.personal_data_pending_delete_request_subtitle, ((Args) companion.getArgs((Fragment) this)).getRequestDate());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        rhTextView2.setText(HtmlCompat.fromHtml$default(string3, 0, 2, null));
        binding.personalDataPendingRequestTimelineTop.setPrimaryText(getString(C28186R.string.personal_data_pending_delete_request_timeline_top_title));
        binding.personalDataPendingRequestTimelineMiddle.setPrimaryText(getString(C28186R.string.personal_data_pending_delete_request_timeline_middle_title));
        binding.personalDataPendingRequestTimelineBottom.setPrimaryText(getString(C28186R.string.personal_data_pending_delete_request_timeline_bottom_title));
        binding.personalDataPendingRequestCta.setText(C28186R.string.personal_data_pending_delete_request_cta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(PersonalDataPendingRequestFragment personalDataPendingRequestFragment) {
        EventLogger.DefaultImpls.logTap$default(personalDataPendingRequestFragment.getEventLogger(), null, new Screen(personalDataPendingRequestFragment.toScreenName(((Args) INSTANCE.getArgs((Fragment) personalDataPendingRequestFragment)).getRequestType()), null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 57, null);
        personalDataPendingRequestFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    public final Screen.Name toScreenName(PersonalDataRequestType personalDataRequestType) {
        Intrinsics.checkNotNullParameter(personalDataRequestType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
        if (i == 1) {
            return Screen.Name.IRR_REQUEST_IN_PROGRESS;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.IRR_DELETE_IN_PROGRESS;
    }

    /* compiled from: PersonalDataPendingRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataPendingRequestFragment$Args;", "Landroid/os/Parcelable;", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "requestDate", "", "<init>", "(Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;Ljava/lang/String;)V", "getRequestType", "()Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "getRequestDate", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String requestDate;
        private final PersonalDataRequestType requestType;

        /* compiled from: PersonalDataPendingRequestFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(PersonalDataRequestType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PersonalDataRequestType personalDataRequestType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                personalDataRequestType = args.requestType;
            }
            if ((i & 2) != 0) {
                str = args.requestDate;
            }
            return args.copy(personalDataRequestType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        public final Args copy(PersonalDataRequestType requestType, String requestDate) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(requestDate, "requestDate");
            return new Args(requestType, requestDate);
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
            return this.requestType == args.requestType && Intrinsics.areEqual(this.requestDate, args.requestDate);
        }

        public int hashCode() {
            return (this.requestType.hashCode() * 31) + this.requestDate.hashCode();
        }

        public String toString() {
            return "Args(requestType=" + this.requestType + ", requestDate=" + this.requestDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestType.name());
            dest.writeString(this.requestDate);
        }

        public Args(PersonalDataRequestType requestType, String requestDate) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(requestDate, "requestDate");
            this.requestType = requestType;
            this.requestDate = requestDate;
        }

        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }

        public final String getRequestDate() {
            return this.requestDate;
        }
    }

    /* compiled from: PersonalDataPendingRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataPendingRequestFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataPendingRequestFragment;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataPendingRequestFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonalDataPendingRequestFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PersonalDataPendingRequestFragment personalDataPendingRequestFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personalDataPendingRequestFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonalDataPendingRequestFragment newInstance(Args args) {
            return (PersonalDataPendingRequestFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonalDataPendingRequestFragment personalDataPendingRequestFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personalDataPendingRequestFragment, args);
        }
    }
}
