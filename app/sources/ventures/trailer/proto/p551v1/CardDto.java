package ventures.trailer.proto.p551v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;
import ventures.trailer.proto.p551v1.CalendarEventDto;

/* compiled from: CardDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto;", "Lcom/robinhood/idl/MessageDto;", "Lventures/trailer/proto/v1/Card;", "Landroid/os/Parcelable;", "Lventures/trailer/proto/v1/CardDto$Surrogate;", "surrogate", "<init>", "(Lventures/trailer/proto/v1/CardDto$Surrogate;)V", "", "background_image_url", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "cta_text", "Lventures/trailer/proto/v1/CalendarEventDto;", "calendar_event", "(Ljava/lang/String;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lventures/trailer/proto/v1/CalendarEventDto;)V", "toProto", "()Lventures/trailer/proto/v1/Card;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lventures/trailer/proto/v1/CardDto$Surrogate;", "getBackground_image_url", "getBody", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getCta_text", "getCalendar_event", "()Lventures/trailer/proto/v1/CalendarEventDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class CardDto implements Dto3<Card>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CardDto, Card>> binaryBase64Serializer$delegate;
    private static final CardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBackground_image_url() {
        return this.surrogate.getBackground_image_url();
    }

    public final UIComponentDto getBody() {
        return this.surrogate.getBody();
    }

    public final String getCta_text() {
        return this.surrogate.getCta_text();
    }

    public final CalendarEventDto getCalendar_event() {
        return this.surrogate.getCalendar_event();
    }

    public /* synthetic */ CardDto(String str, UIComponentDto uIComponentDto, String str2, CalendarEventDto calendarEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : uIComponentDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : calendarEventDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardDto(String background_image_url, UIComponentDto uIComponentDto, String cta_text, CalendarEventDto calendarEventDto) {
        this(new Surrogate(background_image_url, uIComponentDto, cta_text, calendarEventDto));
        Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
    }

    @Override // com.robinhood.idl.Dto
    public Card toProto() {
        String background_image_url = this.surrogate.getBackground_image_url();
        UIComponentDto body = this.surrogate.getBody();
        UIComponent proto = body != null ? body.toProto() : null;
        String cta_text = this.surrogate.getCta_text();
        CalendarEventDto calendar_event2 = this.surrogate.getCalendar_event();
        return new Card(background_image_url, proto, cta_text, calendar_event2 != null ? calendar_event2.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CardDto) && Intrinsics.areEqual(((CardDto) other).surrogate, this.surrogate);
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
    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto$Surrogate;", "", "", "background_image_url", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "cta_text", "Lventures/trailer/proto/v1/CalendarEventDto;", "calendar_event", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lventures/trailer/proto/v1/CalendarEventDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lventures/trailer/proto/v1/CalendarEventDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_ventures_proto_v1_externalRelease", "(Lventures/trailer/proto/v1/CardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackground_image_url", "getBackground_image_url$annotations", "()V", "Lrh_server_driven_ui/v1/UIComponentDto;", "getBody", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getBody$annotations", "getCta_text", "getCta_text$annotations", "Lventures/trailer/proto/v1/CalendarEventDto;", "getCalendar_event", "()Lventures/trailer/proto/v1/CalendarEventDto;", "getCalendar_event$annotations", "Companion", "$serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String background_image_url;
        private final UIComponentDto body;
        private final CalendarEventDto calendar_event;
        private final String cta_text;

        public Surrogate() {
            this((String) null, (UIComponentDto) null, (String) null, (CalendarEventDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.background_image_url, surrogate.background_image_url) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text) && Intrinsics.areEqual(this.calendar_event, surrogate.calendar_event);
        }

        public int hashCode() {
            int iHashCode = this.background_image_url.hashCode() * 31;
            UIComponentDto uIComponentDto = this.body;
            int iHashCode2 = (((iHashCode + (uIComponentDto == null ? 0 : uIComponentDto.hashCode())) * 31) + this.cta_text.hashCode()) * 31;
            CalendarEventDto calendarEventDto = this.calendar_event;
            return iHashCode2 + (calendarEventDto != null ? calendarEventDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(background_image_url=" + this.background_image_url + ", body=" + this.body + ", cta_text=" + this.cta_text + ", calendar_event=" + this.calendar_event + ")";
        }

        /* compiled from: CardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/CardDto$Surrogate;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CardDto8.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, UIComponentDto uIComponentDto, String str2, CalendarEventDto calendarEventDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.background_image_url = "";
            } else {
                this.background_image_url = str;
            }
            if ((i & 2) == 0) {
                this.body = null;
            } else {
                this.body = uIComponentDto;
            }
            if ((i & 4) == 0) {
                this.cta_text = "";
            } else {
                this.cta_text = str2;
            }
            if ((i & 8) == 0) {
                this.calendar_event = null;
            } else {
                this.calendar_event = calendarEventDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_contracts_ventures_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.background_image_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.background_image_url);
            }
            UIComponentDto uIComponentDto = self.body;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            if (!Intrinsics.areEqual(self.cta_text, "")) {
                output.encodeStringElement(serialDesc, 2, self.cta_text);
            }
            CalendarEventDto calendarEventDto = self.calendar_event;
            if (calendarEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CalendarEventDto.Serializer.INSTANCE, calendarEventDto);
            }
        }

        public Surrogate(String background_image_url, UIComponentDto uIComponentDto, String cta_text, CalendarEventDto calendarEventDto) {
            Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            this.background_image_url = background_image_url;
            this.body = uIComponentDto;
            this.cta_text = cta_text;
            this.calendar_event = calendarEventDto;
        }

        public /* synthetic */ Surrogate(String str, UIComponentDto uIComponentDto, String str2, CalendarEventDto calendarEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : uIComponentDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : calendarEventDto);
        }

        public final String getBackground_image_url() {
            return this.background_image_url;
        }

        public final UIComponentDto getBody() {
            return this.body;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        public final CalendarEventDto getCalendar_event() {
            return this.calendar_event;
        }
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lventures/trailer/proto/v1/CardDto;", "Lventures/trailer/proto/v1/Card;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lventures/trailer/proto/v1/CardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CardDto, Card> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CardDto> getBinaryBase64Serializer() {
            return (KSerializer) CardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Card> getProtoAdapter() {
            return Card.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CardDto getZeroValue() {
            return CardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CardDto fromProto(Card proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String background_image_url = proto.getBackground_image_url();
            UIComponent body = proto.getBody();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = body != null ? UIComponentDto.INSTANCE.fromProto(body) : null;
            String cta_text = proto.getCta_text();
            CalendarEvent calendar_event2 = proto.getCalendar_event();
            return new CardDto(new Surrogate(background_image_url, uIComponentDtoFromProto, cta_text, calendar_event2 != null ? CalendarEventDto.INSTANCE.fromProto(calendar_event2) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: ventures.trailer.proto.v1.CardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CardDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/CardDto;", "<init>", "()V", "surrogateSerializer", "Lventures/trailer/proto/v1/CardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ventures.trailer.proto.v1.Card", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lventures/trailer/proto/v1/CardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "ventures.trailer.proto.v1.CardDto";
        }
    }
}
