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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.contracts.money_movement.form_entry.proto.p500v1.EntryTypeDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.EntryTypeInfoDto;

/* compiled from: EntryTypeInfoDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;)V", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;", "type", "", "", "dropdown_values", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;Ljava/util/List;)V", "toProto", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class EntryTypeInfoDto implements Dto3<EntryTypeInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EntryTypeInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EntryTypeInfoDto, EntryTypeInfo>> binaryBase64Serializer$delegate;
    private static final EntryTypeInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EntryTypeInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EntryTypeInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntryTypeInfoDto(EntryTypeDto entryTypeDto, List<String> dropdown_values) {
        this(new Surrogate(entryTypeDto, dropdown_values));
        Intrinsics.checkNotNullParameter(dropdown_values, "dropdown_values");
    }

    public /* synthetic */ EntryTypeInfoDto(EntryTypeDto entryTypeDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryTypeDto, (List<String>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EntryTypeInfo toProto() {
        EntryTypeDto type2 = this.surrogate.getType();
        EntryType entryType = type2 != null ? (EntryType) type2.toProto() : null;
        List<String> dropdown_values = this.surrogate.getDropdown_values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dropdown_values, 10));
        Iterator<T> it = dropdown_values.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new EntryTypeInfo(entryType, arrayList, null, 4, null);
    }

    public String toString() {
        return "[EntryTypeInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EntryTypeInfoDto) && Intrinsics.areEqual(((EntryTypeInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: EntryTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;", "", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;", "type", "", "", "dropdown_values", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_money_movement_form_entry_proto_v1_externalRelease", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;", "getType", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeDto;", "getType$annotations", "()V", "Ljava/util/List;", "getDropdown_values", "()Ljava/util/List;", "getDropdown_values$annotations", "Companion", "$serializer", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> dropdown_values;
        private final EntryTypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfoDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EntryTypeInfoDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((EntryTypeDto) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.dropdown_values, surrogate.dropdown_values);
        }

        public int hashCode() {
            EntryTypeDto entryTypeDto = this.type;
            return ((entryTypeDto == null ? 0 : entryTypeDto.hashCode()) * 31) + this.dropdown_values.hashCode();
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", dropdown_values=" + this.dropdown_values + ")";
        }

        /* compiled from: EntryTypeInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EntryTypeInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EntryTypeDto entryTypeDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? null : entryTypeDto;
            if ((i & 2) == 0) {
                this.dropdown_values = CollectionsKt.emptyList();
            } else {
                this.dropdown_values = list;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_money_movement_form_entry_proto_v1_externalRelease */
        public static final /* synthetic */ void m3792x72ce6c3b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            EntryTypeDto entryTypeDto = self.type;
            if (entryTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EntryTypeDto.Serializer.INSTANCE, entryTypeDto);
            }
            if (Intrinsics.areEqual(self.dropdown_values, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.dropdown_values);
        }

        public Surrogate(EntryTypeDto entryTypeDto, List<String> dropdown_values) {
            Intrinsics.checkNotNullParameter(dropdown_values, "dropdown_values");
            this.type = entryTypeDto;
            this.dropdown_values = dropdown_values;
        }

        public final EntryTypeDto getType() {
            return this.type;
        }

        public final List<String> getDropdown_values() {
            return this.dropdown_values;
        }

        public /* synthetic */ Surrogate(EntryTypeDto entryTypeDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entryTypeDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* compiled from: EntryTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EntryTypeInfoDto, EntryTypeInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EntryTypeInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EntryTypeInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EntryTypeInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) EntryTypeInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EntryTypeInfo> getProtoAdapter() {
            return EntryTypeInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EntryTypeInfoDto getZeroValue() {
            return EntryTypeInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EntryTypeInfoDto fromProto(EntryTypeInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EntryType type2 = proto.getType();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EntryTypeDto entryTypeDtoFromProto = type2 != null ? EntryTypeDto.INSTANCE.fromProto(type2) : null;
            List<String> dropdown_values = proto.getDropdown_values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dropdown_values, 10));
            Iterator<T> it = dropdown_values.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new EntryTypeInfoDto(new Surrogate(entryTypeDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EntryTypeInfoDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EntryTypeInfoDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EntryTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EntryTypeInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EntryTypeInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EntryTypeInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EntryTypeInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: EntryTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfoDto";
        }
    }
}
