package com.robinhood.android.earlypay.lib.signup.p112ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.earlypay.lib.C14449R;
import com.robinhood.android.earlypay.lib.signup.p112ui.EarlyPaySignupFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: EarlyPaySignupFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\t\u0010\u001a\u001a\u00020\u0018H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "getEarlyPayEnrollmentStore", "()Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "setEarlyPayEnrollmentStore", "(Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;)V", "callbacks", "Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "enrollInEarlyPay", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPaySignupFragment extends GenericActionableInformationFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyPaySignupFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EarlyPaySignupFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EarlyPayEnrollmentStore earlyPayEnrollmentStore;

    /* compiled from: EarlyPaySignupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", "", "onEnrollmentSuccess", "", "onEnrollmentSkipped", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEnrollmentSkipped();

        void onEnrollmentSuccess();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final EarlyPayEnrollmentStore getEarlyPayEnrollmentStore() {
        EarlyPayEnrollmentStore earlyPayEnrollmentStore = this.earlyPayEnrollmentStore;
        if (earlyPayEnrollmentStore != null) {
            return earlyPayEnrollmentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("earlyPayEnrollmentStore");
        return null;
    }

    public final void setEarlyPayEnrollmentStore(EarlyPayEnrollmentStore earlyPayEnrollmentStore) {
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "<set-?>");
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        overrideConstraintWidthPercent(0.5f);
        setIllustration(toDrawableIllustration(C14449R.drawable.svg_early_pay));
        setTitle(toText(C14449R.string.early_pay_signup_dd_already_setup_title));
        setDescription(toText(C14449R.string.early_pay_signup_dd_already_setup_description));
        if (((Args) INSTANCE.getArgs((Fragment) this)).getShowLearnMoreCta()) {
            i = C11048R.string.general_action_learn_more;
        } else {
            i = C11048R.string.general_label_sign_up;
        }
        setPrimaryAction(toText(i));
        onPrimaryActionClick(new Function0() { // from class: com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyPaySignupFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        setSecondaryAction(toText(C11048R.string.general_label_maybe_later));
        onSecondaryActionClick(new C144522(getCallbacks()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(EarlyPaySignupFragment earlyPaySignupFragment) {
        if (((Args) INSTANCE.getArgs((Fragment) earlyPaySignupFragment)).getShowLearnMoreCta()) {
            Navigator navigator = earlyPaySignupFragment.getNavigator();
            Context contextRequireContext = earlyPaySignupFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.EarlyPayEnrollment(false, 1, null), null, false, null, null, 60, null);
        } else {
            earlyPaySignupFragment.enrollInEarlyPay();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EarlyPaySignupFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment$onViewCreated$2 */
    /* synthetic */ class C144522 extends FunctionReferenceImpl implements Function0<Unit> {
        C144522(Object obj) {
            super(0, obj, Callbacks.class, "onEnrollmentSkipped", "onEnrollmentSkipped()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onEnrollmentSkipped();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    private final void enrollInEarlyPay() {
        setActionLoading(true);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SingleDelay2.minTimeInFlight$default(getEarlyPayEnrollmentStore().updateEnrollment(true), 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPaySignupFragment.enrollInEarlyPay$lambda$1(this.f$0, (ApiEarlyPayEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPaySignupFragment.enrollInEarlyPay$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInEarlyPay$lambda$1(EarlyPaySignupFragment earlyPaySignupFragment, ApiEarlyPayEnrollment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        earlyPaySignupFragment.setActionLoading(false);
        earlyPaySignupFragment.getCallbacks().onEnrollmentSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInEarlyPay$lambda$2(EarlyPaySignupFragment earlyPaySignupFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AbsErrorHandler.handleError$default(earlyPaySignupFragment.getActivityErrorHandler(), throwable, false, 2, null);
        earlyPaySignupFragment.setActionLoading(false);
        return Unit.INSTANCE;
    }

    /* compiled from: EarlyPaySignupFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Args;", "Landroid/os/Parcelable;", "showLearnMoreCta", "", "<init>", "(Z)V", "getShowLearnMoreCta", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean showLearnMoreCta;

        /* compiled from: EarlyPaySignupFragment.kt */
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

        public Args() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showLearnMoreCta ? 1 : 0);
        }

        public Args(boolean z) {
            this.showLearnMoreCta = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getShowLearnMoreCta() {
            return this.showLearnMoreCta;
        }
    }

    /* compiled from: EarlyPaySignupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment;", "Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Args;", "<init>", "()V", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EarlyPaySignupFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EarlyPaySignupFragment earlyPaySignupFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, earlyPaySignupFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EarlyPaySignupFragment newInstance(Args args) {
            return (EarlyPaySignupFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EarlyPaySignupFragment earlyPaySignupFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, earlyPaySignupFragment, args);
        }
    }
}
