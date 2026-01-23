package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetailsDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PlaidIdentityUpdateDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u0006\u0010\rJ*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate;)V", "user_uuid", "", "relationship_master_id", "fields_changed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getUser_uuid", "()Ljava/lang/String;", "getRelationship_master_id", "getFields_changed", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PlaidIdentityUpdateDetailsDto implements Dto3<PlaidIdentityUpdateDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidIdentityUpdateDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidIdentityUpdateDetailsDto, PlaidIdentityUpdateDetails>> binaryBase64Serializer$delegate;
    private static final PlaidIdentityUpdateDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidIdentityUpdateDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidIdentityUpdateDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getRelationship_master_id() {
        return this.surrogate.getRelationship_master_id();
    }

    public final List<String> getFields_changed() {
        return this.surrogate.getFields_changed();
    }

    public /* synthetic */ PlaidIdentityUpdateDetailsDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidIdentityUpdateDetailsDto(String user_uuid, String relationship_master_id, List<String> fields_changed) {
        this(new Surrogate(user_uuid, relationship_master_id, fields_changed));
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaidIdentityUpdateDetailsDto copy$default(PlaidIdentityUpdateDetailsDto plaidIdentityUpdateDetailsDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidIdentityUpdateDetailsDto.surrogate.getUser_uuid();
        }
        if ((i & 2) != 0) {
            str2 = plaidIdentityUpdateDetailsDto.surrogate.getRelationship_master_id();
        }
        if ((i & 4) != 0) {
            list = plaidIdentityUpdateDetailsDto.surrogate.getFields_changed();
        }
        return plaidIdentityUpdateDetailsDto.copy(str, str2, list);
    }

    public final PlaidIdentityUpdateDetailsDto copy(String user_uuid, String relationship_master_id, List<String> fields_changed) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
        return new PlaidIdentityUpdateDetailsDto(new Surrogate(user_uuid, relationship_master_id, fields_changed));
    }

    @Override // com.robinhood.idl.Dto
    public PlaidIdentityUpdateDetails toProto() {
        String user_uuid = this.surrogate.getUser_uuid();
        String relationship_master_id = this.surrogate.getRelationship_master_id();
        List<String> fields_changed = this.surrogate.getFields_changed();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields_changed, 10));
        Iterator<T> it = fields_changed.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new PlaidIdentityUpdateDetails(user_uuid, relationship_master_id, arrayList, null, 8, null);
    }

    public String toString() {
        return "[PlaidIdentityUpdateDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidIdentityUpdateDetailsDto) && Intrinsics.areEqual(((PlaidIdentityUpdateDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidIdentityUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate;", "", "user_uuid", "", "relationship_master_id", "fields_changed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_uuid$annotations", "()V", "getUser_uuid", "()Ljava/lang/String;", "getRelationship_master_id$annotations", "getRelationship_master_id", "getFields_changed$annotations", "getFields_changed", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> fields_changed;
        private final String relationship_master_id;
        private final String user_uuid;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidIdentityUpdateDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.user_uuid;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.relationship_master_id;
            }
            if ((i & 4) != 0) {
                list = surrogate.fields_changed;
            }
            return surrogate.copy(str, str2, list);
        }

        @SerialName("fieldsChanged")
        @JsonAnnotations2(names = {"fields_changed"})
        public static /* synthetic */ void getFields_changed$annotations() {
        }

        @SerialName("relationshipMasterId")
        @JsonAnnotations2(names = {"relationship_master_id"})
        public static /* synthetic */ void getRelationship_master_id$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRelationship_master_id() {
            return this.relationship_master_id;
        }

        public final List<String> component3() {
            return this.fields_changed;
        }

        public final Surrogate copy(String user_uuid, String relationship_master_id, List<String> fields_changed) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
            return new Surrogate(user_uuid, relationship_master_id, fields_changed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.relationship_master_id, surrogate.relationship_master_id) && Intrinsics.areEqual(this.fields_changed, surrogate.fields_changed);
        }

        public int hashCode() {
            return (((this.user_uuid.hashCode() * 31) + this.relationship_master_id.hashCode()) * 31) + this.fields_changed.hashCode();
        }

        public String toString() {
            return "Surrogate(user_uuid=" + this.user_uuid + ", relationship_master_id=" + this.relationship_master_id + ", fields_changed=" + this.fields_changed + ")";
        }

        /* compiled from: PlaidIdentityUpdateDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidIdentityUpdateDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str;
            }
            if ((i & 2) == 0) {
                this.relationship_master_id = "";
            } else {
                this.relationship_master_id = str2;
            }
            if ((i & 4) == 0) {
                this.fields_changed = CollectionsKt.emptyList();
            } else {
                this.fields_changed = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_uuid);
            }
            if (!Intrinsics.areEqual(self.relationship_master_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.relationship_master_id);
            }
            if (Intrinsics.areEqual(self.fields_changed, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.fields_changed);
        }

        public Surrogate(String user_uuid, String relationship_master_id, List<String> fields_changed) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
            Intrinsics.checkNotNullParameter(fields_changed, "fields_changed");
            this.user_uuid = user_uuid;
            this.relationship_master_id = relationship_master_id;
            this.fields_changed = fields_changed;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final String getRelationship_master_id() {
            return this.relationship_master_id;
        }

        public final List<String> getFields_changed() {
            return this.fields_changed;
        }
    }

    /* compiled from: PlaidIdentityUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PlaidIdentityUpdateDetailsDto, PlaidIdentityUpdateDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidIdentityUpdateDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidIdentityUpdateDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidIdentityUpdateDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidIdentityUpdateDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidIdentityUpdateDetails> getProtoAdapter() {
            return PlaidIdentityUpdateDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidIdentityUpdateDetailsDto getZeroValue() {
            return PlaidIdentityUpdateDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidIdentityUpdateDetailsDto fromProto(PlaidIdentityUpdateDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String user_uuid = proto.getUser_uuid();
            String relationship_master_id = proto.getRelationship_master_id();
            List<String> fields_changed = proto.getFields_changed();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields_changed, 10));
            Iterator<T> it = fields_changed.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new PlaidIdentityUpdateDetailsDto(new Surrogate(user_uuid, relationship_master_id, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidIdentityUpdateDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PlaidIdentityUpdateDetailsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PlaidIdentityUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PlaidIdentityUpdateDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.PlaidIdentityUpdateDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidIdentityUpdateDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidIdentityUpdateDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidIdentityUpdateDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidIdentityUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetailsDto";
        }
    }
}
