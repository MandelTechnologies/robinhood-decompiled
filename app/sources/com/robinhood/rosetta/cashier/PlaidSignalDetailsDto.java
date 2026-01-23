package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.cashier.PlaidSignalAttributesDto;
import com.robinhood.rosetta.cashier.PlaidSignalDetails;
import com.robinhood.rosetta.cashier.PlaidSignalDetailsDto;
import com.robinhood.rosetta.common.RHEntity;
import com.robinhood.rosetta.common.RHEntityDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PlaidSignalDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0013JD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate;)V", "ach_relationship_id", "", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "entity", "Lcom/robinhood/rosetta/common/RHEntityDto;", "attrs", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "fetch_success", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;Z)V", "getAch_relationship_id", "()Ljava/lang/String;", "getAch_transfer_id", "getSource", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "getAttrs", "()Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "getFetch_success", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PlaidSignalDetailsDto implements Dto3<PlaidSignalDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidSignalDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidSignalDetailsDto, PlaidSignalDetails>> binaryBase64Serializer$delegate;
    private static final PlaidSignalDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidSignalDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidSignalDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAch_relationship_id() {
        return this.surrogate.getAch_relationship_id();
    }

    public final String getAch_transfer_id() {
        return this.surrogate.getAch_transfer_id();
    }

    public final SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public final RHEntityDto getEntity() {
        return this.surrogate.getEntity();
    }

    public final PlaidSignalAttributesDto getAttrs() {
        return this.surrogate.getAttrs();
    }

    public final boolean getFetch_success() {
        return this.surrogate.getFetch_success();
    }

    public /* synthetic */ PlaidSignalDetailsDto(String str, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 8) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto, (i & 16) != 0 ? null : plaidSignalAttributesDto, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSignalDetailsDto(String ach_relationship_id, String ach_transfer_id, SourceDto source, RHEntityDto entity, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z) {
        this(new Surrogate(ach_relationship_id, ach_transfer_id, source, entity, plaidSignalAttributesDto, z));
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
    }

    public static /* synthetic */ PlaidSignalDetailsDto copy$default(PlaidSignalDetailsDto plaidSignalDetailsDto, String str, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidSignalDetailsDto.surrogate.getAch_relationship_id();
        }
        if ((i & 2) != 0) {
            str2 = plaidSignalDetailsDto.surrogate.getAch_transfer_id();
        }
        if ((i & 4) != 0) {
            sourceDto = plaidSignalDetailsDto.surrogate.getSource();
        }
        if ((i & 8) != 0) {
            rHEntityDto = plaidSignalDetailsDto.surrogate.getEntity();
        }
        if ((i & 16) != 0) {
            plaidSignalAttributesDto = plaidSignalDetailsDto.surrogate.getAttrs();
        }
        if ((i & 32) != 0) {
            z = plaidSignalDetailsDto.surrogate.getFetch_success();
        }
        PlaidSignalAttributesDto plaidSignalAttributesDto2 = plaidSignalAttributesDto;
        boolean z2 = z;
        return plaidSignalDetailsDto.copy(str, str2, sourceDto, rHEntityDto, plaidSignalAttributesDto2, z2);
    }

    public final PlaidSignalDetailsDto copy(String ach_relationship_id, String ach_transfer_id, SourceDto source, RHEntityDto entity, PlaidSignalAttributesDto attrs, boolean fetch_success) {
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new PlaidSignalDetailsDto(new Surrogate(ach_relationship_id, ach_transfer_id, source, entity, attrs, fetch_success));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PlaidSignalDetails toProto() {
        String ach_relationship_id = this.surrogate.getAch_relationship_id();
        String ach_transfer_id = this.surrogate.getAch_transfer_id();
        PlaidSignalDetails.Source source = (PlaidSignalDetails.Source) this.surrogate.getSource().toProto();
        RHEntity rHEntity = (RHEntity) this.surrogate.getEntity().toProto();
        PlaidSignalAttributesDto attrs = this.surrogate.getAttrs();
        return new PlaidSignalDetails(ach_relationship_id, ach_transfer_id, source, rHEntity, attrs != null ? attrs.toProto() : null, this.surrogate.getFetch_success(), null, 64, null);
    }

    public String toString() {
        return "[PlaidSignalDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidSignalDetailsDto) && Intrinsics.areEqual(((PlaidSignalDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidSignalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JG\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0010HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010%¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate;", "", "ach_relationship_id", "", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "entity", "Lcom/robinhood/rosetta/common/RHEntityDto;", "attrs", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "fetch_success", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAch_relationship_id$annotations", "()V", "getAch_relationship_id", "()Ljava/lang/String;", "getAch_transfer_id$annotations", "getAch_transfer_id", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "getEntity$annotations", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "getAttrs$annotations", "getAttrs", "()Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "getFetch_success$annotations", "getFetch_success", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String ach_relationship_id;
        private final String ach_transfer_id;
        private final PlaidSignalAttributesDto attrs;
        private final RHEntityDto entity;
        private final boolean fetch_success;
        private final SourceDto source;

        public Surrogate() {
            this((String) null, (String) null, (SourceDto) null, (RHEntityDto) null, (PlaidSignalAttributesDto) null, false, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ach_relationship_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.ach_transfer_id;
            }
            if ((i & 4) != 0) {
                sourceDto = surrogate.source;
            }
            if ((i & 8) != 0) {
                rHEntityDto = surrogate.entity;
            }
            if ((i & 16) != 0) {
                plaidSignalAttributesDto = surrogate.attrs;
            }
            if ((i & 32) != 0) {
                z = surrogate.fetch_success;
            }
            PlaidSignalAttributesDto plaidSignalAttributesDto2 = plaidSignalAttributesDto;
            boolean z2 = z;
            return surrogate.copy(str, str2, sourceDto, rHEntityDto, plaidSignalAttributesDto2, z2);
        }

        @SerialName("achRelationshipId")
        @JsonAnnotations2(names = {"ach_relationship_id"})
        public static /* synthetic */ void getAch_relationship_id$annotations() {
        }

        @SerialName("achTransferId")
        @JsonAnnotations2(names = {"ach_transfer_id"})
        public static /* synthetic */ void getAch_transfer_id$annotations() {
        }

        @SerialName("attrs")
        @JsonAnnotations2(names = {"attrs"})
        public static /* synthetic */ void getAttrs$annotations() {
        }

        @SerialName("entity")
        @JsonAnnotations2(names = {"entity"})
        public static /* synthetic */ void getEntity$annotations() {
        }

        @SerialName("fetchSuccess")
        @JsonAnnotations2(names = {"fetch_success"})
        public static /* synthetic */ void getFetch_success$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAch_relationship_id() {
            return this.ach_relationship_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAch_transfer_id() {
            return this.ach_transfer_id;
        }

        /* renamed from: component3, reason: from getter */
        public final SourceDto getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final RHEntityDto getEntity() {
            return this.entity;
        }

        /* renamed from: component5, reason: from getter */
        public final PlaidSignalAttributesDto getAttrs() {
            return this.attrs;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getFetch_success() {
            return this.fetch_success;
        }

        public final Surrogate copy(String ach_relationship_id, String ach_transfer_id, SourceDto source, RHEntityDto entity, PlaidSignalAttributesDto attrs, boolean fetch_success) {
            Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
            Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new Surrogate(ach_relationship_id, ach_transfer_id, source, entity, attrs, fetch_success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ach_relationship_id, surrogate.ach_relationship_id) && Intrinsics.areEqual(this.ach_transfer_id, surrogate.ach_transfer_id) && this.source == surrogate.source && this.entity == surrogate.entity && Intrinsics.areEqual(this.attrs, surrogate.attrs) && this.fetch_success == surrogate.fetch_success;
        }

        public int hashCode() {
            int iHashCode = ((((((this.ach_relationship_id.hashCode() * 31) + this.ach_transfer_id.hashCode()) * 31) + this.source.hashCode()) * 31) + this.entity.hashCode()) * 31;
            PlaidSignalAttributesDto plaidSignalAttributesDto = this.attrs;
            return ((iHashCode + (plaidSignalAttributesDto == null ? 0 : plaidSignalAttributesDto.hashCode())) * 31) + Boolean.hashCode(this.fetch_success);
        }

        public String toString() {
            return "Surrogate(ach_relationship_id=" + this.ach_relationship_id + ", ach_transfer_id=" + this.ach_transfer_id + ", source=" + this.source + ", entity=" + this.entity + ", attrs=" + this.attrs + ", fetch_success=" + this.fetch_success + ")";
        }

        /* compiled from: PlaidSignalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidSignalDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ach_relationship_id = "";
            } else {
                this.ach_relationship_id = str;
            }
            if ((i & 2) == 0) {
                this.ach_transfer_id = "";
            } else {
                this.ach_transfer_id = str2;
            }
            if ((i & 4) == 0) {
                this.source = SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
            if ((i & 8) == 0) {
                this.entity = RHEntityDto.INSTANCE.getZeroValue();
            } else {
                this.entity = rHEntityDto;
            }
            if ((i & 16) == 0) {
                this.attrs = null;
            } else {
                this.attrs = plaidSignalAttributesDto;
            }
            if ((i & 32) == 0) {
                this.fetch_success = false;
            } else {
                this.fetch_success = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ach_relationship_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ach_relationship_id);
            }
            if (!Intrinsics.areEqual(self.ach_transfer_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.ach_transfer_id);
            }
            if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SourceDto.Serializer.INSTANCE, self.source);
            }
            if (self.entity != RHEntityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, RHEntityDto.Serializer.INSTANCE, self.entity);
            }
            PlaidSignalAttributesDto plaidSignalAttributesDto = self.attrs;
            if (plaidSignalAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PlaidSignalAttributesDto.Serializer.INSTANCE, plaidSignalAttributesDto);
            }
            boolean z = self.fetch_success;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
        }

        public Surrogate(String ach_relationship_id, String ach_transfer_id, SourceDto source, RHEntityDto entity, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z) {
            Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
            Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.ach_relationship_id = ach_relationship_id;
            this.ach_transfer_id = ach_transfer_id;
            this.source = source;
            this.entity = entity;
            this.attrs = plaidSignalAttributesDto;
            this.fetch_success = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, PlaidSignalAttributesDto plaidSignalAttributesDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 8) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto, (i & 16) != 0 ? null : plaidSignalAttributesDto, (i & 32) != 0 ? false : z);
        }

        public final String getAch_relationship_id() {
            return this.ach_relationship_id;
        }

        public final String getAch_transfer_id() {
            return this.ach_transfer_id;
        }

        public final SourceDto getSource() {
            return this.source;
        }

        public final RHEntityDto getEntity() {
            return this.entity;
        }

        public final PlaidSignalAttributesDto getAttrs() {
            return this.attrs;
        }

        public final boolean getFetch_success() {
            return this.fetch_success;
        }
    }

    /* compiled from: PlaidSignalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PlaidSignalDetailsDto, PlaidSignalDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidSignalDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidSignalDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidSignalDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidSignalDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidSignalDetails> getProtoAdapter() {
            return PlaidSignalDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidSignalDetailsDto getZeroValue() {
            return PlaidSignalDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidSignalDetailsDto fromProto(PlaidSignalDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ach_relationship_id = proto.getAch_relationship_id();
            String ach_transfer_id = proto.getAch_transfer_id();
            SourceDto sourceDtoFromProto = SourceDto.INSTANCE.fromProto(proto.getSource());
            RHEntityDto rHEntityDtoFromProto = RHEntityDto.INSTANCE.fromProto(proto.getEntity());
            PlaidSignalAttributes attrs = proto.getAttrs();
            return new PlaidSignalDetailsDto(new Surrogate(ach_relationship_id, ach_transfer_id, sourceDtoFromProto, rHEntityDtoFromProto, attrs != null ? PlaidSignalAttributesDto.INSTANCE.fromProto(attrs) : null, proto.getFetch_success()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidSignalDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSignalDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PlaidSignalDetailsDto(null, null, null, null, null, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaidSignalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "ASYNC_RUNNER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceDto implements Dto2<PlaidSignalDetails.Source>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceDto, PlaidSignalDetails.Source>> binaryBase64Serializer$delegate;
        public static final SourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
        public static final SourceDto ASYNC_RUNNER = new ASYNC_RUNNER("ASYNC_RUNNER", 1);

        private static final /* synthetic */ SourceDto[] $values() {
            return new SourceDto[]{SOURCE_UNSPECIFIED, ASYNC_RUNNER};
        }

        public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PlaidSignalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/PlaidSignalDetailsDto.SourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_UNSPECIFIED extends SourceDto {
            SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidSignalDetails.Source toProto() {
                return PlaidSignalDetails.Source.SOURCE_UNSPECIFIED;
            }
        }

        private SourceDto(String str, int i) {
        }

        static {
            SourceDto[] sourceDtoArr$values = $values();
            $VALUES = sourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidSignalDetailsDto$SourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlaidSignalDetailsDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PlaidSignalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/PlaidSignalDetailsDto.SourceDto.ASYNC_RUNNER", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASYNC_RUNNER extends SourceDto {
            ASYNC_RUNNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidSignalDetails.Source toProto() {
                return PlaidSignalDetails.Source.ASYNC_RUNNER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PlaidSignalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceDto, PlaidSignalDetails.Source> {

            /* compiled from: PlaidSignalDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PlaidSignalDetails.Source.values().length];
                    try {
                        iArr[PlaidSignalDetails.Source.SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlaidSignalDetails.Source.ASYNC_RUNNER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PlaidSignalDetails.Source> getProtoAdapter() {
                return PlaidSignalDetails.Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto getZeroValue() {
                return SourceDto.SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto fromProto(PlaidSignalDetails.Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SourceDto.SOURCE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return SourceDto.ASYNC_RUNNER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PlaidSignalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceDto, PlaidSignalDetails.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.PlaidSignalDetails.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PlaidSignalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PlaidSignalDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.PlaidSignalDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidSignalDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidSignalDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidSignalDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidSignalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.PlaidSignalDetailsDto";
        }
    }
}
