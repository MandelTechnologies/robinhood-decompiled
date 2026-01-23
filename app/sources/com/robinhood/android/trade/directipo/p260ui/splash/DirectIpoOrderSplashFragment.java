package com.robinhood.android.trade.directipo.p260ui.splash;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.FragmentDirectIpoAccessBinding;
import com.robinhood.android.trade.directipo.pref.ShowDirectIpoOrderSplashPref;
import com.robinhood.directipo.models.p292db.DirectIpoOrderEntryIntro;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.DirectIpoOrderEntryIntroStore;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.utils.extensions.ConstraintLayouts;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* compiled from: DirectIpoOrderSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u000389:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002J\t\u00101\u001a\u000202H\u0096\u0001R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "getShowDirectIpoOrderSplashPref$annotations", "getShowDirectIpoOrderSplashPref", "()Lcom/robinhood/prefs/StringToBooleanMapPreference;", "setShowDirectIpoOrderSplashPref", "(Lcom/robinhood/prefs/StringToBooleanMapPreference;)V", "directIpoOrderEntryIntroStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;", "getDirectIpoOrderEntryIntroStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;", "setDirectIpoOrderEntryIntroStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoAccessBinding;", "getBinding", "()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoAccessBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Callbacks;", "callbacks$delegate", "sectionAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashSectionView;", "Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro$Section;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setData", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderSplashFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore;
    public Markwon markwon;
    private final GenericListAdapter<DirectIpoOrderSplashSectionView, DirectIpoOrderEntryIntro.Section> sectionAdapter;
    public StringToBooleanMapPreference showDirectIpoOrderSplashPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoAccessBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Callbacks;", "", "onExitDirectIpoOrderSplash", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExitDirectIpoOrderSplash();
    }

    @ShowDirectIpoOrderSplashPref
    public static /* synthetic */ void getShowDirectIpoOrderSplashPref$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOrderSplashFragment() {
        super(C29323R.layout.fragment_direct_ipo_access);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoOrderSplashFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.sectionAdapter = GenericListAdapter.INSTANCE.m2986of(DirectIpoOrderSplashSectionView.INSTANCE, DiffCallbacks.Equality.INSTANCE);
    }

    public final StringToBooleanMapPreference getShowDirectIpoOrderSplashPref() {
        StringToBooleanMapPreference stringToBooleanMapPreference = this.showDirectIpoOrderSplashPref;
        if (stringToBooleanMapPreference != null) {
            return stringToBooleanMapPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showDirectIpoOrderSplashPref");
        return null;
    }

    public final void setShowDirectIpoOrderSplashPref(StringToBooleanMapPreference stringToBooleanMapPreference) {
        Intrinsics.checkNotNullParameter(stringToBooleanMapPreference, "<set-?>");
        this.showDirectIpoOrderSplashPref = stringToBooleanMapPreference;
    }

    public final DirectIpoOrderEntryIntroStore getDirectIpoOrderEntryIntroStore() {
        DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore = this.directIpoOrderEntryIntroStore;
        if (directIpoOrderEntryIntroStore != null) {
            return directIpoOrderEntryIntroStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("directIpoOrderEntryIntroStore");
        return null;
    }

    public final void setDirectIpoOrderEntryIntroStore(DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore) {
        Intrinsics.checkNotNullParameter(directIpoOrderEntryIntroStore, "<set-?>");
        this.directIpoOrderEntryIntroStore = directIpoOrderEntryIntroStore;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final FragmentDirectIpoAccessBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoAccessBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView sectionList = getBinding().sectionList;
        Intrinsics.checkNotNullExpressionValue(sectionList, "sectionList");
        bindAdapter(sectionList, this.sectionAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDirectIpoOrderEntryIntroStore().stream(((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C293551(this));
        RdsButton continueCtaBtn = getBinding().continueCtaBtn;
        Intrinsics.checkNotNullExpressionValue(continueCtaBtn, "continueCtaBtn");
        OnClickListeners.onClick(continueCtaBtn, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderSplashFragment.onStart$lambda$0(this.f$0);
            }
        });
        RdsButton neverShowAgainCtaBtn = getBinding().neverShowAgainCtaBtn;
        Intrinsics.checkNotNullExpressionValue(neverShowAgainCtaBtn, "neverShowAgainCtaBtn");
        OnClickListeners.onClick(neverShowAgainCtaBtn, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderSplashFragment.onStart$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: DirectIpoOrderSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment$onStart$1 */
    /* synthetic */ class C293551 extends FunctionReferenceImpl implements Function1<DirectIpoOrderEntryIntro, Unit> {
        C293551(Object obj) {
            super(1, obj, DirectIpoOrderSplashFragment.class, "setData", "setData(Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoOrderEntryIntro directIpoOrderEntryIntro) {
            invoke2(directIpoOrderEntryIntro);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoOrderEntryIntro p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoOrderSplashFragment) this.receiver).setData(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DirectIpoOrderSplashFragment directIpoOrderSplashFragment) {
        directIpoOrderSplashFragment.getCallbacks().onExitDirectIpoOrderSplash();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectIpoOrderSplashFragment directIpoOrderSplashFragment) {
        StringToBooleanMapPreference showDirectIpoOrderSplashPref = directIpoOrderSplashFragment.getShowDirectIpoOrderSplashPref();
        showDirectIpoOrderSplashPref.setValues(MapsKt.plus(showDirectIpoOrderSplashPref.getValues(), Tuples4.m3642to(((Args) INSTANCE.getArgs((Fragment) directIpoOrderSplashFragment)).getInstrumentId().toString(), Boolean.FALSE)));
        directIpoOrderSplashFragment.getCallbacks().onExitDirectIpoOrderSplash();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setData(DirectIpoOrderEntryIntro data) {
        FragmentDirectIpoAccessBinding binding = getBinding();
        binding.title.setText(data.getTitle());
        binding.subtitle.setText(getMarkwon().toMarkdown(data.getSubtitleMarkdown()));
        this.sectionAdapter.submitList(data.getSections());
        binding.continueCtaBtn.setText(data.getContinueCtaTitle());
        binding.neverShowAgainCtaBtn.setText(data.getSecondaryCtaTitle());
        LottieAnimationView lottieAnimationView = binding.lottieView;
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ConstraintLayouts.setDimensionRatioHeightConstrained(layoutParams2, data.getLottieAnimationAspectRatio());
        lottieAnimationView.setLayoutParams(layoutParams2);
        if (getBinding().lottieView.isAnimating()) {
            return;
        }
        getBinding().lottieView.setAnimationFromUrl(data.getLottieAnimationUrl());
    }

    /* compiled from: DirectIpoOrderSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: DirectIpoOrderSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Args copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.instrumentId, ((Args) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public Args(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: DirectIpoOrderSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Args;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderSplashFragment directIpoOrderSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderSplashFragment newInstance(Args args) {
            return (DirectIpoOrderSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderSplashFragment directIpoOrderSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderSplashFragment, args);
        }
    }
}
