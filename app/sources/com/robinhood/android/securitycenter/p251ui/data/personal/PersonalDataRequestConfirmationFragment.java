package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataRequestConfirmationBinding;
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

/* compiled from: PersonalDataRequestConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u00020\u001a*\u00020\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PersonalDataRequestConfirmationFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonalDataRequestConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PersonalDataRequestConfirmationFragment.kt */
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

    public PersonalDataRequestConfirmationFragment() {
        super(C28186R.layout.fragment_personal_data_request_confirmation);
        this.binding = ViewBinding5.viewBinding(this, PersonalDataRequestConfirmationFragment2.INSTANCE);
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

    private final FragmentPersonalDataRequestConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPersonalDataRequestConfirmationBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentPersonalDataRequestConfirmationBinding binding = getBinding();
        RdsButton personalDataRequestConfirmationCta = binding.personalDataRequestConfirmationCta;
        Intrinsics.checkNotNullExpressionValue(personalDataRequestConfirmationCta, "personalDataRequestConfirmationCta");
        OnClickListeners.onClick(personalDataRequestConfirmationCta, new Function0() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalDataRequestConfirmationFragment.onViewCreated$lambda$1$lambda$0(this.f$0);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getRequestType().ordinal()];
        if (i == 1) {
            binding.personalDataRequestConfirmationTitle.setText(C28186R.string.personal_data_access_request_confirmation_title);
            binding.personalDataRequestConfirmationSubtitle.setText(C28186R.string.personal_data_access_request_confirmation_subtitle);
            binding.personalDataRequestConfirmationCta.setText(C28186R.string.personal_data_access_request_confirmation_cta);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.personalDataRequestConfirmationTitle.setText(C28186R.string.personal_data_delete_request_confirmation_title);
            binding.personalDataRequestConfirmationSubtitle.setText(C28186R.string.personal_data_delete_request_confirmation_subtitle);
            binding.personalDataRequestConfirmationCta.setText(C28186R.string.personal_data_delete_request_confirmation_cta);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(PersonalDataRequestConfirmationFragment personalDataRequestConfirmationFragment) {
        EventLogger.DefaultImpls.logTap$default(personalDataRequestConfirmationFragment.getEventLogger(), null, new Screen(personalDataRequestConfirmationFragment.toScreenName(((Args) INSTANCE.getArgs((Fragment) personalDataRequestConfirmationFragment)).getRequestType()), null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 57, null);
        personalDataRequestConfirmationFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getRequestType().ordinal()] == 2) {
            toolbar.getToolbar().setNavigationIcon((Drawable) null);
        }
    }

    public final Screen.Name toScreenName(PersonalDataRequestType personalDataRequestType) {
        Intrinsics.checkNotNullParameter(personalDataRequestType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
        if (i == 1) {
            return Screen.Name.IRR_REQUEST_CONFIRMATION;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.IRR_DELETE_CONFIRMATION;
    }

    /* compiled from: PersonalDataRequestConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestConfirmationFragment$Args;", "Landroid/os/Parcelable;", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "<init>", "(Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;)V", "getRequestType", "()Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final PersonalDataRequestType requestType;

        /* compiled from: PersonalDataRequestConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(PersonalDataRequestType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PersonalDataRequestType personalDataRequestType, int i, Object obj) {
            if ((i & 1) != 0) {
                personalDataRequestType = args.requestType;
            }
            return args.copy(personalDataRequestType);
        }

        /* renamed from: component1, reason: from getter */
        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }

        public final Args copy(PersonalDataRequestType requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            return new Args(requestType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.requestType == ((Args) other).requestType;
        }

        public int hashCode() {
            return this.requestType.hashCode();
        }

        public String toString() {
            return "Args(requestType=" + this.requestType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestType.name());
        }

        public Args(PersonalDataRequestType requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            this.requestType = requestType;
        }

        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }
    }

    /* compiled from: PersonalDataRequestConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestConfirmationFragment;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestConfirmationFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonalDataRequestConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PersonalDataRequestConfirmationFragment personalDataRequestConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personalDataRequestConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonalDataRequestConfirmationFragment newInstance(Args args) {
            return (PersonalDataRequestConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonalDataRequestConfirmationFragment personalDataRequestConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personalDataRequestConfirmationFragment, args);
        }
    }
}
