package hippo.model.p469v1;

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
import hippo.model.p469v1.UXFlagMetadataDto;
import hippo.model.p469v1.UXFlagNameDto;
import hippo.model.p469v1.UXFlagTypeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: UXFlagDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018¨\u00060"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/UXFlag;", "Landroid/os/Parcelable;", "Lhippo/model/v1/UXFlagDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/UXFlagDto$Surrogate;)V", "Lhippo/model/v1/UXFlagNameDto;", "name", "", "value", "Lhippo/model/v1/UXFlagTypeDto;", "flag_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lhippo/model/v1/UXFlagMetadataDto;", "metadata", "(Lhippo/model/v1/UXFlagNameDto;Ljava/lang/String;Lhippo/model/v1/UXFlagTypeDto;Lj$/time/Instant;Lj$/time/Instant;Lhippo/model/v1/UXFlagMetadataDto;)V", "toProto", "()Lhippo/model/v1/UXFlag;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/UXFlagDto$Surrogate;", "getName", "()Lhippo/model/v1/UXFlagNameDto;", "getValue", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class UXFlagDto implements Dto3<UXFlag>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UXFlagDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UXFlagDto, UXFlag>> binaryBase64Serializer$delegate;
    private static final UXFlagDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UXFlagDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UXFlagDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UXFlagNameDto getName() {
        return this.surrogate.getName();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UXFlagDto(hippo.model.p469v1.UXFlagNameDto r2, java.lang.String r3, hippo.model.p469v1.UXFlagTypeDto r4, p479j$.time.Instant r5, p479j$.time.Instant r6, hippo.model.p469v1.UXFlagMetadataDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            hippo.model.v1.UXFlagNameDto$Companion r2 = hippo.model.p469v1.UXFlagNameDto.INSTANCE
            hippo.model.v1.UXFlagNameDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            java.lang.String r3 = ""
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            hippo.model.v1.UXFlagTypeDto$Companion r4 = hippo.model.p469v1.UXFlagTypeDto.INSTANCE
            hippo.model.v1.UXFlagTypeDto r4 = r4.getZeroValue()
        L1a:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L20
            r5 = r0
        L20:
            r9 = r8 & 16
            if (r9 == 0) goto L25
            r6 = r0
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hippo.model.p469v1.UXFlagDto.<init>(hippo.model.v1.UXFlagNameDto, java.lang.String, hippo.model.v1.UXFlagTypeDto, j$.time.Instant, j$.time.Instant, hippo.model.v1.UXFlagMetadataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UXFlagDto(UXFlagNameDto name, String value, UXFlagTypeDto flag_type, Instant instant, Instant instant2, UXFlagMetadataDto uXFlagMetadataDto) {
        this(new Surrogate(name, value, flag_type, instant, instant2, uXFlagMetadataDto));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(flag_type, "flag_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UXFlag toProto() {
        UXFlagName uXFlagName = (UXFlagName) this.surrogate.getName().toProto();
        String value = this.surrogate.getValue();
        UXFlagType uXFlagType = (UXFlagType) this.surrogate.getFlag_type().toProto();
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        UXFlagMetadataDto metadata = this.surrogate.getMetadata();
        return new UXFlag(uXFlagName, value, uXFlagType, created_at, updated_at, metadata != null ? metadata.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[UXFlagDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UXFlagDto) && Intrinsics.areEqual(((UXFlagDto) other).surrogate, this.surrogate);
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
    /* compiled from: UXFlagDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010-\u001a\u0004\b2\u00103RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010-\u001a\u0004\b6\u00107RF\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b:\u0010-\u001a\u0004\b9\u00107R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto$Surrogate;", "", "Lhippo/model/v1/UXFlagNameDto;", "name", "", "value", "Lhippo/model/v1/UXFlagTypeDto;", "flag_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "Lhippo/model/v1/UXFlagMetadataDto;", "metadata", "<init>", "(Lhippo/model/v1/UXFlagNameDto;Ljava/lang/String;Lhippo/model/v1/UXFlagTypeDto;Lj$/time/Instant;Lj$/time/Instant;Lhippo/model/v1/UXFlagMetadataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhippo/model/v1/UXFlagNameDto;Ljava/lang/String;Lhippo/model/v1/UXFlagTypeDto;Lj$/time/Instant;Lj$/time/Instant;Lhippo/model/v1/UXFlagMetadataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/UXFlagDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhippo/model/v1/UXFlagNameDto;", "getName", "()Lhippo/model/v1/UXFlagNameDto;", "getName$annotations", "()V", "Ljava/lang/String;", "getValue", "getValue$annotations", "Lhippo/model/v1/UXFlagTypeDto;", "getFlag_type", "()Lhippo/model/v1/UXFlagTypeDto;", "getFlag_type$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lhippo/model/v1/UXFlagMetadataDto;", "getMetadata", "()Lhippo/model/v1/UXFlagMetadataDto;", "getMetadata$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant created_at;
        private final UXFlagTypeDto flag_type;
        private final UXFlagMetadataDto metadata;
        private final UXFlagNameDto name;
        private final Instant updated_at;
        private final String value;

        public Surrogate() {
            this((UXFlagNameDto) null, (String) null, (UXFlagTypeDto) null, (Instant) null, (Instant) null, (UXFlagMetadataDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.name == surrogate.name && Intrinsics.areEqual(this.value, surrogate.value) && this.flag_type == surrogate.flag_type && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.metadata, surrogate.metadata);
        }

        public int hashCode() {
            int iHashCode = ((((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.flag_type.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            UXFlagMetadataDto uXFlagMetadataDto = this.metadata;
            return iHashCode3 + (uXFlagMetadataDto != null ? uXFlagMetadataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", value=" + this.value + ", flag_type=" + this.flag_type + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", metadata=" + this.metadata + ")";
        }

        /* compiled from: UXFlagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/UXFlagDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UXFlagDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UXFlagNameDto uXFlagNameDto, String str, UXFlagTypeDto uXFlagTypeDto, Instant instant, Instant instant2, UXFlagMetadataDto uXFlagMetadataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.name = (i & 1) == 0 ? UXFlagNameDto.INSTANCE.getZeroValue() : uXFlagNameDto;
            if ((i & 2) == 0) {
                this.value = "";
            } else {
                this.value = str;
            }
            if ((i & 4) == 0) {
                this.flag_type = UXFlagTypeDto.INSTANCE.getZeroValue();
            } else {
                this.flag_type = uXFlagTypeDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 32) == 0) {
                this.metadata = null;
            } else {
                this.metadata = uXFlagMetadataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.name != UXFlagNameDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, UXFlagNameDto.Serializer.INSTANCE, self.name);
            }
            if (!Intrinsics.areEqual(self.value, "")) {
                output.encodeStringElement(serialDesc, 1, self.value);
            }
            if (self.flag_type != UXFlagTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, UXFlagTypeDto.Serializer.INSTANCE, self.flag_type);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant2);
            }
            UXFlagMetadataDto uXFlagMetadataDto = self.metadata;
            if (uXFlagMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UXFlagMetadataDto.Serializer.INSTANCE, uXFlagMetadataDto);
            }
        }

        public Surrogate(UXFlagNameDto name, String value, UXFlagTypeDto flag_type, Instant instant, Instant instant2, UXFlagMetadataDto uXFlagMetadataDto) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(flag_type, "flag_type");
            this.name = name;
            this.value = value;
            this.flag_type = flag_type;
            this.created_at = instant;
            this.updated_at = instant2;
            this.metadata = uXFlagMetadataDto;
        }

        public final UXFlagNameDto getName() {
            return this.name;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(hippo.model.p469v1.UXFlagNameDto r2, java.lang.String r3, hippo.model.p469v1.UXFlagTypeDto r4, p479j$.time.Instant r5, p479j$.time.Instant r6, hippo.model.p469v1.UXFlagMetadataDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                hippo.model.v1.UXFlagNameDto$Companion r2 = hippo.model.p469v1.UXFlagNameDto.INSTANCE
                hippo.model.v1.UXFlagNameDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                java.lang.String r3 = ""
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L1a
                hippo.model.v1.UXFlagTypeDto$Companion r4 = hippo.model.p469v1.UXFlagTypeDto.INSTANCE
                hippo.model.v1.UXFlagTypeDto r4 = r4.getZeroValue()
            L1a:
                r9 = r8 & 8
                r0 = 0
                if (r9 == 0) goto L20
                r5 = r0
            L20:
                r9 = r8 & 16
                if (r9 == 0) goto L25
                r6 = r0
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hippo.model.p469v1.UXFlagDto.Surrogate.<init>(hippo.model.v1.UXFlagNameDto, java.lang.String, hippo.model.v1.UXFlagTypeDto, j$.time.Instant, j$.time.Instant, hippo.model.v1.UXFlagMetadataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getValue() {
            return this.value;
        }

        public final UXFlagTypeDto getFlag_type() {
            return this.flag_type;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final UXFlagMetadataDto getMetadata() {
            return this.metadata;
        }
    }

    /* compiled from: UXFlagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/UXFlagDto;", "Lhippo/model/v1/UXFlag;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/UXFlagDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UXFlagDto, UXFlag> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UXFlagDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UXFlagDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UXFlagDto> getBinaryBase64Serializer() {
            return (KSerializer) UXFlagDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UXFlag> getProtoAdapter() {
            return UXFlag.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UXFlagDto getZeroValue() {
            return UXFlagDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UXFlagDto fromProto(UXFlag proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UXFlagNameDto uXFlagNameDtoFromProto = UXFlagNameDto.INSTANCE.fromProto(proto.getName());
            String value = proto.getValue();
            UXFlagTypeDto uXFlagTypeDtoFromProto = UXFlagTypeDto.INSTANCE.fromProto(proto.getFlag_type());
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            UXFlagMetadata metadata = proto.getMetadata();
            return new UXFlagDto(new Surrogate(uXFlagNameDtoFromProto, value, uXFlagTypeDtoFromProto, created_at, updated_at, metadata != null ? UXFlagMetadataDto.INSTANCE.fromProto(metadata) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.UXFlagDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UXFlagDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UXFlagDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UXFlagDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/UXFlagDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/UXFlagDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UXFlagDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.UXFlag", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UXFlagDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UXFlagDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UXFlagDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UXFlagDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/UXFlagDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "hippo.model.v1.UXFlagDto";
        }
    }
}
