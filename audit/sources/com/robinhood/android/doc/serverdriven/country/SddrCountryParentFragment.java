package com.robinhood.android.doc.serverdriven.country;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.doc.serverdriven.country.SddrCountryFragment;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver;
import com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SddrCountryParentFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Callbacks;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRegionSelected", "region", "Lcom/robinhood/iso/countrycode/CountryCode;", "onCountrySelected", PlaceTypes.COUNTRY, "onRegionSelectorRequested", "selected", "options", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrCountryParentFragment extends BaseFragment implements SddrRegionSelectorFragment.Callbacks, SddrCountryFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrCountryParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SddrCountryParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SddrFlowEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryParentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final SddrFlowEventReceiver getCallbacks() {
        return (SddrFlowEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            replaceFragmentWithoutAnimationAndBackStack(SddrCountryFragment.INSTANCE.newInstance((Parcelable) new SddrCountryFragment.Args(((SddrDestination.Country) INSTANCE.getArgs((Fragment) this)).getContent(), null)));
        }
    }

    @Override // com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment.Callbacks
    public void onRegionSelected(CountryCode region) {
        Intrinsics.checkNotNullParameter(region, "region");
        requireBaseActivity().onBackPressed();
        replaceFragmentWithBackTransitionWithoutBackStack(SddrCountryFragment.INSTANCE.newInstance((Parcelable) new SddrCountryFragment.Args(((SddrDestination.Country) INSTANCE.getArgs((Fragment) this)).getContent(), region)));
    }

    @Override // com.robinhood.android.doc.serverdriven.country.SddrCountryFragment.Callbacks
    public void onCountrySelected(CountryCode country) {
        Intrinsics.checkNotNullParameter(country, "country");
        getCallbacks().onFlowEvent(new SddrFlowEvent.CountrySelected(((SddrDestination.Country) INSTANCE.getArgs((Fragment) this)).getState(), country));
    }

    @Override // com.robinhood.android.doc.serverdriven.country.SddrCountryFragment.Callbacks
    public void onRegionSelectorRequested(CountryCode selected, List<? extends CountryCode> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        replaceFragment(SddrRegionSelectorFragment.INSTANCE.newInstance((Parcelable) new SddrRegionSelectorFragment.Args(selected, options)));
    }

    /* compiled from: SddrCountryParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryParentFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Country;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrCountryParentFragment, SddrDestination.Country> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SddrDestination.Country getArgs(SddrCountryParentFragment sddrCountryParentFragment) {
            return (SddrDestination.Country) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrCountryParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrCountryParentFragment newInstance(SddrDestination.Country country) {
            return (SddrCountryParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, country);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrCountryParentFragment sddrCountryParentFragment, SddrDestination.Country country) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrCountryParentFragment, country);
        }
    }
}
