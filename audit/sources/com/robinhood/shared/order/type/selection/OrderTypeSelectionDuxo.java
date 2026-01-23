package com.robinhood.shared.order.type.selection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.models.p320db.Order;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import com.robinhood.shared.order.type.OrderTypeDestinations;
import com.robinhood.shared.order.type.OrderTypeDestinations3;
import com.robinhood.shared.order.type.OrderTypeDestinations4;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0017B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDataState;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/selection/CryptoOrderTypeSelectionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "educationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/order/type/selection/CryptoOrderTypeSelectionStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/education/order/OrderTypeEducationManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onOrderTypeSelected", "", "orderType", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "getLimitOrderSelectedEvent", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypeSelectionDuxo extends BaseDuxo3<OrderTypeSelectionDataState, OrderTypeSelectionViewState, OrderTypeSelectionEvent> implements HasSavedState {
    private final OrderTypeEducationManager educationManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderTypeSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoOrderTypeFragmentKey6.values().length];
            try {
                iArr[CryptoOrderTypeFragmentKey6.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderTypeFragmentKey6.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderTypeFragmentKey2.values().length];
            try {
                iArr2[CryptoOrderTypeFragmentKey2.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderTypeFragmentKey2.PERPETUAL_CONTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ OrderTypeSelectionDuxo(DuxoBundle duxoBundle, OrderTypeSelectionDuxo2 orderTypeSelectionDuxo2, SavedStateHandle savedStateHandle, OrderTypeEducationManager orderTypeEducationManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(duxoBundle, (i & 2) != 0 ? new OrderTypeSelectionDuxo2() : orderTypeSelectionDuxo2, savedStateHandle, orderTypeEducationManager);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderTypeSelectionDuxo(DuxoBundle duxoBundle, OrderTypeSelectionDuxo2 stateProvider, SavedStateHandle savedStateHandle, OrderTypeEducationManager educationManager) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(educationManager, "educationManager");
        Companion companion = INSTANCE;
        super(new OrderTypeSelectionDataState(((OrderTypeDestinations4.Args) companion.getArgs(savedStateHandle)).getOrderSide(), ((OrderTypeDestinations4.Args) companion.getArgs(savedStateHandle)).getInstrumentSymbol(), ((OrderTypeDestinations4.Args) companion.getArgs(savedStateHandle)).getInstrumentType(), ((OrderTypeDestinations4.Args) companion.getArgs(savedStateHandle)).getSupportedOrderTypes(), ((OrderTypeDestinations4.Args) companion.getArgs(savedStateHandle)).getEducationItems()), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.educationManager = educationManager;
    }

    public final void onOrderTypeSelected(CryptoOrderTypeFragmentKey6 orderType) {
        OrderTypeSelectionEvent orderPriceSelected;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = WhenMappings.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i == 1) {
            orderPriceSelected = new OrderTypeSelectionEvent.OrderPriceSelected(CryptoOrderTypeFragmentKey5.Market.INSTANCE);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderPriceSelected = getLimitOrderSelectedEvent();
        }
        submit(orderPriceSelected);
    }

    private final OrderTypeSelectionEvent getLimitOrderSelectedEvent() {
        ComposeNav composeNavCreateComposeNav;
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration cryptoOrder;
        Companion companion = INSTANCE;
        OrderTypeDestinations3.Args args = new OrderTypeDestinations3.Args(((OrderTypeDestinations4.Args) companion.getArgs((HasSavedState) this)).getInstrumentSymbol(), ((OrderTypeDestinations4.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((OrderTypeDestinations4.Args) companion.getArgs((HasSavedState) this)).getOrderSide(), ((OrderTypeDestinations4.Args) companion.getArgs((HasSavedState) this)).getOrderId(), EditableOrderPrice.INSTANCE.getDEFAULT_LIMIT_ORDER_PRICE(), false, ((OrderTypeDestinations4.Args) companion.getArgs((HasSavedState) this)).getInstrumentType());
        Order.Configuration configuration = Order.Configuration.LIMIT;
        if (OrderTypeEducationManager.shouldShowEducation$default(this.educationManager, configuration, args.getOrderSide(), null, false, 4, null)) {
            OrderTypeDestinations orderTypeDestinations = OrderTypeDestinations.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$1[args.getInstrumentType().ordinal()];
            if (i == 1) {
                cryptoOrder = new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(configuration, args.getOrderSide(), args.getInstrumentId(), args.getOrderId(), true, OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON, false, 64, null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cryptoOrder = new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract(configuration, args.getOrderSide(), args.getInstrumentId(), args.getOrderId(), true, OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON, args.getInstrumentSymbol());
            }
            composeNavCreateComposeNav = ComposableDestinationWithArgs.composeNav$default(orderTypeDestinations, new OrderTypeDestinations.Args(args, cryptoOrder, false), null, null, 6, null);
        } else {
            composeNavCreateComposeNav = OrderTypeDestinations3.INSTANCE.createComposeNav(args);
        }
        return new OrderTypeSelectionEvent.Navigate(composeNavCreateComposeNav);
    }

    /* compiled from: OrderTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;", "Lcom/robinhood/shared/order/type/OrderTypeSelectionDest$Args;", "<init>", "()V", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<OrderTypeSelectionDuxo, OrderTypeDestinations4.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations4.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderTypeDestinations4.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations4.Args getArgs(OrderTypeSelectionDuxo orderTypeSelectionDuxo) {
            return (OrderTypeDestinations4.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, orderTypeSelectionDuxo);
        }
    }
}
