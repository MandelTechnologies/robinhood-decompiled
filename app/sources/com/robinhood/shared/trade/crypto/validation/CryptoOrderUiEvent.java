package com.robinhood.shared.trade.crypto.validation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderUiEvent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\u0018\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "", "<init>", "(Lkotlin/Unit;)V", "Lkotlin/Unit;", "value", "", "consumed", "getConsumed$annotations", "()V", "getConsumed", "()Z", "consume", "()Lkotlin/Unit;", "equals", "other", "", "hashCode", "", "component1", "copy", "(Lkotlin/Unit;)Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "describeContents", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderUiEvent implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoOrderUiEvent> CREATOR = new Creator();
    private boolean consumed;
    private final Unit data;

    /* compiled from: CryptoOrderUiEvent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoOrderUiEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderUiEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new CryptoOrderUiEvent(Unit.INSTANCE);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderUiEvent[] newArray(int i) {
            return new CryptoOrderUiEvent[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderUiEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void component1() {
    }

    public static /* synthetic */ CryptoOrderUiEvent copy$default(CryptoOrderUiEvent cryptoOrderUiEvent, Unit unit, int i, Object obj) {
        if ((i & 1) != 0) {
            unit = cryptoOrderUiEvent.data;
        }
        return cryptoOrderUiEvent.copy(unit);
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    public final CryptoOrderUiEvent copy(Unit data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new CryptoOrderUiEvent(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "CryptoOrderUiEvent(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public CryptoOrderUiEvent(Unit data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public /* synthetic */ CryptoOrderUiEvent(Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Unit.INSTANCE : unit);
    }

    public final boolean getConsumed() {
        return this.consumed;
    }

    public final Unit consume() {
        if (this.consumed) {
            return null;
        }
        this.consumed = true;
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CryptoOrderUiEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent");
        return this.consumed == ((CryptoOrderUiEvent) other).consumed;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Boolean.hashCode(this.consumed);
    }
}
