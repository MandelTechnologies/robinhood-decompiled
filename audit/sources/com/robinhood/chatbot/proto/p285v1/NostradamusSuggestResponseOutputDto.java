package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.PredictionMapDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: NostradamusSuggestResponseOutputDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutput;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate;)V", "predictionMap", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "timestampMillis", "", "(Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;Ljava/lang/String;)V", "getPredictionMap", "()Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "getTimestampMillis", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class NostradamusSuggestResponseOutputDto implements Dto3<NostradamusSuggestResponseOutput>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NostradamusSuggestResponseOutputDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NostradamusSuggestResponseOutputDto, NostradamusSuggestResponseOutput>> binaryBase64Serializer$delegate;
    private static final NostradamusSuggestResponseOutputDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NostradamusSuggestResponseOutputDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NostradamusSuggestResponseOutputDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PredictionMapDto getPredictionMap() {
        return this.surrogate.getPredictionMap();
    }

    public final String getTimestampMillis() {
        return this.surrogate.getTimestampMillis();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NostradamusSuggestResponseOutputDto(PredictionMapDto predictionMapDto, String timestampMillis) {
        this(new Surrogate(predictionMapDto, timestampMillis));
        Intrinsics.checkNotNullParameter(timestampMillis, "timestampMillis");
    }

    public /* synthetic */ NostradamusSuggestResponseOutputDto(PredictionMapDto predictionMapDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : predictionMapDto, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ NostradamusSuggestResponseOutputDto copy$default(NostradamusSuggestResponseOutputDto nostradamusSuggestResponseOutputDto, PredictionMapDto predictionMapDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            predictionMapDto = nostradamusSuggestResponseOutputDto.surrogate.getPredictionMap();
        }
        if ((i & 2) != 0) {
            str = nostradamusSuggestResponseOutputDto.surrogate.getTimestampMillis();
        }
        return nostradamusSuggestResponseOutputDto.copy(predictionMapDto, str);
    }

    public final NostradamusSuggestResponseOutputDto copy(PredictionMapDto predictionMap, String timestampMillis) {
        Intrinsics.checkNotNullParameter(timestampMillis, "timestampMillis");
        return new NostradamusSuggestResponseOutputDto(new Surrogate(predictionMap, timestampMillis));
    }

    @Override // com.robinhood.idl.Dto
    public NostradamusSuggestResponseOutput toProto() {
        PredictionMapDto predictionMap = this.surrogate.getPredictionMap();
        return new NostradamusSuggestResponseOutput(predictionMap != null ? predictionMap.toProto() : null, this.surrogate.getTimestampMillis(), null, 4, null);
    }

    public String toString() {
        return "[NostradamusSuggestResponseOutputDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NostradamusSuggestResponseOutputDto) && Intrinsics.areEqual(((NostradamusSuggestResponseOutputDto) other).surrogate, this.surrogate);
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
    /* compiled from: NostradamusSuggestResponseOutputDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate;", "", "predictionMap", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "timestampMillis", "", "<init>", "(Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/chatbot/proto/v1/PredictionMapDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPredictionMap$annotations", "()V", "getPredictionMap", "()Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "getTimestampMillis$annotations", "getTimestampMillis", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PredictionMapDto predictionMap;
        private final String timestampMillis;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((PredictionMapDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, PredictionMapDto predictionMapDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                predictionMapDto = surrogate.predictionMap;
            }
            if ((i & 2) != 0) {
                str = surrogate.timestampMillis;
            }
            return surrogate.copy(predictionMapDto, str);
        }

        @SerialName("predictionMap")
        @JsonAnnotations2(names = {"predictionMap"})
        public static /* synthetic */ void getPredictionMap$annotations() {
        }

        @SerialName("timestampMillis")
        @JsonAnnotations2(names = {"timestampMillis"})
        public static /* synthetic */ void getTimestampMillis$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PredictionMapDto getPredictionMap() {
            return this.predictionMap;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTimestampMillis() {
            return this.timestampMillis;
        }

        public final Surrogate copy(PredictionMapDto predictionMap, String timestampMillis) {
            Intrinsics.checkNotNullParameter(timestampMillis, "timestampMillis");
            return new Surrogate(predictionMap, timestampMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.predictionMap, surrogate.predictionMap) && Intrinsics.areEqual(this.timestampMillis, surrogate.timestampMillis);
        }

        public int hashCode() {
            PredictionMapDto predictionMapDto = this.predictionMap;
            return ((predictionMapDto == null ? 0 : predictionMapDto.hashCode()) * 31) + this.timestampMillis.hashCode();
        }

        public String toString() {
            return "Surrogate(predictionMap=" + this.predictionMap + ", timestampMillis=" + this.timestampMillis + ")";
        }

        /* compiled from: NostradamusSuggestResponseOutputDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NostradamusSuggestResponseOutputDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PredictionMapDto predictionMapDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.predictionMap = (i & 1) == 0 ? null : predictionMapDto;
            if ((i & 2) == 0) {
                this.timestampMillis = "";
            } else {
                this.timestampMillis = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PredictionMapDto predictionMapDto = self.predictionMap;
            if (predictionMapDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PredictionMapDto.Serializer.INSTANCE, predictionMapDto);
            }
            if (Intrinsics.areEqual(self.timestampMillis, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.timestampMillis);
        }

        public Surrogate(PredictionMapDto predictionMapDto, String timestampMillis) {
            Intrinsics.checkNotNullParameter(timestampMillis, "timestampMillis");
            this.predictionMap = predictionMapDto;
            this.timestampMillis = timestampMillis;
        }

        public final PredictionMapDto getPredictionMap() {
            return this.predictionMap;
        }

        public final String getTimestampMillis() {
            return this.timestampMillis;
        }

        public /* synthetic */ Surrogate(PredictionMapDto predictionMapDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : predictionMapDto, (i & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: NostradamusSuggestResponseOutputDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto;", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutput;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NostradamusSuggestResponseOutputDto, NostradamusSuggestResponseOutput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NostradamusSuggestResponseOutputDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NostradamusSuggestResponseOutputDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NostradamusSuggestResponseOutputDto> getBinaryBase64Serializer() {
            return (KSerializer) NostradamusSuggestResponseOutputDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NostradamusSuggestResponseOutput> getProtoAdapter() {
            return NostradamusSuggestResponseOutput.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NostradamusSuggestResponseOutputDto getZeroValue() {
            return NostradamusSuggestResponseOutputDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NostradamusSuggestResponseOutputDto fromProto(NostradamusSuggestResponseOutput proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PredictionMap predictionMap = proto.getPredictionMap();
            return new NostradamusSuggestResponseOutputDto(new Surrogate(predictionMap != null ? PredictionMapDto.INSTANCE.fromProto(predictionMap) : null, proto.getTimestampMillis()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.NostradamusSuggestResponseOutputDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NostradamusSuggestResponseOutputDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NostradamusSuggestResponseOutputDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NostradamusSuggestResponseOutputDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<NostradamusSuggestResponseOutputDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.NostradamusSuggestResponseOutput", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NostradamusSuggestResponseOutputDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NostradamusSuggestResponseOutputDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NostradamusSuggestResponseOutputDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: NostradamusSuggestResponseOutputDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostradamusSuggestResponseOutputDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.NostradamusSuggestResponseOutputDto";
        }
    }
}
