package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;

/* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010,R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010,R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010,R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;)V", "", "appointment_enabled", "", "appointment_message_override", "chat_enabled", "chat_message_override", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "chat_start_time", "chat_end_time", "is_half_day", "is_weekend", "is_holiday", "chat_hidden", "disclosure_contentful_id", "(ZLjava/lang/String;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZZLjava/lang/String;)V", "toProto", "()Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;", "getAppointment_enabled", "()Z", "getChat_enabled", "getChat_start_time", "()Lj$/time/Instant;", "getChat_end_time", "getChat_hidden", "getDisclosure_contentful_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class KnowledgeCheckNeededResponseMetadataDto implements Dto3<KnowledgeCheckNeededResponseMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<KnowledgeCheckNeededResponseMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<KnowledgeCheckNeededResponseMetadataDto, KnowledgeCheckNeededResponseMetadata>> binaryBase64Serializer$delegate;
    private static final KnowledgeCheckNeededResponseMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ KnowledgeCheckNeededResponseMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private KnowledgeCheckNeededResponseMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getAppointment_enabled() {
        return this.surrogate.getAppointment_enabled();
    }

    public final boolean getChat_enabled() {
        return this.surrogate.getChat_enabled();
    }

    public final Instant getChat_start_time() {
        return this.surrogate.getChat_start_time();
    }

    public final Instant getChat_end_time() {
        return this.surrogate.getChat_end_time();
    }

    public final boolean is_half_day() {
        return this.surrogate.getIs_half_day();
    }

    public final boolean is_weekend() {
        return this.surrogate.getIs_weekend();
    }

    public final boolean is_holiday() {
        return this.surrogate.getIs_holiday();
    }

    public final boolean getChat_hidden() {
        return this.surrogate.getChat_hidden();
    }

    public final String getDisclosure_contentful_id() {
        return this.surrogate.getDisclosure_contentful_id();
    }

    public /* synthetic */ KnowledgeCheckNeededResponseMetadataDto(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? null : instant2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KnowledgeCheckNeededResponseMetadataDto(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String disclosure_contentful_id) {
        this(new Surrogate(z, str, z2, str2, instant, instant2, z3, z4, z5, z6, disclosure_contentful_id));
        Intrinsics.checkNotNullParameter(disclosure_contentful_id, "disclosure_contentful_id");
    }

    @Override // com.robinhood.idl.Dto
    public KnowledgeCheckNeededResponseMetadata toProto() {
        return new KnowledgeCheckNeededResponseMetadata(this.surrogate.getAppointment_enabled(), this.surrogate.getAppointment_message_override(), this.surrogate.getChat_enabled(), this.surrogate.getChat_message_override(), this.surrogate.getChat_start_time(), this.surrogate.getChat_end_time(), this.surrogate.getIs_half_day(), this.surrogate.getIs_weekend(), this.surrogate.getIs_holiday(), this.surrogate.getChat_hidden(), this.surrogate.getDisclosure_contentful_id(), null, 2048, null);
    }

    public String toString() {
        return "[KnowledgeCheckNeededResponseMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof KnowledgeCheckNeededResponseMetadataDto) && Intrinsics.areEqual(((KnowledgeCheckNeededResponseMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBÅ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010%RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\b:\u0010/\u001a\u0004\b8\u00109RF\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b<\u0010/\u001a\u0004\b;\u00109R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010+\u0012\u0004\b=\u0010/\u001a\u0004\b\u000f\u0010-R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010+\u0012\u0004\b>\u0010/\u001a\u0004\b\u0010\u0010-R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010+\u0012\u0004\b?\u0010/\u001a\u0004\b\u0011\u0010-R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010+\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010-R \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00100\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010%¨\u0006F"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;", "", "", "appointment_enabled", "", "appointment_message_override", "chat_enabled", "chat_message_override", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "chat_start_time", "chat_end_time", "is_half_day", "is_weekend", "is_holiday", "chat_hidden", "disclosure_contentful_id", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAppointment_enabled", "()Z", "getAppointment_enabled$annotations", "()V", "Ljava/lang/String;", "getAppointment_message_override", "getAppointment_message_override$annotations", "getChat_enabled", "getChat_enabled$annotations", "getChat_message_override", "getChat_message_override$annotations", "Lj$/time/Instant;", "getChat_start_time", "()Lj$/time/Instant;", "getChat_start_time$annotations", "getChat_end_time", "getChat_end_time$annotations", "is_half_day$annotations", "is_weekend$annotations", "is_holiday$annotations", "getChat_hidden", "getChat_hidden$annotations", "getDisclosure_contentful_id", "getDisclosure_contentful_id$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean appointment_enabled;
        private final String appointment_message_override;
        private final boolean chat_enabled;
        private final Instant chat_end_time;
        private final boolean chat_hidden;
        private final String chat_message_override;
        private final Instant chat_start_time;
        private final String disclosure_contentful_id;
        private final boolean is_half_day;
        private final boolean is_holiday;
        private final boolean is_weekend;

        public Surrogate() {
            this(false, (String) null, false, (String) null, (Instant) null, (Instant) null, false, false, false, false, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.appointment_enabled == surrogate.appointment_enabled && Intrinsics.areEqual(this.appointment_message_override, surrogate.appointment_message_override) && this.chat_enabled == surrogate.chat_enabled && Intrinsics.areEqual(this.chat_message_override, surrogate.chat_message_override) && Intrinsics.areEqual(this.chat_start_time, surrogate.chat_start_time) && Intrinsics.areEqual(this.chat_end_time, surrogate.chat_end_time) && this.is_half_day == surrogate.is_half_day && this.is_weekend == surrogate.is_weekend && this.is_holiday == surrogate.is_holiday && this.chat_hidden == surrogate.chat_hidden && Intrinsics.areEqual(this.disclosure_contentful_id, surrogate.disclosure_contentful_id);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.appointment_enabled) * 31;
            String str = this.appointment_message_override;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.chat_enabled)) * 31;
            String str2 = this.chat_message_override;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Instant instant = this.chat_start_time;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.chat_end_time;
            return ((((((((((iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_half_day)) * 31) + Boolean.hashCode(this.is_weekend)) * 31) + Boolean.hashCode(this.is_holiday)) * 31) + Boolean.hashCode(this.chat_hidden)) * 31) + this.disclosure_contentful_id.hashCode();
        }

        public String toString() {
            return "Surrogate(appointment_enabled=" + this.appointment_enabled + ", appointment_message_override=" + this.appointment_message_override + ", chat_enabled=" + this.chat_enabled + ", chat_message_override=" + this.chat_message_override + ", chat_start_time=" + this.chat_start_time + ", chat_end_time=" + this.chat_end_time + ", is_half_day=" + this.is_half_day + ", is_weekend=" + this.is_weekend + ", is_holiday=" + this.is_holiday + ", chat_hidden=" + this.chat_hidden + ", disclosure_contentful_id=" + this.disclosure_contentful_id + ")";
        }

        /* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return KnowledgeCheckNeededResponseMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.appointment_enabled = false;
            } else {
                this.appointment_enabled = z;
            }
            if ((i & 2) == 0) {
                this.appointment_message_override = null;
            } else {
                this.appointment_message_override = str;
            }
            if ((i & 4) == 0) {
                this.chat_enabled = false;
            } else {
                this.chat_enabled = z2;
            }
            if ((i & 8) == 0) {
                this.chat_message_override = null;
            } else {
                this.chat_message_override = str2;
            }
            if ((i & 16) == 0) {
                this.chat_start_time = null;
            } else {
                this.chat_start_time = instant;
            }
            if ((i & 32) == 0) {
                this.chat_end_time = null;
            } else {
                this.chat_end_time = instant2;
            }
            if ((i & 64) == 0) {
                this.is_half_day = false;
            } else {
                this.is_half_day = z3;
            }
            if ((i & 128) == 0) {
                this.is_weekend = false;
            } else {
                this.is_weekend = z4;
            }
            if ((i & 256) == 0) {
                this.is_holiday = false;
            } else {
                this.is_holiday = z5;
            }
            if ((i & 512) == 0) {
                this.chat_hidden = false;
            } else {
                this.chat_hidden = z6;
            }
            if ((i & 1024) == 0) {
                this.disclosure_contentful_id = "";
            } else {
                this.disclosure_contentful_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.appointment_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            String str = self.appointment_message_override;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            boolean z2 = self.chat_enabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 2, z2);
            }
            String str2 = self.chat_message_override;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
            }
            Instant instant = self.chat_start_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.chat_end_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant2);
            }
            boolean z3 = self.is_half_day;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 6, z3);
            }
            boolean z4 = self.is_weekend;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 7, z4);
            }
            boolean z5 = self.is_holiday;
            if (z5) {
                output.encodeBooleanElement(serialDesc, 8, z5);
            }
            boolean z6 = self.chat_hidden;
            if (z6) {
                output.encodeBooleanElement(serialDesc, 9, z6);
            }
            if (Intrinsics.areEqual(self.disclosure_contentful_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 10, self.disclosure_contentful_id);
        }

        public Surrogate(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String disclosure_contentful_id) {
            Intrinsics.checkNotNullParameter(disclosure_contentful_id, "disclosure_contentful_id");
            this.appointment_enabled = z;
            this.appointment_message_override = str;
            this.chat_enabled = z2;
            this.chat_message_override = str2;
            this.chat_start_time = instant;
            this.chat_end_time = instant2;
            this.is_half_day = z3;
            this.is_weekend = z4;
            this.is_holiday = z5;
            this.chat_hidden = z6;
            this.disclosure_contentful_id = disclosure_contentful_id;
        }

        public final boolean getAppointment_enabled() {
            return this.appointment_enabled;
        }

        public final String getAppointment_message_override() {
            return this.appointment_message_override;
        }

        public final boolean getChat_enabled() {
            return this.chat_enabled;
        }

        public final String getChat_message_override() {
            return this.chat_message_override;
        }

        public final Instant getChat_start_time() {
            return this.chat_start_time;
        }

        public final Instant getChat_end_time() {
            return this.chat_end_time;
        }

        /* renamed from: is_half_day, reason: from getter */
        public final boolean getIs_half_day() {
            return this.is_half_day;
        }

        /* renamed from: is_weekend, reason: from getter */
        public final boolean getIs_weekend() {
            return this.is_weekend;
        }

        /* renamed from: is_holiday, reason: from getter */
        public final boolean getIs_holiday() {
            return this.is_holiday;
        }

        public final boolean getChat_hidden() {
            return this.chat_hidden;
        }

        public final String getDisclosure_contentful_id() {
            return this.disclosure_contentful_id;
        }

        public /* synthetic */ Surrogate(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? null : instant2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? "" : str3);
        }
    }

    /* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<KnowledgeCheckNeededResponseMetadataDto, KnowledgeCheckNeededResponseMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<KnowledgeCheckNeededResponseMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<KnowledgeCheckNeededResponseMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<KnowledgeCheckNeededResponseMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) KnowledgeCheckNeededResponseMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<KnowledgeCheckNeededResponseMetadata> getProtoAdapter() {
            return KnowledgeCheckNeededResponseMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public KnowledgeCheckNeededResponseMetadataDto getZeroValue() {
            return KnowledgeCheckNeededResponseMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public KnowledgeCheckNeededResponseMetadataDto fromProto(KnowledgeCheckNeededResponseMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new KnowledgeCheckNeededResponseMetadataDto(new Surrogate(proto.getAppointment_enabled(), proto.getAppointment_message_override(), proto.getChat_enabled(), proto.getChat_message_override(), proto.getChat_start_time(), proto.getChat_end_time(), proto.getIs_half_day(), proto.getIs_weekend(), proto.getIs_holiday(), proto.getChat_hidden(), proto.getDisclosure_contentful_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.KnowledgeCheckNeededResponseMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KnowledgeCheckNeededResponseMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new KnowledgeCheckNeededResponseMetadataDto(false, null, false, null, null, null, false, false, false, false, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<KnowledgeCheckNeededResponseMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.KnowledgeCheckNeededResponseMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, KnowledgeCheckNeededResponseMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public KnowledgeCheckNeededResponseMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new KnowledgeCheckNeededResponseMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: KnowledgeCheckNeededResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "options_product.service.KnowledgeCheckNeededResponseMetadataDto";
        }
    }
}
