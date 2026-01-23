package com.robinhood.shared.order.type.selection;

import com.adjust.sdk.Constants;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey3;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OrderTypeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState;", "", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getSections", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SectionState", "OrderTypeRowState", "EducationTypeRowState", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTypeSelectionViewState {
    public static final int $stable = 0;
    private final ImmutableList<SectionState> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderTypeSelectionViewState copy$default(OrderTypeSelectionViewState orderTypeSelectionViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = orderTypeSelectionViewState.sections;
        }
        return orderTypeSelectionViewState.copy(immutableList);
    }

    public final ImmutableList<SectionState> component1() {
        return this.sections;
    }

    public final OrderTypeSelectionViewState copy(ImmutableList<? extends SectionState> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new OrderTypeSelectionViewState(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderTypeSelectionViewState) && Intrinsics.areEqual(this.sections, ((OrderTypeSelectionViewState) other).sections);
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return "OrderTypeSelectionViewState(sections=" + this.sections + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTypeSelectionViewState(ImmutableList<? extends SectionState> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    public final ImmutableList<SectionState> getSections() {
        return this.sections;
    }

    /* compiled from: OrderTypeSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "", "<init>", "()V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "OrderSectionState", "EducationSectionState", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState$EducationSectionState;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState$OrderSectionState;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SectionState {
        public static final int $stable = 0;

        public /* synthetic */ SectionState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract StringResource getTitle();

        private SectionState() {
        }

        /* compiled from: OrderTypeSelectionViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState$OrderSectionState;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderSectionState extends SectionState {
            public static final int $stable = StringResource.$stable;
            private final ImmutableList<OrderTypeRowState> rows;
            private final StringResource title;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OrderSectionState copy$default(OrderSectionState orderSectionState, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = orderSectionState.title;
                }
                if ((i & 2) != 0) {
                    immutableList = orderSectionState.rows;
                }
                return orderSectionState.copy(stringResource, immutableList);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            public final ImmutableList<OrderTypeRowState> component2() {
                return this.rows;
            }

            public final OrderSectionState copy(StringResource title, ImmutableList<OrderTypeRowState> rows) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(rows, "rows");
                return new OrderSectionState(title, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSectionState)) {
                    return false;
                }
                OrderSectionState orderSectionState = (OrderSectionState) other;
                return Intrinsics.areEqual(this.title, orderSectionState.title) && Intrinsics.areEqual(this.rows, orderSectionState.rows);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.rows.hashCode();
            }

            public String toString() {
                return "OrderSectionState(title=" + this.title + ", rows=" + this.rows + ")";
            }

            @Override // com.robinhood.shared.order.type.selection.OrderTypeSelectionViewState.SectionState
            public StringResource getTitle() {
                return this.title;
            }

            public final ImmutableList<OrderTypeRowState> getRows() {
                return this.rows;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSectionState(StringResource title, ImmutableList<OrderTypeRowState> rows) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(rows, "rows");
                this.title = title;
                this.rows = rows;
            }
        }

        /* compiled from: OrderTypeSelectionViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState$EducationSectionState;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$EducationTypeRowState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationSectionState extends SectionState {
            public static final int $stable = StringResource.$stable;
            private final ImmutableList<EducationTypeRowState> rows;
            private final StringResource title;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ EducationSectionState copy$default(EducationSectionState educationSectionState, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = educationSectionState.title;
                }
                if ((i & 2) != 0) {
                    immutableList = educationSectionState.rows;
                }
                return educationSectionState.copy(stringResource, immutableList);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            public final ImmutableList<EducationTypeRowState> component2() {
                return this.rows;
            }

            public final EducationSectionState copy(StringResource title, ImmutableList<EducationTypeRowState> rows) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(rows, "rows");
                return new EducationSectionState(title, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EducationSectionState)) {
                    return false;
                }
                EducationSectionState educationSectionState = (EducationSectionState) other;
                return Intrinsics.areEqual(this.title, educationSectionState.title) && Intrinsics.areEqual(this.rows, educationSectionState.rows);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.rows.hashCode();
            }

            public String toString() {
                return "EducationSectionState(title=" + this.title + ", rows=" + this.rows + ")";
            }

            @Override // com.robinhood.shared.order.type.selection.OrderTypeSelectionViewState.SectionState
            public StringResource getTitle() {
                return this.title;
            }

            public final ImmutableList<EducationTypeRowState> getRows() {
                return this.rows;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationSectionState(StringResource title, ImmutableList<EducationTypeRowState> rows) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(rows, "rows");
                this.title = title;
                this.rows = rows;
            }
        }
    }

    /* compiled from: OrderTypeSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;", "", "pogRes", "", "foregroundColorOverrideToAccent", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "orderType", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "<init>", "(IZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;)V", "getPogRes", "()I", "getForegroundColorOverrideToAccent", "()Z", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getOrderType", "()Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderTypeRowState {
        public static final int $stable = StringResource.$stable;
        private final StringResource description;
        private final boolean foregroundColorOverrideToAccent;
        private final CryptoOrderTypeFragmentKey6 orderType;
        private final int pogRes;
        private final StringResource title;

        public static /* synthetic */ OrderTypeRowState copy$default(OrderTypeRowState orderTypeRowState, int i, boolean z, StringResource stringResource, StringResource stringResource2, CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = orderTypeRowState.pogRes;
            }
            if ((i2 & 2) != 0) {
                z = orderTypeRowState.foregroundColorOverrideToAccent;
            }
            if ((i2 & 4) != 0) {
                stringResource = orderTypeRowState.title;
            }
            if ((i2 & 8) != 0) {
                stringResource2 = orderTypeRowState.description;
            }
            if ((i2 & 16) != 0) {
                cryptoOrderTypeFragmentKey6 = orderTypeRowState.orderType;
            }
            CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey62 = cryptoOrderTypeFragmentKey6;
            StringResource stringResource3 = stringResource;
            return orderTypeRowState.copy(i, z, stringResource3, stringResource2, cryptoOrderTypeFragmentKey62);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPogRes() {
            return this.pogRes;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getForegroundColorOverrideToAccent() {
            return this.foregroundColorOverrideToAccent;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoOrderTypeFragmentKey6 getOrderType() {
            return this.orderType;
        }

        public final OrderTypeRowState copy(int pogRes, boolean foregroundColorOverrideToAccent, StringResource title, StringResource description, CryptoOrderTypeFragmentKey6 orderType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new OrderTypeRowState(pogRes, foregroundColorOverrideToAccent, title, description, orderType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderTypeRowState)) {
                return false;
            }
            OrderTypeRowState orderTypeRowState = (OrderTypeRowState) other;
            return this.pogRes == orderTypeRowState.pogRes && this.foregroundColorOverrideToAccent == orderTypeRowState.foregroundColorOverrideToAccent && Intrinsics.areEqual(this.title, orderTypeRowState.title) && Intrinsics.areEqual(this.description, orderTypeRowState.description) && this.orderType == orderTypeRowState.orderType;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.pogRes) * 31) + Boolean.hashCode(this.foregroundColorOverrideToAccent)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.orderType.hashCode();
        }

        public String toString() {
            return "OrderTypeRowState(pogRes=" + this.pogRes + ", foregroundColorOverrideToAccent=" + this.foregroundColorOverrideToAccent + ", title=" + this.title + ", description=" + this.description + ", orderType=" + this.orderType + ")";
        }

        public OrderTypeRowState(int i, boolean z, StringResource title, StringResource description, CryptoOrderTypeFragmentKey6 orderType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.pogRes = i;
            this.foregroundColorOverrideToAccent = z;
            this.title = title;
            this.description = description;
            this.orderType = orderType;
        }

        public /* synthetic */ OrderTypeRowState(int i, boolean z, StringResource stringResource, StringResource stringResource2, CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, stringResource, stringResource2, cryptoOrderTypeFragmentKey6);
        }

        public final int getPogRes() {
            return this.pogRes;
        }

        public final boolean getForegroundColorOverrideToAccent() {
            return this.foregroundColorOverrideToAccent;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDescription() {
            return this.description;
        }

        public final CryptoOrderTypeFragmentKey6 getOrderType() {
            return this.orderType;
        }
    }

    /* compiled from: OrderTypeSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$EducationTypeRowState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", Constants.REFERRER_API_META, "action", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMeta", "getAction", "()Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationTypeRowState {
        public static final int $stable = StringResource.$stable;
        private final CryptoOrderTypeFragmentKey3 action;
        private final StringResource meta;
        private final StringResource title;

        public static /* synthetic */ EducationTypeRowState copy$default(EducationTypeRowState educationTypeRowState, StringResource stringResource, StringResource stringResource2, CryptoOrderTypeFragmentKey3 cryptoOrderTypeFragmentKey3, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = educationTypeRowState.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = educationTypeRowState.meta;
            }
            if ((i & 4) != 0) {
                cryptoOrderTypeFragmentKey3 = educationTypeRowState.action;
            }
            return educationTypeRowState.copy(stringResource, stringResource2, cryptoOrderTypeFragmentKey3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMeta() {
            return this.meta;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderTypeFragmentKey3 getAction() {
            return this.action;
        }

        public final EducationTypeRowState copy(StringResource title, StringResource meta, CryptoOrderTypeFragmentKey3 action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(meta, "meta");
            Intrinsics.checkNotNullParameter(action, "action");
            return new EducationTypeRowState(title, meta, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationTypeRowState)) {
                return false;
            }
            EducationTypeRowState educationTypeRowState = (EducationTypeRowState) other;
            return Intrinsics.areEqual(this.title, educationTypeRowState.title) && Intrinsics.areEqual(this.meta, educationTypeRowState.meta) && this.action == educationTypeRowState.action;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.meta.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "EducationTypeRowState(title=" + this.title + ", meta=" + this.meta + ", action=" + this.action + ")";
        }

        public EducationTypeRowState(StringResource title, StringResource meta, CryptoOrderTypeFragmentKey3 action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(meta, "meta");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.meta = meta;
            this.action = action;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMeta() {
            return this.meta;
        }

        public final CryptoOrderTypeFragmentKey3 getAction() {
            return this.action;
        }
    }
}
