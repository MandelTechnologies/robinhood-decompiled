package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ColorDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractTradabilityDto;
import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ContractInfoDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bk\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0015Jh\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00065"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate;)V", "contract_id", "", "long_name", "short_name", "description", ResourceTypes.COLOR, "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "header_image_url", "tertiary_text", "disable_header_image_flip", "", "tradability", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;)V", "getContract_id", "()Ljava/lang/String;", "getLong_name", "getShort_name", "getDescription", "getColor", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "getHeader_image_url", "getTertiary_text", "getDisable_header_image_flip", "()Z", "getTradability", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ContractInfoDto implements Dto3<ContractInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractInfoDto, ContractInfo>> binaryBase64Serializer$delegate;
    private static final ContractInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getLong_name() {
        return this.surrogate.getLong_name();
    }

    public final String getShort_name() {
        return this.surrogate.getShort_name();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final ColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final String getHeader_image_url() {
        return this.surrogate.getHeader_image_url();
    }

    public final String getTertiary_text() {
        return this.surrogate.getTertiary_text();
    }

    public final boolean getDisable_header_image_flip() {
        return this.surrogate.getDisable_header_image_flip();
    }

    public final EventContractTradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public /* synthetic */ ContractInfoDto(String str, String str2, String str3, String str4, ColorDto colorDto, String str5, String str6, boolean z, EventContractTradabilityDto eventContractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : colorDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractInfoDto(String contract_id, String long_name, String short_name, String str, ColorDto colorDto, String str2, String str3, boolean z, EventContractTradabilityDto tradability) {
        this(new Surrogate(contract_id, long_name, short_name, str, colorDto, str2, str3, z, tradability));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
    }

    public static /* synthetic */ ContractInfoDto copy$default(ContractInfoDto contractInfoDto, String str, String str2, String str3, String str4, ColorDto colorDto, String str5, String str6, boolean z, EventContractTradabilityDto eventContractTradabilityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractInfoDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            str2 = contractInfoDto.surrogate.getLong_name();
        }
        if ((i & 4) != 0) {
            str3 = contractInfoDto.surrogate.getShort_name();
        }
        if ((i & 8) != 0) {
            str4 = contractInfoDto.surrogate.getDescription();
        }
        if ((i & 16) != 0) {
            colorDto = contractInfoDto.surrogate.getColor();
        }
        if ((i & 32) != 0) {
            str5 = contractInfoDto.surrogate.getHeader_image_url();
        }
        if ((i & 64) != 0) {
            str6 = contractInfoDto.surrogate.getTertiary_text();
        }
        if ((i & 128) != 0) {
            z = contractInfoDto.surrogate.getDisable_header_image_flip();
        }
        if ((i & 256) != 0) {
            eventContractTradabilityDto = contractInfoDto.surrogate.getTradability();
        }
        boolean z2 = z;
        EventContractTradabilityDto eventContractTradabilityDto2 = eventContractTradabilityDto;
        String str7 = str5;
        String str8 = str6;
        ColorDto colorDto2 = colorDto;
        String str9 = str3;
        return contractInfoDto.copy(str, str2, str9, str4, colorDto2, str7, str8, z2, eventContractTradabilityDto2);
    }

    public final ContractInfoDto copy(String contract_id, String long_name, String short_name, String description, ColorDto color, String header_image_url, String tertiary_text, boolean disable_header_image_flip, EventContractTradabilityDto tradability) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        return new ContractInfoDto(new Surrogate(contract_id, long_name, short_name, description, color, header_image_url, tertiary_text, disable_header_image_flip, tradability));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ContractInfo toProto() {
        String contract_id = this.surrogate.getContract_id();
        String long_name = this.surrogate.getLong_name();
        String short_name = this.surrogate.getShort_name();
        String description = this.surrogate.getDescription();
        ColorDto color = this.surrogate.getColor();
        return new ContractInfo(contract_id, long_name, short_name, description, color != null ? color.toProto() : null, this.surrogate.getHeader_image_url(), this.surrogate.getTertiary_text(), this.surrogate.getDisable_header_image_flip(), (EventContractTradability) this.surrogate.getTradability().toProto(), null, 512, null);
    }

    public String toString() {
        return "[ContractInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractInfoDto) && Intrinsics.areEqual(((ContractInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002CDBi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003Jk\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0012HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J%\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,¨\u0006E"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate;", "", "contract_id", "", "long_name", "short_name", "description", ResourceTypes.COLOR, "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "header_image_url", "tertiary_text", "disable_header_image_flip", "", "tradability", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getLong_name$annotations", "getLong_name", "getShort_name$annotations", "getShort_name", "getDescription$annotations", "getDescription", "getColor$annotations", "getColor", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "getHeader_image_url$annotations", "getHeader_image_url", "getTertiary_text$annotations", "getTertiary_text", "getDisable_header_image_flip$annotations", "getDisable_header_image_flip", "()Z", "getTradability$annotations", "getTradability", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ColorDto color;
        private final String contract_id;
        private final String description;
        private final boolean disable_header_image_flip;
        private final String header_image_url;
        private final String long_name;
        private final String short_name;
        private final String tertiary_text;
        private final EventContractTradabilityDto tradability;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (ColorDto) null, (String) null, (String) null, false, (EventContractTradabilityDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, ColorDto colorDto, String str5, String str6, boolean z, EventContractTradabilityDto eventContractTradabilityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.long_name;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.short_name;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.description;
            }
            if ((i & 16) != 0) {
                colorDto = surrogate.color;
            }
            if ((i & 32) != 0) {
                str5 = surrogate.header_image_url;
            }
            if ((i & 64) != 0) {
                str6 = surrogate.tertiary_text;
            }
            if ((i & 128) != 0) {
                z = surrogate.disable_header_image_flip;
            }
            if ((i & 256) != 0) {
                eventContractTradabilityDto = surrogate.tradability;
            }
            boolean z2 = z;
            EventContractTradabilityDto eventContractTradabilityDto2 = eventContractTradabilityDto;
            String str7 = str5;
            String str8 = str6;
            ColorDto colorDto2 = colorDto;
            String str9 = str3;
            return surrogate.copy(str, str2, str9, str4, colorDto2, str7, str8, z2, eventContractTradabilityDto2);
        }

        @SerialName(ResourceTypes.COLOR)
        @JsonAnnotations2(names = {ResourceTypes.COLOR})
        public static /* synthetic */ void getColor$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("disableHeaderImageFlip")
        @JsonAnnotations2(names = {"disable_header_image_flip"})
        public static /* synthetic */ void getDisable_header_image_flip$annotations() {
        }

        @SerialName("headerImageUrl")
        @JsonAnnotations2(names = {"header_image_url"})
        public static /* synthetic */ void getHeader_image_url$annotations() {
        }

        @SerialName("longName")
        @JsonAnnotations2(names = {"long_name"})
        public static /* synthetic */ void getLong_name$annotations() {
        }

        @SerialName("shortName")
        @JsonAnnotations2(names = {"short_name"})
        public static /* synthetic */ void getShort_name$annotations() {
        }

        @SerialName("tertiaryText")
        @JsonAnnotations2(names = {"tertiary_text"})
        public static /* synthetic */ void getTertiary_text$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLong_name() {
            return this.long_name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getShort_name() {
            return this.short_name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final ColorDto getColor() {
            return this.color;
        }

        /* renamed from: component6, reason: from getter */
        public final String getHeader_image_url() {
            return this.header_image_url;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTertiary_text() {
            return this.tertiary_text;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getDisable_header_image_flip() {
            return this.disable_header_image_flip;
        }

        /* renamed from: component9, reason: from getter */
        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        public final Surrogate copy(String contract_id, String long_name, String short_name, String description, ColorDto color, String header_image_url, String tertiary_text, boolean disable_header_image_flip, EventContractTradabilityDto tradability) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(long_name, "long_name");
            Intrinsics.checkNotNullParameter(short_name, "short_name");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            return new Surrogate(contract_id, long_name, short_name, description, color, header_image_url, tertiary_text, disable_header_image_flip, tradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.long_name, surrogate.long_name) && Intrinsics.areEqual(this.short_name, surrogate.short_name) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.header_image_url, surrogate.header_image_url) && Intrinsics.areEqual(this.tertiary_text, surrogate.tertiary_text) && this.disable_header_image_flip == surrogate.disable_header_image_flip && this.tradability == surrogate.tradability;
        }

        public int hashCode() {
            int iHashCode = ((((this.contract_id.hashCode() * 31) + this.long_name.hashCode()) * 31) + this.short_name.hashCode()) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ColorDto colorDto = this.color;
            int iHashCode3 = (iHashCode2 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
            String str2 = this.header_image_url;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tertiary_text;
            return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.disable_header_image_flip)) * 31) + this.tradability.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", long_name=" + this.long_name + ", short_name=" + this.short_name + ", description=" + this.description + ", color=" + this.color + ", header_image_url=" + this.header_image_url + ", tertiary_text=" + this.tertiary_text + ", disable_header_image_flip=" + this.disable_header_image_flip + ", tradability=" + this.tradability + ")";
        }

        /* compiled from: ContractInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, ColorDto colorDto, String str5, String str6, boolean z, EventContractTradabilityDto eventContractTradabilityDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
            if ((i & 2) == 0) {
                this.long_name = "";
            } else {
                this.long_name = str2;
            }
            if ((i & 4) == 0) {
                this.short_name = "";
            } else {
                this.short_name = str3;
            }
            if ((i & 8) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i & 16) == 0) {
                this.color = null;
            } else {
                this.color = colorDto;
            }
            if ((i & 32) == 0) {
                this.header_image_url = null;
            } else {
                this.header_image_url = str5;
            }
            if ((i & 64) == 0) {
                this.tertiary_text = null;
            } else {
                this.tertiary_text = str6;
            }
            if ((i & 128) == 0) {
                this.disable_header_image_flip = false;
            } else {
                this.disable_header_image_flip = z;
            }
            if ((i & 256) == 0) {
                this.tradability = EventContractTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability = eventContractTradabilityDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.long_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.long_name);
            }
            if (!Intrinsics.areEqual(self.short_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.short_name);
            }
            String str = self.description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            ColorDto colorDto = self.color;
            if (colorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ColorDto.Serializer.INSTANCE, colorDto);
            }
            String str2 = self.header_image_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.tertiary_text;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str3);
            }
            boolean z = self.disable_header_image_flip;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            if (self.tradability != EventContractTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, EventContractTradabilityDto.Serializer.INSTANCE, self.tradability);
            }
        }

        public Surrogate(String contract_id, String long_name, String short_name, String str, ColorDto colorDto, String str2, String str3, boolean z, EventContractTradabilityDto tradability) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(long_name, "long_name");
            Intrinsics.checkNotNullParameter(short_name, "short_name");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            this.contract_id = contract_id;
            this.long_name = long_name;
            this.short_name = short_name;
            this.description = str;
            this.color = colorDto;
            this.header_image_url = str2;
            this.tertiary_text = str3;
            this.disable_header_image_flip = z;
            this.tradability = tradability;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, ColorDto colorDto, String str5, String str6, boolean z, EventContractTradabilityDto eventContractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : colorDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getLong_name() {
            return this.long_name;
        }

        public final String getShort_name() {
            return this.short_name;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ColorDto getColor() {
            return this.color;
        }

        public final String getHeader_image_url() {
            return this.header_image_url;
        }

        public final String getTertiary_text() {
            return this.tertiary_text;
        }

        public final boolean getDisable_header_image_flip() {
            return this.disable_header_image_flip;
        }

        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }
    }

    /* compiled from: ContractInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ContractInfoDto, ContractInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractInfo> getProtoAdapter() {
            return ContractInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractInfoDto getZeroValue() {
            return ContractInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractInfoDto fromProto(ContractInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_id = proto.getContract_id();
            String long_name = proto.getLong_name();
            String short_name = proto.getShort_name();
            String description = proto.getDescription();
            Color color = proto.getColor();
            return new ContractInfoDto(new Surrogate(contract_id, long_name, short_name, description, color != null ? ColorDto.INSTANCE.fromProto(color) : null, proto.getHeader_image_url(), proto.getTertiary_text(), proto.getDisable_header_image_flip(), EventContractTradabilityDto.INSTANCE.fromProto(proto.getTradability())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContractInfoDto(null, null, null, null, null, null, null, false, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.ContractInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ContractInfoDto";
        }
    }
}
