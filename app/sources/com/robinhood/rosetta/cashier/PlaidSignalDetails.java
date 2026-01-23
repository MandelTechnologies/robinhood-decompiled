package com.robinhood.rosetta.cashier;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.cashier.PlaidSignalDetails;
import com.robinhood.rosetta.common.RHEntity;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PlaidSignalDetails.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "Lcom/squareup/wire/Message;", "", "ach_relationship_id", "", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "entity", "Lcom/robinhood/rosetta/common/RHEntity;", "attrs", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "fetch_success", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;Lcom/robinhood/rosetta/common/RHEntity;Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;ZLokio/ByteString;)V", "getAch_relationship_id", "()Ljava/lang/String;", "getAch_transfer_id", "getSource", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntity;", "getAttrs", "()Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "getFetch_success", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Source", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PlaidSignalDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidSignalDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achRelationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ach_relationship_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achTransferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ach_transfer_id;

    @WireField(adapter = "com.robinhood.rosetta.cashier.PlaidSignalAttributes#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PlaidSignalAttributes attrs;

    @WireField(adapter = "com.robinhood.rosetta.common.RHEntity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RHEntity entity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fetchSuccess", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean fetch_success;

    @WireField(adapter = "com.robinhood.rosetta.cashier.PlaidSignalDetails$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Source source;

    public PlaidSignalDetails() {
        this(null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ PlaidSignalDetails(String str, String str2, Source source, RHEntity rHEntity, PlaidSignalAttributes plaidSignalAttributes, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Source.SOURCE_UNSPECIFIED : source, (i & 8) != 0 ? RHEntity.ENTITY_TYPE_UNSPECIFIED : rHEntity, (i & 16) != 0 ? null : plaidSignalAttributes, (i & 32) != 0 ? false : z, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23975newBuilder();
    }

    public final String getAch_relationship_id() {
        return this.ach_relationship_id;
    }

    public final String getAch_transfer_id() {
        return this.ach_transfer_id;
    }

    public final Source getSource() {
        return this.source;
    }

    public final RHEntity getEntity() {
        return this.entity;
    }

    public final PlaidSignalAttributes getAttrs() {
        return this.attrs;
    }

    public final boolean getFetch_success() {
        return this.fetch_success;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSignalDetails(String ach_relationship_id, String ach_transfer_id, Source source, RHEntity entity, PlaidSignalAttributes plaidSignalAttributes, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ach_relationship_id = ach_relationship_id;
        this.ach_transfer_id = ach_transfer_id;
        this.source = source;
        this.entity = entity;
        this.attrs = plaidSignalAttributes;
        this.fetch_success = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23975newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidSignalDetails)) {
            return false;
        }
        PlaidSignalDetails plaidSignalDetails = (PlaidSignalDetails) other;
        return Intrinsics.areEqual(unknownFields(), plaidSignalDetails.unknownFields()) && Intrinsics.areEqual(this.ach_relationship_id, plaidSignalDetails.ach_relationship_id) && Intrinsics.areEqual(this.ach_transfer_id, plaidSignalDetails.ach_transfer_id) && this.source == plaidSignalDetails.source && this.entity == plaidSignalDetails.entity && Intrinsics.areEqual(this.attrs, plaidSignalDetails.attrs) && this.fetch_success == plaidSignalDetails.fetch_success;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.ach_relationship_id.hashCode()) * 37) + this.ach_transfer_id.hashCode()) * 37) + this.source.hashCode()) * 37) + this.entity.hashCode()) * 37;
        PlaidSignalAttributes plaidSignalAttributes = this.attrs;
        int iHashCode2 = ((iHashCode + (plaidSignalAttributes != null ? plaidSignalAttributes.hashCode() : 0)) * 37) + Boolean.hashCode(this.fetch_success);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ach_relationship_id=" + Internal.sanitize(this.ach_relationship_id));
        arrayList.add("ach_transfer_id=" + Internal.sanitize(this.ach_transfer_id));
        arrayList.add("source=" + this.source);
        arrayList.add("entity=" + this.entity);
        PlaidSignalAttributes plaidSignalAttributes = this.attrs;
        if (plaidSignalAttributes != null) {
            arrayList.add("attrs=" + plaidSignalAttributes);
        }
        arrayList.add("fetch_success=" + this.fetch_success);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidSignalDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidSignalDetails copy$default(PlaidSignalDetails plaidSignalDetails, String str, String str2, Source source, RHEntity rHEntity, PlaidSignalAttributes plaidSignalAttributes, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidSignalDetails.ach_relationship_id;
        }
        if ((i & 2) != 0) {
            str2 = plaidSignalDetails.ach_transfer_id;
        }
        if ((i & 4) != 0) {
            source = plaidSignalDetails.source;
        }
        if ((i & 8) != 0) {
            rHEntity = plaidSignalDetails.entity;
        }
        if ((i & 16) != 0) {
            plaidSignalAttributes = plaidSignalDetails.attrs;
        }
        if ((i & 32) != 0) {
            z = plaidSignalDetails.fetch_success;
        }
        if ((i & 64) != 0) {
            byteString = plaidSignalDetails.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        PlaidSignalAttributes plaidSignalAttributes2 = plaidSignalAttributes;
        Source source2 = source;
        return plaidSignalDetails.copy(str, str2, source2, rHEntity, plaidSignalAttributes2, z2, byteString2);
    }

    public final PlaidSignalDetails copy(String ach_relationship_id, String ach_transfer_id, Source source, RHEntity entity, PlaidSignalAttributes attrs, boolean fetch_success, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidSignalDetails(ach_relationship_id, ach_transfer_id, source, entity, attrs, fetch_success, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidSignalDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidSignalDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.PlaidSignalDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidSignalDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAch_relationship_id());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAch_transfer_id());
                }
                if (value.getSource() != PlaidSignalDetails.Source.SOURCE_UNSPECIFIED) {
                    size += PlaidSignalDetails.Source.ADAPTER.encodedSizeWithTag(3, value.getSource());
                }
                if (value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    size += RHEntity.ADAPTER.encodedSizeWithTag(4, value.getEntity());
                }
                if (value.getAttrs() != null) {
                    size += PlaidSignalAttributes.ADAPTER.encodedSizeWithTag(5, value.getAttrs());
                }
                return value.getFetch_success() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getFetch_success())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidSignalDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_relationship_id());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAch_transfer_id());
                }
                if (value.getSource() != PlaidSignalDetails.Source.SOURCE_UNSPECIFIED) {
                    PlaidSignalDetails.Source.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource());
                }
                if (value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntity());
                }
                if (value.getAttrs() != null) {
                    PlaidSignalAttributes.ADAPTER.encodeWithTag(writer, 5, (int) value.getAttrs());
                }
                if (value.getFetch_success()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getFetch_success()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidSignalDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFetch_success()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getFetch_success()));
                }
                if (value.getAttrs() != null) {
                    PlaidSignalAttributes.ADAPTER.encodeWithTag(writer, 5, (int) value.getAttrs());
                }
                if (value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 4, (int) value.getEntity());
                }
                if (value.getSource() != PlaidSignalDetails.Source.SOURCE_UNSPECIFIED) {
                    PlaidSignalDetails.Source.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAch_transfer_id());
                }
                if (Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_relationship_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidSignalDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PlaidSignalDetails.Source sourceDecode = PlaidSignalDetails.Source.SOURCE_UNSPECIFIED;
                RHEntity rHEntity = RHEntity.ENTITY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PlaidSignalAttributes plaidSignalAttributesDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                String strDecode2 = strDecode;
                RHEntity rHEntityDecode = rHEntity;
                while (true) {
                    PlaidSignalDetails.Source source = sourceDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        sourceDecode = PlaidSignalDetails.Source.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        rHEntityDecode = RHEntity.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    plaidSignalAttributesDecode = PlaidSignalAttributes.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PlaidSignalDetails(strDecode, strDecode2, source, rHEntityDecode, plaidSignalAttributesDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidSignalDetails redact(PlaidSignalDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidSignalAttributes attrs = value.getAttrs();
                return PlaidSignalDetails.copy$default(value, null, null, null, null, attrs != null ? PlaidSignalAttributes.ADAPTER.redact(attrs) : null, false, ByteString.EMPTY, 47, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaidSignalDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "ASYNC_RUNNER", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;
        public static final Source ASYNC_RUNNER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{SOURCE_UNSPECIFIED, ASYNC_RUNNER};
        }

        @JvmStatic
        public static final Source fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
            SOURCE_UNSPECIFIED = source;
            ASYNC_RUNNER = new Source("ASYNC_RUNNER", 1, 1);
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.cashier.PlaidSignalDetails$Source$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PlaidSignalDetails.Source fromValue(int value) {
                    return PlaidSignalDetails.Source.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PlaidSignalDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails$Source;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Source fromValue(int value) {
                if (value == 0) {
                    return Source.SOURCE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return Source.ASYNC_RUNNER;
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
