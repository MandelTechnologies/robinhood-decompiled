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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput;
import com.plaid.internal.core.protos.link.workflow.primitives.InterfaceC7038r;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes24.dex */
public final class SearchAndSelectPaneOuterClass$SearchAndSelectPane extends GeneratedMessageLite<SearchAndSelectPaneOuterClass$SearchAndSelectPane, C6814a> implements MessageLiteOrBuilder {
    private static final SearchAndSelectPaneOuterClass$SearchAndSelectPane DEFAULT_INSTANCE;
    private static volatile Parser<SearchAndSelectPaneOuterClass$SearchAndSelectPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6806b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TAP_END_OF_RESULTS_FIELD_NUMBER = 4;
        public static final int TAP_FIXED_BUTTON_FIELD_NUMBER = 6;
        public static final int TAP_NO_RESULTS_FIELD_NUMBER = 2;
        public static final int TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON_FIELD_NUMBER = 5;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6798a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$ExitAction$a */
            public static final class C6798a extends GeneratedMessageLite.Builder<ExitAction, C6798a> implements MessageLiteOrBuilder {
                public C6798a() {
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

            public static C6798a newBuilder() {
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
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6798a();
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

            public static C6798a newBuilder(ExitAction exitAction) {
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

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6799a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int SELECTED_ID_FIELD_NUMBER = 1;
            private String selectedId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$SubmitAction$a */
            public static final class C6799a extends GeneratedMessageLite.Builder<SubmitAction, C6799a> implements MessageLiteOrBuilder {
                public C6799a() {
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

            private void clearSelectedId() {
                this.selectedId_ = getDefaultInstance().getSelectedId();
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6799a newBuilder() {
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

            private void setSelectedId(String str) {
                str.getClass();
                this.selectedId_ = str;
            }

            private void setSelectedIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.selectedId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6799a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"selectedId_"});
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

            public String getSelectedId() {
                return this.selectedId_;
            }

            public ByteString getSelectedIdBytes() {
                return ByteString.copyFromUtf8(this.selectedId_);
            }

            public static C6799a newBuilder(SubmitAction submitAction) {
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

        public static final class TapEndOfResultsAction extends GeneratedMessageLite<TapEndOfResultsAction, C6800a> implements MessageLiteOrBuilder {
            private static final TapEndOfResultsAction DEFAULT_INSTANCE;
            private static volatile Parser<TapEndOfResultsAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$TapEndOfResultsAction$a */
            public static final class C6800a extends GeneratedMessageLite.Builder<TapEndOfResultsAction, C6800a> implements MessageLiteOrBuilder {
                public C6800a() {
                    super(TapEndOfResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapEndOfResultsAction tapEndOfResultsAction = new TapEndOfResultsAction();
                DEFAULT_INSTANCE = tapEndOfResultsAction;
                GeneratedMessageLite.registerDefaultInstance(TapEndOfResultsAction.class, tapEndOfResultsAction);
            }

            private TapEndOfResultsAction() {
            }

            public static TapEndOfResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6800a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapEndOfResultsAction parseDelimitedFrom(InputStream inputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfResultsAction parseFrom(ByteBuffer byteBuffer) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapEndOfResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapEndOfResultsAction();
                    case 2:
                        return new C6800a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapEndOfResultsAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TapEndOfResultsAction.class) {
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

            public static C6800a newBuilder(TapEndOfResultsAction tapEndOfResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapEndOfResultsAction);
            }

            public static TapEndOfResultsAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(ByteString byteString) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapEndOfResultsAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(byte[] bArr) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapEndOfResultsAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(InputStream inputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfResultsAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(CodedInputStream codedInputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapEndOfResultsAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapFixedButtonAction extends GeneratedMessageLite<TapFixedButtonAction, C6801a> implements MessageLiteOrBuilder {
            private static final TapFixedButtonAction DEFAULT_INSTANCE;
            private static volatile Parser<TapFixedButtonAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$TapFixedButtonAction$a */
            public static final class C6801a extends GeneratedMessageLite.Builder<TapFixedButtonAction, C6801a> implements MessageLiteOrBuilder {
                public C6801a() {
                    super(TapFixedButtonAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapFixedButtonAction tapFixedButtonAction = new TapFixedButtonAction();
                DEFAULT_INSTANCE = tapFixedButtonAction;
                GeneratedMessageLite.registerDefaultInstance(TapFixedButtonAction.class, tapFixedButtonAction);
            }

            private TapFixedButtonAction() {
            }

            public static TapFixedButtonAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6801a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapFixedButtonAction parseDelimitedFrom(InputStream inputStream) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapFixedButtonAction parseFrom(ByteBuffer byteBuffer) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapFixedButtonAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapFixedButtonAction();
                    case 2:
                        return new C6801a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapFixedButtonAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TapFixedButtonAction.class) {
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

            public static C6801a newBuilder(TapFixedButtonAction tapFixedButtonAction) {
                return DEFAULT_INSTANCE.createBuilder(tapFixedButtonAction);
            }

            public static TapFixedButtonAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapFixedButtonAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapFixedButtonAction parseFrom(ByteString byteString) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapFixedButtonAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapFixedButtonAction parseFrom(byte[] bArr) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapFixedButtonAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapFixedButtonAction parseFrom(InputStream inputStream) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapFixedButtonAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapFixedButtonAction parseFrom(CodedInputStream codedInputStream) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapFixedButtonAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapFixedButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapNoResultsAction extends GeneratedMessageLite<TapNoResultsAction, C6802a> implements MessageLiteOrBuilder {
            private static final TapNoResultsAction DEFAULT_INSTANCE;
            private static volatile Parser<TapNoResultsAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$TapNoResultsAction$a */
            public static final class C6802a extends GeneratedMessageLite.Builder<TapNoResultsAction, C6802a> implements MessageLiteOrBuilder {
                public C6802a() {
                    super(TapNoResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapNoResultsAction tapNoResultsAction = new TapNoResultsAction();
                DEFAULT_INSTANCE = tapNoResultsAction;
                GeneratedMessageLite.registerDefaultInstance(TapNoResultsAction.class, tapNoResultsAction);
            }

            private TapNoResultsAction() {
            }

            public static TapNoResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6802a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapNoResultsAction parseDelimitedFrom(InputStream inputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapNoResultsAction parseFrom(ByteBuffer byteBuffer) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapNoResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapNoResultsAction();
                    case 2:
                        return new C6802a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapNoResultsAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TapNoResultsAction.class) {
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

            public static C6802a newBuilder(TapNoResultsAction tapNoResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapNoResultsAction);
            }

            public static TapNoResultsAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(ByteString byteString) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapNoResultsAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(byte[] bArr) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapNoResultsAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(InputStream inputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapNoResultsAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(CodedInputStream codedInputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapNoResultsAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TapSelectUnsupportedInstitutionHandoffButtonAction extends GeneratedMessageLite<TapSelectUnsupportedInstitutionHandoffButtonAction, C6804a> implements MessageLiteOrBuilder {
            private static final TapSelectUnsupportedInstitutionHandoffButtonAction DEFAULT_INSTANCE;
            private static volatile Parser<TapSelectUnsupportedInstitutionHandoffButtonAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6803a> implements MessageLiteOrBuilder {
                private static final Response DEFAULT_INSTANCE;
                private static volatile Parser<Response> PARSER = null;
                public static final int SELECTED_ID_FIELD_NUMBER = 1;
                private String selectedId_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$TapSelectUnsupportedInstitutionHandoffButtonAction$Response$a */
                public static final class C6803a extends GeneratedMessageLite.Builder<Response, C6803a> implements MessageLiteOrBuilder {
                    public C6803a() {
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

                private void clearSelectedId() {
                    this.selectedId_ = getDefaultInstance().getSelectedId();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6803a newBuilder() {
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

                private void setSelectedId(String str) {
                    str.getClass();
                    this.selectedId_ = str;
                }

                private void setSelectedIdBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectedId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6803a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"selectedId_"});
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

                public String getSelectedId() {
                    return this.selectedId_;
                }

                public ByteString getSelectedIdBytes() {
                    return ByteString.copyFromUtf8(this.selectedId_);
                }

                public static C6803a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$TapSelectUnsupportedInstitutionHandoffButtonAction$a */
            public static final class C6804a extends GeneratedMessageLite.Builder<TapSelectUnsupportedInstitutionHandoffButtonAction, C6804a> implements MessageLiteOrBuilder {
                public C6804a() {
                    super(TapSelectUnsupportedInstitutionHandoffButtonAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction = new TapSelectUnsupportedInstitutionHandoffButtonAction();
                DEFAULT_INSTANCE = tapSelectUnsupportedInstitutionHandoffButtonAction;
                GeneratedMessageLite.registerDefaultInstance(TapSelectUnsupportedInstitutionHandoffButtonAction.class, tapSelectUnsupportedInstitutionHandoffButtonAction);
            }

            private TapSelectUnsupportedInstitutionHandoffButtonAction() {
            }

            private void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -2;
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeResponse(Response response) {
                response.getClass();
                Response response2 = this.response_;
                if (response2 == null || response2 == Response.getDefaultInstance()) {
                    this.response_ = response;
                } else {
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6803a) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6804a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseDelimitedFrom(InputStream inputStream) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(ByteBuffer byteBuffer) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapSelectUnsupportedInstitutionHandoffButtonAction> parser() {
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
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapSelectUnsupportedInstitutionHandoffButtonAction();
                    case 2:
                        return new C6804a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapSelectUnsupportedInstitutionHandoffButtonAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TapSelectUnsupportedInstitutionHandoffButtonAction.class) {
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

            public static C6804a newBuilder(TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
                return DEFAULT_INSTANCE.createBuilder(tapSelectUnsupportedInstitutionHandoffButtonAction);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(ByteString byteString) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(byte[] bArr) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(InputStream inputStream) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(CodedInputStream codedInputStream) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapSelectUnsupportedInstitutionHandoffButtonAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapSelectUnsupportedInstitutionHandoffButtonAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$a */
        public enum EnumC6805a {
            SUBMIT(1),
            TAP_NO_RESULTS(2),
            EXIT(3),
            TAP_END_OF_RESULTS(4),
            TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON(5),
            TAP_FIXED_BUTTON(6),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2463a;

            EnumC6805a(int i) {
                this.f2463a = i;
            }

            public static EnumC6805a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return SUBMIT;
                    case 2:
                        return TAP_NO_RESULTS;
                    case 3:
                        return EXIT;
                    case 4:
                        return TAP_END_OF_RESULTS;
                    case 5:
                        return TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON;
                    case 6:
                        return TAP_FIXED_BUTTON;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2463a;
            }

            @Deprecated
            public static EnumC6805a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Actions$b */
        public static final class C6806b extends GeneratedMessageLite.Builder<Actions, C6806b> implements MessageLiteOrBuilder {
            public C6806b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6806b m1446a(ExitAction exitAction) {
                copyOnWrite();
                ((Actions) this.instance).setExit(exitAction);
                return this;
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

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapEndOfResults() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapFixedButton() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapNoResults() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearTapSelectUnsupportedInstitutionHandoffButton() {
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
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6798a) exitAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6799a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeTapEndOfResults(TapEndOfResultsAction tapEndOfResultsAction) {
            tapEndOfResultsAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == TapEndOfResultsAction.getDefaultInstance()) {
                this.action_ = tapEndOfResultsAction;
            } else {
                this.action_ = TapEndOfResultsAction.newBuilder((TapEndOfResultsAction) this.action_).mergeFrom((TapEndOfResultsAction.C6800a) tapEndOfResultsAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        private void mergeTapFixedButton(TapFixedButtonAction tapFixedButtonAction) {
            tapFixedButtonAction.getClass();
            if (this.actionCase_ != 6 || this.action_ == TapFixedButtonAction.getDefaultInstance()) {
                this.action_ = tapFixedButtonAction;
            } else {
                this.action_ = TapFixedButtonAction.newBuilder((TapFixedButtonAction) this.action_).mergeFrom((TapFixedButtonAction.C6801a) tapFixedButtonAction).buildPartial();
            }
            this.actionCase_ = 6;
        }

        private void mergeTapNoResults(TapNoResultsAction tapNoResultsAction) {
            tapNoResultsAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == TapNoResultsAction.getDefaultInstance()) {
                this.action_ = tapNoResultsAction;
            } else {
                this.action_ = TapNoResultsAction.newBuilder((TapNoResultsAction) this.action_).mergeFrom((TapNoResultsAction.C6802a) tapNoResultsAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeTapSelectUnsupportedInstitutionHandoffButton(TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
            tapSelectUnsupportedInstitutionHandoffButtonAction.getClass();
            if (this.actionCase_ != 5 || this.action_ == TapSelectUnsupportedInstitutionHandoffButtonAction.getDefaultInstance()) {
                this.action_ = tapSelectUnsupportedInstitutionHandoffButtonAction;
            } else {
                this.action_ = TapSelectUnsupportedInstitutionHandoffButtonAction.newBuilder((TapSelectUnsupportedInstitutionHandoffButtonAction) this.action_).mergeFrom((TapSelectUnsupportedInstitutionHandoffButtonAction.C6804a) tapSelectUnsupportedInstitutionHandoffButtonAction).buildPartial();
            }
            this.actionCase_ = 5;
        }

        public static C6806b newBuilder() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        private void setTapEndOfResults(TapEndOfResultsAction tapEndOfResultsAction) {
            tapEndOfResultsAction.getClass();
            this.action_ = tapEndOfResultsAction;
            this.actionCase_ = 4;
        }

        private void setTapFixedButton(TapFixedButtonAction tapFixedButtonAction) {
            tapFixedButtonAction.getClass();
            this.action_ = tapFixedButtonAction;
            this.actionCase_ = 6;
        }

        private void setTapNoResults(TapNoResultsAction tapNoResultsAction) {
            tapNoResultsAction.getClass();
            this.action_ = tapNoResultsAction;
            this.actionCase_ = 2;
        }

        private void setTapSelectUnsupportedInstitutionHandoffButton(TapSelectUnsupportedInstitutionHandoffButtonAction tapSelectUnsupportedInstitutionHandoffButtonAction) {
            tapSelectUnsupportedInstitutionHandoffButtonAction.getClass();
            this.action_ = tapSelectUnsupportedInstitutionHandoffButtonAction;
            this.actionCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6806b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, TapNoResultsAction.class, ExitAction.class, TapEndOfResultsAction.class, TapSelectUnsupportedInstitutionHandoffButtonAction.class, TapFixedButtonAction.class});
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

        public EnumC6805a getActionCase() {
            return EnumC6805a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 3 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public TapEndOfResultsAction getTapEndOfResults() {
            return this.actionCase_ == 4 ? (TapEndOfResultsAction) this.action_ : TapEndOfResultsAction.getDefaultInstance();
        }

        public TapFixedButtonAction getTapFixedButton() {
            return this.actionCase_ == 6 ? (TapFixedButtonAction) this.action_ : TapFixedButtonAction.getDefaultInstance();
        }

        public TapNoResultsAction getTapNoResults() {
            return this.actionCase_ == 2 ? (TapNoResultsAction) this.action_ : TapNoResultsAction.getDefaultInstance();
        }

        public TapSelectUnsupportedInstitutionHandoffButtonAction getTapSelectUnsupportedInstitutionHandoffButton() {
            return this.actionCase_ == 5 ? (TapSelectUnsupportedInstitutionHandoffButtonAction) this.action_ : TapSelectUnsupportedInstitutionHandoffButtonAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public boolean hasTapEndOfResults() {
            return this.actionCase_ == 4;
        }

        public boolean hasTapFixedButton() {
            return this.actionCase_ == 6;
        }

        public boolean hasTapNoResults() {
            return this.actionCase_ == 2;
        }

        public boolean hasTapSelectUnsupportedInstitutionHandoffButton() {
            return this.actionCase_ == 5;
        }

        public static C6806b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6811a> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int END_OF_RESULTS_BUTTON_FIELD_NUMBER = 14;
        public static final int END_OF_RESULTS_BUTTON_TEXT_FIELD_NUMBER = 15;
        public static final int END_OF_RESULTS_TEXT_BUTTON_FIELD_NUMBER = 23;
        public static final int EVENTS_FIELD_NUMBER = 12;
        public static final int FIXED_BUTTON_FIELD_NUMBER = 24;
        public static final int INCREMENTAL_RESULTS_FIELD_NUMBER = 18;
        public static final int INITIAL_ITEMS_FIELD_NUMBER = 1;
        public static final int LIST_STYLE_FIELD_NUMBER = 22;
        public static final int ON_SUBMIT_OVERRIDE_ITEMS_FIELD_NUMBER = 13;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PREVIEW_MODE_FIELD_NUMBER = 19;
        public static final int SEARCH_API_FIELD_NUMBER = 2;
        public static final int SEARCH_BEHAVIOR_FIELD_NUMBER = 16;
        public static final int SEARCH_INPUT_FIELD_NUMBER = 17;
        public static final int SEARCH_NO_RESULTS_BUTTON_FIELD_NUMBER = 5;
        public static final int SEARCH_NO_RESULTS_FIELD_NUMBER = 4;
        public static final int SHOULD_TRIM_INSTITUTION_NAME_FIELD_NUMBER = 26;
        public static final int SHOULD_USE_CONDENSED_SEARCH_UI_FIELD_NUMBER = 20;
        public static final int SHOULD_USE_SEARCH_LOADING_SPINNER_FIELD_NUMBER = 21;
        public static final int SHOW_BRAND_PANE_SEARCH_BAR_FIELD_NUMBER = 25;
        public static final int TITLE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Common$AttributedLocalizedString endOfResultsButtonText_;
        private Common$ButtonContent endOfResultsButton_;
        private Common$ButtonContent endOfResultsTextButton_;
        private Events events_;
        private Common$ButtonContent fixedButton_;
        private int listStyle_;
        private int previewMode_;
        private SearchAPI searchApi_;
        private int searchBehavior_;
        private Common$SearchInput searchInput_;
        private Common$ButtonContent searchNoResultsButton_;
        private Common$LocalizedString searchNoResults_;
        private boolean shouldTrimInstitutionName_;
        private boolean shouldUseCondensedSearchUi_;
        private boolean shouldUseSearchLoadingSpinner_;
        private boolean showBrandPaneSearchBar_;
        private Common$LocalizedString title_;
        private Internal.ProtobufList<Common$ListItem> initialItems_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<SdkIncrementalResult$SDKIncrementalResult> incrementalResults_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> onSubmitOverrideItems_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends GeneratedMessageLite<Events, C6807a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SEARCH_FIELD_NUMBER = 2;
            public static final int ON_SUBMIT_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_OVERRIDE_FIELD_NUMBER = 5;
            public static final int ON_TAP_END_OF_RESULTS_FIELD_NUMBER = 6;
            public static final int ON_TAP_FIXED_BUTTON_FIELD_NUMBER = 9;
            public static final int ON_TAP_NO_RESULTS_FIELD_NUMBER = 4;
            public static final int ON_TAP_RESULT_WITH_CHILDREN_FIELD_NUMBER = 7;

            /* renamed from: ON_TAP_SELECT_UNSUPPORTED_INSTITUTION_HANDOFF_BUTTON_FIELD_NUMBER */
            public static final int f2464xa4184884 = 8;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onSearch_;
            private Common$SDKEvent onSubmitOverride_;
            private Common$SDKEvent onSubmit_;
            private Common$SDKEvent onTapEndOfResults_;
            private Common$SDKEvent onTapFixedButton_;
            private Common$SDKEvent onTapNoResults_;
            private Common$SDKEvent onTapResultWithChildren_;
            private Common$SDKEvent onTapSelectUnsupportedInstitutionHandoffButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$Events$a */
            public static final class C6807a extends GeneratedMessageLite.Builder<Events, C6807a> implements MessageLiteOrBuilder {
                public C6807a() {
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

            private void clearOnSearch() {
                this.onSearch_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnSubmit() {
                this.onSubmit_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSubmitOverride() {
                this.onSubmitOverride_ = null;
                this.bitField0_ &= -9;
            }

            private void clearOnTapEndOfResults() {
                this.onTapEndOfResults_ = null;
                this.bitField0_ &= -17;
            }

            private void clearOnTapFixedButton() {
                this.onTapFixedButton_ = null;
                this.bitField0_ &= -129;
            }

            private void clearOnTapNoResults() {
                this.onTapNoResults_ = null;
                this.bitField0_ &= -5;
            }

            private void clearOnTapResultWithChildren() {
                this.onTapResultWithChildren_ = null;
                this.bitField0_ &= -33;
            }

            private void clearOnTapSelectUnsupportedInstitutionHandoffButton() {
                this.onTapSelectUnsupportedInstitutionHandoffButton_ = null;
                this.bitField0_ &= -65;
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

            private void mergeOnSearch(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSearch_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSearch_ = common$SDKEvent;
                } else {
                    this.onSearch_ = Common$SDKEvent.newBuilder(this.onSearch_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmit_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmit_ = common$SDKEvent;
                } else {
                    this.onSubmit_ = Common$SDKEvent.newBuilder(this.onSubmit_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitOverride_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitOverride_ = common$SDKEvent;
                } else {
                    this.onSubmitOverride_ = Common$SDKEvent.newBuilder(this.onSubmitOverride_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeOnTapEndOfResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapEndOfResults_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapEndOfResults_ = common$SDKEvent;
                } else {
                    this.onTapEndOfResults_ = Common$SDKEvent.newBuilder(this.onTapEndOfResults_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeOnTapFixedButton(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapFixedButton_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapFixedButton_ = common$SDKEvent;
                } else {
                    this.onTapFixedButton_ = Common$SDKEvent.newBuilder(this.onTapFixedButton_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            private void mergeOnTapNoResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapNoResults_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapNoResults_ = common$SDKEvent;
                } else {
                    this.onTapNoResults_ = Common$SDKEvent.newBuilder(this.onTapNoResults_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeOnTapResultWithChildren(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapResultWithChildren_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapResultWithChildren_ = common$SDKEvent;
                } else {
                    this.onTapResultWithChildren_ = Common$SDKEvent.newBuilder(this.onTapResultWithChildren_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeOnTapSelectUnsupportedInstitutionHandoffButton(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapSelectUnsupportedInstitutionHandoffButton_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapSelectUnsupportedInstitutionHandoffButton_ = common$SDKEvent;
                } else {
                    this.onTapSelectUnsupportedInstitutionHandoffButton_ = Common$SDKEvent.newBuilder(this.onTapSelectUnsupportedInstitutionHandoffButton_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            public static C6807a newBuilder() {
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

            private void setOnSearch(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSearch_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmit_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitOverride_ = common$SDKEvent;
                this.bitField0_ |= 8;
            }

            private void setOnTapEndOfResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapEndOfResults_ = common$SDKEvent;
                this.bitField0_ |= 16;
            }

            private void setOnTapFixedButton(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapFixedButton_ = common$SDKEvent;
                this.bitField0_ |= 128;
            }

            private void setOnTapNoResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapNoResults_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            private void setOnTapResultWithChildren(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapResultWithChildren_ = common$SDKEvent;
                this.bitField0_ |= 32;
            }

            private void setOnTapSelectUnsupportedInstitutionHandoffButton(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapSelectUnsupportedInstitutionHandoffButton_ = common$SDKEvent;
                this.bitField0_ |= 64;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6807a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onSearch_", "onSubmit_", "onTapNoResults_", "onSubmitOverride_", "onTapEndOfResults_", "onTapResultWithChildren_", "onTapSelectUnsupportedInstitutionHandoffButton_", "onTapFixedButton_"});
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

            public Common$SDKEvent getOnSearch() {
                Common$SDKEvent common$SDKEvent = this.onSearch_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmit() {
                Common$SDKEvent common$SDKEvent = this.onSubmit_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitOverride() {
                Common$SDKEvent common$SDKEvent = this.onSubmitOverride_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapEndOfResults() {
                Common$SDKEvent common$SDKEvent = this.onTapEndOfResults_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapFixedButton() {
                Common$SDKEvent common$SDKEvent = this.onTapFixedButton_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapNoResults() {
                Common$SDKEvent common$SDKEvent = this.onTapNoResults_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapResultWithChildren() {
                Common$SDKEvent common$SDKEvent = this.onTapResultWithChildren_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapSelectUnsupportedInstitutionHandoffButton() {
                Common$SDKEvent common$SDKEvent = this.onTapSelectUnsupportedInstitutionHandoffButton_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnSearch() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnSubmit() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOnSubmitOverride() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasOnTapEndOfResults() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasOnTapFixedButton() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasOnTapNoResults() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasOnTapResultWithChildren() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasOnTapSelectUnsupportedInstitutionHandoffButton() {
                return (this.bitField0_ & 64) != 0;
            }

            public static C6807a newBuilder(Events events) {
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

        public static final class SearchAPI extends GeneratedMessageLite<SearchAPI, C6808a> implements MessageLiteOrBuilder {
            private static final SearchAPI DEFAULT_INSTANCE;
            public static final int EXTRA_HEADERS_FIELD_NUMBER = 4;
            private static volatile Parser<SearchAPI> PARSER = null;
            public static final int POST_BODY_FIELD_NUMBER = 2;
            public static final int POST_BODY_QUERY_REPLACEMENT_TOKEN_FIELD_NUMBER = 3;
            public static final int RESPONSE_RESULTS_JSON_KEY_FIELD_NUMBER = 5;
            public static final int RESPONSE_RESULT_ITEM_KEY_PATH_MAPPING_FIELD_NUMBER = 6;
            public static final int URL_PATH_FIELD_NUMBER = 1;
            private MapFieldLite<String, String> extraHeaders_ = MapFieldLite.emptyMapField();
            private MapFieldLite<String, String> responseResultItemKeyPathMapping_ = MapFieldLite.emptyMapField();
            private String urlPath_ = "";
            private String postBody_ = "";
            private String postBodyQueryReplacementToken_ = "";
            private String responseResultsJsonKey_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$SearchAPI$a */
            public static final class C6808a extends GeneratedMessageLite.Builder<SearchAPI, C6808a> implements MessageLiteOrBuilder {
                public C6808a() {
                    super(SearchAPI.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$SearchAPI$b */
            public static final class C6809b {

                /* renamed from: a */
                public static final MapEntryLite<String, String> f2465a;

                static {
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    f2465a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$SearchAPI$c */
            public static final class C6810c {

                /* renamed from: a */
                public static final MapEntryLite<String, String> f2466a;

                static {
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    f2466a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            static {
                SearchAPI searchAPI = new SearchAPI();
                DEFAULT_INSTANCE = searchAPI;
                GeneratedMessageLite.registerDefaultInstance(SearchAPI.class, searchAPI);
            }

            private SearchAPI() {
            }

            private void clearPostBody() {
                this.postBody_ = getDefaultInstance().getPostBody();
            }

            private void clearPostBodyQueryReplacementToken() {
                this.postBodyQueryReplacementToken_ = getDefaultInstance().getPostBodyQueryReplacementToken();
            }

            private void clearResponseResultsJsonKey() {
                this.responseResultsJsonKey_ = getDefaultInstance().getResponseResultsJsonKey();
            }

            private void clearUrlPath() {
                this.urlPath_ = getDefaultInstance().getUrlPath();
            }

            public static SearchAPI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private Map<String, String> getMutableExtraHeadersMap() {
                return internalGetMutableExtraHeaders();
            }

            private Map<String, String> getMutableResponseResultItemKeyPathMappingMap() {
                return internalGetMutableResponseResultItemKeyPathMapping();
            }

            private MapFieldLite<String, String> internalGetExtraHeaders() {
                return this.extraHeaders_;
            }

            private MapFieldLite<String, String> internalGetMutableExtraHeaders() {
                if (!this.extraHeaders_.isMutable()) {
                    this.extraHeaders_ = this.extraHeaders_.mutableCopy();
                }
                return this.extraHeaders_;
            }

            private MapFieldLite<String, String> internalGetMutableResponseResultItemKeyPathMapping() {
                if (!this.responseResultItemKeyPathMapping_.isMutable()) {
                    this.responseResultItemKeyPathMapping_ = this.responseResultItemKeyPathMapping_.mutableCopy();
                }
                return this.responseResultItemKeyPathMapping_;
            }

            private MapFieldLite<String, String> internalGetResponseResultItemKeyPathMapping() {
                return this.responseResultItemKeyPathMapping_;
            }

            public static C6808a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SearchAPI parseDelimitedFrom(InputStream inputStream) {
                return (SearchAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SearchAPI parseFrom(ByteBuffer byteBuffer) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SearchAPI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPostBody(String str) {
                str.getClass();
                this.postBody_ = str;
            }

            private void setPostBodyBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.postBody_ = byteString.toStringUtf8();
            }

            private void setPostBodyQueryReplacementToken(String str) {
                str.getClass();
                this.postBodyQueryReplacementToken_ = str;
            }

            private void setPostBodyQueryReplacementTokenBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.postBodyQueryReplacementToken_ = byteString.toStringUtf8();
            }

            private void setResponseResultsJsonKey(String str) {
                str.getClass();
                this.responseResultsJsonKey_ = str;
            }

            private void setResponseResultsJsonKeyBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseResultsJsonKey_ = byteString.toStringUtf8();
            }

            private void setUrlPath(String str) {
                str.getClass();
                this.urlPath_ = str;
            }

            private void setUrlPathBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.urlPath_ = byteString.toStringUtf8();
            }

            public boolean containsExtraHeaders(String str) {
                str.getClass();
                return internalGetExtraHeaders().containsKey(str);
            }

            public boolean containsResponseResultItemKeyPathMapping(String str) {
                str.getClass();
                return internalGetResponseResultItemKeyPathMapping().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SearchAPI();
                    case 2:
                        return new C6808a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0002\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042\u0005Ȉ\u00062", new Object[]{"urlPath_", "postBody_", "postBodyQueryReplacementToken_", "extraHeaders_", C6809b.f2465a, "responseResultsJsonKey_", "responseResultItemKeyPathMapping_", C6810c.f2466a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SearchAPI> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SearchAPI.class) {
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
            public Map<String, String> getExtraHeaders() {
                return getExtraHeadersMap();
            }

            public int getExtraHeadersCount() {
                return internalGetExtraHeaders().size();
            }

            public Map<String, String> getExtraHeadersMap() {
                return Collections.unmodifiableMap(internalGetExtraHeaders());
            }

            public String getExtraHeadersOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> mapFieldLiteInternalGetExtraHeaders = internalGetExtraHeaders();
                return mapFieldLiteInternalGetExtraHeaders.containsKey(str) ? mapFieldLiteInternalGetExtraHeaders.get(str) : str2;
            }

            public String getExtraHeadersOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> mapFieldLiteInternalGetExtraHeaders = internalGetExtraHeaders();
                if (mapFieldLiteInternalGetExtraHeaders.containsKey(str)) {
                    return mapFieldLiteInternalGetExtraHeaders.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getPostBody() {
                return this.postBody_;
            }

            public ByteString getPostBodyBytes() {
                return ByteString.copyFromUtf8(this.postBody_);
            }

            public String getPostBodyQueryReplacementToken() {
                return this.postBodyQueryReplacementToken_;
            }

            public ByteString getPostBodyQueryReplacementTokenBytes() {
                return ByteString.copyFromUtf8(this.postBodyQueryReplacementToken_);
            }

            @Deprecated
            public Map<String, String> getResponseResultItemKeyPathMapping() {
                return getResponseResultItemKeyPathMappingMap();
            }

            public int getResponseResultItemKeyPathMappingCount() {
                return internalGetResponseResultItemKeyPathMapping().size();
            }

            public Map<String, String> getResponseResultItemKeyPathMappingMap() {
                return Collections.unmodifiableMap(internalGetResponseResultItemKeyPathMapping());
            }

            public String getResponseResultItemKeyPathMappingOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> mapFieldLiteInternalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                return mapFieldLiteInternalGetResponseResultItemKeyPathMapping.containsKey(str) ? mapFieldLiteInternalGetResponseResultItemKeyPathMapping.get(str) : str2;
            }

            public String getResponseResultItemKeyPathMappingOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> mapFieldLiteInternalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                if (mapFieldLiteInternalGetResponseResultItemKeyPathMapping.containsKey(str)) {
                    return mapFieldLiteInternalGetResponseResultItemKeyPathMapping.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getResponseResultsJsonKey() {
                return this.responseResultsJsonKey_;
            }

            public ByteString getResponseResultsJsonKeyBytes() {
                return ByteString.copyFromUtf8(this.responseResultsJsonKey_);
            }

            public String getUrlPath() {
                return this.urlPath_;
            }

            public ByteString getUrlPathBytes() {
                return ByteString.copyFromUtf8(this.urlPath_);
            }

            public static C6808a newBuilder(SearchAPI searchAPI) {
                return DEFAULT_INSTANCE.createBuilder(searchAPI);
            }

            public static SearchAPI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(ByteString byteString) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SearchAPI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(byte[] bArr) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SearchAPI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(InputStream inputStream) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SearchAPI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(CodedInputStream codedInputStream) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SearchAPI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$a */
        public static final class C6811a extends GeneratedMessageLite.Builder<Rendering, C6811a> implements MessageLiteOrBuilder {
            public C6811a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$b */
        public enum EnumC6812b implements Internal.EnumLite {
            LIST_STYLE_DEFAULT(0),
            LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED(1),
            UNRECOGNIZED(-1);

            public static final int LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED_VALUE = 1;
            public static final int LIST_STYLE_DEFAULT_VALUE = 0;

            /* renamed from: b */
            public static final a f2467b = new a();

            /* renamed from: a */
            public final int f2469a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6812b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6812b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2470a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6812b.forNumber(i) != null;
                }
            }

            EnumC6812b(int i) {
                this.f2469a = i;
            }

            public static EnumC6812b forNumber(int i) {
                if (i == 0) {
                    return LIST_STYLE_DEFAULT;
                }
                if (i != 1) {
                    return null;
                }
                return LIST_STYLE_BETA_WALLET_ONBOARD_CONDENSED;
            }

            public static Internal.EnumLiteMap<EnumC6812b> internalGetValueMap() {
                return f2467b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2470a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2469a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6812b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$c */
        public enum EnumC6813c implements Internal.EnumLite {
            PREVIEW_MODE_UNKNOWN(0),
            PREVIEW_MODE_NO_RESULTS(1),
            UNRECOGNIZED(-1);

            public static final int PREVIEW_MODE_NO_RESULTS_VALUE = 1;
            public static final int PREVIEW_MODE_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2471b = new a();

            /* renamed from: a */
            public final int f2473a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6813c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6813c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2474a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6813c.forNumber(i) != null;
                }
            }

            EnumC6813c(int i) {
                this.f2473a = i;
            }

            public static EnumC6813c forNumber(int i) {
                if (i == 0) {
                    return PREVIEW_MODE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return PREVIEW_MODE_NO_RESULTS;
            }

            public static Internal.EnumLiteMap<EnumC6813c> internalGetValueMap() {
                return f2471b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2474a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2473a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6813c valueOf(int i) {
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

        private void addAllIncrementalResults(Iterable<? extends SdkIncrementalResult$SDKIncrementalResult> iterable) {
            ensureIncrementalResultsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.incrementalResults_);
        }

        private void addAllInitialItems(Iterable<? extends Common$ListItem> iterable) {
            ensureInitialItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.initialItems_);
        }

        private void addAllOnSubmitOverrideItems(Iterable<String> iterable) {
            ensureOnSubmitOverrideItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmitOverrideItems_);
        }

        private void addIncrementalResults(SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            sdkIncrementalResult$SDKIncrementalResult.getClass();
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(sdkIncrementalResult$SDKIncrementalResult);
        }

        private void addInitialItems(Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.add(common$ListItem);
        }

        private void addOnSubmitOverrideItems(String str) {
            str.getClass();
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(str);
        }

        private void addOnSubmitOverrideItemsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(byteString.toStringUtf8());
        }

        private void clearEndOfResultsButton() {
            this.endOfResultsButton_ = null;
            this.bitField0_ &= -33;
        }

        private void clearEndOfResultsButtonText() {
            this.endOfResultsButtonText_ = null;
            this.bitField0_ &= -65;
        }

        private void clearEndOfResultsTextButton() {
            this.endOfResultsTextButton_ = null;
            this.bitField0_ &= -257;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -129;
        }

        private void clearFixedButton() {
            this.fixedButton_ = null;
            this.bitField0_ &= -513;
        }

        private void clearIncrementalResults() {
            this.incrementalResults_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInitialItems() {
            this.initialItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearListStyle() {
            this.listStyle_ = 0;
        }

        private void clearOnSubmitOverrideItems() {
            this.onSubmitOverrideItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPreviewMode() {
            this.previewMode_ = 0;
        }

        private void clearSearchApi() {
            this.searchApi_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSearchBehavior() {
            this.searchBehavior_ = 0;
        }

        private void clearSearchInput() {
            this.searchInput_ = null;
            this.bitField0_ &= -5;
        }

        private void clearSearchNoResults() {
            this.searchNoResults_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSearchNoResultsButton() {
            this.searchNoResultsButton_ = null;
            this.bitField0_ &= -17;
        }

        private void clearShouldTrimInstitutionName() {
            this.shouldTrimInstitutionName_ = false;
        }

        private void clearShouldUseCondensedSearchUi() {
            this.shouldUseCondensedSearchUi_ = false;
        }

        private void clearShouldUseSearchLoadingSpinner() {
            this.shouldUseSearchLoadingSpinner_ = false;
        }

        private void clearShowBrandPaneSearchBar() {
            this.showBrandPaneSearchBar_ = false;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureIncrementalResultsIsMutable() {
            Internal.ProtobufList<SdkIncrementalResult$SDKIncrementalResult> protobufList = this.incrementalResults_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.incrementalResults_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureInitialItemsIsMutable() {
            Internal.ProtobufList<Common$ListItem> protobufList = this.initialItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.initialItems_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOnSubmitOverrideItemsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.onSubmitOverrideItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.onSubmitOverrideItems_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEndOfResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.endOfResultsButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.endOfResultsButton_ = common$ButtonContent;
            } else {
                this.endOfResultsButton_ = Common$ButtonContent.newBuilder(this.endOfResultsButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeEndOfResultsButtonText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.endOfResultsButtonText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.endOfResultsButtonText_ = common$AttributedLocalizedString;
            } else {
                this.endOfResultsButtonText_ = Common$AttributedLocalizedString.newBuilder(this.endOfResultsButtonText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeEndOfResultsTextButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.endOfResultsTextButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.endOfResultsTextButton_ = common$ButtonContent;
            } else {
                this.endOfResultsTextButton_ = Common$ButtonContent.newBuilder(this.endOfResultsTextButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6807a) events).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeFixedButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.fixedButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.fixedButton_ = common$ButtonContent;
            } else {
                this.fixedButton_ = Common$ButtonContent.newBuilder(this.fixedButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeSearchApi(SearchAPI searchAPI) {
            searchAPI.getClass();
            SearchAPI searchAPI2 = this.searchApi_;
            if (searchAPI2 == null || searchAPI2 == SearchAPI.getDefaultInstance()) {
                this.searchApi_ = searchAPI;
            } else {
                this.searchApi_ = SearchAPI.newBuilder(this.searchApi_).mergeFrom((SearchAPI.C6808a) searchAPI).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSearchInput(Common$SearchInput common$SearchInput) {
            common$SearchInput.getClass();
            Common$SearchInput common$SearchInput2 = this.searchInput_;
            if (common$SearchInput2 == null || common$SearchInput2 == Common$SearchInput.getDefaultInstance()) {
                this.searchInput_ = common$SearchInput;
            } else {
                this.searchInput_ = Common$SearchInput.newBuilder(this.searchInput_).mergeFrom((Common$SearchInput.C6492a) common$SearchInput).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeSearchNoResults(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.searchNoResults_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.searchNoResults_ = common$LocalizedString;
            } else {
                this.searchNoResults_ = Common$LocalizedString.newBuilder(this.searchNoResults_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeSearchNoResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.searchNoResultsButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.searchNoResultsButton_ = common$ButtonContent;
            } else {
                this.searchNoResultsButton_ = Common$ButtonContent.newBuilder(this.searchNoResultsButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeTitle(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.title_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.title_ = common$LocalizedString;
            } else {
                this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static C6811a newBuilder() {
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

        private void removeIncrementalResults(int i) {
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.remove(i);
        }

        private void removeInitialItems(int i) {
            ensureInitialItemsIsMutable();
            this.initialItems_.remove(i);
        }

        private void setEndOfResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.endOfResultsButton_ = common$ButtonContent;
            this.bitField0_ |= 32;
        }

        private void setEndOfResultsButtonText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.endOfResultsButtonText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 64;
        }

        private void setEndOfResultsTextButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.endOfResultsTextButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 128;
        }

        private void setFixedButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.fixedButton_ = common$ButtonContent;
            this.bitField0_ |= 512;
        }

        private void setIncrementalResults(int i, SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            sdkIncrementalResult$SDKIncrementalResult.getClass();
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.set(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        private void setInitialItems(int i, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.set(i, common$ListItem);
        }

        private void setListStyle(EnumC6812b enumC6812b) {
            this.listStyle_ = enumC6812b.getNumber();
        }

        private void setListStyleValue(int i) {
            this.listStyle_ = i;
        }

        private void setOnSubmitOverrideItems(int i, String str) {
            str.getClass();
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.set(i, str);
        }

        private void setPreviewMode(EnumC6813c enumC6813c) {
            this.previewMode_ = enumC6813c.getNumber();
        }

        private void setPreviewModeValue(int i) {
            this.previewMode_ = i;
        }

        private void setSearchApi(SearchAPI searchAPI) {
            searchAPI.getClass();
            this.searchApi_ = searchAPI;
            this.bitField0_ |= 1;
        }

        private void setSearchBehavior(EnumC6692N enumC6692N) {
            this.searchBehavior_ = enumC6692N.getNumber();
        }

        private void setSearchBehaviorValue(int i) {
            this.searchBehavior_ = i;
        }

        private void setSearchInput(Common$SearchInput common$SearchInput) {
            common$SearchInput.getClass();
            this.searchInput_ = common$SearchInput;
            this.bitField0_ |= 4;
        }

        private void setSearchNoResults(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.searchNoResults_ = common$LocalizedString;
            this.bitField0_ |= 8;
        }

        private void setSearchNoResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.searchNoResultsButton_ = common$ButtonContent;
            this.bitField0_ |= 16;
        }

        private void setShouldTrimInstitutionName(boolean z) {
            this.shouldTrimInstitutionName_ = z;
        }

        private void setShouldUseCondensedSearchUi(boolean z) {
            this.shouldUseCondensedSearchUi_ = z;
        }

        private void setShouldUseSearchLoadingSpinner(boolean z) {
            this.shouldUseSearchLoadingSpinner_ = z;
        }

        private void setShowBrandPaneSearchBar(boolean z) {
            this.showBrandPaneSearchBar_ = z;
        }

        private void setTitle(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.title_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6811a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u001a\u0014\u0000\u0003\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\fဉ\u0007\rȚ\u000eဉ\u0005\u000fဉ\u0006\u0010\f\u0011ဉ\u0002\u0012\u001b\u0013\f\u0014\u0007\u0015\u0007\u0016\f\u0017ဉ\b\u0018ဉ\t\u0019\u0007\u001a\u0007", new Object[]{"bitField0_", "initialItems_", Common$ListItem.class, "searchApi_", "title_", "searchNoResults_", "searchNoResultsButton_", "events_", "onSubmitOverrideItems_", "endOfResultsButton_", "endOfResultsButtonText_", "searchBehavior_", "searchInput_", "incrementalResults_", SdkIncrementalResult$SDKIncrementalResult.class, "previewMode_", "shouldUseCondensedSearchUi_", "shouldUseSearchLoadingSpinner_", "listStyle_", "endOfResultsTextButton_", "fixedButton_", "showBrandPaneSearchBar_", "shouldTrimInstitutionName_"});
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

        public Common$ButtonContent getEndOfResultsButton() {
            Common$ButtonContent common$ButtonContent = this.endOfResultsButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getEndOfResultsButtonText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.endOfResultsButtonText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$ButtonContent getEndOfResultsTextButton() {
            Common$ButtonContent common$ButtonContent = this.endOfResultsTextButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$ButtonContent getFixedButton() {
            Common$ButtonContent common$ButtonContent = this.fixedButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public SdkIncrementalResult$SDKIncrementalResult getIncrementalResults(int i) {
            return this.incrementalResults_.get(i);
        }

        public int getIncrementalResultsCount() {
            return this.incrementalResults_.size();
        }

        public List<SdkIncrementalResult$SDKIncrementalResult> getIncrementalResultsList() {
            return this.incrementalResults_;
        }

        public InterfaceC7038r getIncrementalResultsOrBuilder(int i) {
            return this.incrementalResults_.get(i);
        }

        public List<? extends InterfaceC7038r> getIncrementalResultsOrBuilderList() {
            return this.incrementalResults_;
        }

        public Common$ListItem getInitialItems(int i) {
            return this.initialItems_.get(i);
        }

        public int getInitialItemsCount() {
            return this.initialItems_.size();
        }

        public List<Common$ListItem> getInitialItemsList() {
            return this.initialItems_;
        }

        public InterfaceC6293A getInitialItemsOrBuilder(int i) {
            return this.initialItems_.get(i);
        }

        public List<? extends InterfaceC6293A> getInitialItemsOrBuilderList() {
            return this.initialItems_;
        }

        public EnumC6812b getListStyle() {
            EnumC6812b enumC6812bForNumber = EnumC6812b.forNumber(this.listStyle_);
            return enumC6812bForNumber == null ? EnumC6812b.UNRECOGNIZED : enumC6812bForNumber;
        }

        public int getListStyleValue() {
            return this.listStyle_;
        }

        public String getOnSubmitOverrideItems(int i) {
            return this.onSubmitOverrideItems_.get(i);
        }

        public ByteString getOnSubmitOverrideItemsBytes(int i) {
            return ByteString.copyFromUtf8(this.onSubmitOverrideItems_.get(i));
        }

        public int getOnSubmitOverrideItemsCount() {
            return this.onSubmitOverrideItems_.size();
        }

        public List<String> getOnSubmitOverrideItemsList() {
            return this.onSubmitOverrideItems_;
        }

        public EnumC6813c getPreviewMode() {
            EnumC6813c enumC6813cForNumber = EnumC6813c.forNumber(this.previewMode_);
            return enumC6813cForNumber == null ? EnumC6813c.UNRECOGNIZED : enumC6813cForNumber;
        }

        public int getPreviewModeValue() {
            return this.previewMode_;
        }

        public SearchAPI getSearchApi() {
            SearchAPI searchAPI = this.searchApi_;
            return searchAPI == null ? SearchAPI.getDefaultInstance() : searchAPI;
        }

        public EnumC6692N getSearchBehavior() {
            EnumC6692N enumC6692NForNumber = EnumC6692N.forNumber(this.searchBehavior_);
            return enumC6692NForNumber == null ? EnumC6692N.UNRECOGNIZED : enumC6692NForNumber;
        }

        public int getSearchBehaviorValue() {
            return this.searchBehavior_;
        }

        public Common$SearchInput getSearchInput() {
            Common$SearchInput common$SearchInput = this.searchInput_;
            return common$SearchInput == null ? Common$SearchInput.getDefaultInstance() : common$SearchInput;
        }

        public Common$LocalizedString getSearchNoResults() {
            Common$LocalizedString common$LocalizedString = this.searchNoResults_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$ButtonContent getSearchNoResultsButton() {
            Common$ButtonContent common$ButtonContent = this.searchNoResultsButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean getShouldTrimInstitutionName() {
            return this.shouldTrimInstitutionName_;
        }

        public boolean getShouldUseCondensedSearchUi() {
            return this.shouldUseCondensedSearchUi_;
        }

        public boolean getShouldUseSearchLoadingSpinner() {
            return this.shouldUseSearchLoadingSpinner_;
        }

        public boolean getShowBrandPaneSearchBar() {
            return this.showBrandPaneSearchBar_;
        }

        public Common$LocalizedString getTitle() {
            Common$LocalizedString common$LocalizedString = this.title_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasEndOfResultsButton() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasEndOfResultsButtonText() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasEndOfResultsTextButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasFixedButton() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasSearchApi() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSearchInput() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSearchNoResults() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSearchNoResultsButton() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C6811a newBuilder(Rendering rendering) {
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

        private void addIncrementalResults(int i, SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
            sdkIncrementalResult$SDKIncrementalResult.getClass();
            ensureIncrementalResultsIsMutable();
            this.incrementalResults_.add(i, sdkIncrementalResult$SDKIncrementalResult);
        }

        private void addInitialItems(int i, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.add(i, common$ListItem);
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane$a */
    public static final class C6814a extends GeneratedMessageLite.Builder<SearchAndSelectPaneOuterClass$SearchAndSelectPane, C6814a> implements MessageLiteOrBuilder {
        public C6814a() {
            super(SearchAndSelectPaneOuterClass$SearchAndSelectPane.DEFAULT_INSTANCE);
        }
    }

    static {
        SearchAndSelectPaneOuterClass$SearchAndSelectPane searchAndSelectPaneOuterClass$SearchAndSelectPane = new SearchAndSelectPaneOuterClass$SearchAndSelectPane();
        DEFAULT_INSTANCE = searchAndSelectPaneOuterClass$SearchAndSelectPane;
        GeneratedMessageLite.registerDefaultInstance(SearchAndSelectPaneOuterClass$SearchAndSelectPane.class, searchAndSelectPaneOuterClass$SearchAndSelectPane);
    }

    private SearchAndSelectPaneOuterClass$SearchAndSelectPane() {
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6814a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseDelimitedFrom(InputStream inputStream) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(ByteBuffer byteBuffer) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchAndSelectPaneOuterClass$SearchAndSelectPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6936s0.f2597a[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchAndSelectPaneOuterClass$SearchAndSelectPane();
            case 2:
                return new C6814a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchAndSelectPaneOuterClass$SearchAndSelectPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SearchAndSelectPaneOuterClass$SearchAndSelectPane.class) {
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

    public static C6814a newBuilder(SearchAndSelectPaneOuterClass$SearchAndSelectPane searchAndSelectPaneOuterClass$SearchAndSelectPane) {
        return DEFAULT_INSTANCE.createBuilder(searchAndSelectPaneOuterClass$SearchAndSelectPane);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(ByteString byteString) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(byte[] bArr) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(InputStream inputStream) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(CodedInputStream codedInputStream) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchAndSelectPaneOuterClass$SearchAndSelectPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SearchAndSelectPaneOuterClass$SearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
