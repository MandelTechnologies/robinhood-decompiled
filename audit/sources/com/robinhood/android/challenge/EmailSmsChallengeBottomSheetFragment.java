package com.robinhood.android.challenge;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.challenge.databinding.FragmentEmailSmsChallengeBottomSheetBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EmailSmsChallengeBottomSheetFragment extends BaseBottomSheetDialogFragment {
    public static final String TAG = "emailSmsChallengeBottomSheet";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailSmsChallengeBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EmailSmsChallengeBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Callbacks;", "", "resendCode", "", "message", "", "useAlternateChallenge", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void resendCode(String message);

        void useAlternateChallenge();
    }

    /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EmailSmsChallengeBottomSheetFragment() {
        super(C10497R.layout.fragment_email_sms_challenge_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, EmailSmsChallengeBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
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

    private final FragmentEmailSmsChallengeBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailSmsChallengeBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScrollView emailSmsChallengeBottomSheetContainer = getBinding().emailSmsChallengeBottomSheetContainer;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeBottomSheetContainer, "emailSmsChallengeBottomSheetContainer");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, emailSmsChallengeBottomSheetContainer, 0.0f, 2, null);
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getChallenge().getType().ordinal()];
        if (i == 1) {
            FragmentEmailSmsChallengeBottomSheetBinding binding = getBinding();
            binding.emailSmsChallengeBottomSheetSubtitle.setText(C39076R.string.email_sms_challenge_bottom_sheet_sms_subtitle);
            binding.emailSmsChallengeOpenPathfinder.setPrimaryText(getString(C39076R.string.email_sms_challenge_update_phone_number));
            binding.emailSmsChallengeRequestAlternate.setPrimaryText(getString(C39076R.string.email_sms_challenge_email_alternate));
            RdsRowView emailSmsChallengeRequestAlternate = binding.emailSmsChallengeRequestAlternate;
            Intrinsics.checkNotNullExpressionValue(emailSmsChallengeRequestAlternate, "emailSmsChallengeRequestAlternate");
            emailSmsChallengeRequestAlternate.setVisibility(((Args) companion.getArgs((Fragment) this)).getChallenge().getAlternate_type() == Challenge.Type.EMAIL ? 0 : 8);
        } else if (i == 2) {
            FragmentEmailSmsChallengeBottomSheetBinding binding2 = getBinding();
            binding2.emailSmsChallengeBottomSheetSubtitle.setText(C39076R.string.email_sms_challenge_bottom_sheet_email_subtitle);
            binding2.emailSmsChallengeOpenPathfinder.setPrimaryText(getString(C39076R.string.email_sms_challenge_update_email));
            binding2.emailSmsChallengeRequestAlternate.setPrimaryText(getString(C39076R.string.email_sms_challenge_phone_number_alternate));
            RdsRowView emailSmsChallengeRequestAlternate2 = binding2.emailSmsChallengeRequestAlternate;
            Intrinsics.checkNotNullExpressionValue(emailSmsChallengeRequestAlternate2, "emailSmsChallengeRequestAlternate");
            emailSmsChallengeRequestAlternate2.setVisibility(((Args) companion.getArgs((Fragment) this)).getChallenge().getAlternate_type() == Challenge.Type.SMS ? 0 : 8);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(((Args) companion.getArgs((Fragment) this)).getChallenge());
            throw new ExceptionsH();
        }
        RdsRowView emailSmsChallengeResendCode = getBinding().emailSmsChallengeResendCode;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeResendCode, "emailSmsChallengeResendCode");
        OnClickListeners.onClick(emailSmsChallengeResendCode, new Function0() { // from class: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailSmsChallengeBottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsRowView emailSmsChallengeOpenPathfinder = getBinding().emailSmsChallengeOpenPathfinder;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeOpenPathfinder, "emailSmsChallengeOpenPathfinder");
        OnClickListeners.onClick(emailSmsChallengeOpenPathfinder, new Function0() { // from class: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailSmsChallengeBottomSheetFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        RdsRowView emailSmsChallengeRequestAlternate3 = getBinding().emailSmsChallengeRequestAlternate;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeRequestAlternate3, "emailSmsChallengeRequestAlternate");
        OnClickListeners.onClick(emailSmsChallengeRequestAlternate3, new Function0() { // from class: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailSmsChallengeBottomSheetFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        RdsRowView emailSmsChallengeCancel = getBinding().emailSmsChallengeCancel;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeCancel, "emailSmsChallengeCancel");
        OnClickListeners.onClick(emailSmsChallengeCancel, new C104846(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment) {
        EventLogger eventLogger = emailSmsChallengeBottomSheetFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.RESEND_CHALLENGE;
        Screen.Name name = Screen.Name.IN_APP_VERIFICATION;
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, null, ((Args) companion.getArgs((Fragment) emailSmsChallengeBottomSheetFragment)).getChallenge().getType().getServerValue(), null, 10, null), null, null, null, false, 60, null);
        emailSmsChallengeBottomSheetFragment.getCallbacks().resendCode(((Args) companion.getArgs((Fragment) emailSmsChallengeBottomSheetFragment)).getResendMessage());
        emailSmsChallengeBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment) {
        EventLogger.DefaultImpls.logTap$default(emailSmsChallengeBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.CONTACT_SUPPORT, new Screen(Screen.Name.IN_APP_VERIFICATION, null, "update_phone_number", null, 10, null), null, null, null, false, 60, null);
        Navigator navigator = emailSmsChallengeBottomSheetFragment.getNavigator();
        Context contextRequireContext = emailSmsChallengeBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, false, 2, null);
        emailSmsChallengeBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment) {
        emailSmsChallengeBottomSheetFragment.getCallbacks().useAlternateChallenge();
        emailSmsChallengeBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment$onViewCreated$6 */
    /* synthetic */ class C104846 extends FunctionReferenceImpl implements Function0<Unit> {
        C104846(Object obj) {
            super(0, obj, EmailSmsChallengeBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EmailSmsChallengeBottomSheetFragment) this.receiver).dismiss();
        }
    }

    /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Args;", "Landroid/os/Parcelable;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "resendMessage", "", "<init>", "(Lcom/robinhood/models/api/Challenge;Ljava/lang/String;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getResendMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Challenge challenge;
        private final String resendMessage;

        /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Challenge) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Challenge challenge, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = args.challenge;
            }
            if ((i & 2) != 0) {
                str = args.resendMessage;
            }
            return args.copy(challenge, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResendMessage() {
            return this.resendMessage;
        }

        public final Args copy(Challenge challenge, String resendMessage) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new Args(challenge, resendMessage);
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
            return Intrinsics.areEqual(this.challenge, args.challenge) && Intrinsics.areEqual(this.resendMessage, args.resendMessage);
        }

        public int hashCode() {
            int iHashCode = this.challenge.hashCode() * 31;
            String str = this.resendMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(challenge=" + this.challenge + ", resendMessage=" + this.resendMessage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.challenge, flags);
            dest.writeString(this.resendMessage);
        }

        public Args(Challenge challenge, String str) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
            this.resendMessage = str;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final String getResendMessage() {
            return this.resendMessage;
        }
    }

    /* compiled from: EmailSmsChallengeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment;", "Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Args;", "<init>", "()V", "TAG", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailSmsChallengeBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailSmsChallengeBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailSmsChallengeBottomSheetFragment newInstance(Args args) {
            return (EmailSmsChallengeBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailSmsChallengeBottomSheetFragment, args);
        }
    }
}
