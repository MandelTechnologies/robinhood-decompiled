package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class ButtonListPaneOuterClass$ButtonListPane extends GeneratedMessageLite<ButtonListPaneOuterClass$ButtonListPane, C6308a> implements MessageLiteOrBuilder {
    private static final ButtonListPaneOuterClass$ButtonListPane DEFAULT_INSTANCE;
    private static volatile Parser<ButtonListPaneOuterClass$ButtonListPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6305b> implements MessageLiteOrBuilder {
        public static final int BUTTON_FIVE_TAP_FIELD_NUMBER = 5;
        public static final int BUTTON_FOUR_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_ONE_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_THREE_TAP_FIELD_NUMBER = 3;
        public static final int BUTTON_TWO_TAP_FIELD_NUMBER = 2;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 6;
        private static volatile Parser<Actions> PARSER;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonFiveTapAction extends GeneratedMessageLite<ButtonFiveTapAction, C6298a> implements MessageLiteOrBuilder {
            private static final ButtonFiveTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonFiveTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ButtonFiveTapAction$a */
            public static final class C6298a extends GeneratedMessageLite.Builder<ButtonFiveTapAction, C6298a> implements MessageLiteOrBuilder {
                public C6298a() {
                    super(ButtonFiveTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonFiveTapAction buttonFiveTapAction = new ButtonFiveTapAction();
                DEFAULT_INSTANCE = buttonFiveTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonFiveTapAction.class, buttonFiveTapAction);
            }

            private ButtonFiveTapAction() {
            }

            public static ButtonFiveTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6298a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonFiveTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFiveTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonFiveTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonFiveTapAction();
                    case 2:
                        return new C6298a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonFiveTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonFiveTapAction.class) {
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

            public static C6298a newBuilder(ButtonFiveTapAction buttonFiveTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonFiveTapAction);
            }

            public static ButtonFiveTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(ByteString byteString) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonFiveTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(byte[] bArr) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonFiveTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(InputStream inputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFiveTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonFiveTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonFourTapAction extends GeneratedMessageLite<ButtonFourTapAction, C6299a> implements MessageLiteOrBuilder {
            private static final ButtonFourTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonFourTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ButtonFourTapAction$a */
            public static final class C6299a extends GeneratedMessageLite.Builder<ButtonFourTapAction, C6299a> implements MessageLiteOrBuilder {
                public C6299a() {
                    super(ButtonFourTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonFourTapAction buttonFourTapAction = new ButtonFourTapAction();
                DEFAULT_INSTANCE = buttonFourTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonFourTapAction.class, buttonFourTapAction);
            }

            private ButtonFourTapAction() {
            }

            public static ButtonFourTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6299a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonFourTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFourTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonFourTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonFourTapAction();
                    case 2:
                        return new C6299a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonFourTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonFourTapAction.class) {
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

            public static C6299a newBuilder(ButtonFourTapAction buttonFourTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonFourTapAction);
            }

            public static ButtonFourTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(ByteString byteString) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonFourTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(byte[] bArr) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonFourTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(InputStream inputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFourTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonFourTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonOneTapAction extends GeneratedMessageLite<ButtonOneTapAction, C6300a> implements MessageLiteOrBuilder {
            private static final ButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonOneTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ButtonOneTapAction$a */
            public static final class C6300a extends GeneratedMessageLite.Builder<ButtonOneTapAction, C6300a> implements MessageLiteOrBuilder {
                public C6300a() {
                    super(ButtonOneTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonOneTapAction buttonOneTapAction = new ButtonOneTapAction();
                DEFAULT_INSTANCE = buttonOneTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonOneTapAction.class, buttonOneTapAction);
            }

            private ButtonOneTapAction() {
            }

            public static ButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6300a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonOneTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOneTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonOneTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonOneTapAction();
                    case 2:
                        return new C6300a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonOneTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonOneTapAction.class) {
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

            public static C6300a newBuilder(ButtonOneTapAction buttonOneTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonOneTapAction);
            }

            public static ButtonOneTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(ByteString byteString) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonOneTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(byte[] bArr) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonOneTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(InputStream inputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOneTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonOneTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonThreeTapAction extends GeneratedMessageLite<ButtonThreeTapAction, C6301a> implements MessageLiteOrBuilder {
            private static final ButtonThreeTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonThreeTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ButtonThreeTapAction$a */
            public static final class C6301a extends GeneratedMessageLite.Builder<ButtonThreeTapAction, C6301a> implements MessageLiteOrBuilder {
                public C6301a() {
                    super(ButtonThreeTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonThreeTapAction buttonThreeTapAction = new ButtonThreeTapAction();
                DEFAULT_INSTANCE = buttonThreeTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonThreeTapAction.class, buttonThreeTapAction);
            }

            private ButtonThreeTapAction() {
            }

            public static ButtonThreeTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6301a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonThreeTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonThreeTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonThreeTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonThreeTapAction();
                    case 2:
                        return new C6301a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonThreeTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonThreeTapAction.class) {
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

            public static C6301a newBuilder(ButtonThreeTapAction buttonThreeTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonThreeTapAction);
            }

            public static ButtonThreeTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(ByteString byteString) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonThreeTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(byte[] bArr) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonThreeTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(InputStream inputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonThreeTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonThreeTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTwoTapAction extends GeneratedMessageLite<ButtonTwoTapAction, C6302a> implements MessageLiteOrBuilder {
            private static final ButtonTwoTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonTwoTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ButtonTwoTapAction$a */
            public static final class C6302a extends GeneratedMessageLite.Builder<ButtonTwoTapAction, C6302a> implements MessageLiteOrBuilder {
                public C6302a() {
                    super(ButtonTwoTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonTwoTapAction buttonTwoTapAction = new ButtonTwoTapAction();
                DEFAULT_INSTANCE = buttonTwoTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonTwoTapAction.class, buttonTwoTapAction);
            }

            private ButtonTwoTapAction() {
            }

            public static ButtonTwoTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6302a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonTwoTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTwoTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonTwoTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTwoTapAction();
                    case 2:
                        return new C6302a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonTwoTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonTwoTapAction.class) {
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

            public static C6302a newBuilder(ButtonTwoTapAction buttonTwoTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTwoTapAction);
            }

            public static ButtonTwoTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(ByteString byteString) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonTwoTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(byte[] bArr) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonTwoTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(InputStream inputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTwoTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonTwoTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6303a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$ExitAction$a */
            public static final class C6303a extends GeneratedMessageLite.Builder<ExitAction, C6303a> implements MessageLiteOrBuilder {
                public C6303a() {
                    super(ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ExitAction exitAction = new ExitAction();
                DEFAULT_INSTANCE = exitAction;
                GeneratedMessageLite.registerDefaultInstance(ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6303a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6303a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ExitAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ExitAction.class) {
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

            public static C6303a newBuilder(ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteString byteString) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ExitAction parseFrom(byte[] bArr) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ExitAction parseFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$a */
        public enum EnumC6304a {
            BUTTON_ONE_TAP(1),
            BUTTON_TWO_TAP(2),
            BUTTON_THREE_TAP(3),
            BUTTON_FOUR_TAP(4),
            BUTTON_FIVE_TAP(5),
            EXIT(6),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2170a;

            EnumC6304a(int i) {
                this.f2170a = i;
            }

            public static EnumC6304a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return BUTTON_ONE_TAP;
                    case 2:
                        return BUTTON_TWO_TAP;
                    case 3:
                        return BUTTON_THREE_TAP;
                    case 4:
                        return BUTTON_FOUR_TAP;
                    case 5:
                        return BUTTON_FIVE_TAP;
                    case 6:
                        return EXIT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2170a;
            }

            @Deprecated
            public static EnumC6304a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Actions$b */
        public static final class C6305b extends GeneratedMessageLite.Builder<Actions, C6305b> implements MessageLiteOrBuilder {
            public C6305b() {
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

        private void clearButtonFiveTap() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonFourTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonOneTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonThreeTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonTwoTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearExit() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonFiveTap(ButtonFiveTapAction buttonFiveTapAction) {
            buttonFiveTapAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == ButtonFiveTapAction.getDefaultInstance()) {
                this.action_ = buttonFiveTapAction;
            } else {
                this.action_ = ButtonFiveTapAction.newBuilder((ButtonFiveTapAction) this.action_).mergeFrom((ButtonFiveTapAction.C6298a) buttonFiveTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        private void mergeButtonFourTap(ButtonFourTapAction buttonFourTapAction) {
            buttonFourTapAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == ButtonFourTapAction.getDefaultInstance()) {
                this.action_ = buttonFourTapAction;
            } else {
                this.action_ = ButtonFourTapAction.newBuilder((ButtonFourTapAction) this.action_).mergeFrom((ButtonFourTapAction.C6299a) buttonFourTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeButtonOneTap(ButtonOneTapAction buttonOneTapAction) {
            buttonOneTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ButtonOneTapAction.getDefaultInstance()) {
                this.action_ = buttonOneTapAction;
            } else {
                this.action_ = ButtonOneTapAction.newBuilder((ButtonOneTapAction) this.action_).mergeFrom((ButtonOneTapAction.C6300a) buttonOneTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeButtonThreeTap(ButtonThreeTapAction buttonThreeTapAction) {
            buttonThreeTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ButtonThreeTapAction.getDefaultInstance()) {
                this.action_ = buttonThreeTapAction;
            } else {
                this.action_ = ButtonThreeTapAction.newBuilder((ButtonThreeTapAction) this.action_).mergeFrom((ButtonThreeTapAction.C6301a) buttonThreeTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeButtonTwoTap(ButtonTwoTapAction buttonTwoTapAction) {
            buttonTwoTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ButtonTwoTapAction.getDefaultInstance()) {
                this.action_ = buttonTwoTapAction;
            } else {
                this.action_ = ButtonTwoTapAction.newBuilder((ButtonTwoTapAction) this.action_).mergeFrom((ButtonTwoTapAction.C6302a) buttonTwoTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 6 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6303a) exitAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        public static C6305b newBuilder() {
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

        private void setButtonFiveTap(ButtonFiveTapAction buttonFiveTapAction) {
            buttonFiveTapAction.getClass();
            this.action_ = buttonFiveTapAction;
            this.actionCase_ = 5;
        }

        private void setButtonFourTap(ButtonFourTapAction buttonFourTapAction) {
            buttonFourTapAction.getClass();
            this.action_ = buttonFourTapAction;
            this.actionCase_ = 4;
        }

        private void setButtonOneTap(ButtonOneTapAction buttonOneTapAction) {
            buttonOneTapAction.getClass();
            this.action_ = buttonOneTapAction;
            this.actionCase_ = 1;
        }

        private void setButtonThreeTap(ButtonThreeTapAction buttonThreeTapAction) {
            buttonThreeTapAction.getClass();
            this.action_ = buttonThreeTapAction;
            this.actionCase_ = 3;
        }

        private void setButtonTwoTap(ButtonTwoTapAction buttonTwoTapAction) {
            buttonTwoTapAction.getClass();
            this.action_ = buttonTwoTapAction;
            this.actionCase_ = 2;
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6305b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"action_", "actionCase_", ButtonOneTapAction.class, ButtonTwoTapAction.class, ButtonThreeTapAction.class, ButtonFourTapAction.class, ButtonFiveTapAction.class, ExitAction.class});
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

        public EnumC6304a getActionCase() {
            return EnumC6304a.forNumber(this.actionCase_);
        }

        public ButtonFiveTapAction getButtonFiveTap() {
            return this.actionCase_ == 5 ? (ButtonFiveTapAction) this.action_ : ButtonFiveTapAction.getDefaultInstance();
        }

        public ButtonFourTapAction getButtonFourTap() {
            return this.actionCase_ == 4 ? (ButtonFourTapAction) this.action_ : ButtonFourTapAction.getDefaultInstance();
        }

        public ButtonOneTapAction getButtonOneTap() {
            return this.actionCase_ == 1 ? (ButtonOneTapAction) this.action_ : ButtonOneTapAction.getDefaultInstance();
        }

        public ButtonThreeTapAction getButtonThreeTap() {
            return this.actionCase_ == 3 ? (ButtonThreeTapAction) this.action_ : ButtonThreeTapAction.getDefaultInstance();
        }

        public ButtonTwoTapAction getButtonTwoTap() {
            return this.actionCase_ == 2 ? (ButtonTwoTapAction) this.action_ : ButtonTwoTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            return this.actionCase_ == 6 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public boolean hasButtonFiveTap() {
            return this.actionCase_ == 5;
        }

        public boolean hasButtonFourTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasButtonOneTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasButtonThreeTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasButtonTwoTap() {
            return this.actionCase_ == 2;
        }

        public boolean hasExit() {
            return this.actionCase_ == 6;
        }

        public static C6305b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6307a> implements MessageLiteOrBuilder {
        public static final int ATTRIBUTED_MESSAGE_DETAIL_FIELD_NUMBER = 16;
        public static final int BUTTON_FIVE_FIELD_NUMBER = 12;
        public static final int BUTTON_FOUR_FIELD_NUMBER = 11;
        public static final int BUTTON_ONE_FIELD_NUMBER = 8;
        public static final int BUTTON_THREE_FIELD_NUMBER = 10;
        public static final int BUTTON_TWO_FIELD_NUMBER = 9;
        public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 17;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_FIELD_NUMBER = 13;
        public static final int EVENTS_FIELD_NUMBER = 14;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int MESSAGE_DETAIL_FIELD_NUMBER = 7;
        public static final int MESSAGE_FIELD_NUMBER = 6;
        public static final int PANE_HEADER_FIELD_NUMBER = 15;
        private static volatile Parser<Rendering> PARSER;
        private Common$AttributedLocalizedString attributedMessageDetail_;
        private int bitField0_;
        private Common$ButtonContent buttonFive_;
        private Common$ButtonContent buttonFour_;
        private Common$ButtonContent buttonOne_;
        private Common$ButtonContent buttonThree_;
        private Common$ButtonContent buttonTwo_;
        private int contentJustify_;
        private Common$LocalizedString disclaimer_;
        private Events events_;
        private Common$RenderedInstitution institution_;
        private Common$LocalizedString messageDetail_;
        private Common$LocalizedString message_;
        private Common$PaneHeader paneHeader_;

        public static final class Events extends GeneratedMessageLite<Events, C6306a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_FIVE_TAP_FIELD_NUMBER = 7;
            public static final int ON_BUTTON_FOUR_TAP_FIELD_NUMBER = 6;
            public static final int ON_BUTTON_ONE_TAP_FIELD_NUMBER = 2;
            public static final int ON_BUTTON_THREE_TAP_FIELD_NUMBER = 5;
            public static final int ON_BUTTON_TWO_TAP_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonFiveTap_;
            private Common$SDKEvent onButtonFourTap_;
            private Common$SDKEvent onButtonOneTap_;
            private Common$SDKEvent onButtonThreeTap_;
            private Common$SDKEvent onButtonTwoTap_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Rendering$Events$a */
            public static final class C6306a extends GeneratedMessageLite.Builder<Events, C6306a> implements MessageLiteOrBuilder {
                public C6306a() {
                    super(Events.DEFAULT_INSTANCE);
                }
            }

            static {
                Events events = new Events();
                DEFAULT_INSTANCE = events;
                GeneratedMessageLite.registerDefaultInstance(Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onAppear_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnButtonFiveTap() {
                this.onButtonFiveTap_ = null;
                this.bitField0_ &= -17;
            }

            private void clearOnButtonFourTap() {
                this.onButtonFourTap_ = null;
                this.bitField0_ &= -9;
            }

            private void clearOnButtonOneTap() {
                this.onButtonOneTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnButtonThreeTap() {
                this.onButtonThreeTap_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnButtonTwoTap() {
                this.onButtonTwoTap_ = null;
                this.bitField0_ &= -3;
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeOnButtonFiveTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonFiveTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonFiveTap_ = common$SDKEvent;
                } else {
                    this.onButtonFiveTap_ = Common$SDKEvent.newBuilder(this.onButtonFiveTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeOnButtonFourTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonFourTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonFourTap_ = common$SDKEvent;
                } else {
                    this.onButtonFourTap_ = Common$SDKEvent.newBuilder(this.onButtonFourTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeOnButtonOneTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonOneTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonOneTap_ = common$SDKEvent;
                } else {
                    this.onButtonOneTap_ = Common$SDKEvent.newBuilder(this.onButtonOneTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnButtonThreeTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonThreeTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonThreeTap_ = common$SDKEvent;
                } else {
                    this.onButtonThreeTap_ = Common$SDKEvent.newBuilder(this.onButtonThreeTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnButtonTwoTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonTwoTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTwoTap_ = common$SDKEvent;
                } else {
                    this.onButtonTwoTap_ = Common$SDKEvent.newBuilder(this.onButtonTwoTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6306a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Events parseDelimitedFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(ByteBuffer byteBuffer) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnButtonFiveTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonFiveTap_ = common$SDKEvent;
                this.bitField0_ |= 16;
            }

            private void setOnButtonFourTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonFourTap_ = common$SDKEvent;
                this.bitField0_ |= 8;
            }

            private void setOnButtonOneTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonOneTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnButtonThreeTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonThreeTap_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnButtonTwoTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonTwoTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6306a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onButtonOneTap_", "onButtonTwoTap_", "onButtonThreeTap_", "onButtonFourTap_", "onButtonFiveTap_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Events> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Events.class) {
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

            public Common$SDKEvent getOnAppear(int i) {
                return this.onAppear_.get(i);
            }

            public int getOnAppearCount() {
                return this.onAppear_.size();
            }

            public List<Common$SDKEvent> getOnAppearList() {
                return this.onAppear_;
            }

            public InterfaceC6691M getOnAppearOrBuilder(int i) {
                return this.onAppear_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            public Common$SDKEvent getOnButtonFiveTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonFiveTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonFourTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonFourTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonOneTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonOneTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonThreeTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonThreeTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonTwoTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonTwoTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnButtonFiveTap() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasOnButtonFourTap() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasOnButtonOneTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnButtonThreeTap() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasOnButtonTwoTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6306a newBuilder(Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static Events parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Events parseFrom(ByteString byteString) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static Events parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Events parseFrom(byte[] bArr) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Events parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Events parseFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(CodedInputStream codedInputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Events parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$Rendering$a */
        public static final class C6307a extends GeneratedMessageLite.Builder<Rendering, C6307a> implements MessageLiteOrBuilder {
            public C6307a() {
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

        private void clearAttributedMessageDetail() {
            this.attributedMessageDetail_ = null;
            this.bitField0_ &= -17;
        }

        private void clearButtonFive() {
            this.buttonFive_ = null;
            this.bitField0_ &= -513;
        }

        private void clearButtonFour() {
            this.buttonFour_ = null;
            this.bitField0_ &= -257;
        }

        private void clearButtonOne() {
            this.buttonOne_ = null;
            this.bitField0_ &= -33;
        }

        private void clearButtonThree() {
            this.buttonThree_ = null;
            this.bitField0_ &= -129;
        }

        private void clearButtonTwo() {
            this.buttonTwo_ = null;
            this.bitField0_ &= -65;
        }

        private void clearContentJustify() {
            this.contentJustify_ = 0;
        }

        private void clearDisclaimer() {
            this.disclaimer_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2049;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearMessage() {
            this.message_ = null;
            this.bitField0_ &= -5;
        }

        private void clearMessageDetail() {
            this.messageDetail_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAttributedMessageDetail(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedMessageDetail_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.attributedMessageDetail_ = common$AttributedLocalizedString;
            } else {
                this.attributedMessageDetail_ = Common$AttributedLocalizedString.newBuilder(this.attributedMessageDetail_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeButtonFive(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonFive_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.buttonFive_ = common$ButtonContent;
            } else {
                this.buttonFive_ = Common$ButtonContent.newBuilder(this.buttonFive_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeButtonFour(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonFour_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.buttonFour_ = common$ButtonContent;
            } else {
                this.buttonFour_ = Common$ButtonContent.newBuilder(this.buttonFour_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeButtonOne(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonOne_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.buttonOne_ = common$ButtonContent;
            } else {
                this.buttonOne_ = Common$ButtonContent.newBuilder(this.buttonOne_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeButtonThree(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonThree_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.buttonThree_ = common$ButtonContent;
            } else {
                this.buttonThree_ = Common$ButtonContent.newBuilder(this.buttonThree_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeButtonTwo(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonTwo_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.buttonTwo_ = common$ButtonContent;
            } else {
                this.buttonTwo_ = Common$ButtonContent.newBuilder(this.buttonTwo_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeDisclaimer(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.disclaimer_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.disclaimer_ = common$LocalizedString;
            } else {
                this.disclaimer_ = Common$LocalizedString.newBuilder(this.disclaimer_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6306a) events).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        private void mergeInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = common$RenderedInstitution;
            } else {
                this.institution_ = Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((Common$RenderedInstitution.C6476a) common$RenderedInstitution).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeMessage(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.message_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.message_ = common$LocalizedString;
            } else {
                this.message_ = Common$LocalizedString.newBuilder(this.message_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeMessageDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.messageDetail_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.messageDetail_ = common$LocalizedString;
            } else {
                this.messageDetail_ = Common$LocalizedString.newBuilder(this.messageDetail_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergePaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((Common$PaneHeader.C6458a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static C6307a newBuilder() {
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

        private void setAttributedMessageDetail(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.attributedMessageDetail_ = common$AttributedLocalizedString;
            this.bitField0_ |= 16;
        }

        private void setButtonFive(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonFive_ = common$ButtonContent;
            this.bitField0_ |= 512;
        }

        private void setButtonFour(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonFour_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setButtonOne(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonOne_ = common$ButtonContent;
            this.bitField0_ |= 32;
        }

        private void setButtonThree(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonThree_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setButtonTwo(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonTwo_ = common$ButtonContent;
            this.bitField0_ |= 64;
        }

        private void setContentJustify(EnumC6935s enumC6935s) {
            this.contentJustify_ = enumC6935s.getNumber();
        }

        private void setContentJustifyValue(int i) {
            this.contentJustify_ = i;
        }

        private void setDisclaimer(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.disclaimer_ = common$LocalizedString;
            this.bitField0_ |= 1024;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 2048;
        }

        private void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setMessage(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.message_ = common$LocalizedString;
            this.bitField0_ |= 4;
        }

        private void setMessageDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.messageDetail_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6307a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0002\u0011\r\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\u0001\u0010ဉ\u0004\u0011\f", new Object[]{"bitField0_", "institution_", "message_", "messageDetail_", "buttonOne_", "buttonTwo_", "buttonThree_", "buttonFour_", "buttonFive_", "disclaimer_", "events_", "paneHeader_", "attributedMessageDetail_", "contentJustify_"});
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

        public Common$AttributedLocalizedString getAttributedMessageDetail() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedMessageDetail_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$ButtonContent getButtonFive() {
            Common$ButtonContent common$ButtonContent = this.buttonFive_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonFour() {
            Common$ButtonContent common$ButtonContent = this.buttonFour_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonOne() {
            Common$ButtonContent common$ButtonContent = this.buttonOne_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonThree() {
            Common$ButtonContent common$ButtonContent = this.buttonThree_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonTwo() {
            Common$ButtonContent common$ButtonContent = this.buttonTwo_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public EnumC6935s getContentJustify() {
            EnumC6935s enumC6935sForNumber = EnumC6935s.forNumber(this.contentJustify_);
            return enumC6935sForNumber == null ? EnumC6935s.UNRECOGNIZED : enumC6935sForNumber;
        }

        public int getContentJustifyValue() {
            return this.contentJustify_;
        }

        public Common$LocalizedString getDisclaimer() {
            Common$LocalizedString common$LocalizedString = this.disclaimer_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$LocalizedString getMessage() {
            Common$LocalizedString common$LocalizedString = this.message_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$LocalizedString getMessageDetail() {
            Common$LocalizedString common$LocalizedString = this.messageDetail_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public boolean hasAttributedMessageDetail() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasButtonFive() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasButtonFour() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasButtonOne() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasButtonThree() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasButtonTwo() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasDisclaimer() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMessageDetail() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C6307a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane$a */
    public static final class C6308a extends GeneratedMessageLite.Builder<ButtonListPaneOuterClass$ButtonListPane, C6308a> implements MessageLiteOrBuilder {
        public C6308a() {
            super(ButtonListPaneOuterClass$ButtonListPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ButtonListPaneOuterClass$ButtonListPane buttonListPaneOuterClass$ButtonListPane = new ButtonListPaneOuterClass$ButtonListPane();
        DEFAULT_INSTANCE = buttonListPaneOuterClass$ButtonListPane;
        GeneratedMessageLite.registerDefaultInstance(ButtonListPaneOuterClass$ButtonListPane.class, buttonListPaneOuterClass$ButtonListPane);
    }

    private ButtonListPaneOuterClass$ButtonListPane() {
    }

    public static ButtonListPaneOuterClass$ButtonListPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6308a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseDelimitedFrom(InputStream inputStream) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(ByteBuffer byteBuffer) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonListPaneOuterClass$ButtonListPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6901b.f2543a[methodToInvoke.ordinal()]) {
            case 1:
                return new ButtonListPaneOuterClass$ButtonListPane();
            case 2:
                return new C6308a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonListPaneOuterClass$ButtonListPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ButtonListPaneOuterClass$ButtonListPane.class) {
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

    public static C6308a newBuilder(ButtonListPaneOuterClass$ButtonListPane buttonListPaneOuterClass$ButtonListPane) {
        return DEFAULT_INSTANCE.createBuilder(buttonListPaneOuterClass$ButtonListPane);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(ByteString byteString) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(byte[] bArr) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(InputStream inputStream) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(CodedInputStream codedInputStream) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonListPaneOuterClass$ButtonListPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonListPaneOuterClass$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
