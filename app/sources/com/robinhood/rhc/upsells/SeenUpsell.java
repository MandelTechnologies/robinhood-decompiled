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

/* compiled from: SeenUpsell.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/SeenUpsell;", "", "seen1", "", "id", "", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "seenAt", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rhc/upsells/TouchPoint;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/robinhood/rhc/upsells/TouchPoint;J)V", "getId", "()Ljava/lang/String;", "getSeenAt", "()J", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final /* data */ class SeenUpsell {
    private final String id;
    private final long seenAt;
    private final TouchPoint touchPoint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, TouchPoint.INSTANCE.serializer(), null};

    public static /* synthetic */ SeenUpsell copy$default(SeenUpsell seenUpsell, String str, TouchPoint touchPoint, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seenUpsell.id;
        }
        if ((i & 2) != 0) {
            touchPoint = seenUpsell.touchPoint;
        }
        if ((i & 4) != 0) {
            j = seenUpsell.seenAt;
        }
        return seenUpsell.copy(str, touchPoint, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final TouchPoint getTouchPoint() {
        return this.touchPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSeenAt() {
        return this.seenAt;
    }

    public final SeenUpsell copy(String id, TouchPoint touchPoint, long seenAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        return new SeenUpsell(id, touchPoint, seenAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeenUpsell)) {
            return false;
        }
        SeenUpsell seenUpsell = (SeenUpsell) other;
        return Intrinsics.areEqual(this.id, seenUpsell.id) && this.touchPoint == seenUpsell.touchPoint && this.seenAt == seenUpsell.seenAt;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.touchPoint.hashCode()) * 31) + Long.hashCode(this.seenAt);
    }

    public String toString() {
        return "SeenUpsell(id=" + this.id + ", touchPoint=" + this.touchPoint + ", seenAt=" + this.seenAt + ")";
    }

    /* compiled from: SeenUpsell.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/SeenUpsell$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/SeenUpsell;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SeenUpsell> serializer() {
            return SeenUpsell2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SeenUpsell(int i, String str, TouchPoint touchPoint, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SeenUpsell2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.touchPoint = touchPoint;
        this.seenAt = j;
    }

    public SeenUpsell(String id, TouchPoint touchPoint, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        this.id = id;
        this.touchPoint = touchPoint;
        this.seenAt = j;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(SeenUpsell self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.touchPoint);
        output.encodeLongElement(serialDesc, 2, self.seenAt);
    }

    public final String getId() {
        return this.id;
    }

    public final TouchPoint getTouchPoint() {
        return this.touchPoint;
    }

    public final long getSeenAt() {
        return this.seenAt;
    }
}
