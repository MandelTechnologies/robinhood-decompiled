package com.robinhood.android.acatsin.landed;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.FragmentAcatsLandedBinding;
import com.robinhood.android.acatsin.landed.AcatsLandedFragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
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

/* compiled from: AcatsLandedFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsLandedBinding;", "getBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsLandedBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "animateContent", "Callbacks", "Args", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsLandedFragment extends BaseFragment implements AutoLoggableFragment {
    public static final int DIGITS_TO_SHOW = 4;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsLandedFragment.class, "binding", "getBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsLandedBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsLandedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsLandedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Callbacks;", "", "onManageClicked", "", "onViewDetailsClicked", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onManageClicked();

        void onViewDetailsClicked(AcatsTransfer acatsTransfer);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsLandedFragment() {
        super(C7725R.layout.fragment_acats_landed);
        this.binding = ViewBinding5.viewBinding(this, AcatsLandedFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsLandedFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentAcatsLandedBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsLandedBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_CELEBRATION, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AcatsLandedOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final AcatsTransfer acatsTransfer = ((Args) INSTANCE.getArgs((Fragment) this)).getAcatsTransfer();
        FragmentAcatsLandedBinding binding = getBinding();
        RhTextView rhTextView = binding.acatsInLandedBrokerTxt;
        CharSequence contraBrokerName = acatsTransfer.getContraBrokerName();
        if (contraBrokerName == null) {
            contraBrokerName = getResources().getText(C7725R.string.acats_in_landed_broker_generic, acatsTransfer.getContraDtccNumber());
        }
        rhTextView.setText(contraBrokerName);
        RhTextView rhTextView2 = binding.acatsInLandedAccountNumberTxt;
        Resources resources = getResources();
        int i = C7725R.string.acats_in_landed_account_number;
        String strSubstring = acatsTransfer.getContraAccountNumber().substring(acatsTransfer.getContraAccountNumber().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        rhTextView2.setText(resources.getString(i, strSubstring));
        binding.acatsInLandedAssetCountTxt.setText(String.valueOf(acatsTransfer.getAssets().size()));
        RdsButton acatsInLandedManageBtn = binding.acatsInLandedManageBtn;
        Intrinsics.checkNotNullExpressionValue(acatsInLandedManageBtn, "acatsInLandedManageBtn");
        ViewsKt.eventData$default(acatsInLandedManageBtn, false, new Function0() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsLandedFragment.onViewCreated$lambda$5$lambda$0();
            }
        }, 1, null);
        RdsButton acatsInLandedManageBtn2 = binding.acatsInLandedManageBtn;
        Intrinsics.checkNotNullExpressionValue(acatsInLandedManageBtn2, "acatsInLandedManageBtn");
        OnClickListeners.onClick(acatsInLandedManageBtn2, new Function0() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsLandedFragment.onViewCreated$lambda$5$lambda$1(this.f$0);
            }
        });
        RdsButton acatsInLandedViewDetailBtn = binding.acatsInLandedViewDetailBtn;
        Intrinsics.checkNotNullExpressionValue(acatsInLandedViewDetailBtn, "acatsInLandedViewDetailBtn");
        ViewsKt.eventData$default(acatsInLandedViewDetailBtn, false, new Function0() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsLandedFragment.onViewCreated$lambda$5$lambda$2();
            }
        }, 1, null);
        RdsButton acatsInLandedViewDetailBtn2 = binding.acatsInLandedViewDetailBtn;
        Intrinsics.checkNotNullExpressionValue(acatsInLandedViewDetailBtn2, "acatsInLandedViewDetailBtn");
        OnClickListeners.onClick(acatsInLandedViewDetailBtn2, new Function0() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsLandedFragment.onViewCreated$lambda$5$lambda$3(this.f$0, acatsTransfer);
            }
        });
        final LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        OneShotPreDrawListener.add(root, new Runnable() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$onViewCreated$lambda$5$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.animateContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$1(AcatsLandedFragment acatsLandedFragment) {
        acatsLandedFragment.getCallbacks().onManageClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$2() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_TRANSFER_DETAILS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$3(AcatsLandedFragment acatsLandedFragment, AcatsTransfer acatsTransfer) {
        acatsLandedFragment.getCallbacks().onViewDetailsClicked(acatsTransfer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateContent() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.17f, 0.17f, 0.1f, 1.0f);
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNull(root);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$animateContent$lambda$8$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.landed.AcatsLandedFragment$animateContent$lambda$8$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        SimpleSlide simpleSlide = new SimpleSlide(0, 1, null);
        simpleSlide.setDuration(500L);
        simpleSlide.setInterpolator(pathInterpolator);
        simpleSlide.addTarget(getBinding().getRoot());
        transitionSet.addTransition(simpleSlide);
        TransitionManager.beginDelayedTransition(root, transitionSet);
        root.setVisibility(0);
    }

    /* compiled from: AcatsLandedFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Args;", "Landroid/os/Parcelable;", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;)V", "getAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AcatsTransfer acatsTransfer;

        /* compiled from: AcatsLandedFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AcatsTransfer) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AcatsTransfer acatsTransfer, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsTransfer = args.acatsTransfer;
            }
            return args.copy(acatsTransfer);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsTransfer getAcatsTransfer() {
            return this.acatsTransfer;
        }

        public final Args copy(AcatsTransfer acatsTransfer) {
            Intrinsics.checkNotNullParameter(acatsTransfer, "acatsTransfer");
            return new Args(acatsTransfer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.acatsTransfer, ((Args) other).acatsTransfer);
        }

        public int hashCode() {
            return this.acatsTransfer.hashCode();
        }

        public String toString() {
            return "Args(acatsTransfer=" + this.acatsTransfer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.acatsTransfer, flags);
        }

        public Args(AcatsTransfer acatsTransfer) {
            Intrinsics.checkNotNullParameter(acatsTransfer, "acatsTransfer");
            this.acatsTransfer = acatsTransfer;
        }

        public final AcatsTransfer getAcatsTransfer() {
            return this.acatsTransfer;
        }
    }

    /* compiled from: AcatsLandedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment;", "Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Args;", "<init>", "()V", "DIGITS_TO_SHOW", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsLandedFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsLandedFragment acatsLandedFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsLandedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsLandedFragment newInstance(Args args) {
            return (AcatsLandedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsLandedFragment acatsLandedFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsLandedFragment, args);
        }
    }
}
