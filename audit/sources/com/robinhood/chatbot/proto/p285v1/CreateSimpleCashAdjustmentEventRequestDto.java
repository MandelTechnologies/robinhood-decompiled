package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.CreateSimpleCashAdjustmentEventRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.squareup.wire.ProtoAdapter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
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

/* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011JN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate;)V", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "amount", "description", "direction", "account_id", "", "additional_fields", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "getConfiguration", "()Ljava/lang/String;", "getAmount", "getDescription", "getDirection", "getAccount_id", "()J", "getAdditional_fields", "()Ljava/util/Map;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CreateSimpleCashAdjustmentEventRequestDto implements Dto3<CreateSimpleCashAdjustmentEventRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateSimpleCashAdjustmentEventRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateSimpleCashAdjustmentEventRequestDto, CreateSimpleCashAdjustmentEventRequest>> binaryBase64Serializer$delegate;
    private static final CreateSimpleCashAdjustmentEventRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateSimpleCashAdjustmentEventRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateSimpleCashAdjustmentEventRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getConfiguration() {
        return this.surrogate.getConfiguration();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getDirection() {
        return this.surrogate.getDirection();
    }

    public final long getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final Map<String, ?> getAdditional_fields() {
        return this.surrogate.getAdditional_fields();
    }

    public /* synthetic */ CreateSimpleCashAdjustmentEventRequestDto(String str, String str2, String str3, String str4, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateSimpleCashAdjustmentEventRequestDto(String configuration, String amount, String description, String direction, long j, Map<String, ?> map) {
        this(new Surrogate(configuration, amount, description, direction, j, map));
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public static /* synthetic */ CreateSimpleCashAdjustmentEventRequestDto copy$default(CreateSimpleCashAdjustmentEventRequestDto createSimpleCashAdjustmentEventRequestDto, String str, String str2, String str3, String str4, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSimpleCashAdjustmentEventRequestDto.surrogate.getConfiguration();
        }
        if ((i & 2) != 0) {
            str2 = createSimpleCashAdjustmentEventRequestDto.surrogate.getAmount();
        }
        if ((i & 4) != 0) {
            str3 = createSimpleCashAdjustmentEventRequestDto.surrogate.getDescription();
        }
        if ((i & 8) != 0) {
            str4 = createSimpleCashAdjustmentEventRequestDto.surrogate.getDirection();
        }
        if ((i & 16) != 0) {
            j = createSimpleCashAdjustmentEventRequestDto.surrogate.getAccount_id();
        }
        if ((i & 32) != 0) {
            map = createSimpleCashAdjustmentEventRequestDto.surrogate.getAdditional_fields();
        }
        Map map2 = map;
        long j2 = j;
        return createSimpleCashAdjustmentEventRequestDto.copy(str, str2, str3, str4, j2, map2);
    }

    public final CreateSimpleCashAdjustmentEventRequestDto copy(String configuration, String amount, String description, String direction, long account_id, Map<String, ?> additional_fields) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new CreateSimpleCashAdjustmentEventRequestDto(new Surrogate(configuration, amount, description, direction, account_id, additional_fields));
    }

    @Override // com.robinhood.idl.Dto
    public CreateSimpleCashAdjustmentEventRequest toProto() {
        return new CreateSimpleCashAdjustmentEventRequest(this.surrogate.getConfiguration(), this.surrogate.getAmount(), this.surrogate.getDescription(), this.surrogate.getDirection(), this.surrogate.getAccount_id(), this.surrogate.getAdditional_fields(), null, 64, null);
    }

    public String toString() {
        return "[CreateSimpleCashAdjustmentEventRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateSimpleCashAdjustmentEventRequestDto) && Intrinsics.areEqual(((CreateSimpleCashAdjustmentEventRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012'\b\u0002\u0010\f\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0018\u0010*\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J(\u0010+\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e\u0018\u00010\rHÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2'\b\u0002\u0010\f\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0012HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R;\u0010\f\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%¨\u0006<"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "amount", "description", "direction", "account_id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "additional_fields", "", "Lcom/robinhood/idl/serialization/StructSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConfiguration$annotations", "()V", "getConfiguration", "()Ljava/lang/String;", "getAmount$annotations", "getAmount", "getDescription$annotations", "getDescription", "getDirection$annotations", "getDirection", "getAccount_id$annotations", "getAccount_id", "()J", "getAdditional_fields$annotations", "getAdditional_fields", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final long account_id;
        private final Map<String, Object> additional_fields;
        private final String amount;
        private final String configuration;
        private final String description;
        private final String direction;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.CreateSimpleCashAdjustmentEventRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateSimpleCashAdjustmentEventRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 0L, (Map) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, long j, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.configuration;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.amount;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.description;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.direction;
            }
            if ((i & 16) != 0) {
                j = surrogate.account_id;
            }
            if ((i & 32) != 0) {
                map = surrogate.additional_fields;
            }
            Map map2 = map;
            long j2 = j;
            return surrogate.copy(str, str2, str3, str4, j2, map2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("additionalFields")
        @JsonAnnotations2(names = {"additional_fields"})
        public static /* synthetic */ void getAdditional_fields$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName(EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION)
        @JsonAnnotations2(names = {EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION})
        public static /* synthetic */ void getConfiguration$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component5, reason: from getter */
        public final long getAccount_id() {
            return this.account_id;
        }

        public final Map<String, Object> component6() {
            return this.additional_fields;
        }

        public final Surrogate copy(String configuration, String amount, String description, String direction, long account_id, Map<String, ? extends Object> additional_fields) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new Surrogate(configuration, amount, description, direction, account_id, additional_fields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.configuration, surrogate.configuration) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.direction, surrogate.direction) && this.account_id == surrogate.account_id && Intrinsics.areEqual(this.additional_fields, surrogate.additional_fields);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.configuration.hashCode() * 31) + this.amount.hashCode()) * 31) + this.description.hashCode()) * 31) + this.direction.hashCode()) * 31) + Long.hashCode(this.account_id)) * 31;
            Map<String, Object> map = this.additional_fields;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Surrogate(configuration=" + this.configuration + ", amount=" + this.amount + ", description=" + this.description + ", direction=" + this.direction + ", account_id=" + this.account_id + ", additional_fields=" + this.additional_fields + ")";
        }

        /* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateSimpleCashAdjustmentEventRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, long j, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.configuration = "";
            } else {
                this.configuration = str;
            }
            if ((i & 2) == 0) {
                this.amount = "";
            } else {
                this.amount = str2;
            }
            if ((i & 4) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 8) == 0) {
                this.direction = "";
            } else {
                this.direction = str4;
            }
            if ((i & 16) == 0) {
                this.account_id = 0L;
            } else {
                this.account_id = j;
            }
            if ((i & 32) == 0) {
                this.additional_fields = null;
            } else {
                this.additional_fields = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.configuration, "")) {
                output.encodeStringElement(serialDesc, 0, self.configuration);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 1, self.amount);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 2, self.description);
            }
            if (!Intrinsics.areEqual(self.direction, "")) {
                output.encodeStringElement(serialDesc, 3, self.direction);
            }
            long j = self.account_id;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (self.additional_fields != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.additional_fields);
            }
        }

        public Surrogate(String configuration, String amount, String description, String direction, long j, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.configuration = configuration;
            this.amount = amount;
            this.description = description;
            this.direction = direction;
            this.account_id = j;
            this.additional_fields = map;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : map);
        }

        public final String getConfiguration() {
            return this.configuration;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDirection() {
            return this.direction;
        }

        public final long getAccount_id() {
            return this.account_id;
        }

        public final Map<String, Object> getAdditional_fields() {
            return this.additional_fields;
        }
    }

    /* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CreateSimpleCashAdjustmentEventRequestDto, CreateSimpleCashAdjustmentEventRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateSimpleCashAdjustmentEventRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateSimpleCashAdjustmentEventRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateSimpleCashAdjustmentEventRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateSimpleCashAdjustmentEventRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateSimpleCashAdjustmentEventRequest> getProtoAdapter() {
            return CreateSimpleCashAdjustmentEventRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateSimpleCashAdjustmentEventRequestDto getZeroValue() {
            return CreateSimpleCashAdjustmentEventRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateSimpleCashAdjustmentEventRequestDto fromProto(CreateSimpleCashAdjustmentEventRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CreateSimpleCashAdjustmentEventRequestDto(new Surrogate(proto.getConfiguration(), proto.getAmount(), proto.getDescription(), proto.getDirection(), proto.getAccount_id(), proto.getAdditional_fields()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.CreateSimpleCashAdjustmentEventRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateSimpleCashAdjustmentEventRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateSimpleCashAdjustmentEventRequestDto(null, null, null, null, 0L, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateSimpleCashAdjustmentEventRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.CreateSimpleCashAdjustmentEventRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateSimpleCashAdjustmentEventRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateSimpleCashAdjustmentEventRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateSimpleCashAdjustmentEventRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateSimpleCashAdjustmentEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.CreateSimpleCashAdjustmentEventRequestDto";
        }
    }
}
