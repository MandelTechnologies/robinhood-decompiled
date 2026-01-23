package com.robinhood.android.feature.lib.sweep.interest.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.feature.lib.sweep.interest.C16703R;
import com.robinhood.android.feature.lib.sweep.interest.databinding.SweepDisableDialogBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentAction;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
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
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: SweepDisableDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepDisableDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepDisableDialogBinding;", "binding", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "getSweepEnrollmentStore", "()Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "setSweepEnrollmentStore", "(Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "j$/time/Instant", "appearTime", "Lj$/time/Instant;", "Companion", "Args", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SweepDisableDialogFragment extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepDisableDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepDisableDialogBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Instant appearTime;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @ElapsedRealtime
    public Clock clock;
    private final Component.ComponentType componentType;
    public EventLogger eventLogger;
    public SweepEnrollmentStore sweepEnrollmentStore;
    public UserStore userStore;

    /* compiled from: SweepDisableDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SweepDisableDialogFragment() {
        super(C16703R.layout.sweep_disable_dialog);
        this.binding = ViewBinding5.viewBinding(this, SweepDisableDialogFragment2.INSTANCE);
        this.componentType = Component.ComponentType.SWEEP_DISABLE_DIALOG;
    }

    private final SweepDisableDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SweepDisableDialogBinding) value;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final SweepEnrollmentStore getSweepEnrollmentStore() {
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore;
        if (sweepEnrollmentStore != null) {
            return sweepEnrollmentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepEnrollmentStore");
        return null;
    }

    public final void setSweepEnrollmentStore(SweepEnrollmentStore sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "<set-?>");
        this.sweepEnrollmentStore = sweepEnrollmentStore;
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

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton yesBtn = getBinding().yesBtn;
        Intrinsics.checkNotNullExpressionValue(yesBtn, "yesBtn");
        OnClickListeners.onClick(yesBtn, new Function0() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepDisableDialogFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton noBtn = getBinding().noBtn;
        Intrinsics.checkNotNullExpressionValue(noBtn, "noBtn");
        OnClickListeners.onClick(noBtn, new Function0() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepDisableDialogFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(final SweepDisableDialogFragment sweepDisableDialogFragment) {
        sweepDisableDialogFragment.getBinding().yesBtn.setLoading(true);
        EventLogger.DefaultImpls.logTap$default(sweepDisableDialogFragment.getEventLogger(), UserInteractionEventData.Action.DONE, null, new Component(sweepDisableDialogFragment.componentType, null, null, 6, null), null, null, false, 58, null);
        LifecycleHost.DefaultImpls.bind$default(sweepDisableDialogFragment, CompletablesAndroid.observeOnMainThread(sweepDisableDialogFragment.getSweepEnrollmentStore().updateSweepEnrollment(((Args) INSTANCE.getArgs((Fragment) sweepDisableDialogFragment)).getAccountNumber(), SweepEnrollmentAction.UNENROLL)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepDisableDialogFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        }, Fragments2.getActivityErrorHandler(sweepDisableDialogFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(SweepDisableDialogFragment sweepDisableDialogFragment) {
        sweepDisableDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SweepDisableDialogFragment sweepDisableDialogFragment) {
        EventLogger.DefaultImpls.logTap$default(sweepDisableDialogFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, null, new Component(sweepDisableDialogFragment.componentType, null, null, 6, null), null, null, false, 58, null);
        sweepDisableDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getUserStore().getUser()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepDisableDialogFragment.onStart$lambda$4(this.f$0, (User) obj);
            }
        });
        this.appearTime = Instant.now();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, null, new Component(this.componentType, null, null, 6, null), null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(SweepDisableDialogFragment sweepDisableDialogFragment, User it) {
        int i;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            i = C16703R.string.disable_sweep_dialog_message_gb;
        } else {
            Companion companion = INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) sweepDisableDialogFragment)).getBrokerageAccountType().ordinal()];
            if (i2 == 1) {
                i = C16703R.string.disable_sweep_dialog_message_us;
            } else if (i2 == 2) {
                i = C16703R.string.disable_sweep_dialog_message_joint_us;
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(((Args) companion.getArgs((Fragment) sweepDisableDialogFragment)).getBrokerageAccountType());
                throw new ExceptionsH();
            }
        }
        sweepDisableDialogFragment.getBinding().messageTxt.setText(i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        long millis;
        Instant instant = this.appearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(getClock());
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, null, new Component(this.componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 11, null);
        super.onStop();
    }

    /* compiled from: SweepDisableDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;

        /* compiled from: SweepDisableDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            return args.copy(str, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final Args copy(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new Args(accountNumber, brokerageAccountType);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.brokerageAccountType == args.brokerageAccountType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.brokerageAccountType.name());
        }

        public Args(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }
    }

    /* compiled from: SweepDisableDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment$Args;", "<init>", "()V", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepDisableDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepDisableDialogFragment sweepDisableDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepDisableDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepDisableDialogFragment newInstance(Args args) {
            return (SweepDisableDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepDisableDialogFragment sweepDisableDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepDisableDialogFragment, args);
        }
    }
}
