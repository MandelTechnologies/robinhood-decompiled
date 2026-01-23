package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
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

/* compiled from: RecsRetirementContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext;", "Lcom/squareup/wire/Message;", "", "entry_point_source", "", "account_number", InstantCashConstants.ACCOUNT_TYPE_KEY, "recommendations_state", "Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;Lokio/ByteString;)V", "getEntry_point_source", "()Ljava/lang/String;", "getAccount_number", "getAccount_type", "getRecommendations_state", "()Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "RecommendationsState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RecsRetirementContext extends Message {

    @JvmField
    public static final ProtoAdapter<RecsRetirementContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String entry_point_source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecsRetirementContext$RecommendationsState#ADAPTER", jsonName = "recommendationsState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RecommendationsState recommendations_state;

    public RecsRetirementContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ RecsRetirementContext(String str, String str2, String str3, RecommendationsState recommendationsState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED : recommendationsState, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24528newBuilder();
    }

    public final String getEntry_point_source() {
        return this.entry_point_source;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final RecommendationsState getRecommendations_state() {
        return this.recommendations_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsRetirementContext(String entry_point_source, String account_number, String account_type, RecommendationsState recommendations_state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(recommendations_state, "recommendations_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point_source = entry_point_source;
        this.account_number = account_number;
        this.account_type = account_type;
        this.recommendations_state = recommendations_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24528newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RecsRetirementContext)) {
            return false;
        }
        RecsRetirementContext recsRetirementContext = (RecsRetirementContext) other;
        return Intrinsics.areEqual(unknownFields(), recsRetirementContext.unknownFields()) && Intrinsics.areEqual(this.entry_point_source, recsRetirementContext.entry_point_source) && Intrinsics.areEqual(this.account_number, recsRetirementContext.account_number) && Intrinsics.areEqual(this.account_type, recsRetirementContext.account_type) && this.recommendations_state == recsRetirementContext.recommendations_state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.entry_point_source.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.account_type.hashCode()) * 37) + this.recommendations_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_point_source=" + Internal.sanitize(this.entry_point_source));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("recommendations_state=" + this.recommendations_state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecsRetirementContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RecsRetirementContext copy$default(RecsRetirementContext recsRetirementContext, String str, String str2, String str3, RecommendationsState recommendationsState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recsRetirementContext.entry_point_source;
        }
        if ((i & 2) != 0) {
            str2 = recsRetirementContext.account_number;
        }
        if ((i & 4) != 0) {
            str3 = recsRetirementContext.account_type;
        }
        if ((i & 8) != 0) {
            recommendationsState = recsRetirementContext.recommendations_state;
        }
        if ((i & 16) != 0) {
            byteString = recsRetirementContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return recsRetirementContext.copy(str, str2, str4, recommendationsState, byteString2);
    }

    public final RecsRetirementContext copy(String entry_point_source, String account_number, String account_type, RecommendationsState recommendations_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(recommendations_state, "recommendations_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RecsRetirementContext(entry_point_source, account_number, account_type, recommendations_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecsRetirementContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RecsRetirementContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RecsRetirementContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecsRetirementContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntry_point_source());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_type());
                }
                return value.getRecommendations_state() != RecsRetirementContext.RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED ? size + RecsRetirementContext.RecommendationsState.ADAPTER.encodedSizeWithTag(4, value.getRecommendations_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecsRetirementContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_source());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                if (value.getRecommendations_state() != RecsRetirementContext.RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED) {
                    RecsRetirementContext.RecommendationsState.ADAPTER.encodeWithTag(writer, 4, (int) value.getRecommendations_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecsRetirementContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRecommendations_state() != RecsRetirementContext.RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED) {
                    RecsRetirementContext.RecommendationsState.ADAPTER.encodeWithTag(writer, 4, (int) value.getRecommendations_state());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_source());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RecsRetirementContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RecsRetirementContext.RecommendationsState recommendationsStateDecode = RecsRetirementContext.RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    RecsRetirementContext.RecommendationsState recommendationsState = recommendationsStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RecsRetirementContext(strDecode, strDecode2, strDecode3, recommendationsState, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                recommendationsStateDecode = RecsRetirementContext.RecommendationsState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecsRetirementContext redact(RecsRetirementContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RecsRetirementContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecsRetirementContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RECOMMENDATIONS_STATE_UNSPECIFIED", "RECS_INVESTED", "NON_RECS_INVESTED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecommendationsState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecommendationsState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<RecommendationsState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RecommendationsState NON_RECS_INVESTED;
        public static final RecommendationsState RECOMMENDATIONS_STATE_UNSPECIFIED;
        public static final RecommendationsState RECS_INVESTED;
        private final int value;

        private static final /* synthetic */ RecommendationsState[] $values() {
            return new RecommendationsState[]{RECOMMENDATIONS_STATE_UNSPECIFIED, RECS_INVESTED, NON_RECS_INVESTED};
        }

        @JvmStatic
        public static final RecommendationsState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RecommendationsState> getEntries() {
            return $ENTRIES;
        }

        private RecommendationsState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RecommendationsState recommendationsState = new RecommendationsState("RECOMMENDATIONS_STATE_UNSPECIFIED", 0, 0);
            RECOMMENDATIONS_STATE_UNSPECIFIED = recommendationsState;
            RECS_INVESTED = new RecommendationsState("RECS_INVESTED", 1, 1);
            NON_RECS_INVESTED = new RecommendationsState("NON_RECS_INVESTED", 2, 2);
            RecommendationsState[] recommendationsStateArr$values = $values();
            $VALUES = recommendationsStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recommendationsStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendationsState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RecommendationsState>(orCreateKotlinClass, syntax, recommendationsState) { // from class: com.robinhood.rosetta.eventlogging.RecsRetirementContext$RecommendationsState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecsRetirementContext.RecommendationsState fromValue(int value) {
                    return RecsRetirementContext.RecommendationsState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecsRetirementContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecsRetirementContext$RecommendationsState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RecommendationsState fromValue(int value) {
                if (value == 0) {
                    return RecommendationsState.RECOMMENDATIONS_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return RecommendationsState.RECS_INVESTED;
                }
                if (value != 2) {
                    return null;
                }
                return RecommendationsState.NON_RECS_INVESTED;
            }
        }

        public static RecommendationsState valueOf(String str) {
            return (RecommendationsState) Enum.valueOf(RecommendationsState.class, str);
        }

        public static RecommendationsState[] values() {
            return (RecommendationsState[]) $VALUES.clone();
        }
    }
}
