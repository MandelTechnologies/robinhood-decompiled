package rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import okio.ByteString;
import rosetta.nummus.CurrencyDto;
import rosetta.nummus.CurrencyPair;
import rosetta.nummus.CurrencyPairDto;
import rosetta.nummus.CurrencyPairFeatureDto;

/* compiled from: CurrencyPairDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005/.012B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00063"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/nummus/CurrencyPair;", "Landroid/os/Parcelable;", "Lrosetta/nummus/CurrencyPairDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/nummus/CurrencyPairDto$Surrogate;)V", "Lokio/ByteString;", "id", "Lrosetta/nummus/CurrencyDto;", "asset_currency", "quote_currency", "", "min_order_price_increment", "max_order_size", "min_order_size", "min_order_quantity_increment", "min_order_quote_amount", "min_fee_order_quote_amount", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "type", "", "Lrosetta/nummus/CurrencyPairFeatureDto;", "features", "(Lokio/ByteString;Lrosetta/nummus/CurrencyDto;Lrosetta/nummus/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/CurrencyPairDto$TypeDto;Ljava/util/List;)V", "toProto", "()Lrosetta/nummus/CurrencyPair;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/nummus/CurrencyPairDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class CurrencyPairDto implements Dto3<CurrencyPair>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CurrencyPairDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairDto, CurrencyPair>> binaryBase64Serializer$delegate;
    private static final CurrencyPairDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CurrencyPairDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyPairDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CurrencyPairDto(ByteString byteString, CurrencyDto currencyDto, CurrencyDto currencyDto2, String str, String str2, String str3, String str4, String str5, String str6, TypeDto typeDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : currencyDto, (i & 4) != 0 ? null : currencyDto2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyPairDto(ByteString id, CurrencyDto currencyDto, CurrencyDto currencyDto2, String min_order_price_increment, String max_order_size, String min_order_size, String min_order_quantity_increment, String min_order_quote_amount, String min_fee_order_quote_amount, TypeDto type2, List<? extends CurrencyPairFeatureDto> features) {
        this(new Surrogate(id, currencyDto, currencyDto2, min_order_price_increment, max_order_size, min_order_size, min_order_quantity_increment, min_order_quote_amount, min_fee_order_quote_amount, type2, features));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_quote_amount, "min_order_quote_amount");
        Intrinsics.checkNotNullParameter(min_fee_order_quote_amount, "min_fee_order_quote_amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(features, "features");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CurrencyPair toProto() {
        ByteString id = this.surrogate.getId();
        CurrencyDto asset_currency = this.surrogate.getAsset_currency();
        Currency proto = asset_currency != null ? asset_currency.toProto() : null;
        CurrencyDto quote_currency = this.surrogate.getQuote_currency();
        Currency proto2 = quote_currency != null ? quote_currency.toProto() : null;
        String min_order_price_increment = this.surrogate.getMin_order_price_increment();
        String max_order_size = this.surrogate.getMax_order_size();
        String min_order_size = this.surrogate.getMin_order_size();
        String min_order_quantity_increment = this.surrogate.getMin_order_quantity_increment();
        String min_order_quote_amount = this.surrogate.getMin_order_quote_amount();
        String min_fee_order_quote_amount = this.surrogate.getMin_fee_order_quote_amount();
        CurrencyPair.Type type2 = (CurrencyPair.Type) this.surrogate.getType().toProto();
        List<CurrencyPairFeatureDto> features = this.surrogate.getFeatures();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
        Iterator<T> it = features.iterator();
        while (it.hasNext()) {
            arrayList.add((CurrencyPairFeature) ((CurrencyPairFeatureDto) it.next()).toProto());
        }
        return new CurrencyPair(id, proto, proto2, min_order_price_increment, max_order_size, min_order_size, min_order_quantity_increment, min_order_quote_amount, min_fee_order_quote_amount, type2, arrayList, null, 2048, null);
    }

    public String toString() {
        return "[CurrencyPairDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CurrencyPairDto) && Intrinsics.areEqual(((CurrencyPairDto) other).surrogate, this.surrogate);
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
    /* compiled from: CurrencyPairDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u008e\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b8\u00102\u001a\u0004\b7\u00105R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010'R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b=\u00102\u001a\u0004\b<\u0010'R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010'R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010'R \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\bC\u00102\u001a\u0004\bB\u0010'R \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\bE\u00102\u001a\u0004\bD\u0010'R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\bI\u00102\u001a\u0004\bG\u0010HR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010J\u0012\u0004\bM\u00102\u001a\u0004\bK\u0010L¨\u0006P"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "id", "Lrosetta/nummus/CurrencyDto;", "asset_currency", "quote_currency", "", "min_order_price_increment", "max_order_size", "min_order_size", "min_order_quantity_increment", "min_order_quote_amount", "min_fee_order_quote_amount", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "type", "", "Lrosetta/nummus/CurrencyPairFeatureDto;", "features", "<init>", "(Lokio/ByteString;Lrosetta/nummus/CurrencyDto;Lrosetta/nummus/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/CurrencyPairDto$TypeDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lrosetta/nummus/CurrencyDto;Lrosetta/nummus/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/CurrencyPairDto$TypeDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_nummus_nummus_externalRelease", "(Lrosetta/nummus/CurrencyPairDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getId", "()Lokio/ByteString;", "getId$annotations", "()V", "Lrosetta/nummus/CurrencyDto;", "getAsset_currency", "()Lrosetta/nummus/CurrencyDto;", "getAsset_currency$annotations", "getQuote_currency", "getQuote_currency$annotations", "Ljava/lang/String;", "getMin_order_price_increment", "getMin_order_price_increment$annotations", "getMax_order_size", "getMax_order_size$annotations", "getMin_order_size", "getMin_order_size$annotations", "getMin_order_quantity_increment", "getMin_order_quantity_increment$annotations", "getMin_order_quote_amount", "getMin_order_quote_amount$annotations", "getMin_fee_order_quote_amount", "getMin_fee_order_quote_amount$annotations", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "getType", "()Lrosetta/nummus/CurrencyPairDto$TypeDto;", "getType$annotations", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "getFeatures$annotations", "Companion", "$serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final CurrencyDto asset_currency;
        private final List<CurrencyPairFeatureDto> features;
        private final ByteString id;
        private final String max_order_size;
        private final String min_fee_order_quote_amount;
        private final String min_order_price_increment;
        private final String min_order_quantity_increment;
        private final String min_order_quote_amount;
        private final String min_order_size;
        private final CurrencyDto quote_currency;
        private final TypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rosetta.nummus.CurrencyPairDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((ByteString) null, (CurrencyDto) null, (CurrencyDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TypeDto) null, (List) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CurrencyPairFeatureDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.asset_currency, surrogate.asset_currency) && Intrinsics.areEqual(this.quote_currency, surrogate.quote_currency) && Intrinsics.areEqual(this.min_order_price_increment, surrogate.min_order_price_increment) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size) && Intrinsics.areEqual(this.min_order_size, surrogate.min_order_size) && Intrinsics.areEqual(this.min_order_quantity_increment, surrogate.min_order_quantity_increment) && Intrinsics.areEqual(this.min_order_quote_amount, surrogate.min_order_quote_amount) && Intrinsics.areEqual(this.min_fee_order_quote_amount, surrogate.min_fee_order_quote_amount) && this.type == surrogate.type && Intrinsics.areEqual(this.features, surrogate.features);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            CurrencyDto currencyDto = this.asset_currency;
            int iHashCode2 = (iHashCode + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31;
            CurrencyDto currencyDto2 = this.quote_currency;
            return ((((((((((((((((iHashCode2 + (currencyDto2 != null ? currencyDto2.hashCode() : 0)) * 31) + this.min_order_price_increment.hashCode()) * 31) + this.max_order_size.hashCode()) * 31) + this.min_order_size.hashCode()) * 31) + this.min_order_quantity_increment.hashCode()) * 31) + this.min_order_quote_amount.hashCode()) * 31) + this.min_fee_order_quote_amount.hashCode()) * 31) + this.type.hashCode()) * 31) + this.features.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", asset_currency=" + this.asset_currency + ", quote_currency=" + this.quote_currency + ", min_order_price_increment=" + this.min_order_price_increment + ", max_order_size=" + this.max_order_size + ", min_order_size=" + this.min_order_size + ", min_order_quantity_increment=" + this.min_order_quantity_increment + ", min_order_quote_amount=" + this.min_order_quote_amount + ", min_fee_order_quote_amount=" + this.min_fee_order_quote_amount + ", type=" + this.type + ", features=" + this.features + ")";
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/nummus/CurrencyPairDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyPairDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, CurrencyDto currencyDto, CurrencyDto currencyDto2, String str, String str2, String str3, String str4, String str5, String str6, TypeDto typeDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.asset_currency = null;
            } else {
                this.asset_currency = currencyDto;
            }
            if ((i & 4) == 0) {
                this.quote_currency = null;
            } else {
                this.quote_currency = currencyDto2;
            }
            if ((i & 8) == 0) {
                this.min_order_price_increment = "";
            } else {
                this.min_order_price_increment = str;
            }
            if ((i & 16) == 0) {
                this.max_order_size = "";
            } else {
                this.max_order_size = str2;
            }
            if ((i & 32) == 0) {
                this.min_order_size = "";
            } else {
                this.min_order_size = str3;
            }
            if ((i & 64) == 0) {
                this.min_order_quantity_increment = "";
            } else {
                this.min_order_quantity_increment = str4;
            }
            if ((i & 128) == 0) {
                this.min_order_quote_amount = "";
            } else {
                this.min_order_quote_amount = str5;
            }
            if ((i & 256) == 0) {
                this.min_fee_order_quote_amount = "";
            } else {
                this.min_fee_order_quote_amount = str6;
            }
            if ((i & 512) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 1024) == 0) {
                this.features = CollectionsKt.emptyList();
            } else {
                this.features = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.id);
            }
            CurrencyDto currencyDto = self.asset_currency;
            if (currencyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, currencyDto);
            }
            CurrencyDto currencyDto2 = self.quote_currency;
            if (currencyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CurrencyDto.Serializer.INSTANCE, currencyDto2);
            }
            if (!Intrinsics.areEqual(self.min_order_price_increment, "")) {
                output.encodeStringElement(serialDesc, 3, self.min_order_price_increment);
            }
            if (!Intrinsics.areEqual(self.max_order_size, "")) {
                output.encodeStringElement(serialDesc, 4, self.max_order_size);
            }
            if (!Intrinsics.areEqual(self.min_order_size, "")) {
                output.encodeStringElement(serialDesc, 5, self.min_order_size);
            }
            if (!Intrinsics.areEqual(self.min_order_quantity_increment, "")) {
                output.encodeStringElement(serialDesc, 6, self.min_order_quantity_increment);
            }
            if (!Intrinsics.areEqual(self.min_order_quote_amount, "")) {
                output.encodeStringElement(serialDesc, 7, self.min_order_quote_amount);
            }
            if (!Intrinsics.areEqual(self.min_fee_order_quote_amount, "")) {
                output.encodeStringElement(serialDesc, 8, self.min_fee_order_quote_amount);
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, TypeDto.Serializer.INSTANCE, self.type);
            }
            if (Intrinsics.areEqual(self.features, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.features);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(ByteString id, CurrencyDto currencyDto, CurrencyDto currencyDto2, String min_order_price_increment, String max_order_size, String min_order_size, String min_order_quantity_increment, String min_order_quote_amount, String min_fee_order_quote_amount, TypeDto type2, List<? extends CurrencyPairFeatureDto> features) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
            Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
            Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
            Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
            Intrinsics.checkNotNullParameter(min_order_quote_amount, "min_order_quote_amount");
            Intrinsics.checkNotNullParameter(min_fee_order_quote_amount, "min_fee_order_quote_amount");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(features, "features");
            this.id = id;
            this.asset_currency = currencyDto;
            this.quote_currency = currencyDto2;
            this.min_order_price_increment = min_order_price_increment;
            this.max_order_size = max_order_size;
            this.min_order_size = min_order_size;
            this.min_order_quantity_increment = min_order_quantity_increment;
            this.min_order_quote_amount = min_order_quote_amount;
            this.min_fee_order_quote_amount = min_fee_order_quote_amount;
            this.type = type2;
            this.features = features;
        }

        public final ByteString getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, CurrencyDto currencyDto, CurrencyDto currencyDto2, String str, String str2, String str3, String str4, String str5, String str6, TypeDto typeDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : currencyDto, (i & 4) != 0 ? null : currencyDto2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final CurrencyDto getAsset_currency() {
            return this.asset_currency;
        }

        public final CurrencyDto getQuote_currency() {
            return this.quote_currency;
        }

        public final String getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final String getMax_order_size() {
            return this.max_order_size;
        }

        public final String getMin_order_size() {
            return this.min_order_size;
        }

        public final String getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        public final String getMin_order_quote_amount() {
            return this.min_order_quote_amount;
        }

        public final String getMin_fee_order_quote_amount() {
            return this.min_fee_order_quote_amount;
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final List<CurrencyPairFeatureDto> getFeatures() {
            return this.features;
        }
    }

    /* compiled from: CurrencyPairDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/nummus/CurrencyPairDto;", "Lrosetta/nummus/CurrencyPair;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/nummus/CurrencyPairDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CurrencyPairDto, CurrencyPair> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyPairDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyPairDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CurrencyPair> getProtoAdapter() {
            return CurrencyPair.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairDto getZeroValue() {
            return CurrencyPairDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairDto fromProto(CurrencyPair proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString id = proto.getId();
            Currency asset_currency = proto.getAsset_currency();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CurrencyDto currencyDtoFromProto = asset_currency != null ? CurrencyDto.INSTANCE.fromProto(asset_currency) : null;
            Currency quote_currency = proto.getQuote_currency();
            CurrencyDto currencyDtoFromProto2 = quote_currency != null ? CurrencyDto.INSTANCE.fromProto(quote_currency) : null;
            String min_order_price_increment = proto.getMin_order_price_increment();
            String max_order_size = proto.getMax_order_size();
            String min_order_size = proto.getMin_order_size();
            String min_order_quantity_increment = proto.getMin_order_quantity_increment();
            String min_order_quote_amount = proto.getMin_order_quote_amount();
            String min_fee_order_quote_amount = proto.getMin_fee_order_quote_amount();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getType());
            List<CurrencyPairFeature> features = proto.getFeatures();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
            Iterator<T> it = features.iterator();
            while (it.hasNext()) {
                arrayList.add(CurrencyPairFeatureDto.INSTANCE.fromProto((CurrencyPairFeature) it.next()));
            }
            return new CurrencyPairDto(new Surrogate(id, currencyDtoFromProto, currencyDtoFromProto2, min_order_price_increment, max_order_size, min_order_size, min_order_quantity_increment, min_order_quote_amount, min_fee_order_quote_amount, typeDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.nummus.CurrencyPairDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CurrencyPairDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/nummus/CurrencyPair$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "CRYPTOCURRENCY", "PERPETUAL", "TOKENIZED_STOCK", "FIAT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class TypeDto implements Dto2<CurrencyPair.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, CurrencyPair.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto CRYPTOCURRENCY = new CRYPTOCURRENCY("CRYPTOCURRENCY", 1);
        public static final TypeDto PERPETUAL = new PERPETUAL("PERPETUAL", 2);
        public static final TypeDto TOKENIZED_STOCK = new TOKENIZED_STOCK("TOKENIZED_STOCK", 3);
        public static final TypeDto FIAT = new FIAT("FIAT", 4);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, CRYPTOCURRENCY, PERPETUAL, TOKENIZED_STOCK, FIAT};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/nummus/CurrencyPairDto.TypeDto.TYPE_UNSPECIFIED", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "toProto", "Lrosetta/nummus/CurrencyPair$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPair.Type toProto() {
                return CurrencyPair.Type.TYPE_UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.nummus.CurrencyPairDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/nummus/CurrencyPairDto.TypeDto.CRYPTOCURRENCY", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "toProto", "Lrosetta/nummus/CurrencyPair$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTOCURRENCY extends TypeDto {
            CRYPTOCURRENCY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPair.Type toProto() {
                return CurrencyPair.Type.CRYPTOCURRENCY;
            }
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/nummus/CurrencyPairDto.TypeDto.PERPETUAL", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "toProto", "Lrosetta/nummus/CurrencyPair$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERPETUAL extends TypeDto {
            PERPETUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPair.Type toProto() {
                return CurrencyPair.Type.PERPETUAL;
            }
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/nummus/CurrencyPairDto.TypeDto.TOKENIZED_STOCK", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "toProto", "Lrosetta/nummus/CurrencyPair$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKENIZED_STOCK extends TypeDto {
            TOKENIZED_STOCK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPair.Type toProto() {
                return CurrencyPair.Type.TOKENIZED_STOCK;
            }
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/nummus/CurrencyPairDto.TypeDto.FIAT", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "toProto", "Lrosetta/nummus/CurrencyPair$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT extends TypeDto {
            FIAT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPair.Type toProto() {
                return CurrencyPair.Type.FIAT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "Lrosetta/nummus/CurrencyPair$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/nummus/CurrencyPairDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, CurrencyPair.Type> {

            /* compiled from: CurrencyPairDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPair.Type.values().length];
                    try {
                        iArr[CurrencyPair.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPair.Type.CRYPTOCURRENCY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CurrencyPair.Type.PERPETUAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CurrencyPair.Type.TOKENIZED_STOCK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CurrencyPair.Type.FIAT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPair.Type> getProtoAdapter() {
                return CurrencyPair.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(CurrencyPair.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TypeDto.TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TypeDto.CRYPTOCURRENCY;
                }
                if (i == 3) {
                    return TypeDto.PERPETUAL;
                }
                if (i == 4) {
                    return TypeDto.TOKENIZED_STOCK;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return TypeDto.FIAT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/nummus/CurrencyPairDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, CurrencyPair.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPair.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CurrencyPairDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/nummus/CurrencyPairDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/nummus/CurrencyPairDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<CurrencyPairDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.CurrencyPair", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyPairDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyPairDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CurrencyPairDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CurrencyPairDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/nummus/CurrencyPairDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rosetta.nummus.CurrencyPairDto";
        }
    }
}
