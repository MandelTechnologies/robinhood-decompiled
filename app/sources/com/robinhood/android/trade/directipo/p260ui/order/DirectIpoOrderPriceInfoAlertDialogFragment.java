package com.robinhood.android.trade.directipo.p260ui.order;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.DialogDirectIpoOrderPriceInfoAlertBinding;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: DirectIpoOrderPriceInfoAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u001cH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderPriceInfoAlertDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "bindings", "Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoOrderPriceInfoAlertBinding;", "getBindings", "()Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoOrderPriceInfoAlertBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlertRow;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderPriceInfoAlertDialogFragment extends BaseDialogFragment implements RegionGated {
    private static final String KEY_NAMED_PRICE = "{named_price}";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsRowView, ApiDirectIpoOrderConfiguration.PriceInfoAlertRow> adapter;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderPriceInfoAlertDialogFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoOrderPriceInfoAlertBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOrderPriceInfoAlertDialogFragment() {
        super(C29323R.layout.dialog_direct_ipo_order_price_info_alert);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, DirectIpoOrderPriceInfoAlertDialogFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderPriceInfoAlertDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoOrderPriceInfoAlertDialogFragment.adapter$lambda$0(this.f$0, (RdsRowView) obj, (ApiDirectIpoOrderConfiguration.PriceInfoAlertRow) obj2);
            }
        });
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

    private final DialogDirectIpoOrderPriceInfoAlertBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DialogDirectIpoOrderPriceInfoAlertBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(DirectIpoOrderPriceInfoAlertDialogFragment directIpoOrderPriceInfoAlertDialogFragment, RdsRowView of, ApiDirectIpoOrderConfiguration.PriceInfoAlertRow item) throws Resources.NotFoundException {
        String value;
        String string2;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setPrimaryText(item.getLabel());
        of.setSecondaryText(item.getSublabel());
        if (StringsKt.contains$default((CharSequence) item.getValue(), (CharSequence) KEY_NAMED_PRICE, false, 2, (Object) null)) {
            Money customPrice = ((Args) INSTANCE.getArgs((Fragment) directIpoOrderPriceInfoAlertDialogFragment)).getCustomPrice();
            if (customPrice.isZero()) {
                string2 = of.getResources().getString(C29323R.string.direct_ipo_order_empty_total_cost, customPrice.getCurrency().getSymbol());
            } else {
                string2 = Money.format$default(customPrice, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            String str = string2;
            Intrinsics.checkNotNull(str);
            value = StringsKt.replace$default(item.getValue(), KEY_NAMED_PRICE, str, false, 4, (Object) null);
        } else {
            value = item.getValue();
        }
        of.setMetadataPrimaryText(value);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        GenericListAdapter<RdsRowView, ApiDirectIpoOrderConfiguration.PriceInfoAlertRow> genericListAdapter = this.adapter;
        Companion companion = INSTANCE;
        genericListAdapter.submitList(((Args) companion.getArgs((Fragment) this)).getPriceInfoAlert().getRows());
        DialogDirectIpoOrderPriceInfoAlertBinding bindings = getBindings();
        bindings.priceInfoAlertTitle.setText(((Args) companion.getArgs((Fragment) this)).getPriceInfoAlert().getTitle());
        bindings.priceInfoAlertDescription.setText(getMarkwon().toMarkdown(((Args) companion.getArgs((Fragment) this)).getPriceInfoAlert().getDescription_markdown()));
        bindings.priceInfoAlertRecyclerView.setAdapter(this.adapter);
        RdsButton priceInfoAlertDismiss = bindings.priceInfoAlertDismiss;
        Intrinsics.checkNotNullExpressionValue(priceInfoAlertDismiss, "priceInfoAlertDismiss");
        OnClickListeners.onClick(priceInfoAlertDismiss, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderPriceInfoAlertDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderPriceInfoAlertDialogFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(DirectIpoOrderPriceInfoAlertDialogFragment directIpoOrderPriceInfoAlertDialogFragment) {
        directIpoOrderPriceInfoAlertDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOrderPriceInfoAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderPriceInfoAlertDialogFragment$Args;", "Landroid/os/Parcelable;", "customPrice", "Lcom/robinhood/models/util/Money;", "priceInfoAlert", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;)V", "getCustomPrice", "()Lcom/robinhood/models/util/Money;", "getPriceInfoAlert", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$PriceInfoAlert;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Money customPrice;
        private final ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert;

        /* compiled from: DirectIpoOrderPriceInfoAlertDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Money) parcel.readParcelable(Args.class.getClassLoader()), (ApiDirectIpoOrderConfiguration.PriceInfoAlert) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Money money, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                money = args.customPrice;
            }
            if ((i & 2) != 0) {
                priceInfoAlert = args.priceInfoAlert;
            }
            return args.copy(money, priceInfoAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getCustomPrice() {
            return this.customPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDirectIpoOrderConfiguration.PriceInfoAlert getPriceInfoAlert() {
            return this.priceInfoAlert;
        }

        public final Args copy(Money customPrice, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert) {
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(priceInfoAlert, "priceInfoAlert");
            return new Args(customPrice, priceInfoAlert);
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
            return Intrinsics.areEqual(this.customPrice, args.customPrice) && Intrinsics.areEqual(this.priceInfoAlert, args.priceInfoAlert);
        }

        public int hashCode() {
            return (this.customPrice.hashCode() * 31) + this.priceInfoAlert.hashCode();
        }

        public String toString() {
            return "Args(customPrice=" + this.customPrice + ", priceInfoAlert=" + this.priceInfoAlert + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.customPrice, flags);
            dest.writeParcelable(this.priceInfoAlert, flags);
        }

        public Args(Money customPrice, ApiDirectIpoOrderConfiguration.PriceInfoAlert priceInfoAlert) {
            Intrinsics.checkNotNullParameter(customPrice, "customPrice");
            Intrinsics.checkNotNullParameter(priceInfoAlert, "priceInfoAlert");
            this.customPrice = customPrice;
            this.priceInfoAlert = priceInfoAlert;
        }

        public final Money getCustomPrice() {
            return this.customPrice;
        }

        public final ApiDirectIpoOrderConfiguration.PriceInfoAlert getPriceInfoAlert() {
            return this.priceInfoAlert;
        }
    }

    /* compiled from: DirectIpoOrderPriceInfoAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderPriceInfoAlertDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderPriceInfoAlertDialogFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderPriceInfoAlertDialogFragment$Args;", "<init>", "()V", "KEY_NAMED_PRICE", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderPriceInfoAlertDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderPriceInfoAlertDialogFragment directIpoOrderPriceInfoAlertDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderPriceInfoAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderPriceInfoAlertDialogFragment newInstance(Args args) {
            return (DirectIpoOrderPriceInfoAlertDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderPriceInfoAlertDialogFragment directIpoOrderPriceInfoAlertDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderPriceInfoAlertDialogFragment, args);
        }
    }
}
