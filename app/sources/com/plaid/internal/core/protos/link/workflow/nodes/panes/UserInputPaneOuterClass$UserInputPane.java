package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential;
import com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class UserInputPaneOuterClass$UserInputPane extends GeneratedMessageLite<UserInputPaneOuterClass$UserInputPane, C6850a> implements MessageLiteOrBuilder {
    private static final UserInputPaneOuterClass$UserInputPane DEFAULT_INSTANCE;
    private static volatile Parser<UserInputPaneOuterClass$UserInputPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6843b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 3;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        public static final int MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 7;
        public static final int PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 6;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 4;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TERTIARY_BUTTON_TAP_FIELD_NUMBER = 5;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, C6832a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$ButtonDisclaimerTapAction$a */
            public static final class C6832a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, C6832a> implements MessageLiteOrBuilder {
                public C6832a() {
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

            public static C6832a newBuilder() {
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
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new C6832a();
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

            public static C6832a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
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

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6833a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$ExitAction$a */
            public static final class C6833a extends GeneratedMessageLite.Builder<ExitAction, C6833a> implements MessageLiteOrBuilder {
                public C6833a() {
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

            public static C6833a newBuilder() {
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
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6833a();
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

            public static C6833a newBuilder(ExitAction exitAction) {
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

        public static final class ModalFlexibleComponentsButtonOneTapAction extends GeneratedMessageLite<ModalFlexibleComponentsButtonOneTapAction, C6835a> implements MessageLiteOrBuilder {
            private static final ModalFlexibleComponentsButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ModalFlexibleComponentsButtonOneTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6834a> implements MessageLiteOrBuilder {
                public static final int COMPONENT_ID_FIELD_NUMBER = 1;
                private static final Response DEFAULT_INSTANCE;
                private static volatile Parser<Response> PARSER;
                private String componentId_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$ModalFlexibleComponentsButtonOneTapAction$Response$a */
                public static final class C6834a extends GeneratedMessageLite.Builder<Response, C6834a> implements MessageLiteOrBuilder {
                    public C6834a() {
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

                private void clearComponentId() {
                    this.componentId_ = getDefaultInstance().getComponentId();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6834a newBuilder() {
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

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6834a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"componentId_"});
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

                public static C6834a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$ModalFlexibleComponentsButtonOneTapAction$a */
            public static final class C6835a extends GeneratedMessageLite.Builder<ModalFlexibleComponentsButtonOneTapAction, C6835a> implements MessageLiteOrBuilder {
                public C6835a() {
                    super(ModalFlexibleComponentsButtonOneTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction = new ModalFlexibleComponentsButtonOneTapAction();
                DEFAULT_INSTANCE = modalFlexibleComponentsButtonOneTapAction;
                GeneratedMessageLite.registerDefaultInstance(ModalFlexibleComponentsButtonOneTapAction.class, modalFlexibleComponentsButtonOneTapAction);
            }

            private ModalFlexibleComponentsButtonOneTapAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static ModalFlexibleComponentsButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6834a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6835a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ModalFlexibleComponentsButtonOneTapAction> parser() {
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
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ModalFlexibleComponentsButtonOneTapAction();
                    case 2:
                        return new C6835a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ModalFlexibleComponentsButtonOneTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ModalFlexibleComponentsButtonOneTapAction.class) {
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

            public static C6835a newBuilder(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
                return DEFAULT_INSTANCE.createBuilder(modalFlexibleComponentsButtonOneTapAction);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(ByteString byteString) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(byte[] bArr) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(InputStream inputStream) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ModalFlexibleComponentsButtonOneTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ModalFlexibleComponentsButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PaneBodyAdornmentButtonTapAction extends GeneratedMessageLite<PaneBodyAdornmentButtonTapAction, C6836a> implements MessageLiteOrBuilder {
            private static final PaneBodyAdornmentButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<PaneBodyAdornmentButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$PaneBodyAdornmentButtonTapAction$a */
            public static final class C6836a extends GeneratedMessageLite.Builder<PaneBodyAdornmentButtonTapAction, C6836a> implements MessageLiteOrBuilder {
                public C6836a() {
                    super(PaneBodyAdornmentButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction = new PaneBodyAdornmentButtonTapAction();
                DEFAULT_INSTANCE = paneBodyAdornmentButtonTapAction;
                GeneratedMessageLite.registerDefaultInstance(PaneBodyAdornmentButtonTapAction.class, paneBodyAdornmentButtonTapAction);
            }

            private PaneBodyAdornmentButtonTapAction() {
            }

            public static PaneBodyAdornmentButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6836a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PaneBodyAdornmentButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PaneBodyAdornmentButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PaneBodyAdornmentButtonTapAction();
                    case 2:
                        return new C6836a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PaneBodyAdornmentButtonTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PaneBodyAdornmentButtonTapAction.class) {
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

            public static C6836a newBuilder(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(paneBodyAdornmentButtonTapAction);
            }

            public static PaneBodyAdornmentButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(ByteString byteString) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(byte[] bArr) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(InputStream inputStream) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PaneBodyAdornmentButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PaneBodyAdornmentButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6837a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6837a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6837a> implements MessageLiteOrBuilder {
                public C6837a() {
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

            public static C6837a newBuilder() {
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
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6837a();
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

            public static C6837a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6839a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private Internal.ProtobufList<Response> responses_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Response extends GeneratedMessageLite<Response, C6838a> implements InterfaceC6840b {
                public static final int AUTO_SUBMIT_BEHAVIOR_FIELD_NUMBER = 3;
                private static final Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int PUBLIC_KEY_CREDENTIAL_FIELD_NUMBER = 4;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int autoSubmitBehavior_;
                private int bitField0_;
                private Webauthn$PublicKeyCredential publicKeyCredential_;
                private String inputId_ = "";
                private String value_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$SubmitAction$Response$a */
                public static final class C6838a extends GeneratedMessageLite.Builder<Response, C6838a> implements InterfaceC6840b {
                    public C6838a() {
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

                private void clearAutoSubmitBehavior() {
                    this.autoSubmitBehavior_ = 0;
                }

                private void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                private void clearPublicKeyCredential() {
                    this.publicKeyCredential_ = null;
                    this.bitField0_ &= -2;
                }

                private void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                private void mergePublicKeyCredential(Webauthn$PublicKeyCredential webauthn$PublicKeyCredential) {
                    webauthn$PublicKeyCredential.getClass();
                    Webauthn$PublicKeyCredential webauthn$PublicKeyCredential2 = this.publicKeyCredential_;
                    if (webauthn$PublicKeyCredential2 == null || webauthn$PublicKeyCredential2 == Webauthn$PublicKeyCredential.getDefaultInstance()) {
                        this.publicKeyCredential_ = webauthn$PublicKeyCredential;
                    } else {
                        this.publicKeyCredential_ = Webauthn$PublicKeyCredential.newBuilder(this.publicKeyCredential_).mergeFrom((Webauthn$PublicKeyCredential.C7044a) webauthn$PublicKeyCredential).buildPartial();
                    }
                    this.bitField0_ |= 1;
                }

                public static C6838a newBuilder() {
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

                private void setAutoSubmitBehavior(Common$AutoSubmitConfiguration.EnumC6396b enumC6396b) {
                    this.autoSubmitBehavior_ = enumC6396b.getNumber();
                }

                private void setAutoSubmitBehaviorValue(int i) {
                    this.autoSubmitBehavior_ = i;
                }

                private void setInputId(String str) {
                    str.getClass();
                    this.inputId_ = str;
                }

                private void setInputIdBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.inputId_ = byteString.toStringUtf8();
                }

                private void setPublicKeyCredential(Webauthn$PublicKeyCredential webauthn$PublicKeyCredential) {
                    webauthn$PublicKeyCredential.getClass();
                    this.publicKeyCredential_ = webauthn$PublicKeyCredential;
                    this.bitField0_ |= 1;
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
                    switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6838a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "inputId_", "value_", "autoSubmitBehavior_", "publicKeyCredential_"});
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

                public Common$AutoSubmitConfiguration.EnumC6396b getAutoSubmitBehavior() {
                    Common$AutoSubmitConfiguration.EnumC6396b enumC6396bForNumber = Common$AutoSubmitConfiguration.EnumC6396b.forNumber(this.autoSubmitBehavior_);
                    return enumC6396bForNumber == null ? Common$AutoSubmitConfiguration.EnumC6396b.UNRECOGNIZED : enumC6396bForNumber;
                }

                public int getAutoSubmitBehaviorValue() {
                    return this.autoSubmitBehavior_;
                }

                public String getInputId() {
                    return this.inputId_;
                }

                public ByteString getInputIdBytes() {
                    return ByteString.copyFromUtf8(this.inputId_);
                }

                public Webauthn$PublicKeyCredential getPublicKeyCredential() {
                    Webauthn$PublicKeyCredential webauthn$PublicKeyCredential = this.publicKeyCredential_;
                    return webauthn$PublicKeyCredential == null ? Webauthn$PublicKeyCredential.getDefaultInstance() : webauthn$PublicKeyCredential;
                }

                public String getValue() {
                    return this.value_;
                }

                public ByteString getValueBytes() {
                    return ByteString.copyFromUtf8(this.value_);
                }

                public boolean hasPublicKeyCredential() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static C6838a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$SubmitAction$a */
            public static final class C6839a extends GeneratedMessageLite.Builder<SubmitAction, C6839a> implements MessageLiteOrBuilder {
                public C6839a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$SubmitAction$b */
            public interface InterfaceC6840b extends MessageLiteOrBuilder {
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
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

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6839a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            private void setResponses(int i, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i, response);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6839a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"responses_", Response.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubmitAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SubmitAction.class) {
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

            public Response getResponses(int i) {
                return this.responses_.get(i);
            }

            public int getResponsesCount() {
                return this.responses_.size();
            }

            public List<Response> getResponsesList() {
                return this.responses_;
            }

            public InterfaceC6840b getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public List<? extends InterfaceC6840b> getResponsesOrBuilderList() {
                return this.responses_;
            }

            public static C6839a newBuilder(SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteString byteString) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addResponses(int i, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(i, response);
            }

            public static SubmitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(byte[] bArr) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubmitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TertiaryButtonTapAction extends GeneratedMessageLite<TertiaryButtonTapAction, C6841a> implements MessageLiteOrBuilder {
            private static final TertiaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<TertiaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$TertiaryButtonTapAction$a */
            public static final class C6841a extends GeneratedMessageLite.Builder<TertiaryButtonTapAction, C6841a> implements MessageLiteOrBuilder {
                public C6841a() {
                    super(TertiaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TertiaryButtonTapAction tertiaryButtonTapAction = new TertiaryButtonTapAction();
                DEFAULT_INSTANCE = tertiaryButtonTapAction;
                GeneratedMessageLite.registerDefaultInstance(TertiaryButtonTapAction.class, tertiaryButtonTapAction);
            }

            private TertiaryButtonTapAction() {
            }

            public static TertiaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6841a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TertiaryButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TertiaryButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TertiaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TertiaryButtonTapAction();
                    case 2:
                        return new C6841a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TertiaryButtonTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TertiaryButtonTapAction.class) {
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

            public static C6841a newBuilder(TertiaryButtonTapAction tertiaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(tertiaryButtonTapAction);
            }

            public static TertiaryButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TertiaryButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TertiaryButtonTapAction parseFrom(ByteString byteString) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TertiaryButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TertiaryButtonTapAction parseFrom(byte[] bArr) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TertiaryButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TertiaryButtonTapAction parseFrom(InputStream inputStream) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TertiaryButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TertiaryButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TertiaryButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TertiaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$a */
        public enum EnumC6842a {
            BUTTON_DISCLAIMER_TAP(3),
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(4),
            TERTIARY_BUTTON_TAP(5),
            PANE_BODY_ADORNMENT_BUTTON_TAP(6),
            EXIT(2),
            MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP(7),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2484a;

            EnumC6842a(int i) {
                this.f2484a = i;
            }

            public static EnumC6842a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return SUBMIT;
                    case 2:
                        return EXIT;
                    case 3:
                        return BUTTON_DISCLAIMER_TAP;
                    case 4:
                        return SECONDARY_BUTTON_TAP;
                    case 5:
                        return TERTIARY_BUTTON_TAP;
                    case 6:
                        return PANE_BODY_ADORNMENT_BUTTON_TAP;
                    case 7:
                        return MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2484a;
            }

            @Deprecated
            public static EnumC6842a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Actions$b */
        public static final class C6843b extends GeneratedMessageLite.Builder<Actions, C6843b> implements MessageLiteOrBuilder {
            public C6843b() {
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
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearModalFlexibleComponentsButtonOneTap() {
            if (this.actionCase_ == 7) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearPaneBodyAdornmentButtonTap() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTertiaryButtonTap() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.C6832a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6833a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeModalFlexibleComponentsButtonOneTap(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            modalFlexibleComponentsButtonOneTapAction.getClass();
            if (this.actionCase_ != 7 || this.action_ == ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance()) {
                this.action_ = modalFlexibleComponentsButtonOneTapAction;
            } else {
                this.action_ = ModalFlexibleComponentsButtonOneTapAction.newBuilder((ModalFlexibleComponentsButtonOneTapAction) this.action_).mergeFrom((ModalFlexibleComponentsButtonOneTapAction.C6835a) modalFlexibleComponentsButtonOneTapAction).buildPartial();
            }
            this.actionCase_ = 7;
        }

        private void mergePaneBodyAdornmentButtonTap(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            paneBodyAdornmentButtonTapAction.getClass();
            if (this.actionCase_ != 6 || this.action_ == PaneBodyAdornmentButtonTapAction.getDefaultInstance()) {
                this.action_ = paneBodyAdornmentButtonTapAction;
            } else {
                this.action_ = PaneBodyAdornmentButtonTapAction.newBuilder((PaneBodyAdornmentButtonTapAction) this.action_).mergeFrom((PaneBodyAdornmentButtonTapAction.C6836a) paneBodyAdornmentButtonTapAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6837a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6839a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeTertiaryButtonTap(TertiaryButtonTapAction tertiaryButtonTapAction) {
            tertiaryButtonTapAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == TertiaryButtonTapAction.getDefaultInstance()) {
                this.action_ = tertiaryButtonTapAction;
            } else {
                this.action_ = TertiaryButtonTapAction.newBuilder((TertiaryButtonTapAction) this.action_).mergeFrom((TertiaryButtonTapAction.C6841a) tertiaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static C6843b newBuilder() {
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
            this.actionCase_ = 3;
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setModalFlexibleComponentsButtonOneTap(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            modalFlexibleComponentsButtonOneTapAction.getClass();
            this.action_ = modalFlexibleComponentsButtonOneTapAction;
            this.actionCase_ = 7;
        }

        private void setPaneBodyAdornmentButtonTap(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            paneBodyAdornmentButtonTapAction.getClass();
            this.action_ = paneBodyAdornmentButtonTapAction;
            this.actionCase_ = 6;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 4;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        private void setTertiaryButtonTap(TertiaryButtonTapAction tertiaryButtonTapAction) {
            tertiaryButtonTapAction.getClass();
            this.action_ = tertiaryButtonTapAction;
            this.actionCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6843b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, ButtonDisclaimerTapAction.class, SecondaryButtonTapAction.class, TertiaryButtonTapAction.class, PaneBodyAdornmentButtonTapAction.class, ModalFlexibleComponentsButtonOneTapAction.class});
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

        public EnumC6842a getActionCase() {
            return EnumC6842a.forNumber(this.actionCase_);
        }

        public ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 3 ? (ButtonDisclaimerTapAction) this.action_ : ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public ModalFlexibleComponentsButtonOneTapAction getModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 7 ? (ModalFlexibleComponentsButtonOneTapAction) this.action_ : ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance();
        }

        public PaneBodyAdornmentButtonTapAction getPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 6 ? (PaneBodyAdornmentButtonTapAction) this.action_ : PaneBodyAdornmentButtonTapAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 4 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public TertiaryButtonTapAction getTertiaryButtonTap() {
            return this.actionCase_ == 5 ? (TertiaryButtonTapAction) this.action_ : TertiaryButtonTapAction.getDefaultInstance();
        }

        public boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 7;
        }

        public boolean hasPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 6;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public boolean hasTertiaryButtonTap() {
            return this.actionCase_ == 5;
        }

        public static C6843b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6846a> implements MessageLiteOrBuilder {
        public static final int ANIMATED_CO_BRANDED_HEADER_FIELD_NUMBER = 22;
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 25;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 12;
        public static final int BUTTON_FIELD_NUMBER = 8;
        public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 15;
        public static final int CHECK_LIST_FIELD_NUMBER = 24;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_TEXT_PLACEMENT_FIELD_NUMBER = 18;
        public static final int DISPLAY_MODE_FIELD_NUMBER = 11;
        public static final int EVENTS_FIELD_NUMBER = 10;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 5;
        public static final int INLINE_ERROR_TEXT_FIELD_NUMBER = 26;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 23;
        public static final int PANE_BODY_ADORNMENT_FIELD_NUMBER = 21;
        public static final int PANE_HEADER_FIELD_NUMBER = 13;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PASSKEYS_DISPLAY_MODE_FIELD_NUMBER = 16;
        public static final int POPUP_OPTIONS_FIELD_NUMBER = 20;
        public static final int PROMPTS_FIELD_NUMBER = 6;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 9;
        public static final int TERTIARY_BUTTON_FIELD_NUMBER = 19;
        public static final int TEXT_ALIGN_FIELD_NUMBER = 14;
        public static final int WEB_AUTHN_OPTIONS_FIELD_NUMBER = 17;
        private Common$AnimatedCoBrandedHeader animatedCoBrandedHeader_;
        private int backgroundDisplayMode_;
        private int bitField0_;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private int buttonPlacement_;
        private Common$ButtonContent button_;
        private int disclaimerTextPlacement_;
        private int displayMode_;
        private Events events_;
        private Common$RenderedAssetAppearance headerAsset_;
        private Common$LocalizedString header_;
        private Common$LocalizedString inlineErrorText_;
        private Common$RenderedInstitution institution_;
        private Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
        private Common$PaneBodyAdornment paneBodyAdornment_;
        private Object paneContent_;
        private Common$PaneHeader paneHeader_;
        private int passkeysDisplayMode_;
        private Common$PopupOptions popupOptions_;
        private Common$ButtonContent secondaryButton_;
        private Common$ButtonContent tertiaryButton_;
        private int textAlign_;
        private Webauthn$WebAuthnOptions webAuthnOptions_;
        private int paneContentCase_ = 0;
        private Internal.ProtobufList<Prompt> prompts_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends GeneratedMessageLite<Events, C6844a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 6;
            public static final int ON_PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 5;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            public static final int ON_TERTIARY_BUTTON_TAP_FIELD_NUMBER = 4;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Common$SDKEvent onSecondaryButtonTap_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSubmitTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onTertiaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onPaneBodyAdornmentButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onModalFlexibleComponentsButtonOneTap_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$Events$a */
            public static final class C6844a extends GeneratedMessageLite.Builder<Events, C6844a> implements MessageLiteOrBuilder {
                public C6844a() {
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

            private void addAllOnModalFlexibleComponentsButtonOneTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onModalFlexibleComponentsButtonOneTap_);
            }

            private void addAllOnPaneBodyAdornmentButtonTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onPaneBodyAdornmentButtonTap_);
            }

            private void addAllOnSubmitTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSubmitTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmitTap_);
            }

            private void addAllOnTertiaryButtonTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnTertiaryButtonTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onTertiaryButtonTap_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnModalFlexibleComponentsButtonOneTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.add(common$SDKEvent);
            }

            private void addOnPaneBodyAdornmentButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.add(common$SDKEvent);
            }

            private void addOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(common$SDKEvent);
            }

            private void addOnTertiaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnTertiaryButtonTapIsMutable();
                this.onTertiaryButtonTap_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnModalFlexibleComponentsButtonOneTap() {
                this.onModalFlexibleComponentsButtonOneTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnPaneBodyAdornmentButtonTap() {
                this.onPaneBodyAdornmentButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnSubmitTap() {
                this.onSubmitTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnTertiaryButtonTap() {
                this.onTertiaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnModalFlexibleComponentsButtonOneTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onModalFlexibleComponentsButtonOneTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onModalFlexibleComponentsButtonOneTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnPaneBodyAdornmentButtonTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onPaneBodyAdornmentButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onPaneBodyAdornmentButtonTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSubmitTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSubmitTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSubmitTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnTertiaryButtonTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onTertiaryButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onTertiaryButtonTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryButtonTap_ = Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6844a newBuilder() {
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

            private void removeOnModalFlexibleComponentsButtonOneTap(int i) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.remove(i);
            }

            private void removeOnPaneBodyAdornmentButtonTap(int i) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.remove(i);
            }

            private void removeOnSubmitTap(int i) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.remove(i);
            }

            private void removeOnTertiaryButtonTap(int i) {
                ensureOnTertiaryButtonTapIsMutable();
                this.onTertiaryButtonTap_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnModalFlexibleComponentsButtonOneTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.set(i, common$SDKEvent);
            }

            private void setOnPaneBodyAdornmentButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSubmitTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.set(i, common$SDKEvent);
            }

            private void setOnTertiaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnTertiaryButtonTapIsMutable();
                this.onTertiaryButtonTap_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6844a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004\u001b\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onSubmitTap_", Common$SDKEvent.class, "onSecondaryButtonTap_", "onTertiaryButtonTap_", Common$SDKEvent.class, "onPaneBodyAdornmentButtonTap_", Common$SDKEvent.class, "onModalFlexibleComponentsButtonOneTap_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnModalFlexibleComponentsButtonOneTap(int i) {
                return this.onModalFlexibleComponentsButtonOneTap_.get(i);
            }

            public int getOnModalFlexibleComponentsButtonOneTapCount() {
                return this.onModalFlexibleComponentsButtonOneTap_.size();
            }

            public List<Common$SDKEvent> getOnModalFlexibleComponentsButtonOneTapList() {
                return this.onModalFlexibleComponentsButtonOneTap_;
            }

            public InterfaceC6691M getOnModalFlexibleComponentsButtonOneTapOrBuilder(int i) {
                return this.onModalFlexibleComponentsButtonOneTap_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnModalFlexibleComponentsButtonOneTapOrBuilderList() {
                return this.onModalFlexibleComponentsButtonOneTap_;
            }

            public Common$SDKEvent getOnPaneBodyAdornmentButtonTap(int i) {
                return this.onPaneBodyAdornmentButtonTap_.get(i);
            }

            public int getOnPaneBodyAdornmentButtonTapCount() {
                return this.onPaneBodyAdornmentButtonTap_.size();
            }

            public List<Common$SDKEvent> getOnPaneBodyAdornmentButtonTapList() {
                return this.onPaneBodyAdornmentButtonTap_;
            }

            public InterfaceC6691M getOnPaneBodyAdornmentButtonTapOrBuilder(int i) {
                return this.onPaneBodyAdornmentButtonTap_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnPaneBodyAdornmentButtonTapOrBuilderList() {
                return this.onPaneBodyAdornmentButtonTap_;
            }

            public Common$SDKEvent getOnSecondaryButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitTap(int i) {
                return this.onSubmitTap_.get(i);
            }

            public int getOnSubmitTapCount() {
                return this.onSubmitTap_.size();
            }

            public List<Common$SDKEvent> getOnSubmitTapList() {
                return this.onSubmitTap_;
            }

            public InterfaceC6691M getOnSubmitTapOrBuilder(int i) {
                return this.onSubmitTap_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnSubmitTapOrBuilderList() {
                return this.onSubmitTap_;
            }

            public Common$SDKEvent getOnTertiaryButtonTap(int i) {
                return this.onTertiaryButtonTap_.get(i);
            }

            public int getOnTertiaryButtonTapCount() {
                return this.onTertiaryButtonTap_.size();
            }

            public List<Common$SDKEvent> getOnTertiaryButtonTapList() {
                return this.onTertiaryButtonTap_;
            }

            public InterfaceC6691M getOnTertiaryButtonTapOrBuilder(int i) {
                return this.onTertiaryButtonTap_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnTertiaryButtonTapOrBuilderList() {
                return this.onTertiaryButtonTap_;
            }

            public boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6844a newBuilder(Events events) {
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

            private void addOnModalFlexibleComponentsButtonOneTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.add(i, common$SDKEvent);
            }

            private void addOnPaneBodyAdornmentButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.add(i, common$SDKEvent);
            }

            private void addOnSubmitTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(i, common$SDKEvent);
            }

            private void addOnTertiaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnTertiaryButtonTapIsMutable();
                this.onTertiaryButtonTap_.add(i, common$SDKEvent);
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

        public static final class Prompt extends GeneratedMessageLite<Prompt, C6845a> implements InterfaceC6849d {
            public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 3;
            public static final int AUTO_SUBMIT_CONFIGURATION_FIELD_NUMBER = 4;
            private static final Prompt DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            private static volatile Parser<Prompt> PARSER = null;
            public static final int PHONE_INPUT_FIELD_NUMBER = 5;
            public static final int SEGMENTED_INPUT_FIELD_NUMBER = 6;
            public static final int TEXT_FIELD_NUMBER = 1;
            private Common$AttributedLocalizedString attributedText_;
            private Common$AutoSubmitConfiguration autoSubmitConfiguration_;
            private int bitField0_;
            private Common$TextInput input_;
            private Common$PhoneInput phoneInput_;
            private Common$SegmentedInput segmentedInput_;
            private Common$LocalizedString text_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$Prompt$a */
            public static final class C6845a extends GeneratedMessageLite.Builder<Prompt, C6845a> implements InterfaceC6849d {
                public C6845a() {
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

            private void clearAttributedText() {
                this.attributedText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearAutoSubmitConfiguration() {
                this.autoSubmitConfiguration_ = null;
                this.bitField0_ &= -17;
            }

            private void clearInput() {
                this.input_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPhoneInput() {
                this.phoneInput_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSegmentedInput() {
                this.segmentedInput_ = null;
                this.bitField0_ &= -9;
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -2;
            }

            public static Prompt getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedText_ = common$AttributedLocalizedString;
                } else {
                    this.attributedText_ = Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeAutoSubmitConfiguration(Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
                common$AutoSubmitConfiguration.getClass();
                Common$AutoSubmitConfiguration common$AutoSubmitConfiguration2 = this.autoSubmitConfiguration_;
                if (common$AutoSubmitConfiguration2 == null || common$AutoSubmitConfiguration2 == Common$AutoSubmitConfiguration.getDefaultInstance()) {
                    this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
                } else {
                    this.autoSubmitConfiguration_ = Common$AutoSubmitConfiguration.newBuilder(this.autoSubmitConfiguration_).mergeFrom((Common$AutoSubmitConfiguration.C6397c) common$AutoSubmitConfiguration).buildPartial();
                }
                this.bitField0_ |= 16;
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

            private void mergePhoneInput(Common$PhoneInput common$PhoneInput) {
                common$PhoneInput.getClass();
                Common$PhoneInput common$PhoneInput2 = this.phoneInput_;
                if (common$PhoneInput2 == null || common$PhoneInput2 == Common$PhoneInput.getDefaultInstance()) {
                    this.phoneInput_ = common$PhoneInput;
                } else {
                    this.phoneInput_ = Common$PhoneInput.newBuilder(this.phoneInput_).mergeFrom((Common$PhoneInput.C6463a) common$PhoneInput).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSegmentedInput(Common$SegmentedInput common$SegmentedInput) {
                common$SegmentedInput.getClass();
                Common$SegmentedInput common$SegmentedInput2 = this.segmentedInput_;
                if (common$SegmentedInput2 == null || common$SegmentedInput2 == Common$SegmentedInput.getDefaultInstance()) {
                    this.segmentedInput_ = common$SegmentedInput;
                } else {
                    this.segmentedInput_ = Common$SegmentedInput.newBuilder(this.segmentedInput_).mergeFrom((Common$SegmentedInput.C6494a) common$SegmentedInput).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.text_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.text_ = common$LocalizedString;
                } else {
                    this.text_ = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6845a newBuilder() {
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

            private void setAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.attributedText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 32;
            }

            private void setAutoSubmitConfiguration(Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
                common$AutoSubmitConfiguration.getClass();
                this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
                this.bitField0_ |= 16;
            }

            private void setInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                this.input_ = common$TextInput;
                this.bitField0_ |= 2;
            }

            private void setPhoneInput(Common$PhoneInput common$PhoneInput) {
                common$PhoneInput.getClass();
                this.phoneInput_ = common$PhoneInput;
                this.bitField0_ |= 4;
            }

            private void setSegmentedInput(Common$SegmentedInput common$SegmentedInput) {
                common$SegmentedInput.getClass();
                this.segmentedInput_ = common$SegmentedInput;
                this.bitField0_ |= 8;
            }

            private void setText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.text_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Prompt();
                    case 2:
                        return new C6845a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0005\u0004ဉ\u0004\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "text_", "input_", "attributedText_", "autoSubmitConfiguration_", "phoneInput_", "segmentedInput_"});
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

            public Common$AttributedLocalizedString getAttributedText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$AutoSubmitConfiguration getAutoSubmitConfiguration() {
                Common$AutoSubmitConfiguration common$AutoSubmitConfiguration = this.autoSubmitConfiguration_;
                return common$AutoSubmitConfiguration == null ? Common$AutoSubmitConfiguration.getDefaultInstance() : common$AutoSubmitConfiguration;
            }

            public Common$TextInput getInput() {
                Common$TextInput common$TextInput = this.input_;
                return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
            }

            public Common$PhoneInput getPhoneInput() {
                Common$PhoneInput common$PhoneInput = this.phoneInput_;
                return common$PhoneInput == null ? Common$PhoneInput.getDefaultInstance() : common$PhoneInput;
            }

            public Common$SegmentedInput getSegmentedInput() {
                Common$SegmentedInput common$SegmentedInput = this.segmentedInput_;
                return common$SegmentedInput == null ? Common$SegmentedInput.getDefaultInstance() : common$SegmentedInput;
            }

            public Common$LocalizedString getText() {
                Common$LocalizedString common$LocalizedString = this.text_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public boolean hasAttributedText() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasAutoSubmitConfiguration() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasInput() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPhoneInput() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSegmentedInput() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6845a newBuilder(Prompt prompt) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$a */
        public static final class C6846a extends GeneratedMessageLite.Builder<Rendering, C6846a> implements MessageLiteOrBuilder {
            public C6846a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$b */
        public enum EnumC6847b {
            CHECK_LIST(24),
            PANECONTENT_NOT_SET(0);


            /* renamed from: a */
            public final int f2486a;

            EnumC6847b(int i) {
                this.f2486a = i;
            }

            public static EnumC6847b forNumber(int i) {
                if (i == 0) {
                    return PANECONTENT_NOT_SET;
                }
                if (i != 24) {
                    return null;
                }
                return CHECK_LIST;
            }

            public int getNumber() {
                return this.f2486a;
            }

            @Deprecated
            public static EnumC6847b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$c */
        public enum EnumC6848c implements Internal.EnumLite {
            PASSKEYS_DISPLAY_MODE_UNKNOWN(0),
            PASSKEYS_DISPLAY_MODE_CREATE(1),
            PASSKEYS_DISPLAY_MODE_GET(2),
            UNRECOGNIZED(-1);

            public static final int PASSKEYS_DISPLAY_MODE_CREATE_VALUE = 1;
            public static final int PASSKEYS_DISPLAY_MODE_GET_VALUE = 2;
            public static final int PASSKEYS_DISPLAY_MODE_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2487b = new a();

            /* renamed from: a */
            public final int f2489a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6848c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6848c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2490a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6848c.forNumber(i) != null;
                }
            }

            EnumC6848c(int i) {
                this.f2489a = i;
            }

            public static EnumC6848c forNumber(int i) {
                if (i == 0) {
                    return PASSKEYS_DISPLAY_MODE_UNKNOWN;
                }
                if (i == 1) {
                    return PASSKEYS_DISPLAY_MODE_CREATE;
                }
                if (i != 2) {
                    return null;
                }
                return PASSKEYS_DISPLAY_MODE_GET;
            }

            public static Internal.EnumLiteMap<EnumC6848c> internalGetValueMap() {
                return f2487b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2490a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2489a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6848c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$Rendering$d */
        public interface InterfaceC6849d extends MessageLiteOrBuilder {
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllPrompts(Iterable<? extends Prompt> iterable) {
            ensurePromptsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.prompts_);
        }

        private void addPrompts(Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.add(prompt);
        }

        private void clearAnimatedCoBrandedHeader() {
            this.animatedCoBrandedHeader_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -33;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -17;
        }

        private void clearButtonPlacement() {
            this.buttonPlacement_ = 0;
        }

        private void clearCheckList() {
            if (this.paneContentCase_ == 24) {
                this.paneContentCase_ = 0;
                this.paneContent_ = null;
            }
        }

        private void clearDisclaimerTextPlacement() {
            this.disclaimerTextPlacement_ = 0;
        }

        private void clearDisplayMode() {
            this.displayMode_ = 0;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -257;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInlineErrorText() {
            this.inlineErrorText_ = null;
            this.bitField0_ &= -16385;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPaneAutoSubmitOptions() {
            this.paneAutoSubmitOptions_ = null;
            this.bitField0_ &= -8193;
        }

        private void clearPaneBodyAdornment() {
            this.paneBodyAdornment_ = null;
            this.bitField0_ &= -2049;
        }

        private void clearPaneContent() {
            this.paneContentCase_ = 0;
            this.paneContent_ = null;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPasskeysDisplayMode() {
            this.passkeysDisplayMode_ = 0;
        }

        private void clearPopupOptions() {
            this.popupOptions_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearPrompts() {
            this.prompts_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -65;
        }

        private void clearTertiaryButton() {
            this.tertiaryButton_ = null;
            this.bitField0_ &= -129;
        }

        private void clearTextAlign() {
            this.textAlign_ = 0;
        }

        private void clearWebAuthnOptions() {
            this.webAuthnOptions_ = null;
            this.bitField0_ &= -513;
        }

        private void ensurePromptsIsMutable() {
            Internal.ProtobufList<Prompt> protobufList = this.prompts_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.prompts_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAnimatedCoBrandedHeader(Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
            common$AnimatedCoBrandedHeader.getClass();
            Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader2 = this.animatedCoBrandedHeader_;
            if (common$AnimatedCoBrandedHeader2 == null || common$AnimatedCoBrandedHeader2 == Common$AnimatedCoBrandedHeader.getDefaultInstance()) {
                this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
            } else {
                this.animatedCoBrandedHeader_ = Common$AnimatedCoBrandedHeader.newBuilder(this.animatedCoBrandedHeader_).mergeFrom((Common$AnimatedCoBrandedHeader.C6387a) common$AnimatedCoBrandedHeader).buildPartial();
            }
            this.bitField0_ |= 4096;
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

        private void mergeCheckList(Common$CheckList common$CheckList) {
            common$CheckList.getClass();
            if (this.paneContentCase_ != 24 || this.paneContent_ == Common$CheckList.getDefaultInstance()) {
                this.paneContent_ = common$CheckList;
            } else {
                this.paneContent_ = Common$CheckList.newBuilder((Common$CheckList) this.paneContent_).mergeFrom((Common$CheckList.C6410a) common$CheckList).buildPartial();
            }
            this.paneContentCase_ = 24;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6844a) events).buildPartial();
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
            this.bitField0_ |= 8;
        }

        private void mergeHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAsset_ = common$RenderedAssetAppearance;
            } else {
                this.headerAsset_ = Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
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
            this.bitField0_ |= 16384;
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

        private void mergePaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
            common$PaneAutoSubmitOptions.getClass();
            Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
            if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
            } else {
                this.paneAutoSubmitOptions_ = Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((Common$PaneAutoSubmitOptions.C6455b) common$PaneAutoSubmitOptions).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        private void mergePaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
            common$PaneBodyAdornment.getClass();
            Common$PaneBodyAdornment common$PaneBodyAdornment2 = this.paneBodyAdornment_;
            if (common$PaneBodyAdornment2 == null || common$PaneBodyAdornment2 == Common$PaneBodyAdornment.getDefaultInstance()) {
                this.paneBodyAdornment_ = common$PaneBodyAdornment;
            } else {
                this.paneBodyAdornment_ = Common$PaneBodyAdornment.newBuilder(this.paneBodyAdornment_).mergeFrom((Common$PaneBodyAdornment.C6457a) common$PaneBodyAdornment).buildPartial();
            }
            this.bitField0_ |= 2048;
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

        private void mergePopupOptions(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            Common$PopupOptions common$PopupOptions2 = this.popupOptions_;
            if (common$PopupOptions2 == null || common$PopupOptions2 == Common$PopupOptions.getDefaultInstance()) {
                this.popupOptions_ = common$PopupOptions;
            } else {
                this.popupOptions_ = Common$PopupOptions.newBuilder(this.popupOptions_).mergeFrom((Common$PopupOptions.C6466a) common$PopupOptions).buildPartial();
            }
            this.bitField0_ |= 1024;
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

        private void mergeTertiaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.tertiaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.tertiaryButton_ = common$ButtonContent;
            } else {
                this.tertiaryButton_ = Common$ButtonContent.newBuilder(this.tertiaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeWebAuthnOptions(Webauthn$WebAuthnOptions webauthn$WebAuthnOptions) {
            webauthn$WebAuthnOptions.getClass();
            Webauthn$WebAuthnOptions webauthn$WebAuthnOptions2 = this.webAuthnOptions_;
            if (webauthn$WebAuthnOptions2 == null || webauthn$WebAuthnOptions2 == Webauthn$WebAuthnOptions.getDefaultInstance()) {
                this.webAuthnOptions_ = webauthn$WebAuthnOptions;
            } else {
                this.webAuthnOptions_ = Webauthn$WebAuthnOptions.newBuilder(this.webAuthnOptions_).mergeFrom((Webauthn$WebAuthnOptions.C7048a) webauthn$WebAuthnOptions).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static C6846a newBuilder() {
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

        private void removePrompts(int i) {
            ensurePromptsIsMutable();
            this.prompts_.remove(i);
        }

        private void setAnimatedCoBrandedHeader(Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
            common$AnimatedCoBrandedHeader.getClass();
            this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
            this.bitField0_ |= 4096;
        }

        private void setBackgroundDisplayMode(EnumC6923m enumC6923m) {
            this.backgroundDisplayMode_ = enumC6923m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
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

        private void setButtonPlacement(EnumC6929p enumC6929p) {
            this.buttonPlacement_ = enumC6929p.getNumber();
        }

        private void setButtonPlacementValue(int i) {
            this.buttonPlacement_ = i;
        }

        private void setCheckList(Common$CheckList common$CheckList) {
            common$CheckList.getClass();
            this.paneContent_ = common$CheckList;
            this.paneContentCase_ = 24;
        }

        private void setDisclaimerTextPlacement(EnumC6937t enumC6937t) {
            this.disclaimerTextPlacement_ = enumC6937t.getNumber();
        }

        private void setDisclaimerTextPlacementValue(int i) {
            this.disclaimerTextPlacement_ = i;
        }

        private void setDisplayMode(EnumC6897Y enumC6897Y) {
            this.displayMode_ = enumC6897Y.getNumber();
        }

        private void setDisplayModeValue(int i) {
            this.displayMode_ = i;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 256;
        }

        private void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 4;
        }

        private void setInlineErrorText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.inlineErrorText_ = common$LocalizedString;
            this.bitField0_ |= 16384;
        }

        private void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setPaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
            common$PaneAutoSubmitOptions.getClass();
            this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
            this.bitField0_ |= 8192;
        }

        private void setPaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
            common$PaneBodyAdornment.getClass();
            this.paneBodyAdornment_ = common$PaneBodyAdornment;
            this.bitField0_ |= 2048;
        }

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setPasskeysDisplayMode(EnumC6848c enumC6848c) {
            this.passkeysDisplayMode_ = enumC6848c.getNumber();
        }

        private void setPasskeysDisplayModeValue(int i) {
            this.passkeysDisplayMode_ = i;
        }

        private void setPopupOptions(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            this.popupOptions_ = common$PopupOptions;
            this.bitField0_ |= 1024;
        }

        private void setPrompts(int i, Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.set(i, prompt);
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 64;
        }

        private void setTertiaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.tertiaryButton_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setTextAlign(EnumC6831U enumC6831U) {
            this.textAlign_ = enumC6831U.getNumber();
        }

        private void setTextAlignValue(int i) {
            this.textAlign_ = i;
        }

        private void setWebAuthnOptions(Webauthn$WebAuthnOptions webauthn$WebAuthnOptions) {
            webauthn$WebAuthnOptions.getClass();
            this.webAuthnOptions_ = webauthn$WebAuthnOptions;
            this.bitField0_ |= 512;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6846a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0001\u0001\u0002\u001a\u0017\u0000\u0001\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\bဉ\u0005\tဉ\u0006\nဉ\b\u000b\f\fဉ\u0004\rဉ\u0001\u000e\f\u000f\f\u0010\f\u0011ဉ\t\u0012\f\u0013ဉ\u0007\u0014ဉ\n\u0015ဉ\u000b\u0016ဉ\f\u0017ဉ\r\u0018<\u0000\u0019\f\u001aဉ\u000e", new Object[]{"paneContent_", "paneContentCase_", "bitField0_", "institution_", "headerAsset_", "header_", "prompts_", Prompt.class, "button_", "secondaryButton_", "events_", "displayMode_", "buttonDisclaimerText_", "paneHeader_", "textAlign_", "buttonPlacement_", "passkeysDisplayMode_", "webAuthnOptions_", "disclaimerTextPlacement_", "tertiaryButton_", "popupOptions_", "paneBodyAdornment_", "animatedCoBrandedHeader_", "paneAutoSubmitOptions_", Common$CheckList.class, "backgroundDisplayMode_", "inlineErrorText_"});
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

        public Common$AnimatedCoBrandedHeader getAnimatedCoBrandedHeader() {
            Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader = this.animatedCoBrandedHeader_;
            return common$AnimatedCoBrandedHeader == null ? Common$AnimatedCoBrandedHeader.getDefaultInstance() : common$AnimatedCoBrandedHeader;
        }

        public EnumC6923m getBackgroundDisplayMode() {
            EnumC6923m enumC6923mForNumber = EnumC6923m.forNumber(this.backgroundDisplayMode_);
            return enumC6923mForNumber == null ? EnumC6923m.UNRECOGNIZED : enumC6923mForNumber;
        }

        public int getBackgroundDisplayModeValue() {
            return this.backgroundDisplayMode_;
        }

        public Common$ButtonContent getButton() {
            Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getButtonDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public EnumC6929p getButtonPlacement() {
            EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
            return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
        }

        public int getButtonPlacementValue() {
            return this.buttonPlacement_;
        }

        public Common$CheckList getCheckList() {
            return this.paneContentCase_ == 24 ? (Common$CheckList) this.paneContent_ : Common$CheckList.getDefaultInstance();
        }

        public EnumC6937t getDisclaimerTextPlacement() {
            EnumC6937t enumC6937tForNumber = EnumC6937t.forNumber(this.disclaimerTextPlacement_);
            return enumC6937tForNumber == null ? EnumC6937t.UNRECOGNIZED : enumC6937tForNumber;
        }

        public int getDisclaimerTextPlacementValue() {
            return this.disclaimerTextPlacement_;
        }

        public EnumC6897Y getDisplayMode() {
            EnumC6897Y enumC6897YForNumber = EnumC6897Y.forNumber(this.displayMode_);
            return enumC6897YForNumber == null ? EnumC6897Y.UNRECOGNIZED : enumC6897YForNumber;
        }

        public int getDisplayModeValue() {
            return this.displayMode_;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$RenderedAssetAppearance getHeaderAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public Common$LocalizedString getInlineErrorText() {
            Common$LocalizedString common$LocalizedString = this.inlineErrorText_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
            Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
            return common$PaneAutoSubmitOptions == null ? Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
        }

        public Common$PaneBodyAdornment getPaneBodyAdornment() {
            Common$PaneBodyAdornment common$PaneBodyAdornment = this.paneBodyAdornment_;
            return common$PaneBodyAdornment == null ? Common$PaneBodyAdornment.getDefaultInstance() : common$PaneBodyAdornment;
        }

        public EnumC6847b getPaneContentCase() {
            return EnumC6847b.forNumber(this.paneContentCase_);
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public EnumC6848c getPasskeysDisplayMode() {
            EnumC6848c enumC6848cForNumber = EnumC6848c.forNumber(this.passkeysDisplayMode_);
            return enumC6848cForNumber == null ? EnumC6848c.UNRECOGNIZED : enumC6848cForNumber;
        }

        public int getPasskeysDisplayModeValue() {
            return this.passkeysDisplayMode_;
        }

        public Common$PopupOptions getPopupOptions() {
            Common$PopupOptions common$PopupOptions = this.popupOptions_;
            return common$PopupOptions == null ? Common$PopupOptions.getDefaultInstance() : common$PopupOptions;
        }

        public Prompt getPrompts(int i) {
            return this.prompts_.get(i);
        }

        public int getPromptsCount() {
            return this.prompts_.size();
        }

        public List<Prompt> getPromptsList() {
            return this.prompts_;
        }

        public InterfaceC6849d getPromptsOrBuilder(int i) {
            return this.prompts_.get(i);
        }

        public List<? extends InterfaceC6849d> getPromptsOrBuilderList() {
            return this.prompts_;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getTertiaryButton() {
            Common$ButtonContent common$ButtonContent = this.tertiaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public EnumC6831U getTextAlign() {
            EnumC6831U enumC6831UForNumber = EnumC6831U.forNumber(this.textAlign_);
            return enumC6831UForNumber == null ? EnumC6831U.UNRECOGNIZED : enumC6831UForNumber;
        }

        public int getTextAlignValue() {
            return this.textAlign_;
        }

        public Webauthn$WebAuthnOptions getWebAuthnOptions() {
            Webauthn$WebAuthnOptions webauthn$WebAuthnOptions = this.webAuthnOptions_;
            return webauthn$WebAuthnOptions == null ? Webauthn$WebAuthnOptions.getDefaultInstance() : webauthn$WebAuthnOptions;
        }

        public boolean hasAnimatedCoBrandedHeader() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasButton() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCheckList() {
            return this.paneContentCase_ == 24;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasHeaderAsset() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasInlineErrorText() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPaneAutoSubmitOptions() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasPaneBodyAdornment() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPopupOptions() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasTertiaryButton() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasWebAuthnOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        public static C6846a newBuilder(Rendering rendering) {
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

        private void addPrompts(int i, Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.add(i, prompt);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane$a */
    public static final class C6850a extends GeneratedMessageLite.Builder<UserInputPaneOuterClass$UserInputPane, C6850a> implements MessageLiteOrBuilder {
        public C6850a() {
            super(UserInputPaneOuterClass$UserInputPane.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInputPaneOuterClass$UserInputPane userInputPaneOuterClass$UserInputPane = new UserInputPaneOuterClass$UserInputPane();
        DEFAULT_INSTANCE = userInputPaneOuterClass$UserInputPane;
        GeneratedMessageLite.registerDefaultInstance(UserInputPaneOuterClass$UserInputPane.class, userInputPaneOuterClass$UserInputPane);
    }

    private UserInputPaneOuterClass$UserInputPane() {
    }

    public static UserInputPaneOuterClass$UserInputPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6850a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInputPaneOuterClass$UserInputPane parseDelimitedFrom(InputStream inputStream) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(ByteBuffer byteBuffer) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserInputPaneOuterClass$UserInputPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6944w0.f2613a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserInputPaneOuterClass$UserInputPane();
            case 2:
                return new C6850a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserInputPaneOuterClass$UserInputPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UserInputPaneOuterClass$UserInputPane.class) {
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

    public static C6850a newBuilder(UserInputPaneOuterClass$UserInputPane userInputPaneOuterClass$UserInputPane) {
        return DEFAULT_INSTANCE.createBuilder(userInputPaneOuterClass$UserInputPane);
    }

    public static UserInputPaneOuterClass$UserInputPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(ByteString byteString) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(byte[] bArr) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(InputStream inputStream) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(CodedInputStream codedInputStream) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserInputPaneOuterClass$UserInputPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInputPaneOuterClass$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
