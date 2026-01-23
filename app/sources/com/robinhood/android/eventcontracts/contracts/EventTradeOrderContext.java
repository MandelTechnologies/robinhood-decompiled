package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventTradeOrderContext.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "Landroid/os/Parcelable;", "eventContractId", "Ljava/util/UUID;", "side", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "<init>", "(Ljava/util/UUID;Lrosetta/mainst/SideDto;Lrosetta/mainst/PositionEffectDto;)V", "getEventContractId", "()Ljava/util/UUID;", "getSide", "()Lrosetta/mainst/SideDto;", "getPositionEffect", "()Lrosetta/mainst/PositionEffectDto;", "toProtoLoggingModel", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventTradeOrderContext implements Parcelable {
    public static final Parcelable.Creator<EventTradeOrderContext> CREATOR = new Creator();
    private final UUID eventContractId;
    private final PositionEffectDto positionEffect;
    private final SideDto side;

    /* compiled from: EventTradeOrderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EventTradeOrderContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventTradeOrderContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventTradeOrderContext((UUID) parcel.readSerializable(), (SideDto) parcel.readParcelable(EventTradeOrderContext.class.getClassLoader()), (PositionEffectDto) parcel.readParcelable(EventTradeOrderContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventTradeOrderContext[] newArray(int i) {
            return new EventTradeOrderContext[i];
        }
    }

    public static /* synthetic */ EventTradeOrderContext copy$default(EventTradeOrderContext eventTradeOrderContext, UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = eventTradeOrderContext.eventContractId;
        }
        if ((i & 2) != 0) {
            sideDto = eventTradeOrderContext.side;
        }
        if ((i & 4) != 0) {
            positionEffectDto = eventTradeOrderContext.positionEffect;
        }
        return eventTradeOrderContext.copy(uuid, sideDto, positionEffectDto);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    /* renamed from: component2, reason: from getter */
    public final SideDto getSide() {
        return this.side;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionEffectDto getPositionEffect() {
        return this.positionEffect;
    }

    public final EventTradeOrderContext copy(UUID eventContractId, SideDto side, PositionEffectDto positionEffect) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        return new EventTradeOrderContext(eventContractId, side, positionEffect);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTradeOrderContext)) {
            return false;
        }
        EventTradeOrderContext eventTradeOrderContext = (EventTradeOrderContext) other;
        return Intrinsics.areEqual(this.eventContractId, eventTradeOrderContext.eventContractId) && this.side == eventTradeOrderContext.side && this.positionEffect == eventTradeOrderContext.positionEffect;
    }

    public int hashCode() {
        return (((this.eventContractId.hashCode() * 31) + this.side.hashCode()) * 31) + this.positionEffect.hashCode();
    }

    public String toString() {
        return "EventTradeOrderContext(eventContractId=" + this.eventContractId + ", side=" + this.side + ", positionEffect=" + this.positionEffect + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.eventContractId);
        dest.writeParcelable(this.side, flags);
        dest.writeParcelable(this.positionEffect, flags);
    }

    public EventTradeOrderContext(UUID eventContractId, SideDto side, PositionEffectDto positionEffect) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        this.eventContractId = eventContractId;
        this.side = side;
        this.positionEffect = positionEffect;
    }

    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    public final SideDto getSide() {
        return this.side;
    }

    public final PositionEffectDto getPositionEffect() {
        return this.positionEffect;
    }

    public final EventContractOrderContext toProtoLoggingModel() {
        return new EventContractOrderContext(Uuids.safeToString(this.eventContractId), EventTradeOrderContext2.toProtoLoggingModel(this.side), EventTradeOrderContext2.toProtoLoggingModel(this.positionEffect), null, null, 24, null);
    }
}
