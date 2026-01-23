package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.OAuthInfo;
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

/* compiled from: OAuthInfo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "Lcom/squareup/wire/Message;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "app_id", "", "ref_id", "error", "debug_info", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "getApp_id", "()Ljava/lang/String;", "getRef_id", "getError", "getDebug_info", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OAuthStep", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OAuthInfo extends Message {

    @JvmField
    public static final ProtoAdapter<OAuthInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "debugInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String debug_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String ref_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OAuthInfo$OAuthStep#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OAuthStep step;

    public OAuthInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24414newBuilder();
    }

    public final OAuthStep getStep() {
        return this.step;
    }

    public /* synthetic */ OAuthInfo(OAuthStep oAuthStep, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OAuthStep.OAUTH_STEP_UNSPECIFIED : oAuthStep, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getApp_id() {
        return this.app_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getError() {
        return this.error;
    }

    public final String getDebug_info() {
        return this.debug_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthInfo(OAuthStep step, String app_id, String ref_id, String error, String debug_info, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.step = step;
        this.app_id = app_id;
        this.ref_id = ref_id;
        this.error = error;
        this.debug_info = debug_info;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24414newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OAuthInfo)) {
            return false;
        }
        OAuthInfo oAuthInfo = (OAuthInfo) other;
        return Intrinsics.areEqual(unknownFields(), oAuthInfo.unknownFields()) && this.step == oAuthInfo.step && Intrinsics.areEqual(this.app_id, oAuthInfo.app_id) && Intrinsics.areEqual(this.ref_id, oAuthInfo.ref_id) && Intrinsics.areEqual(this.error, oAuthInfo.error) && Intrinsics.areEqual(this.debug_info, oAuthInfo.debug_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.step.hashCode()) * 37) + this.app_id.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.error.hashCode()) * 37) + this.debug_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("step=" + this.step);
        arrayList.add("app_id=" + Internal.sanitize(this.app_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("error=" + Internal.sanitize(this.error));
        arrayList.add("debug_info=" + Internal.sanitize(this.debug_info));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OAuthInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OAuthInfo copy$default(OAuthInfo oAuthInfo, OAuthStep oAuthStep, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            oAuthStep = oAuthInfo.step;
        }
        if ((i & 2) != 0) {
            str = oAuthInfo.app_id;
        }
        if ((i & 4) != 0) {
            str2 = oAuthInfo.ref_id;
        }
        if ((i & 8) != 0) {
            str3 = oAuthInfo.error;
        }
        if ((i & 16) != 0) {
            str4 = oAuthInfo.debug_info;
        }
        if ((i & 32) != 0) {
            byteString = oAuthInfo.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return oAuthInfo.copy(oAuthStep, str, str2, str3, str5, byteString2);
    }

    public final OAuthInfo copy(OAuthStep step, String app_id, String ref_id, String error, String debug_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OAuthInfo(step, app_id, ref_id, error, debug_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OAuthInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OAuthInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OAuthInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OAuthInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStep() != OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED) {
                    size += OAuthInfo.OAuthStep.ADAPTER.encodedSizeWithTag(1, value.getStep());
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getApp_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError());
                }
                return !Intrinsics.areEqual(value.getDebug_info(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDebug_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OAuthInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStep() != OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED) {
                    OAuthInfo.OAuthStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApp_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError());
                }
                if (!Intrinsics.areEqual(value.getDebug_info(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDebug_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OAuthInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDebug_info(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDebug_info());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApp_id());
                }
                if (value.getStep() != OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED) {
                    OAuthInfo.OAuthStep.ADAPTER.encodeWithTag(writer, 1, (int) value.getStep());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OAuthInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OAuthInfo.OAuthStep oAuthStepDecode = OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    OAuthInfo.OAuthStep oAuthStep = oAuthStepDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OAuthInfo(oAuthStep, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                oAuthStepDecode = OAuthInfo.OAuthStep.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OAuthInfo redact(OAuthInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OAuthInfo.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OAuthInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OAUTH_STEP_UNSPECIFIED", "RECEIVED_DEEPLINK", "DEEPLINK_NOT_SUPPORTED", "CLIENT_GENERATED_REDIRECT_URI", "SERVER_RETURNED_REDIRECT_URI", "REDIRECT_SUCCESS", "REDIRECT_FAILURE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OAuthStep implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OAuthStep[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OAuthStep> ADAPTER;
        public static final OAuthStep CLIENT_GENERATED_REDIRECT_URI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OAuthStep DEEPLINK_NOT_SUPPORTED;
        public static final OAuthStep OAUTH_STEP_UNSPECIFIED;
        public static final OAuthStep RECEIVED_DEEPLINK;
        public static final OAuthStep REDIRECT_FAILURE;
        public static final OAuthStep REDIRECT_SUCCESS;
        public static final OAuthStep SERVER_RETURNED_REDIRECT_URI;
        private final int value;

        private static final /* synthetic */ OAuthStep[] $values() {
            return new OAuthStep[]{OAUTH_STEP_UNSPECIFIED, RECEIVED_DEEPLINK, DEEPLINK_NOT_SUPPORTED, CLIENT_GENERATED_REDIRECT_URI, SERVER_RETURNED_REDIRECT_URI, REDIRECT_SUCCESS, REDIRECT_FAILURE};
        }

        @JvmStatic
        public static final OAuthStep fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OAuthStep> getEntries() {
            return $ENTRIES;
        }

        private OAuthStep(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OAuthStep oAuthStep = new OAuthStep("OAUTH_STEP_UNSPECIFIED", 0, 0);
            OAUTH_STEP_UNSPECIFIED = oAuthStep;
            RECEIVED_DEEPLINK = new OAuthStep("RECEIVED_DEEPLINK", 1, 1);
            DEEPLINK_NOT_SUPPORTED = new OAuthStep("DEEPLINK_NOT_SUPPORTED", 2, 2);
            CLIENT_GENERATED_REDIRECT_URI = new OAuthStep("CLIENT_GENERATED_REDIRECT_URI", 3, 3);
            SERVER_RETURNED_REDIRECT_URI = new OAuthStep("SERVER_RETURNED_REDIRECT_URI", 4, 4);
            REDIRECT_SUCCESS = new OAuthStep("REDIRECT_SUCCESS", 5, 5);
            REDIRECT_FAILURE = new OAuthStep("REDIRECT_FAILURE", 6, 6);
            OAuthStep[] oAuthStepArr$values = $values();
            $VALUES = oAuthStepArr$values;
            $ENTRIES = EnumEntries2.enumEntries(oAuthStepArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OAuthStep.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OAuthStep>(orCreateKotlinClass, syntax, oAuthStep) { // from class: com.robinhood.rosetta.eventlogging.OAuthInfo$OAuthStep$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OAuthInfo.OAuthStep fromValue(int value) {
                    return OAuthInfo.OAuthStep.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OAuthInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OAuthStep fromValue(int value) {
                switch (value) {
                    case 0:
                        return OAuthStep.OAUTH_STEP_UNSPECIFIED;
                    case 1:
                        return OAuthStep.RECEIVED_DEEPLINK;
                    case 2:
                        return OAuthStep.DEEPLINK_NOT_SUPPORTED;
                    case 3:
                        return OAuthStep.CLIENT_GENERATED_REDIRECT_URI;
                    case 4:
                        return OAuthStep.SERVER_RETURNED_REDIRECT_URI;
                    case 5:
                        return OAuthStep.REDIRECT_SUCCESS;
                    case 6:
                        return OAuthStep.REDIRECT_FAILURE;
                    default:
                        return null;
                }
            }
        }

        public static OAuthStep valueOf(String str) {
            return (OAuthStep) Enum.valueOf(OAuthStep.class, str);
        }

        public static OAuthStep[] values() {
            return (OAuthStep[]) $VALUES.clone();
        }
    }
}
