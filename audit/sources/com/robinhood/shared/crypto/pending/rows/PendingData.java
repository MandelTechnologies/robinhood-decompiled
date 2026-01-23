package com.robinhood.shared.crypto.pending.rows;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "", "type", "Lcom/robinhood/shared/crypto/pending/rows/PendingData$Type;", "id", "Ljava/util/UUID;", "startPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "startSecondaryText", "endPrimaryText", "endSecondaryText", "<init>", "(Lcom/robinhood/shared/crypto/pending/rows/PendingData$Type;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getType", "()Lcom/robinhood/shared/crypto/pending/rows/PendingData$Type;", "getId", "()Ljava/util/UUID;", "getStartPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getStartSecondaryText", "getEndPrimaryText", "getEndSecondaryText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "lib-pending-rows_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PendingData {
    public static final int $stable = 8;
    private final StringResource endPrimaryText;
    private final StringResource endSecondaryText;
    private final UUID id;
    private final StringResource startPrimaryText;
    private final StringResource startSecondaryText;
    private final Type type;

    public static /* synthetic */ PendingData copy$default(PendingData pendingData, Type type2, UUID uuid, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = pendingData.type;
        }
        if ((i & 2) != 0) {
            uuid = pendingData.id;
        }
        if ((i & 4) != 0) {
            stringResource = pendingData.startPrimaryText;
        }
        if ((i & 8) != 0) {
            stringResource2 = pendingData.startSecondaryText;
        }
        if ((i & 16) != 0) {
            stringResource3 = pendingData.endPrimaryText;
        }
        if ((i & 32) != 0) {
            stringResource4 = pendingData.endSecondaryText;
        }
        StringResource stringResource5 = stringResource3;
        StringResource stringResource6 = stringResource4;
        return pendingData.copy(type2, uuid, stringResource, stringResource2, stringResource5, stringResource6);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getStartPrimaryText() {
        return this.startPrimaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getStartSecondaryText() {
        return this.startSecondaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getEndPrimaryText() {
        return this.endPrimaryText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getEndSecondaryText() {
        return this.endSecondaryText;
    }

    public final PendingData copy(Type type2, UUID id, StringResource startPrimaryText, StringResource startSecondaryText, StringResource endPrimaryText, StringResource endSecondaryText) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startPrimaryText, "startPrimaryText");
        return new PendingData(type2, id, startPrimaryText, startSecondaryText, endPrimaryText, endSecondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingData)) {
            return false;
        }
        PendingData pendingData = (PendingData) other;
        return this.type == pendingData.type && Intrinsics.areEqual(this.id, pendingData.id) && Intrinsics.areEqual(this.startPrimaryText, pendingData.startPrimaryText) && Intrinsics.areEqual(this.startSecondaryText, pendingData.startSecondaryText) && Intrinsics.areEqual(this.endPrimaryText, pendingData.endPrimaryText) && Intrinsics.areEqual(this.endSecondaryText, pendingData.endSecondaryText);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.startPrimaryText.hashCode()) * 31;
        StringResource stringResource = this.startSecondaryText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.endPrimaryText;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.endSecondaryText;
        return iHashCode3 + (stringResource3 != null ? stringResource3.hashCode() : 0);
    }

    public String toString() {
        return "PendingData(type=" + this.type + ", id=" + this.id + ", startPrimaryText=" + this.startPrimaryText + ", startSecondaryText=" + this.startSecondaryText + ", endPrimaryText=" + this.endPrimaryText + ", endSecondaryText=" + this.endSecondaryText + ")";
    }

    public PendingData(Type type2, UUID id, StringResource startPrimaryText, StringResource stringResource, StringResource stringResource2, StringResource stringResource3) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startPrimaryText, "startPrimaryText");
        this.type = type2;
        this.id = id;
        this.startPrimaryText = startPrimaryText;
        this.startSecondaryText = stringResource;
        this.endPrimaryText = stringResource2;
        this.endSecondaryText = stringResource3;
    }

    public final Type getType() {
        return this.type;
    }

    public final UUID getId() {
        return this.id;
    }

    public final StringResource getStartPrimaryText() {
        return this.startPrimaryText;
    }

    public final StringResource getStartSecondaryText() {
        return this.startSecondaryText;
    }

    public final StringResource getEndPrimaryText() {
        return this.endPrimaryText;
    }

    public final StringResource getEndSecondaryText() {
        return this.endSecondaryText;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PendingData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/rows/PendingData$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER", "TRANSFER", "STAKING", "PERPETUAL_ORDER", "PERPETUAL_MARGIN_EDIT", "lib-pending-rows_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ORDER = new Type("ORDER", 0);
        public static final Type TRANSFER = new Type("TRANSFER", 1);
        public static final Type STAKING = new Type("STAKING", 2);
        public static final Type PERPETUAL_ORDER = new Type("PERPETUAL_ORDER", 3);
        public static final Type PERPETUAL_MARGIN_EDIT = new Type("PERPETUAL_MARGIN_EDIT", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ORDER, TRANSFER, STAKING, PERPETUAL_ORDER, PERPETUAL_MARGIN_EDIT};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
