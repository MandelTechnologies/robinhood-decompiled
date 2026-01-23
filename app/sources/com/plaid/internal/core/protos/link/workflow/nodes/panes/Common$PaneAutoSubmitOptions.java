package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$PaneAutoSubmitOptions extends GeneratedMessageLite<Common$PaneAutoSubmitOptions, C6455b> implements MessageLiteOrBuilder {
    public static final int AUTO_SUBMIT_ACTION_FIELD_NUMBER = 1;
    public static final int AUTO_SUBMIT_DELAY_MS_FIELD_NUMBER = 2;
    private static final Common$PaneAutoSubmitOptions DEFAULT_INSTANCE;
    private static volatile Parser<Common$PaneAutoSubmitOptions> PARSER;
    private int autoSubmitAction_;
    private int autoSubmitDelayMs_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$a */
    public enum EnumC6454a implements Internal.EnumLite {
        AUTO_SUBMIT_UNKNOWN(0),
        AUTO_SUBMIT_PRIMARY_BUTTON_TAP(1),
        AUTO_SUBMIT_SECONDARY_BUTTON_TAP(2),
        AUTO_SUBMIT_TERTIARY_BUTTON_TAP(3),
        AUTO_SUBMIT_EXIT(4),
        UNRECOGNIZED(-1);

        public static final int AUTO_SUBMIT_EXIT_VALUE = 4;
        public static final int AUTO_SUBMIT_PRIMARY_BUTTON_TAP_VALUE = 1;
        public static final int AUTO_SUBMIT_SECONDARY_BUTTON_TAP_VALUE = 2;
        public static final int AUTO_SUBMIT_TERTIARY_BUTTON_TAP_VALUE = 3;
        public static final int AUTO_SUBMIT_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2252b = new a();

        /* renamed from: a */
        public final int f2254a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6454a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6454a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2255a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6454a.forNumber(i) != null;
            }
        }

        EnumC6454a(int i) {
            this.f2254a = i;
        }

        public static EnumC6454a forNumber(int i) {
            if (i == 0) {
                return AUTO_SUBMIT_UNKNOWN;
            }
            if (i == 1) {
                return AUTO_SUBMIT_PRIMARY_BUTTON_TAP;
            }
            if (i == 2) {
                return AUTO_SUBMIT_SECONDARY_BUTTON_TAP;
            }
            if (i == 3) {
                return AUTO_SUBMIT_TERTIARY_BUTTON_TAP;
            }
            if (i != 4) {
                return null;
            }
            return AUTO_SUBMIT_EXIT;
        }

        public static Internal.EnumLiteMap<EnumC6454a> internalGetValueMap() {
            return f2252b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2255a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2254a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6454a valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$b */
    public static final class C6455b extends GeneratedMessageLite.Builder<Common$PaneAutoSubmitOptions, C6455b> implements MessageLiteOrBuilder {
        public C6455b() {
            super(Common$PaneAutoSubmitOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = new Common$PaneAutoSubmitOptions();
        DEFAULT_INSTANCE = common$PaneAutoSubmitOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$PaneAutoSubmitOptions.class, common$PaneAutoSubmitOptions);
    }

    private Common$PaneAutoSubmitOptions() {
    }

    private void clearAutoSubmitAction() {
        this.autoSubmitAction_ = 0;
    }

    private void clearAutoSubmitDelayMs() {
        this.autoSubmitDelayMs_ = 0;
    }

    public static Common$PaneAutoSubmitOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6455b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PaneAutoSubmitOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PaneAutoSubmitOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutoSubmitAction(EnumC6454a enumC6454a) {
        this.autoSubmitAction_ = enumC6454a.getNumber();
    }

    private void setAutoSubmitActionValue(int i) {
        this.autoSubmitAction_ = i;
    }

    private void setAutoSubmitDelayMs(int i) {
        this.autoSubmitDelayMs_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PaneAutoSubmitOptions();
            case 2:
                return new C6455b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"autoSubmitAction_", "autoSubmitDelayMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PaneAutoSubmitOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PaneAutoSubmitOptions.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public EnumC6454a getAutoSubmitAction() {
        EnumC6454a enumC6454aForNumber = EnumC6454a.forNumber(this.autoSubmitAction_);
        return enumC6454aForNumber == null ? EnumC6454a.UNRECOGNIZED : enumC6454aForNumber;
    }

    public int getAutoSubmitActionValue() {
        return this.autoSubmitAction_;
    }

    public int getAutoSubmitDelayMs() {
        return this.autoSubmitDelayMs_;
    }

    public static C6455b newBuilder(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneAutoSubmitOptions);
    }

    public static Common$PaneAutoSubmitOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteString byteString) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(byte[] bArr) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(InputStream inputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
