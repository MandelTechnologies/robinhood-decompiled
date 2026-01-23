package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
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

/* compiled from: RecommendationsContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContext;", "Lcom/squareup/wire/Message;", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "entry_point_logging_id", "", "entry_point_source", "account_number", "recommendations_type", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", InstantCashConstants.ACCOUNT_TYPE_KEY, "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;Ljava/lang/String;Lokio/ByteString;)V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "getEntry_point_logging_id", "()Ljava/lang/String;", "getEntry_point_source", "getAccount_number", "getRecommendations_type", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "getAccount_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "RecommendationsType", "EntryPoint", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RecommendationsContext extends Message {

    @JvmField
    public static final ProtoAdapter<RecommendationsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String account_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecommendationsContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointLoggingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String entry_point_logging_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String entry_point_source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecommendationsContext$RecommendationsType#ADAPTER", jsonName = "recommendationsType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final RecommendationsType recommendations_type;

    public RecommendationsContext() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24523newBuilder();
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public /* synthetic */ RecommendationsContext(EntryPoint entryPoint, String str, String str2, String str3, RecommendationsType recommendationsType, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED : recommendationsType, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getEntry_point_logging_id() {
        return this.entry_point_logging_id;
    }

    public final String getEntry_point_source() {
        return this.entry_point_source;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final RecommendationsType getRecommendations_type() {
        return this.recommendations_type;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsContext(EntryPoint entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsType recommendations_type, String account_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point = entry_point;
        this.entry_point_logging_id = entry_point_logging_id;
        this.entry_point_source = entry_point_source;
        this.account_number = account_number;
        this.recommendations_type = recommendations_type;
        this.account_type = account_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24523newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RecommendationsContext)) {
            return false;
        }
        RecommendationsContext recommendationsContext = (RecommendationsContext) other;
        return Intrinsics.areEqual(unknownFields(), recommendationsContext.unknownFields()) && this.entry_point == recommendationsContext.entry_point && Intrinsics.areEqual(this.entry_point_logging_id, recommendationsContext.entry_point_logging_id) && Intrinsics.areEqual(this.entry_point_source, recommendationsContext.entry_point_source) && Intrinsics.areEqual(this.account_number, recommendationsContext.account_number) && this.recommendations_type == recommendationsContext.recommendations_type && Intrinsics.areEqual(this.account_type, recommendationsContext.account_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.entry_point.hashCode()) * 37) + this.entry_point_logging_id.hashCode()) * 37) + this.entry_point_source.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.recommendations_type.hashCode()) * 37) + this.account_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("entry_point_logging_id=" + Internal.sanitize(this.entry_point_logging_id));
        arrayList.add("entry_point_source=" + Internal.sanitize(this.entry_point_source));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("recommendations_type=" + this.recommendations_type);
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecommendationsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RecommendationsContext copy$default(RecommendationsContext recommendationsContext, EntryPoint entryPoint, String str, String str2, String str3, RecommendationsType recommendationsType, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = recommendationsContext.entry_point;
        }
        if ((i & 2) != 0) {
            str = recommendationsContext.entry_point_logging_id;
        }
        if ((i & 4) != 0) {
            str2 = recommendationsContext.entry_point_source;
        }
        if ((i & 8) != 0) {
            str3 = recommendationsContext.account_number;
        }
        if ((i & 16) != 0) {
            recommendationsType = recommendationsContext.recommendations_type;
        }
        if ((i & 32) != 0) {
            str4 = recommendationsContext.account_type;
        }
        if ((i & 64) != 0) {
            byteString = recommendationsContext.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        RecommendationsType recommendationsType2 = recommendationsType;
        String str6 = str2;
        return recommendationsContext.copy(entryPoint, str, str6, str3, recommendationsType2, str5, byteString2);
    }

    public final RecommendationsContext copy(EntryPoint entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsType recommendations_type, String account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RecommendationsContext(entry_point, entry_point_logging_id, entry_point_source, account_number, recommendations_type, account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendationsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RecommendationsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecommendationsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEntry_point() != RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += RecommendationsContext.EntryPoint.ADAPTER.encodedSizeWithTag(1, value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEntry_point_logging_id());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEntry_point_source());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_number());
                }
                if (value.getRecommendations_type() != RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED) {
                    size += RecommendationsContext.RecommendationsType.ADAPTER.encodedSizeWithTag(5, value.getRecommendations_type());
                }
                return !Intrinsics.areEqual(value.getAccount_type(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAccount_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecommendationsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEntry_point() != RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    RecommendationsContext.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEntry_point_logging_id());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntry_point_source());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_number());
                }
                if (value.getRecommendations_type() != RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED) {
                    RecommendationsContext.RecommendationsType.ADAPTER.encodeWithTag(writer, 5, (int) value.getRecommendations_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAccount_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecommendationsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAccount_type());
                }
                if (value.getRecommendations_type() != RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED) {
                    RecommendationsContext.RecommendationsType.ADAPTER.encodeWithTag(writer, 5, (int) value.getRecommendations_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntry_point_source());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEntry_point_logging_id());
                }
                if (value.getEntry_point() != RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    RecommendationsContext.EntryPoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getEntry_point());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RecommendationsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RecommendationsContext.EntryPoint entryPointDecode = RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                RecommendationsContext.RecommendationsType recommendationsType = RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                RecommendationsContext.RecommendationsType recommendationsTypeDecode = recommendationsType;
                while (true) {
                    RecommendationsContext.EntryPoint entryPoint = entryPointDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        entryPointDecode = RecommendationsContext.EntryPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        recommendationsTypeDecode = RecommendationsContext.RecommendationsType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new RecommendationsContext(entryPoint, strDecode, strDecode2, strDecode3, recommendationsTypeDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecommendationsContext redact(RecommendationsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RecommendationsContext.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RECOMMENDATIONS_TYPE_UNSPECIFIED", "FIRST_TRADE_RECOMMENDATIONS", "RECS_RETIREMENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecommendationsType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecommendationsType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<RecommendationsType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RecommendationsType FIRST_TRADE_RECOMMENDATIONS;
        public static final RecommendationsType RECOMMENDATIONS_TYPE_UNSPECIFIED;
        public static final RecommendationsType RECS_RETIREMENT;
        private final int value;

        private static final /* synthetic */ RecommendationsType[] $values() {
            return new RecommendationsType[]{RECOMMENDATIONS_TYPE_UNSPECIFIED, FIRST_TRADE_RECOMMENDATIONS, RECS_RETIREMENT};
        }

        @JvmStatic
        public static final RecommendationsType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RecommendationsType> getEntries() {
            return $ENTRIES;
        }

        private RecommendationsType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RecommendationsType recommendationsType = new RecommendationsType("RECOMMENDATIONS_TYPE_UNSPECIFIED", 0, 0);
            RECOMMENDATIONS_TYPE_UNSPECIFIED = recommendationsType;
            FIRST_TRADE_RECOMMENDATIONS = new RecommendationsType("FIRST_TRADE_RECOMMENDATIONS", 1, 1);
            RECS_RETIREMENT = new RecommendationsType("RECS_RETIREMENT", 2, 2);
            RecommendationsType[] recommendationsTypeArr$values = $values();
            $VALUES = recommendationsTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recommendationsTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendationsType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RecommendationsType>(orCreateKotlinClass, syntax, recommendationsType) { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContext$RecommendationsType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecommendationsContext.RecommendationsType fromValue(int value) {
                    return RecommendationsContext.RecommendationsType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecommendationsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RecommendationsType fromValue(int value) {
                if (value == 0) {
                    return RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return RecommendationsType.FIRST_TRADE_RECOMMENDATIONS;
                }
                if (value != 2) {
                    return null;
                }
                return RecommendationsType.RECS_RETIREMENT;
            }
        }

        public static RecommendationsType valueOf(String str) {
            return (RecommendationsType) Enum.valueOf(RecommendationsType.class, str);
        }

        public static RecommendationsType[] values() {
            return (RecommendationsType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "BROWSE_UPSELL", "CARD", "MENU_OF_OPTIONS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint BROWSE_UPSELL;
        public static final EntryPoint CARD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint MENU_OF_OPTIONS;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, BROWSE_UPSELL, CARD, MENU_OF_OPTIONS};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            BROWSE_UPSELL = new EntryPoint("BROWSE_UPSELL", 1, 1);
            CARD = new EntryPoint("CARD", 2, 2);
            MENU_OF_OPTIONS = new EntryPoint("MENU_OF_OPTIONS", 3, 3);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecommendationsContext.EntryPoint fromValue(int value) {
                    return RecommendationsContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecommendationsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryPoint.BROWSE_UPSELL;
                }
                if (value == 2) {
                    return EntryPoint.CARD;
                }
                if (value != 3) {
                    return null;
                }
                return EntryPoint.MENU_OF_OPTIONS;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
