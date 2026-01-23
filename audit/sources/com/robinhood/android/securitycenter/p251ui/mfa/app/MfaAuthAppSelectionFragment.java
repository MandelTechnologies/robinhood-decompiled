package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppSelectionBinding;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppSelectionFragment;
import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: MfaAuthAppSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0004)*+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0018H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppSelectionBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppSelectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Callbacks;", "callbacks$delegate", "authAppAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$AuthAppType;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onSelectAuthAppType", "type", "Callbacks", "AuthAppType", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaAuthAppSelectionFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, AuthAppType> authAppAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaAuthAppSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppSelectionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MfaAuthAppSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaAuthAppSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Callbacks;", "", "onMfaAuthAppTypeAppSelected", "", "onMfaAuthAppTypeOtherSelected", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMfaAuthAppTypeAppSelected();

        void onMfaAuthAppTypeOtherSelected();
    }

    /* compiled from: MfaAuthAppSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Challenge.Flow.values().length];
            try {
                iArr[Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuthAppType.values().length];
            try {
                iArr2[AuthAppType.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[AuthAppType.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MfaAuthAppSelectionFragment() {
        super(C28186R.layout.fragment_mfa_auth_app_selection);
        this.binding = ViewBinding5.viewBinding(this, MfaAuthAppSelectionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.authAppAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaAuthAppSelectionFragment.authAppAdapter$lambda$1(this.f$0, (RdsRowView) obj, (MfaAuthAppSelectionFragment.AuthAppType) obj2);
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

    private final FragmentMfaAuthAppSelectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMfaAuthAppSelectionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authAppAdapter$lambda$1(final MfaAuthAppSelectionFragment mfaAuthAppSelectionFragment, RdsRowView of, final AuthAppType type2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(type2, "type");
        of.setPrimaryText(mfaAuthAppSelectionFragment.getString(type2.getTitle()));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppSelectionFragment.authAppAdapter$lambda$1$lambda$0(this.f$0, type2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authAppAdapter$lambda$1$lambda$0(MfaAuthAppSelectionFragment mfaAuthAppSelectionFragment, AuthAppType authAppType) {
        mfaAuthAppSelectionFragment.onSelectAuthAppType(authAppType);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFlowId() == Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA) {
            toolbar.setVisibility(4);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Challenge.Flow flowId = ((Args) INSTANCE.getArgs((Fragment) this)).getFlowId();
        if ((flowId == null ? -1 : WhenMappings.$EnumSwitchMapping$0[flowId.ordinal()]) == 1) {
            return true;
        }
        return super.onBackPressed();
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().mfaAuthAppSelectionRecyclerView.setAdapter(this.authAppAdapter);
        this.authAppAdapter.submitList(ArraysKt.toList(AuthAppType.values()));
    }

    private final void onSelectAuthAppType(AuthAppType type2) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.MFA_AUTH_APP_SELECTION, null, null, null, 14, null), new Component(Component.ComponentType.ROW, type2.getLoggingIdentifier(), null, 4, null), null, null, false, 57, null);
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            getCallbacks().onMfaAuthAppTypeAppSelected();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onMfaAuthAppTypeOtherSelected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MfaAuthAppSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$AuthAppType;", "", "title", "", "loggingIdentifier", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getTitle", "()I", "getLoggingIdentifier", "()Ljava/lang/String;", "APP", "OTHER", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class AuthAppType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthAppType[] $VALUES;
        public static final AuthAppType APP = new AuthAppType("APP", 0, C28186R.string.setting_mfa_auth_app_type_app_title, "auth-app");
        public static final AuthAppType OTHER = new AuthAppType("OTHER", 1, C28186R.string.setting_mfa_auth_app_type_other_title, "other");
        private final String loggingIdentifier;
        private final int title;

        private static final /* synthetic */ AuthAppType[] $values() {
            return new AuthAppType[]{APP, OTHER};
        }

        public static EnumEntries<AuthAppType> getEntries() {
            return $ENTRIES;
        }

        private AuthAppType(String str, int i, int i2, String str2) {
            this.title = i2;
            this.loggingIdentifier = str2;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final int getTitle() {
            return this.title;
        }

        static {
            AuthAppType[] authAppTypeArr$values = $values();
            $VALUES = authAppTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(authAppTypeArr$values);
        }

        public static AuthAppType valueOf(String str) {
            return (AuthAppType) Enum.valueOf(AuthAppType.class, str);
        }

        public static AuthAppType[] values() {
            return (AuthAppType[]) $VALUES.clone();
        }
    }

    /* compiled from: MfaAuthAppSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Args;", "Landroid/os/Parcelable;", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "<init>", "(Lcom/robinhood/models/api/Challenge$Flow;)V", "getFlowId", "()Lcom/robinhood/models/api/Challenge$Flow;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Challenge.Flow flowId;

        /* compiled from: MfaAuthAppSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Challenge.Flow) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Challenge.Flow flow, int i, Object obj) {
            if ((i & 1) != 0) {
                flow = args.flowId;
            }
            return args.copy(flow);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }

        public final Args copy(Challenge.Flow flowId) {
            return new Args(flowId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.flowId == ((Args) other).flowId;
        }

        public int hashCode() {
            Challenge.Flow flow = this.flowId;
            if (flow == null) {
                return 0;
            }
            return flow.hashCode();
        }

        public String toString() {
            return "Args(flowId=" + this.flowId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.flowId, flags);
        }

        public Args(Challenge.Flow flow) {
            this.flowId = flow;
        }

        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }
    }

    /* compiled from: MfaAuthAppSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MfaAuthAppSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MfaAuthAppSelectionFragment mfaAuthAppSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mfaAuthAppSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MfaAuthAppSelectionFragment newInstance(Args args) {
            return (MfaAuthAppSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MfaAuthAppSelectionFragment mfaAuthAppSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mfaAuthAppSelectionFragment, args);
        }
    }
}
