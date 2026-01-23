package com.robinhood.android.acatsin.partials.option;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment;
import com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AcatsInPartialOptionAssetParentFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002 !B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Callbacks;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "childFragmentsShouldNotConfigureToolbar", "", "getChildFragmentsShouldNotConfigureToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onInstrumentClicked", "instrument", "Lcom/robinhood/models/db/Instrument;", "onEditOptionSymbolClicked", "onAssetEntered", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAssetUpdated", "onAssetRemoved", "Args", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialOptionAssetParentFragment extends BaseFragment implements AcatsInSearchEquityFragment.Callbacks, AcatsInPartialOptionAssetFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPartialOptionAssetParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AcatsInPartialOptionAssetParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAssetPageCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetParentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    private final AcatsInAssetPageCallbacks getCallbacks() {
        return (AcatsInAssetPageCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            UiAcatsAsset.OptionAsset assetToModify = ((Args) INSTANCE.getArgs((Fragment) this)).getAssetToModify();
            if (assetToModify != null) {
                setFragment(C11048R.id.fragment_container, AcatsInPartialOptionAssetFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialOptionAssetFragment.Args(assetToModify.getInstrumentId(), assetToModify.getSymbol(), assetToModify)));
            } else {
                setFragment(C11048R.id.fragment_container, AcatsInSearchEquityFragment.INSTANCE.newInstance());
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        int i;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (!((Args) INSTANCE.getArgs((Fragment) this)).isInEditMode()) {
            i = C7686R.string.acats_in_add_option_title;
        } else {
            i = C7686R.string.acats_in_edit_option_title;
        }
        RhToolbars.setCenteredTitle(toolbar, i);
    }

    @Override // com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment.Callbacks
    public void onInstrumentClicked(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        replaceFragment(AcatsInPartialOptionAssetFragment.INSTANCE.newInstance((Parcelable) new AcatsInPartialOptionAssetFragment.Args(instrument.getId(), instrument.getSymbol(), null, 4, null)));
    }

    @Override // com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment.Callbacks
    public void onEditOptionSymbolClicked() {
        onBackPressed();
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetEntered(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getCallbacks().onAssetEntered(asset);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetUpdated(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getCallbacks().onAssetUpdated(asset);
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks
    public void onAssetRemoved(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getCallbacks().onAssetRemoved(asset);
    }

    /* compiled from: AcatsInPartialOptionAssetParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetParentFragment$Args;", "Landroid/os/Parcelable;", "assetToModify", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "hasSubzeroExperiment", "", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;Z)V", "getAssetToModify", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "getHasSubzeroExperiment", "()Z", "isInEditMode", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiAcatsAsset.OptionAsset assetToModify;
        private final boolean hasSubzeroExperiment;

        /* compiled from: AcatsInPartialOptionAssetParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : UiAcatsAsset.OptionAsset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            UiAcatsAsset.OptionAsset optionAsset = this.assetToModify;
            if (optionAsset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                optionAsset.writeToParcel(dest, flags);
            }
            dest.writeInt(this.hasSubzeroExperiment ? 1 : 0);
        }

        public Args(UiAcatsAsset.OptionAsset optionAsset, boolean z) {
            this.assetToModify = optionAsset;
            this.hasSubzeroExperiment = z;
        }

        public /* synthetic */ Args(UiAcatsAsset.OptionAsset optionAsset, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : optionAsset, (i & 2) != 0 ? false : z);
        }

        public final UiAcatsAsset.OptionAsset getAssetToModify() {
            return this.assetToModify;
        }

        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }

        public final boolean isInEditMode() {
            return this.assetToModify != null;
        }
    }

    /* compiled from: AcatsInPartialOptionAssetParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetParentFragment;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetParentFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsInPartialOptionAssetParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsInPartialOptionAssetParentFragment acatsInPartialOptionAssetParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPartialOptionAssetParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPartialOptionAssetParentFragment newInstance(Args args) {
            return (AcatsInPartialOptionAssetParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPartialOptionAssetParentFragment acatsInPartialOptionAssetParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPartialOptionAssetParentFragment, args);
        }
    }
}
