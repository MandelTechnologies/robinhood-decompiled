package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
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

/* compiled from: InvestorProfileQuestionnaireContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext;", "Lcom/squareup/wire/Message;", "", "questionnaire_context", "", "source", "account_number", InstantCashConstants.ACCOUNT_TYPE_KEY, "red_flag_status", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;Lokio/ByteString;)V", "getQuestionnaire_context", "()Ljava/lang/String;", "getSource", "getAccount_number", "getAccount_type", "getRed_flag_status", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "RedFlagStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InvestorProfileQuestionnaireContext extends Message {

    @JvmField
    public static final ProtoAdapter<InvestorProfileQuestionnaireContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "questionnaireContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String questionnaire_context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext$RedFlagStatus#ADAPTER", jsonName = "redFlagStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final RedFlagStatus red_flag_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source;

    public InvestorProfileQuestionnaireContext() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ InvestorProfileQuestionnaireContext(String str, String str2, String str3, String str4, RedFlagStatus redFlagStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? RedFlagStatus.UNSPECIFIED : redFlagStatus, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24317newBuilder();
    }

    public final String getQuestionnaire_context() {
        return this.questionnaire_context;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final RedFlagStatus getRed_flag_status() {
        return this.red_flag_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestorProfileQuestionnaireContext(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatus red_flag_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.questionnaire_context = questionnaire_context;
        this.source = source;
        this.account_number = account_number;
        this.account_type = account_type;
        this.red_flag_status = red_flag_status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24317newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestorProfileQuestionnaireContext)) {
            return false;
        }
        InvestorProfileQuestionnaireContext investorProfileQuestionnaireContext = (InvestorProfileQuestionnaireContext) other;
        return Intrinsics.areEqual(unknownFields(), investorProfileQuestionnaireContext.unknownFields()) && Intrinsics.areEqual(this.questionnaire_context, investorProfileQuestionnaireContext.questionnaire_context) && Intrinsics.areEqual(this.source, investorProfileQuestionnaireContext.source) && Intrinsics.areEqual(this.account_number, investorProfileQuestionnaireContext.account_number) && Intrinsics.areEqual(this.account_type, investorProfileQuestionnaireContext.account_type) && this.red_flag_status == investorProfileQuestionnaireContext.red_flag_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.questionnaire_context.hashCode()) * 37) + this.source.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.account_type.hashCode()) * 37) + this.red_flag_status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("questionnaire_context=" + Internal.sanitize(this.questionnaire_context));
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("red_flag_status=" + this.red_flag_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestorProfileQuestionnaireContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestorProfileQuestionnaireContext copy$default(InvestorProfileQuestionnaireContext investorProfileQuestionnaireContext, String str, String str2, String str3, String str4, RedFlagStatus redFlagStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investorProfileQuestionnaireContext.questionnaire_context;
        }
        if ((i & 2) != 0) {
            str2 = investorProfileQuestionnaireContext.source;
        }
        if ((i & 4) != 0) {
            str3 = investorProfileQuestionnaireContext.account_number;
        }
        if ((i & 8) != 0) {
            str4 = investorProfileQuestionnaireContext.account_type;
        }
        if ((i & 16) != 0) {
            redFlagStatus = investorProfileQuestionnaireContext.red_flag_status;
        }
        if ((i & 32) != 0) {
            byteString = investorProfileQuestionnaireContext.unknownFields();
        }
        RedFlagStatus redFlagStatus2 = redFlagStatus;
        ByteString byteString2 = byteString;
        return investorProfileQuestionnaireContext.copy(str, str2, str3, str4, redFlagStatus2, byteString2);
    }

    public final InvestorProfileQuestionnaireContext copy(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatus red_flag_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestorProfileQuestionnaireContext(questionnaire_context, source, account_number, account_type, red_flag_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestorProfileQuestionnaireContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestorProfileQuestionnaireContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestorProfileQuestionnaireContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getQuestionnaire_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuestionnaire_context());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_type());
                }
                return value.getRed_flag_status() != InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED ? size + InvestorProfileQuestionnaireContext.RedFlagStatus.ADAPTER.encodedSizeWithTag(5, value.getRed_flag_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestorProfileQuestionnaireContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getQuestionnaire_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuestionnaire_context());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (value.getRed_flag_status() != InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED) {
                    InvestorProfileQuestionnaireContext.RedFlagStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getRed_flag_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestorProfileQuestionnaireContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRed_flag_status() != InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED) {
                    InvestorProfileQuestionnaireContext.RedFlagStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getRed_flag_status());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (Intrinsics.areEqual(value.getQuestionnaire_context(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuestionnaire_context());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestorProfileQuestionnaireContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatusDecode = InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    InvestorProfileQuestionnaireContext.RedFlagStatus redFlagStatus = redFlagStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InvestorProfileQuestionnaireContext(strDecode, strDecode2, strDecode3, strDecode4, redFlagStatus, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                redFlagStatusDecode = InvestorProfileQuestionnaireContext.RedFlagStatus.ADAPTER.decode(reader);
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
            public InvestorProfileQuestionnaireContext redact(InvestorProfileQuestionnaireContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestorProfileQuestionnaireContext.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestorProfileQuestionnaireContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SLIP_RECOMMENDATION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RedFlagStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RedFlagStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<RedFlagStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RedFlagStatus SLIP_RECOMMENDATION;
        public static final RedFlagStatus UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ RedFlagStatus[] $values() {
            return new RedFlagStatus[]{UNSPECIFIED, SLIP_RECOMMENDATION};
        }

        @JvmStatic
        public static final RedFlagStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RedFlagStatus> getEntries() {
            return $ENTRIES;
        }

        private RedFlagStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RedFlagStatus redFlagStatus = new RedFlagStatus(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = redFlagStatus;
            SLIP_RECOMMENDATION = new RedFlagStatus("SLIP_RECOMMENDATION", 1, 1);
            RedFlagStatus[] redFlagStatusArr$values = $values();
            $VALUES = redFlagStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(redFlagStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RedFlagStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RedFlagStatus>(orCreateKotlinClass, syntax, redFlagStatus) { // from class: com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext$RedFlagStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InvestorProfileQuestionnaireContext.RedFlagStatus fromValue(int value) {
                    return InvestorProfileQuestionnaireContext.RedFlagStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InvestorProfileQuestionnaireContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RedFlagStatus fromValue(int value) {
                if (value == 0) {
                    return RedFlagStatus.UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return RedFlagStatus.SLIP_RECOMMENDATION;
            }
        }

        public static RedFlagStatus valueOf(String str) {
            return (RedFlagStatus) Enum.valueOf(RedFlagStatus.class, str);
        }

        public static RedFlagStatus[] values() {
            return (RedFlagStatus[]) $VALUES.clone();
        }
    }
}
