package com.robinhood.android.trade.directipo.p260ui.order;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.pref.ShowDirectIpoOrderSplashPref;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Single;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOrderLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003#$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0019H\u0016J\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "getShowDirectIpoOrderSplashPref$annotations", "getShowDirectIpoOrderSplashPref", "()Lcom/robinhood/prefs/StringToBooleanMapPreference;", "setShowDirectIpoOrderSplashPref", "(Lcom/robinhood/prefs/StringToBooleanMapPreference;)V", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderLoadingFragment extends GenericComposeFragment implements RegionGated {
    private static final long TIMEOUT_SECONDS = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    public OrderStore orderStore;
    public StringToBooleanMapPreference showDirectIpoOrderSplashPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Callbacks;", "", "onShowSplash", "", "onShowOrderFlow", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onShowOrderFlow();

        void onShowSplash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DirectIpoOrderLoadingFragment directIpoOrderLoadingFragment, int i, Composer composer, int i2) {
        directIpoOrderLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2002395802);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002395802, i, -1, "com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment.ComposeContent (DirectIpoOrderLoadingFragment.kt:43)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composerStartRestartGroup, 384, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectIpoOrderLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getOrderStore().refresh(false);
        OrderStore orderStore = getOrderStore();
        Companion companion = INSTANCE;
        Single<Boolean> singleOnErrorReturnItem = orderStore.hasOrderByInstrument(((Args) companion.getArgs((Fragment) this)).getInstrumentId(), ((Args) companion.getArgs((Fragment) this)).getAccountNumber()).firstOrError().timeout(1L, TimeUnit.SECONDS).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderLoadingFragment.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectIpoOrderLoadingFragment directIpoOrderLoadingFragment, Boolean bool) {
        if (bool.booleanValue()) {
            StringToBooleanMapPreference showDirectIpoOrderSplashPref = directIpoOrderLoadingFragment.getShowDirectIpoOrderSplashPref();
            showDirectIpoOrderSplashPref.setValues(MapsKt.plus(showDirectIpoOrderSplashPref.getValues(), Tuples4.m3642to(((Args) INSTANCE.getArgs((Fragment) directIpoOrderLoadingFragment)).getInstrumentId().toString(), Boolean.FALSE)));
            directIpoOrderLoadingFragment.getCallbacks().onShowOrderFlow();
        } else {
            directIpoOrderLoadingFragment.getCallbacks().onShowSplash();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOrderLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentId;

        /* compiled from: DirectIpoOrderLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = args.instrumentId;
            }
            return args.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Args copy(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(accountNumber, instrumentId);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.instrumentId, args.instrumentId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.instrumentId);
        }

        public Args(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: DirectIpoOrderLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Args;", "<init>", "()V", "TIMEOUT_SECONDS", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderLoadingFragment directIpoOrderLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderLoadingFragment newInstance(Args args) {
            return (DirectIpoOrderLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderLoadingFragment directIpoOrderLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderLoadingFragment, args);
        }
    }
}
