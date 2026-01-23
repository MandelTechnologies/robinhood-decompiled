package com.robinhood.android.equitydetail.p123ui.etp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentEtpItemBottomSheetBinding;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
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

/* compiled from: EtpCompositionItemBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0004\u001f !\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentEtpItemBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentEtpItemBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindInstrumentNavigationData", "holding", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;)Lkotlin/Unit;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Callbacks", "DismissCallback", "Args", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EtpCompositionItemBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EtpCompositionItemBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentEtpItemBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EtpCompositionItemBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$DismissCallback;", "onEtpCompositionInstrumentSelected", "", "instrumentId", "Ljava/util/UUID;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends DismissCallback {
        void onEtpCompositionInstrumentSelected(UUID instrumentId);
    }

    /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$DismissCallback;", "", "onEtpCompositionBottomSheetDismissed", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DismissCallback {
        void onEtpCompositionBottomSheetDismissed();
    }

    public EtpCompositionItemBottomSheetFragment() {
        super(C15314R.layout.fragment_etp_item_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, EtpCompositionItemBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    private final FragmentEtpItemBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEtpItemBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        EtpCompositionItemHolder.Holding.UiEtpHolding holding;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentEtpItemBottomSheetBinding binding = getBinding();
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, root, 0.0f, 2, null);
        RhTextView rhTextView = binding.etpCompositionItemTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getItem().getName());
        binding.etpCompositionItemDescription.setText(((Args) companion.getArgs((Fragment) this)).getItem().getBottomSheetDescription());
        EtpCompositionItemHolder item = ((Args) companion.getArgs((Fragment) this)).getItem();
        EtpCompositionItemHolder.Holding holding2 = item instanceof EtpCompositionItemHolder.Holding ? (EtpCompositionItemHolder.Holding) item : null;
        if (holding2 == null || (holding = holding2.getHolding()) == null || bindInstrumentNavigationData(holding) == null) {
            RdsButton etpCompositionItemViewButton = binding.etpCompositionItemViewButton;
            Intrinsics.checkNotNullExpressionValue(etpCompositionItemViewButton, "etpCompositionItemViewButton");
            etpCompositionItemViewButton.setVisibility(8);
        }
        RdsButton etpCompositionItemDismissButton = getBinding().etpCompositionItemDismissButton;
        Intrinsics.checkNotNullExpressionValue(etpCompositionItemDismissButton, "etpCompositionItemDismissButton");
        OnClickListeners.onClick(etpCompositionItemDismissButton, new C154822(this));
    }

    /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment$onViewCreated$2 */
    /* synthetic */ class C154822 extends FunctionReferenceImpl implements Function0<Unit> {
        C154822(Object obj) {
            super(0, obj, EtpCompositionItemBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EtpCompositionItemBottomSheetFragment) this.receiver).dismiss();
        }
    }

    private final Unit bindInstrumentNavigationData(EtpCompositionItemHolder.Holding.UiEtpHolding holding) {
        RdsButton rdsButton = getBinding().etpCompositionItemViewButton;
        final UUID instrumentId = holding.getInstrumentId();
        if (instrumentId == null) {
            return null;
        }
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(0);
        String symbol = holding.getSymbol();
        if (symbol == null) {
            symbol = holding.getName();
        }
        rdsButton.setText(rdsButton.getResources().getString(C15314R.string.etp_composition_item_bottom_sheet_view_button_text, symbol));
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EtpCompositionItemBottomSheetFragment.bindInstrumentNavigationData$lambda$4$lambda$3(this.f$0, instrumentId);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInstrumentNavigationData$lambda$4$lambda$3(EtpCompositionItemBottomSheetFragment etpCompositionItemBottomSheetFragment, UUID uuid) {
        etpCompositionItemBottomSheetFragment.getCallbacks().onEtpCompositionInstrumentSelected(uuid);
        etpCompositionItemBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getCallbacks().onEtpCompositionBottomSheetDismissed();
    }

    /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Args;", "Landroid/os/Parcelable;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;)V", "getItem", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final EtpCompositionItemHolder item;

        /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((EtpCompositionItemHolder) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, EtpCompositionItemHolder etpCompositionItemHolder, int i, Object obj) {
            if ((i & 1) != 0) {
                etpCompositionItemHolder = args.item;
            }
            return args.copy(etpCompositionItemHolder);
        }

        /* renamed from: component1, reason: from getter */
        public final EtpCompositionItemHolder getItem() {
            return this.item;
        }

        public final Args copy(EtpCompositionItemHolder item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Args(item);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.item, ((Args) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Args(item=" + this.item + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.item, flags);
        }

        public Args(EtpCompositionItemHolder item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public final EtpCompositionItemHolder getItem() {
            return this.item;
        }
    }

    /* compiled from: EtpCompositionItemBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Args;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<EtpCompositionItemBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EtpCompositionItemBottomSheetFragment etpCompositionItemBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, etpCompositionItemBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> EtpCompositionItemBottomSheetFragment newInstance(Args args, C c, int i) {
            return (EtpCompositionItemBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
