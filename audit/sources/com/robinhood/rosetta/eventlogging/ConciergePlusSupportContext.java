package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ConciergePlusSupportContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContext;", "Lcom/squareup/wire/Message;", "", "has_seen_estate_onboarding", "", "has_seen_tax_onboarding", "is_pilot_full", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLokio/ByteString;)V", "getHas_seen_estate_onboarding", "()Z", "getHas_seen_tax_onboarding", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ConciergePlusSupportContext extends Message {

    @JvmField
    public static final ProtoAdapter<ConciergePlusSupportContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSeenEstateOnboarding", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean has_seen_estate_onboarding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSeenTaxOnboarding", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean has_seen_tax_onboarding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPilotFull", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_pilot_full;

    public ConciergePlusSupportContext() {
        this(false, false, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24138newBuilder();
    }

    public final boolean getHas_seen_estate_onboarding() {
        return this.has_seen_estate_onboarding;
    }

    public final boolean getHas_seen_tax_onboarding() {
        return this.has_seen_tax_onboarding;
    }

    /* renamed from: is_pilot_full, reason: from getter */
    public final boolean getIs_pilot_full() {
        return this.is_pilot_full;
    }

    public /* synthetic */ ConciergePlusSupportContext(boolean z, boolean z2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConciergePlusSupportContext(boolean z, boolean z2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_seen_estate_onboarding = z;
        this.has_seen_tax_onboarding = z2;
        this.is_pilot_full = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24138newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConciergePlusSupportContext)) {
            return false;
        }
        ConciergePlusSupportContext conciergePlusSupportContext = (ConciergePlusSupportContext) other;
        return Intrinsics.areEqual(unknownFields(), conciergePlusSupportContext.unknownFields()) && this.has_seen_estate_onboarding == conciergePlusSupportContext.has_seen_estate_onboarding && this.has_seen_tax_onboarding == conciergePlusSupportContext.has_seen_tax_onboarding && this.is_pilot_full == conciergePlusSupportContext.is_pilot_full;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.has_seen_estate_onboarding)) * 37) + java.lang.Boolean.hashCode(this.has_seen_tax_onboarding)) * 37) + java.lang.Boolean.hashCode(this.is_pilot_full);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_seen_estate_onboarding=" + this.has_seen_estate_onboarding);
        arrayList.add("has_seen_tax_onboarding=" + this.has_seen_tax_onboarding);
        arrayList.add("is_pilot_full=" + this.is_pilot_full);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConciergePlusSupportContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ConciergePlusSupportContext copy$default(ConciergePlusSupportContext conciergePlusSupportContext, boolean z, boolean z2, boolean z3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conciergePlusSupportContext.has_seen_estate_onboarding;
        }
        if ((i & 2) != 0) {
            z2 = conciergePlusSupportContext.has_seen_tax_onboarding;
        }
        if ((i & 4) != 0) {
            z3 = conciergePlusSupportContext.is_pilot_full;
        }
        if ((i & 8) != 0) {
            byteString = conciergePlusSupportContext.unknownFields();
        }
        return conciergePlusSupportContext.copy(z, z2, z3, byteString);
    }

    public final ConciergePlusSupportContext copy(boolean has_seen_estate_onboarding, boolean has_seen_tax_onboarding, boolean is_pilot_full, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConciergePlusSupportContext(has_seen_estate_onboarding, has_seen_tax_onboarding, is_pilot_full, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConciergePlusSupportContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConciergePlusSupportContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ConciergePlusSupportContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConciergePlusSupportContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHas_seen_estate_onboarding()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getHas_seen_estate_onboarding()));
                }
                if (value.getHas_seen_tax_onboarding()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getHas_seen_tax_onboarding()));
                }
                return value.getIs_pilot_full() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIs_pilot_full())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConciergePlusSupportContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHas_seen_estate_onboarding()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getHas_seen_estate_onboarding()));
                }
                if (value.getHas_seen_tax_onboarding()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHas_seen_tax_onboarding()));
                }
                if (value.getIs_pilot_full()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_pilot_full()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConciergePlusSupportContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_pilot_full()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_pilot_full()));
                }
                if (value.getHas_seen_tax_onboarding()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHas_seen_tax_onboarding()));
                }
                if (value.getHas_seen_estate_onboarding()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getHas_seen_estate_onboarding()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConciergePlusSupportContext redact(ConciergePlusSupportContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ConciergePlusSupportContext.copy$default(value, false, false, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ConciergePlusSupportContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ConciergePlusSupportContext(zBooleanValue, zBooleanValue2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
