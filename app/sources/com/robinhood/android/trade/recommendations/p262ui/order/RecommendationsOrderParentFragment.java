package com.robinhood.android.trade.recommendations.p262ui.order;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderConfirmationFragment;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderFragment;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u000289B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u0014H\u0016J\b\u00107\u001a\u000200H\u0016R\u001e\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R+\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00140'j\b\u0012\u0004\u0012\u00020\u0014`(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Callbacks;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Callbacks;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "skipForceSuitability", "", "getSkipForceSuitability", "()Z", "transferIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTransferIds", "()Ljava/util/ArrayList;", "transferIds$delegate", "Lkotlin/properties/ReadWriteProperty;", "createOrderConfirmationFragment", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onTransferSubmitted", "transferId", "onCompleteOrderConfirmation", "Args", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecommendationsOrderParentFragment extends BaseOrderParentFragment<RecommendationsOrderSubmissionManager> implements RecommendationsOrderFragment.Callbacks, RecommendationsOrderConfirmationFragment.Callbacks {
    public AccountProvider accountProvider;
    public RecommendationsOrderSubmissionManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsOrderParentFragment.class, "transferIds", "getTransferIds()Ljava/util/ArrayList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final CarSuitabilityType.Unsupported carSuitabilityType = CarSuitabilityType.Unsupported.INSTANCE;
    private final String analyticsErrorString = AnalyticsStrings.ERROR_PLACE_ORDER;
    private final OrderSide side = OrderSide.BUY;
    private final boolean skipForceSuitability = true;

    /* renamed from: transferIds$delegate, reason: from kotlin metadata */
    private final Interfaces3 transferIds = BindSavedState2.savedStringArrayList(this, new ArrayList()).provideDelegate(this, $$delegatedProperties[0]);

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public RecommendationsOrderSubmissionManager getOrderManager() {
        RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager = this.orderManager;
        if (recommendationsOrderSubmissionManager != null) {
            return recommendationsOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(recommendationsOrderSubmissionManager, "<set-?>");
        this.orderManager = recommendationsOrderSubmissionManager;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust;
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        return (accountNumber == null || (observableJust = Observable.just(accountNumber)) == null) ? getAccountProvider().streamIndividualAccountNumber() : observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType.Unsupported getCarSuitabilityType() {
        return this.carSuitabilityType;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return this.side;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    private final ArrayList<String> getTransferIds() {
        return (ArrayList) this.transferIds.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public RecommendationsOrderConfirmationFragment createOrderConfirmationFragment() {
        RecommendationsOrderConfirmationFragment.Companion companion = RecommendationsOrderConfirmationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return (RecommendationsOrderConfirmationFragment) companion.newInstance((Parcelable) new RecommendationsOrderConfirmationFragment.Args(((Args) companion2.getArgs((Fragment) this)).getSource(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber(), getTransferIds()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RecommendationsOrderFragment.Companion companion = RecommendationsOrderFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RecommendationsOrderFragment.Args(((Args) companion2.getArgs((Fragment) this)).getSource(), getOrderUuid(), ((Args) companion2.getArgs((Fragment) this)).getRecommendationId(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber())));
        }
    }

    @Override // com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment.Callbacks
    public void onTransferSubmitted(String transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        getTransferIds().add(transferId);
    }

    @Override // com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment.Callbacks
    public void onCompleteOrderConfirmation() {
        finish();
    }

    /* compiled from: RecommendationsOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderParentFragment$Args;", "Landroid/os/Parcelable;", "source", "", "recommendationId", "Ljava/util/UUID;", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getRecommendationId", "()Ljava/util/UUID;", "getAccountNumber", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID recommendationId;
        private final String source;

        /* compiled from: RecommendationsOrderParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeSerializable(this.recommendationId);
            dest.writeString(this.accountNumber);
        }

        public Args(String source, UUID recommendationId, String str) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.source = source;
            this.recommendationId = recommendationId;
            this.accountNumber = str;
        }

        public final String getSource() {
            return this.source;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecommendationsOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderParentFragment;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderParentFragment$Args;", "<init>", "()V", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsOrderParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsOrderParentFragment recommendationsOrderParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsOrderParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsOrderParentFragment newInstance(Args args) {
            return (RecommendationsOrderParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsOrderParentFragment recommendationsOrderParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsOrderParentFragment, args);
        }
    }
}
