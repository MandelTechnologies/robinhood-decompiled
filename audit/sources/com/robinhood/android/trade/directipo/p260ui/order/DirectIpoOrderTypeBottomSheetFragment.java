package com.robinhood.android.trade.directipo.p260ui.order;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.DialogDirectIpoPriceTypeBottomsheetBinding;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003#$%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoPriceTypeBottomsheetBinding;", "getBinding", "()Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoPriceTypeBottomsheetBinding;", "binding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCheckedChanged", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "checkedId", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderTypeBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated, LegacyRdsRadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderTypeBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderTypeBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoPriceTypeBottomsheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Callbacks;", "", "onPriceTypeSelected", "", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPriceTypeSelected(ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType);
    }

    /* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.values().length];
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.NAMED_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOrderTypeBottomSheetFragment() {
        super(C29323R.layout.dialog_direct_ipo_price_type_bottomsheet);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderTypeBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, DirectIpoOrderTypeBottomSheetFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final DialogDirectIpoPriceTypeBottomsheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DialogDirectIpoPriceTypeBottomsheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().directIpoPriceTypeTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getPriceTypeOptions().getTitle());
        RhTextView directIpoPriceTypeTitle = getBinding().directIpoPriceTypeTitle;
        Intrinsics.checkNotNullExpressionValue(directIpoPriceTypeTitle, "directIpoPriceTypeTitle");
        TextViewsKt.setDrawables$default((TextView) directIpoPriceTypeTitle, 0, 0, ((Args) companion.getArgs((Fragment) this)).getPriceTypeOptions().getInfo_icon().getResourceId(), 0, true, 11, (Object) null);
        RhTextView directIpoPriceTypeTitle2 = getBinding().directIpoPriceTypeTitle;
        Intrinsics.checkNotNullExpressionValue(directIpoPriceTypeTitle2, "directIpoPriceTypeTitle");
        OnClickListeners.onClick(directIpoPriceTypeTitle2, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderTypeBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderTypeBottomSheetFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        List<ApiDirectIpoOrderConfiguration.LimitOptionViewModel> limit_options = ((Args) companion.getArgs((Fragment) this)).getPriceTypeOptions().getLimit_options();
        ArrayList<ApiDirectIpoOrderConfiguration.LimitOptionViewModel> arrayList = new ArrayList();
        for (Object obj : limit_options) {
            int i = WhenMappings.$EnumSwitchMapping$0[((ApiDirectIpoOrderConfiguration.LimitOptionViewModel) obj).getIpoa_limit_type().ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(obj);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        for (ApiDirectIpoOrderConfiguration.LimitOptionViewModel limitOptionViewModel : arrayList) {
            LegacyRdsRadioButton.Companion companion2 = LegacyRdsRadioButton.INSTANCE;
            LegacyRdsRadioGroup directIpoPriceTypeRadioGroup = getBinding().directIpoPriceTypeRadioGroup;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceTypeRadioGroup, "directIpoPriceTypeRadioGroup");
            LegacyRdsRadioButton legacyRdsRadioButtonInflate = companion2.inflate((ViewGroup) directIpoPriceTypeRadioGroup);
            legacyRdsRadioButtonInflate.setId(View.generateViewId());
            legacyRdsRadioButtonInflate.setPrimaryText(limitOptionViewModel.getTitle());
            legacyRdsRadioButtonInflate.setSecondaryText(limitOptionViewModel.getSubtitle());
            legacyRdsRadioButtonInflate.setTag(C29323R.id.tag_direct_ipo_price_type, limitOptionViewModel.getIpoa_limit_type());
            legacyRdsRadioButtonInflate.setChecked(limitOptionViewModel.getIpoa_limit_type() == ((Args) INSTANCE.getArgs((Fragment) this)).getSelectedPriceType());
            getBinding().directIpoPriceTypeRadioGroup.addView(legacyRdsRadioButtonInflate);
        }
        getBinding().directIpoPriceTypeRadioGroup.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DirectIpoOrderTypeBottomSheetFragment directIpoOrderTypeBottomSheetFragment) {
        GenericAction dbModel = ((Args) INSTANCE.getArgs((Fragment) directIpoOrderTypeBottomSheetFragment)).getPriceTypeOptions().getInfo_action().toDbModel();
        if (dbModel instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = directIpoOrderTypeBottomSheetFragment.getNavigator();
            Context contextRequireContext = directIpoOrderTypeBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) dbModel).getUri(), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
        Intrinsics.checkNotNullParameter(group, "group");
        Object tag = group.findViewById(checkedId).getTag(C29323R.id.tag_direct_ipo_price_type);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration.IpoAccessPriceType");
        getCallbacks().onPriceTypeSelected((ApiDirectIpoOrderConfiguration.IpoAccessPriceType) tag);
        dismiss();
    }

    /* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "selectedPriceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "priceTypeOptions", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;)V", "getSelectedPriceType", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "getPriceTypeOptions", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$LimitOptionsViewModel;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions;
        private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType;

        /* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ApiDirectIpoOrderConfiguration.IpoAccessPriceType.valueOf(parcel.readString()), (ApiDirectIpoOrderConfiguration.LimitOptionsViewModel) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel limitOptionsViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                ipoAccessPriceType = args.selectedPriceType;
            }
            if ((i & 2) != 0) {
                limitOptionsViewModel = args.priceTypeOptions;
            }
            return args.copy(ipoAccessPriceType, limitOptionsViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getSelectedPriceType() {
            return this.selectedPriceType;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel getPriceTypeOptions() {
            return this.priceTypeOptions;
        }

        public final Args copy(ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions) {
            Intrinsics.checkNotNullParameter(selectedPriceType, "selectedPriceType");
            Intrinsics.checkNotNullParameter(priceTypeOptions, "priceTypeOptions");
            return new Args(selectedPriceType, priceTypeOptions);
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
            return this.selectedPriceType == args.selectedPriceType && Intrinsics.areEqual(this.priceTypeOptions, args.priceTypeOptions);
        }

        public int hashCode() {
            return (this.selectedPriceType.hashCode() * 31) + this.priceTypeOptions.hashCode();
        }

        public String toString() {
            return "Args(selectedPriceType=" + this.selectedPriceType + ", priceTypeOptions=" + this.priceTypeOptions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.selectedPriceType.name());
            dest.writeParcelable(this.priceTypeOptions, flags);
        }

        public Args(ApiDirectIpoOrderConfiguration.IpoAccessPriceType selectedPriceType, ApiDirectIpoOrderConfiguration.LimitOptionsViewModel priceTypeOptions) {
            Intrinsics.checkNotNullParameter(selectedPriceType, "selectedPriceType");
            Intrinsics.checkNotNullParameter(priceTypeOptions, "priceTypeOptions");
            this.selectedPriceType = selectedPriceType;
            this.priceTypeOptions = priceTypeOptions;
        }

        public final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getSelectedPriceType() {
            return this.selectedPriceType;
        }

        public final ApiDirectIpoOrderConfiguration.LimitOptionsViewModel getPriceTypeOptions() {
            return this.priceTypeOptions;
        }
    }

    /* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Args;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderTypeBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderTypeBottomSheetFragment directIpoOrderTypeBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderTypeBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderTypeBottomSheetFragment newInstance(Args args) {
            return (DirectIpoOrderTypeBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderTypeBottomSheetFragment directIpoOrderTypeBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderTypeBottomSheetFragment, args);
        }
    }
}
