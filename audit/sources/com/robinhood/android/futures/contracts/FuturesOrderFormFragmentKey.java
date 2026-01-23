package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "futuresContractId", "getFuturesContractId", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "WithOrderToReview", "Default", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey$Default;", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey$WithOrderToReview;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface FuturesOrderFormFragmentKey extends FragmentKey {
    UUID getFuturesContractId();

    UUID getRefId();

    FuturesOrderSide getSide();

    Screen getSourceScreen();

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey$WithOrderToReview;", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "orderToReview", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getOrderToReview", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "futuresContractId", "Ljava/util/UUID;", "getFuturesContractId$annotations", "()V", "getFuturesContractId", "()Ljava/util/UUID;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide$annotations", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "refId", "getRefId$annotations", "getRefId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithOrderToReview implements FuturesOrderFormFragmentKey {
        public static final Parcelable.Creator<WithOrderToReview> CREATOR = new Creator();
        private final UUID futuresContractId;
        private final UiFuturesOrderContext.OrderRequest orderToReview;
        private final UUID refId;
        private final FuturesOrderSide side;
        private final Screen sourceScreen;

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithOrderToReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithOrderToReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithOrderToReview((UiFuturesOrderContext.OrderRequest) parcel.readParcelable(WithOrderToReview.class.getClassLoader()), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithOrderToReview[] newArray(int i) {
                return new WithOrderToReview[i];
            }
        }

        public static /* synthetic */ WithOrderToReview copy$default(WithOrderToReview withOrderToReview, UiFuturesOrderContext.OrderRequest orderRequest, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                orderRequest = withOrderToReview.orderToReview;
            }
            if ((i & 2) != 0) {
                screen = withOrderToReview.sourceScreen;
            }
            return withOrderToReview.copy(orderRequest, screen);
        }

        public static /* synthetic */ void getFuturesContractId$annotations() {
        }

        public static /* synthetic */ void getRefId$annotations() {
        }

        public static /* synthetic */ void getSide$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UiFuturesOrderContext.OrderRequest getOrderToReview() {
            return this.orderToReview;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        public final WithOrderToReview copy(UiFuturesOrderContext.OrderRequest orderToReview, Screen sourceScreen) {
            Intrinsics.checkNotNullParameter(orderToReview, "orderToReview");
            return new WithOrderToReview(orderToReview, sourceScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithOrderToReview)) {
                return false;
            }
            WithOrderToReview withOrderToReview = (WithOrderToReview) other;
            return Intrinsics.areEqual(this.orderToReview, withOrderToReview.orderToReview) && Intrinsics.areEqual(this.sourceScreen, withOrderToReview.sourceScreen);
        }

        public int hashCode() {
            int iHashCode = this.orderToReview.hashCode() * 31;
            Screen screen = this.sourceScreen;
            return iHashCode + (screen == null ? 0 : screen.hashCode());
        }

        public String toString() {
            return "WithOrderToReview(orderToReview=" + this.orderToReview + ", sourceScreen=" + this.sourceScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.orderToReview, flags);
            dest.writeSerializable(this.sourceScreen);
        }

        public WithOrderToReview(UiFuturesOrderContext.OrderRequest orderToReview, Screen screen) {
            Intrinsics.checkNotNullParameter(orderToReview, "orderToReview");
            this.orderToReview = orderToReview;
            this.sourceScreen = screen;
            this.futuresContractId = orderToReview.getContractId();
            this.side = orderToReview.getOrderSide();
            this.refId = orderToReview.getRefId();
        }

        public final UiFuturesOrderContext.OrderRequest getOrderToReview() {
            return this.orderToReview;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public Screen getSourceScreen() {
            return this.sourceScreen;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public UUID getFuturesContractId() {
            return this.futuresContractId;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public FuturesOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\nJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey$Default;", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "refId", "Ljava/util/UUID;", "futuresContractId", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultQuantity", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/Integer;)V", "getRefId", "()Ljava/util/UUID;", "getFuturesContractId", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getDefaultQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/Integer;)Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey$Default;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Default implements FuturesOrderFormFragmentKey {
        public static final Parcelable.Creator<Default> CREATOR = new Creator();
        private final Integer defaultQuantity;
        private final UUID futuresContractId;
        private final UUID refId;
        private final FuturesOrderSide side;
        private final Screen sourceScreen;

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), FuturesOrderSide.valueOf(parcel.readString()), (Screen) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        public static /* synthetic */ Default copy$default(Default r0, UUID uuid, UUID uuid2, FuturesOrderSide futuresOrderSide, Screen screen, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = r0.refId;
            }
            if ((i & 2) != 0) {
                uuid2 = r0.futuresContractId;
            }
            if ((i & 4) != 0) {
                futuresOrderSide = r0.side;
            }
            if ((i & 8) != 0) {
                screen = r0.sourceScreen;
            }
            if ((i & 16) != 0) {
                num = r0.defaultQuantity;
            }
            Integer num2 = num;
            FuturesOrderSide futuresOrderSide2 = futuresOrderSide;
            return r0.copy(uuid, uuid2, futuresOrderSide2, screen, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getFuturesContractId() {
            return this.futuresContractId;
        }

        /* renamed from: component3, reason: from getter */
        public final FuturesOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getDefaultQuantity() {
            return this.defaultQuantity;
        }

        public final Default copy(UUID refId, UUID futuresContractId, FuturesOrderSide side, Screen sourceScreen, Integer defaultQuantity) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
            Intrinsics.checkNotNullParameter(side, "side");
            return new Default(refId, futuresContractId, side, sourceScreen, defaultQuantity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r5 = (Default) other;
            return Intrinsics.areEqual(this.refId, r5.refId) && Intrinsics.areEqual(this.futuresContractId, r5.futuresContractId) && this.side == r5.side && Intrinsics.areEqual(this.sourceScreen, r5.sourceScreen) && Intrinsics.areEqual(this.defaultQuantity, r5.defaultQuantity);
        }

        public int hashCode() {
            int iHashCode = ((((this.refId.hashCode() * 31) + this.futuresContractId.hashCode()) * 31) + this.side.hashCode()) * 31;
            Screen screen = this.sourceScreen;
            int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
            Integer num = this.defaultQuantity;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Default(refId=" + this.refId + ", futuresContractId=" + this.futuresContractId + ", side=" + this.side + ", sourceScreen=" + this.sourceScreen + ", defaultQuantity=" + this.defaultQuantity + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.refId);
            dest.writeSerializable(this.futuresContractId);
            dest.writeString(this.side.name());
            dest.writeSerializable(this.sourceScreen);
            Integer num = this.defaultQuantity;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public Default(UUID refId, UUID futuresContractId, FuturesOrderSide side, Screen screen, Integer num) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
            Intrinsics.checkNotNullParameter(side, "side");
            this.refId = refId;
            this.futuresContractId = futuresContractId;
            this.side = side;
            this.sourceScreen = screen;
            this.defaultQuantity = num;
        }

        public /* synthetic */ Default(UUID uuid, UUID uuid2, FuturesOrderSide futuresOrderSide, Screen screen, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UUID.randomUUID() : uuid, uuid2, futuresOrderSide, screen, num);
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public UUID getRefId() {
            return this.refId;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public UUID getFuturesContractId() {
            return this.futuresContractId;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public FuturesOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey
        public Screen getSourceScreen() {
            return this.sourceScreen;
        }

        public final Integer getDefaultQuantity() {
            return this.defaultQuantity;
        }
    }
}
