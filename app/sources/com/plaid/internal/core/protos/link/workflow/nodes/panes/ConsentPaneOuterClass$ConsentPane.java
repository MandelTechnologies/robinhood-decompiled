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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes24.dex */
public final class ConsentPaneOuterClass$ConsentPane extends GeneratedMessageLite<ConsentPaneOuterClass$ConsentPane, C6574a> implements MessageLiteOrBuilder {
    private static final ConsentPaneOuterClass$ConsentPane DEFAULT_INSTANCE;
    private static volatile Parser<ConsentPaneOuterClass$ConsentPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6562b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_TAP_FIELD_NUMBER = 2;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 4;
        public static final int OOPWV_CANCEL_FIELD_NUMBER = 6;
        public static final int OOPWV_FINISH_FIELD_NUMBER = 7;
        public static final int OOPWV_IOS_DECLINE_FIELD_NUMBER = 8;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 5;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, C6553a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$ButtonDisclaimerTapAction$a */
            public static final class C6553a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, C6553a> implements MessageLiteOrBuilder {
                public C6553a() {
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

            public static C6553a newBuilder() {
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
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new C6553a();
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

            public static C6553a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
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

        public static final class ButtonTapAction extends GeneratedMessageLite<ButtonTapAction, C6554a> implements MessageLiteOrBuilder {
            private static final ButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$ButtonTapAction$a */
            public static final class C6554a extends GeneratedMessageLite.Builder<ButtonTapAction, C6554a> implements MessageLiteOrBuilder {
                public C6554a() {
                    super(ButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonTapAction buttonTapAction = new ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
            }

            public static ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6554a newBuilder() {
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTapAction();
                    case 2:
                        return new C6554a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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

            public static C6554a newBuilder(ButtonTapAction buttonTapAction) {
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

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6555a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$ExitAction$a */
            public static final class C6555a extends GeneratedMessageLite.Builder<ExitAction, C6555a> implements MessageLiteOrBuilder {
                public C6555a() {
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

            public static C6555a newBuilder() {
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
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6555a();
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

            public static C6555a newBuilder(ExitAction exitAction) {
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

        public static final class OopwvCancelAction extends GeneratedMessageLite<OopwvCancelAction, C6556a> implements MessageLiteOrBuilder {
            private static final OopwvCancelAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvCancelAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$OopwvCancelAction$a */
            public static final class C6556a extends GeneratedMessageLite.Builder<OopwvCancelAction, C6556a> implements MessageLiteOrBuilder {
                public C6556a() {
                    super(OopwvCancelAction.DEFAULT_INSTANCE);
                }
            }

            static {
                OopwvCancelAction oopwvCancelAction = new OopwvCancelAction();
                DEFAULT_INSTANCE = oopwvCancelAction;
                GeneratedMessageLite.registerDefaultInstance(OopwvCancelAction.class, oopwvCancelAction);
            }

            private OopwvCancelAction() {
            }

            public static OopwvCancelAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6556a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OopwvCancelAction parseDelimitedFrom(InputStream inputStream) {
                return (OopwvCancelAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvCancelAction parseFrom(ByteBuffer byteBuffer) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OopwvCancelAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvCancelAction();
                    case 2:
                        return new C6556a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OopwvCancelAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OopwvCancelAction.class) {
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

            public static C6556a newBuilder(OopwvCancelAction oopwvCancelAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvCancelAction);
            }

            public static OopwvCancelAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvCancelAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OopwvCancelAction parseFrom(ByteString byteString) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OopwvCancelAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OopwvCancelAction parseFrom(byte[] bArr) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OopwvCancelAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OopwvCancelAction parseFrom(InputStream inputStream) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvCancelAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvCancelAction parseFrom(CodedInputStream codedInputStream) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OopwvCancelAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvCancelAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvFinishAction extends GeneratedMessageLite<OopwvFinishAction, C6557a> implements MessageLiteOrBuilder {
            private static final OopwvFinishAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvFinishAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$OopwvFinishAction$a */
            public static final class C6557a extends GeneratedMessageLite.Builder<OopwvFinishAction, C6557a> implements MessageLiteOrBuilder {
                public C6557a() {
                    super(OopwvFinishAction.DEFAULT_INSTANCE);
                }
            }

            static {
                OopwvFinishAction oopwvFinishAction = new OopwvFinishAction();
                DEFAULT_INSTANCE = oopwvFinishAction;
                GeneratedMessageLite.registerDefaultInstance(OopwvFinishAction.class, oopwvFinishAction);
            }

            private OopwvFinishAction() {
            }

            public static OopwvFinishAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6557a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OopwvFinishAction parseDelimitedFrom(InputStream inputStream) {
                return (OopwvFinishAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvFinishAction parseFrom(ByteBuffer byteBuffer) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OopwvFinishAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvFinishAction();
                    case 2:
                        return new C6557a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OopwvFinishAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OopwvFinishAction.class) {
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

            public static C6557a newBuilder(OopwvFinishAction oopwvFinishAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvFinishAction);
            }

            public static OopwvFinishAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvFinishAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OopwvFinishAction parseFrom(ByteString byteString) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OopwvFinishAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OopwvFinishAction parseFrom(byte[] bArr) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OopwvFinishAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OopwvFinishAction parseFrom(InputStream inputStream) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvFinishAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvFinishAction parseFrom(CodedInputStream codedInputStream) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OopwvFinishAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvFinishAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvIosDeclineAction extends GeneratedMessageLite<OopwvIosDeclineAction, C6558a> implements MessageLiteOrBuilder {
            private static final OopwvIosDeclineAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvIosDeclineAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$OopwvIosDeclineAction$a */
            public static final class C6558a extends GeneratedMessageLite.Builder<OopwvIosDeclineAction, C6558a> implements MessageLiteOrBuilder {
                public C6558a() {
                    super(OopwvIosDeclineAction.DEFAULT_INSTANCE);
                }
            }

            static {
                OopwvIosDeclineAction oopwvIosDeclineAction = new OopwvIosDeclineAction();
                DEFAULT_INSTANCE = oopwvIosDeclineAction;
                GeneratedMessageLite.registerDefaultInstance(OopwvIosDeclineAction.class, oopwvIosDeclineAction);
            }

            private OopwvIosDeclineAction() {
            }

            public static OopwvIosDeclineAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6558a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OopwvIosDeclineAction parseDelimitedFrom(InputStream inputStream) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvIosDeclineAction parseFrom(ByteBuffer byteBuffer) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OopwvIosDeclineAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvIosDeclineAction();
                    case 2:
                        return new C6558a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OopwvIosDeclineAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OopwvIosDeclineAction.class) {
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

            public static C6558a newBuilder(OopwvIosDeclineAction oopwvIosDeclineAction) {
                return DEFAULT_INSTANCE.createBuilder(oopwvIosDeclineAction);
            }

            public static OopwvIosDeclineAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvIosDeclineAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OopwvIosDeclineAction parseFrom(ByteString byteString) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OopwvIosDeclineAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OopwvIosDeclineAction parseFrom(byte[] bArr) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OopwvIosDeclineAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OopwvIosDeclineAction parseFrom(InputStream inputStream) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OopwvIosDeclineAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OopwvIosDeclineAction parseFrom(CodedInputStream codedInputStream) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OopwvIosDeclineAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OopwvIosDeclineAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonDisclaimerTapAction extends GeneratedMessageLite<SecondaryButtonDisclaimerTapAction, C6559a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$SecondaryButtonDisclaimerTapAction$a */
            public static final class C6559a extends GeneratedMessageLite.Builder<SecondaryButtonDisclaimerTapAction, C6559a> implements MessageLiteOrBuilder {
                public C6559a() {
                    super(SecondaryButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction = new SecondaryButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = secondaryButtonDisclaimerTapAction;
                GeneratedMessageLite.registerDefaultInstance(SecondaryButtonDisclaimerTapAction.class, secondaryButtonDisclaimerTapAction);
            }

            private SecondaryButtonDisclaimerTapAction() {
            }

            public static SecondaryButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6559a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SecondaryButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SecondaryButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonDisclaimerTapAction();
                    case 2:
                        return new C6559a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SecondaryButtonDisclaimerTapAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SecondaryButtonDisclaimerTapAction.class) {
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

            public static C6559a newBuilder(SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonDisclaimerTapAction);
            }

            public static SecondaryButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(ByteString byteString) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(InputStream inputStream) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SecondaryButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6560a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6560a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6560a> implements MessageLiteOrBuilder {
                public C6560a() {
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

            public static C6560a newBuilder() {
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
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6560a();
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

            public static C6560a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$a */
        public enum EnumC6561a {
            BUTTON_DISCLAIMER_TAP(1),
            BUTTON_TAP(2),
            SECONDARY_BUTTON_TAP(3),
            SECONDARY_BUTTON_DISCLAIMER_TAP(5),
            EXIT(4),
            OOPWV_CANCEL(6),
            OOPWV_FINISH(7),
            OOPWV_IOS_DECLINE(8),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2327a;

            EnumC6561a(int i) {
                this.f2327a = i;
            }

            public static EnumC6561a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return BUTTON_DISCLAIMER_TAP;
                    case 2:
                        return BUTTON_TAP;
                    case 3:
                        return SECONDARY_BUTTON_TAP;
                    case 4:
                        return EXIT;
                    case 5:
                        return SECONDARY_BUTTON_DISCLAIMER_TAP;
                    case 6:
                        return OOPWV_CANCEL;
                    case 7:
                        return OOPWV_FINISH;
                    case 8:
                        return OOPWV_IOS_DECLINE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2327a;
            }

            @Deprecated
            public static EnumC6561a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Actions$b */
        public static final class C6562b extends GeneratedMessageLite.Builder<Actions, C6562b> implements MessageLiteOrBuilder {
            public C6562b() {
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
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearButtonTap() {
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

        private void clearOopwvCancel() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvFinish() {
            if (this.actionCase_ == 7) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvIosDecline() {
            if (this.actionCase_ == 8) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSecondaryButtonDisclaimerTap() {
            if (this.actionCase_ == 5) {
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

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = buttonDisclaimerTapAction;
            } else {
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.C6553a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = ButtonTapAction.newBuilder((ButtonTapAction) this.action_).mergeFrom((ButtonTapAction.C6554a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6555a) exitAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeOopwvCancel(OopwvCancelAction oopwvCancelAction) {
            oopwvCancelAction.getClass();
            if (this.actionCase_ != 6 || this.action_ == OopwvCancelAction.getDefaultInstance()) {
                this.action_ = oopwvCancelAction;
            } else {
                this.action_ = OopwvCancelAction.newBuilder((OopwvCancelAction) this.action_).mergeFrom((OopwvCancelAction.C6556a) oopwvCancelAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        private void mergeOopwvFinish(OopwvFinishAction oopwvFinishAction) {
            oopwvFinishAction.getClass();
            if (this.actionCase_ != 7 || this.action_ == OopwvFinishAction.getDefaultInstance()) {
                this.action_ = oopwvFinishAction;
            } else {
                this.action_ = OopwvFinishAction.newBuilder((OopwvFinishAction) this.action_).mergeFrom((OopwvFinishAction.C6557a) oopwvFinishAction).buildPartial();
            }
            this.actionCase_ = 7;
        }

        private void mergeOopwvIosDecline(OopwvIosDeclineAction oopwvIosDeclineAction) {
            oopwvIosDeclineAction.getClass();
            if (this.actionCase_ != 8 || this.action_ == OopwvIosDeclineAction.getDefaultInstance()) {
                this.action_ = oopwvIosDeclineAction;
            } else {
                this.action_ = OopwvIosDeclineAction.newBuilder((OopwvIosDeclineAction) this.action_).mergeFrom((OopwvIosDeclineAction.C6558a) oopwvIosDeclineAction).buildPartial();
            }
            this.actionCase_ = 8;
        }

        private void mergeSecondaryButtonDisclaimerTap(SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
            secondaryButtonDisclaimerTapAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == SecondaryButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonDisclaimerTapAction;
            } else {
                this.action_ = SecondaryButtonDisclaimerTapAction.newBuilder((SecondaryButtonDisclaimerTapAction) this.action_).mergeFrom((SecondaryButtonDisclaimerTapAction.C6559a) secondaryButtonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6560a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        public static C6562b newBuilder() {
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
            this.actionCase_ = 1;
        }

        private void setButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            this.action_ = buttonTapAction;
            this.actionCase_ = 2;
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 4;
        }

        private void setOopwvCancel(OopwvCancelAction oopwvCancelAction) {
            oopwvCancelAction.getClass();
            this.action_ = oopwvCancelAction;
            this.actionCase_ = 6;
        }

        private void setOopwvFinish(OopwvFinishAction oopwvFinishAction) {
            oopwvFinishAction.getClass();
            this.action_ = oopwvFinishAction;
            this.actionCase_ = 7;
        }

        private void setOopwvIosDecline(OopwvIosDeclineAction oopwvIosDeclineAction) {
            oopwvIosDeclineAction.getClass();
            this.action_ = oopwvIosDeclineAction;
            this.actionCase_ = 8;
        }

        private void setSecondaryButtonDisclaimerTap(SecondaryButtonDisclaimerTapAction secondaryButtonDisclaimerTapAction) {
            secondaryButtonDisclaimerTapAction.getClass();
            this.action_ = secondaryButtonDisclaimerTapAction;
            this.actionCase_ = 5;
        }

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6562b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"action_", "actionCase_", ButtonDisclaimerTapAction.class, ButtonTapAction.class, SecondaryButtonTapAction.class, ExitAction.class, SecondaryButtonDisclaimerTapAction.class, OopwvCancelAction.class, OopwvFinishAction.class, OopwvIosDeclineAction.class});
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

        public EnumC6561a getActionCase() {
            return EnumC6561a.forNumber(this.actionCase_);
        }

        public ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            return this.actionCase_ == 1 ? (ButtonDisclaimerTapAction) this.action_ : ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public ButtonTapAction getButtonTap() {
            return this.actionCase_ == 2 ? (ButtonTapAction) this.action_ : ButtonTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            return this.actionCase_ == 4 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public OopwvCancelAction getOopwvCancel() {
            return this.actionCase_ == 6 ? (OopwvCancelAction) this.action_ : OopwvCancelAction.getDefaultInstance();
        }

        public OopwvFinishAction getOopwvFinish() {
            return this.actionCase_ == 7 ? (OopwvFinishAction) this.action_ : OopwvFinishAction.getDefaultInstance();
        }

        public OopwvIosDeclineAction getOopwvIosDecline() {
            return this.actionCase_ == 8 ? (OopwvIosDeclineAction) this.action_ : OopwvIosDeclineAction.getDefaultInstance();
        }

        public SecondaryButtonDisclaimerTapAction getSecondaryButtonDisclaimerTap() {
            return this.actionCase_ == 5 ? (SecondaryButtonDisclaimerTapAction) this.action_ : SecondaryButtonDisclaimerTapAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasButtonTap() {
            return this.actionCase_ == 2;
        }

        public boolean hasExit() {
            return this.actionCase_ == 4;
        }

        public boolean hasOopwvCancel() {
            return this.actionCase_ == 6;
        }

        public boolean hasOopwvFinish() {
            return this.actionCase_ == 7;
        }

        public boolean hasOopwvIosDecline() {
            return this.actionCase_ == 8;
        }

        public boolean hasSecondaryButtonDisclaimerTap() {
            return this.actionCase_ == 5;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public static C6562b newBuilder(Actions actions) {
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

    public static final class DisclaimerText extends GeneratedMessageLite<DisclaimerText, C6564b> implements MessageLiteOrBuilder {
        public static final int ADDITIONAL_ACTIONS_FIELD_NUMBER = 2;
        public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 1;
        private static final DisclaimerText DEFAULT_INSTANCE;
        private static volatile Parser<DisclaimerText> PARSER;
        private MapFieldLite<String, Actions> additionalActions_ = MapFieldLite.emptyMapField();
        private Common$AttributedLocalizedString attributedText_;
        private int bitField0_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$DisclaimerText$a */
        public static final class C6563a {

            /* renamed from: a */
            public static final MapEntryLite<String, Actions> f2328a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Actions.getDefaultInstance());
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$DisclaimerText$b */
        public static final class C6564b extends GeneratedMessageLite.Builder<DisclaimerText, C6564b> implements MessageLiteOrBuilder {
            public C6564b() {
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

        private void clearAttributedText() {
            this.attributedText_ = null;
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

        private void mergeAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.attributedText_ = common$AttributedLocalizedString;
            } else {
                this.attributedText_ = Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6564b newBuilder() {
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

        private void setAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.attributedText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        public boolean containsAdditionalActions(String str) {
            str.getClass();
            return internalGetAdditionalActions().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DisclaimerText();
                case 2:
                    return new C6564b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "attributedText_", "additionalActions_", C6563a.f2328a});
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

        public Common$AttributedLocalizedString getAttributedText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean hasAttributedText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6564b newBuilder(DisclaimerText disclaimerText) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6569a> implements MessageLiteOrBuilder {
        public static final int ACCORDION_FIELD_NUMBER = 17;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 8;
        public static final int BUTTON_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 15;
        public static final int CO_BRANDED_ASSET_FIELD_NUMBER = 12;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 7;
        public static final int HEADER_ASSET_FIELD_NUMBER = 1;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int HEADER_STYLE_FIELD_NUMBER = 14;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PLAID_BRANDED_ASSET_FIELD_NUMBER = 9;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
        public static final int SECONDARY_CONTENT_FIELD_NUMBER = 16;
        public static final int SECTIONS_FIELD_NUMBER = 3;
        public static final int SECTION_FIELD_NUMBER = 18;
        public static final int SHOW_ACTION_DIVIDER_LINE_FIELD_NUMBER = 11;
        public static final int SUPPRESS_CO_BRANDED_ASSET_ANIMATION_FIELD_NUMBER = 19;
        private int bitField0_;
        private DisclaimerText buttonDisclaimerText_;
        private Common$ButtonContent button_;
        private Common$AttributedLocalizedString content_;
        private Events events_;
        private Object headerAssetConfig_;
        private Common$RenderedAssetAppearance headerAsset_;
        private int headerStyle_;
        private Common$LocalizedString header_;
        private Object paneContent_;
        private Common$ButtonContent secondaryButton_;
        private Common$AttributedLocalizedString secondaryContent_;
        private boolean showActionDividerLine_;
        private boolean suppressCoBrandedAssetAnimation_;
        private int headerAssetConfigCase_ = 0;
        private int paneContentCase_ = 0;
        private Internal.ProtobufList<Section> sections_ = GeneratedMessageLite.emptyProtobufList();

        public static final class AccordionContent extends GeneratedMessageLite<AccordionContent, C6565a> implements MessageLiteOrBuilder {
            private static final AccordionContent DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile Parser<AccordionContent> PARSER;
            private Internal.ProtobufList<Common$AccordionItem> items_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$AccordionContent$a */
            public static final class C6565a extends GeneratedMessageLite.Builder<AccordionContent, C6565a> implements MessageLiteOrBuilder {
                public C6565a() {
                    super(AccordionContent.DEFAULT_INSTANCE);
                }
            }

            static {
                AccordionContent accordionContent = new AccordionContent();
                DEFAULT_INSTANCE = accordionContent;
                GeneratedMessageLite.registerDefaultInstance(AccordionContent.class, accordionContent);
            }

            private AccordionContent() {
            }

            private void addAllItems(Iterable<? extends Common$AccordionItem> iterable) {
                ensureItemsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
            }

            private void addItems(Common$AccordionItem common$AccordionItem) {
                common$AccordionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(common$AccordionItem);
            }

            private void clearItems() {
                this.items_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureItemsIsMutable() {
                Internal.ProtobufList<Common$AccordionItem> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static AccordionContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6565a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AccordionContent parseDelimitedFrom(InputStream inputStream) {
                return (AccordionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccordionContent parseFrom(ByteBuffer byteBuffer) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AccordionContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            private void setItems(int i, Common$AccordionItem common$AccordionItem) {
                common$AccordionItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, common$AccordionItem);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AccordionContent();
                    case 2:
                        return new C6565a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Common$AccordionItem.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AccordionContent> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AccordionContent.class) {
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

            public Common$AccordionItem getItems(int i) {
                return this.items_.get(i);
            }

            public int getItemsCount() {
                return this.items_.size();
            }

            public List<Common$AccordionItem> getItemsList() {
                return this.items_;
            }

            public InterfaceC6919k getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public List<? extends InterfaceC6919k> getItemsOrBuilderList() {
                return this.items_;
            }

            public static C6565a newBuilder(AccordionContent accordionContent) {
                return DEFAULT_INSTANCE.createBuilder(accordionContent);
            }

            public static AccordionContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccordionContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AccordionContent parseFrom(ByteString byteString) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addItems(int i, Common$AccordionItem common$AccordionItem) {
                common$AccordionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, common$AccordionItem);
            }

            public static AccordionContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AccordionContent parseFrom(byte[] bArr) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AccordionContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AccordionContent parseFrom(InputStream inputStream) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccordionContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccordionContent parseFrom(CodedInputStream codedInputStream) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AccordionContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6566a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 2;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 4;
            public static final int ON_SECONDARY_DISCLAIMER_BUTTON_TAP_FIELD_NUMBER = 5;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonDisclaimerTap_;
            private Common$SDKEvent onButtonTap_;
            private Common$SDKEvent onSecondaryButtonTap_;
            private Common$SDKEvent onSecondaryDisclaimerButtonTap_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$Events$a */
            public static final class C6566a extends GeneratedMessageLite.Builder<Events, C6566a> implements MessageLiteOrBuilder {
                public C6566a() {
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

            private void clearOnButtonDisclaimerTap() {
                this.onButtonDisclaimerTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnButtonTap() {
                this.onButtonTap_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnSecondaryDisclaimerButtonTap() {
                this.onSecondaryDisclaimerButtonTap_ = null;
                this.bitField0_ &= -9;
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

            private void mergeOnButtonDisclaimerTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonDisclaimerTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonDisclaimerTap_ = common$SDKEvent;
                } else {
                    this.onButtonDisclaimerTap_ = Common$SDKEvent.newBuilder(this.onButtonDisclaimerTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTap_ = common$SDKEvent;
                } else {
                    this.onButtonTap_ = Common$SDKEvent.newBuilder(this.onButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryButtonTap_ = Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnSecondaryDisclaimerButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSecondaryDisclaimerButtonTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryDisclaimerButtonTap_ = common$SDKEvent;
                } else {
                    this.onSecondaryDisclaimerButtonTap_ = Common$SDKEvent.newBuilder(this.onSecondaryDisclaimerButtonTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static C6566a newBuilder() {
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

            private void setOnButtonDisclaimerTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonDisclaimerTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnSecondaryDisclaimerButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryDisclaimerButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6566a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onButtonDisclaimerTap_", "onButtonTap_", "onSecondaryButtonTap_", "onSecondaryDisclaimerButtonTap_"});
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

            public Common$SDKEvent getOnButtonDisclaimerTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonDisclaimerTap_;
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

            public Common$SDKEvent getOnSecondaryDisclaimerButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryDisclaimerButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnButtonDisclaimerTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasOnSecondaryDisclaimerButtonTap() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6566a newBuilder(Events events) {
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

        public static final class Section extends GeneratedMessageLite<Section, C6567a> implements InterfaceC6573e {
            public static final int ATTRIBUTED_DESCRIPTION_FIELD_NUMBER = 4;
            private static final Section DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 2;
            public static final int HEADER_FIELD_NUMBER = 1;
            public static final int ICON_FIELD_NUMBER = 3;
            private static volatile Parser<Section> PARSER;
            private Common$AttributedLocalizedString attributedDescription_;
            private int bitField0_;
            private Common$LocalizedString description_;
            private Common$LocalizedString header_;
            private Common$RenderedAssetAppearance icon_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$Section$a */
            public static final class C6567a extends GeneratedMessageLite.Builder<Section, C6567a> implements InterfaceC6573e {
                public C6567a() {
                    super(Section.DEFAULT_INSTANCE);
                }
            }

            static {
                Section section = new Section();
                DEFAULT_INSTANCE = section;
                GeneratedMessageLite.registerDefaultInstance(Section.class, section);
            }

            private Section() {
            }

            private void clearAttributedDescription() {
                this.attributedDescription_ = null;
                this.bitField0_ &= -5;
            }

            private void clearDescription() {
                this.description_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -2;
            }

            private void clearIcon() {
                this.icon_ = null;
                this.bitField0_ &= -9;
            }

            public static Section getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAttributedDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedDescription_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedDescription_ = common$AttributedLocalizedString;
                } else {
                    this.attributedDescription_ = Common$AttributedLocalizedString.newBuilder(this.attributedDescription_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeDescription(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.description_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.description_ = common$LocalizedString;
                } else {
                    this.description_ = Common$LocalizedString.newBuilder(this.description_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.header_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.header_ = common$LocalizedString;
                } else {
                    this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.icon_ = common$RenderedAssetAppearance;
                } else {
                    this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static C6567a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Section parseDelimitedFrom(InputStream inputStream) {
                return (Section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Section parseFrom(ByteBuffer byteBuffer) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Section> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAttributedDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.attributedDescription_ = common$AttributedLocalizedString;
                this.bitField0_ |= 4;
            }

            private void setDescription(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.description_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            private void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.icon_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Section();
                    case 2:
                        return new C6567a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new Object[]{"bitField0_", "header_", "description_", "icon_", "attributedDescription_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Section> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Section.class) {
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

            public Common$AttributedLocalizedString getAttributedDescription() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedDescription_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$LocalizedString getDescription() {
                Common$LocalizedString common$LocalizedString = this.description_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$RenderedAssetAppearance getIcon() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public boolean hasAttributedDescription() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasDescription() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasIcon() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6567a newBuilder(Section section) {
                return DEFAULT_INSTANCE.createBuilder(section);
            }

            public static Section parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Section parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Section parseFrom(ByteString byteString) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Section parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Section parseFrom(byte[] bArr) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Section parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Section parseFrom(InputStream inputStream) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Section parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Section parseFrom(CodedInputStream codedInputStream) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Section parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SectionContent extends GeneratedMessageLite<SectionContent, C6568a> implements MessageLiteOrBuilder {
            private static final SectionContent DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile Parser<SectionContent> PARSER;
            private Internal.ProtobufList<Section> items_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$SectionContent$a */
            public static final class C6568a extends GeneratedMessageLite.Builder<SectionContent, C6568a> implements MessageLiteOrBuilder {
                public C6568a() {
                    super(SectionContent.DEFAULT_INSTANCE);
                }
            }

            static {
                SectionContent sectionContent = new SectionContent();
                DEFAULT_INSTANCE = sectionContent;
                GeneratedMessageLite.registerDefaultInstance(SectionContent.class, sectionContent);
            }

            private SectionContent() {
            }

            private void addAllItems(Iterable<? extends Section> iterable) {
                ensureItemsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
            }

            private void addItems(Section section) {
                section.getClass();
                ensureItemsIsMutable();
                this.items_.add(section);
            }

            private void clearItems() {
                this.items_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureItemsIsMutable() {
                Internal.ProtobufList<Section> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static SectionContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6568a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SectionContent parseDelimitedFrom(InputStream inputStream) {
                return (SectionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SectionContent parseFrom(ByteBuffer byteBuffer) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SectionContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            private void setItems(int i, Section section) {
                section.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, section);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SectionContent();
                    case 2:
                        return new C6568a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Section.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SectionContent> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SectionContent.class) {
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

            public Section getItems(int i) {
                return this.items_.get(i);
            }

            public int getItemsCount() {
                return this.items_.size();
            }

            public List<Section> getItemsList() {
                return this.items_;
            }

            public InterfaceC6573e getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public List<? extends InterfaceC6573e> getItemsOrBuilderList() {
                return this.items_;
            }

            public static C6568a newBuilder(SectionContent sectionContent) {
                return DEFAULT_INSTANCE.createBuilder(sectionContent);
            }

            public static SectionContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SectionContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SectionContent parseFrom(ByteString byteString) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addItems(int i, Section section) {
                section.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, section);
            }

            public static SectionContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SectionContent parseFrom(byte[] bArr) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SectionContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SectionContent parseFrom(InputStream inputStream) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SectionContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SectionContent parseFrom(CodedInputStream codedInputStream) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SectionContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$a */
        public static final class C6569a extends GeneratedMessageLite.Builder<Rendering, C6569a> implements MessageLiteOrBuilder {
            public C6569a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$b */
        public enum EnumC6570b {
            PLAID_BRANDED_ASSET(9),
            CO_BRANDED_ASSET(12),
            HEADERASSETCONFIG_NOT_SET(0);


            /* renamed from: a */
            public final int f2330a;

            EnumC6570b(int i) {
                this.f2330a = i;
            }

            public static EnumC6570b forNumber(int i) {
                if (i == 0) {
                    return HEADERASSETCONFIG_NOT_SET;
                }
                if (i == 9) {
                    return PLAID_BRANDED_ASSET;
                }
                if (i != 12) {
                    return null;
                }
                return CO_BRANDED_ASSET;
            }

            public int getNumber() {
                return this.f2330a;
            }

            @Deprecated
            public static EnumC6570b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$c */
        public enum EnumC6571c implements Internal.EnumLite {
            HEADER_STYLE_UNKNOWN(0),
            HEADER_STYLE_CONSENT(1),
            HEADER_STYLE_THREADS(2),
            UNRECOGNIZED(-1);

            public static final int HEADER_STYLE_CONSENT_VALUE = 1;
            public static final int HEADER_STYLE_THREADS_VALUE = 2;
            public static final int HEADER_STYLE_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2331b = new a();

            /* renamed from: a */
            public final int f2333a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6571c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6571c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2334a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6571c.forNumber(i) != null;
                }
            }

            EnumC6571c(int i) {
                this.f2333a = i;
            }

            public static EnumC6571c forNumber(int i) {
                if (i == 0) {
                    return HEADER_STYLE_UNKNOWN;
                }
                if (i == 1) {
                    return HEADER_STYLE_CONSENT;
                }
                if (i != 2) {
                    return null;
                }
                return HEADER_STYLE_THREADS;
            }

            public static Internal.EnumLiteMap<EnumC6571c> internalGetValueMap() {
                return f2331b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2334a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2333a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6571c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$d */
        public enum EnumC6572d {
            ACCORDION(17),
            SECTION(18),
            PANECONTENT_NOT_SET(0);


            /* renamed from: a */
            public final int f2336a;

            EnumC6572d(int i) {
                this.f2336a = i;
            }

            public static EnumC6572d forNumber(int i) {
                if (i == 0) {
                    return PANECONTENT_NOT_SET;
                }
                if (i == 17) {
                    return ACCORDION;
                }
                if (i != 18) {
                    return null;
                }
                return SECTION;
            }

            public int getNumber() {
                return this.f2336a;
            }

            @Deprecated
            public static EnumC6572d valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$Rendering$e */
        public interface InterfaceC6573e extends MessageLiteOrBuilder {
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllSections(Iterable<? extends Section> iterable) {
            ensureSectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.sections_);
        }

        private void addSections(Section section) {
            section.getClass();
            ensureSectionsIsMutable();
            this.sections_.add(section);
        }

        private void clearAccordion() {
            if (this.paneContentCase_ == 17) {
                this.paneContentCase_ = 0;
                this.paneContent_ = null;
            }
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -9;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -5;
        }

        private void clearCoBrandedAsset() {
            if (this.headerAssetConfigCase_ == 12) {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -65;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -33;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -2;
        }

        private void clearHeaderAssetConfig() {
            this.headerAssetConfigCase_ = 0;
            this.headerAssetConfig_ = null;
        }

        private void clearHeaderStyle() {
            this.headerStyle_ = 0;
        }

        private void clearPaneContent() {
            this.paneContentCase_ = 0;
            this.paneContent_ = null;
        }

        private void clearPlaidBrandedAsset() {
            if (this.headerAssetConfigCase_ == 9) {
                this.headerAssetConfigCase_ = 0;
                this.headerAssetConfig_ = null;
            }
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -17;
        }

        private void clearSecondaryContent() {
            this.secondaryContent_ = null;
            this.bitField0_ &= -129;
        }

        private void clearSection() {
            if (this.paneContentCase_ == 18) {
                this.paneContentCase_ = 0;
                this.paneContent_ = null;
            }
        }

        private void clearSections() {
            this.sections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearShowActionDividerLine() {
            this.showActionDividerLine_ = false;
        }

        private void clearSuppressCoBrandedAssetAnimation() {
            this.suppressCoBrandedAssetAnimation_ = false;
        }

        private void ensureSectionsIsMutable() {
            Internal.ProtobufList<Section> protobufList = this.sections_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.sections_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccordion(AccordionContent accordionContent) {
            accordionContent.getClass();
            if (this.paneContentCase_ != 17 || this.paneContent_ == AccordionContent.getDefaultInstance()) {
                this.paneContent_ = accordionContent;
            } else {
                this.paneContent_ = AccordionContent.newBuilder((AccordionContent) this.paneContent_).mergeFrom((AccordionContent.C6565a) accordionContent).buildPartial();
            }
            this.paneContentCase_ = 17;
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

        private void mergeButtonDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            DisclaimerText disclaimerText2 = this.buttonDisclaimerText_;
            if (disclaimerText2 == null || disclaimerText2 == DisclaimerText.getDefaultInstance()) {
                this.buttonDisclaimerText_ = disclaimerText;
            } else {
                this.buttonDisclaimerText_ = DisclaimerText.newBuilder(this.buttonDisclaimerText_).mergeFrom((DisclaimerText.C6564b) disclaimerText).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeCoBrandedAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            common$CobrandedHeaderAsset.getClass();
            if (this.headerAssetConfigCase_ != 12 || this.headerAssetConfig_ == Common$CobrandedHeaderAsset.getDefaultInstance()) {
                this.headerAssetConfig_ = common$CobrandedHeaderAsset;
            } else {
                this.headerAssetConfig_ = Common$CobrandedHeaderAsset.newBuilder((Common$CobrandedHeaderAsset) this.headerAssetConfig_).mergeFrom((Common$CobrandedHeaderAsset.C6415a) common$CobrandedHeaderAsset).buildPartial();
            }
            this.headerAssetConfigCase_ = 12;
        }

        private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6566a) events).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.header_ = common$LocalizedString;
            } else {
                this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
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

        private void mergePlaidBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            if (this.headerAssetConfigCase_ != 9 || this.headerAssetConfig_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerAssetConfig_ = common$RenderedAssetAppearance;
            } else {
                this.headerAssetConfig_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.headerAssetConfig_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
            }
            this.headerAssetConfigCase_ = 9;
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

        private void mergeSecondaryContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryContent_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.secondaryContent_ = common$AttributedLocalizedString;
            } else {
                this.secondaryContent_ = Common$AttributedLocalizedString.newBuilder(this.secondaryContent_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeSection(SectionContent sectionContent) {
            sectionContent.getClass();
            if (this.paneContentCase_ != 18 || this.paneContent_ == SectionContent.getDefaultInstance()) {
                this.paneContent_ = sectionContent;
            } else {
                this.paneContent_ = SectionContent.newBuilder((SectionContent) this.paneContent_).mergeFrom((SectionContent.C6568a) sectionContent).buildPartial();
            }
            this.paneContentCase_ = 18;
        }

        public static C6569a newBuilder() {
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

        private void removeSections(int i) {
            ensureSectionsIsMutable();
            this.sections_.remove(i);
        }

        private void setAccordion(AccordionContent accordionContent) {
            accordionContent.getClass();
            this.paneContent_ = accordionContent;
            this.paneContentCase_ = 17;
        }

        private void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setButtonDisclaimerText(DisclaimerText disclaimerText) {
            disclaimerText.getClass();
            this.buttonDisclaimerText_ = disclaimerText;
            this.bitField0_ |= 4;
        }

        private void setCoBrandedAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            common$CobrandedHeaderAsset.getClass();
            this.headerAssetConfig_ = common$CobrandedHeaderAsset;
            this.headerAssetConfigCase_ = 12;
        }

        private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 32;
        }

        private void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.headerAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        private void setHeaderStyle(EnumC6571c enumC6571c) {
            this.headerStyle_ = enumC6571c.getNumber();
        }

        private void setHeaderStyleValue(int i) {
            this.headerStyle_ = i;
        }

        private void setPlaidBrandedAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.headerAssetConfig_ = common$RenderedAssetAppearance;
            this.headerAssetConfigCase_ = 9;
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 16;
        }

        private void setSecondaryContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.secondaryContent_ = common$AttributedLocalizedString;
            this.bitField0_ |= 128;
        }

        private void setSection(SectionContent sectionContent) {
            sectionContent.getClass();
            this.paneContent_ = sectionContent;
            this.paneContentCase_ = 18;
        }

        private void setSections(int i, Section section) {
            section.getClass();
            ensureSectionsIsMutable();
            this.sections_.set(i, section);
        }

        private void setShowActionDividerLine(boolean z) {
            this.showActionDividerLine_ = z;
        }

        private void setSuppressCoBrandedAssetAnimation(boolean z) {
            this.suppressCoBrandedAssetAnimation_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6569a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0002\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0002\t<\u0000\u000b\u0007\f<\u0000\u000e\f\u000fဉ\u0006\u0010ဉ\u0007\u0011<\u0001\u0012<\u0001\u0013\u0007", new Object[]{"headerAssetConfig_", "headerAssetConfigCase_", "paneContent_", "paneContentCase_", "bitField0_", "headerAsset_", "header_", "sections_", Section.class, "button_", "secondaryButton_", "events_", "buttonDisclaimerText_", Common$RenderedAssetAppearance.class, "showActionDividerLine_", Common$CobrandedHeaderAsset.class, "headerStyle_", "content_", "secondaryContent_", AccordionContent.class, SectionContent.class, "suppressCoBrandedAssetAnimation_"});
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

        public AccordionContent getAccordion() {
            return this.paneContentCase_ == 17 ? (AccordionContent) this.paneContent_ : AccordionContent.getDefaultInstance();
        }

        public Common$ButtonContent getButton() {
            Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public DisclaimerText getButtonDisclaimerText() {
            DisclaimerText disclaimerText = this.buttonDisclaimerText_;
            return disclaimerText == null ? DisclaimerText.getDefaultInstance() : disclaimerText;
        }

        public Common$CobrandedHeaderAsset getCoBrandedAsset() {
            return this.headerAssetConfigCase_ == 12 ? (Common$CobrandedHeaderAsset) this.headerAssetConfig_ : Common$CobrandedHeaderAsset.getDefaultInstance();
        }

        public Common$AttributedLocalizedString getContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
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

        public EnumC6570b getHeaderAssetConfigCase() {
            return EnumC6570b.forNumber(this.headerAssetConfigCase_);
        }

        public EnumC6571c getHeaderStyle() {
            EnumC6571c enumC6571cForNumber = EnumC6571c.forNumber(this.headerStyle_);
            return enumC6571cForNumber == null ? EnumC6571c.UNRECOGNIZED : enumC6571cForNumber;
        }

        public int getHeaderStyleValue() {
            return this.headerStyle_;
        }

        public EnumC6572d getPaneContentCase() {
            return EnumC6572d.forNumber(this.paneContentCase_);
        }

        public Common$RenderedAssetAppearance getPlaidBrandedAsset() {
            return this.headerAssetConfigCase_ == 9 ? (Common$RenderedAssetAppearance) this.headerAssetConfig_ : Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getSecondaryContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryContent_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public SectionContent getSection() {
            return this.paneContentCase_ == 18 ? (SectionContent) this.paneContent_ : SectionContent.getDefaultInstance();
        }

        public Section getSections(int i) {
            return this.sections_.get(i);
        }

        public int getSectionsCount() {
            return this.sections_.size();
        }

        public List<Section> getSectionsList() {
            return this.sections_;
        }

        public InterfaceC6573e getSectionsOrBuilder(int i) {
            return this.sections_.get(i);
        }

        public List<? extends InterfaceC6573e> getSectionsOrBuilderList() {
            return this.sections_;
        }

        public boolean getShowActionDividerLine() {
            return this.showActionDividerLine_;
        }

        public boolean getSuppressCoBrandedAssetAnimation() {
            return this.suppressCoBrandedAssetAnimation_;
        }

        public boolean hasAccordion() {
            return this.paneContentCase_ == 17;
        }

        public boolean hasButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCoBrandedAsset() {
            return this.headerAssetConfigCase_ == 12;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasHeaderAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPlaidBrandedAsset() {
            return this.headerAssetConfigCase_ == 9;
        }

        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSecondaryContent() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSection() {
            return this.paneContentCase_ == 18;
        }

        public static C6569a newBuilder(Rendering rendering) {
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

        private void addSections(int i, Section section) {
            section.getClass();
            ensureSectionsIsMutable();
            this.sections_.add(i, section);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane$a */
    public static final class C6574a extends GeneratedMessageLite.Builder<ConsentPaneOuterClass$ConsentPane, C6574a> implements MessageLiteOrBuilder {
        public C6574a() {
            super(ConsentPaneOuterClass$ConsentPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ConsentPaneOuterClass$ConsentPane consentPaneOuterClass$ConsentPane = new ConsentPaneOuterClass$ConsentPane();
        DEFAULT_INSTANCE = consentPaneOuterClass$ConsentPane;
        GeneratedMessageLite.registerDefaultInstance(ConsentPaneOuterClass$ConsentPane.class, consentPaneOuterClass$ConsentPane);
    }

    private ConsentPaneOuterClass$ConsentPane() {
    }

    public static ConsentPaneOuterClass$ConsentPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6574a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConsentPaneOuterClass$ConsentPane parseDelimitedFrom(InputStream inputStream) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(ByteBuffer byteBuffer) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ConsentPaneOuterClass$ConsentPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6904c0.f2549a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConsentPaneOuterClass$ConsentPane();
            case 2:
                return new C6574a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConsentPaneOuterClass$ConsentPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ConsentPaneOuterClass$ConsentPane.class) {
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

    public static C6574a newBuilder(ConsentPaneOuterClass$ConsentPane consentPaneOuterClass$ConsentPane) {
        return DEFAULT_INSTANCE.createBuilder(consentPaneOuterClass$ConsentPane);
    }

    public static ConsentPaneOuterClass$ConsentPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(ByteString byteString) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(byte[] bArr) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(InputStream inputStream) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(CodedInputStream codedInputStream) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConsentPaneOuterClass$ConsentPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ConsentPaneOuterClass$ConsentPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
