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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes24.dex */
public final class VariableHeightButtonPaneOuterClass$VariableHeightButtonPane extends GeneratedMessageLite<VariableHeightButtonPaneOuterClass$VariableHeightButtonPane, C6893a> implements MessageLiteOrBuilder {
    private static final VariableHeightButtonPaneOuterClass$VariableHeightButtonPane DEFAULT_INSTANCE;
    private static volatile Parser<VariableHeightButtonPaneOuterClass$VariableHeightButtonPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6877b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int PRIMARY_BUTTON_TAP_FIELD_NUMBER = 1;
        public static final int PRIMARY_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        public static final int SECONDARY_DISCLAIMER_TAP_FIELD_NUMBER = 5;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6870a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$ExitAction$a */
            public static final class C6870a extends GeneratedMessageLite.Builder<ExitAction, C6870a> implements MessageLiteOrBuilder {
                public C6870a() {
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

            public static C6870a newBuilder() {
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
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6870a();
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

            public static C6870a newBuilder(ExitAction exitAction) {
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

        public static final class PrimaryButtonTapAction extends GeneratedMessageLite<PrimaryButtonTapAction, C6872a> implements MessageLiteOrBuilder {
            private static final PrimaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<PrimaryButtonTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6871a> implements MessageLiteOrBuilder {
                private static final Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private String inputId_ = "";
                private String value_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$PrimaryButtonTapAction$Response$a */
                public static final class C6871a extends GeneratedMessageLite.Builder<Response, C6871a> implements MessageLiteOrBuilder {
                    public C6871a() {
                        super(Response.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Response response = new Response();
                    DEFAULT_INSTANCE = response;
                    GeneratedMessageLite.registerDefaultInstance(Response.class, response);
                }

                private Response() {
                }

                private void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                private void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6871a newBuilder() {
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

                private void setInputId(String str) {
                    str.getClass();
                    this.inputId_ = str;
                }

                private void setInputIdBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.inputId_ = byteString.toStringUtf8();
                }

                private void setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                }

                private void setValueBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6871a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"inputId_", "value_"});
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

                public String getInputId() {
                    return this.inputId_;
                }

                public ByteString getInputIdBytes() {
                    return ByteString.copyFromUtf8(this.inputId_);
                }

                public String getValue() {
                    return this.value_;
                }

                public ByteString getValueBytes() {
                    return ByteString.copyFromUtf8(this.value_);
                }

                public static C6871a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$PrimaryButtonTapAction$a */
            public static final class C6872a extends GeneratedMessageLite.Builder<PrimaryButtonTapAction, C6872a> implements MessageLiteOrBuilder {
                public C6872a() {
                    super(PrimaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                PrimaryButtonTapAction primaryButtonTapAction = new PrimaryButtonTapAction();
                DEFAULT_INSTANCE = primaryButtonTapAction;
                GeneratedMessageLite.registerDefaultInstance(PrimaryButtonTapAction.class, primaryButtonTapAction);
            }

            private PrimaryButtonTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static PrimaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6871a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6872a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PrimaryButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PrimaryButtonTapAction> parser() {
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
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PrimaryButtonTapAction();
                    case 2:
                        return new C6872a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PrimaryButtonTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PrimaryButtonTapAction.class) {
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

            public static C6872a newBuilder(PrimaryButtonTapAction primaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(primaryButtonTapAction);
            }

            public static PrimaryButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PrimaryButtonTapAction parseFrom(ByteString byteString) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PrimaryButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PrimaryButtonTapAction parseFrom(byte[] bArr) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PrimaryButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PrimaryButtonTapAction parseFrom(InputStream inputStream) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PrimaryButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PrimaryDisclaimerTapAction extends GeneratedMessageLite<PrimaryDisclaimerTapAction, C6873a> implements MessageLiteOrBuilder {
            private static final PrimaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<PrimaryDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$PrimaryDisclaimerTapAction$a */
            public static final class C6873a extends GeneratedMessageLite.Builder<PrimaryDisclaimerTapAction, C6873a> implements MessageLiteOrBuilder {
                public C6873a() {
                    super(PrimaryDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                PrimaryDisclaimerTapAction primaryDisclaimerTapAction = new PrimaryDisclaimerTapAction();
                DEFAULT_INSTANCE = primaryDisclaimerTapAction;
                GeneratedMessageLite.registerDefaultInstance(PrimaryDisclaimerTapAction.class, primaryDisclaimerTapAction);
            }

            private PrimaryDisclaimerTapAction() {
            }

            public static PrimaryDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6873a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PrimaryDisclaimerTapAction parseDelimitedFrom(InputStream inputStream) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryDisclaimerTapAction parseFrom(ByteBuffer byteBuffer) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PrimaryDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PrimaryDisclaimerTapAction();
                    case 2:
                        return new C6873a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PrimaryDisclaimerTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PrimaryDisclaimerTapAction.class) {
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

            public static C6873a newBuilder(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(primaryDisclaimerTapAction);
            }

            public static PrimaryDisclaimerTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryDisclaimerTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PrimaryDisclaimerTapAction parseFrom(ByteString byteString) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PrimaryDisclaimerTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PrimaryDisclaimerTapAction parseFrom(byte[] bArr) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PrimaryDisclaimerTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PrimaryDisclaimerTapAction parseFrom(InputStream inputStream) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryDisclaimerTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryDisclaimerTapAction parseFrom(CodedInputStream codedInputStream) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PrimaryDisclaimerTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6874a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6874a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6874a> implements MessageLiteOrBuilder {
                public C6874a() {
                    super(SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SecondaryButtonTapAction secondaryButtonTapAction = new SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                GeneratedMessageLite.registerDefaultInstance(SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6874a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SecondaryButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6874a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SecondaryButtonTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SecondaryButtonTapAction.class) {
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

            public static C6874a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static SecondaryButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(ByteString byteString) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SecondaryButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SecondaryButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(InputStream inputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SecondaryButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryDisclaimerTapAction extends GeneratedMessageLite<SecondaryDisclaimerTapAction, C6875a> implements MessageLiteOrBuilder {
            private static final SecondaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$SecondaryDisclaimerTapAction$a */
            public static final class C6875a extends GeneratedMessageLite.Builder<SecondaryDisclaimerTapAction, C6875a> implements MessageLiteOrBuilder {
                public C6875a() {
                    super(SecondaryDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SecondaryDisclaimerTapAction secondaryDisclaimerTapAction = new SecondaryDisclaimerTapAction();
                DEFAULT_INSTANCE = secondaryDisclaimerTapAction;
                GeneratedMessageLite.registerDefaultInstance(SecondaryDisclaimerTapAction.class, secondaryDisclaimerTapAction);
            }

            private SecondaryDisclaimerTapAction() {
            }

            public static SecondaryDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6875a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SecondaryDisclaimerTapAction parseDelimitedFrom(InputStream inputStream) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryDisclaimerTapAction parseFrom(ByteBuffer byteBuffer) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SecondaryDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryDisclaimerTapAction();
                    case 2:
                        return new C6875a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SecondaryDisclaimerTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SecondaryDisclaimerTapAction.class) {
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

            public static C6875a newBuilder(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryDisclaimerTapAction);
            }

            public static SecondaryDisclaimerTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryDisclaimerTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SecondaryDisclaimerTapAction parseFrom(ByteString byteString) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SecondaryDisclaimerTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SecondaryDisclaimerTapAction parseFrom(byte[] bArr) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SecondaryDisclaimerTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SecondaryDisclaimerTapAction parseFrom(InputStream inputStream) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryDisclaimerTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryDisclaimerTapAction parseFrom(CodedInputStream codedInputStream) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SecondaryDisclaimerTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$a */
        public enum EnumC6876a {
            PRIMARY_BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            PRIMARY_DISCLAIMER_TAP(4),
            SECONDARY_DISCLAIMER_TAP(5),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2506a;

            EnumC6876a(int i) {
                this.f2506a = i;
            }

            public static EnumC6876a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return PRIMARY_BUTTON_TAP;
                }
                if (i == 2) {
                    return SECONDARY_BUTTON_TAP;
                }
                if (i == 3) {
                    return EXIT;
                }
                if (i == 4) {
                    return PRIMARY_DISCLAIMER_TAP;
                }
                if (i != 5) {
                    return null;
                }
                return SECONDARY_DISCLAIMER_TAP;
            }

            public int getNumber() {
                return this.f2506a;
            }

            @Deprecated
            public static EnumC6876a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Actions$b */
        public static final class C6877b extends GeneratedMessageLite.Builder<Actions, C6877b> implements MessageLiteOrBuilder {
            public C6877b() {
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

        private void clearExit() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearPrimaryButtonTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearPrimaryDisclaimerTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryDisclaimerTap() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6870a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergePrimaryButtonTap(PrimaryButtonTapAction primaryButtonTapAction) {
            primaryButtonTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == PrimaryButtonTapAction.getDefaultInstance()) {
                this.action_ = primaryButtonTapAction;
            } else {
                this.action_ = PrimaryButtonTapAction.newBuilder((PrimaryButtonTapAction) this.action_).mergeFrom((PrimaryButtonTapAction.C6872a) primaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergePrimaryDisclaimerTap(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            primaryDisclaimerTapAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == PrimaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = primaryDisclaimerTapAction;
            } else {
                this.action_ = PrimaryDisclaimerTapAction.newBuilder((PrimaryDisclaimerTapAction) this.action_).mergeFrom((PrimaryDisclaimerTapAction.C6873a) primaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6874a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryDisclaimerTap(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            secondaryDisclaimerTapAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == SecondaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = secondaryDisclaimerTapAction;
            } else {
                this.action_ = SecondaryDisclaimerTapAction.newBuilder((SecondaryDisclaimerTapAction) this.action_).mergeFrom((SecondaryDisclaimerTapAction.C6875a) secondaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static C6877b newBuilder() {
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

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setPrimaryButtonTap(PrimaryButtonTapAction primaryButtonTapAction) {
            primaryButtonTapAction.getClass();
            this.action_ = primaryButtonTapAction;
            this.actionCase_ = 1;
        }

        private void setPrimaryDisclaimerTap(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            primaryDisclaimerTapAction.getClass();
            this.action_ = primaryDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        private void setSecondaryDisclaimerTap(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            secondaryDisclaimerTapAction.getClass();
            this.action_ = secondaryDisclaimerTapAction;
            this.actionCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6877b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"action_", "actionCase_", PrimaryButtonTapAction.class, SecondaryButtonTapAction.class, ExitAction.class, PrimaryDisclaimerTapAction.class, SecondaryDisclaimerTapAction.class});
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

        public EnumC6876a getActionCase() {
            return EnumC6876a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 3 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public PrimaryButtonTapAction getPrimaryButtonTap() {
            return this.actionCase_ == 1 ? (PrimaryButtonTapAction) this.action_ : PrimaryButtonTapAction.getDefaultInstance();
        }

        public PrimaryDisclaimerTapAction getPrimaryDisclaimerTap() {
            return this.actionCase_ == 4 ? (PrimaryDisclaimerTapAction) this.action_ : PrimaryDisclaimerTapAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 2 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public SecondaryDisclaimerTapAction getSecondaryDisclaimerTap() {
            return this.actionCase_ == 5 ? (SecondaryDisclaimerTapAction) this.action_ : SecondaryDisclaimerTapAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public boolean hasPrimaryButtonTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasPrimaryDisclaimerTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 2;
        }

        public boolean hasSecondaryDisclaimerTap() {
            return this.actionCase_ == 5;
        }

        public static C6877b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6889a> implements MessageLiteOrBuilder {
        public static final int AUTO_SUBMIT_FIELD_NUMBER = 11;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 5;
        public static final int DISPLAY_STYLE_FIELD_NUMBER = 16;
        public static final int EVENTS_FIELD_NUMBER = 8;
        public static final int LAYER_HEADER_FIELD_NUMBER = 3;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 6;
        public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
        public static final int PROMPT_FIELD_NUMBER = 9;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
        public static final int SECONDARY_TEXT_CONTENT_FIELD_NUMBER = 13;
        public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
        public static final int TEXT_CONTENT_FIELD_NUMBER = 12;
        public static final int TITLED_ASSET_FIELD_NUMBER = 10;
        private AutoSubmit autoSubmit_;
        private int bitField0_;
        private Object content_;
        private DisclaimerText disclaimerText_;
        private int displayStyle_;
        private Events events_;
        private Common$ButtonContent primaryButton_;
        private Prompt prompt_;
        private Common$ButtonContent secondaryButton_;
        private Object secondaryContent_;
        private int contentCase_ = 0;
        private int secondaryContentCase_ = 0;

        public static final class AutoSubmit extends GeneratedMessageLite<AutoSubmit, C6878a> implements MessageLiteOrBuilder {
            public static final int AFTER_MS_FIELD_NUMBER = 1;
            private static final AutoSubmit DEFAULT_INSTANCE;
            private static volatile Parser<AutoSubmit> PARSER;
            private int afterMs_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$AutoSubmit$a */
            public static final class C6878a extends GeneratedMessageLite.Builder<AutoSubmit, C6878a> implements MessageLiteOrBuilder {
                public C6878a() {
                    super(AutoSubmit.DEFAULT_INSTANCE);
                }
            }

            static {
                AutoSubmit autoSubmit = new AutoSubmit();
                DEFAULT_INSTANCE = autoSubmit;
                GeneratedMessageLite.registerDefaultInstance(AutoSubmit.class, autoSubmit);
            }

            private AutoSubmit() {
            }

            private void clearAfterMs() {
                this.afterMs_ = 0;
            }

            public static AutoSubmit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6878a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AutoSubmit parseDelimitedFrom(InputStream inputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AutoSubmit parseFrom(ByteBuffer byteBuffer) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AutoSubmit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAfterMs(int i) {
                this.afterMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AutoSubmit();
                    case 2:
                        return new C6878a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"afterMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AutoSubmit> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AutoSubmit.class) {
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

            public int getAfterMs() {
                return this.afterMs_;
            }

            public static C6878a newBuilder(AutoSubmit autoSubmit) {
                return DEFAULT_INSTANCE.createBuilder(autoSubmit);
            }

            public static AutoSubmit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(ByteString byteString) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AutoSubmit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(byte[] bArr) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AutoSubmit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(InputStream inputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AutoSubmit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(CodedInputStream codedInputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AutoSubmit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DisclaimerText extends GeneratedMessageLite<DisclaimerText, C6883b> implements MessageLiteOrBuilder {
            public static final int ADDITIONAL_ACTIONS_FIELD_NUMBER = 2;
            private static final DisclaimerText DEFAULT_INSTANCE;
            public static final int LIST_CONTENT_FIELD_NUMBER = 4;
            private static volatile Parser<DisclaimerText> PARSER = null;
            public static final int TEXT_CONTENT_FIELD_NUMBER = 3;
            public static final int TEXT_FIELD_NUMBER = 1;
            private int bitField0_;
            private Object content_;
            private Common$AttributedLocalizedString text_;
            private int contentCase_ = 0;
            private MapFieldLite<String, Actions> additionalActions_ = MapFieldLite.emptyMapField();

            public static final class List extends GeneratedMessageLite<List, C6880a> implements MessageLiteOrBuilder {
                private static final List DEFAULT_INSTANCE;
                public static final int ITEMS_FIELD_NUMBER = 1;
                private static volatile Parser<List> PARSER;
                private Internal.ProtobufList<Item> items_ = GeneratedMessageLite.emptyProtobufList();

                public static final class Item extends GeneratedMessageLite<Item, C6879a> implements InterfaceC6881b {
                    private static final Item DEFAULT_INSTANCE;
                    public static final int ICON_FIELD_NUMBER = 1;
                    private static volatile Parser<Item> PARSER = null;
                    public static final int TEXT_FIELD_NUMBER = 2;
                    private int bitField0_;
                    private Common$RenderedAssetAppearance icon_;
                    private Common$TextContent text_;

                    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$List$Item$a */
                    public static final class C6879a extends GeneratedMessageLite.Builder<Item, C6879a> implements InterfaceC6881b {
                        public C6879a() {
                            super(Item.DEFAULT_INSTANCE);
                        }
                    }

                    static {
                        Item item = new Item();
                        DEFAULT_INSTANCE = item;
                        GeneratedMessageLite.registerDefaultInstance(Item.class, item);
                    }

                    private Item() {
                    }

                    private void clearIcon() {
                        this.icon_ = null;
                        this.bitField0_ &= -2;
                    }

                    private void clearText() {
                        this.text_ = null;
                        this.bitField0_ &= -3;
                    }

                    public static Item getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                        common$RenderedAssetAppearance.getClass();
                        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
                        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                            this.icon_ = common$RenderedAssetAppearance;
                        } else {
                            this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                        }
                        this.bitField0_ |= 1;
                    }

                    private void mergeText(Common$TextContent common$TextContent) {
                        common$TextContent.getClass();
                        Common$TextContent common$TextContent2 = this.text_;
                        if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                            this.text_ = common$TextContent;
                        } else {
                            this.text_ = Common$TextContent.newBuilder(this.text_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                        }
                        this.bitField0_ |= 2;
                    }

                    public static C6879a newBuilder() {
                        return DEFAULT_INSTANCE.createBuilder();
                    }

                    public static Item parseDelimitedFrom(InputStream inputStream) {
                        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Item parseFrom(ByteBuffer byteBuffer) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<Item> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                        common$RenderedAssetAppearance.getClass();
                        this.icon_ = common$RenderedAssetAppearance;
                        this.bitField0_ |= 1;
                    }

                    private void setText(Common$TextContent common$TextContent) {
                        common$TextContent.getClass();
                        this.text_ = common$TextContent;
                        this.bitField0_ |= 2;
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new Item();
                            case 2:
                                return new C6879a();
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "icon_", "text_"});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<Item> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (Item.class) {
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

                    public Common$RenderedAssetAppearance getIcon() {
                        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
                    }

                    public Common$TextContent getText() {
                        Common$TextContent common$TextContent = this.text_;
                        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
                    }

                    public boolean hasIcon() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    public boolean hasText() {
                        return (this.bitField0_ & 2) != 0;
                    }

                    public static C6879a newBuilder(Item item) {
                        return DEFAULT_INSTANCE.createBuilder(item);
                    }

                    public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static Item parseFrom(ByteString byteString) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static Item parseFrom(byte[] bArr) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static Item parseFrom(InputStream inputStream) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Item parseFrom(CodedInputStream codedInputStream) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$List$a */
                public static final class C6880a extends GeneratedMessageLite.Builder<List, C6880a> implements MessageLiteOrBuilder {
                    public C6880a() {
                        super(List.DEFAULT_INSTANCE);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$List$b */
                public interface InterfaceC6881b extends MessageLiteOrBuilder {
                }

                static {
                    List list = new List();
                    DEFAULT_INSTANCE = list;
                    GeneratedMessageLite.registerDefaultInstance(List.class, list);
                }

                private List() {
                }

                private void addAllItems(Iterable<? extends Item> iterable) {
                    ensureItemsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (java.util.List) this.items_);
                }

                private void addItems(Item item) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(item);
                }

                private void clearItems() {
                    this.items_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureItemsIsMutable() {
                    Internal.ProtobufList<Item> protobufList = this.items_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static List getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6880a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static List parseDelimitedFrom(InputStream inputStream) {
                    return (List) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static List parseFrom(ByteBuffer byteBuffer) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<List> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeItems(int i) {
                    ensureItemsIsMutable();
                    this.items_.remove(i);
                }

                private void setItems(int i, Item item) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i, item);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new List();
                        case 2:
                            return new C6880a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Item.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<List> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (List.class) {
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

                public Item getItems(int i) {
                    return this.items_.get(i);
                }

                public int getItemsCount() {
                    return this.items_.size();
                }

                public java.util.List<Item> getItemsList() {
                    return this.items_;
                }

                public InterfaceC6881b getItemsOrBuilder(int i) {
                    return this.items_.get(i);
                }

                public java.util.List<? extends InterfaceC6881b> getItemsOrBuilderList() {
                    return this.items_;
                }

                public static C6880a newBuilder(List list) {
                    return DEFAULT_INSTANCE.createBuilder(list);
                }

                public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static List parseFrom(ByteString byteString) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void addItems(int i, Item item) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i, item);
                }

                public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static List parseFrom(byte[] bArr) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static List parseFrom(InputStream inputStream) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static List parseFrom(CodedInputStream codedInputStream) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (List) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$a */
            public static final class C6882a {

                /* renamed from: a */
                public static final MapEntryLite<String, Actions> f2507a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Actions.getDefaultInstance());
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$b */
            public static final class C6883b extends GeneratedMessageLite.Builder<DisclaimerText, C6883b> implements MessageLiteOrBuilder {
                public C6883b() {
                    super(DisclaimerText.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$DisclaimerText$c */
            public enum EnumC6884c {
                TEXT_CONTENT(3),
                LIST_CONTENT(4),
                CONTENT_NOT_SET(0);


                /* renamed from: a */
                public final int f2509a;

                EnumC6884c(int i) {
                    this.f2509a = i;
                }

                public static EnumC6884c forNumber(int i) {
                    if (i == 0) {
                        return CONTENT_NOT_SET;
                    }
                    if (i == 3) {
                        return TEXT_CONTENT;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return LIST_CONTENT;
                }

                public int getNumber() {
                    return this.f2509a;
                }

                @Deprecated
                public static EnumC6884c valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                DisclaimerText disclaimerText = new DisclaimerText();
                DEFAULT_INSTANCE = disclaimerText;
                GeneratedMessageLite.registerDefaultInstance(DisclaimerText.class, disclaimerText);
            }

            private DisclaimerText() {
            }

            private void clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
            }

            private void clearListContent() {
                if (this.contentCase_ == 4) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -2;
            }

            private void clearTextContent() {
                if (this.contentCase_ == 3) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            public static DisclaimerText getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private Map<String, Actions> getMutableAdditionalActionsMap() {
                return internalGetMutableAdditionalActions();
            }

            private MapFieldLite<String, Actions> internalGetAdditionalActions() {
                return this.additionalActions_;
            }

            private MapFieldLite<String, Actions> internalGetMutableAdditionalActions() {
                if (!this.additionalActions_.isMutable()) {
                    this.additionalActions_ = this.additionalActions_.mutableCopy();
                }
                return this.additionalActions_;
            }

            private void mergeListContent(List list) {
                list.getClass();
                if (this.contentCase_ != 4 || this.content_ == List.getDefaultInstance()) {
                    this.content_ = list;
                } else {
                    this.content_ = List.newBuilder((List) this.content_).mergeFrom((List.C6880a) list).buildPartial();
                }
                this.contentCase_ = 4;
            }

            private void mergeText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.text_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.text_ = common$AttributedLocalizedString;
                } else {
                    this.text_ = Common$AttributedLocalizedString.newBuilder(this.text_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeTextContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                if (this.contentCase_ != 3 || this.content_ == Common$TextContent.getDefaultInstance()) {
                    this.content_ = common$TextContent;
                } else {
                    this.content_ = Common$TextContent.newBuilder((Common$TextContent) this.content_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.contentCase_ = 3;
            }

            public static C6883b newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DisclaimerText parseDelimitedFrom(InputStream inputStream) {
                return (DisclaimerText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DisclaimerText parseFrom(ByteBuffer byteBuffer) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DisclaimerText> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setListContent(List list) {
                list.getClass();
                this.content_ = list;
                this.contentCase_ = 4;
            }

            private void setText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.text_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            private void setTextContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.content_ = common$TextContent;
                this.contentCase_ = 3;
            }

            public boolean containsAdditionalActions(String str) {
                str.getClass();
                return internalGetAdditionalActions().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DisclaimerText();
                    case 2:
                        return new C6883b();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဉ\u0000\u00022\u0003<\u0000\u0004<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "text_", "additionalActions_", C6882a.f2507a, Common$TextContent.class, List.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DisclaimerText> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DisclaimerText.class) {
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

            @Deprecated
            public Map<String, Actions> getAdditionalActions() {
                return getAdditionalActionsMap();
            }

            public int getAdditionalActionsCount() {
                return internalGetAdditionalActions().size();
            }

            public Map<String, Actions> getAdditionalActionsMap() {
                return Collections.unmodifiableMap(internalGetAdditionalActions());
            }

            public Actions getAdditionalActionsOrDefault(String str, Actions actions) {
                str.getClass();
                MapFieldLite<String, Actions> mapFieldLiteInternalGetAdditionalActions = internalGetAdditionalActions();
                return mapFieldLiteInternalGetAdditionalActions.containsKey(str) ? mapFieldLiteInternalGetAdditionalActions.get(str) : actions;
            }

            public Actions getAdditionalActionsOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, Actions> mapFieldLiteInternalGetAdditionalActions = internalGetAdditionalActions();
                if (mapFieldLiteInternalGetAdditionalActions.containsKey(str)) {
                    return mapFieldLiteInternalGetAdditionalActions.get(str);
                }
                throw new IllegalArgumentException();
            }

            public EnumC6884c getContentCase() {
                return EnumC6884c.forNumber(this.contentCase_);
            }

            public List getListContent() {
                return this.contentCase_ == 4 ? (List) this.content_ : List.getDefaultInstance();
            }

            public Common$AttributedLocalizedString getText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.text_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$TextContent getTextContent() {
                return this.contentCase_ == 3 ? (Common$TextContent) this.content_ : Common$TextContent.getDefaultInstance();
            }

            public boolean hasListContent() {
                return this.contentCase_ == 4;
            }

            public boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTextContent() {
                return this.contentCase_ == 3;
            }

            public static C6883b newBuilder(DisclaimerText disclaimerText) {
                return DEFAULT_INSTANCE.createBuilder(disclaimerText);
            }

            public static DisclaimerText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DisclaimerText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DisclaimerText parseFrom(ByteString byteString) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DisclaimerText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DisclaimerText parseFrom(byte[] bArr) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DisclaimerText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DisclaimerText parseFrom(InputStream inputStream) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DisclaimerText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DisclaimerText parseFrom(CodedInputStream codedInputStream) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DisclaimerText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6885a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_RECEIVE_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onReceive_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$Events$a */
            public static final class C6885a extends GeneratedMessageLite.Builder<Events, C6885a> implements MessageLiteOrBuilder {
                public C6885a() {
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

            private void addAllOnReceive(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnReceiveIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onReceive_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnReceive(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnReceive() {
                this.onReceive_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnReceiveIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onReceive_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onReceive_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6885a newBuilder() {
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

            private void removeOnReceive(int i) {
                ensureOnReceiveIsMutable();
                this.onReceive_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnReceive(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6885a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onReceive_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnReceive(int i) {
                return this.onReceive_.get(i);
            }

            public int getOnReceiveCount() {
                return this.onReceive_.size();
            }

            public List<Common$SDKEvent> getOnReceiveList() {
                return this.onReceive_;
            }

            public InterfaceC6691M getOnReceiveOrBuilder(int i) {
                return this.onReceive_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnReceiveOrBuilderList() {
                return this.onReceive_;
            }

            public static C6885a newBuilder(Events events) {
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

            private void addOnReceive(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.add(i, common$SDKEvent);
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

        public static final class LayerHeader extends GeneratedMessageLite<LayerHeader, C6886a> implements MessageLiteOrBuilder {
            public static final int CLIENT_LOGO_FIELD_NUMBER = 1;
            private static final LayerHeader DEFAULT_INSTANCE;
            private static volatile Parser<LayerHeader> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 2;
            private int bitField0_;
            private Common$RenderedAssetAppearance clientLogo_;
            private Common$AttributedLocalizedString text_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$LayerHeader$a */
            public static final class C6886a extends GeneratedMessageLite.Builder<LayerHeader, C6886a> implements MessageLiteOrBuilder {
                public C6886a() {
                    super(LayerHeader.DEFAULT_INSTANCE);
                }
            }

            static {
                LayerHeader layerHeader = new LayerHeader();
                DEFAULT_INSTANCE = layerHeader;
                GeneratedMessageLite.registerDefaultInstance(LayerHeader.class, layerHeader);
            }

            private LayerHeader() {
            }

            private void clearClientLogo() {
                this.clientLogo_ = null;
                this.bitField0_ &= -2;
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -3;
            }

            public static LayerHeader getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeClientLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogo_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.clientLogo_ = common$RenderedAssetAppearance;
                } else {
                    this.clientLogo_ = Common$RenderedAssetAppearance.newBuilder(this.clientLogo_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.text_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.text_ = common$AttributedLocalizedString;
                } else {
                    this.text_ = Common$AttributedLocalizedString.newBuilder(this.text_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6886a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LayerHeader parseDelimitedFrom(InputStream inputStream) {
                return (LayerHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LayerHeader parseFrom(ByteBuffer byteBuffer) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LayerHeader> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setClientLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.clientLogo_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.text_ = common$AttributedLocalizedString;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LayerHeader();
                    case 2:
                        return new C6886a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "clientLogo_", "text_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LayerHeader> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LayerHeader.class) {
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

            public Common$RenderedAssetAppearance getClientLogo() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogo_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$AttributedLocalizedString getText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.text_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasClientLogo() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasText() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6886a newBuilder(LayerHeader layerHeader) {
                return DEFAULT_INSTANCE.createBuilder(layerHeader);
            }

            public static LayerHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LayerHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LayerHeader parseFrom(ByteString byteString) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LayerHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LayerHeader parseFrom(byte[] bArr) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LayerHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LayerHeader parseFrom(InputStream inputStream) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LayerHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LayerHeader parseFrom(CodedInputStream codedInputStream) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LayerHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LayerHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Prompt extends GeneratedMessageLite<Prompt, C6887a> implements MessageLiteOrBuilder {
            private static final Prompt DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            private static volatile Parser<Prompt> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 1;
            private int bitField0_;
            private Common$TextInput input_;
            private Common$AttributedLocalizedString text_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$Prompt$a */
            public static final class C6887a extends GeneratedMessageLite.Builder<Prompt, C6887a> implements MessageLiteOrBuilder {
                public C6887a() {
                    super(Prompt.DEFAULT_INSTANCE);
                }
            }

            static {
                Prompt prompt = new Prompt();
                DEFAULT_INSTANCE = prompt;
                GeneratedMessageLite.registerDefaultInstance(Prompt.class, prompt);
            }

            private Prompt() {
            }

            private void clearInput() {
                this.input_ = null;
                this.bitField0_ &= -3;
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -2;
            }

            public static Prompt getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                Common$TextInput common$TextInput2 = this.input_;
                if (common$TextInput2 == null || common$TextInput2 == Common$TextInput.getDefaultInstance()) {
                    this.input_ = common$TextInput;
                } else {
                    this.input_ = Common$TextInput.newBuilder(this.input_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.text_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.text_ = common$AttributedLocalizedString;
                } else {
                    this.text_ = Common$AttributedLocalizedString.newBuilder(this.text_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6887a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Prompt parseDelimitedFrom(InputStream inputStream) {
                return (Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prompt parseFrom(ByteBuffer byteBuffer) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Prompt> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                this.input_ = common$TextInput;
                this.bitField0_ |= 2;
            }

            private void setText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.text_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Prompt();
                    case 2:
                        return new C6887a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "input_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Prompt> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Prompt.class) {
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

            public Common$TextInput getInput() {
                Common$TextInput common$TextInput = this.input_;
                return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
            }

            public Common$AttributedLocalizedString getText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.text_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasInput() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6887a newBuilder(Prompt prompt) {
                return DEFAULT_INSTANCE.createBuilder(prompt);
            }

            public static Prompt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prompt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Prompt parseFrom(ByteString byteString) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Prompt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Prompt parseFrom(byte[] bArr) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Prompt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Prompt parseFrom(InputStream inputStream) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prompt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prompt parseFrom(CodedInputStream codedInputStream) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Prompt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TitledAsset extends GeneratedMessageLite<TitledAsset, C6888a> implements MessageLiteOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            private static final TitledAsset DEFAULT_INSTANCE;
            public static final int DISPLAY_SHIMMER_FIELD_NUMBER = 3;
            private static volatile Parser<TitledAsset> PARSER = null;
            public static final int TITLE_FIELD_NUMBER = 1;
            private Common$RenderedAssetAppearance asset_;
            private int bitField0_;
            private boolean displayShimmer_;
            private Common$AttributedLocalizedString title_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$TitledAsset$a */
            public static final class C6888a extends GeneratedMessageLite.Builder<TitledAsset, C6888a> implements MessageLiteOrBuilder {
                public C6888a() {
                    super(TitledAsset.DEFAULT_INSTANCE);
                }
            }

            static {
                TitledAsset titledAsset = new TitledAsset();
                DEFAULT_INSTANCE = titledAsset;
                GeneratedMessageLite.registerDefaultInstance(TitledAsset.class, titledAsset);
            }

            private TitledAsset() {
            }

            private void clearAsset() {
                this.asset_ = null;
                this.bitField0_ &= -3;
            }

            private void clearDisplayShimmer() {
                this.displayShimmer_ = false;
            }

            private void clearTitle() {
                this.title_ = null;
                this.bitField0_ &= -2;
            }

            public static TitledAsset getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.asset_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.asset_ = common$RenderedAssetAppearance;
                } else {
                    this.asset_ = Common$RenderedAssetAppearance.newBuilder(this.asset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeTitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.title_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.title_ = common$AttributedLocalizedString;
                } else {
                    this.title_ = Common$AttributedLocalizedString.newBuilder(this.title_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6888a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TitledAsset parseDelimitedFrom(InputStream inputStream) {
                return (TitledAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TitledAsset parseFrom(ByteBuffer byteBuffer) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TitledAsset> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.asset_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 2;
            }

            private void setDisplayShimmer(boolean z) {
                this.displayShimmer_ = z;
            }

            private void setTitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.title_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TitledAsset();
                    case 2:
                        return new C6888a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "title_", "asset_", "displayShimmer_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TitledAsset> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TitledAsset.class) {
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

            public Common$RenderedAssetAppearance getAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.asset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public boolean getDisplayShimmer() {
                return this.displayShimmer_;
            }

            public Common$AttributedLocalizedString getTitle() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.title_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasAsset() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6888a newBuilder(TitledAsset titledAsset) {
                return DEFAULT_INSTANCE.createBuilder(titledAsset);
            }

            public static TitledAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TitledAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TitledAsset parseFrom(ByteString byteString) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TitledAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TitledAsset parseFrom(byte[] bArr) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TitledAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TitledAsset parseFrom(InputStream inputStream) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TitledAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TitledAsset parseFrom(CodedInputStream codedInputStream) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TitledAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TitledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$a */
        public static final class C6889a extends GeneratedMessageLite.Builder<Rendering, C6889a> implements MessageLiteOrBuilder {
            public C6889a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$b */
        public enum EnumC6890b {
            PRIMARY_TEXT(1),
            LAYER_HEADER(3),
            TITLED_ASSET(10),
            TEXT_CONTENT(12),
            CONTENT_NOT_SET(0);


            /* renamed from: a */
            public final int f2511a;

            EnumC6890b(int i) {
                this.f2511a = i;
            }

            public static EnumC6890b forNumber(int i) {
                if (i == 0) {
                    return CONTENT_NOT_SET;
                }
                if (i == 1) {
                    return PRIMARY_TEXT;
                }
                if (i == 3) {
                    return LAYER_HEADER;
                }
                if (i == 10) {
                    return TITLED_ASSET;
                }
                if (i != 12) {
                    return null;
                }
                return TEXT_CONTENT;
            }

            public int getNumber() {
                return this.f2511a;
            }

            @Deprecated
            public static EnumC6890b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$c */
        public enum EnumC6891c implements Internal.EnumLite {
            DISPLAY_STYLE_UNKNOWN(0),
            DISPLAY_STYLE_DEFAULT(1),
            DISPLAY_STYLE_LAYER(2),
            UNRECOGNIZED(-1);

            public static final int DISPLAY_STYLE_DEFAULT_VALUE = 1;
            public static final int DISPLAY_STYLE_LAYER_VALUE = 2;
            public static final int DISPLAY_STYLE_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2512b = new a();

            /* renamed from: a */
            public final int f2514a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6891c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6891c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2515a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6891c.forNumber(i) != null;
                }
            }

            EnumC6891c(int i) {
                this.f2514a = i;
            }

            public static EnumC6891c forNumber(int i) {
                if (i == 0) {
                    return DISPLAY_STYLE_UNKNOWN;
                }
                if (i == 1) {
                    return DISPLAY_STYLE_DEFAULT;
                }
                if (i != 2) {
                    return null;
                }
                return DISPLAY_STYLE_LAYER;
            }

            public static Internal.EnumLiteMap<EnumC6891c> internalGetValueMap() {
                return f2512b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2515a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2514a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6891c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$Rendering$d */
        public enum EnumC6892d {
            SECONDARY_TEXT(4),
            SECONDARY_TEXT_CONTENT(13),
            SECONDARYCONTENT_NOT_SET(0);


            /* renamed from: a */
            public final int f2517a;

            EnumC6892d(int i) {
                this.f2517a = i;
            }

            public static EnumC6892d forNumber(int i) {
                if (i == 0) {
                    return SECONDARYCONTENT_NOT_SET;
                }
                if (i == 4) {
                    return SECONDARY_TEXT;
                }
                if (i != 13) {
                    return null;
                }
                return SECONDARY_TEXT_CONTENT;
            }

            public int getNumber() {
                return this.f2517a;
            }

            @Deprecated
            public static EnumC6892d valueOf(int i) {
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

        private void clearAutoSubmit() {
            this.autoSubmit_ = null;
            this.bitField0_ &= -17;
        }

        private void clearContent() {
            this.contentCase_ = 0;
            this.content_ = null;
        }

        private void clearDisclaimerText() {
            this.disclaimerText_ = null;
            this.bitField0_ &= -3;
        }

        private void clearDisplayStyle() {
            this.displayStyle_ = 0;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -33;
        }

        private void clearLayerHeader() {
            if (this.contentCase_ == 3) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        private void clearPrimaryButton() {
            this.primaryButton_ = null;
            this.bitField0_ &= -5;
        }

        private void clearPrimaryText() {
            if (this.contentCase_ == 1) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        private void clearPrompt() {
            this.prompt_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSecondaryContent() {
            this.secondaryContentCase_ = 0;
            this.secondaryContent_ = null;
        }

        private void clearSecondaryText() {
            if (this.secondaryContentCase_ == 4) {
                this.secondaryContentCase_ = 0;
                this.secondaryContent_ = null;
            }
        }

        private void clearSecondaryTextContent() {
            if (this.secondaryContentCase_ == 13) {
                this.secondaryContentCase_ = 0;
                this.secondaryContent_ = null;
            }
        }

        private void clearTextContent() {
            if (this.contentCase_ == 12) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        private void clearTitledAsset() {
            if (this.contentCase_ == 10) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAutoSubmit(AutoSubmit autoSubmit) {
            autoSubmit.getClass();
            AutoSubmit autoSubmit2 = this.autoSubmit_;
            if (autoSubmit2 == null || autoSubmit2 == AutoSubmit.getDefaultInstance()) {
                this.autoSubmit_ = autoSubmit;
            } else {
                this.autoSubmit_ = AutoSubmit.newBuilder(this.autoSubmit_).mergeFrom((AutoSubmit.C6878a) autoSubmit).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            DisclaimerText disclaimerText2 = this.disclaimerText_;
            if (disclaimerText2 == null || disclaimerText2 == DisclaimerText.getDefaultInstance()) {
                this.disclaimerText_ = disclaimerText;
            } else {
                this.disclaimerText_ = DisclaimerText.newBuilder(this.disclaimerText_).mergeFrom((DisclaimerText.C6883b) disclaimerText).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6885a) events).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeLayerHeader(LayerHeader layerHeader) {
            layerHeader.getClass();
            if (this.contentCase_ != 3 || this.content_ == LayerHeader.getDefaultInstance()) {
                this.content_ = layerHeader;
            } else {
                this.content_ = LayerHeader.newBuilder((LayerHeader) this.content_).mergeFrom((LayerHeader.C6886a) layerHeader).buildPartial();
            }
            this.contentCase_ = 3;
        }

        private void mergePrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.primaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.primaryButton_ = common$ButtonContent;
            } else {
                this.primaryButton_ = Common$ButtonContent.newBuilder(this.primaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergePrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            if (this.contentCase_ != 1 || this.content_ == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = Common$AttributedLocalizedString.newBuilder((Common$AttributedLocalizedString) this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.contentCase_ = 1;
        }

        private void mergePrompt(Prompt prompt) {
            prompt.getClass();
            Prompt prompt2 = this.prompt_;
            if (prompt2 == null || prompt2 == Prompt.getDefaultInstance()) {
                this.prompt_ = prompt;
            } else {
                this.prompt_ = Prompt.newBuilder(this.prompt_).mergeFrom((Prompt.C6887a) prompt).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.secondaryButton_ = common$ButtonContent;
            } else {
                this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            if (this.secondaryContentCase_ != 4 || this.secondaryContent_ == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.secondaryContent_ = common$AttributedLocalizedString;
            } else {
                this.secondaryContent_ = Common$AttributedLocalizedString.newBuilder((Common$AttributedLocalizedString) this.secondaryContent_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.secondaryContentCase_ = 4;
        }

        private void mergeSecondaryTextContent(Common$TextContent common$TextContent) {
            common$TextContent.getClass();
            if (this.secondaryContentCase_ != 13 || this.secondaryContent_ == Common$TextContent.getDefaultInstance()) {
                this.secondaryContent_ = common$TextContent;
            } else {
                this.secondaryContent_ = Common$TextContent.newBuilder((Common$TextContent) this.secondaryContent_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
            }
            this.secondaryContentCase_ = 13;
        }

        private void mergeTextContent(Common$TextContent common$TextContent) {
            common$TextContent.getClass();
            if (this.contentCase_ != 12 || this.content_ == Common$TextContent.getDefaultInstance()) {
                this.content_ = common$TextContent;
            } else {
                this.content_ = Common$TextContent.newBuilder((Common$TextContent) this.content_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
            }
            this.contentCase_ = 12;
        }

        private void mergeTitledAsset(TitledAsset titledAsset) {
            titledAsset.getClass();
            if (this.contentCase_ != 10 || this.content_ == TitledAsset.getDefaultInstance()) {
                this.content_ = titledAsset;
            } else {
                this.content_ = TitledAsset.newBuilder((TitledAsset) this.content_).mergeFrom((TitledAsset.C6888a) titledAsset).buildPartial();
            }
            this.contentCase_ = 10;
        }

        public static C6889a newBuilder() {
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

        private void setAutoSubmit(AutoSubmit autoSubmit) {
            autoSubmit.getClass();
            this.autoSubmit_ = autoSubmit;
            this.bitField0_ |= 16;
        }

        private void setDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            this.disclaimerText_ = disclaimerText;
            this.bitField0_ |= 2;
        }

        private void setDisplayStyle(EnumC6891c enumC6891c) {
            this.displayStyle_ = enumC6891c.getNumber();
        }

        private void setDisplayStyleValue(int i) {
            this.displayStyle_ = i;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 32;
        }

        private void setLayerHeader(LayerHeader layerHeader) {
            layerHeader.getClass();
            this.content_ = layerHeader;
            this.contentCase_ = 3;
        }

        private void setPrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.primaryButton_ = common$ButtonContent;
            this.bitField0_ |= 4;
        }

        private void setPrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
            this.contentCase_ = 1;
        }

        private void setPrompt(Prompt prompt) {
            prompt.getClass();
            this.prompt_ = prompt;
            this.bitField0_ |= 1;
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.secondaryContent_ = common$AttributedLocalizedString;
            this.secondaryContentCase_ = 4;
        }

        private void setSecondaryTextContent(Common$TextContent common$TextContent) {
            common$TextContent.getClass();
            this.secondaryContent_ = common$TextContent;
            this.secondaryContentCase_ = 13;
        }

        private void setTextContent(Common$TextContent common$TextContent) {
            common$TextContent.getClass();
            this.content_ = common$TextContent;
            this.contentCase_ = 12;
        }

        private void setTitledAsset(TitledAsset titledAsset) {
            titledAsset.getClass();
            this.content_ = titledAsset;
            this.contentCase_ = 10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6889a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0002\u0001\u0001\u0010\r\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0001\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0005\tဉ\u0000\n<\u0000\u000bဉ\u0004\f<\u0000\r<\u0001\u0010\f", new Object[]{"content_", "contentCase_", "secondaryContent_", "secondaryContentCase_", "bitField0_", Common$AttributedLocalizedString.class, LayerHeader.class, Common$AttributedLocalizedString.class, "disclaimerText_", "primaryButton_", "secondaryButton_", "events_", "prompt_", TitledAsset.class, "autoSubmit_", Common$TextContent.class, Common$TextContent.class, "displayStyle_"});
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

        public AutoSubmit getAutoSubmit() {
            AutoSubmit autoSubmit = this.autoSubmit_;
            return autoSubmit == null ? AutoSubmit.getDefaultInstance() : autoSubmit;
        }

        public EnumC6890b getContentCase() {
            return EnumC6890b.forNumber(this.contentCase_);
        }

        public DisclaimerText getDisclaimerText() {
            DisclaimerText disclaimerText = this.disclaimerText_;
            return disclaimerText == null ? DisclaimerText.getDefaultInstance() : disclaimerText;
        }

        public EnumC6891c getDisplayStyle() {
            EnumC6891c enumC6891cForNumber = EnumC6891c.forNumber(this.displayStyle_);
            return enumC6891cForNumber == null ? EnumC6891c.UNRECOGNIZED : enumC6891cForNumber;
        }

        public int getDisplayStyleValue() {
            return this.displayStyle_;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public LayerHeader getLayerHeader() {
            return this.contentCase_ == 3 ? (LayerHeader) this.content_ : LayerHeader.getDefaultInstance();
        }

        public Common$ButtonContent getPrimaryButton() {
            Common$ButtonContent common$ButtonContent = this.primaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getPrimaryText() {
            return this.contentCase_ == 1 ? (Common$AttributedLocalizedString) this.content_ : Common$AttributedLocalizedString.getDefaultInstance();
        }

        public Prompt getPrompt() {
            Prompt prompt = this.prompt_;
            return prompt == null ? Prompt.getDefaultInstance() : prompt;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public EnumC6892d getSecondaryContentCase() {
            return EnumC6892d.forNumber(this.secondaryContentCase_);
        }

        public Common$AttributedLocalizedString getSecondaryText() {
            return this.secondaryContentCase_ == 4 ? (Common$AttributedLocalizedString) this.secondaryContent_ : Common$AttributedLocalizedString.getDefaultInstance();
        }

        public Common$TextContent getSecondaryTextContent() {
            return this.secondaryContentCase_ == 13 ? (Common$TextContent) this.secondaryContent_ : Common$TextContent.getDefaultInstance();
        }

        public Common$TextContent getTextContent() {
            return this.contentCase_ == 12 ? (Common$TextContent) this.content_ : Common$TextContent.getDefaultInstance();
        }

        public TitledAsset getTitledAsset() {
            return this.contentCase_ == 10 ? (TitledAsset) this.content_ : TitledAsset.getDefaultInstance();
        }

        public boolean hasAutoSubmit() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDisclaimerText() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasLayerHeader() {
            return this.contentCase_ == 3;
        }

        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPrimaryText() {
            return this.contentCase_ == 1;
        }

        public boolean hasPrompt() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSecondaryText() {
            return this.secondaryContentCase_ == 4;
        }

        public boolean hasSecondaryTextContent() {
            return this.secondaryContentCase_ == 13;
        }

        public boolean hasTextContent() {
            return this.contentCase_ == 12;
        }

        public boolean hasTitledAsset() {
            return this.contentCase_ == 10;
        }

        public static C6889a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane$a */
    public static final class C6893a extends GeneratedMessageLite.Builder<VariableHeightButtonPaneOuterClass$VariableHeightButtonPane, C6893a> implements MessageLiteOrBuilder {
        public C6893a() {
            super(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.DEFAULT_INSTANCE);
        }
    }

    static {
        VariableHeightButtonPaneOuterClass$VariableHeightButtonPane variableHeightButtonPaneOuterClass$VariableHeightButtonPane = new VariableHeightButtonPaneOuterClass$VariableHeightButtonPane();
        DEFAULT_INSTANCE = variableHeightButtonPaneOuterClass$VariableHeightButtonPane;
        GeneratedMessageLite.registerDefaultInstance(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.class, variableHeightButtonPaneOuterClass$VariableHeightButtonPane);
    }

    private VariableHeightButtonPaneOuterClass$VariableHeightButtonPane() {
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6893a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseDelimitedFrom(InputStream inputStream) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(ByteBuffer byteBuffer) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VariableHeightButtonPaneOuterClass$VariableHeightButtonPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6948y0.f2619a[methodToInvoke.ordinal()]) {
            case 1:
                return new VariableHeightButtonPaneOuterClass$VariableHeightButtonPane();
            case 2:
                return new C6893a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VariableHeightButtonPaneOuterClass$VariableHeightButtonPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.class) {
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

    public static C6893a newBuilder(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane variableHeightButtonPaneOuterClass$VariableHeightButtonPane) {
        return DEFAULT_INSTANCE.createBuilder(variableHeightButtonPaneOuterClass$VariableHeightButtonPane);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(ByteString byteString) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(byte[] bArr) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(InputStream inputStream) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(CodedInputStream codedInputStream) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VariableHeightButtonPaneOuterClass$VariableHeightButtonPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
