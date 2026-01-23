package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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

/* compiled from: ReserveHighlightComponentDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate;)V", "node_id", "", "header_text", "show_live_indicator", "", "primary_text", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getNode_id", "()Ljava/lang/String;", "getHeader_text", "getShow_live_indicator", "()Z", "getPrimary_text", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ReserveHighlightComponentDto implements Dto3<ReserveHighlightComponent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReserveHighlightComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReserveHighlightComponentDto, ReserveHighlightComponent>> binaryBase64Serializer$delegate;
    private static final ReserveHighlightComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReserveHighlightComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReserveHighlightComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getNode_id() {
        return this.surrogate.getNode_id();
    }

    public final String getHeader_text() {
        return this.surrogate.getHeader_text();
    }

    public final boolean getShow_live_indicator() {
        return this.surrogate.getShow_live_indicator();
    }

    public final String getPrimary_text() {
        return this.surrogate.getPrimary_text();
    }

    public /* synthetic */ ReserveHighlightComponentDto(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReserveHighlightComponentDto(String node_id, String header_text, boolean z, String primary_text) {
        this(new Surrogate(node_id, header_text, z, primary_text));
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
    }

    public static /* synthetic */ ReserveHighlightComponentDto copy$default(ReserveHighlightComponentDto reserveHighlightComponentDto, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reserveHighlightComponentDto.surrogate.getNode_id();
        }
        if ((i & 2) != 0) {
            str2 = reserveHighlightComponentDto.surrogate.getHeader_text();
        }
        if ((i & 4) != 0) {
            z = reserveHighlightComponentDto.surrogate.getShow_live_indicator();
        }
        if ((i & 8) != 0) {
            str3 = reserveHighlightComponentDto.surrogate.getPrimary_text();
        }
        return reserveHighlightComponentDto.copy(str, str2, z, str3);
    }

    public final ReserveHighlightComponentDto copy(String node_id, String header_text, boolean show_live_indicator, String primary_text) {
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        return new ReserveHighlightComponentDto(new Surrogate(node_id, header_text, show_live_indicator, primary_text));
    }

    @Override // com.robinhood.idl.Dto
    public ReserveHighlightComponent toProto() {
        return new ReserveHighlightComponent(this.surrogate.getNode_id(), this.surrogate.getHeader_text(), this.surrogate.getShow_live_indicator(), this.surrogate.getPrimary_text(), null, 16, null);
    }

    public String toString() {
        return "[ReserveHighlightComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReserveHighlightComponentDto) && Intrinsics.areEqual(((ReserveHighlightComponentDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReserveHighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006-"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate;", "", "node_id", "", "header_text", "show_live_indicator", "", "primary_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNode_id$annotations", "()V", "getNode_id", "()Ljava/lang/String;", "getHeader_text$annotations", "getHeader_text", "getShow_live_indicator$annotations", "getShow_live_indicator", "()Z", "getPrimary_text$annotations", "getPrimary_text", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String header_text;
        private final String node_id;
        private final String primary_text;
        private final boolean show_live_indicator;

        public Surrogate() {
            this((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.node_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.header_text;
            }
            if ((i & 4) != 0) {
                z = surrogate.show_live_indicator;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.primary_text;
            }
            return surrogate.copy(str, str2, z, str3);
        }

        @SerialName("headerText")
        @JsonAnnotations2(names = {"header_text"})
        public static /* synthetic */ void getHeader_text$annotations() {
        }

        @SerialName("nodeId")
        @JsonAnnotations2(names = {"node_id"})
        public static /* synthetic */ void getNode_id$annotations() {
        }

        @SerialName("primaryText")
        @JsonAnnotations2(names = {"primary_text"})
        public static /* synthetic */ void getPrimary_text$annotations() {
        }

        @SerialName("showLiveIndicator")
        @JsonAnnotations2(names = {"show_live_indicator"})
        public static /* synthetic */ void getShow_live_indicator$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getNode_id() {
            return this.node_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHeader_text() {
            return this.header_text;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShow_live_indicator() {
            return this.show_live_indicator;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimary_text() {
            return this.primary_text;
        }

        public final Surrogate copy(String node_id, String header_text, boolean show_live_indicator, String primary_text) {
            Intrinsics.checkNotNullParameter(node_id, "node_id");
            Intrinsics.checkNotNullParameter(header_text, "header_text");
            Intrinsics.checkNotNullParameter(primary_text, "primary_text");
            return new Surrogate(node_id, header_text, show_live_indicator, primary_text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.node_id, surrogate.node_id) && Intrinsics.areEqual(this.header_text, surrogate.header_text) && this.show_live_indicator == surrogate.show_live_indicator && Intrinsics.areEqual(this.primary_text, surrogate.primary_text);
        }

        public int hashCode() {
            return (((((this.node_id.hashCode() * 31) + this.header_text.hashCode()) * 31) + Boolean.hashCode(this.show_live_indicator)) * 31) + this.primary_text.hashCode();
        }

        public String toString() {
            return "Surrogate(node_id=" + this.node_id + ", header_text=" + this.header_text + ", show_live_indicator=" + this.show_live_indicator + ", primary_text=" + this.primary_text + ")";
        }

        /* compiled from: ReserveHighlightComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReserveHighlightComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.node_id = "";
            } else {
                this.node_id = str;
            }
            if ((i & 2) == 0) {
                this.header_text = "";
            } else {
                this.header_text = str2;
            }
            if ((i & 4) == 0) {
                this.show_live_indicator = false;
            } else {
                this.show_live_indicator = z;
            }
            if ((i & 8) == 0) {
                this.primary_text = "";
            } else {
                this.primary_text = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.node_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.node_id);
            }
            if (!Intrinsics.areEqual(self.header_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.header_text);
            }
            boolean z = self.show_live_indicator;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (Intrinsics.areEqual(self.primary_text, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.primary_text);
        }

        public Surrogate(String node_id, String header_text, boolean z, String primary_text) {
            Intrinsics.checkNotNullParameter(node_id, "node_id");
            Intrinsics.checkNotNullParameter(header_text, "header_text");
            Intrinsics.checkNotNullParameter(primary_text, "primary_text");
            this.node_id = node_id;
            this.header_text = header_text;
            this.show_live_indicator = z;
            this.primary_text = primary_text;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
        }

        public final String getNode_id() {
            return this.node_id;
        }

        public final String getHeader_text() {
            return this.header_text;
        }

        public final boolean getShow_live_indicator() {
            return this.show_live_indicator;
        }

        public final String getPrimary_text() {
            return this.primary_text;
        }
    }

    /* compiled from: ReserveHighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ReserveHighlightComponentDto, ReserveHighlightComponent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReserveHighlightComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReserveHighlightComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReserveHighlightComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) ReserveHighlightComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReserveHighlightComponent> getProtoAdapter() {
            return ReserveHighlightComponent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReserveHighlightComponentDto getZeroValue() {
            return ReserveHighlightComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReserveHighlightComponentDto fromProto(ReserveHighlightComponent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ReserveHighlightComponentDto(new Surrogate(proto.getNode_id(), proto.getHeader_text(), proto.getShow_live_indicator(), proto.getPrimary_text()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ReserveHighlightComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReserveHighlightComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReserveHighlightComponentDto(null, null, false, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ReserveHighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ReserveHighlightComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.ReserveHighlightComponent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReserveHighlightComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReserveHighlightComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReserveHighlightComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReserveHighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ReserveHighlightComponentDto";
        }
    }
}
