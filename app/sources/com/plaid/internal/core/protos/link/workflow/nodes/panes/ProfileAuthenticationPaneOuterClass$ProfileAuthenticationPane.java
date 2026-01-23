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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane extends GeneratedMessageLite<ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane, C6785b> implements MessageLiteOrBuilder {
    private static final ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane DEFAULT_INSTANCE;
    private static volatile Parser<ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6755b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 13;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EDIT_PROFILE_IDENTIFIER_TAP_FIELD_NUMBER = 18;
        public static final int EXIT_FIELD_NUMBER = 2;
        public static final int MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 16;
        public static final int PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 10;
        private static volatile Parser<Actions> PARSER = null;
        public static final int PROFILE_CHIP_OPTION_SELECT_FIELD_NUMBER = 17;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 12;
        public static final int SUBMIT_FIELD_NUMBER = 9;
        public static final int SUCCESS_FIELD_NUMBER = 11;
        public static final int TRANSITION_COMPLETION_FIELD_NUMBER = 14;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, C6740a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ButtonDisclaimerTapAction$a */
            public static final class C6740a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, C6740a> implements MessageLiteOrBuilder {
                public C6740a() {
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

            public static C6740a newBuilder() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new C6740a();
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

            public static C6740a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
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

        public static final class EditProfileIdentifierAction extends GeneratedMessageLite<EditProfileIdentifierAction, C6741a> implements MessageLiteOrBuilder {
            private static final EditProfileIdentifierAction DEFAULT_INSTANCE;
            private static volatile Parser<EditProfileIdentifierAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$EditProfileIdentifierAction$a */
            public static final class C6741a extends GeneratedMessageLite.Builder<EditProfileIdentifierAction, C6741a> implements MessageLiteOrBuilder {
                public C6741a() {
                    super(EditProfileIdentifierAction.DEFAULT_INSTANCE);
                }
            }

            static {
                EditProfileIdentifierAction editProfileIdentifierAction = new EditProfileIdentifierAction();
                DEFAULT_INSTANCE = editProfileIdentifierAction;
                GeneratedMessageLite.registerDefaultInstance(EditProfileIdentifierAction.class, editProfileIdentifierAction);
            }

            private EditProfileIdentifierAction() {
            }

            public static EditProfileIdentifierAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6741a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EditProfileIdentifierAction parseDelimitedFrom(InputStream inputStream) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditProfileIdentifierAction parseFrom(ByteBuffer byteBuffer) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EditProfileIdentifierAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EditProfileIdentifierAction();
                    case 2:
                        return new C6741a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EditProfileIdentifierAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EditProfileIdentifierAction.class) {
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

            public static C6741a newBuilder(EditProfileIdentifierAction editProfileIdentifierAction) {
                return DEFAULT_INSTANCE.createBuilder(editProfileIdentifierAction);
            }

            public static EditProfileIdentifierAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditProfileIdentifierAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EditProfileIdentifierAction parseFrom(ByteString byteString) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EditProfileIdentifierAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EditProfileIdentifierAction parseFrom(byte[] bArr) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EditProfileIdentifierAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EditProfileIdentifierAction parseFrom(InputStream inputStream) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditProfileIdentifierAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditProfileIdentifierAction parseFrom(CodedInputStream codedInputStream) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EditProfileIdentifierAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditProfileIdentifierAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6742a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ExitAction$a */
            public static final class C6742a extends GeneratedMessageLite.Builder<ExitAction, C6742a> implements MessageLiteOrBuilder {
                public C6742a() {
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

            public static C6742a newBuilder() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6742a();
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

            public static C6742a newBuilder(ExitAction exitAction) {
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

        public static final class ModalFlexibleComponentsButtonOneTapAction extends GeneratedMessageLite<ModalFlexibleComponentsButtonOneTapAction, C6744a> implements MessageLiteOrBuilder {
            private static final ModalFlexibleComponentsButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ModalFlexibleComponentsButtonOneTapAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6743a> implements MessageLiteOrBuilder {
                public static final int COMPONENT_ID_FIELD_NUMBER = 1;
                private static final Response DEFAULT_INSTANCE;
                private static volatile Parser<Response> PARSER;
                private String componentId_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ModalFlexibleComponentsButtonOneTapAction$Response$a */
                public static final class C6743a extends GeneratedMessageLite.Builder<Response, C6743a> implements MessageLiteOrBuilder {
                    public C6743a() {
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

                public static C6743a newBuilder() {
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
                    switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6743a();
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

                public static C6743a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ModalFlexibleComponentsButtonOneTapAction$a */
            public static final class C6744a extends GeneratedMessageLite.Builder<ModalFlexibleComponentsButtonOneTapAction, C6744a> implements MessageLiteOrBuilder {
                public C6744a() {
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
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6743a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6744a newBuilder() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ModalFlexibleComponentsButtonOneTapAction();
                    case 2:
                        return new C6744a();
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

            public static C6744a newBuilder(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
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

        public static final class PaneBodyAdornmentButtonTapAction extends GeneratedMessageLite<PaneBodyAdornmentButtonTapAction, C6745a> implements MessageLiteOrBuilder {
            private static final PaneBodyAdornmentButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<PaneBodyAdornmentButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$PaneBodyAdornmentButtonTapAction$a */
            public static final class C6745a extends GeneratedMessageLite.Builder<PaneBodyAdornmentButtonTapAction, C6745a> implements MessageLiteOrBuilder {
                public C6745a() {
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

            public static C6745a newBuilder() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PaneBodyAdornmentButtonTapAction();
                    case 2:
                        return new C6745a();
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

            public static C6745a newBuilder(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
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

        public static final class ProfileChipOptionSelectAction extends GeneratedMessageLite<ProfileChipOptionSelectAction, C6747a> implements MessageLiteOrBuilder {
            private static final ProfileChipOptionSelectAction DEFAULT_INSTANCE;
            private static volatile Parser<ProfileChipOptionSelectAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6746a> implements MessageLiteOrBuilder {
                private static final Response DEFAULT_INSTANCE;
                private static volatile Parser<Response> PARSER = null;
                public static final int SELECTED_OPTION_FIELD_NUMBER = 1;
                private String selectedOption_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ProfileChipOptionSelectAction$Response$a */
                public static final class C6746a extends GeneratedMessageLite.Builder<Response, C6746a> implements MessageLiteOrBuilder {
                    public C6746a() {
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

                private void clearSelectedOption() {
                    this.selectedOption_ = getDefaultInstance().getSelectedOption();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6746a newBuilder() {
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

                private void setSelectedOption(String str) {
                    str.getClass();
                    this.selectedOption_ = str;
                }

                private void setSelectedOptionBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectedOption_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6746a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"selectedOption_"});
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

                public String getSelectedOption() {
                    return this.selectedOption_;
                }

                public ByteString getSelectedOptionBytes() {
                    return ByteString.copyFromUtf8(this.selectedOption_);
                }

                public static C6746a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$ProfileChipOptionSelectAction$a */
            public static final class C6747a extends GeneratedMessageLite.Builder<ProfileChipOptionSelectAction, C6747a> implements MessageLiteOrBuilder {
                public C6747a() {
                    super(ProfileChipOptionSelectAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ProfileChipOptionSelectAction profileChipOptionSelectAction = new ProfileChipOptionSelectAction();
                DEFAULT_INSTANCE = profileChipOptionSelectAction;
                GeneratedMessageLite.registerDefaultInstance(ProfileChipOptionSelectAction.class, profileChipOptionSelectAction);
            }

            private ProfileChipOptionSelectAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static ProfileChipOptionSelectAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6746a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6747a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ProfileChipOptionSelectAction parseDelimitedFrom(InputStream inputStream) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProfileChipOptionSelectAction parseFrom(ByteBuffer byteBuffer) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ProfileChipOptionSelectAction> parser() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ProfileChipOptionSelectAction();
                    case 2:
                        return new C6747a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ProfileChipOptionSelectAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ProfileChipOptionSelectAction.class) {
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

            public static C6747a newBuilder(ProfileChipOptionSelectAction profileChipOptionSelectAction) {
                return DEFAULT_INSTANCE.createBuilder(profileChipOptionSelectAction);
            }

            public static ProfileChipOptionSelectAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ProfileChipOptionSelectAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ProfileChipOptionSelectAction parseFrom(ByteString byteString) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ProfileChipOptionSelectAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ProfileChipOptionSelectAction parseFrom(byte[] bArr) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ProfileChipOptionSelectAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ProfileChipOptionSelectAction parseFrom(InputStream inputStream) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProfileChipOptionSelectAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ProfileChipOptionSelectAction parseFrom(CodedInputStream codedInputStream) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ProfileChipOptionSelectAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileChipOptionSelectAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6748a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6748a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6748a> implements MessageLiteOrBuilder {
                public C6748a() {
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

            public static C6748a newBuilder() {
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
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6748a();
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

            public static C6748a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        public static final class SkipAction extends GeneratedMessageLite<SkipAction, C6749a> implements MessageLiteOrBuilder {
            private static final SkipAction DEFAULT_INSTANCE;
            private static volatile Parser<SkipAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$SkipAction$a */
            public static final class C6749a extends GeneratedMessageLite.Builder<SkipAction, C6749a> implements MessageLiteOrBuilder {
                public C6749a() {
                    super(SkipAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SkipAction skipAction = new SkipAction();
                DEFAULT_INSTANCE = skipAction;
                GeneratedMessageLite.registerDefaultInstance(SkipAction.class, skipAction);
            }

            private SkipAction() {
            }

            public static SkipAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6749a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SkipAction parseDelimitedFrom(InputStream inputStream) {
                return (SkipAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SkipAction parseFrom(ByteBuffer byteBuffer) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SkipAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SkipAction();
                    case 2:
                        return new C6749a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SkipAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SkipAction.class) {
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

            public static C6749a newBuilder(SkipAction skipAction) {
                return DEFAULT_INSTANCE.createBuilder(skipAction);
            }

            public static SkipAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SkipAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SkipAction parseFrom(ByteString byteString) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SkipAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SkipAction parseFrom(byte[] bArr) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SkipAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SkipAction parseFrom(InputStream inputStream) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SkipAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SkipAction parseFrom(CodedInputStream codedInputStream) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SkipAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SkipAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6751a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int PROMPT_RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private PromptResponse promptResponse_;

            public static final class PromptResponse extends GeneratedMessageLite<PromptResponse, C6750a> implements MessageLiteOrBuilder {
                public static final int AUTO_SUBMIT_BEHAVIOR_FIELD_NUMBER = 4;
                public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
                private static final PromptResponse DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<PromptResponse> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int autoSubmitBehavior_;
                private String inputId_ = "";
                private String value_ = "";
                private String countryCode_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$SubmitAction$PromptResponse$a */
                public static final class C6750a extends GeneratedMessageLite.Builder<PromptResponse, C6750a> implements MessageLiteOrBuilder {
                    public C6750a() {
                        super(PromptResponse.DEFAULT_INSTANCE);
                    }
                }

                static {
                    PromptResponse promptResponse = new PromptResponse();
                    DEFAULT_INSTANCE = promptResponse;
                    GeneratedMessageLite.registerDefaultInstance(PromptResponse.class, promptResponse);
                }

                private PromptResponse() {
                }

                private void clearAutoSubmitBehavior() {
                    this.autoSubmitBehavior_ = 0;
                }

                private void clearCountryCode() {
                    this.countryCode_ = getDefaultInstance().getCountryCode();
                }

                private void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                private void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static PromptResponse getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6750a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static PromptResponse parseDelimitedFrom(InputStream inputStream) {
                    return (PromptResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static PromptResponse parseFrom(ByteBuffer byteBuffer) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<PromptResponse> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setAutoSubmitBehavior(Common$AutoSubmitConfiguration.EnumC6396b enumC6396b) {
                    this.autoSubmitBehavior_ = enumC6396b.getNumber();
                }

                private void setAutoSubmitBehaviorValue(int i) {
                    this.autoSubmitBehavior_ = i;
                }

                private void setCountryCode(String str) {
                    str.getClass();
                    this.countryCode_ = str;
                }

                private void setCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.countryCode_ = byteString.toStringUtf8();
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
                    switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new PromptResponse();
                        case 2:
                            return new C6750a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"inputId_", "value_", "countryCode_", "autoSubmitBehavior_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<PromptResponse> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (PromptResponse.class) {
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

                public String getCountryCode() {
                    return this.countryCode_;
                }

                public ByteString getCountryCodeBytes() {
                    return ByteString.copyFromUtf8(this.countryCode_);
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

                public static C6750a newBuilder(PromptResponse promptResponse) {
                    return DEFAULT_INSTANCE.createBuilder(promptResponse);
                }

                public static PromptResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static PromptResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static PromptResponse parseFrom(ByteString byteString) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static PromptResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static PromptResponse parseFrom(byte[] bArr) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static PromptResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static PromptResponse parseFrom(InputStream inputStream) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static PromptResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static PromptResponse parseFrom(CodedInputStream codedInputStream) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static PromptResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PromptResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$SubmitAction$a */
            public static final class C6751a extends GeneratedMessageLite.Builder<SubmitAction, C6751a> implements MessageLiteOrBuilder {
                public C6751a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearPromptResponse() {
                this.promptResponse_ = null;
                this.bitField0_ &= -2;
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergePromptResponse(PromptResponse promptResponse) {
                promptResponse.getClass();
                PromptResponse promptResponse2 = this.promptResponse_;
                if (promptResponse2 == null || promptResponse2 == PromptResponse.getDefaultInstance()) {
                    this.promptResponse_ = promptResponse;
                } else {
                    this.promptResponse_ = PromptResponse.newBuilder(this.promptResponse_).mergeFrom((PromptResponse.C6750a) promptResponse).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6751a newBuilder() {
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

            private void setPromptResponse(PromptResponse promptResponse) {
                promptResponse.getClass();
                this.promptResponse_ = promptResponse;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6751a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "promptResponse_"});
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

            public PromptResponse getPromptResponse() {
                PromptResponse promptResponse = this.promptResponse_;
                return promptResponse == null ? PromptResponse.getDefaultInstance() : promptResponse;
            }

            public boolean hasPromptResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6751a newBuilder(SubmitAction submitAction) {
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

        public static final class SuccessAction extends GeneratedMessageLite<SuccessAction, C6752a> implements MessageLiteOrBuilder {
            private static final SuccessAction DEFAULT_INSTANCE;
            private static volatile Parser<SuccessAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$SuccessAction$a */
            public static final class C6752a extends GeneratedMessageLite.Builder<SuccessAction, C6752a> implements MessageLiteOrBuilder {
                public C6752a() {
                    super(SuccessAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SuccessAction successAction = new SuccessAction();
                DEFAULT_INSTANCE = successAction;
                GeneratedMessageLite.registerDefaultInstance(SuccessAction.class, successAction);
            }

            private SuccessAction() {
            }

            public static SuccessAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6752a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SuccessAction parseDelimitedFrom(InputStream inputStream) {
                return (SuccessAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SuccessAction parseFrom(ByteBuffer byteBuffer) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SuccessAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SuccessAction();
                    case 2:
                        return new C6752a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SuccessAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SuccessAction.class) {
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

            public static C6752a newBuilder(SuccessAction successAction) {
                return DEFAULT_INSTANCE.createBuilder(successAction);
            }

            public static SuccessAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SuccessAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SuccessAction parseFrom(ByteString byteString) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SuccessAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SuccessAction parseFrom(byte[] bArr) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SuccessAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SuccessAction parseFrom(InputStream inputStream) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SuccessAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SuccessAction parseFrom(CodedInputStream codedInputStream) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SuccessAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SuccessAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TransitionCompletionAction extends GeneratedMessageLite<TransitionCompletionAction, C6753a> implements MessageLiteOrBuilder {
            private static final TransitionCompletionAction DEFAULT_INSTANCE;
            private static volatile Parser<TransitionCompletionAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$TransitionCompletionAction$a */
            public static final class C6753a extends GeneratedMessageLite.Builder<TransitionCompletionAction, C6753a> implements MessageLiteOrBuilder {
                public C6753a() {
                    super(TransitionCompletionAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TransitionCompletionAction transitionCompletionAction = new TransitionCompletionAction();
                DEFAULT_INSTANCE = transitionCompletionAction;
                GeneratedMessageLite.registerDefaultInstance(TransitionCompletionAction.class, transitionCompletionAction);
            }

            private TransitionCompletionAction() {
            }

            public static TransitionCompletionAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6753a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TransitionCompletionAction parseDelimitedFrom(InputStream inputStream) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransitionCompletionAction parseFrom(ByteBuffer byteBuffer) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TransitionCompletionAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TransitionCompletionAction();
                    case 2:
                        return new C6753a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TransitionCompletionAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TransitionCompletionAction.class) {
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

            public static C6753a newBuilder(TransitionCompletionAction transitionCompletionAction) {
                return DEFAULT_INSTANCE.createBuilder(transitionCompletionAction);
            }

            public static TransitionCompletionAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransitionCompletionAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TransitionCompletionAction parseFrom(ByteString byteString) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TransitionCompletionAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TransitionCompletionAction parseFrom(byte[] bArr) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TransitionCompletionAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TransitionCompletionAction parseFrom(InputStream inputStream) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransitionCompletionAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransitionCompletionAction parseFrom(CodedInputStream codedInputStream) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TransitionCompletionAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransitionCompletionAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$a */
        public enum EnumC6754a {
            SUBMIT(9),
            EXIT(2),
            PANE_BODY_ADORNMENT_BUTTON_TAP(10),
            SUCCESS(11),
            SECONDARY_BUTTON_TAP(12),
            BUTTON_DISCLAIMER_TAP(13),
            TRANSITION_COMPLETION(14),
            MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP(16),
            PROFILE_CHIP_OPTION_SELECT(17),
            EDIT_PROFILE_IDENTIFIER_TAP(18),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2437a;

            EnumC6754a(int i) {
                this.f2437a = i;
            }

            public static EnumC6754a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 2) {
                    return EXIT;
                }
                switch (i) {
                    case 9:
                        return SUBMIT;
                    case 10:
                        return PANE_BODY_ADORNMENT_BUTTON_TAP;
                    case 11:
                        return SUCCESS;
                    case 12:
                        return SECONDARY_BUTTON_TAP;
                    case 13:
                        return BUTTON_DISCLAIMER_TAP;
                    case 14:
                        return TRANSITION_COMPLETION;
                    default:
                        switch (i) {
                            case 16:
                                return MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP;
                            case 17:
                                return PROFILE_CHIP_OPTION_SELECT;
                            case 18:
                                return EDIT_PROFILE_IDENTIFIER_TAP;
                            default:
                                return null;
                        }
                }
            }

            public int getNumber() {
                return this.f2437a;
            }

            @Deprecated
            public static EnumC6754a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Actions$b */
        public static final class C6755b extends GeneratedMessageLite.Builder<Actions, C6755b> implements MessageLiteOrBuilder {
            public C6755b() {
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
            if (this.actionCase_ == 13) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearEditProfileIdentifierTap() {
            if (this.actionCase_ == 18) {
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
            if (this.actionCase_ == 16) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearPaneBodyAdornmentButtonTap() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearProfileChipOptionSelect() {
            if (this.actionCase_ == 17) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonTap() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 9) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSuccess() {
            if (this.actionCase_ == 11) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTransitionCompletion() {
            if (this.actionCase_ == 14) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            if (this.actionCase_ != 13 || this.action_ == ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.C6740a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 13;
        }

        private void mergeEditProfileIdentifierTap(EditProfileIdentifierAction editProfileIdentifierAction) {
            editProfileIdentifierAction.getClass();
            if (this.actionCase_ != 18 || this.action_ == EditProfileIdentifierAction.getDefaultInstance()) {
                this.action_ = editProfileIdentifierAction;
            } else {
                this.action_ = EditProfileIdentifierAction.newBuilder((EditProfileIdentifierAction) this.action_).mergeFrom((EditProfileIdentifierAction.C6741a) editProfileIdentifierAction).buildPartial();
            }
            this.actionCase_ = 18;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6742a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeModalFlexibleComponentsButtonOneTap(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            modalFlexibleComponentsButtonOneTapAction.getClass();
            if (this.actionCase_ != 16 || this.action_ == ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance()) {
                this.action_ = modalFlexibleComponentsButtonOneTapAction;
            } else {
                this.action_ = ModalFlexibleComponentsButtonOneTapAction.newBuilder((ModalFlexibleComponentsButtonOneTapAction) this.action_).mergeFrom((ModalFlexibleComponentsButtonOneTapAction.C6744a) modalFlexibleComponentsButtonOneTapAction).buildPartial();
            }
            this.actionCase_ = 16;
        }

        private void mergePaneBodyAdornmentButtonTap(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            paneBodyAdornmentButtonTapAction.getClass();
            if (this.actionCase_ != 10 || this.action_ == PaneBodyAdornmentButtonTapAction.getDefaultInstance()) {
                this.action_ = paneBodyAdornmentButtonTapAction;
            } else {
                this.action_ = PaneBodyAdornmentButtonTapAction.newBuilder((PaneBodyAdornmentButtonTapAction) this.action_).mergeFrom((PaneBodyAdornmentButtonTapAction.C6745a) paneBodyAdornmentButtonTapAction).buildPartial();
            }
            this.actionCase_ = 10;
        }

        private void mergeProfileChipOptionSelect(ProfileChipOptionSelectAction profileChipOptionSelectAction) {
            profileChipOptionSelectAction.getClass();
            if (this.actionCase_ != 17 || this.action_ == ProfileChipOptionSelectAction.getDefaultInstance()) {
                this.action_ = profileChipOptionSelectAction;
            } else {
                this.action_ = ProfileChipOptionSelectAction.newBuilder((ProfileChipOptionSelectAction) this.action_).mergeFrom((ProfileChipOptionSelectAction.C6747a) profileChipOptionSelectAction).buildPartial();
            }
            this.actionCase_ = 17;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 12 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6748a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 12;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 9 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6751a) submitAction).buildPartial();
            }
            this.actionCase_ = 9;
        }

        private void mergeSuccess(SuccessAction successAction) {
            successAction.getClass();
            if (this.actionCase_ != 11 || this.action_ == SuccessAction.getDefaultInstance()) {
                this.action_ = successAction;
            } else {
                this.action_ = SuccessAction.newBuilder((SuccessAction) this.action_).mergeFrom((SuccessAction.C6752a) successAction).buildPartial();
            }
            this.actionCase_ = 11;
        }

        private void mergeTransitionCompletion(TransitionCompletionAction transitionCompletionAction) {
            transitionCompletionAction.getClass();
            if (this.actionCase_ != 14 || this.action_ == TransitionCompletionAction.getDefaultInstance()) {
                this.action_ = transitionCompletionAction;
            } else {
                this.action_ = TransitionCompletionAction.newBuilder((TransitionCompletionAction) this.action_).mergeFrom((TransitionCompletionAction.C6753a) transitionCompletionAction).buildPartial();
            }
            this.actionCase_ = 14;
        }

        public static C6755b newBuilder() {
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
            this.actionCase_ = 13;
        }

        private void setEditProfileIdentifierTap(EditProfileIdentifierAction editProfileIdentifierAction) {
            editProfileIdentifierAction.getClass();
            this.action_ = editProfileIdentifierAction;
            this.actionCase_ = 18;
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setModalFlexibleComponentsButtonOneTap(ModalFlexibleComponentsButtonOneTapAction modalFlexibleComponentsButtonOneTapAction) {
            modalFlexibleComponentsButtonOneTapAction.getClass();
            this.action_ = modalFlexibleComponentsButtonOneTapAction;
            this.actionCase_ = 16;
        }

        private void setPaneBodyAdornmentButtonTap(PaneBodyAdornmentButtonTapAction paneBodyAdornmentButtonTapAction) {
            paneBodyAdornmentButtonTapAction.getClass();
            this.action_ = paneBodyAdornmentButtonTapAction;
            this.actionCase_ = 10;
        }

        private void setProfileChipOptionSelect(ProfileChipOptionSelectAction profileChipOptionSelectAction) {
            profileChipOptionSelectAction.getClass();
            this.action_ = profileChipOptionSelectAction;
            this.actionCase_ = 17;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 12;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 9;
        }

        private void setSuccess(SuccessAction successAction) {
            successAction.getClass();
            this.action_ = successAction;
            this.actionCase_ = 11;
        }

        private void setTransitionCompletion(TransitionCompletionAction transitionCompletionAction) {
            transitionCompletionAction.getClass();
            this.action_ = transitionCompletionAction;
            this.actionCase_ = 14;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6755b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u0012\n\u0000\u0000\u0000\u0002<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"action_", "actionCase_", ExitAction.class, SubmitAction.class, PaneBodyAdornmentButtonTapAction.class, SuccessAction.class, SecondaryButtonTapAction.class, ButtonDisclaimerTapAction.class, TransitionCompletionAction.class, ModalFlexibleComponentsButtonOneTapAction.class, ProfileChipOptionSelectAction.class, EditProfileIdentifierAction.class});
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

        public EnumC6754a getActionCase() {
            return EnumC6754a.forNumber(this.actionCase_);
        }

        public ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 13 ? (ButtonDisclaimerTapAction) this.action_ : ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public EditProfileIdentifierAction getEditProfileIdentifierTap() {
            return this.actionCase_ == 18 ? (EditProfileIdentifierAction) this.action_ : EditProfileIdentifierAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public ModalFlexibleComponentsButtonOneTapAction getModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 16 ? (ModalFlexibleComponentsButtonOneTapAction) this.action_ : ModalFlexibleComponentsButtonOneTapAction.getDefaultInstance();
        }

        public PaneBodyAdornmentButtonTapAction getPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 10 ? (PaneBodyAdornmentButtonTapAction) this.action_ : PaneBodyAdornmentButtonTapAction.getDefaultInstance();
        }

        public ProfileChipOptionSelectAction getProfileChipOptionSelect() {
            return this.actionCase_ == 17 ? (ProfileChipOptionSelectAction) this.action_ : ProfileChipOptionSelectAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 12 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 9 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public SuccessAction getSuccess() {
            return this.actionCase_ == 11 ? (SuccessAction) this.action_ : SuccessAction.getDefaultInstance();
        }

        public TransitionCompletionAction getTransitionCompletion() {
            return this.actionCase_ == 14 ? (TransitionCompletionAction) this.action_ : TransitionCompletionAction.getDefaultInstance();
        }

        public boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 13;
        }

        public boolean hasEditProfileIdentifierTap() {
            return this.actionCase_ == 18;
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasModalFlexibleComponentsButtonOneTap() {
            return this.actionCase_ == 16;
        }

        public boolean hasPaneBodyAdornmentButtonTap() {
            return this.actionCase_ == 10;
        }

        public boolean hasProfileChipOptionSelect() {
            return this.actionCase_ == 17;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 12;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 9;
        }

        public boolean hasSuccess() {
            return this.actionCase_ == 11;
        }

        public boolean hasTransitionCompletion() {
            return this.actionCase_ == 14;
        }

        public static C6755b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6783b> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 17;
        public static final int OTP_ENTRY_RENDERING_FIELD_NUMBER = 2;
        public static final int PANE_BRANDING_FIELD_NUMBER = 19;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PASSKEY_AUTHENTICATION_RENDERING_FIELD_NUMBER = 4;
        public static final int PASSKEY_CREATION_RENDERING_FIELD_NUMBER = 3;
        public static final int PROFILE_IDENTIFIER_ENTRY_RENDERING_FIELD_NUMBER = 1;
        public static final int TRANSIENT_RENDERING_FIELD_NUMBER = 5;
        public static final int USE_PANE_CONTROLLED_LOGIC_FIELD_NUMBER = 18;
        private int authenticationStepCase_ = 0;
        private Object authenticationStep_;
        private int bitField0_;
        private Events events_;
        private int paneBranding_;
        private boolean usePaneControlledLogic_;

        public static final class BypassPhoneNumberWarningRendering extends GeneratedMessageLite<BypassPhoneNumberWarningRendering, C6756a> implements MessageLiteOrBuilder {
            public static final int ANIMATION_FIELD_NUMBER = 5;
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 4;
            public static final int CLIENT_LOGO_FIELD_NUMBER = 2;
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final BypassPhoneNumberWarningRendering DEFAULT_INSTANCE;
            private static volatile Parser<BypassPhoneNumberWarningRendering> PARSER = null;
            public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
            private int animation_;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private Common$RenderedAssetAppearance clientLogo_;
            private Common$TextContent content_;
            private Common$TextContent primaryText_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$BypassPhoneNumberWarningRendering$a */
            public static final class C6756a extends GeneratedMessageLite.Builder<BypassPhoneNumberWarningRendering, C6756a> implements MessageLiteOrBuilder {
                public C6756a() {
                    super(BypassPhoneNumberWarningRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering = new BypassPhoneNumberWarningRendering();
                DEFAULT_INSTANCE = bypassPhoneNumberWarningRendering;
                GeneratedMessageLite.registerDefaultInstance(BypassPhoneNumberWarningRendering.class, bypassPhoneNumberWarningRendering);
            }

            private BypassPhoneNumberWarningRendering() {
            }

            private void clearAnimation() {
                this.animation_ = 0;
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearClientLogo() {
                this.clientLogo_ = null;
                this.bitField0_ &= -3;
            }

            private void clearContent() {
                this.content_ = null;
                this.bitField0_ &= -5;
            }

            private void clearPrimaryText() {
                this.primaryText_ = null;
                this.bitField0_ &= -2;
            }

            public static BypassPhoneNumberWarningRendering getDefaultInstance() {
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
                this.bitField0_ |= 2;
            }

            private void mergeContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.content_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.content_ = common$TextContent;
                } else {
                    this.content_ = Common$TextContent.newBuilder(this.content_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergePrimaryText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.primaryText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.primaryText_ = common$TextContent;
                } else {
                    this.primaryText_ = Common$TextContent.newBuilder(this.primaryText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6756a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static BypassPhoneNumberWarningRendering parseDelimitedFrom(InputStream inputStream) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(ByteBuffer byteBuffer) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<BypassPhoneNumberWarningRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAnimation(EnumC6784a enumC6784a) {
                this.animation_ = enumC6784a.getNumber();
            }

            private void setAnimationValue(int i) {
                this.animation_ = i;
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            private void setClientLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.clientLogo_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 2;
            }

            private void setContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.content_ = common$TextContent;
                this.bitField0_ |= 4;
            }

            private void setPrimaryText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.primaryText_ = common$TextContent;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BypassPhoneNumberWarningRendering();
                    case 2:
                        return new C6756a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\f", new Object[]{"bitField0_", "primaryText_", "clientLogo_", "content_", "autoTransitionDelayMs_", "animation_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<BypassPhoneNumberWarningRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BypassPhoneNumberWarningRendering.class) {
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

            public EnumC6784a getAnimation() {
                EnumC6784a enumC6784aForNumber = EnumC6784a.forNumber(this.animation_);
                return enumC6784aForNumber == null ? EnumC6784a.UNRECOGNIZED : enumC6784aForNumber;
            }

            public int getAnimationValue() {
                return this.animation_;
            }

            public int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public Common$RenderedAssetAppearance getClientLogo() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogo_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$TextContent getContent() {
                Common$TextContent common$TextContent = this.content_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$TextContent getPrimaryText() {
                Common$TextContent common$TextContent = this.primaryText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public boolean hasClientLogo() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasPrimaryText() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6756a newBuilder(BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                return DEFAULT_INSTANCE.createBuilder(bypassPhoneNumberWarningRendering);
            }

            public static BypassPhoneNumberWarningRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(ByteString byteString) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(byte[] bArr) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(InputStream inputStream) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(CodedInputStream codedInputStream) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static BypassPhoneNumberWarningRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BypassPhoneNumberWarningRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedLoadingPaneRendering extends GeneratedMessageLite<CoBrandedLoadingPaneRendering, C6757a> implements MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 2;
            public static final int CO_BRANDED_HEADER_ASSET_FIELD_NUMBER = 1;
            private static final CoBrandedLoadingPaneRendering DEFAULT_INSTANCE;
            public static final int NEXT_CALL_LEAD_MS_FIELD_NUMBER = 3;
            private static volatile Parser<CoBrandedLoadingPaneRendering> PARSER;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private Common$CobrandedHeaderAsset coBrandedHeaderAsset_;
            private int nextCallLeadMs_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$CoBrandedLoadingPaneRendering$a */
            public static final class C6757a extends GeneratedMessageLite.Builder<CoBrandedLoadingPaneRendering, C6757a> implements MessageLiteOrBuilder {
                public C6757a() {
                    super(CoBrandedLoadingPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering = new CoBrandedLoadingPaneRendering();
                DEFAULT_INSTANCE = coBrandedLoadingPaneRendering;
                GeneratedMessageLite.registerDefaultInstance(CoBrandedLoadingPaneRendering.class, coBrandedLoadingPaneRendering);
            }

            private CoBrandedLoadingPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearCoBrandedHeaderAsset() {
                this.coBrandedHeaderAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearNextCallLeadMs() {
                this.nextCallLeadMs_ = 0;
            }

            public static CoBrandedLoadingPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeCoBrandedHeaderAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                common$CobrandedHeaderAsset.getClass();
                Common$CobrandedHeaderAsset common$CobrandedHeaderAsset2 = this.coBrandedHeaderAsset_;
                if (common$CobrandedHeaderAsset2 == null || common$CobrandedHeaderAsset2 == Common$CobrandedHeaderAsset.getDefaultInstance()) {
                    this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                } else {
                    this.coBrandedHeaderAsset_ = Common$CobrandedHeaderAsset.newBuilder(this.coBrandedHeaderAsset_).mergeFrom((Common$CobrandedHeaderAsset.C6415a) common$CobrandedHeaderAsset).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6757a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static CoBrandedLoadingPaneRendering parseDelimitedFrom(InputStream inputStream) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(ByteBuffer byteBuffer) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<CoBrandedLoadingPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            private void setCoBrandedHeaderAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                common$CobrandedHeaderAsset.getClass();
                this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                this.bitField0_ |= 1;
            }

            private void setNextCallLeadMs(int i) {
                this.nextCallLeadMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CoBrandedLoadingPaneRendering();
                    case 2:
                        return new C6757a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "coBrandedHeaderAsset_", "autoTransitionDelayMs_", "nextCallLeadMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<CoBrandedLoadingPaneRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CoBrandedLoadingPaneRendering.class) {
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

            public int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public Common$CobrandedHeaderAsset getCoBrandedHeaderAsset() {
                Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = this.coBrandedHeaderAsset_;
                return common$CobrandedHeaderAsset == null ? Common$CobrandedHeaderAsset.getDefaultInstance() : common$CobrandedHeaderAsset;
            }

            public int getNextCallLeadMs() {
                return this.nextCallLeadMs_;
            }

            public boolean hasCoBrandedHeaderAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6757a newBuilder(CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedLoadingPaneRendering);
            }

            public static CoBrandedLoadingPaneRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(ByteString byteString) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(byte[] bArr) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(InputStream inputStream) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(CodedInputStream codedInputStream) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static CoBrandedLoadingPaneRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedOTPEntryRendering extends GeneratedMessageLite<CoBrandedOTPEntryRendering, C6758a> implements MessageLiteOrBuilder {
            public static final int ANIMATED_CO_BRANDED_HEADER_FIELD_NUMBER = 1;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 5;
            public static final int BUTTON_FIELD_NUMBER = 2;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 4;
            private static final CoBrandedOTPEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BODY_ADORNMENT_FIELD_NUMBER = 6;
            private static volatile Parser<CoBrandedOTPEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 7;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 3;
            private Common$AnimatedCoBrandedHeader animatedCoBrandedHeader_;
            private int bitField0_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$PaneBodyAdornment paneBodyAdornment_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$CoBrandedOTPEntryRendering$a */
            public static final class C6758a extends GeneratedMessageLite.Builder<CoBrandedOTPEntryRendering, C6758a> implements MessageLiteOrBuilder {
                public C6758a() {
                    super(CoBrandedOTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                CoBrandedOTPEntryRendering coBrandedOTPEntryRendering = new CoBrandedOTPEntryRendering();
                DEFAULT_INSTANCE = coBrandedOTPEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(CoBrandedOTPEntryRendering.class, coBrandedOTPEntryRendering);
            }

            private CoBrandedOTPEntryRendering() {
            }

            private void clearAnimatedCoBrandedHeader() {
                this.animatedCoBrandedHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearPaneBodyAdornment() {
                this.paneBodyAdornment_ = null;
                this.bitField0_ &= -17;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -33;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static CoBrandedOTPEntryRendering getDefaultInstance() {
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
                this.bitField0_ |= 1;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergePaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
                common$PaneBodyAdornment.getClass();
                Common$PaneBodyAdornment common$PaneBodyAdornment2 = this.paneBodyAdornment_;
                if (common$PaneBodyAdornment2 == null || common$PaneBodyAdornment2 == Common$PaneBodyAdornment.getDefaultInstance()) {
                    this.paneBodyAdornment_ = common$PaneBodyAdornment;
                } else {
                    this.paneBodyAdornment_ = Common$PaneBodyAdornment.newBuilder(this.paneBodyAdornment_).mergeFrom((Common$PaneBodyAdornment.C6457a) common$PaneBodyAdornment).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6758a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static CoBrandedOTPEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedOTPEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<CoBrandedOTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAnimatedCoBrandedHeader(Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                common$AnimatedCoBrandedHeader.getClass();
                this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                this.bitField0_ |= 1;
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 8;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setPaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
                common$PaneBodyAdornment.getClass();
                this.paneBodyAdornment_ = common$PaneBodyAdornment;
                this.bitField0_ |= 16;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 32;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CoBrandedOTPEntryRendering();
                    case 2:
                        return new C6758a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "animatedCoBrandedHeader_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "paneBodyAdornment_", "prompt_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<CoBrandedOTPEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CoBrandedOTPEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$PaneBodyAdornment getPaneBodyAdornment() {
                Common$PaneBodyAdornment common$PaneBodyAdornment = this.paneBodyAdornment_;
                return common$PaneBodyAdornment == null ? Common$PaneBodyAdornment.getDefaultInstance() : common$PaneBodyAdornment;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasAnimatedCoBrandedHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasPaneBodyAdornment() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6758a newBuilder(CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedOTPEntryRendering);
            }

            public static CoBrandedOTPEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedOTPEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static CoBrandedOTPEntryRendering parseFrom(ByteString byteString) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CoBrandedOTPEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static CoBrandedOTPEntryRendering parseFrom(byte[] bArr) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CoBrandedOTPEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static CoBrandedOTPEntryRendering parseFrom(InputStream inputStream) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedOTPEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedOTPEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static CoBrandedOTPEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CoBrandedPhoneEntryRendering extends GeneratedMessageLite<CoBrandedPhoneEntryRendering, C6759a> implements MessageLiteOrBuilder {
            public static final int ANIMATED_CO_BRANDED_HEADER_FIELD_NUMBER = 1;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 6;
            public static final int BUTTON_FIELD_NUMBER = 3;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 5;
            private static final CoBrandedPhoneEntryRendering DEFAULT_INSTANCE;
            private static volatile Parser<CoBrandedPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 2;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
            private Common$AnimatedCoBrandedHeader animatedCoBrandedHeader_;
            private int bitField0_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$CoBrandedPhoneEntryRendering$a */
            public static final class C6759a extends GeneratedMessageLite.Builder<CoBrandedPhoneEntryRendering, C6759a> implements MessageLiteOrBuilder {
                public C6759a() {
                    super(CoBrandedPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering = new CoBrandedPhoneEntryRendering();
                DEFAULT_INSTANCE = coBrandedPhoneEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(CoBrandedPhoneEntryRendering.class, coBrandedPhoneEntryRendering);
            }

            private CoBrandedPhoneEntryRendering() {
            }

            private void clearAnimatedCoBrandedHeader() {
                this.animatedCoBrandedHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -5;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -9;
            }

            public static CoBrandedPhoneEntryRendering getDefaultInstance() {
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
                this.bitField0_ |= 1;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
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
                this.bitField0_ |= 8;
            }

            public static C6759a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static CoBrandedPhoneEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<CoBrandedPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAnimatedCoBrandedHeader(Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
                common$AnimatedCoBrandedHeader.getClass();
                this.animatedCoBrandedHeader_ = common$AnimatedCoBrandedHeader;
                this.bitField0_ |= 1;
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 16;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 2;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CoBrandedPhoneEntryRendering();
                    case 2:
                        return new C6759a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f\u0006ဉ\u0004", new Object[]{"bitField0_", "animatedCoBrandedHeader_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<CoBrandedPhoneEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CoBrandedPhoneEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasAnimatedCoBrandedHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6759a newBuilder(CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedPhoneEntryRendering);
            }

            public static CoBrandedPhoneEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(ByteString byteString) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(byte[] bArr) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(InputStream inputStream) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static CoBrandedPhoneEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class CombinedConsentAndPhoneEntryRendering extends GeneratedMessageLite<CombinedConsentAndPhoneEntryRendering, C6760a> implements MessageLiteOrBuilder {
            public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 8;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            public static final int CHECK_LIST_FIELD_NUMBER = 10;
            public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 13;
            private static final CombinedConsentAndPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<CombinedConsentAndPhoneEntryRendering> PARSER = null;
            public static final int PLAID_BRANDED_ASSET_FIELD_NUMBER = 12;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int SHOW_ACTION_DIVIDER_LINE_FIELD_NUMBER = 11;
            public static final int TEXT_ALIGNMENT_FIELD_NUMBER = 9;
            private int backgroundDisplayMode_;
            private int bitField0_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$CheckList checkList_;
            private int headerAssetConfigCase_ = 0;
            private Object headerAssetConfig_;
            private Common$TextContent headerText_;
            private Common$PaneHeader paneHeader_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;
            private boolean showActionDividerLine_;
            private int textAlignment_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$CombinedConsentAndPhoneEntryRendering$a */
            public static final class C6760a extends GeneratedMessageLite.Builder<CombinedConsentAndPhoneEntryRendering, C6760a> implements MessageLiteOrBuilder {
                public C6760a() {
                    super(CombinedConsentAndPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$CombinedConsentAndPhoneEntryRendering$b */
            public enum EnumC6761b {
                PLAID_BRANDED_ASSET(12),
                CO_BRANDED_ASSET(13),
                HEADERASSETCONFIG_NOT_SET(0);


                /* renamed from: a */
                public final int f2439a;

                EnumC6761b(int i) {
                    this.f2439a = i;
                }

                public static EnumC6761b forNumber(int i) {
                    if (i == 0) {
                        return HEADERASSETCONFIG_NOT_SET;
                    }
                    if (i == 12) {
                        return PLAID_BRANDED_ASSET;
                    }
                    if (i != 13) {
                        return null;
                    }
                    return CO_BRANDED_ASSET;
                }

                public int getNumber() {
                    return this.f2439a;
                }

                @Deprecated
                public static EnumC6761b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering = new CombinedConsentAndPhoneEntryRendering();
                DEFAULT_INSTANCE = combinedConsentAndPhoneEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(CombinedConsentAndPhoneEntryRendering.class, combinedConsentAndPhoneEntryRendering);
            }

            private CombinedConsentAndPhoneEntryRendering() {
            }

            private void clearBackgroundDisplayMode() {
                this.backgroundDisplayMode_ = 0;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -65;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearCheckList() {
                this.checkList_ = null;
                this.bitField0_ &= -9;
            }

            private void clearCoBrandedAsset() {
                if (this.headerAssetConfigCase_ == 13) {
                    this.headerAssetConfigCase_ = 0;
                    this.headerAssetConfig_ = null;
                }
            }

            private void clearHeaderAssetConfig() {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPlaidBrandedAsset() {
                if (this.headerAssetConfigCase_ == 12) {
                    this.headerAssetConfigCase_ = 0;
                    this.headerAssetConfig_ = null;
                }
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -33;
            }

            private void clearShowActionDividerLine() {
                this.showActionDividerLine_ = false;
            }

            private void clearTextAlignment() {
                this.textAlignment_ = 0;
            }

            public static CombinedConsentAndPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergeCheckList(Common$CheckList common$CheckList) {
                common$CheckList.getClass();
                Common$CheckList common$CheckList2 = this.checkList_;
                if (common$CheckList2 == null || common$CheckList2 == Common$CheckList.getDefaultInstance()) {
                    this.checkList_ = common$CheckList;
                } else {
                    this.checkList_ = Common$CheckList.newBuilder(this.checkList_).mergeFrom((Common$CheckList.C6410a) common$CheckList).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeCoBrandedAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                common$CobrandedHeaderAsset.getClass();
                if (this.headerAssetConfigCase_ != 13 || this.headerAssetConfig_ == Common$CobrandedHeaderAsset.getDefaultInstance()) {
                    this.headerAssetConfig_ = common$CobrandedHeaderAsset;
                } else {
                    this.headerAssetConfig_ = Common$CobrandedHeaderAsset.newBuilder((Common$CobrandedHeaderAsset) this.headerAssetConfig_).mergeFrom((Common$CobrandedHeaderAsset.C6415a) common$CobrandedHeaderAsset).buildPartial();
                }
                this.headerAssetConfigCase_ = 13;
            }

            private void mergeHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
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

            private void mergePlaidBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                if (this.headerAssetConfigCase_ != 12 || this.headerAssetConfig_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAssetConfig_ = common$RenderedAssetAppearance;
                } else {
                    this.headerAssetConfig_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.headerAssetConfig_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.headerAssetConfigCase_ = 12;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            public static C6760a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static CombinedConsentAndPhoneEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<CombinedConsentAndPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
                this.bitField0_ |= 16;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 64;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setCheckList(Common$CheckList common$CheckList) {
                common$CheckList.getClass();
                this.checkList_ = common$CheckList;
                this.bitField0_ |= 8;
            }

            private void setCoBrandedAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                common$CobrandedHeaderAsset.getClass();
                this.headerAssetConfig_ = common$CobrandedHeaderAsset;
                this.headerAssetConfigCase_ = 13;
            }

            private void setHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                common$PaneHeader.getClass();
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPlaidBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.headerAssetConfig_ = common$RenderedAssetAppearance;
                this.headerAssetConfigCase_ = 12;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 32;
            }

            private void setShowActionDividerLine(boolean z) {
                this.showActionDividerLine_ = z;
            }

            private void setTextAlignment(EnumC6831U enumC6831U) {
                this.textAlignment_ = enumC6831U.getNumber();
            }

            private void setTextAlignmentValue(int i) {
                this.textAlignment_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CombinedConsentAndPhoneEntryRendering();
                    case 2:
                        return new C6760a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0005\u0006\f\u0007ဉ\u0006\b\f\t\f\nဉ\u0003\u000b\u0007\f<\u0000\r<\u0000", new Object[]{"headerAssetConfig_", "headerAssetConfigCase_", "bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "backgroundDisplayMode_", "textAlignment_", "checkList_", "showActionDividerLine_", Common$RenderedAssetAppearance.class, Common$CobrandedHeaderAsset.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<CombinedConsentAndPhoneEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CombinedConsentAndPhoneEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$CheckList getCheckList() {
                Common$CheckList common$CheckList = this.checkList_;
                return common$CheckList == null ? Common$CheckList.getDefaultInstance() : common$CheckList;
            }

            public Common$CobrandedHeaderAsset getCoBrandedAsset() {
                return this.headerAssetConfigCase_ == 13 ? (Common$CobrandedHeaderAsset) this.headerAssetConfig_ : Common$CobrandedHeaderAsset.getDefaultInstance();
            }

            public EnumC6761b getHeaderAssetConfigCase() {
                return EnumC6761b.forNumber(this.headerAssetConfigCase_);
            }

            public Common$TextContent getHeaderText() {
                Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$PaneHeader getPaneHeader() {
                Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public Common$RenderedAssetAppearance getPlaidBrandedAsset() {
                return this.headerAssetConfigCase_ == 12 ? (Common$RenderedAssetAppearance) this.headerAssetConfig_ : Common$RenderedAssetAppearance.getDefaultInstance();
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean getShowActionDividerLine() {
                return this.showActionDividerLine_;
            }

            public EnumC6831U getTextAlignment() {
                EnumC6831U enumC6831UForNumber = EnumC6831U.forNumber(this.textAlignment_);
                return enumC6831UForNumber == null ? EnumC6831U.UNRECOGNIZED : enumC6831UForNumber;
            }

            public int getTextAlignmentValue() {
                return this.textAlignment_;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasCheckList() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasCoBrandedAsset() {
                return this.headerAssetConfigCase_ == 13;
            }

            public boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPlaidBrandedAsset() {
                return this.headerAssetConfigCase_ == 12;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 32) != 0;
            }

            public static C6760a newBuilder(CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(combinedConsentAndPhoneEntryRendering);
            }

            public static CombinedConsentAndPhoneEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(ByteString byteString) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(byte[] bArr) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(InputStream inputStream) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static CombinedConsentAndPhoneEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CombinedConsentAndPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DefaultOTPEntryRendering extends GeneratedMessageLite<DefaultOTPEntryRendering, C6762a> implements MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_DISCLAIMER_TEXT_PLACEMENT_FIELD_NUMBER = 8;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            private static final DefaultOTPEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 9;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<DefaultOTPEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int USE_SEGMENTED_OTP_INPUT_FIELD_NUMBER = 10;
            private int bitField0_;
            private int buttonDisclaimerTextPlacement_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$TextContent headerText_;
            private Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private Common$PaneHeader paneHeader_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;
            private boolean useSegmentedOtpInput_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$DefaultOTPEntryRendering$a */
            public static final class C6762a extends GeneratedMessageLite.Builder<DefaultOTPEntryRendering, C6762a> implements MessageLiteOrBuilder {
                public C6762a() {
                    super(DefaultOTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                DefaultOTPEntryRendering defaultOTPEntryRendering = new DefaultOTPEntryRendering();
                DEFAULT_INSTANCE = defaultOTPEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(DefaultOTPEntryRendering.class, defaultOTPEntryRendering);
            }

            private DefaultOTPEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearButtonDisclaimerTextPlacement() {
                this.buttonDisclaimerTextPlacement_ = 0;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -65;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearUseSegmentedOtpInput() {
                this.useSegmentedOtpInput_ = false;
            }

            public static DefaultOTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((Common$PaneAutoSubmitOptions.C6455b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 64;
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

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            public static C6762a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DefaultOTPEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DefaultOTPEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DefaultOTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 32;
            }

            private void setButtonDisclaimerTextPlacement(EnumC6937t enumC6937t) {
                this.buttonDisclaimerTextPlacement_ = enumC6937t.getNumber();
            }

            private void setButtonDisclaimerTextPlacementValue(int i) {
                this.buttonDisclaimerTextPlacement_ = i;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 64;
            }

            private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                common$PaneHeader.getClass();
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setUseSegmentedOtpInput(boolean z) {
                this.useSegmentedOtpInput_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DefaultOTPEntryRendering();
                    case 2:
                        return new C6762a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\f\u0007ဉ\u0005\b\f\tဉ\u0006\n\u0007", new Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "buttonDisclaimerTextPlacement_", "paneAutoSubmitOptions_", "useSegmentedOtpInput_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DefaultOTPEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DefaultOTPEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6937t getButtonDisclaimerTextPlacement() {
                EnumC6937t enumC6937tForNumber = EnumC6937t.forNumber(this.buttonDisclaimerTextPlacement_);
                return enumC6937tForNumber == null ? EnumC6937t.UNRECOGNIZED : enumC6937tForNumber;
            }

            public int getButtonDisclaimerTextPlacementValue() {
                return this.buttonDisclaimerTextPlacement_;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$TextContent getHeaderText() {
                Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public Common$PaneHeader getPaneHeader() {
                Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean getUseSegmentedOtpInput() {
                return this.useSegmentedOtpInput_;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public static C6762a newBuilder(DefaultOTPEntryRendering defaultOTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(defaultOTPEntryRendering);
            }

            public static DefaultOTPEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DefaultOTPEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DefaultOTPEntryRendering parseFrom(ByteString byteString) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DefaultOTPEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DefaultOTPEntryRendering parseFrom(byte[] bArr) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DefaultOTPEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DefaultOTPEntryRendering parseFrom(InputStream inputStream) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DefaultOTPEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DefaultOTPEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DefaultOTPEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultOTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DefaultPhoneEntryRendering extends GeneratedMessageLite<DefaultPhoneEntryRendering, C6763a> implements MessageLiteOrBuilder {
            public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 8;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 7;
            public static final int BUTTON_FIELD_NUMBER = 4;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 6;
            private static final DefaultPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<DefaultPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int TEXT_ALIGNMENT_FIELD_NUMBER = 9;
            private int backgroundDisplayMode_;
            private int bitField0_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$TextContent headerText_;
            private Common$PaneHeader paneHeader_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;
            private int textAlignment_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$DefaultPhoneEntryRendering$a */
            public static final class C6763a extends GeneratedMessageLite.Builder<DefaultPhoneEntryRendering, C6763a> implements MessageLiteOrBuilder {
                public C6763a() {
                    super(DefaultPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                DefaultPhoneEntryRendering defaultPhoneEntryRendering = new DefaultPhoneEntryRendering();
                DEFAULT_INSTANCE = defaultPhoneEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(DefaultPhoneEntryRendering.class, defaultPhoneEntryRendering);
            }

            private DefaultPhoneEntryRendering() {
            }

            private void clearBackgroundDisplayMode() {
                this.backgroundDisplayMode_ = 0;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearTextAlignment() {
                this.textAlignment_ = 0;
            }

            public static DefaultPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
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

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            public static C6763a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DefaultPhoneEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DefaultPhoneEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DefaultPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 32;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                common$PaneHeader.getClass();
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setTextAlignment(EnumC6831U enumC6831U) {
                this.textAlignment_ = enumC6831U.getNumber();
            }

            private void setTextAlignmentValue(int i) {
                this.textAlignment_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DefaultPhoneEntryRendering();
                    case 2:
                        return new C6763a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\f\u0007ဉ\u0005\b\f\t\f", new Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "backgroundDisplayMode_", "textAlignment_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DefaultPhoneEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DefaultPhoneEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$TextContent getHeaderText() {
                Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$PaneHeader getPaneHeader() {
                Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public EnumC6831U getTextAlignment() {
                EnumC6831U enumC6831UForNumber = EnumC6831U.forNumber(this.textAlignment_);
                return enumC6831UForNumber == null ? EnumC6831U.UNRECOGNIZED : enumC6831UForNumber;
            }

            public int getTextAlignmentValue() {
                return this.textAlignment_;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public static C6763a newBuilder(DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(defaultPhoneEntryRendering);
            }

            public static DefaultPhoneEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DefaultPhoneEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DefaultPhoneEntryRendering parseFrom(ByteString byteString) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DefaultPhoneEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DefaultPhoneEntryRendering parseFrom(byte[] bArr) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DefaultPhoneEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DefaultPhoneEntryRendering parseFrom(InputStream inputStream) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DefaultPhoneEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DefaultPhoneEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DefaultPhoneEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DefaultPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowEmailEntryRendering extends GeneratedMessageLite<EndOfFlowEmailEntryRendering, C6764a> implements MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 6;
            private static final EndOfFlowEmailEntryRendering DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 9;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int INFORMATION_CARD_FIELD_NUMBER = 10;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 8;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<EndOfFlowEmailEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 4;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
            private int bitField0_;
            private Common$ButtonContent button_;
            private int contentCase_ = 0;
            private Object content_;
            private Common$AttributedLocalizedString description_;
            private Common$TextContent headerText_;
            private Common$Box informationCard_;
            private Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private Common$PaneHeader paneHeader_;
            private Common$ButtonContent secondaryButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$EndOfFlowEmailEntryRendering$a */
            public static final class C6764a extends GeneratedMessageLite.Builder<EndOfFlowEmailEntryRendering, C6764a> implements MessageLiteOrBuilder {
                public C6764a() {
                    super(EndOfFlowEmailEntryRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$EndOfFlowEmailEntryRendering$b */
            public enum EnumC6765b {
                PROMPT(3),
                PROFILE_CHIP(4),
                CONTENT_NOT_SET(0);


                /* renamed from: a */
                public final int f2441a;

                EnumC6765b(int i) {
                    this.f2441a = i;
                }

                public static EnumC6765b forNumber(int i) {
                    if (i == 0) {
                        return CONTENT_NOT_SET;
                    }
                    if (i == 3) {
                        return PROMPT;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return PROFILE_CHIP;
                }

                public int getNumber() {
                    return this.f2441a;
                }

                @Deprecated
                public static EnumC6765b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering = new EndOfFlowEmailEntryRendering();
                DEFAULT_INSTANCE = endOfFlowEmailEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(EndOfFlowEmailEntryRendering.class, endOfFlowEmailEntryRendering);
            }

            private EndOfFlowEmailEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
            }

            private void clearDescription() {
                this.description_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearInformationCard() {
                this.informationCard_ = null;
                this.bitField0_ &= -33;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -65;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearProfileChip() {
                if (this.contentCase_ == 4) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearPrompt() {
                if (this.contentCase_ == 3) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            public static EndOfFlowEmailEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.description_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.description_ = common$AttributedLocalizedString;
                } else {
                    this.description_ = Common$AttributedLocalizedString.newBuilder(this.description_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeInformationCard(Common$Box common$Box) {
                common$Box.getClass();
                Common$Box common$Box2 = this.informationCard_;
                if (common$Box2 == null || common$Box2 == Common$Box.getDefaultInstance()) {
                    this.informationCard_ = common$Box;
                } else {
                    this.informationCard_ = Common$Box.newBuilder(this.informationCard_).mergeFrom((Common$Box.C6402d) common$Box).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergePaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((Common$PaneAutoSubmitOptions.C6455b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 64;
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

            private void mergeProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                if (this.contentCase_ != 4 || this.content_ == Common$ProfileChip.getDefaultInstance()) {
                    this.content_ = common$ProfileChip;
                } else {
                    this.content_ = Common$ProfileChip.newBuilder((Common$ProfileChip) this.content_).mergeFrom((Common$ProfileChip.C6467a) common$ProfileChip).buildPartial();
                }
                this.contentCase_ = 4;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                if (this.contentCase_ != 3 || this.content_ == Common$Prompt.getDefaultInstance()) {
                    this.content_ = common$Prompt;
                } else {
                    this.content_ = Common$Prompt.newBuilder((Common$Prompt) this.content_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.contentCase_ = 3;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            public static C6764a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EndOfFlowEmailEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EndOfFlowEmailEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.description_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setInformationCard(Common$Box common$Box) {
                common$Box.getClass();
                this.informationCard_ = common$Box;
                this.bitField0_ |= 32;
            }

            private void setPaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 64;
            }

            private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                common$PaneHeader.getClass();
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                this.content_ = common$ProfileChip;
                this.contentCase_ = 4;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.content_ = common$Prompt;
                this.contentCase_ = 3;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EndOfFlowEmailEntryRendering();
                    case 2:
                        return new C6764a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0006\tဉ\u0002\nဉ\u0005", new Object[]{"content_", "contentCase_", "bitField0_", "paneHeader_", "headerText_", Common$Prompt.class, Common$ProfileChip.class, "button_", "secondaryButton_", "paneAutoSubmitOptions_", "description_", "informationCard_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EndOfFlowEmailEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EndOfFlowEmailEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public EnumC6765b getContentCase() {
                return EnumC6765b.forNumber(this.contentCase_);
            }

            public Common$AttributedLocalizedString getDescription() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.description_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$TextContent getHeaderText() {
                Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$Box getInformationCard() {
                Common$Box common$Box = this.informationCard_;
                return common$Box == null ? Common$Box.getDefaultInstance() : common$Box;
            }

            public Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public Common$PaneHeader getPaneHeader() {
                Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public Common$ProfileChip getProfileChip() {
                return this.contentCase_ == 4 ? (Common$ProfileChip) this.content_ : Common$ProfileChip.getDefaultInstance();
            }

            public Common$Prompt getPrompt() {
                return this.contentCase_ == 3 ? (Common$Prompt) this.content_ : Common$Prompt.getDefaultInstance();
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasDescription() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasInformationCard() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasProfileChip() {
                return this.contentCase_ == 4;
            }

            public boolean hasPrompt() {
                return this.contentCase_ == 3;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public static C6764a newBuilder(EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowEmailEntryRendering);
            }

            public static EndOfFlowEmailEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(ByteString byteString) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(byte[] bArr) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(InputStream inputStream) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EndOfFlowEmailEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowEmailEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowPhoneEntryRendering extends GeneratedMessageLite<EndOfFlowPhoneEntryRendering, C6766a> implements MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 8;
            public static final int BUTTON_FIELD_NUMBER = 5;
            public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 7;
            private static final EndOfFlowPhoneEntryRendering DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_FIELD_NUMBER = 2;
            public static final int PANE_AUTO_SUBMIT_OPTIONS_FIELD_NUMBER = 9;
            public static final int PANE_BODY_ADORNMENT_FIELD_NUMBER = 4;
            public static final int PANE_HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<EndOfFlowPhoneEntryRendering> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 3;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
            private int bitField0_;
            private Common$TextContent buttonDisclaimerText_;
            private int buttonPlacement_;
            private Common$ButtonContent button_;
            private Common$TextContent headerText_;
            private Common$PaneAutoSubmitOptions paneAutoSubmitOptions_;
            private Common$PaneBodyAdornment paneBodyAdornment_;
            private Common$PaneHeader paneHeader_;
            private Common$Prompt prompt_;
            private Common$ButtonContent secondaryButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$EndOfFlowPhoneEntryRendering$a */
            public static final class C6766a extends GeneratedMessageLite.Builder<EndOfFlowPhoneEntryRendering, C6766a> implements MessageLiteOrBuilder {
                public C6766a() {
                    super(EndOfFlowPhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering = new EndOfFlowPhoneEntryRendering();
                DEFAULT_INSTANCE = endOfFlowPhoneEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(EndOfFlowPhoneEntryRendering.class, endOfFlowPhoneEntryRendering);
            }

            private EndOfFlowPhoneEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -17;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -65;
            }

            private void clearButtonPlacement() {
                this.buttonPlacement_ = 0;
            }

            private void clearHeaderText() {
                this.headerText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPaneAutoSubmitOptions() {
                this.paneAutoSubmitOptions_ = null;
                this.bitField0_ &= -129;
            }

            private void clearPaneBodyAdornment() {
                this.paneBodyAdornment_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneHeader() {
                this.paneHeader_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -33;
            }

            public static EndOfFlowPhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.buttonDisclaimerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$TextContent;
                } else {
                    this.buttonDisclaimerText_ = Common$TextContent.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergeHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.headerText_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.headerText_ = common$TextContent;
                } else {
                    this.headerText_ = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions2 = this.paneAutoSubmitOptions_;
                if (common$PaneAutoSubmitOptions2 == null || common$PaneAutoSubmitOptions2 == Common$PaneAutoSubmitOptions.getDefaultInstance()) {
                    this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                } else {
                    this.paneAutoSubmitOptions_ = Common$PaneAutoSubmitOptions.newBuilder(this.paneAutoSubmitOptions_).mergeFrom((Common$PaneAutoSubmitOptions.C6455b) common$PaneAutoSubmitOptions).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            private void mergePaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
                common$PaneBodyAdornment.getClass();
                Common$PaneBodyAdornment common$PaneBodyAdornment2 = this.paneBodyAdornment_;
                if (common$PaneBodyAdornment2 == null || common$PaneBodyAdornment2 == Common$PaneBodyAdornment.getDefaultInstance()) {
                    this.paneBodyAdornment_ = common$PaneBodyAdornment;
                } else {
                    this.paneBodyAdornment_ = Common$PaneBodyAdornment.newBuilder(this.paneBodyAdornment_).mergeFrom((Common$PaneBodyAdornment.C6457a) common$PaneBodyAdornment).buildPartial();
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
                this.bitField0_ |= 1;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            public static C6766a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EndOfFlowPhoneEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EndOfFlowPhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setButtonDisclaimerText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.buttonDisclaimerText_ = common$TextContent;
                this.bitField0_ |= 64;
            }

            private void setButtonPlacement(EnumC6929p enumC6929p) {
                this.buttonPlacement_ = enumC6929p.getNumber();
            }

            private void setButtonPlacementValue(int i) {
                this.buttonPlacement_ = i;
            }

            private void setHeaderText(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.headerText_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setPaneAutoSubmitOptions(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
                common$PaneAutoSubmitOptions.getClass();
                this.paneAutoSubmitOptions_ = common$PaneAutoSubmitOptions;
                this.bitField0_ |= 128;
            }

            private void setPaneBodyAdornment(Common$PaneBodyAdornment common$PaneBodyAdornment) {
                common$PaneBodyAdornment.getClass();
                this.paneBodyAdornment_ = common$PaneBodyAdornment;
                this.bitField0_ |= 8;
            }

            private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
                common$PaneHeader.getClass();
                this.paneHeader_ = common$PaneHeader;
                this.bitField0_ |= 1;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 32;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EndOfFlowPhoneEntryRendering();
                    case 2:
                        return new C6766a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\f\bဉ\u0006\tဉ\u0007", new Object[]{"bitField0_", "paneHeader_", "headerText_", "prompt_", "paneBodyAdornment_", "button_", "secondaryButton_", "buttonPlacement_", "buttonDisclaimerText_", "paneAutoSubmitOptions_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EndOfFlowPhoneEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EndOfFlowPhoneEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TextContent getButtonDisclaimerText() {
                Common$TextContent common$TextContent = this.buttonDisclaimerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public EnumC6929p getButtonPlacement() {
                EnumC6929p enumC6929pForNumber = EnumC6929p.forNumber(this.buttonPlacement_);
                return enumC6929pForNumber == null ? EnumC6929p.UNRECOGNIZED : enumC6929pForNumber;
            }

            public int getButtonPlacementValue() {
                return this.buttonPlacement_;
            }

            public Common$TextContent getHeaderText() {
                Common$TextContent common$TextContent = this.headerText_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$PaneAutoSubmitOptions getPaneAutoSubmitOptions() {
                Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = this.paneAutoSubmitOptions_;
                return common$PaneAutoSubmitOptions == null ? Common$PaneAutoSubmitOptions.getDefaultInstance() : common$PaneAutoSubmitOptions;
            }

            public Common$PaneBodyAdornment getPaneBodyAdornment() {
                Common$PaneBodyAdornment common$PaneBodyAdornment = this.paneBodyAdornment_;
                return common$PaneBodyAdornment == null ? Common$PaneBodyAdornment.getDefaultInstance() : common$PaneBodyAdornment;
            }

            public Common$PaneHeader getPaneHeader() {
                Common$PaneHeader common$PaneHeader = this.paneHeader_;
                return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasHeaderText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPaneAutoSubmitOptions() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasPaneBodyAdornment() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasPaneHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 32) != 0;
            }

            public static C6766a newBuilder(EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowPhoneEntryRendering);
            }

            public static EndOfFlowPhoneEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(ByteString byteString) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(byte[] bArr) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(InputStream inputStream) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EndOfFlowPhoneEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowPhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EndOfFlowSuccessPaneRendering extends GeneratedMessageLite<EndOfFlowSuccessPaneRendering, C6767a> implements MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 4;
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final EndOfFlowSuccessPaneRendering DEFAULT_INSTANCE;
            public static final int HEADER_ASSET_FIELD_NUMBER = 1;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile Parser<EndOfFlowSuccessPaneRendering> PARSER;
            private int autoTransitionDelayMs_;
            private int bitField0_;
            private Common$TextContent content_;
            private Common$RenderedAssetAppearance headerAsset_;
            private Common$TextContent header_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$EndOfFlowSuccessPaneRendering$a */
            public static final class C6767a extends GeneratedMessageLite.Builder<EndOfFlowSuccessPaneRendering, C6767a> implements MessageLiteOrBuilder {
                public C6767a() {
                    super(EndOfFlowSuccessPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering = new EndOfFlowSuccessPaneRendering();
                DEFAULT_INSTANCE = endOfFlowSuccessPaneRendering;
                GeneratedMessageLite.registerDefaultInstance(EndOfFlowSuccessPaneRendering.class, endOfFlowSuccessPaneRendering);
            }

            private EndOfFlowSuccessPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            private void clearContent() {
                this.content_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeaderAsset() {
                this.headerAsset_ = null;
                this.bitField0_ &= -2;
            }

            public static EndOfFlowSuccessPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.content_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.content_ = common$TextContent;
                } else {
                    this.content_ = Common$TextContent.newBuilder(this.content_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeader(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                Common$TextContent common$TextContent2 = this.header_;
                if (common$TextContent2 == null || common$TextContent2 == Common$TextContent.getDefaultInstance()) {
                    this.header_ = common$TextContent;
                } else {
                    this.header_ = Common$TextContent.newBuilder(this.header_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAsset_ = common$RenderedAssetAppearance;
                } else {
                    this.headerAsset_ = Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6767a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EndOfFlowSuccessPaneRendering parseDelimitedFrom(InputStream inputStream) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(ByteBuffer byteBuffer) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EndOfFlowSuccessPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            private void setContent(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.content_ = common$TextContent;
                this.bitField0_ |= 4;
            }

            private void setHeader(Common$TextContent common$TextContent) {
                common$TextContent.getClass();
                this.header_ = common$TextContent;
                this.bitField0_ |= 2;
            }

            private void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.headerAsset_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EndOfFlowSuccessPaneRendering();
                    case 2:
                        return new C6767a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b", new Object[]{"bitField0_", "headerAsset_", "header_", "content_", "autoTransitionDelayMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EndOfFlowSuccessPaneRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EndOfFlowSuccessPaneRendering.class) {
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

            public int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public Common$TextContent getContent() {
                Common$TextContent common$TextContent = this.content_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$TextContent getHeader() {
                Common$TextContent common$TextContent = this.header_;
                return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
            }

            public Common$RenderedAssetAppearance getHeaderAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasHeader() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasHeaderAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6767a newBuilder(EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(endOfFlowSuccessPaneRendering);
            }

            public static EndOfFlowSuccessPaneRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(ByteString byteString) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(byte[] bArr) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(InputStream inputStream) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(CodedInputStream codedInputStream) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EndOfFlowSuccessPaneRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EndOfFlowSuccessPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6768a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_EDIT_PROFILE_IDENTIFIER_FIELD_NUMBER = 7;
            public static final int ON_MODAL_FLEXIBLE_COMPONENTS_BUTTON_ONE_TAP_FIELD_NUMBER = 6;
            public static final int ON_PANE_BODY_ADORNMENT_BUTTON_TAP_FIELD_NUMBER = 4;
            public static final int ON_PROFILE_CHIP_OPTION_SELECT_FIELD_NUMBER = 9;
            public static final int ON_RECEIVE_FIELD_NUMBER = 8;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSubmitTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSecondaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onPaneBodyAdornmentButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onModalFlexibleComponentsButtonOneTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onEditProfileIdentifier_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onReceive_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onProfileChipOptionSelect_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$Events$a */
            public static final class C6768a extends GeneratedMessageLite.Builder<Events, C6768a> implements MessageLiteOrBuilder {
                public C6768a() {
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

            private void addAllOnEditProfileIdentifier(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnEditProfileIdentifierIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onEditProfileIdentifier_);
            }

            private void addAllOnModalFlexibleComponentsButtonOneTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onModalFlexibleComponentsButtonOneTap_);
            }

            private void addAllOnPaneBodyAdornmentButtonTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onPaneBodyAdornmentButtonTap_);
            }

            private void addAllOnProfileChipOptionSelect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnProfileChipOptionSelectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onProfileChipOptionSelect_);
            }

            private void addAllOnReceive(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnReceiveIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onReceive_);
            }

            private void addAllOnSecondaryButtonTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSecondaryButtonTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSecondaryButtonTap_);
            }

            private void addAllOnSubmitTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSubmitTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmitTap_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnEditProfileIdentifier(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.add(common$SDKEvent);
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

            private void addOnProfileChipOptionSelect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.add(common$SDKEvent);
            }

            private void addOnReceive(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.add(common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(common$SDKEvent);
            }

            private void addOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnEditProfileIdentifier() {
                this.onEditProfileIdentifier_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnModalFlexibleComponentsButtonOneTap() {
                this.onModalFlexibleComponentsButtonOneTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnPaneBodyAdornmentButtonTap() {
                this.onPaneBodyAdornmentButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnProfileChipOptionSelect() {
                this.onProfileChipOptionSelect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnReceive() {
                this.onReceive_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSubmitTap() {
                this.onSubmitTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnEditProfileIdentifierIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onEditProfileIdentifier_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onEditProfileIdentifier_ = GeneratedMessageLite.mutableCopy(protobufList);
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

            private void ensureOnProfileChipOptionSelectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onProfileChipOptionSelect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onProfileChipOptionSelect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnReceiveIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onReceive_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onReceive_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSecondaryButtonTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSecondaryButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSecondaryButtonTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSubmitTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSubmitTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSubmitTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6768a newBuilder() {
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

            private void removeOnEditProfileIdentifier(int i) {
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.remove(i);
            }

            private void removeOnModalFlexibleComponentsButtonOneTap(int i) {
                ensureOnModalFlexibleComponentsButtonOneTapIsMutable();
                this.onModalFlexibleComponentsButtonOneTap_.remove(i);
            }

            private void removeOnPaneBodyAdornmentButtonTap(int i) {
                ensureOnPaneBodyAdornmentButtonTapIsMutable();
                this.onPaneBodyAdornmentButtonTap_.remove(i);
            }

            private void removeOnProfileChipOptionSelect(int i) {
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.remove(i);
            }

            private void removeOnReceive(int i) {
                ensureOnReceiveIsMutable();
                this.onReceive_.remove(i);
            }

            private void removeOnSecondaryButtonTap(int i) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.remove(i);
            }

            private void removeOnSubmitTap(int i) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnEditProfileIdentifier(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.set(i, common$SDKEvent);
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

            private void setOnProfileChipOptionSelect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.set(i, common$SDKEvent);
            }

            private void setOnReceive(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.set(i, common$SDKEvent);
            }

            private void setOnSubmitTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6768a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\t\b\u0000\b\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubmitTap_", Common$SDKEvent.class, "onSecondaryButtonTap_", Common$SDKEvent.class, "onPaneBodyAdornmentButtonTap_", Common$SDKEvent.class, "onModalFlexibleComponentsButtonOneTap_", Common$SDKEvent.class, "onEditProfileIdentifier_", Common$SDKEvent.class, "onReceive_", Common$SDKEvent.class, "onProfileChipOptionSelect_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnEditProfileIdentifier(int i) {
                return this.onEditProfileIdentifier_.get(i);
            }

            public int getOnEditProfileIdentifierCount() {
                return this.onEditProfileIdentifier_.size();
            }

            public List<Common$SDKEvent> getOnEditProfileIdentifierList() {
                return this.onEditProfileIdentifier_;
            }

            public InterfaceC6691M getOnEditProfileIdentifierOrBuilder(int i) {
                return this.onEditProfileIdentifier_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnEditProfileIdentifierOrBuilderList() {
                return this.onEditProfileIdentifier_;
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

            public Common$SDKEvent getOnProfileChipOptionSelect(int i) {
                return this.onProfileChipOptionSelect_.get(i);
            }

            public int getOnProfileChipOptionSelectCount() {
                return this.onProfileChipOptionSelect_.size();
            }

            public List<Common$SDKEvent> getOnProfileChipOptionSelectList() {
                return this.onProfileChipOptionSelect_;
            }

            public InterfaceC6691M getOnProfileChipOptionSelectOrBuilder(int i) {
                return this.onProfileChipOptionSelect_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnProfileChipOptionSelectOrBuilderList() {
                return this.onProfileChipOptionSelect_;
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

            public Common$SDKEvent getOnSecondaryButtonTap(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public int getOnSecondaryButtonTapCount() {
                return this.onSecondaryButtonTap_.size();
            }

            public List<Common$SDKEvent> getOnSecondaryButtonTapList() {
                return this.onSecondaryButtonTap_;
            }

            public InterfaceC6691M getOnSecondaryButtonTapOrBuilder(int i) {
                return this.onSecondaryButtonTap_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnSecondaryButtonTapOrBuilderList() {
                return this.onSecondaryButtonTap_;
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

            public static C6768a newBuilder(Events events) {
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

            private void addOnEditProfileIdentifier(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnEditProfileIdentifierIsMutable();
                this.onEditProfileIdentifier_.add(i, common$SDKEvent);
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

            private void addOnProfileChipOptionSelect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnProfileChipOptionSelectIsMutable();
                this.onProfileChipOptionSelect_.add(i, common$SDKEvent);
            }

            private void addOnReceive(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnReceiveIsMutable();
                this.onReceive_.add(i, common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(i, common$SDKEvent);
            }

            private void addOnSubmitTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(i, common$SDKEvent);
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

        public static final class Link2025EmptyLoadingPaneRendering extends GeneratedMessageLite<Link2025EmptyLoadingPaneRendering, C6769a> implements MessageLiteOrBuilder {
            public static final int AUTO_TRANSITION_DELAY_MS_FIELD_NUMBER = 1;
            private static final Link2025EmptyLoadingPaneRendering DEFAULT_INSTANCE;
            private static volatile Parser<Link2025EmptyLoadingPaneRendering> PARSER;
            private int autoTransitionDelayMs_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$Link2025EmptyLoadingPaneRendering$a */
            public static final class C6769a extends GeneratedMessageLite.Builder<Link2025EmptyLoadingPaneRendering, C6769a> implements MessageLiteOrBuilder {
                public C6769a() {
                    super(Link2025EmptyLoadingPaneRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering = new Link2025EmptyLoadingPaneRendering();
                DEFAULT_INSTANCE = link2025EmptyLoadingPaneRendering;
                GeneratedMessageLite.registerDefaultInstance(Link2025EmptyLoadingPaneRendering.class, link2025EmptyLoadingPaneRendering);
            }

            private Link2025EmptyLoadingPaneRendering() {
            }

            private void clearAutoTransitionDelayMs() {
                this.autoTransitionDelayMs_ = 0;
            }

            public static Link2025EmptyLoadingPaneRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6769a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Link2025EmptyLoadingPaneRendering parseDelimitedFrom(InputStream inputStream) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(ByteBuffer byteBuffer) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Link2025EmptyLoadingPaneRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAutoTransitionDelayMs(int i) {
                this.autoTransitionDelayMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Link2025EmptyLoadingPaneRendering();
                    case 2:
                        return new C6769a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"autoTransitionDelayMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Link2025EmptyLoadingPaneRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Link2025EmptyLoadingPaneRendering.class) {
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

            public int getAutoTransitionDelayMs() {
                return this.autoTransitionDelayMs_;
            }

            public static C6769a newBuilder(Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025EmptyLoadingPaneRendering);
            }

            public static Link2025EmptyLoadingPaneRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(ByteString byteString) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(byte[] bArr) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(InputStream inputStream) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(CodedInputStream codedInputStream) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Link2025EmptyLoadingPaneRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025EmptyLoadingPaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Link2025OTPEntryRendering extends GeneratedMessageLite<Link2025OTPEntryRendering, C6770a> implements MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 5;
            private static final Link2025OTPEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BRANDING_FIELD_NUMBER = 1;
            private static volatile Parser<Link2025OTPEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 2;
            public static final int PROMPT_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Common$ButtonContent button_;
            private int paneBranding_;
            private Common$ProfileChip profileChip_;
            private Common$Prompt prompt_;
            private Common$TwoToneText title_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$Link2025OTPEntryRendering$a */
            public static final class C6770a extends GeneratedMessageLite.Builder<Link2025OTPEntryRendering, C6770a> implements MessageLiteOrBuilder {
                public C6770a() {
                    super(Link2025OTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                Link2025OTPEntryRendering link2025OTPEntryRendering = new Link2025OTPEntryRendering();
                DEFAULT_INSTANCE = link2025OTPEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(Link2025OTPEntryRendering.class, link2025OTPEntryRendering);
            }

            private Link2025OTPEntryRendering() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneBranding() {
                this.paneBranding_ = 0;
            }

            private void clearProfileChip() {
                this.profileChip_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -5;
            }

            private void clearTitle() {
                this.title_ = null;
                this.bitField0_ &= -3;
            }

            public static Link2025OTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                Common$ProfileChip common$ProfileChip2 = this.profileChip_;
                if (common$ProfileChip2 == null || common$ProfileChip2 == Common$ProfileChip.getDefaultInstance()) {
                    this.profileChip_ = common$ProfileChip;
                } else {
                    this.profileChip_ = Common$ProfileChip.newBuilder(this.profileChip_).mergeFrom((Common$ProfileChip.C6467a) common$ProfileChip).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                Common$Prompt common$Prompt2 = this.prompt_;
                if (common$Prompt2 == null || common$Prompt2 == Common$Prompt.getDefaultInstance()) {
                    this.prompt_ = common$Prompt;
                } else {
                    this.prompt_ = Common$Prompt.newBuilder(this.prompt_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeTitle(Common$TwoToneText common$TwoToneText) {
                common$TwoToneText.getClass();
                Common$TwoToneText common$TwoToneText2 = this.title_;
                if (common$TwoToneText2 == null || common$TwoToneText2 == Common$TwoToneText.getDefaultInstance()) {
                    this.title_ = common$TwoToneText;
                } else {
                    this.title_ = Common$TwoToneText.newBuilder(this.title_).mergeFrom((Common$TwoToneText.C6545b) common$TwoToneText).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6770a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Link2025OTPEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025OTPEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Link2025OTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setPaneBranding(EnumC6639I enumC6639I) {
                this.paneBranding_ = enumC6639I.getNumber();
            }

            private void setPaneBrandingValue(int i) {
                this.paneBranding_ = i;
            }

            private void setProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                this.profileChip_ = common$ProfileChip;
                this.bitField0_ |= 1;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.prompt_ = common$Prompt;
                this.bitField0_ |= 4;
            }

            private void setTitle(Common$TwoToneText common$TwoToneText) {
                common$TwoToneText.getClass();
                this.title_ = common$TwoToneText;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Link2025OTPEntryRendering();
                    case 2:
                        return new C6770a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "paneBranding_", "profileChip_", "title_", "prompt_", "button_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Link2025OTPEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Link2025OTPEntryRendering.class) {
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

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public EnumC6639I getPaneBranding() {
                EnumC6639I enumC6639IForNumber = EnumC6639I.forNumber(this.paneBranding_);
                return enumC6639IForNumber == null ? EnumC6639I.UNRECOGNIZED : enumC6639IForNumber;
            }

            public int getPaneBrandingValue() {
                return this.paneBranding_;
            }

            public Common$ProfileChip getProfileChip() {
                Common$ProfileChip common$ProfileChip = this.profileChip_;
                return common$ProfileChip == null ? Common$ProfileChip.getDefaultInstance() : common$ProfileChip;
            }

            public Common$Prompt getPrompt() {
                Common$Prompt common$Prompt = this.prompt_;
                return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
            }

            public Common$TwoToneText getTitle() {
                Common$TwoToneText common$TwoToneText = this.title_;
                return common$TwoToneText == null ? Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasProfileChip() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6770a newBuilder(Link2025OTPEntryRendering link2025OTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025OTPEntryRendering);
            }

            public static Link2025OTPEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025OTPEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Link2025OTPEntryRendering parseFrom(ByteString byteString) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Link2025OTPEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Link2025OTPEntryRendering parseFrom(byte[] bArr) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Link2025OTPEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Link2025OTPEntryRendering parseFrom(InputStream inputStream) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025OTPEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025OTPEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Link2025OTPEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Link2025PhoneEntryRendering extends GeneratedMessageLite<Link2025PhoneEntryRendering, C6771a> implements MessageLiteOrBuilder {
            public static final int BODY_FIELD_NUMBER = 4;
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 6;
            public static final int BUTTON_FIELD_NUMBER = 5;
            public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 2;
            private static final Link2025PhoneEntryRendering DEFAULT_INSTANCE;
            public static final int PANE_BRANDING_FIELD_NUMBER = 1;
            private static volatile Parser<Link2025PhoneEntryRendering> PARSER = null;
            public static final int PROFILE_CHIP_FIELD_NUMBER = 8;
            public static final int PROMPT_FIELD_NUMBER = 7;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 9;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Common$AttributedLocalizedString body_;
            private Common$AttributedLocalizedString buttonDisclaimerText_;
            private Common$ButtonContent button_;
            private Common$RenderedAssetAppearance coBrandedAsset_;
            private int contentCase_ = 0;
            private Object content_;
            private int paneBranding_;
            private Common$ButtonContent secondaryButton_;
            private Common$TwoToneText title_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$Link2025PhoneEntryRendering$a */
            public static final class C6771a extends GeneratedMessageLite.Builder<Link2025PhoneEntryRendering, C6771a> implements MessageLiteOrBuilder {
                public C6771a() {
                    super(Link2025PhoneEntryRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$Link2025PhoneEntryRendering$b */
            public enum EnumC6772b {
                PROMPT(7),
                PROFILE_CHIP(8),
                CONTENT_NOT_SET(0);


                /* renamed from: a */
                public final int f2443a;

                EnumC6772b(int i) {
                    this.f2443a = i;
                }

                public static EnumC6772b forNumber(int i) {
                    if (i == 0) {
                        return CONTENT_NOT_SET;
                    }
                    if (i == 7) {
                        return PROMPT;
                    }
                    if (i != 8) {
                        return null;
                    }
                    return PROFILE_CHIP;
                }

                public int getNumber() {
                    return this.f2443a;
                }

                @Deprecated
                public static EnumC6772b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Link2025PhoneEntryRendering link2025PhoneEntryRendering = new Link2025PhoneEntryRendering();
                DEFAULT_INSTANCE = link2025PhoneEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(Link2025PhoneEntryRendering.class, link2025PhoneEntryRendering);
            }

            private Link2025PhoneEntryRendering() {
            }

            private void clearBody() {
                this.body_ = null;
                this.bitField0_ &= -5;
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -9;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -33;
            }

            private void clearCoBrandedAsset() {
                this.coBrandedAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
            }

            private void clearPaneBranding() {
                this.paneBranding_ = 0;
            }

            private void clearProfileChip() {
                if (this.contentCase_ == 8) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearPrompt() {
                if (this.contentCase_ == 7) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                }
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearTitle() {
                this.title_ = null;
                this.bitField0_ &= -3;
            }

            public static Link2025PhoneEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeBody(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.body_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.body_ = common$AttributedLocalizedString;
                } else {
                    this.body_ = Common$AttributedLocalizedString.newBuilder(this.body_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.button_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.button_ = common$ButtonContent;
                } else {
                    this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeCoBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.coBrandedAsset_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.coBrandedAsset_ = common$RenderedAssetAppearance;
                } else {
                    this.coBrandedAsset_ = Common$RenderedAssetAppearance.newBuilder(this.coBrandedAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                if (this.contentCase_ != 8 || this.content_ == Common$ProfileChip.getDefaultInstance()) {
                    this.content_ = common$ProfileChip;
                } else {
                    this.content_ = Common$ProfileChip.newBuilder((Common$ProfileChip) this.content_).mergeFrom((Common$ProfileChip.C6467a) common$ProfileChip).buildPartial();
                }
                this.contentCase_ = 8;
            }

            private void mergePrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                if (this.contentCase_ != 7 || this.content_ == Common$Prompt.getDefaultInstance()) {
                    this.content_ = common$Prompt;
                } else {
                    this.content_ = Common$Prompt.newBuilder((Common$Prompt) this.content_).mergeFrom((Common$Prompt.C6469a) common$Prompt).buildPartial();
                }
                this.contentCase_ = 7;
            }

            private void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.secondaryButton_ = common$ButtonContent;
                } else {
                    this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeTitle(Common$TwoToneText common$TwoToneText) {
                common$TwoToneText.getClass();
                Common$TwoToneText common$TwoToneText2 = this.title_;
                if (common$TwoToneText2 == null || common$TwoToneText2 == Common$TwoToneText.getDefaultInstance()) {
                    this.title_ = common$TwoToneText;
                } else {
                    this.title_ = Common$TwoToneText.newBuilder(this.title_).mergeFrom((Common$TwoToneText.C6545b) common$TwoToneText).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6771a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Link2025PhoneEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025PhoneEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Link2025PhoneEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBody(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.body_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 32;
            }

            private void setCoBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.coBrandedAsset_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setPaneBranding(EnumC6639I enumC6639I) {
                this.paneBranding_ = enumC6639I.getNumber();
            }

            private void setPaneBrandingValue(int i) {
                this.paneBranding_ = i;
            }

            private void setProfileChip(Common$ProfileChip common$ProfileChip) {
                common$ProfileChip.getClass();
                this.content_ = common$ProfileChip;
                this.contentCase_ = 8;
            }

            private void setPrompt(Common$Prompt common$Prompt) {
                common$Prompt.getClass();
                this.content_ = common$Prompt;
                this.contentCase_ = 7;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setTitle(Common$TwoToneText common$TwoToneText) {
                common$TwoToneText.getClass();
                this.title_ = common$TwoToneText;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Link2025PhoneEntryRendering();
                    case 2:
                        return new C6771a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0005\u0007<\u0000\b<\u0000\tဉ\u0004", new Object[]{"content_", "contentCase_", "bitField0_", "paneBranding_", "coBrandedAsset_", "title_", "body_", "button_", "buttonDisclaimerText_", Common$Prompt.class, Common$ProfileChip.class, "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Link2025PhoneEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Link2025PhoneEntryRendering.class) {
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

            public Common$AttributedLocalizedString getBody() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.body_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getButton() {
                Common$ButtonContent common$ButtonContent = this.button_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$AttributedLocalizedString getButtonDisclaimerText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$RenderedAssetAppearance getCoBrandedAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.coBrandedAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public EnumC6772b getContentCase() {
                return EnumC6772b.forNumber(this.contentCase_);
            }

            public EnumC6639I getPaneBranding() {
                EnumC6639I enumC6639IForNumber = EnumC6639I.forNumber(this.paneBranding_);
                return enumC6639IForNumber == null ? EnumC6639I.UNRECOGNIZED : enumC6639IForNumber;
            }

            public int getPaneBrandingValue() {
                return this.paneBranding_;
            }

            public Common$ProfileChip getProfileChip() {
                return this.contentCase_ == 8 ? (Common$ProfileChip) this.content_ : Common$ProfileChip.getDefaultInstance();
            }

            public Common$Prompt getPrompt() {
                return this.contentCase_ == 7 ? (Common$Prompt) this.content_ : Common$Prompt.getDefaultInstance();
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$TwoToneText getTitle() {
                Common$TwoToneText common$TwoToneText = this.title_;
                return common$TwoToneText == null ? Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
            }

            public boolean hasBody() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasCoBrandedAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasProfileChip() {
                return this.contentCase_ == 8;
            }

            public boolean hasPrompt() {
                return this.contentCase_ == 7;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6771a newBuilder(Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(link2025PhoneEntryRendering);
            }

            public static Link2025PhoneEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025PhoneEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Link2025PhoneEntryRendering parseFrom(ByteString byteString) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Link2025PhoneEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Link2025PhoneEntryRendering parseFrom(byte[] bArr) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Link2025PhoneEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Link2025PhoneEntryRendering parseFrom(InputStream inputStream) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Link2025PhoneEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Link2025PhoneEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Link2025PhoneEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Link2025PhoneEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OTPEntryRendering extends GeneratedMessageLite<OTPEntryRendering, C6773a> implements MessageLiteOrBuilder {
            public static final int CO_BRANDED_OTP_RENDERING_FIELD_NUMBER = 2;
            private static final OTPEntryRendering DEFAULT_INSTANCE;
            public static final int DEFAULT_OTP_RENDERING_FIELD_NUMBER = 1;
            public static final int LINK_2025_OTP_RENDERING_FIELD_NUMBER = 3;
            private static volatile Parser<OTPEntryRendering> PARSER;
            private int formatCase_ = 0;
            private Object format_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$OTPEntryRendering$a */
            public static final class C6773a extends GeneratedMessageLite.Builder<OTPEntryRendering, C6773a> implements MessageLiteOrBuilder {
                public C6773a() {
                    super(OTPEntryRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$OTPEntryRendering$b */
            public enum EnumC6774b {
                DEFAULT_OTP_RENDERING(1),
                CO_BRANDED_OTP_RENDERING(2),
                LINK_2025_OTP_RENDERING(3),
                FORMAT_NOT_SET(0);


                /* renamed from: a */
                public final int f2445a;

                EnumC6774b(int i) {
                    this.f2445a = i;
                }

                public static EnumC6774b forNumber(int i) {
                    if (i == 0) {
                        return FORMAT_NOT_SET;
                    }
                    if (i == 1) {
                        return DEFAULT_OTP_RENDERING;
                    }
                    if (i == 2) {
                        return CO_BRANDED_OTP_RENDERING;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return LINK_2025_OTP_RENDERING;
                }

                public int getNumber() {
                    return this.f2445a;
                }

                @Deprecated
                public static EnumC6774b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                OTPEntryRendering oTPEntryRendering = new OTPEntryRendering();
                DEFAULT_INSTANCE = oTPEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(OTPEntryRendering.class, oTPEntryRendering);
            }

            private OTPEntryRendering() {
            }

            private void clearCoBrandedOtpRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearDefaultOtpRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025OtpRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static OTPEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeCoBrandedOtpRendering(CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                coBrandedOTPEntryRendering.getClass();
                if (this.formatCase_ != 2 || this.format_ == CoBrandedOTPEntryRendering.getDefaultInstance()) {
                    this.format_ = coBrandedOTPEntryRendering;
                } else {
                    this.format_ = CoBrandedOTPEntryRendering.newBuilder((CoBrandedOTPEntryRendering) this.format_).mergeFrom((CoBrandedOTPEntryRendering.C6758a) coBrandedOTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            private void mergeDefaultOtpRendering(DefaultOTPEntryRendering defaultOTPEntryRendering) {
                defaultOTPEntryRendering.getClass();
                if (this.formatCase_ != 1 || this.format_ == DefaultOTPEntryRendering.getDefaultInstance()) {
                    this.format_ = defaultOTPEntryRendering;
                } else {
                    this.format_ = DefaultOTPEntryRendering.newBuilder((DefaultOTPEntryRendering) this.format_).mergeFrom((DefaultOTPEntryRendering.C6762a) defaultOTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeLink2025OtpRendering(Link2025OTPEntryRendering link2025OTPEntryRendering) {
                link2025OTPEntryRendering.getClass();
                if (this.formatCase_ != 3 || this.format_ == Link2025OTPEntryRendering.getDefaultInstance()) {
                    this.format_ = link2025OTPEntryRendering;
                } else {
                    this.format_ = Link2025OTPEntryRendering.newBuilder((Link2025OTPEntryRendering) this.format_).mergeFrom((Link2025OTPEntryRendering.C6770a) link2025OTPEntryRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            public static C6773a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OTPEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (OTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OTPEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OTPEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCoBrandedOtpRendering(CoBrandedOTPEntryRendering coBrandedOTPEntryRendering) {
                coBrandedOTPEntryRendering.getClass();
                this.format_ = coBrandedOTPEntryRendering;
                this.formatCase_ = 2;
            }

            private void setDefaultOtpRendering(DefaultOTPEntryRendering defaultOTPEntryRendering) {
                defaultOTPEntryRendering.getClass();
                this.format_ = defaultOTPEntryRendering;
                this.formatCase_ = 1;
            }

            private void setLink2025OtpRendering(Link2025OTPEntryRendering link2025OTPEntryRendering) {
                link2025OTPEntryRendering.getClass();
                this.format_ = link2025OTPEntryRendering;
                this.formatCase_ = 3;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OTPEntryRendering();
                    case 2:
                        return new C6773a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"format_", "formatCase_", DefaultOTPEntryRendering.class, CoBrandedOTPEntryRendering.class, Link2025OTPEntryRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OTPEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OTPEntryRendering.class) {
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

            public CoBrandedOTPEntryRendering getCoBrandedOtpRendering() {
                return this.formatCase_ == 2 ? (CoBrandedOTPEntryRendering) this.format_ : CoBrandedOTPEntryRendering.getDefaultInstance();
            }

            public DefaultOTPEntryRendering getDefaultOtpRendering() {
                return this.formatCase_ == 1 ? (DefaultOTPEntryRendering) this.format_ : DefaultOTPEntryRendering.getDefaultInstance();
            }

            public EnumC6774b getFormatCase() {
                return EnumC6774b.forNumber(this.formatCase_);
            }

            public Link2025OTPEntryRendering getLink2025OtpRendering() {
                return this.formatCase_ == 3 ? (Link2025OTPEntryRendering) this.format_ : Link2025OTPEntryRendering.getDefaultInstance();
            }

            public boolean hasCoBrandedOtpRendering() {
                return this.formatCase_ == 2;
            }

            public boolean hasDefaultOtpRendering() {
                return this.formatCase_ == 1;
            }

            public boolean hasLink2025OtpRendering() {
                return this.formatCase_ == 3;
            }

            public static C6773a newBuilder(OTPEntryRendering oTPEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(oTPEntryRendering);
            }

            public static OTPEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OTPEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OTPEntryRendering parseFrom(ByteString byteString) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OTPEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OTPEntryRendering parseFrom(byte[] bArr) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OTPEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OTPEntryRendering parseFrom(InputStream inputStream) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OTPEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OTPEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OTPEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OTPEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PasskeyAuthenticationRendering extends GeneratedMessageLite<PasskeyAuthenticationRendering, C6775a> implements MessageLiteOrBuilder {
            private static final PasskeyAuthenticationRendering DEFAULT_INSTANCE;
            private static volatile Parser<PasskeyAuthenticationRendering> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$PasskeyAuthenticationRendering$a */
            public static final class C6775a extends GeneratedMessageLite.Builder<PasskeyAuthenticationRendering, C6775a> implements MessageLiteOrBuilder {
                public C6775a() {
                    super(PasskeyAuthenticationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                PasskeyAuthenticationRendering passkeyAuthenticationRendering = new PasskeyAuthenticationRendering();
                DEFAULT_INSTANCE = passkeyAuthenticationRendering;
                GeneratedMessageLite.registerDefaultInstance(PasskeyAuthenticationRendering.class, passkeyAuthenticationRendering);
            }

            private PasskeyAuthenticationRendering() {
            }

            public static PasskeyAuthenticationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6775a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PasskeyAuthenticationRendering parseDelimitedFrom(InputStream inputStream) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyAuthenticationRendering parseFrom(ByteBuffer byteBuffer) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PasskeyAuthenticationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PasskeyAuthenticationRendering();
                    case 2:
                        return new C6775a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PasskeyAuthenticationRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PasskeyAuthenticationRendering.class) {
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

            public static C6775a newBuilder(PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
                return DEFAULT_INSTANCE.createBuilder(passkeyAuthenticationRendering);
            }

            public static PasskeyAuthenticationRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyAuthenticationRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PasskeyAuthenticationRendering parseFrom(ByteString byteString) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PasskeyAuthenticationRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PasskeyAuthenticationRendering parseFrom(byte[] bArr) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PasskeyAuthenticationRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PasskeyAuthenticationRendering parseFrom(InputStream inputStream) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyAuthenticationRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyAuthenticationRendering parseFrom(CodedInputStream codedInputStream) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PasskeyAuthenticationRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PasskeyCreationRendering extends GeneratedMessageLite<PasskeyCreationRendering, C6776a> implements MessageLiteOrBuilder {
            private static final PasskeyCreationRendering DEFAULT_INSTANCE;
            private static volatile Parser<PasskeyCreationRendering> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$PasskeyCreationRendering$a */
            public static final class C6776a extends GeneratedMessageLite.Builder<PasskeyCreationRendering, C6776a> implements MessageLiteOrBuilder {
                public C6776a() {
                    super(PasskeyCreationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                PasskeyCreationRendering passkeyCreationRendering = new PasskeyCreationRendering();
                DEFAULT_INSTANCE = passkeyCreationRendering;
                GeneratedMessageLite.registerDefaultInstance(PasskeyCreationRendering.class, passkeyCreationRendering);
            }

            private PasskeyCreationRendering() {
            }

            public static PasskeyCreationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6776a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PasskeyCreationRendering parseDelimitedFrom(InputStream inputStream) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyCreationRendering parseFrom(ByteBuffer byteBuffer) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PasskeyCreationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PasskeyCreationRendering();
                    case 2:
                        return new C6776a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PasskeyCreationRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PasskeyCreationRendering.class) {
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

            public static C6776a newBuilder(PasskeyCreationRendering passkeyCreationRendering) {
                return DEFAULT_INSTANCE.createBuilder(passkeyCreationRendering);
            }

            public static PasskeyCreationRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyCreationRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PasskeyCreationRendering parseFrom(ByteString byteString) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PasskeyCreationRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PasskeyCreationRendering parseFrom(byte[] bArr) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PasskeyCreationRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PasskeyCreationRendering parseFrom(InputStream inputStream) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyCreationRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyCreationRendering parseFrom(CodedInputStream codedInputStream) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PasskeyCreationRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyCreationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ProfileIdentifierEntryRendering extends GeneratedMessageLite<ProfileIdentifierEntryRendering, C6777a> implements MessageLiteOrBuilder {
            public static final int COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 6;
            public static final int CO_BRANDED_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 4;
            private static final ProfileIdentifierEntryRendering DEFAULT_INSTANCE;
            public static final int DEFAULT_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 1;
            public static final int END_OF_FLOW_EMAIL_ENTRY_RENDERING_FIELD_NUMBER = 5;
            public static final int END_OF_FLOW_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 2;
            public static final int LINK_2025_PHONE_ENTRY_RENDERING_FIELD_NUMBER = 3;
            private static volatile Parser<ProfileIdentifierEntryRendering> PARSER;
            private int formatCase_ = 0;
            private Object format_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$ProfileIdentifierEntryRendering$a */
            public static final class C6777a extends GeneratedMessageLite.Builder<ProfileIdentifierEntryRendering, C6777a> implements MessageLiteOrBuilder {
                public C6777a() {
                    super(ProfileIdentifierEntryRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$ProfileIdentifierEntryRendering$b */
            public enum EnumC6778b {
                DEFAULT_PHONE_ENTRY_RENDERING(1),
                END_OF_FLOW_PHONE_ENTRY_RENDERING(2),
                LINK_2025_PHONE_ENTRY_RENDERING(3),
                CO_BRANDED_PHONE_ENTRY_RENDERING(4),
                END_OF_FLOW_EMAIL_ENTRY_RENDERING(5),
                COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING(6),
                FORMAT_NOT_SET(0);


                /* renamed from: a */
                public final int f2447a;

                EnumC6778b(int i) {
                    this.f2447a = i;
                }

                public static EnumC6778b forNumber(int i) {
                    switch (i) {
                        case 0:
                            return FORMAT_NOT_SET;
                        case 1:
                            return DEFAULT_PHONE_ENTRY_RENDERING;
                        case 2:
                            return END_OF_FLOW_PHONE_ENTRY_RENDERING;
                        case 3:
                            return LINK_2025_PHONE_ENTRY_RENDERING;
                        case 4:
                            return CO_BRANDED_PHONE_ENTRY_RENDERING;
                        case 5:
                            return END_OF_FLOW_EMAIL_ENTRY_RENDERING;
                        case 6:
                            return COMBINED_CONSENT_AND_PHONE_ENTRY_RENDERING;
                        default:
                            return null;
                    }
                }

                public int getNumber() {
                    return this.f2447a;
                }

                @Deprecated
                public static EnumC6778b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                ProfileIdentifierEntryRendering profileIdentifierEntryRendering = new ProfileIdentifierEntryRendering();
                DEFAULT_INSTANCE = profileIdentifierEntryRendering;
                GeneratedMessageLite.registerDefaultInstance(ProfileIdentifierEntryRendering.class, profileIdentifierEntryRendering);
            }

            private ProfileIdentifierEntryRendering() {
            }

            private void clearCoBrandedPhoneEntryRendering() {
                if (this.formatCase_ == 4) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearCombinedConsentAndPhoneEntryRendering() {
                if (this.formatCase_ == 6) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearDefaultPhoneEntryRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowEmailEntryRendering() {
                if (this.formatCase_ == 5) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowPhoneEntryRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025PhoneEntryRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static ProfileIdentifierEntryRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeCoBrandedPhoneEntryRendering(CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                coBrandedPhoneEntryRendering.getClass();
                if (this.formatCase_ != 4 || this.format_ == CoBrandedPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = coBrandedPhoneEntryRendering;
                } else {
                    this.format_ = CoBrandedPhoneEntryRendering.newBuilder((CoBrandedPhoneEntryRendering) this.format_).mergeFrom((CoBrandedPhoneEntryRendering.C6759a) coBrandedPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 4;
            }

            private void mergeCombinedConsentAndPhoneEntryRendering(CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                combinedConsentAndPhoneEntryRendering.getClass();
                if (this.formatCase_ != 6 || this.format_ == CombinedConsentAndPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = combinedConsentAndPhoneEntryRendering;
                } else {
                    this.format_ = CombinedConsentAndPhoneEntryRendering.newBuilder((CombinedConsentAndPhoneEntryRendering) this.format_).mergeFrom((CombinedConsentAndPhoneEntryRendering.C6760a) combinedConsentAndPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 6;
            }

            private void mergeDefaultPhoneEntryRendering(DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                defaultPhoneEntryRendering.getClass();
                if (this.formatCase_ != 1 || this.format_ == DefaultPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = defaultPhoneEntryRendering;
                } else {
                    this.format_ = DefaultPhoneEntryRendering.newBuilder((DefaultPhoneEntryRendering) this.format_).mergeFrom((DefaultPhoneEntryRendering.C6763a) defaultPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeEndOfFlowEmailEntryRendering(EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                endOfFlowEmailEntryRendering.getClass();
                if (this.formatCase_ != 5 || this.format_ == EndOfFlowEmailEntryRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowEmailEntryRendering;
                } else {
                    this.format_ = EndOfFlowEmailEntryRendering.newBuilder((EndOfFlowEmailEntryRendering) this.format_).mergeFrom((EndOfFlowEmailEntryRendering.C6764a) endOfFlowEmailEntryRendering).buildPartial();
                }
                this.formatCase_ = 5;
            }

            private void mergeEndOfFlowPhoneEntryRendering(EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                endOfFlowPhoneEntryRendering.getClass();
                if (this.formatCase_ != 2 || this.format_ == EndOfFlowPhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowPhoneEntryRendering;
                } else {
                    this.format_ = EndOfFlowPhoneEntryRendering.newBuilder((EndOfFlowPhoneEntryRendering) this.format_).mergeFrom((EndOfFlowPhoneEntryRendering.C6766a) endOfFlowPhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            private void mergeLink2025PhoneEntryRendering(Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                link2025PhoneEntryRendering.getClass();
                if (this.formatCase_ != 3 || this.format_ == Link2025PhoneEntryRendering.getDefaultInstance()) {
                    this.format_ = link2025PhoneEntryRendering;
                } else {
                    this.format_ = Link2025PhoneEntryRendering.newBuilder((Link2025PhoneEntryRendering) this.format_).mergeFrom((Link2025PhoneEntryRendering.C6771a) link2025PhoneEntryRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            public static C6777a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ProfileIdentifierEntryRendering parseDelimitedFrom(InputStream inputStream) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProfileIdentifierEntryRendering parseFrom(ByteBuffer byteBuffer) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ProfileIdentifierEntryRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCoBrandedPhoneEntryRendering(CoBrandedPhoneEntryRendering coBrandedPhoneEntryRendering) {
                coBrandedPhoneEntryRendering.getClass();
                this.format_ = coBrandedPhoneEntryRendering;
                this.formatCase_ = 4;
            }

            private void setCombinedConsentAndPhoneEntryRendering(CombinedConsentAndPhoneEntryRendering combinedConsentAndPhoneEntryRendering) {
                combinedConsentAndPhoneEntryRendering.getClass();
                this.format_ = combinedConsentAndPhoneEntryRendering;
                this.formatCase_ = 6;
            }

            private void setDefaultPhoneEntryRendering(DefaultPhoneEntryRendering defaultPhoneEntryRendering) {
                defaultPhoneEntryRendering.getClass();
                this.format_ = defaultPhoneEntryRendering;
                this.formatCase_ = 1;
            }

            private void setEndOfFlowEmailEntryRendering(EndOfFlowEmailEntryRendering endOfFlowEmailEntryRendering) {
                endOfFlowEmailEntryRendering.getClass();
                this.format_ = endOfFlowEmailEntryRendering;
                this.formatCase_ = 5;
            }

            private void setEndOfFlowPhoneEntryRendering(EndOfFlowPhoneEntryRendering endOfFlowPhoneEntryRendering) {
                endOfFlowPhoneEntryRendering.getClass();
                this.format_ = endOfFlowPhoneEntryRendering;
                this.formatCase_ = 2;
            }

            private void setLink2025PhoneEntryRendering(Link2025PhoneEntryRendering link2025PhoneEntryRendering) {
                link2025PhoneEntryRendering.getClass();
                this.format_ = link2025PhoneEntryRendering;
                this.formatCase_ = 3;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ProfileIdentifierEntryRendering();
                    case 2:
                        return new C6777a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"format_", "formatCase_", DefaultPhoneEntryRendering.class, EndOfFlowPhoneEntryRendering.class, Link2025PhoneEntryRendering.class, CoBrandedPhoneEntryRendering.class, EndOfFlowEmailEntryRendering.class, CombinedConsentAndPhoneEntryRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ProfileIdentifierEntryRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ProfileIdentifierEntryRendering.class) {
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

            public CoBrandedPhoneEntryRendering getCoBrandedPhoneEntryRendering() {
                return this.formatCase_ == 4 ? (CoBrandedPhoneEntryRendering) this.format_ : CoBrandedPhoneEntryRendering.getDefaultInstance();
            }

            public CombinedConsentAndPhoneEntryRendering getCombinedConsentAndPhoneEntryRendering() {
                return this.formatCase_ == 6 ? (CombinedConsentAndPhoneEntryRendering) this.format_ : CombinedConsentAndPhoneEntryRendering.getDefaultInstance();
            }

            public DefaultPhoneEntryRendering getDefaultPhoneEntryRendering() {
                return this.formatCase_ == 1 ? (DefaultPhoneEntryRendering) this.format_ : DefaultPhoneEntryRendering.getDefaultInstance();
            }

            public EndOfFlowEmailEntryRendering getEndOfFlowEmailEntryRendering() {
                return this.formatCase_ == 5 ? (EndOfFlowEmailEntryRendering) this.format_ : EndOfFlowEmailEntryRendering.getDefaultInstance();
            }

            public EndOfFlowPhoneEntryRendering getEndOfFlowPhoneEntryRendering() {
                return this.formatCase_ == 2 ? (EndOfFlowPhoneEntryRendering) this.format_ : EndOfFlowPhoneEntryRendering.getDefaultInstance();
            }

            public EnumC6778b getFormatCase() {
                return EnumC6778b.forNumber(this.formatCase_);
            }

            public Link2025PhoneEntryRendering getLink2025PhoneEntryRendering() {
                return this.formatCase_ == 3 ? (Link2025PhoneEntryRendering) this.format_ : Link2025PhoneEntryRendering.getDefaultInstance();
            }

            public boolean hasCoBrandedPhoneEntryRendering() {
                return this.formatCase_ == 4;
            }

            public boolean hasCombinedConsentAndPhoneEntryRendering() {
                return this.formatCase_ == 6;
            }

            public boolean hasDefaultPhoneEntryRendering() {
                return this.formatCase_ == 1;
            }

            public boolean hasEndOfFlowEmailEntryRendering() {
                return this.formatCase_ == 5;
            }

            public boolean hasEndOfFlowPhoneEntryRendering() {
                return this.formatCase_ == 2;
            }

            public boolean hasLink2025PhoneEntryRendering() {
                return this.formatCase_ == 3;
            }

            public static C6777a newBuilder(ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
                return DEFAULT_INSTANCE.createBuilder(profileIdentifierEntryRendering);
            }

            public static ProfileIdentifierEntryRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ProfileIdentifierEntryRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ProfileIdentifierEntryRendering parseFrom(ByteString byteString) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ProfileIdentifierEntryRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ProfileIdentifierEntryRendering parseFrom(byte[] bArr) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ProfileIdentifierEntryRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ProfileIdentifierEntryRendering parseFrom(InputStream inputStream) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ProfileIdentifierEntryRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ProfileIdentifierEntryRendering parseFrom(CodedInputStream codedInputStream) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ProfileIdentifierEntryRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ProfileIdentifierEntryRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SilentNetworkAuthenticationRendering extends GeneratedMessageLite<SilentNetworkAuthenticationRendering, C6779a> implements MessageLiteOrBuilder {
            private static final SilentNetworkAuthenticationRendering DEFAULT_INSTANCE;
            private static volatile Parser<SilentNetworkAuthenticationRendering> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$SilentNetworkAuthenticationRendering$a */
            public static final class C6779a extends GeneratedMessageLite.Builder<SilentNetworkAuthenticationRendering, C6779a> implements MessageLiteOrBuilder {
                public C6779a() {
                    super(SilentNetworkAuthenticationRendering.DEFAULT_INSTANCE);
                }
            }

            static {
                SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering = new SilentNetworkAuthenticationRendering();
                DEFAULT_INSTANCE = silentNetworkAuthenticationRendering;
                GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuthenticationRendering.class, silentNetworkAuthenticationRendering);
            }

            private SilentNetworkAuthenticationRendering() {
            }

            public static SilentNetworkAuthenticationRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6779a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SilentNetworkAuthenticationRendering parseDelimitedFrom(InputStream inputStream) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(ByteBuffer byteBuffer) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SilentNetworkAuthenticationRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SilentNetworkAuthenticationRendering();
                    case 2:
                        return new C6779a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SilentNetworkAuthenticationRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SilentNetworkAuthenticationRendering.class) {
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

            public static C6779a newBuilder(SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                return DEFAULT_INSTANCE.createBuilder(silentNetworkAuthenticationRendering);
            }

            public static SilentNetworkAuthenticationRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(ByteString byteString) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(byte[] bArr) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(InputStream inputStream) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(CodedInputStream codedInputStream) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SilentNetworkAuthenticationRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SilentNetworkAuthenticationRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TransientRendering extends GeneratedMessageLite<TransientRendering, C6780a> implements MessageLiteOrBuilder {
            public static final int BYPASS_PHONE_NUMBER_WARNING_RENDERING_FIELD_NUMBER = 1;
            public static final int CO_BRANDED_LOADING_PANE_RENDERING_FIELD_NUMBER = 3;
            private static final TransientRendering DEFAULT_INSTANCE;
            public static final int END_OF_FLOW_SUCCESS_PANE_RENDERING_FIELD_NUMBER = 4;
            public static final int LINK_2025_EMPTY_LOADING_PANE_RENDERING_FIELD_NUMBER = 5;
            private static volatile Parser<TransientRendering> PARSER = null;
            public static final int SILENT_NETWORK_AUTHENTICATION_RENDERING_FIELD_NUMBER = 2;
            private int formatCase_ = 0;
            private Object format_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$TransientRendering$a */
            public static final class C6780a extends GeneratedMessageLite.Builder<TransientRendering, C6780a> implements MessageLiteOrBuilder {
                public C6780a() {
                    super(TransientRendering.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$TransientRendering$b */
            public enum EnumC6781b {
                BYPASS_PHONE_NUMBER_WARNING_RENDERING(1),
                SILENT_NETWORK_AUTHENTICATION_RENDERING(2),
                CO_BRANDED_LOADING_PANE_RENDERING(3),
                END_OF_FLOW_SUCCESS_PANE_RENDERING(4),
                LINK_2025_EMPTY_LOADING_PANE_RENDERING(5),
                FORMAT_NOT_SET(0);


                /* renamed from: a */
                public final int f2449a;

                EnumC6781b(int i) {
                    this.f2449a = i;
                }

                public static EnumC6781b forNumber(int i) {
                    if (i == 0) {
                        return FORMAT_NOT_SET;
                    }
                    if (i == 1) {
                        return BYPASS_PHONE_NUMBER_WARNING_RENDERING;
                    }
                    if (i == 2) {
                        return SILENT_NETWORK_AUTHENTICATION_RENDERING;
                    }
                    if (i == 3) {
                        return CO_BRANDED_LOADING_PANE_RENDERING;
                    }
                    if (i == 4) {
                        return END_OF_FLOW_SUCCESS_PANE_RENDERING;
                    }
                    if (i != 5) {
                        return null;
                    }
                    return LINK_2025_EMPTY_LOADING_PANE_RENDERING;
                }

                public int getNumber() {
                    return this.f2449a;
                }

                @Deprecated
                public static EnumC6781b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                TransientRendering transientRendering = new TransientRendering();
                DEFAULT_INSTANCE = transientRendering;
                GeneratedMessageLite.registerDefaultInstance(TransientRendering.class, transientRendering);
            }

            private TransientRendering() {
            }

            private void clearBypassPhoneNumberWarningRendering() {
                if (this.formatCase_ == 1) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearCoBrandedLoadingPaneRendering() {
                if (this.formatCase_ == 3) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearEndOfFlowSuccessPaneRendering() {
                if (this.formatCase_ == 4) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearFormat() {
                this.formatCase_ = 0;
                this.format_ = null;
            }

            private void clearLink2025EmptyLoadingPaneRendering() {
                if (this.formatCase_ == 5) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            private void clearSilentNetworkAuthenticationRendering() {
                if (this.formatCase_ == 2) {
                    this.formatCase_ = 0;
                    this.format_ = null;
                }
            }

            public static TransientRendering getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeBypassPhoneNumberWarningRendering(BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                bypassPhoneNumberWarningRendering.getClass();
                if (this.formatCase_ != 1 || this.format_ == BypassPhoneNumberWarningRendering.getDefaultInstance()) {
                    this.format_ = bypassPhoneNumberWarningRendering;
                } else {
                    this.format_ = BypassPhoneNumberWarningRendering.newBuilder((BypassPhoneNumberWarningRendering) this.format_).mergeFrom((BypassPhoneNumberWarningRendering.C6756a) bypassPhoneNumberWarningRendering).buildPartial();
                }
                this.formatCase_ = 1;
            }

            private void mergeCoBrandedLoadingPaneRendering(CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                coBrandedLoadingPaneRendering.getClass();
                if (this.formatCase_ != 3 || this.format_ == CoBrandedLoadingPaneRendering.getDefaultInstance()) {
                    this.format_ = coBrandedLoadingPaneRendering;
                } else {
                    this.format_ = CoBrandedLoadingPaneRendering.newBuilder((CoBrandedLoadingPaneRendering) this.format_).mergeFrom((CoBrandedLoadingPaneRendering.C6757a) coBrandedLoadingPaneRendering).buildPartial();
                }
                this.formatCase_ = 3;
            }

            private void mergeEndOfFlowSuccessPaneRendering(EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                endOfFlowSuccessPaneRendering.getClass();
                if (this.formatCase_ != 4 || this.format_ == EndOfFlowSuccessPaneRendering.getDefaultInstance()) {
                    this.format_ = endOfFlowSuccessPaneRendering;
                } else {
                    this.format_ = EndOfFlowSuccessPaneRendering.newBuilder((EndOfFlowSuccessPaneRendering) this.format_).mergeFrom((EndOfFlowSuccessPaneRendering.C6767a) endOfFlowSuccessPaneRendering).buildPartial();
                }
                this.formatCase_ = 4;
            }

            private void mergeLink2025EmptyLoadingPaneRendering(Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                link2025EmptyLoadingPaneRendering.getClass();
                if (this.formatCase_ != 5 || this.format_ == Link2025EmptyLoadingPaneRendering.getDefaultInstance()) {
                    this.format_ = link2025EmptyLoadingPaneRendering;
                } else {
                    this.format_ = Link2025EmptyLoadingPaneRendering.newBuilder((Link2025EmptyLoadingPaneRendering) this.format_).mergeFrom((Link2025EmptyLoadingPaneRendering.C6769a) link2025EmptyLoadingPaneRendering).buildPartial();
                }
                this.formatCase_ = 5;
            }

            private void mergeSilentNetworkAuthenticationRendering(SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                silentNetworkAuthenticationRendering.getClass();
                if (this.formatCase_ != 2 || this.format_ == SilentNetworkAuthenticationRendering.getDefaultInstance()) {
                    this.format_ = silentNetworkAuthenticationRendering;
                } else {
                    this.format_ = SilentNetworkAuthenticationRendering.newBuilder((SilentNetworkAuthenticationRendering) this.format_).mergeFrom((SilentNetworkAuthenticationRendering.C6779a) silentNetworkAuthenticationRendering).buildPartial();
                }
                this.formatCase_ = 2;
            }

            public static C6780a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TransientRendering parseDelimitedFrom(InputStream inputStream) {
                return (TransientRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransientRendering parseFrom(ByteBuffer byteBuffer) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TransientRendering> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBypassPhoneNumberWarningRendering(BypassPhoneNumberWarningRendering bypassPhoneNumberWarningRendering) {
                bypassPhoneNumberWarningRendering.getClass();
                this.format_ = bypassPhoneNumberWarningRendering;
                this.formatCase_ = 1;
            }

            private void setCoBrandedLoadingPaneRendering(CoBrandedLoadingPaneRendering coBrandedLoadingPaneRendering) {
                coBrandedLoadingPaneRendering.getClass();
                this.format_ = coBrandedLoadingPaneRendering;
                this.formatCase_ = 3;
            }

            private void setEndOfFlowSuccessPaneRendering(EndOfFlowSuccessPaneRendering endOfFlowSuccessPaneRendering) {
                endOfFlowSuccessPaneRendering.getClass();
                this.format_ = endOfFlowSuccessPaneRendering;
                this.formatCase_ = 4;
            }

            private void setLink2025EmptyLoadingPaneRendering(Link2025EmptyLoadingPaneRendering link2025EmptyLoadingPaneRendering) {
                link2025EmptyLoadingPaneRendering.getClass();
                this.format_ = link2025EmptyLoadingPaneRendering;
                this.formatCase_ = 5;
            }

            private void setSilentNetworkAuthenticationRendering(SilentNetworkAuthenticationRendering silentNetworkAuthenticationRendering) {
                silentNetworkAuthenticationRendering.getClass();
                this.format_ = silentNetworkAuthenticationRendering;
                this.formatCase_ = 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TransientRendering();
                    case 2:
                        return new C6780a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"format_", "formatCase_", BypassPhoneNumberWarningRendering.class, SilentNetworkAuthenticationRendering.class, CoBrandedLoadingPaneRendering.class, EndOfFlowSuccessPaneRendering.class, Link2025EmptyLoadingPaneRendering.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TransientRendering> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TransientRendering.class) {
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

            public BypassPhoneNumberWarningRendering getBypassPhoneNumberWarningRendering() {
                return this.formatCase_ == 1 ? (BypassPhoneNumberWarningRendering) this.format_ : BypassPhoneNumberWarningRendering.getDefaultInstance();
            }

            public CoBrandedLoadingPaneRendering getCoBrandedLoadingPaneRendering() {
                return this.formatCase_ == 3 ? (CoBrandedLoadingPaneRendering) this.format_ : CoBrandedLoadingPaneRendering.getDefaultInstance();
            }

            public EndOfFlowSuccessPaneRendering getEndOfFlowSuccessPaneRendering() {
                return this.formatCase_ == 4 ? (EndOfFlowSuccessPaneRendering) this.format_ : EndOfFlowSuccessPaneRendering.getDefaultInstance();
            }

            public EnumC6781b getFormatCase() {
                return EnumC6781b.forNumber(this.formatCase_);
            }

            public Link2025EmptyLoadingPaneRendering getLink2025EmptyLoadingPaneRendering() {
                return this.formatCase_ == 5 ? (Link2025EmptyLoadingPaneRendering) this.format_ : Link2025EmptyLoadingPaneRendering.getDefaultInstance();
            }

            public SilentNetworkAuthenticationRendering getSilentNetworkAuthenticationRendering() {
                return this.formatCase_ == 2 ? (SilentNetworkAuthenticationRendering) this.format_ : SilentNetworkAuthenticationRendering.getDefaultInstance();
            }

            public boolean hasBypassPhoneNumberWarningRendering() {
                return this.formatCase_ == 1;
            }

            public boolean hasCoBrandedLoadingPaneRendering() {
                return this.formatCase_ == 3;
            }

            public boolean hasEndOfFlowSuccessPaneRendering() {
                return this.formatCase_ == 4;
            }

            public boolean hasLink2025EmptyLoadingPaneRendering() {
                return this.formatCase_ == 5;
            }

            public boolean hasSilentNetworkAuthenticationRendering() {
                return this.formatCase_ == 2;
            }

            public static C6780a newBuilder(TransientRendering transientRendering) {
                return DEFAULT_INSTANCE.createBuilder(transientRendering);
            }

            public static TransientRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransientRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TransientRendering parseFrom(ByteString byteString) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TransientRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TransientRendering parseFrom(byte[] bArr) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TransientRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TransientRendering parseFrom(InputStream inputStream) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransientRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransientRendering parseFrom(CodedInputStream codedInputStream) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TransientRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransientRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$a */
        public enum EnumC6782a {
            PROFILE_IDENTIFIER_ENTRY_RENDERING(1),
            OTP_ENTRY_RENDERING(2),
            PASSKEY_CREATION_RENDERING(3),
            PASSKEY_AUTHENTICATION_RENDERING(4),
            TRANSIENT_RENDERING(5),
            AUTHENTICATIONSTEP_NOT_SET(0);


            /* renamed from: a */
            public final int f2451a;

            EnumC6782a(int i) {
                this.f2451a = i;
            }

            public static EnumC6782a forNumber(int i) {
                if (i == 0) {
                    return AUTHENTICATIONSTEP_NOT_SET;
                }
                if (i == 1) {
                    return PROFILE_IDENTIFIER_ENTRY_RENDERING;
                }
                if (i == 2) {
                    return OTP_ENTRY_RENDERING;
                }
                if (i == 3) {
                    return PASSKEY_CREATION_RENDERING;
                }
                if (i == 4) {
                    return PASSKEY_AUTHENTICATION_RENDERING;
                }
                if (i != 5) {
                    return null;
                }
                return TRANSIENT_RENDERING;
            }

            public int getNumber() {
                return this.f2451a;
            }

            @Deprecated
            public static EnumC6782a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$Rendering$b */
        public static final class C6783b extends GeneratedMessageLite.Builder<Rendering, C6783b> implements MessageLiteOrBuilder {
            public C6783b() {
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

        private void clearAuthenticationStep() {
            this.authenticationStepCase_ = 0;
            this.authenticationStep_ = null;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearOtpEntryRendering() {
            if (this.authenticationStepCase_ == 2) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearPaneBranding() {
            this.paneBranding_ = 0;
        }

        private void clearPasskeyAuthenticationRendering() {
            if (this.authenticationStepCase_ == 4) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearPasskeyCreationRendering() {
            if (this.authenticationStepCase_ == 3) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearProfileIdentifierEntryRendering() {
            if (this.authenticationStepCase_ == 1) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearTransientRendering() {
            if (this.authenticationStepCase_ == 5) {
                this.authenticationStepCase_ = 0;
                this.authenticationStep_ = null;
            }
        }

        private void clearUsePaneControlledLogic() {
            this.usePaneControlledLogic_ = false;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6768a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeOtpEntryRendering(OTPEntryRendering oTPEntryRendering) {
            oTPEntryRendering.getClass();
            if (this.authenticationStepCase_ != 2 || this.authenticationStep_ == OTPEntryRendering.getDefaultInstance()) {
                this.authenticationStep_ = oTPEntryRendering;
            } else {
                this.authenticationStep_ = OTPEntryRendering.newBuilder((OTPEntryRendering) this.authenticationStep_).mergeFrom((OTPEntryRendering.C6773a) oTPEntryRendering).buildPartial();
            }
            this.authenticationStepCase_ = 2;
        }

        private void mergePasskeyAuthenticationRendering(PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
            passkeyAuthenticationRendering.getClass();
            if (this.authenticationStepCase_ != 4 || this.authenticationStep_ == PasskeyAuthenticationRendering.getDefaultInstance()) {
                this.authenticationStep_ = passkeyAuthenticationRendering;
            } else {
                this.authenticationStep_ = PasskeyAuthenticationRendering.newBuilder((PasskeyAuthenticationRendering) this.authenticationStep_).mergeFrom((PasskeyAuthenticationRendering.C6775a) passkeyAuthenticationRendering).buildPartial();
            }
            this.authenticationStepCase_ = 4;
        }

        private void mergePasskeyCreationRendering(PasskeyCreationRendering passkeyCreationRendering) {
            passkeyCreationRendering.getClass();
            if (this.authenticationStepCase_ != 3 || this.authenticationStep_ == PasskeyCreationRendering.getDefaultInstance()) {
                this.authenticationStep_ = passkeyCreationRendering;
            } else {
                this.authenticationStep_ = PasskeyCreationRendering.newBuilder((PasskeyCreationRendering) this.authenticationStep_).mergeFrom((PasskeyCreationRendering.C6776a) passkeyCreationRendering).buildPartial();
            }
            this.authenticationStepCase_ = 3;
        }

        private void mergeProfileIdentifierEntryRendering(ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
            profileIdentifierEntryRendering.getClass();
            if (this.authenticationStepCase_ != 1 || this.authenticationStep_ == ProfileIdentifierEntryRendering.getDefaultInstance()) {
                this.authenticationStep_ = profileIdentifierEntryRendering;
            } else {
                this.authenticationStep_ = ProfileIdentifierEntryRendering.newBuilder((ProfileIdentifierEntryRendering) this.authenticationStep_).mergeFrom((ProfileIdentifierEntryRendering.C6777a) profileIdentifierEntryRendering).buildPartial();
            }
            this.authenticationStepCase_ = 1;
        }

        private void mergeTransientRendering(TransientRendering transientRendering) {
            transientRendering.getClass();
            if (this.authenticationStepCase_ != 5 || this.authenticationStep_ == TransientRendering.getDefaultInstance()) {
                this.authenticationStep_ = transientRendering;
            } else {
                this.authenticationStep_ = TransientRendering.newBuilder((TransientRendering) this.authenticationStep_).mergeFrom((TransientRendering.C6780a) transientRendering).buildPartial();
            }
            this.authenticationStepCase_ = 5;
        }

        public static C6783b newBuilder() {
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

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setOtpEntryRendering(OTPEntryRendering oTPEntryRendering) {
            oTPEntryRendering.getClass();
            this.authenticationStep_ = oTPEntryRendering;
            this.authenticationStepCase_ = 2;
        }

        private void setPaneBranding(EnumC6639I enumC6639I) {
            this.paneBranding_ = enumC6639I.getNumber();
        }

        private void setPaneBrandingValue(int i) {
            this.paneBranding_ = i;
        }

        private void setPasskeyAuthenticationRendering(PasskeyAuthenticationRendering passkeyAuthenticationRendering) {
            passkeyAuthenticationRendering.getClass();
            this.authenticationStep_ = passkeyAuthenticationRendering;
            this.authenticationStepCase_ = 4;
        }

        private void setPasskeyCreationRendering(PasskeyCreationRendering passkeyCreationRendering) {
            passkeyCreationRendering.getClass();
            this.authenticationStep_ = passkeyCreationRendering;
            this.authenticationStepCase_ = 3;
        }

        private void setProfileIdentifierEntryRendering(ProfileIdentifierEntryRendering profileIdentifierEntryRendering) {
            profileIdentifierEntryRendering.getClass();
            this.authenticationStep_ = profileIdentifierEntryRendering;
            this.authenticationStepCase_ = 1;
        }

        private void setTransientRendering(TransientRendering transientRendering) {
            transientRendering.getClass();
            this.authenticationStep_ = transientRendering;
            this.authenticationStepCase_ = 5;
        }

        private void setUsePaneControlledLogic(boolean z) {
            this.usePaneControlledLogic_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6783b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\u0013\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0011ဉ\u0000\u0012\u0007\u0013\f", new Object[]{"authenticationStep_", "authenticationStepCase_", "bitField0_", ProfileIdentifierEntryRendering.class, OTPEntryRendering.class, PasskeyCreationRendering.class, PasskeyAuthenticationRendering.class, TransientRendering.class, "events_", "usePaneControlledLogic_", "paneBranding_"});
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

        public EnumC6782a getAuthenticationStepCase() {
            return EnumC6782a.forNumber(this.authenticationStepCase_);
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public OTPEntryRendering getOtpEntryRendering() {
            return this.authenticationStepCase_ == 2 ? (OTPEntryRendering) this.authenticationStep_ : OTPEntryRendering.getDefaultInstance();
        }

        public EnumC6639I getPaneBranding() {
            EnumC6639I enumC6639IForNumber = EnumC6639I.forNumber(this.paneBranding_);
            return enumC6639IForNumber == null ? EnumC6639I.UNRECOGNIZED : enumC6639IForNumber;
        }

        public int getPaneBrandingValue() {
            return this.paneBranding_;
        }

        public PasskeyAuthenticationRendering getPasskeyAuthenticationRendering() {
            return this.authenticationStepCase_ == 4 ? (PasskeyAuthenticationRendering) this.authenticationStep_ : PasskeyAuthenticationRendering.getDefaultInstance();
        }

        public PasskeyCreationRendering getPasskeyCreationRendering() {
            return this.authenticationStepCase_ == 3 ? (PasskeyCreationRendering) this.authenticationStep_ : PasskeyCreationRendering.getDefaultInstance();
        }

        public ProfileIdentifierEntryRendering getProfileIdentifierEntryRendering() {
            return this.authenticationStepCase_ == 1 ? (ProfileIdentifierEntryRendering) this.authenticationStep_ : ProfileIdentifierEntryRendering.getDefaultInstance();
        }

        public TransientRendering getTransientRendering() {
            return this.authenticationStepCase_ == 5 ? (TransientRendering) this.authenticationStep_ : TransientRendering.getDefaultInstance();
        }

        public boolean getUsePaneControlledLogic() {
            return this.usePaneControlledLogic_;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOtpEntryRendering() {
            return this.authenticationStepCase_ == 2;
        }

        public boolean hasPasskeyAuthenticationRendering() {
            return this.authenticationStepCase_ == 4;
        }

        public boolean hasPasskeyCreationRendering() {
            return this.authenticationStepCase_ == 3;
        }

        public boolean hasProfileIdentifierEntryRendering() {
            return this.authenticationStepCase_ == 1;
        }

        public boolean hasTransientRendering() {
            return this.authenticationStepCase_ == 5;
        }

        public static C6783b newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$a */
    public enum EnumC6784a implements Internal.EnumLite {
        ANIMATION_UNKNOWN(0),
        ANIMATION_LOGO_INTRODUCTION(1),
        ANIMATION_MESSAGE_TRANSITION(2),
        UNRECOGNIZED(-1);

        public static final int ANIMATION_LOGO_INTRODUCTION_VALUE = 1;
        public static final int ANIMATION_MESSAGE_TRANSITION_VALUE = 2;
        public static final int ANIMATION_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2452b = new a();

        /* renamed from: a */
        public final int f2454a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6784a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6784a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2455a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6784a.forNumber(i) != null;
            }
        }

        EnumC6784a(int i) {
            this.f2454a = i;
        }

        public static EnumC6784a forNumber(int i) {
            if (i == 0) {
                return ANIMATION_UNKNOWN;
            }
            if (i == 1) {
                return ANIMATION_LOGO_INTRODUCTION;
            }
            if (i != 2) {
                return null;
            }
            return ANIMATION_MESSAGE_TRANSITION;
        }

        public static Internal.EnumLiteMap<EnumC6784a> internalGetValueMap() {
            return f2452b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2455a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2454a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6784a valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane$b */
    public static final class C6785b extends GeneratedMessageLite.Builder<ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane, C6785b> implements MessageLiteOrBuilder {
        public C6785b() {
            super(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane profileAuthenticationPaneOuterClass$ProfileAuthenticationPane = new ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane();
        DEFAULT_INSTANCE = profileAuthenticationPaneOuterClass$ProfileAuthenticationPane;
        GeneratedMessageLite.registerDefaultInstance(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.class, profileAuthenticationPaneOuterClass$ProfileAuthenticationPane);
    }

    private ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane() {
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6785b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseDelimitedFrom(InputStream inputStream) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(ByteBuffer byteBuffer) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6932q0.f2591a[methodToInvoke.ordinal()]) {
            case 1:
                return new ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane();
            case 2:
                return new C6785b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.class) {
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

    public static C6785b newBuilder(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane profileAuthenticationPaneOuterClass$ProfileAuthenticationPane) {
        return DEFAULT_INSTANCE.createBuilder(profileAuthenticationPaneOuterClass$ProfileAuthenticationPane);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(ByteString byteString) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(byte[] bArr) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(InputStream inputStream) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(CodedInputStream codedInputStream) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
