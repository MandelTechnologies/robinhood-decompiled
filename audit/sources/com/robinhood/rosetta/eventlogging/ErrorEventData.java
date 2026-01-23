package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.ErrorEventData;
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

/* compiled from: ErrorEventData.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'(BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JP\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "Lcom/squareup/wire/Message;", "", "tag", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "error_type", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "feature_surface", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "personal_information_free_log", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lokio/ByteString;)V", "getTag", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "getFeature_surface", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "getPersonal_information_free_log", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorType", "FeatureSurface", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ErrorEventData extends Message {

    @JvmField
    public static final ProtoAdapter<ErrorEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Component component;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ErrorEventData$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ErrorType error_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ErrorEventData$FeatureSurface#ADAPTER", jsonName = "featureSurface", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FeatureSurface feature_surface;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "personalInformationFreeLog", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String personal_information_free_log;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Screen screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String tag;

    public ErrorEventData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ErrorEventData(String str, Screen screen, Component component, ErrorType errorType, FeatureSurface featureSurface, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : component, (i & 8) != 0 ? ErrorType.ERROR_TYPE_UNSPECIFIED : errorType, (i & 16) != 0 ? FeatureSurface.FEATURE_SURFACE_UNSPECIFIED : featureSurface, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24254newBuilder();
    }

    public final String getTag() {
        return this.tag;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final Component getComponent() {
        return this.component;
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    public final FeatureSurface getFeature_surface() {
        return this.feature_surface;
    }

    public final String getPersonal_information_free_log() {
        return this.personal_information_free_log;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorEventData(String tag, Screen screen, Component component, ErrorType error_type, FeatureSurface feature_surface, String personal_information_free_log, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
        Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tag = tag;
        this.screen = screen;
        this.component = component;
        this.error_type = error_type;
        this.feature_surface = feature_surface;
        this.personal_information_free_log = personal_information_free_log;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24254newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ErrorEventData)) {
            return false;
        }
        ErrorEventData errorEventData = (ErrorEventData) other;
        return Intrinsics.areEqual(unknownFields(), errorEventData.unknownFields()) && Intrinsics.areEqual(this.tag, errorEventData.tag) && Intrinsics.areEqual(this.screen, errorEventData.screen) && Intrinsics.areEqual(this.component, errorEventData.component) && this.error_type == errorEventData.error_type && this.feature_surface == errorEventData.feature_surface && Intrinsics.areEqual(this.personal_information_free_log, errorEventData.personal_information_free_log);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.tag.hashCode()) * 37;
        Screen screen = this.screen;
        int iHashCode2 = (iHashCode + (screen != null ? screen.hashCode() : 0)) * 37;
        Component component = this.component;
        int iHashCode3 = ((((((iHashCode2 + (component != null ? component.hashCode() : 0)) * 37) + this.error_type.hashCode()) * 37) + this.feature_surface.hashCode()) * 37) + this.personal_information_free_log.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        Component component = this.component;
        if (component != null) {
            arrayList.add("component=" + component);
        }
        arrayList.add("error_type=" + this.error_type);
        arrayList.add("feature_surface=" + this.feature_surface);
        arrayList.add("personal_information_free_log=" + Internal.sanitize(this.personal_information_free_log));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ErrorEventData copy$default(ErrorEventData errorEventData, String str, Screen screen, Component component, ErrorType errorType, FeatureSurface featureSurface, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorEventData.tag;
        }
        if ((i & 2) != 0) {
            screen = errorEventData.screen;
        }
        if ((i & 4) != 0) {
            component = errorEventData.component;
        }
        if ((i & 8) != 0) {
            errorType = errorEventData.error_type;
        }
        if ((i & 16) != 0) {
            featureSurface = errorEventData.feature_surface;
        }
        if ((i & 32) != 0) {
            str2 = errorEventData.personal_information_free_log;
        }
        if ((i & 64) != 0) {
            byteString = errorEventData.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        FeatureSurface featureSurface2 = featureSurface;
        Component component2 = component;
        return errorEventData.copy(str, screen, component2, errorType, featureSurface2, str3, byteString2);
    }

    public final ErrorEventData copy(String tag, Screen screen, Component component, ErrorType error_type, FeatureSurface feature_surface, String personal_information_free_log, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
        Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ErrorEventData(tag, screen, component, error_type, feature_surface, personal_information_free_log, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ErrorEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ErrorEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ErrorEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTag());
                }
                if (value.getScreen() != null) {
                    size += Screen.ADAPTER.encodedSizeWithTag(2, value.getScreen());
                }
                if (value.getComponent() != null) {
                    size += Component.ADAPTER.encodedSizeWithTag(3, value.getComponent());
                }
                if (value.getError_type() != ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    size += ErrorEventData.ErrorType.ADAPTER.encodedSizeWithTag(4, value.getError_type());
                }
                if (value.getFeature_surface() != ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED) {
                    size += ErrorEventData.FeatureSurface.ADAPTER.encodedSizeWithTag(5, value.getFeature_surface());
                }
                return !Intrinsics.areEqual(value.getPersonal_information_free_log(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPersonal_information_free_log()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ErrorEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTag());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                if (value.getComponent() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (value.getError_type() != ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    ErrorEventData.ErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                if (value.getFeature_surface() != ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED) {
                    ErrorEventData.FeatureSurface.ADAPTER.encodeWithTag(writer, 5, (int) value.getFeature_surface());
                }
                if (!Intrinsics.areEqual(value.getPersonal_information_free_log(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPersonal_information_free_log());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ErrorEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPersonal_information_free_log(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPersonal_information_free_log());
                }
                if (value.getFeature_surface() != ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED) {
                    ErrorEventData.FeatureSurface.ADAPTER.encodeWithTag(writer, 5, (int) value.getFeature_surface());
                }
                if (value.getError_type() != ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    ErrorEventData.ErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                if (value.getComponent() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                if (Intrinsics.areEqual(value.getTag(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTag());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ErrorEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ErrorEventData.ErrorType errorTypeDecode = ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
                ErrorEventData.FeatureSurface featureSurface = ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Screen screenDecode = null;
                Component componentDecode = null;
                ErrorEventData.FeatureSurface featureSurfaceDecode = featureSurface;
                String strDecode2 = strDecode;
                while (true) {
                    ErrorEventData.ErrorType errorType = errorTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    screenDecode = Screen.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    componentDecode = Component.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        errorTypeDecode = ErrorEventData.ErrorType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        featureSurfaceDecode = ErrorEventData.FeatureSurface.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ErrorEventData(strDecode2, screenDecode, componentDecode, errorType, featureSurfaceDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ErrorEventData redact(ErrorEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                Component component = value.getComponent();
                return ErrorEventData.copy$default(value, null, screenRedact, component != null ? Component.ADAPTER.redact(component) : null, null, null, null, ByteString.EMPTY, 57, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_TYPE_UNSPECIFIED", "FAILURE_TO_LOAD", "NETWORK_ERROR", "CRASH", "UNHANDLED_SUSPENSE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;
        public static final ErrorType CRASH;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType ERROR_TYPE_UNSPECIFIED;
        public static final ErrorType FAILURE_TO_LOAD;
        public static final ErrorType NETWORK_ERROR;
        public static final ErrorType UNHANDLED_SUSPENSE;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{ERROR_TYPE_UNSPECIFIED, FAILURE_TO_LOAD, NETWORK_ERROR, CRASH, UNHANDLED_SUSPENSE};
        }

        @JvmStatic
        public static final ErrorType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ErrorType errorType = new ErrorType("ERROR_TYPE_UNSPECIFIED", 0, 0);
            ERROR_TYPE_UNSPECIFIED = errorType;
            FAILURE_TO_LOAD = new ErrorType("FAILURE_TO_LOAD", 1, 2);
            NETWORK_ERROR = new ErrorType("NETWORK_ERROR", 2, 3);
            CRASH = new ErrorType("CRASH", 3, 4);
            UNHANDLED_SUSPENSE = new ErrorType("UNHANDLED_SUSPENSE", 4, 101);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.ErrorEventData$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ErrorEventData.ErrorType fromValue(int value) {
                    return ErrorEventData.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ErrorEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ErrorType fromValue(int value) {
                if (value == 0) {
                    return ErrorType.ERROR_TYPE_UNSPECIFIED;
                }
                if (value == 101) {
                    return ErrorType.UNHANDLED_SUSPENSE;
                }
                if (value == 2) {
                    return ErrorType.FAILURE_TO_LOAD;
                }
                if (value == 3) {
                    return ErrorType.NETWORK_ERROR;
                }
                if (value != 4) {
                    return null;
                }
                return ErrorType.CRASH;
            }
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEATURE_SURFACE_UNSPECIFIED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FeatureSurface implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FeatureSurface[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FeatureSurface> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FeatureSurface FEATURE_SURFACE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ FeatureSurface[] $values() {
            return new FeatureSurface[]{FEATURE_SURFACE_UNSPECIFIED};
        }

        @JvmStatic
        public static final FeatureSurface fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FeatureSurface> getEntries() {
            return $ENTRIES;
        }

        private FeatureSurface(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FeatureSurface featureSurface = new FeatureSurface("FEATURE_SURFACE_UNSPECIFIED", 0, 0);
            FEATURE_SURFACE_UNSPECIFIED = featureSurface;
            FeatureSurface[] featureSurfaceArr$values = $values();
            $VALUES = featureSurfaceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(featureSurfaceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeatureSurface.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FeatureSurface>(orCreateKotlinClass, syntax, featureSurface) { // from class: com.robinhood.rosetta.eventlogging.ErrorEventData$FeatureSurface$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ErrorEventData.FeatureSurface fromValue(int value) {
                    return ErrorEventData.FeatureSurface.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ErrorEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FeatureSurface fromValue(int value) {
                if (value == 0) {
                    return FeatureSurface.FEATURE_SURFACE_UNSPECIFIED;
                }
                return null;
            }
        }

        public static FeatureSurface valueOf(String str) {
            return (FeatureSurface) Enum.valueOf(FeatureSurface.class, str);
        }

        public static FeatureSurface[] values() {
            return (FeatureSurface[]) $VALUES.clone();
        }
    }
}
