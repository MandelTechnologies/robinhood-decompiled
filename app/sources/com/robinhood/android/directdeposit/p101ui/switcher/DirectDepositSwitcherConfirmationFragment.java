package com.robinhood.android.directdeposit.p101ui.switcher;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherConfirmationDuxo2;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherConfirmationFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0003\"#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onStart", "bindState", "state", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;", "Callbacks", "Args", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositSwitcherConfirmationFragment extends GenericActionableInformationFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DirectDepositSwitcherConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DirectDepositSwitcherConfirmationDuxo.class);
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectDepositSwitcherConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Callbacks;", "", "onExitSwitcher", "", "onDirectDepositSwitchComplete", "onEarlyPayEnrollmentComplete", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositSwitchComplete();

        void onEarlyPayEnrollmentComplete();

        void onExitSwitcher();
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final DirectDepositSwitcherConfirmationDuxo getDuxo() {
        return (DirectDepositSwitcherConfirmationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireBaseActivity().showCloseIcon();
        onPrimaryActionClick(new C141401(getDuxo()));
        onSecondaryActionClick(new Function0() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositSwitcherConfirmationFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment$onViewCreated$1 */
    /* synthetic */ class C141401 extends FunctionReferenceImpl implements Function0<Unit> {
        C141401(Object obj) {
            super(0, obj, DirectDepositSwitcherConfirmationDuxo.class, "onPrimaryButtonClicked", "onPrimaryButtonClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((DirectDepositSwitcherConfirmationDuxo) this.receiver).onPrimaryButtonClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DirectDepositSwitcherConfirmationFragment directDepositSwitcherConfirmationFragment) {
        directDepositSwitcherConfirmationFragment.getCallbacks().onExitSwitcher();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onExitSwitcher();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_SWITCHER_CONFIRMATION, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141391(this));
    }

    /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment$onStart$1 */
    /* synthetic */ class C141391 extends FunctionReferenceImpl implements Function1<DirectDepositSwitcherConfirmationDuxo2, Unit> {
        C141391(Object obj) {
            super(1, obj, DirectDepositSwitcherConfirmationFragment.class, "bindState", "bindState(Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectDepositSwitcherConfirmationDuxo2 directDepositSwitcherConfirmationDuxo2) {
            invoke2(directDepositSwitcherConfirmationDuxo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectDepositSwitcherConfirmationDuxo2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectDepositSwitcherConfirmationFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(DirectDepositSwitcherConfirmationDuxo2 state) {
        GenericActionableInformationFragment.TextType text;
        Result<ApiEarlyPayEnrollment> resultConsume;
        setFullScreenLoading(state.getFullScreenLoading());
        if (state instanceof DirectDepositSwitcherConfirmationDuxo2.Loaded) {
            DirectDepositSwitcherConfirmationDuxo2.Loaded loaded = (DirectDepositSwitcherConfirmationDuxo2.Loaded) state;
            setIllustration(toDrawableIllustration(loaded.getIllustrationResId()));
            setTitle(toText(loaded.getTitleResId()));
            setDescription(toText(loaded.getDescriptionResId()));
            setPrimaryAction(toText(loaded.getPrimaryButtonResId()));
            setActionLoading(loaded.getPrimaryButtonLoading());
            Integer secondaryButtonResId = loaded.getSecondaryButtonResId();
            if (secondaryButtonResId == null || (text = toText(secondaryButtonResId.intValue())) == null) {
                text = GenericActionableInformationFragment.TextType.Empty.INSTANCE;
            }
            setSecondaryAction(text);
            UiEvent<Unit> finishEvent = loaded.getFinishEvent();
            if ((finishEvent != null ? finishEvent.consume() : null) != null) {
                getCallbacks().onDirectDepositSwitchComplete();
            }
            UiEvent<Result<ApiEarlyPayEnrollment>> earlyPayEnrollmentEvent = loaded.getEarlyPayEnrollmentEvent();
            if (earlyPayEnrollmentEvent == null || (resultConsume = earlyPayEnrollmentEvent.consume()) == null) {
                return;
            }
            Object value = resultConsume.getValue();
            ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
            if (thM28553exceptionOrNullimpl == null) {
                getCallbacks().onEarlyPayEnrollmentComplete();
            } else {
                AbsErrorHandler.handleError$default(activityErrorHandler, thM28553exceptionOrNullimpl, false, 2, null);
            }
        }
    }

    /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Args;", "Landroid/os/Parcelable;", "showEarlyPayHook", "", "<init>", "(Z)V", "getShowEarlyPayHook", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean showEarlyPayHook;

        /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
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
            dest.writeInt(this.showEarlyPayHook ? 1 : 0);
        }

        public Args(boolean z) {
            this.showEarlyPayHook = z;
        }

        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }
    }

    /* compiled from: DirectDepositSwitcherConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Args;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectDepositSwitcherConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectDepositSwitcherConfirmationFragment directDepositSwitcherConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directDepositSwitcherConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectDepositSwitcherConfirmationFragment newInstance(Args args) {
            return (DirectDepositSwitcherConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectDepositSwitcherConfirmationFragment directDepositSwitcherConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directDepositSwitcherConfirmationFragment, args);
        }
    }
}
