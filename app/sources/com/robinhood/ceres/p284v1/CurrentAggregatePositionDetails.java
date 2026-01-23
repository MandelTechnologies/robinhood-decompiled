package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: CurrentAggregatePositionDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B3\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J2\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetails;", "Lcom/squareup/wire/Message;", "", "contract_id_to_position_details_map", "", "", "Lcom/robinhood/ceres/v1/PositionDetails;", "closed_contract_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "getClosed_contract_id", "()Ljava/lang/String;", "getContract_id_to_position_details_map", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CurrentAggregatePositionDetails extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closedContractId", schemaIndex = 1, tag = 2)
    private final String closed_contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.PositionDetails#ADAPTER", jsonName = "contractIdToPositionDetailsMap", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final Map<String, PositionDetails> contract_id_to_position_details_map;

    @JvmField
    public static final ProtoAdapter<CurrentAggregatePositionDetails> ADAPTER = new CurrentAggregatePositionDetails2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(CurrentAggregatePositionDetails.class), Syntax.PROTO_3);

    public CurrentAggregatePositionDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20292newBuilder();
    }

    public /* synthetic */ CurrentAggregatePositionDetails(Map map, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getClosed_contract_id() {
        return this.closed_contract_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentAggregatePositionDetails(Map<String, PositionDetails> contract_id_to_position_details_map, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id_to_position_details_map, "contract_id_to_position_details_map");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.closed_contract_id = str;
        this.contract_id_to_position_details_map = Internal.immutableCopyOf("contract_id_to_position_details_map", contract_id_to_position_details_map);
    }

    public final Map<String, PositionDetails> getContract_id_to_position_details_map() {
        return this.contract_id_to_position_details_map;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20292newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrentAggregatePositionDetails)) {
            return false;
        }
        CurrentAggregatePositionDetails currentAggregatePositionDetails = (CurrentAggregatePositionDetails) other;
        return Intrinsics.areEqual(unknownFields(), currentAggregatePositionDetails.unknownFields()) && Intrinsics.areEqual(this.contract_id_to_position_details_map, currentAggregatePositionDetails.contract_id_to_position_details_map) && Intrinsics.areEqual(this.closed_contract_id, currentAggregatePositionDetails.closed_contract_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.contract_id_to_position_details_map.hashCode()) * 37;
        String str = this.closed_contract_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.contract_id_to_position_details_map.isEmpty()) {
            arrayList.add("contract_id_to_position_details_map=" + this.contract_id_to_position_details_map);
        }
        String str = this.closed_contract_id;
        if (str != null) {
            arrayList.add("closed_contract_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrentAggregatePositionDetails{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentAggregatePositionDetails copy$default(CurrentAggregatePositionDetails currentAggregatePositionDetails, Map map, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = currentAggregatePositionDetails.contract_id_to_position_details_map;
        }
        if ((i & 2) != 0) {
            str = currentAggregatePositionDetails.closed_contract_id;
        }
        if ((i & 4) != 0) {
            byteString = currentAggregatePositionDetails.unknownFields();
        }
        return currentAggregatePositionDetails.copy(map, str, byteString);
    }

    public final CurrentAggregatePositionDetails copy(Map<String, PositionDetails> contract_id_to_position_details_map, String closed_contract_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id_to_position_details_map, "contract_id_to_position_details_map");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrentAggregatePositionDetails(contract_id_to_position_details_map, closed_contract_id, unknownFields);
    }
}
