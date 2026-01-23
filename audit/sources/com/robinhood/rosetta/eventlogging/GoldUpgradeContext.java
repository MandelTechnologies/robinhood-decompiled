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

/* compiled from: GoldUpgradeContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GoldUpgradeContext;", "Lcom/squareup/wire/Message;", "", "has_referral", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getHas_referral", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class GoldUpgradeContext extends Message {

    @JvmField
    public static final ProtoAdapter<GoldUpgradeContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasReferral", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Boolean has_referral;

    /* JADX WARN: Multi-variable type inference failed */
    public GoldUpgradeContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24293newBuilder();
    }

    public final Boolean getHas_referral() {
        return this.has_referral;
    }

    public /* synthetic */ GoldUpgradeContext(Boolean r1, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUpgradeContext(Boolean has_referral, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(has_referral, "has_referral");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_referral = has_referral;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24293newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldUpgradeContext)) {
            return false;
        }
        GoldUpgradeContext goldUpgradeContext = (GoldUpgradeContext) other;
        return Intrinsics.areEqual(unknownFields(), goldUpgradeContext.unknownFields()) && this.has_referral == goldUpgradeContext.has_referral;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.has_referral.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_referral=" + this.has_referral);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldUpgradeContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldUpgradeContext copy$default(GoldUpgradeContext goldUpgradeContext, Boolean r1, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = goldUpgradeContext.has_referral;
        }
        if ((i & 2) != 0) {
            byteString = goldUpgradeContext.unknownFields();
        }
        return goldUpgradeContext.copy(r1, byteString);
    }

    public final GoldUpgradeContext copy(Boolean has_referral, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(has_referral, "has_referral");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldUpgradeContext(has_referral, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldUpgradeContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldUpgradeContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.GoldUpgradeContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldUpgradeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getHas_referral() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(1, value.getHas_referral()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldUpgradeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHas_referral() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getHas_referral());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldUpgradeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_referral() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getHas_referral());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldUpgradeContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldUpgradeContext(booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldUpgradeContext redact(GoldUpgradeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldUpgradeContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
