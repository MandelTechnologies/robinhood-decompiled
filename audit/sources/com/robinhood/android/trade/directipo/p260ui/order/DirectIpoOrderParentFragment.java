package com.robinhood.android.trade.directipo.p260ui.order;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderConfirmationFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderLoadingFragment;
import com.robinhood.android.trade.directipo.p260ui.splash.DirectIpoOrderSplashFragment;
import com.robinhood.android.trade.directipo.pref.ShowDirectIpoOrderSplashPref;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u000223B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u000201H\u0002R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderLoadingFragment$Callbacks;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Callbacks;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Callbacks;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment$Callbacks;", "<init>", "()V", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "getShowDirectIpoOrderSplashPref$annotations", "getShowDirectIpoOrderSplashPref", "()Lcom/robinhood/prefs/StringToBooleanMapPreference;", "setShowDirectIpoOrderSplashPref", "(Lcom/robinhood/prefs/StringToBooleanMapPreference;)V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;)V", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onShowSplash", "onShowOrderFlow", "createOrderConfirmationFragment", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment;", "onOrderCompleted", "onLoadDirectIpoOrderConfigurationFailed", "onExitDirectIpoOrderSplash", "getDirectIpoOrderFragment", "Landroidx/fragment/app/Fragment;", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoOrderParentFragment extends BaseOrderParentFragment<DirectIpoOrderSubmissionManager> implements DirectIpoOrderLoadingFragment.Callbacks, DirectIpoOrderFragment.Callbacks, DirectIpoOrderConfirmationFragment.Callbacks, DirectIpoOrderSplashFragment.Callbacks {
    public DirectIpoOrderSubmissionManager orderManager;
    public StringToBooleanMapPreference showDirectIpoOrderSplashPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final String analyticsErrorString = AnalyticsStrings.ERROR_PLACE_ORDER;
    private final OrderSide side = OrderSide.BUY;

    /* compiled from: DirectIpoOrderParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ShowDirectIpoOrderSplashPref
    public static /* synthetic */ void getShowDirectIpoOrderSplashPref$annotations() {
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

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public DirectIpoOrderSubmissionManager getOrderManager() {
        DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager = this.orderManager;
        if (directIpoOrderSubmissionManager != null) {
            return directIpoOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(directIpoOrderSubmissionManager, "<set-?>");
        this.orderManager = directIpoOrderSubmissionManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust = Observable.just(((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType getCarSuitabilityType() {
        List listListOf = CollectionsKt.listOf(((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId());
        int i = WhenMappings.$EnumSwitchMapping$0[getSide().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return new CarSuitabilityType.Equity(listListOf, z);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return this.side;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Fragment directIpoOrderFragment;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Map<String, Boolean> values = getShowDirectIpoOrderSplashPref().getValues();
            Companion companion = INSTANCE;
            String string2 = ((Args) companion.getArgs((Fragment) this)).getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (values.getOrDefault(string2, Boolean.TRUE).booleanValue()) {
                directIpoOrderFragment = DirectIpoOrderLoadingFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderLoadingFragment.Args(((Args) companion.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion.getArgs((Fragment) this)).getInstrumentId()));
            } else {
                directIpoOrderFragment = getDirectIpoOrderFragment();
            }
            setFragment(C11048R.id.fragment_container, directIpoOrderFragment);
        }
    }

    @Override // com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment.Callbacks
    public void onShowSplash() {
        replaceFragmentWithoutAnimationAndBackStack(DirectIpoOrderSplashFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderSplashFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId())));
    }

    @Override // com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderLoadingFragment.Callbacks
    public void onShowOrderFlow() {
        onExitDirectIpoOrderSplash();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public DirectIpoOrderConfirmationFragment createOrderConfirmationFragment() {
        return (DirectIpoOrderConfirmationFragment) DirectIpoOrderConfirmationFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderConfirmationFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId()));
    }

    @Override // com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationFragment.Callbacks
    public void onOrderCompleted() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.Callbacks
    public void onLoadDirectIpoOrderConfigurationFailed() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment.Callbacks
    public void onExitDirectIpoOrderSplash() {
        replaceFragmentWithoutBackStack(getDirectIpoOrderFragment());
    }

    private final Fragment getDirectIpoOrderFragment() {
        DirectIpoOrderFragment.Companion companion = DirectIpoOrderFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return companion.newInstance((Parcelable) new DirectIpoOrderFragment.Args(((Args) companion2.getArgs((Fragment) this)).getInstrumentId(), ((Args) companion2.getArgs((Fragment) this)).getSource(), getOrderUuid(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber()));
    }

    /* compiled from: DirectIpoOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/directipo/models/DirectIpoOrderSource;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentId;
        private final DirectIpoOrderSource source;

        /* compiled from: DirectIpoOrderParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : DirectIpoOrderSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, DirectIpoOrderSource directIpoOrderSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 4) != 0) {
                directIpoOrderSource = args.source;
            }
            return args.copy(str, uuid, directIpoOrderSource);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        public final Args copy(String accountNumber, UUID instrumentId, DirectIpoOrderSource source) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(accountNumber, instrumentId, source);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.source == args.source;
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31;
            DirectIpoOrderSource directIpoOrderSource = this.source;
            return iHashCode + (directIpoOrderSource == null ? 0 : directIpoOrderSource.hashCode());
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.instrumentId);
            DirectIpoOrderSource directIpoOrderSource = this.source;
            if (directIpoOrderSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(directIpoOrderSource.name());
            }
        }

        public Args(String accountNumber, UUID instrumentId, DirectIpoOrderSource directIpoOrderSource) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.source = directIpoOrderSource;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final DirectIpoOrderSource getSource() {
            return this.source;
        }
    }

    /* compiled from: DirectIpoOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment$Args;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderParentFragment directIpoOrderParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderParentFragment newInstance(Args args) {
            return (DirectIpoOrderParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderParentFragment directIpoOrderParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderParentFragment, args);
        }
    }
}
