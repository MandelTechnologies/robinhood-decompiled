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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane */
/* loaded from: classes24.dex */
public final class C6894xa350b647 extends GeneratedMessageLite<C6894xa350b647, a> implements MessageLiteOrBuilder {
    private static final C6894xa350b647 DEFAULT_INSTANCE;
    private static volatile Parser<C6894xa350b647> PARSER;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int PRIMARY_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SECONDARY_DISCLAIMER_TAP_FIELD_NUMBER = 5;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$ExitAction */
        public static final class ExitAction extends GeneratedMessageLite<ExitAction, a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$ExitAction$a */
            public static final class a extends GeneratedMessageLite.Builder<ExitAction, a> implements MessageLiteOrBuilder {
                public a() {
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

            public static a newBuilder() {
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
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new a();
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

            public static a newBuilder(ExitAction exitAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$PrimaryDisclaimerTapAction */
        public static final class PrimaryDisclaimerTapAction extends GeneratedMessageLite<PrimaryDisclaimerTapAction, a> implements MessageLiteOrBuilder {
            private static final PrimaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<PrimaryDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$PrimaryDisclaimerTapAction$a */
            public static final class a extends GeneratedMessageLite.Builder<PrimaryDisclaimerTapAction, a> implements MessageLiteOrBuilder {
                public a() {
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

            public static a newBuilder() {
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
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PrimaryDisclaimerTapAction();
                    case 2:
                        return new a();
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

            public static a newBuilder(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SecondaryButtonTapAction */
        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SecondaryButtonTapAction$a */
            public static final class a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, a> implements MessageLiteOrBuilder {
                public a() {
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

            public static a newBuilder() {
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
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new a();
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

            public static a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SecondaryDisclaimerTapAction */
        public static final class SecondaryDisclaimerTapAction extends GeneratedMessageLite<SecondaryDisclaimerTapAction, a> implements MessageLiteOrBuilder {
            private static final SecondaryDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SecondaryDisclaimerTapAction$a */
            public static final class a extends GeneratedMessageLite.Builder<SecondaryDisclaimerTapAction, a> implements MessageLiteOrBuilder {
                public a() {
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

            public static a newBuilder() {
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
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryDisclaimerTapAction();
                    case 2:
                        return new a();
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

            public static a newBuilder(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SubmitAction */
        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SubmitAction$Response */
            public static final class Response extends GeneratedMessageLite<Response, a> implements MessageLiteOrBuilder {
                private static final Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private String inputId_ = "";
                private String value_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SubmitAction$Response$a */
                public static final class a extends GeneratedMessageLite.Builder<Response, a> implements MessageLiteOrBuilder {
                    public a() {
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

                public static a newBuilder() {
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
                    switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new a();
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

                public static a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$SubmitAction$a */
            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
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

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static a newBuilder() {
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

            private void setResponse(Response response) {
                response.getClass();
                this.response_ = response;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
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

            public Response getResponse() {
                Response response = this.response_;
                return response == null ? Response.getDefaultInstance() : response;
            }

            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a newBuilder(SubmitAction submitAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$a */
        public enum a {
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            PRIMARY_DISCLAIMER_TAP(4),
            SECONDARY_DISCLAIMER_TAP(5),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2519a;

            a(int i) {
                this.f2519a = i;
            }

            public static a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i == 3) {
                    return SECONDARY_BUTTON_TAP;
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
                return this.f2519a;
            }

            @Deprecated
            public static a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Actions$b */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
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
            if (this.actionCase_ == 2) {
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
            if (this.actionCase_ == 3) {
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

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergePrimaryDisclaimerTap(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            primaryDisclaimerTapAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == PrimaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = primaryDisclaimerTapAction;
            } else {
                this.action_ = PrimaryDisclaimerTapAction.newBuilder((PrimaryDisclaimerTapAction) this.action_).mergeFrom((PrimaryDisclaimerTapAction.a) primaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryDisclaimerTap(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            secondaryDisclaimerTapAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == SecondaryDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = secondaryDisclaimerTapAction;
            } else {
                this.action_ = SecondaryDisclaimerTapAction.newBuilder((SecondaryDisclaimerTapAction) this.action_).mergeFrom((SecondaryDisclaimerTapAction.a) secondaryDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static b newBuilder() {
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
            this.actionCase_ = 2;
        }

        private void setPrimaryDisclaimerTap(PrimaryDisclaimerTapAction primaryDisclaimerTapAction) {
            primaryDisclaimerTapAction.getClass();
            this.action_ = primaryDisclaimerTapAction;
            this.actionCase_ = 4;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSecondaryDisclaimerTap(SecondaryDisclaimerTapAction secondaryDisclaimerTapAction) {
            secondaryDisclaimerTapAction.getClass();
            this.action_ = secondaryDisclaimerTapAction;
            this.actionCase_ = 5;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, SecondaryButtonTapAction.class, PrimaryDisclaimerTapAction.class, SecondaryDisclaimerTapAction.class});
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

        public a getActionCase() {
            return a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public PrimaryDisclaimerTapAction getPrimaryDisclaimerTap() {
            return this.actionCase_ == 4 ? (PrimaryDisclaimerTapAction) this.action_ : PrimaryDisclaimerTapAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public SecondaryDisclaimerTapAction getSecondaryDisclaimerTap() {
            return this.actionCase_ == 5 ? (SecondaryDisclaimerTapAction) this.action_ : SecondaryDisclaimerTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasPrimaryDisclaimerTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasSecondaryDisclaimerTap() {
            return this.actionCase_ == 5;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static b newBuilder(Actions actions) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering */
    public static final class Rendering extends GeneratedMessageLite<Rendering, a> implements MessageLiteOrBuilder {
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 10;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMERS_FIELD_NUMBER = 7;
        public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 9;
        public static final int EVENTS_FIELD_NUMBER = 2;
        public static final int INPUT_ERROR_FIELD_NUMBER = 6;
        public static final int INPUT_LENGTH_FIELD_NUMBER = 5;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
        public static final int PROMPT_FIELD_NUMBER = 3;
        public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
        public static final int USE_HIGH_CONTRAST_FIELD_NUMBER = 8;
        private int backgroundDisplayMode_;
        private int bitField0_;
        private DisclaimerText disclaimerText_;
        private Internal.ProtobufList<Common$AttributedLocalizedString> disclaimers_ = GeneratedMessageLite.emptyProtobufList();
        private Events events_;
        private InputError inputError_;
        private int inputLength_;
        private Common$AttributedLocalizedString primaryText_;
        private Common$Prompt prompt_;
        private Common$AttributedLocalizedString secondaryText_;
        private boolean useHighContrast_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$DisclaimerText */
        public static final class DisclaimerText extends GeneratedMessageLite<DisclaimerText, b> implements MessageLiteOrBuilder {
            public static final int ADDITIONAL_ACTIONS_FIELD_NUMBER = 2;
            private static final DisclaimerText DEFAULT_INSTANCE;
            private static volatile Parser<DisclaimerText> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 1;
            private MapFieldLite<String, Actions> additionalActions_ = MapFieldLite.emptyMapField();
            private int bitField0_;
            private Common$AttributedLocalizedString text_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$DisclaimerText$a */
            public static final class a {

                /* renamed from: a */
                public static final MapEntryLite<String, Actions> f2520a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Actions.getDefaultInstance());
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$DisclaimerText$b */
            public static final class b extends GeneratedMessageLite.Builder<DisclaimerText, b> implements MessageLiteOrBuilder {
                public b() {
                    super(DisclaimerText.DEFAULT_INSTANCE);
                }
            }

            static {
                DisclaimerText disclaimerText = new DisclaimerText();
                DEFAULT_INSTANCE = disclaimerText;
                GeneratedMessageLite.registerDefaultInstance(DisclaimerText.class, disclaimerText);
            }

            private DisclaimerText() {
            }

            private void clearText() {
                this.text_ = null;
                this.bitField0_ &= -2;
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

            public static b newBuilder() {
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

            private void setText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.text_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            public boolean containsAdditionalActions(String str) {
                str.getClass();
                return internalGetAdditionalActions().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DisclaimerText();
                    case 2:
                        return new b();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "text_", "additionalActions_", a.f2520a});
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

            public Common$AttributedLocalizedString getText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.text_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            public static b newBuilder(DisclaimerText disclaimerText) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$Events */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSubmitTap_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$Events$a */
            public static final class a extends GeneratedMessageLite.Builder<Events, a> implements MessageLiteOrBuilder {
                public a() {
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

            private void addAllOnSubmitTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSubmitTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmitTap_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
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

            public static a newBuilder() {
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

            private void removeOnSubmitTap(int i) {
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnSubmitTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitTapIsMutable();
                this.onSubmitTap_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubmitTap_", Common$SDKEvent.class});
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

            public static a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$InputError */
        public static final class InputError extends GeneratedMessageLite<InputError, a> implements MessageLiteOrBuilder {
            private static final InputError DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            public static final int MESSAGE_FIELD_NUMBER = 1;
            private static volatile Parser<InputError> PARSER;
            private int bitField0_;
            private String input_ = "";
            private Common$AttributedLocalizedString message_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$InputError$a */
            public static final class a extends GeneratedMessageLite.Builder<InputError, a> implements MessageLiteOrBuilder {
                public a() {
                    super(InputError.DEFAULT_INSTANCE);
                }
            }

            static {
                InputError inputError = new InputError();
                DEFAULT_INSTANCE = inputError;
                GeneratedMessageLite.registerDefaultInstance(InputError.class, inputError);
            }

            private InputError() {
            }

            private void clearInput() {
                this.input_ = getDefaultInstance().getInput();
            }

            private void clearMessage() {
                this.message_ = null;
                this.bitField0_ &= -2;
            }

            public static InputError getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeMessage(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.message_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.message_ = common$AttributedLocalizedString;
                } else {
                    this.message_ = Common$AttributedLocalizedString.newBuilder(this.message_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static InputError parseDelimitedFrom(InputStream inputStream) {
                return (InputError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static InputError parseFrom(ByteBuffer byteBuffer) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<InputError> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInput(String str) {
                str.getClass();
                this.input_ = str;
            }

            private void setInputBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.input_ = byteString.toStringUtf8();
            }

            private void setMessage(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.message_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new InputError();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "message_", "input_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<InputError> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (InputError.class) {
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

            public String getInput() {
                return this.input_;
            }

            public ByteString getInputBytes() {
                return ByteString.copyFromUtf8(this.input_);
            }

            public Common$AttributedLocalizedString getMessage() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.message_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasMessage() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a newBuilder(InputError inputError) {
                return DEFAULT_INSTANCE.createBuilder(inputError);
            }

            public static InputError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static InputError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static InputError parseFrom(ByteString byteString) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static InputError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static InputError parseFrom(byte[] bArr) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static InputError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static InputError parseFrom(InputStream inputStream) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static InputError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static InputError parseFrom(CodedInputStream codedInputStream) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static InputError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InputError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$Rendering$a */
        public static final class a extends GeneratedMessageLite.Builder<Rendering, a> implements MessageLiteOrBuilder {
            public a() {
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

        private void addAllDisclaimers(Iterable<? extends Common$AttributedLocalizedString> iterable) {
            ensureDisclaimersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.disclaimers_);
        }

        private void addDisclaimers(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            ensureDisclaimersIsMutable();
            this.disclaimers_.add(common$AttributedLocalizedString);
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearDisclaimerText() {
            this.disclaimerText_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDisclaimers() {
            this.disclaimers_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -33;
        }

        private void clearInputError() {
            this.inputError_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInputLength() {
            this.inputLength_ = 0;
        }

        private void clearPrimaryText() {
            this.primaryText_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPrompt() {
            this.prompt_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryText() {
            this.secondaryText_ = null;
            this.bitField0_ &= -5;
        }

        private void clearUseHighContrast() {
            this.useHighContrast_ = false;
        }

        private void ensureDisclaimersIsMutable() {
            Internal.ProtobufList<Common$AttributedLocalizedString> protobufList = this.disclaimers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.disclaimers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            DisclaimerText disclaimerText2 = this.disclaimerText_;
            if (disclaimerText2 == null || disclaimerText2 == DisclaimerText.getDefaultInstance()) {
                this.disclaimerText_ = disclaimerText;
            } else {
                this.disclaimerText_ = DisclaimerText.newBuilder(this.disclaimerText_).mergeFrom((DisclaimerText.b) disclaimerText).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.a) events).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeInputError(InputError inputError) {
            inputError.getClass();
            InputError inputError2 = this.inputError_;
            if (inputError2 == null || inputError2 == InputError.getDefaultInstance()) {
                this.inputError_ = inputError;
            } else {
                this.inputError_ = InputError.newBuilder(this.inputError_).mergeFrom((InputError.a) inputError).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergePrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.primaryText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.primaryText_ = common$AttributedLocalizedString;
            } else {
                this.primaryText_ = Common$AttributedLocalizedString.newBuilder(this.primaryText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
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
            this.bitField0_ |= 2;
        }

        private void mergeSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.secondaryText_ = common$AttributedLocalizedString;
            } else {
                this.secondaryText_ = Common$AttributedLocalizedString.newBuilder(this.secondaryText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static a newBuilder() {
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

        private void removeDisclaimers(int i) {
            ensureDisclaimersIsMutable();
            this.disclaimers_.remove(i);
        }

        private void setBackgroundDisplayMode(EnumC6923m enumC6923m) {
            this.backgroundDisplayMode_ = enumC6923m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        private void setDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            this.disclaimerText_ = disclaimerText;
            this.bitField0_ |= 8;
        }

        private void setDisclaimers(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            ensureDisclaimersIsMutable();
            this.disclaimers_.set(i, common$AttributedLocalizedString);
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 32;
        }

        private void setInputError(InputError inputError) {
            inputError.getClass();
            this.inputError_ = inputError;
            this.bitField0_ |= 16;
        }

        private void setInputLength(int i) {
            this.inputLength_ = i;
        }

        private void setPrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.primaryText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        private void setPrompt(Common$Prompt common$Prompt) {
            common$Prompt.getClass();
            this.prompt_ = common$Prompt;
            this.bitField0_ |= 2;
        }

        private void setSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.secondaryText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 4;
        }

        private void setUseHighContrast(boolean z) {
            this.useHighContrast_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0005\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0004\u0006ဉ\u0004\u0007\u001b\b\u0007\tဉ\u0003\n\f", new Object[]{"bitField0_", "primaryText_", "events_", "prompt_", "secondaryText_", "inputLength_", "inputError_", "disclaimers_", Common$AttributedLocalizedString.class, "useHighContrast_", "disclaimerText_", "backgroundDisplayMode_"});
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

        public DisclaimerText getDisclaimerText() {
            DisclaimerText disclaimerText = this.disclaimerText_;
            return disclaimerText == null ? DisclaimerText.getDefaultInstance() : disclaimerText;
        }

        public Common$AttributedLocalizedString getDisclaimers(int i) {
            return this.disclaimers_.get(i);
        }

        public int getDisclaimersCount() {
            return this.disclaimers_.size();
        }

        public List<Common$AttributedLocalizedString> getDisclaimersList() {
            return this.disclaimers_;
        }

        public InterfaceC6921l getDisclaimersOrBuilder(int i) {
            return this.disclaimers_.get(i);
        }

        public List<? extends InterfaceC6921l> getDisclaimersOrBuilderList() {
            return this.disclaimers_;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public InputError getInputError() {
            InputError inputError = this.inputError_;
            return inputError == null ? InputError.getDefaultInstance() : inputError;
        }

        public int getInputLength() {
            return this.inputLength_;
        }

        public Common$AttributedLocalizedString getPrimaryText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.primaryText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$Prompt getPrompt() {
            Common$Prompt common$Prompt = this.prompt_;
            return common$Prompt == null ? Common$Prompt.getDefaultInstance() : common$Prompt;
        }

        public Common$AttributedLocalizedString getSecondaryText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean getUseHighContrast() {
            return this.useHighContrast_;
        }

        public boolean hasDisclaimerText() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasInputError() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPrimaryText() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPrompt() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSecondaryText() {
            return (this.bitField0_ & 4) != 0;
        }

        public static a newBuilder(Rendering rendering) {
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

        private void addDisclaimers(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            ensureDisclaimersIsMutable();
            this.disclaimers_.add(i, common$AttributedLocalizedString);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane$a */
    public static final class a extends GeneratedMessageLite.Builder<C6894xa350b647, a> implements MessageLiteOrBuilder {
        public a() {
            super(C6894xa350b647.DEFAULT_INSTANCE);
        }
    }

    static {
        C6894xa350b647 c6894xa350b647 = new C6894xa350b647();
        DEFAULT_INSTANCE = c6894xa350b647;
        GeneratedMessageLite.registerDefaultInstance(C6894xa350b647.class, c6894xa350b647);
    }

    private C6894xa350b647() {
    }

    public static C6894xa350b647 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static C6894xa350b647 parseDelimitedFrom(InputStream inputStream) {
        return (C6894xa350b647) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6894xa350b647 parseFrom(ByteBuffer byteBuffer) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6894xa350b647> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6950z0.f2624a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6894xa350b647();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6894xa350b647> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6894xa350b647.class) {
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

    public static a newBuilder(C6894xa350b647 c6894xa350b647) {
        return DEFAULT_INSTANCE.createBuilder(c6894xa350b647);
    }

    public static C6894xa350b647 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6894xa350b647 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6894xa350b647 parseFrom(ByteString byteString) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6894xa350b647 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6894xa350b647 parseFrom(byte[] bArr) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6894xa350b647 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6894xa350b647 parseFrom(InputStream inputStream) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6894xa350b647 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6894xa350b647 parseFrom(CodedInputStream codedInputStream) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6894xa350b647 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6894xa350b647) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
