package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class CredentialsPaneOuterClass$CredentialsPane extends GeneratedMessageLite<CredentialsPaneOuterClass$CredentialsPane, C6589a> implements MessageLiteOrBuilder {
    private static final CredentialsPaneOuterClass$CredentialsPane DEFAULT_INSTANCE;
    private static volatile Parser<CredentialsPaneOuterClass$CredentialsPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6582b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, C6575a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$ButtonDisclaimerTapAction$a */
            public static final class C6575a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, C6575a> implements MessageLiteOrBuilder {
                public C6575a() {
                    super(ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonDisclaimerTapAction buttonDisclaimerTapAction = new ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6575a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new C6575a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonDisclaimerTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonDisclaimerTapAction.class) {
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

            public static C6575a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static ButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteString byteString) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonDisclaimerTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(InputStream inputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonTapAction extends GeneratedMessageLite<ButtonTapAction, C6577a> implements MessageLiteOrBuilder {
            private static final ButtonTapAction DEFAULT_INSTANCE;
            public static final int ENCRYPTED_RESPONSE_FIELD_NUMBER = 2;
            private static volatile Parser<ButtonTapAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private Internal.ProtobufList<Response> responses_ = GeneratedMessageLite.emptyProtobufList();
            private String encryptedResponse_ = "";

            public static final class Response extends GeneratedMessageLite<Response, C6576a> implements InterfaceC6578b {
                private static final Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private String inputId_ = "";
                private String value_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$ButtonTapAction$Response$a */
                public static final class C6576a extends GeneratedMessageLite.Builder<Response, C6576a> implements InterfaceC6578b {
                    public C6576a() {
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

                public static C6576a newBuilder() {
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
                    switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6576a();
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

                public static C6576a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$ButtonTapAction$a */
            public static final class C6577a extends GeneratedMessageLite.Builder<ButtonTapAction, C6577a> implements MessageLiteOrBuilder {
                public C6577a() {
                    super(ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$ButtonTapAction$b */
            public interface InterfaceC6578b extends MessageLiteOrBuilder {
            }

            static {
                ButtonTapAction buttonTapAction = new ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            private void addAllResponses(Iterable<? extends Response> iterable) {
                ensureResponsesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.responses_);
            }

            private void addResponses(Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(response);
            }

            private void clearEncryptedResponse() {
                this.encryptedResponse_ = getDefaultInstance().getEncryptedResponse();
            }

            private void clearResponses() {
                this.responses_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                Internal.ProtobufList<Response> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6577a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            private void setEncryptedResponse(String str) {
                str.getClass();
                this.encryptedResponse_ = str;
            }

            private void setEncryptedResponseBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.encryptedResponse_ = byteString.toStringUtf8();
            }

            private void setResponses(int i, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i, response);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTapAction();
                    case 2:
                        return new C6577a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"responses_", Response.class, "encryptedResponse_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonTapAction.class) {
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

            public String getEncryptedResponse() {
                return this.encryptedResponse_;
            }

            public ByteString getEncryptedResponseBytes() {
                return ByteString.copyFromUtf8(this.encryptedResponse_);
            }

            public Response getResponses(int i) {
                return this.responses_.get(i);
            }

            public int getResponsesCount() {
                return this.responses_.size();
            }

            public List<Response> getResponsesList() {
                return this.responses_;
            }

            public InterfaceC6578b getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public List<? extends InterfaceC6578b> getResponsesOrBuilderList() {
                return this.responses_;
            }

            public static C6577a newBuilder(ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static ButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(ByteString byteString) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addResponses(int i, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(i, response);
            }

            public static ButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(byte[] bArr) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(InputStream inputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6579a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$ExitAction$a */
            public static final class C6579a extends GeneratedMessageLite.Builder<ExitAction, C6579a> implements MessageLiteOrBuilder {
                public C6579a() {
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

            public static C6579a newBuilder() {
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
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6579a();
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

            public static C6579a newBuilder(ExitAction exitAction) {
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

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6580a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6580a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6580a> implements MessageLiteOrBuilder {
                public C6580a() {
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

            public static C6580a newBuilder() {
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
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6580a();
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

            public static C6580a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$a */
        public enum EnumC6581a {
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            BUTTON_DISCLAIMER_TAP(4),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2338a;

            EnumC6581a(int i) {
                this.f2338a = i;
            }

            public static EnumC6581a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return BUTTON_TAP;
                }
                if (i == 2) {
                    return SECONDARY_BUTTON_TAP;
                }
                if (i == 3) {
                    return EXIT;
                }
                if (i != 4) {
                    return null;
                }
                return BUTTON_DISCLAIMER_TAP;
            }

            public int getNumber() {
                return this.f2338a;
            }

            @Deprecated
            public static EnumC6581a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Actions$b */
        public static final class C6582b extends GeneratedMessageLite.Builder<Actions, C6582b> implements MessageLiteOrBuilder {
            public C6582b() {
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

        private void clearButtonDisclaimerTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearExit() {
            if (this.actionCase_ == 3) {
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

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.C6575a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = ButtonTapAction.newBuilder((ButtonTapAction) this.action_).mergeFrom((ButtonTapAction.C6577a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6579a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6580a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        public static C6582b newBuilder() {
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

        private void setButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6582b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", ButtonTapAction.class, SecondaryButtonTapAction.class, ExitAction.class, ButtonDisclaimerTapAction.class});
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

        public EnumC6581a getActionCase() {
            return EnumC6581a.forNumber(this.actionCase_);
        }

        public ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 4 ? (ButtonDisclaimerTapAction) this.action_ : ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public ButtonTapAction getButtonTap() {
            return this.actionCase_ == 1 ? (ButtonTapAction) this.action_ : ButtonTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            return this.actionCase_ == 3 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 2 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasButtonTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 2;
        }

        public static C6582b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6585a> implements MessageLiteOrBuilder {
        public static final int ACCORDION_FIELD_NUMBER = 19;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 17;
        public static final int BUTTON_FIELD_NUMBER = 10;
        public static final int CONTENT_FIELD_NUMBER = 15;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int ENCRYPTION_FIELD_NUMBER = 14;
        public static final int EVENTS_FIELD_NUMBER = 13;
        public static final int FIXED_CREDENTIAL_ONE_FIELD_NUMBER = 20;
        public static final int FIXED_CREDENTIAL_THREE_FIELD_NUMBER = 22;
        public static final int FIXED_CREDENTIAL_TWO_FIELD_NUMBER = 21;
        public static final int FOOTER_FIELD_NUMBER = 12;
        public static final int FOOTER_TEXT_FIELD_NUMBER = 16;
        public static final int HEADER_FIELD_NUMBER = 6;
        public static final int INLINE_ERROR_TEXT_FIELD_NUMBER = 23;
        public static final int INPUT_ONE_FIELD_NUMBER = 7;
        public static final int INPUT_THREE_FIELD_NUMBER = 9;
        public static final int INPUT_TWO_FIELD_NUMBER = 8;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 18;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 11;
        private Common$Accordion accordion_;
        private int bitField0_;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private Common$ButtonContent button_;
        private Common$AttributedLocalizedString content_;
        private Object credentialOne_;
        private Object credentialThree_;
        private Object credentialTwo_;
        private Encryption encryption_;
        private Events events_;
        private Common$AttributedLocalizedString footerText_;
        private Common$LocalizedString footer_;
        private Common$LocalizedString header_;
        private Common$LocalizedString inlineErrorText_;
        private Common$RenderedInstitution institution_;
        private Common$PaneHeader paneHeader_;
        private Common$ButtonContent secondaryButton_;
        private int credentialOneCase_ = 0;
        private int credentialTwoCase_ = 0;
        private int credentialThreeCase_ = 0;

        public static final class Encryption extends GeneratedMessageLite<Encryption, C6583a> implements MessageLiteOrBuilder {
            private static final Encryption DEFAULT_INSTANCE;
            public static final int METADATA_FIELD_NUMBER = 1;
            private static volatile Parser<Encryption> PARSER = null;
            public static final int RESPONSE_TEMPLATE_FIELD_NUMBER = 2;
            private int bitField0_;
            private Common$SDKEncryptionMetadata metadata_;
            private String responseTemplate_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$Encryption$a */
            public static final class C6583a extends GeneratedMessageLite.Builder<Encryption, C6583a> implements MessageLiteOrBuilder {
                public C6583a() {
                    super(Encryption.DEFAULT_INSTANCE);
                }
            }

            static {
                Encryption encryption = new Encryption();
                DEFAULT_INSTANCE = encryption;
                GeneratedMessageLite.registerDefaultInstance(Encryption.class, encryption);
            }

            private Encryption() {
            }

            private void clearMetadata() {
                this.metadata_ = null;
                this.bitField0_ &= -2;
            }

            private void clearResponseTemplate() {
                this.responseTemplate_ = getDefaultInstance().getResponseTemplate();
            }

            public static Encryption getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeMetadata(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
                common$SDKEncryptionMetadata.getClass();
                Common$SDKEncryptionMetadata common$SDKEncryptionMetadata2 = this.metadata_;
                if (common$SDKEncryptionMetadata2 == null || common$SDKEncryptionMetadata2 == Common$SDKEncryptionMetadata.getDefaultInstance()) {
                    this.metadata_ = common$SDKEncryptionMetadata;
                } else {
                    this.metadata_ = Common$SDKEncryptionMetadata.newBuilder(this.metadata_).mergeFrom((Common$SDKEncryptionMetadata.C6477a) common$SDKEncryptionMetadata).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6583a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Encryption parseDelimitedFrom(InputStream inputStream) {
                return (Encryption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Encryption parseFrom(ByteBuffer byteBuffer) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Encryption> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMetadata(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
                common$SDKEncryptionMetadata.getClass();
                this.metadata_ = common$SDKEncryptionMetadata;
                this.bitField0_ |= 1;
            }

            private void setResponseTemplate(String str) {
                str.getClass();
                this.responseTemplate_ = str;
            }

            private void setResponseTemplateBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseTemplate_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Encryption();
                    case 2:
                        return new C6583a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "metadata_", "responseTemplate_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Encryption> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Encryption.class) {
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

            public Common$SDKEncryptionMetadata getMetadata() {
                Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = this.metadata_;
                return common$SDKEncryptionMetadata == null ? Common$SDKEncryptionMetadata.getDefaultInstance() : common$SDKEncryptionMetadata;
            }

            public String getResponseTemplate() {
                return this.responseTemplate_;
            }

            public ByteString getResponseTemplateBytes() {
                return ByteString.copyFromUtf8(this.responseTemplate_);
            }

            public boolean hasMetadata() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6583a newBuilder(Encryption encryption) {
                return DEFAULT_INSTANCE.createBuilder(encryption);
            }

            public static Encryption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Encryption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Encryption parseFrom(ByteString byteString) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Encryption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Encryption parseFrom(byte[] bArr) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Encryption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Encryption parseFrom(InputStream inputStream) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Encryption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Encryption parseFrom(CodedInputStream codedInputStream) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Encryption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6584a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_DISCLAIMER_TAP_ACTION_FIELD_NUMBER = 4;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonDisclaimerTapAction_;
            private Common$SDKEvent onButtonTap_;
            private Common$SDKEvent onSecondaryButtonTap_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$Events$a */
            public static final class C6584a extends GeneratedMessageLite.Builder<Events, C6584a> implements MessageLiteOrBuilder {
                public C6584a() {
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

            private void clearOnButtonDisclaimerTapAction() {
                this.onButtonDisclaimerTapAction_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnButtonTap() {
                this.onButtonTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
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

            private void mergeOnButtonDisclaimerTapAction(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonDisclaimerTapAction_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonDisclaimerTapAction_ = common$SDKEvent;
                } else {
                    this.onButtonDisclaimerTapAction_ = Common$SDKEvent.newBuilder(this.onButtonDisclaimerTapAction_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTap_ = common$SDKEvent;
                } else {
                    this.onButtonTap_ = Common$SDKEvent.newBuilder(this.onButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryButtonTap_ = Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6584a newBuilder() {
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

            private void setOnButtonDisclaimerTapAction(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonDisclaimerTapAction_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6584a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_", "onButtonDisclaimerTapAction_"});
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

            public Common$SDKEvent getOnButtonDisclaimerTapAction() {
                Common$SDKEvent common$SDKEvent = this.onButtonDisclaimerTapAction_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSecondaryButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnButtonDisclaimerTapAction() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasOnButtonTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6584a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$a */
        public static final class C6585a extends GeneratedMessageLite.Builder<Rendering, C6585a> implements MessageLiteOrBuilder {
            public C6585a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$b */
        public enum EnumC6586b {
            INPUT_ONE(7),
            FIXED_CREDENTIAL_ONE(20),
            CREDENTIALONE_NOT_SET(0);


            /* renamed from: a */
            public final int f2340a;

            EnumC6586b(int i) {
                this.f2340a = i;
            }

            public static EnumC6586b forNumber(int i) {
                if (i == 0) {
                    return CREDENTIALONE_NOT_SET;
                }
                if (i == 7) {
                    return INPUT_ONE;
                }
                if (i != 20) {
                    return null;
                }
                return FIXED_CREDENTIAL_ONE;
            }

            public int getNumber() {
                return this.f2340a;
            }

            @Deprecated
            public static EnumC6586b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$c */
        public enum EnumC6587c {
            INPUT_THREE(9),
            FIXED_CREDENTIAL_THREE(22),
            CREDENTIALTHREE_NOT_SET(0);


            /* renamed from: a */
            public final int f2342a;

            EnumC6587c(int i) {
                this.f2342a = i;
            }

            public static EnumC6587c forNumber(int i) {
                if (i == 0) {
                    return CREDENTIALTHREE_NOT_SET;
                }
                if (i == 9) {
                    return INPUT_THREE;
                }
                if (i != 22) {
                    return null;
                }
                return FIXED_CREDENTIAL_THREE;
            }

            public int getNumber() {
                return this.f2342a;
            }

            @Deprecated
            public static EnumC6587c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$Rendering$d */
        public enum EnumC6588d {
            INPUT_TWO(8),
            FIXED_CREDENTIAL_TWO(21),
            CREDENTIALTWO_NOT_SET(0);


            /* renamed from: a */
            public final int f2344a;

            EnumC6588d(int i) {
                this.f2344a = i;
            }

            public static EnumC6588d forNumber(int i) {
                if (i == 0) {
                    return CREDENTIALTWO_NOT_SET;
                }
                if (i == 8) {
                    return INPUT_TWO;
                }
                if (i != 21) {
                    return null;
                }
                return FIXED_CREDENTIAL_TWO;
            }

            public int getNumber() {
                return this.f2344a;
            }

            @Deprecated
            public static EnumC6588d valueOf(int i) {
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

        private void clearAccordion() {
            this.accordion_ = null;
            this.bitField0_ &= -513;
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -33;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -17;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -9;
        }

        private void clearCredentialOne() {
            this.credentialOneCase_ = 0;
            this.credentialOne_ = null;
        }

        private void clearCredentialThree() {
            this.credentialThreeCase_ = 0;
            this.credentialThree_ = null;
        }

        private void clearCredentialTwo() {
            this.credentialTwoCase_ = 0;
            this.credentialTwo_ = null;
        }

        private void clearEncryption() {
            this.encryption_ = null;
            this.bitField0_ &= -2049;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearFixedCredentialOne() {
            if (this.credentialOneCase_ == 20) {
                this.credentialOneCase_ = 0;
                this.credentialOne_ = null;
            }
        }

        private void clearFixedCredentialThree() {
            if (this.credentialThreeCase_ == 22) {
                this.credentialThreeCase_ = 0;
                this.credentialThree_ = null;
            }
        }

        private void clearFixedCredentialTwo() {
            if (this.credentialTwoCase_ == 21) {
                this.credentialTwoCase_ = 0;
                this.credentialTwo_ = null;
            }
        }

        private void clearFooter() {
            this.footer_ = null;
            this.bitField0_ &= -129;
        }

        private void clearFooterText() {
            this.footerText_ = null;
            this.bitField0_ &= -257;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInlineErrorText() {
            this.inlineErrorText_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearInputOne() {
            if (this.credentialOneCase_ == 7) {
                this.credentialOneCase_ = 0;
                this.credentialOne_ = null;
            }
        }

        private void clearInputThree() {
            if (this.credentialThreeCase_ == 9) {
                this.credentialThreeCase_ = 0;
                this.credentialThree_ = null;
            }
        }

        private void clearInputTwo() {
            if (this.credentialTwoCase_ == 8) {
                this.credentialTwoCase_ = 0;
                this.credentialTwo_ = null;
            }
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -65;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccordion(Common$Accordion common$Accordion) {
            common$Accordion.getClass();
            Common$Accordion common$Accordion2 = this.accordion_;
            if (common$Accordion2 == null || common$Accordion2 == Common$Accordion.getDefaultInstance()) {
                this.accordion_ = common$Accordion;
            } else {
                this.accordion_ = Common$Accordion.newBuilder(this.accordion_).mergeFrom((Common$Accordion.C6383a) common$Accordion).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeEncryption(Encryption encryption) {
            encryption.getClass();
            Encryption encryption2 = this.encryption_;
            if (encryption2 == null || encryption2 == Encryption.getDefaultInstance()) {
                this.encryption_ = encryption;
            } else {
                this.encryption_ = Encryption.newBuilder(this.encryption_).mergeFrom((Encryption.C6583a) encryption).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6584a) events).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        private void mergeFixedCredentialOne(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            if (this.credentialOneCase_ != 20 || this.credentialOne_ == Common$ThreadsListItem.getDefaultInstance()) {
                this.credentialOne_ = common$ThreadsListItem;
            } else {
                this.credentialOne_ = Common$ThreadsListItem.newBuilder((Common$ThreadsListItem) this.credentialOne_).mergeFrom((Common$ThreadsListItem.C6531a) common$ThreadsListItem).buildPartial();
            }
            this.credentialOneCase_ = 20;
        }

        private void mergeFixedCredentialThree(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            if (this.credentialThreeCase_ != 22 || this.credentialThree_ == Common$ThreadsListItem.getDefaultInstance()) {
                this.credentialThree_ = common$ThreadsListItem;
            } else {
                this.credentialThree_ = Common$ThreadsListItem.newBuilder((Common$ThreadsListItem) this.credentialThree_).mergeFrom((Common$ThreadsListItem.C6531a) common$ThreadsListItem).buildPartial();
            }
            this.credentialThreeCase_ = 22;
        }

        private void mergeFixedCredentialTwo(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            if (this.credentialTwoCase_ != 21 || this.credentialTwo_ == Common$ThreadsListItem.getDefaultInstance()) {
                this.credentialTwo_ = common$ThreadsListItem;
            } else {
                this.credentialTwo_ = Common$ThreadsListItem.newBuilder((Common$ThreadsListItem) this.credentialTwo_).mergeFrom((Common$ThreadsListItem.C6531a) common$ThreadsListItem).buildPartial();
            }
            this.credentialTwoCase_ = 21;
        }

        private void mergeFooter(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.footer_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.footer_ = common$LocalizedString;
            } else {
                this.footer_ = Common$LocalizedString.newBuilder(this.footer_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.footerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.footerText_ = common$AttributedLocalizedString;
            } else {
                this.footerText_ = Common$AttributedLocalizedString.newBuilder(this.footerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.header_ = common$LocalizedString;
            } else {
                this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeInlineErrorText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.inlineErrorText_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.inlineErrorText_ = common$LocalizedString;
            } else {
                this.inlineErrorText_ = Common$LocalizedString.newBuilder(this.inlineErrorText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeInputOne(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            if (this.credentialOneCase_ != 7 || this.credentialOne_ == Common$TextInput.getDefaultInstance()) {
                this.credentialOne_ = common$TextInput;
            } else {
                this.credentialOne_ = Common$TextInput.newBuilder((Common$TextInput) this.credentialOne_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
            }
            this.credentialOneCase_ = 7;
        }

        private void mergeInputThree(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            if (this.credentialThreeCase_ != 9 || this.credentialThree_ == Common$TextInput.getDefaultInstance()) {
                this.credentialThree_ = common$TextInput;
            } else {
                this.credentialThree_ = Common$TextInput.newBuilder((Common$TextInput) this.credentialThree_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
            }
            this.credentialThreeCase_ = 9;
        }

        private void mergeInputTwo(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            if (this.credentialTwoCase_ != 8 || this.credentialTwo_ == Common$TextInput.getDefaultInstance()) {
                this.credentialTwo_ = common$TextInput;
            } else {
                this.credentialTwo_ = Common$TextInput.newBuilder((Common$TextInput) this.credentialTwo_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
            }
            this.credentialTwoCase_ = 8;
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

        private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.secondaryButton_ = common$ButtonContent;
            } else {
                this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static C6585a newBuilder() {
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

        private void setAccordion(Common$Accordion common$Accordion) {
            common$Accordion.getClass();
            this.accordion_ = common$Accordion;
            this.bitField0_ |= 512;
        }

        private void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 32;
        }

        private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 16;
        }

        private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 8;
        }

        private void setEncryption(Encryption encryption) {
            encryption.getClass();
            this.encryption_ = encryption;
            this.bitField0_ |= 2048;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 4096;
        }

        private void setFixedCredentialOne(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            this.credentialOne_ = common$ThreadsListItem;
            this.credentialOneCase_ = 20;
        }

        private void setFixedCredentialThree(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            this.credentialThree_ = common$ThreadsListItem;
            this.credentialThreeCase_ = 22;
        }

        private void setFixedCredentialTwo(Common$ThreadsListItem common$ThreadsListItem) {
            common$ThreadsListItem.getClass();
            this.credentialTwo_ = common$ThreadsListItem;
            this.credentialTwoCase_ = 21;
        }

        private void setFooter(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.footer_ = common$LocalizedString;
            this.bitField0_ |= 128;
        }

        private void setFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.footerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 256;
        }

        private void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 4;
        }

        private void setInlineErrorText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.inlineErrorText_ = common$LocalizedString;
            this.bitField0_ |= 1024;
        }

        private void setInputOne(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.credentialOne_ = common$TextInput;
            this.credentialOneCase_ = 7;
        }

        private void setInputThree(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.credentialThree_ = common$TextInput;
            this.credentialThreeCase_ = 9;
        }

        private void setInputTwo(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.credentialTwo_ = common$TextInput;
            this.credentialTwoCase_ = 8;
        }

        private void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 64;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6585a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0003\u0001\u0002\u0017\u0013\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0002\u0007<\u0000\b<\u0001\t<\u0002\nဉ\u0005\u000bဉ\u0006\fဉ\u0007\rဉ\f\u000eဉ\u000b\u000fဉ\u0003\u0010ဉ\b\u0011ဉ\u0004\u0012ဉ\u0001\u0013ဉ\t\u0014<\u0000\u0015<\u0001\u0016<\u0002\u0017ဉ\n", new Object[]{"credentialOne_", "credentialOneCase_", "credentialTwo_", "credentialTwoCase_", "credentialThree_", "credentialThreeCase_", "bitField0_", "institution_", "header_", Common$TextInput.class, Common$TextInput.class, Common$TextInput.class, "button_", "secondaryButton_", "footer_", "events_", "encryption_", "content_", "footerText_", "buttonDisclaimerText_", "paneHeader_", "accordion_", Common$ThreadsListItem.class, Common$ThreadsListItem.class, Common$ThreadsListItem.class, "inlineErrorText_"});
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

        public Common$Accordion getAccordion() {
            Common$Accordion common$Accordion = this.accordion_;
            return common$Accordion == null ? Common$Accordion.getDefaultInstance() : common$Accordion;
        }

        public Common$ButtonContent getButton() {
            Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getButtonDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$AttributedLocalizedString getContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public EnumC6586b getCredentialOneCase() {
            return EnumC6586b.forNumber(this.credentialOneCase_);
        }

        public EnumC6587c getCredentialThreeCase() {
            return EnumC6587c.forNumber(this.credentialThreeCase_);
        }

        public EnumC6588d getCredentialTwoCase() {
            return EnumC6588d.forNumber(this.credentialTwoCase_);
        }

        public Encryption getEncryption() {
            Encryption encryption = this.encryption_;
            return encryption == null ? Encryption.getDefaultInstance() : encryption;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$ThreadsListItem getFixedCredentialOne() {
            return this.credentialOneCase_ == 20 ? (Common$ThreadsListItem) this.credentialOne_ : Common$ThreadsListItem.getDefaultInstance();
        }

        public Common$ThreadsListItem getFixedCredentialThree() {
            return this.credentialThreeCase_ == 22 ? (Common$ThreadsListItem) this.credentialThree_ : Common$ThreadsListItem.getDefaultInstance();
        }

        public Common$ThreadsListItem getFixedCredentialTwo() {
            return this.credentialTwoCase_ == 21 ? (Common$ThreadsListItem) this.credentialTwo_ : Common$ThreadsListItem.getDefaultInstance();
        }

        public Common$LocalizedString getFooter() {
            Common$LocalizedString common$LocalizedString = this.footer_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$AttributedLocalizedString getFooterText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.footerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$LocalizedString getInlineErrorText() {
            Common$LocalizedString common$LocalizedString = this.inlineErrorText_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$TextInput getInputOne() {
            return this.credentialOneCase_ == 7 ? (Common$TextInput) this.credentialOne_ : Common$TextInput.getDefaultInstance();
        }

        public Common$TextInput getInputThree() {
            return this.credentialThreeCase_ == 9 ? (Common$TextInput) this.credentialThree_ : Common$TextInput.getDefaultInstance();
        }

        public Common$TextInput getInputTwo() {
            return this.credentialTwoCase_ == 8 ? (Common$TextInput) this.credentialTwo_ : Common$TextInput.getDefaultInstance();
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean hasAccordion() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasButton() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEncryption() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasFixedCredentialOne() {
            return this.credentialOneCase_ == 20;
        }

        public boolean hasFixedCredentialThree() {
            return this.credentialThreeCase_ == 22;
        }

        public boolean hasFixedCredentialTwo() {
            return this.credentialTwoCase_ == 21;
        }

        public boolean hasFooter() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasFooterText() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasHeader() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasInlineErrorText() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasInputOne() {
            return this.credentialOneCase_ == 7;
        }

        public boolean hasInputThree() {
            return this.credentialThreeCase_ == 9;
        }

        public boolean hasInputTwo() {
            return this.credentialTwoCase_ == 8;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 64) != 0;
        }

        public static C6585a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane$a */
    public static final class C6589a extends GeneratedMessageLite.Builder<CredentialsPaneOuterClass$CredentialsPane, C6589a> implements MessageLiteOrBuilder {
        public C6589a() {
            super(CredentialsPaneOuterClass$CredentialsPane.DEFAULT_INSTANCE);
        }
    }

    static {
        CredentialsPaneOuterClass$CredentialsPane credentialsPaneOuterClass$CredentialsPane = new CredentialsPaneOuterClass$CredentialsPane();
        DEFAULT_INSTANCE = credentialsPaneOuterClass$CredentialsPane;
        GeneratedMessageLite.registerDefaultInstance(CredentialsPaneOuterClass$CredentialsPane.class, credentialsPaneOuterClass$CredentialsPane);
    }

    private CredentialsPaneOuterClass$CredentialsPane() {
    }

    public static CredentialsPaneOuterClass$CredentialsPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6589a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseDelimitedFrom(InputStream inputStream) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(ByteBuffer byteBuffer) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CredentialsPaneOuterClass$CredentialsPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6906d0.f2551a[methodToInvoke.ordinal()]) {
            case 1:
                return new CredentialsPaneOuterClass$CredentialsPane();
            case 2:
                return new C6589a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CredentialsPaneOuterClass$CredentialsPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CredentialsPaneOuterClass$CredentialsPane.class) {
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

    public static C6589a newBuilder(CredentialsPaneOuterClass$CredentialsPane credentialsPaneOuterClass$CredentialsPane) {
        return DEFAULT_INSTANCE.createBuilder(credentialsPaneOuterClass$CredentialsPane);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(ByteString byteString) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(byte[] bArr) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(InputStream inputStream) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(CodedInputStream codedInputStream) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CredentialsPaneOuterClass$CredentialsPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CredentialsPaneOuterClass$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
