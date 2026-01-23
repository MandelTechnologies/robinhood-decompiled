package microgram.contracts.money_movement.form_entry.proto.p500v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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
import microgram.contracts.money_movement.form_entry.proto.p500v1.EntryTypeInfoDto;

/* compiled from: FormInputDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJA\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInput;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;)V", "", "header", "placeholder", "type", "value", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "entry_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;)Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "toProto", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInput;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;", "getHeader", "getPlaceholder", "getType", "getValue", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class FormInputDto implements Dto3<FormInput>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FormInputDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FormInputDto, FormInput>> binaryBase64Serializer$delegate;
    private static final FormInputDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FormInputDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FormInputDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeader() {
        return this.surrogate.getHeader();
    }

    public final String getPlaceholder() {
        return this.surrogate.getPlaceholder();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    public /* synthetic */ FormInputDto(String str, String str2, String str3, String str4, EntryTypeInfoDto entryTypeInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : entryTypeInfoDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormInputDto(String header, String placeholder, String type2, String value, EntryTypeInfoDto entryTypeInfoDto) {
        this(new Surrogate(header, placeholder, type2, value, entryTypeInfoDto));
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static /* synthetic */ FormInputDto copy$default(FormInputDto formInputDto, String str, String str2, String str3, String str4, EntryTypeInfoDto entryTypeInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formInputDto.surrogate.getHeader();
        }
        if ((i & 2) != 0) {
            str2 = formInputDto.surrogate.getPlaceholder();
        }
        if ((i & 4) != 0) {
            str3 = formInputDto.surrogate.getType();
        }
        if ((i & 8) != 0) {
            str4 = formInputDto.surrogate.getValue();
        }
        if ((i & 16) != 0) {
            entryTypeInfoDto = formInputDto.surrogate.getEntry_type();
        }
        EntryTypeInfoDto entryTypeInfoDto2 = entryTypeInfoDto;
        String str5 = str3;
        return formInputDto.copy(str, str2, str5, str4, entryTypeInfoDto2);
    }

    public final FormInputDto copy(String header, String placeholder, String type2, String value, EntryTypeInfoDto entry_type) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new FormInputDto(new Surrogate(header, placeholder, type2, value, entry_type));
    }

    @Override // com.robinhood.idl.Dto
    public FormInput toProto() {
        String header = this.surrogate.getHeader();
        String placeholder = this.surrogate.getPlaceholder();
        String type2 = this.surrogate.getType();
        String value = this.surrogate.getValue();
        EntryTypeInfoDto entry_type = this.surrogate.getEntry_type();
        return new FormInput(header, placeholder, type2, value, entry_type != null ? entry_type.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[FormInputDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FormInputDto) && Intrinsics.areEqual(((FormInputDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FormInputDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;", "", "", "header", "placeholder", "type", "value", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "entry_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_money_movement_form_entry_proto_v1_externalRelease", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "getPlaceholder", "getPlaceholder$annotations", "getType", "getType$annotations", "getValue", "getValue$annotations", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "getEntry_type", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "getEntry_type$annotations", "Companion", "$serializer", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EntryTypeInfoDto entry_type;
        private final String header;
        private final String placeholder;
        private final String type;
        private final String value;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (EntryTypeInfoDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.placeholder, surrogate.placeholder) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.entry_type, surrogate.entry_type);
        }

        public int hashCode() {
            int iHashCode = ((((((this.header.hashCode() * 31) + this.placeholder.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode()) * 31;
            EntryTypeInfoDto entryTypeInfoDto = this.entry_type;
            return iHashCode + (entryTypeInfoDto == null ? 0 : entryTypeInfoDto.hashCode());
        }

        public String toString() {
            return "Surrogate(header=" + this.header + ", placeholder=" + this.placeholder + ", type=" + this.type + ", value=" + this.value + ", entry_type=" + this.entry_type + ")";
        }

        /* compiled from: FormInputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FormInputDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, EntryTypeInfoDto entryTypeInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.header = "";
            } else {
                this.header = str;
            }
            if ((i & 2) == 0) {
                this.placeholder = "";
            } else {
                this.placeholder = str2;
            }
            if ((i & 4) == 0) {
                this.type = "";
            } else {
                this.type = str3;
            }
            if ((i & 8) == 0) {
                this.value = "";
            } else {
                this.value = str4;
            }
            if ((i & 16) == 0) {
                this.entry_type = null;
            } else {
                this.entry_type = entryTypeInfoDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_money_movement_form_entry_proto_v1_externalRelease */
        public static final /* synthetic */ void m3793x72ce6c3b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.header, "")) {
                output.encodeStringElement(serialDesc, 0, self.header);
            }
            if (!Intrinsics.areEqual(self.placeholder, "")) {
                output.encodeStringElement(serialDesc, 1, self.placeholder);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 2, self.type);
            }
            if (!Intrinsics.areEqual(self.value, "")) {
                output.encodeStringElement(serialDesc, 3, self.value);
            }
            EntryTypeInfoDto entryTypeInfoDto = self.entry_type;
            if (entryTypeInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EntryTypeInfoDto.Serializer.INSTANCE, entryTypeInfoDto);
            }
        }

        public Surrogate(String header, String placeholder, String type2, String value, EntryTypeInfoDto entryTypeInfoDto) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.header = header;
            this.placeholder = placeholder;
            this.type = type2;
            this.value = value;
            this.entry_type = entryTypeInfoDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, EntryTypeInfoDto entryTypeInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : entryTypeInfoDto);
        }

        public final String getHeader() {
            return this.header;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public final EntryTypeInfoDto getEntry_type() {
            return this.entry_type;
        }
    }

    /* compiled from: FormInputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInput;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FormInputDto, FormInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FormInputDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FormInputDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FormInputDto> getBinaryBase64Serializer() {
            return (KSerializer) FormInputDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FormInput> getProtoAdapter() {
            return FormInput.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FormInputDto getZeroValue() {
            return FormInputDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FormInputDto fromProto(FormInput proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String header = proto.getHeader();
            String placeholder = proto.getPlaceholder();
            String type2 = proto.getType();
            String value = proto.getValue();
            EntryTypeInfo entry_type = proto.getEntry_type();
            return new FormInputDto(new Surrogate(header, placeholder, type2, value, entry_type != null ? EntryTypeInfoDto.INSTANCE.fromProto(entry_type) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.form_entry.proto.v1.FormInputDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FormInputDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FormInputDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FormInputDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FormInputDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.money_movement.form_entry.proto.v1.FormInput", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FormInputDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FormInputDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FormInputDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FormInputDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "microgram.contracts.money_movement.form_entry.proto.v1.FormInputDto";
        }
    }
}
