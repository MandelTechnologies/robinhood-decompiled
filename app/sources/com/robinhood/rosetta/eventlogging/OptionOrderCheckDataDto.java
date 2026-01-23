package com.robinhood.rosetta.eventlogging;

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

/* compiled from: OptionOrderCheckDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate;)V", "alert_type", "", "triggered_action_identifier", "abort_reason", "number_of_checks_seen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlert_type", "()Ljava/lang/String;", "getTriggered_action_identifier", "getAbort_reason", "getNumber_of_checks_seen", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionOrderCheckDataDto implements Dto3<OptionOrderCheckData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionOrderCheckDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderCheckDataDto, OptionOrderCheckData>> binaryBase64Serializer$delegate;
    private static final OptionOrderCheckDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionOrderCheckDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderCheckDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAlert_type() {
        return this.surrogate.getAlert_type();
    }

    public final String getTriggered_action_identifier() {
        return this.surrogate.getTriggered_action_identifier();
    }

    public final String getAbort_reason() {
        return this.surrogate.getAbort_reason();
    }

    public final String getNumber_of_checks_seen() {
        return this.surrogate.getNumber_of_checks_seen();
    }

    public /* synthetic */ OptionOrderCheckDataDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderCheckDataDto(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen) {
        this(new Surrogate(alert_type, triggered_action_identifier, abort_reason, number_of_checks_seen));
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
        Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
        Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
    }

    public static /* synthetic */ OptionOrderCheckDataDto copy$default(OptionOrderCheckDataDto optionOrderCheckDataDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderCheckDataDto.surrogate.getAlert_type();
        }
        if ((i & 2) != 0) {
            str2 = optionOrderCheckDataDto.surrogate.getTriggered_action_identifier();
        }
        if ((i & 4) != 0) {
            str3 = optionOrderCheckDataDto.surrogate.getAbort_reason();
        }
        if ((i & 8) != 0) {
            str4 = optionOrderCheckDataDto.surrogate.getNumber_of_checks_seen();
        }
        return optionOrderCheckDataDto.copy(str, str2, str3, str4);
    }

    public final OptionOrderCheckDataDto copy(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen) {
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
        Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
        Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
        return new OptionOrderCheckDataDto(new Surrogate(alert_type, triggered_action_identifier, abort_reason, number_of_checks_seen));
    }

    @Override // com.robinhood.idl.Dto
    public OptionOrderCheckData toProto() {
        return new OptionOrderCheckData(this.surrogate.getAlert_type(), this.surrogate.getTriggered_action_identifier(), this.surrogate.getAbort_reason(), this.surrogate.getNumber_of_checks_seen(), null, 16, null);
    }

    public String toString() {
        return "[OptionOrderCheckDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionOrderCheckDataDto) && Intrinsics.areEqual(((OptionOrderCheckDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionOrderCheckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate;", "", "alert_type", "", "triggered_action_identifier", "abort_reason", "number_of_checks_seen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAlert_type$annotations", "()V", "getAlert_type", "()Ljava/lang/String;", "getTriggered_action_identifier$annotations", "getTriggered_action_identifier", "getAbort_reason$annotations", "getAbort_reason", "getNumber_of_checks_seen$annotations", "getNumber_of_checks_seen", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String abort_reason;
        private final String alert_type;
        private final String number_of_checks_seen;
        private final String triggered_action_identifier;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.alert_type;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.triggered_action_identifier;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.abort_reason;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.number_of_checks_seen;
            }
            return surrogate.copy(str, str2, str3, str4);
        }

        @SerialName("abortReason")
        @JsonAnnotations2(names = {"abort_reason"})
        public static /* synthetic */ void getAbort_reason$annotations() {
        }

        @SerialName("alertType")
        @JsonAnnotations2(names = {"alert_type"})
        public static /* synthetic */ void getAlert_type$annotations() {
        }

        @SerialName("numberOfChecksSeen")
        @JsonAnnotations2(names = {"number_of_checks_seen"})
        public static /* synthetic */ void getNumber_of_checks_seen$annotations() {
        }

        @SerialName("triggeredActionIdentifier")
        @JsonAnnotations2(names = {"triggered_action_identifier"})
        public static /* synthetic */ void getTriggered_action_identifier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAlert_type() {
            return this.alert_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTriggered_action_identifier() {
            return this.triggered_action_identifier;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAbort_reason() {
            return this.abort_reason;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNumber_of_checks_seen() {
            return this.number_of_checks_seen;
        }

        public final Surrogate copy(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen) {
            Intrinsics.checkNotNullParameter(alert_type, "alert_type");
            Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
            Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
            Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
            return new Surrogate(alert_type, triggered_action_identifier, abort_reason, number_of_checks_seen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.alert_type, surrogate.alert_type) && Intrinsics.areEqual(this.triggered_action_identifier, surrogate.triggered_action_identifier) && Intrinsics.areEqual(this.abort_reason, surrogate.abort_reason) && Intrinsics.areEqual(this.number_of_checks_seen, surrogate.number_of_checks_seen);
        }

        public int hashCode() {
            return (((((this.alert_type.hashCode() * 31) + this.triggered_action_identifier.hashCode()) * 31) + this.abort_reason.hashCode()) * 31) + this.number_of_checks_seen.hashCode();
        }

        public String toString() {
            return "Surrogate(alert_type=" + this.alert_type + ", triggered_action_identifier=" + this.triggered_action_identifier + ", abort_reason=" + this.abort_reason + ", number_of_checks_seen=" + this.number_of_checks_seen + ")";
        }

        /* compiled from: OptionOrderCheckDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionOrderCheckDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.alert_type = "";
            } else {
                this.alert_type = str;
            }
            if ((i & 2) == 0) {
                this.triggered_action_identifier = "";
            } else {
                this.triggered_action_identifier = str2;
            }
            if ((i & 4) == 0) {
                this.abort_reason = "";
            } else {
                this.abort_reason = str3;
            }
            if ((i & 8) == 0) {
                this.number_of_checks_seen = "";
            } else {
                this.number_of_checks_seen = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.alert_type, "")) {
                output.encodeStringElement(serialDesc, 0, self.alert_type);
            }
            if (!Intrinsics.areEqual(self.triggered_action_identifier, "")) {
                output.encodeStringElement(serialDesc, 1, self.triggered_action_identifier);
            }
            if (!Intrinsics.areEqual(self.abort_reason, "")) {
                output.encodeStringElement(serialDesc, 2, self.abort_reason);
            }
            if (Intrinsics.areEqual(self.number_of_checks_seen, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.number_of_checks_seen);
        }

        public Surrogate(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen) {
            Intrinsics.checkNotNullParameter(alert_type, "alert_type");
            Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
            Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
            Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
            this.alert_type = alert_type;
            this.triggered_action_identifier = triggered_action_identifier;
            this.abort_reason = abort_reason;
            this.number_of_checks_seen = number_of_checks_seen;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final String getAlert_type() {
            return this.alert_type;
        }

        public final String getTriggered_action_identifier() {
            return this.triggered_action_identifier;
        }

        public final String getAbort_reason() {
            return this.abort_reason;
        }

        public final String getNumber_of_checks_seen() {
            return this.number_of_checks_seen;
        }
    }

    /* compiled from: OptionOrderCheckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionOrderCheckDataDto, OptionOrderCheckData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderCheckDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderCheckDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderCheckDataDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderCheckDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderCheckData> getProtoAdapter() {
            return OptionOrderCheckData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderCheckDataDto getZeroValue() {
            return OptionOrderCheckDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderCheckDataDto fromProto(OptionOrderCheckData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionOrderCheckDataDto(new Surrogate(proto.getAlert_type(), proto.getTriggered_action_identifier(), proto.getAbort_reason(), proto.getNumber_of_checks_seen()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionOrderCheckDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderCheckDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionOrderCheckDataDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionOrderCheckDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionOrderCheckDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionOrderCheckData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderCheckDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderCheckDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionOrderCheckDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionOrderCheckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionOrderCheckDataDto";
        }
    }
}
