package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.configuration.OrderConfigurationUpsellOption;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Singles;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OrderConfigurationContextFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00011B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\b\b\u0000\u0010\u0019*\u00020\u001a*\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0096\u0001J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\b\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0096\u0001J?\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#¢\u0006\u0002\b'H\u0096\u0001¢\u0006\u0002\u0010(JS\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00190*\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2)\u0010\"\u001a%\b\u0001\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00190%\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#¢\u0006\u0002\b'H\u0096\u0001¢\u0006\u0002\u0010+JW\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\b\b\u0000\u0010\u0019*\u00020\u001a2\u0006\u0010 \u001a\u00020!2/\b\u0001\u0010\"\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190-\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#¢\u0006\u0002\b'H\u0096\u0001¢\u0006\u0002\u0010.JO\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000e\"\b\b\u0000\u0010\u0019*\u00020\u001a2\u0006\u0010 \u001a\u00020!2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190%\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#¢\u0006\u0002\b'H\u0096\u0001¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "Lcom/robinhood/coroutines/rx/RxFactory;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "rxFactory", "<init>", "(Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lio/reactivex/Single;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "refId", "asObservable", "Lio/reactivex/Observable;", "T", "", "Lkotlinx/coroutines/flow/Flow;", "convertToObservable", "flow", "rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "rxSingle", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "OrderConfigurationContext", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationContextFactory implements RxFactory {
    public static final int $stable = 8;
    private final /* synthetic */ RxFactory $$delegate_0;
    private final AccountAccessStore accountAccessStore;
    private final TraderRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final OptionUpgradePromotionStore optionUpgradePromotionStore;
    private final PositionStore positionStore;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return this.$$delegate_0.asObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return this.$$delegate_0.convertToObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxCompletable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxMaybe(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxObservable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxSingle(context, block);
    }

    public OrderConfigurationContextFactory(PositionStore positionStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, AccountAccessStore accountAccessStore, OptionUpgradePromotionStore optionUpgradePromotionStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.$$delegate_0 = rxFactory;
        this.positionStore = positionStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.accountAccessStore = accountAccessStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
    }

    /* compiled from: OrderConfigurationContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J[\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "isShortPosition", "", "upsellOption", "Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "isRecurringTradable", "recurringTradabilityReason", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "refId", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;ZLcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getUpsellOption", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "getRecurringTradabilityReason", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "getRefId", "isBuyToClose", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderConfigurationContext implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<OrderConfigurationContext> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentId;
        private final boolean isRecurringTradable;
        private final boolean isShortPosition;
        private final InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason;
        private final UUID refId;
        private final EquityOrderSide side;
        private final OrderConfigurationUpsellOption upsellOption;

        /* compiled from: OrderConfigurationContextFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderConfigurationContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderConfigurationContext createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                EquityOrderSide equityOrderSideValueOf = EquityOrderSide.valueOf(parcel.readString());
                String string2 = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                OrderConfigurationUpsellOption orderConfigurationUpsellOptionValueOf = OrderConfigurationUpsellOption.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new OrderConfigurationContext(uuid, equityOrderSideValueOf, string2, z2, orderConfigurationUpsellOptionValueOf, z, (InstrumentRecurringTradability.RecurringTradableReason) parcel.readParcelable(OrderConfigurationContext.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderConfigurationContext[] newArray(int i) {
                return new OrderConfigurationContext[i];
            }
        }

        public static /* synthetic */ OrderConfigurationContext copy$default(OrderConfigurationContext orderConfigurationContext, UUID uuid, EquityOrderSide equityOrderSide, String str, boolean z, OrderConfigurationUpsellOption orderConfigurationUpsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = orderConfigurationContext.instrumentId;
            }
            if ((i & 2) != 0) {
                equityOrderSide = orderConfigurationContext.side;
            }
            if ((i & 4) != 0) {
                str = orderConfigurationContext.accountNumber;
            }
            if ((i & 8) != 0) {
                z = orderConfigurationContext.isShortPosition;
            }
            if ((i & 16) != 0) {
                orderConfigurationUpsellOption = orderConfigurationContext.upsellOption;
            }
            if ((i & 32) != 0) {
                z2 = orderConfigurationContext.isRecurringTradable;
            }
            if ((i & 64) != 0) {
                recurringTradableReason = orderConfigurationContext.recurringTradabilityReason;
            }
            if ((i & 128) != 0) {
                uuid2 = orderConfigurationContext.refId;
            }
            InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason2 = recurringTradableReason;
            UUID uuid3 = uuid2;
            OrderConfigurationUpsellOption orderConfigurationUpsellOption2 = orderConfigurationUpsellOption;
            boolean z3 = z2;
            return orderConfigurationContext.copy(uuid, equityOrderSide, str, z, orderConfigurationUpsellOption2, z3, recurringTradableReason2, uuid3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsShortPosition() {
            return this.isShortPosition;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderConfigurationUpsellOption getUpsellOption() {
            return this.upsellOption;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsRecurringTradable() {
            return this.isRecurringTradable;
        }

        /* renamed from: component7, reason: from getter */
        public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
            return this.recurringTradabilityReason;
        }

        /* renamed from: component8, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        public final OrderConfigurationContext copy(UUID instrumentId, EquityOrderSide side, String accountNumber, boolean isShortPosition, OrderConfigurationUpsellOption upsellOption, boolean isRecurringTradable, InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason, UUID refId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(upsellOption, "upsellOption");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new OrderConfigurationContext(instrumentId, side, accountNumber, isShortPosition, upsellOption, isRecurringTradable, recurringTradabilityReason, refId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderConfigurationContext)) {
                return false;
            }
            OrderConfigurationContext orderConfigurationContext = (OrderConfigurationContext) other;
            return Intrinsics.areEqual(this.instrumentId, orderConfigurationContext.instrumentId) && this.side == orderConfigurationContext.side && Intrinsics.areEqual(this.accountNumber, orderConfigurationContext.accountNumber) && this.isShortPosition == orderConfigurationContext.isShortPosition && this.upsellOption == orderConfigurationContext.upsellOption && this.isRecurringTradable == orderConfigurationContext.isRecurringTradable && Intrinsics.areEqual(this.recurringTradabilityReason, orderConfigurationContext.recurringTradabilityReason) && Intrinsics.areEqual(this.refId, orderConfigurationContext.refId);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.instrumentId.hashCode() * 31) + this.side.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isShortPosition)) * 31) + this.upsellOption.hashCode()) * 31) + Boolean.hashCode(this.isRecurringTradable)) * 31;
            InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason = this.recurringTradabilityReason;
            return ((iHashCode + (recurringTradableReason == null ? 0 : recurringTradableReason.hashCode())) * 31) + this.refId.hashCode();
        }

        public String toString() {
            return "OrderConfigurationContext(instrumentId=" + this.instrumentId + ", side=" + this.side + ", accountNumber=" + this.accountNumber + ", isShortPosition=" + this.isShortPosition + ", upsellOption=" + this.upsellOption + ", isRecurringTradable=" + this.isRecurringTradable + ", recurringTradabilityReason=" + this.recurringTradabilityReason + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.side.name());
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isShortPosition ? 1 : 0);
            dest.writeString(this.upsellOption.name());
            dest.writeInt(this.isRecurringTradable ? 1 : 0);
            dest.writeParcelable(this.recurringTradabilityReason, flags);
            dest.writeSerializable(this.refId);
        }

        public OrderConfigurationContext(UUID instrumentId, EquityOrderSide side, String accountNumber, boolean z, OrderConfigurationUpsellOption upsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, UUID refId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(upsellOption, "upsellOption");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.instrumentId = instrumentId;
            this.side = side;
            this.accountNumber = accountNumber;
            this.isShortPosition = z;
            this.upsellOption = upsellOption;
            this.isRecurringTradable = z2;
            this.recurringTradabilityReason = recurringTradableReason;
            this.refId = refId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isShortPosition() {
            return this.isShortPosition;
        }

        public /* synthetic */ OrderConfigurationContext(UUID uuid, EquityOrderSide equityOrderSide, String str, boolean z, OrderConfigurationUpsellOption orderConfigurationUpsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, equityOrderSide, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? OrderConfigurationUpsellOption.NONE : orderConfigurationUpsellOption, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : recurringTradableReason, uuid2);
        }

        public final OrderConfigurationUpsellOption getUpsellOption() {
            return this.upsellOption;
        }

        public final boolean isRecurringTradable() {
            return this.isRecurringTradable;
        }

        public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
            return this.recurringTradabilityReason;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final boolean isBuyToClose() {
            return this.side == EquityOrderSide.BUY && this.isShortPosition;
        }
    }

    public final Single<OrderConfigurationContext> create(final UUID instrumentId, final EquityOrderSide side, final String accountNumber, final UUID refId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Single singleOnErrorResumeNext = asObservable(this.instrumentRecurringTradabilityStore.streamRecurringInstrumentTradable(instrumentId)).firstOrError().onErrorResumeNext(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationContextFactory$create$recurringTradabilitySingle$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends InstrumentRecurringTradability> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.instrumentRecurringTradabilityStore.fetchRecurringInstrumentTradable(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "onErrorResumeNext(...)");
        Single singleFirstOrError = asObservable(this.accountAccessStore.getFeatureAccess(accountNumber, AccountFeature.OPTIONS_CAN_UPGRADE)).firstOrError();
        Single singleOnErrorReturn = asObservable(OptionUpgradePromotionStore.streamShouldShowOptionsUpgradeOnSdp$default(this.optionUpgradePromotionStore, accountNumber, null, 2, null)).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationContextFactory$create$shouldShowOptionsUpsellSingle$1

            /* compiled from: OrderConfigurationContextFactory.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationContextFactory$create$shouldShowOptionsUpsellSingle$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.values().length];
                    try {
                        iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_SHOW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_NOT_SHOW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsPromo) {
                Intrinsics.checkNotNullParameter(showOptionsPromo, "showOptionsPromo");
                int i = WhenMappings.$EnumSwitchMapping$0[showOptionsPromo.ordinal()];
                boolean z = true;
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).timeout(2L, TimeUnit.SECONDS).firstOrError().onErrorReturn(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationContextFactory$create$shouldShowOptionsUpsellSingle$2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        Observable positionForAccountOptional$default = PositionStore.getPositionForAccountOptional$default(this.positionStore, instrumentId, accountNumber, false, 4, null);
        Singles singles = Singles.INSTANCE;
        Single singleFirstOrError2 = positionForAccountOptional$default.firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError2, "firstOrError(...)");
        Intrinsics.checkNotNull(singleFirstOrError);
        Single<OrderConfigurationContext> singleZip = Single.zip(singleFirstOrError2, singleOnErrorResumeNext, singleFirstOrError, singleOnErrorReturn, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationContextFactory$create$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                OrderConfigurationUpsellOption orderConfigurationUpsellOption;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Boolean bool = (Boolean) t4;
                InstrumentRecurringTradability instrumentRecurringTradability = (InstrumentRecurringTradability) t2;
                Position position = (Position) ((Optional) t1).component1();
                if (((Boolean) t3).booleanValue() && bool.booleanValue()) {
                    orderConfigurationUpsellOption = OrderConfigurationUpsellOption.OPTION_HOOK;
                } else {
                    orderConfigurationUpsellOption = OrderConfigurationUpsellOption.NONE;
                }
                return (R) new OrderConfigurationContextFactory.OrderConfigurationContext(instrumentId, side, accountNumber, Position5.isShortPosition(position), orderConfigurationUpsellOption, instrumentRecurringTradability.isRecurringTradable(), instrumentRecurringTradability.getReason(), refId);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        return singleZip;
    }
}
