package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ClearingGatewayEventDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ClearingGatewayEventDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;)V", "id", "", "type", "account_id", "", "final_clearing_status", "additional_fields", "", "record_date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getAccount_id", "()Ljava/lang/Long;", "getFinal_clearing_status", "getAdditional_fields", "()Ljava/util/Map;", "getRecord_date", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto;", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ClearingGatewayEventDto implements Dto3<ClearingGatewayEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClearingGatewayEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClearingGatewayEventDto, ClearingGatewayEvent>> binaryBase64Serializer$delegate;
    private static final ClearingGatewayEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClearingGatewayEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClearingGatewayEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final Long getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getFinal_clearing_status() {
        return this.surrogate.getFinal_clearing_status();
    }

    public final Map<String, ?> getAdditional_fields() {
        return this.surrogate.getAdditional_fields();
    }

    public final String getRecord_date() {
        return this.surrogate.getRecord_date();
    }

    public /* synthetic */ ClearingGatewayEventDto(String str, String str2, Long l, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : map, (i & 32) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClearingGatewayEventDto(String id, String type2, Long l, String final_clearing_status, Map<String, ?> map, String record_date) {
        this(new Surrogate(id, type2, l, final_clearing_status, map, record_date));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
    }

    public static /* synthetic */ ClearingGatewayEventDto copy$default(ClearingGatewayEventDto clearingGatewayEventDto, String str, String str2, Long l, String str3, Map map, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clearingGatewayEventDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = clearingGatewayEventDto.surrogate.getType();
        }
        if ((i & 4) != 0) {
            l = clearingGatewayEventDto.surrogate.getAccount_id();
        }
        if ((i & 8) != 0) {
            str3 = clearingGatewayEventDto.surrogate.getFinal_clearing_status();
        }
        if ((i & 16) != 0) {
            map = clearingGatewayEventDto.surrogate.getAdditional_fields();
        }
        if ((i & 32) != 0) {
            str4 = clearingGatewayEventDto.surrogate.getRecord_date();
        }
        Map map2 = map;
        String str5 = str4;
        return clearingGatewayEventDto.copy(str, str2, l, str3, map2, str5);
    }

    public final ClearingGatewayEventDto copy(String id, String type2, Long account_id, String final_clearing_status, Map<String, ?> additional_fields, String record_date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        return new ClearingGatewayEventDto(new Surrogate(id, type2, account_id, final_clearing_status, additional_fields, record_date));
    }

    @Override // com.robinhood.idl.Dto
    public ClearingGatewayEvent toProto() {
        return new ClearingGatewayEvent(this.surrogate.getId(), this.surrogate.getType(), this.surrogate.getAccount_id(), this.surrogate.getFinal_clearing_status(), this.surrogate.getAdditional_fields(), this.surrogate.getRecord_date(), null, 64, null);
    }

    public String toString() {
        return "[ClearingGatewayEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClearingGatewayEventDto) && Intrinsics.areEqual(((ClearingGatewayEventDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClearingGatewayEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002<=Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012'\b\u0002\u0010\u000b\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010Be\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u001f\u0010)\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J(\u0010+\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\r\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jz\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u00032'\b\u0002\u0010\u000b\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0012HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R/\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R;\u0010\u000b\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019¨\u0006>"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;", "", "id", "", "type", "account_id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "final_clearing_status", "additional_fields", "", "Lcom/robinhood/idl/serialization/StructSerializer;", "record_date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getType$annotations", "getType", "getAccount_id$annotations", "getAccount_id", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFinal_clearing_status$annotations", "getFinal_clearing_status", "getAdditional_fields$annotations", "getAdditional_fields", "()Ljava/util/Map;", "getRecord_date$annotations", "getRecord_date", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final Long account_id;
        private final Map<String, Object> additional_fields;
        private final String final_clearing_status;
        private final String id;
        private final String record_date;
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.ClearingGatewayEventDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClearingGatewayEventDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Long l, String str3, Map map, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.type;
            }
            if ((i & 4) != 0) {
                l = surrogate.account_id;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.final_clearing_status;
            }
            if ((i & 16) != 0) {
                map = surrogate.additional_fields;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.record_date;
            }
            Map map2 = map;
            String str5 = str4;
            return surrogate.copy(str, str2, l, str3, map2, str5);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("additionalFields")
        @JsonAnnotations2(names = {"additional_fields"})
        public static /* synthetic */ void getAdditional_fields$annotations() {
        }

        @SerialName("finalClearingStatus")
        @JsonAnnotations2(names = {"final_clearing_status"})
        public static /* synthetic */ void getFinal_clearing_status$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("recordDate")
        @JsonAnnotations2(names = {"record_date"})
        public static /* synthetic */ void getRecord_date$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFinal_clearing_status() {
            return this.final_clearing_status;
        }

        public final Map<String, Object> component5() {
            return this.additional_fields;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRecord_date() {
            return this.record_date;
        }

        public final Surrogate copy(String id, String type2, Long account_id, String final_clearing_status, Map<String, ? extends Object> additional_fields, String record_date) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
            Intrinsics.checkNotNullParameter(record_date, "record_date");
            return new Surrogate(id, type2, account_id, final_clearing_status, additional_fields, record_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.final_clearing_status, surrogate.final_clearing_status) && Intrinsics.areEqual(this.additional_fields, surrogate.additional_fields) && Intrinsics.areEqual(this.record_date, surrogate.record_date);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.type.hashCode()) * 31;
            Long l = this.account_id;
            int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.final_clearing_status.hashCode()) * 31;
            Map<String, Object> map = this.additional_fields;
            return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.record_date.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", type=" + this.type + ", account_id=" + this.account_id + ", final_clearing_status=" + this.final_clearing_status + ", additional_fields=" + this.additional_fields + ", record_date=" + this.record_date + ")";
        }

        /* compiled from: ClearingGatewayEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClearingGatewayEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Long l, String str3, Map map, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.type = "";
            } else {
                this.type = str2;
            }
            if ((i & 4) == 0) {
                this.account_id = null;
            } else {
                this.account_id = l;
            }
            if ((i & 8) == 0) {
                this.final_clearing_status = "";
            } else {
                this.final_clearing_status = str3;
            }
            if ((i & 16) == 0) {
                this.additional_fields = null;
            } else {
                this.additional_fields = map;
            }
            if ((i & 32) == 0) {
                this.record_date = "";
            } else {
                this.record_date = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 1, self.type);
            }
            Long l = self.account_id;
            if (l != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, l);
            }
            if (!Intrinsics.areEqual(self.final_clearing_status, "")) {
                output.encodeStringElement(serialDesc, 3, self.final_clearing_status);
            }
            if (self.additional_fields != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.additional_fields);
            }
            if (Intrinsics.areEqual(self.record_date, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.record_date);
        }

        public Surrogate(String id, String type2, Long l, String final_clearing_status, Map<String, ? extends Object> map, String record_date) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(final_clearing_status, "final_clearing_status");
            Intrinsics.checkNotNullParameter(record_date, "record_date");
            this.id = id;
            this.type = type2;
            this.account_id = l;
            this.final_clearing_status = final_clearing_status;
            this.additional_fields = map;
            this.record_date = record_date;
        }

        public /* synthetic */ Surrogate(String str, String str2, Long l, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : map, (i & 32) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public final Long getAccount_id() {
            return this.account_id;
        }

        public final String getFinal_clearing_status() {
            return this.final_clearing_status;
        }

        public final Map<String, Object> getAdditional_fields() {
            return this.additional_fields;
        }

        public final String getRecord_date() {
            return this.record_date;
        }
    }

    /* compiled from: ClearingGatewayEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto;", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClearingGatewayEventDto, ClearingGatewayEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClearingGatewayEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClearingGatewayEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClearingGatewayEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClearingGatewayEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClearingGatewayEvent> getProtoAdapter() {
            return ClearingGatewayEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClearingGatewayEventDto getZeroValue() {
            return ClearingGatewayEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClearingGatewayEventDto fromProto(ClearingGatewayEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClearingGatewayEventDto(new Surrogate(proto.getId(), proto.getType(), proto.getAccount_id(), proto.getFinal_clearing_status(), proto.getAdditional_fields(), proto.getRecord_date()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.ClearingGatewayEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClearingGatewayEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClearingGatewayEventDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClearingGatewayEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ClearingGatewayEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.ClearingGatewayEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClearingGatewayEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClearingGatewayEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClearingGatewayEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClearingGatewayEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ClearingGatewayEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.ClearingGatewayEventDto";
        }
    }
}
