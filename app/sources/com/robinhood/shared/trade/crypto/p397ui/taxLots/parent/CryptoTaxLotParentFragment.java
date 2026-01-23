package com.robinhood.shared.trade.crypto.p397ui.taxLots.parent;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.tabs.TabManager;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm.CryptoTaxLotOrderFormFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.parent.CryptoTaxLotParentFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionFragment;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotParentFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003*+,B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\t\u0010$\u001a\u00020\bH\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showOrderTypeSelector", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "showLotSelectionScreen", "strategy", "Lnummus/v1/TaxLotStrategyTypeDto;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "onLotSelectionFinished", "cancelTradeFlow", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotParentFragment extends BaseFragment implements RegionGated, CryptoTaxLotOrderInputFragment.Callbacks, CryptoTaxLotSelectionFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean hasBottomBar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTaxLotParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTaxLotParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Callbacks;", "", "showOrderTypeSelector", "", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "", "cancelTradeFlow", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void cancelTradeFlow();

        void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoTaxLotParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.hasBottomBar = true;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.parent.CryptoTaxLotParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CryptoTaxLotParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        TabManager tabManager = componentRequireActivity instanceof TabManager ? (TabManager) componentRequireActivity : null;
        if (tabManager != null) {
            tabManager.reThemeToolbar();
        }
        if (getChildFragmentManager().findFragmentById(C11048R.id.fragment_container) == null) {
            int i = C11048R.id.fragment_container;
            CryptoTaxLotOrderInputFragment.Companion companion = CryptoTaxLotOrderInputFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new CryptoTaxLotOrderInputFragment.Args(((Args) companion2.getArgs((Fragment) this)).getCurrencyPairId(), ((Args) companion2.getArgs((Fragment) this)).getOrderUuid())));
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputFragment.Callbacks
    public void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        getCallbacks().showOrderTypeSelector(orderType, isRecurringOrder);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputFragment.Callbacks
    public void showLotSelectionScreen(TaxLotStrategyTypeDto strategy, RequestInputs.AsAsset requestInputs) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        CryptoTaxLotSelectionFragment.Companion companion = CryptoTaxLotSelectionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new CryptoTaxLotSelectionFragment.Args(((Args) companion2.getArgs((Fragment) this)).getOrderUuid(), ((Args) companion2.getArgs((Fragment) this)).getCurrencyPairId(), strategy, requestInputs)));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.Callbacks
    public void onLotSelectionFinished(RequestInputs.AsAsset requestInputs) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        CryptoTaxLotOrderFormFragment.Companion companion = CryptoTaxLotOrderFormFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new CryptoTaxLotOrderFormFragment.Args(((Args) companion2.getArgs((Fragment) this)).getOrderUuid(), ((Args) companion2.getArgs((Fragment) this)).getCurrencyPairId(), requestInputs)));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.Callbacks
    public void cancelTradeFlow() {
        getCallbacks().cancelTradeFlow();
    }

    /* compiled from: CryptoTaxLotParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderUuid", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderUuid", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final UUID orderUuid;

        /* compiled from: CryptoTaxLotParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                uuid2 = args.orderUuid;
            }
            return args.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final Args copy(UUID currencyPairId, UUID orderUuid) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            return new Args(currencyPairId, orderUuid);
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
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && Intrinsics.areEqual(this.orderUuid, args.orderUuid);
        }

        public int hashCode() {
            return (this.currencyPairId.hashCode() * 31) + this.orderUuid.hashCode();
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", orderUuid=" + this.orderUuid + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeSerializable(this.orderUuid);
        }

        public Args(UUID currencyPairId, UUID orderUuid) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            this.currencyPairId = currencyPairId;
            this.orderUuid = orderUuid;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }
    }

    /* compiled from: CryptoTaxLotParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTaxLotParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTaxLotParentFragment cryptoTaxLotParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTaxLotParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTaxLotParentFragment newInstance(Args args) {
            return (CryptoTaxLotParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTaxLotParentFragment cryptoTaxLotParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTaxLotParentFragment, args);
        }
    }
}
