package com.robinhood.rosetta.eventlogging;

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
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.AssetDto;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: AssetDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Asset;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate;)V", "unique_identifier", "", "asset_type", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "has_holdings", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getUnique_identifier", "()Ljava/lang/String;", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "getHas_holdings", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AssetTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AssetDto implements Dto3<Asset>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AssetDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetDto, Asset>> binaryBase64Serializer$delegate;
    private static final AssetDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AssetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUnique_identifier() {
        return this.surrogate.getUnique_identifier();
    }

    public final AssetTypeDto getAsset_type() {
        return this.surrogate.getAsset_type();
    }

    public final BooleanDto getHas_holdings() {
        return this.surrogate.getHas_holdings();
    }

    public /* synthetic */ AssetDto(String str, AssetTypeDto assetTypeDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetDto(String unique_identifier, AssetTypeDto asset_type, BooleanDto has_holdings) {
        this(new Surrogate(unique_identifier, asset_type, has_holdings));
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
    }

    public static /* synthetic */ AssetDto copy$default(AssetDto assetDto, String str, AssetTypeDto assetTypeDto, BooleanDto booleanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetDto.surrogate.getUnique_identifier();
        }
        if ((i & 2) != 0) {
            assetTypeDto = assetDto.surrogate.getAsset_type();
        }
        if ((i & 4) != 0) {
            booleanDto = assetDto.surrogate.getHas_holdings();
        }
        return assetDto.copy(str, assetTypeDto, booleanDto);
    }

    public final AssetDto copy(String unique_identifier, AssetTypeDto asset_type, BooleanDto has_holdings) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
        return new AssetDto(new Surrogate(unique_identifier, asset_type, has_holdings));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Asset toProto() {
        return new Asset(this.surrogate.getUnique_identifier(), (Asset.AssetType) this.surrogate.getAsset_type().toProto(), (Boolean) this.surrogate.getHas_holdings().toProto(), null, 8, null);
    }

    public String toString() {
        return "[AssetDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AssetDto) && Intrinsics.areEqual(((AssetDto) other).surrogate, this.surrogate);
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
    /* compiled from: AssetDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate;", "", "unique_identifier", "", "asset_type", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "has_holdings", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUnique_identifier$annotations", "()V", "getUnique_identifier", "()Ljava/lang/String;", "getAsset_type$annotations", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "getHas_holdings$annotations", "getHas_holdings", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetTypeDto asset_type;
        private final BooleanDto has_holdings;
        private final String unique_identifier;

        public Surrogate() {
            this((String) null, (AssetTypeDto) null, (BooleanDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, AssetTypeDto assetTypeDto, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.unique_identifier;
            }
            if ((i & 2) != 0) {
                assetTypeDto = surrogate.asset_type;
            }
            if ((i & 4) != 0) {
                booleanDto = surrogate.has_holdings;
            }
            return surrogate.copy(str, assetTypeDto, booleanDto);
        }

        @SerialName("assetType")
        @JsonAnnotations2(names = {"asset_type"})
        public static /* synthetic */ void getAsset_type$annotations() {
        }

        @SerialName("hasHoldings")
        @JsonAnnotations2(names = {"has_holdings"})
        public static /* synthetic */ void getHas_holdings$annotations() {
        }

        @SerialName("uniqueIdentifier")
        @JsonAnnotations2(names = {"unique_identifier"})
        public static /* synthetic */ void getUnique_identifier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUnique_identifier() {
            return this.unique_identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanDto getHas_holdings() {
            return this.has_holdings;
        }

        public final Surrogate copy(String unique_identifier, AssetTypeDto asset_type, BooleanDto has_holdings) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
            return new Surrogate(unique_identifier, asset_type, has_holdings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.unique_identifier, surrogate.unique_identifier) && this.asset_type == surrogate.asset_type && this.has_holdings == surrogate.has_holdings;
        }

        public int hashCode() {
            return (((this.unique_identifier.hashCode() * 31) + this.asset_type.hashCode()) * 31) + this.has_holdings.hashCode();
        }

        public String toString() {
            return "Surrogate(unique_identifier=" + this.unique_identifier + ", asset_type=" + this.asset_type + ", has_holdings=" + this.has_holdings + ")";
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AssetDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, AssetTypeDto assetTypeDto, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.unique_identifier = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.asset_type = AssetTypeDto.INSTANCE.getZeroValue();
            } else {
                this.asset_type = assetTypeDto;
            }
            if ((i & 4) == 0) {
                this.has_holdings = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_holdings = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.unique_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.unique_identifier);
            }
            if (self.asset_type != AssetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AssetTypeDto.Serializer.INSTANCE, self.asset_type);
            }
            if (self.has_holdings != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.has_holdings);
            }
        }

        public Surrogate(String unique_identifier, AssetTypeDto asset_type, BooleanDto has_holdings) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
            this.unique_identifier = unique_identifier;
            this.asset_type = asset_type;
            this.has_holdings = has_holdings;
        }

        public final String getUnique_identifier() {
            return this.unique_identifier;
        }

        public /* synthetic */ Surrogate(String str, AssetTypeDto assetTypeDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        public final BooleanDto getHas_holdings() {
            return this.has_holdings;
        }
    }

    /* compiled from: AssetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AssetDto;", "Lcom/robinhood/rosetta/eventlogging/Asset;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AssetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AssetDto, Asset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Asset> getProtoAdapter() {
            return Asset.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetDto getZeroValue() {
            return AssetDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetDto fromProto(Asset proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AssetDto(new Surrogate(proto.getUnique_identifier(), AssetTypeDto.INSTANCE.fromProto(proto.getAsset_type()), BooleanDto.INSTANCE.fromProto(proto.getHas_holdings())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AssetDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AssetDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_TYPE_UNSPECIFIED", "CURRENCY_PAIR", "INSTRUMENT", "OPTIONS_CONTRACT", "FUTURES", "INDEXES", "EVENT_CONTRACT", "PERPETUAL_CONTRACT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AssetTypeDto implements Dto2<Asset.AssetType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AssetTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AssetTypeDto, Asset.AssetType>> binaryBase64Serializer$delegate;
        public static final AssetTypeDto ASSET_TYPE_UNSPECIFIED = new ASSET_TYPE_UNSPECIFIED("ASSET_TYPE_UNSPECIFIED", 0);
        public static final AssetTypeDto CURRENCY_PAIR = new CURRENCY_PAIR("CURRENCY_PAIR", 1);
        public static final AssetTypeDto INSTRUMENT = new INSTRUMENT("INSTRUMENT", 2);
        public static final AssetTypeDto OPTIONS_CONTRACT = new OPTIONS_CONTRACT("OPTIONS_CONTRACT", 3);
        public static final AssetTypeDto FUTURES = new FUTURES("FUTURES", 4);
        public static final AssetTypeDto INDEXES = new INDEXES("INDEXES", 5);
        public static final AssetTypeDto EVENT_CONTRACT = new EVENT_CONTRACT("EVENT_CONTRACT", 6);
        public static final AssetTypeDto PERPETUAL_CONTRACT = new PERPETUAL_CONTRACT("PERPETUAL_CONTRACT", 7);

        private static final /* synthetic */ AssetTypeDto[] $values() {
            return new AssetTypeDto[]{ASSET_TYPE_UNSPECIFIED, CURRENCY_PAIR, INSTRUMENT, OPTIONS_CONTRACT, FUTURES, INDEXES, EVENT_CONTRACT, PERPETUAL_CONTRACT};
        }

        public /* synthetic */ AssetTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AssetTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.ASSET_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_TYPE_UNSPECIFIED extends AssetTypeDto {
            ASSET_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
            }
        }

        private AssetTypeDto(String str, int i) {
        }

        static {
            AssetTypeDto[] assetTypeDtoArr$values = $values();
            $VALUES = assetTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AssetDto$AssetTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetDto.AssetTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.CURRENCY_PAIR", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR extends AssetTypeDto {
            CURRENCY_PAIR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.CURRENCY_PAIR;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.INSTRUMENT", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSTRUMENT extends AssetTypeDto {
            INSTRUMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.INSTRUMENT;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.OPTIONS_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CONTRACT extends AssetTypeDto {
            OPTIONS_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.OPTIONS_CONTRACT;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.FUTURES", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FUTURES extends AssetTypeDto {
            FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.FUTURES;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.INDEXES", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDEXES extends AssetTypeDto {
            INDEXES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.INDEXES;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.EVENT_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_CONTRACT extends AssetTypeDto {
            EVENT_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.EVENT_CONTRACT;
            }
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AssetDto.AssetTypeDto.PERPETUAL_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PERPETUAL_CONTRACT extends AssetTypeDto {
            PERPETUAL_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Asset.AssetType toProto() {
                return Asset.AssetType.PERPETUAL_CONTRACT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AssetTypeDto, Asset.AssetType> {

            /* compiled from: AssetDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Asset.AssetType.values().length];
                    try {
                        iArr[Asset.AssetType.ASSET_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Asset.AssetType.CURRENCY_PAIR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Asset.AssetType.INSTRUMENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Asset.AssetType.OPTIONS_CONTRACT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Asset.AssetType.FUTURES.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Asset.AssetType.INDEXES.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Asset.AssetType.EVENT_CONTRACT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[Asset.AssetType.PERPETUAL_CONTRACT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AssetTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AssetTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Asset.AssetType> getProtoAdapter() {
                return Asset.AssetType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetTypeDto getZeroValue() {
                return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetTypeDto fromProto(Asset.AssetType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
                    case 2:
                        return AssetTypeDto.CURRENCY_PAIR;
                    case 3:
                        return AssetTypeDto.INSTRUMENT;
                    case 4:
                        return AssetTypeDto.OPTIONS_CONTRACT;
                    case 5:
                        return AssetTypeDto.FUTURES;
                    case 6:
                        return AssetTypeDto.INDEXES;
                    case 7:
                        return AssetTypeDto.EVENT_CONTRACT;
                    case 8:
                        return AssetTypeDto.PERPETUAL_CONTRACT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AssetDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AssetDto$AssetTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AssetTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AssetTypeDto, Asset.AssetType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Asset.AssetType", AssetTypeDto.getEntries(), AssetTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AssetTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AssetTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AssetTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AssetTypeDto valueOf(String str) {
            return (AssetTypeDto) Enum.valueOf(AssetTypeDto.class, str);
        }

        public static AssetTypeDto[] values() {
            return (AssetTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: AssetDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AssetDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AssetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AssetDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Asset", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AssetDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AssetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AssetDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AssetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AssetDto";
        }
    }
}
