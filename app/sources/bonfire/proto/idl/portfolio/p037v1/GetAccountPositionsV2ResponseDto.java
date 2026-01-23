package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionsV2ResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionListItemV2Dto;
import bonfire.proto.idl.portfolio.p037v1.PositionsLocationDto;
import bonfire.proto.idl.portfolio.p037v1.PositionsSortDirectionDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetAccountPositionsV2ResponseDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;:<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\n\u0010\u001dJ\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u000b\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010!R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Response;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;)V", "", "", "header", Footer.f10637type, "", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "results", "instrument_type", "account_number", "Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "positions_location", "sort_type", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;", "sort_direction", "", "options_asset_home_header_tag", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;Ljava/lang/Integer;)V", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "toProto", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Response;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;", "getHeader", "()Ljava/util/Map;", "getFooter", "getResults", "()Ljava/util/List;", "getInstrument_type", "getAccount_number", "getPositions_location", "()Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetAccountPositionsV2ResponseDto implements Dto3<GetAccountPositionsV2Response>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountPositionsV2ResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountPositionsV2ResponseDto, GetAccountPositionsV2Response>> binaryBase64Serializer$delegate;
    private static final GetAccountPositionsV2ResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountPositionsV2ResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountPositionsV2ResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final Map<String, ?> getHeader() {
        return this.surrogate.getHeader();
    }

    public final Map<String, ?> getFooter() {
        return this.surrogate.getFooter();
    }

    public final List<PositionListItemV2Dto> getResults() {
        return this.surrogate.getResults();
    }

    public final String getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final PositionsLocationDto getPositions_location() {
        return this.surrogate.getPositions_location();
    }

    public /* synthetic */ GetAccountPositionsV2ResponseDto(Map map, Map map2, List list, String str, String str2, PositionsLocationDto positionsLocationDto, String str3, PositionsSortDirectionDto positionsSortDirectionDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? PositionsLocationDto.INSTANCE.getZeroValue() : positionsLocationDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : positionsSortDirectionDto, (i & 256) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionsV2ResponseDto(Map<String, ?> map, Map<String, ?> map2, List<PositionListItemV2Dto> results, String instrument_type, String account_number, PositionsLocationDto positions_location, String str, PositionsSortDirectionDto positionsSortDirectionDto, Integer num) {
        this(new Surrogate(map, map2, results, instrument_type, account_number, positions_location, str, positionsSortDirectionDto, num));
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(positions_location, "positions_location");
    }

    public final UIComponent<AccountPositionAction> header(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> header = getHeader();
        if (header != null) {
            return (UIComponent) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(UIComponent.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(AccountPositionAction.class)))).fromJsonValue(header);
        }
        return null;
    }

    public final UIComponent<AccountPositionAction> footer(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> footer = getFooter();
        if (footer != null) {
            return (UIComponent) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(UIComponent.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(AccountPositionAction.class)))).fromJsonValue(footer);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountPositionsV2Response toProto() {
        Map<String, Object> header = this.surrogate.getHeader();
        Map<String, Object> footer = this.surrogate.getFooter();
        List<PositionListItemV2Dto> results = this.surrogate.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionListItemV2Dto) it.next()).toProto());
        }
        String instrument_type = this.surrogate.getInstrument_type();
        String account_number = this.surrogate.getAccount_number();
        PositionsLocation positionsLocation = (PositionsLocation) this.surrogate.getPositions_location().toProto();
        String sort_type = this.surrogate.getSort_type();
        PositionsSortDirectionDto sort_direction = this.surrogate.getSort_direction();
        return new GetAccountPositionsV2Response(header, footer, arrayList, instrument_type, account_number, positionsLocation, sort_type, sort_direction != null ? (PositionsSortDirection) sort_direction.toProto() : null, this.surrogate.getOptions_asset_home_header_tag(), null, 512, null);
    }

    public String toString() {
        return "[GetAccountPositionsV2ResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountPositionsV2ResponseDto) && Intrinsics.areEqual(((GetAccountPositionsV2ResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountPositionsV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBº\u0001\u0012'\b\u0002\u0010\u0007\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u0002\u0012'\b\u0002\u0010\b\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u0013¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R?\u0010\u0007\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R?\u0010\b\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010/R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u00101\u001a\u0004\b5\u00106R \u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010&R \u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010&R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u00101\u001a\u0004\b>\u0010?R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00108\u0012\u0004\bB\u00101\u001a\u0004\bA\u0010&R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010ER1\u0010\u0015\u001a\u0013\u0018\u00010\u0013¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010G\u0012\u0004\bJ\u00101\u001a\u0004\bH\u0010I¨\u0006M"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;", "", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "header", Footer.f10637type, "", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "results", "instrument_type", "account_number", "Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "positions_location", "sort_type", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;", "sort_direction", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "options_asset_home_header_tag", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "getHeader$annotations", "()V", "getFooter", "getFooter$annotations", "Ljava/util/List;", "getResults", "()Ljava/util/List;", "getResults$annotations", "Ljava/lang/String;", "getInstrument_type", "getInstrument_type$annotations", "getAccount_number", "getAccount_number$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "getPositions_location", "()Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "getPositions_location$annotations", "getSort_type", "getSort_type$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;", "getSort_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;", "getSort_direction$annotations", "Ljava/lang/Integer;", "getOptions_asset_home_header_tag", "()Ljava/lang/Integer;", "getOptions_asset_home_header_tag$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final Map<String, Object> footer;
        private final Map<String, Object> header;
        private final String instrument_type;
        private final Integer options_asset_home_header_tag;
        private final PositionsLocationDto positions_location;
        private final List<PositionListItemV2Dto> results;
        private final PositionsSortDirectionDto sort_direction;
        private final String sort_type;

        public Surrogate() {
            this((Map) null, (Map) null, (List) null, (String) null, (String) null, (PositionsLocationDto) null, (String) null, (PositionsSortDirectionDto) null, (Integer) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(PositionListItemV2Dto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.results, surrogate.results) && Intrinsics.areEqual(this.instrument_type, surrogate.instrument_type) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.positions_location == surrogate.positions_location && Intrinsics.areEqual(this.sort_type, surrogate.sort_type) && this.sort_direction == surrogate.sort_direction && Intrinsics.areEqual(this.options_asset_home_header_tag, surrogate.options_asset_home_header_tag);
        }

        public int hashCode() {
            Map<String, Object> map = this.header;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, Object> map2 = this.footer;
            int iHashCode2 = (((((((((iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31) + this.results.hashCode()) * 31) + this.instrument_type.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.positions_location.hashCode()) * 31;
            String str = this.sort_type;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            PositionsSortDirectionDto positionsSortDirectionDto = this.sort_direction;
            int iHashCode4 = (iHashCode3 + (positionsSortDirectionDto == null ? 0 : positionsSortDirectionDto.hashCode())) * 31;
            Integer num = this.options_asset_home_header_tag;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(header=" + this.header + ", footer=" + this.footer + ", results=" + this.results + ", instrument_type=" + this.instrument_type + ", account_number=" + this.account_number + ", positions_location=" + this.positions_location + ", sort_type=" + this.sort_type + ", sort_direction=" + this.sort_direction + ", options_asset_home_header_tag=" + this.options_asset_home_header_tag + ")";
        }

        /* compiled from: GetAccountPositionsV2ResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountPositionsV2ResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2ResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountPositionsV2ResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2ResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountPositionsV2ResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2ResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountPositionsV2ResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, Map map, Map map2, List list, String str, String str2, PositionsLocationDto positionsLocationDto, String str3, PositionsSortDirectionDto positionsSortDirectionDto, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.header = null;
            } else {
                this.header = map;
            }
            if ((i & 2) == 0) {
                this.footer = null;
            } else {
                this.footer = map2;
            }
            if ((i & 4) == 0) {
                this.results = CollectionsKt.emptyList();
            } else {
                this.results = list;
            }
            if ((i & 8) == 0) {
                this.instrument_type = "";
            } else {
                this.instrument_type = str;
            }
            if ((i & 16) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 32) == 0) {
                this.positions_location = PositionsLocationDto.INSTANCE.getZeroValue();
            } else {
                this.positions_location = positionsLocationDto;
            }
            if ((i & 64) == 0) {
                this.sort_type = null;
            } else {
                this.sort_type = str3;
            }
            if ((i & 128) == 0) {
                this.sort_direction = null;
            } else {
                this.sort_direction = positionsSortDirectionDto;
            }
            if ((i & 256) == 0) {
                this.options_asset_home_header_tag = null;
            } else {
                this.options_asset_home_header_tag = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.header != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.header);
            }
            if (self.footer != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.footer);
            }
            if (!Intrinsics.areEqual(self.results, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.results);
            }
            if (!Intrinsics.areEqual(self.instrument_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.instrument_type);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 4, self.account_number);
            }
            if (self.positions_location != PositionsLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, PositionsLocationDto.Serializer.INSTANCE, self.positions_location);
            }
            String str = self.sort_type;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            PositionsSortDirectionDto positionsSortDirectionDto = self.sort_direction;
            if (positionsSortDirectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PositionsSortDirectionDto.Serializer.INSTANCE, positionsSortDirectionDto);
            }
            Integer num = self.options_asset_home_header_tag;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, List<PositionListItemV2Dto> results, String instrument_type, String account_number, PositionsLocationDto positions_location, String str, PositionsSortDirectionDto positionsSortDirectionDto, Integer num) {
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(positions_location, "positions_location");
            this.header = map;
            this.footer = map2;
            this.results = results;
            this.instrument_type = instrument_type;
            this.account_number = account_number;
            this.positions_location = positions_location;
            this.sort_type = str;
            this.sort_direction = positionsSortDirectionDto;
            this.options_asset_home_header_tag = num;
        }

        public final Map<String, Object> getHeader() {
            return this.header;
        }

        public final Map<String, Object> getFooter() {
            return this.footer;
        }

        public final List<PositionListItemV2Dto> getResults() {
            return this.results;
        }

        public /* synthetic */ Surrogate(Map map, Map map2, List list, String str, String str2, PositionsLocationDto positionsLocationDto, String str3, PositionsSortDirectionDto positionsSortDirectionDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? PositionsLocationDto.INSTANCE.getZeroValue() : positionsLocationDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : positionsSortDirectionDto, (i & 256) != 0 ? null : num);
        }

        public final String getInstrument_type() {
            return this.instrument_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final PositionsLocationDto getPositions_location() {
            return this.positions_location;
        }

        public final String getSort_type() {
            return this.sort_type;
        }

        public final PositionsSortDirectionDto getSort_direction() {
            return this.sort_direction;
        }

        public final Integer getOptions_asset_home_header_tag() {
            return this.options_asset_home_header_tag;
        }
    }

    /* compiled from: GetAccountPositionsV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Response;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountPositionsV2ResponseDto, GetAccountPositionsV2Response> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountPositionsV2ResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionsV2ResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionsV2ResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountPositionsV2ResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountPositionsV2Response> getProtoAdapter() {
            return GetAccountPositionsV2Response.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionsV2ResponseDto getZeroValue() {
            return GetAccountPositionsV2ResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionsV2ResponseDto fromProto(GetAccountPositionsV2Response proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Map<String, ?> header = proto.getHeader();
            Map<String, ?> footer = proto.getFooter();
            List<PositionListItemV2> results = proto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionListItemV2Dto.INSTANCE.fromProto((PositionListItemV2) it.next()));
            }
            String instrument_type = proto.getInstrument_type();
            String account_number = proto.getAccount_number();
            PositionsLocationDto positionsLocationDtoFromProto = PositionsLocationDto.INSTANCE.fromProto(proto.getPositions_location());
            String sort_type = proto.getSort_type();
            PositionsSortDirection sort_direction = proto.getSort_direction();
            return new GetAccountPositionsV2ResponseDto(new Surrogate(header, footer, arrayList, instrument_type, account_number, positionsLocationDtoFromProto, sort_type, sort_direction != null ? PositionsSortDirectionDto.INSTANCE.fromProto(sort_direction) : null, proto.getOptions_asset_home_header_tag()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2ResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountPositionsV2ResponseDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new GetAccountPositionsV2ResponseDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountPositionsV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountPositionsV2ResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2Response", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountPositionsV2ResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountPositionsV2ResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountPositionsV2ResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountPositionsV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2ResponseDto";
        }
    }
}
