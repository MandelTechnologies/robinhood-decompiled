package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class LoadingPaneOuterClass$LoadingPane extends GeneratedMessageLite<LoadingPaneOuterClass$LoadingPane, C6690a> implements MessageLiteOrBuilder {
    private static final LoadingPaneOuterClass$LoadingPane DEFAULT_INSTANCE;
    private static volatile Parser<LoadingPaneOuterClass$LoadingPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6682b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        public static final int LOADING_FIELD_NUMBER = 1;
        public static final int OOPWV_CANCEL_FIELD_NUMBER = 3;
        public static final int OOPWV_FINISH_FIELD_NUMBER = 4;
        public static final int OOPWV_IOS_DECLINE_FIELD_NUMBER = 5;
        private static volatile Parser<Actions> PARSER;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6676a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$ExitAction$a */
            public static final class C6676a extends GeneratedMessageLite.Builder<ExitAction, C6676a> implements MessageLiteOrBuilder {
                public C6676a() {
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

            public static C6676a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6676a();
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

            public static C6676a newBuilder(ExitAction exitAction) {
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

        public static final class LoadingAction extends GeneratedMessageLite<LoadingAction, C6677a> implements MessageLiteOrBuilder {
            private static final LoadingAction DEFAULT_INSTANCE;
            private static volatile Parser<LoadingAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$LoadingAction$a */
            public static final class C6677a extends GeneratedMessageLite.Builder<LoadingAction, C6677a> implements MessageLiteOrBuilder {
                public C6677a() {
                    super(LoadingAction.DEFAULT_INSTANCE);
                }
            }

            static {
                LoadingAction loadingAction = new LoadingAction();
                DEFAULT_INSTANCE = loadingAction;
                GeneratedMessageLite.registerDefaultInstance(LoadingAction.class, loadingAction);
            }

            private LoadingAction() {
            }

            public static LoadingAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6677a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoadingAction parseDelimitedFrom(InputStream inputStream) {
                return (LoadingAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoadingAction parseFrom(ByteBuffer byteBuffer) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoadingAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoadingAction();
                    case 2:
                        return new C6677a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoadingAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoadingAction.class) {
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

            public static C6677a newBuilder(LoadingAction loadingAction) {
                return DEFAULT_INSTANCE.createBuilder(loadingAction);
            }

            public static LoadingAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoadingAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoadingAction parseFrom(ByteString byteString) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoadingAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoadingAction parseFrom(byte[] bArr) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoadingAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoadingAction parseFrom(InputStream inputStream) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoadingAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoadingAction parseFrom(CodedInputStream codedInputStream) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoadingAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoadingAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OopwvCancelAction extends GeneratedMessageLite<OopwvCancelAction, C6678a> implements MessageLiteOrBuilder {
            private static final OopwvCancelAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvCancelAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$OopwvCancelAction$a */
            public static final class C6678a extends GeneratedMessageLite.Builder<OopwvCancelAction, C6678a> implements MessageLiteOrBuilder {
                public C6678a() {
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

            public static C6678a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvCancelAction();
                    case 2:
                        return new C6678a();
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

            public static C6678a newBuilder(OopwvCancelAction oopwvCancelAction) {
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

        public static final class OopwvFinishAction extends GeneratedMessageLite<OopwvFinishAction, C6679a> implements MessageLiteOrBuilder {
            private static final OopwvFinishAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvFinishAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$OopwvFinishAction$a */
            public static final class C6679a extends GeneratedMessageLite.Builder<OopwvFinishAction, C6679a> implements MessageLiteOrBuilder {
                public C6679a() {
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

            public static C6679a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvFinishAction();
                    case 2:
                        return new C6679a();
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

            public static C6679a newBuilder(OopwvFinishAction oopwvFinishAction) {
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

        public static final class OopwvIosDeclineAction extends GeneratedMessageLite<OopwvIosDeclineAction, C6680a> implements MessageLiteOrBuilder {
            private static final OopwvIosDeclineAction DEFAULT_INSTANCE;
            private static volatile Parser<OopwvIosDeclineAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$OopwvIosDeclineAction$a */
            public static final class C6680a extends GeneratedMessageLite.Builder<OopwvIosDeclineAction, C6680a> implements MessageLiteOrBuilder {
                public C6680a() {
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

            public static C6680a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OopwvIosDeclineAction();
                    case 2:
                        return new C6680a();
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

            public static C6680a newBuilder(OopwvIosDeclineAction oopwvIosDeclineAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$a */
        public enum EnumC6681a {
            LOADING(1),
            EXIT(2),
            OOPWV_CANCEL(3),
            OOPWV_FINISH(4),
            OOPWV_IOS_DECLINE(5),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2395a;

            EnumC6681a(int i) {
                this.f2395a = i;
            }

            public static EnumC6681a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return LOADING;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i == 3) {
                    return OOPWV_CANCEL;
                }
                if (i == 4) {
                    return OOPWV_FINISH;
                }
                if (i != 5) {
                    return null;
                }
                return OOPWV_IOS_DECLINE;
            }

            public int getNumber() {
                return this.f2395a;
            }

            @Deprecated
            public static EnumC6681a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Actions$b */
        public static final class C6682b extends GeneratedMessageLite.Builder<Actions, C6682b> implements MessageLiteOrBuilder {
            public C6682b() {
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

        private void clearLoading() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvCancel() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvFinish() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearOopwvIosDecline() {
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
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6676a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeLoading(LoadingAction loadingAction) {
            loadingAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == LoadingAction.getDefaultInstance()) {
                this.action_ = loadingAction;
            } else {
                this.action_ = LoadingAction.newBuilder((LoadingAction) this.action_).mergeFrom((LoadingAction.C6677a) loadingAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeOopwvCancel(OopwvCancelAction oopwvCancelAction) {
            oopwvCancelAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == OopwvCancelAction.getDefaultInstance()) {
                this.action_ = oopwvCancelAction;
            } else {
                this.action_ = OopwvCancelAction.newBuilder((OopwvCancelAction) this.action_).mergeFrom((OopwvCancelAction.C6678a) oopwvCancelAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeOopwvFinish(OopwvFinishAction oopwvFinishAction) {
            oopwvFinishAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == OopwvFinishAction.getDefaultInstance()) {
                this.action_ = oopwvFinishAction;
            } else {
                this.action_ = OopwvFinishAction.newBuilder((OopwvFinishAction) this.action_).mergeFrom((OopwvFinishAction.C6679a) oopwvFinishAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeOopwvIosDecline(OopwvIosDeclineAction oopwvIosDeclineAction) {
            oopwvIosDeclineAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == OopwvIosDeclineAction.getDefaultInstance()) {
                this.action_ = oopwvIosDeclineAction;
            } else {
                this.action_ = OopwvIosDeclineAction.newBuilder((OopwvIosDeclineAction) this.action_).mergeFrom((OopwvIosDeclineAction.C6680a) oopwvIosDeclineAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static C6682b newBuilder() {
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

        private void setLoading(LoadingAction loadingAction) {
            loadingAction.getClass();
            this.action_ = loadingAction;
            this.actionCase_ = 1;
        }

        private void setOopwvCancel(OopwvCancelAction oopwvCancelAction) {
            oopwvCancelAction.getClass();
            this.action_ = oopwvCancelAction;
            this.actionCase_ = 3;
        }

        private void setOopwvFinish(OopwvFinishAction oopwvFinishAction) {
            oopwvFinishAction.getClass();
            this.action_ = oopwvFinishAction;
            this.actionCase_ = 4;
        }

        private void setOopwvIosDecline(OopwvIosDeclineAction oopwvIosDeclineAction) {
            oopwvIosDeclineAction.getClass();
            this.action_ = oopwvIosDeclineAction;
            this.actionCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6682b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"action_", "actionCase_", LoadingAction.class, ExitAction.class, OopwvCancelAction.class, OopwvFinishAction.class, OopwvIosDeclineAction.class});
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

        public EnumC6681a getActionCase() {
            return EnumC6681a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public LoadingAction getLoading() {
            return this.actionCase_ == 1 ? (LoadingAction) this.action_ : LoadingAction.getDefaultInstance();
        }

        public OopwvCancelAction getOopwvCancel() {
            return this.actionCase_ == 3 ? (OopwvCancelAction) this.action_ : OopwvCancelAction.getDefaultInstance();
        }

        public OopwvFinishAction getOopwvFinish() {
            return this.actionCase_ == 4 ? (OopwvFinishAction) this.action_ : OopwvFinishAction.getDefaultInstance();
        }

        public OopwvIosDeclineAction getOopwvIosDecline() {
            return this.actionCase_ == 5 ? (OopwvIosDeclineAction) this.action_ : OopwvIosDeclineAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasLoading() {
            return this.actionCase_ == 1;
        }

        public boolean hasOopwvCancel() {
            return this.actionCase_ == 3;
        }

        public boolean hasOopwvFinish() {
            return this.actionCase_ == 4;
        }

        public boolean hasOopwvIosDecline() {
            return this.actionCase_ == 5;
        }

        public static C6682b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6688a> implements MessageLiteOrBuilder {
        public static final int CO_BRANDED_ASSET_ANIMATION_FIELD_NUMBER = 7;
        public static final int DEFAULT_FIELD_NUMBER = 2;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 4;
        public static final int FADE_OUT_WITH_SPINNER_FIELD_NUMBER = 6;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int SKIP_AUTO_SUBMIT_FIELD_NUMBER = 8;
        public static final int SPINNER_FIELD_NUMBER = 5;
        private int bitField0_;
        private Events events_;
        private boolean skipAutoSubmit_;
        private Object style_;
        private int styleCase_ = 0;
        private Internal.ProtobufList<Common$LocalizedString> messages_ = GeneratedMessageLite.emptyProtobufList();

        public static final class CoBrandedAssetAnimation extends GeneratedMessageLite<CoBrandedAssetAnimation, C6683a> implements MessageLiteOrBuilder {
            public static final int CO_BRANDED_HEADER_ASSET_FIELD_NUMBER = 1;
            private static final CoBrandedAssetAnimation DEFAULT_INSTANCE;
            public static final int PANE_ANIMATION_DURATION_MS_FIELD_NUMBER = 2;
            private static volatile Parser<CoBrandedAssetAnimation> PARSER;
            private int bitField0_;
            private Common$CobrandedHeaderAsset coBrandedHeaderAsset_;
            private long paneAnimationDurationMs_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$CoBrandedAssetAnimation$a */
            public static final class C6683a extends GeneratedMessageLite.Builder<CoBrandedAssetAnimation, C6683a> implements MessageLiteOrBuilder {
                public C6683a() {
                    super(CoBrandedAssetAnimation.DEFAULT_INSTANCE);
                }
            }

            static {
                CoBrandedAssetAnimation coBrandedAssetAnimation = new CoBrandedAssetAnimation();
                DEFAULT_INSTANCE = coBrandedAssetAnimation;
                GeneratedMessageLite.registerDefaultInstance(CoBrandedAssetAnimation.class, coBrandedAssetAnimation);
            }

            private CoBrandedAssetAnimation() {
            }

            private void clearCoBrandedHeaderAsset() {
                this.coBrandedHeaderAsset_ = null;
                this.bitField0_ &= -2;
            }

            private void clearPaneAnimationDurationMs() {
                this.paneAnimationDurationMs_ = 0L;
            }

            public static CoBrandedAssetAnimation getDefaultInstance() {
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

            public static C6683a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static CoBrandedAssetAnimation parseDelimitedFrom(InputStream inputStream) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedAssetAnimation parseFrom(ByteBuffer byteBuffer) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<CoBrandedAssetAnimation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCoBrandedHeaderAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
                common$CobrandedHeaderAsset.getClass();
                this.coBrandedHeaderAsset_ = common$CobrandedHeaderAsset;
                this.bitField0_ |= 1;
            }

            private void setPaneAnimationDurationMs(long j) {
                this.paneAnimationDurationMs_ = j;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CoBrandedAssetAnimation();
                    case 2:
                        return new C6683a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003", new Object[]{"bitField0_", "coBrandedHeaderAsset_", "paneAnimationDurationMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<CoBrandedAssetAnimation> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CoBrandedAssetAnimation.class) {
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

            public Common$CobrandedHeaderAsset getCoBrandedHeaderAsset() {
                Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = this.coBrandedHeaderAsset_;
                return common$CobrandedHeaderAsset == null ? Common$CobrandedHeaderAsset.getDefaultInstance() : common$CobrandedHeaderAsset;
            }

            public long getPaneAnimationDurationMs() {
                return this.paneAnimationDurationMs_;
            }

            public boolean hasCoBrandedHeaderAsset() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6683a newBuilder(CoBrandedAssetAnimation coBrandedAssetAnimation) {
                return DEFAULT_INSTANCE.createBuilder(coBrandedAssetAnimation);
            }

            public static CoBrandedAssetAnimation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedAssetAnimation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static CoBrandedAssetAnimation parseFrom(ByteString byteString) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CoBrandedAssetAnimation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static CoBrandedAssetAnimation parseFrom(byte[] bArr) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CoBrandedAssetAnimation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static CoBrandedAssetAnimation parseFrom(InputStream inputStream) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CoBrandedAssetAnimation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static CoBrandedAssetAnimation parseFrom(CodedInputStream codedInputStream) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static CoBrandedAssetAnimation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CoBrandedAssetAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Default extends GeneratedMessageLite<Default, C6684a> implements MessageLiteOrBuilder {
            private static final Default DEFAULT_INSTANCE;
            private static volatile Parser<Default> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$Default$a */
            public static final class C6684a extends GeneratedMessageLite.Builder<Default, C6684a> implements MessageLiteOrBuilder {
                public C6684a() {
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

            public static C6684a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Default();
                    case 2:
                        return new C6684a();
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

            public static C6684a newBuilder(Default r1) {
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

        public static final class Events extends GeneratedMessageLite<Events, C6685a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$Events$a */
            public static final class C6685a extends GeneratedMessageLite.Builder<Events, C6685a> implements MessageLiteOrBuilder {
                public C6685a() {
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

            public static C6685a newBuilder() {
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
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6685a();
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

            public static C6685a newBuilder(Events events) {
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

        public static final class FadeOutWithSpinner extends GeneratedMessageLite<FadeOutWithSpinner, C6686a> implements MessageLiteOrBuilder {
            private static final FadeOutWithSpinner DEFAULT_INSTANCE;
            private static volatile Parser<FadeOutWithSpinner> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$FadeOutWithSpinner$a */
            public static final class C6686a extends GeneratedMessageLite.Builder<FadeOutWithSpinner, C6686a> implements MessageLiteOrBuilder {
                public C6686a() {
                    super(FadeOutWithSpinner.DEFAULT_INSTANCE);
                }
            }

            static {
                FadeOutWithSpinner fadeOutWithSpinner = new FadeOutWithSpinner();
                DEFAULT_INSTANCE = fadeOutWithSpinner;
                GeneratedMessageLite.registerDefaultInstance(FadeOutWithSpinner.class, fadeOutWithSpinner);
            }

            private FadeOutWithSpinner() {
            }

            public static FadeOutWithSpinner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6686a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FadeOutWithSpinner parseDelimitedFrom(InputStream inputStream) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FadeOutWithSpinner parseFrom(ByteBuffer byteBuffer) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FadeOutWithSpinner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FadeOutWithSpinner();
                    case 2:
                        return new C6686a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FadeOutWithSpinner> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (FadeOutWithSpinner.class) {
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

            public static C6686a newBuilder(FadeOutWithSpinner fadeOutWithSpinner) {
                return DEFAULT_INSTANCE.createBuilder(fadeOutWithSpinner);
            }

            public static FadeOutWithSpinner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FadeOutWithSpinner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FadeOutWithSpinner parseFrom(ByteString byteString) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FadeOutWithSpinner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FadeOutWithSpinner parseFrom(byte[] bArr) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FadeOutWithSpinner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FadeOutWithSpinner parseFrom(InputStream inputStream) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FadeOutWithSpinner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FadeOutWithSpinner parseFrom(CodedInputStream codedInputStream) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FadeOutWithSpinner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Spinner extends GeneratedMessageLite<Spinner, C6687a> implements MessageLiteOrBuilder {
            private static final Spinner DEFAULT_INSTANCE;
            private static volatile Parser<Spinner> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$Spinner$a */
            public static final class C6687a extends GeneratedMessageLite.Builder<Spinner, C6687a> implements MessageLiteOrBuilder {
                public C6687a() {
                    super(Spinner.DEFAULT_INSTANCE);
                }
            }

            static {
                Spinner spinner = new Spinner();
                DEFAULT_INSTANCE = spinner;
                GeneratedMessageLite.registerDefaultInstance(Spinner.class, spinner);
            }

            private Spinner() {
            }

            public static Spinner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6687a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Spinner parseDelimitedFrom(InputStream inputStream) {
                return (Spinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Spinner parseFrom(ByteBuffer byteBuffer) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Spinner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Spinner();
                    case 2:
                        return new C6687a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Spinner> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Spinner.class) {
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

            public static C6687a newBuilder(Spinner spinner) {
                return DEFAULT_INSTANCE.createBuilder(spinner);
            }

            public static Spinner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Spinner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Spinner parseFrom(ByteString byteString) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Spinner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Spinner parseFrom(byte[] bArr) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Spinner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Spinner parseFrom(InputStream inputStream) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Spinner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Spinner parseFrom(CodedInputStream codedInputStream) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Spinner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$a */
        public static final class C6688a extends GeneratedMessageLite.Builder<Rendering, C6688a> implements MessageLiteOrBuilder {
            public C6688a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$Rendering$b */
        public enum EnumC6689b {
            DEFAULT(2),
            SPINNER(5),
            FADE_OUT_WITH_SPINNER(6),
            CO_BRANDED_ASSET_ANIMATION(7),
            STYLE_NOT_SET(0);


            /* renamed from: a */
            public final int f2397a;

            EnumC6689b(int i) {
                this.f2397a = i;
            }

            public static EnumC6689b forNumber(int i) {
                if (i == 0) {
                    return STYLE_NOT_SET;
                }
                if (i == 2) {
                    return DEFAULT;
                }
                if (i == 5) {
                    return SPINNER;
                }
                if (i == 6) {
                    return FADE_OUT_WITH_SPINNER;
                }
                if (i != 7) {
                    return null;
                }
                return CO_BRANDED_ASSET_ANIMATION;
            }

            public int getNumber() {
                return this.f2397a;
            }

            @Deprecated
            public static EnumC6689b valueOf(int i) {
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

        private void addAllMessages(Iterable<? extends Common$LocalizedString> iterable) {
            ensureMessagesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
        }

        private void addMessages(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(common$LocalizedString);
        }

        private void clearCoBrandedAssetAnimation() {
            if (this.styleCase_ == 7) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearDefault() {
            if (this.styleCase_ == 2) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearFadeOutWithSpinner() {
            if (this.styleCase_ == 6) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearMessages() {
            this.messages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSkipAutoSubmit() {
            this.skipAutoSubmit_ = false;
        }

        private void clearSpinner() {
            if (this.styleCase_ == 5) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearStyle() {
            this.styleCase_ = 0;
            this.style_ = null;
        }

        private void ensureMessagesIsMutable() {
            Internal.ProtobufList<Common$LocalizedString> protobufList = this.messages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCoBrandedAssetAnimation(CoBrandedAssetAnimation coBrandedAssetAnimation) {
            coBrandedAssetAnimation.getClass();
            if (this.styleCase_ != 7 || this.style_ == CoBrandedAssetAnimation.getDefaultInstance()) {
                this.style_ = coBrandedAssetAnimation;
            } else {
                this.style_ = CoBrandedAssetAnimation.newBuilder((CoBrandedAssetAnimation) this.style_).mergeFrom((CoBrandedAssetAnimation.C6683a) coBrandedAssetAnimation).buildPartial();
            }
            this.styleCase_ = 7;
        }

        private void mergeDefault(Default r4) {
            r4.getClass();
            if (this.styleCase_ != 2 || this.style_ == Default.getDefaultInstance()) {
                this.style_ = r4;
            } else {
                this.style_ = Default.newBuilder((Default) this.style_).mergeFrom((Default.C6684a) r4).buildPartial();
            }
            this.styleCase_ = 2;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6685a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeFadeOutWithSpinner(FadeOutWithSpinner fadeOutWithSpinner) {
            fadeOutWithSpinner.getClass();
            if (this.styleCase_ != 6 || this.style_ == FadeOutWithSpinner.getDefaultInstance()) {
                this.style_ = fadeOutWithSpinner;
            } else {
                this.style_ = FadeOutWithSpinner.newBuilder((FadeOutWithSpinner) this.style_).mergeFrom((FadeOutWithSpinner.C6686a) fadeOutWithSpinner).buildPartial();
            }
            this.styleCase_ = 6;
        }

        private void mergeSpinner(Spinner spinner) {
            spinner.getClass();
            if (this.styleCase_ != 5 || this.style_ == Spinner.getDefaultInstance()) {
                this.style_ = spinner;
            } else {
                this.style_ = Spinner.newBuilder((Spinner) this.style_).mergeFrom((Spinner.C6687a) spinner).buildPartial();
            }
            this.styleCase_ = 5;
        }

        public static C6688a newBuilder() {
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

        private void removeMessages(int i) {
            ensureMessagesIsMutable();
            this.messages_.remove(i);
        }

        private void setCoBrandedAssetAnimation(CoBrandedAssetAnimation coBrandedAssetAnimation) {
            coBrandedAssetAnimation.getClass();
            this.style_ = coBrandedAssetAnimation;
            this.styleCase_ = 7;
        }

        private void setDefault(Default r1) {
            r1.getClass();
            this.style_ = r1;
            this.styleCase_ = 2;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setFadeOutWithSpinner(FadeOutWithSpinner fadeOutWithSpinner) {
            fadeOutWithSpinner.getClass();
            this.style_ = fadeOutWithSpinner;
            this.styleCase_ = 6;
        }

        private void setMessages(int i, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.set(i, common$LocalizedString);
        }

        private void setSkipAutoSubmit(boolean z) {
            this.skipAutoSubmit_ = z;
        }

        private void setSpinner(Spinner spinner) {
            spinner.getClass();
            this.style_ = spinner;
            this.styleCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6688a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001b\u0002<\u0000\u0004ဉ\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007", new Object[]{"style_", "styleCase_", "bitField0_", "messages_", Common$LocalizedString.class, Default.class, "events_", Spinner.class, FadeOutWithSpinner.class, CoBrandedAssetAnimation.class, "skipAutoSubmit_"});
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

        public CoBrandedAssetAnimation getCoBrandedAssetAnimation() {
            return this.styleCase_ == 7 ? (CoBrandedAssetAnimation) this.style_ : CoBrandedAssetAnimation.getDefaultInstance();
        }

        public Default getDefault() {
            return this.styleCase_ == 2 ? (Default) this.style_ : Default.getDefaultInstance();
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public FadeOutWithSpinner getFadeOutWithSpinner() {
            return this.styleCase_ == 6 ? (FadeOutWithSpinner) this.style_ : FadeOutWithSpinner.getDefaultInstance();
        }

        public Common$LocalizedString getMessages(int i) {
            return this.messages_.get(i);
        }

        public int getMessagesCount() {
            return this.messages_.size();
        }

        public List<Common$LocalizedString> getMessagesList() {
            return this.messages_;
        }

        public InterfaceC6360C getMessagesOrBuilder(int i) {
            return this.messages_.get(i);
        }

        public List<? extends InterfaceC6360C> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public boolean getSkipAutoSubmit() {
            return this.skipAutoSubmit_;
        }

        public Spinner getSpinner() {
            return this.styleCase_ == 5 ? (Spinner) this.style_ : Spinner.getDefaultInstance();
        }

        public EnumC6689b getStyleCase() {
            return EnumC6689b.forNumber(this.styleCase_);
        }

        public boolean hasCoBrandedAssetAnimation() {
            return this.styleCase_ == 7;
        }

        public boolean hasDefault() {
            return this.styleCase_ == 2;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFadeOutWithSpinner() {
            return this.styleCase_ == 6;
        }

        public boolean hasSpinner() {
            return this.styleCase_ == 5;
        }

        public static C6688a newBuilder(Rendering rendering) {
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

        private void addMessages(int i, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(i, common$LocalizedString);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane$a */
    public static final class C6690a extends GeneratedMessageLite.Builder<LoadingPaneOuterClass$LoadingPane, C6690a> implements MessageLiteOrBuilder {
        public C6690a() {
            super(LoadingPaneOuterClass$LoadingPane.DEFAULT_INSTANCE);
        }
    }

    static {
        LoadingPaneOuterClass$LoadingPane loadingPaneOuterClass$LoadingPane = new LoadingPaneOuterClass$LoadingPane();
        DEFAULT_INSTANCE = loadingPaneOuterClass$LoadingPane;
        GeneratedMessageLite.registerDefaultInstance(LoadingPaneOuterClass$LoadingPane.class, loadingPaneOuterClass$LoadingPane);
    }

    private LoadingPaneOuterClass$LoadingPane() {
    }

    public static LoadingPaneOuterClass$LoadingPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6690a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadingPaneOuterClass$LoadingPane parseDelimitedFrom(InputStream inputStream) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(ByteBuffer byteBuffer) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LoadingPaneOuterClass$LoadingPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6918j0.f2563a[methodToInvoke.ordinal()]) {
            case 1:
                return new LoadingPaneOuterClass$LoadingPane();
            case 2:
                return new C6690a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LoadingPaneOuterClass$LoadingPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LoadingPaneOuterClass$LoadingPane.class) {
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

    public static C6690a newBuilder(LoadingPaneOuterClass$LoadingPane loadingPaneOuterClass$LoadingPane) {
        return DEFAULT_INSTANCE.createBuilder(loadingPaneOuterClass$LoadingPane);
    }

    public static LoadingPaneOuterClass$LoadingPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(ByteString byteString) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(byte[] bArr) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(InputStream inputStream) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(CodedInputStream codedInputStream) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LoadingPaneOuterClass$LoadingPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LoadingPaneOuterClass$LoadingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
