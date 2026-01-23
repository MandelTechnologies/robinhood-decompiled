package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class SourcePaneOuterClass$SourcePane extends GeneratedMessageLite<SourcePaneOuterClass$SourcePane, C6829a> implements MessageLiteOrBuilder {
    private static final SourcePaneOuterClass$SourcePane DEFAULT_INSTANCE;
    private static volatile Parser<SourcePaneOuterClass$SourcePane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6827b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        private static volatile Parser<Actions> PARSER = null;
        public static final int START_FIELD_NUMBER = 4;
        private int actionCase_ = 0;
        private Object action_;

        public static final class StartAction extends GeneratedMessageLite<StartAction, C6825a> implements MessageLiteOrBuilder {
            private static final StartAction DEFAULT_INSTANCE;
            private static volatile Parser<StartAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane$Actions$StartAction$a */
            public static final class C6825a extends GeneratedMessageLite.Builder<StartAction, C6825a> implements MessageLiteOrBuilder {
                public C6825a() {
                    super(StartAction.DEFAULT_INSTANCE);
                }
            }

            static {
                StartAction startAction = new StartAction();
                DEFAULT_INSTANCE = startAction;
                GeneratedMessageLite.registerDefaultInstance(StartAction.class, startAction);
            }

            private StartAction() {
            }

            public static StartAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6825a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static StartAction parseDelimitedFrom(InputStream inputStream) {
                return (StartAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StartAction parseFrom(ByteBuffer byteBuffer) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<StartAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6942v0.f2612a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new StartAction();
                    case 2:
                        return new C6825a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<StartAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (StartAction.class) {
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

            public static C6825a newBuilder(StartAction startAction) {
                return DEFAULT_INSTANCE.createBuilder(startAction);
            }

            public static StartAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static StartAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static StartAction parseFrom(ByteString byteString) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static StartAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static StartAction parseFrom(byte[] bArr) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static StartAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static StartAction parseFrom(InputStream inputStream) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StartAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static StartAction parseFrom(CodedInputStream codedInputStream) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static StartAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StartAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane$Actions$a */
        public enum EnumC6826a {
            START(4),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2478a;

            EnumC6826a(int i) {
                this.f2478a = i;
            }

            public static EnumC6826a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 4) {
                    return null;
                }
                return START;
            }

            public int getNumber() {
                return this.f2478a;
            }

            @Deprecated
            public static EnumC6826a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane$Actions$b */
        public static final class C6827b extends GeneratedMessageLite.Builder<Actions, C6827b> implements MessageLiteOrBuilder {
            public C6827b() {
                super(Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            Actions actions = new Actions();
            DEFAULT_INSTANCE = actions;
            GeneratedMessageLite.registerDefaultInstance(Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearStart() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeStart(StartAction startAction) {
            startAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == StartAction.getDefaultInstance()) {
                this.action_ = startAction;
            } else {
                this.action_ = StartAction.newBuilder((StartAction) this.action_).mergeFrom((StartAction.C6825a) startAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static C6827b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Actions parseDelimitedFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setStart(StartAction startAction) {
            startAction.getClass();
            this.action_ = startAction;
            this.actionCase_ = 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6942v0.f2612a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6827b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", StartAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Actions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Actions.class) {
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

        public EnumC6826a getActionCase() {
            return EnumC6826a.forNumber(this.actionCase_);
        }

        public StartAction getStart() {
            return this.actionCase_ == 4 ? (StartAction) this.action_ : StartAction.getDefaultInstance();
        }

        public boolean hasStart() {
            return this.actionCase_ == 4;
        }

        public static C6827b newBuilder(Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static Actions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteString byteString) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Actions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Actions parseFrom(byte[] bArr) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Actions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Actions parseFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6828a> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        private static volatile Parser<Rendering> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane$Rendering$a */
        public static final class C6828a extends GeneratedMessageLite.Builder<Rendering, C6828a> implements MessageLiteOrBuilder {
            public C6828a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6828a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6942v0.f2612a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6828a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rendering> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Rendering.class) {
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

        public static C6828a newBuilder(Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteString byteString) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rendering parseFrom(byte[] bArr) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rendering parseFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane$a */
    public static final class C6829a extends GeneratedMessageLite.Builder<SourcePaneOuterClass$SourcePane, C6829a> implements MessageLiteOrBuilder {
        public C6829a() {
            super(SourcePaneOuterClass$SourcePane.DEFAULT_INSTANCE);
        }
    }

    static {
        SourcePaneOuterClass$SourcePane sourcePaneOuterClass$SourcePane = new SourcePaneOuterClass$SourcePane();
        DEFAULT_INSTANCE = sourcePaneOuterClass$SourcePane;
        GeneratedMessageLite.registerDefaultInstance(SourcePaneOuterClass$SourcePane.class, sourcePaneOuterClass$SourcePane);
    }

    private SourcePaneOuterClass$SourcePane() {
    }

    public static SourcePaneOuterClass$SourcePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6829a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SourcePaneOuterClass$SourcePane parseDelimitedFrom(InputStream inputStream) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(ByteBuffer byteBuffer) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SourcePaneOuterClass$SourcePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6942v0.f2612a[methodToInvoke.ordinal()]) {
            case 1:
                return new SourcePaneOuterClass$SourcePane();
            case 2:
                return new C6829a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SourcePaneOuterClass$SourcePane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SourcePaneOuterClass$SourcePane.class) {
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

    public static C6829a newBuilder(SourcePaneOuterClass$SourcePane sourcePaneOuterClass$SourcePane) {
        return DEFAULT_INSTANCE.createBuilder(sourcePaneOuterClass$SourcePane);
    }

    public static SourcePaneOuterClass$SourcePane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(ByteString byteString) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(byte[] bArr) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(InputStream inputStream) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(CodedInputStream codedInputStream) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SourcePaneOuterClass$SourcePane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourcePaneOuterClass$SourcePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
