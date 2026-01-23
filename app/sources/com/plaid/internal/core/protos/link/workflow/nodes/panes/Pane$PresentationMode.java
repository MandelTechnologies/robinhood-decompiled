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
public final class Pane$PresentationMode extends GeneratedMessageLite<Pane$PresentationMode, C6738a> implements MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final Pane$PresentationMode DEFAULT_INSTANCE;
    public static final int HALF_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Pane$PresentationMode> PARSER = null;
    public static final int VARIABLE_HEIGHT_FIELD_NUMBER = 4;
    private int typeCase_ = 0;
    private Object type_;

    public static final class Default extends GeneratedMessageLite<Default, C6735a> implements MessageLiteOrBuilder {
        private static final Default DEFAULT_INSTANCE;
        private static volatile Parser<Default> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode$Default$a */
        public static final class C6735a extends GeneratedMessageLite.Builder<Default, C6735a> implements MessageLiteOrBuilder {
            public C6735a() {
                super(Default.DEFAULT_INSTANCE);
            }
        }

        static {
            Default r0 = new Default();
            DEFAULT_INSTANCE = r0;
            GeneratedMessageLite.registerDefaultInstance(Default.class, r0);
        }

        private Default() {
        }

        public static Default getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6735a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Default parseDelimitedFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(ByteBuffer byteBuffer) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Default> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Default();
                case 2:
                    return new C6735a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Default> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Default.class) {
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

        public static C6735a newBuilder(Default r1) {
            return DEFAULT_INSTANCE.createBuilder(r1);
        }

        public static Default parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Default parseFrom(ByteString byteString) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Default parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Default parseFrom(byte[] bArr) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Default parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Default parseFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(CodedInputStream codedInputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Default parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HalfPane extends GeneratedMessageLite<HalfPane, C6736a> implements MessageLiteOrBuilder {
        private static final HalfPane DEFAULT_INSTANCE;
        private static volatile Parser<HalfPane> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode$HalfPane$a */
        public static final class C6736a extends GeneratedMessageLite.Builder<HalfPane, C6736a> implements MessageLiteOrBuilder {
            public C6736a() {
                super(HalfPane.DEFAULT_INSTANCE);
            }
        }

        static {
            HalfPane halfPane = new HalfPane();
            DEFAULT_INSTANCE = halfPane;
            GeneratedMessageLite.registerDefaultInstance(HalfPane.class, halfPane);
        }

        private HalfPane() {
        }

        public static HalfPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6736a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HalfPane parseDelimitedFrom(InputStream inputStream) {
            return (HalfPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HalfPane parseFrom(ByteBuffer byteBuffer) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HalfPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HalfPane();
                case 2:
                    return new C6736a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HalfPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HalfPane.class) {
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

        public static C6736a newBuilder(HalfPane halfPane) {
            return DEFAULT_INSTANCE.createBuilder(halfPane);
        }

        public static HalfPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HalfPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HalfPane parseFrom(ByteString byteString) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HalfPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HalfPane parseFrom(byte[] bArr) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HalfPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HalfPane parseFrom(InputStream inputStream) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HalfPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HalfPane parseFrom(CodedInputStream codedInputStream) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HalfPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VariableHeight extends GeneratedMessageLite<VariableHeight, C6737a> implements MessageLiteOrBuilder {
        private static final VariableHeight DEFAULT_INSTANCE;
        private static volatile Parser<VariableHeight> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode$VariableHeight$a */
        public static final class C6737a extends GeneratedMessageLite.Builder<VariableHeight, C6737a> implements MessageLiteOrBuilder {
            public C6737a() {
                super(VariableHeight.DEFAULT_INSTANCE);
            }
        }

        static {
            VariableHeight variableHeight = new VariableHeight();
            DEFAULT_INSTANCE = variableHeight;
            GeneratedMessageLite.registerDefaultInstance(VariableHeight.class, variableHeight);
        }

        private VariableHeight() {
        }

        public static VariableHeight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6737a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VariableHeight parseDelimitedFrom(InputStream inputStream) {
            return (VariableHeight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VariableHeight parseFrom(ByteBuffer byteBuffer) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VariableHeight> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new VariableHeight();
                case 2:
                    return new C6737a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VariableHeight> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (VariableHeight.class) {
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

        public static C6737a newBuilder(VariableHeight variableHeight) {
            return DEFAULT_INSTANCE.createBuilder(variableHeight);
        }

        public static VariableHeight parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(ByteString byteString) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VariableHeight parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(byte[] bArr) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VariableHeight parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(InputStream inputStream) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VariableHeight parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(CodedInputStream codedInputStream) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VariableHeight parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode$a */
    public static final class C6738a extends GeneratedMessageLite.Builder<Pane$PresentationMode, C6738a> implements MessageLiteOrBuilder {
        public C6738a() {
            super(Pane$PresentationMode.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode$b */
    public enum EnumC6739b {
        DEFAULT(1),
        HALF_PANE(2),
        VARIABLE_HEIGHT(4),
        TYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f2435a;

        EnumC6739b(int i) {
            this.f2435a = i;
        }

        public static EnumC6739b forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return HALF_PANE;
            }
            if (i != 4) {
                return null;
            }
            return VARIABLE_HEIGHT;
        }

        public int getNumber() {
            return this.f2435a;
        }

        @Deprecated
        public static EnumC6739b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Pane$PresentationMode pane$PresentationMode = new Pane$PresentationMode();
        DEFAULT_INSTANCE = pane$PresentationMode;
        GeneratedMessageLite.registerDefaultInstance(Pane$PresentationMode.class, pane$PresentationMode);
    }

    private Pane$PresentationMode() {
    }

    private void clearDefault() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearHalfPane() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    private void clearVariableHeight() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public static Pane$PresentationMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDefault(Default r4) {
        r4.getClass();
        if (this.typeCase_ != 1 || this.type_ == Default.getDefaultInstance()) {
            this.type_ = r4;
        } else {
            this.type_ = Default.newBuilder((Default) this.type_).mergeFrom((Default.C6735a) r4).buildPartial();
        }
        this.typeCase_ = 1;
    }

    private void mergeHalfPane(HalfPane halfPane) {
        halfPane.getClass();
        if (this.typeCase_ != 2 || this.type_ == HalfPane.getDefaultInstance()) {
            this.type_ = halfPane;
        } else {
            this.type_ = HalfPane.newBuilder((HalfPane) this.type_).mergeFrom((HalfPane.C6736a) halfPane).buildPartial();
        }
        this.typeCase_ = 2;
    }

    private void mergeVariableHeight(VariableHeight variableHeight) {
        variableHeight.getClass();
        if (this.typeCase_ != 4 || this.type_ == VariableHeight.getDefaultInstance()) {
            this.type_ = variableHeight;
        } else {
            this.type_ = VariableHeight.newBuilder((VariableHeight) this.type_).mergeFrom((VariableHeight.C6737a) variableHeight).buildPartial();
        }
        this.typeCase_ = 4;
    }

    public static C6738a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PresentationMode parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PresentationMode parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PresentationMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefault(Default r1) {
        r1.getClass();
        this.type_ = r1;
        this.typeCase_ = 1;
    }

    private void setHalfPane(HalfPane halfPane) {
        halfPane.getClass();
        this.type_ = halfPane;
        this.typeCase_ = 2;
    }

    private void setVariableHeight(VariableHeight variableHeight) {
        variableHeight.getClass();
        this.type_ = variableHeight;
        this.typeCase_ = 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PresentationMode();
            case 2:
                return new C6738a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"type_", "typeCase_", Default.class, HalfPane.class, VariableHeight.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PresentationMode> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$PresentationMode.class) {
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

    public Default getDefault() {
        return this.typeCase_ == 1 ? (Default) this.type_ : Default.getDefaultInstance();
    }

    public HalfPane getHalfPane() {
        return this.typeCase_ == 2 ? (HalfPane) this.type_ : HalfPane.getDefaultInstance();
    }

    public EnumC6739b getTypeCase() {
        return EnumC6739b.forNumber(this.typeCase_);
    }

    public VariableHeight getVariableHeight() {
        return this.typeCase_ == 4 ? (VariableHeight) this.type_ : VariableHeight.getDefaultInstance();
    }

    public boolean hasDefault() {
        return this.typeCase_ == 1;
    }

    public boolean hasHalfPane() {
        return this.typeCase_ == 2;
    }

    public boolean hasVariableHeight() {
        return this.typeCase_ == 4;
    }

    public static C6738a newBuilder(Pane$PresentationMode pane$PresentationMode) {
        return DEFAULT_INSTANCE.createBuilder(pane$PresentationMode);
    }

    public static Pane$PresentationMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(ByteString byteString) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PresentationMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(byte[] bArr) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PresentationMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(InputStream inputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PresentationMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PresentationMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
