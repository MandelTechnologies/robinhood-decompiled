package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.SourceDto;
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

/* compiled from: LaunchBottomSheetRequestDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequest;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "bottom_sheet_type", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "source", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcontracts/crypto/trade/proto/v1/SourceDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class LaunchBottomSheetRequestDto implements Dto3<LaunchBottomSheetRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LaunchBottomSheetRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LaunchBottomSheetRequestDto, LaunchBottomSheetRequest>> binaryBase64Serializer$delegate;
    private static final LaunchBottomSheetRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LaunchBottomSheetRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LaunchBottomSheetRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ LaunchBottomSheetRequestDto(BottomSheetTypeDto bottomSheetTypeDto, ScreenDto screenDto, SourceDto sourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomSheetTypeDto, (i & 2) != 0 ? null : screenDto, (i & 4) != 0 ? null : sourceDto);
    }

    public LaunchBottomSheetRequestDto(BottomSheetTypeDto bottomSheetTypeDto, ScreenDto screenDto, SourceDto sourceDto) {
        this(new Surrogate(bottomSheetTypeDto, screenDto, sourceDto));
    }

    @Override // com.robinhood.idl.Dto
    public LaunchBottomSheetRequest toProto() {
        BottomSheetTypeDto bottom_sheet_type = this.surrogate.getBottom_sheet_type();
        BottomSheetType proto = bottom_sheet_type != null ? bottom_sheet_type.toProto() : null;
        ScreenDto screen = this.surrogate.getScreen();
        Screen proto2 = screen != null ? screen.toProto() : null;
        SourceDto source = this.surrogate.getSource();
        return new LaunchBottomSheetRequest(proto, proto2, source != null ? source.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[LaunchBottomSheetRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LaunchBottomSheetRequestDto) && Intrinsics.areEqual(((LaunchBottomSheetRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: LaunchBottomSheetRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "bottom_sheet_type", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "source", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcontracts/crypto/trade/proto/v1/SourceDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcontracts/crypto/trade/proto/v1/SourceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottom_sheet_type", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottom_sheet_type$annotations", "()V", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "getSource", "()Lcontracts/crypto/trade/proto/v1/SourceDto;", "getSource$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BottomSheetTypeDto bottom_sheet_type;
        private final ScreenDto screen;
        private final SourceDto source;

        public Surrogate() {
            this((BottomSheetTypeDto) null, (ScreenDto) null, (SourceDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bottom_sheet_type, surrogate.bottom_sheet_type) && Intrinsics.areEqual(this.screen, surrogate.screen) && Intrinsics.areEqual(this.source, surrogate.source);
        }

        public int hashCode() {
            BottomSheetTypeDto bottomSheetTypeDto = this.bottom_sheet_type;
            int iHashCode = (bottomSheetTypeDto == null ? 0 : bottomSheetTypeDto.hashCode()) * 31;
            ScreenDto screenDto = this.screen;
            int iHashCode2 = (iHashCode + (screenDto == null ? 0 : screenDto.hashCode())) * 31;
            SourceDto sourceDto = this.source;
            return iHashCode2 + (sourceDto != null ? sourceDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bottom_sheet_type=" + this.bottom_sheet_type + ", screen=" + this.screen + ", source=" + this.source + ")";
        }

        /* compiled from: LaunchBottomSheetRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LaunchBottomSheetRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BottomSheetTypeDto bottomSheetTypeDto, ScreenDto screenDto, SourceDto sourceDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bottom_sheet_type = null;
            } else {
                this.bottom_sheet_type = bottomSheetTypeDto;
            }
            if ((i & 2) == 0) {
                this.screen = null;
            } else {
                this.screen = screenDto;
            }
            if ((i & 4) == 0) {
                this.source = null;
            } else {
                this.source = sourceDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BottomSheetTypeDto bottomSheetTypeDto = self.bottom_sheet_type;
            if (bottomSheetTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BottomSheetTypeDto.Serializer.INSTANCE, bottomSheetTypeDto);
            }
            ScreenDto screenDto = self.screen;
            if (screenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ScreenDto.Serializer.INSTANCE, screenDto);
            }
            SourceDto sourceDto = self.source;
            if (sourceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SourceDto.Serializer.INSTANCE, sourceDto);
            }
        }

        public Surrogate(BottomSheetTypeDto bottomSheetTypeDto, ScreenDto screenDto, SourceDto sourceDto) {
            this.bottom_sheet_type = bottomSheetTypeDto;
            this.screen = screenDto;
            this.source = sourceDto;
        }

        public /* synthetic */ Surrogate(BottomSheetTypeDto bottomSheetTypeDto, ScreenDto screenDto, SourceDto sourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bottomSheetTypeDto, (i & 2) != 0 ? null : screenDto, (i & 4) != 0 ? null : sourceDto);
        }

        public final BottomSheetTypeDto getBottom_sheet_type() {
            return this.bottom_sheet_type;
        }

        public final ScreenDto getScreen() {
            return this.screen;
        }

        public final SourceDto getSource() {
            return this.source;
        }
    }

    /* compiled from: LaunchBottomSheetRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LaunchBottomSheetRequestDto, LaunchBottomSheetRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LaunchBottomSheetRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LaunchBottomSheetRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LaunchBottomSheetRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) LaunchBottomSheetRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LaunchBottomSheetRequest> getProtoAdapter() {
            return LaunchBottomSheetRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LaunchBottomSheetRequestDto getZeroValue() {
            return LaunchBottomSheetRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LaunchBottomSheetRequestDto fromProto(LaunchBottomSheetRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BottomSheetType bottom_sheet_type = proto.getBottom_sheet_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BottomSheetTypeDto bottomSheetTypeDtoFromProto = bottom_sheet_type != null ? BottomSheetTypeDto.INSTANCE.fromProto(bottom_sheet_type) : null;
            Screen screen = proto.getScreen();
            ScreenDto screenDtoFromProto = screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null;
            Source source = proto.getSource();
            return new LaunchBottomSheetRequestDto(new Surrogate(bottomSheetTypeDtoFromProto, screenDtoFromProto, source != null ? SourceDto.INSTANCE.fromProto(source) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.LaunchBottomSheetRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchBottomSheetRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LaunchBottomSheetRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LaunchBottomSheetRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LaunchBottomSheetRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.LaunchBottomSheetRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LaunchBottomSheetRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LaunchBottomSheetRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LaunchBottomSheetRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LaunchBottomSheetRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.LaunchBottomSheetRequestDto";
        }
    }
}
