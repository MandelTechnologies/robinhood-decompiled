package com.robinhood.shared.order.type.selection;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.shared.crypto.contracts.orderType.OrderEducationItem;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OrderTypeSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÂ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\u0007HÂ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÂ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fHÂ\u0003JG\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00128@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00128@X\u0081\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDataState;", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "instrumentSymbol", "", "instrumentType", "Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;", "supportedOrderTypes", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "educationItems", "", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Ljava/lang/String;Lcom/robinhood/shared/crypto/contracts/orderType/InstrumentType;Ljava/util/Set;Ljava/util/List;)V", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "getSections", "()Lkotlinx/collections/immutable/ImmutableList;", "orderTypesSection", "getOrderTypesSection$lib_order_type_externalDebug$annotations", "()V", "getOrderTypesSection$lib_order_type_externalDebug", "()Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "marketOrderTypeRow", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;", "getMarketOrderTypeRow$lib_order_type_externalDebug$annotations", "getMarketOrderTypeRow$lib_order_type_externalDebug", "()Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;", "limitOrderTypeRow", "getLimitOrderTypeRow$lib_order_type_externalDebug$annotations", "getLimitOrderTypeRow$lib_order_type_externalDebug", "orderTypesEducationSection", "getOrderTypesEducationSection$lib_order_type_externalDebug$annotations", "getOrderTypesEducationSection$lib_order_type_externalDebug", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class OrderTypeSelectionDataState {
    public static final int $stable = 8;
    private final List<OrderEducationItem> educationItems;
    private final String instrumentSymbol;
    private final CryptoOrderTypeFragmentKey2 instrumentType;
    private final OrderSide orderSide;
    private final Set<CryptoOrderTypeFragmentKey6> supportedOrderTypes;

    /* compiled from: OrderTypeSelectionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoOrderTypeFragmentKey2.values().length];
            try {
                iArr3[CryptoOrderTypeFragmentKey2.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CryptoOrderTypeFragmentKey2.PERPETUAL_CONTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component2, reason: from getter */
    private final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    /* renamed from: component3, reason: from getter */
    private final CryptoOrderTypeFragmentKey2 getInstrumentType() {
        return this.instrumentType;
    }

    private final Set<CryptoOrderTypeFragmentKey6> component4() {
        return this.supportedOrderTypes;
    }

    private final List<OrderEducationItem> component5() {
        return this.educationItems;
    }

    public static /* synthetic */ OrderTypeSelectionDataState copy$default(OrderTypeSelectionDataState orderTypeSelectionDataState, OrderSide orderSide, String str, CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey2, Set set, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSide = orderTypeSelectionDataState.orderSide;
        }
        if ((i & 2) != 0) {
            str = orderTypeSelectionDataState.instrumentSymbol;
        }
        if ((i & 4) != 0) {
            cryptoOrderTypeFragmentKey2 = orderTypeSelectionDataState.instrumentType;
        }
        if ((i & 8) != 0) {
            set = orderTypeSelectionDataState.supportedOrderTypes;
        }
        if ((i & 16) != 0) {
            list = orderTypeSelectionDataState.educationItems;
        }
        List list2 = list;
        CryptoOrderTypeFragmentKey2 cryptoOrderTypeFragmentKey22 = cryptoOrderTypeFragmentKey2;
        return orderTypeSelectionDataState.copy(orderSide, str, cryptoOrderTypeFragmentKey22, set, list2);
    }

    public static /* synthetic */ void getLimitOrderTypeRow$lib_order_type_externalDebug$annotations() {
    }

    public static /* synthetic */ void getMarketOrderTypeRow$lib_order_type_externalDebug$annotations() {
    }

    /* renamed from: getOrderTypesEducationSection$lib_order_type_externalDebug$annotations */
    public static /* synthetic */ void m2833x9e62c974() {
    }

    public static /* synthetic */ void getOrderTypesSection$lib_order_type_externalDebug$annotations() {
    }

    public final OrderTypeSelectionDataState copy(OrderSide orderSide, String instrumentSymbol, CryptoOrderTypeFragmentKey2 instrumentType, Set<? extends CryptoOrderTypeFragmentKey6> supportedOrderTypes, List<OrderEducationItem> educationItems) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(supportedOrderTypes, "supportedOrderTypes");
        Intrinsics.checkNotNullParameter(educationItems, "educationItems");
        return new OrderTypeSelectionDataState(orderSide, instrumentSymbol, instrumentType, supportedOrderTypes, educationItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypeSelectionDataState)) {
            return false;
        }
        OrderTypeSelectionDataState orderTypeSelectionDataState = (OrderTypeSelectionDataState) other;
        return this.orderSide == orderTypeSelectionDataState.orderSide && Intrinsics.areEqual(this.instrumentSymbol, orderTypeSelectionDataState.instrumentSymbol) && this.instrumentType == orderTypeSelectionDataState.instrumentType && Intrinsics.areEqual(this.supportedOrderTypes, orderTypeSelectionDataState.supportedOrderTypes) && Intrinsics.areEqual(this.educationItems, orderTypeSelectionDataState.educationItems);
    }

    public int hashCode() {
        return (((((((this.orderSide.hashCode() * 31) + this.instrumentSymbol.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.supportedOrderTypes.hashCode()) * 31) + this.educationItems.hashCode();
    }

    public String toString() {
        return "OrderTypeSelectionDataState(orderSide=" + this.orderSide + ", instrumentSymbol=" + this.instrumentSymbol + ", instrumentType=" + this.instrumentType + ", supportedOrderTypes=" + this.supportedOrderTypes + ", educationItems=" + this.educationItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTypeSelectionDataState(OrderSide orderSide, String instrumentSymbol, CryptoOrderTypeFragmentKey2 instrumentType, Set<? extends CryptoOrderTypeFragmentKey6> supportedOrderTypes, List<OrderEducationItem> educationItems) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(supportedOrderTypes, "supportedOrderTypes");
        Intrinsics.checkNotNullParameter(educationItems, "educationItems");
        this.orderSide = orderSide;
        this.instrumentSymbol = instrumentSymbol;
        this.instrumentType = instrumentType;
        this.supportedOrderTypes = supportedOrderTypes;
        this.educationItems = educationItems;
    }

    public final ImmutableList<OrderTypeSelectionViewState.SectionState> getSections() {
        return extensions2.toPersistentList(CollectionsKt.listOfNotNull((Object[]) new OrderTypeSelectionViewState.SectionState[]{getOrderTypesSection$lib_order_type_externalDebug(), getOrderTypesEducationSection$lib_order_type_externalDebug()}));
    }

    public final OrderTypeSelectionViewState.SectionState getOrderTypesSection$lib_order_type_externalDebug() {
        OrderTypeSelectionViewState.OrderTypeRowState marketOrderTypeRow$lib_order_type_externalDebug;
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C39278R.string.crypto_order_type_selection_title, new Object[0]);
        List listListOf = CollectionsKt.listOf((Object[]) new CryptoOrderTypeFragmentKey6[]{CryptoOrderTypeFragmentKey6.MARKET, CryptoOrderTypeFragmentKey6.LIMIT});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (this.supportedOrderTypes.contains((CryptoOrderTypeFragmentKey6) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((CryptoOrderTypeFragmentKey6) it.next()).ordinal()];
            if (i == 1) {
                marketOrderTypeRow$lib_order_type_externalDebug = getMarketOrderTypeRow$lib_order_type_externalDebug();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                marketOrderTypeRow$lib_order_type_externalDebug = getLimitOrderTypeRow$lib_order_type_externalDebug();
            }
            arrayList2.add(marketOrderTypeRow$lib_order_type_externalDebug);
        }
        return new OrderTypeSelectionViewState.SectionState.OrderSectionState(stringResourceInvoke, extensions2.toPersistentList(arrayList2));
    }

    public final OrderTypeSelectionViewState.OrderTypeRowState getMarketOrderTypeRow$lib_order_type_externalDebug() {
        StringResource stringResourceInvoke;
        int i = C20690R.drawable.pict_mono_rds_crypto_c;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke2 = companion.invoke(C39278R.string.crypto_order_types_market_title, new Object[0]);
        int i2 = WhenMappings.$EnumSwitchMapping$2[this.instrumentType.ordinal()];
        if (i2 == 1) {
            int i3 = WhenMappings.$EnumSwitchMapping$1[this.orderSide.ordinal()];
            if (i3 == 1) {
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_market_buy_description, this.instrumentSymbol);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_market_sell_description, this.instrumentSymbol);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = WhenMappings.$EnumSwitchMapping$1[this.orderSide.ordinal()];
            if (i4 == 1) {
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_market_long_description, this.instrumentSymbol);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_market_short_description, this.instrumentSymbol);
            }
        }
        return new OrderTypeSelectionViewState.OrderTypeRowState(i, true, stringResourceInvoke2, stringResourceInvoke, CryptoOrderTypeFragmentKey6.MARKET);
    }

    public final OrderTypeSelectionViewState.OrderTypeRowState getLimitOrderTypeRow$lib_order_type_externalDebug() {
        int i;
        StringResource stringResourceInvoke;
        OrderSide orderSide = this.orderSide;
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i2 = iArr[orderSide.ordinal()];
        if (i2 == 1) {
            i = C20690R.drawable.pict_clr_rds_order_types_buy_limit;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20690R.drawable.pict_clr_rds_order_types_sell_limit;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke2 = companion.invoke(C39278R.string.crypto_order_types_limit_title, new Object[0]);
        int i3 = WhenMappings.$EnumSwitchMapping$2[this.instrumentType.ordinal()];
        if (i3 == 1) {
            int i4 = iArr[this.orderSide.ordinal()];
            if (i4 == 1) {
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_limit_buy_description, this.instrumentSymbol);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_limit_sell_description, this.instrumentSymbol);
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = iArr[this.orderSide.ordinal()];
            if (i5 == 1) {
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_limit_long_description, this.instrumentSymbol);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = companion.invoke(C39278R.string.crypto_order_types_limit_short_description, this.instrumentSymbol);
            }
        }
        StringResource stringResource = stringResourceInvoke;
        return new OrderTypeSelectionViewState.OrderTypeRowState(i, false, stringResourceInvoke2, stringResource, CryptoOrderTypeFragmentKey6.LIMIT, 2, null);
    }

    public final OrderTypeSelectionViewState.SectionState getOrderTypesEducationSection$lib_order_type_externalDebug() {
        if (this.educationItems.isEmpty()) {
            return null;
        }
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_perpetuals_education_section_title, new Object[0]);
        List<OrderEducationItem> list = this.educationItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OrderEducationItem orderEducationItem : list) {
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new OrderTypeSelectionViewState.EducationTypeRowState(companion.invoke(orderEducationItem.getTitle(), new Object[0]), companion.invoke(orderEducationItem.getDescription(), new Object[0]), orderEducationItem.getAction()));
        }
        return new OrderTypeSelectionViewState.SectionState.EducationSectionState(stringResourceInvoke, extensions2.toPersistentList(arrayList));
    }
}
