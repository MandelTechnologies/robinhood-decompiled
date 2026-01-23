package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes24.dex */
public final class FlexiblePaneOuterClass$FlexiblePane extends GeneratedMessageLite<FlexiblePaneOuterClass$FlexiblePane, C6618a> implements MessageLiteOrBuilder {
    private static final FlexiblePaneOuterClass$FlexiblePane DEFAULT_INSTANCE;
    private static volatile Parser<FlexiblePaneOuterClass$FlexiblePane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6608b> implements MessageLiteOrBuilder {
        public static final int BUTTON_ONE_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_THREE_TAP_FIELD_NUMBER = 3;
        public static final int BUTTON_TWO_TAP_FIELD_NUMBER = 2;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 4;
        private static volatile Parser<Actions> PARSER;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonOneTapAction extends GeneratedMessageLite<ButtonOneTapAction, C6599a> implements MessageLiteOrBuilder {
            private static final ButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonOneTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$ButtonOneTapAction$a */
            public static final class C6599a extends GeneratedMessageLite.Builder<ButtonOneTapAction, C6599a> implements MessageLiteOrBuilder {
                public C6599a() {
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

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static ButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6605a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6599a newBuilder() {
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

            private void setResponse(Response response) {
                response.getClass();
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonOneTapAction();
                    case 2:
                        return new C6599a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
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

            public Response getResponse() {
                Response response = this.response_;
                return response == null ? Response.getDefaultInstance() : response;
            }

            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6599a newBuilder(ButtonOneTapAction buttonOneTapAction) {
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

        public static final class ButtonThreeTapAction extends GeneratedMessageLite<ButtonThreeTapAction, C6600a> implements MessageLiteOrBuilder {
            private static final ButtonThreeTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonThreeTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$ButtonThreeTapAction$a */
            public static final class C6600a extends GeneratedMessageLite.Builder<ButtonThreeTapAction, C6600a> implements MessageLiteOrBuilder {
                public C6600a() {
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

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static ButtonThreeTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6605a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6600a newBuilder() {
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

            private void setResponse(Response response) {
                response.getClass();
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonThreeTapAction();
                    case 2:
                        return new C6600a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
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

            public Response getResponse() {
                Response response = this.response_;
                return response == null ? Response.getDefaultInstance() : response;
            }

            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6600a newBuilder(ButtonThreeTapAction buttonThreeTapAction) {
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

        public static final class ButtonTwoTapAction extends GeneratedMessageLite<ButtonTwoTapAction, C6601a> implements MessageLiteOrBuilder {
            private static final ButtonTwoTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonTwoTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$ButtonTwoTapAction$a */
            public static final class C6601a extends GeneratedMessageLite.Builder<ButtonTwoTapAction, C6601a> implements MessageLiteOrBuilder {
                public C6601a() {
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

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static ButtonTwoTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6605a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6601a newBuilder() {
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

            private void setResponse(Response response) {
                response.getClass();
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTwoTapAction();
                    case 2:
                        return new C6601a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
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

            public Response getResponse() {
                Response response = this.response_;
                return response == null ? Response.getDefaultInstance() : response;
            }

            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6601a newBuilder(ButtonTwoTapAction buttonTwoTapAction) {
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

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6602a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$ExitAction$a */
            public static final class C6602a extends GeneratedMessageLite.Builder<ExitAction, C6602a> implements MessageLiteOrBuilder {
                public C6602a() {
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

            public static C6602a newBuilder() {
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
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6602a();
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

            public static C6602a newBuilder(ExitAction exitAction) {
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

        public static final class Response extends GeneratedMessageLite<Response, C6605a> implements MessageLiteOrBuilder {
            public static final int COMPONENT_ID_FIELD_NUMBER = 3;
            private static final Response DEFAULT_INSTANCE;
            private static volatile Parser<Response> PARSER = null;
            public static final int RAW_USER_INPUTS_FIELD_NUMBER = 1;
            private MapFieldLite<String, RawInput> rawUserInputs_ = MapFieldLite.emptyMapField();
            private String componentId_ = "";

            public static final class RawInput extends GeneratedMessageLite<RawInput, C6603a> implements MessageLiteOrBuilder {
                private static final RawInput DEFAULT_INSTANCE;
                private static volatile Parser<RawInput> PARSER = null;
                public static final int TEXT_FIELD_NUMBER = 2;
                private int valueCase_ = 0;
                private Object value_;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$Response$RawInput$a */
                public static final class C6603a extends GeneratedMessageLite.Builder<RawInput, C6603a> implements MessageLiteOrBuilder {
                    public C6603a() {
                        super(RawInput.DEFAULT_INSTANCE);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$Response$RawInput$b */
                public enum EnumC6604b {
                    TEXT(2),
                    VALUE_NOT_SET(0);


                    /* renamed from: a */
                    public final int f2360a;

                    EnumC6604b(int i) {
                        this.f2360a = i;
                    }

                    public static EnumC6604b forNumber(int i) {
                        if (i == 0) {
                            return VALUE_NOT_SET;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return TEXT;
                    }

                    public int getNumber() {
                        return this.f2360a;
                    }

                    @Deprecated
                    public static EnumC6604b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    RawInput rawInput = new RawInput();
                    DEFAULT_INSTANCE = rawInput;
                    GeneratedMessageLite.registerDefaultInstance(RawInput.class, rawInput);
                }

                private RawInput() {
                }

                private void clearText() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static RawInput getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6603a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static RawInput parseDelimitedFrom(InputStream inputStream) {
                    return (RawInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RawInput parseFrom(ByteBuffer byteBuffer) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<RawInput> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setText(String str) {
                    str.getClass();
                    this.valueCase_ = 2;
                    this.value_ = str;
                }

                private void setTextBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                    this.valueCase_ = 2;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new RawInput();
                        case 2:
                            return new C6603a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȼ\u0000", new Object[]{"value_", "valueCase_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<RawInput> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (RawInput.class) {
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

                public EnumC6604b getValueCase() {
                    return EnumC6604b.forNumber(this.valueCase_);
                }

                public boolean hasText() {
                    return this.valueCase_ == 2;
                }

                public static C6603a newBuilder(RawInput rawInput) {
                    return DEFAULT_INSTANCE.createBuilder(rawInput);
                }

                public static RawInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static RawInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public String getText() {
                    return this.valueCase_ == 2 ? (String) this.value_ : "";
                }

                public ByteString getTextBytes() {
                    return ByteString.copyFromUtf8(this.valueCase_ == 2 ? (String) this.value_ : "");
                }

                public static RawInput parseFrom(ByteString byteString) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static RawInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static RawInput parseFrom(byte[] bArr) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static RawInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static RawInput parseFrom(InputStream inputStream) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RawInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static RawInput parseFrom(CodedInputStream codedInputStream) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static RawInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (RawInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$Response$a */
            public static final class C6605a extends GeneratedMessageLite.Builder<Response, C6605a> implements MessageLiteOrBuilder {
                public C6605a() {
                    super(Response.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$Response$b */
            public static final class C6606b {

                /* renamed from: a */
                public static final MapEntryLite<String, RawInput> f2361a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, RawInput.getDefaultInstance());
            }

            static {
                Response response = new Response();
                DEFAULT_INSTANCE = response;
                GeneratedMessageLite.registerDefaultInstance(Response.class, response);
            }

            private Response() {
            }

            private void clearComponentId() {
                this.componentId_ = getDefaultInstance().getComponentId();
            }

            public static Response getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private Map<String, RawInput> getMutableRawUserInputsMap() {
                return internalGetMutableRawUserInputs();
            }

            private MapFieldLite<String, RawInput> internalGetMutableRawUserInputs() {
                if (!this.rawUserInputs_.isMutable()) {
                    this.rawUserInputs_ = this.rawUserInputs_.mutableCopy();
                }
                return this.rawUserInputs_;
            }

            private MapFieldLite<String, RawInput> internalGetRawUserInputs() {
                return this.rawUserInputs_;
            }

            public static C6605a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Response parseDelimitedFrom(InputStream inputStream) {
                return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Response parseFrom(ByteBuffer byteBuffer) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Response> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setComponentId(String str) {
                str.getClass();
                this.componentId_ = str;
            }

            private void setComponentIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.componentId_ = byteString.toStringUtf8();
            }

            public boolean containsRawUserInputs(String str) {
                str.getClass();
                return internalGetRawUserInputs().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Response();
                    case 2:
                        return new C6605a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0001\u0000\u0000\u00012\u0003Ȉ", new Object[]{"rawUserInputs_", C6606b.f2361a, "componentId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Response> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Response.class) {
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

            public String getComponentId() {
                return this.componentId_;
            }

            public ByteString getComponentIdBytes() {
                return ByteString.copyFromUtf8(this.componentId_);
            }

            @Deprecated
            public Map<String, RawInput> getRawUserInputs() {
                return getRawUserInputsMap();
            }

            public int getRawUserInputsCount() {
                return internalGetRawUserInputs().size();
            }

            public Map<String, RawInput> getRawUserInputsMap() {
                return Collections.unmodifiableMap(internalGetRawUserInputs());
            }

            public RawInput getRawUserInputsOrDefault(String str, RawInput rawInput) {
                str.getClass();
                MapFieldLite<String, RawInput> mapFieldLiteInternalGetRawUserInputs = internalGetRawUserInputs();
                return mapFieldLiteInternalGetRawUserInputs.containsKey(str) ? mapFieldLiteInternalGetRawUserInputs.get(str) : rawInput;
            }

            public RawInput getRawUserInputsOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, RawInput> mapFieldLiteInternalGetRawUserInputs = internalGetRawUserInputs();
                if (mapFieldLiteInternalGetRawUserInputs.containsKey(str)) {
                    return mapFieldLiteInternalGetRawUserInputs.get(str);
                }
                throw new IllegalArgumentException();
            }

            public static C6605a newBuilder(Response response) {
                return DEFAULT_INSTANCE.createBuilder(response);
            }

            public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Response parseFrom(ByteString byteString) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Response parseFrom(byte[] bArr) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Response parseFrom(InputStream inputStream) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Response parseFrom(CodedInputStream codedInputStream) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$a */
        public enum EnumC6607a {
            BUTTON_ONE_TAP(1),
            BUTTON_TWO_TAP(2),
            BUTTON_THREE_TAP(3),
            EXIT(4),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2363a;

            EnumC6607a(int i) {
                this.f2363a = i;
            }

            public static EnumC6607a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_ONE_TAP;
                }
                if (i == 2) {
                    return BUTTON_TWO_TAP;
                }
                if (i == 3) {
                    return BUTTON_THREE_TAP;
                }
                if (i != 4) {
                    return null;
                }
                return EXIT;
            }

            public int getNumber() {
                return this.f2363a;
            }

            @Deprecated
            public static EnumC6607a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Actions$b */
        public static final class C6608b extends GeneratedMessageLite.Builder<Actions, C6608b> implements MessageLiteOrBuilder {
            public C6608b() {
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
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonOneTap(ButtonOneTapAction buttonOneTapAction) {
            buttonOneTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ButtonOneTapAction.getDefaultInstance()) {
                this.action_ = buttonOneTapAction;
            } else {
                this.action_ = ButtonOneTapAction.newBuilder((ButtonOneTapAction) this.action_).mergeFrom((ButtonOneTapAction.C6599a) buttonOneTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeButtonThreeTap(ButtonThreeTapAction buttonThreeTapAction) {
            buttonThreeTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ButtonThreeTapAction.getDefaultInstance()) {
                this.action_ = buttonThreeTapAction;
            } else {
                this.action_ = ButtonThreeTapAction.newBuilder((ButtonThreeTapAction) this.action_).mergeFrom((ButtonThreeTapAction.C6600a) buttonThreeTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeButtonTwoTap(ButtonTwoTapAction buttonTwoTapAction) {
            buttonTwoTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ButtonTwoTapAction.getDefaultInstance()) {
                this.action_ = buttonTwoTapAction;
            } else {
                this.action_ = ButtonTwoTapAction.newBuilder((ButtonTwoTapAction) this.action_).mergeFrom((ButtonTwoTapAction.C6601a) buttonTwoTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6602a) exitAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static C6608b newBuilder() {
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
            this.actionCase_ = 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6608b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", ButtonOneTapAction.class, ButtonTwoTapAction.class, ButtonThreeTapAction.class, ExitAction.class});
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

        public EnumC6607a getActionCase() {
            return EnumC6607a.forNumber(this.actionCase_);
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
            return this.actionCase_ == 4 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
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
            return this.actionCase_ == 4;
        }

        public static C6608b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6615a> implements MessageLiteOrBuilder {
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 3;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DEFAULT_LAYOUT_FIELD_NUMBER = 1;
        public static final int EVENTS_FIELD_NUMBER = 2;
        private static volatile Parser<Rendering> PARSER;
        private int backgroundDisplayMode_;
        private int bitField0_;
        private Events events_;
        private int layoutCase_ = 0;
        private Object layout_;

        public static final class Events extends GeneratedMessageLite<Events, C6609a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$Events$a */
            public static final class C6609a extends GeneratedMessageLite.Builder<Events, C6609a> implements MessageLiteOrBuilder {
                public C6609a() {
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

            public static C6609a newBuilder() {
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6609a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"onAppear_", Common$SDKEvent.class});
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

            public static C6609a newBuilder(Events events) {
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

        public static final class Layout extends GeneratedMessageLite<Layout, C6611a> implements MessageLiteOrBuilder {
            private static final Layout DEFAULT_INSTANCE;
            private static volatile Parser<Layout> PARSER;

            public static final class Default extends GeneratedMessageLite<Default, C6610a> implements MessageLiteOrBuilder {
                private static final Default DEFAULT_INSTANCE;
                public static final int PANE_BODY_FIELD_NUMBER = 5;
                public static final int PANE_FOOTER_FIELD_NUMBER = 6;
                public static final int PANE_HEADER_FIELD_NUMBER = 4;
                private static volatile Parser<Default> PARSER;
                private int bitField0_;
                private PaneBody paneBody_;
                private PaneFooter paneFooter_;
                private Common$PaneHeader paneHeader_;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$Layout$Default$a */
                public static final class C6610a extends GeneratedMessageLite.Builder<Default, C6610a> implements MessageLiteOrBuilder {
                    public C6610a() {
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

                private void clearPaneBody() {
                    this.paneBody_ = null;
                    this.bitField0_ &= -3;
                }

                private void clearPaneFooter() {
                    this.paneFooter_ = null;
                    this.bitField0_ &= -5;
                }

                private void clearPaneHeader() {
                    this.paneHeader_ = null;
                    this.bitField0_ &= -2;
                }

                public static Default getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                private void mergePaneBody(PaneBody paneBody) {
                    paneBody.getClass();
                    PaneBody paneBody2 = this.paneBody_;
                    if (paneBody2 == null || paneBody2 == PaneBody.getDefaultInstance()) {
                        this.paneBody_ = paneBody;
                    } else {
                        this.paneBody_ = PaneBody.newBuilder(this.paneBody_).mergeFrom((PaneBody.C6612a) paneBody).buildPartial();
                    }
                    this.bitField0_ |= 2;
                }

                private void mergePaneFooter(PaneFooter paneFooter) {
                    paneFooter.getClass();
                    PaneFooter paneFooter2 = this.paneFooter_;
                    if (paneFooter2 == null || paneFooter2 == PaneFooter.getDefaultInstance()) {
                        this.paneFooter_ = paneFooter;
                    } else {
                        this.paneFooter_ = PaneFooter.newBuilder(this.paneFooter_).mergeFrom((PaneFooter.C6613a) paneFooter).buildPartial();
                    }
                    this.bitField0_ |= 4;
                }

                private void mergePaneHeader(Common$PaneHeader common$PaneHeader) {
                    common$PaneHeader.getClass();
                    Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
                    if (common$PaneHeader2 == null || common$PaneHeader2 == Common$PaneHeader.getDefaultInstance()) {
                        this.paneHeader_ = common$PaneHeader;
                    } else {
                        this.paneHeader_ = Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((Common$PaneHeader.C6458a) common$PaneHeader).buildPartial();
                    }
                    this.bitField0_ |= 1;
                }

                public static C6610a newBuilder() {
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

                private void setPaneBody(PaneBody paneBody) {
                    paneBody.getClass();
                    this.paneBody_ = paneBody;
                    this.bitField0_ |= 2;
                }

                private void setPaneFooter(PaneFooter paneFooter) {
                    paneFooter.getClass();
                    this.paneFooter_ = paneFooter;
                    this.bitField0_ |= 4;
                }

                private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                    common$PaneHeader.getClass();
                    this.paneHeader_ = common$PaneHeader;
                    this.bitField0_ |= 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Default();
                        case 2:
                            return new C6610a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "paneHeader_", "paneBody_", "paneFooter_"});
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

                public PaneBody getPaneBody() {
                    PaneBody paneBody = this.paneBody_;
                    return paneBody == null ? PaneBody.getDefaultInstance() : paneBody;
                }

                public PaneFooter getPaneFooter() {
                    PaneFooter paneFooter = this.paneFooter_;
                    return paneFooter == null ? PaneFooter.getDefaultInstance() : paneFooter;
                }

                public Common$PaneHeader getPaneHeader() {
                    Common$PaneHeader common$PaneHeader = this.paneHeader_;
                    return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
                }

                public boolean hasPaneBody() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasPaneFooter() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasPaneHeader() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static C6610a newBuilder(Default r1) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$Layout$a */
            public static final class C6611a extends GeneratedMessageLite.Builder<Layout, C6611a> implements MessageLiteOrBuilder {
                public C6611a() {
                    super(Layout.DEFAULT_INSTANCE);
                }
            }

            static {
                Layout layout = new Layout();
                DEFAULT_INSTANCE = layout;
                GeneratedMessageLite.registerDefaultInstance(Layout.class, layout);
            }

            private Layout() {
            }

            public static Layout getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6611a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Layout parseDelimitedFrom(InputStream inputStream) {
                return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Layout parseFrom(ByteBuffer byteBuffer) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Layout> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Layout();
                    case 2:
                        return new C6611a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Layout> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Layout.class) {
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

            public static C6611a newBuilder(Layout layout) {
                return DEFAULT_INSTANCE.createBuilder(layout);
            }

            public static Layout parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Layout parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Layout parseFrom(ByteString byteString) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Layout parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Layout parseFrom(byte[] bArr) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Layout parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Layout parseFrom(InputStream inputStream) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Layout parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Layout parseFrom(CodedInputStream codedInputStream) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Layout parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneBody extends GeneratedMessageLite<PaneBody, C6612a> implements MessageLiteOrBuilder {
            public static final int COMPONENTS_FIELD_NUMBER = 2;
            public static final int CONTAINER_TYPE_FIELD_NUMBER = 1;
            private static final PaneBody DEFAULT_INSTANCE;
            private static volatile Parser<PaneBody> PARSER;
            private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
            private int containerType_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneBody$a */
            public static final class C6612a extends GeneratedMessageLite.Builder<PaneBody, C6612a> implements MessageLiteOrBuilder {
                public C6612a() {
                    super(PaneBody.DEFAULT_INSTANCE);
                }
            }

            static {
                PaneBody paneBody = new PaneBody();
                DEFAULT_INSTANCE = paneBody;
                GeneratedMessageLite.registerDefaultInstance(PaneBody.class, paneBody);
            }

            private PaneBody() {
            }

            private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
                ensureComponentsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
            }

            private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.add(common$FlexibleComponent);
            }

            private void clearComponents() {
                this.components_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearContainerType() {
                this.containerType_ = 0;
            }

            private void ensureComponentsIsMutable() {
                Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static PaneBody getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6612a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PaneBody parseDelimitedFrom(InputStream inputStream) {
                return (PaneBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneBody parseFrom(ByteBuffer byteBuffer) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PaneBody> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeComponents(int i) {
                ensureComponentsIsMutable();
                this.components_.remove(i);
            }

            private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.set(i, common$FlexibleComponent);
            }

            private void setContainerType(EnumC6616b enumC6616b) {
                this.containerType_ = enumC6616b.getNumber();
            }

            private void setContainerTypeValue(int i) {
                this.containerType_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PaneBody();
                    case 2:
                        return new C6612a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"containerType_", "components_", Common$FlexibleComponent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PaneBody> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PaneBody.class) {
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

            public Common$FlexibleComponent getComponents(int i) {
                return this.components_.get(i);
            }

            public int getComponentsCount() {
                return this.components_.size();
            }

            public List<Common$FlexibleComponent> getComponentsList() {
                return this.components_;
            }

            public InterfaceC6943w getComponentsOrBuilder(int i) {
                return this.components_.get(i);
            }

            public List<? extends InterfaceC6943w> getComponentsOrBuilderList() {
                return this.components_;
            }

            public EnumC6616b getContainerType() {
                EnumC6616b enumC6616bForNumber = EnumC6616b.forNumber(this.containerType_);
                return enumC6616bForNumber == null ? EnumC6616b.UNRECOGNIZED : enumC6616bForNumber;
            }

            public int getContainerTypeValue() {
                return this.containerType_;
            }

            public static C6612a newBuilder(PaneBody paneBody) {
                return DEFAULT_INSTANCE.createBuilder(paneBody);
            }

            public static PaneBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PaneBody parseFrom(ByteString byteString) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.add(i, common$FlexibleComponent);
            }

            public static PaneBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PaneBody parseFrom(byte[] bArr) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PaneBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PaneBody parseFrom(InputStream inputStream) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneBody parseFrom(CodedInputStream codedInputStream) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PaneBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneFooter extends GeneratedMessageLite<PaneFooter, C6613a> implements MessageLiteOrBuilder {
            public static final int COMPONENTS_FIELD_NUMBER = 3;
            public static final int CONTAINER_TYPE_FIELD_NUMBER = 2;
            private static final PaneFooter DEFAULT_INSTANCE;
            public static final int FADE_TYPE_FIELD_NUMBER = 1;
            private static volatile Parser<PaneFooter> PARSER = null;
            public static final int SHRINK_PADDING_BOTTOM_FIELD_NUMBER = 4;
            private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
            private int containerType_;
            private int fadeType_;
            private boolean shrinkPaddingBottom_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneFooter$a */
            public static final class C6613a extends GeneratedMessageLite.Builder<PaneFooter, C6613a> implements MessageLiteOrBuilder {
                public C6613a() {
                    super(PaneFooter.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneFooter$b */
            public enum EnumC6614b implements Internal.EnumLite {
                NONE(0),
                DEFAULT(1),
                DIVIDER(2),
                UNRECOGNIZED(-1);

                public static final int DEFAULT_VALUE = 1;
                public static final int DIVIDER_VALUE = 2;
                public static final int NONE_VALUE = 0;

                /* renamed from: b */
                public static final a f2364b = new a();

                /* renamed from: a */
                public final int f2366a;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneFooter$b$a */
                public class a implements Internal.EnumLiteMap<EnumC6614b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final Internal.EnumLite findValueByNumber(int i) {
                        return EnumC6614b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$PaneFooter$b$b */
                public static final class b implements Internal.EnumVerifier {

                    /* renamed from: a */
                    public static final b f2367a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return EnumC6614b.forNumber(i) != null;
                    }
                }

                EnumC6614b(int i) {
                    this.f2366a = i;
                }

                public static EnumC6614b forNumber(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return DEFAULT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DIVIDER;
                }

                public static Internal.EnumLiteMap<EnumC6614b> internalGetValueMap() {
                    return f2364b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f2367a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f2366a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumC6614b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                PaneFooter paneFooter = new PaneFooter();
                DEFAULT_INSTANCE = paneFooter;
                GeneratedMessageLite.registerDefaultInstance(PaneFooter.class, paneFooter);
            }

            private PaneFooter() {
            }

            private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
                ensureComponentsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
            }

            private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.add(common$FlexibleComponent);
            }

            private void clearComponents() {
                this.components_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearContainerType() {
                this.containerType_ = 0;
            }

            private void clearFadeType() {
                this.fadeType_ = 0;
            }

            private void clearShrinkPaddingBottom() {
                this.shrinkPaddingBottom_ = false;
            }

            private void ensureComponentsIsMutable() {
                Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static PaneFooter getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6613a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PaneFooter parseDelimitedFrom(InputStream inputStream) {
                return (PaneFooter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneFooter parseFrom(ByteBuffer byteBuffer) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PaneFooter> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeComponents(int i) {
                ensureComponentsIsMutable();
                this.components_.remove(i);
            }

            private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.set(i, common$FlexibleComponent);
            }

            private void setContainerType(EnumC6616b enumC6616b) {
                this.containerType_ = enumC6616b.getNumber();
            }

            private void setContainerTypeValue(int i) {
                this.containerType_ = i;
            }

            private void setFadeType(EnumC6614b enumC6614b) {
                this.fadeType_ = enumC6614b.getNumber();
            }

            private void setFadeTypeValue(int i) {
                this.fadeType_ = i;
            }

            private void setShrinkPaddingBottom(boolean z) {
                this.shrinkPaddingBottom_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PaneFooter();
                    case 2:
                        return new C6613a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u001b\u0004\u0007", new Object[]{"fadeType_", "containerType_", "components_", Common$FlexibleComponent.class, "shrinkPaddingBottom_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PaneFooter> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PaneFooter.class) {
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

            public Common$FlexibleComponent getComponents(int i) {
                return this.components_.get(i);
            }

            public int getComponentsCount() {
                return this.components_.size();
            }

            public List<Common$FlexibleComponent> getComponentsList() {
                return this.components_;
            }

            public InterfaceC6943w getComponentsOrBuilder(int i) {
                return this.components_.get(i);
            }

            public List<? extends InterfaceC6943w> getComponentsOrBuilderList() {
                return this.components_;
            }

            public EnumC6616b getContainerType() {
                EnumC6616b enumC6616bForNumber = EnumC6616b.forNumber(this.containerType_);
                return enumC6616bForNumber == null ? EnumC6616b.UNRECOGNIZED : enumC6616bForNumber;
            }

            public int getContainerTypeValue() {
                return this.containerType_;
            }

            public EnumC6614b getFadeType() {
                EnumC6614b enumC6614bForNumber = EnumC6614b.forNumber(this.fadeType_);
                return enumC6614bForNumber == null ? EnumC6614b.UNRECOGNIZED : enumC6614bForNumber;
            }

            public int getFadeTypeValue() {
                return this.fadeType_;
            }

            public boolean getShrinkPaddingBottom() {
                return this.shrinkPaddingBottom_;
            }

            public static C6613a newBuilder(PaneFooter paneFooter) {
                return DEFAULT_INSTANCE.createBuilder(paneFooter);
            }

            public static PaneFooter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneFooter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PaneFooter parseFrom(ByteString byteString) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                common$FlexibleComponent.getClass();
                ensureComponentsIsMutable();
                this.components_.add(i, common$FlexibleComponent);
            }

            public static PaneFooter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PaneFooter parseFrom(byte[] bArr) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PaneFooter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PaneFooter parseFrom(InputStream inputStream) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneFooter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneFooter parseFrom(CodedInputStream codedInputStream) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PaneFooter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneFooter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$a */
        public static final class C6615a extends GeneratedMessageLite.Builder<Rendering, C6615a> implements MessageLiteOrBuilder {
            public C6615a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$b */
        public enum EnumC6616b implements Internal.EnumLite {
            DEFAULT(0),
            FULL_WIDTH(1),
            UNRECOGNIZED(-1);

            public static final int DEFAULT_VALUE = 0;
            public static final int FULL_WIDTH_VALUE = 1;

            /* renamed from: b */
            public static final a f2368b = new a();

            /* renamed from: a */
            public final int f2370a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6616b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6616b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2371a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6616b.forNumber(i) != null;
                }
            }

            EnumC6616b(int i) {
                this.f2370a = i;
            }

            public static EnumC6616b forNumber(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i != 1) {
                    return null;
                }
                return FULL_WIDTH;
            }

            public static Internal.EnumLiteMap<EnumC6616b> internalGetValueMap() {
                return f2368b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2371a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2370a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6616b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$Rendering$c */
        public enum EnumC6617c {
            DEFAULT_LAYOUT(1),
            LAYOUT_NOT_SET(0);


            /* renamed from: a */
            public final int f2373a;

            EnumC6617c(int i) {
                this.f2373a = i;
            }

            public static EnumC6617c forNumber(int i) {
                if (i == 0) {
                    return LAYOUT_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return DEFAULT_LAYOUT;
            }

            public int getNumber() {
                return this.f2373a;
            }

            @Deprecated
            public static EnumC6617c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearDefaultLayout() {
            if (this.layoutCase_ == 1) {
                this.layoutCase_ = 0;
                this.layout_ = null;
            }
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLayout() {
            this.layoutCase_ = 0;
            this.layout_ = null;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDefaultLayout(Layout.Default r4) {
            r4.getClass();
            if (this.layoutCase_ != 1 || this.layout_ == Layout.Default.getDefaultInstance()) {
                this.layout_ = r4;
            } else {
                this.layout_ = Layout.Default.newBuilder((Layout.Default) this.layout_).mergeFrom((Layout.Default.C6610a) r4).buildPartial();
            }
            this.layoutCase_ = 1;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6609a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6615a newBuilder() {
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

        private void setBackgroundDisplayMode(EnumC6923m enumC6923m) {
            this.backgroundDisplayMode_ = enumC6923m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        private void setDefaultLayout(Layout.Default r1) {
            r1.getClass();
            this.layout_ = r1;
            this.layoutCase_ = 1;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6615a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003\f", new Object[]{"layout_", "layoutCase_", "bitField0_", Layout.Default.class, "events_", "backgroundDisplayMode_"});
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

        public EnumC6923m getBackgroundDisplayMode() {
            EnumC6923m enumC6923mForNumber = EnumC6923m.forNumber(this.backgroundDisplayMode_);
            return enumC6923mForNumber == null ? EnumC6923m.UNRECOGNIZED : enumC6923mForNumber;
        }

        public int getBackgroundDisplayModeValue() {
            return this.backgroundDisplayMode_;
        }

        public Layout.Default getDefaultLayout() {
            return this.layoutCase_ == 1 ? (Layout.Default) this.layout_ : Layout.Default.getDefaultInstance();
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public EnumC6617c getLayoutCase() {
            return EnumC6617c.forNumber(this.layoutCase_);
        }

        public boolean hasDefaultLayout() {
            return this.layoutCase_ == 1;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6615a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane$a */
    public static final class C6618a extends GeneratedMessageLite.Builder<FlexiblePaneOuterClass$FlexiblePane, C6618a> implements MessageLiteOrBuilder {
        public C6618a() {
            super(FlexiblePaneOuterClass$FlexiblePane.DEFAULT_INSTANCE);
        }
    }

    static {
        FlexiblePaneOuterClass$FlexiblePane flexiblePaneOuterClass$FlexiblePane = new FlexiblePaneOuterClass$FlexiblePane();
        DEFAULT_INSTANCE = flexiblePaneOuterClass$FlexiblePane;
        GeneratedMessageLite.registerDefaultInstance(FlexiblePaneOuterClass$FlexiblePane.class, flexiblePaneOuterClass$FlexiblePane);
    }

    private FlexiblePaneOuterClass$FlexiblePane() {
    }

    public static FlexiblePaneOuterClass$FlexiblePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6618a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseDelimitedFrom(InputStream inputStream) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(ByteBuffer byteBuffer) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FlexiblePaneOuterClass$FlexiblePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6910f0.f2555a[methodToInvoke.ordinal()]) {
            case 1:
                return new FlexiblePaneOuterClass$FlexiblePane();
            case 2:
                return new C6618a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FlexiblePaneOuterClass$FlexiblePane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FlexiblePaneOuterClass$FlexiblePane.class) {
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

    public static C6618a newBuilder(FlexiblePaneOuterClass$FlexiblePane flexiblePaneOuterClass$FlexiblePane) {
        return DEFAULT_INSTANCE.createBuilder(flexiblePaneOuterClass$FlexiblePane);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(ByteString byteString) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(byte[] bArr) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(InputStream inputStream) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(CodedInputStream codedInputStream) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FlexiblePaneOuterClass$FlexiblePane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FlexiblePaneOuterClass$FlexiblePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
