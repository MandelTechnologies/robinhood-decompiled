package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsResponseDto;
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

/* compiled from: GetContractDisplayDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015¢\u0006\u0004\b\u0006\u0010\u0016J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00068"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate;)V", "contract_title_name", "", "event_display_name", "contract_subtitle_name", "contract_prefix", "image_url_dark", "image_url_light", "yes_no_and_contract_subtitle_name", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "prop_name", "selected_leg_display_details", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Ljava/lang/String;Ljava/util/List;)V", "getContract_title_name", "()Ljava/lang/String;", "getEvent_display_name", "getContract_subtitle_name", "getContract_prefix", "getImage_url_dark", "getImage_url_light", "getYes_no_and_contract_subtitle_name", "getYes_no_and_contract_name", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "getProp_name", "getSelected_leg_display_details", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class GetContractDisplayDetailsResponseDto implements Dto3<GetContractDisplayDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetContractDisplayDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetContractDisplayDetailsResponseDto, GetContractDisplayDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetContractDisplayDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetContractDisplayDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetContractDisplayDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_title_name() {
        return this.surrogate.getContract_title_name();
    }

    public final String getEvent_display_name() {
        return this.surrogate.getEvent_display_name();
    }

    public final String getContract_subtitle_name() {
        return this.surrogate.getContract_subtitle_name();
    }

    public final String getContract_prefix() {
        return this.surrogate.getContract_prefix();
    }

    public final String getImage_url_dark() {
        return this.surrogate.getImage_url_dark();
    }

    public final String getImage_url_light() {
        return this.surrogate.getImage_url_light();
    }

    public final String getYes_no_and_contract_subtitle_name() {
        return this.surrogate.getYes_no_and_contract_subtitle_name();
    }

    public final String getYes_no_and_contract_name() {
        return this.surrogate.getYes_no_and_contract_name();
    }

    public final GetContractDisplayDetailsRequestDto getCaching_key() {
        return this.surrogate.getCaching_key();
    }

    public final String getProp_name() {
        return this.surrogate.getProp_name();
    }

    public final List<GetContractDisplayDetailsResponseDto> getSelected_leg_display_details() {
        return this.surrogate.getSelected_leg_display_details();
    }

    public /* synthetic */ GetContractDisplayDetailsResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : getContractDisplayDetailsRequestDto, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetContractDisplayDetailsResponseDto(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String str, String yes_no_and_contract_name, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String prop_name, List<GetContractDisplayDetailsResponseDto> selected_leg_display_details) {
        this(new Surrogate(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, str, yes_no_and_contract_name, getContractDisplayDetailsRequestDto, prop_name, selected_leg_display_details));
        Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
        Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
        Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
        Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(prop_name, "prop_name");
        Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
    }

    public static /* synthetic */ GetContractDisplayDetailsResponseDto copy$default(GetContractDisplayDetailsResponseDto getContractDisplayDetailsResponseDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String str9, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getContractDisplayDetailsResponseDto.surrogate.getContract_title_name();
        }
        if ((i & 2) != 0) {
            str2 = getContractDisplayDetailsResponseDto.surrogate.getEvent_display_name();
        }
        if ((i & 4) != 0) {
            str3 = getContractDisplayDetailsResponseDto.surrogate.getContract_subtitle_name();
        }
        if ((i & 8) != 0) {
            str4 = getContractDisplayDetailsResponseDto.surrogate.getContract_prefix();
        }
        if ((i & 16) != 0) {
            str5 = getContractDisplayDetailsResponseDto.surrogate.getImage_url_dark();
        }
        if ((i & 32) != 0) {
            str6 = getContractDisplayDetailsResponseDto.surrogate.getImage_url_light();
        }
        if ((i & 64) != 0) {
            str7 = getContractDisplayDetailsResponseDto.surrogate.getYes_no_and_contract_subtitle_name();
        }
        if ((i & 128) != 0) {
            str8 = getContractDisplayDetailsResponseDto.surrogate.getYes_no_and_contract_name();
        }
        if ((i & 256) != 0) {
            getContractDisplayDetailsRequestDto = getContractDisplayDetailsResponseDto.surrogate.getCaching_key();
        }
        if ((i & 512) != 0) {
            str9 = getContractDisplayDetailsResponseDto.surrogate.getProp_name();
        }
        if ((i & 1024) != 0) {
            list = getContractDisplayDetailsResponseDto.surrogate.getSelected_leg_display_details();
        }
        String str10 = str9;
        List list2 = list;
        String str11 = str8;
        GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto2 = getContractDisplayDetailsRequestDto;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return getContractDisplayDetailsResponseDto.copy(str, str2, str15, str4, str14, str12, str13, str11, getContractDisplayDetailsRequestDto2, str10, list2);
    }

    public final GetContractDisplayDetailsResponseDto copy(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String yes_no_and_contract_subtitle_name, String yes_no_and_contract_name, GetContractDisplayDetailsRequestDto caching_key, String prop_name, List<GetContractDisplayDetailsResponseDto> selected_leg_display_details) {
        Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
        Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
        Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
        Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(prop_name, "prop_name");
        Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
        return new GetContractDisplayDetailsResponseDto(new Surrogate(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, yes_no_and_contract_subtitle_name, yes_no_and_contract_name, caching_key, prop_name, selected_leg_display_details));
    }

    @Override // com.robinhood.idl.Dto
    public GetContractDisplayDetailsResponse toProto() {
        String contract_title_name = this.surrogate.getContract_title_name();
        String event_display_name = this.surrogate.getEvent_display_name();
        String contract_subtitle_name = this.surrogate.getContract_subtitle_name();
        String contract_prefix = this.surrogate.getContract_prefix();
        String image_url_dark = this.surrogate.getImage_url_dark();
        String image_url_light = this.surrogate.getImage_url_light();
        String yes_no_and_contract_subtitle_name = this.surrogate.getYes_no_and_contract_subtitle_name();
        String yes_no_and_contract_name = this.surrogate.getYes_no_and_contract_name();
        GetContractDisplayDetailsRequestDto caching_key = this.surrogate.getCaching_key();
        GetContractDisplayDetailsRequest proto = caching_key != null ? caching_key.toProto() : null;
        String prop_name = this.surrogate.getProp_name();
        List<GetContractDisplayDetailsResponseDto> selected_leg_display_details = this.surrogate.getSelected_leg_display_details();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_leg_display_details, 10));
        Iterator<T> it = selected_leg_display_details.iterator();
        while (it.hasNext()) {
            arrayList.add(((GetContractDisplayDetailsResponseDto) it.next()).toProto());
        }
        return new GetContractDisplayDetailsResponse(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, yes_no_and_contract_subtitle_name, yes_no_and_contract_name, proto, prop_name, arrayList, null, 2048, null);
    }

    public String toString() {
        return "[GetContractDisplayDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetContractDisplayDetailsResponseDto) && Intrinsics.areEqual(((GetContractDisplayDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetContractDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002KLB\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0081\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0014HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101¨\u0006M"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate;", "", "contract_title_name", "", "event_display_name", "contract_subtitle_name", "contract_prefix", "image_url_dark", "image_url_light", "yes_no_and_contract_subtitle_name", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "prop_name", "selected_leg_display_details", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_title_name$annotations", "()V", "getContract_title_name", "()Ljava/lang/String;", "getEvent_display_name$annotations", "getEvent_display_name", "getContract_subtitle_name$annotations", "getContract_subtitle_name", "getContract_prefix$annotations", "getContract_prefix", "getImage_url_dark$annotations", "getImage_url_dark", "getImage_url_light$annotations", "getImage_url_light", "getYes_no_and_contract_subtitle_name$annotations", "getYes_no_and_contract_subtitle_name", "getYes_no_and_contract_name$annotations", "getYes_no_and_contract_name", "getCaching_key$annotations", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequestDto;", "getProp_name$annotations", "getProp_name", "getSelected_leg_display_details$annotations", "getSelected_leg_display_details", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final GetContractDisplayDetailsRequestDto caching_key;
        private final String contract_prefix;
        private final String contract_subtitle_name;
        private final String contract_title_name;
        private final String event_display_name;
        private final String image_url_dark;
        private final String image_url_light;
        private final String prop_name;
        private final List<GetContractDisplayDetailsResponseDto> selected_leg_display_details;
        private final String yes_no_and_contract_name;
        private final String yes_no_and_contract_subtitle_name;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetContractDisplayDetailsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (GetContractDisplayDetailsRequestDto) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String str9, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_title_name;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.event_display_name;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.contract_subtitle_name;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.contract_prefix;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.image_url_dark;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.image_url_light;
            }
            if ((i & 64) != 0) {
                str7 = surrogate.yes_no_and_contract_subtitle_name;
            }
            if ((i & 128) != 0) {
                str8 = surrogate.yes_no_and_contract_name;
            }
            if ((i & 256) != 0) {
                getContractDisplayDetailsRequestDto = surrogate.caching_key;
            }
            if ((i & 512) != 0) {
                str9 = surrogate.prop_name;
            }
            if ((i & 1024) != 0) {
                list = surrogate.selected_leg_display_details;
            }
            String str10 = str9;
            List list2 = list;
            String str11 = str8;
            GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto2 = getContractDisplayDetailsRequestDto;
            String str12 = str6;
            String str13 = str7;
            String str14 = str5;
            String str15 = str3;
            return surrogate.copy(str, str2, str15, str4, str14, str12, str13, str11, getContractDisplayDetailsRequestDto2, str10, list2);
        }

        @SerialName("cachingKey")
        @JsonAnnotations2(names = {"caching_key"})
        public static /* synthetic */ void getCaching_key$annotations() {
        }

        @SerialName("contractPrefix")
        @JsonAnnotations2(names = {"contract_prefix"})
        public static /* synthetic */ void getContract_prefix$annotations() {
        }

        @SerialName("contractSubtitleName")
        @JsonAnnotations2(names = {"contract_subtitle_name"})
        public static /* synthetic */ void getContract_subtitle_name$annotations() {
        }

        @SerialName("contractTitleName")
        @JsonAnnotations2(names = {"contract_title_name"})
        public static /* synthetic */ void getContract_title_name$annotations() {
        }

        @SerialName("eventDisplayName")
        @JsonAnnotations2(names = {"event_display_name"})
        public static /* synthetic */ void getEvent_display_name$annotations() {
        }

        @SerialName("imageUrlDark")
        @JsonAnnotations2(names = {"image_url_dark"})
        public static /* synthetic */ void getImage_url_dark$annotations() {
        }

        @SerialName("imageUrlLight")
        @JsonAnnotations2(names = {"image_url_light"})
        public static /* synthetic */ void getImage_url_light$annotations() {
        }

        @SerialName("propName")
        @JsonAnnotations2(names = {"prop_name"})
        public static /* synthetic */ void getProp_name$annotations() {
        }

        @SerialName("selectedLegDisplayDetails")
        @JsonAnnotations2(names = {"selected_leg_display_details"})
        public static /* synthetic */ void getSelected_leg_display_details$annotations() {
        }

        @SerialName("yesNoAndContractName")
        @JsonAnnotations2(names = {"yes_no_and_contract_name"})
        public static /* synthetic */ void getYes_no_and_contract_name$annotations() {
        }

        @SerialName("yesNoAndContractSubtitleName")
        @JsonAnnotations2(names = {"yes_no_and_contract_subtitle_name"})
        public static /* synthetic */ void getYes_no_and_contract_subtitle_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_title_name() {
            return this.contract_title_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getProp_name() {
            return this.prop_name;
        }

        public final List<GetContractDisplayDetailsResponseDto> component11() {
            return this.selected_leg_display_details;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_display_name() {
            return this.event_display_name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_subtitle_name() {
            return this.contract_subtitle_name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContract_prefix() {
            return this.contract_prefix;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImage_url_dark() {
            return this.image_url_dark;
        }

        /* renamed from: component6, reason: from getter */
        public final String getImage_url_light() {
            return this.image_url_light;
        }

        /* renamed from: component7, reason: from getter */
        public final String getYes_no_and_contract_subtitle_name() {
            return this.yes_no_and_contract_subtitle_name;
        }

        /* renamed from: component8, reason: from getter */
        public final String getYes_no_and_contract_name() {
            return this.yes_no_and_contract_name;
        }

        /* renamed from: component9, reason: from getter */
        public final GetContractDisplayDetailsRequestDto getCaching_key() {
            return this.caching_key;
        }

        public final Surrogate copy(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String yes_no_and_contract_subtitle_name, String yes_no_and_contract_name, GetContractDisplayDetailsRequestDto caching_key, String prop_name, List<GetContractDisplayDetailsResponseDto> selected_leg_display_details) {
            Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
            Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
            Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
            Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
            Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
            Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
            Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
            Intrinsics.checkNotNullParameter(prop_name, "prop_name");
            Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
            return new Surrogate(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, yes_no_and_contract_subtitle_name, yes_no_and_contract_name, caching_key, prop_name, selected_leg_display_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_title_name, surrogate.contract_title_name) && Intrinsics.areEqual(this.event_display_name, surrogate.event_display_name) && Intrinsics.areEqual(this.contract_subtitle_name, surrogate.contract_subtitle_name) && Intrinsics.areEqual(this.contract_prefix, surrogate.contract_prefix) && Intrinsics.areEqual(this.image_url_dark, surrogate.image_url_dark) && Intrinsics.areEqual(this.image_url_light, surrogate.image_url_light) && Intrinsics.areEqual(this.yes_no_and_contract_subtitle_name, surrogate.yes_no_and_contract_subtitle_name) && Intrinsics.areEqual(this.yes_no_and_contract_name, surrogate.yes_no_and_contract_name) && Intrinsics.areEqual(this.caching_key, surrogate.caching_key) && Intrinsics.areEqual(this.prop_name, surrogate.prop_name) && Intrinsics.areEqual(this.selected_leg_display_details, surrogate.selected_leg_display_details);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.contract_title_name.hashCode() * 31) + this.event_display_name.hashCode()) * 31) + this.contract_subtitle_name.hashCode()) * 31) + this.contract_prefix.hashCode()) * 31) + this.image_url_dark.hashCode()) * 31) + this.image_url_light.hashCode()) * 31;
            String str = this.yes_no_and_contract_subtitle_name;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.yes_no_and_contract_name.hashCode()) * 31;
            GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto = this.caching_key;
            return ((((iHashCode2 + (getContractDisplayDetailsRequestDto != null ? getContractDisplayDetailsRequestDto.hashCode() : 0)) * 31) + this.prop_name.hashCode()) * 31) + this.selected_leg_display_details.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_title_name=" + this.contract_title_name + ", event_display_name=" + this.event_display_name + ", contract_subtitle_name=" + this.contract_subtitle_name + ", contract_prefix=" + this.contract_prefix + ", image_url_dark=" + this.image_url_dark + ", image_url_light=" + this.image_url_light + ", yes_no_and_contract_subtitle_name=" + this.yes_no_and_contract_subtitle_name + ", yes_no_and_contract_name=" + this.yes_no_and_contract_name + ", caching_key=" + this.caching_key + ", prop_name=" + this.prop_name + ", selected_leg_display_details=" + this.selected_leg_display_details + ")";
        }

        /* compiled from: GetContractDisplayDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetContractDisplayDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String str9, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_title_name = "";
            } else {
                this.contract_title_name = str;
            }
            if ((i & 2) == 0) {
                this.event_display_name = "";
            } else {
                this.event_display_name = str2;
            }
            if ((i & 4) == 0) {
                this.contract_subtitle_name = "";
            } else {
                this.contract_subtitle_name = str3;
            }
            if ((i & 8) == 0) {
                this.contract_prefix = "";
            } else {
                this.contract_prefix = str4;
            }
            if ((i & 16) == 0) {
                this.image_url_dark = "";
            } else {
                this.image_url_dark = str5;
            }
            if ((i & 32) == 0) {
                this.image_url_light = "";
            } else {
                this.image_url_light = str6;
            }
            if ((i & 64) == 0) {
                this.yes_no_and_contract_subtitle_name = null;
            } else {
                this.yes_no_and_contract_subtitle_name = str7;
            }
            if ((i & 128) == 0) {
                this.yes_no_and_contract_name = "";
            } else {
                this.yes_no_and_contract_name = str8;
            }
            if ((i & 256) == 0) {
                this.caching_key = null;
            } else {
                this.caching_key = getContractDisplayDetailsRequestDto;
            }
            if ((i & 512) == 0) {
                this.prop_name = "";
            } else {
                this.prop_name = str9;
            }
            if ((i & 1024) == 0) {
                this.selected_leg_display_details = CollectionsKt.emptyList();
            } else {
                this.selected_leg_display_details = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.contract_title_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_title_name);
            }
            if (!Intrinsics.areEqual(self.event_display_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_display_name);
            }
            if (!Intrinsics.areEqual(self.contract_subtitle_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.contract_subtitle_name);
            }
            if (!Intrinsics.areEqual(self.contract_prefix, "")) {
                output.encodeStringElement(serialDesc, 3, self.contract_prefix);
            }
            if (!Intrinsics.areEqual(self.image_url_dark, "")) {
                output.encodeStringElement(serialDesc, 4, self.image_url_dark);
            }
            if (!Intrinsics.areEqual(self.image_url_light, "")) {
                output.encodeStringElement(serialDesc, 5, self.image_url_light);
            }
            String str = self.yes_no_and_contract_subtitle_name;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.yes_no_and_contract_name, "")) {
                output.encodeStringElement(serialDesc, 7, self.yes_no_and_contract_name);
            }
            GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto = self.caching_key;
            if (getContractDisplayDetailsRequestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GetContractDisplayDetailsRequestDto.Serializer.INSTANCE, getContractDisplayDetailsRequestDto);
            }
            if (!Intrinsics.areEqual(self.prop_name, "")) {
                output.encodeStringElement(serialDesc, 9, self.prop_name);
            }
            if (Intrinsics.areEqual(self.selected_leg_display_details, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.selected_leg_display_details);
        }

        public Surrogate(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String str, String yes_no_and_contract_name, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String prop_name, List<GetContractDisplayDetailsResponseDto> selected_leg_display_details) {
            Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
            Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
            Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
            Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
            Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
            Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
            Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
            Intrinsics.checkNotNullParameter(prop_name, "prop_name");
            Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
            this.contract_title_name = contract_title_name;
            this.event_display_name = event_display_name;
            this.contract_subtitle_name = contract_subtitle_name;
            this.contract_prefix = contract_prefix;
            this.image_url_dark = image_url_dark;
            this.image_url_light = image_url_light;
            this.yes_no_and_contract_subtitle_name = str;
            this.yes_no_and_contract_name = yes_no_and_contract_name;
            this.caching_key = getContractDisplayDetailsRequestDto;
            this.prop_name = prop_name;
            this.selected_leg_display_details = selected_leg_display_details;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDto, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : getContractDisplayDetailsRequestDto, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getContract_title_name() {
            return this.contract_title_name;
        }

        public final String getEvent_display_name() {
            return this.event_display_name;
        }

        public final String getContract_subtitle_name() {
            return this.contract_subtitle_name;
        }

        public final String getContract_prefix() {
            return this.contract_prefix;
        }

        public final String getImage_url_dark() {
            return this.image_url_dark;
        }

        public final String getImage_url_light() {
            return this.image_url_light;
        }

        public final String getYes_no_and_contract_subtitle_name() {
            return this.yes_no_and_contract_subtitle_name;
        }

        public final String getYes_no_and_contract_name() {
            return this.yes_no_and_contract_name;
        }

        public final GetContractDisplayDetailsRequestDto getCaching_key() {
            return this.caching_key;
        }

        public final String getProp_name() {
            return this.prop_name;
        }

        public final List<GetContractDisplayDetailsResponseDto> getSelected_leg_display_details() {
            return this.selected_leg_display_details;
        }
    }

    /* compiled from: GetContractDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetContractDisplayDetailsResponseDto, GetContractDisplayDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetContractDisplayDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContractDisplayDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContractDisplayDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetContractDisplayDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetContractDisplayDetailsResponse> getProtoAdapter() {
            return GetContractDisplayDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContractDisplayDetailsResponseDto getZeroValue() {
            return GetContractDisplayDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContractDisplayDetailsResponseDto fromProto(GetContractDisplayDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_title_name = proto.getContract_title_name();
            String event_display_name = proto.getEvent_display_name();
            String contract_subtitle_name = proto.getContract_subtitle_name();
            String contract_prefix = proto.getContract_prefix();
            String image_url_dark = proto.getImage_url_dark();
            String image_url_light = proto.getImage_url_light();
            String yes_no_and_contract_subtitle_name = proto.getYes_no_and_contract_subtitle_name();
            String yes_no_and_contract_name = proto.getYes_no_and_contract_name();
            GetContractDisplayDetailsRequest caching_key = proto.getCaching_key();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GetContractDisplayDetailsRequestDto getContractDisplayDetailsRequestDtoFromProto = caching_key != null ? GetContractDisplayDetailsRequestDto.INSTANCE.fromProto(caching_key) : null;
            String prop_name = proto.getProp_name();
            List<GetContractDisplayDetailsResponse> selected_leg_display_details = proto.getSelected_leg_display_details();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_leg_display_details, 10));
            Iterator<T> it = selected_leg_display_details.iterator();
            while (it.hasNext()) {
                arrayList.add(GetContractDisplayDetailsResponseDto.INSTANCE.fromProto((GetContractDisplayDetailsResponse) it.next()));
            }
            return new GetContractDisplayDetailsResponseDto(new Surrogate(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, yes_no_and_contract_subtitle_name, yes_no_and_contract_name, getContractDisplayDetailsRequestDtoFromProto, prop_name, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetContractDisplayDetailsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetContractDisplayDetailsResponseDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetContractDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetContractDisplayDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.GetContractDisplayDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetContractDisplayDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetContractDisplayDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetContractDisplayDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetContractDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsResponseDto";
        }
    }
}
