package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DappBrowserContext;
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

/* compiled from: DappBrowserContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContext;", "Lcom/squareup/wire/Message;", "", "dapp_name", "", "dapp_url", "dapp_browser_state", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "time_elapsed_ms", "", "custom_action", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;DLcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;Lokio/ByteString;)V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url", "getDapp_browser_state", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "getTime_elapsed_ms", "()D", "getCustom_action", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "DappBrowserState", "CustomAction", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DappBrowserContext extends Message {

    @JvmField
    public static final ProtoAdapter<DappBrowserContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DappBrowserContext$CustomAction#ADAPTER", jsonName = "customAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CustomAction custom_action;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DappBrowserContext$DappBrowserState#ADAPTER", jsonName = "dappBrowserState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DappBrowserState dapp_browser_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dappName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String dapp_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dappUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String dapp_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "timeElapsedMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double time_elapsed_ms;

    public DappBrowserContext() {
        this(null, null, null, 0.0d, null, null, 63, null);
    }

    public /* synthetic */ DappBrowserContext(String str, String str2, DappBrowserState dappBrowserState, double d, CustomAction customAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DappBrowserState.STATE_UNSPECIFIED : dappBrowserState, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? CustomAction.OPEN_LAUNCHPAD : customAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24178newBuilder();
    }

    public final String getDapp_name() {
        return this.dapp_name;
    }

    public final String getDapp_url() {
        return this.dapp_url;
    }

    public final DappBrowserState getDapp_browser_state() {
        return this.dapp_browser_state;
    }

    public final double getTime_elapsed_ms() {
        return this.time_elapsed_ms;
    }

    public final CustomAction getCustom_action() {
        return this.custom_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappBrowserContext(String dapp_name, String dapp_url, DappBrowserState dapp_browser_state, double d, CustomAction custom_action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
        Intrinsics.checkNotNullParameter(custom_action, "custom_action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dapp_name = dapp_name;
        this.dapp_url = dapp_url;
        this.dapp_browser_state = dapp_browser_state;
        this.time_elapsed_ms = d;
        this.custom_action = custom_action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24178newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DappBrowserContext)) {
            return false;
        }
        DappBrowserContext dappBrowserContext = (DappBrowserContext) other;
        return Intrinsics.areEqual(unknownFields(), dappBrowserContext.unknownFields()) && Intrinsics.areEqual(this.dapp_name, dappBrowserContext.dapp_name) && Intrinsics.areEqual(this.dapp_url, dappBrowserContext.dapp_url) && this.dapp_browser_state == dappBrowserContext.dapp_browser_state && this.time_elapsed_ms == dappBrowserContext.time_elapsed_ms && this.custom_action == dappBrowserContext.custom_action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.dapp_name.hashCode()) * 37) + this.dapp_url.hashCode()) * 37) + this.dapp_browser_state.hashCode()) * 37) + Double.hashCode(this.time_elapsed_ms)) * 37) + this.custom_action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dapp_name=" + Internal.sanitize(this.dapp_name));
        arrayList.add("dapp_url=" + Internal.sanitize(this.dapp_url));
        arrayList.add("dapp_browser_state=" + this.dapp_browser_state);
        arrayList.add("time_elapsed_ms=" + this.time_elapsed_ms);
        arrayList.add("custom_action=" + this.custom_action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DappBrowserContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DappBrowserContext copy$default(DappBrowserContext dappBrowserContext, String str, String str2, DappBrowserState dappBrowserState, double d, CustomAction customAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappBrowserContext.dapp_name;
        }
        if ((i & 2) != 0) {
            str2 = dappBrowserContext.dapp_url;
        }
        if ((i & 4) != 0) {
            dappBrowserState = dappBrowserContext.dapp_browser_state;
        }
        if ((i & 8) != 0) {
            d = dappBrowserContext.time_elapsed_ms;
        }
        if ((i & 16) != 0) {
            customAction = dappBrowserContext.custom_action;
        }
        if ((i & 32) != 0) {
            byteString = dappBrowserContext.unknownFields();
        }
        double d2 = d;
        DappBrowserState dappBrowserState2 = dappBrowserState;
        return dappBrowserContext.copy(str, str2, dappBrowserState2, d2, customAction, byteString);
    }

    public final DappBrowserContext copy(String dapp_name, String dapp_url, DappBrowserState dapp_browser_state, double time_elapsed_ms, CustomAction custom_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
        Intrinsics.checkNotNullParameter(custom_action, "custom_action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DappBrowserContext(dapp_name, dapp_url, dapp_browser_state, time_elapsed_ms, custom_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DappBrowserContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DappBrowserContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DappBrowserContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDapp_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDapp_name());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDapp_url());
                }
                if (value.getDapp_browser_state() != DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED) {
                    size += DappBrowserContext.DappBrowserState.ADAPTER.encodedSizeWithTag(3, value.getDapp_browser_state());
                }
                if (!Double.valueOf(value.getTime_elapsed_ms()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getTime_elapsed_ms()));
                }
                return value.getCustom_action() != DappBrowserContext.CustomAction.OPEN_LAUNCHPAD ? size + DappBrowserContext.CustomAction.ADAPTER.encodedSizeWithTag(5, value.getCustom_action()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DappBrowserContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDapp_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDapp_name());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDapp_url());
                }
                if (value.getDapp_browser_state() != DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED) {
                    DappBrowserContext.DappBrowserState.ADAPTER.encodeWithTag(writer, 3, (int) value.getDapp_browser_state());
                }
                if (!Double.valueOf(value.getTime_elapsed_ms()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getTime_elapsed_ms()));
                }
                if (value.getCustom_action() != DappBrowserContext.CustomAction.OPEN_LAUNCHPAD) {
                    DappBrowserContext.CustomAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_action());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DappBrowserContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCustom_action() != DappBrowserContext.CustomAction.OPEN_LAUNCHPAD) {
                    DappBrowserContext.CustomAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getCustom_action());
                }
                if (!Double.valueOf(value.getTime_elapsed_ms()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getTime_elapsed_ms()));
                }
                if (value.getDapp_browser_state() != DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED) {
                    DappBrowserContext.DappBrowserState.ADAPTER.encodeWithTag(writer, 3, (int) value.getDapp_browser_state());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDapp_url());
                }
                if (Intrinsics.areEqual(value.getDapp_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDapp_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DappBrowserContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DappBrowserContext.DappBrowserState dappBrowserStateDecode = DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED;
                DappBrowserContext.CustomAction customAction = DappBrowserContext.CustomAction.OPEN_LAUNCHPAD;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                DappBrowserContext.CustomAction customActionDecode = customAction;
                while (true) {
                    DappBrowserContext.DappBrowserState dappBrowserState = dappBrowserStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DappBrowserContext(strDecode, strDecode2, dappBrowserState, dDoubleValue, customActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                dappBrowserStateDecode = DappBrowserContext.DappBrowserState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 5) {
                            try {
                                customActionDecode = DappBrowserContext.CustomAction.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DappBrowserContext redact(DappBrowserContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DappBrowserContext.copy$default(value, null, null, null, 0.0d, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappBrowserContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "DAPP_BROWSER_CONNECTING", "DAPP_BROWSER_CONNECTED", "DAPP_BROWSER_DROPPED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DappBrowserState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DappBrowserState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DappBrowserState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DappBrowserState DAPP_BROWSER_CONNECTED;
        public static final DappBrowserState DAPP_BROWSER_CONNECTING;
        public static final DappBrowserState DAPP_BROWSER_DROPPED;
        public static final DappBrowserState STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ DappBrowserState[] $values() {
            return new DappBrowserState[]{STATE_UNSPECIFIED, DAPP_BROWSER_CONNECTING, DAPP_BROWSER_CONNECTED, DAPP_BROWSER_DROPPED};
        }

        @JvmStatic
        public static final DappBrowserState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DappBrowserState> getEntries() {
            return $ENTRIES;
        }

        private DappBrowserState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DappBrowserState dappBrowserState = new DappBrowserState("STATE_UNSPECIFIED", 0, 0);
            STATE_UNSPECIFIED = dappBrowserState;
            DAPP_BROWSER_CONNECTING = new DappBrowserState("DAPP_BROWSER_CONNECTING", 1, 1);
            DAPP_BROWSER_CONNECTED = new DappBrowserState("DAPP_BROWSER_CONNECTED", 2, 2);
            DAPP_BROWSER_DROPPED = new DappBrowserState("DAPP_BROWSER_DROPPED", 3, 3);
            DappBrowserState[] dappBrowserStateArr$values = $values();
            $VALUES = dappBrowserStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dappBrowserStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DappBrowserState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DappBrowserState>(orCreateKotlinClass, syntax, dappBrowserState) { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContext$DappBrowserState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DappBrowserContext.DappBrowserState fromValue(int value) {
                    return DappBrowserContext.DappBrowserState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DappBrowserContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DappBrowserState fromValue(int value) {
                if (value == 0) {
                    return DappBrowserState.STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DappBrowserState.DAPP_BROWSER_CONNECTING;
                }
                if (value == 2) {
                    return DappBrowserState.DAPP_BROWSER_CONNECTED;
                }
                if (value != 3) {
                    return null;
                }
                return DappBrowserState.DAPP_BROWSER_DROPPED;
            }
        }

        public static DappBrowserState valueOf(String str) {
            return (DappBrowserState) Enum.valueOf(DappBrowserState.class, str);
        }

        public static DappBrowserState[] values() {
            return (DappBrowserState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappBrowserContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OPEN_LAUNCHPAD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomAction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomAction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CustomAction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CustomAction OPEN_LAUNCHPAD;
        private final int value;

        private static final /* synthetic */ CustomAction[] $values() {
            return new CustomAction[]{OPEN_LAUNCHPAD};
        }

        @JvmStatic
        public static final CustomAction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CustomAction> getEntries() {
            return $ENTRIES;
        }

        private CustomAction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CustomAction customAction = new CustomAction("OPEN_LAUNCHPAD", 0, 0);
            OPEN_LAUNCHPAD = customAction;
            CustomAction[] customActionArr$values = $values();
            $VALUES = customActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(customActionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomAction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CustomAction>(orCreateKotlinClass, syntax, customAction) { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContext$CustomAction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DappBrowserContext.CustomAction fromValue(int value) {
                    return DappBrowserContext.CustomAction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DappBrowserContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CustomAction fromValue(int value) {
                if (value == 0) {
                    return CustomAction.OPEN_LAUNCHPAD;
                }
                return null;
            }
        }

        public static CustomAction valueOf(String str) {
            return (CustomAction) Enum.valueOf(CustomAction.class, str);
        }

        public static CustomAction[] values() {
            return (CustomAction[]) $VALUES.clone();
        }
    }
}
