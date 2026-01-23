package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContextDto;
import com.robinhood.rosetta.eventlogging.IpoaParticipationGraphPrismContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: IpoaParticipationGraphContextDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate;)V", "graph_identifier", "", "prisms", "", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphPrismContextDto;", "average_value", "", "(Ljava/lang/String;Ljava/util/List;F)V", "getGraph_identifier", "()Ljava/lang/String;", "getPrisms", "()Ljava/util/List;", "getAverage_value", "()F", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class IpoaParticipationGraphContextDto implements Dto3<IpoaParticipationGraphContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IpoaParticipationGraphContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IpoaParticipationGraphContextDto, IpoaParticipationGraphContext>> binaryBase64Serializer$delegate;
    private static final IpoaParticipationGraphContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IpoaParticipationGraphContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IpoaParticipationGraphContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getGraph_identifier() {
        return this.surrogate.getGraph_identifier();
    }

    public final java.util.List<IpoaParticipationGraphPrismContextDto> getPrisms() {
        return this.surrogate.getPrisms();
    }

    public final float getAverage_value() {
        return this.surrogate.getAverage_value();
    }

    public /* synthetic */ IpoaParticipationGraphContextDto(String str, java.util.List list, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IpoaParticipationGraphContextDto(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContextDto> prisms, float f) {
        this(new Surrogate(graph_identifier, prisms, f));
        Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
        Intrinsics.checkNotNullParameter(prisms, "prisms");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IpoaParticipationGraphContextDto copy$default(IpoaParticipationGraphContextDto ipoaParticipationGraphContextDto, String str, java.util.List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoaParticipationGraphContextDto.surrogate.getGraph_identifier();
        }
        if ((i & 2) != 0) {
            list = ipoaParticipationGraphContextDto.surrogate.getPrisms();
        }
        if ((i & 4) != 0) {
            f = ipoaParticipationGraphContextDto.surrogate.getAverage_value();
        }
        return ipoaParticipationGraphContextDto.copy(str, list, f);
    }

    public final IpoaParticipationGraphContextDto copy(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContextDto> prisms, float average_value) {
        Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
        Intrinsics.checkNotNullParameter(prisms, "prisms");
        return new IpoaParticipationGraphContextDto(new Surrogate(graph_identifier, prisms, average_value));
    }

    @Override // com.robinhood.idl.Dto
    public IpoaParticipationGraphContext toProto() {
        String graph_identifier = this.surrogate.getGraph_identifier();
        java.util.List<IpoaParticipationGraphPrismContextDto> prisms = this.surrogate.getPrisms();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(prisms, 10));
        Iterator<T> it = prisms.iterator();
        while (it.hasNext()) {
            arrayList.add(((IpoaParticipationGraphPrismContextDto) it.next()).toProto());
        }
        return new IpoaParticipationGraphContext(graph_identifier, arrayList, this.surrogate.getAverage_value(), null, 8, null);
    }

    public String toString() {
        return "[IpoaParticipationGraphContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IpoaParticipationGraphContextDto) && Intrinsics.areEqual(((IpoaParticipationGraphContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: IpoaParticipationGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./B:\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\f\u0010\rB=\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0018\u0010\u001f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate;", "", "graph_identifier", "", "prisms", "", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphPrismContextDto;", "average_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "<init>", "(Ljava/lang/String;Ljava/util/List;F)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGraph_identifier$annotations", "()V", "getGraph_identifier", "()Ljava/lang/String;", "getPrisms$annotations", "getPrisms", "()Ljava/util/List;", "getAverage_value$annotations", "getAverage_value", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final float average_value;
        private final String graph_identifier;
        private final java.util.List<IpoaParticipationGraphPrismContextDto> prisms;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoaParticipationGraphContextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (java.util.List) null, 0.0f, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(IpoaParticipationGraphPrismContextDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, java.util.List list, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.graph_identifier;
            }
            if ((i & 2) != 0) {
                list = surrogate.prisms;
            }
            if ((i & 4) != 0) {
                f = surrogate.average_value;
            }
            return surrogate.copy(str, list, f);
        }

        @SerialName("averageValue")
        @JsonAnnotations2(names = {"average_value"})
        public static /* synthetic */ void getAverage_value$annotations() {
        }

        @SerialName("graphIdentifier")
        @JsonAnnotations2(names = {"graph_identifier"})
        public static /* synthetic */ void getGraph_identifier$annotations() {
        }

        @SerialName("prisms")
        @JsonAnnotations2(names = {"prisms"})
        public static /* synthetic */ void getPrisms$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getGraph_identifier() {
            return this.graph_identifier;
        }

        public final java.util.List<IpoaParticipationGraphPrismContextDto> component2() {
            return this.prisms;
        }

        /* renamed from: component3, reason: from getter */
        public final float getAverage_value() {
            return this.average_value;
        }

        public final Surrogate copy(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContextDto> prisms, float average_value) {
            Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
            Intrinsics.checkNotNullParameter(prisms, "prisms");
            return new Surrogate(graph_identifier, prisms, average_value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.graph_identifier, surrogate.graph_identifier) && Intrinsics.areEqual(this.prisms, surrogate.prisms) && Float.compare(this.average_value, surrogate.average_value) == 0;
        }

        public int hashCode() {
            return (((this.graph_identifier.hashCode() * 31) + this.prisms.hashCode()) * 31) + Float.hashCode(this.average_value);
        }

        public String toString() {
            return "Surrogate(graph_identifier=" + this.graph_identifier + ", prisms=" + this.prisms + ", average_value=" + this.average_value + ")";
        }

        /* compiled from: IpoaParticipationGraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IpoaParticipationGraphContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, java.util.List list, float f, SerializationConstructorMarker serializationConstructorMarker) {
            this.graph_identifier = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.prisms = CollectionsKt.emptyList();
            } else {
                this.prisms = list;
            }
            if ((i & 4) == 0) {
                this.average_value = 0.0f;
            } else {
                this.average_value = f;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.graph_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.graph_identifier);
            }
            if (!Intrinsics.areEqual(self.prisms, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.prisms);
            }
            if (Float.compare(self.average_value, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.average_value));
            }
        }

        public Surrogate(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContextDto> prisms, float f) {
            Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
            Intrinsics.checkNotNullParameter(prisms, "prisms");
            this.graph_identifier = graph_identifier;
            this.prisms = prisms;
            this.average_value = f;
        }

        public final String getGraph_identifier() {
            return this.graph_identifier;
        }

        public /* synthetic */ Surrogate(String str, java.util.List list, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? 0.0f : f);
        }

        public final java.util.List<IpoaParticipationGraphPrismContextDto> getPrisms() {
            return this.prisms;
        }

        public final float getAverage_value() {
            return this.average_value;
        }
    }

    /* compiled from: IpoaParticipationGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto;", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IpoaParticipationGraphContextDto, IpoaParticipationGraphContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IpoaParticipationGraphContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IpoaParticipationGraphContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IpoaParticipationGraphContextDto> getBinaryBase64Serializer() {
            return (KSerializer) IpoaParticipationGraphContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IpoaParticipationGraphContext> getProtoAdapter() {
            return IpoaParticipationGraphContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IpoaParticipationGraphContextDto getZeroValue() {
            return IpoaParticipationGraphContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IpoaParticipationGraphContextDto fromProto(IpoaParticipationGraphContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String graph_identifier = proto.getGraph_identifier();
            java.util.List<IpoaParticipationGraphPrismContext> prisms = proto.getPrisms();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(prisms, 10));
            Iterator<T> it = prisms.iterator();
            while (it.hasNext()) {
                arrayList.add(IpoaParticipationGraphPrismContextDto.INSTANCE.fromProto((IpoaParticipationGraphPrismContext) it.next()));
            }
            return new IpoaParticipationGraphContextDto(new Surrogate(graph_identifier, arrayList, proto.getAverage_value()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoaParticipationGraphContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new IpoaParticipationGraphContextDto(null, null, 0.0f, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IpoaParticipationGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<IpoaParticipationGraphContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.IpoaParticipationGraphContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IpoaParticipationGraphContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IpoaParticipationGraphContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IpoaParticipationGraphContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IpoaParticipationGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContextDto";
        }
    }
}
