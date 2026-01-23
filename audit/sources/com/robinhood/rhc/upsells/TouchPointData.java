package com.robinhood.rhc.upsells;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TouchPoint.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/TouchPointData;", "", "seen1", "", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "rewardId", "", "currencyPairId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rhc/upsells/TouchPoint;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/rhc/upsells/TouchPoint;Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/lang/String;", "getRewardId", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final /* data */ class TouchPointData {
    private final String currencyPairId;
    private final String rewardId;
    private final TouchPoint touchPoint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {TouchPoint.INSTANCE.serializer(), null, null};

    public static /* synthetic */ TouchPointData copy$default(TouchPointData touchPointData, TouchPoint touchPoint, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            touchPoint = touchPointData.touchPoint;
        }
        if ((i & 2) != 0) {
            str = touchPointData.rewardId;
        }
        if ((i & 4) != 0) {
            str2 = touchPointData.currencyPairId;
        }
        return touchPointData.copy(touchPoint, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TouchPoint getTouchPoint() {
        return this.touchPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final TouchPointData copy(TouchPoint touchPoint, String rewardId, String currencyPairId) {
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        return new TouchPointData(touchPoint, rewardId, currencyPairId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchPointData)) {
            return false;
        }
        TouchPointData touchPointData = (TouchPointData) other;
        return this.touchPoint == touchPointData.touchPoint && Intrinsics.areEqual(this.rewardId, touchPointData.rewardId) && Intrinsics.areEqual(this.currencyPairId, touchPointData.currencyPairId);
    }

    public int hashCode() {
        int iHashCode = this.touchPoint.hashCode() * 31;
        String str = this.rewardId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyPairId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TouchPointData(touchPoint=" + this.touchPoint + ", rewardId=" + this.rewardId + ", currencyPairId=" + this.currencyPairId + ")";
    }

    /* compiled from: TouchPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/TouchPointData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/TouchPointData;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TouchPointData> serializer() {
            return TouchPoint3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TouchPointData(int i, TouchPoint touchPoint, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, TouchPoint3.INSTANCE.getDescriptor());
        }
        this.touchPoint = touchPoint;
        if ((i & 2) == 0) {
            this.rewardId = null;
        } else {
            this.rewardId = str;
        }
        if ((i & 4) == 0) {
            this.currencyPairId = null;
        } else {
            this.currencyPairId = str2;
        }
    }

    public TouchPointData(TouchPoint touchPoint, String str, String str2) {
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        this.touchPoint = touchPoint;
        this.rewardId = str;
        this.currencyPairId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TouchPointData self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.touchPoint);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.rewardId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.rewardId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.currencyPairId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.currencyPairId);
    }

    public /* synthetic */ TouchPointData(TouchPoint touchPoint, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(touchPoint, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final TouchPoint getTouchPoint() {
        return this.touchPoint;
    }

    public final String getRewardId() {
        return this.rewardId;
    }

    public final String getCurrencyPairId() {
        return this.currencyPairId;
    }
}
