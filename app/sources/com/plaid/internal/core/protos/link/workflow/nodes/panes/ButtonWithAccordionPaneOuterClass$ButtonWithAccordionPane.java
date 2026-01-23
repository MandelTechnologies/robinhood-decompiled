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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane extends GeneratedMessageLite<ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane, C6329a> implements MessageLiteOrBuilder {
    private static final ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane DEFAULT_INSTANCE;
    private static volatile Parser<ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6324b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, C6319a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$ButtonDisclaimerTapAction$a */
            public static final class C6319a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, C6319a> implements MessageLiteOrBuilder {
                public C6319a() {
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

            public static C6319a newBuilder() {
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
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new C6319a();
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

            public static C6319a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
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

        public static final class ButtonTapAction extends GeneratedMessageLite<ButtonTapAction, C6320a> implements MessageLiteOrBuilder {
            private static final ButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$ButtonTapAction$a */
            public static final class C6320a extends GeneratedMessageLite.Builder<ButtonTapAction, C6320a> implements MessageLiteOrBuilder {
                public C6320a() {
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

            public static C6320a newBuilder() {
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
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTapAction();
                    case 2:
                        return new C6320a();
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

            public static C6320a newBuilder(ButtonTapAction buttonTapAction) {
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

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6321a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$ExitAction$a */
            public static final class C6321a extends GeneratedMessageLite.Builder<ExitAction, C6321a> implements MessageLiteOrBuilder {
                public C6321a() {
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

            public static C6321a newBuilder() {
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
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6321a();
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

            public static C6321a newBuilder(ExitAction exitAction) {
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

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6322a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6322a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6322a> implements MessageLiteOrBuilder {
                public C6322a() {
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

            public static C6322a newBuilder() {
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
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6322a();
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

            public static C6322a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$a */
        public enum EnumC6323a {
            BUTTON_DISCLAIMER_TAP(4),
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2174a;

            EnumC6323a(int i) {
                this.f2174a = i;
            }

            public static EnumC6323a forNumber(int i) {
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
                return this.f2174a;
            }

            @Deprecated
            public static EnumC6323a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Actions$b */
        public static final class C6324b extends GeneratedMessageLite.Builder<Actions, C6324b> implements MessageLiteOrBuilder {
            public C6324b() {
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
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.C6319a) buttonDisclaimerTapAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ButtonTapAction.getDefaultInstance()) {
                this.action_ = buttonTapAction;
            } else {
                this.action_ = ButtonTapAction.newBuilder((ButtonTapAction) this.action_).mergeFrom((ButtonTapAction.C6320a) buttonTapAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6321a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6322a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        public static C6324b newBuilder() {
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
            switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6324b();
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

        public EnumC6323a getActionCase() {
            return EnumC6323a.forNumber(this.actionCase_);
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

        public static C6324b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6328b> implements MessageLiteOrBuilder {
        public static final int ACCORDION_TITLE_FIELD_NUMBER = 13;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 11;
        public static final int BUTTON_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 14;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 8;
        public static final int FOOTER_TEXT_FIELD_NUMBER = 15;
        public static final int HEADER_ASSET_FIELD_NUMBER = 3;
        public static final int HEADER_FIELD_NUMBER = 4;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 5;
        public static final int PANE_HEADER_FIELD_NUMBER = 12;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 10;
        private Common$AttributedLocalizedString accordionTitle_;
        private int bitField0_;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private Common$ButtonContent button_;
        private Common$AttributedLocalizedString content_;
        private Events events_;
        private Common$AttributedLocalizedString footerText_;
        private Common$RenderedAssetAppearance headerAsset_;
        private Common$LocalizedString header_;
        private Common$RenderedInstitution institution_;
        private Internal.ProtobufList<AccordionItem> items_ = GeneratedMessageLite.emptyProtobufList();
        private Common$PaneHeader paneHeader_;
        private Common$ButtonContent secondaryButton_;

        public static final class AccordionItem extends GeneratedMessageLite<AccordionItem, C6325a> implements InterfaceC6327a {
            private static final AccordionItem DEFAULT_INSTANCE;
            public static final int DETAIL_FIELD_NUMBER = 3;
            public static final int ICON_FIELD_NUMBER = 1;
            public static final int LABEL_FIELD_NUMBER = 2;
            private static volatile Parser<AccordionItem> PARSER;
            private int bitField0_;
            private Common$LocalizedString detail_;
            private Common$RenderedAssetAppearance icon_;
            private Common$LocalizedString label_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Rendering$AccordionItem$a */
            public static final class C6325a extends GeneratedMessageLite.Builder<AccordionItem, C6325a> implements InterfaceC6327a {
                public C6325a() {
                    super(AccordionItem.DEFAULT_INSTANCE);
                }
            }

            static {
                AccordionItem accordionItem = new AccordionItem();
                DEFAULT_INSTANCE = accordionItem;
                GeneratedMessageLite.registerDefaultInstance(AccordionItem.class, accordionItem);
            }

            private AccordionItem() {
            }

            private void clearDetail() {
                this.detail_ = null;
                this.bitField0_ &= -5;
            }

            private void clearIcon() {
                this.icon_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLabel() {
                this.label_ = null;
                this.bitField0_ &= -3;
            }

            public static AccordionItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDetail(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.detail_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = common$LocalizedString;
                } else {
                    this.detail_ = Common$LocalizedString.newBuilder(this.detail_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 4;
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

            private void mergeLabel(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.label_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.label_ = common$LocalizedString;
                } else {
                    this.label_ = Common$LocalizedString.newBuilder(this.label_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6325a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AccordionItem parseDelimitedFrom(InputStream inputStream) {
                return (AccordionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccordionItem parseFrom(ByteBuffer byteBuffer) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AccordionItem> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDetail(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.detail_ = common$LocalizedString;
                this.bitField0_ |= 4;
            }

            private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.icon_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setLabel(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.label_ = common$LocalizedString;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AccordionItem();
                    case 2:
                        return new C6325a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "icon_", "label_", "detail_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AccordionItem> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AccordionItem.class) {
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

            public Common$LocalizedString getDetail() {
                Common$LocalizedString common$LocalizedString = this.detail_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$RenderedAssetAppearance getIcon() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$LocalizedString getLabel() {
                Common$LocalizedString common$LocalizedString = this.label_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public boolean hasDetail() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasIcon() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasLabel() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6325a newBuilder(AccordionItem accordionItem) {
                return DEFAULT_INSTANCE.createBuilder(accordionItem);
            }

            public static AccordionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccordionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AccordionItem parseFrom(ByteString byteString) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AccordionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AccordionItem parseFrom(byte[] bArr) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AccordionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AccordionItem parseFrom(InputStream inputStream) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccordionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccordionItem parseFrom(CodedInputStream codedInputStream) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AccordionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6326a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 4;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonDisclaimerTap_;
            private Common$SDKEvent onButtonTap_;
            private Common$SDKEvent onSecondaryButtonTap_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Rendering$Events$a */
            public static final class C6326a extends GeneratedMessageLite.Builder<Events, C6326a> implements MessageLiteOrBuilder {
                public C6326a() {
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

            private void mergeOnButtonDisclaimerTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonDisclaimerTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonDisclaimerTap_ = common$SDKEvent;
                } else {
                    this.onButtonDisclaimerTap_ = Common$SDKEvent.newBuilder(this.onButtonDisclaimerTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
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

            public static C6326a newBuilder() {
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
                switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6326a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_", "onButtonDisclaimerTap_"});
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

            public boolean hasOnButtonDisclaimerTap() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasOnButtonTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6326a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Rendering$a */
        public interface InterfaceC6327a extends MessageLiteOrBuilder {
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$Rendering$b */
        public static final class C6328b extends GeneratedMessageLite.Builder<Rendering, C6328b> implements MessageLiteOrBuilder {
            public C6328b() {
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

        private void addAllItems(Iterable<? extends AccordionItem> iterable) {
            ensureItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
        }

        private void addItems(AccordionItem accordionItem) {
            accordionItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(accordionItem);
        }

        private void clearAccordionTitle() {
            this.accordionTitle_ = null;
            this.bitField0_ &= -33;
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -129;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -65;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -17;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearFooterText() {
            this.footerText_ = null;
            this.bitField0_ &= -513;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderAsset() {
            this.headerAsset_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearItems() {
            this.items_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -257;
        }

        private void ensureItemsIsMutable() {
            Internal.ProtobufList<AccordionItem> protobufList = this.items_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccordionTitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.accordionTitle_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.accordionTitle_ = common$AttributedLocalizedString;
            } else {
                this.accordionTitle_ = Common$AttributedLocalizedString.newBuilder(this.accordionTitle_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.button_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.button_ = common$ButtonContent;
            } else {
                this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = common$AttributedLocalizedString;
            } else {
                this.content_ = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6326a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.footerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.footerText_ = common$AttributedLocalizedString;
            } else {
                this.footerText_ = Common$AttributedLocalizedString.newBuilder(this.footerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 512;
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
            this.bitField0_ |= 256;
        }

        public static C6328b newBuilder() {
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

        private void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        private void setAccordionTitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.accordionTitle_ = common$AttributedLocalizedString;
            this.bitField0_ |= 32;
        }

        private void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 16;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1024;
        }

        private void setFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.footerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 512;
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

        private void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setItems(int i, AccordionItem accordionItem) {
            accordionItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, accordionItem);
        }

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6328b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0002\u000f\f\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ဉ\u0007\bဉ\n\nဉ\b\u000bဉ\u0006\fဉ\u0001\rဉ\u0005\u000eဉ\u0004\u000fဉ\t", new Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "items_", AccordionItem.class, "button_", "events_", "secondaryButton_", "buttonDisclaimerText_", "paneHeader_", "accordionTitle_", "content_", "footerText_"});
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

        public Common$AttributedLocalizedString getAccordionTitle() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.accordionTitle_;
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

        public Common$AttributedLocalizedString getContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$AttributedLocalizedString getFooterText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.footerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$RenderedAssetAppearance getHeaderAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public AccordionItem getItems(int i) {
            return this.items_.get(i);
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public List<AccordionItem> getItemsList() {
            return this.items_;
        }

        public InterfaceC6327a getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public List<? extends InterfaceC6327a> getItemsOrBuilderList() {
            return this.items_;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean hasAccordionTitle() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasButton() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasFooterText() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasHeaderAsset() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public static C6328b newBuilder(Rendering rendering) {
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

        private void addItems(int i, AccordionItem accordionItem) {
            accordionItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, accordionItem);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane$a */
    public static final class C6329a extends GeneratedMessageLite.Builder<ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane, C6329a> implements MessageLiteOrBuilder {
        public C6329a() {
            super(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane = new ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane();
        DEFAULT_INSTANCE = buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane;
        GeneratedMessageLite.registerDefaultInstance(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.class, buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane);
    }

    private ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane() {
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6329a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseDelimitedFrom(InputStream inputStream) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(ByteBuffer byteBuffer) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6905d.f2550a[methodToInvoke.ordinal()]) {
            case 1:
                return new ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane();
            case 2:
                return new C6329a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.class) {
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

    public static C6329a newBuilder(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane) {
        return DEFAULT_INSTANCE.createBuilder(buttonWithAccordionPaneOuterClass$ButtonWithAccordionPane);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(ByteString byteString) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(byte[] bArr) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(InputStream inputStream) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(CodedInputStream codedInputStream) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
